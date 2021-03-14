package com.gofly.in.GoFlyEmployeeMS.serviceImpl;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gofly.in.GoFlyEmployeeMS.entity.GoFlyEmployeeFlight;
import com.gofly.in.GoFlyEmployeeMS.model.GoFlyEmployeeRescheduleFlight;
import com.gofly.in.GoFlyEmployeeMS.repository.GoFlyEmployeeFlightRepository;
import com.gofly.in.GoFlyEmployeeMS.service.GoFlyEmployeeFlightService;

@Service
public class GoFlyEmployeeFlightServiceImpl implements GoFlyEmployeeFlightService
{
	@Autowired
	GoFlyEmployeeFlightRepository goFlyEmployeeFlightRepository; 

	@Override
	public String addFlight(GoFlyEmployeeFlight flight)
	{
		goFlyEmployeeFlightRepository.save(flight);
		return "Flight: "+flight.getFlightId()+" added Successfully in record!!";
	}

	@Override
	public GoFlyEmployeeFlight getFlight(String flightId) 
	{
		Optional<GoFlyEmployeeFlight> optionalFlight = goFlyEmployeeFlightRepository.findById(flightId);
		if(optionalFlight.isPresent())
		{
			                  //optionalFlight.filter(flightid-> flightid.getFlightCompany())
			GoFlyEmployeeFlight flight = optionalFlight.get();
			return flight;
		}
		return null;
	}

	@Override
	public List<GoFlyEmployeeFlight> getAllFlights()
	{
		return goFlyEmployeeFlightRepository.findAll();
	}

	@Override
	public GoFlyEmployeeFlight updateFlight(GoFlyEmployeeFlight flightToUpdade)
	{
		Optional<GoFlyEmployeeFlight> optionalFlight = goFlyEmployeeFlightRepository.findById(flightToUpdade.getFlightId());
		if(optionalFlight.isPresent())
		{
			goFlyEmployeeFlightRepository.save(flightToUpdade);
			return flightToUpdade;
		}
		return null;
	}

	@Override
	public GoFlyEmployeeFlight rescheduleFlight(GoFlyEmployeeRescheduleFlight flightToReschedule) 
	{
		Optional<GoFlyEmployeeFlight> optionalFlight = goFlyEmployeeFlightRepository.findById(flightToReschedule.getFlightId());
		if(optionalFlight.isPresent()) 
		{
			
			GoFlyEmployeeFlight rescheduleFlight = optionalFlight.get();
			rescheduleFlight.setFlightDepartureDate(flightToReschedule.getFlightDepartureDate());
			rescheduleFlight.setFlightDepartureTime(flightToReschedule.getFlightDepartureTime());
			rescheduleFlight.setFlightArrivalDate(flightToReschedule.getFlightArrivalDate());
			rescheduleFlight.setFlightArrivalTime(flightToReschedule.getFlightArrivalTime());
			goFlyEmployeeFlightRepository.save(rescheduleFlight);
			return rescheduleFlight;
		}
		return null;
	}

	@Override
	public Map<String, List<GoFlyEmployeeFlight>> filterFlight() {
		Map<String, List<GoFlyEmployeeFlight>> liEmployeeFlights= goFlyEmployeeFlightRepository.findAll().stream()
		.filter(GoFlyEmployeeFlight-> GoFlyEmployeeFlight.getFlightArrivalDate().equals("02/02/2021"))
				.collect(Collectors.groupingBy(GoFlyEmployeeFlight::getFlightCompany));
		return liEmployeeFlights;
				
				
		
		
	}

	
	
		
	}


