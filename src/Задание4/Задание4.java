package Задание4;

import java.util.Scanner;

public class Задание4 {
      public static void main(String args[])
	
	{ 
		Scanner in = new Scanner(System.in);
		System.out.print("Number of students: ");
        int n = in.nextInt();
        
        
        System.out.print("Number of apples: ");
        int k = in.nextInt();
        
        System.out.print("Everyone get " + k/n + " apples ");
        
        System.out.println();
        
        System.out.print( k % n + " Apples will suck in the basket");
        
        
       
        
	}
      
}
