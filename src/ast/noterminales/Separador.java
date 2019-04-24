package ast.noterminales;

import ast.LD2;
import ast.LDs;
import ast.S;

public class Separador extends S{

	private LDs def;
	private LD2 decs;
	
	public Separador(LDs def, LD2 decs) {
		this.def = def;
		this.decs = decs;
	}
	
	public LD2 decs() {return decs;}
	public LDs def() {return def;}
	
}
