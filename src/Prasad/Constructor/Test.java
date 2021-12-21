package Prasad.Constructor;

public class Test {

	public static void main(String[] args) {
        Student s1 = new Student("prasad");
        Student s2 = new Student("rajesh");
        System.out.println("Number of students"+Student.getCount());
        s1.display();
        s2.display();
	}

}
