package ast.terminales;

import ast.E;
import ast.TipoE;

public class Id extends E{

	private String v;
	
	public Id(String v) {
		this.v = v;
	}
	
	public String val() {return v;} 
	
	@Override
	public TipoE tipo() {
		return TipoE.ID;
	}

}
