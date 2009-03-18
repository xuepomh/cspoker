package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$debug_option'/2</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$debug_option_2 extends Predicate {
    static IntegerTerm si1 = new IntegerTerm(97);
    static IntegerTerm si2 = new IntegerTerm(99);
    static SymbolTerm s3 = SymbolTerm.makeSymbol("leap");
    static SymbolTerm s4 = SymbolTerm.makeSymbol("no");
    static IntegerTerm si5 = new IntegerTerm(108);
    static SymbolTerm s6 = SymbolTerm.makeSymbol("yes");
    static IntegerTerm si7 = new IntegerTerm(43);
    static SymbolTerm s8 = SymbolTerm.makeSymbol("print_procedure_box", 5);
    static SymbolTerm s9 = SymbolTerm.makeSymbol(":", 2);
    static SymbolTerm s10 = SymbolTerm.makeSymbol("jp.ac.kobe_u.cs.prolog.builtin");
    static IntegerTerm si11 = new IntegerTerm(45);
    static IntegerTerm si12 = new IntegerTerm(63);
    static IntegerTerm si13 = new IntegerTerm(104);
    static Predicate _$debug_option_2_var = new PRED_$debug_option_2_var();
    static Predicate _$debug_option_2_var_1 = new PRED_$debug_option_2_var_1();
    static Predicate _$debug_option_2_var_2 = new PRED_$debug_option_2_var_2();
    static Predicate _$debug_option_2_var_3 = new PRED_$debug_option_2_var_3();
    static Predicate _$debug_option_2_var_4 = new PRED_$debug_option_2_var_4();
    static Predicate _$debug_option_2_var_5 = new PRED_$debug_option_2_var_5();
    static Predicate _$debug_option_2_var_6 = new PRED_$debug_option_2_var_6();
    static Predicate _$debug_option_2_var_7 = new PRED_$debug_option_2_var_7();
    static Predicate _$debug_option_2_int = new PRED_$debug_option_2_int();
    static Predicate _$debug_option_2_int_0 = new PRED_$debug_option_2_int_0();
    static Predicate _$debug_option_2_int_0_1 = new PRED_$debug_option_2_int_0_1();
    static Predicate _$debug_option_2_int_1 = new PRED_$debug_option_2_int_1();
    static Predicate _$debug_option_2_int_1_1 = new PRED_$debug_option_2_int_1_1();
    static Predicate _$debug_option_2_int_2 = new PRED_$debug_option_2_int_2();
    static Predicate _$debug_option_2_int_2_1 = new PRED_$debug_option_2_int_2_1();
    static Predicate _$debug_option_2_int_3 = new PRED_$debug_option_2_int_3();
    static Predicate _$debug_option_2_int_3_1 = new PRED_$debug_option_2_int_3_1();
    static Predicate _$debug_option_2_int_4 = new PRED_$debug_option_2_int_4();
    static Predicate _$debug_option_2_int_4_1 = new PRED_$debug_option_2_int_4_1();
    static Predicate _$debug_option_2_int_5 = new PRED_$debug_option_2_int_5();
    static Predicate _$debug_option_2_int_5_1 = new PRED_$debug_option_2_int_5_1();
    static Predicate _$debug_option_2_int_6 = new PRED_$debug_option_2_int_6();
    static Predicate _$debug_option_2_int_6_1 = new PRED_$debug_option_2_int_6_1();
    static Predicate _$debug_option_2_1 = new PRED_$debug_option_2_1();
    static Predicate _$debug_option_2_2 = new PRED_$debug_option_2_2();
    static Predicate _$debug_option_2_3 = new PRED_$debug_option_2_3();
    static Predicate _$debug_option_2_4 = new PRED_$debug_option_2_4();
    static Predicate _$debug_option_2_5 = new PRED_$debug_option_2_5();
    static Predicate _$debug_option_2_6 = new PRED_$debug_option_2_6();
    static Predicate _$debug_option_2_7 = new PRED_$debug_option_2_7();
    static Predicate _$debug_option_2_8 = new PRED_$debug_option_2_8();
    static java.util.Hashtable<Term, Predicate> Int = new java.util.Hashtable<Term, Predicate>(7);
    static {
        Int.put(si1, _$debug_option_2_int_0);
        Int.put(si2, _$debug_option_2_int_1);
        Int.put(si5, _$debug_option_2_int_2);
        Int.put(si7, _$debug_option_2_int_3);
        Int.put(si11, _$debug_option_2_int_4);
        Int.put(si12, _$debug_option_2_int_5);
        Int.put(si13, _$debug_option_2_int_6);
    }

    public Term arg1, arg2;

    public PRED_$debug_option_2(Term a1, Term a2, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        this.cont = cont;
    }

    public PRED_$debug_option_2(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        this.cont = cont;
    }

    public int arity() { return 2; }

    public String toString() {
        return "$debug_option(" + arg1 + "," + arg2 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.aregs[2] = arg2;
        engine.cont = cont;
        engine.setB0();
        return engine.switch_on_term(_$debug_option_2_var, _$debug_option_2_int, _$debug_option_2_8, _$debug_option_2_8, _$debug_option_2_8, _$debug_option_2_8);
    }
}

