package comparable_and_comparator;

import java.util.Comparator;

public class compareDogByBreed implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Dog d1=(Dog)o1;
		
		Dog d2=(Dog)o2;
		
		return d2.breed.compareToIgnoreCase(d1.breed);
	}

}
