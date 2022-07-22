package api.picksend.springboot.repository;

import api.picksend.springboot.model.Package;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<Package, Long> {
}
