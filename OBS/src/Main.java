
public class Main {
	 public static void main(String[] args) {
		   Teacher t1=new Teacher("Hasan","05444444444","history" );
		        Course history=new Course("History","101","HST");
		        history.addTeacher(t1);

		        Teacher t2=new Teacher("Ali","05222222222","Physics" );
		        Course physics=new Course("Physics","102","PHS");
		        physics.addTeacher(t2);

		        Teacher t3=new Teacher("Serkan","05333333333","Biology" );
		        Course biology =new Course("Biologi","103","BIO");
		        biology.addTeacher(t3);

		        Student s1=new Student("Ahmet",4,"123",history,physics,biology);
		        s1.addBulkExamNote(10,0,50);
		        s1.ispass();
		        }
}
