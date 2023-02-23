package src.Class;

public class Student {
    private String name;
    private String surname;
    private int id;
    private String address;
    private  int grade;
    public Student(String name,String surname,int id,String adress,int grade){
        this.name=name;
        this.surname=surname;
        this.address=adress;
        this.id=id;
        this.grade=grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGrade() {
        return grade;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGrade(int grade) {
        if(grade>100 || grade<0){
            grade=0;
        }
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }
}
