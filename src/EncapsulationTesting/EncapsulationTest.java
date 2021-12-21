package EncapsulationTesting;

public class EncapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag bag = new Bag();
		bag.setBrand("American tourister");
		bag.setNoOfPockets(3);
		bag.setQuantity(25);
		bag.setType("Side back bag");
		bag.setPrice(540);
		System.out.println("brand:"+bag.getBrand());
		System.out.println("NoOfPockets:"+bag.getNoOfPockets());
		System.out.println("setQuantity:"+bag.getQuantity());
		System.out.println("setType:"+bag.getType());
		System.out.println("setPrice:"+bag.getPrice());
	}

}
