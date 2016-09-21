package HometaskFirm;

import java.util.ArrayList;

/**
 * Created by Admin on 21.08.2016.
 */
public class Firm {
    String name;
    String adress;
    double account;
    ArrayList<Employee> listEmployees;

    Firm(String name, String adress, double account) {
        this.name = name;
        this.adress = adress;
        this.account = account;
        this.listEmployees = new ArrayList<Employee>();
    }

    public boolean addEmployee(Employee employee) {

        for(Employee e : listEmployees){
            if(e.name.equals(employee.name) && e.surname.equals(employee.surname)){
                return false;
            }
        }
        this.listEmployees.add(employee);
        return true;
    }

    public boolean fireEmployee(String name, String surname) {
        for (int i = 0; i < listEmployees.size(); i++) {
            if (listEmployees.get(i).name.equals(name) && listEmployees.get(i).surname.equals(surname)) {
                listEmployees.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Employee> getAllEmployees() {
        return new ArrayList<Employee>(listEmployees);
    }

    public ArrayList<Employee> getAllEmployeesOrderedBySalary() {
        Employee tmpMaxSalary;

        ArrayList<Employee> listEmployees = getAllEmployees();

        for (int i = 0; i < listEmployees.size(); i++) {

            for (int j = 0; j < listEmployees.size() - 1; j++) {

                if (listEmployees.get(j).salary > listEmployees.get(j + 1).salary) {

                    tmpMaxSalary = listEmployees.get(j);
                    listEmployees.set(j, listEmployees.get(j + 1));
                    listEmployees.set(j + 1, tmpMaxSalary);

                }
            }
        }
        return listEmployees;
    }

    public void giveSalaryForAll() {

        for(Employee e : listEmployees){
            if (this.account > e.salary) {
                this.account -= e.salary;
                e.balance += e.salary;
            } else {
                e.balance += this.account;
                this.account = 0;
                return;
            }
        }
//        System.out.println("Выплачено зарплату. Остаток на счету фирмы " + this.account);
    }

    public void printListEmployees() {
        for (int i = 0; i < listEmployees.size(); i++) {
            System.out.printf(
                    "Employee "
                            + "Name: %-10s Surname: %-10s Salary: %-8.2f Balance: %-8.2f Sex: %-6s Department: %-10s\n",
                    listEmployees.get(i).name, listEmployees.get(i).surname, listEmployees.get(i).salary,
                    listEmployees.get(i).balance, listEmployees.get(i).sex, listEmployees.get(i).department);

        }
        System.out.println("==========================================================");
    }
}
