package ast.terminales;

import ast.TipoVar;
import ast.noterminales.dSimple;

public class BoolSimple extends dSimple{

	public BoolSimple(String id) {
		super(id);
	}

	@Override
	public TipoVar tipo() {
		return TipoVar.BOOL;
	}

}
