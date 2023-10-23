package kr.co.lotteon.mapper;

import kr.co.lotteon.dto.product.ProductCate1DTO;
import kr.co.lotteon.dto.product.ProductCate2DTO;
import kr.co.lotteon.dto.product.ProductDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProductMapper {

    public List<ProductDTO> selectProductHit();
    public List<ProductDTO> selectProductScore();

    public List<ProductDTO> selectProductNew();

    public List<ProductDTO> selectProductDiscount();

    public List<ProductDTO> selectProductSold();
    
    public List<ProductCate2DTO> selectProductCatesMain();

    public List<ProductCate1DTO> selectProductCate1sMain();
}