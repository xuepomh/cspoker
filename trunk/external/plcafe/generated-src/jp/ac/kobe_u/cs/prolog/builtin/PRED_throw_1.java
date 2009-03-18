package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>throw/1</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
public class PRED_throw_1 extends Predicate {

    public Term arg1;

    public PRED_throw_1(Term a1, Predicate cont) {
        arg1 = a1;
        this.cont = cont;
    }

    public PRED_throw_1(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        this.cont = cont;
    }

    public int arity() { return 1; }

    public String toString() {
        return "throw(" + arg1 + ")";
    }

    public Predicate exec(Prolog engine) {
    // throw(A):-raise_exception(A)
        engine.setB0();
        Term a1;
        a1 = arg1;
    // throw(A):-[raise_exception(A)]
        return new PRED_raise_exception_1(a1, cont);
    }
}
