import java.util.Scanner;
import java.util.ArrayList;

public class Main {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	boolean running = true;
	ArrayList<Patient> patientList = new ArrayList<>();
	
	while(running) {
		System.out.println("   Hospital Management System    ");
		System.out.println("1- Add Patient ");
		System.out.println("2- View all Patients ");
		System.out.println("3- Exit ");
		System.out.println("Enter your choice: ");
		int choice = scan.nextInt();
	    scan.nextLine(); // to be able to read next if String. do this only if we have int/double and next string.
	    
	    if(choice==1) {
	    	System.out.println("Enter Patient ID: ");
	    	int id = scan.nextInt();
	    	scan.nextLine();
	    	
	    	System.out.println("Enter Patient Name:  ");
	    	String name = scan.nextLine();
	    	
	    	System.out.println("Enter Patient Severity: ");
	    	int sev = scan.nextInt();
	    	
	    	Patient newPatient = new Patient(id, name, sev);
	    	patientList.add(newPatient);
	    	System.out.println("Successfully added: "+ newPatient.toString());
	    }
	    else if(choice==2) {
	    	System.out.println("   Current Patient List:    ");
	    	if(patientList.isEmpty()) {
	    		System.out.println("No Patients available.");
	    	}
	    	else {
	    		for(Patient p: patientList) {
	    			System.out.println(p.toString());
	    		}
	    	}
	    }
	    else if(choice==3){
	    	System.out.println("Closing System...");
	    	running = false;  //or break
	    	 }
	    else {
	    	System.out.println("Invalid choice, please choose again.");
	    }
		
	}
	 scan.close();

	}

}
