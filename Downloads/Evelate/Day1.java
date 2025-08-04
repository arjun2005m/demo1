import java.util.Scanner; 
public class Day1 {

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        double num1, num2, result;
        char operator;

       
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

       
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

       
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
               
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                
                System.out.println("Error! Invalid operator.");
                break;
        }

        
        scanner.close();
    }
}

