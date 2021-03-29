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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'type'", "'external'", "'using'", "'entity'", "':'", "'{'", "'}'", "'require'", "'||'", "'&&'", "'='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'controller'", "'uses'", "'CREATE'", "'with'", "'exclude'", "'GET'", "'on'", "'LIST'", "'UPDATE'", "','", "'DELETE'"
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

                if ( ((LA1_0>=12 && LA1_0<=13)||LA1_0==15||LA1_0==33) ) {
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
            case 33:
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
    // InternalRestControllerGeneration.g:284:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:290:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) )
            // InternalRestControllerGeneration.g:291:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            {
            // InternalRestControllerGeneration.g:291:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            // InternalRestControllerGeneration.g:292:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
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

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRestControllerGeneration.g:337:3: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:338:4: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalRestControllerGeneration.g:338:4: (lv_attributes_5_0= ruleAttribute )
            	    // InternalRestControllerGeneration.g:339:5: lv_attributes_5_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_5_0,
            	    						"sdu.mdsd.restful.RestControllerGeneration.Attribute");
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


    // $ANTLR start "entryRuleAttribute"
    // InternalRestControllerGeneration.g:364:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRestControllerGeneration.g:364:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRestControllerGeneration.g:365:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalRestControllerGeneration.g:371:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'require' ( ( (lv_requirement_4_1= ruleAttributeRequirement | lv_requirement_4_2= ruleExternalUse ) ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_requirement_4_1 = null;

        EObject lv_requirement_4_2 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:377:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'require' ( ( (lv_requirement_4_1= ruleAttributeRequirement | lv_requirement_4_2= ruleExternalUse ) ) ) )? ) )
            // InternalRestControllerGeneration.g:378:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'require' ( ( (lv_requirement_4_1= ruleAttributeRequirement | lv_requirement_4_2= ruleExternalUse ) ) ) )? )
            {
            // InternalRestControllerGeneration.g:378:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'require' ( ( (lv_requirement_4_1= ruleAttributeRequirement | lv_requirement_4_2= ruleExternalUse ) ) ) )? )
            // InternalRestControllerGeneration.g:379:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'require' ( ( (lv_requirement_4_1= ruleAttributeRequirement | lv_requirement_4_2= ruleExternalUse ) ) ) )?
            {
            // InternalRestControllerGeneration.g:379:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:380:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:380:4: (lv_name_0_0= RULE_ID )
            // InternalRestControllerGeneration.g:381:5: lv_name_0_0= RULE_ID
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
            		
            // InternalRestControllerGeneration.g:401:3: ( (otherlv_2= RULE_ID ) )
            // InternalRestControllerGeneration.g:402:4: (otherlv_2= RULE_ID )
            {
            // InternalRestControllerGeneration.g:402:4: (otherlv_2= RULE_ID )
            // InternalRestControllerGeneration.g:403:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0());
            				

            }


            }

            // InternalRestControllerGeneration.g:414:3: (otherlv_3= 'require' ( ( (lv_requirement_4_1= ruleAttributeRequirement | lv_requirement_4_2= ruleExternalUse ) ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRestControllerGeneration.g:415:4: otherlv_3= 'require' ( ( (lv_requirement_4_1= ruleAttributeRequirement | lv_requirement_4_2= ruleExternalUse ) ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getRequireKeyword_3_0());
                    			
                    // InternalRestControllerGeneration.g:419:4: ( ( (lv_requirement_4_1= ruleAttributeRequirement | lv_requirement_4_2= ruleExternalUse ) ) )
                    // InternalRestControllerGeneration.g:420:5: ( (lv_requirement_4_1= ruleAttributeRequirement | lv_requirement_4_2= ruleExternalUse ) )
                    {
                    // InternalRestControllerGeneration.g:420:5: ( (lv_requirement_4_1= ruleAttributeRequirement | lv_requirement_4_2= ruleExternalUse ) )
                    // InternalRestControllerGeneration.g:421:6: (lv_requirement_4_1= ruleAttributeRequirement | lv_requirement_4_2= ruleExternalUse )
                    {
                    // InternalRestControllerGeneration.g:421:6: (lv_requirement_4_1= ruleAttributeRequirement | lv_requirement_4_2= ruleExternalUse )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID) ) {
                        int LA5_1 = input.LA(2);

                        if ( ((LA5_1>=22 && LA5_1<=30)) ) {
                            alt5=1;
                        }
                        else if ( (LA5_1==EOF||LA5_1==RULE_ID||LA5_1==18) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA5_0==RULE_INT||LA5_0==31) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalRestControllerGeneration.g:422:7: lv_requirement_4_1= ruleAttributeRequirement
                            {

                            							newCompositeNode(grammarAccess.getAttributeAccess().getRequirementAttributeRequirementParserRuleCall_3_1_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_requirement_4_1=ruleAttributeRequirement();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAttributeRule());
                            							}
                            							set(
                            								current,
                            								"requirement",
                            								lv_requirement_4_1,
                            								"sdu.mdsd.restful.RestControllerGeneration.AttributeRequirement");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalRestControllerGeneration.g:438:7: lv_requirement_4_2= ruleExternalUse
                            {

                            							newCompositeNode(grammarAccess.getAttributeAccess().getRequirementExternalUseParserRuleCall_3_1_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            lv_requirement_4_2=ruleExternalUse();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAttributeRule());
                            							}
                            							set(
                            								current,
                            								"requirement",
                            								lv_requirement_4_2,
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


    // $ANTLR start "entryRuleAttributeRequirement"
    // InternalRestControllerGeneration.g:461:1: entryRuleAttributeRequirement returns [EObject current=null] : iv_ruleAttributeRequirement= ruleAttributeRequirement EOF ;
    public final EObject entryRuleAttributeRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeRequirement = null;


        try {
            // InternalRestControllerGeneration.g:461:61: (iv_ruleAttributeRequirement= ruleAttributeRequirement EOF )
            // InternalRestControllerGeneration.g:462:2: iv_ruleAttributeRequirement= ruleAttributeRequirement EOF
            {
             newCompositeNode(grammarAccess.getAttributeRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeRequirement=ruleAttributeRequirement();

            state._fsp--;

             current =iv_ruleAttributeRequirement; 
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
    // $ANTLR end "entryRuleAttributeRequirement"


    // $ANTLR start "ruleAttributeRequirement"
    // InternalRestControllerGeneration.g:468:1: ruleAttributeRequirement returns [EObject current=null] : ( (lv_logic_0_0= ruleLogicExp ) ) ;
    public final EObject ruleAttributeRequirement() throws RecognitionException {
        EObject current = null;

        EObject lv_logic_0_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:474:2: ( ( (lv_logic_0_0= ruleLogicExp ) ) )
            // InternalRestControllerGeneration.g:475:2: ( (lv_logic_0_0= ruleLogicExp ) )
            {
            // InternalRestControllerGeneration.g:475:2: ( (lv_logic_0_0= ruleLogicExp ) )
            // InternalRestControllerGeneration.g:476:3: (lv_logic_0_0= ruleLogicExp )
            {
            // InternalRestControllerGeneration.g:476:3: (lv_logic_0_0= ruleLogicExp )
            // InternalRestControllerGeneration.g:477:4: lv_logic_0_0= ruleLogicExp
            {

            				newCompositeNode(grammarAccess.getAttributeRequirementAccess().getLogicLogicExpParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_logic_0_0=ruleLogicExp();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAttributeRequirementRule());
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
    // $ANTLR end "ruleAttributeRequirement"


    // $ANTLR start "entryRuleExternalUse"
    // InternalRestControllerGeneration.g:497:1: entryRuleExternalUse returns [EObject current=null] : iv_ruleExternalUse= ruleExternalUse EOF ;
    public final EObject entryRuleExternalUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalUse = null;


        try {
            // InternalRestControllerGeneration.g:497:52: (iv_ruleExternalUse= ruleExternalUse EOF )
            // InternalRestControllerGeneration.g:498:2: iv_ruleExternalUse= ruleExternalUse EOF
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
    // InternalRestControllerGeneration.g:504:1: ruleExternalUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleExternalUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:510:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:511:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRestControllerGeneration.g:511:2: ( (otherlv_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:512:3: (otherlv_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:512:3: (otherlv_0= RULE_ID )
            // InternalRestControllerGeneration.g:513:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleLogicExp"
    // InternalRestControllerGeneration.g:527:1: entryRuleLogicExp returns [EObject current=null] : iv_ruleLogicExp= ruleLogicExp EOF ;
    public final EObject entryRuleLogicExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicExp = null;


        try {
            // InternalRestControllerGeneration.g:527:49: (iv_ruleLogicExp= ruleLogicExp EOF )
            // InternalRestControllerGeneration.g:528:2: iv_ruleLogicExp= ruleLogicExp EOF
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
    // InternalRestControllerGeneration.g:534:1: ruleLogicExp returns [EObject current=null] : (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleLogicExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Conjunction_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:540:2: ( (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // InternalRestControllerGeneration.g:541:2: (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // InternalRestControllerGeneration.g:541:2: (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* )
            // InternalRestControllerGeneration.g:542:3: this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicExpAccess().getConjunctionParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;


            			current = this_Conjunction_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRestControllerGeneration.g:550:3: (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:551:4: otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLogicExpAccess().getVerticalLineVerticalLineKeyword_1_0());
            	    			
            	    // InternalRestControllerGeneration.g:555:4: ()
            	    // InternalRestControllerGeneration.g:556:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getLogicExpAccess().getDisjunctionLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRestControllerGeneration.g:562:4: ( (lv_right_3_0= ruleConjunction ) )
            	    // InternalRestControllerGeneration.g:563:5: (lv_right_3_0= ruleConjunction )
            	    {
            	    // InternalRestControllerGeneration.g:563:5: (lv_right_3_0= ruleConjunction )
            	    // InternalRestControllerGeneration.g:564:6: lv_right_3_0= ruleConjunction
            	    {

            	    						newCompositeNode(grammarAccess.getLogicExpAccess().getRightConjunctionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
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
            	    break loop7;
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
    // InternalRestControllerGeneration.g:586:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // InternalRestControllerGeneration.g:586:52: (iv_ruleConjunction= ruleConjunction EOF )
            // InternalRestControllerGeneration.g:587:2: iv_ruleConjunction= ruleConjunction EOF
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
    // InternalRestControllerGeneration.g:593:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:599:2: ( (this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalRestControllerGeneration.g:600:2: (this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalRestControllerGeneration.g:600:2: (this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalRestControllerGeneration.g:601:3: this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRestControllerGeneration.g:609:3: (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:610:4: otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConjunctionAccess().getAmpersandAmpersandKeyword_1_0());
            	    			
            	    // InternalRestControllerGeneration.g:614:4: ()
            	    // InternalRestControllerGeneration.g:615:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRestControllerGeneration.g:621:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalRestControllerGeneration.g:622:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalRestControllerGeneration.g:622:5: (lv_right_3_0= ruleComparison )
            	    // InternalRestControllerGeneration.g:623:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
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
            	    break loop8;
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
    // InternalRestControllerGeneration.g:645:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalRestControllerGeneration.g:645:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalRestControllerGeneration.g:646:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalRestControllerGeneration.g:652:1: ruleComparison returns [EObject current=null] : ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:658:2: ( ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) ) ) )
            // InternalRestControllerGeneration.g:659:2: ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) ) )
            {
            // InternalRestControllerGeneration.g:659:2: ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) ) )
            // InternalRestControllerGeneration.g:660:3: ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) )
            {
            // InternalRestControllerGeneration.g:660:3: ( (lv_left_0_0= ruleExp ) )
            // InternalRestControllerGeneration.g:661:4: (lv_left_0_0= ruleExp )
            {
            // InternalRestControllerGeneration.g:661:4: (lv_left_0_0= ruleExp )
            // InternalRestControllerGeneration.g:662:5: lv_left_0_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getLeftExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalRestControllerGeneration.g:679:3: ( (lv_op_1_0= ruleRelationalOp ) )
            // InternalRestControllerGeneration.g:680:4: (lv_op_1_0= ruleRelationalOp )
            {
            // InternalRestControllerGeneration.g:680:4: (lv_op_1_0= ruleRelationalOp )
            // InternalRestControllerGeneration.g:681:5: lv_op_1_0= ruleRelationalOp
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

            // InternalRestControllerGeneration.g:698:3: ( (lv_right_2_0= ruleExp ) )
            // InternalRestControllerGeneration.g:699:4: (lv_right_2_0= ruleExp )
            {
            // InternalRestControllerGeneration.g:699:4: (lv_right_2_0= ruleExp )
            // InternalRestControllerGeneration.g:700:5: lv_right_2_0= ruleExp
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
    // InternalRestControllerGeneration.g:721:1: entryRuleRelationalOp returns [EObject current=null] : iv_ruleRelationalOp= ruleRelationalOp EOF ;
    public final EObject entryRuleRelationalOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalOp = null;


        try {
            // InternalRestControllerGeneration.g:721:53: (iv_ruleRelationalOp= ruleRelationalOp EOF )
            // InternalRestControllerGeneration.g:722:2: iv_ruleRelationalOp= ruleRelationalOp EOF
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
    // InternalRestControllerGeneration.g:728:1: ruleRelationalOp returns [EObject current=null] : ( ( () otherlv_1= '=' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '>=' ) ) ;
    public final EObject ruleRelationalOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:734:2: ( ( ( () otherlv_1= '=' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '>=' ) ) )
            // InternalRestControllerGeneration.g:735:2: ( ( () otherlv_1= '=' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '>=' ) )
            {
            // InternalRestControllerGeneration.g:735:2: ( ( () otherlv_1= '=' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '>=' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            case 26:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRestControllerGeneration.g:736:3: ( () otherlv_1= '=' )
                    {
                    // InternalRestControllerGeneration.g:736:3: ( () otherlv_1= '=' )
                    // InternalRestControllerGeneration.g:737:4: () otherlv_1= '='
                    {
                    // InternalRestControllerGeneration.g:737:4: ()
                    // InternalRestControllerGeneration.g:738:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelEQAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationalOpAccess().getEqualsSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRestControllerGeneration.g:750:3: ( () otherlv_3= '<' )
                    {
                    // InternalRestControllerGeneration.g:750:3: ( () otherlv_3= '<' )
                    // InternalRestControllerGeneration.g:751:4: () otherlv_3= '<'
                    {
                    // InternalRestControllerGeneration.g:751:4: ()
                    // InternalRestControllerGeneration.g:752:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelLTAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelationalOpAccess().getLessThanSignKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRestControllerGeneration.g:764:3: ( () otherlv_5= '>' )
                    {
                    // InternalRestControllerGeneration.g:764:3: ( () otherlv_5= '>' )
                    // InternalRestControllerGeneration.g:765:4: () otherlv_5= '>'
                    {
                    // InternalRestControllerGeneration.g:765:4: ()
                    // InternalRestControllerGeneration.g:766:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelGTAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getRelationalOpAccess().getGreaterThanSignKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRestControllerGeneration.g:778:3: ( () otherlv_7= '<=' )
                    {
                    // InternalRestControllerGeneration.g:778:3: ( () otherlv_7= '<=' )
                    // InternalRestControllerGeneration.g:779:4: () otherlv_7= '<='
                    {
                    // InternalRestControllerGeneration.g:779:4: ()
                    // InternalRestControllerGeneration.g:780:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelLTEAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getRelationalOpAccess().getLessThanSignEqualsSignKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRestControllerGeneration.g:792:3: ( () otherlv_9= '>=' )
                    {
                    // InternalRestControllerGeneration.g:792:3: ( () otherlv_9= '>=' )
                    // InternalRestControllerGeneration.g:793:4: () otherlv_9= '>='
                    {
                    // InternalRestControllerGeneration.g:793:4: ()
                    // InternalRestControllerGeneration.g:794:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelGTEAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,26,FOLLOW_2); 

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
    // InternalRestControllerGeneration.g:809:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalRestControllerGeneration.g:809:44: (iv_ruleExp= ruleExp EOF )
            // InternalRestControllerGeneration.g:810:2: iv_ruleExp= ruleExp EOF
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
    // InternalRestControllerGeneration.g:816:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:822:2: ( (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalRestControllerGeneration.g:823:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalRestControllerGeneration.g:823:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalRestControllerGeneration.g:824:3: this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRestControllerGeneration.g:832:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=27 && LA11_0<=28)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:833:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalRestControllerGeneration.g:833:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==27) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==28) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalRestControllerGeneration.g:834:5: (otherlv_1= '+' () )
            	            {
            	            // InternalRestControllerGeneration.g:834:5: (otherlv_1= '+' () )
            	            // InternalRestControllerGeneration.g:835:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,27,FOLLOW_11); 

            	            						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalRestControllerGeneration.g:839:6: ()
            	            // InternalRestControllerGeneration.g:840:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getAddLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRestControllerGeneration.g:848:5: (otherlv_3= '-' () )
            	            {
            	            // InternalRestControllerGeneration.g:848:5: (otherlv_3= '-' () )
            	            // InternalRestControllerGeneration.g:849:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,28,FOLLOW_11); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalRestControllerGeneration.g:853:6: ()
            	            // InternalRestControllerGeneration.g:854:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getSubLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRestControllerGeneration.g:862:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalRestControllerGeneration.g:863:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalRestControllerGeneration.g:863:5: (lv_right_5_0= ruleFactor )
            	    // InternalRestControllerGeneration.g:864:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
            	    break loop11;
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
    // InternalRestControllerGeneration.g:886:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalRestControllerGeneration.g:886:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalRestControllerGeneration.g:887:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalRestControllerGeneration.g:893:1: ruleFactor returns [EObject current=null] : (this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primitive_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:899:2: ( (this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )* ) )
            // InternalRestControllerGeneration.g:900:2: (this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )* )
            {
            // InternalRestControllerGeneration.g:900:2: (this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )* )
            // InternalRestControllerGeneration.g:901:3: this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimitiveParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Primitive_0=rulePrimitive();

            state._fsp--;


            			current = this_Primitive_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRestControllerGeneration.g:909:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=29 && LA13_0<=30)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:910:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) )
            	    {
            	    // InternalRestControllerGeneration.g:910:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
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
            	            // InternalRestControllerGeneration.g:911:5: (otherlv_1= '*' () )
            	            {
            	            // InternalRestControllerGeneration.g:911:5: (otherlv_1= '*' () )
            	            // InternalRestControllerGeneration.g:912:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,29,FOLLOW_11); 

            	            						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalRestControllerGeneration.g:916:6: ()
            	            // InternalRestControllerGeneration.g:917:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMulLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRestControllerGeneration.g:925:5: (otherlv_3= '/' () )
            	            {
            	            // InternalRestControllerGeneration.g:925:5: (otherlv_3= '/' () )
            	            // InternalRestControllerGeneration.g:926:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,30,FOLLOW_11); 

            	            						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalRestControllerGeneration.g:930:6: ()
            	            // InternalRestControllerGeneration.g:931:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRestControllerGeneration.g:939:4: ( (lv_right_5_0= rulePrimitive ) )
            	    // InternalRestControllerGeneration.g:940:5: (lv_right_5_0= rulePrimitive )
            	    {
            	    // InternalRestControllerGeneration.g:940:5: (lv_right_5_0= rulePrimitive )
            	    // InternalRestControllerGeneration.g:941:6: lv_right_5_0= rulePrimitive
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimitiveParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimitive"
    // InternalRestControllerGeneration.g:963:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalRestControllerGeneration.g:963:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalRestControllerGeneration.g:964:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalRestControllerGeneration.g:970:1: rulePrimitive returns [EObject current=null] : (this_Name_0= ruleName | this_IntExp_1= ruleIntExp | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Name_0 = null;

        EObject this_IntExp_1 = null;

        EObject this_Exp_3 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:976:2: ( (this_Name_0= ruleName | this_IntExp_1= ruleIntExp | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) ) )
            // InternalRestControllerGeneration.g:977:2: (this_Name_0= ruleName | this_IntExp_1= ruleIntExp | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) )
            {
            // InternalRestControllerGeneration.g:977:2: (this_Name_0= ruleName | this_IntExp_1= ruleIntExp | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case RULE_INT:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalRestControllerGeneration.g:978:3: this_Name_0= ruleName
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
                    // InternalRestControllerGeneration.g:987:3: this_IntExp_1= ruleIntExp
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
                    // InternalRestControllerGeneration.g:996:3: (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' )
                    {
                    // InternalRestControllerGeneration.g:996:3: (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' )
                    // InternalRestControllerGeneration.g:997:4: otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimitiveAccess().getExpParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_17);
                    this_Exp_3=ruleExp();

                    state._fsp--;


                    				current = this_Exp_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,32,FOLLOW_2); 

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
    // InternalRestControllerGeneration.g:1018:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalRestControllerGeneration.g:1018:45: (iv_ruleName= ruleName EOF )
            // InternalRestControllerGeneration.g:1019:2: iv_ruleName= ruleName EOF
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
    // InternalRestControllerGeneration.g:1025:1: ruleName returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1031:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1032:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRestControllerGeneration.g:1032:2: ( (otherlv_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:1033:3: (otherlv_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1033:3: (otherlv_0= RULE_ID )
            // InternalRestControllerGeneration.g:1034:4: otherlv_0= RULE_ID
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
    // InternalRestControllerGeneration.g:1048:1: entryRuleIntExp returns [EObject current=null] : iv_ruleIntExp= ruleIntExp EOF ;
    public final EObject entryRuleIntExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExp = null;


        try {
            // InternalRestControllerGeneration.g:1048:47: (iv_ruleIntExp= ruleIntExp EOF )
            // InternalRestControllerGeneration.g:1049:2: iv_ruleIntExp= ruleIntExp EOF
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
    // InternalRestControllerGeneration.g:1055:1: ruleIntExp returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntExp() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1061:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRestControllerGeneration.g:1062:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRestControllerGeneration.g:1062:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalRestControllerGeneration.g:1063:3: (lv_value_0_0= RULE_INT )
            {
            // InternalRestControllerGeneration.g:1063:3: (lv_value_0_0= RULE_INT )
            // InternalRestControllerGeneration.g:1064:4: lv_value_0_0= RULE_INT
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
    // InternalRestControllerGeneration.g:1083:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalRestControllerGeneration.g:1083:51: (iv_ruleController= ruleController EOF )
            // InternalRestControllerGeneration.g:1084:2: iv_ruleController= ruleController EOF
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
    // InternalRestControllerGeneration.g:1090:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_methods_7_0= ruleMethodDef ) )* otherlv_8= '}' ) ;
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
            // InternalRestControllerGeneration.g:1096:2: ( (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_methods_7_0= ruleMethodDef ) )* otherlv_8= '}' ) )
            // InternalRestControllerGeneration.g:1097:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_methods_7_0= ruleMethodDef ) )* otherlv_8= '}' )
            {
            // InternalRestControllerGeneration.g:1097:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_methods_7_0= ruleMethodDef ) )* otherlv_8= '}' )
            // InternalRestControllerGeneration.g:1098:3: otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_methods_7_0= ruleMethodDef ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            // InternalRestControllerGeneration.g:1102:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:1103:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1103:4: (lv_name_1_0= RULE_ID )
            // InternalRestControllerGeneration.g:1104:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            // InternalRestControllerGeneration.g:1120:3: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRestControllerGeneration.g:1121:4: otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getColonKeyword_2_0());
                    			
                    // InternalRestControllerGeneration.g:1125:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRestControllerGeneration.g:1126:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRestControllerGeneration.g:1126:5: (otherlv_3= RULE_ID )
                    // InternalRestControllerGeneration.g:1127:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getControllerRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getSuperControllerCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getControllerAccess().getUsesKeyword_3());
            		
            // InternalRestControllerGeneration.g:1143:3: ( (otherlv_5= RULE_ID ) )
            // InternalRestControllerGeneration.g:1144:4: (otherlv_5= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1144:4: (otherlv_5= RULE_ID )
            // InternalRestControllerGeneration.g:1145:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getEntityEntityCrossReference_4_0());
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalRestControllerGeneration.g:1160:3: ( (lv_methods_7_0= ruleMethodDef ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35||LA16_0==38||(LA16_0>=40 && LA16_0<=41)||LA16_0==43) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:1161:4: (lv_methods_7_0= ruleMethodDef )
            	    {
            	    // InternalRestControllerGeneration.g:1161:4: (lv_methods_7_0= ruleMethodDef )
            	    // InternalRestControllerGeneration.g:1162:5: lv_methods_7_0= ruleMethodDef
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getMethodsMethodDefParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop16;
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
    // InternalRestControllerGeneration.g:1187:1: entryRuleMethodDef returns [EObject current=null] : iv_ruleMethodDef= ruleMethodDef EOF ;
    public final EObject entryRuleMethodDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDef = null;


        try {
            // InternalRestControllerGeneration.g:1187:50: (iv_ruleMethodDef= ruleMethodDef EOF )
            // InternalRestControllerGeneration.g:1188:2: iv_ruleMethodDef= ruleMethodDef EOF
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
    // InternalRestControllerGeneration.g:1194:1: ruleMethodDef returns [EObject current=null] : this_MethodType_0= ruleMethodType ;
    public final EObject ruleMethodDef() throws RecognitionException {
        EObject current = null;

        EObject this_MethodType_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1200:2: (this_MethodType_0= ruleMethodType )
            // InternalRestControllerGeneration.g:1201:2: this_MethodType_0= ruleMethodType
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
    // InternalRestControllerGeneration.g:1212:1: entryRuleMethodType returns [EObject current=null] : iv_ruleMethodType= ruleMethodType EOF ;
    public final EObject entryRuleMethodType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodType = null;


        try {
            // InternalRestControllerGeneration.g:1212:51: (iv_ruleMethodType= ruleMethodType EOF )
            // InternalRestControllerGeneration.g:1213:2: iv_ruleMethodType= ruleMethodType EOF
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
    // InternalRestControllerGeneration.g:1219:1: ruleMethodType returns [EObject current=null] : (this_CreateMethod_0= ruleCreateMethod | this_GetMethod_1= ruleGetMethod | this_ListMethod_2= ruleListMethod | this_UpdateMethod_3= ruleUpdateMethod | this_DeleteMethod_4= ruleDeleteMethod ) ;
    public final EObject ruleMethodType() throws RecognitionException {
        EObject current = null;

        EObject this_CreateMethod_0 = null;

        EObject this_GetMethod_1 = null;

        EObject this_ListMethod_2 = null;

        EObject this_UpdateMethod_3 = null;

        EObject this_DeleteMethod_4 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1225:2: ( (this_CreateMethod_0= ruleCreateMethod | this_GetMethod_1= ruleGetMethod | this_ListMethod_2= ruleListMethod | this_UpdateMethod_3= ruleUpdateMethod | this_DeleteMethod_4= ruleDeleteMethod ) )
            // InternalRestControllerGeneration.g:1226:2: (this_CreateMethod_0= ruleCreateMethod | this_GetMethod_1= ruleGetMethod | this_ListMethod_2= ruleListMethod | this_UpdateMethod_3= ruleUpdateMethod | this_DeleteMethod_4= ruleDeleteMethod )
            {
            // InternalRestControllerGeneration.g:1226:2: (this_CreateMethod_0= ruleCreateMethod | this_GetMethod_1= ruleGetMethod | this_ListMethod_2= ruleListMethod | this_UpdateMethod_3= ruleUpdateMethod | this_DeleteMethod_4= ruleDeleteMethod )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt17=1;
                }
                break;
            case 38:
                {
                alt17=2;
                }
                break;
            case 40:
                {
                alt17=3;
                }
                break;
            case 41:
                {
                alt17=4;
                }
                break;
            case 43:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalRestControllerGeneration.g:1227:3: this_CreateMethod_0= ruleCreateMethod
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
                    // InternalRestControllerGeneration.g:1236:3: this_GetMethod_1= ruleGetMethod
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
                    // InternalRestControllerGeneration.g:1245:3: this_ListMethod_2= ruleListMethod
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
                    // InternalRestControllerGeneration.g:1254:3: this_UpdateMethod_3= ruleUpdateMethod
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
                    // InternalRestControllerGeneration.g:1263:3: this_DeleteMethod_4= ruleDeleteMethod
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
    // InternalRestControllerGeneration.g:1275:1: entryRuleCreateMethod returns [EObject current=null] : iv_ruleCreateMethod= ruleCreateMethod EOF ;
    public final EObject entryRuleCreateMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateMethod = null;


        try {
            // InternalRestControllerGeneration.g:1275:53: (iv_ruleCreateMethod= ruleCreateMethod EOF )
            // InternalRestControllerGeneration.g:1276:2: iv_ruleCreateMethod= ruleCreateMethod EOF
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
    // InternalRestControllerGeneration.g:1282:1: ruleCreateMethod returns [EObject current=null] : ( () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )? ) ;
    public final EObject ruleCreateMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_withEntity_2_0 = null;

        EObject lv_exclude_3_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1288:2: ( ( () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )? ) )
            // InternalRestControllerGeneration.g:1289:2: ( () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )? )
            {
            // InternalRestControllerGeneration.g:1289:2: ( () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )? )
            // InternalRestControllerGeneration.g:1290:3: () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )?
            {
            // InternalRestControllerGeneration.g:1290:3: ()
            // InternalRestControllerGeneration.g:1291:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCreateMethodAccess().getCreateMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateMethodAccess().getCREATEKeyword_1());
            		
            // InternalRestControllerGeneration.g:1301:3: ( (lv_withEntity_2_0= ruleCreateMethodWith ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRestControllerGeneration.g:1302:4: (lv_withEntity_2_0= ruleCreateMethodWith )
                    {
                    // InternalRestControllerGeneration.g:1302:4: (lv_withEntity_2_0= ruleCreateMethodWith )
                    // InternalRestControllerGeneration.g:1303:5: lv_withEntity_2_0= ruleCreateMethodWith
                    {

                    					newCompositeNode(grammarAccess.getCreateMethodAccess().getWithEntityCreateMethodWithParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_22);
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

            // InternalRestControllerGeneration.g:1320:3: ( (lv_exclude_3_0= ruleCreateMethodExclude ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRestControllerGeneration.g:1321:4: (lv_exclude_3_0= ruleCreateMethodExclude )
                    {
                    // InternalRestControllerGeneration.g:1321:4: (lv_exclude_3_0= ruleCreateMethodExclude )
                    // InternalRestControllerGeneration.g:1322:5: lv_exclude_3_0= ruleCreateMethodExclude
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
    // InternalRestControllerGeneration.g:1343:1: entryRuleCreateMethodWith returns [EObject current=null] : iv_ruleCreateMethodWith= ruleCreateMethodWith EOF ;
    public final EObject entryRuleCreateMethodWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateMethodWith = null;


        try {
            // InternalRestControllerGeneration.g:1343:57: (iv_ruleCreateMethodWith= ruleCreateMethodWith EOF )
            // InternalRestControllerGeneration.g:1344:2: iv_ruleCreateMethodWith= ruleCreateMethodWith EOF
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
    // InternalRestControllerGeneration.g:1350:1: ruleCreateMethodWith returns [EObject current=null] : (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleCreateMethodWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1356:2: ( (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:1357:2: (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:1357:2: (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1358:3: otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateMethodWithAccess().getWithKeyword_0());
            		
            // InternalRestControllerGeneration.g:1362:3: ( (otherlv_1= RULE_ID ) )
            // InternalRestControllerGeneration.g:1363:4: (otherlv_1= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1363:4: (otherlv_1= RULE_ID )
            // InternalRestControllerGeneration.g:1364:5: otherlv_1= RULE_ID
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
            		
            // InternalRestControllerGeneration.g:1379:3: ( (otherlv_3= RULE_ID ) )
            // InternalRestControllerGeneration.g:1380:4: (otherlv_3= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1380:4: (otherlv_3= RULE_ID )
            // InternalRestControllerGeneration.g:1381:5: otherlv_3= RULE_ID
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
    // InternalRestControllerGeneration.g:1396:1: entryRuleCreateMethodExclude returns [EObject current=null] : iv_ruleCreateMethodExclude= ruleCreateMethodExclude EOF ;
    public final EObject entryRuleCreateMethodExclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateMethodExclude = null;


        try {
            // InternalRestControllerGeneration.g:1396:60: (iv_ruleCreateMethodExclude= ruleCreateMethodExclude EOF )
            // InternalRestControllerGeneration.g:1397:2: iv_ruleCreateMethodExclude= ruleCreateMethodExclude EOF
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
    // InternalRestControllerGeneration.g:1403:1: ruleCreateMethodExclude returns [EObject current=null] : (otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleCreateMethodExclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1409:2: ( (otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:1410:2: (otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:1410:2: (otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1411:3: otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateMethodExcludeAccess().getExcludeKeyword_0());
            		
            // InternalRestControllerGeneration.g:1415:3: ( (otherlv_1= RULE_ID ) )
            // InternalRestControllerGeneration.g:1416:4: (otherlv_1= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1416:4: (otherlv_1= RULE_ID )
            // InternalRestControllerGeneration.g:1417:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateMethodExcludeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getCreateMethodExcludeAccess().getAttributeAttributeCrossReference_1_0());
            				

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
    // $ANTLR end "ruleCreateMethodExclude"


    // $ANTLR start "entryRuleGetMethod"
    // InternalRestControllerGeneration.g:1432:1: entryRuleGetMethod returns [EObject current=null] : iv_ruleGetMethod= ruleGetMethod EOF ;
    public final EObject entryRuleGetMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetMethod = null;


        try {
            // InternalRestControllerGeneration.g:1432:50: (iv_ruleGetMethod= ruleGetMethod EOF )
            // InternalRestControllerGeneration.g:1433:2: iv_ruleGetMethod= ruleGetMethod EOF
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
    // InternalRestControllerGeneration.g:1439:1: ruleGetMethod returns [EObject current=null] : (otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleGetMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1445:2: ( (otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:1446:2: (otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:1446:2: (otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1447:3: otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getGetMethodAccess().getGETKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGetMethodAccess().getOnKeyword_1());
            		
            // InternalRestControllerGeneration.g:1455:3: ( (otherlv_2= RULE_ID ) )
            // InternalRestControllerGeneration.g:1456:4: (otherlv_2= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1456:4: (otherlv_2= RULE_ID )
            // InternalRestControllerGeneration.g:1457:5: otherlv_2= RULE_ID
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
    // InternalRestControllerGeneration.g:1472:1: entryRuleListMethod returns [EObject current=null] : iv_ruleListMethod= ruleListMethod EOF ;
    public final EObject entryRuleListMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListMethod = null;


        try {
            // InternalRestControllerGeneration.g:1472:51: (iv_ruleListMethod= ruleListMethod EOF )
            // InternalRestControllerGeneration.g:1473:2: iv_ruleListMethod= ruleListMethod EOF
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
    // InternalRestControllerGeneration.g:1479:1: ruleListMethod returns [EObject current=null] : ( () otherlv_1= 'LIST' ) ;
    public final EObject ruleListMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1485:2: ( ( () otherlv_1= 'LIST' ) )
            // InternalRestControllerGeneration.g:1486:2: ( () otherlv_1= 'LIST' )
            {
            // InternalRestControllerGeneration.g:1486:2: ( () otherlv_1= 'LIST' )
            // InternalRestControllerGeneration.g:1487:3: () otherlv_1= 'LIST'
            {
            // InternalRestControllerGeneration.g:1487:3: ()
            // InternalRestControllerGeneration.g:1488:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListMethodAccess().getListMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

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
    // InternalRestControllerGeneration.g:1502:1: entryRuleUpdateMethod returns [EObject current=null] : iv_ruleUpdateMethod= ruleUpdateMethod EOF ;
    public final EObject entryRuleUpdateMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateMethod = null;


        try {
            // InternalRestControllerGeneration.g:1502:53: (iv_ruleUpdateMethod= ruleUpdateMethod EOF )
            // InternalRestControllerGeneration.g:1503:2: iv_ruleUpdateMethod= ruleUpdateMethod EOF
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
    // InternalRestControllerGeneration.g:1509:1: ruleUpdateMethod returns [EObject current=null] : (otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleUpdateMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1515:2: ( (otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalRestControllerGeneration.g:1516:2: (otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalRestControllerGeneration.g:1516:2: (otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalRestControllerGeneration.g:1517:3: otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateMethodAccess().getUPDATEKeyword_0());
            		
            // InternalRestControllerGeneration.g:1521:3: ( (otherlv_1= RULE_ID ) )
            // InternalRestControllerGeneration.g:1522:4: (otherlv_1= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1522:4: (otherlv_1= RULE_ID )
            // InternalRestControllerGeneration.g:1523:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdateMethodRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_1, grammarAccess.getUpdateMethodAccess().getAttributesAttributeCrossReference_1_0());
            				

            }


            }

            // InternalRestControllerGeneration.g:1534:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==42) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:1535:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,42,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getUpdateMethodAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalRestControllerGeneration.g:1539:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalRestControllerGeneration.g:1540:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalRestControllerGeneration.g:1540:5: (otherlv_3= RULE_ID )
            	    // InternalRestControllerGeneration.g:1541:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUpdateMethodRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_3, grammarAccess.getUpdateMethodAccess().getAttributesAttributeCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalRestControllerGeneration.g:1557:1: entryRuleDeleteMethod returns [EObject current=null] : iv_ruleDeleteMethod= ruleDeleteMethod EOF ;
    public final EObject entryRuleDeleteMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteMethod = null;


        try {
            // InternalRestControllerGeneration.g:1557:53: (iv_ruleDeleteMethod= ruleDeleteMethod EOF )
            // InternalRestControllerGeneration.g:1558:2: iv_ruleDeleteMethod= ruleDeleteMethod EOF
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
    // InternalRestControllerGeneration.g:1564:1: ruleDeleteMethod returns [EObject current=null] : (otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDeleteMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1570:2: ( (otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:1571:2: (otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:1571:2: (otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1572:3: otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteMethodAccess().getDELETEKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteMethodAccess().getOnKeyword_1());
            		
            // InternalRestControllerGeneration.g:1580:3: ( (otherlv_2= RULE_ID ) )
            // InternalRestControllerGeneration.g:1581:4: (otherlv_2= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1581:4: (otherlv_2= RULE_ID )
            // InternalRestControllerGeneration.g:1582:5: otherlv_2= RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000020000B002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000B4800040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000002L});

}