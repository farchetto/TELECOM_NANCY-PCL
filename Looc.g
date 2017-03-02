grammar Looc ;

options{
			k=1; /* permet de dire que la grammaire doit etre LL(1) */
			output=AST;
}

prog:             	class_decl* var_decl* instruction+;

class_decl:       	'class' IDF_CLASS ( 'inherit' IDF_CLASS )? '=' '(' class_item_decl ')'; /* les options sont mis en 0 ou 1 avec '?' */

class_item_decl:  	var_decl* method_decl* ;

var_decl:         	'var' IDF ':' type ';' ;
 
type:             	IDF_CLASS
    |             	'int'
    |			'string'
    ;

method_decl:		'method' IDF '(' method_args* ')' method_decl_suite ;

method_decl_suite:	'{' var_decl* instruction+ '}'
    |             	':' type '{' var_decl* instruction+ '}'
    ;

method_args:      	IDF ':' type (',' IDF ':' type)* ;

instruction:      	IDF ':=' instruction_suite
    |             	'if' expression 'then' instruction ('else' instruction)? 'fi'
    |             	'for' IDF 'in' expression '..' expression 'do' instruction+ 'end'
    |             	'{' var_decl* instruction+ '}'
    |             	'do' expression ';'
    |             	print_func
    |             	read_func
    |             	return_func
    ;

instruction_suite:	expression ';'
    |             	'nil' ';'
	;

print_func:       	'write' print_func_suite ;

print_func_suite:	expression ';'
    ;

read_func:        	'read' IDF ';' ;

return_func:      	'return' '(' expression ')' ';' ;

expression:		add_expression (comp add_expression)*;

add_expression:		mult_expression (add mult_expression)*;

mult_expression:	expr (multi expr)*;




expr:      		IDF expr_optionnal_func
    |            	'this' expr_optionnal_func
    |             	'super' expr_optionnal_func
    |             	CSTE_ENT expr_optionnal_func
    |		  	CSTE_CHAINE expr_optionnal_func
    |             	'new' IDF_CLASS expr_optionnal_func
    |             	'(' expression ')' expr_optionnal_func
    |             	SUB expr
    ;

expr_optionnal_func:	('.' IDF '(' (expression (',' expression)*)? ')')*;

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
