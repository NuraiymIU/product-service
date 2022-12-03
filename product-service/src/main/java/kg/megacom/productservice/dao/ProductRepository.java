package kg.megacom.productservice.dao;

import kg.megacom.productservice.models.dto.Task2;
import kg.megacom.productservice.models.entity.Product;
import kg.megacom.productservice.models.enums.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {

    List<Product> findDistinctByType(Type type);

    @Query("select new kg.megacom.productservice.models.dto.Task2(u.maker) from Product u where u.type = ?1")
    List<Task2> task2Query(String type);
}
