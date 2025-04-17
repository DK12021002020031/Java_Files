package set_collections;

import java.util.Comparator;

public class CompareEmployeeByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {

		return o2.name.compareToIgnoreCase(o1.name);
	}
}
