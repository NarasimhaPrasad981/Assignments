package InheritanceExample;

public class Printer implements Specifications {
	@Override
	public void Brand() {
		System.out.println("Epson");
	}
	@Override
	public void ConnectivityTechnology() {
		System.out.println("WiFi");
	}
	@Override
	public void Series() {
		System.out.println("Lg06h50");
	}
	@Override
	public void CompatableDevices() {
		System.out.println("Pc");
	}
	@Override
	public void SheetSize() {
		System.out.println("21 x 29.7");
	}
	@Override
	public void Colour() {
		System.out.println("Black");
	}

}
