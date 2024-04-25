class Person
{
	private int age;
	private  String name;
	public int getAge()
	{		
		return age;
	}	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
	if(age > 0){
	this.age = age;
	}
	else
	{
	System.out.println("Age must be a positive number");
	}
}
}
public class Main
{
	public static void main(String args[])
	{
		Person person = new Person();

		person.setName("John");
		person.setAge(30);

		System.out.println("Name is : " + person.getName());
		System.out.println("Age is : "+ person.getAge());
	}
}