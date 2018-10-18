// Playing with Reference varible
// here Temp0 named class have two instance function
// named : getData()<getter method> and showData()<Setter method>
// And two Reference variable named t1 and t2

public class Temp0{
	String name;
	int salary;

	void getData(String s1, int i1){
		name = s1;
		salary = i1;
	}
	void showData(){
		System.out.println("Employee Name :"+name);
		System.out.println("Employee Name :"+salary);
	}

	public static void main(String[] args) {
		Temp0 t1 = new Temp0();
		System.out.println("\nReference varible t1 : "+t1);
		
		t1.getData("Rajat", 50000);
		t1.showData();

		Temp0 t2 = t1;
		
		System.out.println("\nReference variable t2 : "+t2);		

		t2.getData( "RajatVerma", 60000);
		
		System.out.println("\nFrom Reference var t2 - ");
		t2.showData();

		System.out.println("\nFrom Reference var t1 - ");
		t1.showData();

	}
}



