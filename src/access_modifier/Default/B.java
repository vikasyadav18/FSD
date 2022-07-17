package access_modifier.Default;

class B
{  
  public static void main(String args[])
  {  
	  A obj = new A();//we are in a same package  
	  obj.msg();//thats why it is accessible.
  }  
}  


