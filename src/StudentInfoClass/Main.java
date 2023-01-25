package src.StudentInfoClass;

public class Main {
    public static void main(String[] args) {
    Teacher t1=new Teacher("ufuk hoca","SE","2156751");
    Course Systemprograming=new Course("System Programming","375","SE");
    Teacher t2=new Teacher("Alper hoca","CE","1356314");
    Course ComputingTheory=new Course("computingTheory","308","CE");
    Course SoftwareVerification=new Course("Software Verification and validation","318","SE");
    Student s1=new Student("cem","123","4",Systemprograming,ComputingTheory,SoftwareVerification);
    Teacher t3=new Teacher("kaan hoca","SE","29417854");
    Systemprograming.AddTeacher(t1);
    s1.addbulkexamnote(100,70,90);

    s1.isPass();
    ComputingTheory.AddTeacher(t2);
        System.out.println("");
    ComputingTheory.printTeacher();
        System.out.println("");
        SoftwareVerification.AddTeacher(t3);
        System.out.println("");
    SoftwareVerification.printTeacher();
        System.out.println("");
    Systemprograming.printTeacher();
    }
}
