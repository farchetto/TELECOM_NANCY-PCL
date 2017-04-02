package compil;

// $ANTLR 3.3 Nov 30, 2010 12:50:56 grammar/Looc.g 2017-03-26 22:12:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LoocParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROG", "CLASSDEF", "INHERIT", "CLASSBODY", "METHODBODY", "FORBODY", "VARDEF", "METHODDEF", "ARGS", "RETURN", "AFFECT", "IF", "THEN", "ELSE", "FOR", "INSTRUCTIONS", "DO", "WRITE", "READ", "NEW", "MINUS", "IDF_CLASS", "IDF", "CSTE_ENT", "CSTE_CHAINE", "SUB", "MUL", "ADD", "EQ", "NEQ", "LT", "GT", "LE", "GE", "CSTE_COMM", "WS", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'..'", "'do'", "'end'", "'nil'", "'write'", "'read'", "'return'", "'.'", "'this'", "'super'", "'new'"
    };
    public static final int EOF=-1;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int PROG=4;
    public static final int CLASSDEF=5;
    public static final int INHERIT=6;
    public static final int CLASSBODY=7;
    public static final int METHODBODY=8;
    public static final int FORBODY=9;
    public static final int VARDEF=10;
    public static final int METHODDEF=11;
    public static final int ARGS=12;
    public static final int RETURN=13;
    public static final int AFFECT=14;
    public static final int IF=15;
    public static final int THEN=16;
    public static final int ELSE=17;
    public static final int FOR=18;
    public static final int INSTRUCTIONS=19;
    public static final int DO=20;
    public static final int WRITE=21;
    public static final int READ=22;
    public static final int NEW=23;
    public static final int MINUS=24;
    public static final int IDF_CLASS=25;
    public static final int IDF=26;
    public static final int CSTE_ENT=27;
    public static final int CSTE_CHAINE=28;
    public static final int SUB=29;
    public static final int MUL=30;
    public static final int ADD=31;
    public static final int EQ=32;
    public static final int NEQ=33;
    public static final int LT=34;
    public static final int GT=35;
    public static final int LE=36;
    public static final int GE=37;
    public static final int CSTE_COMM=38;
    public static final int WS=39;

    // delegates
    // delegators


        public LoocParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public LoocParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return LoocParser.tokenNames; }
    public String getGrammarFileName() { return "grammar/Looc.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // grammar/Looc.g:32:1: prog : ( class_decl )* ( var_decl )* ( instruction )+ -> ^( PROG ( class_decl )* ( var_decl )* ( instruction )+ ) ;
    public final LoocParser.prog_return prog() throws RecognitionException {
        LoocParser.prog_return retval = new LoocParser.prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LoocParser.class_decl_return class_decl1 = null;

        LoocParser.var_decl_return var_decl2 = null;

        LoocParser.instruction_return instruction3 = null;


        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_class_decl=new RewriteRuleSubtreeStream(adaptor,"rule class_decl");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try {
            // grammar/Looc.g:32:5: ( ( class_decl )* ( var_decl )* ( instruction )+ -> ^( PROG ( class_decl )* ( var_decl )* ( instruction )+ ) )
            // grammar/Looc.g:32:20: ( class_decl )* ( var_decl )* ( instruction )+
            {
            // grammar/Looc.g:32:20: ( class_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==40) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // grammar/Looc.g:32:20: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_prog135);
            	    class_decl1=class_decl();

            	    state._fsp--;

            	    stream_class_decl.add(class_decl1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // grammar/Looc.g:32:32: ( var_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==45) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // grammar/Looc.g:32:32: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_prog138);
            	    var_decl2=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // grammar/Looc.g:32:42: ( instruction )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDF||LA3_0==51||LA3_0==55||LA3_0==59||LA3_0==62||(LA3_0>=65 && LA3_0<=67)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // grammar/Looc.g:32:42: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_prog141);
            	    instruction3=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);



            // AST REWRITE
            // elements: class_decl, instruction, var_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 32:55: -> ^( PROG ( class_decl )* ( var_decl )* ( instruction )+ )
            {
                // grammar/Looc.g:32:58: ^( PROG ( class_decl )* ( var_decl )* ( instruction )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROG, "PROG"), root_1);

                // grammar/Looc.g:32:65: ( class_decl )*
                while ( stream_class_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_class_decl.nextTree());

                }
                stream_class_decl.reset();
                // grammar/Looc.g:32:77: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "prog"

    public static class class_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_decl"
    // grammar/Looc.g:34:1: class_decl : 'class' IDF_CLASS ( 'inherit' IDF_CLASS )? '=' '(' class_item_decl ')' -> ^( CLASSDEF IDF_CLASS ( ^( INHERIT IDF_CLASS ) )? class_item_decl ) ;
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
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_IDF_CLASS=new RewriteRuleTokenStream(adaptor,"token IDF_CLASS");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_class_item_decl=new RewriteRuleSubtreeStream(adaptor,"rule class_item_decl");
        try {
            // grammar/Looc.g:34:11: ( 'class' IDF_CLASS ( 'inherit' IDF_CLASS )? '=' '(' class_item_decl ')' -> ^( CLASSDEF IDF_CLASS ( ^( INHERIT IDF_CLASS ) )? class_item_decl ) )
            // grammar/Looc.g:34:20: 'class' IDF_CLASS ( 'inherit' IDF_CLASS )? '=' '(' class_item_decl ')'
            {
            string_literal4=(Token)match(input,40,FOLLOW_40_in_class_decl171);  
            stream_40.add(string_literal4);

            IDF_CLASS5=(Token)match(input,IDF_CLASS,FOLLOW_IDF_CLASS_in_class_decl173);  
            stream_IDF_CLASS.add(IDF_CLASS5);

            // grammar/Looc.g:34:38: ( 'inherit' IDF_CLASS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==41) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // grammar/Looc.g:34:40: 'inherit' IDF_CLASS
                    {
                    string_literal6=(Token)match(input,41,FOLLOW_41_in_class_decl177);  
                    stream_41.add(string_literal6);

                    IDF_CLASS7=(Token)match(input,IDF_CLASS,FOLLOW_IDF_CLASS_in_class_decl179);  
                    stream_IDF_CLASS.add(IDF_CLASS7);


                    }
                    break;

            }

            char_literal8=(Token)match(input,42,FOLLOW_42_in_class_decl184);  
            stream_42.add(char_literal8);

            char_literal9=(Token)match(input,43,FOLLOW_43_in_class_decl186);  
            stream_43.add(char_literal9);

            pushFollow(FOLLOW_class_item_decl_in_class_decl188);
            class_item_decl10=class_item_decl();

            state._fsp--;

            stream_class_item_decl.add(class_item_decl10.getTree());
            char_literal11=(Token)match(input,44,FOLLOW_44_in_class_decl190);  
            stream_44.add(char_literal11);



            // AST REWRITE
            // elements: IDF_CLASS, IDF_CLASS, class_item_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 34:91: -> ^( CLASSDEF IDF_CLASS ( ^( INHERIT IDF_CLASS ) )? class_item_decl )
            {
                // grammar/Looc.g:34:94: ^( CLASSDEF IDF_CLASS ( ^( INHERIT IDF_CLASS ) )? class_item_decl )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CLASSDEF, "CLASSDEF"), root_1);

                adaptor.addChild(root_1, stream_IDF_CLASS.nextNode());
                // grammar/Looc.g:34:115: ( ^( INHERIT IDF_CLASS ) )?
                if ( stream_IDF_CLASS.hasNext() ) {
                    // grammar/Looc.g:34:115: ^( INHERIT IDF_CLASS )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INHERIT, "INHERIT"), root_2);

                    adaptor.addChild(root_2, stream_IDF_CLASS.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_IDF_CLASS.reset();
                adaptor.addChild(root_1, stream_class_item_decl.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "class_decl"

    public static class class_item_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_item_decl"
    // grammar/Looc.g:36:1: class_item_decl : ( var_decl )* ( method_decl )* -> ^( CLASSBODY ( var_decl )* ( method_decl )* ) ;
    public final LoocParser.class_item_decl_return class_item_decl() throws RecognitionException {
        LoocParser.class_item_decl_return retval = new LoocParser.class_item_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LoocParser.var_decl_return var_decl12 = null;

        LoocParser.method_decl_return method_decl13 = null;


        RewriteRuleSubtreeStream stream_method_decl=new RewriteRuleSubtreeStream(adaptor,"rule method_decl");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try {
            // grammar/Looc.g:36:16: ( ( var_decl )* ( method_decl )* -> ^( CLASSBODY ( var_decl )* ( method_decl )* ) )
            // grammar/Looc.g:36:20: ( var_decl )* ( method_decl )*
            {
            // grammar/Looc.g:36:20: ( var_decl )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==45) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // grammar/Looc.g:36:20: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_class_item_decl218);
            	    var_decl12=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl12.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // grammar/Looc.g:36:30: ( method_decl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==50) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // grammar/Looc.g:36:30: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_class_item_decl221);
            	    method_decl13=method_decl();

            	    state._fsp--;

            	    stream_method_decl.add(method_decl13.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);



            // AST REWRITE
            // elements: method_decl, var_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 36:43: -> ^( CLASSBODY ( var_decl )* ( method_decl )* )
            {
                // grammar/Looc.g:36:46: ^( CLASSBODY ( var_decl )* ( method_decl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CLASSBODY, "CLASSBODY"), root_1);

                // grammar/Looc.g:36:58: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                // grammar/Looc.g:36:68: ( method_decl )*
                while ( stream_method_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_method_decl.nextTree());

                }
                stream_method_decl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "class_item_decl"

    public static class var_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_decl"
    // grammar/Looc.g:38:1: var_decl : 'var' IDF ':' type ';' -> ^( VARDEF IDF type ) ;
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
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // grammar/Looc.g:38:9: ( 'var' IDF ':' type ';' -> ^( VARDEF IDF type ) )
            // grammar/Looc.g:38:20: 'var' IDF ':' type ';'
            {
            string_literal14=(Token)match(input,45,FOLLOW_45_in_var_decl250);  
            stream_45.add(string_literal14);

            IDF15=(Token)match(input,IDF,FOLLOW_IDF_in_var_decl252);  
            stream_IDF.add(IDF15);

            char_literal16=(Token)match(input,46,FOLLOW_46_in_var_decl254);  
            stream_46.add(char_literal16);

            pushFollow(FOLLOW_type_in_var_decl256);
            type17=type();

            state._fsp--;

            stream_type.add(type17.getTree());
            char_literal18=(Token)match(input,47,FOLLOW_47_in_var_decl258);  
            stream_47.add(char_literal18);



            // AST REWRITE
            // elements: IDF, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 38:43: -> ^( VARDEF IDF type )
            {
                // grammar/Looc.g:38:46: ^( VARDEF IDF type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "var_decl"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // grammar/Looc.g:40:1: type : ( IDF_CLASS | 'int' | 'string' );
    public final LoocParser.type_return type() throws RecognitionException {
        LoocParser.type_return retval = new LoocParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set19=null;

        Object set19_tree=null;

        try {
            // grammar/Looc.g:40:5: ( IDF_CLASS | 'int' | 'string' )
            // grammar/Looc.g:
            {
            root_0 = (Object)adaptor.nil();

            set19=(Token)input.LT(1);
            if ( input.LA(1)==IDF_CLASS||(input.LA(1)>=48 && input.LA(1)<=49) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set19));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "type"

    public static class method_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_decl"
    // grammar/Looc.g:45:1: method_decl : 'method' IDF '(' ( method_args )? ')' method_decl_suite -> ^( METHODDEF IDF ( method_args )? method_decl_suite ) ;
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
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_method_decl_suite=new RewriteRuleSubtreeStream(adaptor,"rule method_decl_suite");
        RewriteRuleSubtreeStream stream_method_args=new RewriteRuleSubtreeStream(adaptor,"rule method_args");
        try {
            // grammar/Looc.g:45:12: ( 'method' IDF '(' ( method_args )? ')' method_decl_suite -> ^( METHODDEF IDF ( method_args )? method_decl_suite ) )
            // grammar/Looc.g:45:15: 'method' IDF '(' ( method_args )? ')' method_decl_suite
            {
            string_literal20=(Token)match(input,50,FOLLOW_50_in_method_decl333);  
            stream_50.add(string_literal20);

            IDF21=(Token)match(input,IDF,FOLLOW_IDF_in_method_decl335);  
            stream_IDF.add(IDF21);

            char_literal22=(Token)match(input,43,FOLLOW_43_in_method_decl337);  
            stream_43.add(char_literal22);

            // grammar/Looc.g:45:32: ( method_args )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDF) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // grammar/Looc.g:45:32: method_args
                    {
                    pushFollow(FOLLOW_method_args_in_method_decl339);
                    method_args23=method_args();

                    state._fsp--;

                    stream_method_args.add(method_args23.getTree());

                    }
                    break;

            }

            char_literal24=(Token)match(input,44,FOLLOW_44_in_method_decl342);  
            stream_44.add(char_literal24);

            pushFollow(FOLLOW_method_decl_suite_in_method_decl344);
            method_decl_suite25=method_decl_suite();

            state._fsp--;

            stream_method_decl_suite.add(method_decl_suite25.getTree());


            // AST REWRITE
            // elements: method_args, IDF, method_decl_suite
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 45:67: -> ^( METHODDEF IDF ( method_args )? method_decl_suite )
            {
                // grammar/Looc.g:45:70: ^( METHODDEF IDF ( method_args )? method_decl_suite )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODDEF, "METHODDEF"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                // grammar/Looc.g:45:86: ( method_args )?
                if ( stream_method_args.hasNext() ) {
                    adaptor.addChild(root_1, stream_method_args.nextTree());

                }
                stream_method_args.reset();
                adaptor.addChild(root_1, stream_method_decl_suite.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "method_decl"

    public static class method_decl_suite_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_decl_suite"
    // grammar/Looc.g:47:1: method_decl_suite : ( ':' type )? '{' ( var_decl )* ( instruction )+ '}' -> ( ^( RETURN type ) )? ^( METHODBODY ( var_decl )* ( instruction )+ ) ;
    public final LoocParser.method_decl_suite_return method_decl_suite() throws RecognitionException {
        LoocParser.method_decl_suite_return retval = new LoocParser.method_decl_suite_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal26=null;
        Token char_literal28=null;
        Token char_literal31=null;
        LoocParser.type_return type27 = null;

        LoocParser.var_decl_return var_decl29 = null;

        LoocParser.instruction_return instruction30 = null;


        Object char_literal26_tree=null;
        Object char_literal28_tree=null;
        Object char_literal31_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // grammar/Looc.g:47:18: ( ( ':' type )? '{' ( var_decl )* ( instruction )+ '}' -> ( ^( RETURN type ) )? ^( METHODBODY ( var_decl )* ( instruction )+ ) )
            // grammar/Looc.g:47:20: ( ':' type )? '{' ( var_decl )* ( instruction )+ '}'
            {
            // grammar/Looc.g:47:20: ( ':' type )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==46) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // grammar/Looc.g:47:21: ':' type
                    {
                    char_literal26=(Token)match(input,46,FOLLOW_46_in_method_decl_suite365);  
                    stream_46.add(char_literal26);

                    pushFollow(FOLLOW_type_in_method_decl_suite367);
                    type27=type();

                    state._fsp--;

                    stream_type.add(type27.getTree());

                    }
                    break;

            }

            char_literal28=(Token)match(input,51,FOLLOW_51_in_method_decl_suite371);  
            stream_51.add(char_literal28);

            // grammar/Looc.g:47:36: ( var_decl )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==45) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // grammar/Looc.g:47:36: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_method_decl_suite373);
            	    var_decl29=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl29.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // grammar/Looc.g:47:46: ( instruction )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==IDF||LA10_0==51||LA10_0==55||LA10_0==59||LA10_0==62||(LA10_0>=65 && LA10_0<=67)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // grammar/Looc.g:47:46: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_method_decl_suite376);
            	    instruction30=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction30.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            char_literal31=(Token)match(input,52,FOLLOW_52_in_method_decl_suite379);  
            stream_52.add(char_literal31);



            // AST REWRITE
            // elements: var_decl, type, instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 47:63: -> ( ^( RETURN type ) )? ^( METHODBODY ( var_decl )* ( instruction )+ )
            {
                // grammar/Looc.g:47:66: ( ^( RETURN type ) )?
                if ( stream_type.hasNext() ) {
                    // grammar/Looc.g:47:66: ^( RETURN type )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_type.reset();
                // grammar/Looc.g:47:82: ^( METHODBODY ( var_decl )* ( instruction )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODBODY, "METHODBODY"), root_1);

                // grammar/Looc.g:47:95: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "method_decl_suite"

    public static class method_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_args"
    // grammar/Looc.g:49:1: method_args : IDF ':' type ( ',' IDF ':' type )* -> ^( ARGS ( IDF type )+ ) ;
    public final LoocParser.method_args_return method_args() throws RecognitionException {
        LoocParser.method_args_return retval = new LoocParser.method_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF32=null;
        Token char_literal33=null;
        Token char_literal35=null;
        Token IDF36=null;
        Token char_literal37=null;
        LoocParser.type_return type34 = null;

        LoocParser.type_return type38 = null;


        Object IDF32_tree=null;
        Object char_literal33_tree=null;
        Object char_literal35_tree=null;
        Object IDF36_tree=null;
        Object char_literal37_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // grammar/Looc.g:49:12: ( IDF ':' type ( ',' IDF ':' type )* -> ^( ARGS ( IDF type )+ ) )
            // grammar/Looc.g:49:20: IDF ':' type ( ',' IDF ':' type )*
            {
            IDF32=(Token)match(input,IDF,FOLLOW_IDF_in_method_args411);  
            stream_IDF.add(IDF32);

            char_literal33=(Token)match(input,46,FOLLOW_46_in_method_args413);  
            stream_46.add(char_literal33);

            pushFollow(FOLLOW_type_in_method_args415);
            type34=type();

            state._fsp--;

            stream_type.add(type34.getTree());
            // grammar/Looc.g:49:33: ( ',' IDF ':' type )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==53) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // grammar/Looc.g:49:34: ',' IDF ':' type
            	    {
            	    char_literal35=(Token)match(input,53,FOLLOW_53_in_method_args418);  
            	    stream_53.add(char_literal35);

            	    IDF36=(Token)match(input,IDF,FOLLOW_IDF_in_method_args420);  
            	    stream_IDF.add(IDF36);

            	    char_literal37=(Token)match(input,46,FOLLOW_46_in_method_args422);  
            	    stream_46.add(char_literal37);

            	    pushFollow(FOLLOW_type_in_method_args424);
            	    type38=type();

            	    state._fsp--;

            	    stream_type.add(type38.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: IDF, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 49:53: -> ^( ARGS ( IDF type )+ )
            {
                // grammar/Looc.g:49:56: ^( ARGS ( IDF type )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_1);

                if ( !(stream_IDF.hasNext()||stream_type.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDF.hasNext()||stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDF.nextNode());
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_IDF.reset();
                stream_type.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "method_args"

    public static class instruction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction"
    // grammar/Looc.g:51:1: instruction : ( IDF ':=' instruction_suite -> ^( AFFECT IDF instruction_suite ) | 'if' expression 'then' a= instruction ( 'else' b= instruction )? 'fi' -> ^( IF expression ^( THEN $a) ( ^( ELSE $b) )? ) | 'for' IDF 'in' c= expression '..' d= expression 'do' instruction 'end' -> ^( FOR IDF $c $d ^( FORBODY instruction ) ) | '{' ( var_decl )* ( instruction )+ '}' -> ^( INSTRUCTIONS ( var_decl )* ( instruction )+ ) | 'do' expression ';' -> ^( DO expression ) | print_func | read_func | return_func );
    public final LoocParser.instruction_return instruction() throws RecognitionException {
        LoocParser.instruction_return retval = new LoocParser.instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF39=null;
        Token string_literal40=null;
        Token string_literal42=null;
        Token string_literal44=null;
        Token string_literal45=null;
        Token string_literal46=null;
        Token string_literal47=null;
        Token IDF48=null;
        Token string_literal49=null;
        Token string_literal50=null;
        Token string_literal51=null;
        Token string_literal53=null;
        Token char_literal54=null;
        Token char_literal57=null;
        Token string_literal58=null;
        Token char_literal60=null;
        LoocParser.instruction_return a = null;

        LoocParser.instruction_return b = null;

        LoocParser.expression_return c = null;

        LoocParser.expression_return d = null;

        LoocParser.instruction_suite_return instruction_suite41 = null;

        LoocParser.expression_return expression43 = null;

        LoocParser.instruction_return instruction52 = null;

        LoocParser.var_decl_return var_decl55 = null;

        LoocParser.instruction_return instruction56 = null;

        LoocParser.expression_return expression59 = null;

        LoocParser.print_func_return print_func61 = null;

        LoocParser.read_func_return read_func62 = null;

        LoocParser.return_func_return return_func63 = null;


        Object IDF39_tree=null;
        Object string_literal40_tree=null;
        Object string_literal42_tree=null;
        Object string_literal44_tree=null;
        Object string_literal45_tree=null;
        Object string_literal46_tree=null;
        Object string_literal47_tree=null;
        Object IDF48_tree=null;
        Object string_literal49_tree=null;
        Object string_literal50_tree=null;
        Object string_literal51_tree=null;
        Object string_literal53_tree=null;
        Object char_literal54_tree=null;
        Object char_literal57_tree=null;
        Object string_literal58_tree=null;
        Object char_literal60_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_instruction_suite=new RewriteRuleSubtreeStream(adaptor,"rule instruction_suite");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try {
            // grammar/Looc.g:51:12: ( IDF ':=' instruction_suite -> ^( AFFECT IDF instruction_suite ) | 'if' expression 'then' a= instruction ( 'else' b= instruction )? 'fi' -> ^( IF expression ^( THEN $a) ( ^( ELSE $b) )? ) | 'for' IDF 'in' c= expression '..' d= expression 'do' instruction 'end' -> ^( FOR IDF $c $d ^( FORBODY instruction ) ) | '{' ( var_decl )* ( instruction )+ '}' -> ^( INSTRUCTIONS ( var_decl )* ( instruction )+ ) | 'do' expression ';' -> ^( DO expression ) | print_func | read_func | return_func )
            int alt15=8;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt15=1;
                }
                break;
            case 55:
                {
                alt15=2;
                }
                break;
            case 59:
                {
                alt15=3;
                }
                break;
            case 51:
                {
                alt15=4;
                }
                break;
            case 62:
                {
                alt15=5;
                }
                break;
            case 65:
                {
                alt15=6;
                }
                break;
            case 66:
                {
                alt15=7;
                }
                break;
            case 67:
                {
                alt15=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // grammar/Looc.g:51:20: IDF ':=' instruction_suite
                    {
                    IDF39=(Token)match(input,IDF,FOLLOW_IDF_in_instruction452);  
                    stream_IDF.add(IDF39);

                    string_literal40=(Token)match(input,54,FOLLOW_54_in_instruction454);  
                    stream_54.add(string_literal40);

                    pushFollow(FOLLOW_instruction_suite_in_instruction456);
                    instruction_suite41=instruction_suite();

                    state._fsp--;

                    stream_instruction_suite.add(instruction_suite41.getTree());


                    // AST REWRITE
                    // elements: instruction_suite, IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 51:47: -> ^( AFFECT IDF instruction_suite )
                    {
                        // grammar/Looc.g:51:50: ^( AFFECT IDF instruction_suite )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECT, "AFFECT"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_instruction_suite.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // grammar/Looc.g:52:20: 'if' expression 'then' a= instruction ( 'else' b= instruction )? 'fi'
                    {
                    string_literal42=(Token)match(input,55,FOLLOW_55_in_instruction487);  
                    stream_55.add(string_literal42);

                    pushFollow(FOLLOW_expression_in_instruction489);
                    expression43=expression();

                    state._fsp--;

                    stream_expression.add(expression43.getTree());
                    string_literal44=(Token)match(input,56,FOLLOW_56_in_instruction491);  
                    stream_56.add(string_literal44);

                    pushFollow(FOLLOW_instruction_in_instruction495);
                    a=instruction();

                    state._fsp--;

                    stream_instruction.add(a.getTree());
                    // grammar/Looc.g:52:57: ( 'else' b= instruction )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==57) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // grammar/Looc.g:52:58: 'else' b= instruction
                            {
                            string_literal45=(Token)match(input,57,FOLLOW_57_in_instruction498);  
                            stream_57.add(string_literal45);

                            pushFollow(FOLLOW_instruction_in_instruction502);
                            b=instruction();

                            state._fsp--;

                            stream_instruction.add(b.getTree());

                            }
                            break;

                    }

                    string_literal46=(Token)match(input,58,FOLLOW_58_in_instruction506);  
                    stream_58.add(string_literal46);



                    // AST REWRITE
                    // elements: expression, b, a
                    // token labels: 
                    // rule labels: a, b, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 52:86: -> ^( IF expression ^( THEN $a) ( ^( ELSE $b) )? )
                    {
                        // grammar/Looc.g:52:89: ^( IF expression ^( THEN $a) ( ^( ELSE $b) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // grammar/Looc.g:52:105: ^( THEN $a)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);

                        adaptor.addChild(root_2, stream_a.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // grammar/Looc.g:52:116: ( ^( ELSE $b) )?
                        if ( stream_b.hasNext() ) {
                            // grammar/Looc.g:52:116: ^( ELSE $b)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);

                            adaptor.addChild(root_2, stream_b.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_b.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // grammar/Looc.g:53:20: 'for' IDF 'in' c= expression '..' d= expression 'do' instruction 'end'
                    {
                    string_literal47=(Token)match(input,59,FOLLOW_59_in_instruction551);  
                    stream_59.add(string_literal47);

                    IDF48=(Token)match(input,IDF,FOLLOW_IDF_in_instruction553);  
                    stream_IDF.add(IDF48);

                    string_literal49=(Token)match(input,60,FOLLOW_60_in_instruction555);  
                    stream_60.add(string_literal49);

                    pushFollow(FOLLOW_expression_in_instruction559);
                    c=expression();

                    state._fsp--;

                    stream_expression.add(c.getTree());
                    string_literal50=(Token)match(input,61,FOLLOW_61_in_instruction561);  
                    stream_61.add(string_literal50);

                    pushFollow(FOLLOW_expression_in_instruction565);
                    d=expression();

                    state._fsp--;

                    stream_expression.add(d.getTree());
                    string_literal51=(Token)match(input,62,FOLLOW_62_in_instruction567);  
                    stream_62.add(string_literal51);

                    pushFollow(FOLLOW_instruction_in_instruction569);
                    instruction52=instruction();

                    state._fsp--;

                    stream_instruction.add(instruction52.getTree());
                    string_literal53=(Token)match(input,63,FOLLOW_63_in_instruction571);  
                    stream_63.add(string_literal53);



                    // AST REWRITE
                    // elements: c, instruction, IDF, d
                    // token labels: 
                    // rule labels: c, d, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
                    RewriteRuleSubtreeStream stream_d=new RewriteRuleSubtreeStream(adaptor,"rule d",d!=null?d.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 53:89: -> ^( FOR IDF $c $d ^( FORBODY instruction ) )
                    {
                        // grammar/Looc.g:53:92: ^( FOR IDF $c $d ^( FORBODY instruction ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_c.nextTree());
                        adaptor.addChild(root_1, stream_d.nextTree());
                        // grammar/Looc.g:53:108: ^( FORBODY instruction )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORBODY, "FORBODY"), root_2);

                        adaptor.addChild(root_2, stream_instruction.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // grammar/Looc.g:54:20: '{' ( var_decl )* ( instruction )+ '}'
                    {
                    char_literal54=(Token)match(input,51,FOLLOW_51_in_instruction612);  
                    stream_51.add(char_literal54);

                    // grammar/Looc.g:54:24: ( var_decl )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==45) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // grammar/Looc.g:54:24: var_decl
                    	    {
                    	    pushFollow(FOLLOW_var_decl_in_instruction614);
                    	    var_decl55=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl55.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // grammar/Looc.g:54:34: ( instruction )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==IDF||LA14_0==51||LA14_0==55||LA14_0==59||LA14_0==62||(LA14_0>=65 && LA14_0<=67)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // grammar/Looc.g:54:34: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction617);
                    	    instruction56=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(instruction56.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    char_literal57=(Token)match(input,52,FOLLOW_52_in_instruction620);  
                    stream_52.add(char_literal57);



                    // AST REWRITE
                    // elements: var_decl, instruction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 54:51: -> ^( INSTRUCTIONS ( var_decl )* ( instruction )+ )
                    {
                        // grammar/Looc.g:54:54: ^( INSTRUCTIONS ( var_decl )* ( instruction )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INSTRUCTIONS, "INSTRUCTIONS"), root_1);

                        // grammar/Looc.g:54:69: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        if ( !(stream_instruction.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instruction.hasNext() ) {
                            adaptor.addChild(root_1, stream_instruction.nextTree());

                        }
                        stream_instruction.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // grammar/Looc.g:55:20: 'do' expression ';'
                    {
                    string_literal58=(Token)match(input,62,FOLLOW_62_in_instruction653);  
                    stream_62.add(string_literal58);

                    pushFollow(FOLLOW_expression_in_instruction655);
                    expression59=expression();

                    state._fsp--;

                    stream_expression.add(expression59.getTree());
                    char_literal60=(Token)match(input,47,FOLLOW_47_in_instruction657);  
                    stream_47.add(char_literal60);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 55:40: -> ^( DO expression )
                    {
                        // grammar/Looc.g:55:43: ^( DO expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // grammar/Looc.g:56:20: print_func
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_print_func_in_instruction686);
                    print_func61=print_func();

                    state._fsp--;

                    adaptor.addChild(root_0, print_func61.getTree());

                    }
                    break;
                case 7 :
                    // grammar/Looc.g:57:20: read_func
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_read_func_in_instruction707);
                    read_func62=read_func();

                    state._fsp--;

                    adaptor.addChild(root_0, read_func62.getTree());

                    }
                    break;
                case 8 :
                    // grammar/Looc.g:58:20: return_func
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_return_func_in_instruction728);
                    return_func63=return_func();

                    state._fsp--;

                    adaptor.addChild(root_0, return_func63.getTree());

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
        return retval;
    }
    // $ANTLR end "instruction"

    public static class instruction_suite_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction_suite"
    // grammar/Looc.g:61:1: instruction_suite : ( expression ';' -> expression | 'nil' ';' -> 'nil' );
    public final LoocParser.instruction_suite_return instruction_suite() throws RecognitionException {
        LoocParser.instruction_suite_return retval = new LoocParser.instruction_suite_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal65=null;
        Token string_literal66=null;
        Token char_literal67=null;
        LoocParser.expression_return expression64 = null;


        Object char_literal65_tree=null;
        Object string_literal66_tree=null;
        Object char_literal67_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // grammar/Looc.g:61:18: ( expression ';' -> expression | 'nil' ';' -> 'nil' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=IDF && LA16_0<=SUB)||LA16_0==43||(LA16_0>=69 && LA16_0<=71)) ) {
                alt16=1;
            }
            else if ( (LA16_0==64) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // grammar/Looc.g:61:20: expression ';'
                    {
                    pushFollow(FOLLOW_expression_in_instruction_suite740);
                    expression64=expression();

                    state._fsp--;

                    stream_expression.add(expression64.getTree());
                    char_literal65=(Token)match(input,47,FOLLOW_47_in_instruction_suite742);  
                    stream_47.add(char_literal65);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 61:35: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // grammar/Looc.g:62:20: 'nil' ';'
                    {
                    string_literal66=(Token)match(input,64,FOLLOW_64_in_instruction_suite767);  
                    stream_64.add(string_literal66);

                    char_literal67=(Token)match(input,47,FOLLOW_47_in_instruction_suite769);  
                    stream_47.add(char_literal67);



                    // AST REWRITE
                    // elements: 64
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 62:30: -> 'nil'
                    {
                        adaptor.addChild(root_0, stream_64.nextNode());

                    }

                    retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "instruction_suite"

    public static class print_func_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print_func"
    // grammar/Looc.g:65:1: print_func : 'write' print_func_suite -> ^( WRITE print_func_suite ) ;
    public final LoocParser.print_func_return print_func() throws RecognitionException {
        LoocParser.print_func_return retval = new LoocParser.print_func_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal68=null;
        LoocParser.print_func_suite_return print_func_suite69 = null;


        Object string_literal68_tree=null;
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_print_func_suite=new RewriteRuleSubtreeStream(adaptor,"rule print_func_suite");
        try {
            // grammar/Looc.g:65:11: ( 'write' print_func_suite -> ^( WRITE print_func_suite ) )
            // grammar/Looc.g:65:20: 'write' print_func_suite
            {
            string_literal68=(Token)match(input,65,FOLLOW_65_in_print_func792);  
            stream_65.add(string_literal68);

            pushFollow(FOLLOW_print_func_suite_in_print_func794);
            print_func_suite69=print_func_suite();

            state._fsp--;

            stream_print_func_suite.add(print_func_suite69.getTree());


            // AST REWRITE
            // elements: print_func_suite
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 65:45: -> ^( WRITE print_func_suite )
            {
                // grammar/Looc.g:65:48: ^( WRITE print_func_suite )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WRITE, "WRITE"), root_1);

                adaptor.addChild(root_1, stream_print_func_suite.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "print_func"

    public static class print_func_suite_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print_func_suite"
    // grammar/Looc.g:67:1: print_func_suite : expression ';' -> expression ;
    public final LoocParser.print_func_suite_return print_func_suite() throws RecognitionException {
        LoocParser.print_func_suite_return retval = new LoocParser.print_func_suite_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal71=null;
        LoocParser.expression_return expression70 = null;


        Object char_literal71_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // grammar/Looc.g:67:17: ( expression ';' -> expression )
            // grammar/Looc.g:67:19: expression ';'
            {
            pushFollow(FOLLOW_expression_in_print_func_suite809);
            expression70=expression();

            state._fsp--;

            stream_expression.add(expression70.getTree());
            char_literal71=(Token)match(input,47,FOLLOW_47_in_print_func_suite811);  
            stream_47.add(char_literal71);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 67:34: -> expression
            {
                adaptor.addChild(root_0, stream_expression.nextTree());

            }

            retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "print_func_suite"

    public static class read_func_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "read_func"
    // grammar/Looc.g:69:1: read_func : 'read' IDF ';' -> ^( READ IDF ) ;
    public final LoocParser.read_func_return read_func() throws RecognitionException {
        LoocParser.read_func_return retval = new LoocParser.read_func_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal72=null;
        Token IDF73=null;
        Token char_literal74=null;

        Object string_literal72_tree=null;
        Object IDF73_tree=null;
        Object char_literal74_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");

        try {
            // grammar/Looc.g:69:10: ( 'read' IDF ';' -> ^( READ IDF ) )
            // grammar/Looc.g:69:20: 'read' IDF ';'
            {
            string_literal72=(Token)match(input,66,FOLLOW_66_in_read_func830);  
            stream_66.add(string_literal72);

            IDF73=(Token)match(input,IDF,FOLLOW_IDF_in_read_func832);  
            stream_IDF.add(IDF73);

            char_literal74=(Token)match(input,47,FOLLOW_47_in_read_func834);  
            stream_47.add(char_literal74);



            // AST REWRITE
            // elements: IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 69:35: -> ^( READ IDF )
            {
                // grammar/Looc.g:69:38: ^( READ IDF )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(READ, "READ"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "read_func"

    public static class return_func_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "return_func"
    // grammar/Looc.g:71:1: return_func : 'return' '(' expression ')' ';' -> ^( RETURN expression ) ;
    public final LoocParser.return_func_return return_func() throws RecognitionException {
        LoocParser.return_func_return retval = new LoocParser.return_func_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal75=null;
        Token char_literal76=null;
        Token char_literal78=null;
        Token char_literal79=null;
        LoocParser.expression_return expression77 = null;


        Object string_literal75_tree=null;
        Object char_literal76_tree=null;
        Object char_literal78_tree=null;
        Object char_literal79_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // grammar/Looc.g:71:12: ( 'return' '(' expression ')' ';' -> ^( RETURN expression ) )
            // grammar/Looc.g:71:20: 'return' '(' expression ')' ';'
            {
            string_literal75=(Token)match(input,67,FOLLOW_67_in_return_func855);  
            stream_67.add(string_literal75);

            char_literal76=(Token)match(input,43,FOLLOW_43_in_return_func857);  
            stream_43.add(char_literal76);

            pushFollow(FOLLOW_expression_in_return_func859);
            expression77=expression();

            state._fsp--;

            stream_expression.add(expression77.getTree());
            char_literal78=(Token)match(input,44,FOLLOW_44_in_return_func861);  
            stream_44.add(char_literal78);

            char_literal79=(Token)match(input,47,FOLLOW_47_in_return_func863);  
            stream_47.add(char_literal79);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 71:52: -> ^( RETURN expression )
            {
                // grammar/Looc.g:71:55: ^( RETURN expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "return_func"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // grammar/Looc.g:73:1: expression : mult_expression ( add mult_expression )* ;
    public final LoocParser.expression_return expression() throws RecognitionException {
        LoocParser.expression_return retval = new LoocParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LoocParser.mult_expression_return mult_expression80 = null;

        LoocParser.add_return add81 = null;

        LoocParser.mult_expression_return mult_expression82 = null;



        try {
            // grammar/Looc.g:73:11: ( mult_expression ( add mult_expression )* )
            // grammar/Looc.g:73:14: mult_expression ( add mult_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mult_expression_in_expression879);
            mult_expression80=mult_expression();

            state._fsp--;

            adaptor.addChild(root_0, mult_expression80.getTree());
            // grammar/Looc.g:73:30: ( add mult_expression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==SUB||LA17_0==ADD) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // grammar/Looc.g:73:31: add mult_expression
            	    {
            	    pushFollow(FOLLOW_add_in_expression882);
            	    add81=add();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(add81.getTree(), root_0);
            	    pushFollow(FOLLOW_mult_expression_in_expression885);
            	    mult_expression82=mult_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult_expression82.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "expression"

    public static class mult_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult_expression"
    // grammar/Looc.g:75:1: mult_expression : comp_expression ( multi comp_expression )* ;
    public final LoocParser.mult_expression_return mult_expression() throws RecognitionException {
        LoocParser.mult_expression_return retval = new LoocParser.mult_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LoocParser.comp_expression_return comp_expression83 = null;

        LoocParser.multi_return multi84 = null;

        LoocParser.comp_expression_return comp_expression85 = null;



        try {
            // grammar/Looc.g:75:16: ( comp_expression ( multi comp_expression )* )
            // grammar/Looc.g:75:18: comp_expression ( multi comp_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_comp_expression_in_mult_expression894);
            comp_expression83=comp_expression();

            state._fsp--;

            adaptor.addChild(root_0, comp_expression83.getTree());
            // grammar/Looc.g:75:34: ( multi comp_expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==MUL) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // grammar/Looc.g:75:35: multi comp_expression
            	    {
            	    pushFollow(FOLLOW_multi_in_mult_expression897);
            	    multi84=multi();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(multi84.getTree(), root_0);
            	    pushFollow(FOLLOW_comp_expression_in_mult_expression900);
            	    comp_expression85=comp_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comp_expression85.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "mult_expression"

    public static class comp_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comp_expression"
    // grammar/Looc.g:77:1: comp_expression : expr ( comp expr )* ;
    public final LoocParser.comp_expression_return comp_expression() throws RecognitionException {
        LoocParser.comp_expression_return retval = new LoocParser.comp_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LoocParser.expr_return expr86 = null;

        LoocParser.comp_return comp87 = null;

        LoocParser.expr_return expr88 = null;



        try {
            // grammar/Looc.g:77:16: ( expr ( comp expr )* )
            // grammar/Looc.g:77:19: expr ( comp expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_comp_expression910);
            expr86=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr86.getTree());
            // grammar/Looc.g:77:24: ( comp expr )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=EQ && LA19_0<=GE)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // grammar/Looc.g:77:25: comp expr
            	    {
            	    pushFollow(FOLLOW_comp_in_comp_expression913);
            	    comp87=comp();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(comp87.getTree(), root_0);
            	    pushFollow(FOLLOW_expr_in_comp_expression916);
            	    expr88=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr88.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "comp_expression"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // grammar/Looc.g:79:1: expr : ( IDF ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )* | 'this' ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )* | 'super' ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )* | '(' expression ')' ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )* | CSTE_ENT | CSTE_CHAINE | 'new' IDF_CLASS -> ^( NEW IDF_CLASS ) | SUB expr -> ^( MINUS expr ) );
    public final LoocParser.expr_return expr() throws RecognitionException {
        LoocParser.expr_return retval = new LoocParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF89=null;
        Token char_literal90=null;
        Token IDF91=null;
        Token char_literal92=null;
        Token char_literal94=null;
        Token char_literal96=null;
        Token string_literal97=null;
        Token char_literal98=null;
        Token IDF99=null;
        Token char_literal100=null;
        Token char_literal102=null;
        Token char_literal104=null;
        Token string_literal105=null;
        Token char_literal106=null;
        Token IDF107=null;
        Token char_literal108=null;
        Token char_literal110=null;
        Token char_literal112=null;
        Token char_literal113=null;
        Token char_literal115=null;
        Token char_literal116=null;
        Token IDF117=null;
        Token char_literal118=null;
        Token char_literal120=null;
        Token char_literal122=null;
        Token CSTE_ENT123=null;
        Token CSTE_CHAINE124=null;
        Token string_literal125=null;
        Token IDF_CLASS126=null;
        Token SUB127=null;
        LoocParser.expression_return expression93 = null;

        LoocParser.expression_return expression95 = null;

        LoocParser.expression_return expression101 = null;

        LoocParser.expression_return expression103 = null;

        LoocParser.expression_return expression109 = null;

        LoocParser.expression_return expression111 = null;

        LoocParser.expression_return expression114 = null;

        LoocParser.expression_return expression119 = null;

        LoocParser.expression_return expression121 = null;

        LoocParser.expr_return expr128 = null;


        Object IDF89_tree=null;
        Object char_literal90_tree=null;
        Object IDF91_tree=null;
        Object char_literal92_tree=null;
        Object char_literal94_tree=null;
        Object char_literal96_tree=null;
        Object string_literal97_tree=null;
        Object char_literal98_tree=null;
        Object IDF99_tree=null;
        Object char_literal100_tree=null;
        Object char_literal102_tree=null;
        Object char_literal104_tree=null;
        Object string_literal105_tree=null;
        Object char_literal106_tree=null;
        Object IDF107_tree=null;
        Object char_literal108_tree=null;
        Object char_literal110_tree=null;
        Object char_literal112_tree=null;
        Object char_literal113_tree=null;
        Object char_literal115_tree=null;
        Object char_literal116_tree=null;
        Object IDF117_tree=null;
        Object char_literal118_tree=null;
        Object char_literal120_tree=null;
        Object char_literal122_tree=null;
        Object CSTE_ENT123_tree=null;
        Object CSTE_CHAINE124_tree=null;
        Object string_literal125_tree=null;
        Object IDF_CLASS126_tree=null;
        Object SUB127_tree=null;
        RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");
        RewriteRuleTokenStream stream_IDF_CLASS=new RewriteRuleTokenStream(adaptor,"token IDF_CLASS");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // grammar/Looc.g:79:5: ( IDF ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )* | 'this' ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )* | 'super' ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )* | '(' expression ')' ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )* | CSTE_ENT | CSTE_CHAINE | 'new' IDF_CLASS -> ^( NEW IDF_CLASS ) | SUB expr -> ^( MINUS expr ) )
            int alt32=8;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt32=1;
                }
                break;
            case 69:
                {
                alt32=2;
                }
                break;
            case 70:
                {
                alt32=3;
                }
                break;
            case 43:
                {
                alt32=4;
                }
                break;
            case CSTE_ENT:
                {
                alt32=5;
                }
                break;
            case CSTE_CHAINE:
                {
                alt32=6;
                }
                break;
            case 71:
                {
                alt32=7;
                }
                break;
            case SUB:
                {
                alt32=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // grammar/Looc.g:79:14: IDF ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    IDF89=(Token)match(input,IDF,FOLLOW_IDF_in_expr932); 
                    IDF89_tree = (Object)adaptor.create(IDF89);
                    adaptor.addChild(root_0, IDF89_tree);

                    // grammar/Looc.g:79:18: ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==68) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // grammar/Looc.g:79:19: '.' IDF '(' ( expression ( ',' expression )* )? ')'
                    	    {
                    	    char_literal90=(Token)match(input,68,FOLLOW_68_in_expr935); 
                    	    char_literal90_tree = (Object)adaptor.create(char_literal90);
                    	    root_0 = (Object)adaptor.becomeRoot(char_literal90_tree, root_0);

                    	    IDF91=(Token)match(input,IDF,FOLLOW_IDF_in_expr938); 
                    	    IDF91_tree = (Object)adaptor.create(IDF91);
                    	    adaptor.addChild(root_0, IDF91_tree);

                    	    char_literal92=(Token)match(input,43,FOLLOW_43_in_expr940); 
                    	    // grammar/Looc.g:79:33: ( expression ( ',' expression )* )?
                    	    int alt21=2;
                    	    int LA21_0 = input.LA(1);

                    	    if ( ((LA21_0>=IDF && LA21_0<=SUB)||LA21_0==43||(LA21_0>=69 && LA21_0<=71)) ) {
                    	        alt21=1;
                    	    }
                    	    switch (alt21) {
                    	        case 1 :
                    	            // grammar/Looc.g:79:34: expression ( ',' expression )*
                    	            {
                    	            pushFollow(FOLLOW_expression_in_expr944);
                    	            expression93=expression();

                    	            state._fsp--;

                    	            adaptor.addChild(root_0, expression93.getTree());
                    	            // grammar/Looc.g:79:45: ( ',' expression )*
                    	            loop20:
                    	            do {
                    	                int alt20=2;
                    	                int LA20_0 = input.LA(1);

                    	                if ( (LA20_0==53) ) {
                    	                    alt20=1;
                    	                }


                    	                switch (alt20) {
                    	            	case 1 :
                    	            	    // grammar/Looc.g:79:46: ',' expression
                    	            	    {
                    	            	    char_literal94=(Token)match(input,53,FOLLOW_53_in_expr947); 
                    	            	    pushFollow(FOLLOW_expression_in_expr950);
                    	            	    expression95=expression();

                    	            	    state._fsp--;

                    	            	    adaptor.addChild(root_0, expression95.getTree());

                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop20;
                    	                }
                    	            } while (true);


                    	            }
                    	            break;

                    	    }

                    	    char_literal96=(Token)match(input,44,FOLLOW_44_in_expr956); 

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // grammar/Looc.g:80:19: 'this' ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal97=(Token)match(input,69,FOLLOW_69_in_expr979); 
                    string_literal97_tree = (Object)adaptor.create(string_literal97);
                    adaptor.addChild(root_0, string_literal97_tree);

                    // grammar/Looc.g:80:26: ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==68) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // grammar/Looc.g:80:27: '.' IDF '(' ( expression ( ',' expression )* )? ')'
                    	    {
                    	    char_literal98=(Token)match(input,68,FOLLOW_68_in_expr982); 
                    	    char_literal98_tree = (Object)adaptor.create(char_literal98);
                    	    root_0 = (Object)adaptor.becomeRoot(char_literal98_tree, root_0);

                    	    IDF99=(Token)match(input,IDF,FOLLOW_IDF_in_expr985); 
                    	    IDF99_tree = (Object)adaptor.create(IDF99);
                    	    adaptor.addChild(root_0, IDF99_tree);

                    	    char_literal100=(Token)match(input,43,FOLLOW_43_in_expr987); 
                    	    // grammar/Looc.g:80:41: ( expression ( ',' expression )* )?
                    	    int alt24=2;
                    	    int LA24_0 = input.LA(1);

                    	    if ( ((LA24_0>=IDF && LA24_0<=SUB)||LA24_0==43||(LA24_0>=69 && LA24_0<=71)) ) {
                    	        alt24=1;
                    	    }
                    	    switch (alt24) {
                    	        case 1 :
                    	            // grammar/Looc.g:80:42: expression ( ',' expression )*
                    	            {
                    	            pushFollow(FOLLOW_expression_in_expr991);
                    	            expression101=expression();

                    	            state._fsp--;

                    	            adaptor.addChild(root_0, expression101.getTree());
                    	            // grammar/Looc.g:80:53: ( ',' expression )*
                    	            loop23:
                    	            do {
                    	                int alt23=2;
                    	                int LA23_0 = input.LA(1);

                    	                if ( (LA23_0==53) ) {
                    	                    alt23=1;
                    	                }


                    	                switch (alt23) {
                    	            	case 1 :
                    	            	    // grammar/Looc.g:80:54: ',' expression
                    	            	    {
                    	            	    char_literal102=(Token)match(input,53,FOLLOW_53_in_expr994); 
                    	            	    pushFollow(FOLLOW_expression_in_expr997);
                    	            	    expression103=expression();

                    	            	    state._fsp--;

                    	            	    adaptor.addChild(root_0, expression103.getTree());

                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop23;
                    	                }
                    	            } while (true);


                    	            }
                    	            break;

                    	    }

                    	    char_literal104=(Token)match(input,44,FOLLOW_44_in_expr1003); 

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // grammar/Looc.g:81:20: 'super' ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal105=(Token)match(input,70,FOLLOW_70_in_expr1027); 
                    string_literal105_tree = (Object)adaptor.create(string_literal105);
                    adaptor.addChild(root_0, string_literal105_tree);

                    // grammar/Looc.g:81:28: ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==68) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // grammar/Looc.g:81:29: '.' IDF '(' ( expression ( ',' expression )* )? ')'
                    	    {
                    	    char_literal106=(Token)match(input,68,FOLLOW_68_in_expr1030); 
                    	    char_literal106_tree = (Object)adaptor.create(char_literal106);
                    	    root_0 = (Object)adaptor.becomeRoot(char_literal106_tree, root_0);

                    	    IDF107=(Token)match(input,IDF,FOLLOW_IDF_in_expr1033); 
                    	    IDF107_tree = (Object)adaptor.create(IDF107);
                    	    adaptor.addChild(root_0, IDF107_tree);

                    	    char_literal108=(Token)match(input,43,FOLLOW_43_in_expr1035); 
                    	    // grammar/Looc.g:81:43: ( expression ( ',' expression )* )?
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( ((LA27_0>=IDF && LA27_0<=SUB)||LA27_0==43||(LA27_0>=69 && LA27_0<=71)) ) {
                    	        alt27=1;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // grammar/Looc.g:81:44: expression ( ',' expression )*
                    	            {
                    	            pushFollow(FOLLOW_expression_in_expr1039);
                    	            expression109=expression();

                    	            state._fsp--;

                    	            adaptor.addChild(root_0, expression109.getTree());
                    	            // grammar/Looc.g:81:55: ( ',' expression )*
                    	            loop26:
                    	            do {
                    	                int alt26=2;
                    	                int LA26_0 = input.LA(1);

                    	                if ( (LA26_0==53) ) {
                    	                    alt26=1;
                    	                }


                    	                switch (alt26) {
                    	            	case 1 :
                    	            	    // grammar/Looc.g:81:56: ',' expression
                    	            	    {
                    	            	    char_literal110=(Token)match(input,53,FOLLOW_53_in_expr1042); 
                    	            	    pushFollow(FOLLOW_expression_in_expr1045);
                    	            	    expression111=expression();

                    	            	    state._fsp--;

                    	            	    adaptor.addChild(root_0, expression111.getTree());

                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop26;
                    	                }
                    	            } while (true);


                    	            }
                    	            break;

                    	    }

                    	    char_literal112=(Token)match(input,44,FOLLOW_44_in_expr1051); 

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // grammar/Looc.g:82:20: '(' expression ')' ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal113=(Token)match(input,43,FOLLOW_43_in_expr1075); 
                    pushFollow(FOLLOW_expression_in_expr1078);
                    expression114=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression114.getTree());
                    char_literal115=(Token)match(input,44,FOLLOW_44_in_expr1080); 
                    // grammar/Looc.g:82:41: ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==68) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // grammar/Looc.g:82:42: '.' IDF '(' ( expression ( ',' expression )* )? ')'
                    	    {
                    	    char_literal116=(Token)match(input,68,FOLLOW_68_in_expr1084); 
                    	    char_literal116_tree = (Object)adaptor.create(char_literal116);
                    	    root_0 = (Object)adaptor.becomeRoot(char_literal116_tree, root_0);

                    	    IDF117=(Token)match(input,IDF,FOLLOW_IDF_in_expr1087); 
                    	    IDF117_tree = (Object)adaptor.create(IDF117);
                    	    adaptor.addChild(root_0, IDF117_tree);

                    	    char_literal118=(Token)match(input,43,FOLLOW_43_in_expr1089); 
                    	    // grammar/Looc.g:82:56: ( expression ( ',' expression )* )?
                    	    int alt30=2;
                    	    int LA30_0 = input.LA(1);

                    	    if ( ((LA30_0>=IDF && LA30_0<=SUB)||LA30_0==43||(LA30_0>=69 && LA30_0<=71)) ) {
                    	        alt30=1;
                    	    }
                    	    switch (alt30) {
                    	        case 1 :
                    	            // grammar/Looc.g:82:57: expression ( ',' expression )*
                    	            {
                    	            pushFollow(FOLLOW_expression_in_expr1093);
                    	            expression119=expression();

                    	            state._fsp--;

                    	            adaptor.addChild(root_0, expression119.getTree());
                    	            // grammar/Looc.g:82:68: ( ',' expression )*
                    	            loop29:
                    	            do {
                    	                int alt29=2;
                    	                int LA29_0 = input.LA(1);

                    	                if ( (LA29_0==53) ) {
                    	                    alt29=1;
                    	                }


                    	                switch (alt29) {
                    	            	case 1 :
                    	            	    // grammar/Looc.g:82:69: ',' expression
                    	            	    {
                    	            	    char_literal120=(Token)match(input,53,FOLLOW_53_in_expr1096); 
                    	            	    pushFollow(FOLLOW_expression_in_expr1099);
                    	            	    expression121=expression();

                    	            	    state._fsp--;

                    	            	    adaptor.addChild(root_0, expression121.getTree());

                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop29;
                    	                }
                    	            } while (true);


                    	            }
                    	            break;

                    	    }

                    	    char_literal122=(Token)match(input,44,FOLLOW_44_in_expr1105); 

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;
                case 5 :
                    // grammar/Looc.g:83:20: CSTE_ENT
                    {
                    root_0 = (Object)adaptor.nil();

                    CSTE_ENT123=(Token)match(input,CSTE_ENT,FOLLOW_CSTE_ENT_in_expr1129); 
                    CSTE_ENT123_tree = (Object)adaptor.create(CSTE_ENT123);
                    adaptor.addChild(root_0, CSTE_ENT123_tree);


                    }
                    break;
                case 6 :
                    // grammar/Looc.g:84:11: CSTE_CHAINE
                    {
                    root_0 = (Object)adaptor.nil();

                    CSTE_CHAINE124=(Token)match(input,CSTE_CHAINE,FOLLOW_CSTE_CHAINE_in_expr1141); 
                    CSTE_CHAINE124_tree = (Object)adaptor.create(CSTE_CHAINE124);
                    adaptor.addChild(root_0, CSTE_CHAINE124_tree);


                    }
                    break;
                case 7 :
                    // grammar/Looc.g:85:20: 'new' IDF_CLASS
                    {
                    string_literal125=(Token)match(input,71,FOLLOW_71_in_expr1162);  
                    stream_71.add(string_literal125);

                    IDF_CLASS126=(Token)match(input,IDF_CLASS,FOLLOW_IDF_CLASS_in_expr1164);  
                    stream_IDF_CLASS.add(IDF_CLASS126);



                    // AST REWRITE
                    // elements: IDF_CLASS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 85:36: -> ^( NEW IDF_CLASS )
                    {
                        // grammar/Looc.g:85:39: ^( NEW IDF_CLASS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEW, "NEW"), root_1);

                        adaptor.addChild(root_1, stream_IDF_CLASS.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // grammar/Looc.g:86:20: SUB expr
                    {
                    SUB127=(Token)match(input,SUB,FOLLOW_SUB_in_expr1193);  
                    stream_SUB.add(SUB127);

                    pushFollow(FOLLOW_expr_in_expr1195);
                    expr128=expr();

                    state._fsp--;

                    stream_expr.add(expr128.getTree());


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:29: -> ^( MINUS expr )
                    {
                        // grammar/Looc.g:86:32: ^( MINUS expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUS, "MINUS"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
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
        return retval;
    }
    // $ANTLR end "expr"

    public static class multi_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multi"
    // grammar/Looc.g:89:1: multi : MUL ;
    public final LoocParser.multi_return multi() throws RecognitionException {
        LoocParser.multi_return retval = new LoocParser.multi_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MUL129=null;

        Object MUL129_tree=null;

        try {
            // grammar/Looc.g:89:6: ( MUL )
            // grammar/Looc.g:89:12: MUL
            {
            root_0 = (Object)adaptor.nil();

            MUL129=(Token)match(input,MUL,FOLLOW_MUL_in_multi1219); 
            MUL129_tree = (Object)adaptor.create(MUL129);
            adaptor.addChild(root_0, MUL129_tree);


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
        return retval;
    }
    // $ANTLR end "multi"

    public static class add_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add"
    // grammar/Looc.g:91:1: add : ( ADD | SUB );
    public final LoocParser.add_return add() throws RecognitionException {
        LoocParser.add_return retval = new LoocParser.add_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set130=null;

        Object set130_tree=null;

        try {
            // grammar/Looc.g:91:4: ( ADD | SUB )
            // grammar/Looc.g:
            {
            root_0 = (Object)adaptor.nil();

            set130=(Token)input.LT(1);
            if ( input.LA(1)==SUB||input.LA(1)==ADD ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set130));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "add"

    public static class comp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comp"
    // grammar/Looc.g:95:1: comp : ( EQ | NEQ | LT | GT | LE | GE );
    public final LoocParser.comp_return comp() throws RecognitionException {
        LoocParser.comp_return retval = new LoocParser.comp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set131=null;

        Object set131_tree=null;

        try {
            // grammar/Looc.g:95:5: ( EQ | NEQ | LT | GT | LE | GE )
            // grammar/Looc.g:
            {
            root_0 = (Object)adaptor.nil();

            set131=(Token)input.LT(1);
            if ( (input.LA(1)>=EQ && input.LA(1)<=GE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set131));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "comp"

    // Delegated rules


 

    public static final BitSet FOLLOW_class_decl_in_prog135 = new BitSet(new long[]{0x4888210004000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_var_decl_in_prog138 = new BitSet(new long[]{0x4888200004000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_instruction_in_prog141 = new BitSet(new long[]{0x4888200004000002L,0x000000000000000EL});
    public static final BitSet FOLLOW_40_in_class_decl171 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDF_CLASS_in_class_decl173 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41_in_class_decl177 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDF_CLASS_in_class_decl179 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_class_decl184 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_class_decl186 = new BitSet(new long[]{0x0004300000000000L});
    public static final BitSet FOLLOW_class_item_decl_in_class_decl188 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_class_decl190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_class_item_decl218 = new BitSet(new long[]{0x0004200000000002L});
    public static final BitSet FOLLOW_method_decl_in_class_item_decl221 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_45_in_var_decl250 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IDF_in_var_decl252 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_var_decl254 = new BitSet(new long[]{0x0003000002000000L});
    public static final BitSet FOLLOW_type_in_var_decl256 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_var_decl258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_method_decl333 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IDF_in_method_decl335 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_method_decl337 = new BitSet(new long[]{0x0000100004000000L});
    public static final BitSet FOLLOW_method_args_in_method_decl339 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_method_decl342 = new BitSet(new long[]{0x0008400000000000L});
    public static final BitSet FOLLOW_method_decl_suite_in_method_decl344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_method_decl_suite365 = new BitSet(new long[]{0x0003000002000000L});
    public static final BitSet FOLLOW_type_in_method_decl_suite367 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_method_decl_suite371 = new BitSet(new long[]{0x4888200004000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_var_decl_in_method_decl_suite373 = new BitSet(new long[]{0x4888200004000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_instruction_in_method_decl_suite376 = new BitSet(new long[]{0x4898200004000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_52_in_method_decl_suite379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_method_args411 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_method_args413 = new BitSet(new long[]{0x0003000002000000L});
    public static final BitSet FOLLOW_type_in_method_args415 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_method_args418 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IDF_in_method_args420 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_method_args422 = new BitSet(new long[]{0x0003000002000000L});
    public static final BitSet FOLLOW_type_in_method_args424 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_IDF_in_instruction452 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_instruction454 = new BitSet(new long[]{0x000008003C000000L,0x00000000000000E1L});
    public static final BitSet FOLLOW_instruction_suite_in_instruction456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_instruction487 = new BitSet(new long[]{0x000008003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_expression_in_instruction489 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_instruction491 = new BitSet(new long[]{0x4888200004000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_instruction_in_instruction495 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_57_in_instruction498 = new BitSet(new long[]{0x4888200004000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_instruction_in_instruction502 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_instruction506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_instruction551 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IDF_in_instruction553 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_instruction555 = new BitSet(new long[]{0x000008003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_expression_in_instruction559 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_instruction561 = new BitSet(new long[]{0x000008003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_expression_in_instruction565 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_instruction567 = new BitSet(new long[]{0x4888200004000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_instruction_in_instruction569 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_instruction571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_instruction612 = new BitSet(new long[]{0x4888200004000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_var_decl_in_instruction614 = new BitSet(new long[]{0x4888200004000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_instruction_in_instruction617 = new BitSet(new long[]{0x4898200004000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_52_in_instruction620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_instruction653 = new BitSet(new long[]{0x000008003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_expression_in_instruction655 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_instruction657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_func_in_instruction686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_func_in_instruction707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_func_in_instruction728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_instruction_suite740 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_instruction_suite742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_instruction_suite767 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_instruction_suite769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_print_func792 = new BitSet(new long[]{0x000008003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_print_func_suite_in_print_func794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_print_func_suite809 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_print_func_suite811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_read_func830 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IDF_in_read_func832 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_read_func834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_return_func855 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_return_func857 = new BitSet(new long[]{0x000008003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_expression_in_return_func859 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_return_func861 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_return_func863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_expression_in_expression879 = new BitSet(new long[]{0x00000000A0000002L});
    public static final BitSet FOLLOW_add_in_expression882 = new BitSet(new long[]{0x000008003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_mult_expression_in_expression885 = new BitSet(new long[]{0x00000000A0000002L});
    public static final BitSet FOLLOW_comp_expression_in_mult_expression894 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_multi_in_mult_expression897 = new BitSet(new long[]{0x000008003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_comp_expression_in_mult_expression900 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_expr_in_comp_expression910 = new BitSet(new long[]{0x0000003F00000002L});
    public static final BitSet FOLLOW_comp_in_comp_expression913 = new BitSet(new long[]{0x000008003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_expr_in_comp_expression916 = new BitSet(new long[]{0x0000003F00000002L});
    public static final BitSet FOLLOW_IDF_in_expr932 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_expr935 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IDF_in_expr938 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_expr940 = new BitSet(new long[]{0x000018003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_expression_in_expr944 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_53_in_expr947 = new BitSet(new long[]{0x000008003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_expression_in_expr950 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_44_in_expr956 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_69_in_expr979 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_expr982 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IDF_in_expr985 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_expr987 = new BitSet(new long[]{0x000018003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_expression_in_expr991 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_53_in_expr994 = new BitSet(new long[]{0x000008003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_expression_in_expr997 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_44_in_expr1003 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_70_in_expr1027 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_expr1030 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IDF_in_expr1033 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_expr1035 = new BitSet(new long[]{0x000018003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_expression_in_expr1039 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_53_in_expr1042 = new BitSet(new long[]{0x000008003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_expression_in_expr1045 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_44_in_expr1051 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_43_in_expr1075 = new BitSet(new long[]{0x000008003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_expression_in_expr1078 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_expr1080 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_expr1084 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IDF_in_expr1087 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_expr1089 = new BitSet(new long[]{0x000018003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_expression_in_expr1093 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_53_in_expr1096 = new BitSet(new long[]{0x000008003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_expression_in_expr1099 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_44_in_expr1105 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_CSTE_ENT_in_expr1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_CHAINE_in_expr1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_expr1162 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDF_CLASS_in_expr1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_expr1193 = new BitSet(new long[]{0x000008003C000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_expr_in_expr1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUL_in_multi1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_add0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comp0 = new BitSet(new long[]{0x0000000000000002L});

}