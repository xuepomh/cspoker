package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.IntegerTerm;
import jp.ac.kobe_u.cs.prolog.lang.Predicate;
import jp.ac.kobe_u.cs.prolog.lang.Prolog;
import jp.ac.kobe_u.cs.prolog.lang.StructureTerm;
import jp.ac.kobe_u.cs.prolog.lang.SymbolTerm;
import jp.ac.kobe_u.cs.prolog.lang.Term;
import jp.ac.kobe_u.cs.prolog.lang.VariableTerm;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>cafeteria/0</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
public class PRED_cafeteria_0 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol(":", 2);
    static SymbolTerm s2 = SymbolTerm.makeSymbol("jp.ac.kobe_u.cs.prolog.builtin");
    static SymbolTerm s3 = SymbolTerm.makeSymbol("$cafeteria", 1);
    static SymbolTerm s4 = SymbolTerm.makeSymbol("print_message", 2);
    static SymbolTerm s5 = SymbolTerm.makeSymbol("error");
    static SymbolTerm s6 = SymbolTerm.makeSymbol("end_of_file");
    static SymbolTerm s7 = SymbolTerm.makeSymbol("bye");

    public PRED_cafeteria_0(Predicate cont) {
        this.cont = cont;
    }

    public PRED_cafeteria_0(){}

    public void setArgument(Term[] args, Predicate cont) {
        this.cont = cont;
    }

    public int arity() { return 0; }

    public String toString() {
        return "cafeteria";
    }

    public Predicate exec(Prolog engine) {
    // cafeteria:-'$cafeteria_init',repeat,'$toplvel_loop',on_exception(A,'$cafeteria'(B),print_message(error,A)),B==end_of_file,!,nl,'$fast_write'(bye),nl
        engine.setB0();
        Term a1, a2, a3, a4, a5, a6, a7;
        Predicate p1, p2, p3, p4, p5, p6, p7, p8;
    // cafeteria:-['$get_level'(A),'$cafeteria_init',repeat,'$toplvel_loop',on_exception(B,'jp.ac.kobe_u.cs.prolog.builtin':'$cafeteria'(C),'jp.ac.kobe_u.cs.prolog.builtin':print_message(error,B)),'$equality_of_term'(C,end_of_file),'$cut'(A),nl,'$fast_write'(bye),nl]
        a1 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(1))
        if (! a1.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        a2 = new VariableTerm(engine);
        a3 = new VariableTerm(engine);
        Term[] y1 = {a3};
        a4 = new StructureTerm(s3, y1);
        Term[] y2 = {s2, a4};
        a5 = new StructureTerm(s1, y2);
        Term[] y3 = {s5, a2};
        a6 = new StructureTerm(s4, y3);
        Term[] y4 = {s2, a6};
        a7 = new StructureTerm(s1, y4);
        p1 = new PRED_nl_0(cont);
        p2 = new PRED_$fast_write_1(s7, p1);
        p3 = new PRED_nl_0(p2);
        p4 = new PRED_$cut_1(a1, p3);
        p5 = new PRED_$equality_of_term_2(a3, s6, p4);
        p6 = new PRED_on_exception_3(a2, a5, a7, p5);
        p7 = new PRED_$toplvel_loop_0(p6);
        p8 = new PRED_repeat_0(p7);
        return new PRED_$cafeteria_init_0(p8);
    }
}
