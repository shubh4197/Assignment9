import java.util.*;
import java.lang.*;
import java.time.LocalDate;
public class Patient {
   int id;
   String name;
   String email;
   String address;
   String phone;
   List<Prescription> s;
public Patient(int id,String name, String email, String address, String phone) {
	super();
	this.id=id;
	this.name = name;
	this.email = email;
	this.address = address;
	this.phone = phone;
	this.s =new ArrayList<>();
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

public void addPre() {
	Scanner f=new Scanner(System.in);
	System.out.println("Prescription Id:");
	String pId=f.next();
	System.out.println("Name:");
	String name=f.next();
	System.out.println("Description:");
	String description=f.next();
	System.out.println("Type:");
	String type=f.next();
	System.out.println("Year:");
	int year=Integer.parseInt(f.next());
	System.out.println("Month:");
	int month=Integer.parseInt(f.next());
	
	System.out.println("Date:");
	int date=Integer.parseInt(f.next());
	LocalDate d3=LocalDate.of(year, month, date);
	
	Prescription w=new Prescription(pId,name,description,type,d3);
	
	s.add(w);
    
}
@Override
public String toString() {
	return " " + id + " " + name + " " + email + " " + address + " " + phone
			+ " " + s + " ";
}



}
