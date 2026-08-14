public class Punt {
	private int[] coord = new int[2];
	
	public Punt() { }
	
	public Punt(int x, int y) {
		if (x < 0 || y < 0) {
			throw new IllegalArgumentException("El valor de les coordenades ha de ser positiu");
		}
		setX(x);
		setY(y);
	}
	
	public int getX() {
		return coord[0];
	}
	
	public void setX(int x) {
		this.coord[0] = x;
	}
	
	public int getY() {
		return coord[1];
	}
	
	public void setY(int y) {
		this.coord[1] = y;
	}
	
	public void suma(Punt p) {
		this.coord[0] += p.getX();
		this.coord[1] += p.getY();
	}
}
