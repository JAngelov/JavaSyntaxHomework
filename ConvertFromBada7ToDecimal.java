import java.util.Scanner;

public class ConvertFromBada7ToDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String numberToConvert = console.next();
        Integer decimalRepresentation = Integer.valueOf(numberToConvert, 7);
        System.out.println(decimalRepresentation);
    }
}
