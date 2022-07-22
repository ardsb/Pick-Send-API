package api.picksend.springboot.controller;


import api.picksend.springboot.exception.ResourceNotFoundException;
import api.picksend.springboot.model.Package;
import api.picksend.springboot.repository.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/package")
public class PackageController {

    @Autowired
    private PackageRepository packageRepository;

    @GetMapping
    public List<Package> getPackageDetail(){
        return packageRepository.findAll();
    }

    @PostMapping
    public Package createPackage(@RequestBody Package packages) {
        return packageRepository.save(packages);
    }


    @GetMapping("{id}")
    public ResponseEntity<Package> getPackageById(@PathVariable  long id){
        Package Package =  packageRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Package not exist with id:" + id));
        return ResponseEntity.ok(Package);
    }


    @PutMapping("{id}")
    public ResponseEntity<Package> updatePackage(@PathVariable long id, @RequestBody Package PackageDetails) {
        Package updatePackage = packageRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Package not exist with id: " + id));

        updatePackage.setSenderName(PackageDetails.getSenderName());
        updatePackage.setSenderAddress(PackageDetails.getSenderAddress());
        updatePackage.setSenderContact(PackageDetails.getSenderContact());
        updatePackage.setReceiverName(PackageDetails.getReceiverName());
        updatePackage.setReceiverAddress(PackageDetails.getReceiverAddress());

        updatePackage.setReceiverContact(PackageDetails.getReceiverContact());
        updatePackage.setWeight(PackageDetails.getWeight());
        updatePackage.setSize(PackageDetails.getSize());
        updatePackage.setPrice(PackageDetails.getPrice());
        updatePackage.setType(PackageDetails.getType());
        updatePackage.setPackageStatus(PackageDetails.getPackageStatus());
        updatePackage.setDateCreated(PackageDetails.getDateCreated());
        updatePackage.setType(PackageDetails.getType());

        packageRepository.save(updatePackage);

        return ResponseEntity.ok(updatePackage);
    }

    // build delete employee REST API
//    @DeleteMapping("{id}")
//    public ResponseEntity<HttpStatus> deleteUser(@PathVariable long id){
//
//        User User = userRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id: " + id));
//
//        userRepository.delete(User);
//
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//
//    }
}
