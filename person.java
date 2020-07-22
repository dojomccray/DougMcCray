
public class person {
		String firstName;
		String lastName;
		String fullName;
		address address;
		
		public String display() {
			return "Full name: " + fullName + " firstName: " + firstName + " lastName: " + lastName + " address: (" + address.display() +")";
		}
		
		
		public person(String firstName, String lastName, address address) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.fullName = firstName + lastName;
			this.address = address;
		}
		
}