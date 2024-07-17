package java0717_3;

public class Product 
{
	private String id;
	private String name;
	private int price;
	
	public Product(String id, String name, int price)
	{
		this.id = id;
		this.name = name;
		this.price = price; 
	}
	
	@Override
	public String toString()
	{
		return "상품번호 : "+id+", 상품 이름 : "+name+", 상품 가격 : "+price;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
		this.price = price;
	}
}
