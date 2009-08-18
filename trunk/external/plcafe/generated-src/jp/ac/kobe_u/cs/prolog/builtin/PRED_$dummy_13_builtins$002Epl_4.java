package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.IntegerTerm;
import jp.ac.kobe_u.cs.prolog.lang.Predicate;
import jp.ac.kobe_u.cs.prolog.lang.Prolog;
import jp.ac.kobe_u.cs.prolog.lang.Term;
import jp.ac.kobe_u.cs.prolog.lang.VariableTerm;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$dummy_13_builtins.pl'/4</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$dummy_13_builtins$002Epl_4 extends Predicate {
    static Predicate _$dummy_13_builtins$002Epl_4_sub_1 = new PRED_$dummy_13_builtins$002Epl_4_sub_1();
    static Predicate _$dummy_13_builtins$002Epl_4_1 = new PRED_$dummy_13_builtins$002Epl_4_1();
    static Predicate _$dummy_13_builtins$002Epl_4_2 = new PRED_$dummy_13_builtins$002Epl_4_2();

    public Term arg1, arg2, arg3, arg4;

    public PRED_$dummy_13_builtins$002Epl_4(Term a1, Term a2, Term a3, Term a4, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        arg4 = a4;
        this.cont = cont;
    }

    public PRED_$dummy_13_builtins$002Epl_4(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        arg4 = args[3];
        this.cont = cont;
    }

    public int arity() { return 4; }

    public String toString() {
        return "$dummy_13_builtins.pl(" + arg1 + "," + arg2 + "," + arg3 + "," + arg4 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.aregs[2] = arg2;
        engine.aregs[3] = arg3;
        engine.aregs[4] = arg4;
        engine.cont = cont;
        engine.setB0();
        return engine.jtry(_$dummy_13_builtins$002Epl_4_1, _$dummy_13_builtins$002Epl_4_sub_1);
    }
}

class PRED_$dummy_13_builtins$002Epl_4_sub_1 extends PRED_$dummy_13_builtins$002Epl_4 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$dummy_13_builtins$002Epl_4_2);
    }
}

class PRED_$dummy_13_builtins$002Epl_4_1 extends PRED_$dummy_13_builtins$002Epl_4 {
    public Predicate exec(Prolog engine) {
    // '$dummy_13_builtins.pl'(A,B,C,D):-hash_contains_key(B,C),!,hash_get(B,C,D),A==D
        Term a1, a2, a3, a4, a5;
        Predicate p1, p2, p3;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        cont = engine.cont;
    // '$dummy_13_builtins.pl'(A,B,C,D):-['$get_level'(E),hash_contains_key(B,C),'$cut'(E),hash_get(B,C,D),'$equality_of_term'(A,D)]
        a5 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(5))
        if (! a5.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        p1 = new PRED_$equality_of_term_2(a1, a4, cont);
        p2 = new PRED_hash_get_3(a2, a3, a4, p1);
        p3 = new PRED_$cut_1(a5, p2);
        return new PRED_hash_contains_key_2(a2, a3, p3);
    }
}

class PRED_$dummy_13_builtins$002Epl_4_2 extends PRED_$dummy_13_builtins$002Epl_4 {
    public Predicate exec(Prolog engine) {
    // '$dummy_13_builtins.pl'(A,B,C,D):-var(A),hash_put(B,C,A)
        Term a1, a2, a3, a4;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        cont = engine.cont;
    // '$dummy_13_builtins.pl'(A,B,C,D):-[var(A),hash_put(B,C,A)]
        //START inline expansion of var(a(1))
        a1 = a1.dereference();
        if (! a1.isVariable()) {
            return engine.fail();
        }
        //END inline expansion
        return new PRED_hash_put_3(a2, a3, a1, cont);
    }
}
