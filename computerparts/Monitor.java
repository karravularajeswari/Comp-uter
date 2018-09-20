package computerparts;

public class Monitor {
	public String id;
	public int  qualityrating;
	public int warrantyperiod;
	public Bill bill;
	public Company company;
	public int size;
	public double width;
	public double height;
	public void display()
	{
		
	}
	public Monitor(String id,int size,double height)
	{
		this.id=id;
		this.size=size;
		this.height=height;
	}
}
