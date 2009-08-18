package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.Arithmetic;
import jp.ac.kobe_u.cs.prolog.lang.BuiltinException;
import jp.ac.kobe_u.cs.prolog.lang.IntegerTerm;
import jp.ac.kobe_u.cs.prolog.lang.ListTerm;
import jp.ac.kobe_u.cs.prolog.lang.Predicate;
import jp.ac.kobe_u.cs.prolog.lang.Prolog;
import jp.ac.kobe_u.cs.prolog.lang.SymbolTerm;
import jp.ac.kobe_u.cs.prolog.lang.Term;
import jp.ac.kobe_u.cs.prolog.lang.VariableTerm;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$dlength'/3</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$dlength_3 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("[]");
    static IntegerTerm si2 = new IntegerTerm(1);
    static Predicate _$dlength_3_top = new PRED_$dlength_3_top();
    static Predicate _fail_0 = new PRED_fail_0();
    static Predicate _$dlength_3_var = new PRED_$dlength_3_var();
    static Predicate _$dlength_3_var_1 = new PRED_$dlength_3_var_1();
    static Predicate _$dlength_3_1 = new PRED_$dlength_3_1();
    static Predicate _$dlength_3_2 = new PRED_$dlength_3_2();

    public Term arg1, arg2, arg3;

    public PRED_$dlength_3(Term a1, Term a2, Term a3, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        this.cont = cont;
    }

    public PRED_$dlength_3(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        this.cont = cont;
    }

    public int arity() { return 3; }

    public String toString() {
        return "$dlength(" + arg1 + "," + arg2 + "," + arg3 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.aregs[2] = arg2;
        engine.aregs[3] = arg3;
        engine.cont = cont;
        return _$dlength_3_top;
    }
}

class PRED_$dlength_3_top extends PRED_$dlength_3 {
    public Predicate exec(Prolog engine) {
        engine.setB0();
        return engine.switch_on_term(_$dlength_3_var, _fail_0, _fail_0, _$dlength_3_1, _fail_0, _$dlength_3_2);
    }
}

class PRED_$dlength_3_var extends PRED_$dlength_3 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$dlength_3_1, _$dlength_3_var_1);
    }
}

class PRED_$dlength_3_var_1 extends PRED_$dlength_3 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$dlength_3_2);
    }
}

class PRED_$dlength_3_1 extends PRED_$dlength_3 {
    public Predicate exec(Prolog engine) {
    // '$dlength'([],A,A):-!
        Term a1, a2, a3;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$dlength'([],A,A):-['$neck_cut']
        a1 = a1.dereference();
        if (a1.isSymbol()){
            if (! a1.equals(s1))
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(s1, engine.trail);
        } else {
            return engine.fail();
        }
        if (! a2.unify(a3, engine.trail))
            return engine.fail();
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        return cont;
    }
}

class PRED_$dlength_3_2 extends PRED_$dlength_3 {
    public Predicate exec(Prolog engine) {
    // '$dlength'([A|B],C,D):-C<D,E is C+1,'$dlength'(B,E,D)
        Term a1, a2, a3, a4, a5;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$dlength'([A|B],C,D):-['$less_than'(C,D),'$plus'(C,1,E),'$dlength'(B,E,D)]
        a1 = a1.dereference();
        if (a1.isList()){
            Term[] args = {((ListTerm)a1).car(), ((ListTerm)a1).cdr()};
            a4 = args[1];
        } else if (a1.isVariable()){
            a4 = new VariableTerm(engine);
            ((VariableTerm) a1).bind(new ListTerm(new VariableTerm(engine), a4), engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $less_than(a(2),a(3))
        try {
            if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) >= 0) {
                return engine.fail();
            }
        } catch (BuiltinException e) {
            e.goal = this;
            throw e;
        }
        //END inline expansion
        a5 = new VariableTerm(engine);
        //START inline expansion of $plus(a(2),si(2),a(5))
        try {
            if (! a5.unify(Arithmetic.evaluate(a2).add(si2), engine.trail)) {
                return engine.fail();
            }
        } catch (BuiltinException e) {
            e.goal = this;
            throw e;
        }
        //END inline expansion
        engine.aregs[1] = a4;
        engine.aregs[2] = a5;
        engine.aregs[3] = a3;
        engine.cont = cont;
        return _$dlength_3_top;
    }
}
