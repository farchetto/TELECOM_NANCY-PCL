package compil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import analysis.SymbolTable;

public class Main {

	public static void main(String[] args) throws IOException, RecognitionException {

		System.setIn(new FileInputStream("Test1"));
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		LoocLexer lexer = new LoocLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LoocParser parser = new LoocParser(tokens);
		LoocParser.prog_return result = parser.prog();
		
		
		//affichage type 1 AST
		CommonTree t = (CommonTree)result.getTree();
		System.out.println("-----AST Visualisation 1-----\n");
		System.out.println(t.toStringTree()+"\n");
		
		//affichage type 2 AST
		System.out.println("-----AST Visualisation 2-----\n");
		ArrayList<Object> children = (ArrayList<Object>) t.getChildren();

		System.out.println("0 " + t);
		printAST(children, 1);
		System.out.println();
		
		//création de la TDS
		SymbolTable st = new SymbolTable();
		System.out.println("-----TDS------\n"+st+"\n");
	}

	@SuppressWarnings("unchecked")
	public static void printAST(ArrayList<Object> children, int level){
		String tab = ""+level;
		for(int i = 0; i < level; i++)
			tab +=  "   ";
		if(children != null){
			for(Object value: children){
				System.out.println(tab + value);
				CommonTree t = (CommonTree) value;
				ArrayList<Object> childs_list = (ArrayList<Object>)t.getChildren();
				if(childs_list != null){
					printAST(childs_list, level+1);
				}
			}
		}
	}

}