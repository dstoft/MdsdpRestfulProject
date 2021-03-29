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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'type'", "'entity'", "':'", "'{'", "'}'", "'require'", "'external'", "'||'", "'&&'", "'='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'controller'", "'CREATE'", "'with'", "'exclude'", "'GET'", "'on'", "'LIST'", "'UPDATE'", "','", "'DELETE'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalRestControllerGeneration.g:71:1: ruleEntityModel returns [EObject current=null] : ( (lv_declarations_0_0= ruleDeclaration ) )* ;
    public final EObject ruleEntityModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:77:2: ( ( (lv_declarations_0_0= ruleDeclaration ) )* )
            // InternalRestControllerGeneration.g:78:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            {
            // InternalRestControllerGeneration.g:78:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:79:3: (lv_declarations_0_0= ruleDeclaration )
            	    {
            	    // InternalRestControllerGeneration.g:79:3: (lv_declarations_0_0= ruleDeclaration )
            	    // InternalRestControllerGeneration.g:80:4: lv_declarations_0_0= ruleDeclaration
            	    {

            	    				newCompositeNode(grammarAccess.getEntityModelAccess().getDeclarationsDeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_declarations_0_0=ruleDeclaration();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getEntityModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"declarations",
            	    					lv_declarations_0_0,
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
    // InternalRestControllerGeneration.g:100:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalRestControllerGeneration.g:100:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalRestControllerGeneration.g:101:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalRestControllerGeneration.g:107:1: ruleDeclaration returns [EObject current=null] : (this_Type_0= ruleType | this_Entity_1= ruleEntity | this_Controller_2= ruleController ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_Entity_1 = null;

        EObject this_Controller_2 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:113:2: ( (this_Type_0= ruleType | this_Entity_1= ruleEntity | this_Controller_2= ruleController ) )
            // InternalRestControllerGeneration.g:114:2: (this_Type_0= ruleType | this_Entity_1= ruleEntity | this_Controller_2= ruleController )
            {
            // InternalRestControllerGeneration.g:114:2: (this_Type_0= ruleType | this_Entity_1= ruleEntity | this_Controller_2= ruleController )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRestControllerGeneration.g:115:3: this_Type_0= ruleType
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
                    // InternalRestControllerGeneration.g:124:3: this_Entity_1= ruleEntity
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
                    // InternalRestControllerGeneration.g:133:3: this_Controller_2= ruleController
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getControllerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Controller_2=ruleController();

                    state._fsp--;


                    			current = this_Controller_2;
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
    // InternalRestControllerGeneration.g:145:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalRestControllerGeneration.g:145:45: (iv_ruleType= ruleType EOF )
            // InternalRestControllerGeneration.g:146:2: iv_ruleType= ruleType EOF
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
    // InternalRestControllerGeneration.g:152:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:158:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:159:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:159:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:160:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalRestControllerGeneration.g:164:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:165:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:165:4: (lv_name_1_0= RULE_ID )
            // InternalRestControllerGeneration.g:166:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleEntity"
    // InternalRestControllerGeneration.g:186:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalRestControllerGeneration.g:186:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalRestControllerGeneration.g:187:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalRestControllerGeneration.g:193:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) ;
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
            // InternalRestControllerGeneration.g:199:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) )
            // InternalRestControllerGeneration.g:200:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            {
            // InternalRestControllerGeneration.g:200:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            // InternalRestControllerGeneration.g:201:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalRestControllerGeneration.g:205:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:206:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:206:4: (lv_name_1_0= RULE_ID )
            // InternalRestControllerGeneration.g:207:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            // InternalRestControllerGeneration.g:223:3: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRestControllerGeneration.g:224:4: otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getColonKeyword_2_0());
                    			
                    // InternalRestControllerGeneration.g:228:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRestControllerGeneration.g:229:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRestControllerGeneration.g:229:5: (otherlv_3= RULE_ID )
                    // InternalRestControllerGeneration.g:230:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRestControllerGeneration.g:246:3: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:247:4: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalRestControllerGeneration.g:247:4: (lv_attributes_5_0= ruleAttribute )
            	    // InternalRestControllerGeneration.g:248:5: lv_attributes_5_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
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

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRestControllerGeneration.g:273:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRestControllerGeneration.g:273:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRestControllerGeneration.g:274:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalRestControllerGeneration.g:280:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (lv_requirement_3_1= ruleAttributeRequirement | lv_requirement_3_2= ruleExternalFunction ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_requirement_3_1 = null;

        EObject lv_requirement_3_2 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:286:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (lv_requirement_3_1= ruleAttributeRequirement | lv_requirement_3_2= ruleExternalFunction ) ) )? ) )
            // InternalRestControllerGeneration.g:287:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (lv_requirement_3_1= ruleAttributeRequirement | lv_requirement_3_2= ruleExternalFunction ) ) )? )
            {
            // InternalRestControllerGeneration.g:287:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (lv_requirement_3_1= ruleAttributeRequirement | lv_requirement_3_2= ruleExternalFunction ) ) )? )
            // InternalRestControllerGeneration.g:288:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (lv_requirement_3_1= ruleAttributeRequirement | lv_requirement_3_2= ruleExternalFunction ) ) )?
            {
            // InternalRestControllerGeneration.g:288:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:289:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:289:4: (lv_name_0_0= RULE_ID )
            // InternalRestControllerGeneration.g:290:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalRestControllerGeneration.g:310:3: ( (otherlv_2= RULE_ID ) )
            // InternalRestControllerGeneration.g:311:4: (otherlv_2= RULE_ID )
            {
            // InternalRestControllerGeneration.g:311:4: (otherlv_2= RULE_ID )
            // InternalRestControllerGeneration.g:312:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0());
            				

            }


            }

            // InternalRestControllerGeneration.g:323:3: ( ( (lv_requirement_3_1= ruleAttributeRequirement | lv_requirement_3_2= ruleExternalFunction ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=16 && LA6_0<=17)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRestControllerGeneration.g:324:4: ( (lv_requirement_3_1= ruleAttributeRequirement | lv_requirement_3_2= ruleExternalFunction ) )
                    {
                    // InternalRestControllerGeneration.g:324:4: ( (lv_requirement_3_1= ruleAttributeRequirement | lv_requirement_3_2= ruleExternalFunction ) )
                    // InternalRestControllerGeneration.g:325:5: (lv_requirement_3_1= ruleAttributeRequirement | lv_requirement_3_2= ruleExternalFunction )
                    {
                    // InternalRestControllerGeneration.g:325:5: (lv_requirement_3_1= ruleAttributeRequirement | lv_requirement_3_2= ruleExternalFunction )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==16) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==17) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalRestControllerGeneration.g:326:6: lv_requirement_3_1= ruleAttributeRequirement
                            {

                            						newCompositeNode(grammarAccess.getAttributeAccess().getRequirementAttributeRequirementParserRuleCall_3_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_requirement_3_1=ruleAttributeRequirement();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAttributeRule());
                            						}
                            						set(
                            							current,
                            							"requirement",
                            							lv_requirement_3_1,
                            							"sdu.mdsd.restful.RestControllerGeneration.AttributeRequirement");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;
                        case 2 :
                            // InternalRestControllerGeneration.g:342:6: lv_requirement_3_2= ruleExternalFunction
                            {

                            						newCompositeNode(grammarAccess.getAttributeAccess().getRequirementExternalFunctionParserRuleCall_3_0_1());
                            					
                            pushFollow(FOLLOW_2);
                            lv_requirement_3_2=ruleExternalFunction();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAttributeRule());
                            						}
                            						set(
                            							current,
                            							"requirement",
                            							lv_requirement_3_2,
                            							"sdu.mdsd.restful.RestControllerGeneration.ExternalFunction");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

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
    // InternalRestControllerGeneration.g:364:1: entryRuleAttributeRequirement returns [EObject current=null] : iv_ruleAttributeRequirement= ruleAttributeRequirement EOF ;
    public final EObject entryRuleAttributeRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeRequirement = null;


        try {
            // InternalRestControllerGeneration.g:364:61: (iv_ruleAttributeRequirement= ruleAttributeRequirement EOF )
            // InternalRestControllerGeneration.g:365:2: iv_ruleAttributeRequirement= ruleAttributeRequirement EOF
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
    // InternalRestControllerGeneration.g:371:1: ruleAttributeRequirement returns [EObject current=null] : (otherlv_0= 'require' ( (lv_logic_1_0= ruleLogicExp ) ) ) ;
    public final EObject ruleAttributeRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_logic_1_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:377:2: ( (otherlv_0= 'require' ( (lv_logic_1_0= ruleLogicExp ) ) ) )
            // InternalRestControllerGeneration.g:378:2: (otherlv_0= 'require' ( (lv_logic_1_0= ruleLogicExp ) ) )
            {
            // InternalRestControllerGeneration.g:378:2: (otherlv_0= 'require' ( (lv_logic_1_0= ruleLogicExp ) ) )
            // InternalRestControllerGeneration.g:379:3: otherlv_0= 'require' ( (lv_logic_1_0= ruleLogicExp ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeRequirementAccess().getRequireKeyword_0());
            		
            // InternalRestControllerGeneration.g:383:3: ( (lv_logic_1_0= ruleLogicExp ) )
            // InternalRestControllerGeneration.g:384:4: (lv_logic_1_0= ruleLogicExp )
            {
            // InternalRestControllerGeneration.g:384:4: (lv_logic_1_0= ruleLogicExp )
            // InternalRestControllerGeneration.g:385:5: lv_logic_1_0= ruleLogicExp
            {

            					newCompositeNode(grammarAccess.getAttributeRequirementAccess().getLogicLogicExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_logic_1_0=ruleLogicExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRequirementRule());
            					}
            					set(
            						current,
            						"logic",
            						lv_logic_1_0,
            						"sdu.mdsd.restful.RestControllerGeneration.LogicExp");
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
    // $ANTLR end "ruleAttributeRequirement"


    // $ANTLR start "entryRuleExternalFunction"
    // InternalRestControllerGeneration.g:406:1: entryRuleExternalFunction returns [EObject current=null] : iv_ruleExternalFunction= ruleExternalFunction EOF ;
    public final EObject entryRuleExternalFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalFunction = null;


        try {
            // InternalRestControllerGeneration.g:406:57: (iv_ruleExternalFunction= ruleExternalFunction EOF )
            // InternalRestControllerGeneration.g:407:2: iv_ruleExternalFunction= ruleExternalFunction EOF
            {
             newCompositeNode(grammarAccess.getExternalFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalFunction=ruleExternalFunction();

            state._fsp--;

             current =iv_ruleExternalFunction; 
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
    // $ANTLR end "entryRuleExternalFunction"


    // $ANTLR start "ruleExternalFunction"
    // InternalRestControllerGeneration.g:413:1: ruleExternalFunction returns [EObject current=null] : (otherlv_0= 'external' ( (lv_externalFunc_1_0= RULE_ID ) ) ) ;
    public final EObject ruleExternalFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_externalFunc_1_0=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:419:2: ( (otherlv_0= 'external' ( (lv_externalFunc_1_0= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:420:2: (otherlv_0= 'external' ( (lv_externalFunc_1_0= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:420:2: (otherlv_0= 'external' ( (lv_externalFunc_1_0= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:421:3: otherlv_0= 'external' ( (lv_externalFunc_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalFunctionAccess().getExternalKeyword_0());
            		
            // InternalRestControllerGeneration.g:425:3: ( (lv_externalFunc_1_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:426:4: (lv_externalFunc_1_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:426:4: (lv_externalFunc_1_0= RULE_ID )
            // InternalRestControllerGeneration.g:427:5: lv_externalFunc_1_0= RULE_ID
            {
            lv_externalFunc_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_externalFunc_1_0, grammarAccess.getExternalFunctionAccess().getExternalFuncIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"externalFunc",
            						lv_externalFunc_1_0,
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
    // $ANTLR end "ruleExternalFunction"


    // $ANTLR start "entryRuleLogicExp"
    // InternalRestControllerGeneration.g:447:1: entryRuleLogicExp returns [EObject current=null] : iv_ruleLogicExp= ruleLogicExp EOF ;
    public final EObject entryRuleLogicExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicExp = null;


        try {
            // InternalRestControllerGeneration.g:447:49: (iv_ruleLogicExp= ruleLogicExp EOF )
            // InternalRestControllerGeneration.g:448:2: iv_ruleLogicExp= ruleLogicExp EOF
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
    // InternalRestControllerGeneration.g:454:1: ruleLogicExp returns [EObject current=null] : (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleLogicExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Conjunction_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:460:2: ( (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // InternalRestControllerGeneration.g:461:2: (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // InternalRestControllerGeneration.g:461:2: (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* )
            // InternalRestControllerGeneration.g:462:3: this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicExpAccess().getConjunctionParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;


            			current = this_Conjunction_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRestControllerGeneration.g:470:3: (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:471:4: otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_10); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLogicExpAccess().getVerticalLineVerticalLineKeyword_1_0());
            	    			
            	    // InternalRestControllerGeneration.g:475:4: ()
            	    // InternalRestControllerGeneration.g:476:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getLogicExpAccess().getDisjunctionLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRestControllerGeneration.g:482:4: ( (lv_right_3_0= ruleConjunction ) )
            	    // InternalRestControllerGeneration.g:483:5: (lv_right_3_0= ruleConjunction )
            	    {
            	    // InternalRestControllerGeneration.g:483:5: (lv_right_3_0= ruleConjunction )
            	    // InternalRestControllerGeneration.g:484:6: lv_right_3_0= ruleConjunction
            	    {

            	    						newCompositeNode(grammarAccess.getLogicExpAccess().getRightConjunctionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
    // InternalRestControllerGeneration.g:506:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // InternalRestControllerGeneration.g:506:52: (iv_ruleConjunction= ruleConjunction EOF )
            // InternalRestControllerGeneration.g:507:2: iv_ruleConjunction= ruleConjunction EOF
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
    // InternalRestControllerGeneration.g:513:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:519:2: ( (this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalRestControllerGeneration.g:520:2: (this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalRestControllerGeneration.g:520:2: (this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalRestControllerGeneration.g:521:3: this_Comparison_0= ruleComparison (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRestControllerGeneration.g:529:3: (otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:530:4: otherlv_1= '&&' () ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_10); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConjunctionAccess().getAmpersandAmpersandKeyword_1_0());
            	    			
            	    // InternalRestControllerGeneration.g:534:4: ()
            	    // InternalRestControllerGeneration.g:535:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRestControllerGeneration.g:541:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalRestControllerGeneration.g:542:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalRestControllerGeneration.g:542:5: (lv_right_3_0= ruleComparison )
            	    // InternalRestControllerGeneration.g:543:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
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
    // InternalRestControllerGeneration.g:565:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalRestControllerGeneration.g:565:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalRestControllerGeneration.g:566:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalRestControllerGeneration.g:572:1: ruleComparison returns [EObject current=null] : ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:578:2: ( ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) ) ) )
            // InternalRestControllerGeneration.g:579:2: ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) ) )
            {
            // InternalRestControllerGeneration.g:579:2: ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) ) )
            // InternalRestControllerGeneration.g:580:3: ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleRelationalOp ) ) ( (lv_right_2_0= ruleExp ) )
            {
            // InternalRestControllerGeneration.g:580:3: ( (lv_left_0_0= ruleExp ) )
            // InternalRestControllerGeneration.g:581:4: (lv_left_0_0= ruleExp )
            {
            // InternalRestControllerGeneration.g:581:4: (lv_left_0_0= ruleExp )
            // InternalRestControllerGeneration.g:582:5: lv_left_0_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getLeftExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalRestControllerGeneration.g:599:3: ( (lv_op_1_0= ruleRelationalOp ) )
            // InternalRestControllerGeneration.g:600:4: (lv_op_1_0= ruleRelationalOp )
            {
            // InternalRestControllerGeneration.g:600:4: (lv_op_1_0= ruleRelationalOp )
            // InternalRestControllerGeneration.g:601:5: lv_op_1_0= ruleRelationalOp
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

            // InternalRestControllerGeneration.g:618:3: ( (lv_right_2_0= ruleExp ) )
            // InternalRestControllerGeneration.g:619:4: (lv_right_2_0= ruleExp )
            {
            // InternalRestControllerGeneration.g:619:4: (lv_right_2_0= ruleExp )
            // InternalRestControllerGeneration.g:620:5: lv_right_2_0= ruleExp
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
    // InternalRestControllerGeneration.g:641:1: entryRuleRelationalOp returns [EObject current=null] : iv_ruleRelationalOp= ruleRelationalOp EOF ;
    public final EObject entryRuleRelationalOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalOp = null;


        try {
            // InternalRestControllerGeneration.g:641:53: (iv_ruleRelationalOp= ruleRelationalOp EOF )
            // InternalRestControllerGeneration.g:642:2: iv_ruleRelationalOp= ruleRelationalOp EOF
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
    // InternalRestControllerGeneration.g:648:1: ruleRelationalOp returns [EObject current=null] : ( ( () otherlv_1= '=' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '>=' ) ) ;
    public final EObject ruleRelationalOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:654:2: ( ( ( () otherlv_1= '=' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '>=' ) ) )
            // InternalRestControllerGeneration.g:655:2: ( ( () otherlv_1= '=' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '>=' ) )
            {
            // InternalRestControllerGeneration.g:655:2: ( ( () otherlv_1= '=' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>' ) | ( () otherlv_7= '<=' ) | ( () otherlv_9= '>=' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            case 24:
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
                    // InternalRestControllerGeneration.g:656:3: ( () otherlv_1= '=' )
                    {
                    // InternalRestControllerGeneration.g:656:3: ( () otherlv_1= '=' )
                    // InternalRestControllerGeneration.g:657:4: () otherlv_1= '='
                    {
                    // InternalRestControllerGeneration.g:657:4: ()
                    // InternalRestControllerGeneration.g:658:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelEQAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationalOpAccess().getEqualsSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRestControllerGeneration.g:670:3: ( () otherlv_3= '<' )
                    {
                    // InternalRestControllerGeneration.g:670:3: ( () otherlv_3= '<' )
                    // InternalRestControllerGeneration.g:671:4: () otherlv_3= '<'
                    {
                    // InternalRestControllerGeneration.g:671:4: ()
                    // InternalRestControllerGeneration.g:672:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelLTAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelationalOpAccess().getLessThanSignKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRestControllerGeneration.g:684:3: ( () otherlv_5= '>' )
                    {
                    // InternalRestControllerGeneration.g:684:3: ( () otherlv_5= '>' )
                    // InternalRestControllerGeneration.g:685:4: () otherlv_5= '>'
                    {
                    // InternalRestControllerGeneration.g:685:4: ()
                    // InternalRestControllerGeneration.g:686:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelGTAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getRelationalOpAccess().getGreaterThanSignKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRestControllerGeneration.g:698:3: ( () otherlv_7= '<=' )
                    {
                    // InternalRestControllerGeneration.g:698:3: ( () otherlv_7= '<=' )
                    // InternalRestControllerGeneration.g:699:4: () otherlv_7= '<='
                    {
                    // InternalRestControllerGeneration.g:699:4: ()
                    // InternalRestControllerGeneration.g:700:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelLTEAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getRelationalOpAccess().getLessThanSignEqualsSignKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRestControllerGeneration.g:712:3: ( () otherlv_9= '>=' )
                    {
                    // InternalRestControllerGeneration.g:712:3: ( () otherlv_9= '>=' )
                    // InternalRestControllerGeneration.g:713:4: () otherlv_9= '>='
                    {
                    // InternalRestControllerGeneration.g:713:4: ()
                    // InternalRestControllerGeneration.g:714:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationalOpAccess().getRelGTEAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,24,FOLLOW_2); 

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
    // InternalRestControllerGeneration.g:729:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalRestControllerGeneration.g:729:44: (iv_ruleExp= ruleExp EOF )
            // InternalRestControllerGeneration.g:730:2: iv_ruleExp= ruleExp EOF
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
    // InternalRestControllerGeneration.g:736:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:742:2: ( (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalRestControllerGeneration.g:743:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalRestControllerGeneration.g:743:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalRestControllerGeneration.g:744:3: this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRestControllerGeneration.g:752:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=25 && LA11_0<=26)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:753:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalRestControllerGeneration.g:753:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==25) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==26) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalRestControllerGeneration.g:754:5: (otherlv_1= '+' () )
            	            {
            	            // InternalRestControllerGeneration.g:754:5: (otherlv_1= '+' () )
            	            // InternalRestControllerGeneration.g:755:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,25,FOLLOW_10); 

            	            						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalRestControllerGeneration.g:759:6: ()
            	            // InternalRestControllerGeneration.g:760:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getAddLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRestControllerGeneration.g:768:5: (otherlv_3= '-' () )
            	            {
            	            // InternalRestControllerGeneration.g:768:5: (otherlv_3= '-' () )
            	            // InternalRestControllerGeneration.g:769:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,26,FOLLOW_10); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalRestControllerGeneration.g:773:6: ()
            	            // InternalRestControllerGeneration.g:774:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getSubLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRestControllerGeneration.g:782:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalRestControllerGeneration.g:783:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalRestControllerGeneration.g:783:5: (lv_right_5_0= ruleFactor )
            	    // InternalRestControllerGeneration.g:784:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
    // InternalRestControllerGeneration.g:806:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalRestControllerGeneration.g:806:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalRestControllerGeneration.g:807:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalRestControllerGeneration.g:813:1: ruleFactor returns [EObject current=null] : (this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primitive_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:819:2: ( (this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )* ) )
            // InternalRestControllerGeneration.g:820:2: (this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )* )
            {
            // InternalRestControllerGeneration.g:820:2: (this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )* )
            // InternalRestControllerGeneration.g:821:3: this_Primitive_0= rulePrimitive ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimitiveParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Primitive_0=rulePrimitive();

            state._fsp--;


            			current = this_Primitive_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRestControllerGeneration.g:829:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=27 && LA13_0<=28)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:830:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimitive ) )
            	    {
            	    // InternalRestControllerGeneration.g:830:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==27) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==28) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalRestControllerGeneration.g:831:5: (otherlv_1= '*' () )
            	            {
            	            // InternalRestControllerGeneration.g:831:5: (otherlv_1= '*' () )
            	            // InternalRestControllerGeneration.g:832:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,27,FOLLOW_10); 

            	            						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalRestControllerGeneration.g:836:6: ()
            	            // InternalRestControllerGeneration.g:837:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMulLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRestControllerGeneration.g:845:5: (otherlv_3= '/' () )
            	            {
            	            // InternalRestControllerGeneration.g:845:5: (otherlv_3= '/' () )
            	            // InternalRestControllerGeneration.g:846:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,28,FOLLOW_10); 

            	            						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalRestControllerGeneration.g:850:6: ()
            	            // InternalRestControllerGeneration.g:851:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRestControllerGeneration.g:859:4: ( (lv_right_5_0= rulePrimitive ) )
            	    // InternalRestControllerGeneration.g:860:5: (lv_right_5_0= rulePrimitive )
            	    {
            	    // InternalRestControllerGeneration.g:860:5: (lv_right_5_0= rulePrimitive )
            	    // InternalRestControllerGeneration.g:861:6: lv_right_5_0= rulePrimitive
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimitiveParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
    // InternalRestControllerGeneration.g:883:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalRestControllerGeneration.g:883:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalRestControllerGeneration.g:884:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalRestControllerGeneration.g:890:1: rulePrimitive returns [EObject current=null] : (this_Name_0= ruleName | this_IntExp_1= ruleIntExp | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Name_0 = null;

        EObject this_IntExp_1 = null;

        EObject this_Exp_3 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:896:2: ( (this_Name_0= ruleName | this_IntExp_1= ruleIntExp | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) ) )
            // InternalRestControllerGeneration.g:897:2: (this_Name_0= ruleName | this_IntExp_1= ruleIntExp | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) )
            {
            // InternalRestControllerGeneration.g:897:2: (this_Name_0= ruleName | this_IntExp_1= ruleIntExp | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) )
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
            case 29:
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
                    // InternalRestControllerGeneration.g:898:3: this_Name_0= ruleName
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
                    // InternalRestControllerGeneration.g:907:3: this_IntExp_1= ruleIntExp
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
                    // InternalRestControllerGeneration.g:916:3: (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' )
                    {
                    // InternalRestControllerGeneration.g:916:3: (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' )
                    // InternalRestControllerGeneration.g:917:4: otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimitiveAccess().getExpParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_16);
                    this_Exp_3=ruleExp();

                    state._fsp--;


                    				current = this_Exp_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,30,FOLLOW_2); 

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
    // InternalRestControllerGeneration.g:938:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalRestControllerGeneration.g:938:45: (iv_ruleName= ruleName EOF )
            // InternalRestControllerGeneration.g:939:2: iv_ruleName= ruleName EOF
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
    // InternalRestControllerGeneration.g:945:1: ruleName returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:951:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:952:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRestControllerGeneration.g:952:2: ( (otherlv_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:953:3: (otherlv_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:953:3: (otherlv_0= RULE_ID )
            // InternalRestControllerGeneration.g:954:4: otherlv_0= RULE_ID
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
    // InternalRestControllerGeneration.g:968:1: entryRuleIntExp returns [EObject current=null] : iv_ruleIntExp= ruleIntExp EOF ;
    public final EObject entryRuleIntExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExp = null;


        try {
            // InternalRestControllerGeneration.g:968:47: (iv_ruleIntExp= ruleIntExp EOF )
            // InternalRestControllerGeneration.g:969:2: iv_ruleIntExp= ruleIntExp EOF
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
    // InternalRestControllerGeneration.g:975:1: ruleIntExp returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntExp() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:981:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRestControllerGeneration.g:982:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRestControllerGeneration.g:982:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalRestControllerGeneration.g:983:3: (lv_value_0_0= RULE_INT )
            {
            // InternalRestControllerGeneration.g:983:3: (lv_value_0_0= RULE_INT )
            // InternalRestControllerGeneration.g:984:4: lv_value_0_0= RULE_INT
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
    // InternalRestControllerGeneration.g:1003:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalRestControllerGeneration.g:1003:51: (iv_ruleController= ruleController EOF )
            // InternalRestControllerGeneration.g:1004:2: iv_ruleController= ruleController EOF
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
    // InternalRestControllerGeneration.g:1010:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_methods_5_0= ruleMethodDef ) )* otherlv_6= '}' ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_methods_5_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1016:2: ( (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_methods_5_0= ruleMethodDef ) )* otherlv_6= '}' ) )
            // InternalRestControllerGeneration.g:1017:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_methods_5_0= ruleMethodDef ) )* otherlv_6= '}' )
            {
            // InternalRestControllerGeneration.g:1017:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_methods_5_0= ruleMethodDef ) )* otherlv_6= '}' )
            // InternalRestControllerGeneration.g:1018:3: otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_methods_5_0= ruleMethodDef ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            // InternalRestControllerGeneration.g:1022:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestControllerGeneration.g:1023:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1023:4: (lv_name_1_0= RULE_ID )
            // InternalRestControllerGeneration.g:1024:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            // InternalRestControllerGeneration.g:1040:3: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRestControllerGeneration.g:1041:4: otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getColonKeyword_2_0());
                    			
                    // InternalRestControllerGeneration.g:1045:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRestControllerGeneration.g:1046:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRestControllerGeneration.g:1046:5: (otherlv_3= RULE_ID )
                    // InternalRestControllerGeneration.g:1047:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getControllerRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getSuperControllerCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRestControllerGeneration.g:1063:3: ( (lv_methods_5_0= ruleMethodDef ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32||LA16_0==35||(LA16_0>=37 && LA16_0<=38)||LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:1064:4: (lv_methods_5_0= ruleMethodDef )
            	    {
            	    // InternalRestControllerGeneration.g:1064:4: (lv_methods_5_0= ruleMethodDef )
            	    // InternalRestControllerGeneration.g:1065:5: lv_methods_5_0= ruleMethodDef
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getMethodsMethodDefParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_methods_5_0=ruleMethodDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methods",
            	    						lv_methods_5_0,
            	    						"sdu.mdsd.restful.RestControllerGeneration.MethodDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalRestControllerGeneration.g:1090:1: entryRuleMethodDef returns [EObject current=null] : iv_ruleMethodDef= ruleMethodDef EOF ;
    public final EObject entryRuleMethodDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDef = null;


        try {
            // InternalRestControllerGeneration.g:1090:50: (iv_ruleMethodDef= ruleMethodDef EOF )
            // InternalRestControllerGeneration.g:1091:2: iv_ruleMethodDef= ruleMethodDef EOF
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
    // InternalRestControllerGeneration.g:1097:1: ruleMethodDef returns [EObject current=null] : this_MethodType_0= ruleMethodType ;
    public final EObject ruleMethodDef() throws RecognitionException {
        EObject current = null;

        EObject this_MethodType_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1103:2: (this_MethodType_0= ruleMethodType )
            // InternalRestControllerGeneration.g:1104:2: this_MethodType_0= ruleMethodType
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
    // InternalRestControllerGeneration.g:1115:1: entryRuleMethodType returns [EObject current=null] : iv_ruleMethodType= ruleMethodType EOF ;
    public final EObject entryRuleMethodType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodType = null;


        try {
            // InternalRestControllerGeneration.g:1115:51: (iv_ruleMethodType= ruleMethodType EOF )
            // InternalRestControllerGeneration.g:1116:2: iv_ruleMethodType= ruleMethodType EOF
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
    // InternalRestControllerGeneration.g:1122:1: ruleMethodType returns [EObject current=null] : (this_CreateMethod_0= ruleCreateMethod | this_GetMethod_1= ruleGetMethod | this_ListMethod_2= ruleListMethod | this_UpdateMethod_3= ruleUpdateMethod | this_DeleteMethod_4= ruleDeleteMethod ) ;
    public final EObject ruleMethodType() throws RecognitionException {
        EObject current = null;

        EObject this_CreateMethod_0 = null;

        EObject this_GetMethod_1 = null;

        EObject this_ListMethod_2 = null;

        EObject this_UpdateMethod_3 = null;

        EObject this_DeleteMethod_4 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1128:2: ( (this_CreateMethod_0= ruleCreateMethod | this_GetMethod_1= ruleGetMethod | this_ListMethod_2= ruleListMethod | this_UpdateMethod_3= ruleUpdateMethod | this_DeleteMethod_4= ruleDeleteMethod ) )
            // InternalRestControllerGeneration.g:1129:2: (this_CreateMethod_0= ruleCreateMethod | this_GetMethod_1= ruleGetMethod | this_ListMethod_2= ruleListMethod | this_UpdateMethod_3= ruleUpdateMethod | this_DeleteMethod_4= ruleDeleteMethod )
            {
            // InternalRestControllerGeneration.g:1129:2: (this_CreateMethod_0= ruleCreateMethod | this_GetMethod_1= ruleGetMethod | this_ListMethod_2= ruleListMethod | this_UpdateMethod_3= ruleUpdateMethod | this_DeleteMethod_4= ruleDeleteMethod )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt17=1;
                }
                break;
            case 35:
                {
                alt17=2;
                }
                break;
            case 37:
                {
                alt17=3;
                }
                break;
            case 38:
                {
                alt17=4;
                }
                break;
            case 40:
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
                    // InternalRestControllerGeneration.g:1130:3: this_CreateMethod_0= ruleCreateMethod
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
                    // InternalRestControllerGeneration.g:1139:3: this_GetMethod_1= ruleGetMethod
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
                    // InternalRestControllerGeneration.g:1148:3: this_ListMethod_2= ruleListMethod
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
                    // InternalRestControllerGeneration.g:1157:3: this_UpdateMethod_3= ruleUpdateMethod
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
                    // InternalRestControllerGeneration.g:1166:3: this_DeleteMethod_4= ruleDeleteMethod
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
    // InternalRestControllerGeneration.g:1178:1: entryRuleCreateMethod returns [EObject current=null] : iv_ruleCreateMethod= ruleCreateMethod EOF ;
    public final EObject entryRuleCreateMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateMethod = null;


        try {
            // InternalRestControllerGeneration.g:1178:53: (iv_ruleCreateMethod= ruleCreateMethod EOF )
            // InternalRestControllerGeneration.g:1179:2: iv_ruleCreateMethod= ruleCreateMethod EOF
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
    // InternalRestControllerGeneration.g:1185:1: ruleCreateMethod returns [EObject current=null] : ( () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )? ) ;
    public final EObject ruleCreateMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_withEntity_2_0 = null;

        EObject lv_exclude_3_0 = null;



        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1191:2: ( ( () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )? ) )
            // InternalRestControllerGeneration.g:1192:2: ( () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )? )
            {
            // InternalRestControllerGeneration.g:1192:2: ( () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )? )
            // InternalRestControllerGeneration.g:1193:3: () otherlv_1= 'CREATE' ( (lv_withEntity_2_0= ruleCreateMethodWith ) )? ( (lv_exclude_3_0= ruleCreateMethodExclude ) )?
            {
            // InternalRestControllerGeneration.g:1193:3: ()
            // InternalRestControllerGeneration.g:1194:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCreateMethodAccess().getCreateMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateMethodAccess().getCREATEKeyword_1());
            		
            // InternalRestControllerGeneration.g:1204:3: ( (lv_withEntity_2_0= ruleCreateMethodWith ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRestControllerGeneration.g:1205:4: (lv_withEntity_2_0= ruleCreateMethodWith )
                    {
                    // InternalRestControllerGeneration.g:1205:4: (lv_withEntity_2_0= ruleCreateMethodWith )
                    // InternalRestControllerGeneration.g:1206:5: lv_withEntity_2_0= ruleCreateMethodWith
                    {

                    					newCompositeNode(grammarAccess.getCreateMethodAccess().getWithEntityCreateMethodWithParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_19);
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

            // InternalRestControllerGeneration.g:1223:3: ( (lv_exclude_3_0= ruleCreateMethodExclude ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRestControllerGeneration.g:1224:4: (lv_exclude_3_0= ruleCreateMethodExclude )
                    {
                    // InternalRestControllerGeneration.g:1224:4: (lv_exclude_3_0= ruleCreateMethodExclude )
                    // InternalRestControllerGeneration.g:1225:5: lv_exclude_3_0= ruleCreateMethodExclude
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
    // InternalRestControllerGeneration.g:1246:1: entryRuleCreateMethodWith returns [EObject current=null] : iv_ruleCreateMethodWith= ruleCreateMethodWith EOF ;
    public final EObject entryRuleCreateMethodWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateMethodWith = null;


        try {
            // InternalRestControllerGeneration.g:1246:57: (iv_ruleCreateMethodWith= ruleCreateMethodWith EOF )
            // InternalRestControllerGeneration.g:1247:2: iv_ruleCreateMethodWith= ruleCreateMethodWith EOF
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
    // InternalRestControllerGeneration.g:1253:1: ruleCreateMethodWith returns [EObject current=null] : (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleCreateMethodWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1259:2: ( (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:1260:2: (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:1260:2: (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1261:3: otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateMethodWithAccess().getWithKeyword_0());
            		
            // InternalRestControllerGeneration.g:1265:3: ( (otherlv_1= RULE_ID ) )
            // InternalRestControllerGeneration.g:1266:4: (otherlv_1= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1266:4: (otherlv_1= RULE_ID )
            // InternalRestControllerGeneration.g:1267:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateMethodWithRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_1, grammarAccess.getCreateMethodWithAccess().getEntityEntityCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateMethodWithAccess().getColonKeyword_2());
            		
            // InternalRestControllerGeneration.g:1282:3: ( (otherlv_3= RULE_ID ) )
            // InternalRestControllerGeneration.g:1283:4: (otherlv_3= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1283:4: (otherlv_3= RULE_ID )
            // InternalRestControllerGeneration.g:1284:5: otherlv_3= RULE_ID
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
    // InternalRestControllerGeneration.g:1299:1: entryRuleCreateMethodExclude returns [EObject current=null] : iv_ruleCreateMethodExclude= ruleCreateMethodExclude EOF ;
    public final EObject entryRuleCreateMethodExclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateMethodExclude = null;


        try {
            // InternalRestControllerGeneration.g:1299:60: (iv_ruleCreateMethodExclude= ruleCreateMethodExclude EOF )
            // InternalRestControllerGeneration.g:1300:2: iv_ruleCreateMethodExclude= ruleCreateMethodExclude EOF
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
    // InternalRestControllerGeneration.g:1306:1: ruleCreateMethodExclude returns [EObject current=null] : (otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleCreateMethodExclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1312:2: ( (otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:1313:2: (otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:1313:2: (otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1314:3: otherlv_0= 'exclude' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateMethodExcludeAccess().getExcludeKeyword_0());
            		
            // InternalRestControllerGeneration.g:1318:3: ( (otherlv_1= RULE_ID ) )
            // InternalRestControllerGeneration.g:1319:4: (otherlv_1= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1319:4: (otherlv_1= RULE_ID )
            // InternalRestControllerGeneration.g:1320:5: otherlv_1= RULE_ID
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
    // InternalRestControllerGeneration.g:1335:1: entryRuleGetMethod returns [EObject current=null] : iv_ruleGetMethod= ruleGetMethod EOF ;
    public final EObject entryRuleGetMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetMethod = null;


        try {
            // InternalRestControllerGeneration.g:1335:50: (iv_ruleGetMethod= ruleGetMethod EOF )
            // InternalRestControllerGeneration.g:1336:2: iv_ruleGetMethod= ruleGetMethod EOF
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
    // InternalRestControllerGeneration.g:1342:1: ruleGetMethod returns [EObject current=null] : (otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleGetMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1348:2: ( (otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:1349:2: (otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:1349:2: (otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1350:3: otherlv_0= 'GET' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getGetMethodAccess().getGETKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGetMethodAccess().getOnKeyword_1());
            		
            // InternalRestControllerGeneration.g:1358:3: ( (otherlv_2= RULE_ID ) )
            // InternalRestControllerGeneration.g:1359:4: (otherlv_2= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1359:4: (otherlv_2= RULE_ID )
            // InternalRestControllerGeneration.g:1360:5: otherlv_2= RULE_ID
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
    // InternalRestControllerGeneration.g:1375:1: entryRuleListMethod returns [EObject current=null] : iv_ruleListMethod= ruleListMethod EOF ;
    public final EObject entryRuleListMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListMethod = null;


        try {
            // InternalRestControllerGeneration.g:1375:51: (iv_ruleListMethod= ruleListMethod EOF )
            // InternalRestControllerGeneration.g:1376:2: iv_ruleListMethod= ruleListMethod EOF
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
    // InternalRestControllerGeneration.g:1382:1: ruleListMethod returns [EObject current=null] : ( () otherlv_1= 'LIST' ) ;
    public final EObject ruleListMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1388:2: ( ( () otherlv_1= 'LIST' ) )
            // InternalRestControllerGeneration.g:1389:2: ( () otherlv_1= 'LIST' )
            {
            // InternalRestControllerGeneration.g:1389:2: ( () otherlv_1= 'LIST' )
            // InternalRestControllerGeneration.g:1390:3: () otherlv_1= 'LIST'
            {
            // InternalRestControllerGeneration.g:1390:3: ()
            // InternalRestControllerGeneration.g:1391:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListMethodAccess().getListMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_2); 

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
    // InternalRestControllerGeneration.g:1405:1: entryRuleUpdateMethod returns [EObject current=null] : iv_ruleUpdateMethod= ruleUpdateMethod EOF ;
    public final EObject entryRuleUpdateMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateMethod = null;


        try {
            // InternalRestControllerGeneration.g:1405:53: (iv_ruleUpdateMethod= ruleUpdateMethod EOF )
            // InternalRestControllerGeneration.g:1406:2: iv_ruleUpdateMethod= ruleUpdateMethod EOF
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
    // InternalRestControllerGeneration.g:1412:1: ruleUpdateMethod returns [EObject current=null] : (otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleUpdateMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1418:2: ( (otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalRestControllerGeneration.g:1419:2: (otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalRestControllerGeneration.g:1419:2: (otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalRestControllerGeneration.g:1420:3: otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateMethodAccess().getUPDATEKeyword_0());
            		
            // InternalRestControllerGeneration.g:1424:3: ( (otherlv_1= RULE_ID ) )
            // InternalRestControllerGeneration.g:1425:4: (otherlv_1= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1425:4: (otherlv_1= RULE_ID )
            // InternalRestControllerGeneration.g:1426:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdateMethodRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_1, grammarAccess.getUpdateMethodAccess().getAttributesAttributeCrossReference_1_0());
            				

            }


            }

            // InternalRestControllerGeneration.g:1437:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==39) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRestControllerGeneration.g:1438:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,39,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getUpdateMethodAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalRestControllerGeneration.g:1442:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalRestControllerGeneration.g:1443:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalRestControllerGeneration.g:1443:5: (otherlv_3= RULE_ID )
            	    // InternalRestControllerGeneration.g:1444:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUpdateMethodRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_21); 

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
    // InternalRestControllerGeneration.g:1460:1: entryRuleDeleteMethod returns [EObject current=null] : iv_ruleDeleteMethod= ruleDeleteMethod EOF ;
    public final EObject entryRuleDeleteMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteMethod = null;


        try {
            // InternalRestControllerGeneration.g:1460:53: (iv_ruleDeleteMethod= ruleDeleteMethod EOF )
            // InternalRestControllerGeneration.g:1461:2: iv_ruleDeleteMethod= ruleDeleteMethod EOF
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
    // InternalRestControllerGeneration.g:1467:1: ruleDeleteMethod returns [EObject current=null] : (otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDeleteMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRestControllerGeneration.g:1473:2: ( (otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRestControllerGeneration.g:1474:2: (otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRestControllerGeneration.g:1474:2: (otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) )
            // InternalRestControllerGeneration.g:1475:3: otherlv_0= 'DELETE' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteMethodAccess().getDELETEKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteMethodAccess().getOnKeyword_1());
            		
            // InternalRestControllerGeneration.g:1483:3: ( (otherlv_2= RULE_ID ) )
            // InternalRestControllerGeneration.g:1484:4: (otherlv_2= RULE_ID )
            {
            // InternalRestControllerGeneration.g:1484:4: (otherlv_2= RULE_ID )
            // InternalRestControllerGeneration.g:1485:5: otherlv_2= RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000016900008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000002L});

}