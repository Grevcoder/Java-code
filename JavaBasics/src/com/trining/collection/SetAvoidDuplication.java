package com.trining.collection;
import java.util.*;

public class SetAvoidDuplication {
 
   
    public static void main(String[] args)
    {
        // Creating a Set object and declaring it of String
        // type
        // with reference to TreeSet
        Set<String> ts = new TreeSet<String>();
 
        // Adding elements into the TreeSet
        // using add()
        ts.add("Sara");
        ts.add("Mike");
        ts.add("Kate");
         // Adding the duplicate
        // element
        ts.add("Sara");
        
        for (String student:ts)
        {
        	System.out.println(student);
        }
 
          }
}