package com.cms.client;

import java.util.Scanner;

import com.cms.serciceImpl.ServiceImpl;

public class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ServiceImpl s=new ServiceImpl();
		while(true) {
		System.out.println("Enter Your Choice");
		int choice=sc.nextInt();
		if(choice==1) {
			s.createContact();
		}
		else if(choice==2) {
			s.displayContactDetails();
		}
		else if(choice==3) {
			s.updateContact();
		}
		else if(choice==4) {
			s.deleteContact();
		}
		else {
			System.out.println("Invalid Choice");
		}
		
	}
	}
	

}
