package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>merge/3</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
public class PRED_merge_3 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("var");
    static SymbolTerm s2 = SymbolTerm.makeSymbol("merge", 3);
    static IntegerTerm si3 = new IntegerTerm(1);
    static IntegerTerm si4 = new IntegerTerm(2);
    static IntegerTerm si5 = new IntegerTerm(0);
    static SymbolTerm s6 = SymbolTerm.makeSymbol("=<");
    static Predicate _merge_3_sub_1 = new PRED_merge_3_sub_1();
    static Predicate _merge_3_sub_2 = new PRED_merge_3_sub_2();
    static Predicate _merge_3_1 = new PRED_merge_3_1();
    static Predicate _merge_3_2 = new PRED_merge_3_2();
    static Predicate _merge_3_3 = new PRED_merge_3_3();

    public Term arg1, arg2, arg3;

    public PRED_merge_3(Term a1, Term a2, Term a3, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        this.cont = cont;
    }

    public PRED_merge_3(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        this.cont = cont;
    }

    public int arity() { return 3; }

    public String toString() {
        return "merge(" + arg1 + "," + arg2 + "," + arg3 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.aregs[2] = arg2;
        engine.aregs[3] = arg3;
        engine.cont = cont;
        engine.setB0();
        return engine.jtry(_merge_3_1, _merge_3_sub_1);
    }
}

class PRED_merge_3_sub_1 extends PRED_merge_3 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_merge_3_2, _merge_3_sub_2);
    }
}

class PRED_merge_3_sub_2 extends PRED_merge_3 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_merge_3_3);
    }
}

class PRED_merge_3_1 extends PRED_merge_3 {
    public Predicate exec(Prolog engine) {
    // merge(A,B,C):-var(A),!,illarg(var,merge(A,B,C),1)
        Term a1, a2, a3, a4, a5;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // merge(A,B,C):-['$get_level'(D),var(A),'$cut'(D),illarg(var,merge(A,B,C),1)]
        a4 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(4))
        if (! a4.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dereference();
        if (! a1.isVariable()) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dereference();
        if (! a4.isInteger()) {
            throw new IllegalTypeException("integer", a4);
        } else {
            engine.cut(((IntegerTerm) a4).intValue());
        }
        //END inline expansion
        Term[] y1 = {a1, a2, a3};
        a5 = new StructureTerm(s2, y1);
        return new PRED_illarg_3(s1, a5, si3, cont);
    }
}

class PRED_merge_3_2 extends PRED_merge_3 {
    public Predicate exec(Prolog engine) {
    // merge(A,B,C):-var(B),!,illarg(var,merge(A,B,C),2)
        Term a1, a2, a3, a4, a5;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // merge(A,B,C):-['$get_level'(D),var(B),'$cut'(D),illarg(var,merge(A,B,C),2)]
        a4 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(4))
        if (! a4.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(2))
        a2 = a2.dereference();
        if (! a2.isVariable()) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dereference();
        if (! a4.isInteger()) {
            throw new IllegalTypeException("integer", a4);
        } else {
            engine.cut(((IntegerTerm) a4).intValue());
        }
        //END inline expansion
        Term[] y1 = {a1, a2, a3};
        a5 = new StructureTerm(s2, y1);
        return new PRED_illarg_3(s1, a5, si4, cont);
    }
}

class PRED_merge_3_3 extends PRED_merge_3 {
    public Predicate exec(Prolog engine) {
    // merge(A,B,C):-'$merge'(A,B,D,0,=<),C=D
        Term a1, a2, a3, a4;
        Predicate p1;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // merge(A,B,C):-['$merge'(A,B,D,0,=<),'$unify'(C,D)]
        a4 = new VariableTerm(engine);
        p1 = new PRED_$unify_2(a3, a4, cont);
        return new PRED_$merge_5(a1, a2, a4, si5, s6, p1);
    }
}
