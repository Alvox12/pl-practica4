package alex;

import constructorast.ClaseLexica;

public class ALexOperations {
  private AnalizadorLexico alex;
  public ALexOperations(AnalizadorLexico alex) {
   this.alex = alex;   
  }
  public UnidadLexica unidadId() {
     return new UnidadLexica(alex.fila(),ClaseLexica.IDEN,
                                         alex.lexema()); 
  } 
  public UnidadLexica unidadNum() {
     return new UnidadLexica(alex.fila(),ClaseLexica.NUM,"num"); 
  } 
  public UnidadLexica unidadBool() {
     return new UnidadLexica(alex.fila(),ClaseLexica.BOOL,"bool"); 
  }
  public UnidadLexica unidadAnd() {
	     return new UnidadLexica(alex.fila(),ClaseLexica.AND,"and"); 
	  }
  public UnidadLexica unidadOr() {
	     return new UnidadLexica(alex.fila(),ClaseLexica.OR,"or"); 
	  }
  public UnidadLexica unidadNot() {
	     return new UnidadLexica(alex.fila(),ClaseLexica.NOT,"not"); 
	  }
  public UnidadLexica unidadTrue() {
	     return new UnidadLexica(alex.fila(),ClaseLexica.TRUE,"true"); 
	  }
  public UnidadLexica unidadFalse() {
	     return new UnidadLexica(alex.fila(),ClaseLexica.FALSE,"false"); 
	  }
  public UnidadLexica unidadEnt() {
     return new UnidadLexica(alex.fila(),ClaseLexica.ENT,alex.lexema()); 
  } 
  public UnidadLexica unidadReal() {
     return new UnidadLexica(alex.fila(),ClaseLexica.REAL,alex.lexema()); 
  } 
  public UnidadLexica unidadSuma() {
     return new UnidadLexica(alex.fila(),ClaseLexica.MAS,"+"); 
  } 
  public UnidadLexica unidadResta() {
     return new UnidadLexica(alex.fila(),ClaseLexica.MENOS,"-"); 
  } 
  public UnidadLexica unidadMul() {
     return new UnidadLexica(alex.fila(),ClaseLexica.POR,"*"); 
  } 
  public UnidadLexica unidadDiv() {
     return new UnidadLexica(alex.fila(),ClaseLexica.DIV,"/"); 
  } 
  public UnidadLexica unidadPAp() {
     return new UnidadLexica(alex.fila(),ClaseLexica.PAP,"("); 
  } 
  public UnidadLexica unidadPCierre() {
     return new UnidadLexica(alex.fila(),ClaseLexica.PCIERRE,")"); 
  }
  public UnidadLexica unidadMayor() {
	     return new UnidadLexica(alex.fila(),ClaseLexica.MAYOR,">");     
  }
  public UnidadLexica unidadMenor() {
	     return new UnidadLexica(alex.fila(),ClaseLexica.MENOR,"<");     
  }
  public UnidadLexica unidadMayorIgual() {
	     return new UnidadLexica(alex.fila(),ClaseLexica.MAYIGUAL,">=");     
  } 
  public UnidadLexica unidadMenorIgual() {
	     return new UnidadLexica(alex.fila(),ClaseLexica.MENIGUAL,"<=");     
  } 
  public UnidadLexica unidadEquivalente() {
	     return new UnidadLexica(alex.fila(),ClaseLexica.EQUIVALENTE,"==");     
  }
  public UnidadLexica unidadDiferente() {
		return new UnidadLexica(alex.fila(),ClaseLexica.DIFERENTE,"!=");
}
  public UnidadLexica unidadIgual() {
     return new UnidadLexica(alex.fila(),ClaseLexica.IGUAL,"="); 
  } 
  public UnidadLexica unidadPuntoComa() {
     return new UnidadLexica(alex.fila(),ClaseLexica.PUNTOCOMA,";"); 
  } 
  public UnidadLexica unidadSeparador() {
	     return new UnidadLexica(alex.fila(),ClaseLexica.SEPARADOR,"&&"); 
  } 
  public UnidadLexica unidadEof() {
     return new UnidadLexica(alex.fila(),ClaseLexica.EOF,"<EOF>"); 
  }
  /*public void error() {
    System.err.println("***"+alex.fila()+" Caracter inexperado: "+alex.lexema());
  }*/
}
