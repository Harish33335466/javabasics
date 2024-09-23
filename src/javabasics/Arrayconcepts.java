package javabasics;

public class Arrayconcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Single dimensional declaration
		
		//Approach -1
		
		int a[] = new int[5];
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		System.out.println(a[1]);
		System.out.println(a.length);
		
		//Approach-2
		
		int b[]= {1,2,3,4,5};
		System.out.println(b); // not possible to view all the elements inside my array to view all the elements inside my array we need to use loop
		
		//Enhanced for loop to see the elements inside the array
		for(int y:b) {
			System.out.println(y);
		}
		
		for(int i=0; i<=4; i++) {
			System.out.println(a[i]);
		}

		
		//Two Dimensional arrays
		
		int[][] myArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Access elements in the 2D array
        System.out.println("Accessing Elements:");
        System.out.println("First element (1st row, 1st column): " + myArray[0][0]);
        System.out.println("Last element (3rd row, 3rd column): " + myArray[2][2]);

        // Find the length of the 2D array
        System.out.println("\nFinding Length:");
        System.out.println("Total number of rows: " + myArray.length);
        System.out.println("Number of columns in first row: " + myArray[0].length);
        
        //printing all the elements
        for(int arr[]:myArray) {
        	for(int z:arr) {
        		System.out.println(z);
        	}
        }
        
        //Accessing heterogenous data
        
        Object mylist[]= {'A',123,"harish",56.7};
        
        for(Object ele:mylist) {
        	System.out.println(ele);
        }
	}

}
