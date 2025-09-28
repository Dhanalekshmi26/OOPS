//compile time polymorphism is also known as method overloading


package OOPS;
class employee{
	String name;
	int salary;
	
	public void display(String name) {
		System.out.println(this.name=name);
	}
	public void display(int salary) {
		System.out.println(this.salary=salary);
	}
	public void display(String name,int salary) {
		System.out.println(name);
		System.out.println(salary);
	}
}



public class compile_time_polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee e = new employee();
		e.display("manuu");
		System.out.println();
		e.display(40000);
		System.out.println();
		System.out.println("directly calling method");
		e.display("advaitha", 30000);

	}

} 