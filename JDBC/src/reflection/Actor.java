package reflection;

public class Actor
{
	public  String Name;
	String city;
	protected  long pincode;
	
	public Actor()
	{
		Name="default";
	}
	public Actor(String value)
	{
		Name=value;
	}
	
  public void printName()
  {
  	System.out.println("\t printName "+Name);
  }
  public int getName(int x,int y,int z)
  {
	 System.out.println("\t getName "+Name);
	 return x+y+z;
  }
  protected void printCity()
  {
	 System.out.println(" printCity "+city);
  }
 private void printPincode()
  {
	 System.out.println(" printPincode "+pincode);
  }
}