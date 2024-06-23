package com.Hospital.Management.System.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital.Management.System.entity.Patient;
import com.Hospital.Management.System.repositorty.PatientRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/vi")
public class PatientConroller {

	
	private PatientRepository patientRepository;

	public PatientConroller(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}
	@PostMapping("/insert")
	public Patient createPatient(@RequestBody Patient patient) {
		return patientRepository.save(patient);
	}
	
	//Get the all data patient
	@GetMapping
	public List<Patient>getAllPatient(){
		return patientRepository.findAll();
		
	}
}
