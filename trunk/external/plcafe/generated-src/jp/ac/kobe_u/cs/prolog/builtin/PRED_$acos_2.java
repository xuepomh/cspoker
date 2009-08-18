package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.Arithmetic;
import jp.ac.kobe_u.cs.prolog.lang.BuiltinException;
import jp.ac.kobe_u.cs.prolog.lang.Predicate;
import jp.ac.kobe_u.cs.prolog.lang.Prolog;
import jp.ac.kobe_u.cs.prolog.lang.Term;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$acos'/2</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
public class PRED_$acos_2 extends Predicate {

    public Term arg1, arg2;

    public PRED_$acos_2(Term a1, Term a2, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        this.cont = cont;
    }

    public PRED_$acos_2(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        this.cont = cont;
    }

    public int arity() { return 2; }

    public String toString() {
        return "$acos(" + arg1 + "," + arg2 + ")";
    }

    public Predicate exec(Prolog engine) {
    // '$acos'(A,B):-'$acos'(A,B)
        engine.setB0();
        Term a1, a2;
        a1 = arg1;
        a2 = arg2;
    // '$acos'(A,B):-['$acos'(A,B)]
        //START inline expansion of $acos(a(1),a(2))
        try {
            if (! a2.unify(Arithmetic.evaluate(a1).acos(), engine.trail)) {
                return engine.fail();
            }
        } catch (BuiltinException e) {
            e.goal = this;
            throw e;
        }
        //END inline expansion
        return cont;
    }
}
