package aaa;

import java.util.Scanner;

public class MainClass {
	
	public static int menu(Scanner s)
	{
		int r;
		do {
			System.out.println("1: Enter a number : "
					+ "\n2: Display Maximum : "
					+ "\n3: Display Minimum : "
					+ "\n4: Search specific value : "
					+ "\n5: Display tree : ");
			r=s.nextInt();
		}while( r!=1 && r!=2 && r!=3 && r!=4 && r!=5 );
		return r;
	}
	
public static void main(String [] args)
{
	Scanner obj = new Scanner(System.in);
	BST tr = new BST();
	
	do {
		int ch = menu(obj);
		
		switch(ch)
		{
		case 1:
			tr.Insertion(obj);
			break;
		case 2:
			tr.Expensive(tr.root);
			break;
		case 3:
			tr.Chepest(tr.root);
			break;
		case 4:
			int n;
			System.out.println("Enter a number :");
			n=obj.nextInt();
			tr.Search(tr.root, n);
			break;
		case 5:
			tr.Inorder(tr.root);
			break;
		case 6:
			
			break;
		}
		
	}while(true);
	
}//main
}
