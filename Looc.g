grammar Looc ;

prog:             class_decl* var_decl* instruction+ ;

class_decl:       'class' Idf [ 'inherit' Idf ] '=' '(' class_item_decl ')' ;

class_item_decl:  var_decl* method_decl* ;

var_decl:         'var' idf ':' type ';' ;

type:             Idf
    |             'int'
    |             'string'
    ;

method_decl:      'method' idf '(' method_args* ')' '{' var_decl* instruction+ '}'
    |             'method' idf '(' method_args* ')' ':' type '{' var_decl* instruction+ '}'
    ;

method_args:      idf ':' type {',' idf ':' type}* ;

instruction:      idf ':=' expression ';'
    |             idf ':=' 'nil' ';'
    |             'if' expression 'then' instruction ['else' instruction] 'fi'
    |             'for' idf 'in' expression '..' expression 'do' instruction+ 'end'
    |             '{' var_decl* instruction+ '}'
    |             'do' expression '.' idf '(' expression {',' expression}* ')' ';'
    |             print
    |             read
    |             return
    ;

print:            'write' expression ';'
    |             'write' CSTE_CHAINE ';'
    ;

read:             'read' idf ';' ;

return:           'return' '(' expression ')' ';' ;

expression:       idf
    |             'this'
    |             'super'
    |             CSTE_ENT
    |             'new' Idf
    |             expression '.' idf '(' expression {',' expression}* ')'
    |             '(' expression ')'
    |             '-' expression
    |             expression oper expression
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
Idf:              ('A'..'Z') ('A'..'Z' | 'a'..'z' | '0'..'9' | '_')* ;
idf:              ('a'..'z') ('A'..'Z' | 'a'..'z' | '0'..'9' | '_')* ;
