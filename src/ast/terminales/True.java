package ast.terminales;

import ast.E;
import ast.TipoE;

public class True extends E{

	public String val() {return "true";} 
	
	@Override
	public TipoE tipo() {
		return TipoE.TRUE;
	}

}
