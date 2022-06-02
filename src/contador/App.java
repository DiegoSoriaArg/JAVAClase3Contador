package contador;

public class App {

	public static void main(String[] args) {
		Contador c = new Contador();
		System.out.println(c.mostrar()); //0
		
		c.contar();
		System.out.println(c.mostrar()); //1
		
		c.contar();
		c.contar();
		c.contar();
		System.out.println(c.mostrar()); //4
		
		c.reiniciar();
		System.out.println(c.mostrar()); //0
	}

}
