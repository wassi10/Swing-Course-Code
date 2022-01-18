import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

public class GenericsExample {

//	 Two Main features :
//		1. Compile time type safety
//		2. No explicit casting
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
		
		
		List list = new ArrayList();
//		
		list.add("a String"); //adding object in the list
		list.add(20);
		list.add(10); //adding object in the list
//		
		System.out.println((String)list.get(0)); //Explicit casting
		System.out.println((Integer)list.get(1));
		System.out.println((Integer)list.get(2));
		
		List<String> myStrList = new ArrayList();
		myStrList.add("a String"); //adding object in the list
		//myStrList.add(10); //***** Compile time type safety
		System.out.println((String)myStrList.get(0)); //No Explicit casting		
		
	}
}
