package ast.noterminales;

import ast.E;
import ast.LD2;
import ast.TipoE;

public class OPSimple extends LD2 {
	
	private E exp;
	private String id;
	
	public OPSimple(String id, E exp) {
		this.id = id;
		this.exp = exp;
	}
	
	public E exp() {return exp;}
	public String id() {return id;}

	@Override
	public String toString() {
		return TipoE.ID.toString() + " (" + exp + ")";
	}
	
}
