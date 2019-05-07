package ui;

import model.DoubleLinkedCircularCourse;

public class Main {
	public static void main(String[] args) {
		DoubleLinkedCircularCourse dlc = new DoubleLinkedCircularCourse();
		dlc.addStudent("Andres Aristizabal", "9012", 4.2);
		dlc.addStudent("Juan Reyes", "1234", 2.9);
		dlc.addStudent("Victor Vargas", "5678", 3.1);
		dlc.addStudent("Liliana Franco", "3456", 3.6);
		dlc.addStudent("Cristian Sanchez", "7812", 2.5);
		
		System.out.println("=== ORIGINAL LIST ===");
		System.out.println(dlc);
				
		dlc.cocktailSort();
		
		System.out.println("=== SORTED LIST ===");
		System.out.println(dlc);	
	}
}
