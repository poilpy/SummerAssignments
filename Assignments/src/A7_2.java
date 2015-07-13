/*
 * Colin Murphy
 * CIS254
 * 6-28-15
 * Harden
 * 
 * This program asks the user to create a rocket by asking the user to input
 * how many stages they want to the rocket and what the width and height should be.
 */

import java.util.Scanner;

public class A7_2 {
	
	public static void main(String[] args) {
		
		int stages;
		int width;
		int height;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of stages : ");
		stages = input.nextInt();
		System.out.print("Enter width of rocket : ");
		width = input.nextInt();
		System.out.print("Enter height of rocket : ");
		height = input.nextInt();
				
		drawRocket(stages, height, width);
		
		input.close();
    }
	
	
	
	
	
	
	// DrawRocket combines the bottom 3 methods below to form the rocket; stages decides how many stages; stageHeight decides the height of each stage; stage width decides the width of each stage
	public static void drawRocket(int stages, int stageHeight, int stageWidth){
		
		
		/*
		int coneHeight;
		boolean odd = false;
		
		if (stageWidth % 2 != 0){
			coneHeight = stageWidth / 2 + 1;
			odd = true;
		}
		else
			coneHeight = stageWidth / 2;
		*/
		
		drawCone();
		for ( int stageCount = 0; stageCount <= stages; stageCount++){
			
			drawHorizontalLine(stageWidth);
			draw2VerticalLines(stageWidth - 2, stageHeight - 2);
			drawHorizontalLine(stageWidth);
		}
		drawCone();
	}
	
	
	
	
	
	
	//drawCone forms the top and bottom of the rocket with 3 Println statements; the extra credit attempt failed
	public static void drawCone(/*int coneHeight, boolean odd, int front*/){
		
		
		System.out.println("  *  ");
		System.out.println(" * * ");
		System.out.println("*   *");

		/*
		if (odd)
			System.out.println("  *  ");
		
		for (int heightCount = 0; heightCount < coneHeight; heightCount++){
			
			for(int frontCount = 0; frontCount < front; frontCount++){
				
				System.out.print(" ");
				front--;
				
			}
			
			System.out.print("*");
			
			for (int spaceCount = 0; spaceCount < heightCount * 2; spaceCount++){    
				
				System.out.print(" ");
				
			}
			
			System.out.println("*");
		}
		*/
	}
	
	
	
	
	
	
	//drawHorizontalLine forms the top and bottom of each stage; width decides how wide the stage is
	public static void drawHorizontalLine(int width) {
		
        for (int count = 0; count < width; count++){
            System.out.print("*");
        }
        System.out.println();
    }
	
	
	
	
	
	
	//draw2VerticalLines forms the middle of each stage; numSpaces is equal to width in drawHorizontalLine; numRows is the height of each stage
	public static void draw2VerticalLines(int numSpaces, int numRows) {
		
        for (int rowCount = 0; rowCount < numRows; rowCount++){    
            drawOneRow(numSpaces);
        }
    }
	
	
	
	
	
	
	//drawOneRow forms each row of the body of each stage; numSpaces decides the space between *
	public static void drawOneRow(int numSpaces) {
		
        System.out.print("*");
        for (int spaceCount = 0; spaceCount < numSpaces; spaceCount++){    
            System.out.print(" ");
        }
        System.out.println("*");
    }
	
}


/*
Enter number of stages : 3
Enter width of rocket : 8
Enter height of rocket : 12
  *  
 * * 
*   *
********
*      *
*      *
*      *
*      *
*      *
*      *
*      *
*      *
*      *
*      *
********
********
*      *
*      *
*      *
*      *
*      *
*      *
*      *
*      *
*      *
*      *
********
********
*      *
*      *
*      *
*      *
*      *
*      *
*      *
*      *
*      *
*      *
********
********
*      *
*      *
*      *
*      *
*      *
*      *
*      *
*      *
*      *
*      *
********
  *  
 * * 
*   *
*/
