package OOPS;

class parent{
	String car="THAR";
	int money=1000000000;
	public void behaviour() {
		System.out.println("I am very angry person");
	}
	
}
class child extends parent{
	public void display() {
		System.out.println("I am child class so i can use properties and behvaiors of my parent");
		System.out.println("My dad's car is: "+car);
		System.out.println("My dad's investment is: "+money);
	}
}
public class singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c=new child();
		c.behaviour();
		System.out.println();
		c.display();
		

	}

}
