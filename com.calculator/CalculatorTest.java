import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

      boolean working = true;  
        do {
            Calculator calculator = new Calculator();
            Scanner input = new Scanner(System.in);
            System.out.print("Number: ");
            int firstNumber = input.nextInt();
            System.out.print("Sign: ");
            String sign = input.next();
            System.out.print("Number: ");
            int secondNumber = input.nextInt();

            switch (sign) {
                case "+":
                    calculator.add(firstNumber, secondNumber);
                    break;

                case "-":
                    calculator.substrack(firstNumber, secondNumber);
                    break;

                case "*":
                    calculator.multiplication(firstNumber, secondNumber);
                    break;

                case "/":
                    calculator.division(firstNumber, secondNumber);
                    break;

            }
            
        } while (working);

    }
}
