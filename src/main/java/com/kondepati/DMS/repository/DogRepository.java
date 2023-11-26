package com.kondepati.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.kondepati.DMS.Models.Dog;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kondepati.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog , Integer>{
	List<Dog>  findByName(String name);

}
