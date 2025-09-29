package OOPS;

class Grandfather{
	String house_name="Krishna Vilasam";
	int investment=10000000;
	public void display() {
		System.out.println("Good morning my childs");
		
	}
	
}
class Parent extends Grandfather{
	public void pdisplay() {
		System.out.println("Good morning dad have a nice day");
		System.out.println("hey my child aren't u wake up until?");
	}
}
class Child extends Parent{
	public void cdisplay() {
		System.out.println("Good Morning Grandpaa");
		System.out.println("Yes dad i just wake up now");
	}
	
}
public class multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Parent();
		p.display();
		p.pdisplay();
		System.out.println(p.house_name);
		System.out.println(p.investment);
		System.out.println();
		Child c = new Child();
		c.display();
		System.out.println(c.house_name);
		System.out.println(c.investment);
		c.pdisplay();
		c.cdisplay();
		
		
		

	}

}
