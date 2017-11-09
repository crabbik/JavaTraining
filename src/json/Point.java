package json;

public class Point {

	@Override
	public String toString() {
		return "Point [" + x + ", " + y + ", " + unit + ", colored="
				+ colored + "]";
	}

	private int x;
	private int y;
	private String unit;
	private boolean colored;

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

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public boolean isColored() {
		return colored;
	}

	public void setColored(boolean colored) {
		this.colored = colored;
	}
}
