package entities;

public class Rectangle {
	
	private Double width;
	private Double heigth;
	
	public Rectangle() {
	}

	public Rectangle(Double width, Double heigth) {
		this.width = width;
		this.heigth = heigth;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeigth() {
		return heigth;
	}

	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}
	
	public double area() {
		return this.heigth * this.width;
	}
	
	public double diagonal() {
		int diagonal = (int) (Math.sqrt(width * 2) + Math.sqrt(heigth * 2));
		return diagonal;
	}
	
	
	public double perimeter() {
		double perimeter = 2 * (heigth + width);
		return perimeter;
	}
	
	public String toString() {
		return "Area = " + String.format("%.2f", area()) + "\n"
				+ "Perimeter =  " + String.format("%.2f", perimeter()) + "\n"
				+ "Diagonal = " + String.format("%.2f", diagonal());
	}
	
	
	
	
	
	
	

}
