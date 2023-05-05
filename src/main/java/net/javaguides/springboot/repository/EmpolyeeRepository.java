package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Empolyee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpolyeeRepository extends JpaRepository<Empolyee ,Long> {
}
