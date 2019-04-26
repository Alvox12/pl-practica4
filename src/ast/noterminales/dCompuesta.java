package ast.noterminales;

import ast.D;
import ast.LDs;
import ast.TipoE;
import ast.TipoVar;

public class dCompuesta extends LDs{

	private TipoVar tipo;
	private LDs def;
	private D d;
	
	public dCompuesta(LDs def, D d) {
		this.d = d;
		this.def = def;
		
		switch(d.tipo()) {
			case "num": tipo = TipoVar.NUM; break;
			case "bool": tipo = TipoVar.BOOL; break;
			default: throw new UnsupportedOperationException("id");
		}
	}
	
	public D d() {return d;}
	public LDs def() {return def;}

	@Override
	public String toString() {
		return tipo + " " + TipoE.ID.toString() + ":" + d.id() + "\n" + def;
	}

}
