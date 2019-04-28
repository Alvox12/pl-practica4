package ast;

public abstract class EBin extends E{
	private E opnd1;
	private E opnd2; 
	private TipoE tipo;
	
	public EBin(E opnd1, E opnd2, TipoE tipo) {
		this.opnd1 = opnd1;
		this.opnd2 = opnd2;
		this.tipo = tipo;
	}
	
	public E opnd1() {return opnd1;}
	public E opnd2() {return opnd2;}
	
	public String toString() {
		return tipo.toString() + " -->  " + "( " + opnd1 + " " + opnd2 + " )\n";
	}
}
