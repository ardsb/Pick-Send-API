package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.PackageCharges;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageChargesRepository extends JpaRepository<PackageCharges ,Long> {
}
