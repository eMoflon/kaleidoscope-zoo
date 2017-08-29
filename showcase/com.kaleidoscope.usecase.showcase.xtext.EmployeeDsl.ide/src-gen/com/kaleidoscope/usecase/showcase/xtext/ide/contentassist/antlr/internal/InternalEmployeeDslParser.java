package com.kaleidoscope.usecase.showcase.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.kaleidoscope.usecase.showcase.xtext.services.EmployeeDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEmployeeDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Employee'", "'{'", "'}'", "'name'", "'salary'", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalEmployeeDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEmployeeDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEmployeeDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEmployeeDsl.g"; }


    	private EmployeeDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(EmployeeDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleEmployeeContainer"
    // InternalEmployeeDsl.g:53:1: entryRuleEmployeeContainer : ruleEmployeeContainer EOF ;
    public final void entryRuleEmployeeContainer() throws RecognitionException {
        try {
            // InternalEmployeeDsl.g:54:1: ( ruleEmployeeContainer EOF )
            // InternalEmployeeDsl.g:55:1: ruleEmployeeContainer EOF
            {
             before(grammarAccess.getEmployeeContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleEmployeeContainer();

            state._fsp--;

             after(grammarAccess.getEmployeeContainerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmployeeContainer"


    // $ANTLR start "ruleEmployeeContainer"
    // InternalEmployeeDsl.g:62:1: ruleEmployeeContainer : ( ( rule__EmployeeContainer__EmployeesAssignment )* ) ;
    public final void ruleEmployeeContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:66:2: ( ( ( rule__EmployeeContainer__EmployeesAssignment )* ) )
            // InternalEmployeeDsl.g:67:2: ( ( rule__EmployeeContainer__EmployeesAssignment )* )
            {
            // InternalEmployeeDsl.g:67:2: ( ( rule__EmployeeContainer__EmployeesAssignment )* )
            // InternalEmployeeDsl.g:68:3: ( rule__EmployeeContainer__EmployeesAssignment )*
            {
             before(grammarAccess.getEmployeeContainerAccess().getEmployeesAssignment()); 
            // InternalEmployeeDsl.g:69:3: ( rule__EmployeeContainer__EmployeesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEmployeeDsl.g:69:4: rule__EmployeeContainer__EmployeesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__EmployeeContainer__EmployeesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getEmployeeContainerAccess().getEmployeesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmployeeContainer"


    // $ANTLR start "entryRuleEmployee"
    // InternalEmployeeDsl.g:78:1: entryRuleEmployee : ruleEmployee EOF ;
    public final void entryRuleEmployee() throws RecognitionException {
        try {
            // InternalEmployeeDsl.g:79:1: ( ruleEmployee EOF )
            // InternalEmployeeDsl.g:80:1: ruleEmployee EOF
            {
             before(grammarAccess.getEmployeeRule()); 
            pushFollow(FOLLOW_1);
            ruleEmployee();

            state._fsp--;

             after(grammarAccess.getEmployeeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // InternalEmployeeDsl.g:87:1: ruleEmployee : ( ( rule__Employee__Group__0 ) ) ;
    public final void ruleEmployee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:91:2: ( ( ( rule__Employee__Group__0 ) ) )
            // InternalEmployeeDsl.g:92:2: ( ( rule__Employee__Group__0 ) )
            {
            // InternalEmployeeDsl.g:92:2: ( ( rule__Employee__Group__0 ) )
            // InternalEmployeeDsl.g:93:3: ( rule__Employee__Group__0 )
            {
             before(grammarAccess.getEmployeeAccess().getGroup()); 
            // InternalEmployeeDsl.g:94:3: ( rule__Employee__Group__0 )
            // InternalEmployeeDsl.g:94:4: rule__Employee__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "entryRuleEString"
    // InternalEmployeeDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalEmployeeDsl.g:104:1: ( ruleEString EOF )
            // InternalEmployeeDsl.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalEmployeeDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalEmployeeDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalEmployeeDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalEmployeeDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalEmployeeDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalEmployeeDsl.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalEmployeeDsl.g:128:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalEmployeeDsl.g:129:1: ( ruleEInt EOF )
            // InternalEmployeeDsl.g:130:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalEmployeeDsl.g:137:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:141:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalEmployeeDsl.g:142:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalEmployeeDsl.g:142:2: ( ( rule__EInt__Group__0 ) )
            // InternalEmployeeDsl.g:143:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalEmployeeDsl.g:144:3: ( rule__EInt__Group__0 )
            // InternalEmployeeDsl.g:144:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalEmployeeDsl.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEmployeeDsl.g:157:2: ( RULE_STRING )
                    {
                    // InternalEmployeeDsl.g:157:2: ( RULE_STRING )
                    // InternalEmployeeDsl.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEmployeeDsl.g:163:2: ( RULE_ID )
                    {
                    // InternalEmployeeDsl.g:163:2: ( RULE_ID )
                    // InternalEmployeeDsl.g:164:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Employee__Group__0"
    // InternalEmployeeDsl.g:173:1: rule__Employee__Group__0 : rule__Employee__Group__0__Impl rule__Employee__Group__1 ;
    public final void rule__Employee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:177:1: ( rule__Employee__Group__0__Impl rule__Employee__Group__1 )
            // InternalEmployeeDsl.g:178:2: rule__Employee__Group__0__Impl rule__Employee__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Employee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__0"


    // $ANTLR start "rule__Employee__Group__0__Impl"
    // InternalEmployeeDsl.g:185:1: rule__Employee__Group__0__Impl : ( () ) ;
    public final void rule__Employee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:189:1: ( ( () ) )
            // InternalEmployeeDsl.g:190:1: ( () )
            {
            // InternalEmployeeDsl.g:190:1: ( () )
            // InternalEmployeeDsl.g:191:2: ()
            {
             before(grammarAccess.getEmployeeAccess().getEmployeeAction_0()); 
            // InternalEmployeeDsl.g:192:2: ()
            // InternalEmployeeDsl.g:192:3: 
            {
            }

             after(grammarAccess.getEmployeeAccess().getEmployeeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__0__Impl"


    // $ANTLR start "rule__Employee__Group__1"
    // InternalEmployeeDsl.g:200:1: rule__Employee__Group__1 : rule__Employee__Group__1__Impl rule__Employee__Group__2 ;
    public final void rule__Employee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:204:1: ( rule__Employee__Group__1__Impl rule__Employee__Group__2 )
            // InternalEmployeeDsl.g:205:2: rule__Employee__Group__1__Impl rule__Employee__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Employee__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__1"


    // $ANTLR start "rule__Employee__Group__1__Impl"
    // InternalEmployeeDsl.g:212:1: rule__Employee__Group__1__Impl : ( 'Employee' ) ;
    public final void rule__Employee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:216:1: ( ( 'Employee' ) )
            // InternalEmployeeDsl.g:217:1: ( 'Employee' )
            {
            // InternalEmployeeDsl.g:217:1: ( 'Employee' )
            // InternalEmployeeDsl.g:218:2: 'Employee'
            {
             before(grammarAccess.getEmployeeAccess().getEmployeeKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getEmployeeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__1__Impl"


    // $ANTLR start "rule__Employee__Group__2"
    // InternalEmployeeDsl.g:227:1: rule__Employee__Group__2 : rule__Employee__Group__2__Impl rule__Employee__Group__3 ;
    public final void rule__Employee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:231:1: ( rule__Employee__Group__2__Impl rule__Employee__Group__3 )
            // InternalEmployeeDsl.g:232:2: rule__Employee__Group__2__Impl rule__Employee__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Employee__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__2"


    // $ANTLR start "rule__Employee__Group__2__Impl"
    // InternalEmployeeDsl.g:239:1: rule__Employee__Group__2__Impl : ( ( rule__Employee__IDAssignment_2 ) ) ;
    public final void rule__Employee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:243:1: ( ( ( rule__Employee__IDAssignment_2 ) ) )
            // InternalEmployeeDsl.g:244:1: ( ( rule__Employee__IDAssignment_2 ) )
            {
            // InternalEmployeeDsl.g:244:1: ( ( rule__Employee__IDAssignment_2 ) )
            // InternalEmployeeDsl.g:245:2: ( rule__Employee__IDAssignment_2 )
            {
             before(grammarAccess.getEmployeeAccess().getIDAssignment_2()); 
            // InternalEmployeeDsl.g:246:2: ( rule__Employee__IDAssignment_2 )
            // InternalEmployeeDsl.g:246:3: rule__Employee__IDAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Employee__IDAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getIDAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__2__Impl"


    // $ANTLR start "rule__Employee__Group__3"
    // InternalEmployeeDsl.g:254:1: rule__Employee__Group__3 : rule__Employee__Group__3__Impl rule__Employee__Group__4 ;
    public final void rule__Employee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:258:1: ( rule__Employee__Group__3__Impl rule__Employee__Group__4 )
            // InternalEmployeeDsl.g:259:2: rule__Employee__Group__3__Impl rule__Employee__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Employee__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__3"


    // $ANTLR start "rule__Employee__Group__3__Impl"
    // InternalEmployeeDsl.g:266:1: rule__Employee__Group__3__Impl : ( '{' ) ;
    public final void rule__Employee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:270:1: ( ( '{' ) )
            // InternalEmployeeDsl.g:271:1: ( '{' )
            {
            // InternalEmployeeDsl.g:271:1: ( '{' )
            // InternalEmployeeDsl.g:272:2: '{'
            {
             before(grammarAccess.getEmployeeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__3__Impl"


    // $ANTLR start "rule__Employee__Group__4"
    // InternalEmployeeDsl.g:281:1: rule__Employee__Group__4 : rule__Employee__Group__4__Impl rule__Employee__Group__5 ;
    public final void rule__Employee__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:285:1: ( rule__Employee__Group__4__Impl rule__Employee__Group__5 )
            // InternalEmployeeDsl.g:286:2: rule__Employee__Group__4__Impl rule__Employee__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Employee__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__4"


    // $ANTLR start "rule__Employee__Group__4__Impl"
    // InternalEmployeeDsl.g:293:1: rule__Employee__Group__4__Impl : ( ( rule__Employee__Group_4__0 )? ) ;
    public final void rule__Employee__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:297:1: ( ( ( rule__Employee__Group_4__0 )? ) )
            // InternalEmployeeDsl.g:298:1: ( ( rule__Employee__Group_4__0 )? )
            {
            // InternalEmployeeDsl.g:298:1: ( ( rule__Employee__Group_4__0 )? )
            // InternalEmployeeDsl.g:299:2: ( rule__Employee__Group_4__0 )?
            {
             before(grammarAccess.getEmployeeAccess().getGroup_4()); 
            // InternalEmployeeDsl.g:300:2: ( rule__Employee__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEmployeeDsl.g:300:3: rule__Employee__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Employee__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmployeeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__4__Impl"


    // $ANTLR start "rule__Employee__Group__5"
    // InternalEmployeeDsl.g:308:1: rule__Employee__Group__5 : rule__Employee__Group__5__Impl rule__Employee__Group__6 ;
    public final void rule__Employee__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:312:1: ( rule__Employee__Group__5__Impl rule__Employee__Group__6 )
            // InternalEmployeeDsl.g:313:2: rule__Employee__Group__5__Impl rule__Employee__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Employee__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__5"


    // $ANTLR start "rule__Employee__Group__5__Impl"
    // InternalEmployeeDsl.g:320:1: rule__Employee__Group__5__Impl : ( ( rule__Employee__Group_5__0 )? ) ;
    public final void rule__Employee__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:324:1: ( ( ( rule__Employee__Group_5__0 )? ) )
            // InternalEmployeeDsl.g:325:1: ( ( rule__Employee__Group_5__0 )? )
            {
            // InternalEmployeeDsl.g:325:1: ( ( rule__Employee__Group_5__0 )? )
            // InternalEmployeeDsl.g:326:2: ( rule__Employee__Group_5__0 )?
            {
             before(grammarAccess.getEmployeeAccess().getGroup_5()); 
            // InternalEmployeeDsl.g:327:2: ( rule__Employee__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEmployeeDsl.g:327:3: rule__Employee__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Employee__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmployeeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__5__Impl"


    // $ANTLR start "rule__Employee__Group__6"
    // InternalEmployeeDsl.g:335:1: rule__Employee__Group__6 : rule__Employee__Group__6__Impl ;
    public final void rule__Employee__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:339:1: ( rule__Employee__Group__6__Impl )
            // InternalEmployeeDsl.g:340:2: rule__Employee__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__6"


    // $ANTLR start "rule__Employee__Group__6__Impl"
    // InternalEmployeeDsl.g:346:1: rule__Employee__Group__6__Impl : ( '}' ) ;
    public final void rule__Employee__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:350:1: ( ( '}' ) )
            // InternalEmployeeDsl.g:351:1: ( '}' )
            {
            // InternalEmployeeDsl.g:351:1: ( '}' )
            // InternalEmployeeDsl.g:352:2: '}'
            {
             before(grammarAccess.getEmployeeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__6__Impl"


    // $ANTLR start "rule__Employee__Group_4__0"
    // InternalEmployeeDsl.g:362:1: rule__Employee__Group_4__0 : rule__Employee__Group_4__0__Impl rule__Employee__Group_4__1 ;
    public final void rule__Employee__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:366:1: ( rule__Employee__Group_4__0__Impl rule__Employee__Group_4__1 )
            // InternalEmployeeDsl.g:367:2: rule__Employee__Group_4__0__Impl rule__Employee__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Employee__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_4__0"


    // $ANTLR start "rule__Employee__Group_4__0__Impl"
    // InternalEmployeeDsl.g:374:1: rule__Employee__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__Employee__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:378:1: ( ( 'name' ) )
            // InternalEmployeeDsl.g:379:1: ( 'name' )
            {
            // InternalEmployeeDsl.g:379:1: ( 'name' )
            // InternalEmployeeDsl.g:380:2: 'name'
            {
             before(grammarAccess.getEmployeeAccess().getNameKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_4__0__Impl"


    // $ANTLR start "rule__Employee__Group_4__1"
    // InternalEmployeeDsl.g:389:1: rule__Employee__Group_4__1 : rule__Employee__Group_4__1__Impl ;
    public final void rule__Employee__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:393:1: ( rule__Employee__Group_4__1__Impl )
            // InternalEmployeeDsl.g:394:2: rule__Employee__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_4__1"


    // $ANTLR start "rule__Employee__Group_4__1__Impl"
    // InternalEmployeeDsl.g:400:1: rule__Employee__Group_4__1__Impl : ( ( rule__Employee__NameAssignment_4_1 ) ) ;
    public final void rule__Employee__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:404:1: ( ( ( rule__Employee__NameAssignment_4_1 ) ) )
            // InternalEmployeeDsl.g:405:1: ( ( rule__Employee__NameAssignment_4_1 ) )
            {
            // InternalEmployeeDsl.g:405:1: ( ( rule__Employee__NameAssignment_4_1 ) )
            // InternalEmployeeDsl.g:406:2: ( rule__Employee__NameAssignment_4_1 )
            {
             before(grammarAccess.getEmployeeAccess().getNameAssignment_4_1()); 
            // InternalEmployeeDsl.g:407:2: ( rule__Employee__NameAssignment_4_1 )
            // InternalEmployeeDsl.g:407:3: rule__Employee__NameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Employee__NameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_4__1__Impl"


    // $ANTLR start "rule__Employee__Group_5__0"
    // InternalEmployeeDsl.g:416:1: rule__Employee__Group_5__0 : rule__Employee__Group_5__0__Impl rule__Employee__Group_5__1 ;
    public final void rule__Employee__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:420:1: ( rule__Employee__Group_5__0__Impl rule__Employee__Group_5__1 )
            // InternalEmployeeDsl.g:421:2: rule__Employee__Group_5__0__Impl rule__Employee__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Employee__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_5__0"


    // $ANTLR start "rule__Employee__Group_5__0__Impl"
    // InternalEmployeeDsl.g:428:1: rule__Employee__Group_5__0__Impl : ( 'salary' ) ;
    public final void rule__Employee__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:432:1: ( ( 'salary' ) )
            // InternalEmployeeDsl.g:433:1: ( 'salary' )
            {
            // InternalEmployeeDsl.g:433:1: ( 'salary' )
            // InternalEmployeeDsl.g:434:2: 'salary'
            {
             before(grammarAccess.getEmployeeAccess().getSalaryKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getSalaryKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_5__0__Impl"


    // $ANTLR start "rule__Employee__Group_5__1"
    // InternalEmployeeDsl.g:443:1: rule__Employee__Group_5__1 : rule__Employee__Group_5__1__Impl ;
    public final void rule__Employee__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:447:1: ( rule__Employee__Group_5__1__Impl )
            // InternalEmployeeDsl.g:448:2: rule__Employee__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_5__1"


    // $ANTLR start "rule__Employee__Group_5__1__Impl"
    // InternalEmployeeDsl.g:454:1: rule__Employee__Group_5__1__Impl : ( ( rule__Employee__SalaryAssignment_5_1 ) ) ;
    public final void rule__Employee__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:458:1: ( ( ( rule__Employee__SalaryAssignment_5_1 ) ) )
            // InternalEmployeeDsl.g:459:1: ( ( rule__Employee__SalaryAssignment_5_1 ) )
            {
            // InternalEmployeeDsl.g:459:1: ( ( rule__Employee__SalaryAssignment_5_1 ) )
            // InternalEmployeeDsl.g:460:2: ( rule__Employee__SalaryAssignment_5_1 )
            {
             before(grammarAccess.getEmployeeAccess().getSalaryAssignment_5_1()); 
            // InternalEmployeeDsl.g:461:2: ( rule__Employee__SalaryAssignment_5_1 )
            // InternalEmployeeDsl.g:461:3: rule__Employee__SalaryAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Employee__SalaryAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getSalaryAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_5__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalEmployeeDsl.g:470:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:474:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalEmployeeDsl.g:475:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalEmployeeDsl.g:482:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:486:1: ( ( ( '-' )? ) )
            // InternalEmployeeDsl.g:487:1: ( ( '-' )? )
            {
            // InternalEmployeeDsl.g:487:1: ( ( '-' )? )
            // InternalEmployeeDsl.g:488:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalEmployeeDsl.g:489:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEmployeeDsl.g:489:3: '-'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalEmployeeDsl.g:497:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:501:1: ( rule__EInt__Group__1__Impl )
            // InternalEmployeeDsl.g:502:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalEmployeeDsl.g:508:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:512:1: ( ( RULE_INT ) )
            // InternalEmployeeDsl.g:513:1: ( RULE_INT )
            {
            // InternalEmployeeDsl.g:513:1: ( RULE_INT )
            // InternalEmployeeDsl.g:514:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EmployeeContainer__EmployeesAssignment"
    // InternalEmployeeDsl.g:524:1: rule__EmployeeContainer__EmployeesAssignment : ( ruleEmployee ) ;
    public final void rule__EmployeeContainer__EmployeesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:528:1: ( ( ruleEmployee ) )
            // InternalEmployeeDsl.g:529:2: ( ruleEmployee )
            {
            // InternalEmployeeDsl.g:529:2: ( ruleEmployee )
            // InternalEmployeeDsl.g:530:3: ruleEmployee
            {
             before(grammarAccess.getEmployeeContainerAccess().getEmployeesEmployeeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEmployee();

            state._fsp--;

             after(grammarAccess.getEmployeeContainerAccess().getEmployeesEmployeeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeContainer__EmployeesAssignment"


    // $ANTLR start "rule__Employee__IDAssignment_2"
    // InternalEmployeeDsl.g:539:1: rule__Employee__IDAssignment_2 : ( ruleEInt ) ;
    public final void rule__Employee__IDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:543:1: ( ( ruleEInt ) )
            // InternalEmployeeDsl.g:544:2: ( ruleEInt )
            {
            // InternalEmployeeDsl.g:544:2: ( ruleEInt )
            // InternalEmployeeDsl.g:545:3: ruleEInt
            {
             before(grammarAccess.getEmployeeAccess().getIDEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEmployeeAccess().getIDEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__IDAssignment_2"


    // $ANTLR start "rule__Employee__NameAssignment_4_1"
    // InternalEmployeeDsl.g:554:1: rule__Employee__NameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Employee__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:558:1: ( ( ruleEString ) )
            // InternalEmployeeDsl.g:559:2: ( ruleEString )
            {
            // InternalEmployeeDsl.g:559:2: ( ruleEString )
            // InternalEmployeeDsl.g:560:3: ruleEString
            {
             before(grammarAccess.getEmployeeAccess().getNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEmployeeAccess().getNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__NameAssignment_4_1"


    // $ANTLR start "rule__Employee__SalaryAssignment_5_1"
    // InternalEmployeeDsl.g:569:1: rule__Employee__SalaryAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Employee__SalaryAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEmployeeDsl.g:573:1: ( ( ruleEInt ) )
            // InternalEmployeeDsl.g:574:2: ( ruleEInt )
            {
            // InternalEmployeeDsl.g:574:2: ( ruleEInt )
            // InternalEmployeeDsl.g:575:3: ruleEInt
            {
             before(grammarAccess.getEmployeeAccess().getSalaryEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEmployeeAccess().getSalaryEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__SalaryAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});

}