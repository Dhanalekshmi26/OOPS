package OOPS;
class pen{
	String color;
	int price;
	
	public void peninfo() {
		System.out.println(this.color);
		System.out.println(this.price);
	}
	
}
public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pen p=new pen();
		p.color="black";
		p.price=10;
		
		p.peninfo();

	}

}
