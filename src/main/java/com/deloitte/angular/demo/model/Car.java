package com.deloitte.angular.demo.model;

import java.math.BigDecimal;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;

@Column(name="model")
private String model;

@Column(name="year")
private int year;

@Column(name="make")
private String make;

@Column(name="trim")
private String trim;

@Column(name="color")
private String color;

@Column(name="transmission")
private String transmission;

@Column(name="drivetrain")
private String drivetrain;

@Column(name="type")
private String type;

@Column(name="price", precision=10, scale=2)
private BigDecimal price;


@Column(name="body")
private String body;

@Column(name="firstName")
private String firstName;

@Column(name="lastName")
private String lastName;

@Column(name="email")
private String email;

@Column(name="phone")
private String phone;

@Column(name="city")
private String city;

@Column(name="picture")
private String picture;


public String getPicture() {
	return picture;
}

public void setPicture(String picture) {
	this.picture = picture;
}

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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Lob
@Column(name="image")
private byte[] image;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public String getTrim() {
	return trim;
}

public void setTrim(String trim) {
	this.trim = trim;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getTransmission() {
	return transmission;
}

public void setTransmission(String transmission) {
	this.transmission = transmission;
}

public String getDrivetrain() {
	return drivetrain;
}

public void setDrivetrain(String drivetrain) {
	this.drivetrain = drivetrain;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

/*public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}*/

public byte[] getImage() {
	return image;
}

public BigDecimal getPrice() {
	return price;
}

public void setPrice(BigDecimal price) {
	this.price = price;
}

public void setImage(byte[] image) {
	this.image = image;
}





public String getBody() {
	return body;
}

public void setBody(String body) {
	this.body = body;
}

@Override
public String toString() {
	return "Car [id=" + id + ", model=" + model + ", year=" + year + ", make=" + make + ", trim=" + trim + ", color="
			+ color + ", transmission=" + transmission + ", drivetrain=" + drivetrain + ", type=" + type + ", price="
			+ price + ", body=" + body + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", phone=" + phone + ", city=" + city + ", image=" + Arrays.toString(image) + "]";
}










	

}
