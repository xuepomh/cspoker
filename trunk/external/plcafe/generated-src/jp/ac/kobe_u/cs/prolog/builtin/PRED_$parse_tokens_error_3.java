package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$parse_tokens_error'/3</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$parse_tokens_error_3 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("{SYNTAX ERROR}");
    static SymbolTerm s2 = SymbolTerm.makeSymbol("** ");
    static SymbolTerm s3 = SymbolTerm.makeSymbol(" **");
    static SymbolTerm s4 = SymbolTerm.makeSymbol("[]");
    static SymbolTerm s5 = SymbolTerm.makeSymbol(":", 2);
    static SymbolTerm s6 = SymbolTerm.makeSymbol("jp.ac.kobe_u.cs.prolog.builtin");
    static SymbolTerm s7 = SymbolTerm.makeSymbol("$tokens", 1);

    public Term arg1, arg2, arg3;

    public PRED_$parse_tokens_error_3(Term a1, Term a2, Term a3, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        this.cont = cont;
    }

    public PRED_$parse_tokens_error_3(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        this.cont = cont;
    }

    public int arity() { return 3; }

    public String toString() {
        return "$parse_tokens_error(" + arg1 + "," + arg2 + "," + arg3 + ")";
    }

    public Predicate exec(Prolog engine) {
    // '$parse_tokens_error'(A,B,C):-write('{SYNTAX ERROR}'),nl,write('** '),'$parse_tokens_write_message'(A),write(' **'),nl,'$parse_tokens_error1'([],B),clause('$tokens'(D),E),'$parse_tokens_error1'(D,B),fail
        engine.setB0();
        Term a1, a2, a3, a4, a5, a6;
        Predicate p1, p2, p3, p4, p5, p6, p7, p8, p9;
        a1 = arg1;
        a2 = arg2;
        a3 = arg3;
    // '$parse_tokens_error'(A,B,C):-[write('{SYNTAX ERROR}'),nl,write('** '),'$parse_tokens_write_message'(A),write(' **'),nl,'$parse_tokens_error1'([],B),clause('jp.ac.kobe_u.cs.prolog.builtin':'$tokens'(D),E),'$parse_tokens_error1'(D,B),fail]
        a4 = new VariableTerm(engine);
        Term[] y1 = {a4};
        a5 = new StructureTerm(s7, y1);
        Term[] y2 = {s6, a5};
        a6 = new StructureTerm(s5, y2);
        p1 = new PRED_fail_0(cont);
        p2 = new PRED_$parse_tokens_error1_2(a4, a2, p1);
        p3 = new PRED_clause_2(a6, new VariableTerm(engine), p2);
        p4 = new PRED_$parse_tokens_error1_2(s4, a2, p3);
        p5 = new PRED_nl_0(p4);
        p6 = new PRED_write_1(s3, p5);
        p7 = new PRED_$parse_tokens_write_message_1(a1, p6);
        p8 = new PRED_write_1(s2, p7);
        p9 = new PRED_nl_0(p8);
        return new PRED_write_1(s1, p9);
    }
}
