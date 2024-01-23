package bus_reservation_2;

public class Bus {
	
	private int bus_no;
	private int capacity;
	private boolean ac;
	
	Bus(int bus_no,int capacity,boolean ac)
	{
		this.bus_no=bus_no;
		this.capacity=capacity;
		this.ac=ac;
	}
	
	public void set_bus_no(int bus_num)
	{
		this.bus_no=bus_num;
	}
	
	public int get_bus_no()
	{
		return bus_no;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}
	
	public void display()
	{
		System.out.println("Bus_No "+":"+ bus_no +" Capacity"+":"+ capacity +" Ac"+":"+ ac);
	}
	

}
