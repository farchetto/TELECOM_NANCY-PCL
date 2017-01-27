import org.antlr.runtime.*;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

// HOW TO USE //

/* "java org.antlr.Tool Looc.g" "
puis javac LoocLexer.java LoocParser.java Test.java" 
puis "java Test file" 
avec file le nom du fichier avec du code à tester (situé dans le même répertoire que Test) */

public class Test {
    public static void main(String[] args) throws Exception {
	
	File file = new File(args[0]);
	FileInputStream fis = null;

	fis = new FileInputStream(file);

        ANTLRInputStream input = new ANTLRInputStream(fis);
        LoocLexer lexer = new LoocLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LoocParser parser = new LoocParser(tokens);
        parser.prog();
    }
}
