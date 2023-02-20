package PracticeBasic;

//accessing private variables with help of methods
//encapsulation- binding the data variables and methods

class Person{
	private int age;
	private String name;
	
	//IDE generated getters and setters
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age; //this represents current object
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	/*
	public int getAge() { //getting the age
		return age;
	}
	public String getName() {//getting name
		return name;
	}
	public void setAge(int a) { //setting age
		age=a;
	}
	public void setName(String n) {//setting name
		name=n;
	}*/
}
public class access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj=  new Person();
		//obj.age=21;
		//obj.name="Anjali";
        
		obj.setAge(21);
		obj.setName("Anjali_Sharma");
		System.out.println(obj.getName() + " : "+ obj.getAge());
	}

}
