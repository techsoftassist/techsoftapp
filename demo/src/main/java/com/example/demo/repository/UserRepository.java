package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.model.User;
//import com.example.demo.model.empAddress;


@Repository
@EnableJpaRepositories
@ComponentScan
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.EmpEmail = :empEmail AND u.EmpPassword = :empPassword")
    User getEmployeeDetails(@Param("empEmail") String empEmail, @Param("empPassword") String empPassword);

//    @Query("SELECT e FROM User e JOIN FETCH e.address WHERE e.id = :empId")
//	User getEmpAddress(@Param("empId")Long empId);

	
}

	