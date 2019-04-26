package ast.noterminales;

import ast.E;
import ast.EBin;
import ast.TipoE;

public class Div extends EBin{

	public Div(E opnd1, E opnd2) {
		super(opnd1, opnd2, TipoE.DIV);
	}

	@Override
	public TipoE tipo() {
		return TipoE.DIV;
	}

}
