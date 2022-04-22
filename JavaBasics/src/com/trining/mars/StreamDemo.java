package com.trining.mars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> numbers=Arrays.asList(7,2,3,5,9);//creating a list of numbers
		List<String> names=Arrays.asList("Sara","Sara Kate","Mike","Jose","Lisa");		//Stream<Integer> numberStream=numbers.stream();//creating a stream number collection
		//Stream<Integer> squaredValue=numberStream.map((a)->a*a);//call intermediate map methods
		//List updatedNumbers=squaredValue.collect(Collectors.toList());
	//	System.out.println(updatedNumbers);
		List<Integer> newNumbers=numbers.stream().map(a->a*a).collect(Collectors.toList());
		List<Integer> sortedNumbers=numbers.stream().sorted().collect(Collectors.toList());
		List<Integer> newSortedNumbers=numbers.stream().map(a->a*a).sorted().collect(Collectors.toList());
	//List<Integer> evenList=numbers.stream().filter(x->(x%2==0)).collect(Collectors.toList());
		// numbers.stream().filter(x->(x%2==0)).forEach(y->System.out.println(y));
		 numbers.stream().filter(x->(x%2==0)).forEach(System.out::println);
		int sumEven= numbers.stream().filter(x->(x%2!=0)).reduce(0,(ans,y)->ans+y);


			System.out.println(newNumbers);
			System.out.println(sortedNumbers);

			System.out.println(newSortedNumbers);

			//System.out.println(evenList);

			System.out.println(sumEven);
			
			System.out.println("String Operations");
			List<String> updatedNames=names.stream().map(a->"Mr"+a).collect(Collectors.toList());
			System.out.println(updatedNames);
			List<String> alphabaticalOrderNames=names.stream().sorted().collect(Collectors.toList());
			System.out.println(alphabaticalOrderNames);
			names.stream().filter(x->(x=="Mike"|| x=="Sara")).forEach(System.out::println);
			String result = names.stream().reduce("o",String::concat);
			System.out.println(result);

		//	int twoNamesTogether= names.stream().filter(x->(x=="Sara")).reduce(0,names)->xnames);




	}

}
//intermediate operation:map,filter,sorted
//Terminal operation:collect,foreach,reduce