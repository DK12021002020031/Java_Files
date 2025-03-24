package conditional_statements;

public class MathClass {

	public static void main(String[] args) {
		
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(10, 20));
		System.out.println(Math.round(25.36));
		System.out.println(Math.round(25.87));
		System.out.println(Math.ceil(10.56));
		System.out.println(Math.floor(10.56));
		System.out.println(Math.abs(-90));
		System.out.println(Math.subtractExact(10, 20));

		absolute(subtract(10,20));
	}
	
	public static void absolute(int x) {
		
		System.out.println(Math.abs(x));
	}
	
    public static int subtract(int x,int y) {
		
		return Math.subtractExact(x,y);
	}

}
