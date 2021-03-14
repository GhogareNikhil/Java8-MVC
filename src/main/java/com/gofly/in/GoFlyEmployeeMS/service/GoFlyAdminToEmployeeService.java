package com.gofly.in.GoFlyEmployeeMS.service;

import java.util.List;

import com.gofly.in.GoFlyEmployeeMS.entity.GoFlyEmployeeFlight;

public interface GoFlyAdminToEmployeeService 
{
	public String addFlightsByAdmin(List<GoFlyEmployeeFlight> flights);
	public String deleteFlightsByAdmin(String flightId);
}
