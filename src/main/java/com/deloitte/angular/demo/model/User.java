/**
 * 
 */
package com.deloitte.angular.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

/**
 * @author ajaykumar8
 *
 */
@Entity
@Table(name ="user")
public class User {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long Id;

@Column(name="username")
private String userName;

@Column(name="firstName")
private String firstName;

@Column(name="lastName")
private String lastName;

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

@Column(name="userId")
private String userId;

@Column(name="password")
private String password;

@Column(name="phone")
private String phone;

@Column(name="location")
private String location;

/*@Column(name="expected price")
private Double expectedPrice;*/

@Column(name="imageLocation")
private String imageLocation;

@Column(name="email")
private String email;

@Column(name="notes")
private String notes;

/*@OneToOne
@JoinColumn(name="car_id",referencedColumnName="id",cascade=CascadeType.ALL)
private Car car;*/




public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

/*public Double getExpectedPrice() {
	return expectedPrice;
}

public void setExpectedPrice(Double expectedPrice) {
	this.expectedPrice = expectedPrice;
}*/

public String getImageLocation() {
	return imageLocation;
}

public void setImageLocation(String imageLocation) {
	this.imageLocation = imageLocation;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getNotes() {
	return notes;
}

public void setNotes(String notes) {
	this.notes = notes;
}

/*public Car getCar() {
	return car;
}

public void setCar(Car car) {
	this.car = car;
}*/

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}







/*@Override
public String toString() {
	return "User [Id=" + Id + ", userName=" + userName + ", userId=" + userId + ", password=" + password + ", phone="
			+ phone + ", location=" + location + ", imageLocation=" + imageLocation
			+ ", email=" + email + ", notes=" + notes + ", car=" + car + "]";
}*/

public long getId() {
	return Id;
}

public void setId(long id) {
	Id = id;
}

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}






	

}
