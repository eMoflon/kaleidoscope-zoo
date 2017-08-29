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
import com.kaleidoscope.usecase.showcase.xtext.services.PersonDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPersonDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Person'", "'{'", "'}'", "'name'", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalPersonDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPersonDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPersonDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPersonDsl.g"; }


    	private PersonDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(PersonDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePersonContainer"
    // InternalPersonDsl.g:53:1: entryRulePersonContainer : rulePersonContainer EOF ;
    public final void entryRulePersonContainer() throws RecognitionException {
        try {
            // InternalPersonDsl.g:54:1: ( rulePersonContainer EOF )
            // InternalPersonDsl.g:55:1: rulePersonContainer EOF
            {
             before(grammarAccess.getPersonContainerRule()); 
            pushFollow(FOLLOW_1);
            rulePersonContainer();

            state._fsp--;

             after(grammarAccess.getPersonContainerRule()); 
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
    // $ANTLR end "entryRulePersonContainer"


    // $ANTLR start "rulePersonContainer"
    // InternalPersonDsl.g:62:1: rulePersonContainer : ( ( rule__PersonContainer__PersonsAssignment )* ) ;
    public final void rulePersonContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:66:2: ( ( ( rule__PersonContainer__PersonsAssignment )* ) )
            // InternalPersonDsl.g:67:2: ( ( rule__PersonContainer__PersonsAssignment )* )
            {
            // InternalPersonDsl.g:67:2: ( ( rule__PersonContainer__PersonsAssignment )* )
            // InternalPersonDsl.g:68:3: ( rule__PersonContainer__PersonsAssignment )*
            {
             before(grammarAccess.getPersonContainerAccess().getPersonsAssignment()); 
            // InternalPersonDsl.g:69:3: ( rule__PersonContainer__PersonsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPersonDsl.g:69:4: rule__PersonContainer__PersonsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__PersonContainer__PersonsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPersonContainerAccess().getPersonsAssignment()); 

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
    // $ANTLR end "rulePersonContainer"


    // $ANTLR start "entryRulePerson"
    // InternalPersonDsl.g:78:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalPersonDsl.g:79:1: ( rulePerson EOF )
            // InternalPersonDsl.g:80:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalPersonDsl.g:87:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:91:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalPersonDsl.g:92:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalPersonDsl.g:92:2: ( ( rule__Person__Group__0 ) )
            // InternalPersonDsl.g:93:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalPersonDsl.g:94:3: ( rule__Person__Group__0 )
            // InternalPersonDsl.g:94:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleEString"
    // InternalPersonDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalPersonDsl.g:104:1: ( ruleEString EOF )
            // InternalPersonDsl.g:105:1: ruleEString EOF
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
    // InternalPersonDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalPersonDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalPersonDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalPersonDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalPersonDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalPersonDsl.g:119:4: rule__EString__Alternatives
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
    // InternalPersonDsl.g:128:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalPersonDsl.g:129:1: ( ruleEInt EOF )
            // InternalPersonDsl.g:130:1: ruleEInt EOF
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
    // InternalPersonDsl.g:137:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:141:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalPersonDsl.g:142:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalPersonDsl.g:142:2: ( ( rule__EInt__Group__0 ) )
            // InternalPersonDsl.g:143:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalPersonDsl.g:144:3: ( rule__EInt__Group__0 )
            // InternalPersonDsl.g:144:4: rule__EInt__Group__0
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
    // InternalPersonDsl.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalPersonDsl.g:157:2: ( RULE_STRING )
                    {
                    // InternalPersonDsl.g:157:2: ( RULE_STRING )
                    // InternalPersonDsl.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPersonDsl.g:163:2: ( RULE_ID )
                    {
                    // InternalPersonDsl.g:163:2: ( RULE_ID )
                    // InternalPersonDsl.g:164:3: RULE_ID
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


    // $ANTLR start "rule__Person__Group__0"
    // InternalPersonDsl.g:173:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:177:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalPersonDsl.g:178:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

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
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalPersonDsl.g:185:1: rule__Person__Group__0__Impl : ( () ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:189:1: ( ( () ) )
            // InternalPersonDsl.g:190:1: ( () )
            {
            // InternalPersonDsl.g:190:1: ( () )
            // InternalPersonDsl.g:191:2: ()
            {
             before(grammarAccess.getPersonAccess().getPersonAction_0()); 
            // InternalPersonDsl.g:192:2: ()
            // InternalPersonDsl.g:192:3: 
            {
            }

             after(grammarAccess.getPersonAccess().getPersonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalPersonDsl.g:200:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:204:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalPersonDsl.g:205:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__2();

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
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalPersonDsl.g:212:1: rule__Person__Group__1__Impl : ( 'Person' ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:216:1: ( ( 'Person' ) )
            // InternalPersonDsl.g:217:1: ( 'Person' )
            {
            // InternalPersonDsl.g:217:1: ( 'Person' )
            // InternalPersonDsl.g:218:2: 'Person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPersonKeyword_1()); 

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
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // InternalPersonDsl.g:227:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:231:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalPersonDsl.g:232:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Person__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__3();

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
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // InternalPersonDsl.g:239:1: rule__Person__Group__2__Impl : ( ( rule__Person__IDAssignment_2 ) ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:243:1: ( ( ( rule__Person__IDAssignment_2 ) ) )
            // InternalPersonDsl.g:244:1: ( ( rule__Person__IDAssignment_2 ) )
            {
            // InternalPersonDsl.g:244:1: ( ( rule__Person__IDAssignment_2 ) )
            // InternalPersonDsl.g:245:2: ( rule__Person__IDAssignment_2 )
            {
             before(grammarAccess.getPersonAccess().getIDAssignment_2()); 
            // InternalPersonDsl.g:246:2: ( rule__Person__IDAssignment_2 )
            // InternalPersonDsl.g:246:3: rule__Person__IDAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Person__IDAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getIDAssignment_2()); 

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
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__Person__Group__3"
    // InternalPersonDsl.g:254:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:258:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalPersonDsl.g:259:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Person__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__4();

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
    // $ANTLR end "rule__Person__Group__3"


    // $ANTLR start "rule__Person__Group__3__Impl"
    // InternalPersonDsl.g:266:1: rule__Person__Group__3__Impl : ( '{' ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:270:1: ( ( '{' ) )
            // InternalPersonDsl.g:271:1: ( '{' )
            {
            // InternalPersonDsl.g:271:1: ( '{' )
            // InternalPersonDsl.g:272:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Person__Group__3__Impl"


    // $ANTLR start "rule__Person__Group__4"
    // InternalPersonDsl.g:281:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:285:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalPersonDsl.g:286:2: rule__Person__Group__4__Impl rule__Person__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Person__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__5();

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
    // $ANTLR end "rule__Person__Group__4"


    // $ANTLR start "rule__Person__Group__4__Impl"
    // InternalPersonDsl.g:293:1: rule__Person__Group__4__Impl : ( ( rule__Person__Group_4__0 )? ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:297:1: ( ( ( rule__Person__Group_4__0 )? ) )
            // InternalPersonDsl.g:298:1: ( ( rule__Person__Group_4__0 )? )
            {
            // InternalPersonDsl.g:298:1: ( ( rule__Person__Group_4__0 )? )
            // InternalPersonDsl.g:299:2: ( rule__Person__Group_4__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_4()); 
            // InternalPersonDsl.g:300:2: ( rule__Person__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPersonDsl.g:300:3: rule__Person__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Person__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Person__Group__4__Impl"


    // $ANTLR start "rule__Person__Group__5"
    // InternalPersonDsl.g:308:1: rule__Person__Group__5 : rule__Person__Group__5__Impl ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:312:1: ( rule__Person__Group__5__Impl )
            // InternalPersonDsl.g:313:2: rule__Person__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__5__Impl();

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
    // $ANTLR end "rule__Person__Group__5"


    // $ANTLR start "rule__Person__Group__5__Impl"
    // InternalPersonDsl.g:319:1: rule__Person__Group__5__Impl : ( '}' ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:323:1: ( ( '}' ) )
            // InternalPersonDsl.g:324:1: ( '}' )
            {
            // InternalPersonDsl.g:324:1: ( '}' )
            // InternalPersonDsl.g:325:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Person__Group__5__Impl"


    // $ANTLR start "rule__Person__Group_4__0"
    // InternalPersonDsl.g:335:1: rule__Person__Group_4__0 : rule__Person__Group_4__0__Impl rule__Person__Group_4__1 ;
    public final void rule__Person__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:339:1: ( rule__Person__Group_4__0__Impl rule__Person__Group_4__1 )
            // InternalPersonDsl.g:340:2: rule__Person__Group_4__0__Impl rule__Person__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Person__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_4__1();

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
    // $ANTLR end "rule__Person__Group_4__0"


    // $ANTLR start "rule__Person__Group_4__0__Impl"
    // InternalPersonDsl.g:347:1: rule__Person__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__Person__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:351:1: ( ( 'name' ) )
            // InternalPersonDsl.g:352:1: ( 'name' )
            {
            // InternalPersonDsl.g:352:1: ( 'name' )
            // InternalPersonDsl.g:353:2: 'name'
            {
             before(grammarAccess.getPersonAccess().getNameKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getNameKeyword_4_0()); 

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
    // $ANTLR end "rule__Person__Group_4__0__Impl"


    // $ANTLR start "rule__Person__Group_4__1"
    // InternalPersonDsl.g:362:1: rule__Person__Group_4__1 : rule__Person__Group_4__1__Impl ;
    public final void rule__Person__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:366:1: ( rule__Person__Group_4__1__Impl )
            // InternalPersonDsl.g:367:2: rule__Person__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_4__1__Impl();

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
    // $ANTLR end "rule__Person__Group_4__1"


    // $ANTLR start "rule__Person__Group_4__1__Impl"
    // InternalPersonDsl.g:373:1: rule__Person__Group_4__1__Impl : ( ( rule__Person__NameAssignment_4_1 ) ) ;
    public final void rule__Person__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:377:1: ( ( ( rule__Person__NameAssignment_4_1 ) ) )
            // InternalPersonDsl.g:378:1: ( ( rule__Person__NameAssignment_4_1 ) )
            {
            // InternalPersonDsl.g:378:1: ( ( rule__Person__NameAssignment_4_1 ) )
            // InternalPersonDsl.g:379:2: ( rule__Person__NameAssignment_4_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_4_1()); 
            // InternalPersonDsl.g:380:2: ( rule__Person__NameAssignment_4_1 )
            // InternalPersonDsl.g:380:3: rule__Person__NameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_4_1()); 

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
    // $ANTLR end "rule__Person__Group_4__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalPersonDsl.g:389:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:393:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalPersonDsl.g:394:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalPersonDsl.g:401:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:405:1: ( ( ( '-' )? ) )
            // InternalPersonDsl.g:406:1: ( ( '-' )? )
            {
            // InternalPersonDsl.g:406:1: ( ( '-' )? )
            // InternalPersonDsl.g:407:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalPersonDsl.g:408:2: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPersonDsl.g:408:3: '-'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalPersonDsl.g:416:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:420:1: ( rule__EInt__Group__1__Impl )
            // InternalPersonDsl.g:421:2: rule__EInt__Group__1__Impl
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
    // InternalPersonDsl.g:427:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:431:1: ( ( RULE_INT ) )
            // InternalPersonDsl.g:432:1: ( RULE_INT )
            {
            // InternalPersonDsl.g:432:1: ( RULE_INT )
            // InternalPersonDsl.g:433:2: RULE_INT
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


    // $ANTLR start "rule__PersonContainer__PersonsAssignment"
    // InternalPersonDsl.g:443:1: rule__PersonContainer__PersonsAssignment : ( rulePerson ) ;
    public final void rule__PersonContainer__PersonsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:447:1: ( ( rulePerson ) )
            // InternalPersonDsl.g:448:2: ( rulePerson )
            {
            // InternalPersonDsl.g:448:2: ( rulePerson )
            // InternalPersonDsl.g:449:3: rulePerson
            {
             before(grammarAccess.getPersonContainerAccess().getPersonsPersonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonContainerAccess().getPersonsPersonParserRuleCall_0()); 

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
    // $ANTLR end "rule__PersonContainer__PersonsAssignment"


    // $ANTLR start "rule__Person__IDAssignment_2"
    // InternalPersonDsl.g:458:1: rule__Person__IDAssignment_2 : ( ruleEInt ) ;
    public final void rule__Person__IDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:462:1: ( ( ruleEInt ) )
            // InternalPersonDsl.g:463:2: ( ruleEInt )
            {
            // InternalPersonDsl.g:463:2: ( ruleEInt )
            // InternalPersonDsl.g:464:3: ruleEInt
            {
             before(grammarAccess.getPersonAccess().getIDEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getIDEIntParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Person__IDAssignment_2"


    // $ANTLR start "rule__Person__NameAssignment_4_1"
    // InternalPersonDsl.g:473:1: rule__Person__NameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Person__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersonDsl.g:477:1: ( ( ruleEString ) )
            // InternalPersonDsl.g:478:2: ( ruleEString )
            {
            // InternalPersonDsl.g:478:2: ( ruleEString )
            // InternalPersonDsl.g:479:3: ruleEString
            {
             before(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Person__NameAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});

}