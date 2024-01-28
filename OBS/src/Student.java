
public class Student {
	String name,stuNo;
    int classes;
    Course c1;
    double exam1;
    double exam2;
    double exam3;
    Course c2;
    Course c3;
    double average;
    boolean isPass;
    Student(String name,int classes,String stuNo,Course c1,Course c2,Course c3){
    this.name=name;
    this.classes=classes;
    this.stuNo=stuNo;
    this.c1=c1;
    this.c2=c2;
    this.c3=c3;
    this.average=0.0;
    this.isPass=false;
    this.exam1=exam1;
        this.exam2=exam2;
        this.exam3=exam3;
    

}

    void addBulkExamNote(double exam1,double exam2,double exam3){
        if (exam1>=0&&exam1<=100){
            this.c1.exam=exam1;
        }
        if (exam2>=0&&exam2<=100){
            this.c2.exam=exam2;
        }
        if (exam3>=0&&exam3<=100){
            this.c3.exam=exam3;
        }
    }
    void printNote(){
        System.out.println(c1.name+" Exam Grade :\t"+this.c1.exam);
        System.out.println(c2.name+" Exam Grade:\t"+this.c2.exam);
        System.out.println(c3.name+"Exam Grade:\t"+this.c3.exam);
    }
    void ispass(){
        this.average=(this.c1.exam+this.c2.exam+this.c3.exam)/3.0;
        if (this.average>=50){
            System.out.println("You passed the class!");
        }
        else{
            System.out.println("You failed the class");
        }
        printNote();
    }
}
