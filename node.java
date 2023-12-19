package aaa;

import java.util.Scanner;

public class node {
	int num;
	node l,r;

	public void input(Scanner s)
	{
		System.out.println("Enter a number : ");
		num= s.nextInt();
	}

	public void display() {
		System.out.println("Number is : "+num);
	}
}
