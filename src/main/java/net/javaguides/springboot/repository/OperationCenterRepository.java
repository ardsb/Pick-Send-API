package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.OperationCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationCenterRepository extends JpaRepository<OperationCenter, Long> {
}
