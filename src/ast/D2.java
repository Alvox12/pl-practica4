package ast;

public class D2 {

	private E exp;
	private String id;
	
	public D2(String id, E exp) {
		this.id = id;
		this.exp = exp;
	}
	
	public E exp() {
		return exp;
	}
	
	public String id() {
		return id;
	}
}
