package kr.co.lotteon.repository.product;

import kr.co.lotteon.entity.product.ProductOrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrderEntity, Integer> {

    int countByOrdUid(String ordUid);
}
