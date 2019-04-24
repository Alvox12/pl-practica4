package ast.noterminales;

import ast.LDs;

public abstract class dCompuesta extends LDs{

	private String id;
	private LDs def;
	
	public dCompuesta(LDs def, String id) {
		this.id = id;
		this.def = def;
	}
	
	public String id() {return id;}
	public LDs def() {return def;}

}
