/**
 * 
 * @author Dylan Hesser
 * tests the contact list program and contact list entry program
 *
 */
public class ContactListTester {

	
	public static void main(String[] args) {
		
		ContactList contactList = new ContactList();
		
		ContactListEntry contact1  = new ContactListEntry("Billy", "8508883333", "BRRRR@Gmail.com");
		contact1.setName("Billy");
		contact1.setPhoneNumber("8508883333");
		contact1.setEmailAddress("BRRR@Gmail.com");
		contactList.addContacts(contact1);
		
		
		ContactListEntry contact2 = new ContactListEntry("Chase", "8508884444", "ChaseMTG@Gmail.com");
		contact2.setName("Chase");
		contact2.setPhoneNumber("8508884444");
		contact2.setEmailAddress("ChaseMTG@Gmail.com");
		contactList.addContacts(contact2);
		
		
		ContactListEntry contact3 = new ContactListEntry("Trenton", "8508885555", "LittleBro@Gmail.com");
		contact3.setName("Trenton");
		contact3.setPhoneNumber("8508885555");
		contact3.setEmailAddress("LittleBro@Gmail.com");
		contactList.addContacts(contact3);
		
		contactList.toString();
		
		ContactListEntry contact4 = new ContactListEntry("Kevin", "8502224444", "Abstract@Gmail.com");
		contact4.setName("Kevin");
		contact4.setPhoneNumber("8502224444");
		contact4.setEmailAddress("Abstract@Gmail.com");
		contactList.addContacts(contact4);
		
		contactList.toString();
	}
}
