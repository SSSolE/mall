package product;

public class Singleton {
	
	// 생성자를 선언했으니까 컴파일러가 기본 생성자를 추가하지 않음
	// 생성자의 접근제어자가 private 이므로 이 클래스의 인스턴스는
	// 아무곳에서나 만들 수 없음
	// 이 클래스의 인스턴스를 만들 수 있는 곳은 이 클래스 안 뿐
	private Singleton() {
		
	}
	
	private int id;
	
	// 싱글턴 디자인 패턴이 적용된 클래스의 인스턴스는
	// 해당 클래스가 직접 갖고 있음
	private static Singleton obj;
	
	public static Singleton getInstance() {
		if(obj == null) {
			obj = new Singleton();
		}
		return obj;
	}
	
	public void increase() {
		id++;
	}
	
	public void showInfo() {
		System.out.println("this => " + this);
		System.out.println("id => " + id);
	}
}
