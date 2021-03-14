package com.gofly.in.GoFlyEmployeeMS.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="Employee_Flight")
public class GoFlyEmployeeFlight
{
	@Id
	private String flightId;
	@Size(max = 32, message = "Too long name flight compony")
	@NotBlank(message = "flightCompony flield is missing or null")
    private String flightCompany;
	@NotBlank(message = "flightDepartureDate flield is missing or null")
    private String flightDepartureDate;
	@NotBlank(message = "flightDepartureTime flield is missing or null")
    private String flightDepartureTime;
	@NotBlank(message = "flightArrivalDate flield is missing or null")
    private String flightArrivalDate;
	@NotBlank(message = "flightArrivalTime flield is missing or null")
    private String flightArrivalTime;
	@NotBlank(message = "flightSource flield is missing or null")
    private String flightSource;
	@NotBlank(message = "flightDestination flield is missing or null")
    private String flightDestination;
	@NotBlank(message = "flightDuration flield is missing or null")
    private String flightDuration;
	@NotBlank(message = "flightFare flield is missing or null")
    private String flightFare;
	@NotBlank(message = "maxEconomyClassSeats flield is missing or null")
    private String maxEconomyClassSeats;
	@NotBlank(message = "availableEconomyClassSeats flield is missing or null")
    private String availableEconomyClassSeats;
	@NotBlank(message = "maxBusinessClassSeats flield is missing or null")
    private String maxBusinessClassSeats;
	@NotBlank(message = "availableBusinessClassSeats flield is missing or null")
    private String availableBusinessClassSeats;
	
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getFlightCompany() {
		return flightCompany;
	}
	public void setFlightCompany(String flightCompany) {
		this.flightCompany = flightCompany;
	}
	public String getFlightDepartureDate() {
		return flightDepartureDate;
	}
	public void setFlightDepartureDate(String flightDepartureDate) {
		this.flightDepartureDate = flightDepartureDate;
	}
	public String getFlightDepartureTime() {
		return flightDepartureTime;
	}
	public void setFlightDepartureTime(String flightDepartureTime) {
		this.flightDepartureTime = flightDepartureTime;
	}
	public String getFlightArrivalDate() {
		return flightArrivalDate;
	}
	public void setFlightArrivalDate(String flightArrivalDate) {
		this.flightArrivalDate = flightArrivalDate;
	}
	public String getFlightArrivalTime() {
		return flightArrivalTime;
	}
	public void setFlightArrivalTime(String flightArrivalTime) {
		this.flightArrivalTime = flightArrivalTime;
	}
	public String getFlightSource() {
		return flightSource;
	}
	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	public String getFlightDuration() {
		return flightDuration;
	}
	public void setFlightDuration(String flightDuration) {
		this.flightDuration = flightDuration;
	}
	public String getFlightFare() {
		return flightFare;
	}
	public void setFlightFare(String flightFare) {
		this.flightFare = flightFare;
	}
	public String getMaxEconomyClassSeats() {
		return maxEconomyClassSeats;
	}
	public void setMaxEconomyClassSeats(String maxEconomyClassSeats) {
		this.maxEconomyClassSeats = maxEconomyClassSeats;
	}
	public String getAvailableEconomyClassSeats() {
		return availableEconomyClassSeats;
	}
	public void setAvailableEconomyClassSeats(String availableEconomyClassSeats) {
		this.availableEconomyClassSeats = availableEconomyClassSeats;
	}
	public String getMaxBusinessClassSeats() {
		return maxBusinessClassSeats;
	}
	public void setMaxBusinessClassSeats(String maxBusinessClassSeats) {
		this.maxBusinessClassSeats = maxBusinessClassSeats;
	}
	public String getAvailableBusinessClassSeats() {
		return availableBusinessClassSeats;
	}
	public void setAvailableBusinessClassSeats(String availableBusinessClassSeats) {
		this.availableBusinessClassSeats = availableBusinessClassSeats;
	}
	

}
