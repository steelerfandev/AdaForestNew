
public class MouseCoords {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private Place place;

	public MouseCoords(int topx, int topy, int bottomx, int bottomy, Place P) {
		place = P;
		x1 = topx;
		y1 = topy;
		x2 = bottomx;
		y2 = bottomy;
	}

	public int getX1() {
		return this.x1;
	}

	public int getY1() {
		return this.y1;
	}

	public int getX2() {
		return this.x2;
	}

	public int getY2() {
		return this.y2;
	}
	
	public Place getPlace(){
		return this.place;
	}
}
