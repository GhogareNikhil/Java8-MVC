package com.gofly.in.GoFlyEmployeeMS.service;

import java.util.List;
import java.util.Map;

import com.gofly.in.GoFlyEmployeeMS.entity.GoFlyEmployeeFlight;
import com.gofly.in.GoFlyEmployeeMS.model.GoFlyEmployeeRescheduleFlight;

public interface GoFlyEmployeeFlightService
{
	public String addFlight(GoFlyEmployeeFlight flight);
	
    public GoFlyEmployeeFlight getFlight(String flightId);
    List<GoFlyEmployeeFlight> getAllFlights();
    
    //public List<String> getAllFlightsWithNAme(List<GoFlyEmployeeFlight> name);
    public  Map<String, List<GoFlyEmployeeFlight>>filterFlight();
    public GoFlyEmployeeFlight updateFlight(GoFlyEmployeeFlight flightToUpdade);
    public GoFlyEmployeeFlight rescheduleFlight(GoFlyEmployeeRescheduleFlight flightToReschedule);
    
}
