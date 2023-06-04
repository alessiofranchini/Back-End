package com.jpa_project.runner;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.jpa_project.service.*;
import com.jpa_project.model.*;

@Component
public class Runner implements ApplicationRunner {

	@Autowired UserService userService;
	@Autowired BuildingService buildingService;
	@Autowired LocationService locationService;
	@Autowired ReservationService reservationService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Run...UserRunner");
		
		
	}
}
