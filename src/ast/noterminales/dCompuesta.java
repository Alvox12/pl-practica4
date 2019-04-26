package ast.noterminales;

import ast.LDs;

public class dCompuesta extends LDs{

	private String tipo;
	private String id;
	private LDs def;
	
	public dCompuesta(LDs def, String tipo, String id) {
		this.id = id;
		this.tipo = tipo;
		this.def = def;
	}
	
	public String tipo() {return tipo;}
	public String id() {return id;}
	public LDs def() {return def;}

}
