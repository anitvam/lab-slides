package oop.lab03.interfaces;

public class Rectangle implements IShapeWithLimitedEdges {

	private static final int N_EDGES = 4;
	private final double l1;
	private final double l2;

	public Rectangle(final double l1, final double l2) {
		this.l1 = l1;
		this.l2 = l2;
	}

	public double getArea() {
		return this.l1 * this.l2;
	}

	public double getPerimeter() {
		return (this.l1 + this.l2) * 2;
	}

	public int getNumEdges() {
		return Rectangle.N_EDGES;
	}
}