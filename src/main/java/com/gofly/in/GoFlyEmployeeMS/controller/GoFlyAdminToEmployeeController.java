package com.gofly.in.GoFlyEmployeeMS.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gofly.in.GoFlyEmployeeMS.entity.GoFlyEmployeeFlight;
import com.gofly.in.GoFlyEmployeeMS.service.GoFlyAdminToEmployeeService;

@RestController
@RequestMapping("/gofly-admin-to-employee")
public class GoFlyAdminToEmployeeController
{
	@Autowired
	GoFlyAdminToEmployeeService goFlyAdminToEmployeeService;
	
	@PostMapping("/flights/add")
	private ResponseEntity<String> addFlightsFromAdmin(@Valid @RequestBody List<GoFlyEmployeeFlight> flights)
	{
		String respMessage = goFlyAdminToEmployeeService.addFlightsByAdmin(flights);
		return new ResponseEntity<String>(respMessage, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/flight/remove/{flightId}")
	private ResponseEntity<String> deleteFromAdmin(@PathVariable String flightId)
	{
		String respMessage = goFlyAdminToEmployeeService.deleteFlightsByAdmin(flightId);
		return new ResponseEntity<String>(respMessage, HttpStatus.OK);
	}
	

}
