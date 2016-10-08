// $ANTLR 3.5.2 Pddl.g 2016-10-06 11:30:25

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class PddlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "AND_EFFECT", "AND_GD", 
		"ANY_CHAR", "ASSIGN_EFFECT", "BINARY_OP", "COMPARISON_GD", "CONSTANTS", 
		"CONSTRAINT", "COS", "DIGIT", "DOMAIN", "DOMAIN_NAME", "DURATIVE_ACTION", 
		"EFFECT", "EITHER_TYPE", "EQUALITY_CON", "EVENT", "EXISTS_GD", "FORALL_EFFECT", 
		"FORALL_GD", "FORMULAINIT", "FREE_FUNCTIONS", "FUNCTIONS", "FUNC_HEAD", 
		"GLOBAL_CONSTRAINT", "GOAL", "IMPLY_GD", "INIT", "INIT_AT", "INIT_EQ", 
		"LETTER", "LINE_COMMENT", "MINUS_OP", "MULTI_OP", "NAME", "NOT_EFFECT", 
		"NOT_GD", "NOT_PRED_INIT", "NUMBER", "OBJECTS", "ONEOF", "OR_GD", "PRECONDITION", 
		"PREDICATES", "PRED_HEAD", "PRED_INST", "PROBLEM", "PROBLEM_CONSTRAINT", 
		"PROBLEM_DOMAIN", "PROBLEM_METRIC", "PROBLEM_NAME", "PROCESS", "REQUIREMENTS", 
		"REQUIRE_KEY", "SIN", "TYPES", "UNARY_MINUS", "UNKNOWN", "VARIABLE", "WHEN_EFFECT", 
		"WHITESPACE", "'#t'", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "':action'", 
		"':condition'", "':constants'", "':constraint'", "':constraints'", "':derived'", 
		"':domain'", "':duration'", "':durative-action'", "':effect'", "':event'", 
		"':free_functions'", "':functions'", "':goal'", "':init'", "':metric'", 
		"':objects'", "':parameters'", "':precondition'", "':predicates'", "':process'", 
		"':requirements'", "':types'", "'<'", "'<='", "'='", "'>'", "'>='", "'?duration'", 
		"'^'", "'all'", "'always'", "'always-within'", "'and'", "'assign'", "'at'", 
		"'at-most-once'", "'cos'", "'decrease'", "'define'", "'domain'", "'either'", 
		"'end'", "'exists'", "'forall'", "'hold-after'", "'hold-during'", "'imply'", 
		"'increase'", "'is-violated'", "'maximize'", "'minimize'", "'not'", "'number'", 
		"'oneof'", "'or'", "'over'", "'preference'", "'problem'", "'scale-down'", 
		"'scale-up'", "'sin'", "'sometime'", "'sometime-after'", "'sometime-before'", 
		"'start'", "'unknown'", "'when'", "'within'"
	};
	public static final int EOF=-1;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int T__121=121;
	public static final int T__122=122;
	public static final int T__123=123;
	public static final int T__124=124;
	public static final int T__125=125;
	public static final int T__126=126;
	public static final int T__127=127;
	public static final int T__128=128;
	public static final int T__129=129;
	public static final int T__130=130;
	public static final int T__131=131;
	public static final int T__132=132;
	public static final int T__133=133;
	public static final int T__134=134;
	public static final int T__135=135;
	public static final int T__136=136;
	public static final int T__137=137;
	public static final int T__138=138;
	public static final int T__139=139;
	public static final int T__140=140;
	public static final int T__141=141;
	public static final int ACTION=4;
	public static final int AND_EFFECT=5;
	public static final int AND_GD=6;
	public static final int ANY_CHAR=7;
	public static final int ASSIGN_EFFECT=8;
	public static final int BINARY_OP=9;
	public static final int COMPARISON_GD=10;
	public static final int CONSTANTS=11;
	public static final int CONSTRAINT=12;
	public static final int COS=13;
	public static final int DIGIT=14;
	public static final int DOMAIN=15;
	public static final int DOMAIN_NAME=16;
	public static final int DURATIVE_ACTION=17;
	public static final int EFFECT=18;
	public static final int EITHER_TYPE=19;
	public static final int EQUALITY_CON=20;
	public static final int EVENT=21;
	public static final int EXISTS_GD=22;
	public static final int FORALL_EFFECT=23;
	public static final int FORALL_GD=24;
	public static final int FORMULAINIT=25;
	public static final int FREE_FUNCTIONS=26;
	public static final int FUNCTIONS=27;
	public static final int FUNC_HEAD=28;
	public static final int GLOBAL_CONSTRAINT=29;
	public static final int GOAL=30;
	public static final int IMPLY_GD=31;
	public static final int INIT=32;
	public static final int INIT_AT=33;
	public static final int INIT_EQ=34;
	public static final int LETTER=35;
	public static final int LINE_COMMENT=36;
	public static final int MINUS_OP=37;
	public static final int MULTI_OP=38;
	public static final int NAME=39;
	public static final int NOT_EFFECT=40;
	public static final int NOT_GD=41;
	public static final int NOT_PRED_INIT=42;
	public static final int NUMBER=43;
	public static final int OBJECTS=44;
	public static final int ONEOF=45;
	public static final int OR_GD=46;
	public static final int PRECONDITION=47;
	public static final int PREDICATES=48;
	public static final int PRED_HEAD=49;
	public static final int PRED_INST=50;
	public static final int PROBLEM=51;
	public static final int PROBLEM_CONSTRAINT=52;
	public static final int PROBLEM_DOMAIN=53;
	public static final int PROBLEM_METRIC=54;
	public static final int PROBLEM_NAME=55;
	public static final int PROCESS=56;
	public static final int REQUIREMENTS=57;
	public static final int REQUIRE_KEY=58;
	public static final int SIN=59;
	public static final int TYPES=60;
	public static final int UNARY_MINUS=61;
	public static final int UNKNOWN=62;
	public static final int VARIABLE=63;
	public static final int WHEN_EFFECT=64;
	public static final int WHITESPACE=65;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public PddlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public PddlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return PddlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Pddl.g"; }


	private boolean wasError = false;
	public void reportError(RecognitionException e) {
		wasError = true;
		super.reportError(e);
	}
	public boolean invalidGrammar() {
		return wasError;
	}


	public static class pddlDoc_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "pddlDoc"
	// Pddl.g:102:1: pddlDoc : ( domain | problem );
	public final PddlParser.pddlDoc_return pddlDoc() throws RecognitionException {
		PddlParser.pddlDoc_return retval = new PddlParser.pddlDoc_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope domain1 =null;
		ParserRuleReturnScope problem2 =null;


		try {
			// Pddl.g:102:9: ( domain | problem )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==67) ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1==112) ) {
					int LA1_2 = input.LA(3);
					if ( (LA1_2==67) ) {
						int LA1_3 = input.LA(4);
						if ( (LA1_3==113) ) {
							alt1=1;
						}
						else if ( (LA1_3==131) ) {
							alt1=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// Pddl.g:102:11: domain
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_domain_in_pddlDoc381);
					domain1=domain();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, domain1.getTree());

					}
					break;
				case 2 :
					// Pddl.g:102:20: problem
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_problem_in_pddlDoc385);
					problem2=problem();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, problem2.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pddlDoc"


	public static class domain_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "domain"
	// Pddl.g:106:1: domain : '(' 'define' domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( free_functionsDef )? ( constraints )? ( structureDef )* ')' -> ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( free_functionsDef )? ( constraints )? ( structureDef )* ) ;
	public final PddlParser.domain_return domain() throws RecognitionException {
		PddlParser.domain_return retval = new PddlParser.domain_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal3=null;
		Token string_literal4=null;
		Token char_literal14=null;
		ParserRuleReturnScope domainName5 =null;
		ParserRuleReturnScope requireDef6 =null;
		ParserRuleReturnScope typesDef7 =null;
		ParserRuleReturnScope constantsDef8 =null;
		ParserRuleReturnScope predicatesDef9 =null;
		ParserRuleReturnScope functionsDef10 =null;
		ParserRuleReturnScope free_functionsDef11 =null;
		ParserRuleReturnScope constraints12 =null;
		ParserRuleReturnScope structureDef13 =null;

		Object char_literal3_tree=null;
		Object string_literal4_tree=null;
		Object char_literal14_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleSubtreeStream stream_typesDef=new RewriteRuleSubtreeStream(adaptor,"rule typesDef");
		RewriteRuleSubtreeStream stream_requireDef=new RewriteRuleSubtreeStream(adaptor,"rule requireDef");
		RewriteRuleSubtreeStream stream_free_functionsDef=new RewriteRuleSubtreeStream(adaptor,"rule free_functionsDef");
		RewriteRuleSubtreeStream stream_domainName=new RewriteRuleSubtreeStream(adaptor,"rule domainName");
		RewriteRuleSubtreeStream stream_predicatesDef=new RewriteRuleSubtreeStream(adaptor,"rule predicatesDef");
		RewriteRuleSubtreeStream stream_constantsDef=new RewriteRuleSubtreeStream(adaptor,"rule constantsDef");
		RewriteRuleSubtreeStream stream_functionsDef=new RewriteRuleSubtreeStream(adaptor,"rule functionsDef");
		RewriteRuleSubtreeStream stream_constraints=new RewriteRuleSubtreeStream(adaptor,"rule constraints");
		RewriteRuleSubtreeStream stream_structureDef=new RewriteRuleSubtreeStream(adaptor,"rule structureDef");

		try {
			// Pddl.g:107:5: ( '(' 'define' domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( free_functionsDef )? ( constraints )? ( structureDef )* ')' -> ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( free_functionsDef )? ( constraints )? ( structureDef )* ) )
			// Pddl.g:107:7: '(' 'define' domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( free_functionsDef )? ( constraints )? ( structureDef )* ')'
			{
			char_literal3=(Token)match(input,67,FOLLOW_67_in_domain400); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal3);

			string_literal4=(Token)match(input,112,FOLLOW_112_in_domain402); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_112.add(string_literal4);

			pushFollow(FOLLOW_domainName_in_domain404);
			domainName5=domainName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_domainName.add(domainName5.getTree());
			// Pddl.g:108:7: ( requireDef )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==67) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==94) ) {
					alt2=1;
				}
			}
			switch (alt2) {
				case 1 :
					// Pddl.g:108:7: requireDef
					{
					pushFollow(FOLLOW_requireDef_in_domain412);
					requireDef6=requireDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_requireDef.add(requireDef6.getTree());
					}
					break;

			}

			// Pddl.g:109:7: ( typesDef )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==67) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==95) ) {
					alt3=1;
				}
			}
			switch (alt3) {
				case 1 :
					// Pddl.g:109:7: typesDef
					{
					pushFollow(FOLLOW_typesDef_in_domain421);
					typesDef7=typesDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typesDef.add(typesDef7.getTree());
					}
					break;

			}

			// Pddl.g:110:7: ( constantsDef )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==67) ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1==75) ) {
					alt4=1;
				}
			}
			switch (alt4) {
				case 1 :
					// Pddl.g:110:7: constantsDef
					{
					pushFollow(FOLLOW_constantsDef_in_domain430);
					constantsDef8=constantsDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_constantsDef.add(constantsDef8.getTree());
					}
					break;

			}

			// Pddl.g:111:7: ( predicatesDef )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==67) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==92) ) {
					alt5=1;
				}
			}
			switch (alt5) {
				case 1 :
					// Pddl.g:111:7: predicatesDef
					{
					pushFollow(FOLLOW_predicatesDef_in_domain439);
					predicatesDef9=predicatesDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicatesDef.add(predicatesDef9.getTree());
					}
					break;

			}

			// Pddl.g:112:7: ( functionsDef )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==67) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==85) ) {
					alt6=1;
				}
			}
			switch (alt6) {
				case 1 :
					// Pddl.g:112:7: functionsDef
					{
					pushFollow(FOLLOW_functionsDef_in_domain448);
					functionsDef10=functionsDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionsDef.add(functionsDef10.getTree());
					}
					break;

			}

			// Pddl.g:113:7: ( free_functionsDef )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==67) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==84) ) {
					alt7=1;
				}
			}
			switch (alt7) {
				case 1 :
					// Pddl.g:113:7: free_functionsDef
					{
					pushFollow(FOLLOW_free_functionsDef_in_domain457);
					free_functionsDef11=free_functionsDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_free_functionsDef.add(free_functionsDef11.getTree());
					}
					break;

			}

			// Pddl.g:114:7: ( constraints )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==67) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==77) ) {
					alt8=1;
				}
			}
			switch (alt8) {
				case 1 :
					// Pddl.g:114:7: constraints
					{
					pushFollow(FOLLOW_constraints_in_domain466);
					constraints12=constraints();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_constraints.add(constraints12.getTree());
					}
					break;

			}

			// Pddl.g:115:7: ( structureDef )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==67) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Pddl.g:115:7: structureDef
					{
					pushFollow(FOLLOW_structureDef_in_domain475);
					structureDef13=structureDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_structureDef.add(structureDef13.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			char_literal14=(Token)match(input,68,FOLLOW_68_in_domain484); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal14);

			// AST REWRITE
			// elements: free_functionsDef, constraints, typesDef, functionsDef, domainName, predicatesDef, requireDef, structureDef, constantsDef
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 117:7: -> ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( free_functionsDef )? ( constraints )? ( structureDef )* )
			{
				// Pddl.g:117:10: ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( free_functionsDef )? ( constraints )? ( structureDef )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOMAIN, "DOMAIN"), root_1);
				adaptor.addChild(root_1, stream_domainName.nextTree());
				// Pddl.g:117:30: ( requireDef )?
				if ( stream_requireDef.hasNext() ) {
					adaptor.addChild(root_1, stream_requireDef.nextTree());
				}
				stream_requireDef.reset();

				// Pddl.g:117:42: ( typesDef )?
				if ( stream_typesDef.hasNext() ) {
					adaptor.addChild(root_1, stream_typesDef.nextTree());
				}
				stream_typesDef.reset();

				// Pddl.g:118:17: ( constantsDef )?
				if ( stream_constantsDef.hasNext() ) {
					adaptor.addChild(root_1, stream_constantsDef.nextTree());
				}
				stream_constantsDef.reset();

				// Pddl.g:118:31: ( predicatesDef )?
				if ( stream_predicatesDef.hasNext() ) {
					adaptor.addChild(root_1, stream_predicatesDef.nextTree());
				}
				stream_predicatesDef.reset();

				// Pddl.g:118:46: ( functionsDef )?
				if ( stream_functionsDef.hasNext() ) {
					adaptor.addChild(root_1, stream_functionsDef.nextTree());
				}
				stream_functionsDef.reset();

				// Pddl.g:118:60: ( free_functionsDef )?
				if ( stream_free_functionsDef.hasNext() ) {
					adaptor.addChild(root_1, stream_free_functionsDef.nextTree());
				}
				stream_free_functionsDef.reset();

				// Pddl.g:119:17: ( constraints )?
				if ( stream_constraints.hasNext() ) {
					adaptor.addChild(root_1, stream_constraints.nextTree());
				}
				stream_constraints.reset();

				// Pddl.g:119:30: ( structureDef )*
				while ( stream_structureDef.hasNext() ) {
					adaptor.addChild(root_1, stream_structureDef.nextTree());
				}
				stream_structureDef.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "domain"


	public static class free_functionsDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "free_functionsDef"
	// Pddl.g:122:1: free_functionsDef : '(' ':free_functions' functionList ')' -> ^( FREE_FUNCTIONS functionList ) ;
	public final PddlParser.free_functionsDef_return free_functionsDef() throws RecognitionException {
		PddlParser.free_functionsDef_return retval = new PddlParser.free_functionsDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal15=null;
		Token string_literal16=null;
		Token char_literal18=null;
		ParserRuleReturnScope functionList17 =null;

		Object char_literal15_tree=null;
		Object string_literal16_tree=null;
		Object char_literal18_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleSubtreeStream stream_functionList=new RewriteRuleSubtreeStream(adaptor,"rule functionList");

		try {
			// Pddl.g:123:2: ( '(' ':free_functions' functionList ')' -> ^( FREE_FUNCTIONS functionList ) )
			// Pddl.g:123:4: '(' ':free_functions' functionList ')'
			{
			char_literal15=(Token)match(input,67,FOLLOW_67_in_free_functionsDef568); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal15);

			string_literal16=(Token)match(input,84,FOLLOW_84_in_free_functionsDef570); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_84.add(string_literal16);

			pushFollow(FOLLOW_functionList_in_free_functionsDef572);
			functionList17=functionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_functionList.add(functionList17.getTree());
			char_literal18=(Token)match(input,68,FOLLOW_68_in_free_functionsDef574); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal18);

			// AST REWRITE
			// elements: functionList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 124:2: -> ^( FREE_FUNCTIONS functionList )
			{
				// Pddl.g:124:5: ^( FREE_FUNCTIONS functionList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FREE_FUNCTIONS, "FREE_FUNCTIONS"), root_1);
				adaptor.addChild(root_1, stream_functionList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "free_functionsDef"


	public static class domainName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "domainName"
	// Pddl.g:127:1: domainName : '(' 'domain' NAME ')' -> ^( DOMAIN_NAME NAME ) ;
	public final PddlParser.domainName_return domainName() throws RecognitionException {
		PddlParser.domainName_return retval = new PddlParser.domainName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal19=null;
		Token string_literal20=null;
		Token NAME21=null;
		Token char_literal22=null;

		Object char_literal19_tree=null;
		Object string_literal20_tree=null;
		Object NAME21_tree=null;
		Object char_literal22_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");

		try {
			// Pddl.g:128:5: ( '(' 'domain' NAME ')' -> ^( DOMAIN_NAME NAME ) )
			// Pddl.g:128:7: '(' 'domain' NAME ')'
			{
			char_literal19=(Token)match(input,67,FOLLOW_67_in_domainName597); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal19);

			string_literal20=(Token)match(input,113,FOLLOW_113_in_domainName599); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_113.add(string_literal20);

			NAME21=(Token)match(input,NAME,FOLLOW_NAME_in_domainName601); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAME.add(NAME21);

			char_literal22=(Token)match(input,68,FOLLOW_68_in_domainName603); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal22);

			// AST REWRITE
			// elements: NAME
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 129:6: -> ^( DOMAIN_NAME NAME )
			{
				// Pddl.g:129:9: ^( DOMAIN_NAME NAME )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOMAIN_NAME, "DOMAIN_NAME"), root_1);
				adaptor.addChild(root_1, stream_NAME.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "domainName"


	public static class requireDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "requireDef"
	// Pddl.g:132:1: requireDef : '(' ':requirements' ( REQUIRE_KEY )+ ')' -> ^( REQUIREMENTS ( REQUIRE_KEY )+ ) ;
	public final PddlParser.requireDef_return requireDef() throws RecognitionException {
		PddlParser.requireDef_return retval = new PddlParser.requireDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal23=null;
		Token string_literal24=null;
		Token REQUIRE_KEY25=null;
		Token char_literal26=null;

		Object char_literal23_tree=null;
		Object string_literal24_tree=null;
		Object REQUIRE_KEY25_tree=null;
		Object char_literal26_tree=null;
		RewriteRuleTokenStream stream_REQUIRE_KEY=new RewriteRuleTokenStream(adaptor,"token REQUIRE_KEY");
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");

		try {
			// Pddl.g:133:2: ( '(' ':requirements' ( REQUIRE_KEY )+ ')' -> ^( REQUIREMENTS ( REQUIRE_KEY )+ ) )
			// Pddl.g:133:4: '(' ':requirements' ( REQUIRE_KEY )+ ')'
			{
			char_literal23=(Token)match(input,67,FOLLOW_67_in_requireDef630); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal23);

			string_literal24=(Token)match(input,94,FOLLOW_94_in_requireDef632); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_94.add(string_literal24);

			// Pddl.g:133:24: ( REQUIRE_KEY )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==REQUIRE_KEY) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Pddl.g:133:24: REQUIRE_KEY
					{
					REQUIRE_KEY25=(Token)match(input,REQUIRE_KEY,FOLLOW_REQUIRE_KEY_in_requireDef634); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_REQUIRE_KEY.add(REQUIRE_KEY25);

					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			char_literal26=(Token)match(input,68,FOLLOW_68_in_requireDef637); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal26);

			// AST REWRITE
			// elements: REQUIRE_KEY
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 134:2: -> ^( REQUIREMENTS ( REQUIRE_KEY )+ )
			{
				// Pddl.g:134:5: ^( REQUIREMENTS ( REQUIRE_KEY )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REQUIREMENTS, "REQUIREMENTS"), root_1);
				if ( !(stream_REQUIRE_KEY.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_REQUIRE_KEY.hasNext() ) {
					adaptor.addChild(root_1, stream_REQUIRE_KEY.nextNode());
				}
				stream_REQUIRE_KEY.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "requireDef"


	public static class typesDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typesDef"
	// Pddl.g:137:1: typesDef : '(' ':types' typedNameList ')' -> ^( TYPES typedNameList ) ;
	public final PddlParser.typesDef_return typesDef() throws RecognitionException {
		PddlParser.typesDef_return retval = new PddlParser.typesDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal27=null;
		Token string_literal28=null;
		Token char_literal30=null;
		ParserRuleReturnScope typedNameList29 =null;

		Object char_literal27_tree=null;
		Object string_literal28_tree=null;
		Object char_literal30_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
		RewriteRuleSubtreeStream stream_typedNameList=new RewriteRuleSubtreeStream(adaptor,"rule typedNameList");

		try {
			// Pddl.g:138:2: ( '(' ':types' typedNameList ')' -> ^( TYPES typedNameList ) )
			// Pddl.g:138:4: '(' ':types' typedNameList ')'
			{
			char_literal27=(Token)match(input,67,FOLLOW_67_in_typesDef658); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal27);

			string_literal28=(Token)match(input,95,FOLLOW_95_in_typesDef660); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_95.add(string_literal28);

			pushFollow(FOLLOW_typedNameList_in_typesDef662);
			typedNameList29=typedNameList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typedNameList.add(typedNameList29.getTree());
			char_literal30=(Token)match(input,68,FOLLOW_68_in_typesDef664); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal30);

			// AST REWRITE
			// elements: typedNameList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 139:4: -> ^( TYPES typedNameList )
			{
				// Pddl.g:139:7: ^( TYPES typedNameList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPES, "TYPES"), root_1);
				adaptor.addChild(root_1, stream_typedNameList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typesDef"


	public static class typedNameList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typedNameList"
	// Pddl.g:143:1: typedNameList : ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* ) ;
	public final PddlParser.typedNameList_return typedNameList() throws RecognitionException {
		PddlParser.typedNameList_return retval = new PddlParser.typedNameList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME31=null;
		Token NAME33=null;
		ParserRuleReturnScope singleTypeNameList32 =null;

		Object NAME31_tree=null;
		Object NAME33_tree=null;

		try {
			// Pddl.g:144:5: ( ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* ) )
			// Pddl.g:144:7: ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* )
			{
			root_0 = (Object)adaptor.nil();


			// Pddl.g:144:7: ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* )
			int alt14=2;
			alt14 = dfa14.predict(input);
			switch (alt14) {
				case 1 :
					// Pddl.g:144:8: ( NAME )*
					{
					// Pddl.g:144:8: ( NAME )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==NAME) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// Pddl.g:144:8: NAME
							{
							NAME31=(Token)match(input,NAME,FOLLOW_NAME_in_typedNameList691); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NAME31_tree = (Object)adaptor.create(NAME31);
							adaptor.addChild(root_0, NAME31_tree);
							}

							}
							break;

						default :
							break loop11;
						}
					}

					}
					break;
				case 2 :
					// Pddl.g:144:16: ( singleTypeNameList )+ ( NAME )*
					{
					// Pddl.g:144:16: ( singleTypeNameList )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						alt12 = dfa12.predict(input);
						switch (alt12) {
						case 1 :
							// Pddl.g:144:16: singleTypeNameList
							{
							pushFollow(FOLLOW_singleTypeNameList_in_typedNameList696);
							singleTypeNameList32=singleTypeNameList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, singleTypeNameList32.getTree());

							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					// Pddl.g:144:36: ( NAME )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==NAME) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// Pddl.g:144:36: NAME
							{
							NAME33=(Token)match(input,NAME,FOLLOW_NAME_in_typedNameList699); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NAME33_tree = (Object)adaptor.create(NAME33);
							adaptor.addChild(root_0, NAME33_tree);
							}

							}
							break;

						default :
							break loop13;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typedNameList"


	public static class singleTypeNameList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "singleTypeNameList"
	// Pddl.g:147:1: singleTypeNameList : ( ( NAME )+ '-' t= type ) -> ( ^( NAME $t) )+ ;
	public final PddlParser.singleTypeNameList_return singleTypeNameList() throws RecognitionException {
		PddlParser.singleTypeNameList_return retval = new PddlParser.singleTypeNameList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME34=null;
		Token char_literal35=null;
		ParserRuleReturnScope t =null;

		Object NAME34_tree=null;
		Object char_literal35_tree=null;
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Pddl.g:148:5: ( ( ( NAME )+ '-' t= type ) -> ( ^( NAME $t) )+ )
			// Pddl.g:148:7: ( ( NAME )+ '-' t= type )
			{
			// Pddl.g:148:7: ( ( NAME )+ '-' t= type )
			// Pddl.g:148:8: ( NAME )+ '-' t= type
			{
			// Pddl.g:148:8: ( NAME )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==NAME) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// Pddl.g:148:8: NAME
					{
					NAME34=(Token)match(input,NAME,FOLLOW_NAME_in_singleTypeNameList719); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAME.add(NAME34);

					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			char_literal35=(Token)match(input,71,FOLLOW_71_in_singleTypeNameList722); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_71.add(char_literal35);

			pushFollow(FOLLOW_type_in_singleTypeNameList726);
			t=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(t.getTree());
			}

			// AST REWRITE
			// elements: t, NAME
			// token labels: 
			// rule labels: t, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 149:4: -> ( ^( NAME $t) )+
			{
				if ( !(stream_t.hasNext()||stream_NAME.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_t.hasNext()||stream_NAME.hasNext() ) {
					// Pddl.g:149:7: ^( NAME $t)
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot(stream_NAME.nextNode(), root_1);
					adaptor.addChild(root_1, stream_t.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_t.reset();
				stream_NAME.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "singleTypeNameList"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// Pddl.g:152:1: type : ( ( '(' 'either' ( primType )+ ')' ) -> ^( EITHER_TYPE ( primType )+ ) | primType );
	public final PddlParser.type_return type() throws RecognitionException {
		PddlParser.type_return retval = new PddlParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal36=null;
		Token string_literal37=null;
		Token char_literal39=null;
		ParserRuleReturnScope primType38 =null;
		ParserRuleReturnScope primType40 =null;

		Object char_literal36_tree=null;
		Object string_literal37_tree=null;
		Object char_literal39_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
		RewriteRuleSubtreeStream stream_primType=new RewriteRuleSubtreeStream(adaptor,"rule primType");

		try {
			// Pddl.g:153:2: ( ( '(' 'either' ( primType )+ ')' ) -> ^( EITHER_TYPE ( primType )+ ) | primType )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==67) ) {
				alt17=1;
			}
			else if ( (LA17_0==NAME) ) {
				alt17=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// Pddl.g:153:4: ( '(' 'either' ( primType )+ ')' )
					{
					// Pddl.g:153:4: ( '(' 'either' ( primType )+ ')' )
					// Pddl.g:153:6: '(' 'either' ( primType )+ ')'
					{
					char_literal36=(Token)match(input,67,FOLLOW_67_in_type753); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal36);

					string_literal37=(Token)match(input,114,FOLLOW_114_in_type755); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_114.add(string_literal37);

					// Pddl.g:153:19: ( primType )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==NAME) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// Pddl.g:153:19: primType
							{
							pushFollow(FOLLOW_primType_in_type757);
							primType38=primType();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_primType.add(primType38.getTree());
							}
							break;

						default :
							if ( cnt16 >= 1 ) break loop16;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
					}

					char_literal39=(Token)match(input,68,FOLLOW_68_in_type760); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal39);

					}

					// AST REWRITE
					// elements: primType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 154:4: -> ^( EITHER_TYPE ( primType )+ )
					{
						// Pddl.g:154:7: ^( EITHER_TYPE ( primType )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EITHER_TYPE, "EITHER_TYPE"), root_1);
						if ( !(stream_primType.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_primType.hasNext() ) {
							adaptor.addChild(root_1, stream_primType.nextTree());
						}
						stream_primType.reset();

						adaptor.addChild(root_0, root_1);
						}

						adaptor.addChild(root_0, new String("debug"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:155:4: primType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primType_in_type781);
					primType40=primType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primType40.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class primType_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primType"
	// Pddl.g:158:1: primType : NAME ;
	public final PddlParser.primType_return primType() throws RecognitionException {
		PddlParser.primType_return retval = new PddlParser.primType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME41=null;

		Object NAME41_tree=null;

		try {
			// Pddl.g:158:10: ( NAME )
			// Pddl.g:158:12: NAME
			{
			root_0 = (Object)adaptor.nil();


			NAME41=(Token)match(input,NAME,FOLLOW_NAME_in_primType791); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NAME41_tree = (Object)adaptor.create(NAME41);
			adaptor.addChild(root_0, NAME41_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primType"


	public static class functionsDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionsDef"
	// Pddl.g:160:1: functionsDef : '(' ':functions' functionList ')' -> ^( FUNCTIONS functionList ) ;
	public final PddlParser.functionsDef_return functionsDef() throws RecognitionException {
		PddlParser.functionsDef_return retval = new PddlParser.functionsDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal42=null;
		Token string_literal43=null;
		Token char_literal45=null;
		ParserRuleReturnScope functionList44 =null;

		Object char_literal42_tree=null;
		Object string_literal43_tree=null;
		Object char_literal45_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_functionList=new RewriteRuleSubtreeStream(adaptor,"rule functionList");

		try {
			// Pddl.g:161:2: ( '(' ':functions' functionList ')' -> ^( FUNCTIONS functionList ) )
			// Pddl.g:161:4: '(' ':functions' functionList ')'
			{
			char_literal42=(Token)match(input,67,FOLLOW_67_in_functionsDef801); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal42);

			string_literal43=(Token)match(input,85,FOLLOW_85_in_functionsDef803); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_85.add(string_literal43);

			pushFollow(FOLLOW_functionList_in_functionsDef805);
			functionList44=functionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_functionList.add(functionList44.getTree());
			char_literal45=(Token)match(input,68,FOLLOW_68_in_functionsDef807); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal45);

			// AST REWRITE
			// elements: functionList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 162:2: -> ^( FUNCTIONS functionList )
			{
				// Pddl.g:162:5: ^( FUNCTIONS functionList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTIONS, "FUNCTIONS"), root_1);
				adaptor.addChild(root_1, stream_functionList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionsDef"


	public static class functionList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionList"
	// Pddl.g:165:1: functionList : ( ( atomicFunctionSkeleton )+ ( '-' functionType )? )* ;
	public final PddlParser.functionList_return functionList() throws RecognitionException {
		PddlParser.functionList_return retval = new PddlParser.functionList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal47=null;
		ParserRuleReturnScope atomicFunctionSkeleton46 =null;
		ParserRuleReturnScope functionType48 =null;

		Object char_literal47_tree=null;

		try {
			// Pddl.g:166:2: ( ( ( atomicFunctionSkeleton )+ ( '-' functionType )? )* )
			// Pddl.g:166:4: ( ( atomicFunctionSkeleton )+ ( '-' functionType )? )*
			{
			root_0 = (Object)adaptor.nil();


			// Pddl.g:166:4: ( ( atomicFunctionSkeleton )+ ( '-' functionType )? )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==67) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// Pddl.g:166:5: ( atomicFunctionSkeleton )+ ( '-' functionType )?
					{
					// Pddl.g:166:5: ( atomicFunctionSkeleton )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==67) ) {
							int LA18_2 = input.LA(2);
							if ( (synpred18_Pddl()) ) {
								alt18=1;
							}

						}

						switch (alt18) {
						case 1 :
							// Pddl.g:166:5: atomicFunctionSkeleton
							{
							pushFollow(FOLLOW_atomicFunctionSkeleton_in_functionList828);
							atomicFunctionSkeleton46=atomicFunctionSkeleton();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicFunctionSkeleton46.getTree());

							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					// Pddl.g:166:29: ( '-' functionType )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==71) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// Pddl.g:166:30: '-' functionType
							{
							char_literal47=(Token)match(input,71,FOLLOW_71_in_functionList832); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal47_tree = (Object)adaptor.create(char_literal47);
							adaptor.addChild(root_0, char_literal47_tree);
							}

							pushFollow(FOLLOW_functionType_in_functionList834);
							functionType48=functionType();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, functionType48.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop20;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionList"


	public static class atomicFunctionSkeleton_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atomicFunctionSkeleton"
	// Pddl.g:169:1: atomicFunctionSkeleton : '(' ! functionSymbol ^ typedVariableList ')' !;
	public final PddlParser.atomicFunctionSkeleton_return atomicFunctionSkeleton() throws RecognitionException {
		PddlParser.atomicFunctionSkeleton_return retval = new PddlParser.atomicFunctionSkeleton_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal49=null;
		Token char_literal52=null;
		ParserRuleReturnScope functionSymbol50 =null;
		ParserRuleReturnScope typedVariableList51 =null;

		Object char_literal49_tree=null;
		Object char_literal52_tree=null;

		try {
			// Pddl.g:170:2: ( '(' ! functionSymbol ^ typedVariableList ')' !)
			// Pddl.g:170:4: '(' ! functionSymbol ^ typedVariableList ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal49=(Token)match(input,67,FOLLOW_67_in_atomicFunctionSkeleton850); if (state.failed) return retval;
			pushFollow(FOLLOW_functionSymbol_in_atomicFunctionSkeleton853);
			functionSymbol50=functionSymbol();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(functionSymbol50.getTree(), root_0);
			pushFollow(FOLLOW_typedVariableList_in_atomicFunctionSkeleton856);
			typedVariableList51=typedVariableList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList51.getTree());

			char_literal52=(Token)match(input,68,FOLLOW_68_in_atomicFunctionSkeleton858); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomicFunctionSkeleton"


	public static class functionSymbol_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionSymbol"
	// Pddl.g:173:1: functionSymbol : ( NAME | '#t' );
	public final PddlParser.functionSymbol_return functionSymbol() throws RecognitionException {
		PddlParser.functionSymbol_return retval = new PddlParser.functionSymbol_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set53=null;

		Object set53_tree=null;

		try {
			// Pddl.g:173:16: ( NAME | '#t' )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set53=input.LT(1);
			if ( input.LA(1)==NAME||input.LA(1)==66 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set53));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionSymbol"


	public static class functionType_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionType"
	// Pddl.g:175:1: functionType : 'number' ;
	public final PddlParser.functionType_return functionType() throws RecognitionException {
		PddlParser.functionType_return retval = new PddlParser.functionType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal54=null;

		Object string_literal54_tree=null;

		try {
			// Pddl.g:175:14: ( 'number' )
			// Pddl.g:175:16: 'number'
			{
			root_0 = (Object)adaptor.nil();


			string_literal54=(Token)match(input,126,FOLLOW_126_in_functionType881); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal54_tree = (Object)adaptor.create(string_literal54);
			adaptor.addChild(root_0, string_literal54_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionType"


	public static class constantsDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constantsDef"
	// Pddl.g:177:1: constantsDef : '(' ':constants' typedNameList ')' -> ^( CONSTANTS typedNameList ) ;
	public final PddlParser.constantsDef_return constantsDef() throws RecognitionException {
		PddlParser.constantsDef_return retval = new PddlParser.constantsDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal55=null;
		Token string_literal56=null;
		Token char_literal58=null;
		ParserRuleReturnScope typedNameList57 =null;

		Object char_literal55_tree=null;
		Object string_literal56_tree=null;
		Object char_literal58_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleSubtreeStream stream_typedNameList=new RewriteRuleSubtreeStream(adaptor,"rule typedNameList");

		try {
			// Pddl.g:178:2: ( '(' ':constants' typedNameList ')' -> ^( CONSTANTS typedNameList ) )
			// Pddl.g:178:4: '(' ':constants' typedNameList ')'
			{
			char_literal55=(Token)match(input,67,FOLLOW_67_in_constantsDef892); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal55);

			string_literal56=(Token)match(input,75,FOLLOW_75_in_constantsDef894); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_75.add(string_literal56);

			pushFollow(FOLLOW_typedNameList_in_constantsDef896);
			typedNameList57=typedNameList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typedNameList.add(typedNameList57.getTree());
			char_literal58=(Token)match(input,68,FOLLOW_68_in_constantsDef898); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal58);

			// AST REWRITE
			// elements: typedNameList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 179:2: -> ^( CONSTANTS typedNameList )
			{
				// Pddl.g:179:5: ^( CONSTANTS typedNameList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTANTS, "CONSTANTS"), root_1);
				adaptor.addChild(root_1, stream_typedNameList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constantsDef"


	public static class predicatesDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "predicatesDef"
	// Pddl.g:182:1: predicatesDef : '(' ':predicates' ( atomicFormulaSkeleton )+ ')' -> ^( PREDICATES ( atomicFormulaSkeleton )+ ) ;
	public final PddlParser.predicatesDef_return predicatesDef() throws RecognitionException {
		PddlParser.predicatesDef_return retval = new PddlParser.predicatesDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal59=null;
		Token string_literal60=null;
		Token char_literal62=null;
		ParserRuleReturnScope atomicFormulaSkeleton61 =null;

		Object char_literal59_tree=null;
		Object string_literal60_tree=null;
		Object char_literal62_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleSubtreeStream stream_atomicFormulaSkeleton=new RewriteRuleSubtreeStream(adaptor,"rule atomicFormulaSkeleton");

		try {
			// Pddl.g:183:2: ( '(' ':predicates' ( atomicFormulaSkeleton )+ ')' -> ^( PREDICATES ( atomicFormulaSkeleton )+ ) )
			// Pddl.g:183:4: '(' ':predicates' ( atomicFormulaSkeleton )+ ')'
			{
			char_literal59=(Token)match(input,67,FOLLOW_67_in_predicatesDef918); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal59);

			string_literal60=(Token)match(input,92,FOLLOW_92_in_predicatesDef920); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_92.add(string_literal60);

			// Pddl.g:183:22: ( atomicFormulaSkeleton )+
			int cnt21=0;
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==67) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// Pddl.g:183:22: atomicFormulaSkeleton
					{
					pushFollow(FOLLOW_atomicFormulaSkeleton_in_predicatesDef922);
					atomicFormulaSkeleton61=atomicFormulaSkeleton();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atomicFormulaSkeleton.add(atomicFormulaSkeleton61.getTree());
					}
					break;

				default :
					if ( cnt21 >= 1 ) break loop21;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(21, input);
					throw eee;
				}
				cnt21++;
			}

			char_literal62=(Token)match(input,68,FOLLOW_68_in_predicatesDef925); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal62);

			// AST REWRITE
			// elements: atomicFormulaSkeleton
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 184:2: -> ^( PREDICATES ( atomicFormulaSkeleton )+ )
			{
				// Pddl.g:184:5: ^( PREDICATES ( atomicFormulaSkeleton )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREDICATES, "PREDICATES"), root_1);
				if ( !(stream_atomicFormulaSkeleton.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_atomicFormulaSkeleton.hasNext() ) {
					adaptor.addChild(root_1, stream_atomicFormulaSkeleton.nextTree());
				}
				stream_atomicFormulaSkeleton.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "predicatesDef"


	public static class atomicFormulaSkeleton_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atomicFormulaSkeleton"
	// Pddl.g:187:1: atomicFormulaSkeleton : '(' ! predicate ^ typedVariableList ')' !;
	public final PddlParser.atomicFormulaSkeleton_return atomicFormulaSkeleton() throws RecognitionException {
		PddlParser.atomicFormulaSkeleton_return retval = new PddlParser.atomicFormulaSkeleton_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal63=null;
		Token char_literal66=null;
		ParserRuleReturnScope predicate64 =null;
		ParserRuleReturnScope typedVariableList65 =null;

		Object char_literal63_tree=null;
		Object char_literal66_tree=null;

		try {
			// Pddl.g:188:2: ( '(' ! predicate ^ typedVariableList ')' !)
			// Pddl.g:188:4: '(' ! predicate ^ typedVariableList ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal63=(Token)match(input,67,FOLLOW_67_in_atomicFormulaSkeleton946); if (state.failed) return retval;
			pushFollow(FOLLOW_predicate_in_atomicFormulaSkeleton949);
			predicate64=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(predicate64.getTree(), root_0);
			pushFollow(FOLLOW_typedVariableList_in_atomicFormulaSkeleton952);
			typedVariableList65=typedVariableList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList65.getTree());

			char_literal66=(Token)match(input,68,FOLLOW_68_in_atomicFormulaSkeleton954); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomicFormulaSkeleton"


	public static class predicate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "predicate"
	// Pddl.g:191:1: predicate : NAME ;
	public final PddlParser.predicate_return predicate() throws RecognitionException {
		PddlParser.predicate_return retval = new PddlParser.predicate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME67=null;

		Object NAME67_tree=null;

		try {
			// Pddl.g:191:11: ( NAME )
			// Pddl.g:191:13: NAME
			{
			root_0 = (Object)adaptor.nil();


			NAME67=(Token)match(input,NAME,FOLLOW_NAME_in_predicate965); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NAME67_tree = (Object)adaptor.create(NAME67);
			adaptor.addChild(root_0, NAME67_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "predicate"


	public static class typedVariableList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typedVariableList"
	// Pddl.g:194:1: typedVariableList : ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* ) ;
	public final PddlParser.typedVariableList_return typedVariableList() throws RecognitionException {
		PddlParser.typedVariableList_return retval = new PddlParser.typedVariableList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE68=null;
		Token VARIABLE70=null;
		ParserRuleReturnScope singleTypeVarList69 =null;

		Object VARIABLE68_tree=null;
		Object VARIABLE70_tree=null;

		try {
			// Pddl.g:195:5: ( ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* ) )
			// Pddl.g:195:7: ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* )
			{
			root_0 = (Object)adaptor.nil();


			// Pddl.g:195:7: ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* )
			int alt25=2;
			alt25 = dfa25.predict(input);
			switch (alt25) {
				case 1 :
					// Pddl.g:195:8: ( VARIABLE )*
					{
					// Pddl.g:195:8: ( VARIABLE )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==VARIABLE) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// Pddl.g:195:8: VARIABLE
							{
							VARIABLE68=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_typedVariableList980); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VARIABLE68_tree = (Object)adaptor.create(VARIABLE68);
							adaptor.addChild(root_0, VARIABLE68_tree);
							}

							}
							break;

						default :
							break loop22;
						}
					}

					}
					break;
				case 2 :
					// Pddl.g:195:20: ( singleTypeVarList )+ ( VARIABLE )*
					{
					// Pddl.g:195:20: ( singleTypeVarList )+
					int cnt23=0;
					loop23:
					while (true) {
						int alt23=2;
						alt23 = dfa23.predict(input);
						switch (alt23) {
						case 1 :
							// Pddl.g:195:20: singleTypeVarList
							{
							pushFollow(FOLLOW_singleTypeVarList_in_typedVariableList985);
							singleTypeVarList69=singleTypeVarList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, singleTypeVarList69.getTree());

							}
							break;

						default :
							if ( cnt23 >= 1 ) break loop23;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(23, input);
							throw eee;
						}
						cnt23++;
					}

					// Pddl.g:195:39: ( VARIABLE )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==VARIABLE) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// Pddl.g:195:39: VARIABLE
							{
							VARIABLE70=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_typedVariableList988); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VARIABLE70_tree = (Object)adaptor.create(VARIABLE70);
							adaptor.addChild(root_0, VARIABLE70_tree);
							}

							}
							break;

						default :
							break loop24;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typedVariableList"


	public static class singleTypeVarList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "singleTypeVarList"
	// Pddl.g:198:1: singleTypeVarList : ( ( VARIABLE )+ '-' t= type ) -> ( ^( VARIABLE $t) )+ ;
	public final PddlParser.singleTypeVarList_return singleTypeVarList() throws RecognitionException {
		PddlParser.singleTypeVarList_return retval = new PddlParser.singleTypeVarList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE71=null;
		Token char_literal72=null;
		ParserRuleReturnScope t =null;

		Object VARIABLE71_tree=null;
		Object char_literal72_tree=null;
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Pddl.g:199:5: ( ( ( VARIABLE )+ '-' t= type ) -> ( ^( VARIABLE $t) )+ )
			// Pddl.g:199:7: ( ( VARIABLE )+ '-' t= type )
			{
			// Pddl.g:199:7: ( ( VARIABLE )+ '-' t= type )
			// Pddl.g:199:8: ( VARIABLE )+ '-' t= type
			{
			// Pddl.g:199:8: ( VARIABLE )+
			int cnt26=0;
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==VARIABLE) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// Pddl.g:199:8: VARIABLE
					{
					VARIABLE71=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_singleTypeVarList1008); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE71);

					}
					break;

				default :
					if ( cnt26 >= 1 ) break loop26;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(26, input);
					throw eee;
				}
				cnt26++;
			}

			char_literal72=(Token)match(input,71,FOLLOW_71_in_singleTypeVarList1011); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_71.add(char_literal72);

			pushFollow(FOLLOW_type_in_singleTypeVarList1015);
			t=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(t.getTree());
			}

			// AST REWRITE
			// elements: t, VARIABLE
			// token labels: 
			// rule labels: t, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 200:7: -> ( ^( VARIABLE $t) )+
			{
				if ( !(stream_t.hasNext()||stream_VARIABLE.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_t.hasNext()||stream_VARIABLE.hasNext() ) {
					// Pddl.g:200:10: ^( VARIABLE $t)
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot(stream_VARIABLE.nextNode(), root_1);
					adaptor.addChild(root_1, stream_t.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_t.reset();
				stream_VARIABLE.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "singleTypeVarList"


	public static class constraints_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constraints"
	// Pddl.g:203:1: constraints : '(' ! ':constraints' ^ conGD ')' !;
	public final PddlParser.constraints_return constraints() throws RecognitionException {
		PddlParser.constraints_return retval = new PddlParser.constraints_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal73=null;
		Token string_literal74=null;
		Token char_literal76=null;
		ParserRuleReturnScope conGD75 =null;

		Object char_literal73_tree=null;
		Object string_literal74_tree=null;
		Object char_literal76_tree=null;

		try {
			// Pddl.g:204:2: ( '(' ! ':constraints' ^ conGD ')' !)
			// Pddl.g:204:4: '(' ! ':constraints' ^ conGD ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal73=(Token)match(input,67,FOLLOW_67_in_constraints1046); if (state.failed) return retval;
			string_literal74=(Token)match(input,77,FOLLOW_77_in_constraints1049); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal74_tree = (Object)adaptor.create(string_literal74);
			root_0 = (Object)adaptor.becomeRoot(string_literal74_tree, root_0);
			}

			pushFollow(FOLLOW_conGD_in_constraints1052);
			conGD75=conGD();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD75.getTree());

			char_literal76=(Token)match(input,68,FOLLOW_68_in_constraints1054); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constraints"


	public static class structureDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "structureDef"
	// Pddl.g:207:1: structureDef : ( actionDef | durativeActionDef | derivedDef | constraintDef | processDef | eventDef );
	public final PddlParser.structureDef_return structureDef() throws RecognitionException {
		PddlParser.structureDef_return retval = new PddlParser.structureDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope actionDef77 =null;
		ParserRuleReturnScope durativeActionDef78 =null;
		ParserRuleReturnScope derivedDef79 =null;
		ParserRuleReturnScope constraintDef80 =null;
		ParserRuleReturnScope processDef81 =null;
		ParserRuleReturnScope eventDef82 =null;


		try {
			// Pddl.g:208:2: ( actionDef | durativeActionDef | derivedDef | constraintDef | processDef | eventDef )
			int alt27=6;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==67) ) {
				switch ( input.LA(2) ) {
				case 73:
					{
					alt27=1;
					}
					break;
				case 81:
					{
					alt27=2;
					}
					break;
				case 78:
					{
					alt27=3;
					}
					break;
				case 76:
					{
					alt27=4;
					}
					break;
				case 93:
					{
					alt27=5;
					}
					break;
				case 83:
					{
					alt27=6;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// Pddl.g:208:4: actionDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_actionDef_in_structureDef1066);
					actionDef77=actionDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, actionDef77.getTree());

					}
					break;
				case 2 :
					// Pddl.g:209:4: durativeActionDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_durativeActionDef_in_structureDef1071);
					durativeActionDef78=durativeActionDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, durativeActionDef78.getTree());

					}
					break;
				case 3 :
					// Pddl.g:210:4: derivedDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_derivedDef_in_structureDef1076);
					derivedDef79=derivedDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, derivedDef79.getTree());

					}
					break;
				case 4 :
					// Pddl.g:211:4: constraintDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constraintDef_in_structureDef1081);
					constraintDef80=constraintDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constraintDef80.getTree());

					}
					break;
				case 5 :
					// Pddl.g:212:4: processDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_processDef_in_structureDef1086);
					processDef81=processDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, processDef81.getTree());

					}
					break;
				case 6 :
					// Pddl.g:213:4: eventDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_eventDef_in_structureDef1091);
					eventDef82=eventDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, eventDef82.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "structureDef"


	public static class actionDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actionDef"
	// Pddl.g:219:1: actionDef : '(' ':action' actionSymbol ':parameters' '(' typedVariableList ')' actionDefBody ')' -> ^( ACTION actionSymbol ( typedVariableList )? actionDefBody ) ;
	public final PddlParser.actionDef_return actionDef() throws RecognitionException {
		PddlParser.actionDef_return retval = new PddlParser.actionDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal83=null;
		Token string_literal84=null;
		Token string_literal86=null;
		Token char_literal87=null;
		Token char_literal89=null;
		Token char_literal91=null;
		ParserRuleReturnScope actionSymbol85 =null;
		ParserRuleReturnScope typedVariableList88 =null;
		ParserRuleReturnScope actionDefBody90 =null;

		Object char_literal83_tree=null;
		Object string_literal84_tree=null;
		Object string_literal86_tree=null;
		Object char_literal87_tree=null;
		Object char_literal89_tree=null;
		Object char_literal91_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
		RewriteRuleSubtreeStream stream_actionDefBody=new RewriteRuleSubtreeStream(adaptor,"rule actionDefBody");
		RewriteRuleSubtreeStream stream_actionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule actionSymbol");

		try {
			// Pddl.g:220:2: ( '(' ':action' actionSymbol ':parameters' '(' typedVariableList ')' actionDefBody ')' -> ^( ACTION actionSymbol ( typedVariableList )? actionDefBody ) )
			// Pddl.g:220:4: '(' ':action' actionSymbol ':parameters' '(' typedVariableList ')' actionDefBody ')'
			{
			char_literal83=(Token)match(input,67,FOLLOW_67_in_actionDef1106); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal83);

			string_literal84=(Token)match(input,73,FOLLOW_73_in_actionDef1108); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_73.add(string_literal84);

			pushFollow(FOLLOW_actionSymbol_in_actionDef1110);
			actionSymbol85=actionSymbol();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actionSymbol.add(actionSymbol85.getTree());
			string_literal86=(Token)match(input,90,FOLLOW_90_in_actionDef1119); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_90.add(string_literal86);

			char_literal87=(Token)match(input,67,FOLLOW_67_in_actionDef1122); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal87);

			pushFollow(FOLLOW_typedVariableList_in_actionDef1124);
			typedVariableList88=typedVariableList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList88.getTree());
			char_literal89=(Token)match(input,68,FOLLOW_68_in_actionDef1126); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal89);

			pushFollow(FOLLOW_actionDefBody_in_actionDef1139);
			actionDefBody90=actionDefBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actionDefBody.add(actionDefBody90.getTree());
			char_literal91=(Token)match(input,68,FOLLOW_68_in_actionDef1141); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal91);

			// AST REWRITE
			// elements: actionDefBody, actionSymbol, typedVariableList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 223:8: -> ^( ACTION actionSymbol ( typedVariableList )? actionDefBody )
			{
				// Pddl.g:223:11: ^( ACTION actionSymbol ( typedVariableList )? actionDefBody )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACTION, "ACTION"), root_1);
				adaptor.addChild(root_1, stream_actionSymbol.nextTree());
				// Pddl.g:223:33: ( typedVariableList )?
				if ( stream_typedVariableList.hasNext() ) {
					adaptor.addChild(root_1, stream_typedVariableList.nextTree());
				}
				stream_typedVariableList.reset();

				adaptor.addChild(root_1, stream_actionDefBody.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actionDef"


	public static class eventDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "eventDef"
	// Pddl.g:225:1: eventDef : '(' ':event' actionSymbol ':parameters' '(' typedVariableList ')' actionDefBody ')' -> ^( EVENT actionSymbol ( typedVariableList )? actionDefBody ) ;
	public final PddlParser.eventDef_return eventDef() throws RecognitionException {
		PddlParser.eventDef_return retval = new PddlParser.eventDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal92=null;
		Token string_literal93=null;
		Token string_literal95=null;
		Token char_literal96=null;
		Token char_literal98=null;
		Token char_literal100=null;
		ParserRuleReturnScope actionSymbol94 =null;
		ParserRuleReturnScope typedVariableList97 =null;
		ParserRuleReturnScope actionDefBody99 =null;

		Object char_literal92_tree=null;
		Object string_literal93_tree=null;
		Object string_literal95_tree=null;
		Object char_literal96_tree=null;
		Object char_literal98_tree=null;
		Object char_literal100_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
		RewriteRuleSubtreeStream stream_actionDefBody=new RewriteRuleSubtreeStream(adaptor,"rule actionDefBody");
		RewriteRuleSubtreeStream stream_actionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule actionSymbol");

		try {
			// Pddl.g:226:2: ( '(' ':event' actionSymbol ':parameters' '(' typedVariableList ')' actionDefBody ')' -> ^( EVENT actionSymbol ( typedVariableList )? actionDefBody ) )
			// Pddl.g:226:4: '(' ':event' actionSymbol ':parameters' '(' typedVariableList ')' actionDefBody ')'
			{
			char_literal92=(Token)match(input,67,FOLLOW_67_in_eventDef1174); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal92);

			string_literal93=(Token)match(input,83,FOLLOW_83_in_eventDef1176); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_83.add(string_literal93);

			pushFollow(FOLLOW_actionSymbol_in_eventDef1178);
			actionSymbol94=actionSymbol();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actionSymbol.add(actionSymbol94.getTree());
			string_literal95=(Token)match(input,90,FOLLOW_90_in_eventDef1187); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_90.add(string_literal95);

			char_literal96=(Token)match(input,67,FOLLOW_67_in_eventDef1190); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal96);

			pushFollow(FOLLOW_typedVariableList_in_eventDef1192);
			typedVariableList97=typedVariableList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList97.getTree());
			char_literal98=(Token)match(input,68,FOLLOW_68_in_eventDef1194); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal98);

			pushFollow(FOLLOW_actionDefBody_in_eventDef1207);
			actionDefBody99=actionDefBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actionDefBody.add(actionDefBody99.getTree());
			char_literal100=(Token)match(input,68,FOLLOW_68_in_eventDef1209); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal100);

			// AST REWRITE
			// elements: actionSymbol, actionDefBody, typedVariableList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 229:8: -> ^( EVENT actionSymbol ( typedVariableList )? actionDefBody )
			{
				// Pddl.g:229:11: ^( EVENT actionSymbol ( typedVariableList )? actionDefBody )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EVENT, "EVENT"), root_1);
				adaptor.addChild(root_1, stream_actionSymbol.nextTree());
				// Pddl.g:229:32: ( typedVariableList )?
				if ( stream_typedVariableList.hasNext() ) {
					adaptor.addChild(root_1, stream_typedVariableList.nextTree());
				}
				stream_typedVariableList.reset();

				adaptor.addChild(root_1, stream_actionDefBody.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "eventDef"


	public static class processDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "processDef"
	// Pddl.g:231:1: processDef : '(' ':process' actionSymbol ':parameters' '(' typedVariableList ')' actionDefBody ')' -> ^( PROCESS actionSymbol ( typedVariableList )? actionDefBody ) ;
	public final PddlParser.processDef_return processDef() throws RecognitionException {
		PddlParser.processDef_return retval = new PddlParser.processDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal101=null;
		Token string_literal102=null;
		Token string_literal104=null;
		Token char_literal105=null;
		Token char_literal107=null;
		Token char_literal109=null;
		ParserRuleReturnScope actionSymbol103 =null;
		ParserRuleReturnScope typedVariableList106 =null;
		ParserRuleReturnScope actionDefBody108 =null;

		Object char_literal101_tree=null;
		Object string_literal102_tree=null;
		Object string_literal104_tree=null;
		Object char_literal105_tree=null;
		Object char_literal107_tree=null;
		Object char_literal109_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
		RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
		RewriteRuleSubtreeStream stream_actionDefBody=new RewriteRuleSubtreeStream(adaptor,"rule actionDefBody");
		RewriteRuleSubtreeStream stream_actionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule actionSymbol");

		try {
			// Pddl.g:232:2: ( '(' ':process' actionSymbol ':parameters' '(' typedVariableList ')' actionDefBody ')' -> ^( PROCESS actionSymbol ( typedVariableList )? actionDefBody ) )
			// Pddl.g:232:4: '(' ':process' actionSymbol ':parameters' '(' typedVariableList ')' actionDefBody ')'
			{
			char_literal101=(Token)match(input,67,FOLLOW_67_in_processDef1242); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal101);

			string_literal102=(Token)match(input,93,FOLLOW_93_in_processDef1244); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_93.add(string_literal102);

			pushFollow(FOLLOW_actionSymbol_in_processDef1246);
			actionSymbol103=actionSymbol();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actionSymbol.add(actionSymbol103.getTree());
			string_literal104=(Token)match(input,90,FOLLOW_90_in_processDef1255); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_90.add(string_literal104);

			char_literal105=(Token)match(input,67,FOLLOW_67_in_processDef1258); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal105);

			pushFollow(FOLLOW_typedVariableList_in_processDef1260);
			typedVariableList106=typedVariableList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList106.getTree());
			char_literal107=(Token)match(input,68,FOLLOW_68_in_processDef1262); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal107);

			pushFollow(FOLLOW_actionDefBody_in_processDef1275);
			actionDefBody108=actionDefBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actionDefBody.add(actionDefBody108.getTree());
			char_literal109=(Token)match(input,68,FOLLOW_68_in_processDef1277); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal109);

			// AST REWRITE
			// elements: typedVariableList, actionDefBody, actionSymbol
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 235:8: -> ^( PROCESS actionSymbol ( typedVariableList )? actionDefBody )
			{
				// Pddl.g:235:11: ^( PROCESS actionSymbol ( typedVariableList )? actionDefBody )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCESS, "PROCESS"), root_1);
				adaptor.addChild(root_1, stream_actionSymbol.nextTree());
				// Pddl.g:235:34: ( typedVariableList )?
				if ( stream_typedVariableList.hasNext() ) {
					adaptor.addChild(root_1, stream_typedVariableList.nextTree());
				}
				stream_typedVariableList.reset();

				adaptor.addChild(root_1, stream_actionDefBody.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "processDef"


	public static class constraintDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constraintDef"
	// Pddl.g:238:1: constraintDef : '(' ':constraint' constraintSymbol ':parameters' '(' typedVariableList ')' constraintDefBody ')' -> ^( GLOBAL_CONSTRAINT constraintSymbol ( typedVariableList )? constraintDefBody ) ;
	public final PddlParser.constraintDef_return constraintDef() throws RecognitionException {
		PddlParser.constraintDef_return retval = new PddlParser.constraintDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal110=null;
		Token string_literal111=null;
		Token string_literal113=null;
		Token char_literal114=null;
		Token char_literal116=null;
		Token char_literal118=null;
		ParserRuleReturnScope constraintSymbol112 =null;
		ParserRuleReturnScope typedVariableList115 =null;
		ParserRuleReturnScope constraintDefBody117 =null;

		Object char_literal110_tree=null;
		Object string_literal111_tree=null;
		Object string_literal113_tree=null;
		Object char_literal114_tree=null;
		Object char_literal116_tree=null;
		Object char_literal118_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
		RewriteRuleSubtreeStream stream_constraintDefBody=new RewriteRuleSubtreeStream(adaptor,"rule constraintDefBody");
		RewriteRuleSubtreeStream stream_constraintSymbol=new RewriteRuleSubtreeStream(adaptor,"rule constraintSymbol");

		try {
			// Pddl.g:239:2: ( '(' ':constraint' constraintSymbol ':parameters' '(' typedVariableList ')' constraintDefBody ')' -> ^( GLOBAL_CONSTRAINT constraintSymbol ( typedVariableList )? constraintDefBody ) )
			// Pddl.g:239:4: '(' ':constraint' constraintSymbol ':parameters' '(' typedVariableList ')' constraintDefBody ')'
			{
			char_literal110=(Token)match(input,67,FOLLOW_67_in_constraintDef1311); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal110);

			string_literal111=(Token)match(input,76,FOLLOW_76_in_constraintDef1313); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_76.add(string_literal111);

			pushFollow(FOLLOW_constraintSymbol_in_constraintDef1315);
			constraintSymbol112=constraintSymbol();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_constraintSymbol.add(constraintSymbol112.getTree());
			string_literal113=(Token)match(input,90,FOLLOW_90_in_constraintDef1324); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_90.add(string_literal113);

			char_literal114=(Token)match(input,67,FOLLOW_67_in_constraintDef1327); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal114);

			pushFollow(FOLLOW_typedVariableList_in_constraintDef1329);
			typedVariableList115=typedVariableList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList115.getTree());
			char_literal116=(Token)match(input,68,FOLLOW_68_in_constraintDef1331); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal116);

			pushFollow(FOLLOW_constraintDefBody_in_constraintDef1344);
			constraintDefBody117=constraintDefBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_constraintDefBody.add(constraintDefBody117.getTree());
			char_literal118=(Token)match(input,68,FOLLOW_68_in_constraintDef1346); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal118);

			// AST REWRITE
			// elements: constraintSymbol, typedVariableList, constraintDefBody
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 242:8: -> ^( GLOBAL_CONSTRAINT constraintSymbol ( typedVariableList )? constraintDefBody )
			{
				// Pddl.g:242:11: ^( GLOBAL_CONSTRAINT constraintSymbol ( typedVariableList )? constraintDefBody )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(GLOBAL_CONSTRAINT, "GLOBAL_CONSTRAINT"), root_1);
				adaptor.addChild(root_1, stream_constraintSymbol.nextTree());
				// Pddl.g:242:48: ( typedVariableList )?
				if ( stream_typedVariableList.hasNext() ) {
					adaptor.addChild(root_1, stream_typedVariableList.nextTree());
				}
				stream_typedVariableList.reset();

				adaptor.addChild(root_1, stream_constraintDefBody.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constraintDef"


	public static class actionSymbol_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actionSymbol"
	// Pddl.g:246:1: actionSymbol : NAME ;
	public final PddlParser.actionSymbol_return actionSymbol() throws RecognitionException {
		PddlParser.actionSymbol_return retval = new PddlParser.actionSymbol_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME119=null;

		Object NAME119_tree=null;

		try {
			// Pddl.g:246:14: ( NAME )
			// Pddl.g:246:16: NAME
			{
			root_0 = (Object)adaptor.nil();


			NAME119=(Token)match(input,NAME,FOLLOW_NAME_in_actionSymbol1380); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NAME119_tree = (Object)adaptor.create(NAME119);
			adaptor.addChild(root_0, NAME119_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actionSymbol"


	public static class constraintSymbol_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constraintSymbol"
	// Pddl.g:248:1: constraintSymbol : NAME ;
	public final PddlParser.constraintSymbol_return constraintSymbol() throws RecognitionException {
		PddlParser.constraintSymbol_return retval = new PddlParser.constraintSymbol_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME120=null;

		Object NAME120_tree=null;

		try {
			// Pddl.g:248:18: ( NAME )
			// Pddl.g:248:20: NAME
			{
			root_0 = (Object)adaptor.nil();


			NAME120=(Token)match(input,NAME,FOLLOW_NAME_in_constraintSymbol1389); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NAME120_tree = (Object)adaptor.create(NAME120);
			adaptor.addChild(root_0, NAME120_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constraintSymbol"


	public static class actionDefBody_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actionDefBody"
	// Pddl.g:253:1: actionDefBody : ( ':precondition' ( ( '(' ')' ) | goalDesc ) )? ( ':effect' ( ( '(' ')' ) | effect ) )? -> ^( PRECONDITION ( goalDesc )? ) ^( EFFECT ( effect )? ) ;
	public final PddlParser.actionDefBody_return actionDefBody() throws RecognitionException {
		PddlParser.actionDefBody_return retval = new PddlParser.actionDefBody_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal121=null;
		Token char_literal122=null;
		Token char_literal123=null;
		Token string_literal125=null;
		Token char_literal126=null;
		Token char_literal127=null;
		ParserRuleReturnScope goalDesc124 =null;
		ParserRuleReturnScope effect128 =null;

		Object string_literal121_tree=null;
		Object char_literal122_tree=null;
		Object char_literal123_tree=null;
		Object string_literal125_tree=null;
		Object char_literal126_tree=null;
		Object char_literal127_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");
		RewriteRuleSubtreeStream stream_effect=new RewriteRuleSubtreeStream(adaptor,"rule effect");

		try {
			// Pddl.g:254:2: ( ( ':precondition' ( ( '(' ')' ) | goalDesc ) )? ( ':effect' ( ( '(' ')' ) | effect ) )? -> ^( PRECONDITION ( goalDesc )? ) ^( EFFECT ( effect )? ) )
			// Pddl.g:254:4: ( ':precondition' ( ( '(' ')' ) | goalDesc ) )? ( ':effect' ( ( '(' ')' ) | effect ) )?
			{
			// Pddl.g:254:4: ( ':precondition' ( ( '(' ')' ) | goalDesc ) )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==91) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// Pddl.g:254:6: ':precondition' ( ( '(' ')' ) | goalDesc )
					{
					string_literal121=(Token)match(input,91,FOLLOW_91_in_actionDefBody1404); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_91.add(string_literal121);

					// Pddl.g:254:22: ( ( '(' ')' ) | goalDesc )
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==67) ) {
						int LA28_1 = input.LA(2);
						if ( (LA28_1==68) ) {
							alt28=1;
						}
						else if ( (LA28_1==NAME||(LA28_1 >= 96 && LA28_1 <= 100)||LA28_1==106||(LA28_1 >= 116 && LA28_1 <= 117)||LA28_1==120||LA28_1==125||(LA28_1 >= 127 && LA28_1 <= 128)) ) {
							alt28=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 28, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 28, 0, input);
						throw nvae;
					}

					switch (alt28) {
						case 1 :
							// Pddl.g:254:23: ( '(' ')' )
							{
							// Pddl.g:254:23: ( '(' ')' )
							// Pddl.g:254:24: '(' ')'
							{
							char_literal122=(Token)match(input,67,FOLLOW_67_in_actionDefBody1408); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_67.add(char_literal122);

							char_literal123=(Token)match(input,68,FOLLOW_68_in_actionDefBody1410); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_68.add(char_literal123);

							}

							}
							break;
						case 2 :
							// Pddl.g:254:35: goalDesc
							{
							pushFollow(FOLLOW_goalDesc_in_actionDefBody1415);
							goalDesc124=goalDesc();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc124.getTree());
							}
							break;

					}

					}
					break;

			}

			// Pddl.g:255:4: ( ':effect' ( ( '(' ')' ) | effect ) )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==82) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// Pddl.g:255:6: ':effect' ( ( '(' ')' ) | effect )
					{
					string_literal125=(Token)match(input,82,FOLLOW_82_in_actionDefBody1425); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_82.add(string_literal125);

					// Pddl.g:255:16: ( ( '(' ')' ) | effect )
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==67) ) {
						int LA30_1 = input.LA(2);
						if ( (LA30_1==68) ) {
							alt30=1;
						}
						else if ( (LA30_1==NAME||(LA30_1 >= 106 && LA30_1 <= 107)||LA30_1==111||LA30_1==117||LA30_1==121||LA30_1==125||(LA30_1 >= 132 && LA30_1 <= 133)||LA30_1==140) ) {
							alt30=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 30, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						throw nvae;
					}

					switch (alt30) {
						case 1 :
							// Pddl.g:255:17: ( '(' ')' )
							{
							// Pddl.g:255:17: ( '(' ')' )
							// Pddl.g:255:18: '(' ')'
							{
							char_literal126=(Token)match(input,67,FOLLOW_67_in_actionDefBody1429); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_67.add(char_literal126);

							char_literal127=(Token)match(input,68,FOLLOW_68_in_actionDefBody1431); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_68.add(char_literal127);

							}

							}
							break;
						case 2 :
							// Pddl.g:255:29: effect
							{
							pushFollow(FOLLOW_effect_in_actionDefBody1436);
							effect128=effect();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_effect.add(effect128.getTree());
							}
							break;

					}

					}
					break;

			}

			// AST REWRITE
			// elements: effect, goalDesc
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 256:4: -> ^( PRECONDITION ( goalDesc )? ) ^( EFFECT ( effect )? )
			{
				// Pddl.g:256:7: ^( PRECONDITION ( goalDesc )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRECONDITION, "PRECONDITION"), root_1);
				// Pddl.g:256:22: ( goalDesc )?
				if ( stream_goalDesc.hasNext() ) {
					adaptor.addChild(root_1, stream_goalDesc.nextTree());
				}
				stream_goalDesc.reset();

				adaptor.addChild(root_0, root_1);
				}

				// Pddl.g:256:33: ^( EFFECT ( effect )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EFFECT, "EFFECT"), root_1);
				// Pddl.g:256:42: ( effect )?
				if ( stream_effect.hasNext() ) {
					adaptor.addChild(root_1, stream_effect.nextTree());
				}
				stream_effect.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actionDefBody"


	public static class constraintDefBody_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constraintDefBody"
	// Pddl.g:259:1: constraintDefBody : ( ':condition' ( ( '(' ')' ) | goalDesc ) )? -> ^( PRECONDITION ( goalDesc )? ) ;
	public final PddlParser.constraintDefBody_return constraintDefBody() throws RecognitionException {
		PddlParser.constraintDefBody_return retval = new PddlParser.constraintDefBody_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal129=null;
		Token char_literal130=null;
		Token char_literal131=null;
		ParserRuleReturnScope goalDesc132 =null;

		Object string_literal129_tree=null;
		Object char_literal130_tree=null;
		Object char_literal131_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");

		try {
			// Pddl.g:260:2: ( ( ':condition' ( ( '(' ')' ) | goalDesc ) )? -> ^( PRECONDITION ( goalDesc )? ) )
			// Pddl.g:260:4: ( ':condition' ( ( '(' ')' ) | goalDesc ) )?
			{
			// Pddl.g:260:4: ( ':condition' ( ( '(' ')' ) | goalDesc ) )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==74) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// Pddl.g:260:6: ':condition' ( ( '(' ')' ) | goalDesc )
					{
					string_literal129=(Token)match(input,74,FOLLOW_74_in_constraintDefBody1471); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_74.add(string_literal129);

					// Pddl.g:260:19: ( ( '(' ')' ) | goalDesc )
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==67) ) {
						int LA32_1 = input.LA(2);
						if ( (LA32_1==68) ) {
							alt32=1;
						}
						else if ( (LA32_1==NAME||(LA32_1 >= 96 && LA32_1 <= 100)||LA32_1==106||(LA32_1 >= 116 && LA32_1 <= 117)||LA32_1==120||LA32_1==125||(LA32_1 >= 127 && LA32_1 <= 128)) ) {
							alt32=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 32, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 32, 0, input);
						throw nvae;
					}

					switch (alt32) {
						case 1 :
							// Pddl.g:260:20: ( '(' ')' )
							{
							// Pddl.g:260:20: ( '(' ')' )
							// Pddl.g:260:21: '(' ')'
							{
							char_literal130=(Token)match(input,67,FOLLOW_67_in_constraintDefBody1475); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_67.add(char_literal130);

							char_literal131=(Token)match(input,68,FOLLOW_68_in_constraintDefBody1477); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_68.add(char_literal131);

							}

							}
							break;
						case 2 :
							// Pddl.g:260:32: goalDesc
							{
							pushFollow(FOLLOW_goalDesc_in_constraintDefBody1482);
							goalDesc132=goalDesc();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc132.getTree());
							}
							break;

					}

					}
					break;

			}

			// AST REWRITE
			// elements: goalDesc
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 261:4: -> ^( PRECONDITION ( goalDesc )? )
			{
				// Pddl.g:261:7: ^( PRECONDITION ( goalDesc )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRECONDITION, "PRECONDITION"), root_1);
				// Pddl.g:261:22: ( goalDesc )?
				if ( stream_goalDesc.hasNext() ) {
					adaptor.addChild(root_1, stream_goalDesc.nextTree());
				}
				stream_goalDesc.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constraintDefBody"


	public static class goalDesc_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "goalDesc"
	// Pddl.g:276:1: goalDesc : ( atomicTermFormula | '(' 'and' ( goalDesc )* ')' -> ^( AND_GD ( goalDesc )* ) | '(' 'or' ( goalDesc )* ')' -> ^( OR_GD ( goalDesc )* ) | '(' 'not' goalDesc ')' -> ^( NOT_GD goalDesc ) | '(' 'oneof' ( atomicNameFormula )* ')' -> ^( ONEOF ( atomicNameFormula )* ) | '(' 'imply' goalDesc goalDesc ')' -> ^( IMPLY_GD goalDesc goalDesc ) | '(' 'exists' '(' typedVariableList ')' goalDesc ')' -> ^( EXISTS_GD typedVariableList goalDesc ) | '(' 'forall' '(' typedVariableList ')' goalDesc ')' -> ^( FORALL_GD typedVariableList goalDesc ) | fComp -> ^( COMPARISON_GD fComp ) | equality -> ^( EQUALITY_CON equality ) );
	public final PddlParser.goalDesc_return goalDesc() throws RecognitionException {
		PddlParser.goalDesc_return retval = new PddlParser.goalDesc_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal134=null;
		Token string_literal135=null;
		Token char_literal137=null;
		Token char_literal138=null;
		Token string_literal139=null;
		Token char_literal141=null;
		Token char_literal142=null;
		Token string_literal143=null;
		Token char_literal145=null;
		Token char_literal146=null;
		Token string_literal147=null;
		Token char_literal149=null;
		Token char_literal150=null;
		Token string_literal151=null;
		Token char_literal154=null;
		Token char_literal155=null;
		Token string_literal156=null;
		Token char_literal157=null;
		Token char_literal159=null;
		Token char_literal161=null;
		Token char_literal162=null;
		Token string_literal163=null;
		Token char_literal164=null;
		Token char_literal166=null;
		Token char_literal168=null;
		ParserRuleReturnScope atomicTermFormula133 =null;
		ParserRuleReturnScope goalDesc136 =null;
		ParserRuleReturnScope goalDesc140 =null;
		ParserRuleReturnScope goalDesc144 =null;
		ParserRuleReturnScope atomicNameFormula148 =null;
		ParserRuleReturnScope goalDesc152 =null;
		ParserRuleReturnScope goalDesc153 =null;
		ParserRuleReturnScope typedVariableList158 =null;
		ParserRuleReturnScope goalDesc160 =null;
		ParserRuleReturnScope typedVariableList165 =null;
		ParserRuleReturnScope goalDesc167 =null;
		ParserRuleReturnScope fComp169 =null;
		ParserRuleReturnScope equality170 =null;

		Object char_literal134_tree=null;
		Object string_literal135_tree=null;
		Object char_literal137_tree=null;
		Object char_literal138_tree=null;
		Object string_literal139_tree=null;
		Object char_literal141_tree=null;
		Object char_literal142_tree=null;
		Object string_literal143_tree=null;
		Object char_literal145_tree=null;
		Object char_literal146_tree=null;
		Object string_literal147_tree=null;
		Object char_literal149_tree=null;
		Object char_literal150_tree=null;
		Object string_literal151_tree=null;
		Object char_literal154_tree=null;
		Object char_literal155_tree=null;
		Object string_literal156_tree=null;
		Object char_literal157_tree=null;
		Object char_literal159_tree=null;
		Object char_literal161_tree=null;
		Object char_literal162_tree=null;
		Object string_literal163_tree=null;
		Object char_literal164_tree=null;
		Object char_literal166_tree=null;
		Object char_literal168_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
		RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
		RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
		RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
		RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
		RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
		RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
		RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");
		RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
		RewriteRuleSubtreeStream stream_fComp=new RewriteRuleSubtreeStream(adaptor,"rule fComp");
		RewriteRuleSubtreeStream stream_atomicNameFormula=new RewriteRuleSubtreeStream(adaptor,"rule atomicNameFormula");
		RewriteRuleSubtreeStream stream_equality=new RewriteRuleSubtreeStream(adaptor,"rule equality");

		try {
			// Pddl.g:277:2: ( atomicTermFormula | '(' 'and' ( goalDesc )* ')' -> ^( AND_GD ( goalDesc )* ) | '(' 'or' ( goalDesc )* ')' -> ^( OR_GD ( goalDesc )* ) | '(' 'not' goalDesc ')' -> ^( NOT_GD goalDesc ) | '(' 'oneof' ( atomicNameFormula )* ')' -> ^( ONEOF ( atomicNameFormula )* ) | '(' 'imply' goalDesc goalDesc ')' -> ^( IMPLY_GD goalDesc goalDesc ) | '(' 'exists' '(' typedVariableList ')' goalDesc ')' -> ^( EXISTS_GD typedVariableList goalDesc ) | '(' 'forall' '(' typedVariableList ')' goalDesc ')' -> ^( FORALL_GD typedVariableList goalDesc ) | fComp -> ^( COMPARISON_GD fComp ) | equality -> ^( EQUALITY_CON equality ) )
			int alt37=10;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==67) ) {
				switch ( input.LA(2) ) {
				case 106:
					{
					alt37=2;
					}
					break;
				case 128:
					{
					alt37=3;
					}
					break;
				case 125:
					{
					alt37=4;
					}
					break;
				case 127:
					{
					alt37=5;
					}
					break;
				case 120:
					{
					alt37=6;
					}
					break;
				case 116:
					{
					alt37=7;
					}
					break;
				case 117:
					{
					alt37=8;
					}
					break;
				case 98:
					{
					switch ( input.LA(3) ) {
					case NAME:
						{
						switch ( input.LA(4) ) {
						case NAME:
							{
							int LA37_14 = input.LA(5);
							if ( (LA37_14==68) ) {
								int LA37_15 = input.LA(6);
								if ( (synpred50_Pddl()) ) {
									alt37=9;
								}
								else if ( (true) ) {
									alt37=10;
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 37, 14, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case NUMBER:
						case 66:
						case 67:
							{
							alt37=9;
							}
							break;
						case VARIABLE:
							{
							alt37=10;
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 37, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case NUMBER:
					case 66:
					case 67:
						{
						alt37=9;
						}
						break;
					case VARIABLE:
						{
						alt37=10;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 37, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case NAME:
					{
					alt37=1;
					}
					break;
				case 96:
				case 97:
				case 99:
				case 100:
					{
					alt37=9;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// Pddl.g:277:4: atomicTermFormula
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atomicTermFormula_in_goalDesc1520);
					atomicTermFormula133=atomicTermFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTermFormula133.getTree());

					}
					break;
				case 2 :
					// Pddl.g:278:4: '(' 'and' ( goalDesc )* ')'
					{
					char_literal134=(Token)match(input,67,FOLLOW_67_in_goalDesc1525); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal134);

					string_literal135=(Token)match(input,106,FOLLOW_106_in_goalDesc1527); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_106.add(string_literal135);

					// Pddl.g:278:14: ( goalDesc )*
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( (LA34_0==67) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// Pddl.g:278:14: goalDesc
							{
							pushFollow(FOLLOW_goalDesc_in_goalDesc1529);
							goalDesc136=goalDesc();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc136.getTree());
							}
							break;

						default :
							break loop34;
						}
					}

					char_literal137=(Token)match(input,68,FOLLOW_68_in_goalDesc1532); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal137);

					// AST REWRITE
					// elements: goalDesc
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 279:12: -> ^( AND_GD ( goalDesc )* )
					{
						// Pddl.g:279:15: ^( AND_GD ( goalDesc )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_GD, "AND_GD"), root_1);
						// Pddl.g:279:24: ( goalDesc )*
						while ( stream_goalDesc.hasNext() ) {
							adaptor.addChild(root_1, stream_goalDesc.nextTree());
						}
						stream_goalDesc.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Pddl.g:280:4: '(' 'or' ( goalDesc )* ')'
					{
					char_literal138=(Token)match(input,67,FOLLOW_67_in_goalDesc1557); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal138);

					string_literal139=(Token)match(input,128,FOLLOW_128_in_goalDesc1559); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_128.add(string_literal139);

					// Pddl.g:280:13: ( goalDesc )*
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0==67) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// Pddl.g:280:13: goalDesc
							{
							pushFollow(FOLLOW_goalDesc_in_goalDesc1561);
							goalDesc140=goalDesc();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc140.getTree());
							}
							break;

						default :
							break loop35;
						}
					}

					char_literal141=(Token)match(input,68,FOLLOW_68_in_goalDesc1564); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal141);

					// AST REWRITE
					// elements: goalDesc
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 281:12: -> ^( OR_GD ( goalDesc )* )
					{
						// Pddl.g:281:15: ^( OR_GD ( goalDesc )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR_GD, "OR_GD"), root_1);
						// Pddl.g:281:23: ( goalDesc )*
						while ( stream_goalDesc.hasNext() ) {
							adaptor.addChild(root_1, stream_goalDesc.nextTree());
						}
						stream_goalDesc.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Pddl.g:282:4: '(' 'not' goalDesc ')'
					{
					char_literal142=(Token)match(input,67,FOLLOW_67_in_goalDesc1589); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal142);

					string_literal143=(Token)match(input,125,FOLLOW_125_in_goalDesc1591); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_125.add(string_literal143);

					pushFollow(FOLLOW_goalDesc_in_goalDesc1593);
					goalDesc144=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc144.getTree());
					char_literal145=(Token)match(input,68,FOLLOW_68_in_goalDesc1595); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal145);

					// AST REWRITE
					// elements: goalDesc
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 283:12: -> ^( NOT_GD goalDesc )
					{
						// Pddl.g:283:15: ^( NOT_GD goalDesc )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_GD, "NOT_GD"), root_1);
						adaptor.addChild(root_1, stream_goalDesc.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// Pddl.g:284:4: '(' 'oneof' ( atomicNameFormula )* ')'
					{
					char_literal146=(Token)match(input,67,FOLLOW_67_in_goalDesc1619); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal146);

					string_literal147=(Token)match(input,127,FOLLOW_127_in_goalDesc1621); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_127.add(string_literal147);

					// Pddl.g:284:17: ( atomicNameFormula )*
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0==67) ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// Pddl.g:284:17: atomicNameFormula
							{
							pushFollow(FOLLOW_atomicNameFormula_in_goalDesc1624);
							atomicNameFormula148=atomicNameFormula();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_atomicNameFormula.add(atomicNameFormula148.getTree());
							}
							break;

						default :
							break loop36;
						}
					}

					char_literal149=(Token)match(input,68,FOLLOW_68_in_goalDesc1627); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal149);

					// AST REWRITE
					// elements: atomicNameFormula
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 284:41: -> ^( ONEOF ( atomicNameFormula )* )
					{
						// Pddl.g:284:44: ^( ONEOF ( atomicNameFormula )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ONEOF, "ONEOF"), root_1);
						// Pddl.g:284:52: ( atomicNameFormula )*
						while ( stream_atomicNameFormula.hasNext() ) {
							adaptor.addChild(root_1, stream_atomicNameFormula.nextTree());
						}
						stream_atomicNameFormula.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// Pddl.g:285:4: '(' 'imply' goalDesc goalDesc ')'
					{
					char_literal150=(Token)match(input,67,FOLLOW_67_in_goalDesc1642); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal150);

					string_literal151=(Token)match(input,120,FOLLOW_120_in_goalDesc1644); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_120.add(string_literal151);

					pushFollow(FOLLOW_goalDesc_in_goalDesc1646);
					goalDesc152=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc152.getTree());
					pushFollow(FOLLOW_goalDesc_in_goalDesc1648);
					goalDesc153=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc153.getTree());
					char_literal154=(Token)match(input,68,FOLLOW_68_in_goalDesc1650); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal154);

					// AST REWRITE
					// elements: goalDesc, goalDesc
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 286:12: -> ^( IMPLY_GD goalDesc goalDesc )
					{
						// Pddl.g:286:15: ^( IMPLY_GD goalDesc goalDesc )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IMPLY_GD, "IMPLY_GD"), root_1);
						adaptor.addChild(root_1, stream_goalDesc.nextTree());
						adaptor.addChild(root_1, stream_goalDesc.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// Pddl.g:287:4: '(' 'exists' '(' typedVariableList ')' goalDesc ')'
					{
					char_literal155=(Token)match(input,67,FOLLOW_67_in_goalDesc1676); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal155);

					string_literal156=(Token)match(input,116,FOLLOW_116_in_goalDesc1678); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_116.add(string_literal156);

					char_literal157=(Token)match(input,67,FOLLOW_67_in_goalDesc1680); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal157);

					pushFollow(FOLLOW_typedVariableList_in_goalDesc1682);
					typedVariableList158=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList158.getTree());
					char_literal159=(Token)match(input,68,FOLLOW_68_in_goalDesc1684); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal159);

					pushFollow(FOLLOW_goalDesc_in_goalDesc1686);
					goalDesc160=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc160.getTree());
					char_literal161=(Token)match(input,68,FOLLOW_68_in_goalDesc1688); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal161);

					// AST REWRITE
					// elements: goalDesc, typedVariableList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 288:12: -> ^( EXISTS_GD typedVariableList goalDesc )
					{
						// Pddl.g:288:15: ^( EXISTS_GD typedVariableList goalDesc )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXISTS_GD, "EXISTS_GD"), root_1);
						adaptor.addChild(root_1, stream_typedVariableList.nextTree());
						adaptor.addChild(root_1, stream_goalDesc.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// Pddl.g:289:4: '(' 'forall' '(' typedVariableList ')' goalDesc ')'
					{
					char_literal162=(Token)match(input,67,FOLLOW_67_in_goalDesc1714); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal162);

					string_literal163=(Token)match(input,117,FOLLOW_117_in_goalDesc1716); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_117.add(string_literal163);

					char_literal164=(Token)match(input,67,FOLLOW_67_in_goalDesc1718); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal164);

					pushFollow(FOLLOW_typedVariableList_in_goalDesc1720);
					typedVariableList165=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList165.getTree());
					char_literal166=(Token)match(input,68,FOLLOW_68_in_goalDesc1722); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal166);

					pushFollow(FOLLOW_goalDesc_in_goalDesc1724);
					goalDesc167=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc167.getTree());
					char_literal168=(Token)match(input,68,FOLLOW_68_in_goalDesc1726); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal168);

					// AST REWRITE
					// elements: goalDesc, typedVariableList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 290:12: -> ^( FORALL_GD typedVariableList goalDesc )
					{
						// Pddl.g:290:15: ^( FORALL_GD typedVariableList goalDesc )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORALL_GD, "FORALL_GD"), root_1);
						adaptor.addChild(root_1, stream_typedVariableList.nextTree());
						adaptor.addChild(root_1, stream_goalDesc.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 9 :
					// Pddl.g:291:7: fComp
					{
					pushFollow(FOLLOW_fComp_in_goalDesc1755);
					fComp169=fComp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fComp.add(fComp169.getTree());
					// AST REWRITE
					// elements: fComp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 292:15: -> ^( COMPARISON_GD fComp )
					{
						// Pddl.g:292:18: ^( COMPARISON_GD fComp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMPARISON_GD, "COMPARISON_GD"), root_1);
						adaptor.addChild(root_1, stream_fComp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 10 :
					// Pddl.g:293:4: equality
					{
					pushFollow(FOLLOW_equality_in_goalDesc1782);
					equality170=equality();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_equality.add(equality170.getTree());
					// AST REWRITE
					// elements: equality
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 294:6: -> ^( EQUALITY_CON equality )
					{
						// Pddl.g:294:9: ^( EQUALITY_CON equality )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQUALITY_CON, "EQUALITY_CON"), root_1);
						adaptor.addChild(root_1, stream_equality.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "goalDesc"


	public static class equality_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equality"
	// Pddl.g:297:1: equality : '(' ! '=' term term ')' !;
	public final PddlParser.equality_return equality() throws RecognitionException {
		PddlParser.equality_return retval = new PddlParser.equality_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal171=null;
		Token char_literal172=null;
		Token char_literal175=null;
		ParserRuleReturnScope term173 =null;
		ParserRuleReturnScope term174 =null;

		Object char_literal171_tree=null;
		Object char_literal172_tree=null;
		Object char_literal175_tree=null;

		try {
			// Pddl.g:298:2: ( '(' ! '=' term term ')' !)
			// Pddl.g:298:4: '(' ! '=' term term ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal171=(Token)match(input,67,FOLLOW_67_in_equality1810); if (state.failed) return retval;
			char_literal172=(Token)match(input,98,FOLLOW_98_in_equality1813); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal172_tree = (Object)adaptor.create(char_literal172);
			adaptor.addChild(root_0, char_literal172_tree);
			}

			pushFollow(FOLLOW_term_in_equality1815);
			term173=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term173.getTree());

			pushFollow(FOLLOW_term_in_equality1817);
			term174=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term174.getTree());

			char_literal175=(Token)match(input,68,FOLLOW_68_in_equality1819); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equality"


	public static class fComp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fComp"
	// Pddl.g:300:1: fComp : '(' ! binaryComp fExp fExp ')' !;
	public final PddlParser.fComp_return fComp() throws RecognitionException {
		PddlParser.fComp_return retval = new PddlParser.fComp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal176=null;
		Token char_literal180=null;
		ParserRuleReturnScope binaryComp177 =null;
		ParserRuleReturnScope fExp178 =null;
		ParserRuleReturnScope fExp179 =null;

		Object char_literal176_tree=null;
		Object char_literal180_tree=null;

		try {
			// Pddl.g:301:2: ( '(' ! binaryComp fExp fExp ')' !)
			// Pddl.g:301:4: '(' ! binaryComp fExp fExp ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal176=(Token)match(input,67,FOLLOW_67_in_fComp1830); if (state.failed) return retval;
			pushFollow(FOLLOW_binaryComp_in_fComp1833);
			binaryComp177=binaryComp();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, binaryComp177.getTree());

			pushFollow(FOLLOW_fExp_in_fComp1835);
			fExp178=fExp();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp178.getTree());

			pushFollow(FOLLOW_fExp_in_fComp1837);
			fExp179=fExp();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp179.getTree());

			char_literal180=(Token)match(input,68,FOLLOW_68_in_fComp1839); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fComp"


	public static class atomicTermFormula_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atomicTermFormula"
	// Pddl.g:304:1: atomicTermFormula : '(' predicate ( term )* ')' -> ^( PRED_HEAD predicate ( term )* ) ;
	public final PddlParser.atomicTermFormula_return atomicTermFormula() throws RecognitionException {
		PddlParser.atomicTermFormula_return retval = new PddlParser.atomicTermFormula_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal181=null;
		Token char_literal184=null;
		ParserRuleReturnScope predicate182 =null;
		ParserRuleReturnScope term183 =null;

		Object char_literal181_tree=null;
		Object char_literal184_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// Pddl.g:305:2: ( '(' predicate ( term )* ')' -> ^( PRED_HEAD predicate ( term )* ) )
			// Pddl.g:305:4: '(' predicate ( term )* ')'
			{
			char_literal181=(Token)match(input,67,FOLLOW_67_in_atomicTermFormula1851); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal181);

			pushFollow(FOLLOW_predicate_in_atomicTermFormula1853);
			predicate182=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(predicate182.getTree());
			// Pddl.g:305:18: ( term )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==NAME||LA38_0==VARIABLE) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// Pddl.g:305:18: term
					{
					pushFollow(FOLLOW_term_in_atomicTermFormula1855);
					term183=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_term.add(term183.getTree());
					}
					break;

				default :
					break loop38;
				}
			}

			char_literal184=(Token)match(input,68,FOLLOW_68_in_atomicTermFormula1858); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal184);

			// AST REWRITE
			// elements: predicate, term
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 305:28: -> ^( PRED_HEAD predicate ( term )* )
			{
				// Pddl.g:305:31: ^( PRED_HEAD predicate ( term )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRED_HEAD, "PRED_HEAD"), root_1);
				adaptor.addChild(root_1, stream_predicate.nextTree());
				// Pddl.g:305:53: ( term )*
				while ( stream_term.hasNext() ) {
					adaptor.addChild(root_1, stream_term.nextTree());
				}
				stream_term.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomicTermFormula"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// Pddl.g:308:1: term : ( NAME | VARIABLE );
	public final PddlParser.term_return term() throws RecognitionException {
		PddlParser.term_return retval = new PddlParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set185=null;

		Object set185_tree=null;

		try {
			// Pddl.g:308:6: ( NAME | VARIABLE )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set185=input.LT(1);
			if ( input.LA(1)==NAME||input.LA(1)==VARIABLE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set185));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class durativeActionDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "durativeActionDef"
	// Pddl.g:312:1: durativeActionDef : '(' ':durative-action' actionSymbol ':parameters' '(' ( typedVariableList )? ')' daDefBody ')' -> ^( DURATIVE_ACTION actionSymbol typedVariableList daDefBody ) ;
	public final PddlParser.durativeActionDef_return durativeActionDef() throws RecognitionException {
		PddlParser.durativeActionDef_return retval = new PddlParser.durativeActionDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal186=null;
		Token string_literal187=null;
		Token string_literal189=null;
		Token char_literal190=null;
		Token char_literal192=null;
		Token char_literal194=null;
		ParserRuleReturnScope actionSymbol188 =null;
		ParserRuleReturnScope typedVariableList191 =null;
		ParserRuleReturnScope daDefBody193 =null;

		Object char_literal186_tree=null;
		Object string_literal187_tree=null;
		Object string_literal189_tree=null;
		Object char_literal190_tree=null;
		Object char_literal192_tree=null;
		Object char_literal194_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleSubtreeStream stream_daDefBody=new RewriteRuleSubtreeStream(adaptor,"rule daDefBody");
		RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
		RewriteRuleSubtreeStream stream_actionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule actionSymbol");

		try {
			// Pddl.g:313:2: ( '(' ':durative-action' actionSymbol ':parameters' '(' ( typedVariableList )? ')' daDefBody ')' -> ^( DURATIVE_ACTION actionSymbol typedVariableList daDefBody ) )
			// Pddl.g:313:4: '(' ':durative-action' actionSymbol ':parameters' '(' ( typedVariableList )? ')' daDefBody ')'
			{
			char_literal186=(Token)match(input,67,FOLLOW_67_in_durativeActionDef1895); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal186);

			string_literal187=(Token)match(input,81,FOLLOW_81_in_durativeActionDef1897); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_81.add(string_literal187);

			pushFollow(FOLLOW_actionSymbol_in_durativeActionDef1899);
			actionSymbol188=actionSymbol();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actionSymbol.add(actionSymbol188.getTree());
			string_literal189=(Token)match(input,90,FOLLOW_90_in_durativeActionDef1908); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_90.add(string_literal189);

			char_literal190=(Token)match(input,67,FOLLOW_67_in_durativeActionDef1911); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal190);

			// Pddl.g:314:27: ( typedVariableList )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==VARIABLE) ) {
				alt39=1;
			}
			else if ( (LA39_0==68) ) {
				int LA39_2 = input.LA(2);
				if ( (synpred53_Pddl()) ) {
					alt39=1;
				}
			}
			switch (alt39) {
				case 1 :
					// Pddl.g:314:28: typedVariableList
					{
					pushFollow(FOLLOW_typedVariableList_in_durativeActionDef1914);
					typedVariableList191=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList191.getTree());
					}
					break;

			}

			char_literal192=(Token)match(input,68,FOLLOW_68_in_durativeActionDef1918); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal192);

			pushFollow(FOLLOW_daDefBody_in_durativeActionDef1931);
			daDefBody193=daDefBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_daDefBody.add(daDefBody193.getTree());
			char_literal194=(Token)match(input,68,FOLLOW_68_in_durativeActionDef1933); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal194);

			// AST REWRITE
			// elements: typedVariableList, actionSymbol, daDefBody
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 316:8: -> ^( DURATIVE_ACTION actionSymbol typedVariableList daDefBody )
			{
				// Pddl.g:316:11: ^( DURATIVE_ACTION actionSymbol typedVariableList daDefBody )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DURATIVE_ACTION, "DURATIVE_ACTION"), root_1);
				adaptor.addChild(root_1, stream_actionSymbol.nextTree());
				adaptor.addChild(root_1, stream_typedVariableList.nextTree());
				adaptor.addChild(root_1, stream_daDefBody.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "durativeActionDef"


	public static class daDefBody_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "daDefBody"
	// Pddl.g:319:1: daDefBody : ( ':duration' durationConstraint | ':condition' ( ( '(' ')' ) | daGD ) | ':effect' ( ( '(' ')' ) | daEffect ) );
	public final PddlParser.daDefBody_return daDefBody() throws RecognitionException {
		PddlParser.daDefBody_return retval = new PddlParser.daDefBody_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal195=null;
		Token string_literal197=null;
		Token char_literal198=null;
		Token char_literal199=null;
		Token string_literal201=null;
		Token char_literal202=null;
		Token char_literal203=null;
		ParserRuleReturnScope durationConstraint196 =null;
		ParserRuleReturnScope daGD200 =null;
		ParserRuleReturnScope daEffect204 =null;

		Object string_literal195_tree=null;
		Object string_literal197_tree=null;
		Object char_literal198_tree=null;
		Object char_literal199_tree=null;
		Object string_literal201_tree=null;
		Object char_literal202_tree=null;
		Object char_literal203_tree=null;

		try {
			// Pddl.g:320:2: ( ':duration' durationConstraint | ':condition' ( ( '(' ')' ) | daGD ) | ':effect' ( ( '(' ')' ) | daEffect ) )
			int alt42=3;
			switch ( input.LA(1) ) {
			case 80:
				{
				alt42=1;
				}
				break;
			case 74:
				{
				alt42=2;
				}
				break;
			case 82:
				{
				alt42=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// Pddl.g:320:4: ':duration' durationConstraint
					{
					root_0 = (Object)adaptor.nil();


					string_literal195=(Token)match(input,80,FOLLOW_80_in_daDefBody1966); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal195_tree = (Object)adaptor.create(string_literal195);
					adaptor.addChild(root_0, string_literal195_tree);
					}

					pushFollow(FOLLOW_durationConstraint_in_daDefBody1968);
					durationConstraint196=durationConstraint();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, durationConstraint196.getTree());

					}
					break;
				case 2 :
					// Pddl.g:321:4: ':condition' ( ( '(' ')' ) | daGD )
					{
					root_0 = (Object)adaptor.nil();


					string_literal197=(Token)match(input,74,FOLLOW_74_in_daDefBody1973); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal197_tree = (Object)adaptor.create(string_literal197);
					adaptor.addChild(root_0, string_literal197_tree);
					}

					// Pddl.g:321:17: ( ( '(' ')' ) | daGD )
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==67) ) {
						int LA40_1 = input.LA(2);
						if ( (LA40_1==68) ) {
							alt40=1;
						}
						else if ( (LA40_1==106||LA40_1==108||LA40_1==117||(LA40_1 >= 129 && LA40_1 <= 130)) ) {
							alt40=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 40, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 40, 0, input);
						throw nvae;
					}

					switch (alt40) {
						case 1 :
							// Pddl.g:321:18: ( '(' ')' )
							{
							// Pddl.g:321:18: ( '(' ')' )
							// Pddl.g:321:19: '(' ')'
							{
							char_literal198=(Token)match(input,67,FOLLOW_67_in_daDefBody1977); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal198_tree = (Object)adaptor.create(char_literal198);
							adaptor.addChild(root_0, char_literal198_tree);
							}

							char_literal199=(Token)match(input,68,FOLLOW_68_in_daDefBody1979); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal199_tree = (Object)adaptor.create(char_literal199);
							adaptor.addChild(root_0, char_literal199_tree);
							}

							}

							}
							break;
						case 2 :
							// Pddl.g:321:30: daGD
							{
							pushFollow(FOLLOW_daGD_in_daDefBody1984);
							daGD200=daGD();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, daGD200.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// Pddl.g:322:7: ':effect' ( ( '(' ')' ) | daEffect )
					{
					root_0 = (Object)adaptor.nil();


					string_literal201=(Token)match(input,82,FOLLOW_82_in_daDefBody1993); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal201_tree = (Object)adaptor.create(string_literal201);
					adaptor.addChild(root_0, string_literal201_tree);
					}

					// Pddl.g:322:17: ( ( '(' ')' ) | daEffect )
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==67) ) {
						int LA41_1 = input.LA(2);
						if ( (LA41_1==68) ) {
							alt41=1;
						}
						else if ( ((LA41_1 >= 106 && LA41_1 <= 108)||LA41_1==111||LA41_1==117||LA41_1==121||(LA41_1 >= 132 && LA41_1 <= 133)||LA41_1==140) ) {
							alt41=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 41, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 41, 0, input);
						throw nvae;
					}

					switch (alt41) {
						case 1 :
							// Pddl.g:322:18: ( '(' ')' )
							{
							// Pddl.g:322:18: ( '(' ')' )
							// Pddl.g:322:19: '(' ')'
							{
							char_literal202=(Token)match(input,67,FOLLOW_67_in_daDefBody1997); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal202_tree = (Object)adaptor.create(char_literal202);
							adaptor.addChild(root_0, char_literal202_tree);
							}

							char_literal203=(Token)match(input,68,FOLLOW_68_in_daDefBody1999); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal203_tree = (Object)adaptor.create(char_literal203);
							adaptor.addChild(root_0, char_literal203_tree);
							}

							}

							}
							break;
						case 2 :
							// Pddl.g:322:30: daEffect
							{
							pushFollow(FOLLOW_daEffect_in_daDefBody2004);
							daEffect204=daEffect();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, daEffect204.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "daDefBody"


	public static class daGD_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "daGD"
	// Pddl.g:325:1: daGD : ( prefTimedGD | '(' 'and' ( daGD )* ')' | '(' 'forall' '(' typedVariableList ')' daGD ')' );
	public final PddlParser.daGD_return daGD() throws RecognitionException {
		PddlParser.daGD_return retval = new PddlParser.daGD_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal206=null;
		Token string_literal207=null;
		Token char_literal209=null;
		Token char_literal210=null;
		Token string_literal211=null;
		Token char_literal212=null;
		Token char_literal214=null;
		Token char_literal216=null;
		ParserRuleReturnScope prefTimedGD205 =null;
		ParserRuleReturnScope daGD208 =null;
		ParserRuleReturnScope typedVariableList213 =null;
		ParserRuleReturnScope daGD215 =null;

		Object char_literal206_tree=null;
		Object string_literal207_tree=null;
		Object char_literal209_tree=null;
		Object char_literal210_tree=null;
		Object string_literal211_tree=null;
		Object char_literal212_tree=null;
		Object char_literal214_tree=null;
		Object char_literal216_tree=null;

		try {
			// Pddl.g:326:2: ( prefTimedGD | '(' 'and' ( daGD )* ')' | '(' 'forall' '(' typedVariableList ')' daGD ')' )
			int alt44=3;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==67) ) {
				switch ( input.LA(2) ) {
				case 108:
				case 129:
				case 130:
					{
					alt44=1;
					}
					break;
				case 106:
					{
					alt44=2;
					}
					break;
				case 117:
					{
					alt44=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// Pddl.g:326:4: prefTimedGD
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_prefTimedGD_in_daGD2019);
					prefTimedGD205=prefTimedGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, prefTimedGD205.getTree());

					}
					break;
				case 2 :
					// Pddl.g:327:4: '(' 'and' ( daGD )* ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal206=(Token)match(input,67,FOLLOW_67_in_daGD2024); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal206_tree = (Object)adaptor.create(char_literal206);
					adaptor.addChild(root_0, char_literal206_tree);
					}

					string_literal207=(Token)match(input,106,FOLLOW_106_in_daGD2026); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal207_tree = (Object)adaptor.create(string_literal207);
					adaptor.addChild(root_0, string_literal207_tree);
					}

					// Pddl.g:327:14: ( daGD )*
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==67) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// Pddl.g:327:14: daGD
							{
							pushFollow(FOLLOW_daGD_in_daGD2028);
							daGD208=daGD();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, daGD208.getTree());

							}
							break;

						default :
							break loop43;
						}
					}

					char_literal209=(Token)match(input,68,FOLLOW_68_in_daGD2031); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal209_tree = (Object)adaptor.create(char_literal209);
					adaptor.addChild(root_0, char_literal209_tree);
					}

					}
					break;
				case 3 :
					// Pddl.g:328:4: '(' 'forall' '(' typedVariableList ')' daGD ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal210=(Token)match(input,67,FOLLOW_67_in_daGD2036); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal210_tree = (Object)adaptor.create(char_literal210);
					adaptor.addChild(root_0, char_literal210_tree);
					}

					string_literal211=(Token)match(input,117,FOLLOW_117_in_daGD2038); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal211_tree = (Object)adaptor.create(string_literal211);
					adaptor.addChild(root_0, string_literal211_tree);
					}

					char_literal212=(Token)match(input,67,FOLLOW_67_in_daGD2040); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal212_tree = (Object)adaptor.create(char_literal212);
					adaptor.addChild(root_0, char_literal212_tree);
					}

					pushFollow(FOLLOW_typedVariableList_in_daGD2042);
					typedVariableList213=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList213.getTree());

					char_literal214=(Token)match(input,68,FOLLOW_68_in_daGD2044); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal214_tree = (Object)adaptor.create(char_literal214);
					adaptor.addChild(root_0, char_literal214_tree);
					}

					pushFollow(FOLLOW_daGD_in_daGD2046);
					daGD215=daGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, daGD215.getTree());

					char_literal216=(Token)match(input,68,FOLLOW_68_in_daGD2048); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal216_tree = (Object)adaptor.create(char_literal216);
					adaptor.addChild(root_0, char_literal216_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "daGD"


	public static class prefTimedGD_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prefTimedGD"
	// Pddl.g:331:1: prefTimedGD : ( timedGD | '(' 'preference' ( NAME )? timedGD ')' );
	public final PddlParser.prefTimedGD_return prefTimedGD() throws RecognitionException {
		PddlParser.prefTimedGD_return retval = new PddlParser.prefTimedGD_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal218=null;
		Token string_literal219=null;
		Token NAME220=null;
		Token char_literal222=null;
		ParserRuleReturnScope timedGD217 =null;
		ParserRuleReturnScope timedGD221 =null;

		Object char_literal218_tree=null;
		Object string_literal219_tree=null;
		Object NAME220_tree=null;
		Object char_literal222_tree=null;

		try {
			// Pddl.g:332:2: ( timedGD | '(' 'preference' ( NAME )? timedGD ')' )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==67) ) {
				int LA46_1 = input.LA(2);
				if ( (LA46_1==108||LA46_1==129) ) {
					alt46=1;
				}
				else if ( (LA46_1==130) ) {
					alt46=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// Pddl.g:332:4: timedGD
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_timedGD_in_prefTimedGD2059);
					timedGD217=timedGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timedGD217.getTree());

					}
					break;
				case 2 :
					// Pddl.g:333:4: '(' 'preference' ( NAME )? timedGD ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal218=(Token)match(input,67,FOLLOW_67_in_prefTimedGD2064); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal218_tree = (Object)adaptor.create(char_literal218);
					adaptor.addChild(root_0, char_literal218_tree);
					}

					string_literal219=(Token)match(input,130,FOLLOW_130_in_prefTimedGD2066); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal219_tree = (Object)adaptor.create(string_literal219);
					adaptor.addChild(root_0, string_literal219_tree);
					}

					// Pddl.g:333:21: ( NAME )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==NAME) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// Pddl.g:333:21: NAME
							{
							NAME220=(Token)match(input,NAME,FOLLOW_NAME_in_prefTimedGD2068); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NAME220_tree = (Object)adaptor.create(NAME220);
							adaptor.addChild(root_0, NAME220_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_timedGD_in_prefTimedGD2071);
					timedGD221=timedGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timedGD221.getTree());

					char_literal222=(Token)match(input,68,FOLLOW_68_in_prefTimedGD2073); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal222_tree = (Object)adaptor.create(char_literal222);
					adaptor.addChild(root_0, char_literal222_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prefTimedGD"


	public static class timedGD_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "timedGD"
	// Pddl.g:336:1: timedGD : ( '(' 'at' timeSpecifier goalDesc ')' | '(' 'over' interval goalDesc ')' );
	public final PddlParser.timedGD_return timedGD() throws RecognitionException {
		PddlParser.timedGD_return retval = new PddlParser.timedGD_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal223=null;
		Token string_literal224=null;
		Token char_literal227=null;
		Token char_literal228=null;
		Token string_literal229=null;
		Token char_literal232=null;
		ParserRuleReturnScope timeSpecifier225 =null;
		ParserRuleReturnScope goalDesc226 =null;
		ParserRuleReturnScope interval230 =null;
		ParserRuleReturnScope goalDesc231 =null;

		Object char_literal223_tree=null;
		Object string_literal224_tree=null;
		Object char_literal227_tree=null;
		Object char_literal228_tree=null;
		Object string_literal229_tree=null;
		Object char_literal232_tree=null;

		try {
			// Pddl.g:337:2: ( '(' 'at' timeSpecifier goalDesc ')' | '(' 'over' interval goalDesc ')' )
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==67) ) {
				int LA47_1 = input.LA(2);
				if ( (LA47_1==108) ) {
					alt47=1;
				}
				else if ( (LA47_1==129) ) {
					alt47=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}

			switch (alt47) {
				case 1 :
					// Pddl.g:337:4: '(' 'at' timeSpecifier goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal223=(Token)match(input,67,FOLLOW_67_in_timedGD2084); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal223_tree = (Object)adaptor.create(char_literal223);
					adaptor.addChild(root_0, char_literal223_tree);
					}

					string_literal224=(Token)match(input,108,FOLLOW_108_in_timedGD2086); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal224_tree = (Object)adaptor.create(string_literal224);
					adaptor.addChild(root_0, string_literal224_tree);
					}

					pushFollow(FOLLOW_timeSpecifier_in_timedGD2088);
					timeSpecifier225=timeSpecifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timeSpecifier225.getTree());

					pushFollow(FOLLOW_goalDesc_in_timedGD2090);
					goalDesc226=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc226.getTree());

					char_literal227=(Token)match(input,68,FOLLOW_68_in_timedGD2092); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal227_tree = (Object)adaptor.create(char_literal227);
					adaptor.addChild(root_0, char_literal227_tree);
					}

					}
					break;
				case 2 :
					// Pddl.g:338:4: '(' 'over' interval goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal228=(Token)match(input,67,FOLLOW_67_in_timedGD2097); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal228_tree = (Object)adaptor.create(char_literal228);
					adaptor.addChild(root_0, char_literal228_tree);
					}

					string_literal229=(Token)match(input,129,FOLLOW_129_in_timedGD2099); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal229_tree = (Object)adaptor.create(string_literal229);
					adaptor.addChild(root_0, string_literal229_tree);
					}

					pushFollow(FOLLOW_interval_in_timedGD2101);
					interval230=interval();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interval230.getTree());

					pushFollow(FOLLOW_goalDesc_in_timedGD2103);
					goalDesc231=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc231.getTree());

					char_literal232=(Token)match(input,68,FOLLOW_68_in_timedGD2105); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal232_tree = (Object)adaptor.create(char_literal232);
					adaptor.addChild(root_0, char_literal232_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timedGD"


	public static class timeSpecifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "timeSpecifier"
	// Pddl.g:341:1: timeSpecifier : ( 'start' | 'end' );
	public final PddlParser.timeSpecifier_return timeSpecifier() throws RecognitionException {
		PddlParser.timeSpecifier_return retval = new PddlParser.timeSpecifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set233=null;

		Object set233_tree=null;

		try {
			// Pddl.g:341:15: ( 'start' | 'end' )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set233=input.LT(1);
			if ( input.LA(1)==115||input.LA(1)==138 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set233));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timeSpecifier"


	public static class interval_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interval"
	// Pddl.g:342:1: interval : 'all' ;
	public final PddlParser.interval_return interval() throws RecognitionException {
		PddlParser.interval_return retval = new PddlParser.interval_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal234=null;

		Object string_literal234_tree=null;

		try {
			// Pddl.g:342:10: ( 'all' )
			// Pddl.g:342:12: 'all'
			{
			root_0 = (Object)adaptor.nil();


			string_literal234=(Token)match(input,103,FOLLOW_103_in_interval2127); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal234_tree = (Object)adaptor.create(string_literal234);
			adaptor.addChild(root_0, string_literal234_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "interval"


	public static class derivedDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "derivedDef"
	// Pddl.g:346:1: derivedDef : '(' ! ':derived' ^ typedVariableList goalDesc ')' !;
	public final PddlParser.derivedDef_return derivedDef() throws RecognitionException {
		PddlParser.derivedDef_return retval = new PddlParser.derivedDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal235=null;
		Token string_literal236=null;
		Token char_literal239=null;
		ParserRuleReturnScope typedVariableList237 =null;
		ParserRuleReturnScope goalDesc238 =null;

		Object char_literal235_tree=null;
		Object string_literal236_tree=null;
		Object char_literal239_tree=null;

		try {
			// Pddl.g:347:2: ( '(' ! ':derived' ^ typedVariableList goalDesc ')' !)
			// Pddl.g:347:4: '(' ! ':derived' ^ typedVariableList goalDesc ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal235=(Token)match(input,67,FOLLOW_67_in_derivedDef2140); if (state.failed) return retval;
			string_literal236=(Token)match(input,78,FOLLOW_78_in_derivedDef2143); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal236_tree = (Object)adaptor.create(string_literal236);
			root_0 = (Object)adaptor.becomeRoot(string_literal236_tree, root_0);
			}

			pushFollow(FOLLOW_typedVariableList_in_derivedDef2146);
			typedVariableList237=typedVariableList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList237.getTree());

			pushFollow(FOLLOW_goalDesc_in_derivedDef2148);
			goalDesc238=goalDesc();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc238.getTree());

			char_literal239=(Token)match(input,68,FOLLOW_68_in_derivedDef2150); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "derivedDef"


	public static class fExp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fExp"
	// Pddl.g:352:1: fExp : ( NUMBER | '(' binaryOp fExp fExp2 ')' -> ^( BINARY_OP binaryOp fExp fExp2 ) | '(' '-' fExp ')' -> ^( UNARY_MINUS fExp ) | '(' 'sin' fExp ')' -> ^( SIN fExp ) | '(' 'cos' fExp ')' -> ^( COS fExp ) | fHead );
	public final PddlParser.fExp_return fExp() throws RecognitionException {
		PddlParser.fExp_return retval = new PddlParser.fExp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER240=null;
		Token char_literal241=null;
		Token char_literal245=null;
		Token char_literal246=null;
		Token char_literal247=null;
		Token char_literal249=null;
		Token char_literal250=null;
		Token string_literal251=null;
		Token char_literal253=null;
		Token char_literal254=null;
		Token string_literal255=null;
		Token char_literal257=null;
		ParserRuleReturnScope binaryOp242 =null;
		ParserRuleReturnScope fExp243 =null;
		ParserRuleReturnScope fExp2244 =null;
		ParserRuleReturnScope fExp248 =null;
		ParserRuleReturnScope fExp252 =null;
		ParserRuleReturnScope fExp256 =null;
		ParserRuleReturnScope fHead258 =null;

		Object NUMBER240_tree=null;
		Object char_literal241_tree=null;
		Object char_literal245_tree=null;
		Object char_literal246_tree=null;
		Object char_literal247_tree=null;
		Object char_literal249_tree=null;
		Object char_literal250_tree=null;
		Object string_literal251_tree=null;
		Object char_literal253_tree=null;
		Object char_literal254_tree=null;
		Object string_literal255_tree=null;
		Object char_literal257_tree=null;
		RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleSubtreeStream stream_binaryOp=new RewriteRuleSubtreeStream(adaptor,"rule binaryOp");
		RewriteRuleSubtreeStream stream_fExp2=new RewriteRuleSubtreeStream(adaptor,"rule fExp2");
		RewriteRuleSubtreeStream stream_fExp=new RewriteRuleSubtreeStream(adaptor,"rule fExp");

		try {
			// Pddl.g:353:2: ( NUMBER | '(' binaryOp fExp fExp2 ')' -> ^( BINARY_OP binaryOp fExp fExp2 ) | '(' '-' fExp ')' -> ^( UNARY_MINUS fExp ) | '(' 'sin' fExp ')' -> ^( SIN fExp ) | '(' 'cos' fExp ')' -> ^( COS fExp ) | fHead )
			int alt48=6;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt48=1;
				}
				break;
			case 67:
				{
				int LA48_2 = input.LA(2);
				if ( (synpred66_Pddl()) ) {
					alt48=2;
				}
				else if ( (synpred67_Pddl()) ) {
					alt48=3;
				}
				else if ( (synpred68_Pddl()) ) {
					alt48=4;
				}
				else if ( (synpred69_Pddl()) ) {
					alt48=5;
				}
				else if ( (true) ) {
					alt48=6;
				}

				}
				break;
			case NAME:
			case 66:
				{
				alt48=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// Pddl.g:353:4: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER240=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_fExp2165); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER240_tree = (Object)adaptor.create(NUMBER240);
					adaptor.addChild(root_0, NUMBER240_tree);
					}

					}
					break;
				case 2 :
					// Pddl.g:354:4: '(' binaryOp fExp fExp2 ')'
					{
					char_literal241=(Token)match(input,67,FOLLOW_67_in_fExp2170); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal241);

					pushFollow(FOLLOW_binaryOp_in_fExp2172);
					binaryOp242=binaryOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_binaryOp.add(binaryOp242.getTree());
					pushFollow(FOLLOW_fExp_in_fExp2174);
					fExp243=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExp.add(fExp243.getTree());
					pushFollow(FOLLOW_fExp2_in_fExp2176);
					fExp2244=fExp2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExp2.add(fExp2244.getTree());
					char_literal245=(Token)match(input,68,FOLLOW_68_in_fExp2178); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal245);

					// AST REWRITE
					// elements: fExp, binaryOp, fExp2
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 354:32: -> ^( BINARY_OP binaryOp fExp fExp2 )
					{
						// Pddl.g:354:35: ^( BINARY_OP binaryOp fExp fExp2 )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BINARY_OP, "BINARY_OP"), root_1);
						adaptor.addChild(root_1, stream_binaryOp.nextTree());
						adaptor.addChild(root_1, stream_fExp.nextTree());
						adaptor.addChild(root_1, stream_fExp2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Pddl.g:355:4: '(' '-' fExp ')'
					{
					char_literal246=(Token)match(input,67,FOLLOW_67_in_fExp2195); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal246);

					char_literal247=(Token)match(input,71,FOLLOW_71_in_fExp2197); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal247);

					pushFollow(FOLLOW_fExp_in_fExp2199);
					fExp248=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExp.add(fExp248.getTree());
					char_literal249=(Token)match(input,68,FOLLOW_68_in_fExp2201); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal249);

					// AST REWRITE
					// elements: fExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 355:21: -> ^( UNARY_MINUS fExp )
					{
						// Pddl.g:355:24: ^( UNARY_MINUS fExp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
						adaptor.addChild(root_1, stream_fExp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Pddl.g:356:7: '(' 'sin' fExp ')'
					{
					char_literal250=(Token)match(input,67,FOLLOW_67_in_fExp2217); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal250);

					string_literal251=(Token)match(input,134,FOLLOW_134_in_fExp2219); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_134.add(string_literal251);

					pushFollow(FOLLOW_fExp_in_fExp2221);
					fExp252=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExp.add(fExp252.getTree());
					char_literal253=(Token)match(input,68,FOLLOW_68_in_fExp2223); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal253);

					// AST REWRITE
					// elements: fExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 356:26: -> ^( SIN fExp )
					{
						// Pddl.g:356:29: ^( SIN fExp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SIN, "SIN"), root_1);
						adaptor.addChild(root_1, stream_fExp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// Pddl.g:357:7: '(' 'cos' fExp ')'
					{
					char_literal254=(Token)match(input,67,FOLLOW_67_in_fExp2239); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal254);

					string_literal255=(Token)match(input,110,FOLLOW_110_in_fExp2241); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_110.add(string_literal255);

					pushFollow(FOLLOW_fExp_in_fExp2243);
					fExp256=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExp.add(fExp256.getTree());
					char_literal257=(Token)match(input,68,FOLLOW_68_in_fExp2245); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal257);

					// AST REWRITE
					// elements: fExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 357:26: -> ^( COS fExp )
					{
						// Pddl.g:357:29: ^( COS fExp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COS, "COS"), root_1);
						adaptor.addChild(root_1, stream_fExp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// Pddl.g:358:4: fHead
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fHead_in_fExp2258);
					fHead258=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead258.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fExp"


	public static class fExp2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fExp2"
	// Pddl.g:363:1: fExp2 : fExp ;
	public final PddlParser.fExp2_return fExp2() throws RecognitionException {
		PddlParser.fExp2_return retval = new PddlParser.fExp2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope fExp259 =null;


		try {
			// Pddl.g:363:7: ( fExp )
			// Pddl.g:363:9: fExp
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_fExp_in_fExp22270);
			fExp259=fExp();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp259.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fExp2"


	public static class fHead_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fHead"
	// Pddl.g:365:1: fHead : ( '(' functionSymbol ( term )* ')' -> ^( FUNC_HEAD functionSymbol ( term )* ) | functionSymbol -> ^( FUNC_HEAD functionSymbol ) );
	public final PddlParser.fHead_return fHead() throws RecognitionException {
		PddlParser.fHead_return retval = new PddlParser.fHead_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal260=null;
		Token char_literal263=null;
		ParserRuleReturnScope functionSymbol261 =null;
		ParserRuleReturnScope term262 =null;
		ParserRuleReturnScope functionSymbol264 =null;

		Object char_literal260_tree=null;
		Object char_literal263_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
		RewriteRuleSubtreeStream stream_functionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule functionSymbol");

		try {
			// Pddl.g:366:2: ( '(' functionSymbol ( term )* ')' -> ^( FUNC_HEAD functionSymbol ( term )* ) | functionSymbol -> ^( FUNC_HEAD functionSymbol ) )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==67) ) {
				alt50=1;
			}
			else if ( (LA50_0==NAME||LA50_0==66) ) {
				alt50=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// Pddl.g:366:4: '(' functionSymbol ( term )* ')'
					{
					char_literal260=(Token)match(input,67,FOLLOW_67_in_fHead2280); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal260);

					pushFollow(FOLLOW_functionSymbol_in_fHead2282);
					functionSymbol261=functionSymbol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionSymbol.add(functionSymbol261.getTree());
					// Pddl.g:366:23: ( term )*
					loop49:
					while (true) {
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0==NAME||LA49_0==VARIABLE) ) {
							alt49=1;
						}

						switch (alt49) {
						case 1 :
							// Pddl.g:366:23: term
							{
							pushFollow(FOLLOW_term_in_fHead2284);
							term262=term();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_term.add(term262.getTree());
							}
							break;

						default :
							break loop49;
						}
					}

					char_literal263=(Token)match(input,68,FOLLOW_68_in_fHead2287); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal263);

					// AST REWRITE
					// elements: term, functionSymbol
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 366:33: -> ^( FUNC_HEAD functionSymbol ( term )* )
					{
						// Pddl.g:366:36: ^( FUNC_HEAD functionSymbol ( term )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_HEAD, "FUNC_HEAD"), root_1);
						adaptor.addChild(root_1, stream_functionSymbol.nextTree());
						// Pddl.g:366:63: ( term )*
						while ( stream_term.hasNext() ) {
							adaptor.addChild(root_1, stream_term.nextTree());
						}
						stream_term.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:367:4: functionSymbol
					{
					pushFollow(FOLLOW_functionSymbol_in_fHead2303);
					functionSymbol264=functionSymbol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionSymbol.add(functionSymbol264.getTree());
					// AST REWRITE
					// elements: functionSymbol
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 367:19: -> ^( FUNC_HEAD functionSymbol )
					{
						// Pddl.g:367:22: ^( FUNC_HEAD functionSymbol )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_HEAD, "FUNC_HEAD"), root_1);
						adaptor.addChild(root_1, stream_functionSymbol.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fHead"


	public static class effect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "effect"
	// Pddl.g:370:1: effect : ( '(' 'and' ( cEffect )* ')' -> ^( AND_EFFECT ( cEffect )* ) | cEffect );
	public final PddlParser.effect_return effect() throws RecognitionException {
		PddlParser.effect_return retval = new PddlParser.effect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal265=null;
		Token string_literal266=null;
		Token char_literal268=null;
		ParserRuleReturnScope cEffect267 =null;
		ParserRuleReturnScope cEffect269 =null;

		Object char_literal265_tree=null;
		Object string_literal266_tree=null;
		Object char_literal268_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
		RewriteRuleSubtreeStream stream_cEffect=new RewriteRuleSubtreeStream(adaptor,"rule cEffect");

		try {
			// Pddl.g:371:2: ( '(' 'and' ( cEffect )* ')' -> ^( AND_EFFECT ( cEffect )* ) | cEffect )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==67) ) {
				int LA52_1 = input.LA(2);
				if ( (LA52_1==106) ) {
					alt52=1;
				}
				else if ( (LA52_1==NAME||LA52_1==107||LA52_1==111||LA52_1==117||LA52_1==121||LA52_1==125||(LA52_1 >= 132 && LA52_1 <= 133)||LA52_1==140) ) {
					alt52=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 52, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// Pddl.g:371:4: '(' 'and' ( cEffect )* ')'
					{
					char_literal265=(Token)match(input,67,FOLLOW_67_in_effect2322); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal265);

					string_literal266=(Token)match(input,106,FOLLOW_106_in_effect2324); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_106.add(string_literal266);

					// Pddl.g:371:14: ( cEffect )*
					loop51:
					while (true) {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==67) ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// Pddl.g:371:14: cEffect
							{
							pushFollow(FOLLOW_cEffect_in_effect2326);
							cEffect267=cEffect();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_cEffect.add(cEffect267.getTree());
							}
							break;

						default :
							break loop51;
						}
					}

					char_literal268=(Token)match(input,68,FOLLOW_68_in_effect2329); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal268);

					// AST REWRITE
					// elements: cEffect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 371:27: -> ^( AND_EFFECT ( cEffect )* )
					{
						// Pddl.g:371:30: ^( AND_EFFECT ( cEffect )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_EFFECT, "AND_EFFECT"), root_1);
						// Pddl.g:371:43: ( cEffect )*
						while ( stream_cEffect.hasNext() ) {
							adaptor.addChild(root_1, stream_cEffect.nextTree());
						}
						stream_cEffect.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:372:4: cEffect
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_cEffect_in_effect2343);
					cEffect269=cEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cEffect269.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "effect"


	public static class cEffect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cEffect"
	// Pddl.g:375:1: cEffect : ( '(' 'forall' '(' typedVariableList ')' effect ')' -> ^( FORALL_EFFECT typedVariableList effect ) | '(' 'when' goalDesc condEffect ')' -> ^( WHEN_EFFECT goalDesc condEffect ) | pEffect );
	public final PddlParser.cEffect_return cEffect() throws RecognitionException {
		PddlParser.cEffect_return retval = new PddlParser.cEffect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal270=null;
		Token string_literal271=null;
		Token char_literal272=null;
		Token char_literal274=null;
		Token char_literal276=null;
		Token char_literal277=null;
		Token string_literal278=null;
		Token char_literal281=null;
		ParserRuleReturnScope typedVariableList273 =null;
		ParserRuleReturnScope effect275 =null;
		ParserRuleReturnScope goalDesc279 =null;
		ParserRuleReturnScope condEffect280 =null;
		ParserRuleReturnScope pEffect282 =null;

		Object char_literal270_tree=null;
		Object string_literal271_tree=null;
		Object char_literal272_tree=null;
		Object char_literal274_tree=null;
		Object char_literal276_tree=null;
		Object char_literal277_tree=null;
		Object string_literal278_tree=null;
		Object char_literal281_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
		RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
		RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");
		RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
		RewriteRuleSubtreeStream stream_effect=new RewriteRuleSubtreeStream(adaptor,"rule effect");
		RewriteRuleSubtreeStream stream_condEffect=new RewriteRuleSubtreeStream(adaptor,"rule condEffect");

		try {
			// Pddl.g:376:2: ( '(' 'forall' '(' typedVariableList ')' effect ')' -> ^( FORALL_EFFECT typedVariableList effect ) | '(' 'when' goalDesc condEffect ')' -> ^( WHEN_EFFECT goalDesc condEffect ) | pEffect )
			int alt53=3;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==67) ) {
				switch ( input.LA(2) ) {
				case 117:
					{
					alt53=1;
					}
					break;
				case 140:
					{
					alt53=2;
					}
					break;
				case NAME:
				case 107:
				case 111:
				case 121:
				case 125:
				case 132:
				case 133:
					{
					alt53=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}

			switch (alt53) {
				case 1 :
					// Pddl.g:376:4: '(' 'forall' '(' typedVariableList ')' effect ')'
					{
					char_literal270=(Token)match(input,67,FOLLOW_67_in_cEffect2354); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal270);

					string_literal271=(Token)match(input,117,FOLLOW_117_in_cEffect2356); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_117.add(string_literal271);

					char_literal272=(Token)match(input,67,FOLLOW_67_in_cEffect2358); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal272);

					pushFollow(FOLLOW_typedVariableList_in_cEffect2360);
					typedVariableList273=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList273.getTree());
					char_literal274=(Token)match(input,68,FOLLOW_68_in_cEffect2362); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal274);

					pushFollow(FOLLOW_effect_in_cEffect2364);
					effect275=effect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_effect.add(effect275.getTree());
					char_literal276=(Token)match(input,68,FOLLOW_68_in_cEffect2366); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal276);

					// AST REWRITE
					// elements: typedVariableList, effect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 377:4: -> ^( FORALL_EFFECT typedVariableList effect )
					{
						// Pddl.g:377:7: ^( FORALL_EFFECT typedVariableList effect )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORALL_EFFECT, "FORALL_EFFECT"), root_1);
						adaptor.addChild(root_1, stream_typedVariableList.nextTree());
						adaptor.addChild(root_1, stream_effect.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:378:4: '(' 'when' goalDesc condEffect ')'
					{
					char_literal277=(Token)match(input,67,FOLLOW_67_in_cEffect2384); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal277);

					string_literal278=(Token)match(input,140,FOLLOW_140_in_cEffect2386); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_140.add(string_literal278);

					pushFollow(FOLLOW_goalDesc_in_cEffect2388);
					goalDesc279=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc279.getTree());
					pushFollow(FOLLOW_condEffect_in_cEffect2390);
					condEffect280=condEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_condEffect.add(condEffect280.getTree());
					char_literal281=(Token)match(input,68,FOLLOW_68_in_cEffect2392); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal281);

					// AST REWRITE
					// elements: condEffect, goalDesc
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 379:4: -> ^( WHEN_EFFECT goalDesc condEffect )
					{
						// Pddl.g:379:7: ^( WHEN_EFFECT goalDesc condEffect )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHEN_EFFECT, "WHEN_EFFECT"), root_1);
						adaptor.addChild(root_1, stream_goalDesc.nextTree());
						adaptor.addChild(root_1, stream_condEffect.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Pddl.g:380:4: pEffect
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_pEffect_in_cEffect2410);
					pEffect282=pEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pEffect282.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cEffect"


	public static class pEffect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "pEffect"
	// Pddl.g:383:1: pEffect : ( '(' assignOp fHead fExp ')' -> ^( ASSIGN_EFFECT assignOp fHead fExp ) | '(' 'not' atomicTermFormula ')' -> ^( NOT_EFFECT atomicTermFormula ) | atomicTermFormula );
	public final PddlParser.pEffect_return pEffect() throws RecognitionException {
		PddlParser.pEffect_return retval = new PddlParser.pEffect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal283=null;
		Token char_literal287=null;
		Token char_literal288=null;
		Token string_literal289=null;
		Token char_literal291=null;
		ParserRuleReturnScope assignOp284 =null;
		ParserRuleReturnScope fHead285 =null;
		ParserRuleReturnScope fExp286 =null;
		ParserRuleReturnScope atomicTermFormula290 =null;
		ParserRuleReturnScope atomicTermFormula292 =null;

		Object char_literal283_tree=null;
		Object char_literal287_tree=null;
		Object char_literal288_tree=null;
		Object string_literal289_tree=null;
		Object char_literal291_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
		RewriteRuleSubtreeStream stream_atomicTermFormula=new RewriteRuleSubtreeStream(adaptor,"rule atomicTermFormula");
		RewriteRuleSubtreeStream stream_assignOp=new RewriteRuleSubtreeStream(adaptor,"rule assignOp");
		RewriteRuleSubtreeStream stream_fExp=new RewriteRuleSubtreeStream(adaptor,"rule fExp");
		RewriteRuleSubtreeStream stream_fHead=new RewriteRuleSubtreeStream(adaptor,"rule fHead");

		try {
			// Pddl.g:384:2: ( '(' assignOp fHead fExp ')' -> ^( ASSIGN_EFFECT assignOp fHead fExp ) | '(' 'not' atomicTermFormula ')' -> ^( NOT_EFFECT atomicTermFormula ) | atomicTermFormula )
			int alt54=3;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==67) ) {
				switch ( input.LA(2) ) {
				case 125:
					{
					alt54=2;
					}
					break;
				case 107:
				case 111:
				case 121:
				case 132:
				case 133:
					{
					alt54=1;
					}
					break;
				case NAME:
					{
					alt54=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// Pddl.g:384:4: '(' assignOp fHead fExp ')'
					{
					char_literal283=(Token)match(input,67,FOLLOW_67_in_pEffect2421); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal283);

					pushFollow(FOLLOW_assignOp_in_pEffect2423);
					assignOp284=assignOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignOp.add(assignOp284.getTree());
					pushFollow(FOLLOW_fHead_in_pEffect2425);
					fHead285=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fHead.add(fHead285.getTree());
					pushFollow(FOLLOW_fExp_in_pEffect2427);
					fExp286=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExp.add(fExp286.getTree());
					char_literal287=(Token)match(input,68,FOLLOW_68_in_pEffect2429); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal287);

					// AST REWRITE
					// elements: fHead, assignOp, fExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 385:4: -> ^( ASSIGN_EFFECT assignOp fHead fExp )
					{
						// Pddl.g:385:7: ^( ASSIGN_EFFECT assignOp fHead fExp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN_EFFECT, "ASSIGN_EFFECT"), root_1);
						adaptor.addChild(root_1, stream_assignOp.nextTree());
						adaptor.addChild(root_1, stream_fHead.nextTree());
						adaptor.addChild(root_1, stream_fExp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:386:4: '(' 'not' atomicTermFormula ')'
					{
					char_literal288=(Token)match(input,67,FOLLOW_67_in_pEffect2449); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal288);

					string_literal289=(Token)match(input,125,FOLLOW_125_in_pEffect2451); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_125.add(string_literal289);

					pushFollow(FOLLOW_atomicTermFormula_in_pEffect2453);
					atomicTermFormula290=atomicTermFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atomicTermFormula.add(atomicTermFormula290.getTree());
					char_literal291=(Token)match(input,68,FOLLOW_68_in_pEffect2455); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal291);

					// AST REWRITE
					// elements: atomicTermFormula
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 387:4: -> ^( NOT_EFFECT atomicTermFormula )
					{
						// Pddl.g:387:7: ^( NOT_EFFECT atomicTermFormula )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_EFFECT, "NOT_EFFECT"), root_1);
						adaptor.addChild(root_1, stream_atomicTermFormula.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Pddl.g:388:4: atomicTermFormula
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atomicTermFormula_in_pEffect2471);
					atomicTermFormula292=atomicTermFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTermFormula292.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pEffect"


	public static class condEffect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condEffect"
	// Pddl.g:393:1: condEffect : ( '(' 'and' ( pEffect )* ')' -> ^( AND_EFFECT ( pEffect )* ) | pEffect );
	public final PddlParser.condEffect_return condEffect() throws RecognitionException {
		PddlParser.condEffect_return retval = new PddlParser.condEffect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal293=null;
		Token string_literal294=null;
		Token char_literal296=null;
		ParserRuleReturnScope pEffect295 =null;
		ParserRuleReturnScope pEffect297 =null;

		Object char_literal293_tree=null;
		Object string_literal294_tree=null;
		Object char_literal296_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
		RewriteRuleSubtreeStream stream_pEffect=new RewriteRuleSubtreeStream(adaptor,"rule pEffect");

		try {
			// Pddl.g:394:2: ( '(' 'and' ( pEffect )* ')' -> ^( AND_EFFECT ( pEffect )* ) | pEffect )
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==67) ) {
				int LA56_1 = input.LA(2);
				if ( (LA56_1==106) ) {
					alt56=1;
				}
				else if ( (LA56_1==NAME||LA56_1==107||LA56_1==111||LA56_1==121||LA56_1==125||(LA56_1 >= 132 && LA56_1 <= 133)) ) {
					alt56=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 56, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}

			switch (alt56) {
				case 1 :
					// Pddl.g:394:4: '(' 'and' ( pEffect )* ')'
					{
					char_literal293=(Token)match(input,67,FOLLOW_67_in_condEffect2484); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal293);

					string_literal294=(Token)match(input,106,FOLLOW_106_in_condEffect2486); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_106.add(string_literal294);

					// Pddl.g:394:14: ( pEffect )*
					loop55:
					while (true) {
						int alt55=2;
						int LA55_0 = input.LA(1);
						if ( (LA55_0==67) ) {
							alt55=1;
						}

						switch (alt55) {
						case 1 :
							// Pddl.g:394:14: pEffect
							{
							pushFollow(FOLLOW_pEffect_in_condEffect2488);
							pEffect295=pEffect();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_pEffect.add(pEffect295.getTree());
							}
							break;

						default :
							break loop55;
						}
					}

					char_literal296=(Token)match(input,68,FOLLOW_68_in_condEffect2491); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal296);

					// AST REWRITE
					// elements: pEffect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 394:27: -> ^( AND_EFFECT ( pEffect )* )
					{
						// Pddl.g:394:30: ^( AND_EFFECT ( pEffect )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_EFFECT, "AND_EFFECT"), root_1);
						// Pddl.g:394:43: ( pEffect )*
						while ( stream_pEffect.hasNext() ) {
							adaptor.addChild(root_1, stream_pEffect.nextTree());
						}
						stream_pEffect.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:395:4: pEffect
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_pEffect_in_condEffect2505);
					pEffect297=pEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pEffect297.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condEffect"


	public static class binaryOp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "binaryOp"
	// Pddl.g:400:1: binaryOp : ( '*' | '+' | '-' | '/' | '^' );
	public final PddlParser.binaryOp_return binaryOp() throws RecognitionException {
		PddlParser.binaryOp_return retval = new PddlParser.binaryOp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set298=null;

		Object set298_tree=null;

		try {
			// Pddl.g:400:10: ( '*' | '+' | '-' | '/' | '^' )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set298=input.LT(1);
			if ( (input.LA(1) >= 69 && input.LA(1) <= 72)||input.LA(1)==102 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set298));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binaryOp"


	public static class multiOp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multiOp"
	// Pddl.g:402:1: multiOp : ( '*' | '+' );
	public final PddlParser.multiOp_return multiOp() throws RecognitionException {
		PddlParser.multiOp_return retval = new PddlParser.multiOp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set299=null;

		Object set299_tree=null;

		try {
			// Pddl.g:402:9: ( '*' | '+' )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set299=input.LT(1);
			if ( (input.LA(1) >= 69 && input.LA(1) <= 70) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set299));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiOp"


	public static class binaryComp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "binaryComp"
	// Pddl.g:404:1: binaryComp : ( '>' | '<' | '=' | '>=' | '<=' );
	public final PddlParser.binaryComp_return binaryComp() throws RecognitionException {
		PddlParser.binaryComp_return retval = new PddlParser.binaryComp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set300=null;

		Object set300_tree=null;

		try {
			// Pddl.g:404:12: ( '>' | '<' | '=' | '>=' | '<=' )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set300=input.LT(1);
			if ( (input.LA(1) >= 96 && input.LA(1) <= 100) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set300));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binaryComp"


	public static class assignOp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignOp"
	// Pddl.g:406:1: assignOp : ( 'assign' | 'scale-up' | 'scale-down' | 'increase' | 'decrease' );
	public final PddlParser.assignOp_return assignOp() throws RecognitionException {
		PddlParser.assignOp_return retval = new PddlParser.assignOp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set301=null;

		Object set301_tree=null;

		try {
			// Pddl.g:406:10: ( 'assign' | 'scale-up' | 'scale-down' | 'increase' | 'decrease' )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set301=input.LT(1);
			if ( input.LA(1)==107||input.LA(1)==111||input.LA(1)==121||(input.LA(1) >= 132 && input.LA(1) <= 133) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set301));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignOp"


	public static class durationConstraint_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "durationConstraint"
	// Pddl.g:411:1: durationConstraint : ( '(' 'and' ( simpleDurationConstraint )+ ')' | '(' ')' | simpleDurationConstraint );
	public final PddlParser.durationConstraint_return durationConstraint() throws RecognitionException {
		PddlParser.durationConstraint_return retval = new PddlParser.durationConstraint_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal302=null;
		Token string_literal303=null;
		Token char_literal305=null;
		Token char_literal306=null;
		Token char_literal307=null;
		ParserRuleReturnScope simpleDurationConstraint304 =null;
		ParserRuleReturnScope simpleDurationConstraint308 =null;

		Object char_literal302_tree=null;
		Object string_literal303_tree=null;
		Object char_literal305_tree=null;
		Object char_literal306_tree=null;
		Object char_literal307_tree=null;

		try {
			// Pddl.g:412:2: ( '(' 'and' ( simpleDurationConstraint )+ ')' | '(' ')' | simpleDurationConstraint )
			int alt58=3;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==67) ) {
				switch ( input.LA(2) ) {
				case 106:
					{
					alt58=1;
					}
					break;
				case 68:
					{
					alt58=2;
					}
					break;
				case 97:
				case 98:
				case 100:
				case 108:
					{
					alt58=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 58, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}

			switch (alt58) {
				case 1 :
					// Pddl.g:412:4: '(' 'and' ( simpleDurationConstraint )+ ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal302=(Token)match(input,67,FOLLOW_67_in_durationConstraint2610); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal302_tree = (Object)adaptor.create(char_literal302);
					adaptor.addChild(root_0, char_literal302_tree);
					}

					string_literal303=(Token)match(input,106,FOLLOW_106_in_durationConstraint2612); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal303_tree = (Object)adaptor.create(string_literal303);
					adaptor.addChild(root_0, string_literal303_tree);
					}

					// Pddl.g:412:14: ( simpleDurationConstraint )+
					int cnt57=0;
					loop57:
					while (true) {
						int alt57=2;
						int LA57_0 = input.LA(1);
						if ( (LA57_0==67) ) {
							alt57=1;
						}

						switch (alt57) {
						case 1 :
							// Pddl.g:412:14: simpleDurationConstraint
							{
							pushFollow(FOLLOW_simpleDurationConstraint_in_durationConstraint2614);
							simpleDurationConstraint304=simpleDurationConstraint();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDurationConstraint304.getTree());

							}
							break;

						default :
							if ( cnt57 >= 1 ) break loop57;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(57, input);
							throw eee;
						}
						cnt57++;
					}

					char_literal305=(Token)match(input,68,FOLLOW_68_in_durationConstraint2617); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal305_tree = (Object)adaptor.create(char_literal305);
					adaptor.addChild(root_0, char_literal305_tree);
					}

					}
					break;
				case 2 :
					// Pddl.g:413:4: '(' ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal306=(Token)match(input,67,FOLLOW_67_in_durationConstraint2622); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal306_tree = (Object)adaptor.create(char_literal306);
					adaptor.addChild(root_0, char_literal306_tree);
					}

					char_literal307=(Token)match(input,68,FOLLOW_68_in_durationConstraint2624); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal307_tree = (Object)adaptor.create(char_literal307);
					adaptor.addChild(root_0, char_literal307_tree);
					}

					}
					break;
				case 3 :
					// Pddl.g:414:4: simpleDurationConstraint
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simpleDurationConstraint_in_durationConstraint2629);
					simpleDurationConstraint308=simpleDurationConstraint();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDurationConstraint308.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "durationConstraint"


	public static class simpleDurationConstraint_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simpleDurationConstraint"
	// Pddl.g:417:1: simpleDurationConstraint : ( '(' durOp '?duration' durValue ')' | '(' 'at' timeSpecifier simpleDurationConstraint ')' );
	public final PddlParser.simpleDurationConstraint_return simpleDurationConstraint() throws RecognitionException {
		PddlParser.simpleDurationConstraint_return retval = new PddlParser.simpleDurationConstraint_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal309=null;
		Token string_literal311=null;
		Token char_literal313=null;
		Token char_literal314=null;
		Token string_literal315=null;
		Token char_literal318=null;
		ParserRuleReturnScope durOp310 =null;
		ParserRuleReturnScope durValue312 =null;
		ParserRuleReturnScope timeSpecifier316 =null;
		ParserRuleReturnScope simpleDurationConstraint317 =null;

		Object char_literal309_tree=null;
		Object string_literal311_tree=null;
		Object char_literal313_tree=null;
		Object char_literal314_tree=null;
		Object string_literal315_tree=null;
		Object char_literal318_tree=null;

		try {
			// Pddl.g:418:2: ( '(' durOp '?duration' durValue ')' | '(' 'at' timeSpecifier simpleDurationConstraint ')' )
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==67) ) {
				int LA59_1 = input.LA(2);
				if ( (LA59_1==108) ) {
					alt59=2;
				}
				else if ( ((LA59_1 >= 97 && LA59_1 <= 98)||LA59_1==100) ) {
					alt59=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 59, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}

			switch (alt59) {
				case 1 :
					// Pddl.g:418:4: '(' durOp '?duration' durValue ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal309=(Token)match(input,67,FOLLOW_67_in_simpleDurationConstraint2640); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal309_tree = (Object)adaptor.create(char_literal309);
					adaptor.addChild(root_0, char_literal309_tree);
					}

					pushFollow(FOLLOW_durOp_in_simpleDurationConstraint2642);
					durOp310=durOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, durOp310.getTree());

					string_literal311=(Token)match(input,101,FOLLOW_101_in_simpleDurationConstraint2644); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal311_tree = (Object)adaptor.create(string_literal311);
					adaptor.addChild(root_0, string_literal311_tree);
					}

					pushFollow(FOLLOW_durValue_in_simpleDurationConstraint2646);
					durValue312=durValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, durValue312.getTree());

					char_literal313=(Token)match(input,68,FOLLOW_68_in_simpleDurationConstraint2648); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal313_tree = (Object)adaptor.create(char_literal313);
					adaptor.addChild(root_0, char_literal313_tree);
					}

					}
					break;
				case 2 :
					// Pddl.g:419:4: '(' 'at' timeSpecifier simpleDurationConstraint ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal314=(Token)match(input,67,FOLLOW_67_in_simpleDurationConstraint2653); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal314_tree = (Object)adaptor.create(char_literal314);
					adaptor.addChild(root_0, char_literal314_tree);
					}

					string_literal315=(Token)match(input,108,FOLLOW_108_in_simpleDurationConstraint2655); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal315_tree = (Object)adaptor.create(string_literal315);
					adaptor.addChild(root_0, string_literal315_tree);
					}

					pushFollow(FOLLOW_timeSpecifier_in_simpleDurationConstraint2657);
					timeSpecifier316=timeSpecifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timeSpecifier316.getTree());

					pushFollow(FOLLOW_simpleDurationConstraint_in_simpleDurationConstraint2659);
					simpleDurationConstraint317=simpleDurationConstraint();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDurationConstraint317.getTree());

					char_literal318=(Token)match(input,68,FOLLOW_68_in_simpleDurationConstraint2661); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal318_tree = (Object)adaptor.create(char_literal318);
					adaptor.addChild(root_0, char_literal318_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleDurationConstraint"


	public static class durOp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "durOp"
	// Pddl.g:422:1: durOp : ( '<=' | '>=' | '=' );
	public final PddlParser.durOp_return durOp() throws RecognitionException {
		PddlParser.durOp_return retval = new PddlParser.durOp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set319=null;

		Object set319_tree=null;

		try {
			// Pddl.g:422:7: ( '<=' | '>=' | '=' )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set319=input.LT(1);
			if ( (input.LA(1) >= 97 && input.LA(1) <= 98)||input.LA(1)==100 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set319));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "durOp"


	public static class durValue_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "durValue"
	// Pddl.g:424:1: durValue : ( NUMBER | fExp );
	public final PddlParser.durValue_return durValue() throws RecognitionException {
		PddlParser.durValue_return retval = new PddlParser.durValue_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER320=null;
		ParserRuleReturnScope fExp321 =null;

		Object NUMBER320_tree=null;

		try {
			// Pddl.g:424:10: ( NUMBER | fExp )
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==NUMBER) ) {
				int LA60_1 = input.LA(2);
				if ( (synpred99_Pddl()) ) {
					alt60=1;
				}
				else if ( (true) ) {
					alt60=2;
				}

			}
			else if ( (LA60_0==NAME||(LA60_0 >= 66 && LA60_0 <= 67)) ) {
				alt60=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}

			switch (alt60) {
				case 1 :
					// Pddl.g:424:12: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER320=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_durValue2688); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER320_tree = (Object)adaptor.create(NUMBER320);
					adaptor.addChild(root_0, NUMBER320_tree);
					}

					}
					break;
				case 2 :
					// Pddl.g:424:21: fExp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fExp_in_durValue2692);
					fExp321=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp321.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "durValue"


	public static class daEffect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "daEffect"
	// Pddl.g:426:1: daEffect : ( '(' 'and' ( daEffect )* ')' | timedEffect | '(' 'forall' '(' typedVariableList ')' daEffect ')' | '(' 'when' daGD timedEffect ')' | '(' assignOp fHead fExpDA ')' );
	public final PddlParser.daEffect_return daEffect() throws RecognitionException {
		PddlParser.daEffect_return retval = new PddlParser.daEffect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal322=null;
		Token string_literal323=null;
		Token char_literal325=null;
		Token char_literal327=null;
		Token string_literal328=null;
		Token char_literal329=null;
		Token char_literal331=null;
		Token char_literal333=null;
		Token char_literal334=null;
		Token string_literal335=null;
		Token char_literal338=null;
		Token char_literal339=null;
		Token char_literal343=null;
		ParserRuleReturnScope daEffect324 =null;
		ParserRuleReturnScope timedEffect326 =null;
		ParserRuleReturnScope typedVariableList330 =null;
		ParserRuleReturnScope daEffect332 =null;
		ParserRuleReturnScope daGD336 =null;
		ParserRuleReturnScope timedEffect337 =null;
		ParserRuleReturnScope assignOp340 =null;
		ParserRuleReturnScope fHead341 =null;
		ParserRuleReturnScope fExpDA342 =null;

		Object char_literal322_tree=null;
		Object string_literal323_tree=null;
		Object char_literal325_tree=null;
		Object char_literal327_tree=null;
		Object string_literal328_tree=null;
		Object char_literal329_tree=null;
		Object char_literal331_tree=null;
		Object char_literal333_tree=null;
		Object char_literal334_tree=null;
		Object string_literal335_tree=null;
		Object char_literal338_tree=null;
		Object char_literal339_tree=null;
		Object char_literal343_tree=null;

		try {
			// Pddl.g:427:2: ( '(' 'and' ( daEffect )* ')' | timedEffect | '(' 'forall' '(' typedVariableList ')' daEffect ')' | '(' 'when' daGD timedEffect ')' | '(' assignOp fHead fExpDA ')' )
			int alt62=5;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==67) ) {
				int LA62_1 = input.LA(2);
				if ( (synpred101_Pddl()) ) {
					alt62=1;
				}
				else if ( (synpred102_Pddl()) ) {
					alt62=2;
				}
				else if ( (synpred103_Pddl()) ) {
					alt62=3;
				}
				else if ( (synpred104_Pddl()) ) {
					alt62=4;
				}
				else if ( (true) ) {
					alt62=5;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}

			switch (alt62) {
				case 1 :
					// Pddl.g:427:4: '(' 'and' ( daEffect )* ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal322=(Token)match(input,67,FOLLOW_67_in_daEffect2702); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal322_tree = (Object)adaptor.create(char_literal322);
					adaptor.addChild(root_0, char_literal322_tree);
					}

					string_literal323=(Token)match(input,106,FOLLOW_106_in_daEffect2704); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal323_tree = (Object)adaptor.create(string_literal323);
					adaptor.addChild(root_0, string_literal323_tree);
					}

					// Pddl.g:427:14: ( daEffect )*
					loop61:
					while (true) {
						int alt61=2;
						int LA61_0 = input.LA(1);
						if ( (LA61_0==67) ) {
							alt61=1;
						}

						switch (alt61) {
						case 1 :
							// Pddl.g:427:14: daEffect
							{
							pushFollow(FOLLOW_daEffect_in_daEffect2706);
							daEffect324=daEffect();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, daEffect324.getTree());

							}
							break;

						default :
							break loop61;
						}
					}

					char_literal325=(Token)match(input,68,FOLLOW_68_in_daEffect2709); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal325_tree = (Object)adaptor.create(char_literal325);
					adaptor.addChild(root_0, char_literal325_tree);
					}

					}
					break;
				case 2 :
					// Pddl.g:428:4: timedEffect
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_timedEffect_in_daEffect2714);
					timedEffect326=timedEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timedEffect326.getTree());

					}
					break;
				case 3 :
					// Pddl.g:429:4: '(' 'forall' '(' typedVariableList ')' daEffect ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal327=(Token)match(input,67,FOLLOW_67_in_daEffect2719); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal327_tree = (Object)adaptor.create(char_literal327);
					adaptor.addChild(root_0, char_literal327_tree);
					}

					string_literal328=(Token)match(input,117,FOLLOW_117_in_daEffect2721); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal328_tree = (Object)adaptor.create(string_literal328);
					adaptor.addChild(root_0, string_literal328_tree);
					}

					char_literal329=(Token)match(input,67,FOLLOW_67_in_daEffect2723); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal329_tree = (Object)adaptor.create(char_literal329);
					adaptor.addChild(root_0, char_literal329_tree);
					}

					pushFollow(FOLLOW_typedVariableList_in_daEffect2725);
					typedVariableList330=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList330.getTree());

					char_literal331=(Token)match(input,68,FOLLOW_68_in_daEffect2727); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal331_tree = (Object)adaptor.create(char_literal331);
					adaptor.addChild(root_0, char_literal331_tree);
					}

					pushFollow(FOLLOW_daEffect_in_daEffect2729);
					daEffect332=daEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, daEffect332.getTree());

					char_literal333=(Token)match(input,68,FOLLOW_68_in_daEffect2731); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal333_tree = (Object)adaptor.create(char_literal333);
					adaptor.addChild(root_0, char_literal333_tree);
					}

					}
					break;
				case 4 :
					// Pddl.g:430:4: '(' 'when' daGD timedEffect ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal334=(Token)match(input,67,FOLLOW_67_in_daEffect2736); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal334_tree = (Object)adaptor.create(char_literal334);
					adaptor.addChild(root_0, char_literal334_tree);
					}

					string_literal335=(Token)match(input,140,FOLLOW_140_in_daEffect2738); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal335_tree = (Object)adaptor.create(string_literal335);
					adaptor.addChild(root_0, string_literal335_tree);
					}

					pushFollow(FOLLOW_daGD_in_daEffect2740);
					daGD336=daGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, daGD336.getTree());

					pushFollow(FOLLOW_timedEffect_in_daEffect2742);
					timedEffect337=timedEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timedEffect337.getTree());

					char_literal338=(Token)match(input,68,FOLLOW_68_in_daEffect2744); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal338_tree = (Object)adaptor.create(char_literal338);
					adaptor.addChild(root_0, char_literal338_tree);
					}

					}
					break;
				case 5 :
					// Pddl.g:431:4: '(' assignOp fHead fExpDA ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal339=(Token)match(input,67,FOLLOW_67_in_daEffect2749); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal339_tree = (Object)adaptor.create(char_literal339);
					adaptor.addChild(root_0, char_literal339_tree);
					}

					pushFollow(FOLLOW_assignOp_in_daEffect2751);
					assignOp340=assignOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp340.getTree());

					pushFollow(FOLLOW_fHead_in_daEffect2753);
					fHead341=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead341.getTree());

					pushFollow(FOLLOW_fExpDA_in_daEffect2755);
					fExpDA342=fExpDA();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA342.getTree());

					char_literal343=(Token)match(input,68,FOLLOW_68_in_daEffect2757); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal343_tree = (Object)adaptor.create(char_literal343);
					adaptor.addChild(root_0, char_literal343_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "daEffect"


	public static class timedEffect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "timedEffect"
	// Pddl.g:434:1: timedEffect : ( '(' 'at' timeSpecifier daEffect ')' | '(' 'at' timeSpecifier fAssignDA ')' | '(' assignOp fHead fExp ')' );
	public final PddlParser.timedEffect_return timedEffect() throws RecognitionException {
		PddlParser.timedEffect_return retval = new PddlParser.timedEffect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal344=null;
		Token string_literal345=null;
		Token char_literal348=null;
		Token char_literal349=null;
		Token string_literal350=null;
		Token char_literal353=null;
		Token char_literal354=null;
		Token char_literal358=null;
		ParserRuleReturnScope timeSpecifier346 =null;
		ParserRuleReturnScope daEffect347 =null;
		ParserRuleReturnScope timeSpecifier351 =null;
		ParserRuleReturnScope fAssignDA352 =null;
		ParserRuleReturnScope assignOp355 =null;
		ParserRuleReturnScope fHead356 =null;
		ParserRuleReturnScope fExp357 =null;

		Object char_literal344_tree=null;
		Object string_literal345_tree=null;
		Object char_literal348_tree=null;
		Object char_literal349_tree=null;
		Object string_literal350_tree=null;
		Object char_literal353_tree=null;
		Object char_literal354_tree=null;
		Object char_literal358_tree=null;

		try {
			// Pddl.g:435:2: ( '(' 'at' timeSpecifier daEffect ')' | '(' 'at' timeSpecifier fAssignDA ')' | '(' assignOp fHead fExp ')' )
			int alt63=3;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==67) ) {
				int LA63_1 = input.LA(2);
				if ( (synpred105_Pddl()) ) {
					alt63=1;
				}
				else if ( (synpred106_Pddl()) ) {
					alt63=2;
				}
				else if ( (true) ) {
					alt63=3;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}

			switch (alt63) {
				case 1 :
					// Pddl.g:435:4: '(' 'at' timeSpecifier daEffect ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal344=(Token)match(input,67,FOLLOW_67_in_timedEffect2768); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal344_tree = (Object)adaptor.create(char_literal344);
					adaptor.addChild(root_0, char_literal344_tree);
					}

					string_literal345=(Token)match(input,108,FOLLOW_108_in_timedEffect2770); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal345_tree = (Object)adaptor.create(string_literal345);
					adaptor.addChild(root_0, string_literal345_tree);
					}

					pushFollow(FOLLOW_timeSpecifier_in_timedEffect2772);
					timeSpecifier346=timeSpecifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timeSpecifier346.getTree());

					pushFollow(FOLLOW_daEffect_in_timedEffect2774);
					daEffect347=daEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, daEffect347.getTree());

					char_literal348=(Token)match(input,68,FOLLOW_68_in_timedEffect2776); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal348_tree = (Object)adaptor.create(char_literal348);
					adaptor.addChild(root_0, char_literal348_tree);
					}

					}
					break;
				case 2 :
					// Pddl.g:436:4: '(' 'at' timeSpecifier fAssignDA ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal349=(Token)match(input,67,FOLLOW_67_in_timedEffect2786); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal349_tree = (Object)adaptor.create(char_literal349);
					adaptor.addChild(root_0, char_literal349_tree);
					}

					string_literal350=(Token)match(input,108,FOLLOW_108_in_timedEffect2788); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal350_tree = (Object)adaptor.create(string_literal350);
					adaptor.addChild(root_0, string_literal350_tree);
					}

					pushFollow(FOLLOW_timeSpecifier_in_timedEffect2790);
					timeSpecifier351=timeSpecifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timeSpecifier351.getTree());

					pushFollow(FOLLOW_fAssignDA_in_timedEffect2792);
					fAssignDA352=fAssignDA();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fAssignDA352.getTree());

					char_literal353=(Token)match(input,68,FOLLOW_68_in_timedEffect2794); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal353_tree = (Object)adaptor.create(char_literal353);
					adaptor.addChild(root_0, char_literal353_tree);
					}

					}
					break;
				case 3 :
					// Pddl.g:437:4: '(' assignOp fHead fExp ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal354=(Token)match(input,67,FOLLOW_67_in_timedEffect2799); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal354_tree = (Object)adaptor.create(char_literal354);
					adaptor.addChild(root_0, char_literal354_tree);
					}

					pushFollow(FOLLOW_assignOp_in_timedEffect2801);
					assignOp355=assignOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp355.getTree());

					pushFollow(FOLLOW_fHead_in_timedEffect2803);
					fHead356=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead356.getTree());

					pushFollow(FOLLOW_fExp_in_timedEffect2805);
					fExp357=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp357.getTree());

					char_literal358=(Token)match(input,68,FOLLOW_68_in_timedEffect2807); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal358_tree = (Object)adaptor.create(char_literal358);
					adaptor.addChild(root_0, char_literal358_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timedEffect"


	public static class fAssignDA_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fAssignDA"
	// Pddl.g:440:1: fAssignDA : '(' assignOp fHead fExpDA ')' ;
	public final PddlParser.fAssignDA_return fAssignDA() throws RecognitionException {
		PddlParser.fAssignDA_return retval = new PddlParser.fAssignDA_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal359=null;
		Token char_literal363=null;
		ParserRuleReturnScope assignOp360 =null;
		ParserRuleReturnScope fHead361 =null;
		ParserRuleReturnScope fExpDA362 =null;

		Object char_literal359_tree=null;
		Object char_literal363_tree=null;

		try {
			// Pddl.g:441:2: ( '(' assignOp fHead fExpDA ')' )
			// Pddl.g:441:4: '(' assignOp fHead fExpDA ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal359=(Token)match(input,67,FOLLOW_67_in_fAssignDA2827); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal359_tree = (Object)adaptor.create(char_literal359);
			adaptor.addChild(root_0, char_literal359_tree);
			}

			pushFollow(FOLLOW_assignOp_in_fAssignDA2829);
			assignOp360=assignOp();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp360.getTree());

			pushFollow(FOLLOW_fHead_in_fAssignDA2831);
			fHead361=fHead();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead361.getTree());

			pushFollow(FOLLOW_fExpDA_in_fAssignDA2833);
			fExpDA362=fExpDA();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA362.getTree());

			char_literal363=(Token)match(input,68,FOLLOW_68_in_fAssignDA2835); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal363_tree = (Object)adaptor.create(char_literal363);
			adaptor.addChild(root_0, char_literal363_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fAssignDA"


	public static class fExpDA_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fExpDA"
	// Pddl.g:444:1: fExpDA : ( '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')' | '?duration' | fExp );
	public final PddlParser.fExpDA_return fExpDA() throws RecognitionException {
		PddlParser.fExpDA_return retval = new PddlParser.fExpDA_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal364=null;
		Token char_literal368=null;
		Token char_literal370=null;
		Token string_literal371=null;
		ParserRuleReturnScope binaryOp365 =null;
		ParserRuleReturnScope fExpDA366 =null;
		ParserRuleReturnScope fExpDA367 =null;
		ParserRuleReturnScope fExpDA369 =null;
		ParserRuleReturnScope fExp372 =null;

		Object char_literal364_tree=null;
		Object char_literal368_tree=null;
		Object char_literal370_tree=null;
		Object string_literal371_tree=null;

		try {
			// Pddl.g:445:2: ( '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')' | '?duration' | fExp )
			int alt65=3;
			switch ( input.LA(1) ) {
			case 67:
				{
				int LA65_1 = input.LA(2);
				if ( (synpred108_Pddl()) ) {
					alt65=1;
				}
				else if ( (true) ) {
					alt65=3;
				}

				}
				break;
			case 101:
				{
				alt65=2;
				}
				break;
			case NAME:
			case NUMBER:
			case 66:
				{
				alt65=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}
			switch (alt65) {
				case 1 :
					// Pddl.g:445:4: '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal364=(Token)match(input,67,FOLLOW_67_in_fExpDA2846); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal364_tree = (Object)adaptor.create(char_literal364);
					adaptor.addChild(root_0, char_literal364_tree);
					}

					// Pddl.g:445:8: ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) )
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==71) ) {
						int LA64_1 = input.LA(2);
						if ( (synpred107_Pddl()) ) {
							alt64=1;
						}
						else if ( (true) ) {
							alt64=2;
						}

					}
					else if ( ((LA64_0 >= 69 && LA64_0 <= 70)||LA64_0==72||LA64_0==102) ) {
						alt64=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 64, 0, input);
						throw nvae;
					}

					switch (alt64) {
						case 1 :
							// Pddl.g:445:9: ( binaryOp fExpDA fExpDA )
							{
							// Pddl.g:445:9: ( binaryOp fExpDA fExpDA )
							// Pddl.g:445:10: binaryOp fExpDA fExpDA
							{
							pushFollow(FOLLOW_binaryOp_in_fExpDA2850);
							binaryOp365=binaryOp();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, binaryOp365.getTree());

							pushFollow(FOLLOW_fExpDA_in_fExpDA2852);
							fExpDA366=fExpDA();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA366.getTree());

							pushFollow(FOLLOW_fExpDA_in_fExpDA2854);
							fExpDA367=fExpDA();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA367.getTree());

							}

							}
							break;
						case 2 :
							// Pddl.g:445:36: ( '-' fExpDA )
							{
							// Pddl.g:445:36: ( '-' fExpDA )
							// Pddl.g:445:37: '-' fExpDA
							{
							char_literal368=(Token)match(input,71,FOLLOW_71_in_fExpDA2860); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal368_tree = (Object)adaptor.create(char_literal368);
							adaptor.addChild(root_0, char_literal368_tree);
							}

							pushFollow(FOLLOW_fExpDA_in_fExpDA2862);
							fExpDA369=fExpDA();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA369.getTree());

							}

							}
							break;

					}

					char_literal370=(Token)match(input,68,FOLLOW_68_in_fExpDA2866); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal370_tree = (Object)adaptor.create(char_literal370);
					adaptor.addChild(root_0, char_literal370_tree);
					}

					}
					break;
				case 2 :
					// Pddl.g:446:4: '?duration'
					{
					root_0 = (Object)adaptor.nil();


					string_literal371=(Token)match(input,101,FOLLOW_101_in_fExpDA2871); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal371_tree = (Object)adaptor.create(string_literal371);
					adaptor.addChild(root_0, string_literal371_tree);
					}

					}
					break;
				case 3 :
					// Pddl.g:447:4: fExp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fExp_in_fExpDA2876);
					fExp372=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp372.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fExpDA"


	public static class problem_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "problem"
	// Pddl.g:452:1: problem : '(' 'define' problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ')' -> ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ) ;
	public final PddlParser.problem_return problem() throws RecognitionException {
		PddlParser.problem_return retval = new PddlParser.problem_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal373=null;
		Token string_literal374=null;
		Token char_literal383=null;
		ParserRuleReturnScope problemDecl375 =null;
		ParserRuleReturnScope problemDomain376 =null;
		ParserRuleReturnScope requireDef377 =null;
		ParserRuleReturnScope objectDecl378 =null;
		ParserRuleReturnScope init379 =null;
		ParserRuleReturnScope goal380 =null;
		ParserRuleReturnScope probConstraints381 =null;
		ParserRuleReturnScope metricSpec382 =null;

		Object char_literal373_tree=null;
		Object string_literal374_tree=null;
		Object char_literal383_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleSubtreeStream stream_metricSpec=new RewriteRuleSubtreeStream(adaptor,"rule metricSpec");
		RewriteRuleSubtreeStream stream_init=new RewriteRuleSubtreeStream(adaptor,"rule init");
		RewriteRuleSubtreeStream stream_goal=new RewriteRuleSubtreeStream(adaptor,"rule goal");
		RewriteRuleSubtreeStream stream_requireDef=new RewriteRuleSubtreeStream(adaptor,"rule requireDef");
		RewriteRuleSubtreeStream stream_problemDecl=new RewriteRuleSubtreeStream(adaptor,"rule problemDecl");
		RewriteRuleSubtreeStream stream_objectDecl=new RewriteRuleSubtreeStream(adaptor,"rule objectDecl");
		RewriteRuleSubtreeStream stream_problemDomain=new RewriteRuleSubtreeStream(adaptor,"rule problemDomain");
		RewriteRuleSubtreeStream stream_probConstraints=new RewriteRuleSubtreeStream(adaptor,"rule probConstraints");

		try {
			// Pddl.g:453:2: ( '(' 'define' problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ')' -> ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ) )
			// Pddl.g:453:4: '(' 'define' problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ')'
			{
			char_literal373=(Token)match(input,67,FOLLOW_67_in_problem2890); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal373);

			string_literal374=(Token)match(input,112,FOLLOW_112_in_problem2892); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_112.add(string_literal374);

			pushFollow(FOLLOW_problemDecl_in_problem2894);
			problemDecl375=problemDecl();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_problemDecl.add(problemDecl375.getTree());
			pushFollow(FOLLOW_problemDomain_in_problem2899);
			problemDomain376=problemDomain();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_problemDomain.add(problemDomain376.getTree());
			// Pddl.g:455:7: ( requireDef )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==67) ) {
				int LA66_1 = input.LA(2);
				if ( (LA66_1==94) ) {
					alt66=1;
				}
			}
			switch (alt66) {
				case 1 :
					// Pddl.g:455:7: requireDef
					{
					pushFollow(FOLLOW_requireDef_in_problem2907);
					requireDef377=requireDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_requireDef.add(requireDef377.getTree());
					}
					break;

			}

			// Pddl.g:456:7: ( objectDecl )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==67) ) {
				int LA67_1 = input.LA(2);
				if ( (LA67_1==89) ) {
					alt67=1;
				}
			}
			switch (alt67) {
				case 1 :
					// Pddl.g:456:7: objectDecl
					{
					pushFollow(FOLLOW_objectDecl_in_problem2916);
					objectDecl378=objectDecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_objectDecl.add(objectDecl378.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_init_in_problem2925);
			init379=init();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_init.add(init379.getTree());
			pushFollow(FOLLOW_goal_in_problem2933);
			goal380=goal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_goal.add(goal380.getTree());
			// Pddl.g:459:7: ( probConstraints )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==67) ) {
				int LA68_1 = input.LA(2);
				if ( (LA68_1==77) ) {
					alt68=1;
				}
			}
			switch (alt68) {
				case 1 :
					// Pddl.g:459:7: probConstraints
					{
					pushFollow(FOLLOW_probConstraints_in_problem2941);
					probConstraints381=probConstraints();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_probConstraints.add(probConstraints381.getTree());
					}
					break;

			}

			// Pddl.g:460:7: ( metricSpec )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==67) ) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// Pddl.g:460:7: metricSpec
					{
					pushFollow(FOLLOW_metricSpec_in_problem2950);
					metricSpec382=metricSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_metricSpec.add(metricSpec382.getTree());
					}
					break;

			}

			char_literal383=(Token)match(input,68,FOLLOW_68_in_problem2966); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal383);

			// AST REWRITE
			// elements: metricSpec, objectDecl, problemDecl, requireDef, probConstraints, problemDomain, init, goal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 463:7: -> ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? )
			{
				// Pddl.g:463:10: ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM, "PROBLEM"), root_1);
				adaptor.addChild(root_1, stream_problemDecl.nextTree());
				adaptor.addChild(root_1, stream_problemDomain.nextTree());
				// Pddl.g:463:46: ( requireDef )?
				if ( stream_requireDef.hasNext() ) {
					adaptor.addChild(root_1, stream_requireDef.nextTree());
				}
				stream_requireDef.reset();

				// Pddl.g:463:58: ( objectDecl )?
				if ( stream_objectDecl.hasNext() ) {
					adaptor.addChild(root_1, stream_objectDecl.nextTree());
				}
				stream_objectDecl.reset();

				adaptor.addChild(root_1, stream_init.nextTree());
				adaptor.addChild(root_1, stream_goal.nextTree());
				// Pddl.g:464:19: ( probConstraints )?
				if ( stream_probConstraints.hasNext() ) {
					adaptor.addChild(root_1, stream_probConstraints.nextTree());
				}
				stream_probConstraints.reset();

				// Pddl.g:464:36: ( metricSpec )?
				if ( stream_metricSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_metricSpec.nextTree());
				}
				stream_metricSpec.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "problem"


	public static class problemDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "problemDecl"
	// Pddl.g:467:1: problemDecl : '(' 'problem' NAME ')' -> ^( PROBLEM_NAME NAME ) ;
	public final PddlParser.problemDecl_return problemDecl() throws RecognitionException {
		PddlParser.problemDecl_return retval = new PddlParser.problemDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal384=null;
		Token string_literal385=null;
		Token NAME386=null;
		Token char_literal387=null;

		Object char_literal384_tree=null;
		Object string_literal385_tree=null;
		Object NAME386_tree=null;
		Object char_literal387_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");

		try {
			// Pddl.g:468:5: ( '(' 'problem' NAME ')' -> ^( PROBLEM_NAME NAME ) )
			// Pddl.g:468:7: '(' 'problem' NAME ')'
			{
			char_literal384=(Token)match(input,67,FOLLOW_67_in_problemDecl3023); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal384);

			string_literal385=(Token)match(input,131,FOLLOW_131_in_problemDecl3025); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_131.add(string_literal385);

			NAME386=(Token)match(input,NAME,FOLLOW_NAME_in_problemDecl3027); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAME.add(NAME386);

			char_literal387=(Token)match(input,68,FOLLOW_68_in_problemDecl3029); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal387);

			// AST REWRITE
			// elements: NAME
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 469:5: -> ^( PROBLEM_NAME NAME )
			{
				// Pddl.g:469:8: ^( PROBLEM_NAME NAME )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_NAME, "PROBLEM_NAME"), root_1);
				adaptor.addChild(root_1, stream_NAME.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "problemDecl"


	public static class problemDomain_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "problemDomain"
	// Pddl.g:472:1: problemDomain : '(' ':domain' NAME ')' -> ^( PROBLEM_DOMAIN NAME ) ;
	public final PddlParser.problemDomain_return problemDomain() throws RecognitionException {
		PddlParser.problemDomain_return retval = new PddlParser.problemDomain_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal388=null;
		Token string_literal389=null;
		Token NAME390=null;
		Token char_literal391=null;

		Object char_literal388_tree=null;
		Object string_literal389_tree=null;
		Object NAME390_tree=null;
		Object char_literal391_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");

		try {
			// Pddl.g:473:2: ( '(' ':domain' NAME ')' -> ^( PROBLEM_DOMAIN NAME ) )
			// Pddl.g:473:4: '(' ':domain' NAME ')'
			{
			char_literal388=(Token)match(input,67,FOLLOW_67_in_problemDomain3055); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal388);

			string_literal389=(Token)match(input,79,FOLLOW_79_in_problemDomain3057); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_79.add(string_literal389);

			NAME390=(Token)match(input,NAME,FOLLOW_NAME_in_problemDomain3059); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAME.add(NAME390);

			char_literal391=(Token)match(input,68,FOLLOW_68_in_problemDomain3061); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal391);

			// AST REWRITE
			// elements: NAME
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 474:2: -> ^( PROBLEM_DOMAIN NAME )
			{
				// Pddl.g:474:5: ^( PROBLEM_DOMAIN NAME )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_DOMAIN, "PROBLEM_DOMAIN"), root_1);
				adaptor.addChild(root_1, stream_NAME.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "problemDomain"


	public static class objectDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "objectDecl"
	// Pddl.g:477:1: objectDecl : '(' ':objects' typedNameList ')' -> ^( OBJECTS typedNameList ) ;
	public final PddlParser.objectDecl_return objectDecl() throws RecognitionException {
		PddlParser.objectDecl_return retval = new PddlParser.objectDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal392=null;
		Token string_literal393=null;
		Token char_literal395=null;
		ParserRuleReturnScope typedNameList394 =null;

		Object char_literal392_tree=null;
		Object string_literal393_tree=null;
		Object char_literal395_tree=null;
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleSubtreeStream stream_typedNameList=new RewriteRuleSubtreeStream(adaptor,"rule typedNameList");

		try {
			// Pddl.g:478:2: ( '(' ':objects' typedNameList ')' -> ^( OBJECTS typedNameList ) )
			// Pddl.g:478:4: '(' ':objects' typedNameList ')'
			{
			char_literal392=(Token)match(input,67,FOLLOW_67_in_objectDecl3081); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal392);

			string_literal393=(Token)match(input,89,FOLLOW_89_in_objectDecl3083); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_89.add(string_literal393);

			pushFollow(FOLLOW_typedNameList_in_objectDecl3085);
			typedNameList394=typedNameList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typedNameList.add(typedNameList394.getTree());
			char_literal395=(Token)match(input,68,FOLLOW_68_in_objectDecl3087); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal395);

			// AST REWRITE
			// elements: typedNameList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 479:2: -> ^( OBJECTS typedNameList )
			{
				// Pddl.g:479:5: ^( OBJECTS typedNameList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OBJECTS, "OBJECTS"), root_1);
                                    if (stream_typedNameList.hasNext()){//This is a hack to handle empty lists. Something could be probably done in the parser
                                        adaptor.addChild(root_1, stream_typedNameList.nextTree());
                                        adaptor.addChild(root_0, root_1);
                                    }
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "objectDecl"


	public static class init_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "init"
	// Pddl.g:482:1: init : ( '(' ':init' ( initEl )* ')' -> ^( INIT ( initEl )* ) | '(' ':init' goalDesc ')' -> ^( FORMULAINIT goalDesc ) );
	public final PddlParser.init_return init() throws RecognitionException {
		PddlParser.init_return retval = new PddlParser.init_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal396=null;
		Token string_literal397=null;
		Token char_literal399=null;
		Token char_literal400=null;
		Token string_literal401=null;
		Token char_literal403=null;
		ParserRuleReturnScope initEl398 =null;
		ParserRuleReturnScope goalDesc402 =null;

		Object char_literal396_tree=null;
		Object string_literal397_tree=null;
		Object char_literal399_tree=null;
		Object char_literal400_tree=null;
		Object string_literal401_tree=null;
		Object char_literal403_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");
		RewriteRuleSubtreeStream stream_initEl=new RewriteRuleSubtreeStream(adaptor,"rule initEl");

		try {
			// Pddl.g:483:2: ( '(' ':init' ( initEl )* ')' -> ^( INIT ( initEl )* ) | '(' ':init' goalDesc ')' -> ^( FORMULAINIT goalDesc ) )
			int alt71=2;
			alt71 = dfa71.predict(input);
			switch (alt71) {
				case 1 :
					// Pddl.g:483:4: '(' ':init' ( initEl )* ')'
					{
					char_literal396=(Token)match(input,67,FOLLOW_67_in_init3107); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal396);

					string_literal397=(Token)match(input,87,FOLLOW_87_in_init3109); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_87.add(string_literal397);

					// Pddl.g:483:16: ( initEl )*
					loop70:
					while (true) {
						int alt70=2;
						int LA70_0 = input.LA(1);
						if ( (LA70_0==67) ) {
							alt70=1;
						}

						switch (alt70) {
						case 1 :
							// Pddl.g:483:16: initEl
							{
							pushFollow(FOLLOW_initEl_in_init3111);
							initEl398=initEl();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_initEl.add(initEl398.getTree());
							}
							break;

						default :
							break loop70;
						}
					}

					char_literal399=(Token)match(input,68,FOLLOW_68_in_init3114); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal399);

					// AST REWRITE
					// elements: initEl
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 484:2: -> ^( INIT ( initEl )* )
					{
						// Pddl.g:484:5: ^( INIT ( initEl )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_1);
						// Pddl.g:484:12: ( initEl )*
						while ( stream_initEl.hasNext() ) {
							adaptor.addChild(root_1, stream_initEl.nextTree());
						}
						stream_initEl.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:485:4: '(' ':init' goalDesc ')'
					{
					char_literal400=(Token)match(input,67,FOLLOW_67_in_init3129); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal400);

					string_literal401=(Token)match(input,87,FOLLOW_87_in_init3131); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_87.add(string_literal401);

					pushFollow(FOLLOW_goalDesc_in_init3133);
					goalDesc402=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc402.getTree());
					char_literal403=(Token)match(input,68,FOLLOW_68_in_init3135); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal403);

					// AST REWRITE
					// elements: goalDesc
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 485:29: -> ^( FORMULAINIT goalDesc )
					{
						// Pddl.g:485:32: ^( FORMULAINIT goalDesc )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULAINIT, "FORMULAINIT"), root_1);
						adaptor.addChild(root_1, stream_goalDesc.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "init"


	public static class initEl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "initEl"
	// Pddl.g:488:1: initEl : ( nameLiteral | '(' '=' fHead NUMBER ')' -> ^( INIT_EQ fHead NUMBER ) | '(' 'at' NUMBER nameLiteral ')' -> ^( INIT_AT NUMBER nameLiteral ) | '(' 'unknown' atomicNameFormula ')' -> ^( UNKNOWN atomicNameFormula ) | '(' 'oneof' ( atomicNameFormula )* ')' -> ^( ONEOF ( atomicNameFormula )* ) | '(' 'or' ( nameLiteral )* ')' -> ^( OR_GD ( nameLiteral )* ) );
	public final PddlParser.initEl_return initEl() throws RecognitionException {
		PddlParser.initEl_return retval = new PddlParser.initEl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal405=null;
		Token char_literal406=null;
		Token NUMBER408=null;
		Token char_literal409=null;
		Token char_literal410=null;
		Token string_literal411=null;
		Token NUMBER412=null;
		Token char_literal414=null;
		Token char_literal415=null;
		Token string_literal416=null;
		Token char_literal418=null;
		Token char_literal419=null;
		Token string_literal420=null;
		Token char_literal422=null;
		Token char_literal423=null;
		Token string_literal424=null;
		Token char_literal426=null;
		ParserRuleReturnScope nameLiteral404 =null;
		ParserRuleReturnScope fHead407 =null;
		ParserRuleReturnScope nameLiteral413 =null;
		ParserRuleReturnScope atomicNameFormula417 =null;
		ParserRuleReturnScope atomicNameFormula421 =null;
		ParserRuleReturnScope nameLiteral425 =null;

		Object char_literal405_tree=null;
		Object char_literal406_tree=null;
		Object NUMBER408_tree=null;
		Object char_literal409_tree=null;
		Object char_literal410_tree=null;
		Object string_literal411_tree=null;
		Object NUMBER412_tree=null;
		Object char_literal414_tree=null;
		Object char_literal415_tree=null;
		Object string_literal416_tree=null;
		Object char_literal418_tree=null;
		Object char_literal419_tree=null;
		Object string_literal420_tree=null;
		Object char_literal422_tree=null;
		Object char_literal423_tree=null;
		Object string_literal424_tree=null;
		Object char_literal426_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
		RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
		RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
		RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
		RewriteRuleSubtreeStream stream_fHead=new RewriteRuleSubtreeStream(adaptor,"rule fHead");
		RewriteRuleSubtreeStream stream_atomicNameFormula=new RewriteRuleSubtreeStream(adaptor,"rule atomicNameFormula");
		RewriteRuleSubtreeStream stream_nameLiteral=new RewriteRuleSubtreeStream(adaptor,"rule nameLiteral");

		try {
			// Pddl.g:489:2: ( nameLiteral | '(' '=' fHead NUMBER ')' -> ^( INIT_EQ fHead NUMBER ) | '(' 'at' NUMBER nameLiteral ')' -> ^( INIT_AT NUMBER nameLiteral ) | '(' 'unknown' atomicNameFormula ')' -> ^( UNKNOWN atomicNameFormula ) | '(' 'oneof' ( atomicNameFormula )* ')' -> ^( ONEOF ( atomicNameFormula )* ) | '(' 'or' ( nameLiteral )* ')' -> ^( OR_GD ( nameLiteral )* ) )
			int alt74=6;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==67) ) {
				switch ( input.LA(2) ) {
				case NAME:
				case 125:
					{
					alt74=1;
					}
					break;
				case 98:
					{
					alt74=2;
					}
					break;
				case 108:
					{
					alt74=3;
					}
					break;
				case 139:
					{
					alt74=4;
					}
					break;
				case 127:
					{
					alt74=5;
					}
					break;
				case 128:
					{
					alt74=6;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 74, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// Pddl.g:489:4: nameLiteral
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nameLiteral_in_initEl3154);
					nameLiteral404=nameLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nameLiteral404.getTree());

					}
					break;
				case 2 :
					// Pddl.g:490:4: '(' '=' fHead NUMBER ')'
					{
					char_literal405=(Token)match(input,67,FOLLOW_67_in_initEl3159); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal405);

					char_literal406=(Token)match(input,98,FOLLOW_98_in_initEl3161); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_98.add(char_literal406);

					pushFollow(FOLLOW_fHead_in_initEl3163);
					fHead407=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fHead.add(fHead407.getTree());
					NUMBER408=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_initEl3165); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER408);

					char_literal409=(Token)match(input,68,FOLLOW_68_in_initEl3167); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal409);

					// AST REWRITE
					// elements: fHead, NUMBER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 490:37: -> ^( INIT_EQ fHead NUMBER )
					{
						// Pddl.g:490:40: ^( INIT_EQ fHead NUMBER )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT_EQ, "INIT_EQ"), root_1);
						adaptor.addChild(root_1, stream_fHead.nextTree());
						adaptor.addChild(root_1, stream_NUMBER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Pddl.g:491:4: '(' 'at' NUMBER nameLiteral ')'
					{
					char_literal410=(Token)match(input,67,FOLLOW_67_in_initEl3190); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal410);

					string_literal411=(Token)match(input,108,FOLLOW_108_in_initEl3192); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_108.add(string_literal411);

					NUMBER412=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_initEl3194); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER412);

					pushFollow(FOLLOW_nameLiteral_in_initEl3196);
					nameLiteral413=nameLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_nameLiteral.add(nameLiteral413.getTree());
					char_literal414=(Token)match(input,68,FOLLOW_68_in_initEl3198); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal414);

					// AST REWRITE
					// elements: nameLiteral, NUMBER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 491:37: -> ^( INIT_AT NUMBER nameLiteral )
					{
						// Pddl.g:491:40: ^( INIT_AT NUMBER nameLiteral )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT_AT, "INIT_AT"), root_1);
						adaptor.addChild(root_1, stream_NUMBER.nextNode());
						adaptor.addChild(root_1, stream_nameLiteral.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Pddl.g:492:4: '(' 'unknown' atomicNameFormula ')'
					{
					char_literal415=(Token)match(input,67,FOLLOW_67_in_initEl3214); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal415);

					string_literal416=(Token)match(input,139,FOLLOW_139_in_initEl3216); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_139.add(string_literal416);

					pushFollow(FOLLOW_atomicNameFormula_in_initEl3219);
					atomicNameFormula417=atomicNameFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atomicNameFormula.add(atomicNameFormula417.getTree());
					char_literal418=(Token)match(input,68,FOLLOW_68_in_initEl3221); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal418);

					// AST REWRITE
					// elements: atomicNameFormula
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 492:42: -> ^( UNKNOWN atomicNameFormula )
					{
						// Pddl.g:492:45: ^( UNKNOWN atomicNameFormula )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNKNOWN, "UNKNOWN"), root_1);
						adaptor.addChild(root_1, stream_atomicNameFormula.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// Pddl.g:493:4: '(' 'oneof' ( atomicNameFormula )* ')'
					{
					char_literal419=(Token)match(input,67,FOLLOW_67_in_initEl3235); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal419);

					string_literal420=(Token)match(input,127,FOLLOW_127_in_initEl3237); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_127.add(string_literal420);

					// Pddl.g:493:17: ( atomicNameFormula )*
					loop72:
					while (true) {
						int alt72=2;
						int LA72_0 = input.LA(1);
						if ( (LA72_0==67) ) {
							alt72=1;
						}

						switch (alt72) {
						case 1 :
							// Pddl.g:493:17: atomicNameFormula
							{
							pushFollow(FOLLOW_atomicNameFormula_in_initEl3240);
							atomicNameFormula421=atomicNameFormula();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_atomicNameFormula.add(atomicNameFormula421.getTree());
							}
							break;

						default :
							break loop72;
						}
					}

					char_literal422=(Token)match(input,68,FOLLOW_68_in_initEl3243); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal422);

					// AST REWRITE
					// elements: atomicNameFormula
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 493:41: -> ^( ONEOF ( atomicNameFormula )* )
					{
						// Pddl.g:493:44: ^( ONEOF ( atomicNameFormula )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ONEOF, "ONEOF"), root_1);
						// Pddl.g:493:52: ( atomicNameFormula )*
						while ( stream_atomicNameFormula.hasNext() ) {
							adaptor.addChild(root_1, stream_atomicNameFormula.nextTree());
						}
						stream_atomicNameFormula.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// Pddl.g:494:4: '(' 'or' ( nameLiteral )* ')'
					{
					char_literal423=(Token)match(input,67,FOLLOW_67_in_initEl3258); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal423);

					string_literal424=(Token)match(input,128,FOLLOW_128_in_initEl3260); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_128.add(string_literal424);

					// Pddl.g:494:14: ( nameLiteral )*
					loop73:
					while (true) {
						int alt73=2;
						int LA73_0 = input.LA(1);
						if ( (LA73_0==67) ) {
							alt73=1;
						}

						switch (alt73) {
						case 1 :
							// Pddl.g:494:14: nameLiteral
							{
							pushFollow(FOLLOW_nameLiteral_in_initEl3263);
							nameLiteral425=nameLiteral();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_nameLiteral.add(nameLiteral425.getTree());
							}
							break;

						default :
							break loop73;
						}
					}

					char_literal426=(Token)match(input,68,FOLLOW_68_in_initEl3266); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal426);

					// AST REWRITE
					// elements: nameLiteral
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 494:32: -> ^( OR_GD ( nameLiteral )* )
					{
						// Pddl.g:494:35: ^( OR_GD ( nameLiteral )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR_GD, "OR_GD"), root_1);
						// Pddl.g:494:43: ( nameLiteral )*
						while ( stream_nameLiteral.hasNext() ) {
							adaptor.addChild(root_1, stream_nameLiteral.nextTree());
						}
						stream_nameLiteral.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "initEl"


	public static class nameLiteral_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "nameLiteral"
	// Pddl.g:497:1: nameLiteral : ( atomicNameFormula | '(' 'not' atomicNameFormula ')' -> ^( NOT_PRED_INIT atomicNameFormula ) );
	public final PddlParser.nameLiteral_return nameLiteral() throws RecognitionException {
		PddlParser.nameLiteral_return retval = new PddlParser.nameLiteral_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal428=null;
		Token string_literal429=null;
		Token char_literal431=null;
		ParserRuleReturnScope atomicNameFormula427 =null;
		ParserRuleReturnScope atomicNameFormula430 =null;

		Object char_literal428_tree=null;
		Object string_literal429_tree=null;
		Object char_literal431_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
		RewriteRuleSubtreeStream stream_atomicNameFormula=new RewriteRuleSubtreeStream(adaptor,"rule atomicNameFormula");

		try {
			// Pddl.g:498:2: ( atomicNameFormula | '(' 'not' atomicNameFormula ')' -> ^( NOT_PRED_INIT atomicNameFormula ) )
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==67) ) {
				int LA75_1 = input.LA(2);
				if ( (LA75_1==125) ) {
					alt75=2;
				}
				else if ( (LA75_1==NAME) ) {
					alt75=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// Pddl.g:498:4: atomicNameFormula
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atomicNameFormula_in_nameLiteral3287);
					atomicNameFormula427=atomicNameFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicNameFormula427.getTree());

					}
					break;
				case 2 :
					// Pddl.g:499:4: '(' 'not' atomicNameFormula ')'
					{
					char_literal428=(Token)match(input,67,FOLLOW_67_in_nameLiteral3292); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal428);

					string_literal429=(Token)match(input,125,FOLLOW_125_in_nameLiteral3294); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_125.add(string_literal429);

					pushFollow(FOLLOW_atomicNameFormula_in_nameLiteral3296);
					atomicNameFormula430=atomicNameFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atomicNameFormula.add(atomicNameFormula430.getTree());
					char_literal431=(Token)match(input,68,FOLLOW_68_in_nameLiteral3298); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal431);

					// AST REWRITE
					// elements: atomicNameFormula
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 499:36: -> ^( NOT_PRED_INIT atomicNameFormula )
					{
						// Pddl.g:499:39: ^( NOT_PRED_INIT atomicNameFormula )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_PRED_INIT, "NOT_PRED_INIT"), root_1);
						adaptor.addChild(root_1, stream_atomicNameFormula.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nameLiteral"


	public static class atomicNameFormula_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atomicNameFormula"
	// Pddl.g:502:1: atomicNameFormula : '(' predicate ( NAME )* ')' -> ^( PRED_INST predicate ( NAME )* ) ;
	public final PddlParser.atomicNameFormula_return atomicNameFormula() throws RecognitionException {
		PddlParser.atomicNameFormula_return retval = new PddlParser.atomicNameFormula_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal432=null;
		Token NAME434=null;
		Token char_literal435=null;
		ParserRuleReturnScope predicate433 =null;

		Object char_literal432_tree=null;
		Object NAME434_tree=null;
		Object char_literal435_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");

		try {
			// Pddl.g:503:2: ( '(' predicate ( NAME )* ')' -> ^( PRED_INST predicate ( NAME )* ) )
			// Pddl.g:503:4: '(' predicate ( NAME )* ')'
			{
			char_literal432=(Token)match(input,67,FOLLOW_67_in_atomicNameFormula3317); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal432);

			pushFollow(FOLLOW_predicate_in_atomicNameFormula3319);
			predicate433=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(predicate433.getTree());
			// Pddl.g:503:18: ( NAME )*
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==NAME) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// Pddl.g:503:18: NAME
					{
					NAME434=(Token)match(input,NAME,FOLLOW_NAME_in_atomicNameFormula3321); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAME.add(NAME434);

					}
					break;

				default :
					break loop76;
				}
			}

			char_literal435=(Token)match(input,68,FOLLOW_68_in_atomicNameFormula3324); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal435);

			// AST REWRITE
			// elements: NAME, predicate
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 503:28: -> ^( PRED_INST predicate ( NAME )* )
			{
				// Pddl.g:503:31: ^( PRED_INST predicate ( NAME )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRED_INST, "PRED_INST"), root_1);
				adaptor.addChild(root_1, stream_predicate.nextTree());
				// Pddl.g:503:53: ( NAME )*
				while ( stream_NAME.hasNext() ) {
					adaptor.addChild(root_1, stream_NAME.nextNode());
				}
				stream_NAME.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomicNameFormula"


	public static class goal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "goal"
	// Pddl.g:510:1: goal : '(' ':goal' goalDesc ')' -> ^( GOAL goalDesc ) ;
	public final PddlParser.goal_return goal() throws RecognitionException {
		PddlParser.goal_return retval = new PddlParser.goal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal436=null;
		Token string_literal437=null;
		Token char_literal439=null;
		ParserRuleReturnScope goalDesc438 =null;

		Object char_literal436_tree=null;
		Object string_literal437_tree=null;
		Object char_literal439_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");

		try {
			// Pddl.g:510:6: ( '(' ':goal' goalDesc ')' -> ^( GOAL goalDesc ) )
			// Pddl.g:510:8: '(' ':goal' goalDesc ')'
			{
			char_literal436=(Token)match(input,67,FOLLOW_67_in_goal3349); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal436);

			string_literal437=(Token)match(input,86,FOLLOW_86_in_goal3351); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_86.add(string_literal437);

			pushFollow(FOLLOW_goalDesc_in_goal3353);
			goalDesc438=goalDesc();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc438.getTree());
			char_literal439=(Token)match(input,68,FOLLOW_68_in_goal3356); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal439);

			// AST REWRITE
			// elements: goalDesc
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 510:34: -> ^( GOAL goalDesc )
			{
				// Pddl.g:510:37: ^( GOAL goalDesc )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(GOAL, "GOAL"), root_1);
				adaptor.addChild(root_1, stream_goalDesc.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "goal"


	public static class probConstraints_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "probConstraints"
	// Pddl.g:512:1: probConstraints : '(' ':constraints' prefConGD ')' -> ^( PROBLEM_CONSTRAINT prefConGD ) ;
	public final PddlParser.probConstraints_return probConstraints() throws RecognitionException {
		PddlParser.probConstraints_return retval = new PddlParser.probConstraints_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal440=null;
		Token string_literal441=null;
		Token char_literal443=null;
		ParserRuleReturnScope prefConGD442 =null;

		Object char_literal440_tree=null;
		Object string_literal441_tree=null;
		Object char_literal443_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleSubtreeStream stream_prefConGD=new RewriteRuleSubtreeStream(adaptor,"rule prefConGD");

		try {
			// Pddl.g:513:2: ( '(' ':constraints' prefConGD ')' -> ^( PROBLEM_CONSTRAINT prefConGD ) )
			// Pddl.g:513:4: '(' ':constraints' prefConGD ')'
			{
			char_literal440=(Token)match(input,67,FOLLOW_67_in_probConstraints3374); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal440);

			string_literal441=(Token)match(input,77,FOLLOW_77_in_probConstraints3376); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(string_literal441);

			pushFollow(FOLLOW_prefConGD_in_probConstraints3379);
			prefConGD442=prefConGD();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_prefConGD.add(prefConGD442.getTree());
			char_literal443=(Token)match(input,68,FOLLOW_68_in_probConstraints3381); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal443);

			// AST REWRITE
			// elements: prefConGD
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 514:4: -> ^( PROBLEM_CONSTRAINT prefConGD )
			{
				// Pddl.g:514:7: ^( PROBLEM_CONSTRAINT prefConGD )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_CONSTRAINT, "PROBLEM_CONSTRAINT"), root_1);
				adaptor.addChild(root_1, stream_prefConGD.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "probConstraints"


	public static class prefConGD_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prefConGD"
	// Pddl.g:517:1: prefConGD : ( '(' 'and' ( prefConGD )* ')' | '(' 'forall' '(' typedVariableList ')' prefConGD ')' | '(' 'preference' ( NAME )? conGD ')' | conGD );
	public final PddlParser.prefConGD_return prefConGD() throws RecognitionException {
		PddlParser.prefConGD_return retval = new PddlParser.prefConGD_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal444=null;
		Token string_literal445=null;
		Token char_literal447=null;
		Token char_literal448=null;
		Token string_literal449=null;
		Token char_literal450=null;
		Token char_literal452=null;
		Token char_literal454=null;
		Token char_literal455=null;
		Token string_literal456=null;
		Token NAME457=null;
		Token char_literal459=null;
		ParserRuleReturnScope prefConGD446 =null;
		ParserRuleReturnScope typedVariableList451 =null;
		ParserRuleReturnScope prefConGD453 =null;
		ParserRuleReturnScope conGD458 =null;
		ParserRuleReturnScope conGD460 =null;

		Object char_literal444_tree=null;
		Object string_literal445_tree=null;
		Object char_literal447_tree=null;
		Object char_literal448_tree=null;
		Object string_literal449_tree=null;
		Object char_literal450_tree=null;
		Object char_literal452_tree=null;
		Object char_literal454_tree=null;
		Object char_literal455_tree=null;
		Object string_literal456_tree=null;
		Object NAME457_tree=null;
		Object char_literal459_tree=null;

		try {
			// Pddl.g:518:2: ( '(' 'and' ( prefConGD )* ')' | '(' 'forall' '(' typedVariableList ')' prefConGD ')' | '(' 'preference' ( NAME )? conGD ')' | conGD )
			int alt79=4;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==67) ) {
				int LA79_1 = input.LA(2);
				if ( (synpred126_Pddl()) ) {
					alt79=1;
				}
				else if ( (synpred127_Pddl()) ) {
					alt79=2;
				}
				else if ( (synpred129_Pddl()) ) {
					alt79=3;
				}
				else if ( (true) ) {
					alt79=4;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// Pddl.g:518:4: '(' 'and' ( prefConGD )* ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal444=(Token)match(input,67,FOLLOW_67_in_prefConGD3403); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal444_tree = (Object)adaptor.create(char_literal444);
					adaptor.addChild(root_0, char_literal444_tree);
					}

					string_literal445=(Token)match(input,106,FOLLOW_106_in_prefConGD3405); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal445_tree = (Object)adaptor.create(string_literal445);
					adaptor.addChild(root_0, string_literal445_tree);
					}

					// Pddl.g:518:14: ( prefConGD )*
					loop77:
					while (true) {
						int alt77=2;
						int LA77_0 = input.LA(1);
						if ( (LA77_0==67) ) {
							alt77=1;
						}

						switch (alt77) {
						case 1 :
							// Pddl.g:518:14: prefConGD
							{
							pushFollow(FOLLOW_prefConGD_in_prefConGD3407);
							prefConGD446=prefConGD();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, prefConGD446.getTree());

							}
							break;

						default :
							break loop77;
						}
					}

					char_literal447=(Token)match(input,68,FOLLOW_68_in_prefConGD3410); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal447_tree = (Object)adaptor.create(char_literal447);
					adaptor.addChild(root_0, char_literal447_tree);
					}

					}
					break;
				case 2 :
					// Pddl.g:519:4: '(' 'forall' '(' typedVariableList ')' prefConGD ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal448=(Token)match(input,67,FOLLOW_67_in_prefConGD3415); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal448_tree = (Object)adaptor.create(char_literal448);
					adaptor.addChild(root_0, char_literal448_tree);
					}

					string_literal449=(Token)match(input,117,FOLLOW_117_in_prefConGD3417); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal449_tree = (Object)adaptor.create(string_literal449);
					adaptor.addChild(root_0, string_literal449_tree);
					}

					char_literal450=(Token)match(input,67,FOLLOW_67_in_prefConGD3419); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal450_tree = (Object)adaptor.create(char_literal450);
					adaptor.addChild(root_0, char_literal450_tree);
					}

					pushFollow(FOLLOW_typedVariableList_in_prefConGD3421);
					typedVariableList451=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList451.getTree());

					char_literal452=(Token)match(input,68,FOLLOW_68_in_prefConGD3423); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal452_tree = (Object)adaptor.create(char_literal452);
					adaptor.addChild(root_0, char_literal452_tree);
					}

					pushFollow(FOLLOW_prefConGD_in_prefConGD3425);
					prefConGD453=prefConGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, prefConGD453.getTree());

					char_literal454=(Token)match(input,68,FOLLOW_68_in_prefConGD3427); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal454_tree = (Object)adaptor.create(char_literal454);
					adaptor.addChild(root_0, char_literal454_tree);
					}

					}
					break;
				case 3 :
					// Pddl.g:520:4: '(' 'preference' ( NAME )? conGD ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal455=(Token)match(input,67,FOLLOW_67_in_prefConGD3432); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal455_tree = (Object)adaptor.create(char_literal455);
					adaptor.addChild(root_0, char_literal455_tree);
					}

					string_literal456=(Token)match(input,130,FOLLOW_130_in_prefConGD3434); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal456_tree = (Object)adaptor.create(string_literal456);
					adaptor.addChild(root_0, string_literal456_tree);
					}

					// Pddl.g:520:21: ( NAME )?
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==NAME) ) {
						alt78=1;
					}
					switch (alt78) {
						case 1 :
							// Pddl.g:520:21: NAME
							{
							NAME457=(Token)match(input,NAME,FOLLOW_NAME_in_prefConGD3436); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NAME457_tree = (Object)adaptor.create(NAME457);
							adaptor.addChild(root_0, NAME457_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_conGD_in_prefConGD3439);
					conGD458=conGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD458.getTree());

					char_literal459=(Token)match(input,68,FOLLOW_68_in_prefConGD3441); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal459_tree = (Object)adaptor.create(char_literal459);
					adaptor.addChild(root_0, char_literal459_tree);
					}

					}
					break;
				case 4 :
					// Pddl.g:521:4: conGD
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_conGD_in_prefConGD3446);
					conGD460=conGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD460.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prefConGD"


	public static class metricSpec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "metricSpec"
	// Pddl.g:524:1: metricSpec : '(' ':metric' optimization metricFExp ')' -> ^( PROBLEM_METRIC optimization metricFExp ) ;
	public final PddlParser.metricSpec_return metricSpec() throws RecognitionException {
		PddlParser.metricSpec_return retval = new PddlParser.metricSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal461=null;
		Token string_literal462=null;
		Token char_literal465=null;
		ParserRuleReturnScope optimization463 =null;
		ParserRuleReturnScope metricFExp464 =null;

		Object char_literal461_tree=null;
		Object string_literal462_tree=null;
		Object char_literal465_tree=null;
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleSubtreeStream stream_metricFExp=new RewriteRuleSubtreeStream(adaptor,"rule metricFExp");
		RewriteRuleSubtreeStream stream_optimization=new RewriteRuleSubtreeStream(adaptor,"rule optimization");

		try {
			// Pddl.g:525:2: ( '(' ':metric' optimization metricFExp ')' -> ^( PROBLEM_METRIC optimization metricFExp ) )
			// Pddl.g:525:4: '(' ':metric' optimization metricFExp ')'
			{
			char_literal461=(Token)match(input,67,FOLLOW_67_in_metricSpec3457); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal461);

			string_literal462=(Token)match(input,88,FOLLOW_88_in_metricSpec3459); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_88.add(string_literal462);

			pushFollow(FOLLOW_optimization_in_metricSpec3461);
			optimization463=optimization();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_optimization.add(optimization463.getTree());
			pushFollow(FOLLOW_metricFExp_in_metricSpec3463);
			metricFExp464=metricFExp();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_metricFExp.add(metricFExp464.getTree());
			char_literal465=(Token)match(input,68,FOLLOW_68_in_metricSpec3465); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal465);

			// AST REWRITE
			// elements: optimization, metricFExp
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 526:4: -> ^( PROBLEM_METRIC optimization metricFExp )
			{
				// Pddl.g:526:7: ^( PROBLEM_METRIC optimization metricFExp )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_METRIC, "PROBLEM_METRIC"), root_1);
				adaptor.addChild(root_1, stream_optimization.nextTree());
				adaptor.addChild(root_1, stream_metricFExp.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "metricSpec"


	public static class optimization_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "optimization"
	// Pddl.g:529:1: optimization : ( 'minimize' | 'maximize' );
	public final PddlParser.optimization_return optimization() throws RecognitionException {
		PddlParser.optimization_return retval = new PddlParser.optimization_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set466=null;

		Object set466_tree=null;

		try {
			// Pddl.g:529:14: ( 'minimize' | 'maximize' )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set466=input.LT(1);
			if ( (input.LA(1) >= 123 && input.LA(1) <= 124) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set466));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "optimization"


	public static class metricFExp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "metricFExp"
	// Pddl.g:531:1: metricFExp : ( '(' binaryOp metricFExp metricFExp ')' -> ^( BINARY_OP binaryOp metricFExp metricFExp ) | '(' multiOp metricFExp ( metricFExp )+ ')' -> ^( MULTI_OP multiOp metricFExp ( metricFExp )+ ) | '(' '-' metricFExp ')' -> ^( MINUS_OP metricFExp ) | NUMBER | fHead | '(' 'is-violated' NAME ')' );
	public final PddlParser.metricFExp_return metricFExp() throws RecognitionException {
		PddlParser.metricFExp_return retval = new PddlParser.metricFExp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal467=null;
		Token char_literal471=null;
		Token char_literal472=null;
		Token char_literal476=null;
		Token char_literal477=null;
		Token char_literal478=null;
		Token char_literal480=null;
		Token NUMBER481=null;
		Token char_literal483=null;
		Token string_literal484=null;
		Token NAME485=null;
		Token char_literal486=null;
		ParserRuleReturnScope binaryOp468 =null;
		ParserRuleReturnScope metricFExp469 =null;
		ParserRuleReturnScope metricFExp470 =null;
		ParserRuleReturnScope multiOp473 =null;
		ParserRuleReturnScope metricFExp474 =null;
		ParserRuleReturnScope metricFExp475 =null;
		ParserRuleReturnScope metricFExp479 =null;
		ParserRuleReturnScope fHead482 =null;

		Object char_literal467_tree=null;
		Object char_literal471_tree=null;
		Object char_literal472_tree=null;
		Object char_literal476_tree=null;
		Object char_literal477_tree=null;
		Object char_literal478_tree=null;
		Object char_literal480_tree=null;
		Object NUMBER481_tree=null;
		Object char_literal483_tree=null;
		Object string_literal484_tree=null;
		Object NAME485_tree=null;
		Object char_literal486_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleSubtreeStream stream_binaryOp=new RewriteRuleSubtreeStream(adaptor,"rule binaryOp");
		RewriteRuleSubtreeStream stream_metricFExp=new RewriteRuleSubtreeStream(adaptor,"rule metricFExp");
		RewriteRuleSubtreeStream stream_multiOp=new RewriteRuleSubtreeStream(adaptor,"rule multiOp");

		try {
			// Pddl.g:532:2: ( '(' binaryOp metricFExp metricFExp ')' -> ^( BINARY_OP binaryOp metricFExp metricFExp ) | '(' multiOp metricFExp ( metricFExp )+ ')' -> ^( MULTI_OP multiOp metricFExp ( metricFExp )+ ) | '(' '-' metricFExp ')' -> ^( MINUS_OP metricFExp ) | NUMBER | fHead | '(' 'is-violated' NAME ')' )
			int alt81=6;
			switch ( input.LA(1) ) {
			case 67:
				{
				int LA81_1 = input.LA(2);
				if ( (synpred131_Pddl()) ) {
					alt81=1;
				}
				else if ( (synpred133_Pddl()) ) {
					alt81=2;
				}
				else if ( (synpred134_Pddl()) ) {
					alt81=3;
				}
				else if ( (synpred136_Pddl()) ) {
					alt81=5;
				}
				else if ( (true) ) {
					alt81=6;
				}

				}
				break;
			case NUMBER:
				{
				alt81=4;
				}
				break;
			case NAME:
			case 66:
				{
				alt81=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}
			switch (alt81) {
				case 1 :
					// Pddl.g:532:4: '(' binaryOp metricFExp metricFExp ')'
					{
					char_literal467=(Token)match(input,67,FOLLOW_67_in_metricFExp3502); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal467);

					pushFollow(FOLLOW_binaryOp_in_metricFExp3504);
					binaryOp468=binaryOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_binaryOp.add(binaryOp468.getTree());
					pushFollow(FOLLOW_metricFExp_in_metricFExp3506);
					metricFExp469=metricFExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_metricFExp.add(metricFExp469.getTree());
					pushFollow(FOLLOW_metricFExp_in_metricFExp3508);
					metricFExp470=metricFExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_metricFExp.add(metricFExp470.getTree());
					char_literal471=(Token)match(input,68,FOLLOW_68_in_metricFExp3510); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal471);

					// AST REWRITE
					// elements: metricFExp, metricFExp, binaryOp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 533:6: -> ^( BINARY_OP binaryOp metricFExp metricFExp )
					{
						// Pddl.g:533:9: ^( BINARY_OP binaryOp metricFExp metricFExp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BINARY_OP, "BINARY_OP"), root_1);
						adaptor.addChild(root_1, stream_binaryOp.nextTree());
						adaptor.addChild(root_1, stream_metricFExp.nextTree());
						adaptor.addChild(root_1, stream_metricFExp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:534:4: '(' multiOp metricFExp ( metricFExp )+ ')'
					{
					char_literal472=(Token)match(input,67,FOLLOW_67_in_metricFExp3532); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal472);

					pushFollow(FOLLOW_multiOp_in_metricFExp3534);
					multiOp473=multiOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multiOp.add(multiOp473.getTree());
					pushFollow(FOLLOW_metricFExp_in_metricFExp3536);
					metricFExp474=metricFExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_metricFExp.add(metricFExp474.getTree());
					// Pddl.g:534:27: ( metricFExp )+
					int cnt80=0;
					loop80:
					while (true) {
						int alt80=2;
						int LA80_0 = input.LA(1);
						if ( (LA80_0==NAME||LA80_0==NUMBER||(LA80_0 >= 66 && LA80_0 <= 67)) ) {
							alt80=1;
						}

						switch (alt80) {
						case 1 :
							// Pddl.g:534:27: metricFExp
							{
							pushFollow(FOLLOW_metricFExp_in_metricFExp3538);
							metricFExp475=metricFExp();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_metricFExp.add(metricFExp475.getTree());
							}
							break;

						default :
							if ( cnt80 >= 1 ) break loop80;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(80, input);
							throw eee;
						}
						cnt80++;
					}

					char_literal476=(Token)match(input,68,FOLLOW_68_in_metricFExp3541); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal476);

					// AST REWRITE
					// elements: multiOp, metricFExp, metricFExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 535:7: -> ^( MULTI_OP multiOp metricFExp ( metricFExp )+ )
					{
						// Pddl.g:535:10: ^( MULTI_OP multiOp metricFExp ( metricFExp )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MULTI_OP, "MULTI_OP"), root_1);
						adaptor.addChild(root_1, stream_multiOp.nextTree());
						adaptor.addChild(root_1, stream_metricFExp.nextTree());
						if ( !(stream_metricFExp.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_metricFExp.hasNext() ) {
							adaptor.addChild(root_1, stream_metricFExp.nextTree());
						}
						stream_metricFExp.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Pddl.g:536:4: '(' '-' metricFExp ')'
					{
					char_literal477=(Token)match(input,67,FOLLOW_67_in_metricFExp3565); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal477);

					char_literal478=(Token)match(input,71,FOLLOW_71_in_metricFExp3567); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal478);

					pushFollow(FOLLOW_metricFExp_in_metricFExp3569);
					metricFExp479=metricFExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_metricFExp.add(metricFExp479.getTree());
					char_literal480=(Token)match(input,68,FOLLOW_68_in_metricFExp3571); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal480);

					// AST REWRITE
					// elements: metricFExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 537:4: -> ^( MINUS_OP metricFExp )
					{
						// Pddl.g:537:7: ^( MINUS_OP metricFExp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUS_OP, "MINUS_OP"), root_1);
						adaptor.addChild(root_1, stream_metricFExp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Pddl.g:538:4: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER481=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_metricFExp3588); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER481_tree = (Object)adaptor.create(NUMBER481);
					adaptor.addChild(root_0, NUMBER481_tree);
					}

					}
					break;
				case 5 :
					// Pddl.g:539:4: fHead
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fHead_in_metricFExp3593);
					fHead482=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead482.getTree());

					}
					break;
				case 6 :
					// Pddl.g:541:4: '(' 'is-violated' NAME ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal483=(Token)match(input,67,FOLLOW_67_in_metricFExp3608); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal483_tree = (Object)adaptor.create(char_literal483);
					adaptor.addChild(root_0, char_literal483_tree);
					}

					string_literal484=(Token)match(input,122,FOLLOW_122_in_metricFExp3610); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal484_tree = (Object)adaptor.create(string_literal484);
					adaptor.addChild(root_0, string_literal484_tree);
					}

					NAME485=(Token)match(input,NAME,FOLLOW_NAME_in_metricFExp3612); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NAME485_tree = (Object)adaptor.create(NAME485);
					adaptor.addChild(root_0, NAME485_tree);
					}

					char_literal486=(Token)match(input,68,FOLLOW_68_in_metricFExp3614); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal486_tree = (Object)adaptor.create(char_literal486);
					adaptor.addChild(root_0, char_literal486_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "metricFExp"


	public static class conGD_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conGD"
	// Pddl.g:546:1: conGD : ( '(' 'and' ( conGD )* ')' | '(' 'forall' '(' typedVariableList ')' conGD ')' | '(' 'at' 'end' goalDesc ')' | '(' 'always' goalDesc ')' | '(' 'sometime' goalDesc ')' | '(' 'within' NUMBER goalDesc ')' | '(' 'at-most-once' goalDesc ')' | '(' 'sometime-after' goalDesc goalDesc ')' | '(' 'sometime-before' goalDesc goalDesc ')' | '(' 'always-within' NUMBER goalDesc goalDesc ')' | '(' 'hold-during' NUMBER NUMBER goalDesc ')' | '(' 'hold-after' NUMBER goalDesc ')' );
	public final PddlParser.conGD_return conGD() throws RecognitionException {
		PddlParser.conGD_return retval = new PddlParser.conGD_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal487=null;
		Token string_literal488=null;
		Token char_literal490=null;
		Token char_literal491=null;
		Token string_literal492=null;
		Token char_literal493=null;
		Token char_literal495=null;
		Token char_literal497=null;
		Token char_literal498=null;
		Token string_literal499=null;
		Token string_literal500=null;
		Token char_literal502=null;
		Token char_literal503=null;
		Token string_literal504=null;
		Token char_literal506=null;
		Token char_literal507=null;
		Token string_literal508=null;
		Token char_literal510=null;
		Token char_literal511=null;
		Token string_literal512=null;
		Token NUMBER513=null;
		Token char_literal515=null;
		Token char_literal516=null;
		Token string_literal517=null;
		Token char_literal519=null;
		Token char_literal520=null;
		Token string_literal521=null;
		Token char_literal524=null;
		Token char_literal525=null;
		Token string_literal526=null;
		Token char_literal529=null;
		Token char_literal530=null;
		Token string_literal531=null;
		Token NUMBER532=null;
		Token char_literal535=null;
		Token char_literal536=null;
		Token string_literal537=null;
		Token NUMBER538=null;
		Token NUMBER539=null;
		Token char_literal541=null;
		Token char_literal542=null;
		Token string_literal543=null;
		Token NUMBER544=null;
		Token char_literal546=null;
		ParserRuleReturnScope conGD489 =null;
		ParserRuleReturnScope typedVariableList494 =null;
		ParserRuleReturnScope conGD496 =null;
		ParserRuleReturnScope goalDesc501 =null;
		ParserRuleReturnScope goalDesc505 =null;
		ParserRuleReturnScope goalDesc509 =null;
		ParserRuleReturnScope goalDesc514 =null;
		ParserRuleReturnScope goalDesc518 =null;
		ParserRuleReturnScope goalDesc522 =null;
		ParserRuleReturnScope goalDesc523 =null;
		ParserRuleReturnScope goalDesc527 =null;
		ParserRuleReturnScope goalDesc528 =null;
		ParserRuleReturnScope goalDesc533 =null;
		ParserRuleReturnScope goalDesc534 =null;
		ParserRuleReturnScope goalDesc540 =null;
		ParserRuleReturnScope goalDesc545 =null;

		Object char_literal487_tree=null;
		Object string_literal488_tree=null;
		Object char_literal490_tree=null;
		Object char_literal491_tree=null;
		Object string_literal492_tree=null;
		Object char_literal493_tree=null;
		Object char_literal495_tree=null;
		Object char_literal497_tree=null;
		Object char_literal498_tree=null;
		Object string_literal499_tree=null;
		Object string_literal500_tree=null;
		Object char_literal502_tree=null;
		Object char_literal503_tree=null;
		Object string_literal504_tree=null;
		Object char_literal506_tree=null;
		Object char_literal507_tree=null;
		Object string_literal508_tree=null;
		Object char_literal510_tree=null;
		Object char_literal511_tree=null;
		Object string_literal512_tree=null;
		Object NUMBER513_tree=null;
		Object char_literal515_tree=null;
		Object char_literal516_tree=null;
		Object string_literal517_tree=null;
		Object char_literal519_tree=null;
		Object char_literal520_tree=null;
		Object string_literal521_tree=null;
		Object char_literal524_tree=null;
		Object char_literal525_tree=null;
		Object string_literal526_tree=null;
		Object char_literal529_tree=null;
		Object char_literal530_tree=null;
		Object string_literal531_tree=null;
		Object NUMBER532_tree=null;
		Object char_literal535_tree=null;
		Object char_literal536_tree=null;
		Object string_literal537_tree=null;
		Object NUMBER538_tree=null;
		Object NUMBER539_tree=null;
		Object char_literal541_tree=null;
		Object char_literal542_tree=null;
		Object string_literal543_tree=null;
		Object NUMBER544_tree=null;
		Object char_literal546_tree=null;

		try {
			// Pddl.g:547:2: ( '(' 'and' ( conGD )* ')' | '(' 'forall' '(' typedVariableList ')' conGD ')' | '(' 'at' 'end' goalDesc ')' | '(' 'always' goalDesc ')' | '(' 'sometime' goalDesc ')' | '(' 'within' NUMBER goalDesc ')' | '(' 'at-most-once' goalDesc ')' | '(' 'sometime-after' goalDesc goalDesc ')' | '(' 'sometime-before' goalDesc goalDesc ')' | '(' 'always-within' NUMBER goalDesc goalDesc ')' | '(' 'hold-during' NUMBER NUMBER goalDesc ')' | '(' 'hold-after' NUMBER goalDesc ')' )
			int alt83=12;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==67) ) {
				switch ( input.LA(2) ) {
				case 106:
					{
					alt83=1;
					}
					break;
				case 117:
					{
					alt83=2;
					}
					break;
				case 108:
					{
					alt83=3;
					}
					break;
				case 104:
					{
					alt83=4;
					}
					break;
				case 135:
					{
					alt83=5;
					}
					break;
				case 141:
					{
					alt83=6;
					}
					break;
				case 109:
					{
					alt83=7;
					}
					break;
				case 136:
					{
					alt83=8;
					}
					break;
				case 137:
					{
					alt83=9;
					}
					break;
				case 105:
					{
					alt83=10;
					}
					break;
				case 119:
					{
					alt83=11;
					}
					break;
				case 118:
					{
					alt83=12;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 83, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}

			switch (alt83) {
				case 1 :
					// Pddl.g:547:4: '(' 'and' ( conGD )* ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal487=(Token)match(input,67,FOLLOW_67_in_conGD3628); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal487_tree = (Object)adaptor.create(char_literal487);
					adaptor.addChild(root_0, char_literal487_tree);
					}

					string_literal488=(Token)match(input,106,FOLLOW_106_in_conGD3630); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal488_tree = (Object)adaptor.create(string_literal488);
					adaptor.addChild(root_0, string_literal488_tree);
					}

					// Pddl.g:547:14: ( conGD )*
					loop82:
					while (true) {
						int alt82=2;
						int LA82_0 = input.LA(1);
						if ( (LA82_0==67) ) {
							alt82=1;
						}

						switch (alt82) {
						case 1 :
							// Pddl.g:547:14: conGD
							{
							pushFollow(FOLLOW_conGD_in_conGD3632);
							conGD489=conGD();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD489.getTree());

							}
							break;

						default :
							break loop82;
						}
					}

					char_literal490=(Token)match(input,68,FOLLOW_68_in_conGD3635); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal490_tree = (Object)adaptor.create(char_literal490);
					adaptor.addChild(root_0, char_literal490_tree);
					}

					}
					break;
				case 2 :
					// Pddl.g:548:4: '(' 'forall' '(' typedVariableList ')' conGD ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal491=(Token)match(input,67,FOLLOW_67_in_conGD3640); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal491_tree = (Object)adaptor.create(char_literal491);
					adaptor.addChild(root_0, char_literal491_tree);
					}

					string_literal492=(Token)match(input,117,FOLLOW_117_in_conGD3642); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal492_tree = (Object)adaptor.create(string_literal492);
					adaptor.addChild(root_0, string_literal492_tree);
					}

					char_literal493=(Token)match(input,67,FOLLOW_67_in_conGD3644); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal493_tree = (Object)adaptor.create(char_literal493);
					adaptor.addChild(root_0, char_literal493_tree);
					}

					pushFollow(FOLLOW_typedVariableList_in_conGD3646);
					typedVariableList494=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList494.getTree());

					char_literal495=(Token)match(input,68,FOLLOW_68_in_conGD3648); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal495_tree = (Object)adaptor.create(char_literal495);
					adaptor.addChild(root_0, char_literal495_tree);
					}

					pushFollow(FOLLOW_conGD_in_conGD3650);
					conGD496=conGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD496.getTree());

					char_literal497=(Token)match(input,68,FOLLOW_68_in_conGD3652); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal497_tree = (Object)adaptor.create(char_literal497);
					adaptor.addChild(root_0, char_literal497_tree);
					}

					}
					break;
				case 3 :
					// Pddl.g:549:4: '(' 'at' 'end' goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal498=(Token)match(input,67,FOLLOW_67_in_conGD3657); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal498_tree = (Object)adaptor.create(char_literal498);
					adaptor.addChild(root_0, char_literal498_tree);
					}

					string_literal499=(Token)match(input,108,FOLLOW_108_in_conGD3659); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal499_tree = (Object)adaptor.create(string_literal499);
					adaptor.addChild(root_0, string_literal499_tree);
					}

					string_literal500=(Token)match(input,115,FOLLOW_115_in_conGD3661); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal500_tree = (Object)adaptor.create(string_literal500);
					adaptor.addChild(root_0, string_literal500_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3663);
					goalDesc501=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc501.getTree());

					char_literal502=(Token)match(input,68,FOLLOW_68_in_conGD3665); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal502_tree = (Object)adaptor.create(char_literal502);
					adaptor.addChild(root_0, char_literal502_tree);
					}

					}
					break;
				case 4 :
					// Pddl.g:550:25: '(' 'always' goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal503=(Token)match(input,67,FOLLOW_67_in_conGD3691); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal503_tree = (Object)adaptor.create(char_literal503);
					adaptor.addChild(root_0, char_literal503_tree);
					}

					string_literal504=(Token)match(input,104,FOLLOW_104_in_conGD3693); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal504_tree = (Object)adaptor.create(string_literal504);
					adaptor.addChild(root_0, string_literal504_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3695);
					goalDesc505=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc505.getTree());

					char_literal506=(Token)match(input,68,FOLLOW_68_in_conGD3697); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal506_tree = (Object)adaptor.create(char_literal506);
					adaptor.addChild(root_0, char_literal506_tree);
					}

					}
					break;
				case 5 :
					// Pddl.g:551:4: '(' 'sometime' goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal507=(Token)match(input,67,FOLLOW_67_in_conGD3702); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal507_tree = (Object)adaptor.create(char_literal507);
					adaptor.addChild(root_0, char_literal507_tree);
					}

					string_literal508=(Token)match(input,135,FOLLOW_135_in_conGD3704); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal508_tree = (Object)adaptor.create(string_literal508);
					adaptor.addChild(root_0, string_literal508_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3706);
					goalDesc509=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc509.getTree());

					char_literal510=(Token)match(input,68,FOLLOW_68_in_conGD3708); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal510_tree = (Object)adaptor.create(char_literal510);
					adaptor.addChild(root_0, char_literal510_tree);
					}

					}
					break;
				case 6 :
					// Pddl.g:552:5: '(' 'within' NUMBER goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal511=(Token)match(input,67,FOLLOW_67_in_conGD3714); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal511_tree = (Object)adaptor.create(char_literal511);
					adaptor.addChild(root_0, char_literal511_tree);
					}

					string_literal512=(Token)match(input,141,FOLLOW_141_in_conGD3716); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal512_tree = (Object)adaptor.create(string_literal512);
					adaptor.addChild(root_0, string_literal512_tree);
					}

					NUMBER513=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3718); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER513_tree = (Object)adaptor.create(NUMBER513);
					adaptor.addChild(root_0, NUMBER513_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3720);
					goalDesc514=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc514.getTree());

					char_literal515=(Token)match(input,68,FOLLOW_68_in_conGD3722); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal515_tree = (Object)adaptor.create(char_literal515);
					adaptor.addChild(root_0, char_literal515_tree);
					}

					}
					break;
				case 7 :
					// Pddl.g:553:4: '(' 'at-most-once' goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal516=(Token)match(input,67,FOLLOW_67_in_conGD3727); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal516_tree = (Object)adaptor.create(char_literal516);
					adaptor.addChild(root_0, char_literal516_tree);
					}

					string_literal517=(Token)match(input,109,FOLLOW_109_in_conGD3729); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal517_tree = (Object)adaptor.create(string_literal517);
					adaptor.addChild(root_0, string_literal517_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3731);
					goalDesc518=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc518.getTree());

					char_literal519=(Token)match(input,68,FOLLOW_68_in_conGD3733); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal519_tree = (Object)adaptor.create(char_literal519);
					adaptor.addChild(root_0, char_literal519_tree);
					}

					}
					break;
				case 8 :
					// Pddl.g:554:4: '(' 'sometime-after' goalDesc goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal520=(Token)match(input,67,FOLLOW_67_in_conGD3738); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal520_tree = (Object)adaptor.create(char_literal520);
					adaptor.addChild(root_0, char_literal520_tree);
					}

					string_literal521=(Token)match(input,136,FOLLOW_136_in_conGD3740); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal521_tree = (Object)adaptor.create(string_literal521);
					adaptor.addChild(root_0, string_literal521_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3742);
					goalDesc522=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc522.getTree());

					pushFollow(FOLLOW_goalDesc_in_conGD3744);
					goalDesc523=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc523.getTree());

					char_literal524=(Token)match(input,68,FOLLOW_68_in_conGD3746); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal524_tree = (Object)adaptor.create(char_literal524);
					adaptor.addChild(root_0, char_literal524_tree);
					}

					}
					break;
				case 9 :
					// Pddl.g:555:4: '(' 'sometime-before' goalDesc goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal525=(Token)match(input,67,FOLLOW_67_in_conGD3751); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal525_tree = (Object)adaptor.create(char_literal525);
					adaptor.addChild(root_0, char_literal525_tree);
					}

					string_literal526=(Token)match(input,137,FOLLOW_137_in_conGD3753); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal526_tree = (Object)adaptor.create(string_literal526);
					adaptor.addChild(root_0, string_literal526_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3755);
					goalDesc527=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc527.getTree());

					pushFollow(FOLLOW_goalDesc_in_conGD3757);
					goalDesc528=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc528.getTree());

					char_literal529=(Token)match(input,68,FOLLOW_68_in_conGD3759); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal529_tree = (Object)adaptor.create(char_literal529);
					adaptor.addChild(root_0, char_literal529_tree);
					}

					}
					break;
				case 10 :
					// Pddl.g:556:4: '(' 'always-within' NUMBER goalDesc goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal530=(Token)match(input,67,FOLLOW_67_in_conGD3764); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal530_tree = (Object)adaptor.create(char_literal530);
					adaptor.addChild(root_0, char_literal530_tree);
					}

					string_literal531=(Token)match(input,105,FOLLOW_105_in_conGD3766); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal531_tree = (Object)adaptor.create(string_literal531);
					adaptor.addChild(root_0, string_literal531_tree);
					}

					NUMBER532=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3768); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER532_tree = (Object)adaptor.create(NUMBER532);
					adaptor.addChild(root_0, NUMBER532_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3770);
					goalDesc533=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc533.getTree());

					pushFollow(FOLLOW_goalDesc_in_conGD3772);
					goalDesc534=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc534.getTree());

					char_literal535=(Token)match(input,68,FOLLOW_68_in_conGD3774); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal535_tree = (Object)adaptor.create(char_literal535);
					adaptor.addChild(root_0, char_literal535_tree);
					}

					}
					break;
				case 11 :
					// Pddl.g:557:4: '(' 'hold-during' NUMBER NUMBER goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal536=(Token)match(input,67,FOLLOW_67_in_conGD3779); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal536_tree = (Object)adaptor.create(char_literal536);
					adaptor.addChild(root_0, char_literal536_tree);
					}

					string_literal537=(Token)match(input,119,FOLLOW_119_in_conGD3781); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal537_tree = (Object)adaptor.create(string_literal537);
					adaptor.addChild(root_0, string_literal537_tree);
					}

					NUMBER538=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3783); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER538_tree = (Object)adaptor.create(NUMBER538);
					adaptor.addChild(root_0, NUMBER538_tree);
					}

					NUMBER539=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3785); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER539_tree = (Object)adaptor.create(NUMBER539);
					adaptor.addChild(root_0, NUMBER539_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3787);
					goalDesc540=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc540.getTree());

					char_literal541=(Token)match(input,68,FOLLOW_68_in_conGD3789); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal541_tree = (Object)adaptor.create(char_literal541);
					adaptor.addChild(root_0, char_literal541_tree);
					}

					}
					break;
				case 12 :
					// Pddl.g:558:4: '(' 'hold-after' NUMBER goalDesc ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal542=(Token)match(input,67,FOLLOW_67_in_conGD3794); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal542_tree = (Object)adaptor.create(char_literal542);
					adaptor.addChild(root_0, char_literal542_tree);
					}

					string_literal543=(Token)match(input,118,FOLLOW_118_in_conGD3796); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal543_tree = (Object)adaptor.create(string_literal543);
					adaptor.addChild(root_0, string_literal543_tree);
					}

					NUMBER544=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3798); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER544_tree = (Object)adaptor.create(NUMBER544);
					adaptor.addChild(root_0, NUMBER544_tree);
					}

					pushFollow(FOLLOW_goalDesc_in_conGD3800);
					goalDesc545=goalDesc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc545.getTree());

					char_literal546=(Token)match(input,68,FOLLOW_68_in_conGD3802); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal546_tree = (Object)adaptor.create(char_literal546);
					adaptor.addChild(root_0, char_literal546_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conGD"

	// $ANTLR start synpred18_Pddl
	public final void synpred18_Pddl_fragment() throws RecognitionException {
		// Pddl.g:166:5: ( atomicFunctionSkeleton )
		// Pddl.g:166:5: atomicFunctionSkeleton
		{
		pushFollow(FOLLOW_atomicFunctionSkeleton_in_synpred18_Pddl828);
		atomicFunctionSkeleton();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred18_Pddl

	// $ANTLR start synpred50_Pddl
	public final void synpred50_Pddl_fragment() throws RecognitionException {
		// Pddl.g:291:7: ( fComp )
		// Pddl.g:291:7: fComp
		{
		pushFollow(FOLLOW_fComp_in_synpred50_Pddl1755);
		fComp();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred50_Pddl

	// $ANTLR start synpred53_Pddl
	public final void synpred53_Pddl_fragment() throws RecognitionException {
		// Pddl.g:314:28: ( typedVariableList )
		// Pddl.g:314:28: typedVariableList
		{
		pushFollow(FOLLOW_typedVariableList_in_synpred53_Pddl1914);
		typedVariableList();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred53_Pddl

	// $ANTLR start synpred66_Pddl
	public final void synpred66_Pddl_fragment() throws RecognitionException {
		// Pddl.g:354:4: ( '(' binaryOp fExp fExp2 ')' )
		// Pddl.g:354:4: '(' binaryOp fExp fExp2 ')'
		{
		match(input,67,FOLLOW_67_in_synpred66_Pddl2170); if (state.failed) return;

		pushFollow(FOLLOW_binaryOp_in_synpred66_Pddl2172);
		binaryOp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_fExp_in_synpred66_Pddl2174);
		fExp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_fExp2_in_synpred66_Pddl2176);
		fExp2();
		state._fsp--;
		if (state.failed) return;

		match(input,68,FOLLOW_68_in_synpred66_Pddl2178); if (state.failed) return;

		}

	}
	// $ANTLR end synpred66_Pddl

	// $ANTLR start synpred67_Pddl
	public final void synpred67_Pddl_fragment() throws RecognitionException {
		// Pddl.g:355:4: ( '(' '-' fExp ')' )
		// Pddl.g:355:4: '(' '-' fExp ')'
		{
		match(input,67,FOLLOW_67_in_synpred67_Pddl2195); if (state.failed) return;

		match(input,71,FOLLOW_71_in_synpred67_Pddl2197); if (state.failed) return;

		pushFollow(FOLLOW_fExp_in_synpred67_Pddl2199);
		fExp();
		state._fsp--;
		if (state.failed) return;

		match(input,68,FOLLOW_68_in_synpred67_Pddl2201); if (state.failed) return;

		}

	}
	// $ANTLR end synpred67_Pddl

	// $ANTLR start synpred68_Pddl
	public final void synpred68_Pddl_fragment() throws RecognitionException {
		// Pddl.g:356:7: ( '(' 'sin' fExp ')' )
		// Pddl.g:356:7: '(' 'sin' fExp ')'
		{
		match(input,67,FOLLOW_67_in_synpred68_Pddl2217); if (state.failed) return;

		match(input,134,FOLLOW_134_in_synpred68_Pddl2219); if (state.failed) return;

		pushFollow(FOLLOW_fExp_in_synpred68_Pddl2221);
		fExp();
		state._fsp--;
		if (state.failed) return;

		match(input,68,FOLLOW_68_in_synpred68_Pddl2223); if (state.failed) return;

		}

	}
	// $ANTLR end synpred68_Pddl

	// $ANTLR start synpred69_Pddl
	public final void synpred69_Pddl_fragment() throws RecognitionException {
		// Pddl.g:357:7: ( '(' 'cos' fExp ')' )
		// Pddl.g:357:7: '(' 'cos' fExp ')'
		{
		match(input,67,FOLLOW_67_in_synpred69_Pddl2239); if (state.failed) return;

		match(input,110,FOLLOW_110_in_synpred69_Pddl2241); if (state.failed) return;

		pushFollow(FOLLOW_fExp_in_synpred69_Pddl2243);
		fExp();
		state._fsp--;
		if (state.failed) return;

		match(input,68,FOLLOW_68_in_synpred69_Pddl2245); if (state.failed) return;

		}

	}
	// $ANTLR end synpred69_Pddl

	// $ANTLR start synpred99_Pddl
	public final void synpred99_Pddl_fragment() throws RecognitionException {
		// Pddl.g:424:12: ( NUMBER )
		// Pddl.g:424:12: NUMBER
		{
		match(input,NUMBER,FOLLOW_NUMBER_in_synpred99_Pddl2688); if (state.failed) return;

		}

	}
	// $ANTLR end synpred99_Pddl

	// $ANTLR start synpred101_Pddl
	public final void synpred101_Pddl_fragment() throws RecognitionException {
		// Pddl.g:427:4: ( '(' 'and' ( daEffect )* ')' )
		// Pddl.g:427:4: '(' 'and' ( daEffect )* ')'
		{
		match(input,67,FOLLOW_67_in_synpred101_Pddl2702); if (state.failed) return;

		match(input,106,FOLLOW_106_in_synpred101_Pddl2704); if (state.failed) return;

		// Pddl.g:427:14: ( daEffect )*
		loop101:
		while (true) {
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==67) ) {
				alt101=1;
			}

			switch (alt101) {
			case 1 :
				// Pddl.g:427:14: daEffect
				{
				pushFollow(FOLLOW_daEffect_in_synpred101_Pddl2706);
				daEffect();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				break loop101;
			}
		}

		match(input,68,FOLLOW_68_in_synpred101_Pddl2709); if (state.failed) return;

		}

	}
	// $ANTLR end synpred101_Pddl

	// $ANTLR start synpred102_Pddl
	public final void synpred102_Pddl_fragment() throws RecognitionException {
		// Pddl.g:428:4: ( timedEffect )
		// Pddl.g:428:4: timedEffect
		{
		pushFollow(FOLLOW_timedEffect_in_synpred102_Pddl2714);
		timedEffect();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred102_Pddl

	// $ANTLR start synpred103_Pddl
	public final void synpred103_Pddl_fragment() throws RecognitionException {
		// Pddl.g:429:4: ( '(' 'forall' '(' typedVariableList ')' daEffect ')' )
		// Pddl.g:429:4: '(' 'forall' '(' typedVariableList ')' daEffect ')'
		{
		match(input,67,FOLLOW_67_in_synpred103_Pddl2719); if (state.failed) return;

		match(input,117,FOLLOW_117_in_synpred103_Pddl2721); if (state.failed) return;

		match(input,67,FOLLOW_67_in_synpred103_Pddl2723); if (state.failed) return;

		pushFollow(FOLLOW_typedVariableList_in_synpred103_Pddl2725);
		typedVariableList();
		state._fsp--;
		if (state.failed) return;

		match(input,68,FOLLOW_68_in_synpred103_Pddl2727); if (state.failed) return;

		pushFollow(FOLLOW_daEffect_in_synpred103_Pddl2729);
		daEffect();
		state._fsp--;
		if (state.failed) return;

		match(input,68,FOLLOW_68_in_synpred103_Pddl2731); if (state.failed) return;

		}

	}
	// $ANTLR end synpred103_Pddl

	// $ANTLR start synpred104_Pddl
	public final void synpred104_Pddl_fragment() throws RecognitionException {
		// Pddl.g:430:4: ( '(' 'when' daGD timedEffect ')' )
		// Pddl.g:430:4: '(' 'when' daGD timedEffect ')'
		{
		match(input,67,FOLLOW_67_in_synpred104_Pddl2736); if (state.failed) return;

		match(input,140,FOLLOW_140_in_synpred104_Pddl2738); if (state.failed) return;

		pushFollow(FOLLOW_daGD_in_synpred104_Pddl2740);
		daGD();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_timedEffect_in_synpred104_Pddl2742);
		timedEffect();
		state._fsp--;
		if (state.failed) return;

		match(input,68,FOLLOW_68_in_synpred104_Pddl2744); if (state.failed) return;

		}

	}
	// $ANTLR end synpred104_Pddl

	// $ANTLR start synpred105_Pddl
	public final void synpred105_Pddl_fragment() throws RecognitionException {
		// Pddl.g:435:4: ( '(' 'at' timeSpecifier daEffect ')' )
		// Pddl.g:435:4: '(' 'at' timeSpecifier daEffect ')'
		{
		match(input,67,FOLLOW_67_in_synpred105_Pddl2768); if (state.failed) return;

		match(input,108,FOLLOW_108_in_synpred105_Pddl2770); if (state.failed) return;

		pushFollow(FOLLOW_timeSpecifier_in_synpred105_Pddl2772);
		timeSpecifier();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_daEffect_in_synpred105_Pddl2774);
		daEffect();
		state._fsp--;
		if (state.failed) return;

		match(input,68,FOLLOW_68_in_synpred105_Pddl2776); if (state.failed) return;

		}

	}
	// $ANTLR end synpred105_Pddl

	// $ANTLR start synpred106_Pddl
	public final void synpred106_Pddl_fragment() throws RecognitionException {
		// Pddl.g:436:4: ( '(' 'at' timeSpecifier fAssignDA ')' )
		// Pddl.g:436:4: '(' 'at' timeSpecifier fAssignDA ')'
		{
		match(input,67,FOLLOW_67_in_synpred106_Pddl2786); if (state.failed) return;

		match(input,108,FOLLOW_108_in_synpred106_Pddl2788); if (state.failed) return;

		pushFollow(FOLLOW_timeSpecifier_in_synpred106_Pddl2790);
		timeSpecifier();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_fAssignDA_in_synpred106_Pddl2792);
		fAssignDA();
		state._fsp--;
		if (state.failed) return;

		match(input,68,FOLLOW_68_in_synpred106_Pddl2794); if (state.failed) return;

		}

	}
	// $ANTLR end synpred106_Pddl

	// $ANTLR start synpred107_Pddl
	public final void synpred107_Pddl_fragment() throws RecognitionException {
		// Pddl.g:445:9: ( ( binaryOp fExpDA fExpDA ) )
		// Pddl.g:445:9: ( binaryOp fExpDA fExpDA )
		{
		// Pddl.g:445:9: ( binaryOp fExpDA fExpDA )
		// Pddl.g:445:10: binaryOp fExpDA fExpDA
		{
		pushFollow(FOLLOW_binaryOp_in_synpred107_Pddl2850);
		binaryOp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_fExpDA_in_synpred107_Pddl2852);
		fExpDA();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_fExpDA_in_synpred107_Pddl2854);
		fExpDA();
		state._fsp--;
		if (state.failed) return;

		}

		}

	}
	// $ANTLR end synpred107_Pddl

	// $ANTLR start synpred108_Pddl
	public final void synpred108_Pddl_fragment() throws RecognitionException {
		// Pddl.g:445:4: ( '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')' )
		// Pddl.g:445:4: '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')'
		{
		match(input,67,FOLLOW_67_in_synpred108_Pddl2846); if (state.failed) return;

		// Pddl.g:445:8: ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) )
		int alt102=2;
		int LA102_0 = input.LA(1);
		if ( (LA102_0==71) ) {
			int LA102_1 = input.LA(2);
			if ( (synpred107_Pddl()) ) {
				alt102=1;
			}
			else if ( (true) ) {
				alt102=2;
			}

		}
		else if ( ((LA102_0 >= 69 && LA102_0 <= 70)||LA102_0==72||LA102_0==102) ) {
			alt102=1;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 102, 0, input);
			throw nvae;
		}

		switch (alt102) {
			case 1 :
				// Pddl.g:445:9: ( binaryOp fExpDA fExpDA )
				{
				// Pddl.g:445:9: ( binaryOp fExpDA fExpDA )
				// Pddl.g:445:10: binaryOp fExpDA fExpDA
				{
				pushFollow(FOLLOW_binaryOp_in_synpred108_Pddl2850);
				binaryOp();
				state._fsp--;
				if (state.failed) return;

				pushFollow(FOLLOW_fExpDA_in_synpred108_Pddl2852);
				fExpDA();
				state._fsp--;
				if (state.failed) return;

				pushFollow(FOLLOW_fExpDA_in_synpred108_Pddl2854);
				fExpDA();
				state._fsp--;
				if (state.failed) return;

				}

				}
				break;
			case 2 :
				// Pddl.g:445:36: ( '-' fExpDA )
				{
				// Pddl.g:445:36: ( '-' fExpDA )
				// Pddl.g:445:37: '-' fExpDA
				{
				match(input,71,FOLLOW_71_in_synpred108_Pddl2860); if (state.failed) return;

				pushFollow(FOLLOW_fExpDA_in_synpred108_Pddl2862);
				fExpDA();
				state._fsp--;
				if (state.failed) return;

				}

				}
				break;

		}

		match(input,68,FOLLOW_68_in_synpred108_Pddl2866); if (state.failed) return;

		}

	}
	// $ANTLR end synpred108_Pddl

	// $ANTLR start synpred115_Pddl
	public final void synpred115_Pddl_fragment() throws RecognitionException {
		// Pddl.g:483:4: ( '(' ':init' ( initEl )* ')' )
		// Pddl.g:483:4: '(' ':init' ( initEl )* ')'
		{
		match(input,67,FOLLOW_67_in_synpred115_Pddl3107); if (state.failed) return;

		match(input,87,FOLLOW_87_in_synpred115_Pddl3109); if (state.failed) return;

		// Pddl.g:483:16: ( initEl )*
		loop103:
		while (true) {
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==67) ) {
				alt103=1;
			}

			switch (alt103) {
			case 1 :
				// Pddl.g:483:16: initEl
				{
				pushFollow(FOLLOW_initEl_in_synpred115_Pddl3111);
				initEl();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				break loop103;
			}
		}

		match(input,68,FOLLOW_68_in_synpred115_Pddl3114); if (state.failed) return;

		}

	}
	// $ANTLR end synpred115_Pddl

	// $ANTLR start synpred126_Pddl
	public final void synpred126_Pddl_fragment() throws RecognitionException {
		// Pddl.g:518:4: ( '(' 'and' ( prefConGD )* ')' )
		// Pddl.g:518:4: '(' 'and' ( prefConGD )* ')'
		{
		match(input,67,FOLLOW_67_in_synpred126_Pddl3403); if (state.failed) return;

		match(input,106,FOLLOW_106_in_synpred126_Pddl3405); if (state.failed) return;

		// Pddl.g:518:14: ( prefConGD )*
		loop105:
		while (true) {
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==67) ) {
				alt105=1;
			}

			switch (alt105) {
			case 1 :
				// Pddl.g:518:14: prefConGD
				{
				pushFollow(FOLLOW_prefConGD_in_synpred126_Pddl3407);
				prefConGD();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				break loop105;
			}
		}

		match(input,68,FOLLOW_68_in_synpred126_Pddl3410); if (state.failed) return;

		}

	}
	// $ANTLR end synpred126_Pddl

	// $ANTLR start synpred127_Pddl
	public final void synpred127_Pddl_fragment() throws RecognitionException {
		// Pddl.g:519:4: ( '(' 'forall' '(' typedVariableList ')' prefConGD ')' )
		// Pddl.g:519:4: '(' 'forall' '(' typedVariableList ')' prefConGD ')'
		{
		match(input,67,FOLLOW_67_in_synpred127_Pddl3415); if (state.failed) return;

		match(input,117,FOLLOW_117_in_synpred127_Pddl3417); if (state.failed) return;

		match(input,67,FOLLOW_67_in_synpred127_Pddl3419); if (state.failed) return;

		pushFollow(FOLLOW_typedVariableList_in_synpred127_Pddl3421);
		typedVariableList();
		state._fsp--;
		if (state.failed) return;

		match(input,68,FOLLOW_68_in_synpred127_Pddl3423); if (state.failed) return;

		pushFollow(FOLLOW_prefConGD_in_synpred127_Pddl3425);
		prefConGD();
		state._fsp--;
		if (state.failed) return;

		match(input,68,FOLLOW_68_in_synpred127_Pddl3427); if (state.failed) return;

		}

	}
	// $ANTLR end synpred127_Pddl

	// $ANTLR start synpred129_Pddl
	public final void synpred129_Pddl_fragment() throws RecognitionException {
		// Pddl.g:520:4: ( '(' 'preference' ( NAME )? conGD ')' )
		// Pddl.g:520:4: '(' 'preference' ( NAME )? conGD ')'
		{
		match(input,67,FOLLOW_67_in_synpred129_Pddl3432); if (state.failed) return;

		match(input,130,FOLLOW_130_in_synpred129_Pddl3434); if (state.failed) return;

		// Pddl.g:520:21: ( NAME )?
		int alt106=2;
		int LA106_0 = input.LA(1);
		if ( (LA106_0==NAME) ) {
			alt106=1;
		}
		switch (alt106) {
			case 1 :
				// Pddl.g:520:21: NAME
				{
				match(input,NAME,FOLLOW_NAME_in_synpred129_Pddl3436); if (state.failed) return;

				}
				break;

		}

		pushFollow(FOLLOW_conGD_in_synpred129_Pddl3439);
		conGD();
		state._fsp--;
		if (state.failed) return;

		match(input,68,FOLLOW_68_in_synpred129_Pddl3441); if (state.failed) return;

		}

	}
	// $ANTLR end synpred129_Pddl

	// $ANTLR start synpred131_Pddl
	public final void synpred131_Pddl_fragment() throws RecognitionException {
		// Pddl.g:532:4: ( '(' binaryOp metricFExp metricFExp ')' )
		// Pddl.g:532:4: '(' binaryOp metricFExp metricFExp ')'
		{
		match(input,67,FOLLOW_67_in_synpred131_Pddl3502); if (state.failed) return;

		pushFollow(FOLLOW_binaryOp_in_synpred131_Pddl3504);
		binaryOp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_metricFExp_in_synpred131_Pddl3506);
		metricFExp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_metricFExp_in_synpred131_Pddl3508);
		metricFExp();
		state._fsp--;
		if (state.failed) return;

		match(input,68,FOLLOW_68_in_synpred131_Pddl3510); if (state.failed) return;

		}

	}
	// $ANTLR end synpred131_Pddl

	// $ANTLR start synpred133_Pddl
	public final void synpred133_Pddl_fragment() throws RecognitionException {
		// Pddl.g:534:4: ( '(' multiOp metricFExp ( metricFExp )+ ')' )
		// Pddl.g:534:4: '(' multiOp metricFExp ( metricFExp )+ ')'
		{
		match(input,67,FOLLOW_67_in_synpred133_Pddl3532); if (state.failed) return;

		pushFollow(FOLLOW_multiOp_in_synpred133_Pddl3534);
		multiOp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_metricFExp_in_synpred133_Pddl3536);
		metricFExp();
		state._fsp--;
		if (state.failed) return;

		// Pddl.g:534:27: ( metricFExp )+
		int cnt107=0;
		loop107:
		while (true) {
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==NAME||LA107_0==NUMBER||(LA107_0 >= 66 && LA107_0 <= 67)) ) {
				alt107=1;
			}

			switch (alt107) {
			case 1 :
				// Pddl.g:534:27: metricFExp
				{
				pushFollow(FOLLOW_metricFExp_in_synpred133_Pddl3538);
				metricFExp();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				if ( cnt107 >= 1 ) break loop107;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(107, input);
				throw eee;
			}
			cnt107++;
		}

		match(input,68,FOLLOW_68_in_synpred133_Pddl3541); if (state.failed) return;

		}

	}
	// $ANTLR end synpred133_Pddl

	// $ANTLR start synpred134_Pddl
	public final void synpred134_Pddl_fragment() throws RecognitionException {
		// Pddl.g:536:4: ( '(' '-' metricFExp ')' )
		// Pddl.g:536:4: '(' '-' metricFExp ')'
		{
		match(input,67,FOLLOW_67_in_synpred134_Pddl3565); if (state.failed) return;

		match(input,71,FOLLOW_71_in_synpred134_Pddl3567); if (state.failed) return;

		pushFollow(FOLLOW_metricFExp_in_synpred134_Pddl3569);
		metricFExp();
		state._fsp--;
		if (state.failed) return;

		match(input,68,FOLLOW_68_in_synpred134_Pddl3571); if (state.failed) return;

		}

	}
	// $ANTLR end synpred134_Pddl

	// $ANTLR start synpred136_Pddl
	public final void synpred136_Pddl_fragment() throws RecognitionException {
		// Pddl.g:539:4: ( fHead )
		// Pddl.g:539:4: fHead
		{
		pushFollow(FOLLOW_fHead_in_synpred136_Pddl3593);
		fHead();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred136_Pddl

	// Delegated rules

	public final boolean synpred108_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred108_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred129_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred129_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred66_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred66_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred126_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred126_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred105_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred105_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred136_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred136_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred133_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred133_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred50_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred50_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred101_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred101_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred106_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred106_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred68_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred68_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred127_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred127_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred103_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred103_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred99_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred99_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred104_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred104_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred134_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred134_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred67_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred67_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred131_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred131_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred53_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred53_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred107_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred107_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred115_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred115_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred69_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred69_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred102_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred102_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA14 dfa14 = new DFA14(this);
	protected DFA12 dfa12 = new DFA12(this);
	protected DFA25 dfa25 = new DFA25(this);
	protected DFA23 dfa23 = new DFA23(this);
	protected DFA71 dfa71 = new DFA71(this);
	static final String DFA14_eotS =
		"\4\uffff";
	static final String DFA14_eofS =
		"\4\uffff";
	static final String DFA14_minS =
		"\2\47\2\uffff";
	static final String DFA14_maxS =
		"\1\104\1\107\2\uffff";
	static final String DFA14_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA14_specialS =
		"\4\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\1\34\uffff\1\2",
			"\1\1\34\uffff\1\2\2\uffff\1\3",
			"",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "144:7: ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* )";
		}
	}

	static final String DFA12_eotS =
		"\4\uffff";
	static final String DFA12_eofS =
		"\4\uffff";
	static final String DFA12_minS =
		"\2\47\2\uffff";
	static final String DFA12_maxS =
		"\1\104\1\107\2\uffff";
	static final String DFA12_acceptS =
		"\2\uffff\1\2\1\1";
	static final String DFA12_specialS =
		"\4\uffff}>";
	static final String[] DFA12_transitionS = {
			"\1\1\34\uffff\1\2",
			"\1\1\34\uffff\1\2\2\uffff\1\3",
			"",
			""
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 144:16: ( singleTypeNameList )+";
		}
	}

	static final String DFA25_eotS =
		"\4\uffff";
	static final String DFA25_eofS =
		"\2\2\2\uffff";
	static final String DFA25_minS =
		"\2\77\2\uffff";
	static final String DFA25_maxS =
		"\1\104\1\107\2\uffff";
	static final String DFA25_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA25_specialS =
		"\4\uffff}>";
	static final String[] DFA25_transitionS = {
			"\1\1\3\uffff\2\2",
			"\1\1\3\uffff\2\2\2\uffff\1\3",
			"",
			""
	};

	static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
	static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
	static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
	static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
	static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
	static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
	static final short[][] DFA25_transition;

	static {
		int numStates = DFA25_transitionS.length;
		DFA25_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
		}
	}

	protected class DFA25 extends DFA {

		public DFA25(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 25;
			this.eot = DFA25_eot;
			this.eof = DFA25_eof;
			this.min = DFA25_min;
			this.max = DFA25_max;
			this.accept = DFA25_accept;
			this.special = DFA25_special;
			this.transition = DFA25_transition;
		}
		@Override
		public String getDescription() {
			return "195:7: ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* )";
		}
	}

	static final String DFA23_eotS =
		"\4\uffff";
	static final String DFA23_eofS =
		"\2\2\2\uffff";
	static final String DFA23_minS =
		"\2\77\2\uffff";
	static final String DFA23_maxS =
		"\1\104\1\107\2\uffff";
	static final String DFA23_acceptS =
		"\2\uffff\1\2\1\1";
	static final String DFA23_specialS =
		"\4\uffff}>";
	static final String[] DFA23_transitionS = {
			"\1\1\3\uffff\2\2",
			"\1\1\3\uffff\2\2\2\uffff\1\3",
			"",
			""
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 195:20: ( singleTypeVarList )+";
		}
	}

	static final String DFA71_eotS =
		"\57\uffff";
	static final String DFA71_eofS =
		"\57\uffff";
	static final String DFA71_minS =
		"\1\103\1\127\1\103\1\47\1\uffff\1\103\1\47\2\103\1\uffff\6\47\1\103\1"+
		"\47\1\103\1\47\1\103\2\47\1\104\1\47\1\0\1\103\1\47\2\0\1\47\1\104\2\47"+
		"\1\103\1\47\1\103\2\47\2\103\1\0\1\47\1\0\1\47\1\104\1\103";
	static final String DFA71_maxS =
		"\1\103\1\127\1\104\1\u008b\1\uffff\2\103\2\104\1\uffff\1\104\1\u0080\1"+
		"\u0086\2\103\1\47\1\104\1\u0080\7\104\1\0\1\103\1\104\2\0\3\104\1\103"+
		"\3\104\1\u0080\3\104\1\0\1\104\1\0\3\104";
	static final String DFA71_acceptS =
		"\4\uffff\1\1\4\uffff\1\2\45\uffff";
	static final String DFA71_specialS =
		"\31\uffff\1\0\2\uffff\1\1\1\2\13\uffff\1\3\1\uffff\1\4\3\uffff}>";
	static final String[] DFA71_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\1\4",
			"\1\12\70\uffff\2\11\1\6\2\11\5\uffff\1\11\1\uffff\1\4\7\uffff\2\11\2"+
			"\uffff\1\11\4\uffff\1\5\1\uffff\1\7\1\10\12\uffff\1\4",
			"",
			"\1\13",
			"\1\15\3\uffff\1\11\23\uffff\1\11\2\uffff\1\16\1\14",
			"\1\17\1\20",
			"\1\21\1\22",
			"",
			"\1\23\27\uffff\1\11\4\uffff\1\24",
			"\1\25\70\uffff\5\11\5\uffff\1\11\11\uffff\2\11\2\uffff\1\11\4\uffff"+
			"\1\11\1\uffff\2\11",
			"\1\26\32\uffff\1\26\2\uffff\4\11\35\uffff\1\11\7\uffff\1\11\27\uffff"+
			"\1\11",
			"\1\11\3\uffff\1\27\23\uffff\1\11\2\uffff\2\11",
			"\1\11\3\uffff\1\27\26\uffff\2\11",
			"\1\30",
			"\1\4\1\31",
			"\1\33\70\uffff\5\11\5\uffff\1\11\11\uffff\2\11\2\uffff\1\11\4\uffff"+
			"\1\32\1\uffff\2\11",
			"\1\4\1\34",
			"\1\23\27\uffff\1\11\4\uffff\1\24",
			"\1\4\1\35",
			"\1\36\27\uffff\1\11\4\uffff\1\37",
			"\1\40\27\uffff\1\40\4\uffff\1\41",
			"\1\42",
			"\1\43\34\uffff\1\44",
			"\1\uffff",
			"\1\45",
			"\1\46\27\uffff\1\11\4\uffff\1\47",
			"\1\uffff",
			"\1\uffff",
			"\1\36\27\uffff\1\11\4\uffff\1\37",
			"\1\50",
			"\1\40\27\uffff\1\40\4\uffff\1\41",
			"\1\11\3\uffff\1\27\26\uffff\2\11",
			"\1\4\1\51",
			"\1\43\34\uffff\1\44",
			"\1\17\1\20",
			"\1\52\70\uffff\5\11\5\uffff\1\11\11\uffff\2\11\2\uffff\1\11\4\uffff"+
			"\1\11\1\uffff\2\11",
			"\1\46\27\uffff\1\11\4\uffff\1\47",
			"\1\21\1\22",
			"\1\4\1\53",
			"\1\uffff",
			"\1\54\27\uffff\1\11\4\uffff\1\55",
			"\1\uffff",
			"\1\54\27\uffff\1\11\4\uffff\1\55",
			"\1\56",
			"\1\21\1\22"
	};

	static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
	static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
	static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
	static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
	static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
	static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
	static final short[][] DFA71_transition;

	static {
		int numStates = DFA71_transitionS.length;
		DFA71_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
		}
	}

	protected class DFA71 extends DFA {

		public DFA71(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 71;
			this.eot = DFA71_eot;
			this.eof = DFA71_eof;
			this.min = DFA71_min;
			this.max = DFA71_max;
			this.accept = DFA71_accept;
			this.special = DFA71_special;
			this.transition = DFA71_transition;
		}
		@Override
		public String getDescription() {
			return "482:1: init : ( '(' ':init' ( initEl )* ')' -> ^( INIT ( initEl )* ) | '(' ':init' goalDesc ')' -> ^( FORMULAINIT goalDesc ) );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA71_25 = input.LA(1);
						 
						int index71_25 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred115_Pddl()) ) {s = 4;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index71_25);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA71_28 = input.LA(1);
						 
						int index71_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred115_Pddl()) ) {s = 4;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index71_28);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA71_29 = input.LA(1);
						 
						int index71_29 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred115_Pddl()) ) {s = 4;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index71_29);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA71_41 = input.LA(1);
						 
						int index71_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred115_Pddl()) ) {s = 4;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index71_41);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA71_43 = input.LA(1);
						 
						int index71_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred115_Pddl()) ) {s = 4;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index71_43);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 71, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_domain_in_pddlDoc381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_problem_in_pddlDoc385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_domain400 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_domain402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_domainName_in_domain404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_requireDef_in_domain412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_typesDef_in_domain421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_constantsDef_in_domain430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_predicatesDef_in_domain439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_functionsDef_in_domain448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_free_functionsDef_in_domain457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_constraints_in_domain466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_structureDef_in_domain475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_domain484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_free_functionsDef568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_free_functionsDef570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_functionList_in_free_functionsDef572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_free_functionsDef574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_domainName597 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_domainName599 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_NAME_in_domainName601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_domainName603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_requireDef630 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_requireDef632 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_REQUIRE_KEY_in_requireDef634 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_requireDef637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_typesDef658 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_95_in_typesDef660 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedNameList_in_typesDef662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_typesDef664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_typedNameList691 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_singleTypeNameList_in_typedNameList696 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_NAME_in_typedNameList699 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_NAME_in_singleTypeNameList719 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_singleTypeNameList722 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_type_in_singleTypeNameList726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_type753 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_114_in_type755 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_primType_in_type757 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_type760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primType_in_type781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_primType791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_functionsDef801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_functionsDef803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_functionList_in_functionsDef805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_functionsDef807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicFunctionSkeleton_in_functionList828 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000088L});
	public static final BitSet FOLLOW_71_in_functionList832 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_functionType_in_functionList834 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_atomicFunctionSkeleton850 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionSymbol_in_atomicFunctionSkeleton853 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedVariableList_in_atomicFunctionSkeleton856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_atomicFunctionSkeleton858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_126_in_functionType881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_constantsDef892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_constantsDef894 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedNameList_in_constantsDef896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_constantsDef898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_predicatesDef918 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_predicatesDef920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_atomicFormulaSkeleton_in_predicatesDef922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_predicatesDef925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_atomicFormulaSkeleton946 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_predicate_in_atomicFormulaSkeleton949 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedVariableList_in_atomicFormulaSkeleton952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_atomicFormulaSkeleton954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_predicate965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_typedVariableList980 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_singleTypeVarList_in_typedVariableList985 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_typedVariableList988 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_singleTypeVarList1008 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_singleTypeVarList1011 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_type_in_singleTypeVarList1015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_constraints1046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_constraints1049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_conGD_in_constraints1052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_constraints1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actionDef_in_structureDef1066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_durativeActionDef_in_structureDef1071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derivedDef_in_structureDef1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constraintDef_in_structureDef1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_processDef_in_structureDef1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_eventDef_in_structureDef1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_actionDef1106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_actionDef1108 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_actionSymbol_in_actionDef1110 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_actionDef1119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_actionDef1122 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedVariableList_in_actionDef1124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_actionDef1126 = new BitSet(new long[]{0x0000000000000000L,0x0000000008040010L});
	public static final BitSet FOLLOW_actionDefBody_in_actionDef1139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_actionDef1141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_eventDef1174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_eventDef1176 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_actionSymbol_in_eventDef1178 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_eventDef1187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_eventDef1190 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedVariableList_in_eventDef1192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_eventDef1194 = new BitSet(new long[]{0x0000000000000000L,0x0000000008040010L});
	public static final BitSet FOLLOW_actionDefBody_in_eventDef1207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_eventDef1209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_processDef1242 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_93_in_processDef1244 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_actionSymbol_in_processDef1246 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_processDef1255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_processDef1258 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedVariableList_in_processDef1260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_processDef1262 = new BitSet(new long[]{0x0000000000000000L,0x0000000008040010L});
	public static final BitSet FOLLOW_actionDefBody_in_processDef1275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_processDef1277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_constraintDef1311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_constraintDef1313 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_constraintSymbol_in_constraintDef1315 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_constraintDef1324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_constraintDef1327 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedVariableList_in_constraintDef1329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_constraintDef1331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000410L});
	public static final BitSet FOLLOW_constraintDefBody_in_constraintDef1344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_constraintDef1346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_actionSymbol1380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_constraintSymbol1389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_actionDefBody1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_actionDefBody1408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_actionDefBody1410 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_goalDesc_in_actionDefBody1415 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_actionDefBody1425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_actionDefBody1429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_actionDefBody1431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_effect_in_actionDefBody1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_constraintDefBody1471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_constraintDefBody1475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_constraintDefBody1477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_goalDesc_in_constraintDefBody1482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicTermFormula_in_goalDesc1520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_goalDesc1525 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_goalDesc1527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_goalDesc_in_goalDesc1529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_goalDesc1532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_goalDesc1557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_128_in_goalDesc1559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_goalDesc_in_goalDesc1561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_goalDesc1564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_goalDesc1589 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_125_in_goalDesc1591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_goalDesc1593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_goalDesc1595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_goalDesc1619 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_127_in_goalDesc1621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_atomicNameFormula_in_goalDesc1624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_goalDesc1627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_goalDesc1642 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_120_in_goalDesc1644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_goalDesc1646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_goalDesc1648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_goalDesc1650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_goalDesc1676 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_116_in_goalDesc1678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_goalDesc1680 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedVariableList_in_goalDesc1682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_goalDesc1684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_goalDesc1686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_goalDesc1688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_goalDesc1714 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_117_in_goalDesc1716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_goalDesc1718 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedVariableList_in_goalDesc1720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_goalDesc1722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_goalDesc1724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_goalDesc1726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fComp_in_goalDesc1755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_equality_in_goalDesc1782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_equality1810 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_equality1813 = new BitSet(new long[]{0x8000008000000000L});
	public static final BitSet FOLLOW_term_in_equality1815 = new BitSet(new long[]{0x8000008000000000L});
	public static final BitSet FOLLOW_term_in_equality1817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_equality1819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_fComp1830 = new BitSet(new long[]{0x0000000000000000L,0x0000001F00000000L});
	public static final BitSet FOLLOW_binaryComp_in_fComp1833 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fExp_in_fComp1835 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fExp_in_fComp1837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_fComp1839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_atomicTermFormula1851 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_predicate_in_atomicTermFormula1853 = new BitSet(new long[]{0x8000008000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_term_in_atomicTermFormula1855 = new BitSet(new long[]{0x8000008000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_atomicTermFormula1858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_durativeActionDef1895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_durativeActionDef1897 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_actionSymbol_in_durativeActionDef1899 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_durativeActionDef1908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_durativeActionDef1911 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedVariableList_in_durativeActionDef1914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_durativeActionDef1918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050400L});
	public static final BitSet FOLLOW_daDefBody_in_durativeActionDef1931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_durativeActionDef1933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_daDefBody1966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_durationConstraint_in_daDefBody1968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_daDefBody1973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_daDefBody1977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_daDefBody1979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_daGD_in_daDefBody1984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_daDefBody1993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_daDefBody1997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_daDefBody1999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_daEffect_in_daDefBody2004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_prefTimedGD_in_daGD2019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_daGD2024 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_daGD2026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_daGD_in_daGD2028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_daGD2031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_daGD2036 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_117_in_daGD2038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_daGD2040 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedVariableList_in_daGD2042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_daGD2044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_daGD_in_daGD2046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_daGD2048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timedGD_in_prefTimedGD2059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_prefTimedGD2064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_prefTimedGD2066 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_NAME_in_prefTimedGD2068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_timedGD_in_prefTimedGD2071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_prefTimedGD2073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_timedGD2084 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_108_in_timedGD2086 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_timeSpecifier_in_timedGD2088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_timedGD2090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_timedGD2092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_timedGD2097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_129_in_timedGD2099 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_interval_in_timedGD2101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_timedGD2103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_timedGD2105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_103_in_interval2127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_derivedDef2140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_derivedDef2143 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_typedVariableList_in_derivedDef2146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_derivedDef2148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_derivedDef2150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_fExp2165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_fExp2170 = new BitSet(new long[]{0x0000000000000000L,0x00000040000001E0L});
	public static final BitSet FOLLOW_binaryOp_in_fExp2172 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fExp_in_fExp2174 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fExp2_in_fExp2176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_fExp2178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_fExp2195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_fExp2197 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fExp_in_fExp2199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_fExp2201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_fExp2217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_134_in_fExp2219 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fExp_in_fExp2221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_fExp2223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_fExp2239 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_110_in_fExp2241 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fExp_in_fExp2243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_fExp2245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fHead_in_fExp2258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fExp_in_fExp22270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_fHead2280 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_functionSymbol_in_fHead2282 = new BitSet(new long[]{0x8000008000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_term_in_fHead2284 = new BitSet(new long[]{0x8000008000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_fHead2287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionSymbol_in_fHead2303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_effect2322 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_effect2324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_cEffect_in_effect2326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_effect2329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cEffect_in_effect2343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_cEffect2354 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_117_in_cEffect2356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_cEffect2358 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedVariableList_in_cEffect2360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_cEffect2362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_effect_in_cEffect2364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_cEffect2366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_cEffect2384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_140_in_cEffect2386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_cEffect2388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_condEffect_in_cEffect2390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_cEffect2392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pEffect_in_cEffect2410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_pEffect2421 = new BitSet(new long[]{0x0000000000000000L,0x0200880000000000L,0x0000000000000030L});
	public static final BitSet FOLLOW_assignOp_in_pEffect2423 = new BitSet(new long[]{0x0000008000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fHead_in_pEffect2425 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fExp_in_pEffect2427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_pEffect2429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_pEffect2449 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_125_in_pEffect2451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_atomicTermFormula_in_pEffect2453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_pEffect2455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicTermFormula_in_pEffect2471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_condEffect2484 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_condEffect2486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_pEffect_in_condEffect2488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_condEffect2491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pEffect_in_condEffect2505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_durationConstraint2610 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_durationConstraint2612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_simpleDurationConstraint_in_durationConstraint2614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_durationConstraint2617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_durationConstraint2622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_durationConstraint2624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDurationConstraint_in_durationConstraint2629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_simpleDurationConstraint2640 = new BitSet(new long[]{0x0000000000000000L,0x0000001600000000L});
	public static final BitSet FOLLOW_durOp_in_simpleDurationConstraint2642 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_simpleDurationConstraint2644 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_durValue_in_simpleDurationConstraint2646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_simpleDurationConstraint2648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_simpleDurationConstraint2653 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_108_in_simpleDurationConstraint2655 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_timeSpecifier_in_simpleDurationConstraint2657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_simpleDurationConstraint_in_simpleDurationConstraint2659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_simpleDurationConstraint2661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_durValue2688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fExp_in_durValue2692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_daEffect2702 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_daEffect2704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_daEffect_in_daEffect2706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_daEffect2709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timedEffect_in_daEffect2714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_daEffect2719 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_117_in_daEffect2721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_daEffect2723 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedVariableList_in_daEffect2725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_daEffect2727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_daEffect_in_daEffect2729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_daEffect2731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_daEffect2736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_140_in_daEffect2738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_daGD_in_daEffect2740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_timedEffect_in_daEffect2742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_daEffect2744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_daEffect2749 = new BitSet(new long[]{0x0000000000000000L,0x0200880000000000L,0x0000000000000030L});
	public static final BitSet FOLLOW_assignOp_in_daEffect2751 = new BitSet(new long[]{0x0000008000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fHead_in_daEffect2753 = new BitSet(new long[]{0x0000088000000000L,0x000000200000000CL});
	public static final BitSet FOLLOW_fExpDA_in_daEffect2755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_daEffect2757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_timedEffect2768 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_108_in_timedEffect2770 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_timeSpecifier_in_timedEffect2772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_daEffect_in_timedEffect2774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_timedEffect2776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_timedEffect2786 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_108_in_timedEffect2788 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_timeSpecifier_in_timedEffect2790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_fAssignDA_in_timedEffect2792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_timedEffect2794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_timedEffect2799 = new BitSet(new long[]{0x0000000000000000L,0x0200880000000000L,0x0000000000000030L});
	public static final BitSet FOLLOW_assignOp_in_timedEffect2801 = new BitSet(new long[]{0x0000008000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fHead_in_timedEffect2803 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fExp_in_timedEffect2805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_timedEffect2807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_fAssignDA2827 = new BitSet(new long[]{0x0000000000000000L,0x0200880000000000L,0x0000000000000030L});
	public static final BitSet FOLLOW_assignOp_in_fAssignDA2829 = new BitSet(new long[]{0x0000008000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fHead_in_fAssignDA2831 = new BitSet(new long[]{0x0000088000000000L,0x000000200000000CL});
	public static final BitSet FOLLOW_fExpDA_in_fAssignDA2833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_fAssignDA2835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_fExpDA2846 = new BitSet(new long[]{0x0000000000000000L,0x00000040000001E0L});
	public static final BitSet FOLLOW_binaryOp_in_fExpDA2850 = new BitSet(new long[]{0x0000088000000000L,0x000000200000000CL});
	public static final BitSet FOLLOW_fExpDA_in_fExpDA2852 = new BitSet(new long[]{0x0000088000000000L,0x000000200000000CL});
	public static final BitSet FOLLOW_fExpDA_in_fExpDA2854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_71_in_fExpDA2860 = new BitSet(new long[]{0x0000088000000000L,0x000000200000000CL});
	public static final BitSet FOLLOW_fExpDA_in_fExpDA2862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_fExpDA2866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_fExpDA2871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fExp_in_fExpDA2876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_problem2890 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_problem2892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_problemDecl_in_problem2894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_problemDomain_in_problem2899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_requireDef_in_problem2907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_objectDecl_in_problem2916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_init_in_problem2925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goal_in_problem2933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_probConstraints_in_problem2941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_metricSpec_in_problem2950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_problem2966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_problemDecl3023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_131_in_problemDecl3025 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_NAME_in_problemDecl3027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_problemDecl3029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_problemDomain3055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_problemDomain3057 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_NAME_in_problemDomain3059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_problemDomain3061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_objectDecl3081 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_objectDecl3083 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedNameList_in_objectDecl3085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_objectDecl3087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_init3107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_init3109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_initEl_in_init3111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_init3114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_init3129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_init3131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_init3133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_init3135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nameLiteral_in_initEl3154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_initEl3159 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_initEl3161 = new BitSet(new long[]{0x0000008000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fHead_in_initEl3163 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_NUMBER_in_initEl3165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_initEl3167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_initEl3190 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_108_in_initEl3192 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_NUMBER_in_initEl3194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_nameLiteral_in_initEl3196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_initEl3198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_initEl3214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_139_in_initEl3216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_atomicNameFormula_in_initEl3219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_initEl3221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_initEl3235 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_127_in_initEl3237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_atomicNameFormula_in_initEl3240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_initEl3243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_initEl3258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_128_in_initEl3260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_nameLiteral_in_initEl3263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_initEl3266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicNameFormula_in_nameLiteral3287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_nameLiteral3292 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_125_in_nameLiteral3294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_atomicNameFormula_in_nameLiteral3296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_nameLiteral3298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_atomicNameFormula3317 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_predicate_in_atomicNameFormula3319 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_NAME_in_atomicNameFormula3321 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_atomicNameFormula3324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_goal3349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_goal3351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_goal3353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_goal3356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_probConstraints3374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_probConstraints3376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_prefConGD_in_probConstraints3379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_probConstraints3381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_prefConGD3403 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_prefConGD3405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_prefConGD_in_prefConGD3407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_prefConGD3410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_prefConGD3415 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_117_in_prefConGD3417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_prefConGD3419 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedVariableList_in_prefConGD3421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_prefConGD3423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_prefConGD_in_prefConGD3425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_prefConGD3427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_prefConGD3432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_prefConGD3434 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_NAME_in_prefConGD3436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_conGD_in_prefConGD3439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_prefConGD3441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conGD_in_prefConGD3446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_metricSpec3457 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_metricSpec3459 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L});
	public static final BitSet FOLLOW_optimization_in_metricSpec3461 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_metricFExp_in_metricSpec3463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_metricSpec3465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_metricFExp3502 = new BitSet(new long[]{0x0000000000000000L,0x00000040000001E0L});
	public static final BitSet FOLLOW_binaryOp_in_metricFExp3504 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_metricFExp_in_metricFExp3506 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_metricFExp_in_metricFExp3508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_metricFExp3510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_metricFExp3532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
	public static final BitSet FOLLOW_multiOp_in_metricFExp3534 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_metricFExp_in_metricFExp3536 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_metricFExp_in_metricFExp3538 = new BitSet(new long[]{0x0000088000000000L,0x000000000000001CL});
	public static final BitSet FOLLOW_68_in_metricFExp3541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_metricFExp3565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_metricFExp3567 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_metricFExp_in_metricFExp3569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_metricFExp3571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_metricFExp3588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fHead_in_metricFExp3593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_metricFExp3608 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_122_in_metricFExp3610 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_NAME_in_metricFExp3612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_metricFExp3614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_conGD3628 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_conGD3630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_conGD_in_conGD3632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_conGD3635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_conGD3640 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_117_in_conGD3642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_conGD3644 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedVariableList_in_conGD3646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_conGD3648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_conGD_in_conGD3650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_conGD3652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_conGD3657 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_108_in_conGD3659 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_conGD3661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_conGD3665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_conGD3691 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_104_in_conGD3693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_conGD3697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_conGD3702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_135_in_conGD3704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_conGD3708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_conGD3714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_141_in_conGD3716 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_NUMBER_in_conGD3718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_conGD3722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_conGD3727 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_109_in_conGD3729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_conGD3733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_conGD3738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_136_in_conGD3740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_conGD3746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_conGD3751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_137_in_conGD3753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_conGD3759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_conGD3764 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_conGD3766 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_NUMBER_in_conGD3768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_conGD3774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_conGD3779 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_119_in_conGD3781 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_NUMBER_in_conGD3783 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_NUMBER_in_conGD3785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_conGD3789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_conGD3794 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_118_in_conGD3796 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_NUMBER_in_conGD3798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_goalDesc_in_conGD3800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_conGD3802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicFunctionSkeleton_in_synpred18_Pddl828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fComp_in_synpred50_Pddl1755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typedVariableList_in_synpred53_Pddl1914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred66_Pddl2170 = new BitSet(new long[]{0x0000000000000000L,0x00000040000001E0L});
	public static final BitSet FOLLOW_binaryOp_in_synpred66_Pddl2172 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fExp_in_synpred66_Pddl2174 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fExp2_in_synpred66_Pddl2176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_synpred66_Pddl2178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred67_Pddl2195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_synpred67_Pddl2197 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fExp_in_synpred67_Pddl2199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_synpred67_Pddl2201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred68_Pddl2217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_134_in_synpred68_Pddl2219 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fExp_in_synpred68_Pddl2221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_synpred68_Pddl2223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred69_Pddl2239 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_110_in_synpred69_Pddl2241 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_fExp_in_synpred69_Pddl2243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_synpred69_Pddl2245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_synpred99_Pddl2688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred101_Pddl2702 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_synpred101_Pddl2704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_daEffect_in_synpred101_Pddl2706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_synpred101_Pddl2709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timedEffect_in_synpred102_Pddl2714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred103_Pddl2719 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_117_in_synpred103_Pddl2721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_synpred103_Pddl2723 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedVariableList_in_synpred103_Pddl2725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_synpred103_Pddl2727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_daEffect_in_synpred103_Pddl2729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_synpred103_Pddl2731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred104_Pddl2736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_140_in_synpred104_Pddl2738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_daGD_in_synpred104_Pddl2740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_timedEffect_in_synpred104_Pddl2742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_synpred104_Pddl2744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred105_Pddl2768 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_108_in_synpred105_Pddl2770 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_timeSpecifier_in_synpred105_Pddl2772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_daEffect_in_synpred105_Pddl2774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_synpred105_Pddl2776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred106_Pddl2786 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_108_in_synpred106_Pddl2788 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_timeSpecifier_in_synpred106_Pddl2790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_fAssignDA_in_synpred106_Pddl2792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_synpred106_Pddl2794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binaryOp_in_synpred107_Pddl2850 = new BitSet(new long[]{0x0000088000000000L,0x000000200000000CL});
	public static final BitSet FOLLOW_fExpDA_in_synpred107_Pddl2852 = new BitSet(new long[]{0x0000088000000000L,0x000000200000000CL});
	public static final BitSet FOLLOW_fExpDA_in_synpred107_Pddl2854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred108_Pddl2846 = new BitSet(new long[]{0x0000000000000000L,0x00000040000001E0L});
	public static final BitSet FOLLOW_binaryOp_in_synpred108_Pddl2850 = new BitSet(new long[]{0x0000088000000000L,0x000000200000000CL});
	public static final BitSet FOLLOW_fExpDA_in_synpred108_Pddl2852 = new BitSet(new long[]{0x0000088000000000L,0x000000200000000CL});
	public static final BitSet FOLLOW_fExpDA_in_synpred108_Pddl2854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_71_in_synpred108_Pddl2860 = new BitSet(new long[]{0x0000088000000000L,0x000000200000000CL});
	public static final BitSet FOLLOW_fExpDA_in_synpred108_Pddl2862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_synpred108_Pddl2866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred115_Pddl3107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_synpred115_Pddl3109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_initEl_in_synpred115_Pddl3111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_synpred115_Pddl3114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred126_Pddl3403 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_synpred126_Pddl3405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_prefConGD_in_synpred126_Pddl3407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_68_in_synpred126_Pddl3410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred127_Pddl3415 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_117_in_synpred127_Pddl3417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_synpred127_Pddl3419 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_typedVariableList_in_synpred127_Pddl3421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_synpred127_Pddl3423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_prefConGD_in_synpred127_Pddl3425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_synpred127_Pddl3427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred129_Pddl3432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_synpred129_Pddl3434 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_NAME_in_synpred129_Pddl3436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_conGD_in_synpred129_Pddl3439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_synpred129_Pddl3441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred131_Pddl3502 = new BitSet(new long[]{0x0000000000000000L,0x00000040000001E0L});
	public static final BitSet FOLLOW_binaryOp_in_synpred131_Pddl3504 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_metricFExp_in_synpred131_Pddl3506 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_metricFExp_in_synpred131_Pddl3508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_synpred131_Pddl3510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred133_Pddl3532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
	public static final BitSet FOLLOW_multiOp_in_synpred133_Pddl3534 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_metricFExp_in_synpred133_Pddl3536 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_metricFExp_in_synpred133_Pddl3538 = new BitSet(new long[]{0x0000088000000000L,0x000000000000001CL});
	public static final BitSet FOLLOW_68_in_synpred133_Pddl3541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred134_Pddl3565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_synpred134_Pddl3567 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_metricFExp_in_synpred134_Pddl3569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_synpred134_Pddl3571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fHead_in_synpred136_Pddl3593 = new BitSet(new long[]{0x0000000000000002L});
}
