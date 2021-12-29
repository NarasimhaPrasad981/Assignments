package InheritanceExample;

public class Device extends Printer {
	@Override
	public void Brand() {
		System.out.println("Laptop");
		
	}
	@Override
	public void Series() {
		System.out.println("15-5A");
	}
	@Override
	public void Colour() {
		System.out.println("White");
	}
	
}