class PRED_$debug_option_2_var extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$debug_option_2_1, _$debug_option_2_var_1);
    }
}

class PRED_$debug_option_2_var_1 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$debug_option_2_2, _$debug_option_2_var_2);
    }
}

class PRED_$debug_option_2_var_2 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$debug_option_2_3, _$debug_option_2_var_3);
    }
}

class PRED_$debug_option_2_var_3 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$debug_option_2_4, _$debug_option_2_var_4);
    }
}

class PRED_$debug_option_2_var_4 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$debug_option_2_5, _$debug_option_2_var_5);
    }
}

class PRED_$debug_option_2_var_5 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$debug_option_2_6, _$debug_option_2_var_6);
    }
}

class PRED_$debug_option_2_var_6 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$debug_option_2_7, _$debug_option_2_var_7);
    }
}

class PRED_$debug_option_2_var_7 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$debug_option_2_8);
    }
}

class PRED_$debug_option_2_int extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.switch_on_hash(Int, _$debug_option_2_8);
    }
}

class PRED_$debug_option_2_int_0 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$debug_option_2_1, _$debug_option_2_int_0_1);
    }
}

class PRED_$debug_option_2_int_0_1 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$debug_option_2_8);
    }
}

class PRED_$debug_option_2_int_1 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$debug_option_2_2, _$debug_option_2_int_1_1);
    }
}

class PRED_$debug_option_2_int_1_1 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$debug_option_2_8);
    }
}

class PRED_$debug_option_2_int_2 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$debug_option_2_3, _$debug_option_2_int_2_1);
    }
}

class PRED_$debug_option_2_int_2_1 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$debug_option_2_8);
    }
}

class PRED_$debug_option_2_int_3 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$debug_option_2_4, _$debug_option_2_int_3_1);
    }
}

class PRED_$debug_option_2_int_3_1 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$debug_option_2_8);
    }
}

class PRED_$debug_option_2_int_4 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$debug_option_2_5, _$debug_option_2_int_4_1);
    }
}

class PRED_$debug_option_2_int_4_1 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$debug_option_2_8);
    }
}

class PRED_$debug_option_2_int_5 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$debug_option_2_6, _$debug_option_2_int_5_1);
    }
}

class PRED_$debug_option_2_int_5_1 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$debug_option_2_8);
    }
}

class PRED_$debug_option_2_int_6 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$debug_option_2_7, _$debug_option_2_int_6_1);
    }
}

class PRED_$debug_option_2_int_6_1 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$debug_option_2_8);
    }
}

class PRED_$debug_option_2_1 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
    // '$debug_option'(97,A):-!,notrace,abort
        Term a1, a2;
        Predicate p1;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        cont = engine.cont;
    // '$debug_option'(97,A):-['$neck_cut',notrace,abort]
        a1 = a1.dereference();
        if (a1.isInteger()){
            if (((IntegerTerm) a1).intValue() != 97)
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(si1, engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        p1 = new PRED_abort_0(cont);
        return new PRED_notrace_0(p1);
    }
}

class PRED_$debug_option_2_2 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
    // '$debug_option'(99,A):-!,'$set_debug_flag'(leap,no)
        Term a1, a2;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        cont = engine.cont;
    // '$debug_option'(99,A):-['$neck_cut','$set_debug_flag'(leap,no)]
        a1 = a1.dereference();
        if (a1.isInteger()){
            if (((IntegerTerm) a1).intValue() != 99)
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(si2, engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        return new PRED_$set_debug_flag_2(s3, s4, cont);
    }
}

class PRED_$debug_option_2_3 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
    // '$debug_option'(108,A):-!,'$set_debug_flag'(leap,yes)
        Term a1, a2;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        cont = engine.cont;
    // '$debug_option'(108,A):-['$neck_cut','$set_debug_flag'(leap,yes)]
        a1 = a1.dereference();
        if (a1.isInteger()){
            if (((IntegerTerm) a1).intValue() != 108)
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(si5, engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        return new PRED_$set_debug_flag_2(s3, s6, cont);
    }
}

