package api.picksend.springboot.repository;

import api.picksend.springboot.model.OperationCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationCenterRepository extends JpaRepository<OperationCenter, Long> {
}
