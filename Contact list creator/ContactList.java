/**
 * 
 * @author Dylan Hesser
 *@version 1.00
 *<p> This program will create a contact list using the aid of the 
 * contact list entry program
 */
public class ContactList 
	{
	/**
	 * Default constructor
	 */
		public ContactList() 
			{
			}
		//variables for the contacts array
		int size = 10;
		ContactListEntry[] contacts = new ContactListEntry[size];
		int numOfEntries = 0 ;
		/**
		 * gets called after each contact is created, adds that contact to the list 
		 * @param contact the contact to be added to the list
		 */
		public void addContacts(ContactListEntry contact ) 
			{
				contacts[numOfEntries] =new ContactListEntry( contact.getName(), contact.getPhoneNumber(), contact.getEmailAddress());
				numOfEntries++;
			}
		/**
		 * This toString method will go through a for loop and format the information and print it for the user to easily read
		 */
		public String toString() 
			{
				//Strings to be used in the loop
				int i;
				String contactString = "" ;
				//loops will called the other toString method to help build the string for the user to read
				for ( i = 0; i < numOfEntries; i++) 
					{
						contactString =  contacts[i].toString1();
						System.out.print(contactString);
					}
				return contactString;
			}
	}