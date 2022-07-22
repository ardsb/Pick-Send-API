package api.picksend.springboot.controller;

import api.picksend.springboot.exception.ResourceNotFoundException;
import api.picksend.springboot.model.User;
import api.picksend.springboot.model.UserLoginRequest;
import api.picksend.springboot.repository.UserRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // build get employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable  long id){
        User user =  userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id:" + id));
        return ResponseEntity.ok(user);
    }


    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable long id, @RequestBody User userDetails) {
         User updateUser = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id: " + id));

        updateUser.setFirstName(userDetails.getFirstName());
        updateUser.setLastName(userDetails.getLastName());
        updateUser.setEmailId(userDetails.getEmailId());
        updateUser.setPassword(userDetails.getPassword());
        updateUser.setUserRole(userDetails.getUserRole());

        userRepository.save(updateUser);

        return ResponseEntity.ok(updateUser);
    }

    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable long id){

        User User = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id: " + id));

        userRepository.delete(User);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
    @PostMapping("/login")
    public User userLogin(@RequestBody UserLoginRequest loginRequest) {
        User byEmailIdAndPassword = userRepository.findByEmailIdAndPassword(loginRequest.getEmail(), loginRequest.getPassword());
        if (byEmailIdAndPassword != null){
            return byEmailIdAndPassword;
        }else{
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED, "USER_NOT_FOUND");
        }
    }

}
