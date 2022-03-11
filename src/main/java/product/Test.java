package product;

public class Test {

	public static void main(String[] args) {
		
		// new 연산자로 인스턴스를 만들 수 없는 클래스의
		// 메서드를 호출하는 방법?
		
		Singleton no1 = Singleton.getInstance();
		
		Singleton no2 = Singleton.getInstance();
		
		no1.increase();
		
		no2.increase();
		no2.increase();
		
		no1.showInfo();
		no2.showInfo();
		
		// new 연산자를 사용하면 인스턴스가 "생성"되고
		// 대입 연산자를 사용해서 생성한 인스턴스의 메모리 주소를 객체(변수)에 저장
//		NoSingleton no1 = new NoSingleton();
//		
//		NoSingleton no2 = new NoSingleton();
//		
//		no1.increse();
//		
//		no2.increse();
//		no2.increse();
//		
//		no1.showInfo();
//		no2.showInfo();
	}
}
