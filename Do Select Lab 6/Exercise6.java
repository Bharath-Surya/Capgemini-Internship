package lab6;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;


public class Exercise6 {
public static List<Integer>  votersList(HashMap<Integer, String> hmap) {
		
		LocalDate curr = LocalDate.now();
		
		List<Integer> l = new ArrayList<Integer>();
		
		for(Map.Entry<Integer, String> i: hmap.entrySet()) {
			LocalDate dob = LocalDate.parse(i.getValue());
			Period age = Period.between(dob, curr);
			if(age.getYears() > 18) {
				l.add(i.getKey());
			}
		}
		return l;
	}
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "1999-01-10");
        map.put(2, "2009-04-09");
        map.put(3, "2002-01-10");
        System.out.println(votersList(map));

	}


}
