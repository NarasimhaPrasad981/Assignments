package InterfaceTesting;

public class AirBus implements Bus,Plane{
	@Override
	public void PriceOfTicket() {
		System.out.println("Price of ticket is 100");
	}
	@Override
	public void NameOfBus() {
		System.out.println("APSRTC");
	}
	@Override
	public void NoOfPassengers() {
		System.out.println("There were about 100 passengers");
	}
	@Override
	public void NameOfFlight() {
		System.out.println("Indigo");
	}
	@Override
	public void BoardingTime() {
		System.out.println("10:30 A.M");
	}
	@Override
	public void Vacencies() {
		System.out.println("There were 20 sheets blank on the plane");
	}

}
