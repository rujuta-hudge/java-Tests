
public class MultiLevelDemo {
    public static void main(String arg[]) {
        Manager m = new Manager();

        m.nationality();

        m.company();

        m.subordinates();

        m.place();

    }

}

class Person {

    Person() {

        System.out.println("default constructor");

    }

    public void nationality() {

        System.out.println("Indian");

    }

    public void location()

    {

        System.out.println("Bngalore");

    }

}

class Emp extends Person

{

    Emp()

    {

        System.out.println("Emp default cons");

    }

    public void company()

    {

        System.out.println("Google");

    }

    public void place()

    {

        System.out.println("New York");

    }

}

class Manager extends Emp

{
    Manager()

    {

        System.out.println("Manager default cons");

    }

    public void subordinates()

    {

        System.out.println(12);

    }

    public void place()

    {

        System.out.println("pune");

    }

}
