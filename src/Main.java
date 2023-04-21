import model.CommissionSalaryEmployee;
import model.Employee;
import model.FixedSalaryEmployee;
import model.Test;

public class Main {
    public static void main(String[] args){

        Employee[] employees = new Employee[4];

        Employee e1 = new FixedSalaryEmployee("569587A", "Javier", "Gomez", 2008, 1225);
        Employee e2 = new CommissionSalaryEmployee("695235B", "Eva", "Nieto", 2010, 750, 179, 8.10);
        Employee e3 = new CommissionSalaryEmployee("741258C", "Jose", "Ruiz", 2012, 750, 81, 7.90);
        Employee e4 = new FixedSalaryEmployee("896325D", "Maria", "Nunez", 2013, 1155);

        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;
        employees[3] = e4;

        Test test = new Test();
        System.out.println(test.higherSalary(employees));
        System.out.println(test.toString(employees));

    }
}