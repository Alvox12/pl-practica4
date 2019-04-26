package ast.noterminales;

import ast.E;
import ast.EBin;
import ast.TipoE;

public class Mul extends EBin{

	public Mul(E opnd1, E opnd2) {
		super(opnd1, opnd2, TipoE.MUL);
	}

	@Override
	public TipoE tipo() {
		return TipoE.MUL;
	}

}
