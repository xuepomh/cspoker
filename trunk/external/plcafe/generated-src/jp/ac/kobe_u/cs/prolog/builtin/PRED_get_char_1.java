package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>get_char/1</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
public class PRED_get_char_1 extends Predicate {

    public Term arg1;

    public PRED_get_char_1(Term a1, Predicate cont) {
        arg1 = a1;
        this.cont = cont;
    }

    public PRED_get_char_1(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        this.cont = cont;
    }

    public int arity() { return 1; }

    public String toString() {
        return "get_char(" + arg1 + ")";
    }

    public Predicate exec(Prolog engine) {
    // get_char(A):-current_input(B),get_char(B,A)
        engine.setB0();
        Term a1, a2;
        Predicate p1;
        a1 = arg1;
    // get_char(A):-[current_input(B),get_char(B,A)]
        a2 = new VariableTerm(engine);
        p1 = new PRED_get_char_2(a2, a1, cont);
        return new PRED_current_input_1(a2, p1);
    }
}
