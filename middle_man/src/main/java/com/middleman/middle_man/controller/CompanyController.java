package com.middleman.middle_man.controller;
import java.util.*;
import com.middleman.middle_man.service.CompanyService;
import com.middleman.middle_man.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    @Autowired
    private CompanyService companyService;


    @GetMapping("/getAllCompanies")
    public List<Company> findAllCompany(){
       return companyService.findAll();
    }

    @GetMapping("/getComapny")
    public Company getCompany(@RequestBody String compName){
        return companyService.findByComName(compName);
    }

    @PostMapping("/addCompany")
    public Company createCompany(@RequestBody Company company){
        return companyService.save(company);

    }

   @PutMapping("/updateCompany")
       public Company updateComapny(@RequestBody Company company){
           return companyService.save(company);

       }

    @DeleteMapping("/deleteCompany")
    public void deleteCompany(@RequestBody String id){
        companyService.deleteById(id);
    }
  

   }
    

