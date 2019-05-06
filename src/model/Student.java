package model;

public class Student implements Comparable<Student>{
	private String name;
	private String code;
	private double grade;
	
	private Student prev;
	private Student next;
	
	public Student(String na, String co, double gr) {
		name = na;
		code = co;
		grade = gr;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCode() {
		return code;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public int compareTo(Student anotherStudent) {
		double anotherGrade = anotherStudent.getGrade();
		if(grade<anotherGrade) {
			return -1;
		}else if(grade>anotherGrade) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public void setPrev(Student p) {
		prev = p;
	}
	
	public void setNext(Student n) {
		next = n;
	}
	
	public Student getPrev() {
		return prev;
	}
	
	public Student getNext() {
		return next;
	}
	
	public String toString() {
		return "["+name+", "+code+", "+grade+"]";
	}
}
