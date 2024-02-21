package logica;

public abstract class Persona {
	
	protected double peso;
	protected int altura;
	protected int edad;
	
	public void setPeso(double kg) {
		this.peso= kg;
	}

	public double getPeso() {
		return peso;
	}
	public void setAltura(int cm) {
		this.altura= cm;
	}

	public int getAltura() {
		return altura;
	}
	public void setEdad(int anios) {
		this.edad= anios;
	}

	public int getEdad() {
		return edad;
	}
	public Persona(double peso, int altura, int edad) {
		this.edad=edad;
		this.peso=peso;
		this.altura=altura;
	}
	
	public abstract double calcularTMB();
}