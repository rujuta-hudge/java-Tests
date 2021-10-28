import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        // int fname, phone, height, gender, mstatus;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full Name: ");
        String fname = sc.nextLine();

        System.out.println("Enter phone: ");
        String phone = sc.nextLine();

        System.out.println("Enter height: ");
        String height = sc.nextLine();

        System.out.println("Enter gender: ");
        String gender = sc.nextLine();

        System.out.println("Enter marital status: ");
        String mstatus = sc.nextLine();

        HashMap<String, Object> p1 = new HashMap<>();
        p1.put("Fullname", fname);
        p1.put("Phone", phone);
        p1.put("height", height);
        p1.put("gender", gender);
        p1.put("marital status", mstatus);

        System.out.println(p1.put("Fullname", fname));
        System.out.println(p1.put("Phone", phone));
        System.out.println(p1.put("height", height));
        System.out.println(p1.put("gender", mstatus));
        System.out.println(p1.put("marital status", mstatus));
    }
}
