public class Laptop 
{
	private String brand;
	private int ram;
	private int price; 
	Laptop(String brand,int ram,int price)
	{
		this.brand=brand;
		this.ram=ram;
		this.price=price;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setRam(int ram)
	{
		this.ram=ram;
	}
	public int getRam()
	{
		return ram;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int setPrice(){
		return price;
	}
	@Override
	public String toString(){
		return "Brand= "+brand+"\n"+
			   "Ram= "+ram+"\n"+
			   "Price= "+price+"\n";
	}
	@Override
		//this is second object lap2
	public int compareTo(Laptop lap2){
		//this>lap2 =-
		//this<lap2=+
		//this==lap2=0
		if(this.getRam()>lap2.getRam())
			return (int)1e9;
		else
			return -1;
		
	}
	public static void main(String[] args) 
	{
		
	}
}
