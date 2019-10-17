import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int option = 0;
	        PatientManager k=new PatientManager();

	        Scanner s = new Scanner(System.in);
	        
	        do{
	            System.out.println("\nMENU");
	            System.out.println("1. New Patient");
	            System.out.println("2. Print Patient Database");
	            System.out.println("3. Update Patient");
	            System.out.println("4.Delete Patient");
	            System.out.println("5.Search By name");
	            System.out.println("6.Search by Medicine");
	            System.out.println("7. Search by Date");
	            System.out.println("8.Exit");

	            System.out.print("\nOption > ");
	            option = s.nextInt();
	            switch (option){
	                case 1:
	                     k.add();  
	                    break;
	                case 2:
	                    System.out.println("  ID  Name  Address  Email  Phone  Prescriptions");
	                	for(Patient i:k.s) {
	                		System.out.println(i);
	                	}
	                	break;
	                case 3:
		                   
	                	k.update();
	                	break;
	                case 4:
		                   
	                	k.delete();
	                	break;
	                case 5:
		                   
	                	k.searchbyName();
	                	break;
	                case 6:
	                	k.searchbyMedicine();
	                	break;
	                case 7:
	                	k.searchbyDate();;
	                	break;
	                default:
	                	option=8;
	                	break;
	            }
	        }while ( option !=8);
	}

}
