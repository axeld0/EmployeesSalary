package model;

public class CommissionSalaryEmployee extends Employee{
    private float minimumSalary;
    private int clients;
    private double commissionPerClient;


    public CommissionSalaryEmployee() {
        this.minimumSalary = 0;
        this.clients =0;
        this.commissionPerClient = 0;
    }

    public CommissionSalaryEmployee(String id, String name, String surname, int yearOfHire, float minimumSalary, int clients, double commissionPerClient) {
        super(id, name, surname, yearOfHire);
        this.minimumSalary = minimumSalary;
        this.clients = clients;
        this.commissionPerClient = commissionPerClient;
    }

    /**
     * getters and setters
     */

    public float getMinimumSalary() {
        return minimumSalary;
    }

    public void setMinimumSalary(float minimumSalary) {
        this.minimumSalary = minimumSalary;
    }

    public int getClients() {
        return clients;
    }

    public void setClients(int clients) {
        this.clients = clients;
    }

    public double getCommissionPerClient() {
        return commissionPerClient;
    }

    public void setCommissionPerClient(double commissionPerClient) {
        this.commissionPerClient = commissionPerClient;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "CommissionSalaryEmployee{" +
                "minimumSalary=" + minimumSalary +
                ", clients=" + clients +
                ", commissionPerClient=" + commissionPerClient +
                "totalSalary =" + getTotalSalary()+"}\n";
    }


    @Override
    public double getTotalSalary() {
        return 750* getCommissionPerClient();
    }
}
