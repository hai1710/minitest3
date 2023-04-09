package org.example;

public class NhanVienPartTime extends NhanVien implements getSalary{
    private Double WorkTime;

    public NhanVienPartTime(int employeeCode, String name, String phoneNumber, String email, String address, double workTime) {
        super(employeeCode, name, phoneNumber, email, address);
        WorkTime = workTime;
    }

    public NhanVienPartTime(double workTime) {
        WorkTime = workTime;
    }

    public double getWorkTime() {
        return WorkTime;
    }

    public void setWorkTime(double workTime) {
        WorkTime = workTime;
    }

    @Override
    public String toString() {
        return "NhanVienPartTime{" +
                "Name: " + this.getName() +
                " Employee code: " + this.getEmployeeCode() +
                " Phone number : " + this.getPhoneNumber() +
                " Email : " + this.getEmail() +
                " Address : " + this.getAddress() +
                " WorkTime=" + WorkTime +
                '}';
    }

    @Override
    public double realSalary() {

        Double t = this.getWorkTime() * 100;
        return t;
    }
}
