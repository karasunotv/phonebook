package phonebook;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<person> contactList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int menu = 0;
		do {
		System.out.println("1. Add new entry");
		System.out.println("2. Search by first name: ");
		System.out.println("3. Search by last name: ");
		System.out.println("4. Search by full name: ");
		System.out.println("5. Search telephone: ");
		System.out.println("6. Search city or State: ");
		System.out.println("7. Delete telephone number: ");
		System.out.println("8. Update telephone number: ");
		System.out.println("9. Exit program");
		
		 menu = input.nextInt();
		 
		
		switch(menu)
		{
		case 1:
			Scanner stringInput = new Scanner(System.in);
			System.out.println("Enter person info" );
			String str = stringInput.nextLine();
			String [] personInfo = str.split(",");
			person storePerson = new person();
			
			String[]names = personInfo[0].split(" ");
			storePerson.setFirstName(names[0].trim());
			
			String middleName="";
			
				for(int i =1; i <names.length-1; i++)
				{
					middleName += names[i];
				}
			storePerson.setMiddleName(middleName.trim());
			
		
			storePerson.setLastName(names[names.length-1].trim());
			
			
			
			storePerson.setPersonAddress(new address(personInfo[1].trim(), personInfo[2].trim(), personInfo[3].trim(), personInfo[4].trim()));
			storePerson.setPhoneNumber(personInfo[5].trim());
			
			System.out.println("Person created! \n"+storePerson);
			contactList.add(storePerson);
			break;
		
		case 2:
			Scanner Input = new Scanner(System.in);
			System.out.println("Search First Name: ");
			String fName = Input.next();
				for(int i = 0; i < contactList.size(); i++) {
					if(contactList.get(i).getFirstName().equals(fName))
					{
						System.out.println("Person found : " + contactList.get(i));
						break;
					}
					
				}
					
			break;	
			
		case 3:
			Scanner lastInput = new Scanner(System.in);
			System.out.println("Search Last Name: ");
			String lName =lastInput.next();
				for(int i =0; i <contactList.size(); i++)
				{
					if(contactList.get(i).getLastName().equals(lName)){
						System.out.println("Person Found :  " +  contactList.get(i));
						break;
					}
				}
			
			break;
			
		case 4:
			Scanner fullInput = new Scanner(System.in);
			System.out.println("Search Full Name: ");
			String fullName = fullInput.next();
				for(int i =0; i <contactList.size();i++)
				{
					String fullerName = contactList.get(i).getFirstName() + " " + contactList.get(i).getMiddleName() + " " + contactList.get(i).getLastName();
						if(fullName.equals(fullerName))	;
						System.out.println("Person Found " + contactList.get(i));
						break;
				}
				
			break;
			
		case 5:
			Scanner teleInput = new Scanner(System.in);
			System.out.println("Search number:  ");
			String teleNumber = teleInput.next();
				for(int i = 0; i < contactList.size(); i++)
				{
					if(contactList.get(i).getPhoneNumber().equals(teleNumber))
					{
						System.out.println("Number found: " + contactList.get(i));
						break;
						
					}
					}
				
			break;
			
		case 6:
			Scanner csInput = new Scanner(System.in);
			System.out.println("Search for city or State: ");
			String cityState = csInput.nextLine();
			 	for(int i = 0; i < contactList.size(); i++)
			 	{
			 		if(contactList.get(i).getPersonAddress().getCity().equals(cityState) || (contactList.get(i).getPersonAddress().getState().equals(cityState)))
			 		{
			 			System.out.println("Entry found: " + contactList.get(i) );
			 			break;
			 		}
			 	}
			break;
		case 7:
			Scanner deleteInput = new Scanner(System.in);
			System.out.println("Enter Number: ");
			String deleteTele = deleteInput.next();
				for(int i =0; i < contactList.size(); i++)
				{
					if(contactList.get(i).getPhoneNumber().equals(deleteTele))
					{
						contactList.remove(i);
						break;
					}
				}
			
			break;
			
		case 8:
			Scanner updateInput = new Scanner(System.in);
			System.out.println("Enter Number for Update: ");
			String update = updateInput.next();
			
				for(int i = 0; i < contactList.size(); i++)
				{
					if(contactList.get(i).getPhoneNumber().equals(update)) 
					{
						 update = updateInput.next();
						contactList.get(i).setPhoneNumber(update);
					}
				}
			
			break;
		
		default:
			break;
		}
		
		}while(menu != 8);
		
	}
	

	}
 