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
import com.kaleidoscope.usecase.showcase.xtext.services.PersonDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPersonDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Person'", "'{'", "'name'", "'}'", "'-'"
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

        public InternalPersonDslParser(TokenStream input, PersonDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PersonContainer";
       	}

       	@Override
       	protected PersonDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePersonContainer"
    // InternalPersonDsl.g:64:1: entryRulePersonContainer returns [EObject current=null] : iv_rulePersonContainer= rulePersonContainer EOF ;
    public final EObject entryRulePersonContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonContainer = null;


        try {
            // InternalPersonDsl.g:64:56: (iv_rulePersonContainer= rulePersonContainer EOF )
            // InternalPersonDsl.g:65:2: iv_rulePersonContainer= rulePersonContainer EOF
            {
             newCompositeNode(grammarAccess.getPersonContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonContainer=rulePersonContainer();

            state._fsp--;

             current =iv_rulePersonContainer; 
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
    // $ANTLR end "entryRulePersonContainer"


    // $ANTLR start "rulePersonContainer"
    // InternalPersonDsl.g:71:1: rulePersonContainer returns [EObject current=null] : ( (lv_persons_0_0= rulePerson ) )* ;
    public final EObject rulePersonContainer() throws RecognitionException {
        EObject current = null;

        EObject lv_persons_0_0 = null;



        	enterRule();

        try {
            // InternalPersonDsl.g:77:2: ( ( (lv_persons_0_0= rulePerson ) )* )
            // InternalPersonDsl.g:78:2: ( (lv_persons_0_0= rulePerson ) )*
            {
            // InternalPersonDsl.g:78:2: ( (lv_persons_0_0= rulePerson ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPersonDsl.g:79:3: (lv_persons_0_0= rulePerson )
            	    {
            	    // InternalPersonDsl.g:79:3: (lv_persons_0_0= rulePerson )
            	    // InternalPersonDsl.g:80:4: lv_persons_0_0= rulePerson
            	    {

            	    				newCompositeNode(grammarAccess.getPersonContainerAccess().getPersonsPersonParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_persons_0_0=rulePerson();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getPersonContainerRule());
            	    				}
            	    				add(
            	    					current,
            	    					"persons",
            	    					lv_persons_0_0,
            	    					"com.kaleidoscope.usecase.showcase.xtext.PersonDsl.Person");
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
    // $ANTLR end "rulePersonContainer"


    // $ANTLR start "entryRulePerson"
    // InternalPersonDsl.g:100:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalPersonDsl.g:100:47: (iv_rulePerson= rulePerson EOF )
            // InternalPersonDsl.g:101:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalPersonDsl.g:107:1: rulePerson returns [EObject current=null] : ( () otherlv_1= 'Person' ( (lv_ID_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_ID_2_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;



        	enterRule();

        try {
            // InternalPersonDsl.g:113:2: ( ( () otherlv_1= 'Person' ( (lv_ID_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalPersonDsl.g:114:2: ( () otherlv_1= 'Person' ( (lv_ID_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalPersonDsl.g:114:2: ( () otherlv_1= 'Person' ( (lv_ID_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalPersonDsl.g:115:3: () otherlv_1= 'Person' ( (lv_ID_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalPersonDsl.g:115:3: ()
            // InternalPersonDsl.g:116:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonAccess().getPersonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getPersonKeyword_1());
            		
            // InternalPersonDsl.g:126:3: ( (lv_ID_2_0= ruleEInt ) )
            // InternalPersonDsl.g:127:4: (lv_ID_2_0= ruleEInt )
            {
            // InternalPersonDsl.g:127:4: (lv_ID_2_0= ruleEInt )
            // InternalPersonDsl.g:128:5: lv_ID_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getIDEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_ID_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"ID",
            						lv_ID_2_0,
            						"com.kaleidoscope.usecase.showcase.xtext.PersonDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPersonDsl.g:149:3: (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPersonDsl.g:150:4: otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getNameKeyword_4_0());
                    			
                    // InternalPersonDsl.g:154:4: ( (lv_name_5_0= ruleEString ) )
                    // InternalPersonDsl.g:155:5: (lv_name_5_0= ruleEString )
                    {
                    // InternalPersonDsl.g:155:5: (lv_name_5_0= ruleEString )
                    // InternalPersonDsl.g:156:6: lv_name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"com.kaleidoscope.usecase.showcase.xtext.PersonDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleEString"
    // InternalPersonDsl.g:182:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPersonDsl.g:182:47: (iv_ruleEString= ruleEString EOF )
            // InternalPersonDsl.g:183:2: iv_ruleEString= ruleEString EOF
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
    // InternalPersonDsl.g:189:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPersonDsl.g:195:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPersonDsl.g:196:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPersonDsl.g:196:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPersonDsl.g:197:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPersonDsl.g:205:3: this_ID_1= RULE_ID
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
    // InternalPersonDsl.g:216:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalPersonDsl.g:216:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalPersonDsl.g:217:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalPersonDsl.g:223:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalPersonDsl.g:229:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalPersonDsl.g:230:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalPersonDsl.g:230:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalPersonDsl.g:231:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalPersonDsl.g:231:3: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPersonDsl.g:232:4: kw= '-'
                    {
                    kw=(Token)match(input,15,FOLLOW_9); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});

}