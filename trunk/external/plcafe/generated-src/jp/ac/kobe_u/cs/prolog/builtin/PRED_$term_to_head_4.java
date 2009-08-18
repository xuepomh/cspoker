package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.IllegalTypeException;
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
 <code>'$term_to_head'/4</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$term_to_head_4 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("type", 1);
    static SymbolTerm s2 = SymbolTerm.makeSymbol("callable");
    static Term[] s3 = {s2};
    static StructureTerm s4 = new StructureTerm(s1, s3);
    static IntegerTerm si5 = new IntegerTerm(1);
    static Predicate _$term_to_head_4_sub_1 = new PRED_$term_to_head_4_sub_1();
    static Predicate _$term_to_head_4_sub_2 = new PRED_$term_to_head_4_sub_2();
    static Predicate _$term_to_head_4_1 = new PRED_$term_to_head_4_1();
    static Predicate _$term_to_head_4_2 = new PRED_$term_to_head_4_2();
    static Predicate _$term_to_head_4_3 = new PRED_$term_to_head_4_3();

    public Term arg1, arg2, arg3, arg4;

    public PRED_$term_to_head_4(Term a1, Term a2, Term a3, Term a4, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        arg4 = a4;
        this.cont = cont;
    }

    public PRED_$term_to_head_4(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        arg4 = args[3];
        this.cont = cont;
    }

    public int arity() { return 4; }

    public String toString() {
        return "$term_to_head(" + arg1 + "," + arg2 + "," + arg3 + "," + arg4 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.aregs[2] = arg2;
        engine.aregs[3] = arg3;
        engine.aregs[4] = arg4;
        engine.cont = cont;
        engine.setB0();
        return engine.jtry(_$term_to_head_4_1, _$term_to_head_4_sub_1);
    }
}

class PRED_$term_to_head_4_sub_1 extends PRED_$term_to_head_4 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$term_to_head_4_2, _$term_to_head_4_sub_2);
    }
}

class PRED_$term_to_head_4_sub_2 extends PRED_$term_to_head_4 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$term_to_head_4_3);
    }
}

class PRED_$term_to_head_4_1 extends PRED_$term_to_head_4 {
    public Predicate exec(Prolog engine) {
    // '$term_to_head'(A,A,B,C):-atom(A),!
        Term a1, a2, a3, a4, a5;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        cont = engine.cont;
    // '$term_to_head'(A,A,B,C):-['$get_level'(D),atom(A),'$cut'(D)]
        if (! a1.unify(a2, engine.trail))
            return engine.fail();
        a5 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(5))
        if (! a5.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(1))
        a1 = a1.dereference();
        if (! a1.isSymbol()) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(5))
        a5 = a5.dereference();
        if (! a5.isInteger()) {
            throw new IllegalTypeException("integer", a5);
        } else {
            engine.cut(((IntegerTerm) a5).intValue());
        }
        //END inline expansion
        return cont;
    }
}

class PRED_$term_to_head_4_2 extends PRED_$term_to_head_4 {
    public Predicate exec(Prolog engine) {
    // '$term_to_head'(A,A,B,C):-compound(A),!
        Term a1, a2, a3, a4, a5;
        Predicate p1;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        cont = engine.cont;
    // '$term_to_head'(A,A,B,C):-['$get_level'(D),compound(A),'$cut'(D)]
        if (! a1.unify(a2, engine.trail))
            return engine.fail();
        a5 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(5))
        if (! a5.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        p1 = new PRED_$cut_1(a5, cont);
        return new PRED_compound_1(a1, p1);
    }
}

class PRED_$term_to_head_4_3 extends PRED_$term_to_head_4 {
    public Predicate exec(Prolog engine) {
    // '$term_to_head'(A,B,C,D):-illarg(type(callable),D,1)
        Term a1, a2, a3, a4;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        cont = engine.cont;
    // '$term_to_head'(A,B,C,D):-[illarg(type(callable),D,1)]
        return new PRED_illarg_3(s4, a4, si5, cont);
    }
}
