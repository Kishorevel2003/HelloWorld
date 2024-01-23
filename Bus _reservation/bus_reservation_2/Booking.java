package bus_reservation_2;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	
	String passenger_name;
	int bus_no;
	Date date;
	
	Booking(){  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of Passenger");
		passenger_name=sc.next();
		System.out.println("Enter bus_no");
		bus_no=sc.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput =sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
		
		public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses)
		{
			int capacity=0;
			
			for(Bus bus:buses)
			{
				if(bus.get_bus_no() == bus_no)
				{
					capacity=bus.getCapacity();
				}
			}
			int booked=0;
			for(Booking booking:bookings)
			{
				if(booking.bus_no==bus_no && booking.date.equals(date))
				{
					booked++;
				}
			}
		
		
		return booked<capacity?true:false;
		
		}
		
	}
	


