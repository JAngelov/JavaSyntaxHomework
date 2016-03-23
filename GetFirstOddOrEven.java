import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 112-pc on 20.3.2016 г..
 */
public class GetFirstOddOrEven {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
        String inputStr = scan.nextLine();
        String[] split = inputStr.split(" ", inputStr.length());
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            numbers.add(Integer.parseInt(String.valueOf(split[i])));
        }
        String word = scan.next();
        int countNumber = scan.nextInt();
        String type = scan.next();
        int counter=0;
        if (type.equals("odd")){
            for (int i = 0; i < split.length; i++) {
                 if (numbers.get(i)%2!=0 && counter<countNumber){
                     System.out.printf(numbers.get(i)+" ");
                     counter++;
                 }
            }
        } else if (type.equals("even")){
            for (int i = 0; i < split.length ; i++) {
                if (numbers.get(i)%2==0 && counter<countNumber ){
                    System.out.printf(numbers.get(i)+" ");
                    counter++;
                }
            }
        }



    }
}
