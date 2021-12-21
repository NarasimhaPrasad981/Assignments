package ExamplesOfInterface;

public class ProductBuyer implements Amagon,EKartServices{
	@Override
	public void ProductName() {
		System.out.println("iPhone 13 Pro Max");
	}
	@Override
	public void PaymentMode() {
		System.out.println("Cash on delivery");
	}
	@Override
	public void ProductBooking() {
		System.out.println("Product booking sucessfully");
	}
	@Override
	public void OrderRecieved() {
		System.out.println("Order Recieved through amagon");
	}
	@Override
	public void DelivaryDate() {
		System.out.println("January 5th,2022");
	}
	@Override
	public void ProductDeliver() {
		System.out.println("Product deliver sucessfully");
	}

}
