package paint;

public class Main {

	public static void main(String[] args) {
		
		Point pt1 = new Point(10, 50);
//		pt1.setX(10);
//		pt1.setY(50);
		
		drawPoint(pt1);
		
//		pt1.disappear();
		pt1.show(false);
		
//		ColorPoint pt2 = new ColorPoint();
		Point pt2 = new ColorPoint();
		pt2.setX(100);
		pt2.setY(200);
//		pt2.setColor("red");
		((ColorPoint)pt2).setColor("red");
		
//		drawColorPoint(pt2);
		drawPoint(pt2);
		pt2.show(false);
		pt2.show(true);
		
	}
	
	public static void drawPoint(Point pt) {
		pt.show();
	}
	
//	public static void drawColorPoint(ColorPoint pt) {
//		pt.show();
//	}
	
}
