# สรุปภาพรวมโปรเจกต์ Demo การจัดการสินค้า (Product API)

โปรเจกต์นี้เป็นตัวอย่างพื้นฐานที่ใช้ **Spring Boot** โดยได้รับการออกแบบให้สอดคล้องกับหลักการ **สถาปัตยกรรม 3 ชั้น (3-Tier Architecture)** อย่างเคร่งครัด ได้แก่ Controller, Service และ Repository พร้อมกับระบบจัดการข้อผิดพลาด (Global Exception Handling) ที่สมบูรณ์แบบ

## 1. โครงสร้างซอร์สโค้ด (Source Code Structure)

ซอร์สโค้ดถูกจัดเก็บไว้ที่แพ็กเกจ `Output_OJT_MA` โดยแบ่งออกเป็น 3 ส่วนหลัก ได้แก่:

### 1.1 แพ็กเกจ `product` (ระบบจัดการสินค้า)
*   **`Product.java` (Entity)**: คลาสที่เป็นตัวแทนของข้อมูล ซึ่งจะถูกจับคู่ (Map) โดยตรงกับตาราง `products` ในฐานข้อมูล MySQL
*   **`ProductDto.java` (DTO)**: วัตถุที่ใช้สำหรับส่งผ่านข้อมูล (Data Transfer Object) ใช้สำหรับสื่อสารกับผู้ใช้งานภายนอก (Client) เพื่อซ่อนโครงสร้างที่แท้จริงของ Entity 
*   **`ProductRepository.java` (Repository)**: คลาสที่ใช้สื่อสารกับฐานข้อมูลโดยตรงผ่านไลบรารี `Spring Data JPA` ซึ่งมีฟังก์ชันจัดการข้อมูลอัตโนมัติ (เพิ่ม ลบ แก้ไข ค้นหา) โดยไม่ต้องเขียน SQL เอง
*   **`IProductService.java` (Interface)**: สัญญาที่กำหนดว่าแผนกนี้มีบริการอะไรบ้าง (เช่น getAllProducts, getProductById, createProduct, updateProduct, deleteProduct)
*   **`ProductServiceImpl.java` (Service)**: "สมอง" ของระบบที่รวบรวม Business Logic ไว้ทั้งหมด ทำหน้าที่คำนวณ ดักจับข้อผิดพลาด (เช่น ส่ง ID ที่ไม่มีอยู่จริง) และแปลงข้อมูลไปมาระหว่าง Entity และ DTO ภายใต้สภาพแวดล้อมที่ปลอดภัยด้วย `@Transactional`
*   **`ProductController.java` (Controller)**: คลาสที่ทำหน้าที่เป็น "พนักงานต้อนรับ" คอยรับ HTTP Request (GET, POST, PUT, DELETE) สั่งงาน Service และส่งผลลัพธ์ (`ResponseEntity`) กลับไปให้ Client ในรูปแบบ JSON

### 1.2 แพ็กเกจ `exception` และ `common` (ระบบจัดการข้อผิดพลาดแบบรวมศูนย์)
*   **`MessageRes.java`**: รูปแบบกล่องพัสดุมาตรฐานที่ใช้สำหรับส่งข้อความสถานะและข้อผิดพลาดกลับไปให้ Client
*   **`BusinessException.java`**: คลาส Error แบบกำหนดเอง (Custom Exception) ที่ใช้สำหรับโยนข้อผิดพลาดในระดับ Business Logic
*   **`GlobalExceptionHandler.java`**: ศูนย์กลางดักจับ Error (`@RestControllerAdvice`) โดยถ้ามี `BusinessException` เกิดขึ้น มันจะจับไว้และแปลงเป็น HTTP Status 202 ACCEPTED พร้อมกับ JSON ที่สวยงาม

---

## 2. ลำดับการทำงาน (Data Flow)

ตัวอย่างลำดับการทำงานเมื่อ Client เรียกใช้ API เพื่อค้นหาสินค้า:

1.  **Client (เช่น Postman)** ส่ง HTTP Request `GET /api/v1/products/1`
2.  **`ProductController`** รับคำขอ ดึงตัวเลข `1` ออกมาจาก URL ผ่าน `@PathVariable` แล้วส่งงานต่อให้ Service
3.  **`ProductServiceImpl`** รับ ID และเรียกใช้คำสั่งค้นหาจาก Repository
    *   *ตรรกะทางธุรกิจ:* หากไม่พบข้อมูล (null) จะโยน `BusinessException` ซึ่งจะถูกดูดเข้าไปที่ `GlobalExceptionHandler` ทันที
    *   *การแปลงข้อมูล:* หากพบข้อมูล จะแปลง `Product` (Entity) เป็น `ProductDto`
4.  **`ProductRepository`** (อยู่ชั้นล่างสุด) ทำหน้าที่แปลคำสั่งไปเป็น SQL Query คุยกับ MySQL และคืนค่าผลลัพธ์กลับมา
5.  ข้อมูลที่ผ่านการแปลงร่างเป็น DTO จะถูกส่งกลับไปที่ **Controller** ห่อด้วย `ResponseEntity.ok()` และตอบกลับไปหา Client ในรูปแบบ JSON ด้วยสถานะ `200 OK`

---

## 3. คู่มือการทดสอบด้วย Postman (CRUD)

แอปพลิเคชันทำงานอยู่ที่พอร์ต `8080` (Base URL: `http://localhost:8080/api/v1/products`) 

### 3.1. Create (สร้างสินค้าใหม่)
*   **Method:** `POST`
*   **Body (raw - JSON):**
    ```json
    {
        "name": "Iphone 15 Pro Max",
        "price": 1200.0
    }
    ```

### 3.2. Read (ค้นหาข้อมูล)
*   **ดูทั้งหมด (List):** `GET http://localhost:8080/api/v1/products`
*   **ดูชิ้นเดียว (Detail):** `GET http://localhost:8080/api/v1/products/{id}` *(เปลี่ยน {id} เป็นตัวเลข)*

### 3.3. Update (แก้ไขสินค้า)
*   **Method:** `PUT`
*   **URL:** `http://localhost:8080/api/v1/products/{id}`
*   **Body (raw - JSON):**
    ```json
    {
        "name": "Iphone 15 Pro Max - อัปเดต",
        "price": 1500.0
    }
    ```

### 3.4. Delete (ลบสินค้า)
*   **Method:** `DELETE`
*   **URL:** `http://localhost:8080/api/v1/products/{id}`
*   **Body:** ไม่มี

---

## 4. การตั้งค่าระบบ (Environment Setup)

ไฟล์ `application.properties` มีการตั้งค่าเชื่อมต่อกับฐานข้อมูลดังนี้:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/demo_db?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=123456
spring.jpa.hibernate.ddl-auto=update
```
*(หมายเหตุ: ระบบเปิดใช้ `ddl-auto=update` เพื่อสร้างตาราง `products` ให้อัตโนมัติหากยังไม่มีในฐานข้อมูล)*
