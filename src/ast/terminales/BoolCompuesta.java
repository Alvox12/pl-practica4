package ast.terminales;

import ast.LDs;
import ast.TipoVar;
import ast.noterminales.dCompuesta;

public class BoolCompuesta extends dCompuesta{

	public BoolCompuesta(LDs def, String id) {
		super(def, id);
	}

	@Override
	public TipoVar tipo() {
		return TipoVar.BOOL;
	}

}
