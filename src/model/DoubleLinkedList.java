package model;

public class DoubleLinkedList {
	private Student first;
	
	public DoubleLinkedList() {
		first = null;
	}
	
	public void addStudent(String na, String co, double gr) {
		Student s = new Student(na, co, gr);
		if(first==null) {
			first = s;
		}else {
			Student current = first;
			while(current.getNext()!=null) {
				current = current.getNext();
			}
			current.setNext(s);
			s.setPrev(current);
		}
	}
	
	public String toString() {
		String msg = "";
		Student current = first;
		while(current!=null) {
			msg += current;
			current = current.getNext();
		}
		return msg;
	}
}
