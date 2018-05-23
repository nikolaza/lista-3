import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pocetna {

	public static void main(String[] args) {
		List<String> iminja;
		iminja = new ArrayList<>();
		iminja.add("nikola");
		iminja.add("PPPP");
		iminja.add("mmmmm");
		iminja.add("MMM");
		
		System.out.println(iminja);
		System.out.println(iminja.size());
		List<String> noviIminja = iminja.stream()
		.filter(ime -> ime.length() < 6)
		.map(ime -> ime.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(noviIminja);
	
	}	

}
