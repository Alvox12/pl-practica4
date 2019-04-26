package ast.noterminales;

import ast.E;
import ast.EBin;
import ast.TipoE;

public class Suma extends EBin{

	public Suma(E opnd1, E opnd2) {
		super(opnd1, opnd2, TipoE.SUMA);
	}

	@Override
	public TipoE tipo() {return TipoE.SUMA;}

}