class PRED_$debug_option_2_4 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
    // '$debug_option'(43,print_procedure_box(A,B,C,D,E)):-!,spy(C:D),call(print_procedure_box(A,B,C,D,E))
        Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Predicate p1;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        cont = engine.cont;
    // '$debug_option'(43,print_procedure_box(A,B,C,D,E)):-['$neck_cut',spy(C:D),call('jp.ac.kobe_u.cs.prolog.builtin':print_procedure_box(A,B,C,D,E))]
        a1 = a1.dereference();
        if (a1.isInteger()){
            if (((IntegerTerm) a1).intValue() != 43)
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(si7, engine.trail);
        } else {
            return engine.fail();
        }
        a2 = a2.dereference();
        if (a2.isStructure()){
            if (! s8.equals(((StructureTerm)a2).functor()))
                return engine.fail();
            Term[] args = ((StructureTerm)a2).args();
            a3 = args[0];
            a4 = args[1];
            a5 = args[2];
            a6 = args[3];
            a7 = args[4];
        } else if (a2.isVariable()){
            a3 = new VariableTerm(engine);
            a4 = new VariableTerm(engine);
            a5 = new VariableTerm(engine);
            a6 = new VariableTerm(engine);
            a7 = new VariableTerm(engine);
            Term[] args = {a3, a4, a5, a6, a7};
            ((VariableTerm) a2).bind(new StructureTerm(s8, args), engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        Term[] y1 = {a5, a6};
        a8 = new StructureTerm(s9, y1);
        Term[] y2 = {a3, a4, a5, a6, a7};
        a9 = new StructureTerm(s8, y2);
        Term[] y3 = {s10, a9};
        a10 = new StructureTerm(s9, y3);
        p1 = new PRED_call_1(a10, cont);
        return new PRED_spy_1(a8, p1);
    }
}

class PRED_$debug_option_2_5 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
    // '$debug_option'(45,print_procedure_box(A,B,C,D,E)):-!,nospy(C:D),call(print_procedure_box(A,B,C,D,E))
        Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Predicate p1;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        cont = engine.cont;
    // '$debug_option'(45,print_procedure_box(A,B,C,D,E)):-['$neck_cut',nospy(C:D),call('jp.ac.kobe_u.cs.prolog.builtin':print_procedure_box(A,B,C,D,E))]
        a1 = a1.dereference();
        if (a1.isInteger()){
            if (((IntegerTerm) a1).intValue() != 45)
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(si11, engine.trail);
        } else {
            return engine.fail();
        }
        a2 = a2.dereference();
        if (a2.isStructure()){
            if (! s8.equals(((StructureTerm)a2).functor()))
                return engine.fail();
            Term[] args = ((StructureTerm)a2).args();
            a3 = args[0];
            a4 = args[1];
            a5 = args[2];
            a6 = args[3];
            a7 = args[4];
        } else if (a2.isVariable()){
            a3 = new VariableTerm(engine);
            a4 = new VariableTerm(engine);
            a5 = new VariableTerm(engine);
            a6 = new VariableTerm(engine);
            a7 = new VariableTerm(engine);
            Term[] args = {a3, a4, a5, a6, a7};
            ((VariableTerm) a2).bind(new StructureTerm(s8, args), engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        Term[] y1 = {a5, a6};
        a8 = new StructureTerm(s9, y1);
        Term[] y2 = {a3, a4, a5, a6, a7};
        a9 = new StructureTerm(s8, y2);
        Term[] y3 = {s10, a9};
        a10 = new StructureTerm(s9, y3);
        p1 = new PRED_call_1(a10, cont);
        return new PRED_nospy_1(a8, p1);
    }
}

class PRED_$debug_option_2_6 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
    // '$debug_option'(63,A):-!,'$show_debug_option',call(A)
        Term a1, a2, a3;
        Predicate p1;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        cont = engine.cont;
    // '$debug_option'(63,A):-['$neck_cut','$show_debug_option',call('jp.ac.kobe_u.cs.prolog.builtin':A)]
        a1 = a1.dereference();
        if (a1.isInteger()){
            if (((IntegerTerm) a1).intValue() != 63)
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(si12, engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        Term[] y1 = {s10, a2};
        a3 = new StructureTerm(s9, y1);
        p1 = new PRED_call_1(a3, cont);
        return new PRED_$show_debug_option_0(p1);
    }
}

class PRED_$debug_option_2_7 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
    // '$debug_option'(104,A):-!,'$show_debug_option',call(A)
        Term a1, a2, a3;
        Predicate p1;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        cont = engine.cont;
    // '$debug_option'(104,A):-['$neck_cut','$show_debug_option',call('jp.ac.kobe_u.cs.prolog.builtin':A)]
        a1 = a1.dereference();
        if (a1.isInteger()){
            if (((IntegerTerm) a1).intValue() != 104)
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(si13, engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        Term[] y1 = {s10, a2};
        a3 = new StructureTerm(s9, y1);
        p1 = new PRED_call_1(a3, cont);
        return new PRED_$show_debug_option_0(p1);
    }
}

class PRED_$debug_option_2_8 extends PRED_$debug_option_2 {
    public Predicate exec(Prolog engine) {
    // '$debug_option'(A,B):-true
        Term a1, a2;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        cont = engine.cont;
    // '$debug_option'(A,B):-[]
        return cont;
    }
}
