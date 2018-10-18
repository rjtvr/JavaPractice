public class Temp1
{

	int x = 30;

	void show(int y)
	{
		System.out.println("Test x : " +x);
		System.out.println(y);		
	}
	public static void main(String[] args) 
	{
		Temp1 t1 = new Temp1();
		System.out.println("Test : "+t1.x);			
	
		t1.show(20);
	}
}