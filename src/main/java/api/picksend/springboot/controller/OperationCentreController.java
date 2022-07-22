package api.picksend.springboot.controller;

import api.picksend.springboot.exception.ResourceNotFoundException;
import api.picksend.springboot.model.OperationCenter;
import api.picksend.springboot.repository.OperationCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/operation-center")
public class OperationCentreController {

    @Autowired
    private OperationCenterRepository operationCenterRepository;

    @GetMapping
    public List<OperationCenter> getOperationCenterDetail(){
        return operationCenterRepository.findAll();
    }

    @PostMapping
    public OperationCenter createOperationCenter(@RequestBody OperationCenter operationCenter) {
        return operationCenterRepository.save(operationCenter);
    }

        @GetMapping("{id}")
    public ResponseEntity<OperationCenter> getOperationCenterById(@PathVariable  long id){
            OperationCenter operationCenter =  operationCenterRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Operation Center not exist with id:" + id));
        return ResponseEntity.ok(operationCenter);
    }
}
