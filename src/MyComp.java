import java.util.Comparator;
public class MyComp implements Comparator<Patient> {
	@Override
	public int compare(Patient p1, Patient p2) {
		return Integer.compare(p2.getSeverity(), p1.getSeverity());
	}

}
