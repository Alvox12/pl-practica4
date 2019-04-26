package ast;

public class S {

	private LD2 decs;
	private LDs def;
	
	public S(LDs def, LD2 decs) {
		this.def = def;
		this.decs = decs;
	}
	
	public LD2 decs() {return decs;}
	public LDs def() {return def;}
}
