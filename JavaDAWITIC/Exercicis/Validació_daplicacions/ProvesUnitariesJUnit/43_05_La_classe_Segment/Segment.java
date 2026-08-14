public class Segment {
	private Punt p1 = new Punt();
	private Punt p2 = new Punt();
	
	public Segment() { }
	
	public Segment(Punt p1, Punt p2) {
		this.p1.setX(p1.getX());
		this.p1.setY(p1.getY());
		this.p2.setX(p2.getX());
		this.p2.setY(p2.getY());
	}
	
	public Punt getP1() {
		return p1;
	}
	
	public void setP1(Punt p1) {
		this.p1 = p1;
	}
	
	public Punt getP2() {
		return p2;
	}
	
	public void setP2(Punt p2) {
		this.p2 = p2;
	}
	
	public double longitud() {
		double resultat = Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2) + Math.pow(p1.getY()-p2.getY(), 2));
		return Math.round(resultat);
	}
	
	public String toString() {
		return String.format("Segment(%s, %s)", p1, p2);
	}
}
