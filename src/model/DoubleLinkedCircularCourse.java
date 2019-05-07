package model;

public class DoubleLinkedCircularCourse {
	private Student first;
	
	public DoubleLinkedCircularCourse() {
		first = null;
	}
	
	public void addStudent(String na, String co, double gr) {
		Student s = new Student(na, co, gr);
		if(first==null) {
			first = s;
			s.setPrev(s);
			s.setNext(s);
		}else {
			first.getPrev().setNext(s);
			s.setPrev(first.getPrev());
			s.setNext(first);
			first.setPrev(s);
		}
	}
	
	public void bubbleSort() {
		if(first != null) {
			
			boolean changed = true;
			while(changed) {
				Student currentNode = first;
				changed = false;
				//System.out.println("== NEW ITERATION A ==");
				while(currentNode.getNext() != first) {
					Student nextNode = currentNode.getNext();
					//System.out.println(currentNode+" ? "+nextNode);
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
			}
		}
	}

	public String toString() {
		String msg = "";
		if(first!=null) {
			Student current = first;
			String sep = "";
			do {
				msg += sep + current;
				current = current.getNext();
				sep = "\n";
			}while(current!=first);
		}
		return msg;
	}
}
