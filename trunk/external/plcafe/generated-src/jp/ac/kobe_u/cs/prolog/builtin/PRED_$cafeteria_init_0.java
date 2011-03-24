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
 <code>'$cafeteria_init'/0</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$cafeteria_init_0 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol(":", 2);
    static SymbolTerm s2 = SymbolTerm.makeSymbol("jp.ac.kobe_u.cs.prolog.builtin");
    static SymbolTerm s3 = SymbolTerm.makeSymbol("$leap_flag", 1);
    static SymbolTerm s4 = SymbolTerm.makeSymbol("$current_leash", 1);
    static SymbolTerm s5 = SymbolTerm.makeSymbol("$current_spypoint", 3);
    static SymbolTerm s6 = SymbolTerm.makeSymbol("$consulted_file", 1);
    static SymbolTerm s7 = SymbolTerm.makeSymbol("$consulted_package", 1);
    static SymbolTerm s8 = SymbolTerm.makeSymbol("$consulted_predicate", 3);
    static SymbolTerm s9 = SymbolTerm.makeSymbol("no");
    static Term[] s10 = {s9};
    static StructureTerm s11 = new StructureTerm(s3, s10);
    static Term[] s12 = {s2, s11};
    static StructureTerm s13 = new StructureTerm(s1, s12);
    static SymbolTerm s14 = SymbolTerm.makeSymbol("call");
    static Term[] s15 = {s14};
    static StructureTerm s16 = new StructureTerm(s4, s15);
    static Term[] s17 = {s2, s16};
    static StructureTerm s18 = new StructureTerm(s1, s17);
    static SymbolTerm s19 = SymbolTerm.makeSymbol("exit");
    static Term[] s20 = {s19};
    static StructureTerm s21 = new StructureTerm(s4, s20);
    static Term[] s22 = {s2, s21};
    static StructureTerm s23 = new StructureTerm(s1, s22);
    static SymbolTerm s24 = SymbolTerm.makeSymbol("redo");
    static Term[] s25 = {s24};
    static StructureTerm s26 = new StructureTerm(s4, s25);
    static Term[] s27 = {s2, s26};
    static StructureTerm s28 = new StructureTerm(s1, s27);
    static SymbolTerm s29 = SymbolTerm.makeSymbol("fail");
    static Term[] s30 = {s29};
    static StructureTerm s31 = new StructureTerm(s4, s30);
    static Term[] s32 = {s2, s31};
    static StructureTerm s33 = new StructureTerm(s1, s32);

    public PRED_$cafeteria_init_0(Predicate cont) {
        this.cont = cont;
    }

    public PRED_$cafeteria_init_0(){}

    public void setArgument(Term[] args, Predicate cont) {
        this.cont = cont;
    }

    public int arity() { return 0; }

    public String toString() {
        return "$cafeteria_init";
    }

    public Predicate exec(Prolog engine) {
    // '$cafeteria_init':-retractall('$leap_flag'(A)),retractall('$current_leash'(B)),retractall('$current_spypoint'(C,D,E)),retractall('$consulted_file'(F)),retractall('$consulted_package'(G)),retractall('$consulted_predicate'(H,I,J)),assertz('$leap_flag'(no)),assertz('$current_leash'(call)),assertz('$current_leash'(exit)),assertz('$current_leash'(redo)),assertz('$current_leash'(fail)),!
        engine.setB0();
        Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Predicate p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11;
    // '$cafeteria_init':-['$get_level'(A),retractall('jp.ac.kobe_u.cs.prolog.builtin':'$leap_flag'(B)),retractall('jp.ac.kobe_u.cs.prolog.builtin':'$current_leash'(C)),retractall('jp.ac.kobe_u.cs.prolog.builtin':'$current_spypoint'(D,E,F)),retractall('jp.ac.kobe_u.cs.prolog.builtin':'$consulted_file'(G)),retractall('jp.ac.kobe_u.cs.prolog.builtin':'$consulted_package'(H)),retractall('jp.ac.kobe_u.cs.prolog.builtin':'$consulted_predicate'(I,J,K)),assertz('jp.ac.kobe_u.cs.prolog.builtin':'$leap_flag'(no)),assertz('jp.ac.kobe_u.cs.prolog.builtin':'$current_leash'(call)),assertz('jp.ac.kobe_u.cs.prolog.builtin':'$current_leash'(exit)),assertz('jp.ac.kobe_u.cs.prolog.builtin':'$current_leash'(redo)),assertz('jp.ac.kobe_u.cs.prolog.builtin':'$current_leash'(fail)),'$cut'(A)]
        a1 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(1))
        if (! a1.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        Term[] y1 = {new VariableTerm(engine)};
        a2 = new StructureTerm(s3, y1);
        Term[] y2 = {s2, a2};
        a3 = new StructureTerm(s1, y2);
        Term[] y3 = {new VariableTerm(engine)};
        a4 = new StructureTerm(s4, y3);
        Term[] y4 = {s2, a4};
        a5 = new StructureTerm(s1, y4);
        Term[] y5 = {new VariableTerm(engine), new VariableTerm(engine), new VariableTerm(engine)};
        a6 = new StructureTerm(s5, y5);
        Term[] y6 = {s2, a6};
        a7 = new StructureTerm(s1, y6);
        Term[] y7 = {new VariableTerm(engine)};
        a8 = new StructureTerm(s6, y7);
        Term[] y8 = {s2, a8};
        a9 = new StructureTerm(s1, y8);
        Term[] y9 = {new VariableTerm(engine)};
        a10 = new StructureTerm(s7, y9);
        Term[] y10 = {s2, a10};
        a11 = new StructureTerm(s1, y10);
        Term[] y11 = {new VariableTerm(engine), new VariableTerm(engine), new VariableTerm(engine)};
        a12 = new StructureTerm(s8, y11);
        Term[] y12 = {s2, a12};
        a13 = new StructureTerm(s1, y12);
        p1 = new PRED_$cut_1(a1, cont);
        p2 = new PRED_assertz_1(s33, p1);
        p3 = new PRED_assertz_1(s28, p2);
        p4 = new PRED_assertz_1(s23, p3);
        p5 = new PRED_assertz_1(s18, p4);
        p6 = new PRED_assertz_1(s13, p5);
        p7 = new PRED_retractall_1(a13, p6);
        p8 = new PRED_retractall_1(a11, p7);
        p9 = new PRED_retractall_1(a9, p8);
        p10 = new PRED_retractall_1(a7, p9);
        p11 = new PRED_retractall_1(a5, p10);
        return new PRED_retractall_1(a3, p11);
    }
}