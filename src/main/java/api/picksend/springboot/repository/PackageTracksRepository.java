package api.picksend.springboot.repository;

import api.picksend.springboot.model.PackageTracks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageTracksRepository extends JpaRepository<PackageTracks, Long> {
}
