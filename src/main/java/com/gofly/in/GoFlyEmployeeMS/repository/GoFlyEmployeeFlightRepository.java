package com.gofly.in.GoFlyEmployeeMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gofly.in.GoFlyEmployeeMS.entity.GoFlyEmployeeFlight;

@Repository
public interface GoFlyEmployeeFlightRepository extends JpaRepository<GoFlyEmployeeFlight, String>
{

}
