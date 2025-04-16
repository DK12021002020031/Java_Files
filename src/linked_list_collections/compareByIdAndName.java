package linked_list_collections;

import java.util.Comparator;

public class compareByIdAndName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		int idDiff=o1.id-o2.id;
		
		int nameDiff=o1.name.compareToIgnoreCase(o2.name);
		
		if(idDiff==0) {
			
			return nameDiff;
		}
		
		return idDiff;
	}

}
