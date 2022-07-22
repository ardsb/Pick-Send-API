package api.picksend.springboot.repository;

import api.picksend.springboot.model.PackageCharges;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageChargesRepository extends JpaRepository<PackageCharges,Long> {
}
