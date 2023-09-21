package Calculator;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";
    public static void main(String args[]){
        boolean isRunning = true; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the calculator");
        System.out.println("'q' - quit, '+' - addition, '-' - subtraction, '*' - multiplication '/' - division");
        while(isRunning){
            try{
                System.out.println("First integer: ");
                double num1 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Operation: ");
                String operation = scanner.nextLine(); 
                System.out.println("Second integer: ");
                double num2 = scanner.nextDouble(); 
                switch(operation){
                    case "q": 
                        isRunning = false; 
                    break; 
                    case "+": 
                        System.out.println("Result: " + (num1 + num2));
                    break; 
                    case "-":
                        System.out.println("Result: " + (num1 - num2));
                    break; 
                    case "/":
                        if(num2 == 0){
                            System.out.println(RED + "ERROR: Cannot divide by zero" + RESET);
                        }else{
                            System.out.println("Result: " + (num1 / num2));
                        }
                    break; 
                    case "*":
                        System.out.println("Result: " + (num1 * num2));
                    break; 
                    default:
                        System.out.println("Invalid command");
                    break;
    
                }
            }catch( Exception e ){
                isRunning = false; 
                break;
            }
        }
    }

}
