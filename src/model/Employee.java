package model;

public abstract class Employee {
    private String id;
    private String name;
    private String surname;
    private int yearOfHire;




    public Employee()
    {
        id = "";
        name = "";
        surname = "";
        yearOfHire = 0;
    }


    /**
     * CONSTRUCTOR
     * */
    public Employee(String id, String name, String surname, int yearOfHire) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.yearOfHire = yearOfHire;
    }

    /**
     * GETTERS AND SETTERS
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfHire() {
        return yearOfHire;
    }

    public void setDateOfHire(int dateOfHire) {
        this.yearOfHire = dateOfHire;
    }

    public int getSeniority ()
    {
        return (2023-yearOfHire);
    }
    /**
     * TOSTRING
     */

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfHire=" + yearOfHire +
                '}';
    }

    @Override
    public boolean equals (Object obj)
    {
        boolean ans = false;

        if(obj != null) {
            if (obj instanceof Employee)
            {
                Employee aux = (Employee) obj;
                if(getId().equals(aux.getId()) && getName().equals(aux.getName()))
                {
                    ans = true;
                }
            }
        }
        return ans;
    }

    public abstract double getTotalSalary();
}

