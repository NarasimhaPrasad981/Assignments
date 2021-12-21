package InheritanceExample;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Printer printer = new Printer();
        Device device = new Device();
        System.out.println("Printer specifications");
        printer.Brand();
        printer.ConnectivityTechnology();
        printer.Series();
        printer.CompatableDevices();
        printer.SheetSize();
        printer.Colour();
        System.out.println("--------------------");
        System.out.println("Laptop Specifications");
        device.Brand();
        device.Series();
        device.Colour();
	}

}

