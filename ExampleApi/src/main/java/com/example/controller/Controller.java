package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Model;
import com.example.service.Services;

@RestController
@CrossOrigin
public class Controller 
{
	@Autowired
	Services s;
	@PostMapping("/save_data")
	public  int insertDataIntoDataBase(@RequestBody Model model)
	{
		s.saveData(model);
		return model.getSno();
	}
	@GetMapping("/get_data")
	public List<Model> getAllData()
	{
		return s.getDetails();
	}
}
