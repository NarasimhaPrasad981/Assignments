package Prasad.MethodOverriding;

public class DriveTest {

	public static void main(String[] args) {
		Father father = new Father();
        Son son = new Son();
        father.drive();
        son.drive();
	}

}
