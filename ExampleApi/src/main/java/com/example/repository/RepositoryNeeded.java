package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Model;
@Repository
public interface RepositoryNeeded extends CrudRepository<Model, Integer>
{

}
