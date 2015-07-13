
public class test {

	 public static void main(String[] args) {

		 for(int i=1; i<=4; i++){
		         for(int j=1; j<=4; i++){
		             if((i==1||i==4)&&(j==1||j==4)){
		                 System.out.print("*");
		             }
		             else{
		                     System.out.print(" ");
		                 }
		             System.out.println();
		         }
		 }
	 }
}

