package src.SalaryCalculator;
public class Employee {
    String name;
    int salary;
    int workhours;
    int hireyear;
    int newsalary;
    int date=2021;
    Employee(String name,int salary,int workhours,int hireyear){
        this.hireyear=hireyear;
        this.name=name;
        this.salary=salary;
        this.workhours=workhours;
    }
    public void tostring(){
        System.out.println("Adı :  "+ this.name +" \nMaaşı : "+ this.salary +" \nÇalışma saati : "
                + this.workhours +
                " \nBaşlangıç yılı : "
                + this.hireyear+"\nvergi : "+ tax()+"\nbonus : " + bonus()+ "\nmaaş artışı " + raiseSalary()
        + " \ntoplam maaş : "+ (this.salary + raiseSalary()+bonus()-tax()));

    }
    public int tax(){
        if(this.salary<1000){
            return this.salary=salary;
        }else{
            return newsalary=(this.salary*3)/100;
        }
    }
    public int raiseSalary(){
        if(date-this.hireyear<=10){
        return this.salary*5/100;
        }else if(date-this.hireyear<=20 && date-this.hireyear>=9){
            return this.salary*10/100;
        }else if(date-this.hireyear>=19){
            return this.salary*15/100;
        }
      return 0;
    }
    public int bonus(){
        int counter=1;
            if(this.workhours>=40){
                return (this.workhours-40)*30;
            }
            else return 0;

    }

}
