package ast.terminales;

import ast.TipoVar;
import ast.noterminales.dSimple;

public class NumSimple extends dSimple{

	
	public NumSimple(String id) {
		super(id);
	}

	@Override
	public TipoVar tipo() {
		return TipoVar.NUM;
	}

}
