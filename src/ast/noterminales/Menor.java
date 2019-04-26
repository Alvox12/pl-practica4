package ast.noterminales;

import ast.E;
import ast.EBin;
import ast.TipoE;

public class Menor extends EBin {

	public Menor(E opnd1, E opnd2) {
		super(opnd1, opnd2, TipoE.MENOR);
	}

	@Override
	public TipoE tipo() {
		return TipoE.MENOR;
	}

}
