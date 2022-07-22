package api.picksend.springboot.controller;

import api.picksend.springboot.exception.ResourceNotFoundException;
import api.picksend.springboot.repository.PackageTracksRepository;
import api.picksend.springboot.model.PackageTracks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/package_tracks")
public class PackageTracksController {

    @Autowired
    private PackageTracksRepository packageTracksRepository;

    @GetMapping
    public List<PackageTracks> getPackageTracksDetails(){
        return packageTracksRepository.findAll();
    }

    @PostMapping
    public PackageTracks createPackageStatus(@RequestBody PackageTracks packageTracks) {
        return packageTracksRepository.save(packageTracks);
    }

    // build get employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<PackageTracks> getPackageTracksById(@PathVariable  long id){
        PackageTracks packageTracks =  packageTracksRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Package status not exist with id:" + id));
        return ResponseEntity.ok(packageTracks);
    }


    @PutMapping("{id}")
    public ResponseEntity<PackageTracks> updatePackageStatus(@PathVariable long id, @RequestBody PackageTracks packageTracks) {
        PackageTracks updatePackageStatus = packageTracksRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Package status not exist with id: " + id));

        updatePackageStatus.setPackageId(packageTracks.getPackageId());
        updatePackageStatus.setPackageStatus(packageTracks.getPackageStatus());
        updatePackageStatus.setDateCreated(packageTracks.getDateCreated());


        packageTracksRepository.save(updatePackageStatus);

        return ResponseEntity.ok(updatePackageStatus);
    }

    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deletePackageTracks(@PathVariable long id){

        PackageTracks packageTracks = packageTracksRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id: " + id));

        packageTracksRepository.delete(packageTracks);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
