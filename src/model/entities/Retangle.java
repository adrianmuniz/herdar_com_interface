package model.entities;

import java.awt.Color;

public class Retangle extends Shape {

	private Double width;
	private Double heigth;
	
	public Retangle(Color color, Double width, Double heigth) {
		super(color);
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

	@Override
	public double area() {
		return width * heigth;
	}
	
}
