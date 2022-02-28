
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;
class MainProject {
 public static void main(String[] args) {
 int t=1;
 do {
 Scanner sc = new Scanner(System.in);
 System.out.println("-----------------------------------------------------");
 System.out.println("-----WELCOME TO Airline Reservation System------");
 System.out.println("-------------------------------------------------------");
 System.out.println("CHOOSE YOUR SPECIFIC OPERATION---------");
 System.out.println("1.) ARRIVAL'S--------");
 System.out.println("2.) DEPARTURE'S-------");
 System.out.println("3.) ENQUIRY'S---------");

 int no = sc.nextInt();
 switch (no) {
 case 1:
	 
	arrival a1 = new arrival("Delli",10,"Pune","12:00-AM",5000.00);
	
	
 break;
 
 case 2:
	 System.out.println("FIRST FLIGHT DEPARTED DELAY WITH 1HOURS");
	 departure d1 = new departure("INDIGO", 145266, "PATNA TO GORAKHPUR", "13:26-PM", 7865.3254);
	 departure d2 = new departure("GOAIR", 564789, "SIWAN TO BANGALORE", "16:55-PM", 2865.8754);
	 departure d3 = new departure("GOAIR", 564789, "SIWAN TO BANGALORE", "16:55-PM", 2865.8754);

 break; 
 
 case 3:
	 enquiry e1 = new enquiry("EMIRATES", 456327, "AMRITSAR TO SIWAN", "12:45-AM", 4562.84);
 break;
 

 
 default:
	 System.out.println("INVALID INPUT!!!!!!!");
 }
 System.out.println("DO YOU WANT TO CONTINUE PRESS 1 FOR YES OTHERKEY FOR NO----- ");
 t = sc.nextInt();
 } while (t==1);
}
}