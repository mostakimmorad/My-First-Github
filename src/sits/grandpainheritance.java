package sits;
class grandpa
{
	public void gold()
	{
		System.out.println("gold");
	}
	public void house()
	{
	System.out.println("house");
	}
}
class father extends grandpa
{
	public void car_sp()
	{
	System.out.println("sp_car");
	}
}


class me extends father
{
	public void cash_sp ()
	{
	System.out.println("cash");
	}
}
public class grandpainheritance {

	public static void main(String[] args) {
		me m=new me();
		m.house();
		m.gold();
		m.car_sp();
		m.cash_sp();
		System.out.println("*************************");
		father f=new father();
		f.house();
		f.gold();
		f.car_sp();
		System.out.println("....................");
	
		
		
		// TODO Auto-generated method stub

	}

}

