import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNumber = console.nextInt();
        double secondNumber = console.nextDouble();
        double thirdNumber = console.nextDouble();
        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",
                Integer.toHexString(firstNumber).toUpperCase(), String.format("%10s",
                Integer.toBinaryString(firstNumber)).replace(' ', '0'),
                secondNumber,thirdNumber);
    }
}