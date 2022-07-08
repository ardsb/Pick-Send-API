package net.javaguides.springboot.controller;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<net.javaguides.springboot.model.User> getAllUser(){
        return userRepository.findAll();
    }

    @PostMapping
    public net.javaguides.springboot.model.User createEmployee(@RequestBody net.javaguides.springboot.model.User user) {
        return userRepository.save(user);
    }

//    // build get employee by id REST API
//    @GetMapping("{id}")
//    public ResponseEntity<User> getEmployeeById(@PathVariable  long id){
//        User employee = employeeRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" + id));
//        return ResponseEntity.ok(employee);
//    }

    // build update employee REST API
//    @PutMapping("{id}")
//    public ResponseEntity<User> updateEmployee(@PathVariable long id,@RequestBody User employeeDetails) {
//        User updateEmployee = employeeRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));
//
//        updateEmployee.setFirstName(employeeDetails.getFirstName());
//        updateEmployee.setLastName(employeeDetails.getLastName());
//        updateEmployee.setEmailId(employeeDetails.getEmailId());
//
//        employeeRepository.save(updateEmployee);
//
//        return ResponseEntity.ok(updateEmployee);
//    }

    // build delete employee REST API
//    @DeleteMapping("{id}")
//    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){
//
//        User employee = employeeRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));
//
//        employeeRepository.delete(employee);
//
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//
//    }
}
