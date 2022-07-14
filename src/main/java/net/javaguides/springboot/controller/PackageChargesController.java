package net.javaguides.springboot.controller;


import net.javaguides.springboot.repository.PackageChargesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/package_charges")
public class PackageChargesController {

    @Autowired
    private PackageChargesRepository packageChargesRepository;

    @GetMapping
    public List<net.javaguides.springboot.model.PackageCharges> getPackageChargesDetail(){
        return packageChargesRepository.findAll();
    }

    @PostMapping
    public net.javaguides.springboot.model.PackageCharges createPackageAmount(@RequestBody net.javaguides.springboot.model.PackageCharges packagesCharges) {
        return packageChargesRepository.save(packagesCharges);
    }

}
