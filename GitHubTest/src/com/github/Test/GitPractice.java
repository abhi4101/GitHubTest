package com.github.Test;

import java.util.Scanner;

public class GitPractice {

	public static void main(String[] args) {
		System.out.println("Enter the number to check prime number");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int check=prime(n);
	}
	public static int prime(int n){
		boolean flag=true;
		for (int i = 2; i<n; i++) {
			if(n%i==0){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println(n+ " isprime");
		}
		else{
			System.out.println(n + " is not prime ");
		}
		return 1;
	}
}
