package OOPS;

class student{
	String name;
	int age;
	String address;
	
	public void student_info() {
		System.out.print("my name is "+this.name);
		System.out.print(" ,i am "+this.age+" old");
		System.out.print(" and my house is in "+this.address);
	}
}
public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student st = new student();
		st.name="Bitty";
		st.age=24;
		st.address="Cherthala";
		st.student_info();

	}

}
