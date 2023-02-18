package com.student.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	private int studentRoll;
	private String studentName;
	private String studentSurname;
	private String mobileNumber;
	private String email;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	private List<Collage> clg=new ArrayList<>();
	
}
