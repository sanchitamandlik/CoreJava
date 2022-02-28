class departure{
	 String name;
	 int id;
	 String address;
	 String time;
	 double fare;
	 public static int count = 5;
	 public departure(String nm,int id,String address,String time,double fare)
	 {
	 this.name=nm;
	 this.id=id;
	 this.address=address;
	 this.time=time;
	 this.fare=fare;
	 System.out.println("FLIGHT DEPARTED DETAILS ARE--------");
	 System.out.println("-----------------------------------");
	 System.out.println("name of flight is----"+nm);
	 System.out.println("id of flight is------"+id);
	 System.out.println("address of flight is------"+address);
	 System.out.println("time of departure is-------"+time);
	 System.out.println("fare of this flight is------"+fare);
	 System.out.println("departure count is--------->"+count--);
	 System.out.println("-----------------------------------"); 
	 }
	}