public class Punt {
	private int x;
	private int y;
	
	public Punt() { }
	
	public Punt(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void suma(Punt p) {
		this.x += p.getX();
		this.y += p.getY();
	}
	
	public String toString() {
		return String.format("Punt(%d, %d)", x, y);
	}
}
