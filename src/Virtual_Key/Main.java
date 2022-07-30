package Virtual_Key;
import java.util.*;
import java.io.IOException;


public class Main 
{
	public static final String path = "C:\\Users\\VIKAS YADAV\\Desktop\\assesment"; 
	
	static Operation op=new Operation();
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("-------DEVELOPED BY VIKAS YADAV------");
		System.out.println("\n");
		start();
		
	}
	
	
	
	static void start()
	{
	// TODO Auto-generated method stub
		
		while(true)
		{
			System.out.println("------------------------------------");
			System.out.println("            MAIN MENU               ");
			System.out.println("------------------------------------");
			System.out.println("| Select any one of the following: |");
		    System.out.println("| 1 - List All Files               |");
		    System.out.println("| 2 - More Options                 |");
		    System.out.println("| 3 - Exit                         |");
		    System.out.println("------------------------------------");
		    System.out.println("Enter your choice : ");
		    
		    int n=sc.nextInt();
		    switch(n)
		    {
		    	case 1: op.ListAllFiles(Main.path);
		    	start();
		    	break;
		    	
		    	case 2: MoreOption();
		    	start();
		    	break;
		    	
		    	case 3:System.exit(0);
		    
		    }
		    
		    
		}
	}
	
	
	
	
	static void MoreOption()
	{
		while(true)
		{

			System.out.println("=====================================");
			System.out.println("|            SUB MENU               |");
			System.out.println("=====================================");
			System.out.println("| Select any one of the following:  |");
		    System.out.println("|   1 - Add a file                  |");
		    System.out.println("|   2 - Delete a file               |");
		    System.out.println("|   3 - Search a file               |");
		    System.out.println("|   4 - Go Back                     |");
		    System.out.println("=====================================");
		    
		    int choice=sc.nextInt();
		    switch(choice)
		    {
		    case 1:
		    	System.out.println("enter file name");
		    	String fileName=sc.next().trim();
		    	try 
		    	{
					op.CreateFile(Main.path , fileName);
					start();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    break;
		    
		    case 2:
		    	System.out.println("enter file name which you want to delete-");
		    	String name=sc.next().trim();
		    	
		    	try {
					op.deleteFile(Main.path , name);
					start();
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
		    case 3:
		    	System.out.println("enter file name which you want search-");
		    	String search=sc.next().trim();
		    	op.searchfile(Main.path,search);
		    	start();
		    	
		    case 4:return;	
		    	
		    }
		    
		}
		
	}

}
