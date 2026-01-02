
public class Patient  {
 private int id;
 private String name;
 private int severity;
 
 public Patient(int id, String name, int severity) {
	 this.id= id;
	 this.name = name;
	 this.severity= severity;
 }
 public int getId() {
	 return id;
 }
 
 public String getName() {
	 return name;
 }
 public int getSeverity() {
	 return severity;
 }
 
 @Override
 public String toString() {
	 return "[Priority " + severity+ "] ID: "+ id+" - Name: "+ name; 
 }
 
 
 
}
