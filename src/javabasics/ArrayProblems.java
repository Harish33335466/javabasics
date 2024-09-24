package javabasics;

import java.util.Arrays;

public class ArrayProblems {

	public static void main(String[] args) {
		//Search an element in array(linear search)
		//Find number of repetations
		
		int a[]= {1,1,3,7,7,7,4,5,8};
		int num=7;
		int count = 0;
		
		
		for(int x:a) {
			if(x==num) {
				count=count+1;
				
				
			}
		}
		System.out.println(count);
		
		//Array Sorting
		
		int s[]= {8,3,4,2,11,1};
		
		System.out.println(Arrays.toString(s));
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		for(int i:s) {
			System.out.println(i);
		}

	}

}
