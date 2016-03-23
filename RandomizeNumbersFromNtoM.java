import java.util.Random;
import java.util.Scanner;

public class RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int start = console.nextInt();
        int end = console.nextInt();
        int check;

        if (start > end) {
            check = end;
            end = start;
            start = check;
        }

        if (start == end) {
            System.out.println(end);
        }

        for (int i = start - 1; start < end + 1; start++) {
            System.out.println(GetRandom(start, end));
        }
    }
        private static int GetRandom(int start, int end) {
            Random num = new Random();
            return num.nextInt((end-start)+1) + start;
        }
}



