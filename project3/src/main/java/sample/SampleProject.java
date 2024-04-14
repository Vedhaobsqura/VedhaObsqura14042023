package sample;

public class SampleProject 
{
	static String name;
	int id;
	
	public void display(int id)
	{
		this.id=id;
		System.out.println(id);
	}
	public static void main(String[] args)
	{
		SampleProject obj = new SampleProject();
		obj.display(1);
		System.out.println("Vedha");
		int age=25;
		System.out.println(age);

	}
	
	
	

}
