package src.Class;

public class Course {
    private String CourseName;
    private String code;

    public Course(String CourseName,String code){
        this.CourseName=CourseName;
        this.code=code;
    }
    public String getCourseName() {
        return CourseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }
    public double calculateavg(Student[] students){
        double avarage=0;
        for(Student student:students){
            avarage+=student.getGrade();;
        }
        return avarage/students.length;
    }
}
