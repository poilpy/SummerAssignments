
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
	
	public static void drawRocket(int stages, int stageHeight, int stageWidth){
		
		int coneHeight;
		
		if (stageWidth % 2 != 0)
			coneHeight = stageWidth / 2 + 1;
		else
			coneHeight = stageWidth / 2;
		
		drawCone(coneHeight);
		for ( int stageCount = 1; stageCount <= stages; stageCount++){
			
			drawHorizontalLine(stageWidth);
			draw2VerticalLines(stageWidth - 2, stageHeight - 2);
			drawHorizontalLine(stageWidth);
		}
		drawCone(coneHeight);
	}
	
	public static void drawCone(int coneHeight){
		
		if ( coneHeight % 2 != 0)
			System.out.println("  *  ");
		
		for (int heightCount = 0; heightCount < coneHeight; heightCount++){
			System.out.print("*");
			for (int spaceCount = 0; spaceCount < heightCount; spaceCount++){    
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
	
	public static void drawHorizontalLine(int width) {
		
        for (int count = 0; count < width; count++){
            System.out.print("*");
        }
        System.out.println();
    }

	public static void draw2VerticalLines(int numSpaces, int numRows) {
		
        for (int rowCount = 0; rowCount < numRows; rowCount++){    
            drawOneRow(numSpaces);
        }
    }

	public static void drawOneRow(int numSpaces) {
		
        System.out.print("*");
        for (int spaceCount = 0; spaceCount < numSpaces; spaceCount++){    
            System.out.print(" ");
        }
        System.out.println("*");
    }
	
}
