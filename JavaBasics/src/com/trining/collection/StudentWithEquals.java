package com.trining.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StudentWithEquals {
	

		public static void main(String args[]){
		HashSet<Student> hashSet = new HashSet<>();
		Student stud2=new  Student("Sa",10,"8");
		Student stud3=new  Student("Sar",13,"8");
		Student stud4=new  Student("Sara",15,"8");
		
		 hashSet.add(stud2);
	        hashSet.add(stud3);
	        hashSet.add(stud4);
	       

	        for (Student student:hashSet)
	        {
	        	System.out.println(student.getName());
	        }
	System.out.println("Add duplicate record:");
		hashSet.add(new Student("Sara",10,"50000"));
		for(Student student:hashSet){
		System.out.println(student.getName());
		}

		}
		
}

/*Student stud1=new  Student("Sara",12,"8");
Student stud2=new  Student("Sa",12,"8");
Student stud3=new  Student("Sar",12,"8");
Student stud4=new  Student("Sara",12,"8");
Map<String, Student> studentMap=new HashMap<>();*/
