package com.kaleidoscope.usecase.showcase.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.kaleidoscope.usecase.showcase.xtext.services.EmployeeDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEmployeeDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Employee'", "'{'", "'name'", "'salary'", "'}'", "'-'"
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

        public InternalEmployeeDslParser(TokenStream input, EmployeeDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EmployeeContainer";
       	}

       	@Override
       	protected EmployeeDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEmployeeContainer"
    // InternalEmployeeDsl.g:64:1: entryRuleEmployeeContainer returns [EObject current=null] : iv_ruleEmployeeContainer= ruleEmployeeContainer EOF ;
    public final EObject entryRuleEmployeeContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmployeeContainer = null;


        try {
            // InternalEmployeeDsl.g:64:58: (iv_ruleEmployeeContainer= ruleEmployeeContainer EOF )
            // InternalEmployeeDsl.g:65:2: iv_ruleEmployeeContainer= ruleEmployeeContainer EOF
            {
             newCompositeNode(grammarAccess.getEmployeeContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmployeeContainer=ruleEmployeeContainer();

            state._fsp--;

             current =iv_ruleEmployeeContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmployeeContainer"


    // $ANTLR start "ruleEmployeeContainer"
    // InternalEmployeeDsl.g:71:1: ruleEmployeeContainer returns [EObject current=null] : ( (lv_employees_0_0= ruleEmployee ) )* ;
    public final EObject ruleEmployeeContainer() throws RecognitionException {
        EObject current = null;

        EObject lv_employees_0_0 = null;



        	enterRule();

        try {
            // InternalEmployeeDsl.g:77:2: ( ( (lv_employees_0_0= ruleEmployee ) )* )
            // InternalEmployeeDsl.g:78:2: ( (lv_employees_0_0= ruleEmployee ) )*
            {
            // InternalEmployeeDsl.g:78:2: ( (lv_employees_0_0= ruleEmployee ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEmployeeDsl.g:79:3: (lv_employees_0_0= ruleEmployee )
            	    {
            	    // InternalEmployeeDsl.g:79:3: (lv_employees_0_0= ruleEmployee )
            	    // InternalEmployeeDsl.g:80:4: lv_employees_0_0= ruleEmployee
            	    {

            	    				newCompositeNode(grammarAccess.getEmployeeContainerAccess().getEmployeesEmployeeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_employees_0_0=ruleEmployee();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getEmployeeContainerRule());
            	    				}
            	    				add(
            	    					current,
            	    					"employees",
            	    					lv_employees_0_0,
            	    					"com.kaleidoscope.usecase.showcase.xtext.EmployeeDsl.Employee");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmployeeContainer"


    // $ANTLR start "entryRuleEmployee"
    // InternalEmployeeDsl.g:100:1: entryRuleEmployee returns [EObject current=null] : iv_ruleEmployee= ruleEmployee EOF ;
    public final EObject entryRuleEmployee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmployee = null;


        try {
            // InternalEmployeeDsl.g:100:49: (iv_ruleEmployee= ruleEmployee EOF )
            // InternalEmployeeDsl.g:101:2: iv_ruleEmployee= ruleEmployee EOF
            {
             newCompositeNode(grammarAccess.getEmployeeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmployee=ruleEmployee();

            state._fsp--;

             current =iv_ruleEmployee; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // InternalEmployeeDsl.g:107:1: ruleEmployee returns [EObject current=null] : ( () otherlv_1= 'Employee' ( (lv_ID_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'salary' ( (lv_salary_7_0= ruleEInt ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleEmployee() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_ID_2_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_salary_7_0 = null;



        	enterRule();

        try {
            // InternalEmployeeDsl.g:113:2: ( ( () otherlv_1= 'Employee' ( (lv_ID_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'salary' ( (lv_salary_7_0= ruleEInt ) ) )? otherlv_8= '}' ) )
            // InternalEmployeeDsl.g:114:2: ( () otherlv_1= 'Employee' ( (lv_ID_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'salary' ( (lv_salary_7_0= ruleEInt ) ) )? otherlv_8= '}' )
            {
            // InternalEmployeeDsl.g:114:2: ( () otherlv_1= 'Employee' ( (lv_ID_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'salary' ( (lv_salary_7_0= ruleEInt ) ) )? otherlv_8= '}' )
            // InternalEmployeeDsl.g:115:3: () otherlv_1= 'Employee' ( (lv_ID_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'salary' ( (lv_salary_7_0= ruleEInt ) ) )? otherlv_8= '}'
            {
            // InternalEmployeeDsl.g:115:3: ()
            // InternalEmployeeDsl.g:116:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmployeeAccess().getEmployeeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEmployeeAccess().getEmployeeKeyword_1());
            		
            // InternalEmployeeDsl.g:126:3: ( (lv_ID_2_0= ruleEInt ) )
            // InternalEmployeeDsl.g:127:4: (lv_ID_2_0= ruleEInt )
            {
            // InternalEmployeeDsl.g:127:4: (lv_ID_2_0= ruleEInt )
            // InternalEmployeeDsl.g:128:5: lv_ID_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getEmployeeAccess().getIDEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_ID_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEmployeeRule());
            					}
            					set(
            						current,
            						"ID",
            						lv_ID_2_0,
            						"com.kaleidoscope.usecase.showcase.xtext.EmployeeDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getEmployeeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEmployeeDsl.g:149:3: (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEmployeeDsl.g:150:4: otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getEmployeeAccess().getNameKeyword_4_0());
                    			
                    // InternalEmployeeDsl.g:154:4: ( (lv_name_5_0= ruleEString ) )
                    // InternalEmployeeDsl.g:155:5: (lv_name_5_0= ruleEString )
                    {
                    // InternalEmployeeDsl.g:155:5: (lv_name_5_0= ruleEString )
                    // InternalEmployeeDsl.g:156:6: lv_name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEmployeeAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEmployeeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"com.kaleidoscope.usecase.showcase.xtext.EmployeeDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEmployeeDsl.g:174:3: (otherlv_6= 'salary' ( (lv_salary_7_0= ruleEInt ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEmployeeDsl.g:175:4: otherlv_6= 'salary' ( (lv_salary_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEmployeeAccess().getSalaryKeyword_5_0());
                    			
                    // InternalEmployeeDsl.g:179:4: ( (lv_salary_7_0= ruleEInt ) )
                    // InternalEmployeeDsl.g:180:5: (lv_salary_7_0= ruleEInt )
                    {
                    // InternalEmployeeDsl.g:180:5: (lv_salary_7_0= ruleEInt )
                    // InternalEmployeeDsl.g:181:6: lv_salary_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEmployeeAccess().getSalaryEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_salary_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEmployeeRule());
                    						}
                    						set(
                    							current,
                    							"salary",
                    							lv_salary_7_0,
                    							"com.kaleidoscope.usecase.showcase.xtext.EmployeeDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEmployeeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "entryRuleEString"
    // InternalEmployeeDsl.g:207:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEmployeeDsl.g:207:47: (iv_ruleEString= ruleEString EOF )
            // InternalEmployeeDsl.g:208:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalEmployeeDsl.g:214:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalEmployeeDsl.g:220:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalEmployeeDsl.g:221:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalEmployeeDsl.g:221:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEmployeeDsl.g:222:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEmployeeDsl.g:230:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalEmployeeDsl.g:241:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalEmployeeDsl.g:241:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalEmployeeDsl.g:242:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalEmployeeDsl.g:248:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalEmployeeDsl.g:254:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalEmployeeDsl.g:255:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalEmployeeDsl.g:255:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalEmployeeDsl.g:256:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalEmployeeDsl.g:256:3: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEmployeeDsl.g:257:4: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});

}