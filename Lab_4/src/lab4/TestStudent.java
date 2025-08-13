package lab4;
import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		  s.setDetails(510,'A',"K Naga Chaitanya Sphoorthy");
		  s.showDetails();
		  s.grade='B';
		  System.out.println("Direct protected access (grade): "+s.grade);
		  s.name="New Name";
		  System.out.println("Direct public access (name): "+s.name);

	}

}
