package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$leash'/1</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$leash_1 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("[]");
    static SymbolTerm s2 = SymbolTerm.makeSymbol(":", 2);
    static SymbolTerm s3 = SymbolTerm.makeSymbol("jp.ac.kobe_u.cs.prolog.builtin");
    static SymbolTerm s4 = SymbolTerm.makeSymbol("$current_leash", 1);
    static SymbolTerm s5 = SymbolTerm.makeSymbol("info");
    static SymbolTerm s6 = SymbolTerm.makeSymbol("no");
    static SymbolTerm s7 = SymbolTerm.makeSymbol("leashing");
    static ListTerm s8 = new ListTerm(s7, s1);
    static ListTerm s9 = new ListTerm(s6, s8);
    static SymbolTerm s10 = SymbolTerm.makeSymbol("stopping");
    static SymbolTerm s11 = SymbolTerm.makeSymbol("on");
    static Predicate _$leash_1_var = new PRED_$leash_1_var();
    static Predicate _$leash_1_var_1 = new PRED_$leash_1_var_1();
    static Predicate _$leash_1_1 = new PRED_$leash_1_1();
    static Predicate _$leash_1_2 = new PRED_$leash_1_2();

    public Term arg1;

    public PRED_$leash_1(Term a1, Predicate cont) {
        arg1 = a1;
        this.cont = cont;
    }

    public PRED_$leash_1(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        this.cont = cont;
    }

    public int arity() { return 1; }

    public String toString() {
        return "$leash(" + arg1 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.cont = cont;
        engine.setB0();
        return engine.switch_on_term(_$leash_1_var, _$leash_1_2, _$leash_1_2, _$leash_1_var, _$leash_1_2, _$leash_1_2);
    }
}

class PRED_$leash_1_var extends PRED_$leash_1 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$leash_1_1, _$leash_1_var_1);
    }
}

class PRED_$leash_1_var_1 extends PRED_$leash_1 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$leash_1_2);
    }
}

class PRED_$leash_1_1 extends PRED_$leash_1 {
    public Predicate exec(Prolog engine) {
    // '$leash'([]):-!,retractall('$current_leash'(A)),print_message(info,[no,leashing])
        Term a1, a2, a3;
        Predicate p1;
        Predicate cont;
        a1 = engine.aregs[1];
        cont = engine.cont;
    // '$leash'([]):-['$neck_cut',retractall('jp.ac.kobe_u.cs.prolog.builtin':'$current_leash'(A)),print_message(info,[no,leashing])]
        a1 = a1.dereference();
        if (a1.isSymbol()){
            if (! a1.equals(s1))
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(s1, engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        Term[] y1 = {new VariableTerm(engine)};
        a2 = new StructureTerm(s4, y1);
        Term[] y2 = {s3, a2};
        a3 = new StructureTerm(s2, y2);
        p1 = new PRED_print_message_2(s5, s9, cont);
        return new PRED_retractall_1(a3, p1);
    }
}

class PRED_$leash_1_2 extends PRED_$leash_1 {
    public Predicate exec(Prolog engine) {
    // '$leash'(A):-retractall('$current_leash'(B)),'$assert_leash'(A),print_message(info,[leashing,stopping,on,A])
        Term a1, a2, a3, a4, a5, a6, a7;
        Predicate p1, p2;
        Predicate cont;
        a1 = engine.aregs[1];
        cont = engine.cont;
    // '$leash'(A):-[retractall('jp.ac.kobe_u.cs.prolog.builtin':'$current_leash'(B)),'$assert_leash'(A),print_message(info,[leashing,stopping,on,A])]
        Term[] y1 = {new VariableTerm(engine)};
        a2 = new StructureTerm(s4, y1);
        Term[] y2 = {s3, a2};
        a3 = new StructureTerm(s2, y2);
        a4 = new ListTerm(a1, s1);
        a5 = new ListTerm(s11, a4);
        a6 = new ListTerm(s10, a5);
        a7 = new ListTerm(s7, a6);
        p1 = new PRED_print_message_2(s5, a7, cont);
        p2 = new PRED_$assert_leash_1(a1, p1);
        return new PRED_retractall_1(a3, p2);
    }
}
