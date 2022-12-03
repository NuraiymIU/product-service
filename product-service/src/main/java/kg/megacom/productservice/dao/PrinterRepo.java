package kg.megacom.productservice.dao;

import kg.megacom.productservice.models.entity.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrinterRepo extends JpaRepository<Printer, Long> {
}
