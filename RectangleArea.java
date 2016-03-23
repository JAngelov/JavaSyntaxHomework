import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstSide = console.nextInt();
        int secondSide = console.nextInt();
        int area = firstSide * secondSide;
        System.out.println(area);
    }
}
