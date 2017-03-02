// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g 2017-03-02 17:45:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LoocLexer extends Lexer {
    public static final int LT=13;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int IDF=5;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int SUB=8;
    public static final int CSTE_CHAINE=7;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int CSTE_COMM=17;
    public static final int EQ=11;
    public static final int T__50=50;
    public static final int ADD=10;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int GE=16;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int IDF_CLASS=4;
    public static final int MUL=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=18;
    public static final int NEQ=12;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int GT=14;
    public static final int CSTE_ENT=6;
    public static final int LE=15;

    // delegates
    // delegators

    public LoocLexer() {;} 
    public LoocLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LoocLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:3:7: ( 'class' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:3:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:4:7: ( 'inherit' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:4:9: 'inherit'
            {
            match("inherit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:5:7: ( '=' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:5:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:6:7: ( '(' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:6:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:7:7: ( ')' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:7:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:8:7: ( 'var' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:8:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:9:7: ( ':' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:9:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:10:7: ( ';' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:10:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:11:7: ( 'int' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:11:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:12:7: ( 'string' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:12:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:13:7: ( 'method' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:13:9: 'method'
            {
            match("method"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:14:7: ( '{' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:15:7: ( '}' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:16:7: ( ',' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:17:7: ( ':=' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:17:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:18:7: ( 'if' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:18:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:19:7: ( 'then' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:19:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:20:7: ( 'else' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:20:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:21:7: ( 'fi' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:21:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:22:7: ( 'for' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:22:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:23:7: ( 'in' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:23:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:24:7: ( '..' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:24:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:25:7: ( 'do' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:25:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:26:7: ( 'end' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:26:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:27:7: ( 'nil' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:27:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:28:7: ( 'write' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:28:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:29:7: ( 'read' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:29:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:30:7: ( 'return' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:30:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:31:7: ( 'this' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:31:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:32:7: ( 'super' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:32:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:33:7: ( 'new' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:33:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:34:7: ( '.' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:34:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "CSTE_ENT"
    public final void mCSTE_ENT() throws RecognitionException {
        try {
            int _type = CSTE_ENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:87:9: ( ( '0' .. '9' )+ )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:87:20: ( '0' .. '9' )+
            {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:87:20: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:87:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CSTE_ENT"

    // $ANTLR start "CSTE_CHAINE"
    public final void mCSTE_CHAINE() throws RecognitionException {
        try {
            int _type = CSTE_CHAINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:88:12: ( '\"' ( . )+ '\"' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:88:20: '\"' ( . )+ '\"'
            {
            match('\"'); 
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:88:24: ( . )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\"') ) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:88:24: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CSTE_CHAINE"

    // $ANTLR start "CSTE_COMM"
    public final void mCSTE_COMM() throws RecognitionException {
        try {
            int _type = CSTE_COMM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:89:10: ( '/*' ( . )* '*/' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:89:13: '/*' ( . )* '*/'
            {
            match("/*"); 

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:89:18: ( . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:89:18: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CSTE_COMM"

    // $ANTLR start "IDF_CLASS"
    public final void mIDF_CLASS() throws RecognitionException {
        try {
            int _type = IDF_CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:90:10: ( ( 'A' .. 'Z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )* )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:90:20: ( 'A' .. 'Z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:90:20: ( 'A' .. 'Z' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:90:21: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:90:31: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDF_CLASS"

    // $ANTLR start "IDF"
    public final void mIDF() throws RecognitionException {
        try {
            int _type = IDF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:91:4: ( ( 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )* )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:91:20: ( 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:91:20: ( 'a' .. 'z' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:91:21: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:91:31: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDF"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:92:3: ( ( ' ' | '\\t' | '\\n' | CSTE_COMM )+ )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:92:9: ( ' ' | '\\t' | '\\n' | CSTE_COMM )+
            {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:92:9: ( ' ' | '\\t' | '\\n' | CSTE_COMM )+
            int cnt6=0;
            loop6:
            do {
                int alt6=5;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt6=1;
                    }
                    break;
                case '\t':
                    {
                    alt6=2;
                    }
                    break;
                case '\n':
                    {
                    alt6=3;
                    }
                    break;
                case '/':
                    {
                    alt6=4;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:92:10: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:92:14: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:92:19: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;
            	case 4 :
            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:92:24: CSTE_COMM
            	    {
            	    mCSTE_COMM(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:93:4: ( '*' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:93:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:94:4: ( '+' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:94:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:95:4: ( '-' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:95:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:96:3: ( '==' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:96:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:97:4: ( '!=' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:97:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:98:3: ( '<' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:98:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:99:3: ( '>' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:99:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:100:3: ( '<=' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:100:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:101:3: ( '>=' )
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:101:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GE"

    public void mTokens() throws RecognitionException {
        // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | CSTE_ENT | CSTE_CHAINE | CSTE_COMM | IDF_CLASS | IDF | WS | MUL | ADD | SUB | EQ | NEQ | LT | GT | LE | GE )
        int alt7=47;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:118: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:124: T__38
                {
                mT__38(); 

                }
                break;
            case 21 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:130: T__39
                {
                mT__39(); 

                }
                break;
            case 22 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:136: T__40
                {
                mT__40(); 

                }
                break;
            case 23 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:142: T__41
                {
                mT__41(); 

                }
                break;
            case 24 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:148: T__42
                {
                mT__42(); 

                }
                break;
            case 25 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:154: T__43
                {
                mT__43(); 

                }
                break;
            case 26 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:160: T__44
                {
                mT__44(); 

                }
                break;
            case 27 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:166: T__45
                {
                mT__45(); 

                }
                break;
            case 28 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:172: T__46
                {
                mT__46(); 

                }
                break;
            case 29 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:178: T__47
                {
                mT__47(); 

                }
                break;
            case 30 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:184: T__48
                {
                mT__48(); 

                }
                break;
            case 31 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:190: T__49
                {
                mT__49(); 

                }
                break;
            case 32 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:196: T__50
                {
                mT__50(); 

                }
                break;
            case 33 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:202: CSTE_ENT
                {
                mCSTE_ENT(); 

                }
                break;
            case 34 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:211: CSTE_CHAINE
                {
                mCSTE_CHAINE(); 

                }
                break;
            case 35 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:223: CSTE_COMM
                {
                mCSTE_COMM(); 

                }
                break;
            case 36 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:233: IDF_CLASS
                {
                mIDF_CLASS(); 

                }
                break;
            case 37 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:243: IDF
                {
                mIDF(); 

                }
                break;
            case 38 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:247: WS
                {
                mWS(); 

                }
                break;
            case 39 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:250: MUL
                {
                mMUL(); 

                }
                break;
            case 40 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:254: ADD
                {
                mADD(); 

                }
                break;
            case 41 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:258: SUB
                {
                mSUB(); 

                }
                break;
            case 42 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:262: EQ
                {
                mEQ(); 

                }
                break;
            case 43 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:265: NEQ
                {
                mNEQ(); 

                }
                break;
            case 44 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:269: LT
                {
                mLT(); 

                }
                break;
            case 45 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:272: GT
                {
                mGT(); 

                }
                break;
            case 46 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:275: LE
                {
                mLE(); 

                }
                break;
            case 47 :
                // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:1:278: GE
                {
                mGE(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\uffff\2\32\1\46\2\uffff\1\32\1\51\1\uffff\2\32\3\uffff\3\32\1"+
        "\63\4\32\12\uffff\1\73\1\75\1\32\1\101\1\102\2\uffff\1\32\2\uffff"+
        "\6\32\1\113\1\32\2\uffff\1\115\4\32\5\uffff\2\32\1\127\2\uffff\1"+
        "\130\6\32\1\137\1\uffff\1\140\1\uffff\1\141\1\142\3\32\2\uffff\2"+
        "\32\2\uffff\3\32\1\154\1\155\1\156\4\uffff\1\32\1\160\1\32\1\163"+
        "\1\167\2\32\1\172\1\32\3\uffff\1\174\1\uffff\1\32\1\33\1\uffff\2"+
        "\33\2\uffff\1\32\1\u0080\1\uffff\1\u0081\1\uffff\1\u0082\1\uffff"+
        "\1\u0083\4\uffff";
    static final String DFA7_eofS =
        "\u0084\uffff";
    static final String DFA7_minS =
        "\1\11\1\154\1\146\1\75\2\uffff\1\141\1\75\1\uffff\1\164\1\145\3"+
        "\uffff\1\150\1\154\1\151\1\56\1\157\1\145\1\162\1\145\2\uffff\1"+
        "\52\7\uffff\2\75\1\141\2\60\2\uffff\1\162\2\uffff\1\162\1\160\1"+
        "\164\1\145\1\163\1\144\1\60\1\162\2\uffff\1\60\1\154\1\167\1\151"+
        "\1\141\1\0\4\uffff\1\163\1\145\1\60\2\uffff\1\60\1\151\1\145\1\150"+
        "\1\156\1\163\1\145\1\60\1\uffff\1\60\1\uffff\2\60\1\164\1\144\1"+
        "\165\2\0\1\163\1\162\2\uffff\1\156\1\162\1\157\3\60\4\uffff\1\145"+
        "\1\60\1\162\1\0\1\60\1\151\1\147\1\60\1\144\3\uffff\1\60\1\uffff"+
        "\1\156\1\0\1\uffff\3\0\1\uffff\1\164\1\60\1\uffff\1\60\1\uffff\1"+
        "\60\1\0\1\60\4\uffff";
    static final String DFA7_maxS =
        "\1\175\1\154\1\156\1\75\2\uffff\1\141\1\75\1\uffff\1\165\1\145\3"+
        "\uffff\1\150\1\156\1\157\1\56\1\157\1\151\1\162\1\145\2\uffff\1"+
        "\52\7\uffff\2\75\1\141\2\172\2\uffff\1\162\2\uffff\1\162\1\160\1"+
        "\164\1\151\1\163\1\144\1\172\1\162\2\uffff\1\172\1\154\1\167\1\151"+
        "\1\164\1\uffff\4\uffff\1\163\1\145\1\172\2\uffff\1\172\1\151\1\145"+
        "\1\150\1\156\1\163\1\145\1\172\1\uffff\1\172\1\uffff\2\172\1\164"+
        "\1\144\1\165\2\uffff\1\163\1\162\2\uffff\1\156\1\162\1\157\3\172"+
        "\4\uffff\1\145\1\172\1\162\1\uffff\1\172\1\151\1\147\1\172\1\144"+
        "\3\uffff\1\172\1\uffff\1\156\1\uffff\1\uffff\3\uffff\1\uffff\1\164"+
        "\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\4\uffff";
    static final String DFA7_acceptS =
        "\4\uffff\1\4\1\5\2\uffff\1\10\2\uffff\1\14\1\15\1\16\10\uffff\1"+
        "\41\1\42\1\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\53\5\uffff\1\52"+
        "\1\3\1\uffff\1\17\1\7\10\uffff\1\26\1\40\6\uffff\1\56\1\54\1\57"+
        "\1\55\3\uffff\1\25\1\20\10\uffff\1\23\1\uffff\1\27\11\uffff\1\11"+
        "\1\6\6\uffff\1\30\1\24\1\31\1\37\11\uffff\1\21\1\35\1\22\1\uffff"+
        "\1\33\2\uffff\1\43\3\uffff\1\1\2\uffff\1\36\1\uffff\1\32\3\uffff"+
        "\1\12\1\13\1\34\1\2";
    static final String DFA7_specialS =
        "\71\uffff\1\3\31\uffff\1\6\1\2\21\uffff\1\10\13\uffff\1\7\1\uffff"+
        "\1\5\1\4\1\1\7\uffff\1\0\5\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\33\25\uffff\1\33\1\37\1\27\5\uffff\1\4\1\5\1\34\1\35\1\15"+
            "\1\36\1\21\1\30\12\26\1\7\1\10\1\40\1\3\1\41\2\uffff\32\31\6"+
            "\uffff\2\32\1\1\1\22\1\17\1\20\2\32\1\2\3\32\1\12\1\23\3\32"+
            "\1\25\1\11\1\16\1\32\1\6\1\24\3\32\1\13\1\uffff\1\14",
            "\1\42",
            "\1\44\7\uffff\1\43",
            "\1\45",
            "",
            "",
            "\1\47",
            "\1\50",
            "",
            "\1\52\1\53",
            "\1\54",
            "",
            "",
            "",
            "\1\55",
            "\1\56\1\uffff\1\57",
            "\1\60\5\uffff\1\61",
            "\1\62",
            "\1\64",
            "\1\66\3\uffff\1\65",
            "\1\67",
            "\1\70",
            "",
            "",
            "\1\71",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\72",
            "\1\74",
            "\1\76",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\7\32\1\77\13\32\1"+
            "\100\6\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\1\103",
            "",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107\3\uffff\1\110",
            "\1\111",
            "\1\112",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\114",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121\22\uffff\1\122",
            "\52\124\1\123\uffd5\124",
            "",
            "",
            "",
            "",
            "\1\125",
            "\1\126",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\143",
            "\1\144",
            "\1\145",
            "\52\124\1\123\4\124\1\146\uffd0\124",
            "\52\124\1\123\uffd5\124",
            "\1\147",
            "\1\150",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "",
            "\1\157",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\161",
            "\11\124\1\164\1\165\25\124\1\162\11\124\1\123\4\124\1\166\uffd0"+
            "\124",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\170",
            "\1\171",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\173",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\175",
            "\11\124\1\164\1\165\25\124\1\162\11\124\1\123\4\124\1\166\uffd0"+
            "\124",
            "",
            "\11\124\1\164\1\165\25\124\1\162\11\124\1\123\4\124\1\166\uffd0"+
            "\124",
            "\11\124\1\164\1\165\25\124\1\162\11\124\1\123\4\124\1\166\uffd0"+
            "\124",
            "\52\124\1\176\uffd5\124",
            "",
            "\1\177",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\52\124\1\123\4\124\1\146\uffd0\124",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | CSTE_ENT | CSTE_CHAINE | CSTE_COMM | IDF_CLASS | IDF | WS | MUL | ADD | SUB | EQ | NEQ | LT | GT | LE | GE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_126 = input.LA(1);

                        s = -1;
                        if ( (LA7_126=='/') ) {s = 102;}

                        else if ( (LA7_126=='*') ) {s = 83;}

                        else if ( ((LA7_126>='\u0000' && LA7_126<=')')||(LA7_126>='+' && LA7_126<='.')||(LA7_126>='0' && LA7_126<='\uFFFF')) ) {s = 84;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_118 = input.LA(1);

                        s = -1;
                        if ( (LA7_118=='*') ) {s = 126;}

                        else if ( ((LA7_118>='\u0000' && LA7_118<=')')||(LA7_118>='+' && LA7_118<='\uFFFF')) ) {s = 84;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_84 = input.LA(1);

                        s = -1;
                        if ( (LA7_84=='*') ) {s = 83;}

                        else if ( ((LA7_84>='\u0000' && LA7_84<=')')||(LA7_84>='+' && LA7_84<='\uFFFF')) ) {s = 84;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_57 = input.LA(1);

                        s = -1;
                        if ( (LA7_57=='*') ) {s = 83;}

                        else if ( ((LA7_57>='\u0000' && LA7_57<=')')||(LA7_57>='+' && LA7_57<='\uFFFF')) ) {s = 84;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_117 = input.LA(1);

                        s = -1;
                        if ( (LA7_117==' ') ) {s = 114;}

                        else if ( (LA7_117=='\t') ) {s = 116;}

                        else if ( (LA7_117=='\n') ) {s = 117;}

                        else if ( (LA7_117=='/') ) {s = 118;}

                        else if ( (LA7_117=='*') ) {s = 83;}

                        else if ( ((LA7_117>='\u0000' && LA7_117<='\b')||(LA7_117>='\u000B' && LA7_117<='\u001F')||(LA7_117>='!' && LA7_117<=')')||(LA7_117>='+' && LA7_117<='.')||(LA7_117>='0' && LA7_117<='\uFFFF')) ) {s = 84;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_116 = input.LA(1);

                        s = -1;
                        if ( (LA7_116==' ') ) {s = 114;}

                        else if ( (LA7_116=='\t') ) {s = 116;}

                        else if ( (LA7_116=='\n') ) {s = 117;}

                        else if ( (LA7_116=='/') ) {s = 118;}

                        else if ( (LA7_116=='*') ) {s = 83;}

                        else if ( ((LA7_116>='\u0000' && LA7_116<='\b')||(LA7_116>='\u000B' && LA7_116<='\u001F')||(LA7_116>='!' && LA7_116<=')')||(LA7_116>='+' && LA7_116<='.')||(LA7_116>='0' && LA7_116<='\uFFFF')) ) {s = 84;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_83 = input.LA(1);

                        s = -1;
                        if ( (LA7_83=='/') ) {s = 102;}

                        else if ( (LA7_83=='*') ) {s = 83;}

                        else if ( ((LA7_83>='\u0000' && LA7_83<=')')||(LA7_83>='+' && LA7_83<='.')||(LA7_83>='0' && LA7_83<='\uFFFF')) ) {s = 84;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA7_114 = input.LA(1);

                        s = -1;
                        if ( (LA7_114=='*') ) {s = 83;}

                        else if ( (LA7_114==' ') ) {s = 114;}

                        else if ( (LA7_114=='\t') ) {s = 116;}

                        else if ( (LA7_114=='\n') ) {s = 117;}

                        else if ( (LA7_114=='/') ) {s = 118;}

                        else if ( ((LA7_114>='\u0000' && LA7_114<='\b')||(LA7_114>='\u000B' && LA7_114<='\u001F')||(LA7_114>='!' && LA7_114<=')')||(LA7_114>='+' && LA7_114<='.')||(LA7_114>='0' && LA7_114<='\uFFFF')) ) {s = 84;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA7_102 = input.LA(1);

                        s = -1;
                        if ( (LA7_102=='*') ) {s = 83;}

                        else if ( (LA7_102==' ') ) {s = 114;}

                        else if ( (LA7_102=='\t') ) {s = 116;}

                        else if ( (LA7_102=='\n') ) {s = 117;}

                        else if ( (LA7_102=='/') ) {s = 118;}

                        else if ( ((LA7_102>='\u0000' && LA7_102<='\b')||(LA7_102>='\u000B' && LA7_102<='\u001F')||(LA7_102>='!' && LA7_102<=')')||(LA7_102>='+' && LA7_102<='.')||(LA7_102>='0' && LA7_102<='\uFFFF')) ) {s = 84;}

                        else s = 115;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}