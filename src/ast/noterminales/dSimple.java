package ast.noterminales;

import ast.LDs;

public class dSimple extends LDs{
 
	private String tipo;
	private String id;
	
	public dSimple(String tipo, String id) {
		this.tipo = tipo;
		this.id = id;
	}
	
	public String id() {return id;}
	public String tipo() {return tipo;}
	
}
