
public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    double exam1;
    double exam2;
    double exam3;
    double exam;
    String prefix;


    public Course(String name,String code,String prefix){
        this.code=code;
        this.name=name;
        this.exam=0.0;
        this.prefix=prefix;
        this.exam=exam;

    }
    void addTeacher(Teacher courseTeacher){
        if(courseTeacher.branch.equals(this.prefix)){
        this.courseTeacher=courseTeacher;
        printTeacherInfo();
    }

    }
    void printTeacherInfo(){
        this.courseTeacher.print();
    }
}
