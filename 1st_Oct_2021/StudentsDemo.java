import java.util.ArrayList;
import java.util.Scanner;

public class StudentsDemo {
    public static void main(String[] args) {
        System.out.println("Hello");

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> s1 = new ArrayList<>();

        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Name of student: ");
            String name = sc.nextLine();
            sc.nextLine();

            System.out.println("Enter the phone number: ");
            int phone = sc.nextInt();

            System.out.println("Enter the Age : ");
            int age = sc.nextInt();
            Student sd = new Student(name, phone, age);
            s1.add(sd);

            for (i = 0; i < n; i++) {
                System.out.println(s1.get(i).toString());
            }
        }
    }

}

class Student {
    private String name;
    private int phone;
    private int age;

    public Student(String Name, int Phone, int Age) {
        super();
        this.name = Name;
        this.phone = Phone;
        this.age = Age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name is : " + this.name + " | Phone is:  " + this.phone + " | age is:  " + this.age;
    }

    // public int printAge(int age) {

    // if (age >= 18) {
    // return this.age;

    // }

}