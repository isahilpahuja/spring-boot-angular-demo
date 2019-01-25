/**
 * 
 */
package com.deloitte.angular.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.deloitte.angular.demo.model.Car;

/**
 * @author ajaykumar8
 *
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long>{
	List<Car> findByYear(int year);
	List<Car> findByMake(String make);
	List<Car> findByModel(String model);
	List<Car> findByType(String type);
	@Query("select distinct c.year from Car c")
	List<Integer> findYears();
	@Query("select distinct c.make from Car c")
	List<String> findMakes();
	@Query("select c from Car c where c.year=:year and c.make in:makes")
	List<Car> searchCar(@Param("year") int year,@Param("makes") List<String> makes);

	@Query("select c from Car c where c.make in:makes")
	List<Car> searchCarsByMake(@Param("makes") List<String> makes);

	@Query("select c from Car c where c.year=:year")
	List<Car> searchCarByYear(@Param("year") int year);

	@Query("select c from Car c order by c.price asc")
	List<Car> sortByPriceAsc();

	@Query("select c from Car c order by c.price desc")
	List<Car> sortByPriceDesc();

	@Query("select c from Car c order by c.year asc")
	List<Car> sortByYearAsc();

	@Query("select c from Car c order by c.year desc")
	List<Car> sortByYearDesc();

	@Query("select c from Car c where c.year=:year and c.make in:makes and c.model in:models")
	List<Car> searchCarByMakeandModel(@Param("year") int year,@Param("makes") List<String> makes,@Param("models")List<String> models);


	@Query("select c.model from Car c where c.make in:makes")
	List<String> getModelList(@Param("makes") List<String> makes);


	@Query("select c from Car c where c.make in:makes")
	List<Car> searchCarByMake(@Param("makes") List<String> makes); 



}
