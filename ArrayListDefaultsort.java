import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListDefaultsort {

	public static void main(String[] args) {
		List<String> ss = new ArrayList<String>();
		ss.add("saroj");
		ss.add("Bapuni");
		ss.add("Jiya");
		ss.add("lubun sahoo");
		ss.add("Mohit sahoo");
		ss.add("kuni sahoo");
		Collections.sort(ss);
		System.out.println(ss);
		
		// customized sorting order using inner class
		/*Collections.sort(ss, new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				return -arg0.compareTo(arg1);
			}
			
		});
		System.out.println(ss);*/
		// customized sorting order using lambda
		Collections.sort(ss, (p1,p2)-> -p1.compareTo(p2));
		System.out.println(ss);
		
	}

}
