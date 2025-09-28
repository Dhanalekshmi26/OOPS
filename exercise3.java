package OOPS;

class studentt{
	String name;
	int age;
	String address;
	
    studentt(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;

    }
    public void student_info() {
    	System.out.println(name);
    	System.out.println(age);
    	System.out.println(address);
    }



}
public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		studentt st = new studentt("anagha soorya",24,"kochi");
	    st.student_info();
		
		

	}

}