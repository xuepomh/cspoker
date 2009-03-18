package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$clause_to_term'/5</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$clause_to_term_5 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("var");
    static IntegerTerm si2 = new IntegerTerm(1);
    static SymbolTerm s3 = SymbolTerm.makeSymbol(":", 2);
    static SymbolTerm s4 = SymbolTerm.makeSymbol("type", 1);
    static SymbolTerm s5 = SymbolTerm.makeSymbol("atom");
    static Term[] s6 = {s5};
    static StructureTerm s7 = new StructureTerm(s4, s6);
    static SymbolTerm s8 = SymbolTerm.makeSymbol(":-", 2);
    static SymbolTerm s9 = SymbolTerm.makeSymbol("true");
    static Predicate _$clause_to_term_5_top = new PRED_$clause_to_term_5_top();
    static Predicate _$clause_to_term_5_var = new PRED_$clause_to_term_5_var();
    static Predicate _$clause_to_term_5_var_1 = new PRED_$clause_to_term_5_var_1();
    static Predicate _$clause_to_term_5_var_2 = new PRED_$clause_to_term_5_var_2();
    static Predicate _$clause_to_term_5_var_3 = new PRED_$clause_to_term_5_var_3();
    static Predicate _$clause_to_term_5_var_4 = new PRED_$clause_to_term_5_var_4();
    static Predicate _$clause_to_term_5_var_5 = new PRED_$clause_to_term_5_var_5();
    static Predicate _$clause_to_term_5_int = new PRED_$clause_to_term_5_int();
    static Predicate _$clause_to_term_5_int_1 = new PRED_$clause_to_term_5_int_1();
    static Predicate _$clause_to_term_5_int_2 = new PRED_$clause_to_term_5_int_2();
    static Predicate _$clause_to_term_5_int_3 = new PRED_$clause_to_term_5_int_3();
    static Predicate _$clause_to_term_5_str = new PRED_$clause_to_term_5_str();
    static Predicate _$clause_to_term_5_str_0 = new PRED_$clause_to_term_5_str_0();
    static Predicate _$clause_to_term_5_str_0_1 = new PRED_$clause_to_term_5_str_0_1();
    static Predicate _$clause_to_term_5_str_0_2 = new PRED_$clause_to_term_5_str_0_2();
    static Predicate _$clause_to_term_5_str_0_3 = new PRED_$clause_to_term_5_str_0_3();
    static Predicate _$clause_to_term_5_str_0_4 = new PRED_$clause_to_term_5_str_0_4();
    static Predicate _$clause_to_term_5_str_1 = new PRED_$clause_to_term_5_str_1();
    static Predicate _$clause_to_term_5_str_1_1 = new PRED_$clause_to_term_5_str_1_1();
    static Predicate _$clause_to_term_5_str_1_2 = new PRED_$clause_to_term_5_str_1_2();
    static Predicate _$clause_to_term_5_str_1_3 = new PRED_$clause_to_term_5_str_1_3();
    static Predicate _$clause_to_term_5_str_1_4 = new PRED_$clause_to_term_5_str_1_4();
    static Predicate _$clause_to_term_5_1 = new PRED_$clause_to_term_5_1();
    static Predicate _$clause_to_term_5_2 = new PRED_$clause_to_term_5_2();
    static Predicate _$clause_to_term_5_3 = new PRED_$clause_to_term_5_3();
    static Predicate _$clause_to_term_5_4 = new PRED_$clause_to_term_5_4();
    static Predicate _$clause_to_term_5_5 = new PRED_$clause_to_term_5_5();
    static Predicate _$clause_to_term_5_6 = new PRED_$clause_to_term_5_6();
    static java.util.Hashtable<Term, Predicate> str = new java.util.Hashtable<Term, Predicate>(2);
    static {
        str.put(s3, _$clause_to_term_5_str_0);
        str.put(s8, _$clause_to_term_5_str_1);
    }

    public Term arg1, arg2, arg3, arg4, arg5;

    public PRED_$clause_to_term_5(Term a1, Term a2, Term a3, Term a4, Term a5, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        arg4 = a4;
        arg5 = a5;
        this.cont = cont;
    }

    public PRED_$clause_to_term_5(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        arg4 = args[3];
        arg5 = args[4];
        this.cont = cont;
    }

    public int arity() { return 5; }

    public String toString() {
        return "$clause_to_term(" + arg1 + "," + arg2 + "," + arg3 + "," + arg4 + "," + arg5 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.aregs[2] = arg2;
        engine.aregs[3] = arg3;
        engine.aregs[4] = arg4;
        engine.aregs[5] = arg5;
        engine.cont = cont;
        return _$clause_to_term_5_top;
    }
}

