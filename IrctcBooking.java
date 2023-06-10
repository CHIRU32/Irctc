import java.util.Scanner;
class IrctcBooking
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("                                         Enter your name              ");
		String a=sc.next();
		System.out.println("                                Hi " + a + " Welcome to Irctc Booking     ");
		int aa=990;
		int ab=380;
		int ac=245;
		int ad=935;
		int	ae=345;
		int	af=225;
		int	ag=940;
		int	ah=350;
		int	ai=230;
		int aj=7486;
		int	ak=5485;
		int al=6487;
		int	am=6800;
		int	an=7200;
		int	ao=5800;
		int	ap=5995;
		int	aq=6600;
		int	ar=7300;
		int ca=6;
		int cb=18;
		int cc=26;
		int cd=2;
		int ce=43;
		int cf=38;
		int cg=9;
		int ch=42;
		int ci=11;
		int choice;
		int count=0,y=0;
		int pass=1929;	
		do
		{
		System.out.println("                                        Enter your pin");
		int pin=sc.nextInt();
		if(pass==pin)
		  {
			do
			{
			System.out.println("1.Railways booking");
			System.out.println("2.Flights booking");
			System.out.println("3.Bus booking");
			System.out.println("4.CAB booking");
            int c=sc.nextInt();
			switch (c)
			{
			case 1:System.out.println("Daily running  Trains");
				   System.out.println("Railway Booking welcomes you " + a);
				   System.out.println("1.Godavari ticket  ");
				   System.out.println(" Train Timings is 17:05 To 4:00");
				   System.out.println("2.Visakha express ticket ");
				   System.out.println(" Train Timings is 18:20 To 6:50");                   
				   System.out.println("3.East coast ticket ");
				   System.out.println(" Train Timings is 08:00 To 21:10");                   
                   int d=sc.nextInt();
				   switch(d)
				    {
					   case 1:
					   System.out.println("Enter Boarding Station");
					   String mn=sc.next();
					   System.out.println("Enter Arrival Station");
					   String mb=sc.next();
					   System.out.println("1.AC Ticket cost is  " + aa);
					   System.out.println("Avaliable tickets : " +ca);
					   System.out.println("2.Sleeper Class Ticket cost is " + ab);
					   System.out.println("Avaliable tickets : " +cb);
					   System.out.println("3.Second Sitting Ticket cost is " + ac);
					   System.out.println("Avaliable tickets : " +cc);
                       int e=sc.nextInt();
					   switch(e)
						{
					      case 1:
						         System.out.println("Enter number of tickets you want");
						         int da=sc.nextInt();
								 if(da<=ca)
							     {
									 System.out.println("For confirmation enter c or C");
					                 System.out.println("For cancellation enter any character");
					                 char poi=sc.next().charAt(0);
					                 if('c'==poi||'C'==poi)
					                    {
						                   System.out.println( da +" AC Tickets for Godavari is Booked");
										   int ea=ca-da;
						                   System.out.println("Avaliable tickets are: " +ea);
						                 }
					                 else
					                    {
						                  System.out.println("Your AC Ticket for Godavari is Cancelled"); 
						                 }
								  }
								 else
							     {
									 System.out.println(" Insufficient tickets try with avaliable tickets");
								 }
                          break;
						  case 2:
						         System.out.println("Enter number of tickets you want");
						         int db=sc.nextInt();
								 if(db<=cb)
							     {
						            System.out.println("For confirmation enter c or C");
						            System.out.println("For cancellation enter any character");
                                    char poq=sc.next().charAt(0);
                                    if('c'==poq||'C'==poq)
                                     {
                                        System.out.println(db +" Slepper Class Tickets for Godavari is Booked");
										int eb=cb-db;
						                System.out.println("Avaliable tickets are: " +eb);
                                      }
                                      else
                                     {
                                        System.out.println("Your Slepper Class Ticket for Godavari is Cancelled"); 
                                      }
								 }
								 else
						          {
								    System.out.println(" Insufficient tickets try with avaliable tickets");
							      }
						  break;
						  case 3:
						  System.out.println("Enter number of tickets you want");
						         int dc=sc.nextInt();
								 if(dc<=cc)
							     {
						            System.out.println("For confirmation enter c or C");
						            System.out.println("For cancellation enter any character");
                                    char pow=sc.next().charAt(0);
                                    if('c'==pow||'C'==pow)
                                      {
                                         System.out.println(dc +" Second Sitting Tickets for Godavari is Booked");
										 int ec=cc-dc;
						                System.out.println("Avaliable tickets are: " +ec);
                                      }
                                    else
                                      {
                                         System.out.println("Your Second Sitting Ticket for Godavari is Cancelled"); 
                                      }
								 }
								 else
						          {
								    System.out.println(" Insufficient tickets try with avaliable tickets");
							      } 
						  }
					   break;
					   case 2: 
					   System.out.println("Enter Boarding Station");
					   String mo=sc.next();
					   System.out.println("Enter Arrival Station");
					   String mi=sc.next();
					   System.out.println("1.AC Ticket cost is " + ad);
					   System.out.println("Avaliable tickets : " + cd);
					   System.out.println("2.Sleeper Class Ticket cost is " + ae);
					   System.out.println("Avaliable tickets : " + ce);
					   System.out.println("3.Second Sitting Ticket cost is " + af);
					   System.out.println("Avaliable tickets : " + cf);				   
					   int f=sc.nextInt();
					   switch(f)
					   {
						   case 1:System.out.println("Enter number of tickets you want");
						         int dd=sc.nextInt();
								 if(dd<=cd)
							     {
									 System.out.println("For confirmation enter c or C");
						             System.out.println("For cancellation enter any character");
                                     char poz=sc.next().charAt(0);
                                     if('c'==poz||'C'==poz)
                                      {
                                        System.out.println(dd+" AC Tickets for Visakha Express is Booked");
										 int ed=cd-dd;
						                System.out.println("Avaliable tickets are: " +ed);
                                       }
                                     else
                                      {
                                        System.out.println("Your AC Ticket for Visakha Express is Cancelled"); 
                                       }
								 }
								 else
						          {
								    System.out.println(" Insufficient tickets try with avaliable tickets");
							      } 
						  break;
						  case 2:
						 System.out.println("Enter number of tickets you want");
						         int de=sc.nextInt();
								 if(de<=ce)
							     {
						            System.out.println("For confirmation enter c or C");
						            System.out.println("For cancellation enter any character");
                                    char poo=sc.next().charAt(0);
                                    if('c'==poo||'C'==poo)
                                      {
                                        System.out.println(de+" Slepper Class Tickets for Visakha Express is Booked");
										int ee=ce-de;
						                System.out.println("Avaliable tickets are: " +ee);
                                       }
                                    else
                                      {
                                        System.out.println("Your Sleeper Class Ticket for Visakha Express is Cancelled"); 
                                       }
								 }
								 else
						          {
								    System.out.println(" Insufficient tickets try with avaliable tickets");
							      } 
						  break;
						  case 3:
						  System.out.println("Enter number of tickets you want");
						         int df=sc.nextInt();
								 if(df<=cf)
							     {
						            System.out.println("For confirmation enter c or C");
						            System.out.println("For cancellation enter any character");
                                    char pou=sc.next().charAt(0);
                                    if('c'==pou||'C'==pou)
                                      {
                                        System.out.println(df+" Second Sitting Tickets for Visakha Express is Booked");
										int ef=cf-df;
						                System.out.println("Avaliable tickets are: " +ef);
                                       }
                                    else
                                      {
                                        System.out.println("Your Second Sitting Ticket for Visakha Express is Cancelled"); 
                                      }
					             }
							   else
						          {
								    System.out.println(" Insufficient tickets try with avaliable tickets");
							      } 
					   }
					   break;
					   case 3:
					   System.out.println("Enter Boarding Station");
					   String mq=sc.next();
					   System.out.println("Enter Arrival Station");
					   String mw=sc.next();
					   System.out.println("1.AC Ticket cost is " + ag);
					   System.out.println("Avaliable tickets : " + cg);
					   System.out.println("2.Sleeper Class Ticket cost is " + ah);
					   System.out.println("Avaliable tickets : " + ch);
					   System.out.println("3.Second Sitting Ticket cost is " + ai);
					   System.out.println("Avaliable tickets : " + ci);
					   int g=sc.nextInt();
					   switch(g)
						{
						  case 1:
						  System.out.println("Enter number of tickets you want");
						         int dg=sc.nextInt();
								 if(dg<=cg)
							     {
						            System.out.println("For confirmation enter c or C");
						            System.out.println("For cancellation enter any character");
                                    char poe=sc.next().charAt(0);
                                    if('c'==poe||'C'==poe)
                                     {
                                       System.out.println(dg+" AC Tickets for East Coast is Booked");
									   int eg=cg-dg;
						               System.out.println("Avaliable tickets are: " +eg);
                                      }
                                    else
                                     {
                                       System.out.println("Your AC Ticket for East Coast is Cancelled"); 
                                     }
								 }
								  else
						          {
								    System.out.println(" Insufficient tickets try with avaliable tickets");
							      } 
						  break;
						  case 2:
						         System.out.println("Enter number of tickets you want");
						         int dh=sc.nextInt();
								 if(dh<=ch)
							     {
						            System.out.println("For confirmation enter c or C");
						            System.out.println("For cancellation enter any character");
                                    char por=sc.next().charAt(0);
                                    if('c'==por||'C'==por)
                                     {
                                       System.out.println(dh+" Slepper Class Tickets for East Coast is Booked");
									   int eh=ch-dh;
						               System.out.println("Avaliable tickets are: " +eh);
                                      }
                                    else
                                     {
                                       System.out.println("Your Slepper Class Ticket for East Coast is Cancelled"); 
                                     }
								 }
								 else
						          {
								    System.out.println(" Insufficient tickets try with avaliable tickets");
							      } 
						  break;
						  case 3:
						  System.out.println("Enter number of tickets you want");
						         int di=sc.nextInt();
								 if(di<=ci)
							     {
						           System.out.println("For confirmation enter c or C");
						           System.out.println("For cancellation enter any character");
                                   char poy=sc.next().charAt(0);
                                   if('c'==poy||'C'==poy)
                                   {
                                     System.out.println(di+" Second Sitting Tickets for East Coast is Booked");
									 int ei=ci-di;
						               System.out.println("Avaliable tickets are: " +ei);
                                   }
                                   else
                                   {
                                     System.out.println("Your Second Sitting Ticket for East Coast is Cancelled"); 
                                    }
					             }
								 else
						          {
								    System.out.println(" Insufficient tickets try with avaliable tickets");
							      } 
					   }
				    }
			break;
			case 2:System.out.println("Flights booking welcomes you " + a);
			       System.out.println("1.Vizag to hyderbad");
				   System.out.println("2.Hyderbad to banglore");
				   System.out.println("3.Vizag to banglore");
				   int h=sc.nextInt();
				   switch(h)
				   {
					   case 1:System.out.println("Available Flights are:");
					          System.out.println("1.Indigo flight");
					          System.out.println("2.AirJet flight");
					          System.out.println("3.AirIndia flight");
							  int i=sc.nextInt();
							  switch(i)
					            {
								  case 1:System.out.println("Indigo Ticket cost is" + aj);
                                  System.out.println("1.Indigo Ticket confimation");
						          break;
								  case 2:System.out.println("AirJet Ticket cost is" + ak);
								  System.out.println("2.AirJet Ticket confimation");
								  break;
								  case 3:System.out.println("AirIndia Ticket cost is" + al);
								  System.out.println("3.AirIndia Ticket confimation");
							    }
								int j=sc.nextInt();
								switch(j)
					            {
									case 1:System.out.println("Your ticket for indigo is booked");
									break;
									case 2:System.out.println("Your ticket for AirJet is booked");
									break;
									case 3:System.out.println("Your ticket for AirIndia is booked");
									break;
								}
							  break;
					   case 2:System.out.println("Available Flights are:");
					          System.out.println("1.Emirates flight");
					          System.out.println("2.Vistara flight");
					          System.out.println("3.SpiceJet flight");
							  int k=sc.nextInt();
							  switch(k)
					            {
								  case 1:System.out.println("Emirates Ticket cost is" + am);
								  System.out.println("1.Emirates Ticket confimation");
								  break;
								  case 2:System.out.println("Vistara Ticket cost is" + an);
								  System.out.println("2.Vistara Ticket confimation");
								  break;
								  case 3:System.out.println("SpiceJet Ticket cost is" + ao);
								  System.out.println("3.SpiceJet Ticket confimation");
							    }
								int l=sc.nextInt();
								switch(l)
					            {
									case 1:System.out.println("Your ticket for Emirates is booked");
									break;
									case 2:System.out.println("Your ticket for Vistara is booked");
									break;
									case 3:System.out.println("Your ticket for SpiceJet is booked");
									break;
								}
							  break;
					   case 3:System.out.println("Available Flights are:");
					          System.out.println("1.GoAir flight");
					          System.out.println("2.Jet AirWays flight");
					          System.out.println("3.AirAsia flight");
							  int m=sc.nextInt();
							  switch(m)
					            {
								  case 1:System.out.println("GoAir Ticket cost is" + ap);
								  System.out.println("1.GoAir Ticket confimation");
     							  break;
								  case 2:System.out.println("Jet AirWays  Ticket cost is" + aq);
								  System.out.println("2.Jet AirWays Ticket confimation");
								  break;
								  case 3:System.out.println("AirAsia Ticket cost is" + ar);
								  System.out.println("3.AirAsia Ticket confimation");
							    }
								
								int n=sc.nextInt();
								switch(n)
					            {
									case 1:System.out.println("Your ticket for GoAir is booked");
									break;
									case 2:System.out.println("Your ticket for Jet AirWays is booked");
									break;
									case 3:System.out.println("Your ticket for AirAsia is booked");
									break;
								}
							  break;	   
				   }
			break;
			case 3:System.out.println("Bus Booking welcomes you " + a);
                   System.out.println("APSRTC Welcomes You");
                   System.out.println("1.AC Buses");
                   System.out.println("2.Non-AC Buses");
                   int o=sc.nextInt();
				   switch(o)
				    {
					   case 1:System.out.println("Avaliable AC Buses are");
					          System.out.println("1.Vizag To Hyderabad");
							  System.out.println("2.Vijayawada to Banglore");
							  int p=sc.nextInt();
							  switch(p)
						       {
								  case 1:System.out.println("Vizag to Hyderabad AC Bus");
								  System.out.println("The Charge of each KM is 2");
								  System.out.println("Enter the Distance in KM");
								  int res=sc.nextInt();
								  int the=res*2;
								  
								  System.out.println("The charge of AC Bus from Vizag to Hyderbad is" + the);
								  break;
								  case 2:System.out.println("Vijayawada to Banglore AC Bus");
								  System.out.println("The Charge of each KM is 2");
								  System.out.println("Enter the Distance in KM");
								  int man=sc.nextInt();
								  int lan=man*2;
								  System.out.println("The charge of AC Bus from Vijayawada to Banglore is" + lan);
								  break;
							   }
					   break;
					   case 2:System.out.println("Avaliable Non-AC Buses are");
					          System.out.println("1.Tirupati to Yelamanchilli");
					          System.out.println("2.Etikoppaka to Chennai");
							  int q=sc.nextInt();
                              switch(q)
						       {
								  case 1:System.out.println("Tirupati to Yelamanchilli Non-AC Bus");
								  System.out.println("The Charge of each KM is 1.5 ");
								  System.out.println("Enter the Distance in KM");
								  int dec=sc.nextInt();
								  double per=dec*1.5;
								  
								  System.out.println("The charge of Non-AC Bus from Tirupati to Yelamanchilli is" + per);
								  break;
								  case 2:System.out.println("Etikoppaka to Chennai Non-AC Bus");
								   System.out.println("The Charge of each KM is 1.5");
								  System.out.println("Enter the Distance in KM");
								  int zxc=sc.nextInt();
								  double vcx=zxc*1.5;
								 
								  System.out.println("The charge of Non-AC Bus from Etikoppaka to Chennai is" + vcx);
								  break;
							   }
				    }
			break;
			case 4:System.out.println("CAB Booking welcomes you " + a);
			       System.out.println("1.Rapido Booking");
			       System.out.println("2.OLA Booking");
			       System.out.println("3.Uber Booking");
				   int r=sc.nextInt();
				   switch(r)
				   {
                       case 1:System.out.println("Rapido Booking");
					          System.out.println("Enter your current location");
							  String current=sc.next();
							  System.out.println("Enter your destination location");
							  String destination=sc.next();
							  int as=4;
							  int at=7; 
							  double au=as*at;
							  System.out.println("The charge from "+ current + " to " + destination +" is " + au );
					   break;
					   case 2:System.out.println("OLA Booking");
					          System.out.println("How Many Members");
							  int z=sc.nextInt();
							  System.out.println("Enter your current location");
							  String curr=sc.next();
							  System.out.println("Enter your destination location");
							  String dest=sc.next();
							  int az=3;
							  int ay=5;
							  int ax=az*ay;
							  System.out.println("The charge of Each person is " + ax);
                              System.out.println("The charge of " + z + " members from " + curr + " to " + dest + " is " + (z*ax) );
					   break;
					   case 3:System.out.println("Uber Booking");
					          System.out.println("");
					   break;
				   }      
			}
			System.out.println("press 1 to countiue");
			System.out.println("press 0 to stop");
			choice=sc.nextInt();
		     }
		while (choice==1);
		  }
		 else
			{
				System.out.println("Your Entered pin is incorrect");
				y++;
				System.out.println("Enter correct pin /npress 1 to try again");
				count=sc.nextInt();	
			}
	}
			while(count==1 && y<=3);
			System.out.println("Your limit has execceded please try after 24 hours");
			System.out.println(""+(char)1+"THANK YOU"+(char)1+"");
	}
}

