package ast.noterminales;

import ast.E;
import ast.EBin;
import ast.TipoE;

public class Resta extends EBin{

	public Resta(E opnd1, E opnd2) {
		super(opnd1, opnd2, TipoE.RESTA);
	}

	@Override
	public TipoE tipo() {
		return TipoE.RESTA;
	}

}
