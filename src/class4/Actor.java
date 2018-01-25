package class4;

public class Actor {
	String firstname;
	String lastname;

	public Actor (String first, String last) {
		
		 firstname = first;
		 lastname = last;
		 
	}
	public static void main(String[] args) {
		Actor actor1=new Actor("Daniel", "Radcliff");
		System.out.println(actor1.firstname);
		
		

	}

}
