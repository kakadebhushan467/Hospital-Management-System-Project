package com.Hospital.Management.System.doclogin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital.Management.System.doclogin.entity.Appointment;
import com.Hospital.Management.System.doclogin.repository.AppointmentsRepository;

@RestController
@RequestMapping("/api/v2")
public class AppointmantController {

	private AppointmentsRepository appointmentsrepository;

	public AppointmantController(AppointmentsRepository appointmentsrepository) {
		super();
		this.appointmentsrepository = appointmentsrepository;
	}
	@PostMapping("/insert")
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		return appointmentsrepository.save(appointment);
	}
	
	//get the data appointment
	@GetMapping
	public List<Appointment>getAllAppointments(){
		return appointmentsrepository.findAll();
	}
}
