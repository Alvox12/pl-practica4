package ast;

public class D {

	private String tipo;
	private String id;
	
	public D(String tipo, String id) {
		this.tipo = tipo;
		this.id = id;
	}
	
	public String tipo() {
		return tipo;
	}
	
	public String id() {
		return id;
	}
}
