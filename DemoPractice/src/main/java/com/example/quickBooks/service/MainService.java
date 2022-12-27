package com.example.quickBooks.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.quickBooks.Repo.MainRepository;
import com.example.quickBooks.entity.EmployeeEntity;


@Service
public class MainService {


	@Autowired
	MainRepository employeeRepository;

//	@Value("${collection.item.bulkbatchsize}")
//	private Integer batchSize;
//
//	@Value("${spring.jpa.properties.hibernate.jdbc.batch_size}")
//	private Integer jpaBatchsize;

	public List<EmployeeEntity> getEmployeeData() {

		System.out.println("inside service");

		return employeeRepository.findAll();
	}


//	public void saveEmployeeData() {
//
//		EmployeeEntity employeeEntity = new EmployeeEntity();
//		System.out.println("save data service");
//		List<EmployeeEntity> temp = new ArrayList<>();
//		int counter = 0;
//
//		for(int i = 0; i < 1000; i++) {
//			employeeEntity = new EmployeeEntity();
//			employeeEntity.setEmployee_name("Charan");
//			employeeEntity.setCity("Hyd");
//			employeeEntity.setEmployeeId(UUID.randomUUID().toString());
//			employeeEntity.setPincode(505001);
//			temp.add(employeeEntity);
//			counter++;
//			
//			if(counter==200)
//			//if((counter%batchSize) == 0)
//			{
//				System.out.println("saving items");
//				employeeRepository.saveAll(temp);
//				counter=0;
//				temp.clear();
//			}
//
//
//		}
//		if(counter>0 && temp.size()>0)
//		{
//			employeeRepository.saveAll(temp);
//			counter=0;
//			temp.clear();
//		}
//
//
//	}



}
