package InterfaceTesting;

public class InterfaceTesting {

	public static void main(String[] args) {
           AirBus airBus = new AirBus();
           System.out.println("Details of Bus.....");
           airBus.PriceOfTicket();
           airBus.NameOfBus();
           airBus.NoOfPassengers();
           System.out.println("Details of AirBus.....");
           airBus.NameOfFlight();
           airBus.BoardingTime();
           airBus.Vacencies();
	}

}
