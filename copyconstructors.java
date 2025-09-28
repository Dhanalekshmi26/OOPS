package OOPS;


class studenttt{
	String name;
	int age;
	String address;
	
    studenttt(studenttt s2) {
        this.name = s2.name;
        this.age = s2.age;
        this.address = s2.address;

    }
    public void student_info() {
    	System.out.println(name);
    	System.out.println(age);
    	System.out.println(address);
    }
    studenttt(){
    	
    }
    }


public class copyconstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		studenttt s1 = new studenttt();
		s1.name="maya";
		s1.age=22;
		s1.address="kochi";
		
		studenttt s2=new studenttt(s1);
		s2.student_info();

	    

	}

}
