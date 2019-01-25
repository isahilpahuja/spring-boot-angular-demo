package com.deloitte.angular.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.angular.demo.model.Car;
import com.deloitte.angular.demo.model.CarSearch;
import com.deloitte.angular.demo.repository.CarRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/car")
public class CarController {

	@Autowired
	CarRepository carRepository;

	@GetMapping("carList")
	public List<Car> getAllCars()
	{
		return carRepository.findAll();
	}

	@PostMapping("/add")
	public Car addCar(@RequestBody Car car)
	{
		return carRepository.save(car);
	}
	@GetMapping("/year/{year}")
	public List<Car> getCarByYear(@PathVariable(value = "year") int year) {
		return carRepository.findByYear(year);
	}

	@GetMapping("/type/{type}")
	public List<Car> findByType(@PathVariable(value = "type") String type) {
		return carRepository.findByType(type);
	}

	@GetMapping("/model/{model}")
	public List<Car> findByModel(@PathVariable(value = "model") String model) {
		return carRepository.findByModel(model);
	}

	@GetMapping("/make/{make}")
	public List<Car> findByMake(@PathVariable(value = "make") String make) {
		return carRepository.findByMake(make);
	}

	@GetMapping("/years")
	public List<Integer> getAllYears() {
		return carRepository.findYears();
	}

	@GetMapping("/makes")
	public List<String> getAllMakes() {
		return carRepository.findMakes();
	}

	@PostMapping("/search")
	public List<Car> searchCar(@RequestBody CarSearch car)
	{
	      List<Car> carList= new ArrayList<>();
	      if(car!=null && car.getYear()>0 && !car.getMakes().isEmpty() && !car.getModels().isEmpty())
	      {
	      carList=carRepository.searchCarByMakeandModel(car.getYear(), car.getMakes(), car.getModels());
	      }
	      else if(car!=null && car.getYear()>0 && !car.getMakes().isEmpty())
	      {
	        carList=carRepository.searchCar(car.getYear(), car.getMakes());
	      } 
	      else if(car!=null &&  car.getMakes()!=null && !car.getMakes().isEmpty())
	      {
	      carList=carRepository.searchCarByMake(car.getMakes());
	      } 
	      else if(car!=null &&  car.getYear()>0)
	      {
	      carList=carRepository.searchCarByYear(car.getYear());
	      }
	      return carList;
	      
	}

	@GetMapping("/sortByYearDesc")
	public List<Car> sortByYearDesc() {
		return carRepository.sortByYearDesc();
	}

	@GetMapping("/sortByYearAsc")
	public List<Car> sortByYearAsc() {
		return carRepository.sortByYearAsc();
	}


	@GetMapping("/sortByPriceDesc")
	public List<Car> sortByPriceDesc() {
		return carRepository.sortByPriceDesc();
	}

	@GetMapping("/sortByPriceAsc")
	public List<Car> sortByPriceAsc() {
		return carRepository.sortByPriceAsc();
	}

	@PostMapping("/modelList")
	public List<String> getModelDetails(@RequestBody CarSearch car)
	{
		List<String> modelList= new ArrayList<>();
		if(car!=null && !car.getMakes().isEmpty())
		{
			modelList=carRepository.getModelList(car.getMakes());
		}
		return modelList;

	}

}