class PRED_$clause_to_term_5_top extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        engine.setB0();
        return engine.switch_on_term(_$clause_to_term_5_var, _$clause_to_term_5_int, _$clause_to_term_5_int, _$clause_to_term_5_int, _$clause_to_term_5_str, _$clause_to_term_5_int);
    }
}

class PRED_$clause_to_term_5_var extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$clause_to_term_5_1, _$clause_to_term_5_var_1);
    }
}

class PRED_$clause_to_term_5_var_1 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$clause_to_term_5_2, _$clause_to_term_5_var_2);
    }
}

class PRED_$clause_to_term_5_var_2 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$clause_to_term_5_3, _$clause_to_term_5_var_3);
    }
}

class PRED_$clause_to_term_5_var_3 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$clause_to_term_5_4, _$clause_to_term_5_var_4);
    }
}

class PRED_$clause_to_term_5_var_4 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$clause_to_term_5_5, _$clause_to_term_5_var_5);
    }
}

class PRED_$clause_to_term_5_var_5 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$clause_to_term_5_6);
    }
}

class PRED_$clause_to_term_5_int extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$clause_to_term_5_1, _$clause_to_term_5_int_1);
    }
}

class PRED_$clause_to_term_5_int_1 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$clause_to_term_5_2, _$clause_to_term_5_int_2);
    }
}

class PRED_$clause_to_term_5_int_2 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$clause_to_term_5_4, _$clause_to_term_5_int_3);
    }
}

class PRED_$clause_to_term_5_int_3 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$clause_to_term_5_6);
    }
}

class PRED_$clause_to_term_5_str extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.switch_on_hash(str, _$clause_to_term_5_int);
    }
}

class PRED_$clause_to_term_5_str_0 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$clause_to_term_5_1, _$clause_to_term_5_str_0_1);
    }
}

class PRED_$clause_to_term_5_str_0_1 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$clause_to_term_5_2, _$clause_to_term_5_str_0_2);
    }
}

class PRED_$clause_to_term_5_str_0_2 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$clause_to_term_5_3, _$clause_to_term_5_str_0_3);
    }
}

class PRED_$clause_to_term_5_str_0_3 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$clause_to_term_5_4, _$clause_to_term_5_str_0_4);
    }
}

class PRED_$clause_to_term_5_str_0_4 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$clause_to_term_5_6);
    }
}

class PRED_$clause_to_term_5_str_1 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$clause_to_term_5_1, _$clause_to_term_5_str_1_1);
    }
}

class PRED_$clause_to_term_5_str_1_1 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$clause_to_term_5_2, _$clause_to_term_5_str_1_2);
    }
}

class PRED_$clause_to_term_5_str_1_2 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$clause_to_term_5_4, _$clause_to_term_5_str_1_3);
    }
}

class PRED_$clause_to_term_5_str_1_3 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$clause_to_term_5_5, _$clause_to_term_5_str_1_4);
    }
}

class PRED_$clause_to_term_5_str_1_4 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$clause_to_term_5_6);
    }
}

class PRED_$clause_to_term_5_1 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
    // '$clause_to_term'(A,B,C,D,E):-var(A),!,illarg(var,E,1)
        Term a1, a2, a3, a4, a5, a6;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        a5 = engine.aregs[5];
        cont = engine.cont;
    // '$clause_to_term'(A,B,C,D,E):-['$get_level'(F),var(A),'$cut'(F),illarg(var,E,1)]
        a6 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(6))
        if (! a6.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dereference();
        if (! a1.isVariable()) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dereference();
        if (! a6.isInteger()) {
            throw new IllegalTypeException("integer", a6);
        } else {
            engine.cut(((IntegerTerm) a6).intValue());
        }
        //END inline expansion
        return new PRED_illarg_3(s1, a5, si2, cont);
    }
}

class PRED_$clause_to_term_5_2 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
    // '$clause_to_term'(A,B,C,D,E):-var(C),!,illarg(var,E,1)
        Term a1, a2, a3, a4, a5, a6;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        a5 = engine.aregs[5];
        cont = engine.cont;
    // '$clause_to_term'(A,B,C,D,E):-['$get_level'(F),var(C),'$cut'(F),illarg(var,E,1)]
        a6 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(6))
        if (! a6.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(3))
        a3 = a3.dereference();
        if (! a3.isVariable()) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dereference();
        if (! a6.isInteger()) {
            throw new IllegalTypeException("integer", a6);
        } else {
            engine.cut(((IntegerTerm) a6).intValue());
        }
        //END inline expansion
        return new PRED_illarg_3(s1, a5, si2, cont);
    }
}

