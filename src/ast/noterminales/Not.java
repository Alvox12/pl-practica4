package ast.noterminales;

import ast.E;
import ast.TipoE;

public class Not extends E{

	private E opnd1;
	
	public Not(E opnd1) {
		this.opnd1 = opnd1;
	}
	
	public E opnd1() {return opnd1;}
	
	@Override
	public TipoE tipo() {
		return TipoE.NOT;
	}
	
	public String toString() {
		return tipo().toString() + " " + "(" + opnd1 + ")";
	}

}
