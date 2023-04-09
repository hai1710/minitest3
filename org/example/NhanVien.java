package org.example;

public class NhanVien {
    private int EmployeeCode;
    private String Name;
    private String PhoneNumber;
    private String Email;
    private String Address;

    public NhanVien(int employeeCode, String name, String phoneNumber, String email, String address) {
        EmployeeCode = employeeCode;
        Name = name;
        PhoneNumber = phoneNumber;
        Email = email;
        Address = address;
    }

    public NhanVien() {
    }

    public int getEmployeeCode() {
        return EmployeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        EmployeeCode = employeeCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "EmployeeCode=" + EmployeeCode +
                ", Name='" + Name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Email='" + Email + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}