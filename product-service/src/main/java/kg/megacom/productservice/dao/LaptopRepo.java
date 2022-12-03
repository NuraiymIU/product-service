package kg.megacom.productservice.dao;

import kg.megacom.productservice.models.dto.LaptopEx3Dto;
import kg.megacom.productservice.models.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop, Long> {

    @Query("select new kg.megacom.productservice.models.dto.LaptopEx3Dto(l.product.model, l.ram, l.screen) from Laptop l where l.price > ?1")
    List<LaptopEx3Dto> findAllLaptopWherePriceMoreThan(double price);
}
