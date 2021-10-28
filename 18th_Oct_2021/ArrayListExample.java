import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the list of numbers:");
            int val = sc.nextInt();
            nums.add(val);
        }

        System.out.println("Elements of arraylist are:  ");
        for (int j = 0; j < nums.size(); j++) {
            System.out.println(nums.get(j));
        }

        // ................................Filter odd numbers.................
        // List<Integer> odds = nums.stream().filter(num -> num % 2 ==
        // 1).collect(Collectors.toList());
        // for (Integer num : nums) {
        // System.out.println("the odd numbers are: " + odds);
        // }

        // ......................Cubes of numbers.................................
        List<Integer> cubes = nums.stream().map(num -> num * num * num).collect(Collectors.toList());
        for (Integer num : nums) {
            System.out.println("the cubes are: " + cubes);
        }
    }

}