class PRED_$clause_to_term_5_3 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
    // '$clause_to_term'(A:B,C,D,E,F):-!,'$clause_to_term'(B,C,A,E,F)
        Term a1, a2, a3, a4, a5, a6, a7;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        a5 = engine.aregs[5];
        cont = engine.cont;
    // '$clause_to_term'(A:B,C,D,E,F):-['$neck_cut','$clause_to_term'(B,C,A,E,F)]
        a1 = a1.dereference();
        if (a1.isStructure()){
            if (! s3.equals(((StructureTerm)a1).functor()))
                return engine.fail();
            Term[] args = ((StructureTerm)a1).args();
            a6 = args[0];
            a7 = args[1];
        } else if (a1.isVariable()){
            a6 = new VariableTerm(engine);
            a7 = new VariableTerm(engine);
            Term[] args = {a6, a7};
            ((VariableTerm) a1).bind(new StructureTerm(s3, args), engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        engine.aregs[1] = a7;
        engine.aregs[2] = a2;
        engine.aregs[3] = a6;
        engine.aregs[4] = a4;
        engine.aregs[5] = a5;
        engine.cont = cont;
        return _$clause_to_term_5_top;
    }
}

class PRED_$clause_to_term_5_4 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
    // '$clause_to_term'(A,B,C,D,E):-'$dummy_9_builtins.pl'(C),!,illarg(type(atom),E,1)
        Term a1, a2, a3, a4, a5, a6;
        Predicate p1, p2;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        a5 = engine.aregs[5];
        cont = engine.cont;
    // '$clause_to_term'(A,B,C,D,E):-['$get_level'(F),'$dummy_9_builtins.pl'(C),'$cut'(F),illarg(type(atom),E,1)]
        a6 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(6))
        if (! a6.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        p1 = new PRED_illarg_3(s7, a5, si2, cont);
        p2 = new PRED_$cut_1(a6, p1);
        return new PRED_$dummy_9_builtins$002Epl_1(a3, p2);
    }
}

class PRED_$clause_to_term_5_5 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
    // '$clause_to_term'((A:-B),(C:-B),D,D,E):-!,'$head_to_term'(A,C,F,E)
        Term a1, a2, a3, a4, a5, a6, a7, a8;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        a5 = engine.aregs[5];
        cont = engine.cont;
    // '$clause_to_term'((A:-B),(C:-B),D,D,E):-['$neck_cut','$head_to_term'(A,C,F,E)]
        a1 = a1.dereference();
        if (a1.isStructure()){
            if (! s8.equals(((StructureTerm)a1).functor()))
                return engine.fail();
            Term[] args = ((StructureTerm)a1).args();
            a6 = args[0];
            a7 = args[1];
        } else if (a1.isVariable()){
            a6 = new VariableTerm(engine);
            a7 = new VariableTerm(engine);
            Term[] args = {a6, a7};
            ((VariableTerm) a1).bind(new StructureTerm(s8, args), engine.trail);
        } else {
            return engine.fail();
        }
        a2 = a2.dereference();
        if (a2.isStructure()){
            if (! s8.equals(((StructureTerm)a2).functor()))
                return engine.fail();
            Term[] args = ((StructureTerm)a2).args();
            a8 = args[0];
            if (! a7.unify(args[1], engine.trail))
                return engine.fail();
        } else if (a2.isVariable()){
            a8 = new VariableTerm(engine);
            Term[] args = {a8, a7};
            ((VariableTerm) a2).bind(new StructureTerm(s8, args), engine.trail);
        } else {
            return engine.fail();
        }
        if (! a3.unify(a4, engine.trail))
            return engine.fail();
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        return new PRED_$head_to_term_4(a6, a8, new VariableTerm(engine), a5, cont);
    }
}

class PRED_$clause_to_term_5_6 extends PRED_$clause_to_term_5 {
    public Predicate exec(Prolog engine) {
    // '$clause_to_term'(A,(B:-true),C,C,D):-'$head_to_term'(A,B,E,D)
        Term a1, a2, a3, a4, a5, a6;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        a5 = engine.aregs[5];
        cont = engine.cont;
    // '$clause_to_term'(A,(B:-true),C,C,D):-['$head_to_term'(A,B,E,D)]
        a2 = a2.dereference();
        if (a2.isStructure()){
            if (! s8.equals(((StructureTerm)a2).functor()))
                return engine.fail();
            Term[] args = ((StructureTerm)a2).args();
            a6 = args[0];
            if (! s9.unify(args[1], engine.trail))
                return engine.fail();
        } else if (a2.isVariable()){
            a6 = new VariableTerm(engine);
            Term[] args = {a6, s9};
            ((VariableTerm) a2).bind(new StructureTerm(s8, args), engine.trail);
        } else {
            return engine.fail();
        }
        if (! a3.unify(a4, engine.trail))
            return engine.fail();
        return new PRED_$head_to_term_4(a1, a6, new VariableTerm(engine), a5, cont);
    }
}
