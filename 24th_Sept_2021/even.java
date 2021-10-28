import java.util.ArrayList;
import java.util.Scanner;

public class even {
    public static void main(String[] args) {

        ArrayList<Integer> even = new ArrayList<Integer>();

        int[] num = new int[5];
        Scanner read1 = new Scanner(System.in);

        System.out.print("Enter the numbers :");

        for (int i = 0; i < num.length; i++) {
            num[i] = read1.nextInt();

            if (num[i] % 2 == 0) {
                even.add(num[i]);
                System.out.println("Even number is " + even);
            }

        }
    }
}
