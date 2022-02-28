import java.util.Scanner;
class enquiry{
	 String name;
	 int id;
	 String address;
	 String time;
	 double fare;
	 public static String count = "AVAILABLE";
	 public enquiry(String nm,int id,String address,String time,double fare)
	 {
	 Scanner sc = new Scanner(System.in);
	 this.name=nm;
	 this.id=id;
	 this.address=address;
	 this.time=time;
	 this.fare=fare;
	 String locate;
	 System.out.println("ENTER CURRENT AIRPORT STATION TO FLY<---------->");
	 locate = sc.nextLine();
	 if(locate.equals("AMRITSAR"))
	 {
	 System.out.println("-------SEATS AVAILABLE------");
	 System.out.println("-----------------------------------");
	 System.out.println("name of flight is----"+nm);
	 System.out.println("id of flight is------"+id);
	 System.out.println("address of flight is------"+address);
	 System.out.println("time of departure is-------"+time);
	 System.out.println("fare of this flight is------"+fare);
	 System.out.println("STATUS OF CONFIRMATION IS--------->"+count);
	 System.out.println("-----------------------------------");
	 }
	 else
	 {
	 System.out.println("-------->SORRY SEATS ARE NOT AVAILABLE----->");
	 }
	 }
	}