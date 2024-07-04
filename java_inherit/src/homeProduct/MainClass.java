package homeProduct;

public class MainClass {

	public static void main(String[] args) 
	{
		Tv tv = new Tv();
		tv.brand = "삼성";
		tv.power();
		tv.power();
		System.out.println(tv.brand);
		
		Aircon air = new Aircon();
		air.brand = "LG";
		air.power();
		air.power();
		System.out.println(air.brand);

	}

}

// 클래스 상속
// 상속 하려면 (자식클래스이름) 뒤에 extends (부모클래스이름) 형식
// extends - 확장,연장...
// Tv extends House -> Tv클래스가 자식이고 House가 부모클래스 이다.
// 상속을 하는 가장 큰 이유는 - 다형성
// 부모클래스의 인스턴스 변수, 인스턴스 메서드, 클래스 변수, 클래스 메서드 사용가능하다.
// 단, 부모클래스의 모든걸 사용하지는 못한다. 일부 제어에 걸려있는 변수나 메서드는 사용 불가.

// 생정자메서드를 통해 인스턴스 변수들의 초기화는
// 자식클래스가 가지고 있는 변수는 자식클래스 생성자 메서드에서 초기화
// 부모클래스가 가지고 있는 변수는 부모클래스 생성자 메서드에서 초기화








