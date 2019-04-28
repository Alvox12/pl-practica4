package ast.noterminales;

import ast.D;
import ast.LDs;
import ast.TipoE;
import ast.TipoVar;

public class dSimple extends LDs{
 
	private D d;
	private TipoVar tipo;
	
	public dSimple(D d) {
		this.d = d;
		
		switch(d.tipo()) {
			case "num": tipo = TipoVar.NUM; break;
			case "bool": tipo = TipoVar.BOOL; break;
			default: throw new UnsupportedOperationException("id");
		}
	}
	
	public D d() {return d;}
	
	@Override
	public String toString() {
		return tipo + " " + TipoE.ID.toString();
	}
	
}
