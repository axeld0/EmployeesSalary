package model;

public class FixedSalaryEmployee extends Employee{
    private float basicSalary;


    public FixedSalaryEmployee() {
        this.basicSalary = 0;

    }

    public FixedSalaryEmployee(String id, String name, String surname, int yearOfHire, float basicSalary) {
        super(id, name, surname, yearOfHire);
        this.basicSalary = basicSalary;

    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getIncreasePercentage() {

        double increasePercentage = 0;

        if(getSeniority() > 2)
        {
            increasePercentage = 0;

        } else if (getSeniority()>=2 && getSeniority()<4)  {
            increasePercentage = (double) 1.05;
        }
        else if (getSeniority()>=4 && getSeniority()<8){
            increasePercentage = (double) 1.10;
        }
        else if (getSeniority()>=8 && getSeniority()<15){
            increasePercentage = (double)1.15;
        }
        else if (getSeniority()>=15){
            increasePercentage = (double) 1.20;
        }

        return increasePercentage;
    }



    @Override
    public String toString() {
        return  super.toString() +
                "FixedSalaryEmployee{" +
                "basicSalary=" + basicSalary +
                ", increasePercentage=" + getIncreasePercentage() +
                "totalSalary =" + getTotalSalary()+"}\n";
    }

    @Override
    public double getTotalSalary ()
    {
        return (double)basicSalary * getIncreasePercentage();
    }
}
