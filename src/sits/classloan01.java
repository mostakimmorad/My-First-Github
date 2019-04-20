package sits;
class class_loan//loan class
{//loan class start
	public void student_loan()
	{//method start
	System.out.println("student loan");
}//method end
public void student_credit_loan()
{//method start
	System.out.println("student credit loan");

}//method start
}//loan class ended



class car_loan extends class_loan
{//class start
	public void car_loan_sp()
	{//method start
		System.out.println("my car loan");
	}//method end
}//class end

class mortgage extends car_loan
{
	public void mortgage_sp()
	{System.out.println("my mortgage payment");
}
}




public class classloan01 {
	
	public static void main(String[] args) {
		mortgage m=new mortgage();
		m.car_loan_sp();
		m.student_credit_loan();
		m.student_loan();
		m.mortgage_sp();
		System.out.println("*************************");
		car_loan c=new car_loan();
		c.car_loan_sp();
		c.student_credit_loan();
		c.student_loan();
		System.out.println(".........................");
		// TODO Auto-generated method stub

	}

}
