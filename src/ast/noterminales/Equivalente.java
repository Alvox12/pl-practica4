package ast.noterminales;

import ast.E;
import ast.EBin;
import ast.TipoE;

public class Equivalente extends EBin{

	public Equivalente(E opnd1, E opnd2) {
		super(opnd1, opnd2, TipoE.EQUIVALENTE);
	}

	@Override
	public TipoE tipo() {
		return TipoE.EQUIVALENTE;
	}

}
