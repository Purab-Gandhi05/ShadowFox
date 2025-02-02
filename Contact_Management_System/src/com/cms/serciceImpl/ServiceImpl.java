package com.cms.serciceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cms.model.Contact;
import com.cms.seviceI.ServiceI;

public class ServiceImpl implements ServiceI 
{
	Contact c=new Contact();
	Scanner sc=new Scanner(System.in);
    List<String> contactNames = new ArrayList<>();
    List<Long> mobileno = new ArrayList<>();

	
	@Override
	public void createContact() 
	{
		System.out.println("Enter Contact Name");
		String name=sc.next();
		while(true) {
		if(contactNames.contains(name)) 
		{
			System.out.println("Re-enter Name(name already exist)");
			name=sc.next();			
		}
		else {
			c.setName(name);
			contactNames.add(name);
			break;
		}
		}
		
		System.out.println("Enter Contact MobileNo.");
		long  Mobileno=sc.nextLong();
		while(true) {
		int count=0;
		long temp=Mobileno;
		while(temp!=0)
		{
			temp=temp/10;
			count++;	
		}
		if(count==10) 
		{
			if(mobileno.contains(Mobileno)) {
				System.out.println("MobileNo. Exist (Re-enter the mobileno. of 10 digits");
				Mobileno=sc.nextInt();
				mobileno.add(Mobileno);
				
				
			}
			else {
			c.setMobileno(Mobileno);
			break;
			}
		}
		else {
			System.out.println("Invalid MobileNo.(Re-enter the mobileno. of 10 digits");
			Mobileno=sc.nextLong();			
		}
		}
		System.out.println("Enter Contact Emailaddr");
		c.setEmailaddr(sc.next());
		System.out.println("Your Contact has been strored Successfully!!!");
		}

	@Override
	public void displayContactDetails() 
	{
		System.out.println("Contact Name=");
		System.out.println(c.getName());
		System.out.println("Contact Number=");
		System.out.println(c.getMobileno());
		System.out.println("Contact EmailAddress=");
		System.out.println(c.getEmailaddr());		
	}

	@Override
	public void updateContact() 
	{
		System.out.println("Enter the name to be updated:");
		String uname=sc.next();
		if(contactNames.contains(uname)) 
		{
			System.out.println("Enter the new MobileNo=");
			long newmobileno=sc.nextLong();
			System.out.println("Enter the new Emailaddress=");
			String newemailaddress=sc.next();
            c.setMobileno(newmobileno);
            c.setEmailaddr(newemailaddress);
            System.out.println("Updated Successfully!!!");
		}
		else {
			System.out.println("Contact not Found");
		}
		
		
	}

	@Override
	public void deleteContact() {

		System.out.println("Enter the name to be deleted:");
		String dname=sc.next();
		if(contactNames.contains(dname)) {
			contactNames.remove(dname);
			System.out.println("Deleted Successfully!!!");
		}
		else {
			System.out.println("Contact Not Found");
		}
	}
	

}
