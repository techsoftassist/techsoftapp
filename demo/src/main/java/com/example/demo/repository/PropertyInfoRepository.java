package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PropertyInfo;

@Repository
@EnableJpaRepositories
public interface PropertyInfoRepository extends JpaRepository<PropertyInfo, String>{

	
	 @Query("SELECT e FROM PropertyInfo e INNER JOIN FETCH e.vestingdeedinfo v WHERE e.propertyAdderess = :propertyAddress")
	    List<PropertyInfo> findByPropertyAddressWithVestingInfo(@Param("propertyAddress") String propertyAddress);
	    
	    @Query("SELECT e FROM PropertyInfo e INNER JOIN FETCH e.absopenmortgagedeedinfo m WHERE e.propertyAdderess = :propertyAddress")
	    List<PropertyInfo> findByPropertyAddressWithOpenMortageDeedInfo(@Param("propertyAddress")String propertyAddress);
	
}
