
public class address {
	String phoneNumber;
	String city;
	String state;
	
	public String display() {
		return "city: " + city + " state: " + state + " phone: " + phoneNumber;
	}
	
	public address(String city, String state, String phoneNumber){
		this.city = city;
		this.state = state;
		this.phoneNumber = phoneNumber;
	}
}
