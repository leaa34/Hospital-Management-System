import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.InputMismatchException;

public class Main {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	boolean running = true;
	PriorityQueue<Patient> patientQueue = new PriorityQueue<>(new MyComp());
	
	while(running) {
		try {
		System.out.println("   --Hospital Management System--    ");
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
	    	patientQueue.add(newPatient);
	    	System.out.println("Successfully added: "+ newPatient.toString());
	    }
	    	
	    
	    else if(choice==2) {
	    	System.out.println("   --Current Patient List:--    ");
	    	if(patientQueue.isEmpty()) {
	    		System.out.println("No Patients available.");
	    	}
	    	else {
	    		PriorityQueue<Patient>temp = new PriorityQueue<>(patientQueue);
	    		while(!temp.isEmpty()) {
	    			System.out.println(temp.poll());
	    			
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
		catch(InputMismatchException e) {
			System.out.println("ERROR: Please enter numbers only.");
			scan.nextLine();
		}
	 

	}

 
 scan.close(); 
}
}
