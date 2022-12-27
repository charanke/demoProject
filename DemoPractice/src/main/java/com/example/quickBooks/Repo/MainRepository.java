package com.example.quickBooks.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.data.repository.CrudRepository;

import com.example.quickBooks.entity.EmployeeEntity;

public interface MainRepository extends JpaRepository<EmployeeEntity, String>{

	List<EmployeeEntity> findAll();

}
