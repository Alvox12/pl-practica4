package ast.noterminales;

import ast.LDs;

public abstract class dSimple extends LDs{
 
	private String id;
	
	public dSimple(String id) {
		this.id = id;
	}
	
	public String id() {return id;}
}
