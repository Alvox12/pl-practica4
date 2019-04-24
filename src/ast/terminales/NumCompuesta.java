package ast.terminales;

import ast.LDs;
import ast.TipoVar;
import ast.noterminales.dCompuesta;

public class NumCompuesta extends dCompuesta{

	public NumCompuesta(LDs def, String id) {
		super(def, id);
	}

	@Override
	public TipoVar tipo() {
		return TipoVar.NUM;
	}

}
