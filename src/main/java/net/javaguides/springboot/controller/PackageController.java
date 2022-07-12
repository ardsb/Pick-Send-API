package net.javaguides.springboot.controller;


import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Package;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.PackageRepository;
import net.javaguides.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    // build get employee by id REST API
//    @GetMapping("{id}")
//    public ResponseEntity<User> getUserById(@PathVariable  long id){
//        net.javaguides.springboot.model.User user =  userRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id:" + id));
//        return ResponseEntity.ok(user);
//    }


//    @PutMapping("{id}")
//    public ResponseEntity<User> updateUser(@PathVariable long id, @RequestBody net.javaguides.springboot.model.User userDetails) {
//        User updateUser = userRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));
//
//        updateUser.setFirstName(userDetails.getFirstName());
//        updateUser.setLastName(userDetails.getLastName());
//        updateUser.setEmailId(userDetails.getEmailId());
//        updateUser.setPassword(userDetails.getPassword());
//        updateUser.setUserRole(userDetails.getUserRole());
//
//        userRepository.save(updateUser);
//
//        return ResponseEntity.ok(updateUser);
//    }
//
//    // build delete employee REST API
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
