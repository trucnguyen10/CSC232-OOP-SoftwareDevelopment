////////////////////////////////////////////////////////////////////////////////
// File:            Customer.java
// Authors:         Truc Nguyen
// Course:          CSC 232, Spring 2022
////////////////////////////////////////////////////////////////////////////////
import java.util.List;

public class Customer implements Comparable<Customer>{
	private String name;
	private int time;
	private int age;
	
	public Customer(String name, int age, int time) {
		this.name = name;
		this.time = time;
		this.age = age;
	}
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Customer(int time)
	{
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public int getTime() {
		return time;
	}
	public int getAge() {
		return age;
	}
	public int compareTo (Customer other){
	    if (time < other.time)
		  return -1;
		if (time > other.time)
		  return 1;
		else
		  return 0;
	}
	public String toString() {
		return "Customer { name: " + getName() + ", age: " + getAge() + ", arrival time: " + getTime() + "}" ;
	}
}
