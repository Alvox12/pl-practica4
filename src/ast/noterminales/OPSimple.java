package ast.noterminales;

import ast.D2;
import ast.E;
import ast.LD2;
import ast.TipoE;

public class OPSimple extends LD2 {
	
	private D2 d2;
	
	public OPSimple(D2 d2) {
		this.d2 = d2;
	}
	
	public E exp() {return d2.exp();}
	public String id() {return d2.id();}

	@Override
	public String toString() {
		return TipoE.ID.toString() + " = \n " + d2.exp();
	}
	
}
