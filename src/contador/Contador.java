package contador;

public class Contador {
	private int valor = 0;

	public void contar() {
		this.valor++;
	}
	
	public void reiniciar() {
		this.valor = 0;
	}
	
	public short mostrar() {
		return (short) this.valor ;
	}
	
	public int mostrarEnGrande() {
		return this.valor ;
	}
}
