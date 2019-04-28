package ast;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import alex.AnalizadorLexico;
import constructorast.ConstructorAST;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Reader input = new InputStreamReader(new FileInputStream("input.txt"));
		AnalizadorLexico alex = new AnalizadorLexico(input);
		ConstructorAST constructorast = new ConstructorAST(alex);
		System.out.println(constructorast.parse().value);
	}

}
