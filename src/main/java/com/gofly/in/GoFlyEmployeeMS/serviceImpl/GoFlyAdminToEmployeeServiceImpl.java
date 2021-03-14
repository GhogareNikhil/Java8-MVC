package com.gofly.in.GoFlyEmployeeMS.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gofly.in.GoFlyEmployeeMS.entity.GoFlyEmployeeFlight;
import com.gofly.in.GoFlyEmployeeMS.repository.GoFlyEmployeeFlightRepository;
import com.gofly.in.GoFlyEmployeeMS.service.GoFlyAdminToEmployeeService;
@Service
public class GoFlyAdminToEmployeeServiceImpl implements GoFlyAdminToEmployeeService
{
	@Autowired
	GoFlyEmployeeFlightRepository goFlyEmployeeFlightRepository; 

	@Override
	public String addFlightsByAdmin(List<GoFlyEmployeeFlight> flights)
	{
		goFlyEmployeeFlightRepository.saveAll(flights);
		return "All Flights are successfully added in both Employee And Admin records!!";
	}

	@Override
	public String deleteFlightsByAdmin(String flightId)
	{
		Optional<GoFlyEmployeeFlight> optionalFlight = goFlyEmployeeFlightRepository.findById(flightId);
		if(optionalFlight.isPresent())
		{
			goFlyEmployeeFlightRepository.deleteById(flightId);
			return "Flight: "+flightId+" Removed from both Employee And Admin records!!";
		}
		return "Flight: "+flightId+" does not exist both Employee And Admin records!!";
	}
	

}
