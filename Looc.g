grammar Looc ;

options{
			k=1; /* permet de dire que la grammaire doit etre LL(1) */
			output=AST;
}

tokens{
	PROG;
	CLASSDEF;
	INHERIT;
	CLASSBODY;
	METHODBODY;
	FORBODY;
	VARDEF;
	METHODDEF;
	ARGS;
	RETURN;
	AFFECT;
	IF;
	THEN;
	ELSE;
	FOR;
	INSTRUCTIONS;
	DO;
	WRITE;
	READ;
	NEW;
	MINUS;
}

prog:             	class_decl* var_decl* instruction+ -> ^(PROG class_decl* var_decl* instruction+);

class_decl:       	'class' IDF_CLASS ( 'inherit' IDF_CLASS )? '=' '(' class_item_decl ')' -> ^(CLASSDEF IDF_CLASS ^(INHERIT IDF_CLASS)? class_item_decl); /* les options sont mis en 0 ou 1 avec '?' */

class_item_decl:  	var_decl* method_decl* -> ^(CLASSBODY var_decl* method_decl*);

var_decl:         	'var' IDF ':' type ';' -> ^(VARDEF IDF type);
 
type:             	IDF_CLASS
    |             	'int'
    |			'string'
    ;

method_decl:		'method' IDF '(' method_args? ')' method_decl_suite -> ^(METHODDEF IDF method_args? method_decl_suite);

method_decl_suite:	(':' type)? '{' var_decl* instruction+ '}' -> ^(RETURN type)? ^(METHODBODY var_decl* instruction+);

method_args:      	IDF ':' type (',' IDF ':' type)* -> ^(ARGS (IDF type)+);

instruction:      	IDF ':=' instruction_suite -> ^(AFFECT IDF instruction_suite)
    |             	'if' expression 'then' a=instruction ('else' b=instruction)? 'fi' -> ^(IF expression ^(THEN $a) ^(ELSE $b)?) 
    |             	'for' IDF 'in' c=expression '..' d=expression 'do' instruction 'end' -> ^(FOR IDF $c $d ^(FORBODY instruction))
    |             	'{' var_decl* instruction+ '}' -> ^(INSTRUCTIONS var_decl* instruction+)
    |             	'do' expression ';' -> ^(DO expression)
    |             	print_func
    |             	read_func
    |             	return_func
    ;

instruction_suite:	expression ';' -> expression
    |             	'nil' ';' -> 'nil'
    ;

print_func:       	'write' print_func_suite -> ^(WRITE print_func_suite);

print_func_suite:	expression ';' -> expression;

read_func:        	'read' IDF ';' -> ^(READ IDF);

return_func:      	'return' '(' expression ')' ';' -> ^(RETURN expression);

expression:		mult_expression (add^ mult_expression)*;

mult_expression:	comp_expression (multi^ comp_expression)*;

comp_expression: 	expr (comp^ expr)*;

expr:      		IDF ('.'^ IDF '('! (expression (','! expression)*)? ')'!)*
    |            	'this' ('.'^ IDF '('! (expression (','! expression)*)? ')'!)*
    |             	'super' ('.'^ IDF '('! (expression (','! expression)*)? ')'!)*
    |             	'('! expression ')'! ('.'^ IDF '('! (expression (','! expression)*)? ')'!)*
    |             	CSTE_ENT
    |		  	CSTE_CHAINE
    |             	'new' IDF_CLASS -> ^(NEW IDF_CLASS)
    |             	SUB expr -> ^(MINUS expr)
    ;

multi:		  	MUL;

add:	  		ADD
    |		  	SUB
    ;

comp:		  	EQ
    |             	NEQ
    |             	LT
    |             	GT
    |             	LE
    |             	GE
    ;
    
CSTE_ENT:         	'0'..'9'+ ;
CSTE_CHAINE:      	'"' .+ '"' ;
CSTE_COMM:		'/*' .* '*/';
IDF_CLASS:        	('A'..'Z') ('A'..'Z' | 'a'..'z' | '0'..'9' | '_')* ; /* Idf = IDF_CLASS*/
IDF:              	('a'..'z') ('A'..'Z' | 'a'..'z' | '0'..'9' | '_')* ; /* idf = IDF */
WS:	  		(' '|'\t'|'\n'|CSTE_COMM)+ {$channel=HIDDEN;} ;
MUL:		  	'*';
ADD:		  	'+';
SUB:		  	'-';
EQ:		  	'==';
NEQ:		  	'!=';
LT:		  	'<';
GT:		  	'>';
LE:		  	'<=';
GE:		  	'>=';
