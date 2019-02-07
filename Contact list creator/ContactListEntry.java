/**
 * @author Dylan Hesser
 * @version 1.00
 *<p> This program will create a Contact List that includes
 *   a person's name, phone number, and email address
 */   
public class ContactListEntry 
	{
		//variables to get contact information
		private String name; 
		private String emailAddress;
		private String phoneNumber;
		/**
		 * The default constructor
		 */
		public ContactListEntry() 
			{
				name = "Example Name";
				emailAddress = "Something@Something.com";
				phoneNumber = "1111111111";
			}
		/**
		 * The constructor with the parameters for the contact
		 * @param name takes the name of the contact
		 * @param phoneNumber takes the phone number of the contact
		 * @param emailAddress takes the email address of the contact
		 */
		public ContactListEntry(String name,  String phoneNumber, String emailAddress) 
			{
				this.name = name;
				this.phoneNumber = phoneNumber;
				this.emailAddress = emailAddress;
			}
	
		/**
		 *  Gets the name of the contact
		 * @return name of contact
		 */
		public String getName () 
			{
				return name;
			}
		/**
		 *  Gets the phone number of the contact
		 * @return phone number of contact
		 */
		public String getPhoneNumber () 
			{
				return phoneNumber;
			}
		/**
		 *  gets the email address of the contact
		 * @return email address of contact
		 */
		public String getEmailAddress() 
			{
				return emailAddress;
			}
		/**
		 *  sets the name of the contact
		 * @param name name to be used
		 */
		public void setName(String name) 
			{
				this.name = name;
			}
		/**
		 *  sets the phone number of the contact
		 * @param phoneNumber phone number to be used
		 */
		public void setPhoneNumber(String phoneNumber) 
			{
				this.phoneNumber = phoneNumber;
			}
		/**
		 *  sets the email address of the contact
		 * @param emailAddress email address to be used
		 */
		public void setEmailAddress(String emailAddress) 
			{
				this.emailAddress = emailAddress;
			}
		/**
		 *  Returns a nicely formatted string that displays the contact info 
		 * @return returns the string that has been made
		 */
		public String toString1() 
			{
				String str;
				str = "Name: " + name
						+ "\nPhone Number: " + phoneNumber
						+ "\nEmail Address: " + emailAddress + "\n\n";
				return str;
			}
	}



