
public class Driver {

	public static void main(String[] args) {
		Number num = new Number();
		System.out.println(num);
		System.out.println(num.x);
		System.out.println(num.word);
		num.x = 7;
		System.out.println(num.x);
		
		Car car1 = new Car();
		car1.fullThrottle();
		car1.speed(200);

	}

}
