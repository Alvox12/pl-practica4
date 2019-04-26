package ast.noterminales;

import ast.E;
import ast.EBin;
import ast.TipoE;

public class Mayor extends EBin{

	public Mayor(E opnd1, E opnd2) {
		super(opnd1, opnd2, TipoE.MAYOR);
	}

	@Override
	public TipoE tipo() {
		return TipoE.MAYOR;
	}

}
