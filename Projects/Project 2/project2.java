import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;
  
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

      // addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;

      }
      if (func.equals("sqrt")) x = Math.sqrt(x);
      else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
      else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
      else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
      else throw new RuntimeException("Unknown function: " + func);
  } else {
      throw new RuntimeException("Unexpected: " + (char)ch);
  }
  
  if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
  
  return x;
}
.parse();

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); 
System.out.print("Enter the expression: ");
String str = sc.nextLine(); 
double answer=0.0;
calculate obj = new calculate();        
answer=obj.evaluate(str);
System.out.print("Answer is  " + answer);
}
