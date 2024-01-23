package bus_reservation_2;

import java.util.*;

public class main {
	
	public static void main(String[] args) {
		
		
		ArrayList<Bus> buses = new ArrayList<>();
		
		ArrayList<Booking> bookings = new ArrayList<>();
		
		buses.add(new Bus(1,1,true));
		buses.add(new Bus(2,50,false));
		
		for(Bus b:buses)
		{
			b.display();
		}
		
		int userOpt=1;
		
		Scanner sc = new Scanner(System.in);
		
		while(userOpt==1)
		{
			System.out.println("Enter 1 to book and 2 to exit");
			userOpt=sc.nextInt();
			if(userOpt==1)
			{
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses))
				{
					bookings.add(booking);
					System.out.println("Confirmed");
				}
				else
				{
					System.out.println("Not Confirmed");
				}
			}
		}
	}
}
