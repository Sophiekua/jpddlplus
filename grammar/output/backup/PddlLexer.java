// $ANTLR 3.4 /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g 2012-04-15 17:25:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class PddlLexer extends Lexer {

    public static final int EOF = -1;
    public static final int T__56 = 56;
    public static final int T__57 = 57;
    public static final int T__58 = 58;
    public static final int T__59 = 59;
    public static final int T__60 = 60;
    public static final int T__61 = 61;
    public static final int T__62 = 62;
    public static final int T__63 = 63;
    public static final int T__64 = 64;
    public static final int T__65 = 65;
    public static final int T__66 = 66;
    public static final int T__67 = 67;
    public static final int T__68 = 68;
    public static final int T__69 = 69;
    public static final int T__70 = 70;
    public static final int T__71 = 71;
    public static final int T__72 = 72;
    public static final int T__73 = 73;
    public static final int T__74 = 74;
    public static final int T__75 = 75;
    public static final int T__76 = 76;
    public static final int T__77 = 77;
    public static final int T__78 = 78;
    public static final int T__79 = 79;
    public static final int T__80 = 80;
    public static final int T__81 = 81;
    public static final int T__82 = 82;
    public static final int T__83 = 83;
    public static final int T__84 = 84;
    public static final int T__85 = 85;
    public static final int T__86 = 86;
    public static final int T__87 = 87;
    public static final int T__88 = 88;
    public static final int T__89 = 89;
    public static final int T__90 = 90;
    public static final int T__91 = 91;
    public static final int T__92 = 92;
    public static final int T__93 = 93;
    public static final int T__94 = 94;
    public static final int T__95 = 95;
    public static final int T__96 = 96;
    public static final int T__97 = 97;
    public static final int T__98 = 98;
    public static final int T__99 = 99;
    public static final int T__100 = 100;
    public static final int T__101 = 101;
    public static final int T__102 = 102;
    public static final int T__103 = 103;
    public static final int T__104 = 104;
    public static final int T__105 = 105;
    public static final int T__106 = 106;
    public static final int T__107 = 107;
    public static final int T__108 = 108;
    public static final int T__109 = 109;
    public static final int T__110 = 110;
    public static final int T__111 = 111;
    public static final int T__112 = 112;
    public static final int T__113 = 113;
    public static final int T__114 = 114;
    public static final int T__115 = 115;
    public static final int T__116 = 116;
    public static final int T__117 = 117;
    public static final int T__118 = 118;
    public static final int T__119 = 119;
    public static final int T__120 = 120;
    public static final int T__121 = 121;
    public static final int T__122 = 122;
    public static final int ACTION = 4;
    public static final int AND_EFFECT = 5;
    public static final int AND_GD = 6;
    public static final int ANY_CHAR = 7;
    public static final int ASSIGN_EFFECT = 8;
    public static final int BINARY_OP = 9;
    public static final int BINARY_OP2 = 10;
    public static final int COMPARISON_GD = 11;
    public static final int CONSTANTS = 12;
    public static final int DIGIT = 13;
    public static final int DOMAIN = 14;
    public static final int DOMAIN_NAME = 15;
    public static final int DURATIVE_ACTION = 16;
    public static final int EFFECT = 17;
    public static final int EITHER_TYPE = 18;
    public static final int EXISTS_GD = 19;
    public static final int FORALL_EFFECT = 20;
    public static final int FORALL_GD = 21;
    public static final int FUNCTIONS = 22;
    public static final int FUNC_HEAD = 23;
    public static final int GOAL = 24;
    public static final int IMPLY_GD = 25;
    public static final int INIT = 26;
    public static final int INIT_AT = 27;
    public static final int INIT_EQ = 28;
    public static final int LETTER = 29;
    public static final int LINE_COMMENT = 30;
    public static final int MINUS_OP = 31;
    public static final int MULTI_OP = 32;
    public static final int NAME = 33;
    public static final int NOT_EFFECT = 34;
    public static final int NOT_GD = 35;
    public static final int NOT_PRED_INIT = 36;
    public static final int NUMBER = 37;
    public static final int OBJECTS = 38;
    public static final int OR_GD = 39;
    public static final int PRECONDITION = 40;
    public static final int PREDICATES = 41;
    public static final int PRED_HEAD = 42;
    public static final int PRED_INST = 43;
    public static final int PROBLEM = 44;
    public static final int PROBLEM_CONSTRAINT = 45;
    public static final int PROBLEM_DOMAIN = 46;
    public static final int PROBLEM_METRIC = 47;
    public static final int PROBLEM_NAME = 48;
    public static final int REQUIREMENTS = 49;
    public static final int REQUIRE_KEY = 50;
    public static final int TYPES = 51;
    public static final int UNARY_MINUS = 52;
    public static final int VARIABLE = 53;
    public static final int WHEN_EFFECT = 54;
    public static final int WHITESPACE = 55;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[]{};
    }

    public PddlLexer() {
    }

    public PddlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }

    public PddlLexer(CharStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String getGrammarFileName() {
        return "/home/enrico/Scrivania/HEPlanner/grammar/Pddl.g";
    }

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:2:7: ( '(' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:2:9: '('
            {
                match('(');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:3:7: ( ')' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:3:9: ')'
            {
                match(')');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:4:7: ( '*' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:4:9: '*'
            {
                match('*');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:5:7: ( '+' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:5:9: '+'
            {
                match('+');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:6:7: ( '-' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:6:9: '-'
            {
                match('-');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:7:7: ( '/' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:7:9: '/'
            {
                match('/');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:8:7: ( ':action' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:8:9: ':action'
            {
                match(":action");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:9:7: ( ':condition' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:9:9: ':condition'
            {
                match(":condition");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:10:7: ( ':constants' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:10:9: ':constants'
            {
                match(":constants");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:11:7: ( ':constraints' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:11:9: ':constraints'
            {
                match(":constraints");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:12:7: ( ':derived' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:12:9: ':derived'
            {
                match(":derived");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:13:7: ( ':domain' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:13:9: ':domain'
            {
                match(":domain");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:14:7: ( ':duration' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:14:9: ':duration'
            {
                match(":duration");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:15:7: ( ':durative-action' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:15:9: ':durative-action'
            {
                match(":durative-action");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:16:7: ( ':effect' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:16:9: ':effect'
            {
                match(":effect");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:17:7: ( ':functions' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:17:9: ':functions'
            {
                match(":functions");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:18:7: ( ':goal' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:18:9: ':goal'
            {
                match(":goal");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:19:7: ( ':init' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:19:9: ':init'
            {
                match(":init");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:20:7: ( ':metric' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:20:9: ':metric'
            {
                match(":metric");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:21:7: ( ':objects' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:21:9: ':objects'
            {
                match(":objects");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:22:7: ( ':parameters' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:22:9: ':parameters'
            {
                match(":parameters");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:23:7: ( ':precondition' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:23:9: ':precondition'
            {
                match(":precondition");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:24:7: ( ':predicates' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:24:9: ':predicates'
            {
                match(":predicates");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:25:7: ( ':requirements' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:25:9: ':requirements'
            {
                match(":requirements");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:26:7: ( ':types' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:26:9: ':types'
            {
                match(":types");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:27:7: ( '<' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:27:9: '<'
            {
                match('<');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:28:7: ( '<=' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:28:9: '<='
            {
                match("<=");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:29:7: ( '=' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:29:9: '='
            {
                match('=');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:30:7: ( '>' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:30:9: '>'
            {
                match('>');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:31:7: ( '>=' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:31:9: '>='
            {
                match(">=");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:32:7: ( '?duration' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:32:9: '?duration'
            {
                match("?duration");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:33:7: ( 'all' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:33:9: 'all'
            {
                match("all");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:34:7: ( 'always' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:34:9: 'always'
            {
                match("always");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:35:7: ( 'always-within' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:35:9: 'always-within'
            {
                match("always-within");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:36:7: ( 'and' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:36:9: 'and'
            {
                match("and");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:37:7: ( 'assign' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:37:9: 'assign'
            {
                match("assign");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:38:7: ( 'at' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:38:9: 'at'
            {
                match("at");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:39:7: ( 'at-most-once' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:39:9: 'at-most-once'
            {
                match("at-most-once");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:40:7: ( 'decrease' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:40:9: 'decrease'
            {
                match("decrease");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:41:7: ( 'define' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:41:9: 'define'
            {
                match("define");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:42:7: ( 'domain' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:42:9: 'domain'
            {
                match("domain");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:43:7: ( 'either' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:43:9: 'either'
            {
                match("either");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:44:7: ( 'end' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:44:9: 'end'
            {
                match("end");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:45:7: ( 'exists' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:45:9: 'exists'
            {
                match("exists");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:46:8: ( 'forall' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:46:10: 'forall'
            {
                match("forall");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:47:8: ( 'hold-after' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:47:10: 'hold-after'
            {
                match("hold-after");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:48:8: ( 'hold-during' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:48:10: 'hold-during'
            {
                match("hold-during");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:49:8: ( 'imply' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:49:10: 'imply'
            {
                match("imply");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:50:8: ( 'increase' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:50:10: 'increase'
            {
                match("increase");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:51:8: ( 'is-violated' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:51:10: 'is-violated'
            {
                match("is-violated");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:52:8: ( 'maximize' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:52:10: 'maximize'
            {
                match("maximize");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:53:8: ( 'minimize' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:53:10: 'minimize'
            {
                match("minimize");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:54:8: ( 'not' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:54:10: 'not'
            {
                match("not");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:55:8: ( 'number' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:55:10: 'number'
            {
                match("number");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:56:8: ( 'or' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:56:10: 'or'
            {
                match("or");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:57:8: ( 'over' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:57:10: 'over'
            {
                match("over");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:58:8: ( 'preference' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:58:10: 'preference'
            {
                match("preference");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:59:8: ( 'problem' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:59:10: 'problem'
            {
                match("problem");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:60:8: ( 'scale-down' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:60:10: 'scale-down'
            {
                match("scale-down");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:61:8: ( 'scale-up' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:61:10: 'scale-up'
            {
                match("scale-up");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:62:8: ( 'sometime' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:62:10: 'sometime'
            {
                match("sometime");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:63:8: ( 'sometime-after' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:63:10: 'sometime-after'
            {
                match("sometime-after");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:64:8: ( 'sometime-before' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:64:10: 'sometime-before'
            {
                match("sometime-before");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:65:8: ( 'start' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:65:10: 'start'
            {
                match("start");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:66:8: ( 'total-time' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:66:10: 'total-time'
            {
                match("total-time");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:67:8: ( 'when' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:67:10: 'when'
            {
                match("when");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:68:8: ( 'within' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:68:10: 'within'
            {
                match("within");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "REQUIRE_KEY"
    public final void mREQUIRE_KEY() throws RecognitionException {
        try {
            int _type = REQUIRE_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:508:5: ( ':strips' | ':typing' | ':negative-preconditions' | ':disjunctive-preconditions' | ':equality' | ':existential-preconditions' | ':universal-preconditions' | ':quantified-preconditions' | ':conditional-effects' | ':fluents' | ':adl' | ':durative-actions' | ':derived-predicates' | ':timed-initial-literals' | ':preferences' | ':constraints' )
            int alt1 = 16;
            int LA1_0 = input.LA(1);

            if ((LA1_0 == ':')) {
                switch (input.LA(2)) {
                    case 's': {
                        alt1 = 1;
                    }
                    break;
                    case 't': {
                        int LA1_3 = input.LA(3);

                        if ((LA1_3 == 'y')) {
                            alt1 = 2;
                        } else if ((LA1_3 == 'i')) {
                            alt1 = 14;
                        } else {
                            NoViableAltException nvae
                                    = new NoViableAltException("", 1, 3, input);

                            throw nvae;

                        }
                    }
                    break;
                    case 'n': {
                        alt1 = 3;
                    }
                    break;
                    case 'd': {
                        switch (input.LA(3)) {
                            case 'i': {
                                alt1 = 4;
                            }
                            break;
                            case 'u': {
                                alt1 = 12;
                            }
                            break;
                            case 'e': {
                                alt1 = 13;
                            }
                            break;
                            default:
                                NoViableAltException nvae
                                        = new NoViableAltException("", 1, 5, input);

                                throw nvae;

                        }

                    }
                    break;
                    case 'e': {
                        int LA1_6 = input.LA(3);

                        if ((LA1_6 == 'q')) {
                            alt1 = 5;
                        } else if ((LA1_6 == 'x')) {
                            alt1 = 6;
                        } else {
                            NoViableAltException nvae
                                    = new NoViableAltException("", 1, 6, input);

                            throw nvae;

                        }
                    }
                    break;
                    case 'u': {
                        alt1 = 7;
                    }
                    break;
                    case 'q': {
                        alt1 = 8;
                    }
                    break;
                    case 'c': {
                        int LA1_9 = input.LA(3);

                        if ((LA1_9 == 'o')) {
                            int LA1_20 = input.LA(4);

                            if ((LA1_20 == 'n')) {
                                int LA1_21 = input.LA(5);

                                if ((LA1_21 == 'd')) {
                                    alt1 = 9;
                                } else if ((LA1_21 == 's')) {
                                    alt1 = 16;
                                } else {
                                    NoViableAltException nvae
                                            = new NoViableAltException("", 1, 21, input);

                                    throw nvae;

                                }
                            } else {
                                NoViableAltException nvae
                                        = new NoViableAltException("", 1, 20, input);

                                throw nvae;

                            }
                        } else {
                            NoViableAltException nvae
                                    = new NoViableAltException("", 1, 9, input);

                            throw nvae;

                        }
                    }
                    break;
                    case 'f': {
                        alt1 = 10;
                    }
                    break;
                    case 'a': {
                        alt1 = 11;
                    }
                    break;
                    case 'p': {
                        alt1 = 15;
                    }
                    break;
                    default:
                        NoViableAltException nvae
                                = new NoViableAltException("", 1, 1, input);

                        throw nvae;

                }

            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:508:7: ':strips'
                {
                    match(":strips");

                }
                break;
                case 2: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:509:7: ':typing'
                {
                    match(":typing");

                }
                break;
                case 3: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:510:7: ':negative-preconditions'
                {
                    match(":negative-preconditions");

                }
                break;
                case 4: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:511:7: ':disjunctive-preconditions'
                {
                    match(":disjunctive-preconditions");

                }
                break;
                case 5: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:512:7: ':equality'
                {
                    match(":equality");

                }
                break;
                case 6: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:513:7: ':existential-preconditions'
                {
                    match(":existential-preconditions");

                }
                break;
                case 7: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:514:7: ':universal-preconditions'
                {
                    match(":universal-preconditions");

                }
                break;
                case 8: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:515:7: ':quantified-preconditions'
                {
                    match(":quantified-preconditions");

                }
                break;
                case 9: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:516:7: ':conditional-effects'
                {
                    match(":conditional-effects");

                }
                break;
                case 10: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:517:7: ':fluents'
                {
                    match(":fluents");

                }
                break;
                case 11: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:518:7: ':adl'
                {
                    match(":adl");

                }
                break;
                case 12: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:519:7: ':durative-actions'
                {
                    match(":durative-actions");

                }
                break;
                case 13: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:520:7: ':derived-predicates'
                {
                    match(":derived-predicates");

                }
                break;
                case 14: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:521:7: ':timed-initial-literals'
                {
                    match(":timed-initial-literals");

                }
                break;
                case 15: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:522:7: ':preferences'
                {
                    match(":preferences");

                }
                break;
                case 16: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:523:7: ':constraints'
                {
                    match(":constraints");

                }
                break;

            }
            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "REQUIRE_KEY"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:524:5: ( LETTER ( ANY_CHAR )* )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:524:10: LETTER ( ANY_CHAR )*
            {
                mLETTER();

                // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:524:17: ( ANY_CHAR )*
                loop2:
                do {
                    int alt2 = 2;
                    int LA2_0 = input.LA(1);

                    if ((LA2_0 == '-' || (LA2_0 >= '0' && LA2_0 <= '9') || (LA2_0 >= 'A' && LA2_0 <= 'Z') || LA2_0 == '_' || (LA2_0 >= 'a' && LA2_0 <= 'z'))) {
                        alt2 = 1;
                    }

                    switch (alt2) {
                        case 1: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:
                        {
                            if (input.LA(1) == '-' || (input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }

                        }
                        break;

                        default:
                            break loop2;
                    }
                } while (true);

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:526:16: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:
            {
                if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }

            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "ANY_CHAR"
    public final void mANY_CHAR() throws RecognitionException {
        try {
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:528:18: ( LETTER | '0' .. '9' | '-' | '_' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:
            {
                if (input.LA(1) == '-' || (input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }

            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "ANY_CHAR"

    // $ANTLR start "VARIABLE"
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:530:10: ( '?' LETTER ( ANY_CHAR )* )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:530:12: '?' LETTER ( ANY_CHAR )*
            {
                match('?');

                mLETTER();

                // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:530:23: ( ANY_CHAR )*
                loop3:
                do {
                    int alt3 = 2;
                    int LA3_0 = input.LA(1);

                    if ((LA3_0 == '-' || (LA3_0 >= '0' && LA3_0 <= '9') || (LA3_0 >= 'A' && LA3_0 <= 'Z') || LA3_0 == '_' || (LA3_0 >= 'a' && LA3_0 <= 'z'))) {
                        alt3 = 1;
                    }

                    switch (alt3) {
                        case 1: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:
                        {
                            if (input.LA(1) == '-' || (input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }

                        }
                        break;

                        default:
                            break loop3;
                    }
                } while (true);

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "VARIABLE"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:532:8: ( ( DIGIT )+ ( '.' ( DIGIT )+ )? )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:532:10: ( DIGIT )+ ( '.' ( DIGIT )+ )?
            {
                // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:532:10: ( DIGIT )+
                int cnt4 = 0;
                loop4:
                do {
                    int alt4 = 2;
                    int LA4_0 = input.LA(1);

                    if (((LA4_0 >= '0' && LA4_0 <= '9'))) {
                        alt4 = 1;
                    }

                    switch (alt4) {
                        case 1: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:
                        {
                            if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }

                        }
                        break;

                        default:
                            if (cnt4 >= 1) {
                                break loop4;
                            }
                            EarlyExitException eee
                                    = new EarlyExitException(4, input);
                            throw eee;
                    }
                    cnt4++;
                } while (true);

                // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:532:17: ( '.' ( DIGIT )+ )?
                int alt6 = 2;
                int LA6_0 = input.LA(1);

                if ((LA6_0 == '.')) {
                    alt6 = 1;
                }
                switch (alt6) {
                    case 1: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:532:18: '.' ( DIGIT )+
                    {
                        match('.');

                        // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:532:22: ( DIGIT )+
                        int cnt5 = 0;
                        loop5:
                        do {
                            int alt5 = 2;
                            int LA5_0 = input.LA(1);

                            if (((LA5_0 >= '0' && LA5_0 <= '9'))) {
                                alt5 = 1;
                            }

                            switch (alt5) {
                                case 1: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:
                                {
                                    if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                                        input.consume();
                                    } else {
                                        MismatchedSetException mse = new MismatchedSetException(null, input);
                                        recover(mse);
                                        throw mse;
                                    }

                                }
                                break;

                                default:
                                    if (cnt5 >= 1) {
                                        break loop5;
                                    }
                                    EarlyExitException eee
                                            = new EarlyExitException(5, input);
                                    throw eee;
                            }
                            cnt5++;
                        } while (true);

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:534:15: ( '0' .. '9' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:
            {
                if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }

            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:537:5: ( ';' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:537:7: ';' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
                match(';');

                // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:537:11: (~ ( '\\n' | '\\r' ) )*
                loop7:
                do {
                    int alt7 = 2;
                    int LA7_0 = input.LA(1);

                    if (((LA7_0 >= '\u0000' && LA7_0 <= '\t') || (LA7_0 >= '\u000B' && LA7_0 <= '\f') || (LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF'))) {
                        alt7 = 1;
                    }

                    switch (alt7) {
                        case 1: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:
                        {
                            if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t') || (input.LA(1) >= '\u000B' && input.LA(1) <= '\f') || (input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }

                        }
                        break;

                        default:
                            break loop7;
                    }
                } while (true);

                // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:537:25: ( '\\r' )?
                int alt8 = 2;
                int LA8_0 = input.LA(1);

                if ((LA8_0 == '\r')) {
                    alt8 = 1;
                }
                switch (alt8) {
                    case 1: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:537:25: '\\r'
                    {
                        match('\r');

                    }
                    break;

                }

                match('\n');

                _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:541:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:541:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
                // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:541:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
                int cnt9 = 0;
                loop9:
                do {
                    int alt9 = 2;
                    int LA9_0 = input.LA(1);

                    if (((LA9_0 >= '\t' && LA9_0 <= '\n') || LA9_0 == '\r' || LA9_0 == ' ')) {
                        alt9 = 1;
                    }

                    switch (alt9) {
                        case 1: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:
                        {
                            if ((input.LA(1) >= '\t' && input.LA(1) <= '\n') || input.LA(1) == '\r' || input.LA(1) == ' ') {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }

                        }
                        break;

                        default:
                            if (cnt9 >= 1) {
                                break loop9;
                            }
                            EarlyExitException eee
                                    = new EarlyExitException(9, input);
                            throw eee;
                    }
                    cnt9++;
                } while (true);

                _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:8: ( T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | REQUIRE_KEY | NAME | VARIABLE | NUMBER | LINE_COMMENT | WHITESPACE )
        int alt10 = 73;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:10: T__56
            {
                mT__56();

            }
            break;
            case 2: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:16: T__57
            {
                mT__57();

            }
            break;
            case 3: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:22: T__58
            {
                mT__58();

            }
            break;
            case 4: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:28: T__59
            {
                mT__59();

            }
            break;
            case 5: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:34: T__60
            {
                mT__60();

            }
            break;
            case 6: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:40: T__61
            {
                mT__61();

            }
            break;
            case 7: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:46: T__62
            {
                mT__62();

            }
            break;
            case 8: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:52: T__63
            {
                mT__63();

            }
            break;
            case 9: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:58: T__64
            {
                mT__64();

            }
            break;
            case 10: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:64: T__65
            {
                mT__65();

            }
            break;
            case 11: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:70: T__66
            {
                mT__66();

            }
            break;
            case 12: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:76: T__67
            {
                mT__67();

            }
            break;
            case 13: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:82: T__68
            {
                mT__68();

            }
            break;
            case 14: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:88: T__69
            {
                mT__69();

            }
            break;
            case 15: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:94: T__70
            {
                mT__70();

            }
            break;
            case 16: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:100: T__71
            {
                mT__71();

            }
            break;
            case 17: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:106: T__72
            {
                mT__72();

            }
            break;
            case 18: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:112: T__73
            {
                mT__73();

            }
            break;
            case 19: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:118: T__74
            {
                mT__74();

            }
            break;
            case 20: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:124: T__75
            {
                mT__75();

            }
            break;
            case 21: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:130: T__76
            {
                mT__76();

            }
            break;
            case 22: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:136: T__77
            {
                mT__77();

            }
            break;
            case 23: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:142: T__78
            {
                mT__78();

            }
            break;
            case 24: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:148: T__79
            {
                mT__79();

            }
            break;
            case 25: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:154: T__80
            {
                mT__80();

            }
            break;
            case 26: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:160: T__81
            {
                mT__81();

            }
            break;
            case 27: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:166: T__82
            {
                mT__82();

            }
            break;
            case 28: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:172: T__83
            {
                mT__83();

            }
            break;
            case 29: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:178: T__84
            {
                mT__84();

            }
            break;
            case 30: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:184: T__85
            {
                mT__85();

            }
            break;
            case 31: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:190: T__86
            {
                mT__86();

            }
            break;
            case 32: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:196: T__87
            {
                mT__87();

            }
            break;
            case 33: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:202: T__88
            {
                mT__88();

            }
            break;
            case 34: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:208: T__89
            {
                mT__89();

            }
            break;
            case 35: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:214: T__90
            {
                mT__90();

            }
            break;
            case 36: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:220: T__91
            {
                mT__91();

            }
            break;
            case 37: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:226: T__92
            {
                mT__92();

            }
            break;
            case 38: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:232: T__93
            {
                mT__93();

            }
            break;
            case 39: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:238: T__94
            {
                mT__94();

            }
            break;
            case 40: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:244: T__95
            {
                mT__95();

            }
            break;
            case 41: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:250: T__96
            {
                mT__96();

            }
            break;
            case 42: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:256: T__97
            {
                mT__97();

            }
            break;
            case 43: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:262: T__98
            {
                mT__98();

            }
            break;
            case 44: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:268: T__99
            {
                mT__99();

            }
            break;
            case 45: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:274: T__100
            {
                mT__100();

            }
            break;
            case 46: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:281: T__101
            {
                mT__101();

            }
            break;
            case 47: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:288: T__102
            {
                mT__102();

            }
            break;
            case 48: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:295: T__103
            {
                mT__103();

            }
            break;
            case 49: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:302: T__104
            {
                mT__104();

            }
            break;
            case 50: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:309: T__105
            {
                mT__105();

            }
            break;
            case 51: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:316: T__106
            {
                mT__106();

            }
            break;
            case 52: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:323: T__107
            {
                mT__107();

            }
            break;
            case 53: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:330: T__108
            {
                mT__108();

            }
            break;
            case 54: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:337: T__109
            {
                mT__109();

            }
            break;
            case 55: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:344: T__110
            {
                mT__110();

            }
            break;
            case 56: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:351: T__111
            {
                mT__111();

            }
            break;
            case 57: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:358: T__112
            {
                mT__112();

            }
            break;
            case 58: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:365: T__113
            {
                mT__113();

            }
            break;
            case 59: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:372: T__114
            {
                mT__114();

            }
            break;
            case 60: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:379: T__115
            {
                mT__115();

            }
            break;
            case 61: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:386: T__116
            {
                mT__116();

            }
            break;
            case 62: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:393: T__117
            {
                mT__117();

            }
            break;
            case 63: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:400: T__118
            {
                mT__118();

            }
            break;
            case 64: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:407: T__119
            {
                mT__119();

            }
            break;
            case 65: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:414: T__120
            {
                mT__120();

            }
            break;
            case 66: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:421: T__121
            {
                mT__121();

            }
            break;
            case 67: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:428: T__122
            {
                mT__122();

            }
            break;
            case 68: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:435: REQUIRE_KEY
            {
                mREQUIRE_KEY();

            }
            break;
            case 69: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:447: NAME
            {
                mNAME();

            }
            break;
            case 70: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:452: VARIABLE
            {
                mVARIABLE();

            }
            break;
            case 71: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:461: NUMBER
            {
                mNUMBER();

            }
            break;
            case 72: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:468: LINE_COMMENT
            {
                mLINE_COMMENT();

            }
            break;
            case 73: // /home/enrico/Scrivania/HEPlanner/grammar/Pddl.g:1:481: WHITESPACE
            {
                mWHITESPACE();

            }
            break;

        }

    }

    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS
            = "\10\uffff\1\53\1\uffff\1\55\1\uffff\15\31\25\uffff\1\57\1\uffff"
            + "\3\31\1\133\16\31\1\153\10\31\12\uffff\1\57\1\173\1\31\1\175\2\31"
            + "\1\uffff\4\31\1\u0084\10\31\1\u008d\1\31\1\uffff\11\31\5\uffff\1"
            + "\57\1\uffff\1\31\1\uffff\6\31\1\uffff\10\31\1\uffff\1\31\1\u00b0"
            + "\6\31\1\u00b7\1\31\7\uffff\1\57\12\31\1\u00c9\5\31\1\uffff\4\31"
            + "\1\u00d3\1\31\1\uffff\1\31\4\uffff\1\57\1\u00dd\1\u00de\2\31\1\u00e1"
            + "\1\u00e2\1\u00e3\1\u00e4\1\u00e5\2\31\1\uffff\4\31\1\u00ec\4\31"
            + "\1\uffff\1\31\1\u00f3\5\uffff\1\57\1\31\2\uffff\2\31\5\uffff\6\31"
            + "\1\uffff\1\31\1\u0104\4\31\3\uffff\1\u010b\2\uffff\1\57\2\31\1\u0110"
            + "\2\31\1\u0113\1\31\1\u0115\1\u0116\1\31\1\uffff\1\31\1\u0119\1\u011b"
            + "\1\31\4\uffff\1\u0120\2\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31"
            + "\1\uffff\1\31\1\uffff\1\31\1\u012b\3\uffff\2\31\1\u0130\2\31\1\u0133"
            + "\1\u0134\2\31\1\u0137\3\uffff\2\31\1\uffff\1\u013c\1\u013d\2\uffff"
            + "\2\31\3\uffff\1\31\1\u0143\2\uffff\2\31\2\uffff\1\u0147\1\uffff"
            + "\2\31\2\uffff\1\u014b\1\31\2\uffff\1\u014e\1\u014f\2\uffff";
    static final String DFA10_eofS
            = "\u0150\uffff";
    static final String DFA10_minS
            = "\1\11\6\uffff\1\141\1\75\1\uffff\1\75\1\101\1\154\1\145\1\151\2"
            + "\157\1\155\1\141\1\157\2\162\1\143\1\157\1\150\4\uffff\1\143\1\157"
            + "\1\145\1\146\1\154\4\uffff\1\141\1\uffff\1\151\5\uffff\1\165\1\uffff"
            + "\1\154\1\144\1\163\1\55\1\143\1\155\1\164\1\144\1\151\1\162\1\154"
            + "\1\160\1\143\1\55\1\170\1\156\1\164\1\155\1\55\2\145\1\141\1\155"
            + "\1\141\1\164\1\145\1\164\1\uffff\1\156\1\162\1\uffff\1\162\3\uffff"
            + "\1\145\1\160\1\162\1\55\1\141\1\55\1\151\1\155\1\uffff\1\162\1\151"
            + "\1\141\1\150\1\55\1\163\1\141\1\144\1\154\1\162\1\166\2\151\1\55"
            + "\1\142\1\uffff\1\162\1\146\1\142\1\154\1\145\1\162\1\141\1\156\1"
            + "\150\1\144\1\151\1\141\1\143\1\145\1\141\1\uffff\1\171\1\uffff\1"
            + "\147\1\157\1\145\1\156\1\151\1\145\1\uffff\1\164\1\154\1\55\1\171"
            + "\1\145\1\151\2\155\1\uffff\1\145\1\55\1\145\1\154\1\145\2\164\1"
            + "\154\1\55\2\151\1\164\1\166\1\164\3\uffff\1\164\1\163\1\156\1\163"
            + "\1\141\1\145\1\156\1\162\1\163\1\154\1\141\1\55\1\141\1\157\2\151"
            + "\1\162\1\uffff\1\162\1\145\1\55\1\151\2\55\1\uffff\1\156\1\164\1"
            + "\141\1\145\2\151\2\55\1\164\1\163\5\55\1\146\1\165\1\uffff\1\163"
            + "\1\154\2\172\1\55\1\145\1\155\1\144\1\155\1\uffff\1\164\1\55\1\151"
            + "\1\uffff\1\141\1\144\2\157\1\167\2\uffff\1\55\1\145\5\uffff\1\164"
            + "\1\162\1\145\1\141\2\145\1\uffff\1\156\1\55\1\157\1\160\1\145\1"
            + "\151\1\uffff\1\157\1\151\1\55\1\uffff\1\145\1\156\1\151\1\157\1"
            + "\55\1\145\1\151\1\55\1\164\2\55\1\143\1\uffff\1\167\2\55\1\155\2"
            + "\156\1\uffff\2\55\1\164\1\156\1\uffff\1\162\1\156\1\uffff\1\145"
            + "\2\uffff\1\145\1\156\1\uffff\1\141\1\uffff\1\145\1\141\1\164\1\141"
            + "\1\uffff\1\150\1\143\1\55\1\147\1\144\2\55\1\146\1\145\1\55\1\uffff"
            + "\1\163\1\143\1\151\1\145\1\uffff\2\55\2\uffff\1\164\1\146\2\uffff"
            + "\1\164\1\156\1\55\2\uffff\1\145\1\157\1\uffff\1\151\1\55\1\uffff"
            + "\2\162\1\157\1\uffff\1\55\1\145\1\156\1\uffff\1\55\1\163\2\uffff";
    static final String DFA10_maxS
            = "\1\172\6\uffff\1\165\1\75\1\uffff\1\75\1\172\1\164\1\157\1\170\2"
            + "\157\1\163\1\151\1\165\1\166\1\162\1\164\1\157\1\151\4\uffff\1\144"
            + "\1\157\1\165\1\170\1\165\4\uffff\1\162\1\uffff\1\171\5\uffff\1\165"
            + "\1\uffff\1\167\1\144\1\163\1\172\1\146\1\155\1\164\1\144\1\151\1"
            + "\162\1\154\1\160\1\143\1\55\1\170\1\156\1\164\1\155\1\172\1\145"
            + "\1\157\1\141\1\155\1\141\1\164\1\145\1\164\1\uffff\1\156\1\162\1"
            + "\uffff\1\162\3\uffff\1\145\1\160\1\162\1\172\1\141\1\172\1\151\1"
            + "\155\1\uffff\1\162\1\151\1\141\1\150\1\172\1\163\1\141\1\144\1\154"
            + "\1\162\1\166\2\151\1\172\1\142\1\uffff\1\162\1\146\1\142\1\154\1"
            + "\145\1\162\1\141\1\156\1\150\1\163\1\151\1\141\1\146\1\151\1\141"
            + "\1\uffff\1\171\1\uffff\1\147\1\157\1\145\1\156\1\151\1\145\1\uffff"
            + "\1\164\1\154\1\55\1\171\1\145\1\151\2\155\1\uffff\1\145\1\172\1"
            + "\145\1\154\1\145\2\164\1\154\1\172\2\151\1\164\1\166\1\164\3\uffff"
            + "\1\164\1\163\1\156\1\163\1\141\1\145\1\156\1\162\1\163\1\154\1\144"
            + "\1\172\1\141\1\157\2\151\1\162\1\uffff\1\162\1\145\1\55\1\151\1"
            + "\172\1\55\1\uffff\1\156\1\164\1\162\1\145\2\151\2\172\1\164\1\163"
            + "\5\172\1\146\1\165\1\uffff\1\163\1\154\3\172\1\145\1\155\1\165\1"
            + "\155\1\uffff\1\164\1\172\1\151\1\uffff\1\141\1\144\1\166\1\157\1"
            + "\167\2\uffff\1\55\1\145\5\uffff\1\164\1\162\1\145\1\141\2\145\1"
            + "\uffff\1\156\1\172\1\157\1\160\1\145\1\151\1\uffff\1\157\1\151\1"
            + "\55\1\uffff\1\145\1\156\1\151\1\157\1\172\1\145\1\151\1\172\1\164"
            + "\2\172\1\143\1\uffff\1\167\2\172\1\155\2\156\1\uffff\1\55\1\172"
            + "\1\164\1\156\1\uffff\1\162\1\156\1\uffff\1\145\2\uffff\1\145\1\156"
            + "\1\uffff\1\142\1\uffff\1\145\1\141\1\164\1\141\1\uffff\1\150\1\143"
            + "\1\172\1\147\1\144\2\172\1\146\1\145\1\172\1\uffff\1\163\1\143\1"
            + "\151\1\145\1\uffff\2\172\2\uffff\1\164\1\146\2\uffff\1\164\1\156"
            + "\1\172\2\uffff\1\145\1\157\1\uffff\1\151\1\172\1\uffff\2\162\1\157"
            + "\1\uffff\1\172\1\145\1\156\1\uffff\1\172\1\163\2\uffff";
    static final String DFA10_acceptS
            = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\34\17\uffff\1\105\1\107"
            + "\1\110\1\111\5\uffff\1\21\1\22\1\23\1\24\1\uffff\1\30\1\uffff\1"
            + "\104\1\33\1\32\1\36\1\35\1\uffff\1\106\33\uffff\1\7\2\uffff\1\14"
            + "\1\uffff\1\17\1\20\1\25\10\uffff\1\45\17\uffff\1\67\17\uffff\1\40"
            + "\1\uffff\1\43\6\uffff\1\53\10\uffff\1\65\16\uffff\1\26\1\27\1\31"
            + "\21\uffff\1\70\6\uffff\1\102\21\uffff\1\60\11\uffff\1\100\3\uffff"
            + "\1\11\5\uffff\1\41\1\44\2\uffff\1\50\1\51\1\52\1\54\1\55\6\uffff"
            + "\1\66\6\uffff\1\103\3\uffff\1\15\14\uffff\1\72\6\uffff\1\13\4\uffff"
            + "\1\47\2\uffff\1\61\1\uffff\1\63\1\64\2\uffff\1\74\1\uffff\1\75\4"
            + "\uffff\1\37\12\uffff\1\10\4\uffff\1\56\2\uffff\1\71\1\73\2\uffff"
            + "\1\101\1\12\3\uffff\1\57\1\62\2\uffff\1\12\2\uffff\1\46\3\uffff"
            + "\1\42\3\uffff\1\76\2\uffff\1\77\1\16";
    static final String DFA10_specialS
            = "\u0150\uffff}>";
    static final String[] DFA10_transitionS = {
        "\2\34\2\uffff\1\34\22\uffff\1\34\7\uffff\1\1\1\2\1\3\1\4\1\uffff"
        + "\1\5\1\uffff\1\6\12\32\1\7\1\33\1\10\1\11\1\12\1\13\1\uffff"
        + "\32\31\6\uffff\1\14\2\31\1\15\1\16\1\17\1\31\1\20\1\21\3\31"
        + "\1\22\1\23\1\24\1\25\2\31\1\26\1\27\2\31\1\30\3\31",
        "",
        "",
        "",
        "",
        "",
        "",
        "\1\35\1\uffff\1\36\1\37\1\40\1\41\1\42\1\uffff\1\43\3\uffff"
        + "\1\44\1\51\1\45\1\46\1\51\1\47\1\51\1\50\1\51",
        "\1\52",
        "",
        "\1\54",
        "\32\57\6\uffff\3\57\1\56\26\57",
        "\1\60\1\uffff\1\61\4\uffff\1\62\1\63",
        "\1\64\11\uffff\1\65",
        "\1\66\4\uffff\1\67\11\uffff\1\70",
        "\1\71",
        "\1\72",
        "\1\73\1\74\4\uffff\1\75",
        "\1\76\7\uffff\1\77",
        "\1\100\5\uffff\1\101",
        "\1\102\3\uffff\1\103",
        "\1\104",
        "\1\105\13\uffff\1\106\4\uffff\1\107",
        "\1\110",
        "\1\111\1\112",
        "",
        "",
        "",
        "",
        "\1\113\1\51",
        "\1\114",
        "\1\115\3\uffff\1\51\5\uffff\1\116\5\uffff\1\117",
        "\1\120\12\uffff\1\51\6\uffff\1\51",
        "\1\51\10\uffff\1\121",
        "",
        "",
        "",
        "",
        "\1\122\20\uffff\1\123",
        "",
        "\1\51\17\uffff\1\124",
        "",
        "",
        "",
        "",
        "",
        "\1\125",
        "",
        "\1\126\12\uffff\1\127",
        "\1\130",
        "\1\131",
        "\1\132\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32"
        + "\31",
        "\1\134\2\uffff\1\135",
        "\1\136",
        "\1\137",
        "\1\140",
        "\1\141",
        "\1\142",
        "\1\143",
        "\1\144",
        "\1\145",
        "\1\146",
        "\1\147",
        "\1\150",
        "\1\151",
        "\1\152",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\154",
        "\1\155\11\uffff\1\156",
        "\1\157",
        "\1\160",
        "\1\161",
        "\1\162",
        "\1\163",
        "\1\164",
        "",
        "\1\165",
        "\1\166",
        "",
        "\1\167",
        "",
        "",
        "",
        "\1\170",
        "\1\171",
        "\1\172",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\174",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\176",
        "\1\177",
        "",
        "\1\u0080",
        "\1\u0081",
        "\1\u0082",
        "\1\u0083",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u0085",
        "\1\u0086",
        "\1\u0087",
        "\1\u0088",
        "\1\u0089",
        "\1\u008a",
        "\1\u008b",
        "\1\u008c",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u008e",
        "",
        "\1\u008f",
        "\1\u0090",
        "\1\u0091",
        "\1\u0092",
        "\1\u0093",
        "\1\u0094",
        "\1\u0095",
        "\1\u0096",
        "\1\u0097",
        "\1\u0098\16\uffff\1\u0099",
        "\1\u009a",
        "\1\u009b",
        "\1\u009c\1\u009d\1\uffff\1\51",
        "\1\u009e\3\uffff\1\51",
        "\1\u009f",
        "",
        "\1\u00a0",
        "",
        "\1\u00a1",
        "\1\u00a2",
        "\1\u00a3",
        "\1\u00a4",
        "\1\u00a5",
        "\1\u00a6",
        "",
        "\1\u00a7",
        "\1\u00a8",
        "\1\u00a9",
        "\1\u00aa",
        "\1\u00ab",
        "\1\u00ac",
        "\1\u00ad",
        "\1\u00ae",
        "",
        "\1\u00af",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u00b1",
        "\1\u00b2",
        "\1\u00b3",
        "\1\u00b4",
        "\1\u00b5",
        "\1\u00b6",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u00b8",
        "\1\u00b9",
        "\1\u00ba",
        "\1\u00bb",
        "\1\u00bc",
        "",
        "",
        "",
        "\1\u00bd",
        "\1\u00be",
        "\1\u00bf",
        "\1\u00c0",
        "\1\u00c1",
        "\1\u00c2",
        "\1\u00c3",
        "\1\u00c4",
        "\1\u00c5",
        "\1\u00c6",
        "\1\u00c7\2\uffff\1\u00c8",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u00ca",
        "\1\u00cb",
        "\1\u00cc",
        "\1\u00cd",
        "\1\u00ce",
        "",
        "\1\u00cf",
        "\1\u00d0",
        "\1\u00d1",
        "\1\u00d2",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u00d4",
        "",
        "\1\u00d5",
        "\1\u00d6",
        "\1\u00d7\20\uffff\1\u00d8",
        "\1\u00d9",
        "\1\u00da",
        "\1\u00db",
        "\1\u00dc\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32"
        + "\31",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u00df",
        "\1\u00e0",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u00e6",
        "\1\u00e7",
        "",
        "\1\u00e8",
        "\1\u00e9",
        "\1\u00ea",
        "\1\u00eb",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u00ed",
        "\1\u00ee",
        "\1\u00ef\20\uffff\1\u00f0",
        "\1\u00f1",
        "",
        "\1\u00f2",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u00f4",
        "",
        "\1\u00f5",
        "\1\u00f6",
        "\1\u00f7\6\uffff\1\u00f8",
        "\1\u00f9",
        "\1\u00fa",
        "",
        "",
        "\1\u00fb",
        "\1\u00fc",
        "",
        "",
        "",
        "",
        "",
        "\1\u00fd",
        "\1\u00fe",
        "\1\u00ff",
        "\1\u0100",
        "\1\u0101",
        "\1\u0102",
        "",
        "\1\u0103",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u0105",
        "\1\u0106",
        "\1\u0107",
        "\1\u0108",
        "",
        "\1\u0109",
        "\1\u010a",
        "\1\51",
        "",
        "\1\u010c",
        "\1\u010d",
        "\1\u010e",
        "\1\u010f",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u0111",
        "\1\u0112",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u0114",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u0117",
        "",
        "\1\u0118",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u011a\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32"
        + "\31",
        "\1\u011c",
        "\1\u011d",
        "\1\u011e",
        "",
        "\1\u011f",
        "\1\57\2\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
        "\1\u0121",
        "\1\u0122",
        "",
        "\1\u0123",
        "\1\u0124",
        "",
        "\1\u0125",
        "",
        "",
        "\1\u0126",
        "\1\u0127",
        "",
        "\1\u0128\1\u0129",
        "",
        "\1\u012a",
        "\1\51",
        "\1\u012c",
        "\1\u012d",
        "",
        "\1\u012e",
        "\1\u012f",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u0131",
        "\1\u0132",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u0135",
        "\1\u0136",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "",
        "\1\u0138",
        "\1\u0139",
        "\1\u013a",
        "\1\u013b",
        "",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "",
        "",
        "\1\u013e",
        "\1\u013f",
        "",
        "",
        "\1\u0141",
        "\1\u0142",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "",
        "",
        "\1\u0144",
        "\1\u0145",
        "",
        "\1\u0146",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "",
        "\1\u0148",
        "\1\u0149",
        "\1\u014a",
        "",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\u014c",
        "\1\u014d",
        "",
        "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
        "\1\51",
        "",
        ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }

        public String getDescription() {
            return "1:1: Tokens : ( T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | REQUIRE_KEY | NAME | VARIABLE | NUMBER | LINE_COMMENT | WHITESPACE );";
        }
    }

}
