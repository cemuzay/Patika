package src.SalaryCalculator;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("cem",20000,45,2023);
        Employee employee1=new Employee("ahmet",15000,48,1990);
        employee.tostring();
        System.out.println("-------------");
        employee1.tostring();
    }
}
