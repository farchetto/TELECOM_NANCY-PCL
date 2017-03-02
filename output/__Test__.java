import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        LoocLexer lex = new LoocLexer(new ANTLRFileStream("/home/etudiants/devouard1u/workspace/PCL/Fichiers tests/Test1", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        LoocParser g = new LoocParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}