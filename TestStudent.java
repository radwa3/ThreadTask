import javax.swing.JOptionPane;

public class TestStudent {
	
	public static void main(String[] args){
		
	String name= JOptionPane.showInputDialog("Enter Name of Student :");
	String email= JOptionPane.showInputDialog("Enter Email of Student :");
	String phone = JOptionPane.showInputDialog("Enter Phone of Student :");
	String faculty= JOptionPane.showInputDialog("Enter Faculty of Student :");
		
	String name2= JOptionPane.showInputDialog("Enter Name of Student :");
	String email2= JOptionPane.showInputDialog("Enter Email of Student :");
	String phone2= JOptionPane.showInputDialog("Enter Phone of Student :");
	String faculty2 = JOptionPane.showInputDialog("Enter Faculty of Student :");
	
	String name3= JOptionPane.showInputDialog("Enter Name of Student :");
	String email3= JOptionPane.showInputDialog("Enter Email of Student :");
	String phone3= JOptionPane.showInputDialog("Enter Phone of Student :");
	String faculty3 = JOptionPane.showInputDialog("Enter Faculty of Student :");
	
	Student s1 = new Student(name,email,phone,faculty);
	s1.start();
	
    Student s2 = new Student(name2,email2,phone2,faculty2);
	s2.start();
	
    Student s3 = new Student(name3,email3,phone3,faculty3);
	s3.start();
	}
}

