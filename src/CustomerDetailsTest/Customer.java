package CustomerDetailsTest;

public class Customer {
	String Name;
	int CustomerId;
	int Age;
	String Gender;
	String Country;
	String City;
	public Customer(String Name,int CustomerId,int Age,String Gender,String Country,String City){
		this.Name=Name;
		this.CustomerId=CustomerId;
		this.Age=Age;
		this.Gender=Gender;
		this.Country=Country;
		this.City=City;
	}
	public void CustomerDetails1() {
		System.out.println(Name+" "+CustomerId+" "+Age+" "+Gender+" "+Country+" "+City);
		
	}
	public void CustomerDetails2() {
		System.out.println(Name+" "+CustomerId+" "+Age+" "+Gender+" "+Country+" "+City);
	}
	public void CustomerDetails3() {
		System.out.println(Name+" "+CustomerId+" "+Age+" "+Gender+" "+Country+" "+City);
	}	
	public void CustomerDetails4() {
		System.out.println(Name+" "+CustomerId+" "+Age+" "+Gender+" "+Country+" "+City);
	}
	public void CustomerDetails5() {
		System.out.println(Name+" "+CustomerId+" "+Age+" "+Gender+" "+Country+" "+City);
	}	

}
