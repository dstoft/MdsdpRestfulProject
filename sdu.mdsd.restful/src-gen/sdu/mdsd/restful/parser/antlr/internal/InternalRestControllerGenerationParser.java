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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'type'", "'external'", "'entity'", "':'", "'{'", "'}'", "'requires'", "'using'", "'reference'", "'list'", "'of'", "'require'", "'||'", "'&&'", "'='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'.'", "'controller'", "'uses'", "'CREATE'", "'with'", "'exclude'", "','", "'GET'", "'on'", "'LIST'", "'UPDATE'", "'DELETE'"
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
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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

                if ( ((LA1_0>=12 && LA1_0<=14)||LA1_0==38) ) {
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
            case 14:
                {
                alt2=2;
                }
                break;
            case 38:
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
    // InternalRestControllerGeneration.g:226:1: ruleExternalDef returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleAttributeType ) ) ) ;
    public final EObject ruleExternalDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:232:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleAttributeType ) ) ) )
            // InternalRestControllerGeneration.g:233:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleAttributeType ) ) )
            {
            // InternalRestControllerGeneration.g:233:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleAttributeType ) ) )
            // InternalRestControllerGeneration.g:234:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleAttributeType ) )
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

            // InternalRestControllerGeneration.g:256:3: ( (lv_type_2_0= ruleAttributeType ) )
            // InternalRestControllerGeneration.g:257:4: (lv_type_2_0= ruleAttributeType )
            {
            // InternalRestControllerGeneration.g:257:4: (lv_type_2_0= ruleAttributeType )
            // InternalRestControllerGeneration.g:258:5: lv_type_2_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getExternalDefAccess().getTypeAttributeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalDefRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"sdu.mdsd.restful.RestControllerGeneration.AttributeType");
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
    // $ANTLR end "ruleExternalDef"


    // $ANTLR start "entryRuleEntity"
    // InternalRestControllerGeneration.g:279:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalRestControllerGeneration.g:279:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalRestControllerGeneration.g:280:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalRestControllerGeneration.g:286:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_declarations_5_0= ruleEntityDeclaration ) )* otherlv_6= '}' ) ;
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
            // InternalRestControllerGeneration.g:292:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_declarations_5_0= ruleEntityDeclaration ) )* otherlv_6= '}' ) )
            // InternalRestControllerGeneration.g:293:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_declarations_5_0= ruleEntityDeclaration ) )* otherlv_6= '}' )
            {
            // InternalRestControllerGeneration.g:293:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_declarations_5_0= ruleEntityDeclaration ) )* otherlv_6= '}' )
            // InternalRestControllerGeneration.g:294:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_declarations_5_0= ruleEntityDeclaration ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalRestControllerGeneration.g:298:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:299:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:299:4: (lv_name_1_0= RULE_ID )
            // InternalRestControllerGeneration.g:300:5: lv_name_1_0= RULE_ID
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

            // InternalRestControllerGeneration.g:316:3: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRestControllerGeneration.g:317:4: otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getColonKeyword_2_0());
                    			
                    // InternalRestControllerGeneration.g:321:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRestControllerGeneration.g:322:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRestControllerGeneration.g:322:5: (otherlv_3= RULE_ID )
                    // InternalRestControllerGeneration.g:323:6: otherlv_3= RULE_ID
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

            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRestControllerGeneration.g:339:3: ( (lv_declarations_5_0= ruleEntityDeclaration ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:340:4: (lv_declarations_5_0= ruleEntityDeclaration )
            	    {
            	    // InternalRestControllerGeneration.g:340:4: (lv_declarations_5_0= ruleEntityDeclaration )
            	    // InternalRestControllerGeneration.g:341:5: lv_declarations_5_0= ruleEntityDeclaration
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

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

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
    // InternalRestControllerGeneration.g:366:1: entryRuleEntityDeclaration returns [EObject current=null] : iv_ruleEntityDeclaration= ruleEntityDeclaration EOF ;
    public final EObject entryRuleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDeclaration = null;


        try {
            // InternalRestControllerGeneration.g:366:58: (iv_ruleEntityDeclaration= ruleEntityDeclaration EOF )
            // InternalRestControllerGeneration.g:367:2: iv_ruleEntityDeclaration= ruleEntityDeclaration EOF
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
    // InternalRestControllerGeneration.g:373:1: ruleEntityDeclaration returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Requirement_1= ruleRequirement ) ;
    public final EObject ruleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Requirement_1 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:379:2: ( (this_Attribute_0= ruleAttribute | this_Requirement_1= ruleRequirement ) )
            // InternalRestControllerGeneration.g:380:2: (this_Attribute_0= ruleAttribute | this_Requirement_1= ruleRequirement )
            {
            // InternalRestControllerGeneration.g:380:2: (this_Attribute_0= ruleAttribute | this_Requirement_1= ruleRequirement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRestControllerGeneration.g:381:3: this_Attribute_0= ruleAttribute
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
                    // InternalRestControllerGeneration.g:390:3: this_Requirement_1= ruleRequirement
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
    // InternalRestControllerGeneration.g:402:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRestControllerGeneration.g:402:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRestControllerGeneration.g:403:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalRestControllerGeneration.g:409:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleAttributeType ) ) (otherlv_2= 'requires' ( ( (lv_requires_3_1= ruleLogicRequirement | lv_requires_3_2= ruleExternalUse ) ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;

        EObject lv_requires_3_1 = null;

        EObject lv_requires_3_2 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:415:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleAttributeType ) ) (otherlv_2= 'requires' ( ( (lv_requires_3_1= ruleLogicRequirement | lv_requires_3_2= ruleExternalUse ) ) ) )? ) )
            // InternalRestControllerGeneration.g:416:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleAttributeType ) ) (otherlv_2= 'requires' ( ( (lv_requires_3_1= ruleLogicRequirement | lv_requires_3_2= ruleExternalUse ) ) ) )? )
            {
            // InternalRestControllerGeneration.g:416:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleAttributeType ) ) (otherlv_2= 'requires' ( ( (lv_requires_3_1= ruleLogicRequirement | lv_requires_3_2= ruleExternalUse ) ) ) )? )
            // InternalRestControllerGeneration.g:417:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleAttributeType ) ) (otherlv_2= 'requires' ( ( (lv_requires_3_1= ruleLogicRequirement | lv_requires_3_2= ruleExternalUse ) ) ) )?
            {
            // InternalRestControllerGeneration.g:417:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:418:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:418:4: (lv_name_0_0= RULE_ID )
            // InternalRestControllerGeneration.g:419:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            // InternalRestControllerGeneration.g:435:3: ( (lv_type_1_0= ruleAttributeType ) )
            // InternalRestControllerGeneration.g:436:4: (lv_type_1_0= ruleAttributeType )
            {
            // InternalRestControllerGeneration.g:436:4: (lv_type_1_0= ruleAttributeType )
            // InternalRestControllerGeneration.g:437:5: lv_type_1_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_type_1_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"sdu.mdsd.restful.RestControllerGeneration.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRestControllerGeneration.g:454:3: (otherlv_2= 'requires' ( ( (lv_requires_3_1= ruleLogicRequirement | lv_requires_3_2= ruleExternalUse ) ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRestControllerGeneration.g:455:4: otherlv_2= 'requires' ( ( (lv_requires_3_1= ruleLogicRequirement | lv_requires_3_2= ruleExternalUse ) ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getRequiresKeyword_2_0());
                    			
                    // InternalRestControllerGeneration.g:459:4: ( ( (lv_requires_3_1= ruleLogicRequirement | lv_requires_3_2= ruleExternalUse ) ) )
                    // InternalRestControllerGeneration.g:460:5: ( (lv_requires_3_1= ruleLogicRequirement | lv_requires_3_2= ruleExternalUse ) )
                    {
                    // InternalRestControllerGeneration.g:460:5: ( (lv_requires_3_1= ruleLogicRequirement | lv_requires_3_2= ruleExternalUse ) )
                    // InternalRestControllerGeneration.g:461:6: (lv_requires_3_1= ruleLogicRequirement | lv_requires_3_2= ruleExternalUse )
                    {
                    // InternalRestControllerGeneration.g:461:6: (lv_requires_3_1= ruleLogicRequirement | lv_requires_3_2= ruleExternalUse )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) ) {
                        int LA6_1 = input.LA(2);

                        if ( (LA6_1==EOF||LA6_1==RULE_ID||LA6_1==17||LA6_1==23) ) {
                            alt6=2;
                        }
                        else if ( ((LA6_1>=26 && LA6_1<=34)||LA6_1==37) ) {
                            alt6=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA6_0==RULE_INT||LA6_0==35) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalRestControllerGeneration.g:462:7: lv_requires_3_1= ruleLogicRequirement
                            {

                            							newCompositeNode(grammarAccess.getAttributeAccess().getRequiresLogicRequirementParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_requires_3_1=ruleLogicRequirement();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAttributeRule());
                            							}
                            							set(
                            								current,
                            								"requires",
                            								lv_requires_3_1,
                            								"sdu.mdsd.restful.RestControllerGeneration.LogicRequirement");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalRestControllerGeneration.g:478:7: lv_requires_3_2= ruleExternalUse
                            {

                            							newCompositeNode(grammarAccess.getAttributeAccess().getRequiresExternalUseParserRuleCall_2_1_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            lv_requires_3_2=ruleExternalUse();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAttributeRule());
                            							}
                            							set(
                            								current,
                            								"requires",
                            								lv_requires_3_2,
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


    // $ANTLR start "entryRuleAttributeType"
    // InternalRestControllerGeneration.g:501:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalRestControllerGeneration.g:501:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalRestControllerGeneration.g:502:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;

             current =iv_ruleAttributeType; 
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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalRestControllerGeneration.g:508:1: ruleAttributeType returns [EObject current=null] : ( ( () otherlv_1= 'using' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'reference' ( (otherlv_5= RULE_ID ) ) ) | ( () otherlv_7= 'list' ( (otherlv_8= RULE_ID ) ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:514:2: ( ( ( () otherlv_1= 'using' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'reference' ( (otherlv_5= RULE_ID ) ) ) | ( () otherlv_7= 'list' ( (otherlv_8= RULE_ID ) ) ) ) )
            // InternalRestControllerGeneration.g:515:2: ( ( () otherlv_1= 'using' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'reference' ( (otherlv_5= RULE_ID ) ) ) | ( () otherlv_7= 'list' ( (otherlv_8= RULE_ID ) ) ) )
            {
            // InternalRestControllerGeneration.g:515:2: ( ( () otherlv_1= 'using' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'reference' ( (otherlv_5= RULE_ID ) ) ) | ( () otherlv_7= 'list' ( (otherlv_8= RULE_ID ) ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRestControllerGeneration.g:516:3: ( () otherlv_1= 'using' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalRestControllerGeneration.g:516:3: ( () otherlv_1= 'using' ( (otherlv_2= RULE_ID ) ) )
                    // InternalRestControllerGeneration.g:517:4: () otherlv_1= 'using' ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalRestControllerGeneration.g:517:4: ()
                    // InternalRestControllerGeneration.g:518:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeTypeAccess().getSimpleTypeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeTypeAccess().getUsingKeyword_0_1());
                    			
                    // InternalRestControllerGeneration.g:528:4: ( (otherlv_2= RULE_ID ) )
                    // InternalRestControllerGeneration.g:529:5: (otherlv_2= RULE_ID )
                    {
                    // InternalRestControllerGeneration.g:529:5: (otherlv_2= RULE_ID )
                    // InternalRestControllerGeneration.g:530:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeTypeRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getAttributeTypeAccess().getTypeTypeCrossReference_0_2_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRestControllerGeneration.g:543:3: ( () otherlv_4= 'reference' ( (otherlv_5= RULE_ID ) ) )
                    {
                    // InternalRestControllerGeneration.g:543:3: ( () otherlv_4= 'reference' ( (otherlv_5= RULE_ID ) ) )
                    // InternalRestControllerGeneration.g:544:4: () otherlv_4= 'reference' ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalRestControllerGeneration.g:544:4: ()
                    // InternalRestControllerGeneration.g:545:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeTypeAccess().getRefTypeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeTypeAccess().getReferenceKeyword_1_1());
                    			
                    // InternalRestControllerGeneration.g:555:4: ( (otherlv_5= RULE_ID ) )
                    // InternalRestControllerGeneration.g:556:5: (otherlv_5= RULE_ID )
                    {
                    // InternalRestControllerGeneration.g:556:5: (otherlv_5= RULE_ID )
                    // InternalRestControllerGeneration.g:557:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeTypeRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_5, grammarAccess.getAttributeTypeAccess().getTypeEntityCrossReference_1_2_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRestControllerGeneration.g:570:3: ( () otherlv_7= 'list' ( (otherlv_8= RULE_ID ) ) )
                    {
                    // InternalRestControllerGeneration.g:570:3: ( () otherlv_7= 'list' ( (otherlv_8= RULE_ID ) ) )
                    // InternalRestControllerGeneration.g:571:4: () otherlv_7= 'list' ( (otherlv_8= RULE_ID ) )
                    {
                    // InternalRestControllerGeneration.g:571:4: ()
                    // InternalRestControllerGeneration.g:572:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeTypeAccess().getListTypeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeTypeAccess().getListKeyword_2_1());
                    			
                    // InternalRestControllerGeneration.g:582:4: ( (otherlv_8= RULE_ID ) )
                    // InternalRestControllerGeneration.g:583:5: (otherlv_8= RULE_ID )
                    {
                    // InternalRestControllerGeneration.g:583:5: (otherlv_8= RULE_ID )
                    // InternalRestControllerGeneration.g:584:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeTypeRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_8, grammarAccess.getAttributeTypeAccess().getTypeEntityCrossReference_2_2_0());
                    					

                    }


                    }


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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleLogicRequirement"
    // InternalRestControllerGeneration.g:600:1: entryRuleLogicRequirement returns [EObject current=null] : iv_ruleLogicRequirement= ruleLogicRequirement EOF ;
    public final EObject entryRuleLogicRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicRequirement = null;


        try {
            // InternalRestControllerGeneration.g:600:57: (iv_ruleLogicRequirement= ruleLogicRequirement EOF )
            // InternalRestControllerGeneration.g:601:2: iv_ruleLogicRequirement= ruleLogicRequirement EOF
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
    // InternalRestControllerGeneration.g:607:1: ruleLogicRequirement returns [EObject current=null] : ( (lv_logic_0_0= ruleLogicExp ) ) ;
    public final EObject ruleLogicRequirement() throws RecognitionException {
        EObject current = null;

        EObject lv_logic_0_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:613:2: ( ( (lv_logic_0_0= ruleLogicExp ) ) )
            // InternalRestControllerGeneration.g:614:2: ( (lv_logic_0_0= ruleLogicExp ) )
            {
            // InternalRestControllerGeneration.g:614:2: ( (lv_logic_0_0= ruleLogicExp ) )
            // InternalRestControllerGeneration.g:615:3: (lv_logic_0_0= ruleLogicExp )
            {
            // InternalRestControllerGeneration.g:615:3: (lv_logic_0_0= ruleLogicExp )
            // InternalRestControllerGeneration.g:616:4: lv_logic_0_0= ruleLogicExp
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
    // InternalRestControllerGeneration.g:636:1: entryRuleExternalUse returns [EObject current=null] : iv_ruleExternalUse= ruleExternalUse EOF ;
    public final EObject entryRuleExternalUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalUse = null;


        try {
            // InternalRestControllerGeneration.g:636:52: (iv_ruleExternalUse= ruleExternalUse EOF )
            // InternalRestControllerGeneration.g:637:2: iv_ruleExternalUse= ruleExternalUse EOF
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
    // InternalRestControllerGeneration.g:643:1: ruleExternalUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleExternalUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:649:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:650:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRestControllerGeneration.g:650:2: ( (otherlv_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:651:3: (otherlv_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:651:3: (otherlv_0= RULE_ID )
            // InternalRestControllerGeneration.g:652:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleAttributeUse"
    // InternalRestControllerGeneration.g:666:1: entryRuleAttributeUse returns [EObject current=null] : iv_ruleAttributeUse= ruleAttributeUse EOF ;
    public final EObject entryRuleAttributeUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeUse = null;


        try {
            // InternalRestControllerGeneration.g:666:53: (iv_ruleAttributeUse= ruleAttributeUse EOF )
            // InternalRestControllerGeneration.g:667:2: iv_ruleAttributeUse= ruleAttributeUse EOF
            {
             newCompositeNode(grammarAccess.getAttributeUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeUse=ruleAttributeUse();

            state._fsp--;

             current =iv_ruleAttributeUse; 
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
    // $ANTLR end "entryRuleAttributeUse"


    // $ANTLR start "ruleAttributeUse"
    // InternalRestControllerGeneration.g:673:1: ruleAttributeUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleAttributeUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:679:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:680:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRestControllerGeneration.g:680:2: ( (otherlv_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:681:3: (otherlv_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:681:3: (otherlv_0= RULE_ID )
            // InternalRestControllerGeneration.g:682:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAttributeUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getAttributeUseAccess().getAttributeAttributeCrossReference_0());
            			

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
    // $ANTLR end "ruleAttributeUse"


    // $ANTLR start "entryRuleExternalUseOfAttribute"
    // InternalRestControllerGeneration.g:696:1: entryRuleExternalUseOfAttribute returns [EObject current=null] : iv_ruleExternalUseOfAttribute= ruleExternalUseOfAttribute EOF ;
    public final EObject entryRuleExternalUseOfAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalUseOfAttribute = null;


        try {
            // InternalRestControllerGeneration.g:696:63: (iv_ruleExternalUseOfAttribute= ruleExternalUseOfAttribute EOF )
            // InternalRestControllerGeneration.g:697:2: iv_ruleExternalUseOfAttribute= ruleExternalUseOfAttribute EOF
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
    // InternalRestControllerGeneration.g:703:1: ruleExternalUseOfAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'of' ( ( (lv_attribute_2_1= ruleAttributeUse | lv_attribute_2_2= ruleReference ) ) ) ) ;
    public final EObject ruleExternalUseOfAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_attribute_2_1 = null;

        EObject lv_attribute_2_2 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:709:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'of' ( ( (lv_attribute_2_1= ruleAttributeUse | lv_attribute_2_2= ruleReference ) ) ) ) )
            // InternalRestControllerGeneration.g:710:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'of' ( ( (lv_attribute_2_1= ruleAttributeUse | lv_attribute_2_2= ruleReference ) ) ) )
            {
            // InternalRestControllerGeneration.g:710:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'of' ( ( (lv_attribute_2_1= ruleAttributeUse | lv_attribute_2_2= ruleReference ) ) ) )
            // InternalRestControllerGeneration.g:711:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'of' ( ( (lv_attribute_2_1= ruleAttributeUse | lv_attribute_2_2= ruleReference ) ) )
            {
            // InternalRestControllerGeneration.g:711:3: ( (otherlv_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:712:4: (otherlv_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:712:4: (otherlv_0= RULE_ID )
            // InternalRestControllerGeneration.g:713:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalUseOfAttributeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalUseOfAttributeAccess().getExternalExternalDefCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalUseOfAttributeAccess().getOfKeyword_1());
            		
            // InternalRestControllerGeneration.g:728:3: ( ( (lv_attribute_2_1= ruleAttributeUse | lv_attribute_2_2= ruleReference ) ) )
            // InternalRestControllerGeneration.g:729:4: ( (lv_attribute_2_1= ruleAttributeUse | lv_attribute_2_2= ruleReference ) )
            {
            // InternalRestControllerGeneration.g:729:4: ( (lv_attribute_2_1= ruleAttributeUse | lv_attribute_2_2= ruleReference ) )
            // InternalRestControllerGeneration.g:730:5: (lv_attribute_2_1= ruleAttributeUse | lv_attribute_2_2= ruleReference )
            {
            // InternalRestControllerGeneration.g:730:5: (lv_attribute_2_1= ruleAttributeUse | lv_attribute_2_2= ruleReference )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==37) ) {
                    alt9=2;
                }
                else if ( (LA9_1==EOF||LA9_1==RULE_ID||LA9_1==17||LA9_1==23) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRestControllerGeneration.g:731:6: lv_attribute_2_1= ruleAttributeUse
                    {

                    						newCompositeNode(grammarAccess.getExternalUseOfAttributeAccess().getAttributeAttributeUseParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_attribute_2_1=ruleAttributeUse();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalUseOfAttributeRule());
                    						}
                    						set(
                    							current,
                    							"attribute",
                    							lv_attribute_2_1,
                    							"sdu.mdsd.restful.RestControllerGeneration.AttributeUse");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalRestControllerGeneration.g:747:6: lv_attribute_2_2= ruleReference
                    {

                    						newCompositeNode(grammarAccess.getExternalUseOfAttributeAccess().getAttributeReferenceParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_attribute_2_2=ruleReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalUseOfAttributeRule());
                    						}
                    						set(
                    							current,
                    							"attribute",
                    							lv_attribute_2_2,
                    							"sdu.mdsd.restful.RestControllerGeneration.Reference");
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
    // $ANTLR end "ruleExternalUseOfAttribute"


    // $ANTLR start "entryRuleRequirement"
    // InternalRestControllerGeneration.g:769:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalRestControllerGeneration.g:769:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalRestControllerGeneration.g:770:2: iv_ruleRequirement= ruleRequirement EOF
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
    // InternalRestControllerGeneration.g:776:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'require' ( ( (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute ) ) ) ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_requirement_1_1 = null;

        EObject lv_requirement_1_2 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:782:2: ( (otherlv_0= 'require' ( ( (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute ) ) ) ) )
            // InternalRestControllerGeneration.g:783:2: (otherlv_0= 'require' ( ( (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute ) ) ) )
            {
            // InternalRestControllerGeneration.g:783:2: (otherlv_0= 'require' ( ( (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute ) ) ) )
            // InternalRestControllerGeneration.g:784:3: otherlv_0= 'require' ( ( (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute ) ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequireKeyword_0());
            		
            // InternalRestControllerGeneration.g:788:3: ( ( (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute ) ) )
            // InternalRestControllerGeneration.g:789:4: ( (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute ) )
            {
            // InternalRestControllerGeneration.g:789:4: ( (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute ) )
            // InternalRestControllerGeneration.g:790:5: (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute )
            {
            // InternalRestControllerGeneration.g:790:5: (lv_requirement_1_1= ruleLogicRequirement | lv_requirement_1_2= ruleExternalUseOfAttribute )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=26 && LA10_1<=34)||LA10_1==37) ) {
                    alt10=1;
                }
                else if ( (LA10_1==22) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==RULE_INT||LA10_0==35) ) {
                alt10=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRestControllerGeneration.g:791:6: lv_requirement_1_1= ruleLogicRequirement
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
                    // InternalRestControllerGeneration.g:807:6: lv_requirement_1_2= ruleExternalUseOfAttribute
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
    // InternalRestControllerGeneration.g:829:1: entryRuleLogicExp returns [EObject current=null] : iv_ruleLogicExp= ruleLogicExp EOF ;
    public final EObject entryRuleLogicExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicExp = null;


        try {
            // InternalRestControllerGeneration.g:829:49: (iv_ruleLogicExp= ruleLogicExp EOF )
            // InternalRestControllerGeneration.g:830:2: iv_ruleLogicExp= ruleLogicExp EOF
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
    // InternalRestControllerGeneration.g:836:1: ruleLogicExp returns [EObject current=null] : (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleLogicExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Conjunction_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:842:2: ( (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // InternalRestControllerGeneration.g:843:2: (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // InternalRestControllerGeneration.g:843:2: (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* )
            // InternalRestControllerGeneration.g:844:3: this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicExpAccess().getConjunctionParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;


            			current = this_Conjunction_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRestControllerGeneration.g:852:3: (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:853:4: otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_10); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLogicExpAccess().getVerticalLineVerticalLineKeyword_1_0());
            	    			
            	    // InternalRestControllerGeneration.g:857:4: ()
            	    // InternalRestControllerGeneration.g:858:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getLogicExpAccess().getDisjunctionLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRestControllerGeneration.g:864:4: ( (lv_right_3_0= ruleConjunction ) )
            	    // InternalRestControllerGeneration.g:865:5: (lv_right_3_0= ruleConjunction )
            	    {
            	    // InternalRestControllerGeneration.g:865:5: (lv_right_3_0= ruleConjunction )
            	    // InternalRestControllerGeneration.g:866:6: lv_right_3_0= ruleConjunction
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
    // $ANTLR end "ruleLogicExp"


    // $ANTLR start "entryRuleConjunction"
    // InternalRestControllerGeneration.g:888:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // InternalRestControllerGeneration.g:888:52: (iv_ruleConjunction= ruleConjunction EOF )
            // InternalRestControllerGeneration.g:889:2: iv_ruleConjunction= ruleConjunction EOF
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
    // InternalRestControllerGeneration.g:895:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:901:2: ( (this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalRestControllerGeneration.g:902:2: (this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalRestControllerGeneration.g:902:2: (this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalRestControllerGeneration.g:903:3: this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRestControllerGeneration.g:911:3: (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:912:4: otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_10); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConjunctionAccess().getAmpersandAmpersandKeyword_1_0());
            	    			
            	    // InternalRestControllerGeneration.g:916:4: ()
            	    // InternalRestControllerGeneration.g:917:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRestControllerGeneration.g:923:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalRestControllerGeneration.g:924:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalRestControllerGeneration.g:924:5: (lv_right_3_0= ruleComparison )
            	    // InternalRestControllerGeneration.g:925:6: lv_right_3_0= ruleComparison
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
            	    break loop12;
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
    // InternalRestControllerGeneration.g:947:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalRestControllerGeneration.g:947:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalRestControllerGeneration.g:948:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalRestControllerGeneration.g:954:1: ruleComparison returns [EObject current=null] : ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:960:2: ( ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) ) ) )
            // InternalRestControllerGeneration.g:961:2: ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) ) )
            {
            // InternalRestControllerGeneration.g:961:2: ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) ) )
            // InternalRestControllerGeneration.g:962:3: ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) )
            {
            // InternalRestControllerGeneration.g:962:3: ( (lv_left_0_0= ruleExp ) )
            // InternalRestControllerGeneration.g:963:4: (lv_left_0_0= ruleExp )
            {
            // InternalRestControllerGeneration.g:963:4: (lv_left_0_0= ruleExp )
            // InternalRestControllerGeneration.g:964:5: lv_left_0_0= ruleExp
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

            // InternalRestControllerGeneration.g:981:3: ( (lv_op_1_0= ruleRelationalOp ) )
            // InternalRestControllerGeneration.g:982:4: (lv_op_1_0= ruleRelationalOp )
            {
            // InternalRestControllerGeneration.g:982:4: (lv_op_1_0= ruleRelationalOp )
            // InternalRestControllerGeneration.g:983:5: lv_op_1_0= ruleRelationalOp
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getOpRelationalOpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalRestControllerGeneration.g:1000:3: ( (lv_right_2_0= ruleExp ) )
            // InternalRestControllerGeneration.g:1001:4: (lv_right_2_0= ruleExp )
            {
            // InternalRestControllerGeneration.g:1001:4: (lv_right_2_0= ruleExp )
            // InternalRestControllerGeneration.g:1002:5: lv_right_2_0= ruleExp
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
    // InternalRestControllerGeneration.g:1023:1: entryRuleRelationalOp returns [EObject current=null] : iv_ruleRelationalOp= ruleRelationalOp EOF ;
    public final EObject entryRuleRelationalOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalOp = null;


        try {
            // InternalRestControllerGeneration.g:1023:53: (iv_ruleRelationalOp= ruleRelationalOp EOF )
            // InternalRestControllerGeneration.g:1024:2: iv_ruleRelationalOp= ruleRelationalOp EOF
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
    // InternalRestControllerGeneration.g:1030:1: ruleRelationalOp returns [EObject current=null] : ( ( () otherlv_1= '=' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '>=' ) ) ;
    public final EObject ruleRelationalOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1036:2: ( ( ( () otherlv_1= '=' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '>=' ) ) )
            // InternalRestControllerGeneration.g:1037:2: ( ( () otherlv_1= '=' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '>=' ) )
            {
            // InternalRestControllerGeneration.g:1037:2: ( ( () otherlv_1= '=' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '>=' ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            case 29:
                {
                alt13=4;
                }
                break;
            case 30:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRestControllerGeneration.g:1038:3: ( () otherlv_1= '=' )
                    {
                    // InternalRestControllerGeneration.g:1038:3: ( () otherlv_1= '=' )
                    // InternalRestControllerGeneration.g:1039:4: () otherlv_1= '='
                    {
                    // InternalRestControllerGeneration.g:1039:4: ()
                    // InternalRestControllerGeneration.g:1040:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelEQAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationalOpAccess().getEqualsSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRestControllerGeneration.g:1052:3: ( () otherlv_3= '<' )
                    {
                    // InternalRestControllerGeneration.g:1052:3: ( () otherlv_3= '<' )
                    // InternalRestControllerGeneration.g:1053:4: () otherlv_3= '<'
                    {
                    // InternalRestControllerGeneration.g:1053:4: ()
                    // InternalRestControllerGeneration.g:1054:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelLTAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelationalOpAccess().getLessThanSignKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRestControllerGeneration.g:1066:3: ( () otherlv_5= '>' )
                    {
                    // InternalRestControllerGeneration.g:1066:3: ( () otherlv_5= '>' )
                    // InternalRestControllerGeneration.g:1067:4: () otherlv_5= '>'
                    {
                    // InternalRestControllerGeneration.g:1067:4: ()
                    // InternalRestControllerGeneration.g:1068:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelGTAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getRelationalOpAccess().getGreaterThanSignKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRestControllerGeneration.g:1080:3: ( () otherlv_7= '<=' )
                    {
                    // InternalRestControllerGeneration.g:1080:3: ( () otherlv_7= '<=' )
                    // InternalRestControllerGeneration.g:1081:4: () otherlv_7= '<='
                    {
                    // InternalRestControllerGeneration.g:1081:4: ()
                    // InternalRestControllerGeneration.g:1082:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelLTEAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getRelationalOpAccess().getLessThanSignEqualsSignKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRestControllerGeneration.g:1094:3: ( () otherlv_9= '>=' )
                    {
                    // InternalRestControllerGeneration.g:1094:3: ( () otherlv_9= '>=' )
                    // InternalRestControllerGeneration.g:1095:4: () otherlv_9= '>='
                    {
                    // InternalRestControllerGeneration.g:1095:4: ()
                    // InternalRestControllerGeneration.g:1096:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelGTEAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,30,FOLLOW_2); 

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
    // InternalRestControllerGeneration.g:1111:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalRestControllerGeneration.g:1111:44: (iv_ruleExp= ruleExp EOF )
            // InternalRestControllerGeneration.g:1112:2: iv_ruleExp= ruleExp EOF
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
    // InternalRestControllerGeneration.g:1118:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1124:2: ( (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalRestControllerGeneration.g:1125:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalRestControllerGeneration.g:1125:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalRestControllerGeneration.g:1126:3: this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRestControllerGeneration.g:1134:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=31 && LA15_0<=32)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:1135:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalRestControllerGeneration.g:1135:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
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
            	            // InternalRestControllerGeneration.g:1136:5: (otherlv_1= '+' () )
            	            {
            	            // InternalRestControllerGeneration.g:1136:5: (otherlv_1= '+' () )
            	            // InternalRestControllerGeneration.g:1137:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,31,FOLLOW_10); 

            	            						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalRestControllerGeneration.g:1141:6: ()
            	            // InternalRestControllerGeneration.g:1142:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getAddLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRestControllerGeneration.g:1150:5: (otherlv_3= '-' () )
            	            {
            	            // InternalRestControllerGeneration.g:1150:5: (otherlv_3= '-' () )
            	            // InternalRestControllerGeneration.g:1151:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,32,FOLLOW_10); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalRestControllerGeneration.g:1155:6: ()
            	            // InternalRestControllerGeneration.g:1156:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getSubLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRestControllerGeneration.g:1164:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalRestControllerGeneration.g:1165:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalRestControllerGeneration.g:1165:5: (lv_right_5_0= ruleFactor )
            	    // InternalRestControllerGeneration.g:1166:6: lv_right_5_0= ruleFactor
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalRestControllerGeneration.g:1188:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalRestControllerGeneration.g:1188:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalRestControllerGeneration.g:1189:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalRestControllerGeneration.g:1195:1: ruleFactor returns [EObject current=null] : (this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primitive_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1201:2: ( (this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )* ) )
            // InternalRestControllerGeneration.g:1202:2: (this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )* )
            {
            // InternalRestControllerGeneration.g:1202:2: (this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )* )
            // InternalRestControllerGeneration.g:1203:3: this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimitiveParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Primitive_0=rulePrimitive();

            state._fsp--;


            			current = this_Primitive_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRestControllerGeneration.g:1211:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=33 && LA17_0<=34)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:1212:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) )
            	    {
            	    // InternalRestControllerGeneration.g:1212:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==33) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==34) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalRestControllerGeneration.g:1213:5: (otherlv_1= '*' () )
            	            {
            	            // InternalRestControllerGeneration.g:1213:5: (otherlv_1= '*' () )
            	            // InternalRestControllerGeneration.g:1214:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,33,FOLLOW_10); 

            	            						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalRestControllerGeneration.g:1218:6: ()
            	            // InternalRestControllerGeneration.g:1219:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMulLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRestControllerGeneration.g:1227:5: (otherlv_3= '/' () )
            	            {
            	            // InternalRestControllerGeneration.g:1227:5: (otherlv_3= '/' () )
            	            // InternalRestControllerGeneration.g:1228:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,34,FOLLOW_10); 

            	            						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalRestControllerGeneration.g:1232:6: ()
            	            // InternalRestControllerGeneration.g:1233:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRestControllerGeneration.g:1241:4: ( (lv_right_5_0= rulePrimitive ) )
            	    // InternalRestControllerGeneration.g:1242:5: (lv_right_5_0= rulePrimitive )
            	    {
            	    // InternalRestControllerGeneration.g:1242:5: (lv_right_5_0= rulePrimitive )
            	    // InternalRestControllerGeneration.g:1243:6: lv_right_5_0= rulePrimitive
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
            	    break loop17;
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
    // InternalRestControllerGeneration.g:1265:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalRestControllerGeneration.g:1265:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalRestControllerGeneration.g:1266:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalRestControllerGeneration.g:1272:1: rulePrimitive returns [EObject current=null] : (this_Name_0= ruleName | this_Reference_1= ruleReference | this_IntExp_2= ruleIntExp | (otherlv_3= '(' this_Exp_4= ruleExp otherlv_5= ')' ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Name_0 = null;

        EObject this_Reference_1 = null;

        EObject this_IntExp_2 = null;

        EObject this_Exp_4 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1278:2: ( (this_Name_0= ruleName | this_Reference_1= ruleReference | this_IntExp_2= ruleIntExp | (otherlv_3= '(' this_Exp_4= ruleExp otherlv_5= ')' ) ) )
            // InternalRestControllerGeneration.g:1279:2: (this_Name_0= ruleName | this_Reference_1= ruleReference | this_IntExp_2= ruleIntExp | (otherlv_3= '(' this_Exp_4= ruleExp otherlv_5= ')' ) )
            {
            // InternalRestControllerGeneration.g:1279:2: (this_Name_0= ruleName | this_Reference_1= ruleReference | this_IntExp_2= ruleIntExp | (otherlv_3= '(' this_Exp_4= ruleExp otherlv_5= ')' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==37) ) {
                    alt18=2;
                }
                else if ( (LA18_1==EOF||LA18_1==RULE_ID||LA18_1==17||(LA18_1>=23 && LA18_1<=34)||LA18_1==36) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt18=3;
                }
                break;
            case 35:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalRestControllerGeneration.g:1280:3: this_Name_0= ruleName
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
                    // InternalRestControllerGeneration.g:1289:3: this_Reference_1= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_1=ruleReference();

                    state._fsp--;


                    			current = this_Reference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRestControllerGeneration.g:1298:3: this_IntExp_2= ruleIntExp
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getIntExpParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntExp_2=ruleIntExp();

                    state._fsp--;


                    			current = this_IntExp_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRestControllerGeneration.g:1307:3: (otherlv_3= '(' this_Exp_4= ruleExp otherlv_5= ')' )
                    {
                    // InternalRestControllerGeneration.g:1307:3: (otherlv_3= '(' this_Exp_4= ruleExp otherlv_5= ')' )
                    // InternalRestControllerGeneration.g:1308:4: otherlv_3= '(' this_Exp_4= ruleExp otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimitiveAccess().getExpParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_17);
                    this_Exp_4=ruleExp();

                    state._fsp--;


                    				current = this_Exp_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // InternalRestControllerGeneration.g:1329:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalRestControllerGeneration.g:1329:45: (iv_ruleName= ruleName EOF )
            // InternalRestControllerGeneration.g:1330:2: iv_ruleName= ruleName EOF
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
    // InternalRestControllerGeneration.g:1336:1: ruleName returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1342:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1343:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRestControllerGeneration.g:1343:2: ( (otherlv_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:1344:3: (otherlv_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1344:3: (otherlv_0= RULE_ID )
            // InternalRestControllerGeneration.g:1345:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleReference"
    // InternalRestControllerGeneration.g:1359:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalRestControllerGeneration.g:1359:50: (iv_ruleReference= ruleReference EOF )
            // InternalRestControllerGeneration.g:1360:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalRestControllerGeneration.g:1366:1: ruleReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1372:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:1373:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:1373:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1374:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalRestControllerGeneration.g:1374:3: ( (otherlv_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:1375:4: (otherlv_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1375:4: (otherlv_0= RULE_ID )
            // InternalRestControllerGeneration.g:1376:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getReferenceAttributeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getFullStopKeyword_1());
            		
            // InternalRestControllerGeneration.g:1391:3: ( (otherlv_2= RULE_ID ) )
            // InternalRestControllerGeneration.g:1392:4: (otherlv_2= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1392:4: (otherlv_2= RULE_ID )
            // InternalRestControllerGeneration.g:1393:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getAttributeAttributeCrossReference_2_0());
            				

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleIntExp"
    // InternalRestControllerGeneration.g:1408:1: entryRuleIntExp returns [EObject current=null] : iv_ruleIntExp= ruleIntExp EOF ;
    public final EObject entryRuleIntExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExp = null;


        try {
            // InternalRestControllerGeneration.g:1408:47: (iv_ruleIntExp= ruleIntExp EOF )
            // InternalRestControllerGeneration.g:1409:2: iv_ruleIntExp= ruleIntExp EOF
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
    // InternalRestControllerGeneration.g:1415:1: ruleIntExp returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntExp() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1421:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRestControllerGeneration.g:1422:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRestControllerGeneration.g:1422:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalRestControllerGeneration.g:1423:3: (lv_value_0_0= RULE_INT )
            {
            // InternalRestControllerGeneration.g:1423:3: (lv_value_0_0= RULE_INT )
            // InternalRestControllerGeneration.g:1424:4: lv_value_0_0= RULE_INT
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
    // InternalRestControllerGeneration.g:1443:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalRestControllerGeneration.g:1443:51: (iv_ruleController= ruleController EOF )
            // InternalRestControllerGeneration.g:1444:2: iv_ruleController= ruleController EOF
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
    // InternalRestControllerGeneration.g:1450:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_methods_7_0= ruleMethodDef ) )* otherlv_8= '}' ) ;
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
            // InternalRestControllerGeneration.g:1456:2: ( (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_methods_7_0= ruleMethodDef ) )* otherlv_8= '}' ) )
            // InternalRestControllerGeneration.g:1457:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_methods_7_0= ruleMethodDef ) )* otherlv_8= '}' )
            {
            // InternalRestControllerGeneration.g:1457:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_methods_7_0= ruleMethodDef ) )* otherlv_8= '}' )
            // InternalRestControllerGeneration.g:1458:3: otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_methods_7_0= ruleMethodDef ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            // InternalRestControllerGeneration.g:1462:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:1463:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1463:4: (lv_name_1_0= RULE_ID )
            // InternalRestControllerGeneration.g:1464:5: lv_name_1_0= RULE_ID
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

            // InternalRestControllerGeneration.g:1480:3: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRestControllerGeneration.g:1481:4: otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getColonKeyword_2_0());
                    			
                    // InternalRestControllerGeneration.g:1485:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRestControllerGeneration.g:1486:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRestControllerGeneration.g:1486:5: (otherlv_3= RULE_ID )
                    // InternalRestControllerGeneration.g:1487:6: otherlv_3= RULE_ID
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

            otherlv_4=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getControllerAccess().getUsesKeyword_3());
            		
            // InternalRestControllerGeneration.g:1503:3: ( (otherlv_5= RULE_ID ) )
            // InternalRestControllerGeneration.g:1504:4: (otherlv_5= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1504:4: (otherlv_5= RULE_ID )
            // InternalRestControllerGeneration.g:1505:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getEntityEntityCrossReference_4_0());
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalRestControllerGeneration.g:1520:3: ( (lv_methods_7_0= ruleMethodDef ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40||LA20_0==44||(LA20_0>=46 && LA20_0<=48)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:1521:4: (lv_methods_7_0= ruleMethodDef )
            	    {
            	    // InternalRestControllerGeneration.g:1521:4: (lv_methods_7_0= ruleMethodDef )
            	    // InternalRestControllerGeneration.g:1522:5: lv_methods_7_0= ruleMethodDef
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
            	    break loop20;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalRestControllerGeneration.g:1547:1: entryRuleMethodDef returns [EObject current=null] : iv_ruleMethodDef= ruleMethodDef EOF ;
    public final EObject entryRuleMethodDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDef = null;


        try {
            // InternalRestControllerGeneration.g:1547:50: (iv_ruleMethodDef= ruleMethodDef EOF )
            // InternalRestControllerGeneration.g:1548:2: iv_ruleMethodDef= ruleMethodDef EOF
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
    // InternalRestControllerGeneration.g:1554:1: ruleMethodDef returns [EObject current=null] : this_MethodType_0= ruleMethodType ;
    public final EObject ruleMethodDef() throws RecognitionException {
        EObject current = null;

        EObject this_MethodType_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1560:2: (this_MethodType_0= ruleMethodType )
            // InternalRestControllerGeneration.g:1561:2: this_MethodType_0= ruleMethodType
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
    // InternalRestControllerGeneration.g:1572:1: entryRuleMethodType returns [EObject current=null] : iv_ruleMethodType= ruleMethodType EOF ;
    public final EObject entryRuleMethodType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodType = null;


        try {
            // InternalRestControllerGeneration.g:1572:51: (iv_ruleMethodType= ruleMethodType EOF )
            // InternalRestControllerGeneration.g:1573:2: iv_ruleMethodType= ruleMethodType EOF
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
    // InternalRestControllerGeneration.g:1579:1: ruleMethodType returns [EObject current=null] : (this_CreateMethod_0= ruleCreateMethod | this_GetMethod_1= ruleGetMethod | this_ListMethod_2= ruleListMethod | this_UpdateMethod_3= ruleUpdateMethod | this_DeleteMethod_4= ruleDeleteMethod ) ;
    public final EObject ruleMethodType() throws RecognitionException {
        EObject current = null;

        EObject this_CreateMethod_0 = null;

        EObject this_GetMethod_1 = null;

        EObject this_ListMethod_2 = null;

        EObject this_UpdateMethod_3 = null;

        EObject this_DeleteMethod_4 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1585:2: ( (this_CreateMethod_0= ruleCreateMethod | this_GetMethod_1= ruleGetMethod | this_ListMethod_2= ruleListMethod | this_UpdateMethod_3= ruleUpdateMethod | this_DeleteMethod_4= ruleDeleteMethod ) )
            // InternalRestControllerGeneration.g:1586:2: (this_CreateMethod_0= ruleCreateMethod | this_GetMethod_1= ruleGetMethod | this_ListMethod_2= ruleListMethod | this_UpdateMethod_3= ruleUpdateMethod | this_DeleteMethod_4= ruleDeleteMethod )
            {
            // InternalRestControllerGeneration.g:1586:2: (this_CreateMethod_0= ruleCreateMethod | this_GetMethod_1= ruleGetMethod | this_ListMethod_2= ruleListMethod | this_UpdateMethod_3= ruleUpdateMethod | this_DeleteMethod_4= ruleDeleteMethod )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt21=1;
                }
                break;
            case 44:
                {
                alt21=2;
                }
                break;
            case 46:
                {
                alt21=3;
                }
                break;
            case 47:
                {
                alt21=4;
                }
                break;
            case 48:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalRestControllerGeneration.g:1587:3: this_CreateMethod_0= ruleCreateMethod
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
                    // InternalRestControllerGeneration.g:1596:3: this_GetMethod_1= ruleGetMethod
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
                    // InternalRestControllerGeneration.g:1605:3: this_ListMethod_2= ruleListMethod
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
                    // InternalRestControllerGeneration.g:1614:3: this_UpdateMethod_3= ruleUpdateMethod
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
                    // InternalRestControllerGeneration.g:1623:3: this_DeleteMethod_4= ruleDeleteMethod
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
    // InternalRestControllerGeneration.g:1635:1: entryRuleCreateMethod returns [EObject current=null] : iv_ruleCreateMethod= ruleCreateMethod EOF ;
    public final EObject entryRuleCreateMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateMethod = null;


        try {
            // InternalRestControllerGeneration.g:1635:53: (iv_ruleCreateMethod= ruleCreateMethod EOF )
            // InternalRestControllerGeneration.g:1636:2: iv_ruleCreateMethod= ruleCreateMethod EOF
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
    // InternalRestControllerGeneration.g:1642:1: ruleCreateMethod returns [EObject current=null] : ( () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )? ) ;
    public final EObject ruleCreateMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_withEntity_2_0 = null;

        EObject lv_exclude_3_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1648:2: ( ( () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )? ) )
            // InternalRestControllerGeneration.g:1649:2: ( () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )? )
            {
            // InternalRestControllerGeneration.g:1649:2: ( () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )? )
            // InternalRestControllerGeneration.g:1650:3: () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )?
            {
            // InternalRestControllerGeneration.g:1650:3: ()
            // InternalRestControllerGeneration.g:1651:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCreateMethodAccess().getCreateMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateMethodAccess().getCREATEKeyword_1());
            		
            // InternalRestControllerGeneration.g:1661:3: ( (lv_withEntity_2_0= ruleCreateMethodWith ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRestControllerGeneration.g:1662:4: (lv_withEntity_2_0= ruleCreateMethodWith )
                    {
                    // InternalRestControllerGeneration.g:1662:4: (lv_withEntity_2_0= ruleCreateMethodWith )
                    // InternalRestControllerGeneration.g:1663:5: lv_withEntity_2_0= ruleCreateMethodWith
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

            // InternalRestControllerGeneration.g:1680:3: ( (lv_exclude_3_0= ruleCreateMethodExclude ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRestControllerGeneration.g:1681:4: (lv_exclude_3_0= ruleCreateMethodExclude )
                    {
                    // InternalRestControllerGeneration.g:1681:4: (lv_exclude_3_0= ruleCreateMethodExclude )
                    // InternalRestControllerGeneration.g:1682:5: lv_exclude_3_0= ruleCreateMethodExclude
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
    // InternalRestControllerGeneration.g:1703:1: entryRuleCreateMethodWith returns [EObject current=null] : iv_ruleCreateMethodWith= ruleCreateMethodWith EOF ;
    public final EObject entryRuleCreateMethodWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateMethodWith = null;


        try {
            // InternalRestControllerGeneration.g:1703:57: (iv_ruleCreateMethodWith= ruleCreateMethodWith EOF )
            // InternalRestControllerGeneration.g:1704:2: iv_ruleCreateMethodWith= ruleCreateMethodWith EOF
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
    // InternalRestControllerGeneration.g:1710:1: ruleCreateMethodWith returns [EObject current=null] : (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleCreateMethodWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1716:2: ( (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:1717:2: (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:1717:2: (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1718:3: otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateMethodWithAccess().getWithKeyword_0());
            		
            // InternalRestControllerGeneration.g:1722:3: ( (otherlv_1= RULE_ID ) )
            // InternalRestControllerGeneration.g:1723:4: (otherlv_1= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1723:4: (otherlv_1= RULE_ID )
            // InternalRestControllerGeneration.g:1724:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateMethodWithRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_1, grammarAccess.getCreateMethodWithAccess().getEntityEntityCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateMethodWithAccess().getColonKeyword_2());
            		
            // InternalRestControllerGeneration.g:1739:3: ( (otherlv_3= RULE_ID ) )
            // InternalRestControllerGeneration.g:1740:4: (otherlv_3= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1740:4: (otherlv_3= RULE_ID )
            // InternalRestControllerGeneration.g:1741:5: otherlv_3= RULE_ID
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
    // InternalRestControllerGeneration.g:1756:1: entryRuleCreateMethodExclude returns [EObject current=null] : iv_ruleCreateMethodExclude= ruleCreateMethodExclude EOF ;
    public final EObject entryRuleCreateMethodExclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateMethodExclude = null;


        try {
            // InternalRestControllerGeneration.g:1756:60: (iv_ruleCreateMethodExclude= ruleCreateMethodExclude EOF )
            // InternalRestControllerGeneration.g:1757:2: iv_ruleCreateMethodExclude= ruleCreateMethodExclude EOF
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
    // InternalRestControllerGeneration.g:1763:1: ruleCreateMethodExclude returns [EObject current=null] : (otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleCreateMethodExclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1769:2: ( (otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalRestControllerGeneration.g:1770:2: (otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalRestControllerGeneration.g:1770:2: (otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalRestControllerGeneration.g:1771:3: otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateMethodExcludeAccess().getExcludeKeyword_0());
            		
            // InternalRestControllerGeneration.g:1775:3: ( (otherlv_1= RULE_ID ) )
            // InternalRestControllerGeneration.g:1776:4: (otherlv_1= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1776:4: (otherlv_1= RULE_ID )
            // InternalRestControllerGeneration.g:1777:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateMethodExcludeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_1, grammarAccess.getCreateMethodExcludeAccess().getAttributesAttributeCrossReference_1_0());
            				

            }


            }

            // InternalRestControllerGeneration.g:1788:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==43) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:1789:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,43,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getCreateMethodExcludeAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalRestControllerGeneration.g:1793:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalRestControllerGeneration.g:1794:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalRestControllerGeneration.g:1794:5: (otherlv_3= RULE_ID )
            	    // InternalRestControllerGeneration.g:1795:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCreateMethodExcludeRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    						newLeafNode(otherlv_3, grammarAccess.getCreateMethodExcludeAccess().getAttributesAttributeCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalRestControllerGeneration.g:1811:1: entryRuleGetMethod returns [EObject current=null] : iv_ruleGetMethod= ruleGetMethod EOF ;
    public final EObject entryRuleGetMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetMethod = null;


        try {
            // InternalRestControllerGeneration.g:1811:50: (iv_ruleGetMethod= ruleGetMethod EOF )
            // InternalRestControllerGeneration.g:1812:2: iv_ruleGetMethod= ruleGetMethod EOF
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
    // InternalRestControllerGeneration.g:1818:1: ruleGetMethod returns [EObject current=null] : (otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleGetMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1824:2: ( (otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:1825:2: (otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:1825:2: (otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1826:3: otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getGetMethodAccess().getGETKeyword_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGetMethodAccess().getOnKeyword_1());
            		
            // InternalRestControllerGeneration.g:1834:3: ( (otherlv_2= RULE_ID ) )
            // InternalRestControllerGeneration.g:1835:4: (otherlv_2= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1835:4: (otherlv_2= RULE_ID )
            // InternalRestControllerGeneration.g:1836:5: otherlv_2= RULE_ID
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
    // InternalRestControllerGeneration.g:1851:1: entryRuleListMethod returns [EObject current=null] : iv_ruleListMethod= ruleListMethod EOF ;
    public final EObject entryRuleListMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListMethod = null;


        try {
            // InternalRestControllerGeneration.g:1851:51: (iv_ruleListMethod= ruleListMethod EOF )
            // InternalRestControllerGeneration.g:1852:2: iv_ruleListMethod= ruleListMethod EOF
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
    // InternalRestControllerGeneration.g:1858:1: ruleListMethod returns [EObject current=null] : ( () otherlv_1= 'LIST' ) ;
    public final EObject ruleListMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1864:2: ( ( () otherlv_1= 'LIST' ) )
            // InternalRestControllerGeneration.g:1865:2: ( () otherlv_1= 'LIST' )
            {
            // InternalRestControllerGeneration.g:1865:2: ( () otherlv_1= 'LIST' )
            // InternalRestControllerGeneration.g:1866:3: () otherlv_1= 'LIST'
            {
            // InternalRestControllerGeneration.g:1866:3: ()
            // InternalRestControllerGeneration.g:1867:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListMethodAccess().getListMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

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
    // InternalRestControllerGeneration.g:1881:1: entryRuleUpdateMethod returns [EObject current=null] : iv_ruleUpdateMethod= ruleUpdateMethod EOF ;
    public final EObject entryRuleUpdateMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateMethod = null;


        try {
            // InternalRestControllerGeneration.g:1881:53: (iv_ruleUpdateMethod= ruleUpdateMethod EOF )
            // InternalRestControllerGeneration.g:1882:2: iv_ruleUpdateMethod= ruleUpdateMethod EOF
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
    // InternalRestControllerGeneration.g:1888:1: ruleUpdateMethod returns [EObject current=null] : (otherlv_0= 'UPDATE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ) ;
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
            // InternalRestControllerGeneration.g:1894:2: ( (otherlv_0= 'UPDATE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ) )
            // InternalRestControllerGeneration.g:1895:2: (otherlv_0= 'UPDATE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )
            {
            // InternalRestControllerGeneration.g:1895:2: (otherlv_0= 'UPDATE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )
            // InternalRestControllerGeneration.g:1896:3: otherlv_0= 'UPDATE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,47,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateMethodAccess().getUPDATEKeyword_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateMethodAccess().getOnKeyword_1());
            		
            // InternalRestControllerGeneration.g:1904:3: ( (otherlv_2= RULE_ID ) )
            // InternalRestControllerGeneration.g:1905:4: (otherlv_2= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1905:4: (otherlv_2= RULE_ID )
            // InternalRestControllerGeneration.g:1906:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdateMethodRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_2, grammarAccess.getUpdateMethodAccess().getEntityIdAttributeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getUpdateMethodAccess().getWithKeyword_3());
            		
            // InternalRestControllerGeneration.g:1921:3: ( (otherlv_4= RULE_ID ) )
            // InternalRestControllerGeneration.g:1922:4: (otherlv_4= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1922:4: (otherlv_4= RULE_ID )
            // InternalRestControllerGeneration.g:1923:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdateMethodRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_4, grammarAccess.getUpdateMethodAccess().getAttributesAttributeCrossReference_4_0());
            				

            }


            }

            // InternalRestControllerGeneration.g:1934:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==43) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:1935:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,43,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getUpdateMethodAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRestControllerGeneration.g:1939:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalRestControllerGeneration.g:1940:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalRestControllerGeneration.g:1940:5: (otherlv_6= RULE_ID )
            	    // InternalRestControllerGeneration.g:1941:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUpdateMethodRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    						newLeafNode(otherlv_6, grammarAccess.getUpdateMethodAccess().getAttributesAttributeCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalRestControllerGeneration.g:1957:1: entryRuleDeleteMethod returns [EObject current=null] : iv_ruleDeleteMethod= ruleDeleteMethod EOF ;
    public final EObject entryRuleDeleteMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteMethod = null;


        try {
            // InternalRestControllerGeneration.g:1957:53: (iv_ruleDeleteMethod= ruleDeleteMethod EOF )
            // InternalRestControllerGeneration.g:1958:2: iv_ruleDeleteMethod= ruleDeleteMethod EOF
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
    // InternalRestControllerGeneration.g:1964:1: ruleDeleteMethod returns [EObject current=null] : (otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDeleteMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1970:2: ( (otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:1971:2: (otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:1971:2: (otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1972:3: otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteMethodAccess().getDELETEKeyword_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteMethodAccess().getOnKeyword_1());
            		
            // InternalRestControllerGeneration.g:1980:3: ( (otherlv_2= RULE_ID ) )
            // InternalRestControllerGeneration.g:1981:4: (otherlv_2= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1981:4: (otherlv_2= RULE_ID )
            // InternalRestControllerGeneration.g:1982:5: otherlv_2= RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000007002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000820010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001D10000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});

}