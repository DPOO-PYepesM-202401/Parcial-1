package pruebas;
import logica.Persona;
import logica.Mujer;
import logica.Hombre;


public class pruebas {

	public static void main(String[] args) {
		Persona p;
		p=new Mujer(40,140,45);
		System.out.println(p.calcularTMB());
		p=new Mujer(40.5,140,45);
		System.out.println(p.calcularTMB());
		p=new Hombre(40,140,45);
		System.out.println(p.calcularTMB());
		p=new Hombre(40.5,140,45);
		System.out.println(p.calcularTMB());
}
}