package ast.noterminales;

import ast.E;
import ast.EBin;
import ast.TipoE;

public class Or extends EBin{

	public Or(E opnd1, E opnd2) {
		super(opnd1, opnd2);
	}

	@Override
	public TipoE tipo() {
		return TipoE.OR;
	}

}
