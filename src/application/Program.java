package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department dep = new Department(1, "book");
		
		Seller sel  = new Seller(21, "bob", "bob@gmail.com", new Date(), 3000.0, dep);
		
		System.out.println(sel);
	}

}
