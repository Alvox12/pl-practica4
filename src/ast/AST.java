package ast;

import ast.noterminales.*;
import ast.terminales.*;

public class AST {
	public E suma(E opnd1, E opnd2) {return new Suma(opnd1,opnd2);}
	public E resta(E opnd1, E opnd2) {return new Resta(opnd1,opnd2);}
	public E mul(E opnd1, E opnd2) {return new Mul(opnd1,opnd2);}
	public E div(E opnd1, E opnd2) {return new Div(opnd1,opnd2);}
	public E mayor(E opnd1, E opnd2) {return new Mayor(opnd1,opnd2);}
	public E menor(E opnd1, E opnd2) {return new Menor(opnd1,opnd2);}
	public E mayorIgual(E opnd1, E opnd2) {return new MayorIgual(opnd1,opnd2);}
	public E menorIgual(E opnd1, E opnd2) {return new MenorIgual(opnd1,opnd2);}
	public E dif(E opnd1, E opnd2) {return new Diferente(opnd1,opnd2);}
	public E eq(E opnd1, E opnd2) {return new Equivalente(opnd1,opnd2);}
	public E and(E opnd1, E opnd2) {return new And(opnd1,opnd2);}
	public E or(E opnd1, E opnd2) {return new Or(opnd1,opnd2);}
	public E not(E opnd1) {return new Not(opnd1);}
	
	public E entero(String ent) {return new Entero(ent);}
	public E real(String d) {return new Real(d);}
	public E id(String id) {return new Id(id);} 
	public E boolTrue(String b) {return new True();}
	public E boolFalse(String b) {return new False();} 
	
	public LDs defCompuesta(LDs def, D d) {
		return new dCompuesta(def, d);
	}
	
	public LDs defSimple(D d) {
		return new dSimple(d);
	}
	
	public LD2 cCompuesta(LD2 decs, D2 d2) {
		 return new OPCompuesta(decs,d2);}
	
	public LD2 cSimple(D2 d2) {return new OPSimple(d2);} 
}



