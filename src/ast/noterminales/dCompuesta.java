package ast.noterminales;

import ast.D;
import ast.LDs;

public class dCompuesta extends LDs{

	private String tipo;
	private String id;
	private LDs def;
	private D d;
	
	public dCompuesta(LDs def, D d) {
		this.d = d;
		this.def = def;
	}
	
	public String tipo() {return d.tipo();}
	public String id() {return d.id();}
	public LDs def() {return def;}

	@Override
	public String toString() {
		return d.tipo() + " " + d.id() + " " + def.toString();
	}

}
