package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.VestingDeedInfo;

public interface VestingDeedInfoRepository extends JpaRepository<VestingDeedInfo, Long>{

}