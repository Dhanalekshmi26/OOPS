package OOPS;
class parentt{
	String car="THAR";
	int money=1000000000;
	public void behaviour() {
		System.out.println("I am your dad");
	}
}
class child1 extends parentt{
	public void behavious() {
	System.out.println("haii i am first baby");
}
}
class child2 extends parentt{
	public void behavious() {
	System.out.println("haii i am second baby");
}
}
public class hirerchilinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child1 c1 = new child1();
		c1.behavious();
		c1.behaviour();
		System.out.println(c1.car);
		System.out.println(c1.money);
		
		System.out.println();
		child2 c2 = new child2();
		c2.behavious();
		c2.behaviour();
		System.out.println(c2.car);
		System.out.println(c2.money);

	}

}
