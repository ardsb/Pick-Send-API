package api.picksend.springboot.controller;


import api.picksend.springboot.model.PackageCharges;
import api.picksend.springboot.repository.PackageChargesRepository;
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
    public List<PackageCharges> getPackageChargesDetail(){
        return packageChargesRepository.findAll();
    }

    @PostMapping
    public PackageCharges createPackageAmount(@RequestBody PackageCharges packagesCharges) {
        return packageChargesRepository.save(packagesCharges);
    }

}
