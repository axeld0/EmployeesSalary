package model;

public class Test {

public String higherSalary(Employee[] employees)
{
    double higherS = 0;
    String higher = "";
    for (int i = 0 ; i < employees.length ; i++)
    {
        if(employees[i].getTotalSalary() > higherS)
        {
            higher = employees[i].toString();
        }
    }
    return higher;
}


public String toString (Employee[]employees)
{
    String tostring = "";
    for (int i = 0; i < employees.length ; i++)
    {
        tostring += employees[i].toString();
        System.out.println("\n");
    }
    return tostring;
}



}
