package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.UserNotFoundException;

import com.example.demo.model.Login;

import com.example.demo.model.User;
//import com.example.demo.model.empAddress;
//import com.example.demo.model.empQualification;
import com.example.demo.repository.UserRepository;
//import com.example.demo.repository.empAddressRepository;
//import com.example.demo.repository.empQualificationRepository;

@RestController

@CrossOrigin("http://localhost:3000")

public class Usercontroller {

	
		
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/save")
	 public User newUser(@RequestBody User newUser) {
		
		String empFirstName = newUser.getEmpFirstName();
		String empLastName = newUser.getEmpLastName();
		newUser.setUserName(empLastName+"."+empFirstName);
		return userRepository.save(newUser);
		
	}
	
	@GetMapping("/load")
	 public List<User> getAllUser(){
		
		return userRepository.findAll();
	}
	
	@GetMapping("/load/{empId}")
	 public User getUserById(@PathVariable Long empId) {
		return userRepository.findById(empId)
				.orElseThrow(()->new UserNotFoundException(empId));
		
	}
	
	@RequestMapping("/update/{empId}")
	public User update(@RequestBody User newUser)
	{
		User ExistingUser = userRepository.findById(newUser.getEmpId()).orElse(null);
		if(ExistingUser != null)
		{
			
			ExistingUser.setEmpId(newUser.getEmpId());
			ExistingUser.setEmpFirstName(newUser.getEmpFirstName());
			ExistingUser.setEmpLastName(newUser.getEmpLastName());
			ExistingUser.setEmpAddress(newUser.getEmpAddress());
			ExistingUser.setEmpEmail(newUser.getEmpEmail());
			ExistingUser.setEmpPassword(newUser.getEmpPassword());
			ExistingUser.setEmpJoiningDate(newUser.getEmpJoiningDate());
			ExistingUser.setEmpReleavingDate(newUser.getEmpReleavingDate());
			ExistingUser.setEmpQualification(newUser.getEmpQualification());
			return userRepository.save(ExistingUser);
		}
		return null;
	}
	@PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Login login) throws Exception {
		User user = userRepository.getEmployeeDetails(login.getEmpEmail() , login.getEmpPassword() );
		
		if(user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        else 
        {
          //  return new ResponseEntity<>(new IncurrectCredientials("User Does't exist....Please Register"), HttpStatus.NOT_FOUND);
        	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
//	@GetMapping("address/{id}")
//    public ResponseEntity<User> getEmployeeWithAddress(@PathVariable Long empId) {
//        User newUser = userRepository.getEmpAddress(empId);
//        if (newUser != null) {
//            return ResponseEntity.ok(newUser);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
	
	
	
//	@Autowired
//	private empAddressRepository empaddressrepository;
//	@GetMapping("/address")
//    public List<empAddress> getAllAddresses() {
//        return empaddressrepository.getAllAddresses();          
//    }
//    @Autowired
//    private empQualificationRepository empQualificationRepository;
//    @GetMapping("Qualification")
//    public List<empQualification> getAllQualifications() {
//        return empQualificationRepository.getAllQualifications();
//    }
//	
	
}

	
	
	
	

