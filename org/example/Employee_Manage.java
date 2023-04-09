package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee_Manage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> ManageList = new ArrayList<NhanVien>();
        while(true){
            System.out.println("Choose:  \n1.Add \n2.Display \n3.AverageSalary \n4.UnderAverage_salary \n5.PartTimeSalary \n0.Exit");
            int n = sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("Choose: \n1.FullTime \n2.PartTime");
                    int choice = sc.nextInt();
                    if(choice == 1){
                        addFullTime(ManageList);
                    }else{
                        addPartTime(ManageList);
                    }
                    break;
                case 2:
                    for(NhanVien i : ManageList){
                        System.out.println(i);
                    }
                    break;
                case 3:
                    SalaryManage slr = new SalaryManage();
                    System.out.println(slr.getAverageSalary(ManageList));
                    break;
                case 4:
                    SalaryManage under = new SalaryManage();
                    under.UnderAverage_salary(ManageList);
                    break;
                case 5:
                    SalaryManage PartTime_Salary = new SalaryManage();
                    System.out.println(PartTime_Salary.partTimeSalary(ManageList));
                    break;
                case 0:
                    System.exit(1);
            }
        }
    }
    public static void addFullTime(ArrayList<NhanVien> arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee code: ");
        int EmC = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter Phone number: ");
        String Phone = sc.nextLine();
        System.out.println("Enter Email: ");
        String email = sc.nextLine();
        System.out.println("Enter Address: ");
        String address = sc.nextLine();
        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.println("Enter Bounty: ");
        double bounty = sc.nextDouble();
        System.out.println("Enter Fine: ");
        double fine = sc.nextDouble();
        NhanVienFulltime s1 = new NhanVienFulltime(EmC,name,Phone,email,address, salary,bounty,fine);
        arr.add(s1);
    }
    public static void addPartTime(ArrayList<NhanVien> ar){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee code: ");
        int EmC = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter Phone number: ");
        String Phone = sc.nextLine();
        System.out.println("Enter Email: ");
        String email = sc.nextLine();
        System.out.println("Enter Address: ");
        String address = sc.nextLine();
        System.out.println("Enter Time Working: ");
        double time = sc.nextDouble();
        NhanVienPartTime s1 = new NhanVienPartTime(EmC,name,Phone,email,address,time);
        ar.add(s1);
    }
}
