import java.time.*;
public class Prescription {
String pid;
String name;
String description;
LocalDate Date;

String type;

public Prescription(String pid, String name, String description, String type,LocalDate Date) {
	super();
	this.pid = pid;
	this.name = name;
	this.description = description;
	this.Date=Date;
	this.type = type;
	
}
public String getPid() {
	return pid;
}
public void setPid(String pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Prescription id=" + pid + " ,Name=" + name + " ,Description=" + description + " ,Type=" + type + " ,Prescription Date="+Date;
}





}
