package ast.terminales;

import ast.E;
import ast.TipoE;

public class False extends E{

	public String val() {return "false";} 
	
	@Override
	public TipoE tipo() {
		return TipoE.FALSE;
	}

}
