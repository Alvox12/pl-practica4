package ast.noterminales;

import ast.E;
import ast.EBin;
import ast.TipoE;

public class Diferente extends EBin{

	public Diferente(E opnd1, E opnd2) {
		super(opnd1, opnd2, TipoE.DIFERENTE);
	}

	@Override
	public TipoE tipo() {
		return TipoE.DIFERENTE;
	}

}
