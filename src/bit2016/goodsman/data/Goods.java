package bit2016.goodsman.data;

public class Goods {
	public Goods(){
		System.out.println("생성자 호출");
		count++;
	}
	public static int count;
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;

	//Customer c = new Customer();
	//c.phone="asd";
	
	void set(){
		Customer c = new Customer();
		c.phone = "sdf";
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		// 정보 보호
		if( price < 0){
			price = 0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	
}
