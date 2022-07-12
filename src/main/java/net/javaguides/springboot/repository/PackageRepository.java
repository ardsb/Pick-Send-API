package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Package;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<Package, Long> {
}
