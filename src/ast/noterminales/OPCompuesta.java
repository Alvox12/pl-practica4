package ast.noterminales;

import ast.D2;
import ast.E;
import ast.LD2;
import ast.TipoE;

public class OPCompuesta extends LD2 {

	private LD2 decs;
	private D2 d2;
	
	public OPCompuesta(LD2 decs, D2 d2) {
		this.decs = decs;
		this.d2 = d2;
	}

	public E exp() {return d2.exp();}
	public String id() {return d2.id();}
	public LD2 decs() {return decs;}

	@Override
	public String toString() {
		return TipoE.ID.toString() + " = \n  " + d2.exp() + "\n  "  + decs;
	}
}
