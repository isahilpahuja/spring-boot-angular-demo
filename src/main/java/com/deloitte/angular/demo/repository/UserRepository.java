/**
 * 
 */
package com.deloitte.angular.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.angular.demo.model.User;

/**
 * @author ajaykumar8
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	List<User> findById(long id);
	User findByUserId(String userId);

}
