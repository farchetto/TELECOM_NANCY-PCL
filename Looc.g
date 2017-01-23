grammar Looc ;

prog:             class_decl* var_decl* instruction+ ;

class_decl:       'class' IDF_CLASS ( 'inherit' IDF_CLASS )? '=' '(' class_item_decl ')' ; /* les options sont mis en 0 ou 1 avec '?' */

class_item_decl:  var_decl* method_decl* ;

var_decl:         'var' IDF ':' type ';' ;

type:             IDF_CLASS
    |             'int'
    |             'string'
    ;

method_decl:      'method' IDF '(' method_args* ')'
	(			  '{' var_decl* instruction+ '}'
    |             ':' type '{' var_decl* instruction+ '}'
	)
    ;

method_args:      IDF ':' type {',' IDF ':' type}* ;

instruction:      IDF ':=' 
	(			  expression ';'
    |             'nil' ';'
	)
    |             'if' expression 'then' instruction ('else' instruction)? 'fi'
    |             'for' IDF 'in' expression '..' expression 'do' instruction+ 'end'
    |             '{' var_decl* instruction+ '}'
    |             'do' expression '.' IDF '(' expression {',' expression}* ')' ';'
    |             print_func
    |             read_func
    |             return_func
    ;

print_func:       'write' 
	(			  expression ';'
    |             CSTE_CHAINE ';'
	)
    ;

read_func:        'read' IDF ';' ;

return_func:      'return' '(' expression ')' ';' ;

expression:       IDF
    |             'this'
    |             'super'
    |             CSTE_ENT
    |             'new' IDF_CLASS
    |             '(' expression ')'
    |             '-' expression
    |             expression 
	(			  '.' IDF '(' expression {',' expression}* ')'
    |             oper expression
	)
    ;

oper:             '+'
    |             '-'
    |             '*'
    |             '<'
    |             '<='
    |             '>'
    |             '>='
    |             '=='
    |             '!='
    ;

CSTE_ENT:         '0'..'9'+ ;
CSTE_CHAINE:      '"' ('a'..'z' | 'A'..'Z' | '0'..'9' | ' ' | '#' | '@' | '&' | '(' | ')' | '{' | '}' | '[' | ']' | '?' | '!' | ':' | ';' | '=' | '.' | ',' | '%' | '£' | '$' | '€' | '°' | '<' | '>' | ''')+ '"' ;
IDF_CLASS:        ('A'..'Z') ('A'..'Z' | 'a'..'z' | '0'..'9' | '_')* ; /* Idf = IDF_CLASS*/
IDF:              ('a'..'z') ('A'..'Z' | 'a'..'z' | '0'..'9' | '_')* ; /* idf = IDF */
WS	:	  (' '|'\t'|'\n')+ {$channel=HIDDEN;} ;
