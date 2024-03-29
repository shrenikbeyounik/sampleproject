package com.howtodoinjava.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="register")
public class RegistrationForm {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@Column
private String name;

@Column
private String email;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
@Column
private MultipartFile [] albums;


public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public MultipartFile[] getAlbums() {
return albums;
}
public void setAlbums(MultipartFile[] albums) {
this.albums = albums;
}
 
}