package ast;

public abstract class LDs {
	
	public abstract TipoVar tipo();
	public LDs def() {throw new UnsupportedOperationException("def");}
	public String id() {throw new UnsupportedOperationException("id");}
}
