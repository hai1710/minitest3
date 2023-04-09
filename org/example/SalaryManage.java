package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class SalaryManage implements Comparator<NhanVien> {
    public double getAverageSalary(ArrayList<NhanVien> arr){
        double FullTime_salary = 0;
        double PartTime_salary = 0;
        double Average_salary = 0;
        for(NhanVien i : arr){
            if(i instanceof NhanVienFulltime){
                FullTime_salary += ((NhanVienFulltime)i).realSalary();
            }else{
                PartTime_salary += ((NhanVienPartTime)i).realSalary();
            }
        }
        Average_salary = (PartTime_salary + FullTime_salary)/arr.size();
        return Average_salary;
    }
    public void UnderAverage_salary(ArrayList<NhanVien> arr){
        double Average_salary = getAverageSalary(arr);
        for(NhanVien i : arr){
            if(i instanceof NhanVienFulltime){
                if(((NhanVienFulltime)i).realSalary() < Average_salary){
                    System.out.println(i);
                }
            }
        }
    }
    public double partTimeSalary(ArrayList<NhanVien> arr){
        double PartTime_salary = 0;
        for(NhanVien i : arr){
            if(i instanceof NhanVienPartTime){
                PartTime_salary += ((NhanVienPartTime)i).realSalary();
            }
        }
        return PartTime_salary;
    }

    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        if(((NhanVienFulltime)o1).realSalary() > ((NhanVienFulltime)o2).realSalary()){
            return 1;
        }else if(((NhanVienFulltime)o1).realSalary() > ((NhanVienFulltime)o2).realSalary()){
            return 0;
        }else{
            return -1;
        }
    }
}
