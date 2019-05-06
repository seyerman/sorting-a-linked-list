package model;

public class DoubleLinkedCourse {
	private Student first;
	
	public DoubleLinkedCourse() {
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
	
	public void cocktailSort() {
		if(first != null) {
			
			boolean changed = true;
			while(changed) {
				Student currentNode = first;
				changed = false;
				System.out.println("== NEW ITERATION ==");
				while(currentNode.getNext() != null) {
					Student nextNode = currentNode.getNext();
					System.out.println(currentNode+" ? "+nextNode);
					if(currentNode.compareTo(nextNode)>0) {
						if(currentNode.getPrev()!=null) {
							currentNode.getPrev().setNext(nextNode);
						}
						if(nextNode.getNext()!=null) {
							nextNode.getNext().setPrev(currentNode);
						}
						
						currentNode.setNext(nextNode.getNext());
						nextNode.setPrev(currentNode.getPrev());
						currentNode.setPrev(nextNode);
						nextNode.setNext(currentNode);
						
						
						if(currentNode==first) {
							first = nextNode;
						}
						
						changed = true;
						
					}else{
						currentNode = currentNode.getNext();
					}
				}
				/*
				while(currentNode.getPrev() != null) {
					Student prevNode = currentNode.getPrev();
					if(currentNode.compareTo(prevNode)>0) {
						currentNode.setPrev(prevNode.getPrev());
						prevNode.setNext(currentNode.getNext());
						currentNode.setNext(prevNode);
						prevNode.setPrev(currentNode);
						
						changed = true;
					}else{
						currentNode = currentNode.getPrev();
					}
				}*/
			}
		}
	}

	public String toString() {
		String msg = "";
		Student current = first;
		String sep = "";
		while(current!=null) {
			msg += sep + current;
			current = current.getNext();
			sep = "\n";
		}
		return msg;
	}
}
