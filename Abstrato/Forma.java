package Abstrato;

public abstract class Forma {
	protected float Area;
	protected float Perimetro;
	protected int CoordenadaX;
	protected int CoordenadaY;
	
	// Métodos abstratos que precisam ser implentados por herança
	public abstract float getArea();
	public abstract void setArea(float area);
	public abstract float getPerimetro();
	public abstract void setPerimetro(float perimetro) ;
	
	
	public int getCoordenadaX() {
		return CoordenadaX;
	}
	public void setCoordenadaX(int coordenadaX) {
		CoordenadaX = coordenadaX;
	}
	public int getCoordenadaY() {
		return CoordenadaY;
	}
	public void setCoordenadaY(int coordenadaY) {
		CoordenadaY = coordenadaY;
	}
	public Forma( int coordenadaX, int coordenadaY) {
		CoordenadaX = coordenadaX;
		CoordenadaY = coordenadaY;
	}
	

}
