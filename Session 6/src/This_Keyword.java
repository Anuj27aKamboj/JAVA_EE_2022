class Student{
	
	int roll;
	String name;
	
	Student(){
		// this is a keyword available in class
		// which refers to the current object i.e. it will always hold the hashcode for the object in execution phase
		System.out.println("this is: "+this);
	}
	
	Student(int roll, String name){
		// LHS this.roll is the attribute of object
		// RHS roll is to the Constructor input
		this.roll = roll;
		this.name = name;
	}
	
	
	
}

public class This_Keyword {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 is: "+s1);
		
		System.out.println();
		
		Student s2 = new Student();
		System.out.println("s2 is: "+s2);

	}

}
