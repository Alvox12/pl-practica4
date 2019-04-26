package ast.noterminales;

import ast.D;
import ast.LDs;

public class dSimple extends LDs{
 
	private String tipo;
	private String id;
	private D d;
	
	public dSimple(D d) {
		this.d = d;
	}
	
	public String id() {return id;}
	public String tipo() {return tipo;}

	@Override
	public String toString() {
		return d.tipo() + " " + d.id();
	}
	
}
