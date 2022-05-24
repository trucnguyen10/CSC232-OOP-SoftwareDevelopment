////////////////////////////////////////////////////////////////////////////////
// File:            Customer.java
// Authors:         Truc Nguyen
// Course:          CSC 232, Spring 2022
////////////////////////////////////////////////////////////////////////////////
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class WaitingLine{
	private List<Customer> list;
	
	public WaitingLine() {
		this.list = new ArrayList<>();
	}
	
	public boolean isEmpty() {
		return(list.size() == 0);
	}
	public void push(Customer per)
	{
		list.add(per);
		Collections.sort(list);
	}
	public Customer pop()
	{
		return list.remove(0);
	}
	public Customer peek()
	{
		return list.get(0);
	}
	public int numberofCus() {
		return list.size();
	}
}
