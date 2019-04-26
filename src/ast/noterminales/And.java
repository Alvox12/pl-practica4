package ast.noterminales;

import ast.E;
import ast.EBin;
import ast.TipoE;

public class And extends EBin{

	public And(E opnd1, E opnd2) {
		super(opnd1, opnd2, TipoE.AND);
	}

	@Override
	public TipoE tipo() {
		return TipoE.AND;
	}
	
}
