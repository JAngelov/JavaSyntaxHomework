import java.util.Scanner;

public class ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer numberToConvert = console.nextInt();
        System.out.println(Integer.toString(numberToConvert, 7));
    }
}
