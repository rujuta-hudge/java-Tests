import java.util.ArrayList;
import java.util.HashMap;

public class EncapsulationDemo {
    public static void main(String[] args) {

        // Employee e1 = new Employee();
        ArrayList<Employee> emp = new ArrayList<>();

        emp.add(new Employee("Rujuta", "Bangalore"));
        System.out.println(emp.get(0).getEmpData());

    }
}

class Employee {
    private String ename, eaddress;

    public Employee(String empname, String empaddr) {
        this.ename = empname;
        this.eaddress = empaddr;
    }

    public String getName() {
        return ename;
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }

    public void setName(String name) {
        this.ename = name;
    }

    public HashMap<String, Object> getEmpData() {
        HashMap<String, Object> EmpData = new HashMap<>();
        EmpData.put("name is: ", this.ename);
        EmpData.put("Address is: ", this.eaddress);
        return EmpData;

    }

    public String toString() {
        return "Name is : " + this.ename + "\n" + "Address is : " + this.eaddress + "\n";

    }

}
