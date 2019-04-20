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
	public void car()
	{
		System.out.println("car");
	}
}
class son extends father
{
	public void cash()
	{
		System.out.println("cash");
	}
}
public class gpinher2 {

	public static void main(String[] args) {
		son s=new son();
		s.cash();
		s.car();
		s.house();
		s.gold();
		System.out.println("$$$$$$$$$$$$");
		father f=new father();
		f.car();
		f.gold();
		f.house();
		System.out.println("@@@@@@@@@@@");
		
		// TODO Auto-generated method stub

	}

}
