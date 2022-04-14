package com.trining.collection;
import java.util.HashSet;

public class Student {
	private String name;
	private int rollNo;
	private String grade;

	
	public Student(String name, int rollNo, String grade) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public int hashCode() {
	System.out.println("In hashcode");
	return this.getRollNo();
	}
	
	
	public boolean equals(Object obj) {
		Student s = null;
		if(obj instanceof Student){
		s = (Student) obj;
		}
		System.out.println("In equals");
		if(this.getName() == s.getName()){
		return true;
		} else {
		return false;

	
	}

}
}