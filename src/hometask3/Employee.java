package hometask3;

/**
 * Created by Admin on 09.08.2016.
 */
public class Employee {
    String name;
    String surname;
    double salary;
    double balance;
    String sex;
    String department;

    public Employee(String name, String surname, double salary, double balance, String sex, String department) {

        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.balance = balance;
        this.sex = sex;
        this.department = department;

    }

    public void setEmployee(String name, String surname, double salary, double balance, String sex, String department) {

        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.balance = balance;
        this.sex = sex;
        this.department = department;

    }

    public double getSalary (){
        return salary;
    }

}
