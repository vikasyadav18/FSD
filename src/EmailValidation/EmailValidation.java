package EmailValidation;
import java.util.*;

class EmailValidation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of email you want to provide us");
       int n=sc.nextInt();
       String arr[] = new String[n];
       sc.nextLine();
        for(int i=0;i<n;i++)
        {
        	 arr[i]=sc.next();
        }
   System.out.println("enter the email id you want to search");
        String search = sc.next();
        int count =0;
                for(int i=0; i<n; i++) 
                {
                	
                    if(search.equals(arr[i])) 
                    {
                        System.out.println("email ID " + search + " Status: found");
                        break;
                        
                    }
                    count++;
                    
                }
                if(count == n)
                {
                    System.out.println("email ID " + search + " Status: Not-found");
                    
                }
                

    }

}