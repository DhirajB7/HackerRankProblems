package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {

	String name;
	int age;

	public Employee(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	

}

public class Zolution {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee("john",23));
		al.add(new Employee("john",43));
		al.add(new Employee("dhiraj",23));
		al.add(new Employee("john",33));
		al.add(new Employee("meenakshi",30));
		al.add(new Employee("abc",3));
		
		
		/*
		 * Collections.sort(al, new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) {
		 * if(o1.name.compareTo(o2.name)==0) { return o1.age - o2.age; }else { return
		 * o1.name.compareTo(o2.name); } }
		 * 
		 * });
		 */
		
		Collections.sort(al,Comparator.comparing(Employee::getName).thenComparing(Employee::getAge));
		
		for(Employee a : al) {
			System.out.println(a.name +" " +a.age);
		}
		
	}

}
