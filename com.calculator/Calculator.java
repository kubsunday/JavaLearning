public class Calculator {

    public void add(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        System.out.println(sum);
    }

    public void substrack(int firstNumber, int secondNumber) {
        int sum = firstNumber - secondNumber;
        System.out.println(sum);
    }

    public void division(int firstNumber, int secondNumber) {
        if (secondNumber != 0) {
            int sum = firstNumber / secondNumber;
            System.out.println(sum);
        } else
            System.out.println("Do not divine by 0");
    }

    public void multiplication(int firstNumber, int secondNumber) {
        int sum = firstNumber * secondNumber;
        System.out.println(sum);
    }
}
