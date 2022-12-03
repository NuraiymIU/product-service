package kg.megacom.productservice.dao;

import kg.megacom.productservice.models.dto.Task1;
import kg.megacom.productservice.models.entity.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PcRepository extends JpaRepository<Pc,Integer> {

    List<Pc> findAllByPriceLessThan(double price);
    //Select * from PC where price < 500

    /*
    запрос вытаскивает те же данные, но без mapper а
    вытаскивает только нужные поля
    */
    @Query("select new kg.megacom.productservice.models.dto.Task1(u.product.model, u.speed, u.hd) from Pc u where u.price < ?1")
    List<Task1> task1Query(double price);
}
