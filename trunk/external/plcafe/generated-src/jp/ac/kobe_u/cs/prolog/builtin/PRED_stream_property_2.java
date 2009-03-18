package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>stream_property/2</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
public class PRED_stream_property_2 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("domain", 2);
    static SymbolTerm s2 = SymbolTerm.makeSymbol("term");
    static SymbolTerm s3 = SymbolTerm.makeSymbol("stream_proeprty");
    static Term[] s4 = {s2, s3};
    static StructureTerm s5 = new StructureTerm(s1, s4);
    static SymbolTerm s6 = SymbolTerm.makeSymbol("stream_property", 2);
    static IntegerTerm si7 = new IntegerTerm(2);
    static Predicate _stream_property_2_sub_1 = new PRED_stream_property_2_sub_1();
    static Predicate _stream_property_2_sub_2 = new PRED_stream_property_2_sub_2();
    static Predicate _stream_property_2_1 = new PRED_stream_property_2_1();
    static Predicate _stream_property_2_2 = new PRED_stream_property_2_2();
    static Predicate _stream_property_2_3 = new PRED_stream_property_2_3();

    public Term arg1, arg2;

    public PRED_stream_property_2(Term a1, Term a2, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        this.cont = cont;
    }

    public PRED_stream_property_2(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        this.cont = cont;
    }

    public int arity() { return 2; }

    public String toString() {
        return "stream_property(" + arg1 + "," + arg2 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.aregs[2] = arg2;
        engine.cont = cont;
        engine.setB0();
        return engine.jtry(_stream_property_2_1, _stream_property_2_sub_1);
    }
}

class PRED_stream_property_2_sub_1 extends PRED_stream_property_2 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_stream_property_2_2, _stream_property_2_sub_2);
    }
}

class PRED_stream_property_2_sub_2 extends PRED_stream_property_2 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_stream_property_2_3);
    }
}

class PRED_stream_property_2_1 extends PRED_stream_property_2 {
    public Predicate exec(Prolog engine) {
    // stream_property(A,B):-var(B),!,'$stream_property'(A,B)
        Term a1, a2, a3;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        cont = engine.cont;
    // stream_property(A,B):-['$get_level'(C),var(B),'$cut'(C),'$stream_property'(A,B)]
        a3 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(3))
        if (! a3.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(2))
        a2 = a2.dereference();
        if (! a2.isVariable()) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dereference();
        if (! a3.isInteger()) {
            throw new IllegalTypeException("integer", a3);
        } else {
            engine.cut(((IntegerTerm) a3).intValue());
        }
        //END inline expansion
        return new PRED_$stream_property_2(a1, a2, cont);
    }
}

class PRED_stream_property_2_2 extends PRED_stream_property_2 {
    public Predicate exec(Prolog engine) {
    // stream_property(A,B):-'$stream_property_specifier'(B),!,'$stream_property'(A,B)
        Term a1, a2, a3;
        Predicate p1, p2;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        cont = engine.cont;
    // stream_property(A,B):-['$get_level'(C),'$stream_property_specifier'(B),'$cut'(C),'$stream_property'(A,B)]
        a3 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(3))
        if (! a3.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        p1 = new PRED_$stream_property_2(a1, a2, cont);
        p2 = new PRED_$cut_1(a3, p1);
        return new PRED_$stream_property_specifier_1(a2, p2);
    }
}

class PRED_stream_property_2_3 extends PRED_stream_property_2 {
    public Predicate exec(Prolog engine) {
    // stream_property(A,B):-illarg(domain(term,stream_proeprty),stream_property(A,B),2)
        Term a1, a2, a3;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        cont = engine.cont;
    // stream_property(A,B):-[illarg(domain(term,stream_proeprty),stream_property(A,B),2)]
        Term[] y1 = {a1, a2};
        a3 = new StructureTerm(s6, y1);
        return new PRED_illarg_3(s5, a3, si7, cont);
    }
}
