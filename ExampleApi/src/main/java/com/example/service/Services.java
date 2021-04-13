package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.example.model.Model;
import com.example.repository.RepositoryNeeded;
@Service
@ComponentScan
public class Services 
{
	@Autowired
	RepositoryNeeded repo;
	public void saveData(Model model)
	{
		repo.save(model);
	}
	public List<Model> getDetails()
	{
		List<Model> model=new ArrayList<Model>();
		repo.findAll().forEach(data1 ->model.add(data1));
		return model;
	}
}
