// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g 2017-03-02 17:45:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class LoocParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDF_CLASS", "IDF", "CSTE_ENT", "CSTE_CHAINE", "SUB", "MUL", "ADD", "EQ", "NEQ", "LT", "GT", "LE", "GE", "CSTE_COMM", "WS", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'..'", "'do'", "'end'", "'nil'", "'write'", "'read'", "'return'", "'this'", "'super'", "'new'", "'.'"
    };
    public static final int LT=13;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int IDF=5;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int SUB=8;
    public static final int EOF=-1;
    public static final int CSTE_CHAINE=7;
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

    public static final String[] ruleNames = new String[] {
        "invalidRule", "print_func_suite", "return_func", "read_func", "expr_optionnal_func", 
        "mult_expression", "instruction", "class_decl", "method_decl", "method_decl_suite", 
        "add", "multi", "expr", "class_item_decl", "var_decl", "comp", "print_func", 
        "method_args", "expression", "instruction_suite", "prog", "add_expression", 
        "type"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public LoocParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public LoocParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public LoocParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return LoocParser.tokenNames; }
    public String getGrammarFileName() { return "/home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:8:1: prog : ( class_decl )* ( var_decl )* ( instruction )+ ;
    public final LoocParser.prog_return prog() throws RecognitionException {
        LoocParser.prog_return retval = new LoocParser.prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LoocParser.class_decl_return class_decl1 = null;

        LoocParser.var_decl_return var_decl2 = null;

        LoocParser.instruction_return instruction3 = null;



        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(8, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:8:5: ( ( class_decl )* ( var_decl )* ( instruction )+ )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:8:20: ( class_decl )* ( var_decl )* ( instruction )+
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(8,20);
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:8:20: ( class_decl )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:8:20: class_decl
            	    {
            	    dbg.location(8,20);
            	    pushFollow(FOLLOW_class_decl_in_prog46);
            	    class_decl1=class_decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, class_decl1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(8,32);
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:8:32: ( var_decl )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:8:32: var_decl
            	    {
            	    dbg.location(8,32);
            	    pushFollow(FOLLOW_var_decl_in_prog49);
            	    var_decl2=var_decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, var_decl2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(8,42);
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:8:42: ( instruction )+
            int cnt3=0;
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDF||LA3_0==30||LA3_0==34||LA3_0==38||LA3_0==41||(LA3_0>=44 && LA3_0<=46)) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:8:42: instruction
            	    {
            	    dbg.location(8,42);
            	    pushFollow(FOLLOW_instruction_in_prog52);
            	    instruction3=instruction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, instruction3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt3++;
            } while (true);
            } finally {dbg.exitSubRule(3);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(8, 54);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prog"

    public static class class_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_decl"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:10:1: class_decl : 'class' IDF_CLASS ( 'inherit' IDF_CLASS )? '=' '(' class_item_decl ')' ;
    public final LoocParser.class_decl_return class_decl() throws RecognitionException {
        LoocParser.class_decl_return retval = new LoocParser.class_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal4=null;
        Token IDF_CLASS5=null;
        Token string_literal6=null;
        Token IDF_CLASS7=null;
        Token char_literal8=null;
        Token char_literal9=null;
        Token char_literal11=null;
        LoocParser.class_item_decl_return class_item_decl10 = null;


        Object string_literal4_tree=null;
        Object IDF_CLASS5_tree=null;
        Object string_literal6_tree=null;
        Object IDF_CLASS7_tree=null;
        Object char_literal8_tree=null;
        Object char_literal9_tree=null;
        Object char_literal11_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "class_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(10, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:10:11: ( 'class' IDF_CLASS ( 'inherit' IDF_CLASS )? '=' '(' class_item_decl ')' )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:10:20: 'class' IDF_CLASS ( 'inherit' IDF_CLASS )? '=' '(' class_item_decl ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(10,20);
            string_literal4=(Token)match(input,19,FOLLOW_19_in_class_decl67); 
            string_literal4_tree = (Object)adaptor.create(string_literal4);
            adaptor.addChild(root_0, string_literal4_tree);

            dbg.location(10,28);
            IDF_CLASS5=(Token)match(input,IDF_CLASS,FOLLOW_IDF_CLASS_in_class_decl69); 
            IDF_CLASS5_tree = (Object)adaptor.create(IDF_CLASS5);
            adaptor.addChild(root_0, IDF_CLASS5_tree);

            dbg.location(10,38);
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:10:38: ( 'inherit' IDF_CLASS )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:10:40: 'inherit' IDF_CLASS
                    {
                    dbg.location(10,40);
                    string_literal6=(Token)match(input,20,FOLLOW_20_in_class_decl73); 
                    string_literal6_tree = (Object)adaptor.create(string_literal6);
                    adaptor.addChild(root_0, string_literal6_tree);

                    dbg.location(10,50);
                    IDF_CLASS7=(Token)match(input,IDF_CLASS,FOLLOW_IDF_CLASS_in_class_decl75); 
                    IDF_CLASS7_tree = (Object)adaptor.create(IDF_CLASS7);
                    adaptor.addChild(root_0, IDF_CLASS7_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(10,63);
            char_literal8=(Token)match(input,21,FOLLOW_21_in_class_decl80); 
            char_literal8_tree = (Object)adaptor.create(char_literal8);
            adaptor.addChild(root_0, char_literal8_tree);

            dbg.location(10,67);
            char_literal9=(Token)match(input,22,FOLLOW_22_in_class_decl82); 
            char_literal9_tree = (Object)adaptor.create(char_literal9);
            adaptor.addChild(root_0, char_literal9_tree);

            dbg.location(10,71);
            pushFollow(FOLLOW_class_item_decl_in_class_decl84);
            class_item_decl10=class_item_decl();

            state._fsp--;

            adaptor.addChild(root_0, class_item_decl10.getTree());
            dbg.location(10,87);
            char_literal11=(Token)match(input,23,FOLLOW_23_in_class_decl86); 
            char_literal11_tree = (Object)adaptor.create(char_literal11);
            adaptor.addChild(root_0, char_literal11_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(10, 90);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "class_decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "class_decl"

    public static class class_item_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_item_decl"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:12:1: class_item_decl : ( var_decl )* ( method_decl )* ;
    public final LoocParser.class_item_decl_return class_item_decl() throws RecognitionException {
        LoocParser.class_item_decl_return retval = new LoocParser.class_item_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LoocParser.var_decl_return var_decl12 = null;

        LoocParser.method_decl_return method_decl13 = null;



        try { dbg.enterRule(getGrammarFileName(), "class_item_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:12:16: ( ( var_decl )* ( method_decl )* )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:12:20: ( var_decl )* ( method_decl )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(12,20);
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:12:20: ( var_decl )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:12:20: var_decl
            	    {
            	    dbg.location(12,20);
            	    pushFollow(FOLLOW_var_decl_in_class_item_decl97);
            	    var_decl12=var_decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, var_decl12.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}

            dbg.location(12,30);
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:12:30: ( method_decl )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:12:30: method_decl
            	    {
            	    dbg.location(12,30);
            	    pushFollow(FOLLOW_method_decl_in_class_item_decl100);
            	    method_decl13=method_decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, method_decl13.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(12, 43);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "class_item_decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "class_item_decl"

    public static class var_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_decl"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:14:1: var_decl : 'var' IDF ':' type ';' ;
    public final LoocParser.var_decl_return var_decl() throws RecognitionException {
        LoocParser.var_decl_return retval = new LoocParser.var_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal14=null;
        Token IDF15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        LoocParser.type_return type17 = null;


        Object string_literal14_tree=null;
        Object IDF15_tree=null;
        Object char_literal16_tree=null;
        Object char_literal18_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "var_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:14:9: ( 'var' IDF ':' type ';' )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:14:20: 'var' IDF ':' type ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(14,20);
            string_literal14=(Token)match(input,24,FOLLOW_24_in_var_decl118); 
            string_literal14_tree = (Object)adaptor.create(string_literal14);
            adaptor.addChild(root_0, string_literal14_tree);

            dbg.location(14,26);
            IDF15=(Token)match(input,IDF,FOLLOW_IDF_in_var_decl120); 
            IDF15_tree = (Object)adaptor.create(IDF15);
            adaptor.addChild(root_0, IDF15_tree);

            dbg.location(14,30);
            char_literal16=(Token)match(input,25,FOLLOW_25_in_var_decl122); 
            char_literal16_tree = (Object)adaptor.create(char_literal16);
            adaptor.addChild(root_0, char_literal16_tree);

            dbg.location(14,34);
            pushFollow(FOLLOW_type_in_var_decl124);
            type17=type();

            state._fsp--;

            adaptor.addChild(root_0, type17.getTree());
            dbg.location(14,39);
            char_literal18=(Token)match(input,26,FOLLOW_26_in_var_decl126); 
            char_literal18_tree = (Object)adaptor.create(char_literal18);
            adaptor.addChild(root_0, char_literal18_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(14, 43);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "var_decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "var_decl"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:16:1: type : ( IDF_CLASS | 'int' | 'string' );
    public final LoocParser.type_return type() throws RecognitionException {
        LoocParser.type_return retval = new LoocParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set19=null;

        Object set19_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:16:5: ( IDF_CLASS | 'int' | 'string' )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(16,5);
            set19=(Token)input.LT(1);
            if ( input.LA(1)==IDF_CLASS||(input.LA(1)>=27 && input.LA(1)<=28) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set19));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(19, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "type"

    public static class method_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_decl"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:21:1: method_decl : 'method' IDF '(' ( method_args )* ')' method_decl_suite ;
    public final LoocParser.method_decl_return method_decl() throws RecognitionException {
        LoocParser.method_decl_return retval = new LoocParser.method_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal20=null;
        Token IDF21=null;
        Token char_literal22=null;
        Token char_literal24=null;
        LoocParser.method_args_return method_args23 = null;

        LoocParser.method_decl_suite_return method_decl_suite25 = null;


        Object string_literal20_tree=null;
        Object IDF21_tree=null;
        Object char_literal22_tree=null;
        Object char_literal24_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "method_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:21:12: ( 'method' IDF '(' ( method_args )* ')' method_decl_suite )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:21:15: 'method' IDF '(' ( method_args )* ')' method_decl_suite
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(21,15);
            string_literal20=(Token)match(input,29,FOLLOW_29_in_method_decl192); 
            string_literal20_tree = (Object)adaptor.create(string_literal20);
            adaptor.addChild(root_0, string_literal20_tree);

            dbg.location(21,24);
            IDF21=(Token)match(input,IDF,FOLLOW_IDF_in_method_decl194); 
            IDF21_tree = (Object)adaptor.create(IDF21);
            adaptor.addChild(root_0, IDF21_tree);

            dbg.location(21,28);
            char_literal22=(Token)match(input,22,FOLLOW_22_in_method_decl196); 
            char_literal22_tree = (Object)adaptor.create(char_literal22);
            adaptor.addChild(root_0, char_literal22_tree);

            dbg.location(21,32);
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:21:32: ( method_args )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDF) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:21:32: method_args
            	    {
            	    dbg.location(21,32);
            	    pushFollow(FOLLOW_method_args_in_method_decl198);
            	    method_args23=method_args();

            	    state._fsp--;

            	    adaptor.addChild(root_0, method_args23.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(21,45);
            char_literal24=(Token)match(input,23,FOLLOW_23_in_method_decl201); 
            char_literal24_tree = (Object)adaptor.create(char_literal24);
            adaptor.addChild(root_0, char_literal24_tree);

            dbg.location(21,49);
            pushFollow(FOLLOW_method_decl_suite_in_method_decl203);
            method_decl_suite25=method_decl_suite();

            state._fsp--;

            adaptor.addChild(root_0, method_decl_suite25.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(21, 67);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "method_decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "method_decl"

    public static class method_decl_suite_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_decl_suite"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:23:1: method_decl_suite : ( '{' ( var_decl )* ( instruction )+ '}' | ':' type '{' ( var_decl )* ( instruction )+ '}' );
    public final LoocParser.method_decl_suite_return method_decl_suite() throws RecognitionException {
        LoocParser.method_decl_suite_return retval = new LoocParser.method_decl_suite_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal26=null;
        Token char_literal29=null;
        Token char_literal30=null;
        Token char_literal32=null;
        Token char_literal35=null;
        LoocParser.var_decl_return var_decl27 = null;

        LoocParser.instruction_return instruction28 = null;

        LoocParser.type_return type31 = null;

        LoocParser.var_decl_return var_decl33 = null;

        LoocParser.instruction_return instruction34 = null;


        Object char_literal26_tree=null;
        Object char_literal29_tree=null;
        Object char_literal30_tree=null;
        Object char_literal32_tree=null;
        Object char_literal35_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "method_decl_suite");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:23:18: ( '{' ( var_decl )* ( instruction )+ '}' | ':' type '{' ( var_decl )* ( instruction )+ '}' )
            int alt12=2;
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:23:20: '{' ( var_decl )* ( instruction )+ '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(23,20);
                    char_literal26=(Token)match(input,30,FOLLOW_30_in_method_decl_suite211); 
                    char_literal26_tree = (Object)adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);

                    dbg.location(23,24);
                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:23:24: ( var_decl )*
                    try { dbg.enterSubRule(8);

                    loop8:
                    do {
                        int alt8=2;
                        try { dbg.enterDecision(8);

                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==24) ) {
                            alt8=1;
                        }


                        } finally {dbg.exitDecision(8);}

                        switch (alt8) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:23:24: var_decl
                    	    {
                    	    dbg.location(23,24);
                    	    pushFollow(FOLLOW_var_decl_in_method_decl_suite213);
                    	    var_decl27=var_decl();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, var_decl27.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(8);}

                    dbg.location(23,34);
                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:23:34: ( instruction )+
                    int cnt9=0;
                    try { dbg.enterSubRule(9);

                    loop9:
                    do {
                        int alt9=2;
                        try { dbg.enterDecision(9);

                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==IDF||LA9_0==30||LA9_0==34||LA9_0==38||LA9_0==41||(LA9_0>=44 && LA9_0<=46)) ) {
                            alt9=1;
                        }


                        } finally {dbg.exitDecision(9);}

                        switch (alt9) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:23:34: instruction
                    	    {
                    	    dbg.location(23,34);
                    	    pushFollow(FOLLOW_instruction_in_method_decl_suite216);
                    	    instruction28=instruction();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, instruction28.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt9++;
                    } while (true);
                    } finally {dbg.exitSubRule(9);}

                    dbg.location(23,47);
                    char_literal29=(Token)match(input,31,FOLLOW_31_in_method_decl_suite219); 
                    char_literal29_tree = (Object)adaptor.create(char_literal29);
                    adaptor.addChild(root_0, char_literal29_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:24:20: ':' type '{' ( var_decl )* ( instruction )+ '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(24,20);
                    char_literal30=(Token)match(input,25,FOLLOW_25_in_method_decl_suite240); 
                    char_literal30_tree = (Object)adaptor.create(char_literal30);
                    adaptor.addChild(root_0, char_literal30_tree);

                    dbg.location(24,24);
                    pushFollow(FOLLOW_type_in_method_decl_suite242);
                    type31=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type31.getTree());
                    dbg.location(24,29);
                    char_literal32=(Token)match(input,30,FOLLOW_30_in_method_decl_suite244); 
                    char_literal32_tree = (Object)adaptor.create(char_literal32);
                    adaptor.addChild(root_0, char_literal32_tree);

                    dbg.location(24,33);
                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:24:33: ( var_decl )*
                    try { dbg.enterSubRule(10);

                    loop10:
                    do {
                        int alt10=2;
                        try { dbg.enterDecision(10);

                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==24) ) {
                            alt10=1;
                        }


                        } finally {dbg.exitDecision(10);}

                        switch (alt10) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:24:33: var_decl
                    	    {
                    	    dbg.location(24,33);
                    	    pushFollow(FOLLOW_var_decl_in_method_decl_suite246);
                    	    var_decl33=var_decl();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, var_decl33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(10);}

                    dbg.location(24,43);
                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:24:43: ( instruction )+
                    int cnt11=0;
                    try { dbg.enterSubRule(11);

                    loop11:
                    do {
                        int alt11=2;
                        try { dbg.enterDecision(11);

                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==IDF||LA11_0==30||LA11_0==34||LA11_0==38||LA11_0==41||(LA11_0>=44 && LA11_0<=46)) ) {
                            alt11=1;
                        }


                        } finally {dbg.exitDecision(11);}

                        switch (alt11) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:24:43: instruction
                    	    {
                    	    dbg.location(24,43);
                    	    pushFollow(FOLLOW_instruction_in_method_decl_suite249);
                    	    instruction34=instruction();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, instruction34.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt11++;
                    } while (true);
                    } finally {dbg.exitSubRule(11);}

                    dbg.location(24,56);
                    char_literal35=(Token)match(input,31,FOLLOW_31_in_method_decl_suite252); 
                    char_literal35_tree = (Object)adaptor.create(char_literal35);
                    adaptor.addChild(root_0, char_literal35_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(25, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "method_decl_suite");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "method_decl_suite"

    public static class method_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_args"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:27:1: method_args : IDF ':' type ( ',' IDF ':' type )* ;
    public final LoocParser.method_args_return method_args() throws RecognitionException {
        LoocParser.method_args_return retval = new LoocParser.method_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF36=null;
        Token char_literal37=null;
        Token char_literal39=null;
        Token IDF40=null;
        Token char_literal41=null;
        LoocParser.type_return type38 = null;

        LoocParser.type_return type42 = null;


        Object IDF36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal39_tree=null;
        Object IDF40_tree=null;
        Object char_literal41_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "method_args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:27:12: ( IDF ':' type ( ',' IDF ':' type )* )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:27:20: IDF ':' type ( ',' IDF ':' type )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(27,20);
            IDF36=(Token)match(input,IDF,FOLLOW_IDF_in_method_args270); 
            IDF36_tree = (Object)adaptor.create(IDF36);
            adaptor.addChild(root_0, IDF36_tree);

            dbg.location(27,24);
            char_literal37=(Token)match(input,25,FOLLOW_25_in_method_args272); 
            char_literal37_tree = (Object)adaptor.create(char_literal37);
            adaptor.addChild(root_0, char_literal37_tree);

            dbg.location(27,28);
            pushFollow(FOLLOW_type_in_method_args274);
            type38=type();

            state._fsp--;

            adaptor.addChild(root_0, type38.getTree());
            dbg.location(27,33);
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:27:33: ( ',' IDF ':' type )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:27:34: ',' IDF ':' type
            	    {
            	    dbg.location(27,34);
            	    char_literal39=(Token)match(input,32,FOLLOW_32_in_method_args277); 
            	    char_literal39_tree = (Object)adaptor.create(char_literal39);
            	    adaptor.addChild(root_0, char_literal39_tree);

            	    dbg.location(27,38);
            	    IDF40=(Token)match(input,IDF,FOLLOW_IDF_in_method_args279); 
            	    IDF40_tree = (Object)adaptor.create(IDF40);
            	    adaptor.addChild(root_0, IDF40_tree);

            	    dbg.location(27,42);
            	    char_literal41=(Token)match(input,25,FOLLOW_25_in_method_args281); 
            	    char_literal41_tree = (Object)adaptor.create(char_literal41);
            	    adaptor.addChild(root_0, char_literal41_tree);

            	    dbg.location(27,46);
            	    pushFollow(FOLLOW_type_in_method_args283);
            	    type42=type();

            	    state._fsp--;

            	    adaptor.addChild(root_0, type42.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(27, 53);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "method_args");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "method_args"

    public static class instruction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:29:1: instruction : ( IDF ':=' instruction_suite | 'if' expression 'then' instruction ( 'else' instruction )? 'fi' | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' | '{' ( var_decl )* ( instruction )+ '}' | 'do' expression ';' | print_func | read_func | return_func );
    public final LoocParser.instruction_return instruction() throws RecognitionException {
        LoocParser.instruction_return retval = new LoocParser.instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF43=null;
        Token string_literal44=null;
        Token string_literal46=null;
        Token string_literal48=null;
        Token string_literal50=null;
        Token string_literal52=null;
        Token string_literal53=null;
        Token IDF54=null;
        Token string_literal55=null;
        Token string_literal57=null;
        Token string_literal59=null;
        Token string_literal61=null;
        Token char_literal62=null;
        Token char_literal65=null;
        Token string_literal66=null;
        Token char_literal68=null;
        LoocParser.instruction_suite_return instruction_suite45 = null;

        LoocParser.expression_return expression47 = null;

        LoocParser.instruction_return instruction49 = null;

        LoocParser.instruction_return instruction51 = null;

        LoocParser.expression_return expression56 = null;

        LoocParser.expression_return expression58 = null;

        LoocParser.instruction_return instruction60 = null;

        LoocParser.var_decl_return var_decl63 = null;

        LoocParser.instruction_return instruction64 = null;

        LoocParser.expression_return expression67 = null;

        LoocParser.print_func_return print_func69 = null;

        LoocParser.read_func_return read_func70 = null;

        LoocParser.return_func_return return_func71 = null;


        Object IDF43_tree=null;
        Object string_literal44_tree=null;
        Object string_literal46_tree=null;
        Object string_literal48_tree=null;
        Object string_literal50_tree=null;
        Object string_literal52_tree=null;
        Object string_literal53_tree=null;
        Object IDF54_tree=null;
        Object string_literal55_tree=null;
        Object string_literal57_tree=null;
        Object string_literal59_tree=null;
        Object string_literal61_tree=null;
        Object char_literal62_tree=null;
        Object char_literal65_tree=null;
        Object string_literal66_tree=null;
        Object char_literal68_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "instruction");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:29:12: ( IDF ':=' instruction_suite | 'if' expression 'then' instruction ( 'else' instruction )? 'fi' | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' | '{' ( var_decl )* ( instruction )+ '}' | 'do' expression ';' | print_func | read_func | return_func )
            int alt18=8;
            try { dbg.enterDecision(18);

            switch ( input.LA(1) ) {
            case IDF:
                {
                alt18=1;
                }
                break;
            case 34:
                {
                alt18=2;
                }
                break;
            case 38:
                {
                alt18=3;
                }
                break;
            case 30:
                {
                alt18=4;
                }
                break;
            case 41:
                {
                alt18=5;
                }
                break;
            case 44:
                {
                alt18=6;
                }
                break;
            case 45:
                {
                alt18=7;
                }
                break;
            case 46:
                {
                alt18=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:29:20: IDF ':=' instruction_suite
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(29,20);
                    IDF43=(Token)match(input,IDF,FOLLOW_IDF_in_instruction299); 
                    IDF43_tree = (Object)adaptor.create(IDF43);
                    adaptor.addChild(root_0, IDF43_tree);

                    dbg.location(29,24);
                    string_literal44=(Token)match(input,33,FOLLOW_33_in_instruction301); 
                    string_literal44_tree = (Object)adaptor.create(string_literal44);
                    adaptor.addChild(root_0, string_literal44_tree);

                    dbg.location(29,29);
                    pushFollow(FOLLOW_instruction_suite_in_instruction303);
                    instruction_suite45=instruction_suite();

                    state._fsp--;

                    adaptor.addChild(root_0, instruction_suite45.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:30:20: 'if' expression 'then' instruction ( 'else' instruction )? 'fi'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(30,20);
                    string_literal46=(Token)match(input,34,FOLLOW_34_in_instruction324); 
                    string_literal46_tree = (Object)adaptor.create(string_literal46);
                    adaptor.addChild(root_0, string_literal46_tree);

                    dbg.location(30,25);
                    pushFollow(FOLLOW_expression_in_instruction326);
                    expression47=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression47.getTree());
                    dbg.location(30,36);
                    string_literal48=(Token)match(input,35,FOLLOW_35_in_instruction328); 
                    string_literal48_tree = (Object)adaptor.create(string_literal48);
                    adaptor.addChild(root_0, string_literal48_tree);

                    dbg.location(30,43);
                    pushFollow(FOLLOW_instruction_in_instruction330);
                    instruction49=instruction();

                    state._fsp--;

                    adaptor.addChild(root_0, instruction49.getTree());
                    dbg.location(30,55);
                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:30:55: ( 'else' instruction )?
                    int alt14=2;
                    try { dbg.enterSubRule(14);
                    try { dbg.enterDecision(14);

                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==36) ) {
                        alt14=1;
                    }
                    } finally {dbg.exitDecision(14);}

                    switch (alt14) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:30:56: 'else' instruction
                            {
                            dbg.location(30,56);
                            string_literal50=(Token)match(input,36,FOLLOW_36_in_instruction333); 
                            string_literal50_tree = (Object)adaptor.create(string_literal50);
                            adaptor.addChild(root_0, string_literal50_tree);

                            dbg.location(30,63);
                            pushFollow(FOLLOW_instruction_in_instruction335);
                            instruction51=instruction();

                            state._fsp--;

                            adaptor.addChild(root_0, instruction51.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(14);}

                    dbg.location(30,77);
                    string_literal52=(Token)match(input,37,FOLLOW_37_in_instruction339); 
                    string_literal52_tree = (Object)adaptor.create(string_literal52);
                    adaptor.addChild(root_0, string_literal52_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:31:20: 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(31,20);
                    string_literal53=(Token)match(input,38,FOLLOW_38_in_instruction360); 
                    string_literal53_tree = (Object)adaptor.create(string_literal53);
                    adaptor.addChild(root_0, string_literal53_tree);

                    dbg.location(31,26);
                    IDF54=(Token)match(input,IDF,FOLLOW_IDF_in_instruction362); 
                    IDF54_tree = (Object)adaptor.create(IDF54);
                    adaptor.addChild(root_0, IDF54_tree);

                    dbg.location(31,30);
                    string_literal55=(Token)match(input,39,FOLLOW_39_in_instruction364); 
                    string_literal55_tree = (Object)adaptor.create(string_literal55);
                    adaptor.addChild(root_0, string_literal55_tree);

                    dbg.location(31,35);
                    pushFollow(FOLLOW_expression_in_instruction366);
                    expression56=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression56.getTree());
                    dbg.location(31,46);
                    string_literal57=(Token)match(input,40,FOLLOW_40_in_instruction368); 
                    string_literal57_tree = (Object)adaptor.create(string_literal57);
                    adaptor.addChild(root_0, string_literal57_tree);

                    dbg.location(31,51);
                    pushFollow(FOLLOW_expression_in_instruction370);
                    expression58=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression58.getTree());
                    dbg.location(31,62);
                    string_literal59=(Token)match(input,41,FOLLOW_41_in_instruction372); 
                    string_literal59_tree = (Object)adaptor.create(string_literal59);
                    adaptor.addChild(root_0, string_literal59_tree);

                    dbg.location(31,67);
                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:31:67: ( instruction )+
                    int cnt15=0;
                    try { dbg.enterSubRule(15);

                    loop15:
                    do {
                        int alt15=2;
                        try { dbg.enterDecision(15);

                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==IDF||LA15_0==30||LA15_0==34||LA15_0==38||LA15_0==41||(LA15_0>=44 && LA15_0<=46)) ) {
                            alt15=1;
                        }


                        } finally {dbg.exitDecision(15);}

                        switch (alt15) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:31:67: instruction
                    	    {
                    	    dbg.location(31,67);
                    	    pushFollow(FOLLOW_instruction_in_instruction374);
                    	    instruction60=instruction();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, instruction60.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt15++;
                    } while (true);
                    } finally {dbg.exitSubRule(15);}

                    dbg.location(31,80);
                    string_literal61=(Token)match(input,42,FOLLOW_42_in_instruction377); 
                    string_literal61_tree = (Object)adaptor.create(string_literal61);
                    adaptor.addChild(root_0, string_literal61_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:32:20: '{' ( var_decl )* ( instruction )+ '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(32,20);
                    char_literal62=(Token)match(input,30,FOLLOW_30_in_instruction398); 
                    char_literal62_tree = (Object)adaptor.create(char_literal62);
                    adaptor.addChild(root_0, char_literal62_tree);

                    dbg.location(32,24);
                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:32:24: ( var_decl )*
                    try { dbg.enterSubRule(16);

                    loop16:
                    do {
                        int alt16=2;
                        try { dbg.enterDecision(16);

                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==24) ) {
                            alt16=1;
                        }


                        } finally {dbg.exitDecision(16);}

                        switch (alt16) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:32:24: var_decl
                    	    {
                    	    dbg.location(32,24);
                    	    pushFollow(FOLLOW_var_decl_in_instruction400);
                    	    var_decl63=var_decl();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, var_decl63.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(16);}

                    dbg.location(32,34);
                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:32:34: ( instruction )+
                    int cnt17=0;
                    try { dbg.enterSubRule(17);

                    loop17:
                    do {
                        int alt17=2;
                        try { dbg.enterDecision(17);

                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==IDF||LA17_0==30||LA17_0==34||LA17_0==38||LA17_0==41||(LA17_0>=44 && LA17_0<=46)) ) {
                            alt17=1;
                        }


                        } finally {dbg.exitDecision(17);}

                        switch (alt17) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:32:34: instruction
                    	    {
                    	    dbg.location(32,34);
                    	    pushFollow(FOLLOW_instruction_in_instruction403);
                    	    instruction64=instruction();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, instruction64.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt17++;
                    } while (true);
                    } finally {dbg.exitSubRule(17);}

                    dbg.location(32,47);
                    char_literal65=(Token)match(input,31,FOLLOW_31_in_instruction406); 
                    char_literal65_tree = (Object)adaptor.create(char_literal65);
                    adaptor.addChild(root_0, char_literal65_tree);


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:33:20: 'do' expression ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(33,20);
                    string_literal66=(Token)match(input,41,FOLLOW_41_in_instruction427); 
                    string_literal66_tree = (Object)adaptor.create(string_literal66);
                    adaptor.addChild(root_0, string_literal66_tree);

                    dbg.location(33,25);
                    pushFollow(FOLLOW_expression_in_instruction429);
                    expression67=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression67.getTree());
                    dbg.location(33,36);
                    char_literal68=(Token)match(input,26,FOLLOW_26_in_instruction431); 
                    char_literal68_tree = (Object)adaptor.create(char_literal68);
                    adaptor.addChild(root_0, char_literal68_tree);


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:34:20: print_func
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(34,20);
                    pushFollow(FOLLOW_print_func_in_instruction452);
                    print_func69=print_func();

                    state._fsp--;

                    adaptor.addChild(root_0, print_func69.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:35:20: read_func
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(35,20);
                    pushFollow(FOLLOW_read_func_in_instruction473);
                    read_func70=read_func();

                    state._fsp--;

                    adaptor.addChild(root_0, read_func70.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:36:20: return_func
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(36,20);
                    pushFollow(FOLLOW_return_func_in_instruction494);
                    return_func71=return_func();

                    state._fsp--;

                    adaptor.addChild(root_0, return_func71.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(37, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "instruction");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "instruction"

    public static class instruction_suite_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction_suite"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:39:1: instruction_suite : ( expression ';' | 'nil' ';' );
    public final LoocParser.instruction_suite_return instruction_suite() throws RecognitionException {
        LoocParser.instruction_suite_return retval = new LoocParser.instruction_suite_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal73=null;
        Token string_literal74=null;
        Token char_literal75=null;
        LoocParser.expression_return expression72 = null;


        Object char_literal73_tree=null;
        Object string_literal74_tree=null;
        Object char_literal75_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "instruction_suite");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:39:18: ( expression ';' | 'nil' ';' )
            int alt19=2;
            try { dbg.enterDecision(19);

            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=IDF && LA19_0<=SUB)||LA19_0==22||(LA19_0>=47 && LA19_0<=49)) ) {
                alt19=1;
            }
            else if ( (LA19_0==43) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:39:20: expression ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,20);
                    pushFollow(FOLLOW_expression_in_instruction_suite506);
                    expression72=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression72.getTree());
                    dbg.location(39,31);
                    char_literal73=(Token)match(input,26,FOLLOW_26_in_instruction_suite508); 
                    char_literal73_tree = (Object)adaptor.create(char_literal73);
                    adaptor.addChild(root_0, char_literal73_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:40:20: 'nil' ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(40,20);
                    string_literal74=(Token)match(input,43,FOLLOW_43_in_instruction_suite529); 
                    string_literal74_tree = (Object)adaptor.create(string_literal74);
                    adaptor.addChild(root_0, string_literal74_tree);

                    dbg.location(40,26);
                    char_literal75=(Token)match(input,26,FOLLOW_26_in_instruction_suite531); 
                    char_literal75_tree = (Object)adaptor.create(char_literal75);
                    adaptor.addChild(root_0, char_literal75_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(41, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "instruction_suite");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "instruction_suite"

    public static class print_func_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print_func"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:43:1: print_func : 'write' print_func_suite ;
    public final LoocParser.print_func_return print_func() throws RecognitionException {
        LoocParser.print_func_return retval = new LoocParser.print_func_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal76=null;
        LoocParser.print_func_suite_return print_func_suite77 = null;


        Object string_literal76_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "print_func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:43:11: ( 'write' print_func_suite )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:43:20: 'write' print_func_suite
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(43,20);
            string_literal76=(Token)match(input,44,FOLLOW_44_in_print_func547); 
            string_literal76_tree = (Object)adaptor.create(string_literal76);
            adaptor.addChild(root_0, string_literal76_tree);

            dbg.location(43,28);
            pushFollow(FOLLOW_print_func_suite_in_print_func549);
            print_func_suite77=print_func_suite();

            state._fsp--;

            adaptor.addChild(root_0, print_func_suite77.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(43, 45);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "print_func");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "print_func"

    public static class print_func_suite_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print_func_suite"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:45:1: print_func_suite : expression ';' ;
    public final LoocParser.print_func_suite_return print_func_suite() throws RecognitionException {
        LoocParser.print_func_suite_return retval = new LoocParser.print_func_suite_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal79=null;
        LoocParser.expression_return expression78 = null;


        Object char_literal79_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "print_func_suite");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(45, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:45:17: ( expression ';' )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:45:19: expression ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(45,19);
            pushFollow(FOLLOW_expression_in_print_func_suite557);
            expression78=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression78.getTree());
            dbg.location(45,30);
            char_literal79=(Token)match(input,26,FOLLOW_26_in_print_func_suite559); 
            char_literal79_tree = (Object)adaptor.create(char_literal79);
            adaptor.addChild(root_0, char_literal79_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(46, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "print_func_suite");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "print_func_suite"

    public static class read_func_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "read_func"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:48:1: read_func : 'read' IDF ';' ;
    public final LoocParser.read_func_return read_func() throws RecognitionException {
        LoocParser.read_func_return retval = new LoocParser.read_func_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal80=null;
        Token IDF81=null;
        Token char_literal82=null;

        Object string_literal80_tree=null;
        Object IDF81_tree=null;
        Object char_literal82_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "read_func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:48:10: ( 'read' IDF ';' )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:48:20: 'read' IDF ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(48,20);
            string_literal80=(Token)match(input,45,FOLLOW_45_in_read_func579); 
            string_literal80_tree = (Object)adaptor.create(string_literal80);
            adaptor.addChild(root_0, string_literal80_tree);

            dbg.location(48,27);
            IDF81=(Token)match(input,IDF,FOLLOW_IDF_in_read_func581); 
            IDF81_tree = (Object)adaptor.create(IDF81);
            adaptor.addChild(root_0, IDF81_tree);

            dbg.location(48,31);
            char_literal82=(Token)match(input,26,FOLLOW_26_in_read_func583); 
            char_literal82_tree = (Object)adaptor.create(char_literal82);
            adaptor.addChild(root_0, char_literal82_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(48, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "read_func");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "read_func"

    public static class return_func_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "return_func"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:50:1: return_func : 'return' '(' expression ')' ';' ;
    public final LoocParser.return_func_return return_func() throws RecognitionException {
        LoocParser.return_func_return retval = new LoocParser.return_func_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal83=null;
        Token char_literal84=null;
        Token char_literal86=null;
        Token char_literal87=null;
        LoocParser.expression_return expression85 = null;


        Object string_literal83_tree=null;
        Object char_literal84_tree=null;
        Object char_literal86_tree=null;
        Object char_literal87_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "return_func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:50:12: ( 'return' '(' expression ')' ';' )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:50:20: 'return' '(' expression ')' ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(50,20);
            string_literal83=(Token)match(input,46,FOLLOW_46_in_return_func597); 
            string_literal83_tree = (Object)adaptor.create(string_literal83);
            adaptor.addChild(root_0, string_literal83_tree);

            dbg.location(50,29);
            char_literal84=(Token)match(input,22,FOLLOW_22_in_return_func599); 
            char_literal84_tree = (Object)adaptor.create(char_literal84);
            adaptor.addChild(root_0, char_literal84_tree);

            dbg.location(50,33);
            pushFollow(FOLLOW_expression_in_return_func601);
            expression85=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression85.getTree());
            dbg.location(50,44);
            char_literal86=(Token)match(input,23,FOLLOW_23_in_return_func603); 
            char_literal86_tree = (Object)adaptor.create(char_literal86);
            adaptor.addChild(root_0, char_literal86_tree);

            dbg.location(50,48);
            char_literal87=(Token)match(input,26,FOLLOW_26_in_return_func605); 
            char_literal87_tree = (Object)adaptor.create(char_literal87);
            adaptor.addChild(root_0, char_literal87_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(50, 52);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "return_func");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "return_func"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:52:1: expression : add_expression ( comp add_expression )* ;
    public final LoocParser.expression_return expression() throws RecognitionException {
        LoocParser.expression_return retval = new LoocParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LoocParser.add_expression_return add_expression88 = null;

        LoocParser.comp_return comp89 = null;

        LoocParser.add_expression_return add_expression90 = null;



        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:52:11: ( add_expression ( comp add_expression )* )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:52:14: add_expression ( comp add_expression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(52,14);
            pushFollow(FOLLOW_add_expression_in_expression614);
            add_expression88=add_expression();

            state._fsp--;

            adaptor.addChild(root_0, add_expression88.getTree());
            dbg.location(52,29);
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:52:29: ( comp add_expression )*
            try { dbg.enterSubRule(20);

            loop20:
            do {
                int alt20=2;
                try { dbg.enterDecision(20);

                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=EQ && LA20_0<=GE)) ) {
                    alt20=1;
                }


                } finally {dbg.exitDecision(20);}

                switch (alt20) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:52:30: comp add_expression
            	    {
            	    dbg.location(52,30);
            	    pushFollow(FOLLOW_comp_in_expression617);
            	    comp89=comp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comp89.getTree());
            	    dbg.location(52,35);
            	    pushFollow(FOLLOW_add_expression_in_expression619);
            	    add_expression90=add_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add_expression90.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);
            } finally {dbg.exitSubRule(20);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(52, 51);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression"

    public static class add_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_expression"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:54:1: add_expression : mult_expression ( add mult_expression )* ;
    public final LoocParser.add_expression_return add_expression() throws RecognitionException {
        LoocParser.add_expression_return retval = new LoocParser.add_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LoocParser.mult_expression_return mult_expression91 = null;

        LoocParser.add_return add92 = null;

        LoocParser.mult_expression_return mult_expression93 = null;



        try { dbg.enterRule(getGrammarFileName(), "add_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:54:15: ( mult_expression ( add mult_expression )* )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:54:18: mult_expression ( add mult_expression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(54,18);
            pushFollow(FOLLOW_mult_expression_in_add_expression629);
            mult_expression91=mult_expression();

            state._fsp--;

            adaptor.addChild(root_0, mult_expression91.getTree());
            dbg.location(54,34);
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:54:34: ( add mult_expression )*
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21);

                int LA21_0 = input.LA(1);

                if ( (LA21_0==SUB||LA21_0==ADD) ) {
                    alt21=1;
                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:54:35: add mult_expression
            	    {
            	    dbg.location(54,35);
            	    pushFollow(FOLLOW_add_in_add_expression632);
            	    add92=add();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add92.getTree());
            	    dbg.location(54,39);
            	    pushFollow(FOLLOW_mult_expression_in_add_expression634);
            	    mult_expression93=mult_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult_expression93.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);
            } finally {dbg.exitSubRule(21);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(54, 56);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "add_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "add_expression"

    public static class mult_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult_expression"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:56:1: mult_expression : expr ( multi expr )* ;
    public final LoocParser.mult_expression_return mult_expression() throws RecognitionException {
        LoocParser.mult_expression_return retval = new LoocParser.mult_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LoocParser.expr_return expr94 = null;

        LoocParser.multi_return multi95 = null;

        LoocParser.expr_return expr96 = null;



        try { dbg.enterRule(getGrammarFileName(), "mult_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:56:16: ( expr ( multi expr )* )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:56:18: expr ( multi expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(56,18);
            pushFollow(FOLLOW_expr_in_mult_expression643);
            expr94=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr94.getTree());
            dbg.location(56,23);
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:56:23: ( multi expr )*
            try { dbg.enterSubRule(22);

            loop22:
            do {
                int alt22=2;
                try { dbg.enterDecision(22);

                int LA22_0 = input.LA(1);

                if ( (LA22_0==MUL) ) {
                    alt22=1;
                }


                } finally {dbg.exitDecision(22);}

                switch (alt22) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:56:24: multi expr
            	    {
            	    dbg.location(56,24);
            	    pushFollow(FOLLOW_multi_in_mult_expression646);
            	    multi95=multi();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multi95.getTree());
            	    dbg.location(56,30);
            	    pushFollow(FOLLOW_expr_in_mult_expression648);
            	    expr96=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr96.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);
            } finally {dbg.exitSubRule(22);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(56, 36);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mult_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mult_expression"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:61:1: expr : ( IDF expr_optionnal_func | 'this' expr_optionnal_func | 'super' expr_optionnal_func | CSTE_ENT expr_optionnal_func | CSTE_CHAINE expr_optionnal_func | 'new' IDF_CLASS expr_optionnal_func | '(' expression ')' expr_optionnal_func | SUB expr );
    public final LoocParser.expr_return expr() throws RecognitionException {
        LoocParser.expr_return retval = new LoocParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF97=null;
        Token string_literal99=null;
        Token string_literal101=null;
        Token CSTE_ENT103=null;
        Token CSTE_CHAINE105=null;
        Token string_literal107=null;
        Token IDF_CLASS108=null;
        Token char_literal110=null;
        Token char_literal112=null;
        Token SUB114=null;
        LoocParser.expr_optionnal_func_return expr_optionnal_func98 = null;

        LoocParser.expr_optionnal_func_return expr_optionnal_func100 = null;

        LoocParser.expr_optionnal_func_return expr_optionnal_func102 = null;

        LoocParser.expr_optionnal_func_return expr_optionnal_func104 = null;

        LoocParser.expr_optionnal_func_return expr_optionnal_func106 = null;

        LoocParser.expr_optionnal_func_return expr_optionnal_func109 = null;

        LoocParser.expression_return expression111 = null;

        LoocParser.expr_optionnal_func_return expr_optionnal_func113 = null;

        LoocParser.expr_return expr115 = null;


        Object IDF97_tree=null;
        Object string_literal99_tree=null;
        Object string_literal101_tree=null;
        Object CSTE_ENT103_tree=null;
        Object CSTE_CHAINE105_tree=null;
        Object string_literal107_tree=null;
        Object IDF_CLASS108_tree=null;
        Object char_literal110_tree=null;
        Object char_literal112_tree=null;
        Object SUB114_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:61:5: ( IDF expr_optionnal_func | 'this' expr_optionnal_func | 'super' expr_optionnal_func | CSTE_ENT expr_optionnal_func | CSTE_CHAINE expr_optionnal_func | 'new' IDF_CLASS expr_optionnal_func | '(' expression ')' expr_optionnal_func | SUB expr )
            int alt23=8;
            try { dbg.enterDecision(23);

            switch ( input.LA(1) ) {
            case IDF:
                {
                alt23=1;
                }
                break;
            case 47:
                {
                alt23=2;
                }
                break;
            case 48:
                {
                alt23=3;
                }
                break;
            case CSTE_ENT:
                {
                alt23=4;
                }
                break;
            case CSTE_CHAINE:
                {
                alt23=5;
                }
                break;
            case 49:
                {
                alt23=6;
                }
                break;
            case 22:
                {
                alt23=7;
                }
                break;
            case SUB:
                {
                alt23=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:61:14: IDF expr_optionnal_func
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(61,14);
                    IDF97=(Token)match(input,IDF,FOLLOW_IDF_in_expr667); 
                    IDF97_tree = (Object)adaptor.create(IDF97);
                    adaptor.addChild(root_0, IDF97_tree);

                    dbg.location(61,18);
                    pushFollow(FOLLOW_expr_optionnal_func_in_expr669);
                    expr_optionnal_func98=expr_optionnal_func();

                    state._fsp--;

                    adaptor.addChild(root_0, expr_optionnal_func98.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:62:19: 'this' expr_optionnal_func
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(62,19);
                    string_literal99=(Token)match(input,47,FOLLOW_47_in_expr689); 
                    string_literal99_tree = (Object)adaptor.create(string_literal99);
                    adaptor.addChild(root_0, string_literal99_tree);

                    dbg.location(62,26);
                    pushFollow(FOLLOW_expr_optionnal_func_in_expr691);
                    expr_optionnal_func100=expr_optionnal_func();

                    state._fsp--;

                    adaptor.addChild(root_0, expr_optionnal_func100.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:63:20: 'super' expr_optionnal_func
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(63,20);
                    string_literal101=(Token)match(input,48,FOLLOW_48_in_expr712); 
                    string_literal101_tree = (Object)adaptor.create(string_literal101);
                    adaptor.addChild(root_0, string_literal101_tree);

                    dbg.location(63,28);
                    pushFollow(FOLLOW_expr_optionnal_func_in_expr714);
                    expr_optionnal_func102=expr_optionnal_func();

                    state._fsp--;

                    adaptor.addChild(root_0, expr_optionnal_func102.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:64:20: CSTE_ENT expr_optionnal_func
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(64,20);
                    CSTE_ENT103=(Token)match(input,CSTE_ENT,FOLLOW_CSTE_ENT_in_expr735); 
                    CSTE_ENT103_tree = (Object)adaptor.create(CSTE_ENT103);
                    adaptor.addChild(root_0, CSTE_ENT103_tree);

                    dbg.location(64,29);
                    pushFollow(FOLLOW_expr_optionnal_func_in_expr737);
                    expr_optionnal_func104=expr_optionnal_func();

                    state._fsp--;

                    adaptor.addChild(root_0, expr_optionnal_func104.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:65:11: CSTE_CHAINE expr_optionnal_func
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(65,11);
                    CSTE_CHAINE105=(Token)match(input,CSTE_CHAINE,FOLLOW_CSTE_CHAINE_in_expr749); 
                    CSTE_CHAINE105_tree = (Object)adaptor.create(CSTE_CHAINE105);
                    adaptor.addChild(root_0, CSTE_CHAINE105_tree);

                    dbg.location(65,23);
                    pushFollow(FOLLOW_expr_optionnal_func_in_expr751);
                    expr_optionnal_func106=expr_optionnal_func();

                    state._fsp--;

                    adaptor.addChild(root_0, expr_optionnal_func106.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:66:20: 'new' IDF_CLASS expr_optionnal_func
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(66,20);
                    string_literal107=(Token)match(input,49,FOLLOW_49_in_expr772); 
                    string_literal107_tree = (Object)adaptor.create(string_literal107);
                    adaptor.addChild(root_0, string_literal107_tree);

                    dbg.location(66,26);
                    IDF_CLASS108=(Token)match(input,IDF_CLASS,FOLLOW_IDF_CLASS_in_expr774); 
                    IDF_CLASS108_tree = (Object)adaptor.create(IDF_CLASS108);
                    adaptor.addChild(root_0, IDF_CLASS108_tree);

                    dbg.location(66,36);
                    pushFollow(FOLLOW_expr_optionnal_func_in_expr776);
                    expr_optionnal_func109=expr_optionnal_func();

                    state._fsp--;

                    adaptor.addChild(root_0, expr_optionnal_func109.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:67:20: '(' expression ')' expr_optionnal_func
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(67,20);
                    char_literal110=(Token)match(input,22,FOLLOW_22_in_expr797); 
                    char_literal110_tree = (Object)adaptor.create(char_literal110);
                    adaptor.addChild(root_0, char_literal110_tree);

                    dbg.location(67,24);
                    pushFollow(FOLLOW_expression_in_expr799);
                    expression111=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression111.getTree());
                    dbg.location(67,35);
                    char_literal112=(Token)match(input,23,FOLLOW_23_in_expr801); 
                    char_literal112_tree = (Object)adaptor.create(char_literal112);
                    adaptor.addChild(root_0, char_literal112_tree);

                    dbg.location(67,39);
                    pushFollow(FOLLOW_expr_optionnal_func_in_expr803);
                    expr_optionnal_func113=expr_optionnal_func();

                    state._fsp--;

                    adaptor.addChild(root_0, expr_optionnal_func113.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:68:20: SUB expr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(68,20);
                    SUB114=(Token)match(input,SUB,FOLLOW_SUB_in_expr824); 
                    SUB114_tree = (Object)adaptor.create(SUB114);
                    adaptor.addChild(root_0, SUB114_tree);

                    dbg.location(68,24);
                    pushFollow(FOLLOW_expr_in_expr826);
                    expr115=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr115.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(69, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"

    public static class expr_optionnal_func_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_optionnal_func"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:71:1: expr_optionnal_func : ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )* ;
    public final LoocParser.expr_optionnal_func_return expr_optionnal_func() throws RecognitionException {
        LoocParser.expr_optionnal_func_return retval = new LoocParser.expr_optionnal_func_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal116=null;
        Token IDF117=null;
        Token char_literal118=null;
        Token char_literal120=null;
        Token char_literal122=null;
        LoocParser.expression_return expression119 = null;

        LoocParser.expression_return expression121 = null;


        Object char_literal116_tree=null;
        Object IDF117_tree=null;
        Object char_literal118_tree=null;
        Object char_literal120_tree=null;
        Object char_literal122_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expr_optionnal_func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:71:20: ( ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )* )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:71:22: ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(71,22);
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:71:22: ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26);

                int LA26_0 = input.LA(1);

                if ( (LA26_0==50) ) {
                    alt26=1;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:71:23: '.' IDF '(' ( expression ( ',' expression )* )? ')'
            	    {
            	    dbg.location(71,23);
            	    char_literal116=(Token)match(input,50,FOLLOW_50_in_expr_optionnal_func839); 
            	    char_literal116_tree = (Object)adaptor.create(char_literal116);
            	    adaptor.addChild(root_0, char_literal116_tree);

            	    dbg.location(71,27);
            	    IDF117=(Token)match(input,IDF,FOLLOW_IDF_in_expr_optionnal_func841); 
            	    IDF117_tree = (Object)adaptor.create(IDF117);
            	    adaptor.addChild(root_0, IDF117_tree);

            	    dbg.location(71,31);
            	    char_literal118=(Token)match(input,22,FOLLOW_22_in_expr_optionnal_func843); 
            	    char_literal118_tree = (Object)adaptor.create(char_literal118);
            	    adaptor.addChild(root_0, char_literal118_tree);

            	    dbg.location(71,35);
            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:71:35: ( expression ( ',' expression )* )?
            	    int alt25=2;
            	    try { dbg.enterSubRule(25);
            	    try { dbg.enterDecision(25);

            	    int LA25_0 = input.LA(1);

            	    if ( ((LA25_0>=IDF && LA25_0<=SUB)||LA25_0==22||(LA25_0>=47 && LA25_0<=49)) ) {
            	        alt25=1;
            	    }
            	    } finally {dbg.exitDecision(25);}

            	    switch (alt25) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:71:36: expression ( ',' expression )*
            	            {
            	            dbg.location(71,36);
            	            pushFollow(FOLLOW_expression_in_expr_optionnal_func846);
            	            expression119=expression();

            	            state._fsp--;

            	            adaptor.addChild(root_0, expression119.getTree());
            	            dbg.location(71,47);
            	            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:71:47: ( ',' expression )*
            	            try { dbg.enterSubRule(24);

            	            loop24:
            	            do {
            	                int alt24=2;
            	                try { dbg.enterDecision(24);

            	                int LA24_0 = input.LA(1);

            	                if ( (LA24_0==32) ) {
            	                    alt24=1;
            	                }


            	                } finally {dbg.exitDecision(24);}

            	                switch (alt24) {
            	            	case 1 :
            	            	    dbg.enterAlt(1);

            	            	    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:71:48: ',' expression
            	            	    {
            	            	    dbg.location(71,48);
            	            	    char_literal120=(Token)match(input,32,FOLLOW_32_in_expr_optionnal_func849); 
            	            	    char_literal120_tree = (Object)adaptor.create(char_literal120);
            	            	    adaptor.addChild(root_0, char_literal120_tree);

            	            	    dbg.location(71,52);
            	            	    pushFollow(FOLLOW_expression_in_expr_optionnal_func851);
            	            	    expression121=expression();

            	            	    state._fsp--;

            	            	    adaptor.addChild(root_0, expression121.getTree());

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop24;
            	                }
            	            } while (true);
            	            } finally {dbg.exitSubRule(24);}


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(25);}

            	    dbg.location(71,67);
            	    char_literal122=(Token)match(input,23,FOLLOW_23_in_expr_optionnal_func857); 
            	    char_literal122_tree = (Object)adaptor.create(char_literal122);
            	    adaptor.addChild(root_0, char_literal122_tree);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
            } finally {dbg.exitSubRule(26);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(71, 72);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr_optionnal_func");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr_optionnal_func"

    public static class multi_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multi"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:73:1: multi : MUL ;
    public final LoocParser.multi_return multi() throws RecognitionException {
        LoocParser.multi_return retval = new LoocParser.multi_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MUL123=null;

        Object MUL123_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "multi");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(73, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:73:6: ( MUL )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:73:12: MUL
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(73,12);
            MUL123=(Token)match(input,MUL,FOLLOW_MUL_in_multi870); 
            MUL123_tree = (Object)adaptor.create(MUL123);
            adaptor.addChild(root_0, MUL123_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(73, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multi");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "multi"

    public static class add_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:75:1: add : ( ADD | SUB );
    public final LoocParser.add_return add() throws RecognitionException {
        LoocParser.add_return retval = new LoocParser.add_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set124=null;

        Object set124_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "add");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:75:4: ( ADD | SUB )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(75,4);
            set124=(Token)input.LT(1);
            if ( input.LA(1)==SUB||input.LA(1)==ADD ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set124));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(77, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "add");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "add"

    public static class comp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comp"
    // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:79:1: comp : ( EQ | NEQ | LT | GT | LE | GE );
    public final LoocParser.comp_return comp() throws RecognitionException {
        LoocParser.comp_return retval = new LoocParser.comp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set125=null;

        Object set125_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "comp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 1);

        try {
            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:79:5: ( EQ | NEQ | LT | GT | LE | GE )
            dbg.enterAlt(1);

            // /home/etudiants/devouard1u/workspace/PCL/TELECOM_NANCY-PCL-BDDF/Looc.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(79,5);
            set125=(Token)input.LT(1);
            if ( (input.LA(1)>=EQ && input.LA(1)<=GE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set125));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(85, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "comp"

    // Delegated rules


 

    public static final BitSet FOLLOW_class_decl_in_prog46 = new BitSet(new long[]{0x0000724441080020L});
    public static final BitSet FOLLOW_var_decl_in_prog49 = new BitSet(new long[]{0x0000724441000020L});
    public static final BitSet FOLLOW_instruction_in_prog52 = new BitSet(new long[]{0x0000724441000022L});
    public static final BitSet FOLLOW_19_in_class_decl67 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_CLASS_in_class_decl69 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_class_decl73 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_CLASS_in_class_decl75 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_class_decl80 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_class_decl82 = new BitSet(new long[]{0x0000000021800000L});
    public static final BitSet FOLLOW_class_item_decl_in_class_decl84 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_class_decl86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_class_item_decl97 = new BitSet(new long[]{0x0000000021000002L});
    public static final BitSet FOLLOW_method_decl_in_class_item_decl100 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_24_in_var_decl118 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_var_decl120 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_var_decl122 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_type_in_var_decl124 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_var_decl126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_method_decl192 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_method_decl194 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_method_decl196 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_method_args_in_method_decl198 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23_in_method_decl201 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_method_decl_suite_in_method_decl203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_method_decl_suite211 = new BitSet(new long[]{0x0000724441000020L});
    public static final BitSet FOLLOW_var_decl_in_method_decl_suite213 = new BitSet(new long[]{0x0000724441000020L});
    public static final BitSet FOLLOW_instruction_in_method_decl_suite216 = new BitSet(new long[]{0x00007244C1000020L});
    public static final BitSet FOLLOW_31_in_method_decl_suite219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_method_decl_suite240 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_type_in_method_decl_suite242 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_method_decl_suite244 = new BitSet(new long[]{0x0000724441000020L});
    public static final BitSet FOLLOW_var_decl_in_method_decl_suite246 = new BitSet(new long[]{0x0000724441000020L});
    public static final BitSet FOLLOW_instruction_in_method_decl_suite249 = new BitSet(new long[]{0x00007244C1000020L});
    public static final BitSet FOLLOW_31_in_method_decl_suite252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_method_args270 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_method_args272 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_type_in_method_args274 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_method_args277 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_method_args279 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_method_args281 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_type_in_method_args283 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_IDF_in_instruction299 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_instruction301 = new BitSet(new long[]{0x00038800004001E0L});
    public static final BitSet FOLLOW_instruction_suite_in_instruction303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_instruction324 = new BitSet(new long[]{0x00038000004001E0L});
    public static final BitSet FOLLOW_expression_in_instruction326 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_instruction328 = new BitSet(new long[]{0x0000724441000020L});
    public static final BitSet FOLLOW_instruction_in_instruction330 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_36_in_instruction333 = new BitSet(new long[]{0x0000724441000020L});
    public static final BitSet FOLLOW_instruction_in_instruction335 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_instruction339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_instruction360 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_instruction362 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_instruction364 = new BitSet(new long[]{0x00038000004001E0L});
    public static final BitSet FOLLOW_expression_in_instruction366 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_instruction368 = new BitSet(new long[]{0x00038000004001E0L});
    public static final BitSet FOLLOW_expression_in_instruction370 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_instruction372 = new BitSet(new long[]{0x0000724441000020L});
    public static final BitSet FOLLOW_instruction_in_instruction374 = new BitSet(new long[]{0x0000764441000020L});
    public static final BitSet FOLLOW_42_in_instruction377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_instruction398 = new BitSet(new long[]{0x0000724441000020L});
    public static final BitSet FOLLOW_var_decl_in_instruction400 = new BitSet(new long[]{0x0000724441000020L});
    public static final BitSet FOLLOW_instruction_in_instruction403 = new BitSet(new long[]{0x00007244C1000020L});
    public static final BitSet FOLLOW_31_in_instruction406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_instruction427 = new BitSet(new long[]{0x00038000004001E0L});
    public static final BitSet FOLLOW_expression_in_instruction429 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_instruction431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_func_in_instruction452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_func_in_instruction473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_func_in_instruction494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_instruction_suite506 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_instruction_suite508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_instruction_suite529 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_instruction_suite531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_print_func547 = new BitSet(new long[]{0x00038000004001E0L});
    public static final BitSet FOLLOW_print_func_suite_in_print_func549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_print_func_suite557 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_print_func_suite559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_read_func579 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_read_func581 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_read_func583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_return_func597 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_return_func599 = new BitSet(new long[]{0x00038000004001E0L});
    public static final BitSet FOLLOW_expression_in_return_func601 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_return_func603 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_return_func605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expression_in_expression614 = new BitSet(new long[]{0x000000000001F802L});
    public static final BitSet FOLLOW_comp_in_expression617 = new BitSet(new long[]{0x00038000004001E0L});
    public static final BitSet FOLLOW_add_expression_in_expression619 = new BitSet(new long[]{0x000000000001F802L});
    public static final BitSet FOLLOW_mult_expression_in_add_expression629 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_add_in_add_expression632 = new BitSet(new long[]{0x00038000004001E0L});
    public static final BitSet FOLLOW_mult_expression_in_add_expression634 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_expr_in_mult_expression643 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_multi_in_mult_expression646 = new BitSet(new long[]{0x00038000004001E0L});
    public static final BitSet FOLLOW_expr_in_mult_expression648 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_IDF_in_expr667 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_expr_optionnal_func_in_expr669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_expr689 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_expr_optionnal_func_in_expr691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_expr712 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_expr_optionnal_func_in_expr714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_ENT_in_expr735 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_expr_optionnal_func_in_expr737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_CHAINE_in_expr749 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_expr_optionnal_func_in_expr751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_expr772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_CLASS_in_expr774 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_expr_optionnal_func_in_expr776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_expr797 = new BitSet(new long[]{0x00038000004001E0L});
    public static final BitSet FOLLOW_expression_in_expr799 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_expr801 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_expr_optionnal_func_in_expr803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_expr824 = new BitSet(new long[]{0x00038000004001E0L});
    public static final BitSet FOLLOW_expr_in_expr826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_expr_optionnal_func839 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_expr_optionnal_func841 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_expr_optionnal_func843 = new BitSet(new long[]{0x0003800000C001E0L});
    public static final BitSet FOLLOW_expression_in_expr_optionnal_func846 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_32_in_expr_optionnal_func849 = new BitSet(new long[]{0x00038000004001E0L});
    public static final BitSet FOLLOW_expression_in_expr_optionnal_func851 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_23_in_expr_optionnal_func857 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_MUL_in_multi870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_add0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comp0 = new BitSet(new long[]{0x0000000000000002L});

}