package aaa;

import java.util.Scanner;

public class BST {
	node root;
	public void Insertion(Scanner s)
	{
		node b = new node();
		b.input(s);
		if(root==null)
		{
			root=b;
		}
		else
		{
			node t = root;
			while(true)
			{
				if(b.num>t.num)
				{
					if(t.r==null)
					{
						t.r=b;
						break;
					}
					else
						t=t.r;
				}
				else
				{
					if(t.l==null)
					{
						t.l=b;
						break;
					}
					else
					{
						t=t.l;
					}
				}
			}
		}
	}
	

public void Chepest(node b)
{
	if(b==null)
	{
		System.out.println("Empty tree ::");
		return;
	}
	else if(b.l==null)
	{
		b.display();
		return;
	}
	else {
		Chepest(b.l);
	}
}
public void Expensive(node b)
{
	if(b==null)
	{
		System.out.println("Empty tree ::");
		return;
	}
	else if(b.r==null)
	{
		b.display();
		return;
	}
	else {
		Expensive(b.r);
	}
}

public void Inorder(node b)
{
	if(b==null)
	{
		return;
	}
	else {
		Inorder(b.l);
		b.display();
		Inorder(b.r);
	}
}
	
public void Search(node b,int n)
{
	if(b==null)
	{
		System.out.println("Not found!");
	}
	else if(b.num==n)
	{
		b.display();
	}
	else if(b.num>n)
	{
		Search(b.l,n);
	}
	else if(b.num<n)
	{
		Search(b.r,n);
	}
}

}
