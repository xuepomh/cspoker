package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$dummy_11_builtins.pl'/1</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$dummy_11_builtins$002Epl_1 extends Predicate {
    static Predicate _$dummy_11_builtins$002Epl_1_sub_1 = new PRED_$dummy_11_builtins$002Epl_1_sub_1();
    static Predicate _$dummy_11_builtins$002Epl_1_1 = new PRED_$dummy_11_builtins$002Epl_1_1();
    static Predicate _$dummy_11_builtins$002Epl_1_2 = new PRED_$dummy_11_builtins$002Epl_1_2();

    public Term arg1;

    public PRED_$dummy_11_builtins$002Epl_1(Term a1, Predicate cont) {
        arg1 = a1;
        this.cont = cont;
    }

    public PRED_$dummy_11_builtins$002Epl_1(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        this.cont = cont;
    }

    public int arity() { return 1; }

    public String toString() {
        return "$dummy_11_builtins.pl(" + arg1 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.cont = cont;
        engine.setB0();
        return engine.jtry(_$dummy_11_builtins$002Epl_1_1, _$dummy_11_builtins$002Epl_1_sub_1);
    }
}

class PRED_$dummy_11_builtins$002Epl_1_sub_1 extends PRED_$dummy_11_builtins$002Epl_1 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$dummy_11_builtins$002Epl_1_2);
    }
}

class PRED_$dummy_11_builtins$002Epl_1_1 extends PRED_$dummy_11_builtins$002Epl_1 {
    public Predicate exec(Prolog engine) {
    // '$dummy_11_builtins.pl'(A):-integer(A),!,fail
        Term a1, a2;
        Predicate cont;
        a1 = engine.aregs[1];
        cont = engine.cont;
    // '$dummy_11_builtins.pl'(A):-['$get_level'(B),integer(A),'$cut'(B),fail]
        a2 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(2))
        if (! a2.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of integer(a(1))
        a1 = a1.dereference();
        if (! a1.isInteger()) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dereference();
        if (! a2.isInteger()) {
            throw new IllegalTypeException("integer", a2);
        } else {
            engine.cut(((IntegerTerm) a2).intValue());
        }
        //END inline expansion
        //START inline expansion of fail
        return engine.fail();
        //END inline expansion
    }
}

class PRED_$dummy_11_builtins$002Epl_1_2 extends PRED_$dummy_11_builtins$002Epl_1 {
    public Predicate exec(Prolog engine) {
    // '$dummy_11_builtins.pl'(A):-true
        Term a1;
        Predicate cont;
        a1 = engine.aregs[1];
        cont = engine.cont;
    // '$dummy_11_builtins.pl'(A):-[]
        return cont;
    }
}
