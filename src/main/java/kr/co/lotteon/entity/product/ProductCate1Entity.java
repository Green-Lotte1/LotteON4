package kr.co.lotteon.entity.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kr.co.lotteon.dto.product.ProductCate1DTO;
import lombok.*;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "lo_product_cate1")
@Entity
public class ProductCate1Entity {
    
    @Id
    private int cate1;
    private String c1Name;
    
    public ProductCate1DTO toDTO() {
        return ProductCate1DTO.builder()
                .cate1(cate1)
                .c1Name(c1Name)
                .build();
        
    }
    
    
    
}