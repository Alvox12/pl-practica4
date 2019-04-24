package ast.terminales;

import ast.E;
import ast.TipoE;

public class Real extends E{

	private String v;
	
	public Real(String v) {
		this.v = v;
	} 
	 
	public String val() {return v;} 
	
	@Override
	public TipoE tipo() {
		return TipoE.REAL;
	}

}
