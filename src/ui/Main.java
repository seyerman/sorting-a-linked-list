package ui;

import model.DoubleLinkedList;

public class Main {
	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.addStudent("Andrés Aristizábal", "9012", 4.2);
		dll.addStudent("Juan Reyes", "1234", 2.9);
		dll.addStudent("Víctor Vargas", "5678", 3.1);
		dll.addStudent("Liliana Franco", "3456", 3.6);
		dll.addStudent("Cristian Sánchez", "7812", 2.5);
		
		System.out.println(dll);
	}
}
