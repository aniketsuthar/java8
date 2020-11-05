import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBException;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if (o1.getAge() > o2.getAge()) {
			return 1;
		}
		if (o1.getAge() < o2.getAge()) {
			return -1;
		}
		if (o1.getAge() == o2.getAge()) {
			return 0;
		}
		return 0;
	}

	public static void foo() throws IOException, FileNotFoundException, JAXBException {

	}

	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		e.setAge(19);
		e1.setAge(50);
		e2.setAge(55);
		e3.setAge(35);
		e4.setAge(60);
		List<Employee> list = new ArrayList<Employee>();
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		System.out.println(list.stream().filter(x -> x.getAge() > 15 && x.getAge() <= 20).collect(Collectors.toList()));
		System.out.println(list.stream().filter(x -> x.getAge() > 20 && x.getAge() <= 30).collect(Collectors.toList()));
		System.out.println(list.stream().filter(x -> x.getAge() > 30).collect(Collectors.toList()));

		
		
		
//		System.out.println(employe);

//		list.stream().filter
//		EmployeeComparator c = new EmployeeComparator();
//		list.sort(c);
//		System.out.println(list);
//		try {
//			foo();
//		} catch (IOException y ) {
//
//		} catch (FileNotFoundException x) {
//			// TODO: handle exception
//		} catch (JAXBException z) {
//
//		}

	}

}
