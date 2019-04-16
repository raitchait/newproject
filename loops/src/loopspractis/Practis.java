package loopspractis;

import java.util.ArrayList;

public class Practis {

	public static void main(String[] args) {
		//loops
		//for loops
		for (int s = 0;s <5;s++) {
			System.out.println("value of x is : "+s++);
			System.out.println("value of x is : "+s);
	}
//while loop
	int a = 1;
	while (a<3) {
		
		System.out.println("value of z is : "+a++);
	 
	}
//enhanced for loop 
//create an array and insert  state
	String array[]= { "new york","new jersey","florida","arizona"};
	System.out.println("lenth of array is "+array.length);
	
	for (String b :array) {
		System.out.println("my state is "+b);
	}
	
	// do while
	int y = 6 ;
	do {
		System.out.println("my number is "+y++);
	
	}
	while (y<7);
	ArrayList <String> arraylist = new ArrayList<>();
	
	System.out.println(arraylist.size());
	for(int r=0; r<3;r++) {
		arraylist.add("rachid");
		
	}
	System.out.println(arraylist.get(2));
	System.out.println(arraylist.size());
	}
	

}


