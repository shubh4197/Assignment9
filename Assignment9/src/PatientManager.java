import java.util.*;
import java.time.*;
import java.lang.*;

public class PatientManager {
List<Patient> s;
int id=0;

public PatientManager() {
	super();
	this.s = new ArrayList<>();
}



public Patient add() {
	int flag=0;
	Boolean isValid=true;
	String name="";
	String email="";
	String address="";
	String phone="";
	Scanner l=new Scanner(System.in);
	do {
	try {
	System.out.println("Name:");
	name=l.next();
	validateName(name);
	System.out.println("Email:");
	email=l.next();
	validateEmail(email);
	System.out.println("Address");
	address=l.next();
	System.out.println("Phone");
	phone=l.next();
	validatePhone(phone);
	isValid=true;
	}catch(invalidData ex) {
		System.err.println(ex.getMessage());
		isValid=false;
	}}while(isValid==false);
	
	Patient d=new Patient(id,name,email,address,phone);
	s.add(d);
	id++;
	do {
		
		d.addPre();
		System.out.println("Want to add more??");
		flag=l.nextInt();
	}while(flag!=1);
	
	return d;
	
}

public void update() {
	Scanner l=new Scanner(System.in);
	System.out.println("Enter patient name whose details you want to update:");
	String name=l.next();
	int index=0;
	for(Patient i:s) {
		if(name.equals(i.name))
		{
			index=s.indexOf(i);
			
			break;
		}
	}
	s.set(index,update1(s.get(index).id));
}

public Patient update1(int value) {
	int flag=0;
	Boolean isValid=true;
	String name="";
	String email="";
	String address="";
	String phone="";
	Scanner l=new Scanner(System.in);
	do {
	try {
	System.out.println("Name:");
	name=l.next();
	validateName(name);
	System.out.println("Email:");
	email=l.next();
	validateEmail(email);
	System.out.println("Address");
	address=l.next();
	System.out.println("Phone");
	phone=l.next();
	validatePhone(phone);
	isValid=true;
	}catch(invalidData ex) {
		System.err.println(ex.getMessage());
		isValid=false;
	}}while(isValid==false);
	Patient w=new Patient(value,name,email,address,phone);
	
	do {
		
		w.addPre();
		System.out.println("Want to add more??");
		flag=l.nextInt();
	}while(flag!=1);
	
	return w;
	
}

public void delete() {
	Scanner l=new Scanner(System.in);
	System.out.println("Enter patient name whose details you want to delete:");
	String name=l.next();
	int index1=0;
	for(Patient y:s) {
		if(name.equals(y.name))
		{
			index1=s.indexOf(y);
			
			break;
		}
	}
	s.remove(index1);
}

public void searchbyName() {
	Scanner l=new Scanner(System.in);
	System.out.println("Enter patient name whose details you want to search for:");
	String name=l.next();
	int index=0;
	for(Patient i:s) {
		if(name.equals(i.name))
		{
			System.out.println(i);
			
			break;
		}
	}
}
   

public void searchbyMedicine() {
	Scanner l=new Scanner(System.in);
	System.out.println("Enter medicine to get the patient details who takes it:");
	String name=l.next();
	int index=0;
	for(Patient i:s) {
		for(Prescription j:i.s)
		if(name.equals(j.description))
		{
			System.out.println(i);
			
			break;
		}
	}
}

public void searchbyDate() {
	Scanner l=new Scanner(System.in);
	System.out.println("Start year:");
	int year1=l.nextInt();
	System.out.println("Start Month:");
	int month1=l.nextInt();
	System.out.println("Start Date:");
	int Date1=l.nextInt();
	System.out.println("End year:");
	int year2=l.nextInt();
	System.out.println("End Month:");
	int month2=l.nextInt();
	System.out.println("End Date:");
	int Date2=l.nextInt();
	LocalDate t1=LocalDate.of(year1,month1,Date1);
	LocalDate t2=LocalDate.of(year2,month2,Date2);
	for(Patient i:s) {
		for(Prescription j:i.s) {
			if(j.Date.isAfter(t1) && j.Date.isBefore(t2))
			{
				System.out.println(i);
			}
		}
	}
	
}

public void validateName(String name) throws invalidData {
	
	char[] h=name.toCharArray();
	for(char i:h) {
		if(Character.isDigit(i)) {
			throw new invalidData("Wrong name");
		}
	}
}

public void validateEmail(String name) throws invalidData {
	int flag=0;
	char[] h=name.toCharArray();
	for(char i:h) {
		if(i=='@') {
			flag=1;
			break;
		}
	}
	if(flag==0) {
		throw new invalidData("Wrong email");
	}
}

public void validatePhone(String name) throws invalidData {
	
	char[] h=name.toCharArray();
	for(char i:h) {
		if(!Character.isDigit(i)) {
			throw new invalidData("Wrong Phone");
		}
	}
}
   

}
