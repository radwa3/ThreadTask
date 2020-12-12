
public class Student extends Thread {
String name ;
String email ;
String phone;
String faculty ;

public synchronized void run(){
	System.out.print(this.name+"\n"+this.email+"\n"+this.phone+"\n"+this.faculty+"\n");
}

public Student(String name, String email, String phone, String faculty) {
	super();
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.faculty = faculty;
}

	
}

 
 

