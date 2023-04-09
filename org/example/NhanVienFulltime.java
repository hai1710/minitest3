package org.example;

public class NhanVienFulltime extends NhanVien implements getSalary{
    private double salary;
    private double bounty;
    private double Fine;

    public NhanVienFulltime(int employeeCode, String name, String phoneNumber, String email, String address, double salary, double bounty, double fine) {
        super(employeeCode, name, phoneNumber, email, address);
        this.salary = salary;
        this.bounty = bounty;
        this.Fine = fine;
    }

    public NhanVienFulltime(double salary, double bounty, double fine) {
        this.salary = salary;
        this.bounty = bounty;
        this.Fine = fine;
    }
    public NhanVienFulltime(){}

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBounty() {
        return bounty;
    }

    public void setBounty(double bounty) {
        this.bounty = bounty;
    }

    public double getFine() {
        return Fine;
    }

    public void setFine(double fine) {
        Fine = fine;
    }

    @Override
    public String toString() {
        return "NhanVienFulltime{" +
                "Name: " + this.getName() +
                " Employee code: " + this.getEmployeeCode() +
                " Phone number : " + this.getPhoneNumber() +
                " Email : " + this.getEmail() +
                " Address : " + this.getAddress() +
                " Salary=" + salary +
                ", bounty=" + bounty +
                ", Fine=" + Fine +
                '}';
    }

    @Override
    public double realSalary() {
        return this.getSalary() + (this.getBounty() - this.getFine());
    }
}
