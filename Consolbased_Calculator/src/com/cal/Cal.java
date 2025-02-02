package com.cal;
import java.util.*;
public class Cal 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		
		while(true) 
		{
			System.out.println("---------------------------------------");
			System.out.println("--------Select an Operation-------");
			System.out.println("1.Addition Operation");
			System.out.println("2.Substraction Operation");
			System.out.println("3.Multipication Operation");
			System.out.println("4.Division Operation");
			System.out.println("5.Square Root of No.");
			System.out.println("6.Exponential of No.");
			System.out.println("7.Temperature Conversion");
			System.out.println("8.Currency Conversion");
			System.out.println("9.Exit");
			int choice=sc.nextInt();
			
			double num1,num2,result;
			switch (choice) {
			case 1: {
				System.out.println("Enter the First no.");
				num1=sc.nextDouble();
				System.out.println("Enter the Second no.");
				num2=sc.nextDouble();
				result=num1+num2;
				System.out.println("Result="+result);
				
				break;
			}
			case 2:{
				System.out.println("Enter the First no.");
				num1=sc.nextDouble();
				System.out.println("Enter the Second no.");
				num2=sc.nextDouble();
				result=num1-num2;
				System.out.println("Result="+result);
				
				break;
				
			}
			case 3:
			{
				System.out.println("Enter the First no.");
				num1=sc.nextDouble();
				System.out.println("Enter the Second no.");
				num2=sc.nextDouble();
				result=num1*num2;
				System.out.println("Result="+result);
				
				break;
			}
			case 4:
				System.out.println("Enter the First no.");
				num1=sc.nextDouble();
				System.out.println("Enter the Second no.");
				num2=sc.nextDouble();
				if(num2!=0) {
					result=num1/num2;
					System.out.println("Result="+result);	     	
			        }
				else{
					System.out.println("Invalid no.");
				}
				break;
			case 5:
			{
				System.out.println("Enter the number ");
				num1=sc.nextDouble();
				result=Math.sqrt(num1);
				System.out.println("Result="+result);
				break;
			}
			case 6:
			{
				System.out.println("Enter the First no.");
				num1=sc.nextDouble();
				System.out.println("Enter the Second no.");
				num2=sc.nextDouble();
				result=Math.pow(num1,num2);
				System.out.println("Result="+result);
				break;
			}
			case 7:
			{
				System.out.println("Enter the temperature in Celsius");
				num1=sc.nextDouble();
			    result=(num1*9/5)+32;
			    System.out.println("Temperature in Fahrenhiet="+result);
			    break;
			}
			case 8:
			{
				System.out.println("Enter the amount in USD");
				num1=sc.nextDouble();
				result=num1*85.72;
				System.out.println("INR="+result);
			}
			
	
			default:
				System.out.println("Incorrect Choice");
				
			}
		}
	}

}
