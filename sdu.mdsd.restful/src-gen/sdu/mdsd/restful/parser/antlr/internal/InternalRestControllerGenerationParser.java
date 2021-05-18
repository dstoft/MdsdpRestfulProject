package sdu.mdsd.restful.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sdu.mdsd.restful.services.RestControllerGenerationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestControllerGenerationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'type'", "'external'", "'using'", "'entity'", "':'", "'{'", "'}'", "'requires'", "'of'", "'require'", "'||'", "'&&'", "'='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'controller'", "'uses'", "'CREATE'", "'with'", "'exclude'", "','", "'GET'", "'on'", "'LIST'", "'UPDATE'", "'DELETE'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRestControllerGenerationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRestControllerGenerationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRestControllerGenerationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRestControllerGeneration.g"; }



     	private RestControllerGenerationGrammarAccess grammarAccess;

        public InternalRestControllerGenerationParser(TokenStream input, RestControllerGenerationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EntityModel";
       	}

       	@Override
       	protected RestControllerGenerationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEntityModel"
    // InternalRestControllerGeneration.g:64:1: entryRuleEntityModel returns [EObject current=null] : iv_ruleEntityModel= ruleEntityModel EOF ;
    public final EObject entryRuleEntityModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityModel = null;


        try {
            // InternalRestControllerGeneration.g:64:52: (iv_ruleEntityModel= ruleEntityModel EOF )
            // InternalRestControllerGeneration.g:65:2: iv_ruleEntityModel= ruleEntityModel EOF
            {
             newCompositeNode(grammarAccess.getEntityModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityModel=ruleEntityModel();

            state._fsp--;

             current =iv_ruleEntityModel; 
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
    // $ANTLR end "entryRuleEntityModel"


    // $ANTLR start "ruleEntityModel"
    // InternalRestControllerGeneration.g:71:1: ruleEntityModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) ;
    public final EObject ruleEntityModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_declarations_2_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) )
            // InternalRestControllerGeneration.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            {
            // InternalRestControllerGeneration.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            // InternalRestControllerGeneration.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityModelAccess().getModelKeyword_0());
            		
            // InternalRestControllerGeneration.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalRestControllerGeneration.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRestControllerGeneration.g:101:3: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)||LA1_0==15||LA1_0==35) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // InternalRestControllerGeneration.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    // InternalRestControllerGeneration.g:103:5: lv_declarations_2_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getEntityModelAccess().getDeclarationsDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_2_0,
            	    						"sdu.mdsd.restful.RestControllerGeneration.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleEntityModel"


    // $ANTLR start "entryRuleDeclaration"
    // InternalRestControllerGeneration.g:124:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalRestControllerGeneration.g:124:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalRestControllerGeneration.g:125:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalRestControllerGeneration.g:131:1: ruleDeclaration returns [EObject current=null] : (this_Type_0= ruleType | this_Entity_1= ruleEntity | this_Controller_2= ruleController | this_ExternalDef_3= ruleExternalDef ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_Entity_1 = null;

        EObject this_Controller_2 = null;

        EObject this_ExternalDef_3 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:137:2: ( (this_Type_0= ruleType | this_Entity_1= ruleEntity | this_Controller_2= ruleController | this_ExternalDef_3= ruleExternalDef ) )
            // InternalRestControllerGeneration.g:138:2: (this_Type_0= ruleType | this_Entity_1= ruleEntity | this_Controller_2= ruleController | this_ExternalDef_3= ruleExternalDef )
            {
            // InternalRestControllerGeneration.g:138:2: (this_Type_0= ruleType | this_Entity_1= ruleEntity | this_Controller_2= ruleController | this_ExternalDef_3= ruleExternalDef )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 35:
                {
                alt2=3;
                }
                break;
            case 13:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRestControllerGeneration.g:139:3: this_Type_0= ruleType
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_0=ruleType();

                    state._fsp--;


                    			current = this_Type_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRestControllerGeneration.g:148:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRestControllerGeneration.g:157:3: this_Controller_2= ruleController
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getControllerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Controller_2=ruleController();

                    state._fsp--;


                    			current = this_Controller_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRestControllerGeneration.g:166:3: this_ExternalDef_3= ruleExternalDef
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getExternalDefParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalDef_3=ruleExternalDef();

                    state._fsp--;


                    			current = this_ExternalDef_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleType"
    // InternalRestControllerGeneration.g:178:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalRestControllerGeneration.g:178:45: (iv_ruleType= ruleType EOF )
            // InternalRestControllerGeneration.g:179:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalRestControllerGeneration.g:185:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:191:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:192:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:192:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:193:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalRestControllerGeneration.g:197:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:198:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:198:4: (lv_name_1_0= RULE_ID )
            // InternalRestControllerGeneration.g:199:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleExternalDef"
    // InternalRestControllerGeneration.g:219:1: entryRuleExternalDef returns [EObject current=null] : iv_ruleExternalDef= ruleExternalDef EOF ;
    public final EObject entryRuleExternalDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDef = null;


        try {
            // InternalRestControllerGeneration.g:219:52: (iv_ruleExternalDef= ruleExternalDef EOF )
            // InternalRestControllerGeneration.g:220:2: iv_ruleExternalDef= ruleExternalDef EOF
            {
             newCompositeNode(grammarAccess.getExternalDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalDef=ruleExternalDef();

            state._fsp--;

             current =iv_ruleExternalDef; 
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
    // $ANTLR end "entryRuleExternalDef"


    // $ANTLR start "ruleExternalDef"
    // InternalRestControllerGeneration.g:226:1: ruleExternalDef returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleExternalDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:232:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:233:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:233:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:234:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalDefAccess().getExternalKeyword_0());
            		
            // InternalRestControllerGeneration.g:238:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:239:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:239:4: (lv_name_1_0= RULE_ID )
            // InternalRestControllerGeneration.g:240:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalDefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalDefAccess().getUsingKeyword_2());
            		
            // InternalRestControllerGeneration.g:260:3: ( (otherlv_3= RULE_ID ) )
            // InternalRestControllerGeneration.g:261:4: (otherlv_3= RULE_ID )
            {
            // InternalRestControllerGeneration.g:261:4: (otherlv_3= RULE_ID )
            // InternalRestControllerGeneration.g:262:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalDefRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getExternalDefAccess().getTypeTypeCrossReference_3_0());
            				

            }


            }


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
    // $ANTLR end "ruleExternalDef"


    // $ANTLR start "entryRuleEntity"
    // InternalRestControllerGeneration.g:277:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalRestControllerGeneration.g:277:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalRestControllerGeneration.g:278:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalRestControllerGeneration.g:284:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_declarations_5_0= ruleEntityDeclaration ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declarations_5_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:290:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_declarations_5_0= ruleEntityDeclaration ) )* otherlv_6= '}' ) )
            // InternalRestControllerGeneration.g:291:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_declarations_5_0= ruleEntityDeclaration ) )* otherlv_6= '}' )
            {
            // InternalRestControllerGeneration.g:291:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_declarations_5_0= ruleEntityDeclaration ) )* otherlv_6= '}' )
            // InternalRestControllerGeneration.g:292:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_declarations_5_0= ruleEntityDeclaration ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalRestControllerGeneration.g:296:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:297:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:297:4: (lv_name_1_0= RULE_ID )
            // InternalRestControllerGeneration.g:298:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRestControllerGeneration.g:314:3: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRestControllerGeneration.g:315:4: otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getColonKeyword_2_0());
                    			
                    // InternalRestControllerGeneration.g:319:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRestControllerGeneration.g:320:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRestControllerGeneration.g:320:5: (otherlv_3= RULE_ID )
                    // InternalRestControllerGeneration.g:321:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getBaseEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRestControllerGeneration.g:337:3: ( (lv_declarations_5_0= ruleEntityDeclaration ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:338:4: (lv_declarations_5_0= ruleEntityDeclaration )
            	    {
            	    // InternalRestControllerGeneration.g:338:4: (lv_declarations_5_0= ruleEntityDeclaration )
            	    // InternalRestControllerGeneration.g:339:5: lv_declarations_5_0= ruleEntityDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getDeclarationsEntityDeclarationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_declarations_5_0=ruleEntityDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_5_0,
            	    						"sdu.mdsd.restful.RestControllerGeneration.EntityDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityDeclaration"
    // InternalRestControllerGeneration.g:364:1: entryRuleEntityDeclaration returns [EObject current=null] : iv_ruleEntityDeclaration= ruleEntityDeclaration EOF ;
    public final EObject entryRuleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDeclaration = null;


        try {
            // InternalRestControllerGeneration.g:364:58: (iv_ruleEntityDeclaration= ruleEntityDeclaration EOF )
            // InternalRestControllerGeneration.g:365:2: iv_ruleEntityDeclaration= ruleEntityDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEntityDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityDeclaration=ruleEntityDeclaration();

            state._fsp--;

             current =iv_ruleEntityDeclaration; 
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
    // $ANTLR end "entryRuleEntityDeclaration"


    // $ANTLR start "ruleEntityDeclaration"
    // InternalRestControllerGeneration.g:371:1: ruleEntityDeclaration returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Requirement_1= ruleRequirement ) ;
    public final EObject ruleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Requirement_1 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:377:2: ( (this_Attribute_0= ruleAttribute | this_Requirement_1= ruleRequirement ) )
            // InternalRestControllerGeneration.g:378:2: (this_Attribute_0= ruleAttribute | this_Requirement_1= ruleRequirement )
            {
            // InternalRestControllerGeneration.g:378:2: (this_Attribute_0= ruleAttribute | this_Requirement_1= ruleRequirement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRestControllerGeneration.g:379:3: this_Attribute_0= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getEntityDeclarationAccess().getAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRestControllerGeneration.g:388:3: this_Requirement_1= ruleRequirement
                    {

                    			newCompositeNode(grammarAccess.getEntityDeclarationAccess().getRequirementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Requirement_1=ruleRequirement();

                    state._fsp--;


                    			current = this_Requirement_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleEntityDeclaration"


    // $ANTLR start "entryRuleAttribute"
    // InternalRestControllerGeneration.g:400:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRestControllerGeneration.g:400:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRestControllerGeneration.g:401:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalRestControllerGeneration.g:407:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'requires' ( ( (lv_requires_4_1= ruleLogicRequirement | lv_requires_4_2= ruleExternalUse ) ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_requires_4_1 = null;

        EObject lv_requires_4_2 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:413:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'requires' ( ( (lv_requires_4_1= ruleLogicRequirement | lv_requires_4_2= ruleExternalUse ) ) ) )? ) )
            // InternalRestControllerGeneration.g:414:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'requires' ( ( (lv_requires_4_1= ruleLogicRequirement | lv_requires_4_2= ruleExternalUse ) ) ) )? )
            {
            // InternalRestControllerGeneration.g:414:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'requires' ( ( (lv_requires_4_1= ruleLogicRequirement | lv_requires_4_2= ruleExternalUse ) ) ) )? )
            // InternalRestControllerGeneration.g:415:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'requires' ( ( (lv_requires_4_1= ruleLogicRequirement | lv_requires_4_2= ruleExternalUse ) ) ) )?
            {
            // InternalRestControllerGeneration.g:415:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:416:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:416:4: (lv_name_0_0= RULE_ID )
            // InternalRestControllerGeneration.g:417:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalRestControllerGeneration.g:437:3: ( (otherlv_2= RULE_ID ) )
            // InternalRestControllerGeneration.g:438:4: (otherlv_2= RULE_ID )
            {
            // InternalRestControllerGeneration.g:438:4: (otherlv_2= RULE_ID )
            // InternalRestControllerGeneration.g:439:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0());
            				

            }


            }

            // InternalRestControllerGeneration.g:450:3: (otherlv_3= 'requires' ( ( (lv_requires_4_1= ruleLogicRequirement | lv_requires_4_2= ruleExternalUse ) ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRestControllerGeneration.g:451:4: otherlv_3= 'requires' ( ( (lv_requires_4_1= ruleLogicRequirement | lv_requires_4_2= ruleExternalUse ) ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getRequiresKeyword_3_0());
                    			
                    // InternalRestControllerGeneration.g:455:4: ( ( (lv_requires_4_1= ruleLogicRequirement | lv_requires_4_2= ruleExternalUse ) ) )
                    // InternalRestControllerGeneration.g:456:5: ( (lv_requires_4_1= ruleLogicRequirement | lv_requires_4_2= ruleExternalUse ) )
                    {
                    // InternalRestControllerGeneration.g:456:5: ( (lv_requires_4_1= ruleLogicRequirement | lv_requires_4_2= ruleExternalUse ) )
                    // InternalRestControllerGeneration.g:457:6: (lv_requires_4_1= ruleLogicRequirement | lv_requires_4_2= ruleExternalUse )
                    {
                    // InternalRestControllerGeneration.g:457:6: (lv_requires_4_1= ruleLogicRequirement | lv_requires_4_2= ruleExternalUse )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) ) {
                        int LA6_1 = input.LA(2);

                        if ( ((LA6_1>=24 && LA6_1<=32)) ) {
                            alt6=1;
                        }
                        else if ( (LA6_1==EOF||LA6_1==RULE_ID||LA6_1==18||LA6_1==21) ) {
                            alt6=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA6_0==RULE_INT||LA6_0==33) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalRestControllerGeneration.g:458:7: lv_requires_4_1= ruleLogicRequirement
                            {

                            							newCompositeNode(grammarAccess.getAttributeAccess().getRequiresLogicRequirementParserRuleCall_3_1_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_requires_4_1=ruleLogicRequirement();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAttributeRule());
                            							}
                            							set(
                            								current,
                            								"requires",
                            								lv_requires_4_1,
                            								"sdu.mdsd.restful.RestControllerGeneration.LogicRequirement");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalRestControllerGeneration.g:474:7: lv_requires_4_2= ruleExternalUse
                            {

                            							newCompositeNode(grammarAccess.getAttributeAccess().getRequiresExternalUseParserRuleCall_3_1_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            lv_requires_4_2=ruleExternalUse();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAttributeRule());
                            							}
                            							set(
                            								current,
                            								"requires",
                            								lv_requires_4_2,
                            								"sdu.mdsd.restful.RestControllerGeneration.ExternalUse");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleLogicRequirement"
    // InternalRestControllerGeneration.g:497:1: entryRuleLogicRequirement returns [EObject current=null] : iv_ruleLogicRequirement= ruleLogicRequirement EOF ;
    public final EObject entryRuleLogicRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicRequirement = null;


        try {
            // InternalRestControllerGeneration.g:497:57: (iv_ruleLogicRequirement= ruleLogicRequirement EOF )
            // InternalRestControllerGeneration.g:498:2: iv_ruleLogicRequirement= ruleLogicRequirement EOF
            {
             newCompositeNode(grammarAccess.getLogicRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicRequirement=ruleLogicRequirement();

            state._fsp--;

             current =iv_ruleLogicRequirement; 
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
    // $ANTLR end "entryRuleLogicRequirement"


    // $ANTLR start "ruleLogicRequirement"
    // InternalRestControllerGeneration.g:504:1: ruleLogicRequirement returns [EObject current=null] : ( (lv_logic_0_0= ruleLogicExp ) ) ;
    public final EObject ruleLogicRequirement() throws RecognitionException {
        EObject current = null;

        EObject lv_logic_0_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:510:2: ( ( (lv_logic_0_0= ruleLogicExp ) ) )
            // InternalRestControllerGeneration.g:511:2: ( (lv_logic_0_0= ruleLogicExp ) )
            {
            // InternalRestControllerGeneration.g:511:2: ( (lv_logic_0_0= ruleLogicExp ) )
            // InternalRestControllerGeneration.g:512:3: (lv_logic_0_0= ruleLogicExp )
            {
            // InternalRestControllerGeneration.g:512:3: (lv_logic_0_0= ruleLogicExp )
            // InternalRestControllerGeneration.g:513:4: lv_logic_0_0= ruleLogicExp
            {

            				newCompositeNode(grammarAccess.getLogicRequirementAccess().getLogicLogicExpParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_logic_0_0=ruleLogicExp();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLogicRequirementRule());
            				}
            				set(
            					current,
            					"logic",
            					lv_logic_0_0,
            					"sdu.mdsd.restful.RestControllerGeneration.LogicExp");
            				afterParserOrEnumRuleCall();
            			

            }


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
    // $ANTLR end "ruleLogicRequirement"


    // $ANTLR start "entryRuleExternalUse"
    // InternalRestControllerGeneration.g:533:1: entryRuleExternalUse returns [EObject current=null] : iv_ruleExternalUse= ruleExternalUse EOF ;
    public final EObject entryRuleExternalUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalUse = null;


        try {
            // InternalRestControllerGeneration.g:533:52: (iv_ruleExternalUse= ruleExternalUse EOF )
            // InternalRestControllerGeneration.g:534:2: iv_ruleExternalUse= ruleExternalUse EOF
            {
             newCompositeNode(grammarAccess.getExternalUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalUse=ruleExternalUse();

            state._fsp--;

             current =iv_ruleExternalUse; 
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
    // $ANTLR end "entryRuleExternalUse"


    // $ANTLR start "ruleExternalUse"
    // InternalRestControllerGeneration.g:540:1: ruleExternalUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleExternalUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:546:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:547:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRestControllerGeneration.g:547:2: ( (otherlv_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:548:3: (otherlv_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:548:3: (otherlv_0= RULE_ID )
            // InternalRestControllerGeneration.g:549:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExternalUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getExternalUseAccess().getExternalExternalDefCrossReference_0());
            			

            }


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
    // $ANTLR end "ruleExternalUse"


    // $ANTLR start "entryRuleExternalUseOfAttribute"
    // InternalRestControllerGeneration.g:563:1: entryRuleExternalUseOfAttribute returns [EObject current=null] : iv_ruleExternalUseOfAttribute= ruleExternalUseOfAttribute EOF ;
    public final EObject entryRuleExternalUseOfAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalUseOfAttribute = null;


        try {
            // InternalRestControllerGeneration.g:563:63: (iv_ruleExternalUseOfAttribute= ruleExternalUseOfAttribute EOF )
            // InternalRestControllerGeneration.g:564:2: iv_ruleExternalUseOfAttribute= ruleExternalUseOfAttribute EOF
            {
             newCompositeNode(grammarAccess.getExternalUseOfAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalUseOfAttribute=ruleExternalUseOfAttribute();

            state._fsp--;

             current =iv_ruleExternalUseOfAttribute; 
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
    // $ANTLR end "entryRuleExternalUseOfAttribute"


    // $ANTLR start "ruleExternalUseOfAttribute"
    // InternalRestControllerGeneration.g:570:1: ruleExternalUseOfAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleExternalUseOfAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:576:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:577:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:577:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:578:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'of' ( (otherlv_2= RULE_ID ) )
            {
            // InternalRestControllerGeneration.g:578:3: ( (otherlv_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:579:4: (otherlv_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:579:4: (otherlv_0= RULE_ID )
            // InternalRestControllerGeneration.g:580:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalUseOfAttributeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalUseOfAttributeAccess().getExternalExternalDefCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalUseOfAttributeAccess().getOfKeyword_1());
            		
            // InternalRestControllerGeneration.g:595:3: ( (otherlv_2= RULE_ID ) )
            // InternalRestControllerGeneration.g:596:4: (otherlv_2= RULE_ID )
            {
            // InternalRestControllerGeneration.g:596:4: (otherlv_2= RULE_ID )
            // InternalRestControllerGeneration.g:597:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalUseOfAttributeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getExternalUseOfAttributeAccess().getAttributeAttributeCrossReference_2_0());
            				

            }


            }


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
    // $ANTLR end "ruleExternalUseOfAttribute"


    // $ANTLR start "entryRuleRequirement"
    // InternalRestControllerGeneration.g:612:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalRestControllerGeneration.g:612:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalRestControllerGeneration.g:613:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
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
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalRestControllerGeneration.g:619:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'require' ( ( (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute ) ) ) ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_requirement_1_1 = null;

        EObject lv_requirement_1_2 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:625:2: ( (otherlv_0= 'require' ( ( (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute ) ) ) ) )
            // InternalRestControllerGeneration.g:626:2: (otherlv_0= 'require' ( ( (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute ) ) ) )
            {
            // InternalRestControllerGeneration.g:626:2: (otherlv_0= 'require' ( ( (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute ) ) ) )
            // InternalRestControllerGeneration.g:627:3: otherlv_0= 'require' ( ( (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute ) ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequireKeyword_0());
            		
            // InternalRestControllerGeneration.g:631:3: ( ( (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute ) ) )
            // InternalRestControllerGeneration.g:632:4: ( (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute ) )
            {
            // InternalRestControllerGeneration.g:632:4: ( (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute ) )
            // InternalRestControllerGeneration.g:633:5: (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute )
            {
            // InternalRestControllerGeneration.g:633:5: (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=24 && LA8_1<=32)) ) {
                    alt8=1;
                }
                else if ( (LA8_1==20) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_INT||LA8_0==33) ) {
                alt8=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRestControllerGeneration.g:634:6: lv_requirement_1_1= ruleLogicRequirement
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getRequirementLogicRequirementParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_requirement_1_1=ruleLogicRequirement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"requirement",
                    							lv_requirement_1_1,
                    							"sdu.mdsd.restful.RestControllerGeneration.LogicRequirement");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalRestControllerGeneration.g:650:6: lv_requirement_1_2= ruleExternalUseOfAttribute
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getRequirementExternalUseOfAttributeParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_requirement_1_2=ruleExternalUseOfAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"requirement",
                    							lv_requirement_1_2,
                    							"sdu.mdsd.restful.RestControllerGeneration.ExternalUseOfAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


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
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleLogicExp"
    // InternalRestControllerGeneration.g:672:1: entryRuleLogicExp returns [EObject current=null] : iv_ruleLogicExp= ruleLogicExp EOF ;
    public final EObject entryRuleLogicExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicExp = null;


        try {
            // InternalRestControllerGeneration.g:672:49: (iv_ruleLogicExp= ruleLogicExp EOF )
            // InternalRestControllerGeneration.g:673:2: iv_ruleLogicExp= ruleLogicExp EOF
            {
             newCompositeNode(grammarAccess.getLogicExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicExp=ruleLogicExp();

            state._fsp--;

             current =iv_ruleLogicExp; 
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
    // $ANTLR end "entryRuleLogicExp"


    // $ANTLR start "ruleLogicExp"
    // InternalRestControllerGeneration.g:679:1: ruleLogicExp returns [EObject current=null] : (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleLogicExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Conjunction_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:685:2: ( (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // InternalRestControllerGeneration.g:686:2: (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // InternalRestControllerGeneration.g:686:2: (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* )
            // InternalRestControllerGeneration.g:687:3: this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicExpAccess().getConjunctionParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;


            			current = this_Conjunction_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRestControllerGeneration.g:695:3: (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:696:4: otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLogicExpAccess().getVerticalLineVerticalLineKeyword_1_0());
            	    			
            	    // InternalRestControllerGeneration.g:700:4: ()
            	    // InternalRestControllerGeneration.g:701:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getLogicExpAccess().getDisjunctionLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRestControllerGeneration.g:707:4: ( (lv_right_3_0= ruleConjunction ) )
            	    // InternalRestControllerGeneration.g:708:5: (lv_right_3_0= ruleConjunction )
            	    {
            	    // InternalRestControllerGeneration.g:708:5: (lv_right_3_0= ruleConjunction )
            	    // InternalRestControllerGeneration.g:709:6: lv_right_3_0= ruleConjunction
            	    {

            	    						newCompositeNode(grammarAccess.getLogicExpAccess().getRightConjunctionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_right_3_0=ruleConjunction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"sdu.mdsd.restful.RestControllerGeneration.Conjunction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


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
    // $ANTLR end "ruleLogicExp"


    // $ANTLR start "entryRuleConjunction"
    // InternalRestControllerGeneration.g:731:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // InternalRestControllerGeneration.g:731:52: (iv_ruleConjunction= ruleConjunction EOF )
            // InternalRestControllerGeneration.g:732:2: iv_ruleConjunction= ruleConjunction EOF
            {
             newCompositeNode(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;

             current =iv_ruleConjunction; 
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
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // InternalRestControllerGeneration.g:738:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:744:2: ( (this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalRestControllerGeneration.g:745:2: (this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalRestControllerGeneration.g:745:2: (this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalRestControllerGeneration.g:746:3: this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRestControllerGeneration.g:754:3: (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:755:4: otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConjunctionAccess().getAmpersandAmpersandKeyword_1_0());
            	    			
            	    // InternalRestControllerGeneration.g:759:4: ()
            	    // InternalRestControllerGeneration.g:760:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRestControllerGeneration.g:766:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalRestControllerGeneration.g:767:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalRestControllerGeneration.g:767:5: (lv_right_3_0= ruleComparison )
            	    // InternalRestControllerGeneration.g:768:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConjunctionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"sdu.mdsd.restful.RestControllerGeneration.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleComparison"
    // InternalRestControllerGeneration.g:790:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalRestControllerGeneration.g:790:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalRestControllerGeneration.g:791:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalRestControllerGeneration.g:797:1: ruleComparison returns [EObject current=null] : ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:803:2: ( ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) ) ) )
            // InternalRestControllerGeneration.g:804:2: ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) ) )
            {
            // InternalRestControllerGeneration.g:804:2: ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) ) )
            // InternalRestControllerGeneration.g:805:3: ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) )
            {
            // InternalRestControllerGeneration.g:805:3: ( (lv_left_0_0= ruleExp ) )
            // InternalRestControllerGeneration.g:806:4: (lv_left_0_0= ruleExp )
            {
            // InternalRestControllerGeneration.g:806:4: (lv_left_0_0= ruleExp )
            // InternalRestControllerGeneration.g:807:5: lv_left_0_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getLeftExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_left_0_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"sdu.mdsd.restful.RestControllerGeneration.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRestControllerGeneration.g:824:3: ( (lv_op_1_0= ruleRelationalOp ) )
            // InternalRestControllerGeneration.g:825:4: (lv_op_1_0= ruleRelationalOp )
            {
            // InternalRestControllerGeneration.g:825:4: (lv_op_1_0= ruleRelationalOp )
            // InternalRestControllerGeneration.g:826:5: lv_op_1_0= ruleRelationalOp
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getOpRelationalOpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_op_1_0=ruleRelationalOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"sdu.mdsd.restful.RestControllerGeneration.RelationalOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRestControllerGeneration.g:843:3: ( (lv_right_2_0= ruleExp ) )
            // InternalRestControllerGeneration.g:844:4: (lv_right_2_0= ruleExp )
            {
            // InternalRestControllerGeneration.g:844:4: (lv_right_2_0= ruleExp )
            // InternalRestControllerGeneration.g:845:5: lv_right_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getRightExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"sdu.mdsd.restful.RestControllerGeneration.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleRelationalOp"
    // InternalRestControllerGeneration.g:866:1: entryRuleRelationalOp returns [EObject current=null] : iv_ruleRelationalOp= ruleRelationalOp EOF ;
    public final EObject entryRuleRelationalOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalOp = null;


        try {
            // InternalRestControllerGeneration.g:866:53: (iv_ruleRelationalOp= ruleRelationalOp EOF )
            // InternalRestControllerGeneration.g:867:2: iv_ruleRelationalOp= ruleRelationalOp EOF
            {
             newCompositeNode(grammarAccess.getRelationalOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalOp=ruleRelationalOp();

            state._fsp--;

             current =iv_ruleRelationalOp; 
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
    // $ANTLR end "entryRuleRelationalOp"


    // $ANTLR start "ruleRelationalOp"
    // InternalRestControllerGeneration.g:873:1: ruleRelationalOp returns [EObject current=null] : ( ( () otherlv_1= '=' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '>=' ) ) ;
    public final EObject ruleRelationalOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:879:2: ( ( ( () otherlv_1= '=' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '>=' ) ) )
            // InternalRestControllerGeneration.g:880:2: ( ( () otherlv_1= '=' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '>=' ) )
            {
            // InternalRestControllerGeneration.g:880:2: ( ( () otherlv_1= '=' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '>=' ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
                }
                break;
            case 28:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRestControllerGeneration.g:881:3: ( () otherlv_1= '=' )
                    {
                    // InternalRestControllerGeneration.g:881:3: ( () otherlv_1= '=' )
                    // InternalRestControllerGeneration.g:882:4: () otherlv_1= '='
                    {
                    // InternalRestControllerGeneration.g:882:4: ()
                    // InternalRestControllerGeneration.g:883:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelEQAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationalOpAccess().getEqualsSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRestControllerGeneration.g:895:3: ( () otherlv_3= '<' )
                    {
                    // InternalRestControllerGeneration.g:895:3: ( () otherlv_3= '<' )
                    // InternalRestControllerGeneration.g:896:4: () otherlv_3= '<'
                    {
                    // InternalRestControllerGeneration.g:896:4: ()
                    // InternalRestControllerGeneration.g:897:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelLTAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelationalOpAccess().getLessThanSignKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRestControllerGeneration.g:909:3: ( () otherlv_5= '>' )
                    {
                    // InternalRestControllerGeneration.g:909:3: ( () otherlv_5= '>' )
                    // InternalRestControllerGeneration.g:910:4: () otherlv_5= '>'
                    {
                    // InternalRestControllerGeneration.g:910:4: ()
                    // InternalRestControllerGeneration.g:911:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelGTAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getRelationalOpAccess().getGreaterThanSignKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRestControllerGeneration.g:923:3: ( () otherlv_7= '<=' )
                    {
                    // InternalRestControllerGeneration.g:923:3: ( () otherlv_7= '<=' )
                    // InternalRestControllerGeneration.g:924:4: () otherlv_7= '<='
                    {
                    // InternalRestControllerGeneration.g:924:4: ()
                    // InternalRestControllerGeneration.g:925:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelLTEAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getRelationalOpAccess().getLessThanSignEqualsSignKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRestControllerGeneration.g:937:3: ( () otherlv_9= '>=' )
                    {
                    // InternalRestControllerGeneration.g:937:3: ( () otherlv_9= '>=' )
                    // InternalRestControllerGeneration.g:938:4: () otherlv_9= '>='
                    {
                    // InternalRestControllerGeneration.g:938:4: ()
                    // InternalRestControllerGeneration.g:939:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelGTEAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getRelationalOpAccess().getGreaterThanSignEqualsSignKeyword_4_1());
                    			

                    }


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
    // $ANTLR end "ruleRelationalOp"


    // $ANTLR start "entryRuleExp"
    // InternalRestControllerGeneration.g:954:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalRestControllerGeneration.g:954:44: (iv_ruleExp= ruleExp EOF )
            // InternalRestControllerGeneration.g:955:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalRestControllerGeneration.g:961:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:967:2: ( (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalRestControllerGeneration.g:968:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalRestControllerGeneration.g:968:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalRestControllerGeneration.g:969:3: this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRestControllerGeneration.g:977:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=29 && LA13_0<=30)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:978:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalRestControllerGeneration.g:978:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==29) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==30) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalRestControllerGeneration.g:979:5: (otherlv_1= '+' () )
            	            {
            	            // InternalRestControllerGeneration.g:979:5: (otherlv_1= '+' () )
            	            // InternalRestControllerGeneration.g:980:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,29,FOLLOW_11); 

            	            						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalRestControllerGeneration.g:984:6: ()
            	            // InternalRestControllerGeneration.g:985:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getAddLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRestControllerGeneration.g:993:5: (otherlv_3= '-' () )
            	            {
            	            // InternalRestControllerGeneration.g:993:5: (otherlv_3= '-' () )
            	            // InternalRestControllerGeneration.g:994:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,30,FOLLOW_11); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalRestControllerGeneration.g:998:6: ()
            	            // InternalRestControllerGeneration.g:999:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getSubLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRestControllerGeneration.g:1007:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalRestControllerGeneration.g:1008:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalRestControllerGeneration.g:1008:5: (lv_right_5_0= ruleFactor )
            	    // InternalRestControllerGeneration.g:1009:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"sdu.mdsd.restful.RestControllerGeneration.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalRestControllerGeneration.g:1031:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalRestControllerGeneration.g:1031:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalRestControllerGeneration.g:1032:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalRestControllerGeneration.g:1038:1: ruleFactor returns [EObject current=null] : (this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primitive_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1044:2: ( (this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )* ) )
            // InternalRestControllerGeneration.g:1045:2: (this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )* )
            {
            // InternalRestControllerGeneration.g:1045:2: (this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )* )
            // InternalRestControllerGeneration.g:1046:3: this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimitiveParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Primitive_0=rulePrimitive();

            state._fsp--;


            			current = this_Primitive_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRestControllerGeneration.g:1054:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=31 && LA15_0<=32)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:1055:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) )
            	    {
            	    // InternalRestControllerGeneration.g:1055:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==31) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==32) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalRestControllerGeneration.g:1056:5: (otherlv_1= '*' () )
            	            {
            	            // InternalRestControllerGeneration.g:1056:5: (otherlv_1= '*' () )
            	            // InternalRestControllerGeneration.g:1057:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,31,FOLLOW_11); 

            	            						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalRestControllerGeneration.g:1061:6: ()
            	            // InternalRestControllerGeneration.g:1062:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMulLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRestControllerGeneration.g:1070:5: (otherlv_3= '/' () )
            	            {
            	            // InternalRestControllerGeneration.g:1070:5: (otherlv_3= '/' () )
            	            // InternalRestControllerGeneration.g:1071:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,32,FOLLOW_11); 

            	            						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalRestControllerGeneration.g:1075:6: ()
            	            // InternalRestControllerGeneration.g:1076:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRestControllerGeneration.g:1084:4: ( (lv_right_5_0= rulePrimitive ) )
            	    // InternalRestControllerGeneration.g:1085:5: (lv_right_5_0= rulePrimitive )
            	    {
            	    // InternalRestControllerGeneration.g:1085:5: (lv_right_5_0= rulePrimitive )
            	    // InternalRestControllerGeneration.g:1086:6: lv_right_5_0= rulePrimitive
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimitiveParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_5_0=rulePrimitive();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"sdu.mdsd.restful.RestControllerGeneration.Primitive");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimitive"
    // InternalRestControllerGeneration.g:1108:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalRestControllerGeneration.g:1108:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalRestControllerGeneration.g:1109:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalRestControllerGeneration.g:1115:1: rulePrimitive returns [EObject current=null] : (this_Name_0= ruleName | this_IntExp_1= ruleIntExp | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Name_0 = null;

        EObject this_IntExp_1 = null;

        EObject this_Exp_3 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1121:2: ( (this_Name_0= ruleName | this_IntExp_1= ruleIntExp | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) ) )
            // InternalRestControllerGeneration.g:1122:2: (this_Name_0= ruleName | this_IntExp_1= ruleIntExp | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) )
            {
            // InternalRestControllerGeneration.g:1122:2: (this_Name_0= ruleName | this_IntExp_1= ruleIntExp | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt16=1;
                }
                break;
            case RULE_INT:
                {
                alt16=2;
                }
                break;
            case 33:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalRestControllerGeneration.g:1123:3: this_Name_0= ruleName
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Name_0=ruleName();

                    state._fsp--;


                    			current = this_Name_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRestControllerGeneration.g:1132:3: this_IntExp_1= ruleIntExp
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getIntExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntExp_1=ruleIntExp();

                    state._fsp--;


                    			current = this_IntExp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRestControllerGeneration.g:1141:3: (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' )
                    {
                    // InternalRestControllerGeneration.g:1141:3: (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' )
                    // InternalRestControllerGeneration.g:1142:4: otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimitiveAccess().getExpParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_18);
                    this_Exp_3=ruleExp();

                    state._fsp--;


                    				current = this_Exp_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleName"
    // InternalRestControllerGeneration.g:1163:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalRestControllerGeneration.g:1163:45: (iv_ruleName= ruleName EOF )
            // InternalRestControllerGeneration.g:1164:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalRestControllerGeneration.g:1170:1: ruleName returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1176:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1177:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRestControllerGeneration.g:1177:2: ( (otherlv_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:1178:3: (otherlv_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1178:3: (otherlv_0= RULE_ID )
            // InternalRestControllerGeneration.g:1179:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNameRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getNameAccess().getVarNameAttributeCrossReference_0());
            			

            }


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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleIntExp"
    // InternalRestControllerGeneration.g:1193:1: entryRuleIntExp returns [EObject current=null] : iv_ruleIntExp= ruleIntExp EOF ;
    public final EObject entryRuleIntExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExp = null;


        try {
            // InternalRestControllerGeneration.g:1193:47: (iv_ruleIntExp= ruleIntExp EOF )
            // InternalRestControllerGeneration.g:1194:2: iv_ruleIntExp= ruleIntExp EOF
            {
             newCompositeNode(grammarAccess.getIntExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntExp=ruleIntExp();

            state._fsp--;

             current =iv_ruleIntExp; 
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
    // $ANTLR end "entryRuleIntExp"


    // $ANTLR start "ruleIntExp"
    // InternalRestControllerGeneration.g:1200:1: ruleIntExp returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntExp() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1206:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRestControllerGeneration.g:1207:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRestControllerGeneration.g:1207:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalRestControllerGeneration.g:1208:3: (lv_value_0_0= RULE_INT )
            {
            // InternalRestControllerGeneration.g:1208:3: (lv_value_0_0= RULE_INT )
            // InternalRestControllerGeneration.g:1209:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntExpAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntExpRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


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
    // $ANTLR end "ruleIntExp"


    // $ANTLR start "entryRuleController"
    // InternalRestControllerGeneration.g:1228:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalRestControllerGeneration.g:1228:51: (iv_ruleController= ruleController EOF )
            // InternalRestControllerGeneration.g:1229:2: iv_ruleController= ruleController EOF
            {
             newCompositeNode(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleController=ruleController();

            state._fsp--;

             current =iv_ruleController; 
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
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // InternalRestControllerGeneration.g:1235:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_methods_7_0= ruleMethodDef ) )* otherlv_8= '}' ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_methods_7_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1241:2: ( (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_methods_7_0= ruleMethodDef ) )* otherlv_8= '}' ) )
            // InternalRestControllerGeneration.g:1242:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_methods_7_0= ruleMethodDef ) )* otherlv_8= '}' )
            {
            // InternalRestControllerGeneration.g:1242:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_methods_7_0= ruleMethodDef ) )* otherlv_8= '}' )
            // InternalRestControllerGeneration.g:1243:3: otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_methods_7_0= ruleMethodDef ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            // InternalRestControllerGeneration.g:1247:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:1248:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1248:4: (lv_name_1_0= RULE_ID )
            // InternalRestControllerGeneration.g:1249:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getControllerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRestControllerGeneration.g:1265:3: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRestControllerGeneration.g:1266:4: otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getColonKeyword_2_0());
                    			
                    // InternalRestControllerGeneration.g:1270:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRestControllerGeneration.g:1271:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRestControllerGeneration.g:1271:5: (otherlv_3= RULE_ID )
                    // InternalRestControllerGeneration.g:1272:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getControllerRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getSuperControllerCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getControllerAccess().getUsesKeyword_3());
            		
            // InternalRestControllerGeneration.g:1288:3: ( (otherlv_5= RULE_ID ) )
            // InternalRestControllerGeneration.g:1289:4: (otherlv_5= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1289:4: (otherlv_5= RULE_ID )
            // InternalRestControllerGeneration.g:1290:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getEntityEntityCrossReference_4_0());
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalRestControllerGeneration.g:1305:3: ( (lv_methods_7_0= ruleMethodDef ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37||LA18_0==41||(LA18_0>=43 && LA18_0<=45)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:1306:4: (lv_methods_7_0= ruleMethodDef )
            	    {
            	    // InternalRestControllerGeneration.g:1306:4: (lv_methods_7_0= ruleMethodDef )
            	    // InternalRestControllerGeneration.g:1307:5: lv_methods_7_0= ruleMethodDef
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getMethodsMethodDefParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_methods_7_0=ruleMethodDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methods",
            	    						lv_methods_7_0,
            	    						"sdu.mdsd.restful.RestControllerGeneration.MethodDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleMethodDef"
    // InternalRestControllerGeneration.g:1332:1: entryRuleMethodDef returns [EObject current=null] : iv_ruleMethodDef= ruleMethodDef EOF ;
    public final EObject entryRuleMethodDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDef = null;


        try {
            // InternalRestControllerGeneration.g:1332:50: (iv_ruleMethodDef= ruleMethodDef EOF )
            // InternalRestControllerGeneration.g:1333:2: iv_ruleMethodDef= ruleMethodDef EOF
            {
             newCompositeNode(grammarAccess.getMethodDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodDef=ruleMethodDef();

            state._fsp--;

             current =iv_ruleMethodDef; 
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
    // $ANTLR end "entryRuleMethodDef"


    // $ANTLR start "ruleMethodDef"
    // InternalRestControllerGeneration.g:1339:1: ruleMethodDef returns [EObject current=null] : this_MethodType_0= ruleMethodType ;
    public final EObject ruleMethodDef() throws RecognitionException {
        EObject current = null;

        EObject this_MethodType_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1345:2: (this_MethodType_0= ruleMethodType )
            // InternalRestControllerGeneration.g:1346:2: this_MethodType_0= ruleMethodType
            {

            		newCompositeNode(grammarAccess.getMethodDefAccess().getMethodTypeParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_MethodType_0=ruleMethodType();

            state._fsp--;


            		current = this_MethodType_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleMethodDef"


    // $ANTLR start "entryRuleMethodType"
    // InternalRestControllerGeneration.g:1357:1: entryRuleMethodType returns [EObject current=null] : iv_ruleMethodType= ruleMethodType EOF ;
    public final EObject entryRuleMethodType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodType = null;


        try {
            // InternalRestControllerGeneration.g:1357:51: (iv_ruleMethodType= ruleMethodType EOF )
            // InternalRestControllerGeneration.g:1358:2: iv_ruleMethodType= ruleMethodType EOF
            {
             newCompositeNode(grammarAccess.getMethodTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodType=ruleMethodType();

            state._fsp--;

             current =iv_ruleMethodType; 
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
    // $ANTLR end "entryRuleMethodType"


    // $ANTLR start "ruleMethodType"
    // InternalRestControllerGeneration.g:1364:1: ruleMethodType returns [EObject current=null] : (this_CreateMethod_0= ruleCreateMethod | this_GetMethod_1= ruleGetMethod | this_ListMethod_2= ruleListMethod | this_UpdateMethod_3= ruleUpdateMethod | this_DeleteMethod_4= ruleDeleteMethod ) ;
    public final EObject ruleMethodType() throws RecognitionException {
        EObject current = null;

        EObject this_CreateMethod_0 = null;

        EObject this_GetMethod_1 = null;

        EObject this_ListMethod_2 = null;

        EObject this_UpdateMethod_3 = null;

        EObject this_DeleteMethod_4 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1370:2: ( (this_CreateMethod_0= ruleCreateMethod | this_GetMethod_1= ruleGetMethod | this_ListMethod_2= ruleListMethod | this_UpdateMethod_3= ruleUpdateMethod | this_DeleteMethod_4= ruleDeleteMethod ) )
            // InternalRestControllerGeneration.g:1371:2: (this_CreateMethod_0= ruleCreateMethod | this_GetMethod_1= ruleGetMethod | this_ListMethod_2= ruleListMethod | this_UpdateMethod_3= ruleUpdateMethod | this_DeleteMethod_4= ruleDeleteMethod )
            {
            // InternalRestControllerGeneration.g:1371:2: (this_CreateMethod_0= ruleCreateMethod | this_GetMethod_1= ruleGetMethod | this_ListMethod_2= ruleListMethod | this_UpdateMethod_3= ruleUpdateMethod | this_DeleteMethod_4= ruleDeleteMethod )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt19=1;
                }
                break;
            case 41:
                {
                alt19=2;
                }
                break;
            case 43:
                {
                alt19=3;
                }
                break;
            case 44:
                {
                alt19=4;
                }
                break;
            case 45:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalRestControllerGeneration.g:1372:3: this_CreateMethod_0= ruleCreateMethod
                    {

                    			newCompositeNode(grammarAccess.getMethodTypeAccess().getCreateMethodParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreateMethod_0=ruleCreateMethod();

                    state._fsp--;


                    			current = this_CreateMethod_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRestControllerGeneration.g:1381:3: this_GetMethod_1= ruleGetMethod
                    {

                    			newCompositeNode(grammarAccess.getMethodTypeAccess().getGetMethodParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetMethod_1=ruleGetMethod();

                    state._fsp--;


                    			current = this_GetMethod_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRestControllerGeneration.g:1390:3: this_ListMethod_2= ruleListMethod
                    {

                    			newCompositeNode(grammarAccess.getMethodTypeAccess().getListMethodParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListMethod_2=ruleListMethod();

                    state._fsp--;


                    			current = this_ListMethod_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRestControllerGeneration.g:1399:3: this_UpdateMethod_3= ruleUpdateMethod
                    {

                    			newCompositeNode(grammarAccess.getMethodTypeAccess().getUpdateMethodParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_UpdateMethod_3=ruleUpdateMethod();

                    state._fsp--;


                    			current = this_UpdateMethod_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRestControllerGeneration.g:1408:3: this_DeleteMethod_4= ruleDeleteMethod
                    {

                    			newCompositeNode(grammarAccess.getMethodTypeAccess().getDeleteMethodParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeleteMethod_4=ruleDeleteMethod();

                    state._fsp--;


                    			current = this_DeleteMethod_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleMethodType"


    // $ANTLR start "entryRuleCreateMethod"
    // InternalRestControllerGeneration.g:1420:1: entryRuleCreateMethod returns [EObject current=null] : iv_ruleCreateMethod= ruleCreateMethod EOF ;
    public final EObject entryRuleCreateMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateMethod = null;


        try {
            // InternalRestControllerGeneration.g:1420:53: (iv_ruleCreateMethod= ruleCreateMethod EOF )
            // InternalRestControllerGeneration.g:1421:2: iv_ruleCreateMethod= ruleCreateMethod EOF
            {
             newCompositeNode(grammarAccess.getCreateMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateMethod=ruleCreateMethod();

            state._fsp--;

             current =iv_ruleCreateMethod; 
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
    // $ANTLR end "entryRuleCreateMethod"


    // $ANTLR start "ruleCreateMethod"
    // InternalRestControllerGeneration.g:1427:1: ruleCreateMethod returns [EObject current=null] : ( () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )? ) ;
    public final EObject ruleCreateMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_withEntity_2_0 = null;

        EObject lv_exclude_3_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1433:2: ( ( () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )? ) )
            // InternalRestControllerGeneration.g:1434:2: ( () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )? )
            {
            // InternalRestControllerGeneration.g:1434:2: ( () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )? )
            // InternalRestControllerGeneration.g:1435:3: () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )?
            {
            // InternalRestControllerGeneration.g:1435:3: ()
            // InternalRestControllerGeneration.g:1436:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCreateMethodAccess().getCreateMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateMethodAccess().getCREATEKeyword_1());
            		
            // InternalRestControllerGeneration.g:1446:3: ( (lv_withEntity_2_0= ruleCreateMethodWith ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRestControllerGeneration.g:1447:4: (lv_withEntity_2_0= ruleCreateMethodWith )
                    {
                    // InternalRestControllerGeneration.g:1447:4: (lv_withEntity_2_0= ruleCreateMethodWith )
                    // InternalRestControllerGeneration.g:1448:5: lv_withEntity_2_0= ruleCreateMethodWith
                    {

                    					newCompositeNode(grammarAccess.getCreateMethodAccess().getWithEntityCreateMethodWithParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_withEntity_2_0=ruleCreateMethodWith();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCreateMethodRule());
                    					}
                    					set(
                    						current,
                    						"withEntity",
                    						lv_withEntity_2_0,
                    						"sdu.mdsd.restful.RestControllerGeneration.CreateMethodWith");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalRestControllerGeneration.g:1465:3: ( (lv_exclude_3_0= ruleCreateMethodExclude ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRestControllerGeneration.g:1466:4: (lv_exclude_3_0= ruleCreateMethodExclude )
                    {
                    // InternalRestControllerGeneration.g:1466:4: (lv_exclude_3_0= ruleCreateMethodExclude )
                    // InternalRestControllerGeneration.g:1467:5: lv_exclude_3_0= ruleCreateMethodExclude
                    {

                    					newCompositeNode(grammarAccess.getCreateMethodAccess().getExcludeCreateMethodExcludeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_exclude_3_0=ruleCreateMethodExclude();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCreateMethodRule());
                    					}
                    					set(
                    						current,
                    						"exclude",
                    						lv_exclude_3_0,
                    						"sdu.mdsd.restful.RestControllerGeneration.CreateMethodExclude");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleCreateMethod"


    // $ANTLR start "entryRuleCreateMethodWith"
    // InternalRestControllerGeneration.g:1488:1: entryRuleCreateMethodWith returns [EObject current=null] : iv_ruleCreateMethodWith= ruleCreateMethodWith EOF ;
    public final EObject entryRuleCreateMethodWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateMethodWith = null;


        try {
            // InternalRestControllerGeneration.g:1488:57: (iv_ruleCreateMethodWith= ruleCreateMethodWith EOF )
            // InternalRestControllerGeneration.g:1489:2: iv_ruleCreateMethodWith= ruleCreateMethodWith EOF
            {
             newCompositeNode(grammarAccess.getCreateMethodWithRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateMethodWith=ruleCreateMethodWith();

            state._fsp--;

             current =iv_ruleCreateMethodWith; 
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
    // $ANTLR end "entryRuleCreateMethodWith"


    // $ANTLR start "ruleCreateMethodWith"
    // InternalRestControllerGeneration.g:1495:1: ruleCreateMethodWith returns [EObject current=null] : (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleCreateMethodWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1501:2: ( (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:1502:2: (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:1502:2: (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1503:3: otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateMethodWithAccess().getWithKeyword_0());
            		
            // InternalRestControllerGeneration.g:1507:3: ( (otherlv_1= RULE_ID ) )
            // InternalRestControllerGeneration.g:1508:4: (otherlv_1= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1508:4: (otherlv_1= RULE_ID )
            // InternalRestControllerGeneration.g:1509:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateMethodWithRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_1, grammarAccess.getCreateMethodWithAccess().getEntityEntityCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateMethodWithAccess().getColonKeyword_2());
            		
            // InternalRestControllerGeneration.g:1524:3: ( (otherlv_3= RULE_ID ) )
            // InternalRestControllerGeneration.g:1525:4: (otherlv_3= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1525:4: (otherlv_3= RULE_ID )
            // InternalRestControllerGeneration.g:1526:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateMethodWithRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getCreateMethodWithAccess().getEntityIdAttributeCrossReference_3_0());
            				

            }


            }


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
    // $ANTLR end "ruleCreateMethodWith"


    // $ANTLR start "entryRuleCreateMethodExclude"
    // InternalRestControllerGeneration.g:1541:1: entryRuleCreateMethodExclude returns [EObject current=null] : iv_ruleCreateMethodExclude= ruleCreateMethodExclude EOF ;
    public final EObject entryRuleCreateMethodExclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateMethodExclude = null;


        try {
            // InternalRestControllerGeneration.g:1541:60: (iv_ruleCreateMethodExclude= ruleCreateMethodExclude EOF )
            // InternalRestControllerGeneration.g:1542:2: iv_ruleCreateMethodExclude= ruleCreateMethodExclude EOF
            {
             newCompositeNode(grammarAccess.getCreateMethodExcludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateMethodExclude=ruleCreateMethodExclude();

            state._fsp--;

             current =iv_ruleCreateMethodExclude; 
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
    // $ANTLR end "entryRuleCreateMethodExclude"


    // $ANTLR start "ruleCreateMethodExclude"
    // InternalRestControllerGeneration.g:1548:1: ruleCreateMethodExclude returns [EObject current=null] : (otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleCreateMethodExclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1554:2: ( (otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalRestControllerGeneration.g:1555:2: (otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalRestControllerGeneration.g:1555:2: (otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalRestControllerGeneration.g:1556:3: otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateMethodExcludeAccess().getExcludeKeyword_0());
            		
            // InternalRestControllerGeneration.g:1560:3: ( (otherlv_1= RULE_ID ) )
            // InternalRestControllerGeneration.g:1561:4: (otherlv_1= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1561:4: (otherlv_1= RULE_ID )
            // InternalRestControllerGeneration.g:1562:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateMethodExcludeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_1, grammarAccess.getCreateMethodExcludeAccess().getAttributesAttributeCrossReference_1_0());
            				

            }


            }

            // InternalRestControllerGeneration.g:1573:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==40) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:1574:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,40,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getCreateMethodExcludeAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalRestControllerGeneration.g:1578:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalRestControllerGeneration.g:1579:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalRestControllerGeneration.g:1579:5: (otherlv_3= RULE_ID )
            	    // InternalRestControllerGeneration.g:1580:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCreateMethodExcludeRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_3, grammarAccess.getCreateMethodExcludeAccess().getAttributesAttributeCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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
    // $ANTLR end "ruleCreateMethodExclude"


    // $ANTLR start "entryRuleGetMethod"
    // InternalRestControllerGeneration.g:1596:1: entryRuleGetMethod returns [EObject current=null] : iv_ruleGetMethod= ruleGetMethod EOF ;
    public final EObject entryRuleGetMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetMethod = null;


        try {
            // InternalRestControllerGeneration.g:1596:50: (iv_ruleGetMethod= ruleGetMethod EOF )
            // InternalRestControllerGeneration.g:1597:2: iv_ruleGetMethod= ruleGetMethod EOF
            {
             newCompositeNode(grammarAccess.getGetMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetMethod=ruleGetMethod();

            state._fsp--;

             current =iv_ruleGetMethod; 
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
    // $ANTLR end "entryRuleGetMethod"


    // $ANTLR start "ruleGetMethod"
    // InternalRestControllerGeneration.g:1603:1: ruleGetMethod returns [EObject current=null] : (otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleGetMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1609:2: ( (otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:1610:2: (otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:1610:2: (otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1611:3: otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getGetMethodAccess().getGETKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGetMethodAccess().getOnKeyword_1());
            		
            // InternalRestControllerGeneration.g:1619:3: ( (otherlv_2= RULE_ID ) )
            // InternalRestControllerGeneration.g:1620:4: (otherlv_2= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1620:4: (otherlv_2= RULE_ID )
            // InternalRestControllerGeneration.g:1621:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetMethodRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getGetMethodAccess().getEntityIdAttributeCrossReference_2_0());
            				

            }


            }


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
    // $ANTLR end "ruleGetMethod"


    // $ANTLR start "entryRuleListMethod"
    // InternalRestControllerGeneration.g:1636:1: entryRuleListMethod returns [EObject current=null] : iv_ruleListMethod= ruleListMethod EOF ;
    public final EObject entryRuleListMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListMethod = null;


        try {
            // InternalRestControllerGeneration.g:1636:51: (iv_ruleListMethod= ruleListMethod EOF )
            // InternalRestControllerGeneration.g:1637:2: iv_ruleListMethod= ruleListMethod EOF
            {
             newCompositeNode(grammarAccess.getListMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListMethod=ruleListMethod();

            state._fsp--;

             current =iv_ruleListMethod; 
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
    // $ANTLR end "entryRuleListMethod"


    // $ANTLR start "ruleListMethod"
    // InternalRestControllerGeneration.g:1643:1: ruleListMethod returns [EObject current=null] : ( () otherlv_1= 'LIST' ) ;
    public final EObject ruleListMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1649:2: ( ( () otherlv_1= 'LIST' ) )
            // InternalRestControllerGeneration.g:1650:2: ( () otherlv_1= 'LIST' )
            {
            // InternalRestControllerGeneration.g:1650:2: ( () otherlv_1= 'LIST' )
            // InternalRestControllerGeneration.g:1651:3: () otherlv_1= 'LIST'
            {
            // InternalRestControllerGeneration.g:1651:3: ()
            // InternalRestControllerGeneration.g:1652:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListMethodAccess().getListMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getListMethodAccess().getLISTKeyword_1());
            		

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
    // $ANTLR end "ruleListMethod"


    // $ANTLR start "entryRuleUpdateMethod"
    // InternalRestControllerGeneration.g:1666:1: entryRuleUpdateMethod returns [EObject current=null] : iv_ruleUpdateMethod= ruleUpdateMethod EOF ;
    public final EObject entryRuleUpdateMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateMethod = null;


        try {
            // InternalRestControllerGeneration.g:1666:53: (iv_ruleUpdateMethod= ruleUpdateMethod EOF )
            // InternalRestControllerGeneration.g:1667:2: iv_ruleUpdateMethod= ruleUpdateMethod EOF
            {
             newCompositeNode(grammarAccess.getUpdateMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateMethod=ruleUpdateMethod();

            state._fsp--;

             current =iv_ruleUpdateMethod; 
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
    // $ANTLR end "entryRuleUpdateMethod"


    // $ANTLR start "ruleUpdateMethod"
    // InternalRestControllerGeneration.g:1673:1: ruleUpdateMethod returns [EObject current=null] : (otherlv_0= 'UPDATE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ) ;
    public final EObject ruleUpdateMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1679:2: ( (otherlv_0= 'UPDATE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ) )
            // InternalRestControllerGeneration.g:1680:2: (otherlv_0= 'UPDATE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )
            {
            // InternalRestControllerGeneration.g:1680:2: (otherlv_0= 'UPDATE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )
            // InternalRestControllerGeneration.g:1681:3: otherlv_0= 'UPDATE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,44,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateMethodAccess().getUPDATEKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateMethodAccess().getOnKeyword_1());
            		
            // InternalRestControllerGeneration.g:1689:3: ( (otherlv_2= RULE_ID ) )
            // InternalRestControllerGeneration.g:1690:4: (otherlv_2= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1690:4: (otherlv_2= RULE_ID )
            // InternalRestControllerGeneration.g:1691:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdateMethodRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_2, grammarAccess.getUpdateMethodAccess().getEntityIdAttributeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getUpdateMethodAccess().getWithKeyword_3());
            		
            // InternalRestControllerGeneration.g:1706:3: ( (otherlv_4= RULE_ID ) )
            // InternalRestControllerGeneration.g:1707:4: (otherlv_4= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1707:4: (otherlv_4= RULE_ID )
            // InternalRestControllerGeneration.g:1708:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdateMethodRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_4, grammarAccess.getUpdateMethodAccess().getAttributesAttributeCrossReference_4_0());
            				

            }


            }

            // InternalRestControllerGeneration.g:1719:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:1720:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,40,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getUpdateMethodAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRestControllerGeneration.g:1724:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalRestControllerGeneration.g:1725:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalRestControllerGeneration.g:1725:5: (otherlv_6= RULE_ID )
            	    // InternalRestControllerGeneration.g:1726:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUpdateMethodRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_6, grammarAccess.getUpdateMethodAccess().getAttributesAttributeCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


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
    // $ANTLR end "ruleUpdateMethod"


    // $ANTLR start "entryRuleDeleteMethod"
    // InternalRestControllerGeneration.g:1742:1: entryRuleDeleteMethod returns [EObject current=null] : iv_ruleDeleteMethod= ruleDeleteMethod EOF ;
    public final EObject entryRuleDeleteMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteMethod = null;


        try {
            // InternalRestControllerGeneration.g:1742:53: (iv_ruleDeleteMethod= ruleDeleteMethod EOF )
            // InternalRestControllerGeneration.g:1743:2: iv_ruleDeleteMethod= ruleDeleteMethod EOF
            {
             newCompositeNode(grammarAccess.getDeleteMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteMethod=ruleDeleteMethod();

            state._fsp--;

             current =iv_ruleDeleteMethod; 
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
    // $ANTLR end "entryRuleDeleteMethod"


    // $ANTLR start "ruleDeleteMethod"
    // InternalRestControllerGeneration.g:1749:1: ruleDeleteMethod returns [EObject current=null] : (otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDeleteMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1755:2: ( (otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:1756:2: (otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:1756:2: (otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1757:3: otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteMethodAccess().getDELETEKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteMethodAccess().getOnKeyword_1());
            		
            // InternalRestControllerGeneration.g:1765:3: ( (otherlv_2= RULE_ID ) )
            // InternalRestControllerGeneration.g:1766:4: (otherlv_2= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1766:4: (otherlv_2= RULE_ID )
            // InternalRestControllerGeneration.g:1767:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteMethodRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getDeleteMethodAccess().getEntityIdAttributeCrossReference_2_0());
            				

            }


            }


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
    // $ANTLR end "ruleDeleteMethod"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000080000B002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000240010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00003A2000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});

}