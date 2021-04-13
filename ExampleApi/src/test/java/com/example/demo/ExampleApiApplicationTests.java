package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.model.Model;
import com.example.repository.RepositoryNeeded;

@SpringBootTest
class ExampleApiApplicationTests {
	@Autowired
	RepositoryNeeded repo;
	@Test
	void contextLoads() {
	}
//	Positive TestCase
	@Test
	void checkDataPositive()
	{
		Optional<Model> model = repo.findById(1);
		assertEquals("Sisi",model.get().getName());
	}
//Negative TestCase
	@Test
	void checkDataNegative()
	{
		Optional<Model> model = repo.findById(2);
		assertNotEquals("pandu",model.get().getName());
	}
}
