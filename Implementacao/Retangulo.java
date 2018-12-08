package Implementacao;

import Abstrato.Forma;

public class Retangulo extends Forma {

	public Retangulo(int coordenadaX, int coordenadaY) {
		super(coordenadaX, coordenadaY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getArea() {
		return this.Area;
	}

	@Override
	public void setArea(float area) {
		// TODO Auto-generated method stub
		this.Area = area;

	}

	@Override
	public float getPerimetro() {
		// TODO Auto-generated method stub
		return this.Perimetro;
	}

	@Override
	public void setPerimetro(float perimetro) {
		// TODO Auto-generated method stub
		this.Perimetro = perimetro;

	}

}
