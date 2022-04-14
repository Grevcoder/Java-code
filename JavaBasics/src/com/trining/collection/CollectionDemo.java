package com.trining.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
	
	public static void main(String[] args)
	{
		//Set <Integer> values =new HashSet <>();
		Student stud1=new  Student("Sara",12,"8");
		Student stud2=new  Student("Sa",12,"8");
		Student stud3=new  Student("Sar",12,"8");
		Student stud4=new  Student("Sara",12,"8");
		Map<String, Student> studentMap=new HashMap<>();
        
		studentMap.put("1",stud1);
		studentMap.put("2",stud2);
		studentMap.put("3",stud3);
		studentMap.put("4",stud4);
        
		
		for(Map.Entry<String,Student> entry:studentMap.entrySet())
		{
			String Key=entry.getKey();
			Student student=entry.getValue();
			System.out.println(student.getName());
		}
		
/*	List<String> names =new ArrayList<>();
		List<Student> st udentList =new ArrayList<>();
		
		/*values.add(2);
		values.add(6);
		values.add(8);
		values.add(3);
		values.add(2);*/
		/*names.add("John");
		names.add("Mike");
		names.add("Kate");
		studentList.add(stud1);
		studentList.add(stud2);
		studentList.add(stud3);
		studentList.add(stud4);
		
		for(Student student:studentList)
		{
		System.out.println(student.getGrade());	
		}*/
		
	}

}
