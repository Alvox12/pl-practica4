package ast.noterminales;

import ast.E;
import ast.LD2;

public class OPCompuesta extends LD2 {

	private E exp;
	private String id;
	private LD2 decs;
	
	public OPCompuesta(LD2 decs, String id, E exp) {
		this.decs = decs;
		this.id = id;
		this.exp = exp;
	}

	public E exp() {return exp;}
	public String id() {return id;}
	public LD2 decs() {return decs;}
}
