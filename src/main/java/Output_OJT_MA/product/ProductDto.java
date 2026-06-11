package Output_OJT_MA.product;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProductDto {

    private Long id;

    @NotBlank(message = "Ten san phan khong the do trong đc")
    private String name;

    @NotNull(message = "Gia san phan khong the de trong dc")
    @Min(value = 0, message = "Gia san pham phai lon hon hoac bang 0")
    private Double price;

    public ProductDto() {
    }

    public ProductDto(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}