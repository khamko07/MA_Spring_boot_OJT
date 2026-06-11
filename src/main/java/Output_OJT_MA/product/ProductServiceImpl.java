package Output_OJT_MA.product;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import Output_OJT_MA.exception.BusinessException;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDto> getAllProducts() {
    	List<Product> listProduct = productRepository.findAll();
        return listProduct.stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto getProductById(Long id) {
        Product product = productRepository.findById(id).orElse(null);

        if (Objects.isNull(product)) {
            throw new BusinessException("ERROR", "Product not found");
        }

        return mapToDto(product);
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product product = new Product();
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        Product savedProduct = productRepository.save(product);
        return mapToDto(savedProduct);
    }

    @Override
    public ProductDto updateProduct(Long id, ProductDto productDto) {
        Product product = productRepository.findById(id).orElse(null);

        if (Objects.isNull(product)) {
            throw new BusinessException("ERROR", "Không tìm thấy thông tin sản phẩm để cập nhật.");
        }

        // Cập nhật dữ liệu
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());

        Product savedProduct = productRepository.save(product);
        return mapToDto(savedProduct);
    }

    @Override
    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id).orElse(null);

        if (Objects.isNull(product)) {
            throw new BusinessException("ERROR", "Không tìm thấy thông tin sản phẩm để xóa.");
        }

        productRepository.delete(product);
    }

    private ProductDto mapToDto(Product product) {
        return new ProductDto(product.getId(), product.getName(), product.getPrice());
    }
}
