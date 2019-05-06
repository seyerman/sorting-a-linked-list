package ui;

import model.DoubleLinkedCourse;

public class Main {
	public static void main(String[] args) {
		DoubleLinkedCourse dll = new DoubleLinkedCourse();
		dll.addStudent("Andrés Aristizábal", "9012", 4.2);
		dll.addStudent("Juan Reyes", "1234", 2.9);
		dll.addStudent("Víctor Vargas", "5678", 3.1);
		dll.addStudent("Liliana Franco", "3456", 3.6);
		dll.addStudent("Cristian Sánchez", "7812", 2.5);
		
		System.out.println("=== ORIGINAL LIST ===");
		System.out.println(dll);
		
		
		dll.cocktailSort();
		
		System.out.println("=== SORTED LIST ===");
		System.out.println(dll);		
	}
}
