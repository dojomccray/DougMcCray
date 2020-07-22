public class application {
			
	static person[] contactList = new person[0];
	static java.util.Scanner input1 = new java.util.Scanner(System.in);		
	public static void main(String[] args) {
		
		int choice = getMenuChoice();
			
		while (choice != 0) {
		if (choice == 1) {
		person p = getPerson();
		addNewPerson(p);
		} else if (choice == 2) {
		person p = searchByLastName();
		System.out.println(p);
		} 
		else if (choice == 3) {
		person p = searchByFirstName();
		System.out.println(p);
		}
		else if (choice == 4) {
		person p = searchByFullName();
		System.out.println(p);
		}			
		else if (choice == 5){
		person p = searchByTelephone(); 
		System.out.println(p);
		}	
		else if (choice == 6) {
		person p = searchCityState();
		System.out.println(p);
		}	
		else if (choice == 7) {
			deleteContactByTelephone();
			}
		else if (choice == 8) {
		updateContactTelephone();	
				}
		else if (choice == 9) {
		displayAllRecord();
				}	
							
		choice = getMenuChoice();
		
				
	public static person getPerson() {		
		System.out.println("Please enter first name");			
		String firstName = input1.next();			
		String lastName = input1.next();			
		System.out.println("Please enter city name:");			
		String city = input1.next();			
		System.out.println("Please enter your state");			
		String state = input1.next();			
		System.out.println("Please enter your phone number");			
		String phoneNumber = input1.next();			
					
					
		address address = new address(city, state, phoneNumber);			
		person person = new person(firstName, lastName, address);			
		return person;			
			
	public static int getMenuChoice() {	
					
		System.out.println("");	
		System.out.println("--------------------------------");		
		System.out.println("Menu");			
		System.out.println("1: Add new record");			
		System.out.println("2: Search Last Name");			
		System.out.println("3: Search First Name");		
		System.out.println("4: Search Full Name");			
		System.out.println("5: Search Telephone");			
		System.out.println("6: Search City or State");			
		System.out.println("7: Delete by telephone");			
		System.out.println("8: Update by telephone");			
		System.out.println("9: Display all records");			
		System.out.println("0: Exit");			
					
		int input = input1.nextInt();
	return input;
					
			}
	public static void addNewPerson(person p) {
		person[] newContactList = new person[contactList.length + 1];
		for(int i = 0; i < contactList.length; i++) {
		newContactList[i] = contactList[i];
		}
		newContactList[contactList.length] = p;
			contactList = newContactList;
					
	}
			
	public static person searchByLastName() {
		System.out.println("Enter Last name to be searched");
		String lastName = input1.next();
		person p = null;
		for(int i = 0; i < contactList.length; i++){
			if (contactList[i].lastName.equals(lastName)) {
					p = contactList[i];
			}
		}
		public static person searchByFirstName() {
		System.out.println("Enter first name to be searched");
		String firstName = input1.next();
		for(int i = 0; i < contactList.length; i++){
			if (contactList[i].firstName.equals(firstName)) {
				return contactList[i];
			}
		}
		public static person searchByFullName() {
		System.out.println("Enter full name to be searched");
		String fullName = input1.next();
		for(int i = 0; i < contactList.length; i++){
		if (contactList[i].fullName.equals(fullName)) {
			return contactList[i];
			}			
		}


	public static person personForTelephone(String telephone) {
	for(int i = 0; i < contactList.length; i++){
			if (contactList[i].address.phoneNumber.equals(telephone)) {
				return contactList[i];
			}
	}
		public static person searchCityState() {
		System.out.println("Enter city or state to be searched");
		String searchCityState = input1.next();
		for(int i = 0; i < contactList.length; i++){
			if (contactList[i].address.city.equals(searchCityState)) {
				return contactList[i];					return contactList[i];
			} else if (contactList[i].address.state.equals(searchCityState)) {
			return contactList[i];
			}
		}
		return null;
					
	}
	public static void deleteForTelephone(String deleteContactByTelephone){
		if (personForTelephone(deleteContactByTelephone) == null) {
			return;
		}
					
		person[] newContactList = new person[contactList.length - 1];
		for(int oldListIndex = 0, newListIndex = 0; oldListIndex < contactList.length; oldListIndex++) {
							
			if (contactList[oldListIndex].address.phoneNumber != deleteContactByTelephone) {
				newContactList[newListIndex] = contactList[oldListIndex];
				newListIndex++;
			}
		}
		contactList = newContactList;
	}
	public static void deleteContactByTelephone() {		
		System.out.println("Enter telephone number of contact to be deleted");
	String deleteContactByTelephone = input1.next();
					
	deleteForTelephone(deleteContactByTelephone);
	}
			
			
	public static void updateContactTelephone() {
		System.out.println("Enter telephone number of contact to be deleted");
		String deleteContactByTelephone = input1.next();
		deleteForTelephone(deleteContactByTelephone);
		addNewPerson(getPerson());
					
	}
	public static void displayAllRecord() {
	for(int i = 0; i < contactList.length; i++){
	System.out.println(contactList[i].display());
		}
}
			
			
			
}
} 