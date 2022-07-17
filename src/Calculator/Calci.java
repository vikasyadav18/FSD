package Calculator;
import java.util.Scanner;
public class Calci {
	static char operator;
    static Double n1, n2, output;
    static Scanner input = new Scanner(System.in);
	
	static void Ask()
	{
		    System.out.println("Enter your first number");
		    n1 = input.nextDouble();

		    System.out.println("Enter your second number");
		    n2 = input.nextDouble();

		    System.out.println("what you want these number : +, -, *, or /");
		    operator = input.next().charAt(0);

	}
	
  public static void main(String[] args) 
  {
	  Ask();
   while(true)
   {
    switch (operator) 
    {

      // performs addition between numbers
      case '+':
        output = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + output);
        break;

      // performs subtraction between numbers
      case '-':
        output = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + output);
        break;

      // performs multiplication between numbers
      case '*':
        output = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + output);
        break;

      // performs division between numbers
      case '/':
        output = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + output);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }
    Ask();
   }
  }
}