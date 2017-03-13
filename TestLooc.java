import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.io.File;
import java.io.FileInputStream;
public class TestLooc {
public static void main(String[] args) throws Exception {
// create the lexer attached to stdin
//ANTLRInputStream input = new ANTLRInputStream(System.in);
String fileName = "Test1.txt";
File file = new File(fileName);
FileInputStream fis = new FileInputStream(file);
ANTLRInputStream input = new ANTLRInputStream(fis);
LoocLexer lexer = new LoocLexer(input);
// create the buffer of tokens between the lexer and parser
CommonTokenStream tokens = new CommonTokenStream(lexer);
// create the parser attached to the token buffer
LoocParser parser = new LoocParser(tokens);
// launch the parser starting at rule r, get return object
LoocParser.prog_return result = parser.prog();
// pull out the tree and cast it
Tree t = (Tree)result.getTree();
System.out.println(t.toStringTree()); // print out the tree
}
}
