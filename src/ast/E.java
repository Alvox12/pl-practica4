package ast;

public abstract class E {

	public abstract TipoE tipo(); 
	public E opnd1() {throw new UnsupportedOperationException("opnd1");} 
	public E opnd2() {throw new UnsupportedOperationException("opnd2");}
	public E exp() {throw new UnsupportedOperationException("exp");}
	public LDs def() {throw new UnsupportedOperationException("def");}
	public LD2 defOp() {throw new UnsupportedOperationException("defop");}
	public String id() {throw new UnsupportedOperationException("id");}
	public String val() {throw new UnsupportedOperationException("real, entero o booleano");}
	
	public String toString() {return tipo().toString();}
}
