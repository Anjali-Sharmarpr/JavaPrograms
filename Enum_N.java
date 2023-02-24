package PracticeBasic;

//understanding Enum  class 

enum PC{
	Hp(50000), Lenovo(), MacBook(1000000); //objects initializing 
	
	private int price;
    
	private PC() {     //private default constructor
		price=120000;
	}
	private PC(int price) {  //private  parameterized constructors
		this.price = price;
	}
	
	//gettter setter method
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
public class Enum_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PC p = PC.Hp;
		p.setPrice(60000);
		System.out.println(p.getPrice());
		
		for(PC i : PC.values()) {
			System.out.println(i + " : " + i.getPrice());
		}

	}

}
