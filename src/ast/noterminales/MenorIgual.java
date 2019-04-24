package ast.noterminales;

import ast.E;
import ast.EBin;
import ast.TipoE;

public class MenorIgual extends EBin {

	public MenorIgual(E opnd1, E opnd2) {
		super(opnd1, opnd2);
	}

	@Override
	public TipoE tipo() {
		return TipoE.MENORIGUAL;
	}

}
