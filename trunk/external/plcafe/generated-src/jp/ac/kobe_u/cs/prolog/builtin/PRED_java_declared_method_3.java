package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>java_declared_method/3</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
public class PRED_java_declared_method_3 extends Predicate {

    public Term arg1, arg2, arg3;

    public PRED_java_declared_method_3(Term a1, Term a2, Term a3, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        this.cont = cont;
    }

    public PRED_java_declared_method_3(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        this.cont = cont;
    }

    public int arity() { return 3; }

    public String toString() {
        return "java_declared_method(" + arg1 + "," + arg2 + "," + arg3 + ")";
    }

    public Predicate exec(Prolog engine) {
    // java_declared_method(A,B,C):-B=..[D|E],builtin_java_convert_args(E,F),G=..[D|F],java_declared_method0(A,G,H),java_conversion(I,H),C=I
        engine.setB0();
        Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Predicate p1, p2, p3, p4, p5;
        a1 = arg1;
        a2 = arg2;
        a3 = arg3;
    // java_declared_method(A,B,C):-['$univ'(B,[D|E]),builtin_java_convert_args(E,F),'$univ'(G,[D|F]),java_declared_method0(A,G,H),java_conversion(I,H),'$unify'(C,I)]
        a4 = new VariableTerm(engine);
        a5 = new VariableTerm(engine);
        a6 = new ListTerm(a4, a5);
        a7 = new VariableTerm(engine);
        a8 = new VariableTerm(engine);
        a9 = new ListTerm(a4, a7);
        a10 = new VariableTerm(engine);
        a11 = new VariableTerm(engine);
        p1 = new PRED_$unify_2(a3, a11, cont);
        p2 = new PRED_java_conversion_2(a11, a10, p1);
        p3 = new PRED_java_declared_method0_3(a1, a8, a10, p2);
        p4 = new PRED_$univ_2(a8, a9, p3);
        p5 = new PRED_builtin_java_convert_args_2(a5, a7, p4);
        return new PRED_$univ_2(a2, a6, p5);
    }
}
