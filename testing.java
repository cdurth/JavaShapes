import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testing {
	public static void main(String[] args){
		ArrayList<shapes> shapesList = new ArrayList<shapes>();
		
		// circle with diameter of 5
		circle testCircle = new circle();
		testCircle.setWidth(5);
		shapesList.add(testCircle);
		
		// rectangle with width of 5 & height of 3
		rectangle testRectangle = new rectangle();
		testRectangle.setHeight(3);
		testRectangle.setWidth(5);
		shapesList.add(testRectangle);
		
		// square with sides of 4
		square testSquare = new square();
		testSquare.setWidth(4);
		shapesList.add(testSquare);
		
		// triangle with base of 4 & height of 6
		triangle testTriangle = new triangle();
		testTriangle.setHeight(6);
		testTriangle.setWidth(4);
		shapesList.add(testTriangle);
		
		// sort using comparator and compareTo function
		Collections.sort(shapesList, new compare());
		
		// print out shapes in ascending order along with type
		for (int i = 0; i < shapesList.size(); i++) {
			System.out.println(shapesList.get(i).getClass().getName() + " " + shapesList.get(i).area());
		}
		
		//System.out.println(testCircle.compareTo(testRectangle));
	}
}
