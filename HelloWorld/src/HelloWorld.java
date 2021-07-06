
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		//prints something less than 1 like 0.89
		System.out.println(Math.random());
		//Comes up with a number just less than 6 
		System.out.println(Math.random() * 6);
		//We add one to include 6 and convert into int
		System.out.println((int)(Math.random() * 6 + 1));
		//How come zero does not show up? - Because we added 1 to it
		System.out.println((int)(2.9));

	}

}
