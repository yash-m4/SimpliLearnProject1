package com.VirtualKeyForYourRepositories;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;



class Setup
{
	public void initiate()
	{
		String path="D:\\SimplilearnProject1\\Project\\";
		File file=new File(path);
		file.mkdirs();
	
	boolean first=true;
	while(first==true)
	{
		System.out.println("                             ");
	System.out.println("     Please Enter Option Number");
	System.out.println("                                           ");
	System.out.println("  ( 1 )  View current file names in ascending order");
	System.out.println("  -----------------------------------------------------");
	System.out.println("  ( 2 )  Browse Other Functions ");
	System.out.println("  -----------------------------------------------------");
	System.out.println("  ( 3 )  Exit Application ");
	
	
	Scanner scan=new Scanner(System.in);
	int choice = scan.nextInt();
	
	
	 
	switch(choice)
	{
	case 1: 
		System.out.println("                             ");
		System.out.println("  Option 1 Selected");
		System.out.println("                             ");
		
		try
		{
			String[] arr=file.list();
			System.out.println("                             ");
			System.out.println("  Availiable files in Ascending order -");
			System.out.println("  ---------------------------------------");
			System.out.println(arr[0]);
			for(int i=1;i<=arr.length-1;i++)
			{
		System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("                             ");
			System.out.println("  There is no file present at the moment, Please add some files first");
		}
		
		
		break ;			
		
	case 2:
		
		boolean second=true;
		while(second==true)
		{
			System.out.println("                             ");
	System.out.println("  Option 2 Selected");
	System.out.println("                             ");
	System.out.println("  Please Enter Option Number for the following-");
	System.out.println("                                           ");
	System.out.println("  ( 1 )  Add a file to the directory");
	System.out.println("  ---------------------------------------------------");
	System.out.println("  ( 2 )  Delete a file From the directory");
	System.out.println("  ---------------------------------------------------");
	System.out.println("  ( 3 )  Search a file From the directory");
	System.out.println("  ---------------------------------------------------");
	System.out.println("  ( 4 )  Return to previous menu");
	
	int choice2=scan.nextInt();
	
	
	

	
	switch(choice2)
	{
	case 1:
		System.out.println("                             ");
		System.out.println("  Option 1 Selected");
		System.out.println("                      ");
		System.out.println("  Please enter file name to add");
		String Sadd=scan.next();
		
		try {
			File file1=new File(path+Sadd);
			if(file1.createNewFile()==true)
			{
				System.out.println("                             ");
				System.out.println("  File "+file1.getName()+" is created ");
				System.out.println("                                 ");
			}
			else
			{
				System.out.println("                             ");
				System.out.println("  file "+Sadd+" already exists");
				System.out.println("                                 ");
			}
		}
		catch (IOException e)
		{
			System.out.println("                             ");
			System.out.println("  an has error occured");
			e.printStackTrace();
		}
		
		break ;
	case 2:
		System.out.println("                             ");
		System.out.println("  Option 2 Selected");
		System.out.println("                      ");
		System.out.println("  Please enter file name to delete");
		String Sdelete=scan.next();
		File file2=new File(path+Sdelete);
		if(file2.delete()==true)
		{
			System.out.println("                             ");
			System.out.println("  File "+file2.getName()+" is Deleted");
			System.out.println("                                 ");
		}
		else
		{
			System.out.println("                             ");
			System.out.println("  file not found");
			System.out.println("                                 ");
		}
		
		break;
	case 3:
		System.out.println("                             ");
		System.out.println("  Option 3 Selected");
		System.out.println("                      ");
		System.out.println("  Please enter file name to Search");
		String Ssearch=scan.next();
		
		File file3=new File(path+Ssearch);
		if(file3.exists()==true)
		{
			System.out.println("                             ");
			System.out.println("  File exists at location - "+file3.getPath());
		}
		else
		{
			System.out.println("                             ");
			System.out.println("  No such File named as " +Ssearch+ " exists");
		}
		
		break;
	case 4:
		System.out.println("                             ");
		System.out.println("  Option 4 Selected");
		System.out.println("                      ");
		second=false;
		break ;
		
		
	 default:
		 System.out.println("                                                        ");
			System.out.println("                     Invalid Imput");
	        System.out.println("  Please enter integer value between 1 & 4 and try again");	
            break;

	}
		}
	break ;
		
	case 3:
		System.out.println("                             ");
		System.out.println("           Option 3 Selected");
		System.out.println("                                           ");
		System.out.println("  Thank you for visiting LockedMe.com");
	    System.out.println("  ----------------------------------------");
		System.out.println("        Application Terminated");
		System.exit(0);
	
	
	default:
		System.out.println("                                                        ");
		System.out.println("                     Invalid Imput");
        System.out.println("  Please enter integer value between 1 & 3 and try again");			
	
	}
		}
	}
}


public class App {

	public static void main(String[] args) {
		
		
		Setup sp=new Setup();
		System.out.println("             Welcome To");
		System.out.println("            LockedMe.com");
		System.out.println("  -------------------------------------");
		System.out.println("  Virtual Key for Your Repositories");
		System.out.println("                                                       Developed by -");
		System.out.println("                                                       Yash Mishra ");
		System.out.println("                                                   ");
		
		try
		{
			sp.initiate();
		}
		catch (Exception e)
		{
			try
			{
				System.out.println("                                                        ");
				System.out.println("  Invalid input, please enter option Number only");
				System.out.println("          (Enter Integer Value Only)");
				sp.initiate();
			}
			catch(Exception e1)
			{
				try
				{
					System.out.println("                                                        ");
					System.out.println("  Again Invalid Input, This is the last chance, please enter option number only");
					System.out.println("             , or program may get automatically terminated");
					System.out.println("                       (Enter Integer Value Only)");
					sp.initiate();
				}
				catch (InputMismatchException e3)
				{
					System.out.println("                                                        ");
					System.out.println("        Repeated Invalid Imputs");
					System.out.println("  ----------------------------------------");
					System.out.println("        Application Terminated");
				}
				catch (Exception e4)
				{
					System.out.println("   some error has occured");
					System.out.println("  ----------------------------------------");
					System.out.println("        Application Terminated");
				}
				}
			}
		}
		
		
	}

