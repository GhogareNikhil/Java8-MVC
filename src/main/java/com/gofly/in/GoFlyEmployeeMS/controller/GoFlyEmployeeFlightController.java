package com.gofly.in.GoFlyEmployeeMS.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gofly.in.GoFlyEmployeeMS.entity.GoFlyEmployeeFlight;
import com.gofly.in.GoFlyEmployeeMS.model.GoFlyEmployeeRescheduleFlight;
import com.gofly.in.GoFlyEmployeeMS.service.GoFlyEmployeeFlightService;

@RestController
@RequestMapping("/gofly-employee-ms")
public class GoFlyEmployeeFlightController
{
	@Autowired
	GoFlyEmployeeFlightService goFlyEmployeeFlightService;
	
	String respMessage;
	HttpStatus httpStatus;
	
	@PostMapping("/flight/add")
	private ResponseEntity<String> addFlight(@Valid @RequestBody GoFlyEmployeeFlight flight, BindingResult result)
	{
		if(!result.hasErrors())
		{
			respMessage = goFlyEmployeeFlightService.addFlight(flight);
			httpStatus = HttpStatus.CREATED;
			return new ResponseEntity<String>(respMessage, httpStatus);
		}
		httpStatus = HttpStatus.BAD_REQUEST;
		return new ResponseEntity<String>(respMessage+result.getAllErrors(),httpStatus);
	}

	@GetMapping("/flight/get/{flightId}")
	private ResponseEntity<Object> getFlight(@PathVariable String flightId)
	{
		GoFlyEmployeeFlight flight = goFlyEmployeeFlightService.getFlight(flightId);
		
		if(flight != null)
		{
			httpStatus = HttpStatus.OK;
			return new ResponseEntity<Object>(flight, httpStatus);
		}
		respMessage = "Flight: "+flightId+" not found";
		httpStatus = HttpStatus.NOT_FOUND;
		return new ResponseEntity<Object>(respMessage, httpStatus);
	}
	
	@GetMapping("/flights")
	private ResponseEntity<List<GoFlyEmployeeFlight>> getAllFlights()
	{
		List<GoFlyEmployeeFlight> flights = goFlyEmployeeFlightService.getAllFlights();
		return new ResponseEntity<List<GoFlyEmployeeFlight>>(flights, HttpStatus.OK);
	}
	
	@PutMapping("/flight/update")
	private ResponseEntity<Object> updateFlight(@Valid @RequestBody GoFlyEmployeeFlight flightToUpdate)
	{
		GoFlyEmployeeFlight flight = goFlyEmployeeFlightService.updateFlight(flightToUpdate);
		if(flight != null)
		{
			return new ResponseEntity<Object>(flight, HttpStatus.OK);
		}
		return new ResponseEntity<Object>("Flight: "+flightToUpdate.getFlightId()+" does not exist!!", HttpStatus.NOT_FOUND);
	}
	
	@PatchMapping("/flight/reschedule")
	private ResponseEntity<Object> rescheduleFlight(@RequestBody GoFlyEmployeeRescheduleFlight flightPatch)
	{
		GoFlyEmployeeFlight rescheduleFlight = goFlyEmployeeFlightService.rescheduleFlight(flightPatch);
		if(rescheduleFlight != null)
		{
			return new ResponseEntity<Object>(rescheduleFlight, HttpStatus.OK);
		}
		return new ResponseEntity<Object>("Flight: "+flightPatch.getFlightId()+" does not exist!!", HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping("/flights/filterFlights")
	private ResponseEntity< Map<String, List<GoFlyEmployeeFlight>>> filterFlight()
	{
		 Map<String, List<GoFlyEmployeeFlight>> flights = goFlyEmployeeFlightService.filterFlight();
		return new ResponseEntity< Map<String, List<GoFlyEmployeeFlight>>>(flights, HttpStatus.OK);
	}
	
	
	
	
	
	
}
