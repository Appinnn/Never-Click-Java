package java0717_3;

public class CartItem<T extends Product>
{
	private T item;
	private int quantity;
	
	public CartItem( T item, int quantity)
	{
		this.item = item;
		this.quantity = quantity;
	}
	
	
	@Override
	public String toString()
	{
		return "상품 : " + item + " , 수량 : "+ quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public void setItem(T item) {
		this.item = item;
	}



	public T getItem()
	{
		return this.item;
	}
	
	
	
}
