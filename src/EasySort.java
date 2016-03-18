import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EasySort {

	public static void main(String[]args)
	{
		ArrayList<Pair> listy = new ArrayList<Pair>();
		listy.add(new Pair("A", 2));
		listy.add(new Pair("A", 4));
		listy.add(new Pair("B", 3));
		listy.add(new Pair("B", 1));
		listy.add(new Pair("C", 5));

		
		Collections.sort(listy, new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				if(o1.getStringy().compareTo(o2.getStringy())==0)//The two pairs have the same string
				{
					return Integer.compare(o1.getInty(), o2.getInty());
				}
				return o1.getStringy().compareTo(o2.getStringy());
			}
		});
		
		for(Pair p: listy)
		{
			System.out.println("Pair of string: "+p.getStringy()+" and intiger "+p.getInty());
		}
	}
}
