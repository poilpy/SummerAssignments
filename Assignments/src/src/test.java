
public class test {

	public static void main(String[] args){
		
		int i;
		int j;
		int n = 200;
		
		for ( i = 1; i <= n; i++){
			System.out.println("*");
			for ( j = 1; j <= i; j++)
				System.out.print("*");
		}
		System.out.print("*");
	}
}
