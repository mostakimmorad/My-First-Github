package sits;
class ford
{
	public void start()
	{
		System.out.println("start the car");
	}
	public void stop()
	{
	System.out.println("stop the car");
	}
}
class bmw extends ford
{
	public void bmw_sp()
	{
	System.out.println("special future bmw");
	}
}


class porsche extends bmw
{
	public void porsche_sp ()
	{
	System.out.println("special future porche");
	}
}
public class inheritance {

	public static void main(String[] args) {
		porsche p=new porsche();
		p.start();
		p.stop();
		p.bmw_sp();
		p.porsche_sp();
		System.out.println("*************************");
		bmw b=new bmw();
		b.start();
		b.stop();
		b.bmw_sp();
		System.out.println(".........................");
		
		// TODO Auto-generated method stub

	}

}

