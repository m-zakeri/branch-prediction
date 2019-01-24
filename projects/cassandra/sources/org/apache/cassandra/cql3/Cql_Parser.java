// $ANTLR 3.5.2 Parser.g 2017-01-31 10:17:54

    package org.apache.cassandra.cql3;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.EnumSet;
    import java.util.HashSet;
    import java.util.HashMap;
    import java.util.LinkedHashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.Set;

    import org.apache.cassandra.auth.*;
    import org.apache.cassandra.config.ColumnDefinition;
    import org.apache.cassandra.cql3.*;
    import org.apache.cassandra.cql3.restrictions.CustomIndexExpression;
    import org.apache.cassandra.cql3.statements.*;
    import org.apache.cassandra.cql3.selection.*;
    import org.apache.cassandra.cql3.functions.*;
    import org.apache.cassandra.db.marshal.CollectionType;
    import org.apache.cassandra.exceptions.ConfigurationException;
    import org.apache.cassandra.exceptions.InvalidRequestException;
    import org.apache.cassandra.exceptions.SyntaxException;
    import org.apache.cassandra.utils.Pair;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Cql_Parser extends Parser {
	public static final int EOF=-1;
	public static final int T__182=182;
	public static final int T__183=183;
	public static final int T__184=184;
	public static final int T__185=185;
	public static final int T__186=186;
	public static final int T__187=187;
	public static final int T__188=188;
	public static final int T__189=189;
	public static final int T__190=190;
	public static final int T__191=191;
	public static final int T__192=192;
	public static final int T__193=193;
	public static final int T__194=194;
	public static final int T__195=195;
	public static final int T__196=196;
	public static final int T__197=197;
	public static final int T__198=198;
	public static final int T__199=199;
	public static final int T__200=200;
	public static final int T__201=201;
	public static final int T__202=202;
	public static final int T__203=203;
	public static final int A=4;
	public static final int B=5;
	public static final int BOOLEAN=6;
	public static final int C=7;
	public static final int COMMENT=8;
	public static final int D=9;
	public static final int DIGIT=10;
	public static final int DURATION=11;
	public static final int DURATION_UNIT=12;
	public static final int E=13;
	public static final int EXPONENT=14;
	public static final int F=15;
	public static final int FLOAT=16;
	public static final int G=17;
	public static final int H=18;
	public static final int HEX=19;
	public static final int HEXNUMBER=20;
	public static final int I=21;
	public static final int IDENT=22;
	public static final int INTEGER=23;
	public static final int J=24;
	public static final int K=25;
	public static final int K_ADD=26;
	public static final int K_AGGREGATE=27;
	public static final int K_ALL=28;
	public static final int K_ALLOW=29;
	public static final int K_ALTER=30;
	public static final int K_AND=31;
	public static final int K_APPLY=32;
	public static final int K_AS=33;
	public static final int K_ASC=34;
	public static final int K_ASCII=35;
	public static final int K_AUTHORIZE=36;
	public static final int K_BATCH=37;
	public static final int K_BEGIN=38;
	public static final int K_BIGINT=39;
	public static final int K_BLOB=40;
	public static final int K_BOOLEAN=41;
	public static final int K_BY=42;
	public static final int K_CALLED=43;
	public static final int K_CAST=44;
	public static final int K_CLUSTERING=45;
	public static final int K_COLUMNFAMILY=46;
	public static final int K_COMPACT=47;
	public static final int K_CONTAINS=48;
	public static final int K_COUNT=49;
	public static final int K_COUNTER=50;
	public static final int K_CREATE=51;
	public static final int K_CUSTOM=52;
	public static final int K_DATE=53;
	public static final int K_DECIMAL=54;
	public static final int K_DEFAULT=55;
	public static final int K_DELETE=56;
	public static final int K_DESC=57;
	public static final int K_DESCRIBE=58;
	public static final int K_DISTINCT=59;
	public static final int K_DOUBLE=60;
	public static final int K_DROP=61;
	public static final int K_DURATION=62;
	public static final int K_ENTRIES=63;
	public static final int K_EXECUTE=64;
	public static final int K_EXISTS=65;
	public static final int K_FILTERING=66;
	public static final int K_FINALFUNC=67;
	public static final int K_FLOAT=68;
	public static final int K_FROM=69;
	public static final int K_FROZEN=70;
	public static final int K_FULL=71;
	public static final int K_FUNCTION=72;
	public static final int K_FUNCTIONS=73;
	public static final int K_GRANT=74;
	public static final int K_GROUP=75;
	public static final int K_IF=76;
	public static final int K_IN=77;
	public static final int K_INDEX=78;
	public static final int K_INET=79;
	public static final int K_INFINITY=80;
	public static final int K_INITCOND=81;
	public static final int K_INPUT=82;
	public static final int K_INSERT=83;
	public static final int K_INT=84;
	public static final int K_INTO=85;
	public static final int K_IS=86;
	public static final int K_JSON=87;
	public static final int K_KEY=88;
	public static final int K_KEYS=89;
	public static final int K_KEYSPACE=90;
	public static final int K_KEYSPACES=91;
	public static final int K_LANGUAGE=92;
	public static final int K_LIKE=93;
	public static final int K_LIMIT=94;
	public static final int K_LIST=95;
	public static final int K_LOGIN=96;
	public static final int K_MAP=97;
	public static final int K_MATERIALIZED=98;
	public static final int K_MBEAN=99;
	public static final int K_MBEANS=100;
	public static final int K_MODIFY=101;
	public static final int K_NAN=102;
	public static final int K_NOLOGIN=103;
	public static final int K_NORECURSIVE=104;
	public static final int K_NOSUPERUSER=105;
	public static final int K_NOT=106;
	public static final int K_NULL=107;
	public static final int K_OF=108;
	public static final int K_ON=109;
	public static final int K_OPTIONS=110;
	public static final int K_OR=111;
	public static final int K_ORDER=112;
	public static final int K_PARTITION=113;
	public static final int K_PASSWORD=114;
	public static final int K_PER=115;
	public static final int K_PERMISSION=116;
	public static final int K_PERMISSIONS=117;
	public static final int K_PRIMARY=118;
	public static final int K_RENAME=119;
	public static final int K_REPLACE=120;
	public static final int K_RETURNS=121;
	public static final int K_REVOKE=122;
	public static final int K_ROLE=123;
	public static final int K_ROLES=124;
	public static final int K_SELECT=125;
	public static final int K_SET=126;
	public static final int K_SFUNC=127;
	public static final int K_SMALLINT=128;
	public static final int K_STATIC=129;
	public static final int K_STORAGE=130;
	public static final int K_STYPE=131;
	public static final int K_SUPERUSER=132;
	public static final int K_TEXT=133;
	public static final int K_TIME=134;
	public static final int K_TIMESTAMP=135;
	public static final int K_TIMEUUID=136;
	public static final int K_TINYINT=137;
	public static final int K_TO=138;
	public static final int K_TOKEN=139;
	public static final int K_TRIGGER=140;
	public static final int K_TRUNCATE=141;
	public static final int K_TTL=142;
	public static final int K_TUPLE=143;
	public static final int K_TYPE=144;
	public static final int K_UNLOGGED=145;
	public static final int K_UNSET=146;
	public static final int K_UPDATE=147;
	public static final int K_USE=148;
	public static final int K_USER=149;
	public static final int K_USERS=150;
	public static final int K_USING=151;
	public static final int K_UUID=152;
	public static final int K_VALUES=153;
	public static final int K_VARCHAR=154;
	public static final int K_VARINT=155;
	public static final int K_VIEW=156;
	public static final int K_WHERE=157;
	public static final int K_WITH=158;
	public static final int K_WRITETIME=159;
	public static final int L=160;
	public static final int LETTER=161;
	public static final int M=162;
	public static final int MULTILINE_COMMENT=163;
	public static final int N=164;
	public static final int O=165;
	public static final int P=166;
	public static final int Q=167;
	public static final int QMARK=168;
	public static final int QUOTED_NAME=169;
	public static final int R=170;
	public static final int S=171;
	public static final int STRING_LITERAL=172;
	public static final int T=173;
	public static final int U=174;
	public static final int UUID=175;
	public static final int V=176;
	public static final int W=177;
	public static final int WS=178;
	public static final int X=179;
	public static final int Y=180;
	public static final int Z=181;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
	public CqlParser gCql;
	public CqlParser gParent;


	public Cql_Parser(TokenStream input, CqlParser gCql) {
		this(input, new RecognizerSharedState(), gCql);
	}
	public Cql_Parser(TokenStream input, RecognizerSharedState state, CqlParser gCql) {
		super(input, state);
		this.gCql = gCql;
		gParent = gCql;
	}

	@Override public String[] getTokenNames() { return CqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Parser.g"; }


	    private final List<ErrorListener> listeners = new ArrayList<ErrorListener>();
	    protected final List<ColumnIdentifier> bindVariables = new ArrayList<ColumnIdentifier>();

	    public static final Set<String> reservedTypeNames = new HashSet<String>()
	    {{
	        add("byte");
	        add("complex");
	        add("enum");
	        add("date");
	        add("interval");
	        add("macaddr");
	        add("bitstring");
	    }};

	    public AbstractMarker.Raw newBindVariables(ColumnIdentifier name)
	    {
	        AbstractMarker.Raw marker = new AbstractMarker.Raw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public AbstractMarker.INRaw newINBindVariables(ColumnIdentifier name)
	    {
	        AbstractMarker.INRaw marker = new AbstractMarker.INRaw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Tuples.Raw newTupleBindVariables(ColumnIdentifier name)
	    {
	        Tuples.Raw marker = new Tuples.Raw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Tuples.INRaw newTupleINBindVariables(ColumnIdentifier name)
	    {
	        Tuples.INRaw marker = new Tuples.INRaw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Json.Marker newJsonBindVariables(ColumnIdentifier name)
	    {
	        Json.Marker marker = new Json.Marker(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public void addErrorListener(ErrorListener listener)
	    {
	        this.listeners.add(listener);
	    }

	    public void removeErrorListener(ErrorListener listener)
	    {
	        this.listeners.remove(listener);
	    }

	    public void displayRecognitionError(String[] tokenNames, RecognitionException e)
	    {
	        for (int i = 0, m = listeners.size(); i < m; i++)
	            listeners.get(i).syntaxError(this, tokenNames, e);
	    }

	    protected void addRecognitionError(String msg)
	    {
	        for (int i = 0, m = listeners.size(); i < m; i++)
	            listeners.get(i).syntaxError(this, msg);
	    }

	    public Map<String, String> convertPropertyMap(Maps.Literal map)
	    {
	        if (map == null || map.entries == null || map.entries.isEmpty())
	            return Collections.<String, String>emptyMap();

	        Map<String, String> res = new HashMap<>(map.entries.size());

	        for (Pair<Term.Raw, Term.Raw> entry : map.entries)
	        {
	            // Because the parser tries to be smart and recover on error (to
	            // allow displaying more than one error I suppose), we have null
	            // entries in there. Just skip those, a proper error will be thrown in the end.
	            if (entry.left == null || entry.right == null)
	                break;

	            if (!(entry.left instanceof Constants.Literal))
	            {
	                String msg = "Invalid property name: " + entry.left;
	                if (entry.left instanceof AbstractMarker.Raw)
	                    msg += " (bind variables are not supported in DDL queries)";
	                addRecognitionError(msg);
	                break;
	            }
	            if (!(entry.right instanceof Constants.Literal))
	            {
	                String msg = "Invalid property value: " + entry.right + " for property: " + entry.left;
	                if (entry.right instanceof AbstractMarker.Raw)
	                    msg += " (bind variables are not supported in DDL queries)";
	                addRecognitionError(msg);
	                break;
	            }

	            res.put(((Constants.Literal)entry.left).getRawText(), ((Constants.Literal)entry.right).getRawText());
	        }

	        return res;
	    }

	    public void addRawUpdate(List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key, Operation.RawUpdate update)
	    {
	        for (Pair<ColumnDefinition.Raw, Operation.RawUpdate> p : operations)
	        {
	            if (p.left.equals(key) && !p.right.isCompatibleWith(update))
	                addRecognitionError("Multiple incompatible setting of column " + key);
	        }
	        operations.add(Pair.create(key, update));
	    }

	    public Set<Permission> filterPermissions(Set<Permission> permissions, IResource resource)
	    {
	        if (resource == null)
	            return Collections.emptySet();
	        Set<Permission> filtered = new HashSet<>(permissions);
	        filtered.retainAll(resource.applicablePermissions());
	        if (filtered.isEmpty())
	            addRecognitionError("Resource type " + resource.getClass().getSimpleName() +
	                                    " does not support any of the requested permissions");

	        return filtered;
	    }

	    public String canonicalizeObjectName(String s, boolean enforcePattern)
	    {
	        // these two conditions are here because technically they are valid
	        // ObjectNames, but we want to restrict their use without adding unnecessary
	        // work to JMXResource construction as that also happens on hotter code paths
	        if ("".equals(s))
	            addRecognitionError("Empty JMX object name supplied");

	        if ("*:*".equals(s))
	            addRecognitionError("Please use ALL MBEANS instead of wildcard pattern");

	        try
	        {
	            javax.management.ObjectName objectName = javax.management.ObjectName.getInstance(s);
	            if (enforcePattern && !objectName.isPattern())
	                addRecognitionError("Plural form used, but non-pattern JMX object name specified (" + s + ")");
	            return objectName.getCanonicalName();
	        }
	        catch (javax.management.MalformedObjectNameException e)
	        {
	          addRecognitionError(s + " is not a valid JMX object name");
	          return s;
	        }
	    }

	    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    // Recovery methods are overridden to avoid wasting work on recovering from errors when the result will be
	    // ignored anyway.
	    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	    @Override
	    protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException
	    {
	        throw new MismatchedTokenException(ttype, input);
	    }

	    @Override
	    public void recover(IntStream input, RecognitionException re)
	    {
	        // Do nothing.
	    }



	// $ANTLR start "cqlStatement"
	// Parser.g:204:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement );
	public final ParsedStatement cqlStatement() throws RecognitionException {
		ParsedStatement stmt = null;


		SelectStatement.RawStatement st1 =null;
		ModificationStatement.Parsed st2 =null;
		UpdateStatement.ParsedUpdate st3 =null;
		BatchStatement.Parsed st4 =null;
		DeleteStatement.Parsed st5 =null;
		UseStatement st6 =null;
		TruncateStatement st7 =null;
		CreateKeyspaceStatement st8 =null;
		CreateTableStatement.RawStatement st9 =null;
		CreateIndexStatement st10 =null;
		DropKeyspaceStatement st11 =null;
		DropTableStatement st12 =null;
		DropIndexStatement st13 =null;
		AlterTableStatement st14 =null;
		AlterKeyspaceStatement st15 =null;
		GrantPermissionsStatement st16 =null;
		RevokePermissionsStatement st17 =null;
		ListPermissionsStatement st18 =null;
		CreateRoleStatement st19 =null;
		AlterRoleStatement st20 =null;
		DropRoleStatement st21 =null;
		ListRolesStatement st22 =null;
		CreateTriggerStatement st23 =null;
		DropTriggerStatement st24 =null;
		CreateTypeStatement st25 =null;
		AlterTypeStatement st26 =null;
		DropTypeStatement st27 =null;
		CreateFunctionStatement st28 =null;
		DropFunctionStatement st29 =null;
		CreateAggregateStatement st30 =null;
		DropAggregateStatement st31 =null;
		CreateRoleStatement st32 =null;
		AlterRoleStatement st33 =null;
		DropRoleStatement st34 =null;
		ListRolesStatement st35 =null;
		GrantRoleStatement st36 =null;
		RevokeRoleStatement st37 =null;
		CreateViewStatement st38 =null;
		DropViewStatement st39 =null;
		AlterViewStatement st40 =null;

		try {
			// Parser.g:206:5: (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement )
			int alt1=40;
			alt1 = dfa1.predict(input);
			switch (alt1) {
				case 1 :
					// Parser.g:206:7: st1= selectStatement
					{
					pushFollow(FOLLOW_selectStatement_in_cqlStatement59);
					st1=selectStatement();
					state._fsp--;

					 stmt = st1; 
					}
					break;
				case 2 :
					// Parser.g:207:7: st2= insertStatement
					{
					pushFollow(FOLLOW_insertStatement_in_cqlStatement88);
					st2=insertStatement();
					state._fsp--;

					 stmt = st2; 
					}
					break;
				case 3 :
					// Parser.g:208:7: st3= updateStatement
					{
					pushFollow(FOLLOW_updateStatement_in_cqlStatement117);
					st3=updateStatement();
					state._fsp--;

					 stmt = st3; 
					}
					break;
				case 4 :
					// Parser.g:209:7: st4= batchStatement
					{
					pushFollow(FOLLOW_batchStatement_in_cqlStatement146);
					st4=batchStatement();
					state._fsp--;

					 stmt = st4; 
					}
					break;
				case 5 :
					// Parser.g:210:7: st5= deleteStatement
					{
					pushFollow(FOLLOW_deleteStatement_in_cqlStatement176);
					st5=deleteStatement();
					state._fsp--;

					 stmt = st5; 
					}
					break;
				case 6 :
					// Parser.g:211:7: st6= useStatement
					{
					pushFollow(FOLLOW_useStatement_in_cqlStatement205);
					st6=useStatement();
					state._fsp--;

					 stmt = st6; 
					}
					break;
				case 7 :
					// Parser.g:212:7: st7= truncateStatement
					{
					pushFollow(FOLLOW_truncateStatement_in_cqlStatement237);
					st7=truncateStatement();
					state._fsp--;

					 stmt = st7; 
					}
					break;
				case 8 :
					// Parser.g:213:7: st8= createKeyspaceStatement
					{
					pushFollow(FOLLOW_createKeyspaceStatement_in_cqlStatement264);
					st8=createKeyspaceStatement();
					state._fsp--;

					 stmt = st8; 
					}
					break;
				case 9 :
					// Parser.g:214:7: st9= createTableStatement
					{
					pushFollow(FOLLOW_createTableStatement_in_cqlStatement285);
					st9=createTableStatement();
					state._fsp--;

					 stmt = st9; 
					}
					break;
				case 10 :
					// Parser.g:215:7: st10= createIndexStatement
					{
					pushFollow(FOLLOW_createIndexStatement_in_cqlStatement308);
					st10=createIndexStatement();
					state._fsp--;

					 stmt = st10; 
					}
					break;
				case 11 :
					// Parser.g:216:7: st11= dropKeyspaceStatement
					{
					pushFollow(FOLLOW_dropKeyspaceStatement_in_cqlStatement331);
					st11=dropKeyspaceStatement();
					state._fsp--;

					 stmt = st11; 
					}
					break;
				case 12 :
					// Parser.g:217:7: st12= dropTableStatement
					{
					pushFollow(FOLLOW_dropTableStatement_in_cqlStatement353);
					st12=dropTableStatement();
					state._fsp--;

					 stmt = st12; 
					}
					break;
				case 13 :
					// Parser.g:218:7: st13= dropIndexStatement
					{
					pushFollow(FOLLOW_dropIndexStatement_in_cqlStatement378);
					st13=dropIndexStatement();
					state._fsp--;

					 stmt = st13; 
					}
					break;
				case 14 :
					// Parser.g:219:7: st14= alterTableStatement
					{
					pushFollow(FOLLOW_alterTableStatement_in_cqlStatement403);
					st14=alterTableStatement();
					state._fsp--;

					 stmt = st14; 
					}
					break;
				case 15 :
					// Parser.g:220:7: st15= alterKeyspaceStatement
					{
					pushFollow(FOLLOW_alterKeyspaceStatement_in_cqlStatement427);
					st15=alterKeyspaceStatement();
					state._fsp--;

					 stmt = st15; 
					}
					break;
				case 16 :
					// Parser.g:221:7: st16= grantPermissionsStatement
					{
					pushFollow(FOLLOW_grantPermissionsStatement_in_cqlStatement448);
					st16=grantPermissionsStatement();
					state._fsp--;

					 stmt = st16; 
					}
					break;
				case 17 :
					// Parser.g:222:7: st17= revokePermissionsStatement
					{
					pushFollow(FOLLOW_revokePermissionsStatement_in_cqlStatement466);
					st17=revokePermissionsStatement();
					state._fsp--;

					 stmt = st17; 
					}
					break;
				case 18 :
					// Parser.g:223:7: st18= listPermissionsStatement
					{
					pushFollow(FOLLOW_listPermissionsStatement_in_cqlStatement483);
					st18=listPermissionsStatement();
					state._fsp--;

					 stmt = st18; 
					}
					break;
				case 19 :
					// Parser.g:224:7: st19= createUserStatement
					{
					pushFollow(FOLLOW_createUserStatement_in_cqlStatement502);
					st19=createUserStatement();
					state._fsp--;

					 stmt = st19; 
					}
					break;
				case 20 :
					// Parser.g:225:7: st20= alterUserStatement
					{
					pushFollow(FOLLOW_alterUserStatement_in_cqlStatement526);
					st20=alterUserStatement();
					state._fsp--;

					 stmt = st20; 
					}
					break;
				case 21 :
					// Parser.g:226:7: st21= dropUserStatement
					{
					pushFollow(FOLLOW_dropUserStatement_in_cqlStatement551);
					st21=dropUserStatement();
					state._fsp--;

					 stmt = st21; 
					}
					break;
				case 22 :
					// Parser.g:227:7: st22= listUsersStatement
					{
					pushFollow(FOLLOW_listUsersStatement_in_cqlStatement577);
					st22=listUsersStatement();
					state._fsp--;

					 stmt = st22; 
					}
					break;
				case 23 :
					// Parser.g:228:7: st23= createTriggerStatement
					{
					pushFollow(FOLLOW_createTriggerStatement_in_cqlStatement602);
					st23=createTriggerStatement();
					state._fsp--;

					 stmt = st23; 
					}
					break;
				case 24 :
					// Parser.g:229:7: st24= dropTriggerStatement
					{
					pushFollow(FOLLOW_dropTriggerStatement_in_cqlStatement623);
					st24=dropTriggerStatement();
					state._fsp--;

					 stmt = st24; 
					}
					break;
				case 25 :
					// Parser.g:230:7: st25= createTypeStatement
					{
					pushFollow(FOLLOW_createTypeStatement_in_cqlStatement646);
					st25=createTypeStatement();
					state._fsp--;

					 stmt = st25; 
					}
					break;
				case 26 :
					// Parser.g:231:7: st26= alterTypeStatement
					{
					pushFollow(FOLLOW_alterTypeStatement_in_cqlStatement670);
					st26=alterTypeStatement();
					state._fsp--;

					 stmt = st26; 
					}
					break;
				case 27 :
					// Parser.g:232:7: st27= dropTypeStatement
					{
					pushFollow(FOLLOW_dropTypeStatement_in_cqlStatement695);
					st27=dropTypeStatement();
					state._fsp--;

					 stmt = st27; 
					}
					break;
				case 28 :
					// Parser.g:233:7: st28= createFunctionStatement
					{
					pushFollow(FOLLOW_createFunctionStatement_in_cqlStatement721);
					st28=createFunctionStatement();
					state._fsp--;

					 stmt = st28; 
					}
					break;
				case 29 :
					// Parser.g:234:7: st29= dropFunctionStatement
					{
					pushFollow(FOLLOW_dropFunctionStatement_in_cqlStatement741);
					st29=dropFunctionStatement();
					state._fsp--;

					 stmt = st29; 
					}
					break;
				case 30 :
					// Parser.g:235:7: st30= createAggregateStatement
					{
					pushFollow(FOLLOW_createAggregateStatement_in_cqlStatement763);
					st30=createAggregateStatement();
					state._fsp--;

					 stmt = st30; 
					}
					break;
				case 31 :
					// Parser.g:236:7: st31= dropAggregateStatement
					{
					pushFollow(FOLLOW_dropAggregateStatement_in_cqlStatement782);
					st31=dropAggregateStatement();
					state._fsp--;

					 stmt = st31; 
					}
					break;
				case 32 :
					// Parser.g:237:7: st32= createRoleStatement
					{
					pushFollow(FOLLOW_createRoleStatement_in_cqlStatement803);
					st32=createRoleStatement();
					state._fsp--;

					 stmt = st32; 
					}
					break;
				case 33 :
					// Parser.g:238:7: st33= alterRoleStatement
					{
					pushFollow(FOLLOW_alterRoleStatement_in_cqlStatement827);
					st33=alterRoleStatement();
					state._fsp--;

					 stmt = st33; 
					}
					break;
				case 34 :
					// Parser.g:239:7: st34= dropRoleStatement
					{
					pushFollow(FOLLOW_dropRoleStatement_in_cqlStatement852);
					st34=dropRoleStatement();
					state._fsp--;

					 stmt = st34; 
					}
					break;
				case 35 :
					// Parser.g:240:7: st35= listRolesStatement
					{
					pushFollow(FOLLOW_listRolesStatement_in_cqlStatement878);
					st35=listRolesStatement();
					state._fsp--;

					 stmt = st35; 
					}
					break;
				case 36 :
					// Parser.g:241:7: st36= grantRoleStatement
					{
					pushFollow(FOLLOW_grantRoleStatement_in_cqlStatement903);
					st36=grantRoleStatement();
					state._fsp--;

					 stmt = st36; 
					}
					break;
				case 37 :
					// Parser.g:242:7: st37= revokeRoleStatement
					{
					pushFollow(FOLLOW_revokeRoleStatement_in_cqlStatement928);
					st37=revokeRoleStatement();
					state._fsp--;

					 stmt = st37; 
					}
					break;
				case 38 :
					// Parser.g:243:7: st38= createMaterializedViewStatement
					{
					pushFollow(FOLLOW_createMaterializedViewStatement_in_cqlStatement952);
					st38=createMaterializedViewStatement();
					state._fsp--;

					 stmt = st38; 
					}
					break;
				case 39 :
					// Parser.g:244:7: st39= dropMaterializedViewStatement
					{
					pushFollow(FOLLOW_dropMaterializedViewStatement_in_cqlStatement964);
					st39=dropMaterializedViewStatement();
					state._fsp--;

					 stmt = st39; 
					}
					break;
				case 40 :
					// Parser.g:245:7: st40= alterMaterializedViewStatement
					{
					pushFollow(FOLLOW_alterMaterializedViewStatement_in_cqlStatement978);
					st40=alterMaterializedViewStatement();
					state._fsp--;

					 stmt = st40; 
					}
					break;

			}
			 if (stmt != null) stmt.setBoundVariables(bindVariables); 
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "cqlStatement"



	// $ANTLR start "useStatement"
	// Parser.g:251:1: useStatement returns [UseStatement stmt] : K_USE ks= keyspaceName ;
	public final UseStatement useStatement() throws RecognitionException {
		UseStatement stmt = null;


		String ks =null;

		try {
			// Parser.g:252:5: ( K_USE ks= keyspaceName )
			// Parser.g:252:7: K_USE ks= keyspaceName
			{
			match(input,K_USE,FOLLOW_K_USE_in_useStatement1004); 
			pushFollow(FOLLOW_keyspaceName_in_useStatement1008);
			ks=keyspaceName();
			state._fsp--;

			 stmt = new UseStatement(ks); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "useStatement"



	// $ANTLR start "selectStatement"
	// Parser.g:261:1: selectStatement returns [SelectStatement.RawStatement expr] : K_SELECT ( K_JSON )? ( ( K_DISTINCT )? sclause= selectClause ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )* )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? ;
	public final SelectStatement.RawStatement selectStatement() throws RecognitionException {
		SelectStatement.RawStatement expr = null;


		List<RawSelector> sclause =null;
		CFName cf =null;
		WhereClause.Builder wclause =null;
		Term.Raw rows =null;


		        boolean isDistinct = false;
		        Term.Raw limit = null;
		        Term.Raw perPartitionLimit = null;
		        Map<ColumnDefinition.Raw, Boolean> orderings = new LinkedHashMap<>();
		        List<ColumnDefinition.Raw> groups = new ArrayList<>();
		        boolean allowFiltering = false;
		        boolean isJson = false;
		    
		try {
			// Parser.g:271:5: ( K_SELECT ( K_JSON )? ( ( K_DISTINCT )? sclause= selectClause ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )* )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? )
			// Parser.g:271:7: K_SELECT ( K_JSON )? ( ( K_DISTINCT )? sclause= selectClause ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )* )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )?
			{
			match(input,K_SELECT,FOLLOW_K_SELECT_in_selectStatement1042); 
			// Parser.g:272:7: ( K_JSON )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==K_JSON) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==BOOLEAN||LA2_1==DURATION||LA2_1==FLOAT||LA2_1==HEXNUMBER||(LA2_1 >= IDENT && LA2_1 <= INTEGER)||(LA2_1 >= K_AGGREGATE && LA2_1 <= K_ALL)||LA2_1==K_ASCII||(LA2_1 >= K_BIGINT && LA2_1 <= K_BOOLEAN)||(LA2_1 >= K_CALLED && LA2_1 <= K_CLUSTERING)||(LA2_1 >= K_COMPACT && LA2_1 <= K_COUNTER)||(LA2_1 >= K_CUSTOM && LA2_1 <= K_DECIMAL)||(LA2_1 >= K_DISTINCT && LA2_1 <= K_DOUBLE)||LA2_1==K_DURATION||(LA2_1 >= K_EXISTS && LA2_1 <= K_FLOAT)||LA2_1==K_FROZEN||(LA2_1 >= K_FUNCTION && LA2_1 <= K_FUNCTIONS)||LA2_1==K_GROUP||(LA2_1 >= K_INET && LA2_1 <= K_INPUT)||LA2_1==K_INT||(LA2_1 >= K_JSON && LA2_1 <= K_KEYS)||(LA2_1 >= K_KEYSPACES && LA2_1 <= K_LIKE)||(LA2_1 >= K_LIST && LA2_1 <= K_MAP)||(LA2_1 >= K_NAN && LA2_1 <= K_NOLOGIN)||LA2_1==K_NOSUPERUSER||LA2_1==K_NULL||LA2_1==K_OPTIONS||(LA2_1 >= K_PARTITION && LA2_1 <= K_PERMISSIONS)||LA2_1==K_RETURNS||(LA2_1 >= K_ROLE && LA2_1 <= K_ROLES)||(LA2_1 >= K_SFUNC && LA2_1 <= K_TINYINT)||(LA2_1 >= K_TOKEN && LA2_1 <= K_TRIGGER)||(LA2_1 >= K_TTL && LA2_1 <= K_TYPE)||(LA2_1 >= K_USER && LA2_1 <= K_USERS)||(LA2_1 >= K_UUID && LA2_1 <= K_VARINT)||LA2_1==K_WRITETIME||(LA2_1 >= QMARK && LA2_1 <= QUOTED_NAME)||LA2_1==STRING_LITERAL||LA2_1==UUID||LA2_1==183||LA2_1==188||LA2_1==191||(LA2_1 >= 198 && LA2_1 <= 199)||LA2_1==202) ) {
					alt2=1;
				}
				else if ( (LA2_1==K_AS) ) {
					int LA2_4 = input.LA(3);
					if ( (LA2_4==K_FROM||LA2_4==183||LA2_4==187||LA2_4==190) ) {
						alt2=1;
					}
					else if ( (LA2_4==K_AS) ) {
						int LA2_5 = input.LA(4);
						if ( (LA2_5==IDENT||(LA2_5 >= K_AGGREGATE && LA2_5 <= K_ALL)||LA2_5==K_AS||LA2_5==K_ASCII||(LA2_5 >= K_BIGINT && LA2_5 <= K_BOOLEAN)||(LA2_5 >= K_CALLED && LA2_5 <= K_CLUSTERING)||(LA2_5 >= K_COMPACT && LA2_5 <= K_COUNTER)||(LA2_5 >= K_CUSTOM && LA2_5 <= K_DECIMAL)||(LA2_5 >= K_DISTINCT && LA2_5 <= K_DOUBLE)||LA2_5==K_DURATION||(LA2_5 >= K_EXISTS && LA2_5 <= K_FLOAT)||LA2_5==K_FROZEN||(LA2_5 >= K_FUNCTION && LA2_5 <= K_FUNCTIONS)||LA2_5==K_GROUP||LA2_5==K_INET||(LA2_5 >= K_INITCOND && LA2_5 <= K_INPUT)||LA2_5==K_INT||(LA2_5 >= K_JSON && LA2_5 <= K_KEYS)||(LA2_5 >= K_KEYSPACES && LA2_5 <= K_LIKE)||(LA2_5 >= K_LIST && LA2_5 <= K_MAP)||LA2_5==K_NOLOGIN||LA2_5==K_NOSUPERUSER||LA2_5==K_OPTIONS||(LA2_5 >= K_PARTITION && LA2_5 <= K_PERMISSIONS)||LA2_5==K_RETURNS||(LA2_5 >= K_ROLE && LA2_5 <= K_ROLES)||(LA2_5 >= K_SFUNC && LA2_5 <= K_TINYINT)||LA2_5==K_TRIGGER||(LA2_5 >= K_TTL && LA2_5 <= K_TYPE)||(LA2_5 >= K_USER && LA2_5 <= K_USERS)||(LA2_5 >= K_UUID && LA2_5 <= K_VARINT)||LA2_5==K_WRITETIME||LA2_5==QUOTED_NAME) ) {
							alt2=1;
						}
					}
				}
			}
			switch (alt2) {
				case 1 :
					// Parser.g:272:9: K_JSON
					{
					match(input,K_JSON,FOLLOW_K_JSON_in_selectStatement1052); 
					 isJson = true; 
					}
					break;

			}

			// Parser.g:273:7: ( ( K_DISTINCT )? sclause= selectClause )
			// Parser.g:273:9: ( K_DISTINCT )? sclause= selectClause
			{
			// Parser.g:273:9: ( K_DISTINCT )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==K_DISTINCT) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==BOOLEAN||LA3_1==DURATION||LA3_1==FLOAT||LA3_1==HEXNUMBER||(LA3_1 >= IDENT && LA3_1 <= INTEGER)||(LA3_1 >= K_AGGREGATE && LA3_1 <= K_ALL)||LA3_1==K_ASCII||(LA3_1 >= K_BIGINT && LA3_1 <= K_BOOLEAN)||(LA3_1 >= K_CALLED && LA3_1 <= K_CLUSTERING)||(LA3_1 >= K_COMPACT && LA3_1 <= K_COUNTER)||(LA3_1 >= K_CUSTOM && LA3_1 <= K_DECIMAL)||(LA3_1 >= K_DISTINCT && LA3_1 <= K_DOUBLE)||LA3_1==K_DURATION||(LA3_1 >= K_EXISTS && LA3_1 <= K_FLOAT)||LA3_1==K_FROZEN||(LA3_1 >= K_FUNCTION && LA3_1 <= K_FUNCTIONS)||LA3_1==K_GROUP||(LA3_1 >= K_INET && LA3_1 <= K_INPUT)||LA3_1==K_INT||(LA3_1 >= K_JSON && LA3_1 <= K_KEYS)||(LA3_1 >= K_KEYSPACES && LA3_1 <= K_LIKE)||(LA3_1 >= K_LIST && LA3_1 <= K_MAP)||(LA3_1 >= K_NAN && LA3_1 <= K_NOLOGIN)||LA3_1==K_NOSUPERUSER||LA3_1==K_NULL||LA3_1==K_OPTIONS||(LA3_1 >= K_PARTITION && LA3_1 <= K_PERMISSIONS)||LA3_1==K_RETURNS||(LA3_1 >= K_ROLE && LA3_1 <= K_ROLES)||(LA3_1 >= K_SFUNC && LA3_1 <= K_TINYINT)||(LA3_1 >= K_TOKEN && LA3_1 <= K_TRIGGER)||(LA3_1 >= K_TTL && LA3_1 <= K_TYPE)||(LA3_1 >= K_USER && LA3_1 <= K_USERS)||(LA3_1 >= K_UUID && LA3_1 <= K_VARINT)||LA3_1==K_WRITETIME||(LA3_1 >= QMARK && LA3_1 <= QUOTED_NAME)||LA3_1==STRING_LITERAL||LA3_1==UUID||LA3_1==183||LA3_1==188||LA3_1==191||(LA3_1 >= 198 && LA3_1 <= 199)||LA3_1==202) ) {
					alt3=1;
				}
				else if ( (LA3_1==K_AS) ) {
					int LA3_4 = input.LA(3);
					if ( (LA3_4==K_FROM||LA3_4==183||LA3_4==187||LA3_4==190) ) {
						alt3=1;
					}
					else if ( (LA3_4==K_AS) ) {
						int LA3_5 = input.LA(4);
						if ( (LA3_5==IDENT||(LA3_5 >= K_AGGREGATE && LA3_5 <= K_ALL)||LA3_5==K_AS||LA3_5==K_ASCII||(LA3_5 >= K_BIGINT && LA3_5 <= K_BOOLEAN)||(LA3_5 >= K_CALLED && LA3_5 <= K_CLUSTERING)||(LA3_5 >= K_COMPACT && LA3_5 <= K_COUNTER)||(LA3_5 >= K_CUSTOM && LA3_5 <= K_DECIMAL)||(LA3_5 >= K_DISTINCT && LA3_5 <= K_DOUBLE)||LA3_5==K_DURATION||(LA3_5 >= K_EXISTS && LA3_5 <= K_FLOAT)||LA3_5==K_FROZEN||(LA3_5 >= K_FUNCTION && LA3_5 <= K_FUNCTIONS)||LA3_5==K_GROUP||LA3_5==K_INET||(LA3_5 >= K_INITCOND && LA3_5 <= K_INPUT)||LA3_5==K_INT||(LA3_5 >= K_JSON && LA3_5 <= K_KEYS)||(LA3_5 >= K_KEYSPACES && LA3_5 <= K_LIKE)||(LA3_5 >= K_LIST && LA3_5 <= K_MAP)||LA3_5==K_NOLOGIN||LA3_5==K_NOSUPERUSER||LA3_5==K_OPTIONS||(LA3_5 >= K_PARTITION && LA3_5 <= K_PERMISSIONS)||LA3_5==K_RETURNS||(LA3_5 >= K_ROLE && LA3_5 <= K_ROLES)||(LA3_5 >= K_SFUNC && LA3_5 <= K_TINYINT)||LA3_5==K_TRIGGER||(LA3_5 >= K_TTL && LA3_5 <= K_TYPE)||(LA3_5 >= K_USER && LA3_5 <= K_USERS)||(LA3_5 >= K_UUID && LA3_5 <= K_VARINT)||LA3_5==K_WRITETIME||LA3_5==QUOTED_NAME) ) {
							alt3=1;
						}
					}
				}
			}
			switch (alt3) {
				case 1 :
					// Parser.g:273:11: K_DISTINCT
					{
					match(input,K_DISTINCT,FOLLOW_K_DISTINCT_in_selectStatement1069); 
					 isDistinct = true; 
					}
					break;

			}

			pushFollow(FOLLOW_selectClause_in_selectStatement1078);
			sclause=selectClause();
			state._fsp--;

			}

			match(input,K_FROM,FOLLOW_K_FROM_in_selectStatement1088); 
			pushFollow(FOLLOW_columnFamilyName_in_selectStatement1092);
			cf=columnFamilyName();
			state._fsp--;

			// Parser.g:275:7: ( K_WHERE wclause= whereClause )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==K_WHERE) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Parser.g:275:9: K_WHERE wclause= whereClause
					{
					match(input,K_WHERE,FOLLOW_K_WHERE_in_selectStatement1102); 
					pushFollow(FOLLOW_whereClause_in_selectStatement1106);
					wclause=whereClause();
					state._fsp--;

					}
					break;

			}

			// Parser.g:276:7: ( K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==K_GROUP) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// Parser.g:276:9: K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )*
					{
					match(input,K_GROUP,FOLLOW_K_GROUP_in_selectStatement1119); 
					match(input,K_BY,FOLLOW_K_BY_in_selectStatement1121); 
					pushFollow(FOLLOW_groupByClause_in_selectStatement1123);
					groupByClause(groups);
					state._fsp--;

					// Parser.g:276:44: ( ',' groupByClause[groups] )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==187) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// Parser.g:276:46: ',' groupByClause[groups]
							{
							match(input,187,FOLLOW_187_in_selectStatement1128); 
							pushFollow(FOLLOW_groupByClause_in_selectStatement1130);
							groupByClause(groups);
							state._fsp--;

							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;

			}

			// Parser.g:277:7: ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==K_ORDER) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// Parser.g:277:9: K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )*
					{
					match(input,K_ORDER,FOLLOW_K_ORDER_in_selectStatement1147); 
					match(input,K_BY,FOLLOW_K_BY_in_selectStatement1149); 
					pushFollow(FOLLOW_orderByClause_in_selectStatement1151);
					orderByClause(orderings);
					state._fsp--;

					// Parser.g:277:47: ( ',' orderByClause[orderings] )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==187) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// Parser.g:277:49: ',' orderByClause[orderings]
							{
							match(input,187,FOLLOW_187_in_selectStatement1156); 
							pushFollow(FOLLOW_orderByClause_in_selectStatement1158);
							orderByClause(orderings);
							state._fsp--;

							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;

			}

			// Parser.g:278:7: ( K_PER K_PARTITION K_LIMIT rows= intValue )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==K_PER) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Parser.g:278:9: K_PER K_PARTITION K_LIMIT rows= intValue
					{
					match(input,K_PER,FOLLOW_K_PER_in_selectStatement1175); 
					match(input,K_PARTITION,FOLLOW_K_PARTITION_in_selectStatement1177); 
					match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement1179); 
					pushFollow(FOLLOW_intValue_in_selectStatement1183);
					rows=intValue();
					state._fsp--;

					 perPartitionLimit = rows; 
					}
					break;

			}

			// Parser.g:279:7: ( K_LIMIT rows= intValue )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==K_LIMIT) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// Parser.g:279:9: K_LIMIT rows= intValue
					{
					match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement1198); 
					pushFollow(FOLLOW_intValue_in_selectStatement1202);
					rows=intValue();
					state._fsp--;

					 limit = rows; 
					}
					break;

			}

			// Parser.g:280:7: ( K_ALLOW K_FILTERING )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==K_ALLOW) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// Parser.g:280:9: K_ALLOW K_FILTERING
					{
					match(input,K_ALLOW,FOLLOW_K_ALLOW_in_selectStatement1217); 
					match(input,K_FILTERING,FOLLOW_K_FILTERING_in_selectStatement1219); 
					 allowFiltering = true; 
					}
					break;

			}


			          SelectStatement.Parameters params = new SelectStatement.Parameters(orderings,
			                                                                             groups,
			                                                                             isDistinct,
			                                                                             allowFiltering,
			                                                                             isJson);
			          WhereClause where = wclause == null ? WhereClause.empty() : wclause.build();
			          expr = new SelectStatement.RawStatement(cf, params, sclause, where, limit, perPartitionLimit);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "selectStatement"



	// $ANTLR start "selectClause"
	// Parser.g:292:1: selectClause returns [List<RawSelector> expr] : (t1= selector ( ',' tN= selector )* | '\\*' );
	public final List<RawSelector> selectClause() throws RecognitionException {
		List<RawSelector> expr = null;


		RawSelector t1 =null;
		RawSelector tN =null;

		try {
			// Parser.g:293:5: (t1= selector ( ',' tN= selector )* | '\\*' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==BOOLEAN||LA13_0==DURATION||LA13_0==FLOAT||LA13_0==HEXNUMBER||(LA13_0 >= IDENT && LA13_0 <= INTEGER)||(LA13_0 >= K_AGGREGATE && LA13_0 <= K_ALL)||LA13_0==K_AS||LA13_0==K_ASCII||(LA13_0 >= K_BIGINT && LA13_0 <= K_BOOLEAN)||(LA13_0 >= K_CALLED && LA13_0 <= K_CLUSTERING)||(LA13_0 >= K_COMPACT && LA13_0 <= K_COUNTER)||(LA13_0 >= K_CUSTOM && LA13_0 <= K_DECIMAL)||(LA13_0 >= K_DISTINCT && LA13_0 <= K_DOUBLE)||LA13_0==K_DURATION||(LA13_0 >= K_EXISTS && LA13_0 <= K_FLOAT)||LA13_0==K_FROZEN||(LA13_0 >= K_FUNCTION && LA13_0 <= K_FUNCTIONS)||LA13_0==K_GROUP||(LA13_0 >= K_INET && LA13_0 <= K_INPUT)||LA13_0==K_INT||(LA13_0 >= K_JSON && LA13_0 <= K_KEYS)||(LA13_0 >= K_KEYSPACES && LA13_0 <= K_LIKE)||(LA13_0 >= K_LIST && LA13_0 <= K_MAP)||(LA13_0 >= K_NAN && LA13_0 <= K_NOLOGIN)||LA13_0==K_NOSUPERUSER||LA13_0==K_NULL||LA13_0==K_OPTIONS||(LA13_0 >= K_PARTITION && LA13_0 <= K_PERMISSIONS)||LA13_0==K_RETURNS||(LA13_0 >= K_ROLE && LA13_0 <= K_ROLES)||(LA13_0 >= K_SFUNC && LA13_0 <= K_TINYINT)||(LA13_0 >= K_TOKEN && LA13_0 <= K_TRIGGER)||(LA13_0 >= K_TTL && LA13_0 <= K_TYPE)||(LA13_0 >= K_USER && LA13_0 <= K_USERS)||(LA13_0 >= K_UUID && LA13_0 <= K_VARINT)||LA13_0==K_WRITETIME||(LA13_0 >= QMARK && LA13_0 <= QUOTED_NAME)||LA13_0==STRING_LITERAL||LA13_0==UUID||LA13_0==183||LA13_0==188||LA13_0==191||LA13_0==198||LA13_0==202) ) {
				alt13=1;
			}
			else if ( (LA13_0==199) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// Parser.g:293:7: t1= selector ( ',' tN= selector )*
					{
					pushFollow(FOLLOW_selector_in_selectClause1256);
					t1=selector();
					state._fsp--;

					 expr = new ArrayList<RawSelector>(); expr.add(t1); 
					// Parser.g:293:76: ( ',' tN= selector )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==187) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// Parser.g:293:77: ',' tN= selector
							{
							match(input,187,FOLLOW_187_in_selectClause1261); 
							pushFollow(FOLLOW_selector_in_selectClause1265);
							tN=selector();
							state._fsp--;

							 expr.add(tN); 
							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;
				case 2 :
					// Parser.g:294:7: '\\*'
					{
					match(input,199,FOLLOW_199_in_selectClause1277); 
					 expr = Collections.<RawSelector>emptyList();
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "selectClause"



	// $ANTLR start "selector"
	// Parser.g:297:1: selector returns [RawSelector s] : us= unaliasedSelector ( K_AS c= noncol_ident )? ;
	public final RawSelector selector() throws RecognitionException {
		RawSelector s = null;


		Selectable.Raw us =null;
		ColumnIdentifier c =null;

		 ColumnIdentifier alias = null; 
		try {
			// Parser.g:299:5: (us= unaliasedSelector ( K_AS c= noncol_ident )? )
			// Parser.g:299:7: us= unaliasedSelector ( K_AS c= noncol_ident )?
			{
			pushFollow(FOLLOW_unaliasedSelector_in_selector1310);
			us=unaliasedSelector();
			state._fsp--;

			// Parser.g:299:28: ( K_AS c= noncol_ident )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==K_AS) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// Parser.g:299:29: K_AS c= noncol_ident
					{
					match(input,K_AS,FOLLOW_K_AS_in_selector1313); 
					pushFollow(FOLLOW_noncol_ident_in_selector1317);
					c=noncol_ident();
					state._fsp--;

					 alias = c; 
					}
					break;

			}

			 s = new RawSelector(us, alias); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selector"



	// $ANTLR start "unaliasedSelector"
	// Parser.g:306:1: unaliasedSelector returns [Selectable.Raw s] : (c= cident |v= value | '(' ct= comparatorType ')' v= value | K_COUNT '(' '\\*' ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs ) ( '.' fi= fident )* ;
	public final Selectable.Raw unaliasedSelector() throws RecognitionException {
		Selectable.Raw s = null;


		ColumnDefinition.Raw c =null;
		Term.Raw v =null;
		CQL3Type.Raw ct =null;
		Selectable.Raw sn =null;
		CQL3Type t =null;
		FunctionName f =null;
		List<Selectable.Raw> args =null;
		FieldIdentifier fi =null;

		 Selectable.Raw tmp = null; 
		try {
			// Parser.g:308:5: ( (c= cident |v= value | '(' ct= comparatorType ')' v= value | K_COUNT '(' '\\*' ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs ) ( '.' fi= fident )* )
			// Parser.g:308:8: (c= cident |v= value | '(' ct= comparatorType ')' v= value | K_COUNT '(' '\\*' ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs ) ( '.' fi= fident )*
			{
			// Parser.g:308:8: (c= cident |v= value | '(' ct= comparatorType ')' v= value | K_COUNT '(' '\\*' ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs )
			int alt15=8;
			alt15 = dfa15.predict(input);
			switch (alt15) {
				case 1 :
					// Parser.g:308:10: c= cident
					{
					pushFollow(FOLLOW_cident_in_unaliasedSelector1360);
					c=cident();
					state._fsp--;

					 tmp = c; 
					}
					break;
				case 2 :
					// Parser.g:309:10: v= value
					{
					pushFollow(FOLLOW_value_in_unaliasedSelector1408);
					v=value();
					state._fsp--;

					 tmp = new Selectable.WithTerm.Raw(v); 
					}
					break;
				case 3 :
					// Parser.g:310:10: '(' ct= comparatorType ')' v= value
					{
					match(input,183,FOLLOW_183_in_unaliasedSelector1455); 
					pushFollow(FOLLOW_comparatorType_in_unaliasedSelector1459);
					ct=comparatorType();
					state._fsp--;

					match(input,184,FOLLOW_184_in_unaliasedSelector1461); 
					pushFollow(FOLLOW_value_in_unaliasedSelector1465);
					v=value();
					state._fsp--;

					 tmp = new Selectable.WithTerm.Raw(new TypeCast(ct, v)); 
					}
					break;
				case 4 :
					// Parser.g:311:10: K_COUNT '(' '\\*' ')'
					{
					match(input,K_COUNT,FOLLOW_K_COUNT_in_unaliasedSelector1486); 
					match(input,183,FOLLOW_183_in_unaliasedSelector1488); 
					match(input,199,FOLLOW_199_in_unaliasedSelector1490); 
					match(input,184,FOLLOW_184_in_unaliasedSelector1492); 
					 tmp = Selectable.WithFunction.Raw.newCountRowsFunction(); 
					}
					break;
				case 5 :
					// Parser.g:312:10: K_WRITETIME '(' c= cident ')'
					{
					match(input,K_WRITETIME,FOLLOW_K_WRITETIME_in_unaliasedSelector1526); 
					match(input,183,FOLLOW_183_in_unaliasedSelector1528); 
					pushFollow(FOLLOW_cident_in_unaliasedSelector1532);
					c=cident();
					state._fsp--;

					match(input,184,FOLLOW_184_in_unaliasedSelector1534); 
					 tmp = new Selectable.WritetimeOrTTL.Raw(c, true); 
					}
					break;
				case 6 :
					// Parser.g:313:10: K_TTL '(' c= cident ')'
					{
					match(input,K_TTL,FOLLOW_K_TTL_in_unaliasedSelector1560); 
					match(input,183,FOLLOW_183_in_unaliasedSelector1568); 
					pushFollow(FOLLOW_cident_in_unaliasedSelector1572);
					c=cident();
					state._fsp--;

					match(input,184,FOLLOW_184_in_unaliasedSelector1574); 
					 tmp = new Selectable.WritetimeOrTTL.Raw(c, false); 
					}
					break;
				case 7 :
					// Parser.g:314:10: K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')'
					{
					match(input,K_CAST,FOLLOW_K_CAST_in_unaliasedSelector1600); 
					match(input,183,FOLLOW_183_in_unaliasedSelector1607); 
					pushFollow(FOLLOW_unaliasedSelector_in_unaliasedSelector1611);
					sn=unaliasedSelector();
					state._fsp--;

					match(input,K_AS,FOLLOW_K_AS_in_unaliasedSelector1613); 
					pushFollow(FOLLOW_native_type_in_unaliasedSelector1617);
					t=native_type();
					state._fsp--;

					match(input,184,FOLLOW_184_in_unaliasedSelector1619); 
					tmp = new Selectable.WithCast.Raw(sn, t);
					}
					break;
				case 8 :
					// Parser.g:315:10: f= functionName args= selectionFunctionArgs
					{
					pushFollow(FOLLOW_functionName_in_unaliasedSelector1634);
					f=functionName();
					state._fsp--;

					pushFollow(FOLLOW_selectionFunctionArgs_in_unaliasedSelector1638);
					args=selectionFunctionArgs();
					state._fsp--;

					 tmp = new Selectable.WithFunction.Raw(f, args); 
					}
					break;

			}

			// Parser.g:316:10: ( '.' fi= fident )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==190) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// Parser.g:316:12: '.' fi= fident
					{
					match(input,190,FOLLOW_190_in_unaliasedSelector1653); 
					pushFollow(FOLLOW_fident_in_unaliasedSelector1657);
					fi=fident();
					state._fsp--;

					 tmp = new Selectable.WithFieldSelection.Raw(tmp, fi); 
					}
					break;

				default :
					break loop16;
				}
			}

			 s = tmp; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "unaliasedSelector"



	// $ANTLR start "selectionFunctionArgs"
	// Parser.g:319:1: selectionFunctionArgs returns [List<Selectable.Raw> a] : ( '(' ')' | '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')' );
	public final List<Selectable.Raw> selectionFunctionArgs() throws RecognitionException {
		List<Selectable.Raw> a = null;


		Selectable.Raw s1 =null;
		Selectable.Raw sn =null;

		try {
			// Parser.g:320:5: ( '(' ')' | '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==183) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==184) ) {
					alt18=1;
				}
				else if ( (LA18_1==BOOLEAN||LA18_1==DURATION||LA18_1==FLOAT||LA18_1==HEXNUMBER||(LA18_1 >= IDENT && LA18_1 <= INTEGER)||(LA18_1 >= K_AGGREGATE && LA18_1 <= K_ALL)||LA18_1==K_AS||LA18_1==K_ASCII||(LA18_1 >= K_BIGINT && LA18_1 <= K_BOOLEAN)||(LA18_1 >= K_CALLED && LA18_1 <= K_CLUSTERING)||(LA18_1 >= K_COMPACT && LA18_1 <= K_COUNTER)||(LA18_1 >= K_CUSTOM && LA18_1 <= K_DECIMAL)||(LA18_1 >= K_DISTINCT && LA18_1 <= K_DOUBLE)||LA18_1==K_DURATION||(LA18_1 >= K_EXISTS && LA18_1 <= K_FLOAT)||LA18_1==K_FROZEN||(LA18_1 >= K_FUNCTION && LA18_1 <= K_FUNCTIONS)||LA18_1==K_GROUP||(LA18_1 >= K_INET && LA18_1 <= K_INPUT)||LA18_1==K_INT||(LA18_1 >= K_JSON && LA18_1 <= K_KEYS)||(LA18_1 >= K_KEYSPACES && LA18_1 <= K_LIKE)||(LA18_1 >= K_LIST && LA18_1 <= K_MAP)||(LA18_1 >= K_NAN && LA18_1 <= K_NOLOGIN)||LA18_1==K_NOSUPERUSER||LA18_1==K_NULL||LA18_1==K_OPTIONS||(LA18_1 >= K_PARTITION && LA18_1 <= K_PERMISSIONS)||LA18_1==K_RETURNS||(LA18_1 >= K_ROLE && LA18_1 <= K_ROLES)||(LA18_1 >= K_SFUNC && LA18_1 <= K_TINYINT)||(LA18_1 >= K_TOKEN && LA18_1 <= K_TRIGGER)||(LA18_1 >= K_TTL && LA18_1 <= K_TYPE)||(LA18_1 >= K_USER && LA18_1 <= K_USERS)||(LA18_1 >= K_UUID && LA18_1 <= K_VARINT)||LA18_1==K_WRITETIME||(LA18_1 >= QMARK && LA18_1 <= QUOTED_NAME)||LA18_1==STRING_LITERAL||LA18_1==UUID||LA18_1==183||LA18_1==188||LA18_1==191||LA18_1==198||LA18_1==202) ) {
					alt18=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// Parser.g:320:7: '(' ')'
					{
					match(input,183,FOLLOW_183_in_selectionFunctionArgs1685); 
					match(input,184,FOLLOW_184_in_selectionFunctionArgs1687); 
					 a = Collections.emptyList(); 
					}
					break;
				case 2 :
					// Parser.g:321:7: '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')'
					{
					match(input,183,FOLLOW_183_in_selectionFunctionArgs1697); 
					pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs1701);
					s1=unaliasedSelector();
					state._fsp--;

					 List<Selectable.Raw> args = new ArrayList<Selectable.Raw>(); args.add(s1); 
					// Parser.g:322:11: ( ',' sn= unaliasedSelector )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==187) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// Parser.g:322:13: ',' sn= unaliasedSelector
							{
							match(input,187,FOLLOW_187_in_selectionFunctionArgs1717); 
							pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs1721);
							sn=unaliasedSelector();
							state._fsp--;

							 args.add(sn); 
							}
							break;

						default :
							break loop17;
						}
					}

					match(input,184,FOLLOW_184_in_selectionFunctionArgs1734); 
					 a = args; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return a;
	}
	// $ANTLR end "selectionFunctionArgs"



	// $ANTLR start "whereClause"
	// Parser.g:326:1: whereClause returns [WhereClause.Builder clause] : relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )* ;
	public final WhereClause.Builder whereClause() throws RecognitionException {
		WhereClause.Builder clause = null;


		 clause = new WhereClause.Builder(); 
		try {
			// Parser.g:328:5: ( relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )* )
			// Parser.g:328:7: relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )*
			{
			pushFollow(FOLLOW_relationOrExpression_in_whereClause1765);
			relationOrExpression(clause);
			state._fsp--;

			// Parser.g:328:37: ( K_AND relationOrExpression[$clause] )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==K_AND) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Parser.g:328:38: K_AND relationOrExpression[$clause]
					{
					match(input,K_AND,FOLLOW_K_AND_in_whereClause1769); 
					pushFollow(FOLLOW_relationOrExpression_in_whereClause1771);
					relationOrExpression(clause);
					state._fsp--;

					}
					break;

				default :
					break loop19;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return clause;
	}
	// $ANTLR end "whereClause"



	// $ANTLR start "relationOrExpression"
	// Parser.g:331:1: relationOrExpression[WhereClause.Builder clause] : ( relation[$clause] | customIndexExpression[$clause] );
	public final void relationOrExpression(WhereClause.Builder clause) throws RecognitionException {
		try {
			// Parser.g:332:5: ( relation[$clause] | customIndexExpression[$clause] )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==IDENT||(LA20_0 >= K_AGGREGATE && LA20_0 <= K_ALL)||LA20_0==K_AS||LA20_0==K_ASCII||(LA20_0 >= K_BIGINT && LA20_0 <= K_BOOLEAN)||(LA20_0 >= K_CALLED && LA20_0 <= K_CLUSTERING)||(LA20_0 >= K_COMPACT && LA20_0 <= K_COUNTER)||(LA20_0 >= K_CUSTOM && LA20_0 <= K_DECIMAL)||(LA20_0 >= K_DISTINCT && LA20_0 <= K_DOUBLE)||LA20_0==K_DURATION||(LA20_0 >= K_EXISTS && LA20_0 <= K_FLOAT)||LA20_0==K_FROZEN||(LA20_0 >= K_FUNCTION && LA20_0 <= K_FUNCTIONS)||LA20_0==K_GROUP||LA20_0==K_INET||(LA20_0 >= K_INITCOND && LA20_0 <= K_INPUT)||LA20_0==K_INT||(LA20_0 >= K_JSON && LA20_0 <= K_KEYS)||(LA20_0 >= K_KEYSPACES && LA20_0 <= K_LIKE)||(LA20_0 >= K_LIST && LA20_0 <= K_MAP)||LA20_0==K_NOLOGIN||LA20_0==K_NOSUPERUSER||LA20_0==K_OPTIONS||(LA20_0 >= K_PARTITION && LA20_0 <= K_PERMISSIONS)||LA20_0==K_RETURNS||(LA20_0 >= K_ROLE && LA20_0 <= K_ROLES)||(LA20_0 >= K_SFUNC && LA20_0 <= K_TINYINT)||(LA20_0 >= K_TOKEN && LA20_0 <= K_TRIGGER)||(LA20_0 >= K_TTL && LA20_0 <= K_TYPE)||(LA20_0 >= K_USER && LA20_0 <= K_USERS)||(LA20_0 >= K_UUID && LA20_0 <= K_VARINT)||LA20_0==K_WRITETIME||LA20_0==QUOTED_NAME||LA20_0==183) ) {
				alt20=1;
			}
			else if ( (LA20_0==201) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// Parser.g:332:7: relation[$clause]
					{
					pushFollow(FOLLOW_relation_in_relationOrExpression1793);
					relation(clause);
					state._fsp--;

					}
					break;
				case 2 :
					// Parser.g:333:7: customIndexExpression[$clause]
					{
					pushFollow(FOLLOW_customIndexExpression_in_relationOrExpression1802);
					customIndexExpression(clause);
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relationOrExpression"



	// $ANTLR start "customIndexExpression"
	// Parser.g:336:1: customIndexExpression[WhereClause.Builder clause] : 'expr(' idxName[name] ',' t= term ')' ;
	public final void customIndexExpression(WhereClause.Builder clause) throws RecognitionException {
		Term.Raw t =null;

		IndexName name = new IndexName();
		try {
			// Parser.g:338:5: ( 'expr(' idxName[name] ',' t= term ')' )
			// Parser.g:338:7: 'expr(' idxName[name] ',' t= term ')'
			{
			match(input,201,FOLLOW_201_in_customIndexExpression1830); 
			pushFollow(FOLLOW_idxName_in_customIndexExpression1832);
			idxName(name);
			state._fsp--;

			match(input,187,FOLLOW_187_in_customIndexExpression1835); 
			pushFollow(FOLLOW_term_in_customIndexExpression1839);
			t=term();
			state._fsp--;

			match(input,184,FOLLOW_184_in_customIndexExpression1841); 
			 clause.add(new CustomIndexExpression(name, t));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "customIndexExpression"



	// $ANTLR start "orderByClause"
	// Parser.g:341:1: orderByClause[Map<ColumnDefinition.Raw, Boolean> orderings] : c= cident ( K_ASC | K_DESC )? ;
	public final void orderByClause(Map<ColumnDefinition.Raw, Boolean> orderings) throws RecognitionException {
		ColumnDefinition.Raw c =null;


		        boolean reversed = false;
		    
		try {
			// Parser.g:345:5: (c= cident ( K_ASC | K_DESC )? )
			// Parser.g:345:7: c= cident ( K_ASC | K_DESC )?
			{
			pushFollow(FOLLOW_cident_in_orderByClause1871);
			c=cident();
			state._fsp--;

			// Parser.g:345:16: ( K_ASC | K_DESC )?
			int alt21=3;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==K_ASC) ) {
				alt21=1;
			}
			else if ( (LA21_0==K_DESC) ) {
				alt21=2;
			}
			switch (alt21) {
				case 1 :
					// Parser.g:345:17: K_ASC
					{
					match(input,K_ASC,FOLLOW_K_ASC_in_orderByClause1874); 
					}
					break;
				case 2 :
					// Parser.g:345:25: K_DESC
					{
					match(input,K_DESC,FOLLOW_K_DESC_in_orderByClause1878); 
					 reversed = true; 
					}
					break;

			}

			 orderings.put(c, reversed); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "orderByClause"



	// $ANTLR start "groupByClause"
	// Parser.g:348:1: groupByClause[List<ColumnDefinition.Raw> groups] : c= cident ;
	public final void groupByClause(List<ColumnDefinition.Raw> groups) throws RecognitionException {
		ColumnDefinition.Raw c =null;

		try {
			// Parser.g:349:5: (c= cident )
			// Parser.g:349:7: c= cident
			{
			pushFollow(FOLLOW_cident_in_groupByClause1904);
			c=cident();
			state._fsp--;

			 groups.add(c); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "groupByClause"



	// $ANTLR start "insertStatement"
	// Parser.g:358:1: insertStatement returns [ModificationStatement.Parsed expr] : K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] ) ;
	public final ModificationStatement.Parsed insertStatement() throws RecognitionException {
		ModificationStatement.Parsed expr = null;


		CFName cf =null;
		UpdateStatement.ParsedInsert st1 =null;
		UpdateStatement.ParsedInsertJson st2 =null;

		try {
			// Parser.g:359:5: ( K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] ) )
			// Parser.g:359:7: K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] )
			{
			match(input,K_INSERT,FOLLOW_K_INSERT_in_insertStatement1929); 
			match(input,K_INTO,FOLLOW_K_INTO_in_insertStatement1931); 
			pushFollow(FOLLOW_columnFamilyName_in_insertStatement1935);
			cf=columnFamilyName();
			state._fsp--;

			// Parser.g:360:9: (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==183) ) {
				alt22=1;
			}
			else if ( (LA22_0==K_JSON) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// Parser.g:360:11: st1= normalInsertStatement[cf]
					{
					pushFollow(FOLLOW_normalInsertStatement_in_insertStatement1949);
					st1=normalInsertStatement(cf);
					state._fsp--;

					 expr = st1; 
					}
					break;
				case 2 :
					// Parser.g:361:11: K_JSON st2= jsonInsertStatement[cf]
					{
					match(input,K_JSON,FOLLOW_K_JSON_in_insertStatement1964); 
					pushFollow(FOLLOW_jsonInsertStatement_in_insertStatement1968);
					st2=jsonInsertStatement(cf);
					state._fsp--;

					 expr = st2; 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "insertStatement"



	// $ANTLR start "normalInsertStatement"
	// Parser.g:364:1: normalInsertStatement[CFName cf] returns [UpdateStatement.ParsedInsert expr] : '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? ;
	public final UpdateStatement.ParsedInsert normalInsertStatement(CFName cf) throws RecognitionException {
		UpdateStatement.ParsedInsert expr = null;


		ColumnDefinition.Raw c1 =null;
		ColumnDefinition.Raw cn =null;
		Term.Raw v1 =null;
		Term.Raw vn =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<ColumnDefinition.Raw> columnNames  = new ArrayList<>();
		        List<Term.Raw> values = new ArrayList<>();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:371:5: ( '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? )
			// Parser.g:371:7: '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )?
			{
			match(input,183,FOLLOW_183_in_normalInsertStatement2004); 
			pushFollow(FOLLOW_cident_in_normalInsertStatement2008);
			c1=cident();
			state._fsp--;

			 columnNames.add(c1); 
			// Parser.g:371:47: ( ',' cn= cident )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==187) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// Parser.g:371:49: ',' cn= cident
					{
					match(input,187,FOLLOW_187_in_normalInsertStatement2015); 
					pushFollow(FOLLOW_cident_in_normalInsertStatement2019);
					cn=cident();
					state._fsp--;

					 columnNames.add(cn); 
					}
					break;

				default :
					break loop23;
				}
			}

			match(input,184,FOLLOW_184_in_normalInsertStatement2026); 
			match(input,K_VALUES,FOLLOW_K_VALUES_in_normalInsertStatement2034); 
			match(input,183,FOLLOW_183_in_normalInsertStatement2042); 
			pushFollow(FOLLOW_term_in_normalInsertStatement2046);
			v1=term();
			state._fsp--;

			 values.add(v1); 
			// Parser.g:373:39: ( ',' vn= term )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==187) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// Parser.g:373:41: ',' vn= term
					{
					match(input,187,FOLLOW_187_in_normalInsertStatement2052); 
					pushFollow(FOLLOW_term_in_normalInsertStatement2056);
					vn=term();
					state._fsp--;

					 values.add(vn); 
					}
					break;

				default :
					break loop24;
				}
			}

			match(input,184,FOLLOW_184_in_normalInsertStatement2063); 
			// Parser.g:374:7: ( K_IF K_NOT K_EXISTS )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==K_IF) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// Parser.g:374:9: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_normalInsertStatement2073); 
					match(input,K_NOT,FOLLOW_K_NOT_in_normalInsertStatement2075); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_normalInsertStatement2077); 
					 ifNotExists = true; 
					}
					break;

			}

			// Parser.g:375:7: ( usingClause[attrs] )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==K_USING) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// Parser.g:375:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_normalInsertStatement2092);
					usingClause(attrs);
					state._fsp--;

					}
					break;

			}


			          expr = new UpdateStatement.ParsedInsert(cf, attrs, columnNames, values, ifNotExists);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "normalInsertStatement"



	// $ANTLR start "jsonInsertStatement"
	// Parser.g:381:1: jsonInsertStatement[CFName cf] returns [UpdateStatement.ParsedInsertJson expr] : val= jsonValue ( K_DEFAULT ( K_NULL | ( K_UNSET ) ) )? ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? ;
	public final UpdateStatement.ParsedInsertJson jsonInsertStatement(CFName cf) throws RecognitionException {
		UpdateStatement.ParsedInsertJson expr = null;


		Json.Raw val =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        boolean ifNotExists = false;
		        boolean defaultUnset = false;
		    
		try {
			// Parser.g:387:5: (val= jsonValue ( K_DEFAULT ( K_NULL | ( K_UNSET ) ) )? ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? )
			// Parser.g:387:7: val= jsonValue ( K_DEFAULT ( K_NULL | ( K_UNSET ) ) )? ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )?
			{
			pushFollow(FOLLOW_jsonValue_in_jsonInsertStatement2138);
			val=jsonValue();
			state._fsp--;

			// Parser.g:388:7: ( K_DEFAULT ( K_NULL | ( K_UNSET ) ) )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==K_DEFAULT) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// Parser.g:388:9: K_DEFAULT ( K_NULL | ( K_UNSET ) )
					{
					match(input,K_DEFAULT,FOLLOW_K_DEFAULT_in_jsonInsertStatement2148); 
					// Parser.g:388:19: ( K_NULL | ( K_UNSET ) )
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==K_NULL) ) {
						alt27=1;
					}
					else if ( (LA27_0==K_UNSET) ) {
						alt27=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}

					switch (alt27) {
						case 1 :
							// Parser.g:388:21: K_NULL
							{
							match(input,K_NULL,FOLLOW_K_NULL_in_jsonInsertStatement2152); 
							}
							break;
						case 2 :
							// Parser.g:388:30: ( K_UNSET )
							{
							// Parser.g:388:30: ( K_UNSET )
							// Parser.g:388:32: K_UNSET
							{
							 defaultUnset = true; 
							match(input,K_UNSET,FOLLOW_K_UNSET_in_jsonInsertStatement2160); 
							}

							}
							break;

					}

					}
					break;

			}

			// Parser.g:389:7: ( K_IF K_NOT K_EXISTS )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==K_IF) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// Parser.g:389:9: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_jsonInsertStatement2176); 
					match(input,K_NOT,FOLLOW_K_NOT_in_jsonInsertStatement2178); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_jsonInsertStatement2180); 
					 ifNotExists = true; 
					}
					break;

			}

			// Parser.g:390:7: ( usingClause[attrs] )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==K_USING) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// Parser.g:390:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_jsonInsertStatement2195);
					usingClause(attrs);
					state._fsp--;

					}
					break;

			}


			          expr = new UpdateStatement.ParsedInsertJson(cf, attrs, val, defaultUnset, ifNotExists);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "jsonInsertStatement"



	// $ANTLR start "jsonValue"
	// Parser.g:396:1: jsonValue returns [Json.Raw value] : (s= STRING_LITERAL | ':' id= noncol_ident | QMARK );
	public final Json.Raw jsonValue() throws RecognitionException {
		Json.Raw value = null;


		Token s=null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:397:5: (s= STRING_LITERAL | ':' id= noncol_ident | QMARK )
			int alt31=3;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt31=1;
				}
				break;
			case 191:
				{
				alt31=2;
				}
				break;
			case QMARK:
				{
				alt31=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// Parser.g:397:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_jsonValue2230); 
					 value = new Json.Literal((s!=null?s.getText():null)); 
					}
					break;
				case 2 :
					// Parser.g:398:7: ':' id= noncol_ident
					{
					match(input,191,FOLLOW_191_in_jsonValue2240); 
					pushFollow(FOLLOW_noncol_ident_in_jsonValue2244);
					id=noncol_ident();
					state._fsp--;

					 value = newJsonBindVariables(id); 
					}
					break;
				case 3 :
					// Parser.g:399:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_jsonValue2258); 
					 value = newJsonBindVariables(null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "jsonValue"



	// $ANTLR start "usingClause"
	// Parser.g:402:1: usingClause[Attributes.Raw attrs] : K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* ;
	public final void usingClause(Attributes.Raw attrs) throws RecognitionException {
		try {
			// Parser.g:403:5: ( K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* )
			// Parser.g:403:7: K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )*
			{
			match(input,K_USING,FOLLOW_K_USING_in_usingClause2289); 
			pushFollow(FOLLOW_usingClauseObjective_in_usingClause2291);
			usingClauseObjective(attrs);
			state._fsp--;

			// Parser.g:403:43: ( K_AND usingClauseObjective[attrs] )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==K_AND) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// Parser.g:403:45: K_AND usingClauseObjective[attrs]
					{
					match(input,K_AND,FOLLOW_K_AND_in_usingClause2296); 
					pushFollow(FOLLOW_usingClauseObjective_in_usingClause2298);
					usingClauseObjective(attrs);
					state._fsp--;

					}
					break;

				default :
					break loop32;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClause"



	// $ANTLR start "usingClauseObjective"
	// Parser.g:406:1: usingClauseObjective[Attributes.Raw attrs] : ( K_TIMESTAMP ts= intValue | K_TTL t= intValue );
	public final void usingClauseObjective(Attributes.Raw attrs) throws RecognitionException {
		Term.Raw ts =null;
		Term.Raw t =null;

		try {
			// Parser.g:407:5: ( K_TIMESTAMP ts= intValue | K_TTL t= intValue )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==K_TIMESTAMP) ) {
				alt33=1;
			}
			else if ( (LA33_0==K_TTL) ) {
				alt33=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// Parser.g:407:7: K_TIMESTAMP ts= intValue
					{
					match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseObjective2320); 
					pushFollow(FOLLOW_intValue_in_usingClauseObjective2324);
					ts=intValue();
					state._fsp--;

					 attrs.timestamp = ts; 
					}
					break;
				case 2 :
					// Parser.g:408:7: K_TTL t= intValue
					{
					match(input,K_TTL,FOLLOW_K_TTL_in_usingClauseObjective2334); 
					pushFollow(FOLLOW_intValue_in_usingClauseObjective2338);
					t=intValue();
					state._fsp--;

					 attrs.timeToLive = t; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClauseObjective"



	// $ANTLR start "updateStatement"
	// Parser.g:418:1: updateStatement returns [UpdateStatement.ParsedUpdate expr] : K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? ;
	public final UpdateStatement.ParsedUpdate updateStatement() throws RecognitionException {
		UpdateStatement.ParsedUpdate expr = null;


		CFName cf =null;
		WhereClause.Builder wclause =null;
		List<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>> conditions =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations = new ArrayList<>();
		        boolean ifExists = false;
		    
		try {
			// Parser.g:424:5: ( K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? )
			// Parser.g:424:7: K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			{
			match(input,K_UPDATE,FOLLOW_K_UPDATE_in_updateStatement2372); 
			pushFollow(FOLLOW_columnFamilyName_in_updateStatement2376);
			cf=columnFamilyName();
			state._fsp--;

			// Parser.g:425:7: ( usingClause[attrs] )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==K_USING) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// Parser.g:425:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_updateStatement2386);
					usingClause(attrs);
					state._fsp--;

					}
					break;

			}

			match(input,K_SET,FOLLOW_K_SET_in_updateStatement2398); 
			pushFollow(FOLLOW_columnOperation_in_updateStatement2400);
			columnOperation(operations);
			state._fsp--;

			// Parser.g:426:41: ( ',' columnOperation[operations] )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==187) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// Parser.g:426:42: ',' columnOperation[operations]
					{
					match(input,187,FOLLOW_187_in_updateStatement2404); 
					pushFollow(FOLLOW_columnOperation_in_updateStatement2406);
					columnOperation(operations);
					state._fsp--;

					}
					break;

				default :
					break loop35;
				}
			}

			match(input,K_WHERE,FOLLOW_K_WHERE_in_updateStatement2417); 
			pushFollow(FOLLOW_whereClause_in_updateStatement2421);
			wclause=whereClause();
			state._fsp--;

			// Parser.g:428:7: ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==K_IF) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// Parser.g:428:9: K_IF ( K_EXISTS |conditions= updateConditions )
					{
					match(input,K_IF,FOLLOW_K_IF_in_updateStatement2431); 
					// Parser.g:428:14: ( K_EXISTS |conditions= updateConditions )
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==K_EXISTS) ) {
						int LA36_1 = input.LA(2);
						if ( (LA36_1==EOF||LA36_1==K_APPLY||LA36_1==K_DELETE||LA36_1==K_INSERT||LA36_1==K_UPDATE||LA36_1==192) ) {
							alt36=1;
						}
						else if ( (LA36_1==K_IN||LA36_1==182||LA36_1==190||(LA36_1 >= 193 && LA36_1 <= 198)) ) {
							alt36=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 36, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA36_0==IDENT||(LA36_0 >= K_AGGREGATE && LA36_0 <= K_ALL)||LA36_0==K_AS||LA36_0==K_ASCII||(LA36_0 >= K_BIGINT && LA36_0 <= K_BOOLEAN)||(LA36_0 >= K_CALLED && LA36_0 <= K_CLUSTERING)||(LA36_0 >= K_COMPACT && LA36_0 <= K_COUNTER)||(LA36_0 >= K_CUSTOM && LA36_0 <= K_DECIMAL)||(LA36_0 >= K_DISTINCT && LA36_0 <= K_DOUBLE)||LA36_0==K_DURATION||(LA36_0 >= K_FILTERING && LA36_0 <= K_FLOAT)||LA36_0==K_FROZEN||(LA36_0 >= K_FUNCTION && LA36_0 <= K_FUNCTIONS)||LA36_0==K_GROUP||LA36_0==K_INET||(LA36_0 >= K_INITCOND && LA36_0 <= K_INPUT)||LA36_0==K_INT||(LA36_0 >= K_JSON && LA36_0 <= K_KEYS)||(LA36_0 >= K_KEYSPACES && LA36_0 <= K_LIKE)||(LA36_0 >= K_LIST && LA36_0 <= K_MAP)||LA36_0==K_NOLOGIN||LA36_0==K_NOSUPERUSER||LA36_0==K_OPTIONS||(LA36_0 >= K_PARTITION && LA36_0 <= K_PERMISSIONS)||LA36_0==K_RETURNS||(LA36_0 >= K_ROLE && LA36_0 <= K_ROLES)||(LA36_0 >= K_SFUNC && LA36_0 <= K_TINYINT)||LA36_0==K_TRIGGER||(LA36_0 >= K_TTL && LA36_0 <= K_TYPE)||(LA36_0 >= K_USER && LA36_0 <= K_USERS)||(LA36_0 >= K_UUID && LA36_0 <= K_VARINT)||LA36_0==K_WRITETIME||LA36_0==QUOTED_NAME) ) {
						alt36=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 36, 0, input);
						throw nvae;
					}

					switch (alt36) {
						case 1 :
							// Parser.g:428:16: K_EXISTS
							{
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_updateStatement2435); 
							 ifExists = true; 
							}
							break;
						case 2 :
							// Parser.g:428:48: conditions= updateConditions
							{
							pushFollow(FOLLOW_updateConditions_in_updateStatement2443);
							conditions=updateConditions();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}


			          expr = new UpdateStatement.ParsedUpdate(cf,
			                                                   attrs,
			                                                   operations,
			                                                   wclause.build(),
			                                                   conditions == null ? Collections.<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>>emptyList() : conditions,
			                                                   ifExists);
			     
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "updateStatement"



	// $ANTLR start "updateConditions"
	// Parser.g:439:1: updateConditions returns [List<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>> conditions] : columnCondition[conditions] ( K_AND columnCondition[conditions] )* ;
	public final List<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>> updateConditions() throws RecognitionException {
		List<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>> conditions = null;


		 conditions = new ArrayList<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>>(); 
		try {
			// Parser.g:441:5: ( columnCondition[conditions] ( K_AND columnCondition[conditions] )* )
			// Parser.g:441:7: columnCondition[conditions] ( K_AND columnCondition[conditions] )*
			{
			pushFollow(FOLLOW_columnCondition_in_updateConditions2485);
			columnCondition(conditions);
			state._fsp--;

			// Parser.g:441:35: ( K_AND columnCondition[conditions] )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==K_AND) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// Parser.g:441:37: K_AND columnCondition[conditions]
					{
					match(input,K_AND,FOLLOW_K_AND_in_updateConditions2490); 
					pushFollow(FOLLOW_columnCondition_in_updateConditions2492);
					columnCondition(conditions);
					state._fsp--;

					}
					break;

				default :
					break loop38;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return conditions;
	}
	// $ANTLR end "updateConditions"



	// $ANTLR start "deleteStatement"
	// Parser.g:452:1: deleteStatement returns [DeleteStatement.Parsed expr] : K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? ;
	public final DeleteStatement.Parsed deleteStatement() throws RecognitionException {
		DeleteStatement.Parsed expr = null;


		List<Operation.RawDeletion> dels =null;
		CFName cf =null;
		WhereClause.Builder wclause =null;
		List<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>> conditions =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<Operation.RawDeletion> columnDeletions = Collections.emptyList();
		        boolean ifExists = false;
		    
		try {
			// Parser.g:458:5: ( K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? )
			// Parser.g:458:7: K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			{
			match(input,K_DELETE,FOLLOW_K_DELETE_in_deleteStatement2529); 
			// Parser.g:458:16: (dels= deleteSelection )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==IDENT||(LA39_0 >= K_AGGREGATE && LA39_0 <= K_ALL)||LA39_0==K_AS||LA39_0==K_ASCII||(LA39_0 >= K_BIGINT && LA39_0 <= K_BOOLEAN)||(LA39_0 >= K_CALLED && LA39_0 <= K_CLUSTERING)||(LA39_0 >= K_COMPACT && LA39_0 <= K_COUNTER)||(LA39_0 >= K_CUSTOM && LA39_0 <= K_DECIMAL)||(LA39_0 >= K_DISTINCT && LA39_0 <= K_DOUBLE)||LA39_0==K_DURATION||(LA39_0 >= K_EXISTS && LA39_0 <= K_FLOAT)||LA39_0==K_FROZEN||(LA39_0 >= K_FUNCTION && LA39_0 <= K_FUNCTIONS)||LA39_0==K_GROUP||LA39_0==K_INET||(LA39_0 >= K_INITCOND && LA39_0 <= K_INPUT)||LA39_0==K_INT||(LA39_0 >= K_JSON && LA39_0 <= K_KEYS)||(LA39_0 >= K_KEYSPACES && LA39_0 <= K_LIKE)||(LA39_0 >= K_LIST && LA39_0 <= K_MAP)||LA39_0==K_NOLOGIN||LA39_0==K_NOSUPERUSER||LA39_0==K_OPTIONS||(LA39_0 >= K_PARTITION && LA39_0 <= K_PERMISSIONS)||LA39_0==K_RETURNS||(LA39_0 >= K_ROLE && LA39_0 <= K_ROLES)||(LA39_0 >= K_SFUNC && LA39_0 <= K_TINYINT)||LA39_0==K_TRIGGER||(LA39_0 >= K_TTL && LA39_0 <= K_TYPE)||(LA39_0 >= K_USER && LA39_0 <= K_USERS)||(LA39_0 >= K_UUID && LA39_0 <= K_VARINT)||LA39_0==K_WRITETIME||LA39_0==QUOTED_NAME) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// Parser.g:458:18: dels= deleteSelection
					{
					pushFollow(FOLLOW_deleteSelection_in_deleteStatement2535);
					dels=deleteSelection();
					state._fsp--;

					 columnDeletions = dels; 
					}
					break;

			}

			match(input,K_FROM,FOLLOW_K_FROM_in_deleteStatement2548); 
			pushFollow(FOLLOW_columnFamilyName_in_deleteStatement2552);
			cf=columnFamilyName();
			state._fsp--;

			// Parser.g:460:7: ( usingClauseDelete[attrs] )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==K_USING) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// Parser.g:460:9: usingClauseDelete[attrs]
					{
					pushFollow(FOLLOW_usingClauseDelete_in_deleteStatement2562);
					usingClauseDelete(attrs);
					state._fsp--;

					}
					break;

			}

			match(input,K_WHERE,FOLLOW_K_WHERE_in_deleteStatement2574); 
			pushFollow(FOLLOW_whereClause_in_deleteStatement2578);
			wclause=whereClause();
			state._fsp--;

			// Parser.g:462:7: ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==K_IF) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// Parser.g:462:9: K_IF ( K_EXISTS |conditions= updateConditions )
					{
					match(input,K_IF,FOLLOW_K_IF_in_deleteStatement2588); 
					// Parser.g:462:14: ( K_EXISTS |conditions= updateConditions )
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==K_EXISTS) ) {
						int LA41_1 = input.LA(2);
						if ( (LA41_1==EOF||LA41_1==K_APPLY||LA41_1==K_DELETE||LA41_1==K_INSERT||LA41_1==K_UPDATE||LA41_1==192) ) {
							alt41=1;
						}
						else if ( (LA41_1==K_IN||LA41_1==182||LA41_1==190||(LA41_1 >= 193 && LA41_1 <= 198)) ) {
							alt41=2;
						}

						else {
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
					else if ( (LA41_0==IDENT||(LA41_0 >= K_AGGREGATE && LA41_0 <= K_ALL)||LA41_0==K_AS||LA41_0==K_ASCII||(LA41_0 >= K_BIGINT && LA41_0 <= K_BOOLEAN)||(LA41_0 >= K_CALLED && LA41_0 <= K_CLUSTERING)||(LA41_0 >= K_COMPACT && LA41_0 <= K_COUNTER)||(LA41_0 >= K_CUSTOM && LA41_0 <= K_DECIMAL)||(LA41_0 >= K_DISTINCT && LA41_0 <= K_DOUBLE)||LA41_0==K_DURATION||(LA41_0 >= K_FILTERING && LA41_0 <= K_FLOAT)||LA41_0==K_FROZEN||(LA41_0 >= K_FUNCTION && LA41_0 <= K_FUNCTIONS)||LA41_0==K_GROUP||LA41_0==K_INET||(LA41_0 >= K_INITCOND && LA41_0 <= K_INPUT)||LA41_0==K_INT||(LA41_0 >= K_JSON && LA41_0 <= K_KEYS)||(LA41_0 >= K_KEYSPACES && LA41_0 <= K_LIKE)||(LA41_0 >= K_LIST && LA41_0 <= K_MAP)||LA41_0==K_NOLOGIN||LA41_0==K_NOSUPERUSER||LA41_0==K_OPTIONS||(LA41_0 >= K_PARTITION && LA41_0 <= K_PERMISSIONS)||LA41_0==K_RETURNS||(LA41_0 >= K_ROLE && LA41_0 <= K_ROLES)||(LA41_0 >= K_SFUNC && LA41_0 <= K_TINYINT)||LA41_0==K_TRIGGER||(LA41_0 >= K_TTL && LA41_0 <= K_TYPE)||(LA41_0 >= K_USER && LA41_0 <= K_USERS)||(LA41_0 >= K_UUID && LA41_0 <= K_VARINT)||LA41_0==K_WRITETIME||LA41_0==QUOTED_NAME) ) {
						alt41=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 41, 0, input);
						throw nvae;
					}

					switch (alt41) {
						case 1 :
							// Parser.g:462:16: K_EXISTS
							{
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_deleteStatement2592); 
							 ifExists = true; 
							}
							break;
						case 2 :
							// Parser.g:462:48: conditions= updateConditions
							{
							pushFollow(FOLLOW_updateConditions_in_deleteStatement2600);
							conditions=updateConditions();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}


			          expr = new DeleteStatement.Parsed(cf,
			                                             attrs,
			                                             columnDeletions,
			                                             wclause.build(),
			                                             conditions == null ? Collections.<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>>emptyList() : conditions,
			                                             ifExists);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "deleteStatement"



	// $ANTLR start "deleteSelection"
	// Parser.g:473:1: deleteSelection returns [List<Operation.RawDeletion> operations] :t1= deleteOp ( ',' tN= deleteOp )* ;
	public final List<Operation.RawDeletion> deleteSelection() throws RecognitionException {
		List<Operation.RawDeletion> operations = null;


		Operation.RawDeletion t1 =null;
		Operation.RawDeletion tN =null;

		try {
			// Parser.g:474:5: (t1= deleteOp ( ',' tN= deleteOp )* )
			// Parser.g:474:7: t1= deleteOp ( ',' tN= deleteOp )*
			{
			 operations = new ArrayList<Operation.RawDeletion>(); 
			pushFollow(FOLLOW_deleteOp_in_deleteSelection2647);
			t1=deleteOp();
			state._fsp--;

			 operations.add(t1); 
			// Parser.g:476:11: ( ',' tN= deleteOp )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==187) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// Parser.g:476:12: ',' tN= deleteOp
					{
					match(input,187,FOLLOW_187_in_deleteSelection2662); 
					pushFollow(FOLLOW_deleteOp_in_deleteSelection2666);
					tN=deleteOp();
					state._fsp--;

					 operations.add(tN); 
					}
					break;

				default :
					break loop43;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return operations;
	}
	// $ANTLR end "deleteSelection"



	// $ANTLR start "deleteOp"
	// Parser.g:479:1: deleteOp returns [Operation.RawDeletion op] : (c= cident |c= cident '[' t= term ']' |c= cident '.' field= fident );
	public final Operation.RawDeletion deleteOp() throws RecognitionException {
		Operation.RawDeletion op = null;


		ColumnDefinition.Raw c =null;
		Term.Raw t =null;
		FieldIdentifier field =null;

		try {
			// Parser.g:480:5: (c= cident |c= cident '[' t= term ']' |c= cident '.' field= fident )
			int alt44=3;
			alt44 = dfa44.predict(input);
			switch (alt44) {
				case 1 :
					// Parser.g:480:7: c= cident
					{
					pushFollow(FOLLOW_cident_in_deleteOp2693);
					c=cident();
					state._fsp--;

					 op = new Operation.ColumnDeletion(c); 
					}
					break;
				case 2 :
					// Parser.g:481:7: c= cident '[' t= term ']'
					{
					pushFollow(FOLLOW_cident_in_deleteOp2720);
					c=cident();
					state._fsp--;

					match(input,198,FOLLOW_198_in_deleteOp2722); 
					pushFollow(FOLLOW_term_in_deleteOp2726);
					t=term();
					state._fsp--;

					match(input,200,FOLLOW_200_in_deleteOp2728); 
					 op = new Operation.ElementDeletion(c, t); 
					}
					break;
				case 3 :
					// Parser.g:482:7: c= cident '.' field= fident
					{
					pushFollow(FOLLOW_cident_in_deleteOp2740);
					c=cident();
					state._fsp--;

					match(input,190,FOLLOW_190_in_deleteOp2742); 
					pushFollow(FOLLOW_fident_in_deleteOp2746);
					field=fident();
					state._fsp--;

					 op = new Operation.FieldDeletion(c, field); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "deleteOp"



	// $ANTLR start "usingClauseDelete"
	// Parser.g:485:1: usingClauseDelete[Attributes.Raw attrs] : K_USING K_TIMESTAMP ts= intValue ;
	public final void usingClauseDelete(Attributes.Raw attrs) throws RecognitionException {
		Term.Raw ts =null;

		try {
			// Parser.g:486:5: ( K_USING K_TIMESTAMP ts= intValue )
			// Parser.g:486:7: K_USING K_TIMESTAMP ts= intValue
			{
			match(input,K_USING,FOLLOW_K_USING_in_usingClauseDelete2766); 
			match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseDelete2768); 
			pushFollow(FOLLOW_intValue_in_usingClauseDelete2772);
			ts=intValue();
			state._fsp--;

			 attrs.timestamp = ts; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClauseDelete"



	// $ANTLR start "batchStatement"
	// Parser.g:513:1: batchStatement returns [BatchStatement.Parsed expr] : K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH ;
	public final BatchStatement.Parsed batchStatement() throws RecognitionException {
		BatchStatement.Parsed expr = null;


		ModificationStatement.Parsed s =null;


		        BatchStatement.Type type = BatchStatement.Type.LOGGED;
		        List<ModificationStatement.Parsed> statements = new ArrayList<ModificationStatement.Parsed>();
		        Attributes.Raw attrs = new Attributes.Raw();
		    
		try {
			// Parser.g:519:5: ( K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH )
			// Parser.g:519:7: K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH
			{
			match(input,K_BEGIN,FOLLOW_K_BEGIN_in_batchStatement2806); 
			// Parser.g:520:7: ( K_UNLOGGED | K_COUNTER )?
			int alt45=3;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==K_UNLOGGED) ) {
				alt45=1;
			}
			else if ( (LA45_0==K_COUNTER) ) {
				alt45=2;
			}
			switch (alt45) {
				case 1 :
					// Parser.g:520:9: K_UNLOGGED
					{
					match(input,K_UNLOGGED,FOLLOW_K_UNLOGGED_in_batchStatement2816); 
					 type = BatchStatement.Type.UNLOGGED; 
					}
					break;
				case 2 :
					// Parser.g:520:63: K_COUNTER
					{
					match(input,K_COUNTER,FOLLOW_K_COUNTER_in_batchStatement2822); 
					 type = BatchStatement.Type.COUNTER; 
					}
					break;

			}

			match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement2835); 
			// Parser.g:521:15: ( usingClause[attrs] )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==K_USING) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// Parser.g:521:17: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_batchStatement2839);
					usingClause(attrs);
					state._fsp--;

					}
					break;

			}

			// Parser.g:522:11: (s= batchStatementObjective ( ';' )? )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==K_DELETE||LA48_0==K_INSERT||LA48_0==K_UPDATE) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// Parser.g:522:13: s= batchStatementObjective ( ';' )?
					{
					pushFollow(FOLLOW_batchStatementObjective_in_batchStatement2859);
					s=batchStatementObjective();
					state._fsp--;

					// Parser.g:522:39: ( ';' )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==192) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// Parser.g:522:39: ';'
							{
							match(input,192,FOLLOW_192_in_batchStatement2861); 
							}
							break;

					}

					 statements.add(s); 
					}
					break;

				default :
					break loop48;
				}
			}

			match(input,K_APPLY,FOLLOW_K_APPLY_in_batchStatement2875); 
			match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement2877); 

			          expr = new BatchStatement.Parsed(type, attrs, statements);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "batchStatement"



	// $ANTLR start "batchStatementObjective"
	// Parser.g:529:1: batchStatementObjective returns [ModificationStatement.Parsed statement] : (i= insertStatement |u= updateStatement |d= deleteStatement );
	public final ModificationStatement.Parsed batchStatementObjective() throws RecognitionException {
		ModificationStatement.Parsed statement = null;


		ModificationStatement.Parsed i =null;
		UpdateStatement.ParsedUpdate u =null;
		DeleteStatement.Parsed d =null;

		try {
			// Parser.g:530:5: (i= insertStatement |u= updateStatement |d= deleteStatement )
			int alt49=3;
			switch ( input.LA(1) ) {
			case K_INSERT:
				{
				alt49=1;
				}
				break;
			case K_UPDATE:
				{
				alt49=2;
				}
				break;
			case K_DELETE:
				{
				alt49=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}
			switch (alt49) {
				case 1 :
					// Parser.g:530:7: i= insertStatement
					{
					pushFollow(FOLLOW_insertStatement_in_batchStatementObjective2908);
					i=insertStatement();
					state._fsp--;

					 statement = i; 
					}
					break;
				case 2 :
					// Parser.g:531:7: u= updateStatement
					{
					pushFollow(FOLLOW_updateStatement_in_batchStatementObjective2921);
					u=updateStatement();
					state._fsp--;

					 statement = u; 
					}
					break;
				case 3 :
					// Parser.g:532:7: d= deleteStatement
					{
					pushFollow(FOLLOW_deleteStatement_in_batchStatementObjective2934);
					d=deleteStatement();
					state._fsp--;

					 statement = d; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return statement;
	}
	// $ANTLR end "batchStatementObjective"



	// $ANTLR start "createAggregateStatement"
	// Parser.g:535:1: createAggregateStatement returns [CreateAggregateStatement expr] : K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )? ;
	public final CreateAggregateStatement createAggregateStatement() throws RecognitionException {
		CreateAggregateStatement expr = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;
		String sfunc =null;
		CQL3Type.Raw stype =null;
		String ffunc =null;
		Term.Raw ival =null;


		        boolean orReplace = false;
		        boolean ifNotExists = false;

		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		    
		try {
			// Parser.g:542:5: ( K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )? )
			// Parser.g:542:7: K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createAggregateStatement2967); 
			// Parser.g:542:16: ( K_OR K_REPLACE )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==K_OR) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// Parser.g:542:17: K_OR K_REPLACE
					{
					match(input,K_OR,FOLLOW_K_OR_in_createAggregateStatement2970); 
					match(input,K_REPLACE,FOLLOW_K_REPLACE_in_createAggregateStatement2972); 
					 orReplace = true; 
					}
					break;

			}

			match(input,K_AGGREGATE,FOLLOW_K_AGGREGATE_in_createAggregateStatement2984); 
			// Parser.g:544:7: ( K_IF K_NOT K_EXISTS )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==K_IF) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// Parser.g:544:8: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createAggregateStatement2993); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createAggregateStatement2995); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createAggregateStatement2997); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_createAggregateStatement3011);
			fn=functionName();
			state._fsp--;

			match(input,183,FOLLOW_183_in_createAggregateStatement3019); 
			// Parser.g:547:9: (v= comparatorType ( ',' v= comparatorType )* )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==IDENT||(LA53_0 >= K_AGGREGATE && LA53_0 <= K_ALL)||LA53_0==K_AS||LA53_0==K_ASCII||(LA53_0 >= K_BIGINT && LA53_0 <= K_BOOLEAN)||(LA53_0 >= K_CALLED && LA53_0 <= K_CLUSTERING)||(LA53_0 >= K_COMPACT && LA53_0 <= K_COUNTER)||(LA53_0 >= K_CUSTOM && LA53_0 <= K_DECIMAL)||(LA53_0 >= K_DISTINCT && LA53_0 <= K_DOUBLE)||LA53_0==K_DURATION||(LA53_0 >= K_EXISTS && LA53_0 <= K_FLOAT)||LA53_0==K_FROZEN||(LA53_0 >= K_FUNCTION && LA53_0 <= K_FUNCTIONS)||LA53_0==K_GROUP||LA53_0==K_INET||(LA53_0 >= K_INITCOND && LA53_0 <= K_INPUT)||LA53_0==K_INT||(LA53_0 >= K_JSON && LA53_0 <= K_KEYS)||(LA53_0 >= K_KEYSPACES && LA53_0 <= K_LIKE)||(LA53_0 >= K_LIST && LA53_0 <= K_MAP)||LA53_0==K_NOLOGIN||LA53_0==K_NOSUPERUSER||LA53_0==K_OPTIONS||(LA53_0 >= K_PARTITION && LA53_0 <= K_PERMISSIONS)||LA53_0==K_RETURNS||(LA53_0 >= K_ROLE && LA53_0 <= K_ROLES)||(LA53_0 >= K_SET && LA53_0 <= K_TINYINT)||LA53_0==K_TRIGGER||(LA53_0 >= K_TTL && LA53_0 <= K_TYPE)||(LA53_0 >= K_USER && LA53_0 <= K_USERS)||(LA53_0 >= K_UUID && LA53_0 <= K_VARINT)||LA53_0==K_WRITETIME||LA53_0==QUOTED_NAME||LA53_0==STRING_LITERAL) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// Parser.g:548:11: v= comparatorType ( ',' v= comparatorType )*
					{
					pushFollow(FOLLOW_comparatorType_in_createAggregateStatement3043);
					v=comparatorType();
					state._fsp--;

					 argsTypes.add(v); 
					// Parser.g:549:11: ( ',' v= comparatorType )*
					loop52:
					while (true) {
						int alt52=2;
						int LA52_0 = input.LA(1);
						if ( (LA52_0==187) ) {
							alt52=1;
						}

						switch (alt52) {
						case 1 :
							// Parser.g:549:13: ',' v= comparatorType
							{
							match(input,187,FOLLOW_187_in_createAggregateStatement3059); 
							pushFollow(FOLLOW_comparatorType_in_createAggregateStatement3063);
							v=comparatorType();
							state._fsp--;

							 argsTypes.add(v); 
							}
							break;

						default :
							break loop52;
						}
					}

					}
					break;

			}

			match(input,184,FOLLOW_184_in_createAggregateStatement3087); 
			match(input,K_SFUNC,FOLLOW_K_SFUNC_in_createAggregateStatement3095); 
			pushFollow(FOLLOW_allowedFunctionName_in_createAggregateStatement3101);
			sfunc=allowedFunctionName();
			state._fsp--;

			match(input,K_STYPE,FOLLOW_K_STYPE_in_createAggregateStatement3109); 
			pushFollow(FOLLOW_comparatorType_in_createAggregateStatement3115);
			stype=comparatorType();
			state._fsp--;

			// Parser.g:554:7: ( K_FINALFUNC ffunc= allowedFunctionName )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==K_FINALFUNC) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// Parser.g:555:9: K_FINALFUNC ffunc= allowedFunctionName
					{
					match(input,K_FINALFUNC,FOLLOW_K_FINALFUNC_in_createAggregateStatement3133); 
					pushFollow(FOLLOW_allowedFunctionName_in_createAggregateStatement3139);
					ffunc=allowedFunctionName();
					state._fsp--;

					}
					break;

			}

			// Parser.g:557:7: ( K_INITCOND ival= term )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==K_INITCOND) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// Parser.g:558:9: K_INITCOND ival= term
					{
					match(input,K_INITCOND,FOLLOW_K_INITCOND_in_createAggregateStatement3166); 
					pushFollow(FOLLOW_term_in_createAggregateStatement3172);
					ival=term();
					state._fsp--;

					}
					break;

			}

			 expr = new CreateAggregateStatement(fn, argsTypes, sfunc, stype, ffunc, ival, orReplace, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createAggregateStatement"



	// $ANTLR start "dropAggregateStatement"
	// Parser.g:563:1: dropAggregateStatement returns [DropAggregateStatement expr] : K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? ;
	public final DropAggregateStatement dropAggregateStatement() throws RecognitionException {
		DropAggregateStatement expr = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        boolean ifExists = false;
		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		        boolean argsPresent = false;
		    
		try {
			// Parser.g:569:5: ( K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? )
			// Parser.g:569:7: K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropAggregateStatement3219); 
			match(input,K_AGGREGATE,FOLLOW_K_AGGREGATE_in_dropAggregateStatement3221); 
			// Parser.g:570:7: ( K_IF K_EXISTS )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==K_IF) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// Parser.g:570:8: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropAggregateStatement3230); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropAggregateStatement3232); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_dropAggregateStatement3247);
			fn=functionName();
			state._fsp--;

			// Parser.g:572:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==183) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// Parser.g:573:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,183,FOLLOW_183_in_dropAggregateStatement3265); 
					// Parser.g:574:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==IDENT||(LA58_0 >= K_AGGREGATE && LA58_0 <= K_ALL)||LA58_0==K_AS||LA58_0==K_ASCII||(LA58_0 >= K_BIGINT && LA58_0 <= K_BOOLEAN)||(LA58_0 >= K_CALLED && LA58_0 <= K_CLUSTERING)||(LA58_0 >= K_COMPACT && LA58_0 <= K_COUNTER)||(LA58_0 >= K_CUSTOM && LA58_0 <= K_DECIMAL)||(LA58_0 >= K_DISTINCT && LA58_0 <= K_DOUBLE)||LA58_0==K_DURATION||(LA58_0 >= K_EXISTS && LA58_0 <= K_FLOAT)||LA58_0==K_FROZEN||(LA58_0 >= K_FUNCTION && LA58_0 <= K_FUNCTIONS)||LA58_0==K_GROUP||LA58_0==K_INET||(LA58_0 >= K_INITCOND && LA58_0 <= K_INPUT)||LA58_0==K_INT||(LA58_0 >= K_JSON && LA58_0 <= K_KEYS)||(LA58_0 >= K_KEYSPACES && LA58_0 <= K_LIKE)||(LA58_0 >= K_LIST && LA58_0 <= K_MAP)||LA58_0==K_NOLOGIN||LA58_0==K_NOSUPERUSER||LA58_0==K_OPTIONS||(LA58_0 >= K_PARTITION && LA58_0 <= K_PERMISSIONS)||LA58_0==K_RETURNS||(LA58_0 >= K_ROLE && LA58_0 <= K_ROLES)||(LA58_0 >= K_SET && LA58_0 <= K_TINYINT)||LA58_0==K_TRIGGER||(LA58_0 >= K_TTL && LA58_0 <= K_TYPE)||(LA58_0 >= K_USER && LA58_0 <= K_USERS)||(LA58_0 >= K_UUID && LA58_0 <= K_VARINT)||LA58_0==K_WRITETIME||LA58_0==QUOTED_NAME||LA58_0==STRING_LITERAL) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// Parser.g:575:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_dropAggregateStatement3293);
							v=comparatorType();
							state._fsp--;

							 argsTypes.add(v); 
							// Parser.g:576:13: ( ',' v= comparatorType )*
							loop57:
							while (true) {
								int alt57=2;
								int LA57_0 = input.LA(1);
								if ( (LA57_0==187) ) {
									alt57=1;
								}

								switch (alt57) {
								case 1 :
									// Parser.g:576:15: ',' v= comparatorType
									{
									match(input,187,FOLLOW_187_in_dropAggregateStatement3311); 
									pushFollow(FOLLOW_comparatorType_in_dropAggregateStatement3315);
									v=comparatorType();
									state._fsp--;

									 argsTypes.add(v); 
									}
									break;

								default :
									break loop57;
								}
							}

							}
							break;

					}

					match(input,184,FOLLOW_184_in_dropAggregateStatement3343); 
					 argsPresent = true; 
					}
					break;

			}

			 expr = new DropAggregateStatement(fn, argsTypes, argsPresent, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropAggregateStatement"



	// $ANTLR start "createFunctionStatement"
	// Parser.g:584:1: createFunctionStatement returns [CreateFunctionStatement expr] : K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS rt= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL ;
	public final CreateFunctionStatement createFunctionStatement() throws RecognitionException {
		CreateFunctionStatement expr = null;


		Token language=null;
		Token body=null;
		FunctionName fn =null;
		ColumnIdentifier k =null;
		CQL3Type.Raw v =null;
		CQL3Type.Raw rt =null;


		        boolean orReplace = false;
		        boolean ifNotExists = false;

		        List<ColumnIdentifier> argsNames = new ArrayList<>();
		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		        boolean calledOnNullInput = false;
		    
		try {
			// Parser.g:593:5: ( K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS rt= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL )
			// Parser.g:593:7: K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS rt= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createFunctionStatement3400); 
			// Parser.g:593:16: ( K_OR K_REPLACE )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==K_OR) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// Parser.g:593:17: K_OR K_REPLACE
					{
					match(input,K_OR,FOLLOW_K_OR_in_createFunctionStatement3403); 
					match(input,K_REPLACE,FOLLOW_K_REPLACE_in_createFunctionStatement3405); 
					 orReplace = true; 
					}
					break;

			}

			match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_createFunctionStatement3417); 
			// Parser.g:595:7: ( K_IF K_NOT K_EXISTS )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==K_IF) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// Parser.g:595:8: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createFunctionStatement3426); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createFunctionStatement3428); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createFunctionStatement3430); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_createFunctionStatement3444);
			fn=functionName();
			state._fsp--;

			match(input,183,FOLLOW_183_in_createFunctionStatement3452); 
			// Parser.g:598:9: (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==IDENT||(LA63_0 >= K_AGGREGATE && LA63_0 <= K_ALL)||LA63_0==K_AS||LA63_0==K_ASCII||(LA63_0 >= K_BIGINT && LA63_0 <= K_BOOLEAN)||(LA63_0 >= K_CALLED && LA63_0 <= K_CLUSTERING)||(LA63_0 >= K_COMPACT && LA63_0 <= K_COUNTER)||(LA63_0 >= K_CUSTOM && LA63_0 <= K_DECIMAL)||(LA63_0 >= K_DISTINCT && LA63_0 <= K_DOUBLE)||LA63_0==K_DURATION||(LA63_0 >= K_EXISTS && LA63_0 <= K_FLOAT)||LA63_0==K_FROZEN||(LA63_0 >= K_FUNCTION && LA63_0 <= K_FUNCTIONS)||LA63_0==K_GROUP||LA63_0==K_INET||(LA63_0 >= K_INITCOND && LA63_0 <= K_INPUT)||LA63_0==K_INT||(LA63_0 >= K_JSON && LA63_0 <= K_KEYS)||(LA63_0 >= K_KEYSPACES && LA63_0 <= K_LIKE)||(LA63_0 >= K_LIST && LA63_0 <= K_MAP)||LA63_0==K_NOLOGIN||LA63_0==K_NOSUPERUSER||LA63_0==K_OPTIONS||(LA63_0 >= K_PARTITION && LA63_0 <= K_PERMISSIONS)||LA63_0==K_RETURNS||(LA63_0 >= K_ROLE && LA63_0 <= K_ROLES)||(LA63_0 >= K_SFUNC && LA63_0 <= K_TINYINT)||LA63_0==K_TRIGGER||(LA63_0 >= K_TTL && LA63_0 <= K_TYPE)||(LA63_0 >= K_USER && LA63_0 <= K_USERS)||(LA63_0 >= K_UUID && LA63_0 <= K_VARINT)||LA63_0==K_WRITETIME||LA63_0==QUOTED_NAME) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// Parser.g:599:11: k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )*
					{
					pushFollow(FOLLOW_noncol_ident_in_createFunctionStatement3476);
					k=noncol_ident();
					state._fsp--;

					pushFollow(FOLLOW_comparatorType_in_createFunctionStatement3480);
					v=comparatorType();
					state._fsp--;

					 argsNames.add(k); argsTypes.add(v); 
					// Parser.g:600:11: ( ',' k= noncol_ident v= comparatorType )*
					loop62:
					while (true) {
						int alt62=2;
						int LA62_0 = input.LA(1);
						if ( (LA62_0==187) ) {
							alt62=1;
						}

						switch (alt62) {
						case 1 :
							// Parser.g:600:13: ',' k= noncol_ident v= comparatorType
							{
							match(input,187,FOLLOW_187_in_createFunctionStatement3496); 
							pushFollow(FOLLOW_noncol_ident_in_createFunctionStatement3500);
							k=noncol_ident();
							state._fsp--;

							pushFollow(FOLLOW_comparatorType_in_createFunctionStatement3504);
							v=comparatorType();
							state._fsp--;

							 argsNames.add(k); argsTypes.add(v); 
							}
							break;

						default :
							break loop62;
						}
					}

					}
					break;

			}

			match(input,184,FOLLOW_184_in_createFunctionStatement3528); 
			// Parser.g:603:7: ( ( K_RETURNS K_NULL ) | ( K_CALLED ) )
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==K_RETURNS) ) {
				alt64=1;
			}
			else if ( (LA64_0==K_CALLED) ) {
				alt64=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// Parser.g:603:9: ( K_RETURNS K_NULL )
					{
					// Parser.g:603:9: ( K_RETURNS K_NULL )
					// Parser.g:603:10: K_RETURNS K_NULL
					{
					match(input,K_RETURNS,FOLLOW_K_RETURNS_in_createFunctionStatement3539); 
					match(input,K_NULL,FOLLOW_K_NULL_in_createFunctionStatement3541); 
					}

					}
					break;
				case 2 :
					// Parser.g:603:30: ( K_CALLED )
					{
					// Parser.g:603:30: ( K_CALLED )
					// Parser.g:603:31: K_CALLED
					{
					match(input,K_CALLED,FOLLOW_K_CALLED_in_createFunctionStatement3547); 
					 calledOnNullInput=true; 
					}

					}
					break;

			}

			match(input,K_ON,FOLLOW_K_ON_in_createFunctionStatement3553); 
			match(input,K_NULL,FOLLOW_K_NULL_in_createFunctionStatement3555); 
			match(input,K_INPUT,FOLLOW_K_INPUT_in_createFunctionStatement3557); 
			match(input,K_RETURNS,FOLLOW_K_RETURNS_in_createFunctionStatement3565); 
			pushFollow(FOLLOW_comparatorType_in_createFunctionStatement3571);
			rt=comparatorType();
			state._fsp--;

			match(input,K_LANGUAGE,FOLLOW_K_LANGUAGE_in_createFunctionStatement3579); 
			language=(Token)match(input,IDENT,FOLLOW_IDENT_in_createFunctionStatement3585); 
			match(input,K_AS,FOLLOW_K_AS_in_createFunctionStatement3593); 
			body=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createFunctionStatement3599); 
			 expr = new CreateFunctionStatement(fn, (language!=null?language.getText():null).toLowerCase(), (body!=null?body.getText():null),
			                                            argsNames, argsTypes, rt, calledOnNullInput, orReplace, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createFunctionStatement"



	// $ANTLR start "dropFunctionStatement"
	// Parser.g:611:1: dropFunctionStatement returns [DropFunctionStatement expr] : K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? ;
	public final DropFunctionStatement dropFunctionStatement() throws RecognitionException {
		DropFunctionStatement expr = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        boolean ifExists = false;
		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		        boolean argsPresent = false;
		    
		try {
			// Parser.g:617:5: ( K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? )
			// Parser.g:617:7: K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropFunctionStatement3637); 
			match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_dropFunctionStatement3639); 
			// Parser.g:618:7: ( K_IF K_EXISTS )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==K_IF) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// Parser.g:618:8: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropFunctionStatement3648); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropFunctionStatement3650); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_dropFunctionStatement3665);
			fn=functionName();
			state._fsp--;

			// Parser.g:620:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==183) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// Parser.g:621:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,183,FOLLOW_183_in_dropFunctionStatement3683); 
					// Parser.g:622:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0==IDENT||(LA67_0 >= K_AGGREGATE && LA67_0 <= K_ALL)||LA67_0==K_AS||LA67_0==K_ASCII||(LA67_0 >= K_BIGINT && LA67_0 <= K_BOOLEAN)||(LA67_0 >= K_CALLED && LA67_0 <= K_CLUSTERING)||(LA67_0 >= K_COMPACT && LA67_0 <= K_COUNTER)||(LA67_0 >= K_CUSTOM && LA67_0 <= K_DECIMAL)||(LA67_0 >= K_DISTINCT && LA67_0 <= K_DOUBLE)||LA67_0==K_DURATION||(LA67_0 >= K_EXISTS && LA67_0 <= K_FLOAT)||LA67_0==K_FROZEN||(LA67_0 >= K_FUNCTION && LA67_0 <= K_FUNCTIONS)||LA67_0==K_GROUP||LA67_0==K_INET||(LA67_0 >= K_INITCOND && LA67_0 <= K_INPUT)||LA67_0==K_INT||(LA67_0 >= K_JSON && LA67_0 <= K_KEYS)||(LA67_0 >= K_KEYSPACES && LA67_0 <= K_LIKE)||(LA67_0 >= K_LIST && LA67_0 <= K_MAP)||LA67_0==K_NOLOGIN||LA67_0==K_NOSUPERUSER||LA67_0==K_OPTIONS||(LA67_0 >= K_PARTITION && LA67_0 <= K_PERMISSIONS)||LA67_0==K_RETURNS||(LA67_0 >= K_ROLE && LA67_0 <= K_ROLES)||(LA67_0 >= K_SET && LA67_0 <= K_TINYINT)||LA67_0==K_TRIGGER||(LA67_0 >= K_TTL && LA67_0 <= K_TYPE)||(LA67_0 >= K_USER && LA67_0 <= K_USERS)||(LA67_0 >= K_UUID && LA67_0 <= K_VARINT)||LA67_0==K_WRITETIME||LA67_0==QUOTED_NAME||LA67_0==STRING_LITERAL) ) {
						alt67=1;
					}
					switch (alt67) {
						case 1 :
							// Parser.g:623:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_dropFunctionStatement3711);
							v=comparatorType();
							state._fsp--;

							 argsTypes.add(v); 
							// Parser.g:624:13: ( ',' v= comparatorType )*
							loop66:
							while (true) {
								int alt66=2;
								int LA66_0 = input.LA(1);
								if ( (LA66_0==187) ) {
									alt66=1;
								}

								switch (alt66) {
								case 1 :
									// Parser.g:624:15: ',' v= comparatorType
									{
									match(input,187,FOLLOW_187_in_dropFunctionStatement3729); 
									pushFollow(FOLLOW_comparatorType_in_dropFunctionStatement3733);
									v=comparatorType();
									state._fsp--;

									 argsTypes.add(v); 
									}
									break;

								default :
									break loop66;
								}
							}

							}
							break;

					}

					match(input,184,FOLLOW_184_in_dropFunctionStatement3761); 
					 argsPresent = true; 
					}
					break;

			}

			 expr = new DropFunctionStatement(fn, argsTypes, argsPresent, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropFunctionStatement"



	// $ANTLR start "createKeyspaceStatement"
	// Parser.g:635:1: createKeyspaceStatement returns [CreateKeyspaceStatement expr] : K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] ;
	public final CreateKeyspaceStatement createKeyspaceStatement() throws RecognitionException {
		CreateKeyspaceStatement expr = null;


		String ks =null;


		        KeyspaceAttributes attrs = new KeyspaceAttributes();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:640:5: ( K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] )
			// Parser.g:640:7: K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs]
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createKeyspaceStatement3820); 
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_createKeyspaceStatement3822); 
			// Parser.g:640:27: ( K_IF K_NOT K_EXISTS )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==K_IF) ) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// Parser.g:640:28: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createKeyspaceStatement3825); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createKeyspaceStatement3827); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createKeyspaceStatement3829); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_keyspaceName_in_createKeyspaceStatement3838);
			ks=keyspaceName();
			state._fsp--;

			match(input,K_WITH,FOLLOW_K_WITH_in_createKeyspaceStatement3846); 
			pushFollow(FOLLOW_properties_in_createKeyspaceStatement3848);
			properties(attrs);
			state._fsp--;

			 expr = new CreateKeyspaceStatement(ks, attrs, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createKeyspaceStatement"



	// $ANTLR start "createTableStatement"
	// Parser.g:651:1: createTableStatement returns [CreateTableStatement.RawStatement expr] : K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] ;
	public final CreateTableStatement.RawStatement createTableStatement() throws RecognitionException {
		CreateTableStatement.RawStatement expr = null;


		CFName cf =null;

		 boolean ifNotExists = false; 
		try {
			// Parser.g:653:5: ( K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] )
			// Parser.g:653:7: K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr]
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTableStatement3883); 
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_createTableStatement3885); 
			// Parser.g:653:31: ( K_IF K_NOT K_EXISTS )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==K_IF) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// Parser.g:653:32: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTableStatement3888); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createTableStatement3890); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTableStatement3892); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_createTableStatement3907);
			cf=columnFamilyName();
			state._fsp--;

			 expr = new CreateTableStatement.RawStatement(cf, ifNotExists); 
			pushFollow(FOLLOW_cfamDefinition_in_createTableStatement3917);
			cfamDefinition(expr);
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createTableStatement"



	// $ANTLR start "cfamDefinition"
	// Parser.g:658:1: cfamDefinition[CreateTableStatement.RawStatement expr] : '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )? ;
	public final void cfamDefinition(CreateTableStatement.RawStatement expr) throws RecognitionException {
		try {
			// Parser.g:659:5: ( '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )? )
			// Parser.g:659:7: '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )?
			{
			match(input,183,FOLLOW_183_in_cfamDefinition3936); 
			pushFollow(FOLLOW_cfamColumns_in_cfamDefinition3938);
			cfamColumns(expr);
			state._fsp--;

			// Parser.g:659:29: ( ',' ( cfamColumns[expr] )? )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==187) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// Parser.g:659:31: ',' ( cfamColumns[expr] )?
					{
					match(input,187,FOLLOW_187_in_cfamDefinition3943); 
					// Parser.g:659:35: ( cfamColumns[expr] )?
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==IDENT||(LA71_0 >= K_AGGREGATE && LA71_0 <= K_ALL)||LA71_0==K_AS||LA71_0==K_ASCII||(LA71_0 >= K_BIGINT && LA71_0 <= K_BOOLEAN)||(LA71_0 >= K_CALLED && LA71_0 <= K_CLUSTERING)||(LA71_0 >= K_COMPACT && LA71_0 <= K_COUNTER)||(LA71_0 >= K_CUSTOM && LA71_0 <= K_DECIMAL)||(LA71_0 >= K_DISTINCT && LA71_0 <= K_DOUBLE)||LA71_0==K_DURATION||(LA71_0 >= K_EXISTS && LA71_0 <= K_FLOAT)||LA71_0==K_FROZEN||(LA71_0 >= K_FUNCTION && LA71_0 <= K_FUNCTIONS)||LA71_0==K_GROUP||LA71_0==K_INET||(LA71_0 >= K_INITCOND && LA71_0 <= K_INPUT)||LA71_0==K_INT||(LA71_0 >= K_JSON && LA71_0 <= K_KEYS)||(LA71_0 >= K_KEYSPACES && LA71_0 <= K_LIKE)||(LA71_0 >= K_LIST && LA71_0 <= K_MAP)||LA71_0==K_NOLOGIN||LA71_0==K_NOSUPERUSER||LA71_0==K_OPTIONS||(LA71_0 >= K_PARTITION && LA71_0 <= K_PRIMARY)||LA71_0==K_RETURNS||(LA71_0 >= K_ROLE && LA71_0 <= K_ROLES)||(LA71_0 >= K_SFUNC && LA71_0 <= K_TINYINT)||LA71_0==K_TRIGGER||(LA71_0 >= K_TTL && LA71_0 <= K_TYPE)||(LA71_0 >= K_USER && LA71_0 <= K_USERS)||(LA71_0 >= K_UUID && LA71_0 <= K_VARINT)||LA71_0==K_WRITETIME||LA71_0==QUOTED_NAME) ) {
						alt71=1;
					}
					switch (alt71) {
						case 1 :
							// Parser.g:659:35: cfamColumns[expr]
							{
							pushFollow(FOLLOW_cfamColumns_in_cfamDefinition3945);
							cfamColumns(expr);
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop72;
				}
			}

			match(input,184,FOLLOW_184_in_cfamDefinition3952); 
			// Parser.g:660:7: ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )?
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==K_WITH) ) {
				alt74=1;
			}
			switch (alt74) {
				case 1 :
					// Parser.g:660:9: K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )*
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_cfamDefinition3962); 
					pushFollow(FOLLOW_cfamProperty_in_cfamDefinition3964);
					cfamProperty(expr.properties);
					state._fsp--;

					// Parser.g:660:46: ( K_AND cfamProperty[expr.properties] )*
					loop73:
					while (true) {
						int alt73=2;
						int LA73_0 = input.LA(1);
						if ( (LA73_0==K_AND) ) {
							alt73=1;
						}

						switch (alt73) {
						case 1 :
							// Parser.g:660:48: K_AND cfamProperty[expr.properties]
							{
							match(input,K_AND,FOLLOW_K_AND_in_cfamDefinition3969); 
							pushFollow(FOLLOW_cfamProperty_in_cfamDefinition3971);
							cfamProperty(expr.properties);
							state._fsp--;

							}
							break;

						default :
							break loop73;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfamDefinition"



	// $ANTLR start "cfamColumns"
	// Parser.g:663:1: cfamColumns[CreateTableStatement.RawStatement expr] : (k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')' );
	public final void cfamColumns(CreateTableStatement.RawStatement expr) throws RecognitionException {
		ColumnIdentifier k =null;
		CQL3Type.Raw v =null;
		ColumnIdentifier c =null;

		try {
			// Parser.g:664:5: (k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')' )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==IDENT||(LA78_0 >= K_AGGREGATE && LA78_0 <= K_ALL)||LA78_0==K_AS||LA78_0==K_ASCII||(LA78_0 >= K_BIGINT && LA78_0 <= K_BOOLEAN)||(LA78_0 >= K_CALLED && LA78_0 <= K_CLUSTERING)||(LA78_0 >= K_COMPACT && LA78_0 <= K_COUNTER)||(LA78_0 >= K_CUSTOM && LA78_0 <= K_DECIMAL)||(LA78_0 >= K_DISTINCT && LA78_0 <= K_DOUBLE)||LA78_0==K_DURATION||(LA78_0 >= K_EXISTS && LA78_0 <= K_FLOAT)||LA78_0==K_FROZEN||(LA78_0 >= K_FUNCTION && LA78_0 <= K_FUNCTIONS)||LA78_0==K_GROUP||LA78_0==K_INET||(LA78_0 >= K_INITCOND && LA78_0 <= K_INPUT)||LA78_0==K_INT||(LA78_0 >= K_JSON && LA78_0 <= K_KEYS)||(LA78_0 >= K_KEYSPACES && LA78_0 <= K_LIKE)||(LA78_0 >= K_LIST && LA78_0 <= K_MAP)||LA78_0==K_NOLOGIN||LA78_0==K_NOSUPERUSER||LA78_0==K_OPTIONS||(LA78_0 >= K_PARTITION && LA78_0 <= K_PERMISSIONS)||LA78_0==K_RETURNS||(LA78_0 >= K_ROLE && LA78_0 <= K_ROLES)||(LA78_0 >= K_SFUNC && LA78_0 <= K_TINYINT)||LA78_0==K_TRIGGER||(LA78_0 >= K_TTL && LA78_0 <= K_TYPE)||(LA78_0 >= K_USER && LA78_0 <= K_USERS)||(LA78_0 >= K_UUID && LA78_0 <= K_VARINT)||LA78_0==K_WRITETIME||LA78_0==QUOTED_NAME) ) {
				alt78=1;
			}
			else if ( (LA78_0==K_PRIMARY) ) {
				alt78=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}

			switch (alt78) {
				case 1 :
					// Parser.g:664:7: k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )?
					{
					pushFollow(FOLLOW_ident_in_cfamColumns3997);
					k=ident();
					state._fsp--;

					pushFollow(FOLLOW_comparatorType_in_cfamColumns4001);
					v=comparatorType();
					state._fsp--;

					 boolean isStatic=false; 
					// Parser.g:664:60: ( K_STATIC )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==K_STATIC) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// Parser.g:664:61: K_STATIC
							{
							match(input,K_STATIC,FOLLOW_K_STATIC_in_cfamColumns4006); 
							isStatic = true;
							}
							break;

					}

					 expr.addDefinition(k, v, isStatic); 
					// Parser.g:665:9: ( K_PRIMARY K_KEY )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0==K_PRIMARY) ) {
						alt76=1;
					}
					switch (alt76) {
						case 1 :
							// Parser.g:665:10: K_PRIMARY K_KEY
							{
							match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns4023); 
							match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns4025); 
							 expr.addKeyAliases(Collections.singletonList(k)); 
							}
							break;

					}

					}
					break;
				case 2 :
					// Parser.g:666:7: K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')'
					{
					match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns4037); 
					match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns4039); 
					match(input,183,FOLLOW_183_in_cfamColumns4041); 
					pushFollow(FOLLOW_pkDef_in_cfamColumns4043);
					pkDef(expr);
					state._fsp--;

					// Parser.g:666:39: ( ',' c= ident )*
					loop77:
					while (true) {
						int alt77=2;
						int LA77_0 = input.LA(1);
						if ( (LA77_0==187) ) {
							alt77=1;
						}

						switch (alt77) {
						case 1 :
							// Parser.g:666:40: ',' c= ident
							{
							match(input,187,FOLLOW_187_in_cfamColumns4047); 
							pushFollow(FOLLOW_ident_in_cfamColumns4051);
							c=ident();
							state._fsp--;

							 expr.addColumnAlias(c); 
							}
							break;

						default :
							break loop77;
						}
					}

					match(input,184,FOLLOW_184_in_cfamColumns4058); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfamColumns"



	// $ANTLR start "pkDef"
	// Parser.g:669:1: pkDef[CreateTableStatement.RawStatement expr] : (k= ident | '(' k1= ident ( ',' kn= ident )* ')' );
	public final void pkDef(CreateTableStatement.RawStatement expr) throws RecognitionException {
		ColumnIdentifier k =null;
		ColumnIdentifier k1 =null;
		ColumnIdentifier kn =null;

		try {
			// Parser.g:670:5: (k= ident | '(' k1= ident ( ',' kn= ident )* ')' )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==IDENT||(LA80_0 >= K_AGGREGATE && LA80_0 <= K_ALL)||LA80_0==K_AS||LA80_0==K_ASCII||(LA80_0 >= K_BIGINT && LA80_0 <= K_BOOLEAN)||(LA80_0 >= K_CALLED && LA80_0 <= K_CLUSTERING)||(LA80_0 >= K_COMPACT && LA80_0 <= K_COUNTER)||(LA80_0 >= K_CUSTOM && LA80_0 <= K_DECIMAL)||(LA80_0 >= K_DISTINCT && LA80_0 <= K_DOUBLE)||LA80_0==K_DURATION||(LA80_0 >= K_EXISTS && LA80_0 <= K_FLOAT)||LA80_0==K_FROZEN||(LA80_0 >= K_FUNCTION && LA80_0 <= K_FUNCTIONS)||LA80_0==K_GROUP||LA80_0==K_INET||(LA80_0 >= K_INITCOND && LA80_0 <= K_INPUT)||LA80_0==K_INT||(LA80_0 >= K_JSON && LA80_0 <= K_KEYS)||(LA80_0 >= K_KEYSPACES && LA80_0 <= K_LIKE)||(LA80_0 >= K_LIST && LA80_0 <= K_MAP)||LA80_0==K_NOLOGIN||LA80_0==K_NOSUPERUSER||LA80_0==K_OPTIONS||(LA80_0 >= K_PARTITION && LA80_0 <= K_PERMISSIONS)||LA80_0==K_RETURNS||(LA80_0 >= K_ROLE && LA80_0 <= K_ROLES)||(LA80_0 >= K_SFUNC && LA80_0 <= K_TINYINT)||LA80_0==K_TRIGGER||(LA80_0 >= K_TTL && LA80_0 <= K_TYPE)||(LA80_0 >= K_USER && LA80_0 <= K_USERS)||(LA80_0 >= K_UUID && LA80_0 <= K_VARINT)||LA80_0==K_WRITETIME||LA80_0==QUOTED_NAME) ) {
				alt80=1;
			}
			else if ( (LA80_0==183) ) {
				alt80=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// Parser.g:670:7: k= ident
					{
					pushFollow(FOLLOW_ident_in_pkDef4078);
					k=ident();
					state._fsp--;

					 expr.addKeyAliases(Collections.singletonList(k)); 
					}
					break;
				case 2 :
					// Parser.g:671:7: '(' k1= ident ( ',' kn= ident )* ')'
					{
					match(input,183,FOLLOW_183_in_pkDef4088); 
					 List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>(); 
					pushFollow(FOLLOW_ident_in_pkDef4094);
					k1=ident();
					state._fsp--;

					 l.add(k1); 
					// Parser.g:671:101: ( ',' kn= ident )*
					loop79:
					while (true) {
						int alt79=2;
						int LA79_0 = input.LA(1);
						if ( (LA79_0==187) ) {
							alt79=1;
						}

						switch (alt79) {
						case 1 :
							// Parser.g:671:103: ',' kn= ident
							{
							match(input,187,FOLLOW_187_in_pkDef4100); 
							pushFollow(FOLLOW_ident_in_pkDef4104);
							kn=ident();
							state._fsp--;

							 l.add(kn); 
							}
							break;

						default :
							break loop79;
						}
					}

					match(input,184,FOLLOW_184_in_pkDef4111); 
					 expr.addKeyAliases(l); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "pkDef"



	// $ANTLR start "cfamProperty"
	// Parser.g:674:1: cfamProperty[CFProperties props] : ( property[props.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[props] ( ',' cfamOrdering[props] )* ')' );
	public final void cfamProperty(CFProperties props) throws RecognitionException {
		try {
			// Parser.g:675:5: ( property[props.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[props] ( ',' cfamOrdering[props] )* ')' )
			int alt82=3;
			switch ( input.LA(1) ) {
			case IDENT:
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QUOTED_NAME:
				{
				alt82=1;
				}
				break;
			case K_COMPACT:
				{
				int LA82_2 = input.LA(2);
				if ( (LA82_2==K_STORAGE) ) {
					alt82=2;
				}
				else if ( (LA82_2==195) ) {
					alt82=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 82, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_CLUSTERING:
				{
				int LA82_3 = input.LA(2);
				if ( (LA82_3==K_ORDER) ) {
					alt82=3;
				}
				else if ( (LA82_3==195) ) {
					alt82=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 82, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}
			switch (alt82) {
				case 1 :
					// Parser.g:675:7: property[props.properties]
					{
					pushFollow(FOLLOW_property_in_cfamProperty4131);
					property(props.properties);
					state._fsp--;

					}
					break;
				case 2 :
					// Parser.g:676:7: K_COMPACT K_STORAGE
					{
					match(input,K_COMPACT,FOLLOW_K_COMPACT_in_cfamProperty4140); 
					match(input,K_STORAGE,FOLLOW_K_STORAGE_in_cfamProperty4142); 
					 props.setCompactStorage(); 
					}
					break;
				case 3 :
					// Parser.g:677:7: K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[props] ( ',' cfamOrdering[props] )* ')'
					{
					match(input,K_CLUSTERING,FOLLOW_K_CLUSTERING_in_cfamProperty4152); 
					match(input,K_ORDER,FOLLOW_K_ORDER_in_cfamProperty4154); 
					match(input,K_BY,FOLLOW_K_BY_in_cfamProperty4156); 
					match(input,183,FOLLOW_183_in_cfamProperty4158); 
					pushFollow(FOLLOW_cfamOrdering_in_cfamProperty4160);
					cfamOrdering(props);
					state._fsp--;

					// Parser.g:677:57: ( ',' cfamOrdering[props] )*
					loop81:
					while (true) {
						int alt81=2;
						int LA81_0 = input.LA(1);
						if ( (LA81_0==187) ) {
							alt81=1;
						}

						switch (alt81) {
						case 1 :
							// Parser.g:677:58: ',' cfamOrdering[props]
							{
							match(input,187,FOLLOW_187_in_cfamProperty4164); 
							pushFollow(FOLLOW_cfamOrdering_in_cfamProperty4166);
							cfamOrdering(props);
							state._fsp--;

							}
							break;

						default :
							break loop81;
						}
					}

					match(input,184,FOLLOW_184_in_cfamProperty4171); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfamProperty"



	// $ANTLR start "cfamOrdering"
	// Parser.g:680:1: cfamOrdering[CFProperties props] : k= ident ( K_ASC | K_DESC ) ;
	public final void cfamOrdering(CFProperties props) throws RecognitionException {
		ColumnIdentifier k =null;

		 boolean reversed=false; 
		try {
			// Parser.g:682:5: (k= ident ( K_ASC | K_DESC ) )
			// Parser.g:682:7: k= ident ( K_ASC | K_DESC )
			{
			pushFollow(FOLLOW_ident_in_cfamOrdering4199);
			k=ident();
			state._fsp--;

			// Parser.g:682:15: ( K_ASC | K_DESC )
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==K_ASC) ) {
				alt83=1;
			}
			else if ( (LA83_0==K_DESC) ) {
				alt83=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}

			switch (alt83) {
				case 1 :
					// Parser.g:682:16: K_ASC
					{
					match(input,K_ASC,FOLLOW_K_ASC_in_cfamOrdering4202); 
					}
					break;
				case 2 :
					// Parser.g:682:24: K_DESC
					{
					match(input,K_DESC,FOLLOW_K_DESC_in_cfamOrdering4206); 
					 reversed=true;
					}
					break;

			}

			 props.setOrdering(k, reversed); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfamOrdering"



	// $ANTLR start "createTypeStatement"
	// Parser.g:693:1: createTypeStatement returns [CreateTypeStatement expr] : K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')' ;
	public final CreateTypeStatement createTypeStatement() throws RecognitionException {
		CreateTypeStatement expr = null;


		UTName tn =null;

		 boolean ifNotExists = false; 
		try {
			// Parser.g:695:5: ( K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')' )
			// Parser.g:695:7: K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')'
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTypeStatement4245); 
			match(input,K_TYPE,FOLLOW_K_TYPE_in_createTypeStatement4247); 
			// Parser.g:695:23: ( K_IF K_NOT K_EXISTS )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==K_IF) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// Parser.g:695:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTypeStatement4250); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createTypeStatement4252); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTypeStatement4254); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_userTypeName_in_createTypeStatement4272);
			tn=userTypeName();
			state._fsp--;

			 expr = new CreateTypeStatement(tn, ifNotExists); 
			match(input,183,FOLLOW_183_in_createTypeStatement4285); 
			pushFollow(FOLLOW_typeColumns_in_createTypeStatement4287);
			typeColumns(expr);
			state._fsp--;

			// Parser.g:697:32: ( ',' ( typeColumns[expr] )? )*
			loop86:
			while (true) {
				int alt86=2;
				int LA86_0 = input.LA(1);
				if ( (LA86_0==187) ) {
					alt86=1;
				}

				switch (alt86) {
				case 1 :
					// Parser.g:697:34: ',' ( typeColumns[expr] )?
					{
					match(input,187,FOLLOW_187_in_createTypeStatement4292); 
					// Parser.g:697:38: ( typeColumns[expr] )?
					int alt85=2;
					int LA85_0 = input.LA(1);
					if ( (LA85_0==IDENT||(LA85_0 >= K_AGGREGATE && LA85_0 <= K_ALL)||LA85_0==K_AS||LA85_0==K_ASCII||(LA85_0 >= K_BIGINT && LA85_0 <= K_BOOLEAN)||(LA85_0 >= K_CALLED && LA85_0 <= K_CLUSTERING)||(LA85_0 >= K_COMPACT && LA85_0 <= K_COUNTER)||(LA85_0 >= K_CUSTOM && LA85_0 <= K_DECIMAL)||(LA85_0 >= K_DISTINCT && LA85_0 <= K_DOUBLE)||LA85_0==K_DURATION||(LA85_0 >= K_EXISTS && LA85_0 <= K_FLOAT)||LA85_0==K_FROZEN||(LA85_0 >= K_FUNCTION && LA85_0 <= K_FUNCTIONS)||LA85_0==K_GROUP||LA85_0==K_INET||(LA85_0 >= K_INITCOND && LA85_0 <= K_INPUT)||LA85_0==K_INT||(LA85_0 >= K_JSON && LA85_0 <= K_KEYS)||(LA85_0 >= K_KEYSPACES && LA85_0 <= K_LIKE)||(LA85_0 >= K_LIST && LA85_0 <= K_MAP)||LA85_0==K_NOLOGIN||LA85_0==K_NOSUPERUSER||LA85_0==K_OPTIONS||(LA85_0 >= K_PARTITION && LA85_0 <= K_PERMISSIONS)||LA85_0==K_RETURNS||(LA85_0 >= K_ROLE && LA85_0 <= K_ROLES)||(LA85_0 >= K_SFUNC && LA85_0 <= K_TINYINT)||LA85_0==K_TRIGGER||(LA85_0 >= K_TTL && LA85_0 <= K_TYPE)||(LA85_0 >= K_USER && LA85_0 <= K_USERS)||(LA85_0 >= K_UUID && LA85_0 <= K_VARINT)||LA85_0==K_WRITETIME||LA85_0==QUOTED_NAME) ) {
						alt85=1;
					}
					switch (alt85) {
						case 1 :
							// Parser.g:697:38: typeColumns[expr]
							{
							pushFollow(FOLLOW_typeColumns_in_createTypeStatement4294);
							typeColumns(expr);
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop86;
				}
			}

			match(input,184,FOLLOW_184_in_createTypeStatement4301); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createTypeStatement"



	// $ANTLR start "typeColumns"
	// Parser.g:700:1: typeColumns[CreateTypeStatement expr] : k= fident v= comparatorType ;
	public final void typeColumns(CreateTypeStatement expr) throws RecognitionException {
		FieldIdentifier k =null;
		CQL3Type.Raw v =null;

		try {
			// Parser.g:701:5: (k= fident v= comparatorType )
			// Parser.g:701:7: k= fident v= comparatorType
			{
			pushFollow(FOLLOW_fident_in_typeColumns4321);
			k=fident();
			state._fsp--;

			pushFollow(FOLLOW_comparatorType_in_typeColumns4325);
			v=comparatorType();
			state._fsp--;

			 expr.addDefinition(k, v); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "typeColumns"



	// $ANTLR start "createIndexStatement"
	// Parser.g:709:1: createIndexStatement returns [CreateIndexStatement expr] : K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? ;
	public final CreateIndexStatement createIndexStatement() throws RecognitionException {
		CreateIndexStatement expr = null;


		Token cls=null;
		CFName cf =null;


		        IndexPropDefs props = new IndexPropDefs();
		        boolean ifNotExists = false;
		        IndexName name = new IndexName();
		        List<IndexTarget.Raw> targets = new ArrayList<>();
		    
		try {
			// Parser.g:716:5: ( K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? )
			// Parser.g:716:7: K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createIndexStatement4360); 
			// Parser.g:716:16: ( K_CUSTOM )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==K_CUSTOM) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// Parser.g:716:17: K_CUSTOM
					{
					match(input,K_CUSTOM,FOLLOW_K_CUSTOM_in_createIndexStatement4363); 
					 props.isCustom = true; 
					}
					break;

			}

			match(input,K_INDEX,FOLLOW_K_INDEX_in_createIndexStatement4369); 
			// Parser.g:716:63: ( K_IF K_NOT K_EXISTS )?
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==K_IF) ) {
				alt88=1;
			}
			switch (alt88) {
				case 1 :
					// Parser.g:716:64: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createIndexStatement4372); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createIndexStatement4374); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createIndexStatement4376); 
					 ifNotExists = true; 
					}
					break;

			}

			// Parser.g:717:9: ( idxName[name] )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==IDENT||(LA89_0 >= K_AGGREGATE && LA89_0 <= K_ALL)||LA89_0==K_AS||LA89_0==K_ASCII||(LA89_0 >= K_BIGINT && LA89_0 <= K_BOOLEAN)||(LA89_0 >= K_CALLED && LA89_0 <= K_CLUSTERING)||(LA89_0 >= K_COMPACT && LA89_0 <= K_COUNTER)||(LA89_0 >= K_CUSTOM && LA89_0 <= K_DECIMAL)||(LA89_0 >= K_DISTINCT && LA89_0 <= K_DOUBLE)||LA89_0==K_DURATION||(LA89_0 >= K_EXISTS && LA89_0 <= K_FLOAT)||LA89_0==K_FROZEN||(LA89_0 >= K_FUNCTION && LA89_0 <= K_FUNCTIONS)||LA89_0==K_GROUP||LA89_0==K_INET||(LA89_0 >= K_INITCOND && LA89_0 <= K_INPUT)||LA89_0==K_INT||(LA89_0 >= K_JSON && LA89_0 <= K_KEYS)||(LA89_0 >= K_KEYSPACES && LA89_0 <= K_LIKE)||(LA89_0 >= K_LIST && LA89_0 <= K_MAP)||LA89_0==K_NOLOGIN||LA89_0==K_NOSUPERUSER||LA89_0==K_OPTIONS||(LA89_0 >= K_PARTITION && LA89_0 <= K_PERMISSIONS)||LA89_0==K_RETURNS||(LA89_0 >= K_ROLE && LA89_0 <= K_ROLES)||(LA89_0 >= K_SFUNC && LA89_0 <= K_TINYINT)||LA89_0==K_TRIGGER||(LA89_0 >= K_TTL && LA89_0 <= K_TYPE)||(LA89_0 >= K_USER && LA89_0 <= K_USERS)||(LA89_0 >= K_UUID && LA89_0 <= K_VARINT)||LA89_0==K_WRITETIME||(LA89_0 >= QMARK && LA89_0 <= QUOTED_NAME)) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// Parser.g:717:10: idxName[name]
					{
					pushFollow(FOLLOW_idxName_in_createIndexStatement4392);
					idxName(name);
					state._fsp--;

					}
					break;

			}

			match(input,K_ON,FOLLOW_K_ON_in_createIndexStatement4397); 
			pushFollow(FOLLOW_columnFamilyName_in_createIndexStatement4401);
			cf=columnFamilyName();
			state._fsp--;

			match(input,183,FOLLOW_183_in_createIndexStatement4403); 
			// Parser.g:717:55: ( indexIdent[targets] ( ',' indexIdent[targets] )* )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==IDENT||(LA91_0 >= K_AGGREGATE && LA91_0 <= K_ALL)||LA91_0==K_AS||LA91_0==K_ASCII||(LA91_0 >= K_BIGINT && LA91_0 <= K_BOOLEAN)||(LA91_0 >= K_CALLED && LA91_0 <= K_CLUSTERING)||(LA91_0 >= K_COMPACT && LA91_0 <= K_COUNTER)||(LA91_0 >= K_CUSTOM && LA91_0 <= K_DECIMAL)||(LA91_0 >= K_DISTINCT && LA91_0 <= K_DOUBLE)||(LA91_0 >= K_DURATION && LA91_0 <= K_ENTRIES)||(LA91_0 >= K_EXISTS && LA91_0 <= K_FLOAT)||(LA91_0 >= K_FROZEN && LA91_0 <= K_FUNCTIONS)||LA91_0==K_GROUP||LA91_0==K_INET||(LA91_0 >= K_INITCOND && LA91_0 <= K_INPUT)||LA91_0==K_INT||(LA91_0 >= K_JSON && LA91_0 <= K_KEYS)||(LA91_0 >= K_KEYSPACES && LA91_0 <= K_LIKE)||(LA91_0 >= K_LIST && LA91_0 <= K_MAP)||LA91_0==K_NOLOGIN||LA91_0==K_NOSUPERUSER||LA91_0==K_OPTIONS||(LA91_0 >= K_PARTITION && LA91_0 <= K_PERMISSIONS)||LA91_0==K_RETURNS||(LA91_0 >= K_ROLE && LA91_0 <= K_ROLES)||(LA91_0 >= K_SFUNC && LA91_0 <= K_TINYINT)||LA91_0==K_TRIGGER||(LA91_0 >= K_TTL && LA91_0 <= K_TYPE)||(LA91_0 >= K_USER && LA91_0 <= K_USERS)||(LA91_0 >= K_UUID && LA91_0 <= K_VARINT)||LA91_0==K_WRITETIME||LA91_0==QUOTED_NAME) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// Parser.g:717:56: indexIdent[targets] ( ',' indexIdent[targets] )*
					{
					pushFollow(FOLLOW_indexIdent_in_createIndexStatement4406);
					indexIdent(targets);
					state._fsp--;

					// Parser.g:717:76: ( ',' indexIdent[targets] )*
					loop90:
					while (true) {
						int alt90=2;
						int LA90_0 = input.LA(1);
						if ( (LA90_0==187) ) {
							alt90=1;
						}

						switch (alt90) {
						case 1 :
							// Parser.g:717:77: ',' indexIdent[targets]
							{
							match(input,187,FOLLOW_187_in_createIndexStatement4410); 
							pushFollow(FOLLOW_indexIdent_in_createIndexStatement4412);
							indexIdent(targets);
							state._fsp--;

							}
							break;

						default :
							break loop90;
						}
					}

					}
					break;

			}

			match(input,184,FOLLOW_184_in_createIndexStatement4419); 
			// Parser.g:718:9: ( K_USING cls= STRING_LITERAL )?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==K_USING) ) {
				alt92=1;
			}
			switch (alt92) {
				case 1 :
					// Parser.g:718:10: K_USING cls= STRING_LITERAL
					{
					match(input,K_USING,FOLLOW_K_USING_in_createIndexStatement4430); 
					cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createIndexStatement4434); 
					 props.customClass = (cls!=null?cls.getText():null); 
					}
					break;

			}

			// Parser.g:719:9: ( K_WITH properties[props] )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==K_WITH) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// Parser.g:719:10: K_WITH properties[props]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createIndexStatement4449); 
					pushFollow(FOLLOW_properties_in_createIndexStatement4451);
					properties(props);
					state._fsp--;

					}
					break;

			}

			 expr = new CreateIndexStatement(cf, name, targets, props, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createIndexStatement"



	// $ANTLR start "indexIdent"
	// Parser.g:723:1: indexIdent[List<IndexTarget.Raw> targets] : (c= cident | K_VALUES '(' c= cident ')' | K_KEYS '(' c= cident ')' | K_ENTRIES '(' c= cident ')' | K_FULL '(' c= cident ')' );
	public final void indexIdent(List<IndexTarget.Raw> targets) throws RecognitionException {
		ColumnDefinition.Raw c =null;

		try {
			// Parser.g:724:5: (c= cident | K_VALUES '(' c= cident ')' | K_KEYS '(' c= cident ')' | K_ENTRIES '(' c= cident ')' | K_FULL '(' c= cident ')' )
			int alt94=5;
			switch ( input.LA(1) ) {
			case IDENT:
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QUOTED_NAME:
				{
				alt94=1;
				}
				break;
			case K_VALUES:
				{
				int LA94_2 = input.LA(2);
				if ( (LA94_2==183) ) {
					alt94=2;
				}
				else if ( (LA94_2==184||LA94_2==187) ) {
					alt94=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 94, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_KEYS:
				{
				int LA94_3 = input.LA(2);
				if ( (LA94_3==183) ) {
					alt94=3;
				}
				else if ( (LA94_3==184||LA94_3==187) ) {
					alt94=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 94, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_ENTRIES:
				{
				alt94=4;
				}
				break;
			case K_FULL:
				{
				alt94=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 94, 0, input);
				throw nvae;
			}
			switch (alt94) {
				case 1 :
					// Parser.g:724:7: c= cident
					{
					pushFollow(FOLLOW_cident_in_indexIdent4483);
					c=cident();
					state._fsp--;

					 targets.add(IndexTarget.Raw.simpleIndexOn(c)); 
					}
					break;
				case 2 :
					// Parser.g:725:7: K_VALUES '(' c= cident ')'
					{
					match(input,K_VALUES,FOLLOW_K_VALUES_in_indexIdent4511); 
					match(input,183,FOLLOW_183_in_indexIdent4513); 
					pushFollow(FOLLOW_cident_in_indexIdent4517);
					c=cident();
					state._fsp--;

					match(input,184,FOLLOW_184_in_indexIdent4519); 
					 targets.add(IndexTarget.Raw.valuesOf(c)); 
					}
					break;
				case 3 :
					// Parser.g:726:7: K_KEYS '(' c= cident ')'
					{
					match(input,K_KEYS,FOLLOW_K_KEYS_in_indexIdent4530); 
					match(input,183,FOLLOW_183_in_indexIdent4532); 
					pushFollow(FOLLOW_cident_in_indexIdent4536);
					c=cident();
					state._fsp--;

					match(input,184,FOLLOW_184_in_indexIdent4538); 
					 targets.add(IndexTarget.Raw.keysOf(c)); 
					}
					break;
				case 4 :
					// Parser.g:727:7: K_ENTRIES '(' c= cident ')'
					{
					match(input,K_ENTRIES,FOLLOW_K_ENTRIES_in_indexIdent4551); 
					match(input,183,FOLLOW_183_in_indexIdent4553); 
					pushFollow(FOLLOW_cident_in_indexIdent4557);
					c=cident();
					state._fsp--;

					match(input,184,FOLLOW_184_in_indexIdent4559); 
					 targets.add(IndexTarget.Raw.keysAndValuesOf(c)); 
					}
					break;
				case 5 :
					// Parser.g:728:7: K_FULL '(' c= cident ')'
					{
					match(input,K_FULL,FOLLOW_K_FULL_in_indexIdent4569); 
					match(input,183,FOLLOW_183_in_indexIdent4571); 
					pushFollow(FOLLOW_cident_in_indexIdent4575);
					c=cident();
					state._fsp--;

					match(input,184,FOLLOW_184_in_indexIdent4577); 
					 targets.add(IndexTarget.Raw.fullCollection(c)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "indexIdent"



	// $ANTLR start "createMaterializedViewStatement"
	// Parser.g:739:1: createMaterializedViewStatement returns [CreateViewStatement expr] : K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectClause K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? K_PRIMARY K_KEY ( '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')' | '(' k1= cident ( ',' cn= cident )* ')' ) ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )? ;
	public final CreateViewStatement createMaterializedViewStatement() throws RecognitionException {
		CreateViewStatement expr = null;


		CFName cf =null;
		List<RawSelector> sclause =null;
		CFName basecf =null;
		WhereClause.Builder wclause =null;
		ColumnDefinition.Raw k1 =null;
		ColumnDefinition.Raw kn =null;
		ColumnDefinition.Raw c1 =null;
		ColumnDefinition.Raw cn =null;


		        boolean ifNotExists = false;
		        List<ColumnDefinition.Raw> partitionKeys = new ArrayList<>();
		        List<ColumnDefinition.Raw> compositeKeys = new ArrayList<>();
		    
		try {
			// Parser.g:745:5: ( K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectClause K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? K_PRIMARY K_KEY ( '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')' | '(' k1= cident ( ',' cn= cident )* ')' ) ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )? )
			// Parser.g:745:7: K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectClause K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? K_PRIMARY K_KEY ( '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')' | '(' k1= cident ( ',' cn= cident )* ')' ) ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createMaterializedViewStatement4614); 
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_createMaterializedViewStatement4616); 
			match(input,K_VIEW,FOLLOW_K_VIEW_in_createMaterializedViewStatement4618); 
			// Parser.g:745:38: ( K_IF K_NOT K_EXISTS )?
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==K_IF) ) {
				alt95=1;
			}
			switch (alt95) {
				case 1 :
					// Parser.g:745:39: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createMaterializedViewStatement4621); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createMaterializedViewStatement4623); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createMaterializedViewStatement4625); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_createMaterializedViewStatement4633);
			cf=columnFamilyName();
			state._fsp--;

			match(input,K_AS,FOLLOW_K_AS_in_createMaterializedViewStatement4635); 
			match(input,K_SELECT,FOLLOW_K_SELECT_in_createMaterializedViewStatement4645); 
			pushFollow(FOLLOW_selectClause_in_createMaterializedViewStatement4649);
			sclause=selectClause();
			state._fsp--;

			match(input,K_FROM,FOLLOW_K_FROM_in_createMaterializedViewStatement4651); 
			pushFollow(FOLLOW_columnFamilyName_in_createMaterializedViewStatement4655);
			basecf=columnFamilyName();
			state._fsp--;

			// Parser.g:747:9: ( K_WHERE wclause= whereClause )?
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==K_WHERE) ) {
				alt96=1;
			}
			switch (alt96) {
				case 1 :
					// Parser.g:747:10: K_WHERE wclause= whereClause
					{
					match(input,K_WHERE,FOLLOW_K_WHERE_in_createMaterializedViewStatement4666); 
					pushFollow(FOLLOW_whereClause_in_createMaterializedViewStatement4670);
					wclause=whereClause();
					state._fsp--;

					}
					break;

			}

			match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_createMaterializedViewStatement4682); 
			match(input,K_KEY,FOLLOW_K_KEY_in_createMaterializedViewStatement4684); 
			// Parser.g:748:25: ( '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')' | '(' k1= cident ( ',' cn= cident )* ')' )
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==183) ) {
				int LA100_1 = input.LA(2);
				if ( (LA100_1==183) ) {
					alt100=1;
				}
				else if ( (LA100_1==IDENT||(LA100_1 >= K_AGGREGATE && LA100_1 <= K_ALL)||LA100_1==K_AS||LA100_1==K_ASCII||(LA100_1 >= K_BIGINT && LA100_1 <= K_BOOLEAN)||(LA100_1 >= K_CALLED && LA100_1 <= K_CLUSTERING)||(LA100_1 >= K_COMPACT && LA100_1 <= K_COUNTER)||(LA100_1 >= K_CUSTOM && LA100_1 <= K_DECIMAL)||(LA100_1 >= K_DISTINCT && LA100_1 <= K_DOUBLE)||LA100_1==K_DURATION||(LA100_1 >= K_EXISTS && LA100_1 <= K_FLOAT)||LA100_1==K_FROZEN||(LA100_1 >= K_FUNCTION && LA100_1 <= K_FUNCTIONS)||LA100_1==K_GROUP||LA100_1==K_INET||(LA100_1 >= K_INITCOND && LA100_1 <= K_INPUT)||LA100_1==K_INT||(LA100_1 >= K_JSON && LA100_1 <= K_KEYS)||(LA100_1 >= K_KEYSPACES && LA100_1 <= K_LIKE)||(LA100_1 >= K_LIST && LA100_1 <= K_MAP)||LA100_1==K_NOLOGIN||LA100_1==K_NOSUPERUSER||LA100_1==K_OPTIONS||(LA100_1 >= K_PARTITION && LA100_1 <= K_PERMISSIONS)||LA100_1==K_RETURNS||(LA100_1 >= K_ROLE && LA100_1 <= K_ROLES)||(LA100_1 >= K_SFUNC && LA100_1 <= K_TINYINT)||LA100_1==K_TRIGGER||(LA100_1 >= K_TTL && LA100_1 <= K_TYPE)||(LA100_1 >= K_USER && LA100_1 <= K_USERS)||(LA100_1 >= K_UUID && LA100_1 <= K_VARINT)||LA100_1==K_WRITETIME||LA100_1==QUOTED_NAME) ) {
					alt100=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 100, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}

			switch (alt100) {
				case 1 :
					// Parser.g:749:9: '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')'
					{
					match(input,183,FOLLOW_183_in_createMaterializedViewStatement4696); 
					match(input,183,FOLLOW_183_in_createMaterializedViewStatement4698); 
					pushFollow(FOLLOW_cident_in_createMaterializedViewStatement4702);
					k1=cident();
					state._fsp--;

					 partitionKeys.add(k1); 
					// Parser.g:749:54: ( ',' kn= cident )*
					loop97:
					while (true) {
						int alt97=2;
						int LA97_0 = input.LA(1);
						if ( (LA97_0==187) ) {
							alt97=1;
						}

						switch (alt97) {
						case 1 :
							// Parser.g:749:56: ',' kn= cident
							{
							match(input,187,FOLLOW_187_in_createMaterializedViewStatement4708); 
							pushFollow(FOLLOW_cident_in_createMaterializedViewStatement4712);
							kn=cident();
							state._fsp--;

							 partitionKeys.add(kn); 
							}
							break;

						default :
							break loop97;
						}
					}

					match(input,184,FOLLOW_184_in_createMaterializedViewStatement4719); 
					// Parser.g:749:104: ( ',' c1= cident )*
					loop98:
					while (true) {
						int alt98=2;
						int LA98_0 = input.LA(1);
						if ( (LA98_0==187) ) {
							alt98=1;
						}

						switch (alt98) {
						case 1 :
							// Parser.g:749:106: ',' c1= cident
							{
							match(input,187,FOLLOW_187_in_createMaterializedViewStatement4723); 
							pushFollow(FOLLOW_cident_in_createMaterializedViewStatement4727);
							c1=cident();
							state._fsp--;

							 compositeKeys.add(c1); 
							}
							break;

						default :
							break loop98;
						}
					}

					match(input,184,FOLLOW_184_in_createMaterializedViewStatement4734); 
					}
					break;
				case 2 :
					// Parser.g:750:9: '(' k1= cident ( ',' cn= cident )* ')'
					{
					match(input,183,FOLLOW_183_in_createMaterializedViewStatement4744); 
					pushFollow(FOLLOW_cident_in_createMaterializedViewStatement4748);
					k1=cident();
					state._fsp--;

					 partitionKeys.add(k1); 
					// Parser.g:750:50: ( ',' cn= cident )*
					loop99:
					while (true) {
						int alt99=2;
						int LA99_0 = input.LA(1);
						if ( (LA99_0==187) ) {
							alt99=1;
						}

						switch (alt99) {
						case 1 :
							// Parser.g:750:52: ',' cn= cident
							{
							match(input,187,FOLLOW_187_in_createMaterializedViewStatement4754); 
							pushFollow(FOLLOW_cident_in_createMaterializedViewStatement4758);
							cn=cident();
							state._fsp--;

							 compositeKeys.add(cn); 
							}
							break;

						default :
							break loop99;
						}
					}

					match(input,184,FOLLOW_184_in_createMaterializedViewStatement4765); 
					}
					break;

			}


			             WhereClause where = wclause == null ? WhereClause.empty() : wclause.build();
			             expr = new CreateViewStatement(cf, basecf, sclause, where, partitionKeys, compositeKeys, ifNotExists);
			        
			// Parser.g:756:9: ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )?
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==K_WITH) ) {
				alt102=1;
			}
			switch (alt102) {
				case 1 :
					// Parser.g:756:11: K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )*
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createMaterializedViewStatement4797); 
					pushFollow(FOLLOW_cfamProperty_in_createMaterializedViewStatement4799);
					cfamProperty(expr.properties);
					state._fsp--;

					// Parser.g:756:48: ( K_AND cfamProperty[expr.properties] )*
					loop101:
					while (true) {
						int alt101=2;
						int LA101_0 = input.LA(1);
						if ( (LA101_0==K_AND) ) {
							alt101=1;
						}

						switch (alt101) {
						case 1 :
							// Parser.g:756:50: K_AND cfamProperty[expr.properties]
							{
							match(input,K_AND,FOLLOW_K_AND_in_createMaterializedViewStatement4804); 
							pushFollow(FOLLOW_cfamProperty_in_createMaterializedViewStatement4806);
							cfamProperty(expr.properties);
							state._fsp--;

							}
							break;

						default :
							break loop101;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createMaterializedViewStatement"



	// $ANTLR start "createTriggerStatement"
	// Parser.g:762:1: createTriggerStatement returns [CreateTriggerStatement expr] : K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL ;
	public final CreateTriggerStatement createTriggerStatement() throws RecognitionException {
		CreateTriggerStatement expr = null;


		Token cls=null;
		ColumnDefinition.Raw name =null;
		CFName cf =null;


		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:766:5: ( K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL )
			// Parser.g:766:7: K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTriggerStatement4844); 
			match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_createTriggerStatement4846); 
			// Parser.g:766:26: ( K_IF K_NOT K_EXISTS )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==K_IF) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// Parser.g:766:27: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTriggerStatement4849); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createTriggerStatement4851); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTriggerStatement4853); 
					 ifNotExists = true; 
					}
					break;

			}

			// Parser.g:766:74: (name= cident )
			// Parser.g:766:75: name= cident
			{
			pushFollow(FOLLOW_cident_in_createTriggerStatement4863);
			name=cident();
			state._fsp--;

			}

			match(input,K_ON,FOLLOW_K_ON_in_createTriggerStatement4874); 
			pushFollow(FOLLOW_columnFamilyName_in_createTriggerStatement4878);
			cf=columnFamilyName();
			state._fsp--;

			match(input,K_USING,FOLLOW_K_USING_in_createTriggerStatement4880); 
			cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createTriggerStatement4884); 
			 expr = new CreateTriggerStatement(cf, name.rawText(), (cls!=null?cls.getText():null), ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createTriggerStatement"



	// $ANTLR start "dropTriggerStatement"
	// Parser.g:774:1: dropTriggerStatement returns [DropTriggerStatement expr] : K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName ;
	public final DropTriggerStatement dropTriggerStatement() throws RecognitionException {
		DropTriggerStatement expr = null;


		ColumnDefinition.Raw name =null;
		CFName cf =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:776:5: ( K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName )
			// Parser.g:776:7: K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTriggerStatement4925); 
			match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_dropTriggerStatement4927); 
			// Parser.g:776:24: ( K_IF K_EXISTS )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==K_IF) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// Parser.g:776:25: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTriggerStatement4930); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTriggerStatement4932); 
					 ifExists = true; 
					}
					break;

			}

			// Parser.g:776:63: (name= cident )
			// Parser.g:776:64: name= cident
			{
			pushFollow(FOLLOW_cident_in_dropTriggerStatement4942);
			name=cident();
			state._fsp--;

			}

			match(input,K_ON,FOLLOW_K_ON_in_dropTriggerStatement4945); 
			pushFollow(FOLLOW_columnFamilyName_in_dropTriggerStatement4949);
			cf=columnFamilyName();
			state._fsp--;

			 expr = new DropTriggerStatement(cf, name.rawText(), ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropTriggerStatement"



	// $ANTLR start "alterKeyspaceStatement"
	// Parser.g:783:1: alterKeyspaceStatement returns [AlterKeyspaceStatement expr] : K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] ;
	public final AlterKeyspaceStatement alterKeyspaceStatement() throws RecognitionException {
		AlterKeyspaceStatement expr = null;


		String ks =null;

		 KeyspaceAttributes attrs = new KeyspaceAttributes(); 
		try {
			// Parser.g:785:5: ( K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] )
			// Parser.g:785:7: K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs]
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterKeyspaceStatement4989); 
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement4991); 
			pushFollow(FOLLOW_keyspaceName_in_alterKeyspaceStatement4995);
			ks=keyspaceName();
			state._fsp--;

			match(input,K_WITH,FOLLOW_K_WITH_in_alterKeyspaceStatement5005); 
			pushFollow(FOLLOW_properties_in_alterKeyspaceStatement5007);
			properties(attrs);
			state._fsp--;

			 expr = new AlterKeyspaceStatement(ks, attrs); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterKeyspaceStatement"



	// $ANTLR start "alterTableStatement"
	// Parser.g:796:1: alterTableStatement returns [AlterTableStatement expr] : K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) ) | K_DROP ( (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? ) | K_WITH properties[attrs] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) ;
	public final AlterTableStatement alterTableStatement() throws RecognitionException {
		AlterTableStatement expr = null;


		Token t=null;
		CFName cf =null;
		ColumnDefinition.Raw id =null;
		CQL3Type.Raw v =null;
		boolean b1 =false;
		ColumnDefinition.Raw id1 =null;
		CQL3Type.Raw v1 =null;
		ColumnDefinition.Raw idn =null;
		CQL3Type.Raw vn =null;
		boolean bn =false;
		ColumnDefinition.Raw toId1 =null;
		ColumnDefinition.Raw toIdn =null;


		        AlterTableStatement.Type type = null;
		        TableAttributes attrs = new TableAttributes();
		        Map<ColumnDefinition.Raw, ColumnDefinition.Raw> renames = new HashMap<ColumnDefinition.Raw, ColumnDefinition.Raw>();
		        List<AlterTableStatementColumn> colNameList = new ArrayList<AlterTableStatementColumn>();
		        Long deleteTimestamp = null;
		    
		try {
			// Parser.g:804:5: ( K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) ) | K_DROP ( (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? ) | K_WITH properties[attrs] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) )
			// Parser.g:804:7: K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) ) | K_DROP ( (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? ) | K_WITH properties[attrs] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement5042); 
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_alterTableStatement5044); 
			pushFollow(FOLLOW_columnFamilyName_in_alterTableStatement5048);
			cf=columnFamilyName();
			state._fsp--;

			// Parser.g:805:11: ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) ) | K_DROP ( (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? ) | K_WITH properties[attrs] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
			int alt111=5;
			switch ( input.LA(1) ) {
			case K_ALTER:
				{
				alt111=1;
				}
				break;
			case K_ADD:
				{
				alt111=2;
				}
				break;
			case K_DROP:
				{
				alt111=3;
				}
				break;
			case K_WITH:
				{
				alt111=4;
				}
				break;
			case K_RENAME:
				{
				alt111=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				throw nvae;
			}
			switch (alt111) {
				case 1 :
					// Parser.g:805:13: K_ALTER id= cident K_TYPE v= comparatorType
					{
					match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement5062); 
					pushFollow(FOLLOW_cident_in_alterTableStatement5066);
					id=cident();
					state._fsp--;

					match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTableStatement5069); 
					pushFollow(FOLLOW_comparatorType_in_alterTableStatement5073);
					v=comparatorType();
					state._fsp--;

					 type = AlterTableStatement.Type.ALTER; 
					 colNameList.add(new AlterTableStatementColumn(id,v)); 
					}
					break;
				case 2 :
					// Parser.g:806:13: K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) )
					{
					match(input,K_ADD,FOLLOW_K_ADD_in_alterTableStatement5092); 
					// Parser.g:806:20: ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) )
					int alt106=2;
					int LA106_0 = input.LA(1);
					if ( (LA106_0==IDENT||(LA106_0 >= K_AGGREGATE && LA106_0 <= K_ALL)||LA106_0==K_AS||LA106_0==K_ASCII||(LA106_0 >= K_BIGINT && LA106_0 <= K_BOOLEAN)||(LA106_0 >= K_CALLED && LA106_0 <= K_CLUSTERING)||(LA106_0 >= K_COMPACT && LA106_0 <= K_COUNTER)||(LA106_0 >= K_CUSTOM && LA106_0 <= K_DECIMAL)||(LA106_0 >= K_DISTINCT && LA106_0 <= K_DOUBLE)||LA106_0==K_DURATION||(LA106_0 >= K_EXISTS && LA106_0 <= K_FLOAT)||LA106_0==K_FROZEN||(LA106_0 >= K_FUNCTION && LA106_0 <= K_FUNCTIONS)||LA106_0==K_GROUP||LA106_0==K_INET||(LA106_0 >= K_INITCOND && LA106_0 <= K_INPUT)||LA106_0==K_INT||(LA106_0 >= K_JSON && LA106_0 <= K_KEYS)||(LA106_0 >= K_KEYSPACES && LA106_0 <= K_LIKE)||(LA106_0 >= K_LIST && LA106_0 <= K_MAP)||LA106_0==K_NOLOGIN||LA106_0==K_NOSUPERUSER||LA106_0==K_OPTIONS||(LA106_0 >= K_PARTITION && LA106_0 <= K_PERMISSIONS)||LA106_0==K_RETURNS||(LA106_0 >= K_ROLE && LA106_0 <= K_ROLES)||(LA106_0 >= K_SFUNC && LA106_0 <= K_TINYINT)||LA106_0==K_TRIGGER||(LA106_0 >= K_TTL && LA106_0 <= K_TYPE)||(LA106_0 >= K_USER && LA106_0 <= K_USERS)||(LA106_0 >= K_UUID && LA106_0 <= K_VARINT)||LA106_0==K_WRITETIME||LA106_0==QUOTED_NAME) ) {
						alt106=1;
					}
					else if ( (LA106_0==183) ) {
						alt106=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 106, 0, input);
						throw nvae;
					}

					switch (alt106) {
						case 1 :
							// Parser.g:806:29: (id= cident v= comparatorType b1= cfisStatic )
							{
							// Parser.g:806:29: (id= cident v= comparatorType b1= cfisStatic )
							// Parser.g:806:30: id= cident v= comparatorType b1= cfisStatic
							{
							pushFollow(FOLLOW_cident_in_alterTableStatement5107);
							id=cident();
							state._fsp--;

							pushFollow(FOLLOW_comparatorType_in_alterTableStatement5113);
							v=comparatorType();
							state._fsp--;

							pushFollow(FOLLOW_cfisStatic_in_alterTableStatement5119);
							b1=cfisStatic();
							state._fsp--;

							 colNameList.add(new AlterTableStatementColumn(id,v,b1)); 
							}

							}
							break;
						case 2 :
							// Parser.g:807:24: ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' )
							{
							// Parser.g:807:24: ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' )
							// Parser.g:807:25: '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')'
							{
							match(input,183,FOLLOW_183_in_alterTableStatement5148); 
							pushFollow(FOLLOW_cident_in_alterTableStatement5153);
							id1=cident();
							state._fsp--;

							pushFollow(FOLLOW_comparatorType_in_alterTableStatement5158);
							v1=comparatorType();
							state._fsp--;

							pushFollow(FOLLOW_cfisStatic_in_alterTableStatement5163);
							b1=cfisStatic();
							state._fsp--;

							 colNameList.add(new AlterTableStatementColumn(id1,v1,b1)); 
							// Parser.g:808:24: ( ',' idn= cident vn= comparatorType bn= cfisStatic )*
							loop105:
							while (true) {
								int alt105=2;
								int LA105_0 = input.LA(1);
								if ( (LA105_0==187) ) {
									alt105=1;
								}

								switch (alt105) {
								case 1 :
									// Parser.g:808:26: ',' idn= cident vn= comparatorType bn= cfisStatic
									{
									match(input,187,FOLLOW_187_in_alterTableStatement5192); 
									pushFollow(FOLLOW_cident_in_alterTableStatement5196);
									idn=cident();
									state._fsp--;

									pushFollow(FOLLOW_comparatorType_in_alterTableStatement5201);
									vn=comparatorType();
									state._fsp--;

									pushFollow(FOLLOW_cfisStatic_in_alterTableStatement5206);
									bn=cfisStatic();
									state._fsp--;

									 colNameList.add(new AlterTableStatementColumn(idn,vn,bn)); 
									}
									break;

								default :
									break loop105;
								}
							}

							match(input,184,FOLLOW_184_in_alterTableStatement5213); 
							}

							}
							break;

					}

					 type = AlterTableStatement.Type.ADD; 
					}
					break;
				case 3 :
					// Parser.g:809:13: K_DROP ( (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? )
					{
					match(input,K_DROP,FOLLOW_K_DROP_in_alterTableStatement5233); 
					// Parser.g:809:20: ( (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? )
					// Parser.g:809:22: (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )?
					{
					// Parser.g:809:22: (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) )
					int alt108=2;
					int LA108_0 = input.LA(1);
					if ( (LA108_0==IDENT||(LA108_0 >= K_AGGREGATE && LA108_0 <= K_ALL)||LA108_0==K_AS||LA108_0==K_ASCII||(LA108_0 >= K_BIGINT && LA108_0 <= K_BOOLEAN)||(LA108_0 >= K_CALLED && LA108_0 <= K_CLUSTERING)||(LA108_0 >= K_COMPACT && LA108_0 <= K_COUNTER)||(LA108_0 >= K_CUSTOM && LA108_0 <= K_DECIMAL)||(LA108_0 >= K_DISTINCT && LA108_0 <= K_DOUBLE)||LA108_0==K_DURATION||(LA108_0 >= K_EXISTS && LA108_0 <= K_FLOAT)||LA108_0==K_FROZEN||(LA108_0 >= K_FUNCTION && LA108_0 <= K_FUNCTIONS)||LA108_0==K_GROUP||LA108_0==K_INET||(LA108_0 >= K_INITCOND && LA108_0 <= K_INPUT)||LA108_0==K_INT||(LA108_0 >= K_JSON && LA108_0 <= K_KEYS)||(LA108_0 >= K_KEYSPACES && LA108_0 <= K_LIKE)||(LA108_0 >= K_LIST && LA108_0 <= K_MAP)||LA108_0==K_NOLOGIN||LA108_0==K_NOSUPERUSER||LA108_0==K_OPTIONS||(LA108_0 >= K_PARTITION && LA108_0 <= K_PERMISSIONS)||LA108_0==K_RETURNS||(LA108_0 >= K_ROLE && LA108_0 <= K_ROLES)||(LA108_0 >= K_SFUNC && LA108_0 <= K_TINYINT)||LA108_0==K_TRIGGER||(LA108_0 >= K_TTL && LA108_0 <= K_TYPE)||(LA108_0 >= K_USER && LA108_0 <= K_USERS)||(LA108_0 >= K_UUID && LA108_0 <= K_VARINT)||LA108_0==K_WRITETIME||LA108_0==QUOTED_NAME) ) {
						alt108=1;
					}
					else if ( (LA108_0==183) ) {
						alt108=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 108, 0, input);
						throw nvae;
					}

					switch (alt108) {
						case 1 :
							// Parser.g:809:32: id= cident
							{
							pushFollow(FOLLOW_cident_in_alterTableStatement5249);
							id=cident();
							state._fsp--;

							 colNameList.add(new AlterTableStatementColumn(id)); 
							}
							break;
						case 2 :
							// Parser.g:810:25: ( '(' id1= cident ( ',' idn= cident )* ')' )
							{
							// Parser.g:810:25: ( '(' id1= cident ( ',' idn= cident )* ')' )
							// Parser.g:810:26: '(' id1= cident ( ',' idn= cident )* ')'
							{
							match(input,183,FOLLOW_183_in_alterTableStatement5279); 
							pushFollow(FOLLOW_cident_in_alterTableStatement5284);
							id1=cident();
							state._fsp--;

							 colNameList.add(new AlterTableStatementColumn(id1)); 
							// Parser.g:811:25: ( ',' idn= cident )*
							loop107:
							while (true) {
								int alt107=2;
								int LA107_0 = input.LA(1);
								if ( (LA107_0==187) ) {
									alt107=1;
								}

								switch (alt107) {
								case 1 :
									// Parser.g:811:27: ',' idn= cident
									{
									match(input,187,FOLLOW_187_in_alterTableStatement5314); 
									pushFollow(FOLLOW_cident_in_alterTableStatement5318);
									idn=cident();
									state._fsp--;

									 colNameList.add(new AlterTableStatementColumn(idn)); 
									}
									break;

								default :
									break loop107;
								}
							}

							match(input,184,FOLLOW_184_in_alterTableStatement5325); 
							}

							}
							break;

					}

					// Parser.g:812:22: ( K_USING K_TIMESTAMP t= INTEGER )?
					int alt109=2;
					int LA109_0 = input.LA(1);
					if ( (LA109_0==K_USING) ) {
						alt109=1;
					}
					switch (alt109) {
						case 1 :
							// Parser.g:812:24: K_USING K_TIMESTAMP t= INTEGER
							{
							match(input,K_USING,FOLLOW_K_USING_in_alterTableStatement5353); 
							match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_alterTableStatement5355); 
							t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_alterTableStatement5359); 
							 deleteTimestamp = Long.parseLong(Constants.Literal.integer((t!=null?t.getText():null)).getText()); 
							}
							break;

					}

					}

					 type = AlterTableStatement.Type.DROP; 
					}
					break;
				case 4 :
					// Parser.g:813:13: K_WITH properties[attrs]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterTableStatement5381); 
					pushFollow(FOLLOW_properties_in_alterTableStatement5384);
					properties(attrs);
					state._fsp--;

					 type = AlterTableStatement.Type.OPTS; 
					}
					break;
				case 5 :
					// Parser.g:814:13: K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )*
					{
					match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTableStatement5417); 
					 type = AlterTableStatement.Type.RENAME; 
					pushFollow(FOLLOW_cident_in_alterTableStatement5471);
					id1=cident();
					state._fsp--;

					match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement5473); 
					pushFollow(FOLLOW_cident_in_alterTableStatement5477);
					toId1=cident();
					state._fsp--;

					 renames.put(id1, toId1); 
					// Parser.g:816:16: ( K_AND idn= cident K_TO toIdn= cident )*
					loop110:
					while (true) {
						int alt110=2;
						int LA110_0 = input.LA(1);
						if ( (LA110_0==K_AND) ) {
							alt110=1;
						}

						switch (alt110) {
						case 1 :
							// Parser.g:816:18: K_AND idn= cident K_TO toIdn= cident
							{
							match(input,K_AND,FOLLOW_K_AND_in_alterTableStatement5498); 
							pushFollow(FOLLOW_cident_in_alterTableStatement5502);
							idn=cident();
							state._fsp--;

							match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement5504); 
							pushFollow(FOLLOW_cident_in_alterTableStatement5508);
							toIdn=cident();
							state._fsp--;

							 renames.put(idn, toIdn); 
							}
							break;

						default :
							break loop110;
						}
					}

					}
					break;

			}


			        expr = new AlterTableStatement(cf, type, colNameList, attrs, renames, deleteTimestamp);
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterTableStatement"



	// $ANTLR start "cfisStatic"
	// Parser.g:823:1: cfisStatic returns [boolean isStaticColumn] : ( K_STATIC )? ;
	public final boolean cfisStatic() throws RecognitionException {
		boolean isStaticColumn = false;



		        boolean isStatic = false;
		    
		try {
			// Parser.g:827:5: ( ( K_STATIC )? )
			// Parser.g:827:7: ( K_STATIC )?
			{
			// Parser.g:827:7: ( K_STATIC )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==K_STATIC) ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// Parser.g:827:8: K_STATIC
					{
					match(input,K_STATIC,FOLLOW_K_STATIC_in_cfisStatic5561); 
					 isStatic=true; 
					}
					break;

			}

			 isStaticColumn = isStatic;
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return isStaticColumn;
	}
	// $ANTLR end "cfisStatic"



	// $ANTLR start "alterMaterializedViewStatement"
	// Parser.g:831:1: alterMaterializedViewStatement returns [AlterViewStatement expr] : K_ALTER K_MATERIALIZED K_VIEW name= columnFamilyName K_WITH properties[attrs] ;
	public final AlterViewStatement alterMaterializedViewStatement() throws RecognitionException {
		AlterViewStatement expr = null;


		CFName name =null;


		        TableAttributes attrs = new TableAttributes();
		    
		try {
			// Parser.g:835:5: ( K_ALTER K_MATERIALIZED K_VIEW name= columnFamilyName K_WITH properties[attrs] )
			// Parser.g:835:7: K_ALTER K_MATERIALIZED K_VIEW name= columnFamilyName K_WITH properties[attrs]
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterMaterializedViewStatement5597); 
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_alterMaterializedViewStatement5599); 
			match(input,K_VIEW,FOLLOW_K_VIEW_in_alterMaterializedViewStatement5601); 
			pushFollow(FOLLOW_columnFamilyName_in_alterMaterializedViewStatement5605);
			name=columnFamilyName();
			state._fsp--;

			match(input,K_WITH,FOLLOW_K_WITH_in_alterMaterializedViewStatement5617); 
			pushFollow(FOLLOW_properties_in_alterMaterializedViewStatement5619);
			properties(attrs);
			state._fsp--;


			        expr = new AlterViewStatement(name, attrs);
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterMaterializedViewStatement"



	// $ANTLR start "alterTypeStatement"
	// Parser.g:848:1: alterTypeStatement returns [AlterTypeStatement expr] : K_ALTER K_TYPE name= userTypeName ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD f= fident v= comparatorType | K_RENAME id1= fident K_TO toId1= fident ( K_AND idn= fident K_TO toIdn= fident )* ) ;
	public final AlterTypeStatement alterTypeStatement() throws RecognitionException {
		AlterTypeStatement expr = null;


		UTName name =null;
		FieldIdentifier f =null;
		CQL3Type.Raw v =null;
		FieldIdentifier id1 =null;
		FieldIdentifier toId1 =null;
		FieldIdentifier idn =null;
		FieldIdentifier toIdn =null;

		try {
			// Parser.g:849:5: ( K_ALTER K_TYPE name= userTypeName ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD f= fident v= comparatorType | K_RENAME id1= fident K_TO toId1= fident ( K_AND idn= fident K_TO toIdn= fident )* ) )
			// Parser.g:849:7: K_ALTER K_TYPE name= userTypeName ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD f= fident v= comparatorType | K_RENAME id1= fident K_TO toId1= fident ( K_AND idn= fident K_TO toIdn= fident )* )
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTypeStatement5650); 
			match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTypeStatement5652); 
			pushFollow(FOLLOW_userTypeName_in_alterTypeStatement5656);
			name=userTypeName();
			state._fsp--;

			// Parser.g:850:11: ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD f= fident v= comparatorType | K_RENAME id1= fident K_TO toId1= fident ( K_AND idn= fident K_TO toIdn= fident )* )
			int alt114=3;
			switch ( input.LA(1) ) {
			case K_ALTER:
				{
				alt114=1;
				}
				break;
			case K_ADD:
				{
				alt114=2;
				}
				break;
			case K_RENAME:
				{
				alt114=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 114, 0, input);
				throw nvae;
			}
			switch (alt114) {
				case 1 :
					// Parser.g:850:13: K_ALTER f= fident K_TYPE v= comparatorType
					{
					match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTypeStatement5670); 
					pushFollow(FOLLOW_fident_in_alterTypeStatement5674);
					f=fident();
					state._fsp--;

					match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTypeStatement5676); 
					pushFollow(FOLLOW_comparatorType_in_alterTypeStatement5680);
					v=comparatorType();
					state._fsp--;

					 expr = AlterTypeStatement.alter(name, f, v); 
					}
					break;
				case 2 :
					// Parser.g:851:13: K_ADD f= fident v= comparatorType
					{
					match(input,K_ADD,FOLLOW_K_ADD_in_alterTypeStatement5696); 
					pushFollow(FOLLOW_fident_in_alterTypeStatement5702);
					f=fident();
					state._fsp--;

					pushFollow(FOLLOW_comparatorType_in_alterTypeStatement5706);
					v=comparatorType();
					state._fsp--;

					 expr = AlterTypeStatement.addition(name, f, v); 
					}
					break;
				case 3 :
					// Parser.g:852:13: K_RENAME id1= fident K_TO toId1= fident ( K_AND idn= fident K_TO toIdn= fident )*
					{
					match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTypeStatement5729); 
					 Map<FieldIdentifier, FieldIdentifier> renames = new HashMap<>(); 
					pushFollow(FOLLOW_fident_in_alterTypeStatement5767);
					id1=fident();
					state._fsp--;

					match(input,K_TO,FOLLOW_K_TO_in_alterTypeStatement5769); 
					pushFollow(FOLLOW_fident_in_alterTypeStatement5773);
					toId1=fident();
					state._fsp--;

					 renames.put(id1, toId1); 
					// Parser.g:855:18: ( K_AND idn= fident K_TO toIdn= fident )*
					loop113:
					while (true) {
						int alt113=2;
						int LA113_0 = input.LA(1);
						if ( (LA113_0==K_AND) ) {
							alt113=1;
						}

						switch (alt113) {
						case 1 :
							// Parser.g:855:20: K_AND idn= fident K_TO toIdn= fident
							{
							match(input,K_AND,FOLLOW_K_AND_in_alterTypeStatement5796); 
							pushFollow(FOLLOW_fident_in_alterTypeStatement5800);
							idn=fident();
							state._fsp--;

							match(input,K_TO,FOLLOW_K_TO_in_alterTypeStatement5802); 
							pushFollow(FOLLOW_fident_in_alterTypeStatement5806);
							toIdn=fident();
							state._fsp--;

							 renames.put(idn, toIdn); 
							}
							break;

						default :
							break loop113;
						}
					}

					 expr = AlterTypeStatement.renames(name, renames); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterTypeStatement"



	// $ANTLR start "dropKeyspaceStatement"
	// Parser.g:864:1: dropKeyspaceStatement returns [DropKeyspaceStatement ksp] : K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName ;
	public final DropKeyspaceStatement dropKeyspaceStatement() throws RecognitionException {
		DropKeyspaceStatement ksp = null;


		String ks =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:866:5: ( K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName )
			// Parser.g:866:7: K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropKeyspaceStatement5873); 
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement5875); 
			// Parser.g:866:25: ( K_IF K_EXISTS )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==K_IF) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// Parser.g:866:26: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropKeyspaceStatement5878); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropKeyspaceStatement5880); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_keyspaceName_in_dropKeyspaceStatement5889);
			ks=keyspaceName();
			state._fsp--;

			 ksp = new DropKeyspaceStatement(ks, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ksp;
	}
	// $ANTLR end "dropKeyspaceStatement"



	// $ANTLR start "dropTableStatement"
	// Parser.g:872:1: dropTableStatement returns [DropTableStatement stmt] : K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName ;
	public final DropTableStatement dropTableStatement() throws RecognitionException {
		DropTableStatement stmt = null;


		CFName cf =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:874:5: ( K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName )
			// Parser.g:874:7: K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTableStatement5923); 
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dropTableStatement5925); 
			// Parser.g:874:29: ( K_IF K_EXISTS )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==K_IF) ) {
				alt116=1;
			}
			switch (alt116) {
				case 1 :
					// Parser.g:874:30: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTableStatement5928); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTableStatement5930); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_dropTableStatement5939);
			cf=columnFamilyName();
			state._fsp--;

			 stmt = new DropTableStatement(cf, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropTableStatement"



	// $ANTLR start "dropTypeStatement"
	// Parser.g:880:1: dropTypeStatement returns [DropTypeStatement stmt] : K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName ;
	public final DropTypeStatement dropTypeStatement() throws RecognitionException {
		DropTypeStatement stmt = null;


		UTName name =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:882:5: ( K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName )
			// Parser.g:882:7: K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTypeStatement5973); 
			match(input,K_TYPE,FOLLOW_K_TYPE_in_dropTypeStatement5975); 
			// Parser.g:882:21: ( K_IF K_EXISTS )?
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==K_IF) ) {
				alt117=1;
			}
			switch (alt117) {
				case 1 :
					// Parser.g:882:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTypeStatement5978); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTypeStatement5980); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_userTypeName_in_dropTypeStatement5989);
			name=userTypeName();
			state._fsp--;

			 stmt = new DropTypeStatement(name, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropTypeStatement"



	// $ANTLR start "dropIndexStatement"
	// Parser.g:888:1: dropIndexStatement returns [DropIndexStatement expr] : K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName ;
	public final DropIndexStatement dropIndexStatement() throws RecognitionException {
		DropIndexStatement expr = null;


		IndexName index =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:890:5: ( K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName )
			// Parser.g:890:7: K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropIndexStatement6023); 
			match(input,K_INDEX,FOLLOW_K_INDEX_in_dropIndexStatement6025); 
			// Parser.g:890:22: ( K_IF K_EXISTS )?
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==K_IF) ) {
				alt118=1;
			}
			switch (alt118) {
				case 1 :
					// Parser.g:890:23: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropIndexStatement6028); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropIndexStatement6030); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_indexName_in_dropIndexStatement6039);
			index=indexName();
			state._fsp--;

			 expr = new DropIndexStatement(index, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropIndexStatement"



	// $ANTLR start "dropMaterializedViewStatement"
	// Parser.g:897:1: dropMaterializedViewStatement returns [DropViewStatement expr] : K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName ;
	public final DropViewStatement dropMaterializedViewStatement() throws RecognitionException {
		DropViewStatement expr = null;


		CFName cf =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:899:5: ( K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName )
			// Parser.g:899:7: K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropMaterializedViewStatement6079); 
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_dropMaterializedViewStatement6081); 
			match(input,K_VIEW,FOLLOW_K_VIEW_in_dropMaterializedViewStatement6083); 
			// Parser.g:899:36: ( K_IF K_EXISTS )?
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==K_IF) ) {
				alt119=1;
			}
			switch (alt119) {
				case 1 :
					// Parser.g:899:37: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropMaterializedViewStatement6086); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropMaterializedViewStatement6088); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_dropMaterializedViewStatement6097);
			cf=columnFamilyName();
			state._fsp--;

			 expr = new DropViewStatement(cf, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropMaterializedViewStatement"



	// $ANTLR start "truncateStatement"
	// Parser.g:906:1: truncateStatement returns [TruncateStatement stmt] : K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName ;
	public final TruncateStatement truncateStatement() throws RecognitionException {
		TruncateStatement stmt = null;


		CFName cf =null;

		try {
			// Parser.g:907:5: ( K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName )
			// Parser.g:907:7: K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName
			{
			match(input,K_TRUNCATE,FOLLOW_K_TRUNCATE_in_truncateStatement6128); 
			// Parser.g:907:18: ( K_COLUMNFAMILY )?
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==K_COLUMNFAMILY) ) {
				alt120=1;
			}
			switch (alt120) {
				case 1 :
					// Parser.g:907:19: K_COLUMNFAMILY
					{
					match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_truncateStatement6131); 
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_truncateStatement6137);
			cf=columnFamilyName();
			state._fsp--;

			 stmt = new TruncateStatement(cf); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "truncateStatement"



	// $ANTLR start "grantPermissionsStatement"
	// Parser.g:913:1: grantPermissionsStatement returns [GrantPermissionsStatement stmt] : K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName ;
	public final GrantPermissionsStatement grantPermissionsStatement() throws RecognitionException {
		GrantPermissionsStatement stmt = null;


		RoleName grantee =null;
		Set<Permission> permissionOrAll1 =null;
		IResource resource2 =null;

		try {
			// Parser.g:914:5: ( K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName )
			// Parser.g:914:7: K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName
			{
			match(input,K_GRANT,FOLLOW_K_GRANT_in_grantPermissionsStatement6162); 
			pushFollow(FOLLOW_permissionOrAll_in_grantPermissionsStatement6174);
			permissionOrAll1=permissionOrAll();
			state._fsp--;

			match(input,K_ON,FOLLOW_K_ON_in_grantPermissionsStatement6182); 
			pushFollow(FOLLOW_resource_in_grantPermissionsStatement6194);
			resource2=resource();
			state._fsp--;

			match(input,K_TO,FOLLOW_K_TO_in_grantPermissionsStatement6202); 
			pushFollow(FOLLOW_userOrRoleName_in_grantPermissionsStatement6216);
			grantee=userOrRoleName();
			state._fsp--;

			 stmt = new GrantPermissionsStatement(filterPermissions(permissionOrAll1, resource2), resource2, grantee); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "grantPermissionsStatement"



	// $ANTLR start "revokePermissionsStatement"
	// Parser.g:926:1: revokePermissionsStatement returns [RevokePermissionsStatement stmt] : K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName ;
	public final RevokePermissionsStatement revokePermissionsStatement() throws RecognitionException {
		RevokePermissionsStatement stmt = null;


		RoleName revokee =null;
		Set<Permission> permissionOrAll3 =null;
		IResource resource4 =null;

		try {
			// Parser.g:927:5: ( K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName )
			// Parser.g:927:7: K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName
			{
			match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokePermissionsStatement6247); 
			pushFollow(FOLLOW_permissionOrAll_in_revokePermissionsStatement6259);
			permissionOrAll3=permissionOrAll();
			state._fsp--;

			match(input,K_ON,FOLLOW_K_ON_in_revokePermissionsStatement6267); 
			pushFollow(FOLLOW_resource_in_revokePermissionsStatement6279);
			resource4=resource();
			state._fsp--;

			match(input,K_FROM,FOLLOW_K_FROM_in_revokePermissionsStatement6287); 
			pushFollow(FOLLOW_userOrRoleName_in_revokePermissionsStatement6301);
			revokee=userOrRoleName();
			state._fsp--;

			 stmt = new RevokePermissionsStatement(filterPermissions(permissionOrAll3, resource4), resource4, revokee); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "revokePermissionsStatement"



	// $ANTLR start "grantRoleStatement"
	// Parser.g:939:1: grantRoleStatement returns [GrantRoleStatement stmt] : K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName ;
	public final GrantRoleStatement grantRoleStatement() throws RecognitionException {
		GrantRoleStatement stmt = null;


		RoleName role =null;
		RoleName grantee =null;

		try {
			// Parser.g:940:5: ( K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName )
			// Parser.g:940:7: K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName
			{
			match(input,K_GRANT,FOLLOW_K_GRANT_in_grantRoleStatement6332); 
			pushFollow(FOLLOW_userOrRoleName_in_grantRoleStatement6346);
			role=userOrRoleName();
			state._fsp--;

			match(input,K_TO,FOLLOW_K_TO_in_grantRoleStatement6354); 
			pushFollow(FOLLOW_userOrRoleName_in_grantRoleStatement6368);
			grantee=userOrRoleName();
			state._fsp--;

			 stmt = new GrantRoleStatement(role, grantee); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "grantRoleStatement"



	// $ANTLR start "revokeRoleStatement"
	// Parser.g:950:1: revokeRoleStatement returns [RevokeRoleStatement stmt] : K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName ;
	public final RevokeRoleStatement revokeRoleStatement() throws RecognitionException {
		RevokeRoleStatement stmt = null;


		RoleName role =null;
		RoleName revokee =null;

		try {
			// Parser.g:951:5: ( K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName )
			// Parser.g:951:7: K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName
			{
			match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokeRoleStatement6399); 
			pushFollow(FOLLOW_userOrRoleName_in_revokeRoleStatement6413);
			role=userOrRoleName();
			state._fsp--;

			match(input,K_FROM,FOLLOW_K_FROM_in_revokeRoleStatement6421); 
			pushFollow(FOLLOW_userOrRoleName_in_revokeRoleStatement6435);
			revokee=userOrRoleName();
			state._fsp--;

			 stmt = new RevokeRoleStatement(role, revokee); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "revokeRoleStatement"



	// $ANTLR start "listPermissionsStatement"
	// Parser.g:958:1: listPermissionsStatement returns [ListPermissionsStatement stmt] : K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? ;
	public final ListPermissionsStatement listPermissionsStatement() throws RecognitionException {
		ListPermissionsStatement stmt = null;


		IResource resource5 =null;
		Set<Permission> permissionOrAll6 =null;


		        IResource resource = null;
		        boolean recursive = true;
		        RoleName grantee = new RoleName();
		    
		try {
			// Parser.g:964:5: ( K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? )
			// Parser.g:964:7: K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )?
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listPermissionsStatement6473); 
			pushFollow(FOLLOW_permissionOrAll_in_listPermissionsStatement6485);
			permissionOrAll6=permissionOrAll();
			state._fsp--;

			// Parser.g:966:7: ( K_ON resource )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==K_ON) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// Parser.g:966:9: K_ON resource
					{
					match(input,K_ON,FOLLOW_K_ON_in_listPermissionsStatement6495); 
					pushFollow(FOLLOW_resource_in_listPermissionsStatement6497);
					resource5=resource();
					state._fsp--;

					 resource = resource5; 
					}
					break;

			}

			// Parser.g:967:7: ( K_OF roleName[grantee] )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==K_OF) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// Parser.g:967:9: K_OF roleName[grantee]
					{
					match(input,K_OF,FOLLOW_K_OF_in_listPermissionsStatement6512); 
					pushFollow(FOLLOW_roleName_in_listPermissionsStatement6514);
					roleName(grantee);
					state._fsp--;

					}
					break;

			}

			// Parser.g:968:7: ( K_NORECURSIVE )?
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==K_NORECURSIVE) ) {
				alt123=1;
			}
			switch (alt123) {
				case 1 :
					// Parser.g:968:9: K_NORECURSIVE
					{
					match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listPermissionsStatement6528); 
					 recursive = false; 
					}
					break;

			}

			 stmt = new ListPermissionsStatement(permissionOrAll6, resource, grantee, recursive); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listPermissionsStatement"



	// $ANTLR start "permission"
	// Parser.g:972:1: permission returns [Permission perm] : p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE ) ;
	public final Permission permission() throws RecognitionException {
		Permission perm = null;


		Token p=null;

		try {
			// Parser.g:973:5: (p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE ) )
			// Parser.g:973:7: p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE )
			{
			p=input.LT(1);
			if ( input.LA(1)==K_ALTER||input.LA(1)==K_AUTHORIZE||input.LA(1)==K_CREATE||input.LA(1)==K_DESCRIBE||input.LA(1)==K_DROP||input.LA(1)==K_EXECUTE||input.LA(1)==K_MODIFY||input.LA(1)==K_SELECT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			 perm = Permission.valueOf((p!=null?p.getText():null).toUpperCase()); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return perm;
	}
	// $ANTLR end "permission"



	// $ANTLR start "permissionOrAll"
	// Parser.g:977:1: permissionOrAll returns [Set<Permission> perms] : ( K_ALL ( K_PERMISSIONS )? |p= permission ( K_PERMISSION )? );
	public final Set<Permission> permissionOrAll() throws RecognitionException {
		Set<Permission> perms = null;


		Permission p =null;

		try {
			// Parser.g:978:5: ( K_ALL ( K_PERMISSIONS )? |p= permission ( K_PERMISSION )? )
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==K_ALL) ) {
				alt126=1;
			}
			else if ( (LA126_0==K_ALTER||LA126_0==K_AUTHORIZE||LA126_0==K_CREATE||LA126_0==K_DESCRIBE||LA126_0==K_DROP||LA126_0==K_EXECUTE||LA126_0==K_MODIFY||LA126_0==K_SELECT) ) {
				alt126=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 126, 0, input);
				throw nvae;
			}

			switch (alt126) {
				case 1 :
					// Parser.g:978:7: K_ALL ( K_PERMISSIONS )?
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_permissionOrAll6621); 
					// Parser.g:978:13: ( K_PERMISSIONS )?
					int alt124=2;
					int LA124_0 = input.LA(1);
					if ( (LA124_0==K_PERMISSIONS) ) {
						alt124=1;
					}
					switch (alt124) {
						case 1 :
							// Parser.g:978:15: K_PERMISSIONS
							{
							match(input,K_PERMISSIONS,FOLLOW_K_PERMISSIONS_in_permissionOrAll6625); 
							}
							break;

					}

					 perms = Permission.ALL; 
					}
					break;
				case 2 :
					// Parser.g:979:7: p= permission ( K_PERMISSION )?
					{
					pushFollow(FOLLOW_permission_in_permissionOrAll6646);
					p=permission();
					state._fsp--;

					// Parser.g:979:20: ( K_PERMISSION )?
					int alt125=2;
					int LA125_0 = input.LA(1);
					if ( (LA125_0==K_PERMISSION) ) {
						alt125=1;
					}
					switch (alt125) {
						case 1 :
							// Parser.g:979:22: K_PERMISSION
							{
							match(input,K_PERMISSION,FOLLOW_K_PERMISSION_in_permissionOrAll6650); 
							}
							break;

					}

					 perms = EnumSet.of(p); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return perms;
	}
	// $ANTLR end "permissionOrAll"



	// $ANTLR start "resource"
	// Parser.g:982:1: resource returns [IResource res] : (d= dataResource |r= roleResource |f= functionResource |j= jmxResource );
	public final IResource resource() throws RecognitionException {
		IResource res = null;


		DataResource d =null;
		RoleResource r =null;
		FunctionResource f =null;
		JMXResource j =null;

		try {
			// Parser.g:983:5: (d= dataResource |r= roleResource |f= functionResource |j= jmxResource )
			int alt127=4;
			switch ( input.LA(1) ) {
			case K_ALL:
				{
				switch ( input.LA(2) ) {
				case EOF:
				case K_FROM:
				case K_KEYSPACES:
				case K_NORECURSIVE:
				case K_OF:
				case K_TO:
				case 190:
				case 192:
					{
					alt127=1;
					}
					break;
				case K_ROLES:
					{
					alt127=2;
					}
					break;
				case K_FUNCTIONS:
					{
					alt127=3;
					}
					break;
				case K_MBEANS:
					{
					alt127=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 127, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case IDENT:
			case K_AGGREGATE:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COLUMNFAMILY:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACE:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QMARK:
			case QUOTED_NAME:
				{
				alt127=1;
				}
				break;
			case K_ROLE:
				{
				int LA127_3 = input.LA(2);
				if ( (LA127_3==EOF||LA127_3==K_FROM||LA127_3==K_NORECURSIVE||LA127_3==K_OF||LA127_3==K_TO||LA127_3==190||LA127_3==192) ) {
					alt127=1;
				}
				else if ( (LA127_3==IDENT||(LA127_3 >= K_AGGREGATE && LA127_3 <= K_ALL)||LA127_3==K_AS||LA127_3==K_ASCII||(LA127_3 >= K_BIGINT && LA127_3 <= K_BOOLEAN)||(LA127_3 >= K_CALLED && LA127_3 <= K_CLUSTERING)||(LA127_3 >= K_COMPACT && LA127_3 <= K_COUNTER)||(LA127_3 >= K_CUSTOM && LA127_3 <= K_DECIMAL)||(LA127_3 >= K_DISTINCT && LA127_3 <= K_DOUBLE)||LA127_3==K_DURATION||(LA127_3 >= K_EXISTS && LA127_3 <= K_FLOAT)||LA127_3==K_FROZEN||(LA127_3 >= K_FUNCTION && LA127_3 <= K_FUNCTIONS)||LA127_3==K_GROUP||LA127_3==K_INET||(LA127_3 >= K_INITCOND && LA127_3 <= K_INPUT)||LA127_3==K_INT||(LA127_3 >= K_JSON && LA127_3 <= K_KEYS)||(LA127_3 >= K_KEYSPACES && LA127_3 <= K_LIKE)||(LA127_3 >= K_LIST && LA127_3 <= K_MAP)||LA127_3==K_NOLOGIN||LA127_3==K_NOSUPERUSER||LA127_3==K_OPTIONS||(LA127_3 >= K_PARTITION && LA127_3 <= K_PERMISSIONS)||LA127_3==K_RETURNS||(LA127_3 >= K_ROLE && LA127_3 <= K_ROLES)||(LA127_3 >= K_SFUNC && LA127_3 <= K_TINYINT)||LA127_3==K_TRIGGER||(LA127_3 >= K_TTL && LA127_3 <= K_TYPE)||(LA127_3 >= K_USER && LA127_3 <= K_USERS)||(LA127_3 >= K_UUID && LA127_3 <= K_VARINT)||LA127_3==K_WRITETIME||(LA127_3 >= QMARK && LA127_3 <= QUOTED_NAME)||LA127_3==STRING_LITERAL) ) {
					alt127=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 127, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_FUNCTION:
				{
				int LA127_4 = input.LA(2);
				if ( (LA127_4==EOF||LA127_4==K_FROM||LA127_4==K_NORECURSIVE||LA127_4==K_OF||LA127_4==K_TO||LA127_4==190||LA127_4==192) ) {
					alt127=1;
				}
				else if ( (LA127_4==IDENT||(LA127_4 >= K_AGGREGATE && LA127_4 <= K_ALL)||LA127_4==K_AS||LA127_4==K_ASCII||(LA127_4 >= K_BIGINT && LA127_4 <= K_BOOLEAN)||(LA127_4 >= K_CALLED && LA127_4 <= K_CLUSTERING)||(LA127_4 >= K_COMPACT && LA127_4 <= K_COUNTER)||(LA127_4 >= K_CUSTOM && LA127_4 <= K_DECIMAL)||(LA127_4 >= K_DISTINCT && LA127_4 <= K_DOUBLE)||LA127_4==K_DURATION||(LA127_4 >= K_EXISTS && LA127_4 <= K_FLOAT)||LA127_4==K_FROZEN||(LA127_4 >= K_FUNCTION && LA127_4 <= K_FUNCTIONS)||LA127_4==K_GROUP||LA127_4==K_INET||(LA127_4 >= K_INITCOND && LA127_4 <= K_INPUT)||LA127_4==K_INT||(LA127_4 >= K_JSON && LA127_4 <= K_KEYS)||(LA127_4 >= K_KEYSPACES && LA127_4 <= K_LIKE)||(LA127_4 >= K_LIST && LA127_4 <= K_MAP)||LA127_4==K_NOLOGIN||LA127_4==K_NOSUPERUSER||LA127_4==K_OPTIONS||(LA127_4 >= K_PARTITION && LA127_4 <= K_PERMISSIONS)||LA127_4==K_RETURNS||(LA127_4 >= K_ROLE && LA127_4 <= K_ROLES)||(LA127_4 >= K_SFUNC && LA127_4 <= K_TINYINT)||(LA127_4 >= K_TOKEN && LA127_4 <= K_TRIGGER)||(LA127_4 >= K_TTL && LA127_4 <= K_TYPE)||(LA127_4 >= K_USER && LA127_4 <= K_USERS)||(LA127_4 >= K_UUID && LA127_4 <= K_VARINT)||LA127_4==K_WRITETIME||(LA127_4 >= QMARK && LA127_4 <= QUOTED_NAME)) ) {
					alt127=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 127, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_MBEAN:
			case K_MBEANS:
				{
				alt127=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 127, 0, input);
				throw nvae;
			}
			switch (alt127) {
				case 1 :
					// Parser.g:983:7: d= dataResource
					{
					pushFollow(FOLLOW_dataResource_in_resource6678);
					d=dataResource();
					state._fsp--;

					 res = d; 
					}
					break;
				case 2 :
					// Parser.g:984:7: r= roleResource
					{
					pushFollow(FOLLOW_roleResource_in_resource6690);
					r=roleResource();
					state._fsp--;

					 res = r; 
					}
					break;
				case 3 :
					// Parser.g:985:7: f= functionResource
					{
					pushFollow(FOLLOW_functionResource_in_resource6702);
					f=functionResource();
					state._fsp--;

					 res = f; 
					}
					break;
				case 4 :
					// Parser.g:986:7: j= jmxResource
					{
					pushFollow(FOLLOW_jmxResource_in_resource6714);
					j=jmxResource();
					state._fsp--;

					 res = j; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "resource"



	// $ANTLR start "dataResource"
	// Parser.g:989:1: dataResource returns [DataResource res] : ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName );
	public final DataResource dataResource() throws RecognitionException {
		DataResource res = null;


		String ks =null;
		CFName cf =null;

		try {
			// Parser.g:990:5: ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName )
			int alt129=3;
			switch ( input.LA(1) ) {
			case K_ALL:
				{
				int LA129_1 = input.LA(2);
				if ( (LA129_1==K_KEYSPACES) ) {
					alt129=1;
				}
				else if ( (LA129_1==EOF||LA129_1==K_FROM||LA129_1==K_NORECURSIVE||LA129_1==K_OF||LA129_1==K_TO||LA129_1==190||LA129_1==192) ) {
					alt129=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 129, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_KEYSPACE:
				{
				alt129=2;
				}
				break;
			case IDENT:
			case K_AGGREGATE:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COLUMNFAMILY:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QMARK:
			case QUOTED_NAME:
				{
				alt129=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 129, 0, input);
				throw nvae;
			}
			switch (alt129) {
				case 1 :
					// Parser.g:990:7: K_ALL K_KEYSPACES
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_dataResource6737); 
					match(input,K_KEYSPACES,FOLLOW_K_KEYSPACES_in_dataResource6739); 
					 res = DataResource.root(); 
					}
					break;
				case 2 :
					// Parser.g:991:7: K_KEYSPACE ks= keyspaceName
					{
					match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dataResource6749); 
					pushFollow(FOLLOW_keyspaceName_in_dataResource6755);
					ks=keyspaceName();
					state._fsp--;

					 res = DataResource.keyspace(ks); 
					}
					break;
				case 3 :
					// Parser.g:992:7: ( K_COLUMNFAMILY )? cf= columnFamilyName
					{
					// Parser.g:992:7: ( K_COLUMNFAMILY )?
					int alt128=2;
					int LA128_0 = input.LA(1);
					if ( (LA128_0==K_COLUMNFAMILY) ) {
						alt128=1;
					}
					switch (alt128) {
						case 1 :
							// Parser.g:992:9: K_COLUMNFAMILY
							{
							match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dataResource6767); 
							}
							break;

					}

					pushFollow(FOLLOW_columnFamilyName_in_dataResource6776);
					cf=columnFamilyName();
					state._fsp--;

					 res = DataResource.table(cf.getKeyspace(), cf.getColumnFamily()); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "dataResource"



	// $ANTLR start "jmxResource"
	// Parser.g:996:1: jmxResource returns [JMXResource res] : ( K_ALL K_MBEANS | K_MBEAN mbean | K_MBEANS mbean );
	public final JMXResource jmxResource() throws RecognitionException {
		JMXResource res = null;


		ParserRuleReturnScope mbean7 =null;
		ParserRuleReturnScope mbean8 =null;

		try {
			// Parser.g:997:5: ( K_ALL K_MBEANS | K_MBEAN mbean | K_MBEANS mbean )
			int alt130=3;
			switch ( input.LA(1) ) {
			case K_ALL:
				{
				alt130=1;
				}
				break;
			case K_MBEAN:
				{
				alt130=2;
				}
				break;
			case K_MBEANS:
				{
				alt130=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 130, 0, input);
				throw nvae;
			}
			switch (alt130) {
				case 1 :
					// Parser.g:997:7: K_ALL K_MBEANS
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_jmxResource6805); 
					match(input,K_MBEANS,FOLLOW_K_MBEANS_in_jmxResource6807); 
					 res = JMXResource.root(); 
					}
					break;
				case 2 :
					// Parser.g:1000:7: K_MBEAN mbean
					{
					match(input,K_MBEAN,FOLLOW_K_MBEAN_in_jmxResource6827); 
					pushFollow(FOLLOW_mbean_in_jmxResource6829);
					mbean7=mbean();
					state._fsp--;

					 res = JMXResource.mbean(canonicalizeObjectName((mbean7!=null?input.toString(mbean7.start,mbean7.stop):null), false)); 
					}
					break;
				case 3 :
					// Parser.g:1001:7: K_MBEANS mbean
					{
					match(input,K_MBEANS,FOLLOW_K_MBEANS_in_jmxResource6839); 
					pushFollow(FOLLOW_mbean_in_jmxResource6841);
					mbean8=mbean();
					state._fsp--;

					 res = JMXResource.mbean(canonicalizeObjectName((mbean8!=null?input.toString(mbean8.start,mbean8.stop):null), true)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "jmxResource"



	// $ANTLR start "roleResource"
	// Parser.g:1004:1: roleResource returns [RoleResource res] : ( K_ALL K_ROLES | K_ROLE role= userOrRoleName );
	public final RoleResource roleResource() throws RecognitionException {
		RoleResource res = null;


		RoleName role =null;

		try {
			// Parser.g:1005:5: ( K_ALL K_ROLES | K_ROLE role= userOrRoleName )
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==K_ALL) ) {
				alt131=1;
			}
			else if ( (LA131_0==K_ROLE) ) {
				alt131=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 131, 0, input);
				throw nvae;
			}

			switch (alt131) {
				case 1 :
					// Parser.g:1005:7: K_ALL K_ROLES
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_roleResource6864); 
					match(input,K_ROLES,FOLLOW_K_ROLES_in_roleResource6866); 
					 res = RoleResource.root(); 
					}
					break;
				case 2 :
					// Parser.g:1006:7: K_ROLE role= userOrRoleName
					{
					match(input,K_ROLE,FOLLOW_K_ROLE_in_roleResource6876); 
					pushFollow(FOLLOW_userOrRoleName_in_roleResource6882);
					role=userOrRoleName();
					state._fsp--;

					 res = RoleResource.role(role.getName()); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "roleResource"



	// $ANTLR start "functionResource"
	// Parser.g:1009:1: functionResource returns [FunctionResource res] : ( K_ALL K_FUNCTIONS | K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName | K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' ) );
	public final FunctionResource functionResource() throws RecognitionException {
		FunctionResource res = null;


		String ks =null;
		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		    
		try {
			// Parser.g:1013:5: ( K_ALL K_FUNCTIONS | K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName | K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' ) )
			int alt134=3;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==K_ALL) ) {
				int LA134_1 = input.LA(2);
				if ( (LA134_1==K_FUNCTIONS) ) {
					int LA134_3 = input.LA(3);
					if ( (LA134_3==K_IN) ) {
						alt134=2;
					}
					else if ( (LA134_3==EOF||LA134_3==K_FROM||LA134_3==K_NORECURSIVE||LA134_3==K_OF||LA134_3==K_TO||LA134_3==192) ) {
						alt134=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 134, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 134, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA134_0==K_FUNCTION) ) {
				alt134=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 134, 0, input);
				throw nvae;
			}

			switch (alt134) {
				case 1 :
					// Parser.g:1013:7: K_ALL K_FUNCTIONS
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_functionResource6914); 
					match(input,K_FUNCTIONS,FOLLOW_K_FUNCTIONS_in_functionResource6916); 
					 res = FunctionResource.root(); 
					}
					break;
				case 2 :
					// Parser.g:1014:7: K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_functionResource6926); 
					match(input,K_FUNCTIONS,FOLLOW_K_FUNCTIONS_in_functionResource6928); 
					match(input,K_IN,FOLLOW_K_IN_in_functionResource6930); 
					match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_functionResource6932); 
					pushFollow(FOLLOW_keyspaceName_in_functionResource6938);
					ks=keyspaceName();
					state._fsp--;

					 res = FunctionResource.keyspace(ks); 
					}
					break;
				case 3 :
					// Parser.g:1016:7: K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )
					{
					match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_functionResource6953); 
					pushFollow(FOLLOW_functionName_in_functionResource6957);
					fn=functionName();
					state._fsp--;

					// Parser.g:1017:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )
					// Parser.g:1018:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,183,FOLLOW_183_in_functionResource6975); 
					// Parser.g:1019:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt133=2;
					int LA133_0 = input.LA(1);
					if ( (LA133_0==IDENT||(LA133_0 >= K_AGGREGATE && LA133_0 <= K_ALL)||LA133_0==K_AS||LA133_0==K_ASCII||(LA133_0 >= K_BIGINT && LA133_0 <= K_BOOLEAN)||(LA133_0 >= K_CALLED && LA133_0 <= K_CLUSTERING)||(LA133_0 >= K_COMPACT && LA133_0 <= K_COUNTER)||(LA133_0 >= K_CUSTOM && LA133_0 <= K_DECIMAL)||(LA133_0 >= K_DISTINCT && LA133_0 <= K_DOUBLE)||LA133_0==K_DURATION||(LA133_0 >= K_EXISTS && LA133_0 <= K_FLOAT)||LA133_0==K_FROZEN||(LA133_0 >= K_FUNCTION && LA133_0 <= K_FUNCTIONS)||LA133_0==K_GROUP||LA133_0==K_INET||(LA133_0 >= K_INITCOND && LA133_0 <= K_INPUT)||LA133_0==K_INT||(LA133_0 >= K_JSON && LA133_0 <= K_KEYS)||(LA133_0 >= K_KEYSPACES && LA133_0 <= K_LIKE)||(LA133_0 >= K_LIST && LA133_0 <= K_MAP)||LA133_0==K_NOLOGIN||LA133_0==K_NOSUPERUSER||LA133_0==K_OPTIONS||(LA133_0 >= K_PARTITION && LA133_0 <= K_PERMISSIONS)||LA133_0==K_RETURNS||(LA133_0 >= K_ROLE && LA133_0 <= K_ROLES)||(LA133_0 >= K_SET && LA133_0 <= K_TINYINT)||LA133_0==K_TRIGGER||(LA133_0 >= K_TTL && LA133_0 <= K_TYPE)||(LA133_0 >= K_USER && LA133_0 <= K_USERS)||(LA133_0 >= K_UUID && LA133_0 <= K_VARINT)||LA133_0==K_WRITETIME||LA133_0==QUOTED_NAME||LA133_0==STRING_LITERAL) ) {
						alt133=1;
					}
					switch (alt133) {
						case 1 :
							// Parser.g:1020:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_functionResource7003);
							v=comparatorType();
							state._fsp--;

							 argsTypes.add(v); 
							// Parser.g:1021:13: ( ',' v= comparatorType )*
							loop132:
							while (true) {
								int alt132=2;
								int LA132_0 = input.LA(1);
								if ( (LA132_0==187) ) {
									alt132=1;
								}

								switch (alt132) {
								case 1 :
									// Parser.g:1021:15: ',' v= comparatorType
									{
									match(input,187,FOLLOW_187_in_functionResource7021); 
									pushFollow(FOLLOW_comparatorType_in_functionResource7025);
									v=comparatorType();
									state._fsp--;

									 argsTypes.add(v); 
									}
									break;

								default :
									break loop132;
								}
							}

							}
							break;

					}

					match(input,184,FOLLOW_184_in_functionResource7053); 
					}

					 res = FunctionResource.functionFromCql(fn.keyspace, fn.name, argsTypes); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "functionResource"



	// $ANTLR start "createUserStatement"
	// Parser.g:1031:1: createUserStatement returns [CreateRoleStatement stmt] : K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
	public final CreateRoleStatement createUserStatement() throws RecognitionException {
		CreateRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        RoleOptions opts = new RoleOptions();
		        opts.setOption(IRoleManager.Option.LOGIN, true);
		        boolean superuser = false;
		        boolean ifNotExists = false;
		        RoleName name = new RoleName();
		    
		try {
			// Parser.g:1039:5: ( K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
			// Parser.g:1039:7: K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createUserStatement7101); 
			match(input,K_USER,FOLLOW_K_USER_in_createUserStatement7103); 
			// Parser.g:1039:23: ( K_IF K_NOT K_EXISTS )?
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==K_IF) ) {
				alt135=1;
			}
			switch (alt135) {
				case 1 :
					// Parser.g:1039:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createUserStatement7106); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createUserStatement7108); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createUserStatement7110); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_username_in_createUserStatement7118);
			u=username();
			state._fsp--;

			 name.setName((u!=null?input.toString(u.start,u.stop):null), true); 
			// Parser.g:1040:7: ( K_WITH userPassword[opts] )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==K_WITH) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// Parser.g:1040:9: K_WITH userPassword[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createUserStatement7130); 
					pushFollow(FOLLOW_userPassword_in_createUserStatement7132);
					userPassword(opts);
					state._fsp--;

					}
					break;

			}

			// Parser.g:1041:7: ( K_SUPERUSER | K_NOSUPERUSER )?
			int alt137=3;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==K_SUPERUSER) ) {
				alt137=1;
			}
			else if ( (LA137_0==K_NOSUPERUSER) ) {
				alt137=2;
			}
			switch (alt137) {
				case 1 :
					// Parser.g:1041:9: K_SUPERUSER
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_createUserStatement7146); 
					 superuser = true; 
					}
					break;
				case 2 :
					// Parser.g:1041:45: K_NOSUPERUSER
					{
					match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_createUserStatement7152); 
					 superuser = false; 
					}
					break;

			}

			 opts.setOption(IRoleManager.Option.SUPERUSER, superuser);
			        stmt = new CreateRoleStatement(name, opts, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createUserStatement"



	// $ANTLR start "alterUserStatement"
	// Parser.g:1049:1: alterUserStatement returns [AlterRoleStatement stmt] : K_ALTER K_USER u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
	public final AlterRoleStatement alterUserStatement() throws RecognitionException {
		AlterRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        RoleOptions opts = new RoleOptions();
		        RoleName name = new RoleName();
		    
		try {
			// Parser.g:1054:5: ( K_ALTER K_USER u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
			// Parser.g:1054:7: K_ALTER K_USER u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterUserStatement7197); 
			match(input,K_USER,FOLLOW_K_USER_in_alterUserStatement7199); 
			pushFollow(FOLLOW_username_in_alterUserStatement7203);
			u=username();
			state._fsp--;

			 name.setName((u!=null?input.toString(u.start,u.stop):null), true); 
			// Parser.g:1055:7: ( K_WITH userPassword[opts] )?
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==K_WITH) ) {
				alt138=1;
			}
			switch (alt138) {
				case 1 :
					// Parser.g:1055:9: K_WITH userPassword[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterUserStatement7215); 
					pushFollow(FOLLOW_userPassword_in_alterUserStatement7217);
					userPassword(opts);
					state._fsp--;

					}
					break;

			}

			// Parser.g:1056:7: ( K_SUPERUSER | K_NOSUPERUSER )?
			int alt139=3;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==K_SUPERUSER) ) {
				alt139=1;
			}
			else if ( (LA139_0==K_NOSUPERUSER) ) {
				alt139=2;
			}
			switch (alt139) {
				case 1 :
					// Parser.g:1056:9: K_SUPERUSER
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_alterUserStatement7231); 
					 opts.setOption(IRoleManager.Option.SUPERUSER, true); 
					}
					break;
				case 2 :
					// Parser.g:1057:11: K_NOSUPERUSER
					{
					match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_alterUserStatement7245); 
					 opts.setOption(IRoleManager.Option.SUPERUSER, false); 
					}
					break;

			}

			  stmt = new AlterRoleStatement(name, opts); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterUserStatement"



	// $ANTLR start "dropUserStatement"
	// Parser.g:1064:1: dropUserStatement returns [DropRoleStatement stmt] : K_DROP K_USER ( K_IF K_EXISTS )? u= username ;
	public final DropRoleStatement dropUserStatement() throws RecognitionException {
		DropRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        boolean ifExists = false;
		        RoleName name = new RoleName();
		    
		try {
			// Parser.g:1069:5: ( K_DROP K_USER ( K_IF K_EXISTS )? u= username )
			// Parser.g:1069:7: K_DROP K_USER ( K_IF K_EXISTS )? u= username
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropUserStatement7291); 
			match(input,K_USER,FOLLOW_K_USER_in_dropUserStatement7293); 
			// Parser.g:1069:21: ( K_IF K_EXISTS )?
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==K_IF) ) {
				alt140=1;
			}
			switch (alt140) {
				case 1 :
					// Parser.g:1069:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropUserStatement7296); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropUserStatement7298); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_username_in_dropUserStatement7306);
			u=username();
			state._fsp--;

			 name.setName((u!=null?input.toString(u.start,u.stop):null), true); stmt = new DropRoleStatement(name, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropUserStatement"



	// $ANTLR start "listUsersStatement"
	// Parser.g:1075:1: listUsersStatement returns [ListRolesStatement stmt] : K_LIST K_USERS ;
	public final ListRolesStatement listUsersStatement() throws RecognitionException {
		ListRolesStatement stmt = null;


		try {
			// Parser.g:1076:5: ( K_LIST K_USERS )
			// Parser.g:1076:7: K_LIST K_USERS
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listUsersStatement7331); 
			match(input,K_USERS,FOLLOW_K_USERS_in_listUsersStatement7333); 
			 stmt = new ListUsersStatement(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listUsersStatement"



	// $ANTLR start "createRoleStatement"
	// Parser.g:1088:1: createRoleStatement returns [CreateRoleStatement stmt] : K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts] )? ;
	public final CreateRoleStatement createRoleStatement() throws RecognitionException {
		CreateRoleStatement stmt = null;


		RoleName name =null;


		        RoleOptions opts = new RoleOptions();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:1093:5: ( K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts] )? )
			// Parser.g:1093:7: K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts] )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createRoleStatement7367); 
			match(input,K_ROLE,FOLLOW_K_ROLE_in_createRoleStatement7369); 
			// Parser.g:1093:23: ( K_IF K_NOT K_EXISTS )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==K_IF) ) {
				alt141=1;
			}
			switch (alt141) {
				case 1 :
					// Parser.g:1093:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createRoleStatement7372); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createRoleStatement7374); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createRoleStatement7376); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_userOrRoleName_in_createRoleStatement7384);
			name=userOrRoleName();
			state._fsp--;

			// Parser.g:1094:7: ( K_WITH roleOptions[opts] )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==K_WITH) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// Parser.g:1094:9: K_WITH roleOptions[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createRoleStatement7394); 
					pushFollow(FOLLOW_roleOptions_in_createRoleStatement7396);
					roleOptions(opts);
					state._fsp--;

					}
					break;

			}


			        // set defaults if they weren't explictly supplied
			        if (!opts.getLogin().isPresent())
			        {
			            opts.setOption(IRoleManager.Option.LOGIN, false);
			        }
			        if (!opts.getSuperuser().isPresent())
			        {
			            opts.setOption(IRoleManager.Option.SUPERUSER, false);
			        }
			        stmt = new CreateRoleStatement(name, opts, ifNotExists);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createRoleStatement"



	// $ANTLR start "alterRoleStatement"
	// Parser.g:1118:1: alterRoleStatement returns [AlterRoleStatement stmt] : K_ALTER K_ROLE name= userOrRoleName ( K_WITH roleOptions[opts] )? ;
	public final AlterRoleStatement alterRoleStatement() throws RecognitionException {
		AlterRoleStatement stmt = null;


		RoleName name =null;


		        RoleOptions opts = new RoleOptions();
		    
		try {
			// Parser.g:1122:5: ( K_ALTER K_ROLE name= userOrRoleName ( K_WITH roleOptions[opts] )? )
			// Parser.g:1122:7: K_ALTER K_ROLE name= userOrRoleName ( K_WITH roleOptions[opts] )?
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterRoleStatement7440); 
			match(input,K_ROLE,FOLLOW_K_ROLE_in_alterRoleStatement7442); 
			pushFollow(FOLLOW_userOrRoleName_in_alterRoleStatement7446);
			name=userOrRoleName();
			state._fsp--;

			// Parser.g:1123:7: ( K_WITH roleOptions[opts] )?
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==K_WITH) ) {
				alt143=1;
			}
			switch (alt143) {
				case 1 :
					// Parser.g:1123:9: K_WITH roleOptions[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterRoleStatement7456); 
					pushFollow(FOLLOW_roleOptions_in_alterRoleStatement7458);
					roleOptions(opts);
					state._fsp--;

					}
					break;

			}

			  stmt = new AlterRoleStatement(name, opts); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterRoleStatement"



	// $ANTLR start "dropRoleStatement"
	// Parser.g:1130:1: dropRoleStatement returns [DropRoleStatement stmt] : K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName ;
	public final DropRoleStatement dropRoleStatement() throws RecognitionException {
		DropRoleStatement stmt = null;


		RoleName name =null;


		        boolean ifExists = false;
		    
		try {
			// Parser.g:1134:5: ( K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName )
			// Parser.g:1134:7: K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropRoleStatement7502); 
			match(input,K_ROLE,FOLLOW_K_ROLE_in_dropRoleStatement7504); 
			// Parser.g:1134:21: ( K_IF K_EXISTS )?
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==K_IF) ) {
				alt144=1;
			}
			switch (alt144) {
				case 1 :
					// Parser.g:1134:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropRoleStatement7507); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropRoleStatement7509); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_userOrRoleName_in_dropRoleStatement7517);
			name=userOrRoleName();
			state._fsp--;

			 stmt = new DropRoleStatement(name, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropRoleStatement"



	// $ANTLR start "listRolesStatement"
	// Parser.g:1141:1: listRolesStatement returns [ListRolesStatement stmt] : K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? ;
	public final ListRolesStatement listRolesStatement() throws RecognitionException {
		ListRolesStatement stmt = null;



		        boolean recursive = true;
		        RoleName grantee = new RoleName();
		    
		try {
			// Parser.g:1146:5: ( K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? )
			// Parser.g:1146:7: K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )?
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listRolesStatement7557); 
			match(input,K_ROLES,FOLLOW_K_ROLES_in_listRolesStatement7559); 
			// Parser.g:1147:7: ( K_OF roleName[grantee] )?
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==K_OF) ) {
				alt145=1;
			}
			switch (alt145) {
				case 1 :
					// Parser.g:1147:9: K_OF roleName[grantee]
					{
					match(input,K_OF,FOLLOW_K_OF_in_listRolesStatement7569); 
					pushFollow(FOLLOW_roleName_in_listRolesStatement7571);
					roleName(grantee);
					state._fsp--;

					}
					break;

			}

			// Parser.g:1148:7: ( K_NORECURSIVE )?
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==K_NORECURSIVE) ) {
				alt146=1;
			}
			switch (alt146) {
				case 1 :
					// Parser.g:1148:9: K_NORECURSIVE
					{
					match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listRolesStatement7584); 
					 recursive = false; 
					}
					break;

			}

			 stmt = new ListRolesStatement(grantee, recursive); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listRolesStatement"



	// $ANTLR start "roleOptions"
	// Parser.g:1152:1: roleOptions[RoleOptions opts] : roleOption[opts] ( K_AND roleOption[opts] )* ;
	public final void roleOptions(RoleOptions opts) throws RecognitionException {
		try {
			// Parser.g:1153:5: ( roleOption[opts] ( K_AND roleOption[opts] )* )
			// Parser.g:1153:7: roleOption[opts] ( K_AND roleOption[opts] )*
			{
			pushFollow(FOLLOW_roleOption_in_roleOptions7615);
			roleOption(opts);
			state._fsp--;

			// Parser.g:1153:24: ( K_AND roleOption[opts] )*
			loop147:
			while (true) {
				int alt147=2;
				int LA147_0 = input.LA(1);
				if ( (LA147_0==K_AND) ) {
					alt147=1;
				}

				switch (alt147) {
				case 1 :
					// Parser.g:1153:25: K_AND roleOption[opts]
					{
					match(input,K_AND,FOLLOW_K_AND_in_roleOptions7619); 
					pushFollow(FOLLOW_roleOption_in_roleOptions7621);
					roleOption(opts);
					state._fsp--;

					}
					break;

				default :
					break loop147;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleOptions"



	// $ANTLR start "roleOption"
	// Parser.g:1156:1: roleOption[RoleOptions opts] : ( K_PASSWORD '=' v= STRING_LITERAL | K_OPTIONS '=' m= mapLiteral | K_SUPERUSER '=' b= BOOLEAN | K_LOGIN '=' b= BOOLEAN );
	public final void roleOption(RoleOptions opts) throws RecognitionException {
		Token v=null;
		Token b=null;
		Maps.Literal m =null;

		try {
			// Parser.g:1157:5: ( K_PASSWORD '=' v= STRING_LITERAL | K_OPTIONS '=' m= mapLiteral | K_SUPERUSER '=' b= BOOLEAN | K_LOGIN '=' b= BOOLEAN )
			int alt148=4;
			switch ( input.LA(1) ) {
			case K_PASSWORD:
				{
				alt148=1;
				}
				break;
			case K_OPTIONS:
				{
				alt148=2;
				}
				break;
			case K_SUPERUSER:
				{
				alt148=3;
				}
				break;
			case K_LOGIN:
				{
				alt148=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 148, 0, input);
				throw nvae;
			}
			switch (alt148) {
				case 1 :
					// Parser.g:1157:8: K_PASSWORD '=' v= STRING_LITERAL
					{
					match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_roleOption7643); 
					match(input,195,FOLLOW_195_in_roleOption7645); 
					v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_roleOption7649); 
					 opts.setOption(IRoleManager.Option.PASSWORD, (v!=null?v.getText():null)); 
					}
					break;
				case 2 :
					// Parser.g:1158:8: K_OPTIONS '=' m= mapLiteral
					{
					match(input,K_OPTIONS,FOLLOW_K_OPTIONS_in_roleOption7660); 
					match(input,195,FOLLOW_195_in_roleOption7662); 
					pushFollow(FOLLOW_mapLiteral_in_roleOption7666);
					m=mapLiteral();
					state._fsp--;

					 opts.setOption(IRoleManager.Option.OPTIONS, convertPropertyMap(m)); 
					}
					break;
				case 3 :
					// Parser.g:1159:8: K_SUPERUSER '=' b= BOOLEAN
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_roleOption7677); 
					match(input,195,FOLLOW_195_in_roleOption7679); 
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_roleOption7683); 
					 opts.setOption(IRoleManager.Option.SUPERUSER, Boolean.valueOf((b!=null?b.getText():null))); 
					}
					break;
				case 4 :
					// Parser.g:1160:8: K_LOGIN '=' b= BOOLEAN
					{
					match(input,K_LOGIN,FOLLOW_K_LOGIN_in_roleOption7694); 
					match(input,195,FOLLOW_195_in_roleOption7696); 
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_roleOption7700); 
					 opts.setOption(IRoleManager.Option.LOGIN, Boolean.valueOf((b!=null?b.getText():null))); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleOption"



	// $ANTLR start "userPassword"
	// Parser.g:1164:1: userPassword[RoleOptions opts] : K_PASSWORD v= STRING_LITERAL ;
	public final void userPassword(RoleOptions opts) throws RecognitionException {
		Token v=null;

		try {
			// Parser.g:1165:5: ( K_PASSWORD v= STRING_LITERAL )
			// Parser.g:1165:8: K_PASSWORD v= STRING_LITERAL
			{
			match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_userPassword7722); 
			v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_userPassword7726); 
			 opts.setOption(IRoleManager.Option.PASSWORD, (v!=null?v.getText():null)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "userPassword"



	// $ANTLR start "cident"
	// Parser.g:1173:1: cident returns [ColumnDefinition.Raw id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final ColumnDefinition.Raw cident() throws RecognitionException {
		ColumnDefinition.Raw id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1174:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt149=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt149=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt149=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt149=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 149, 0, input);
				throw nvae;
			}
			switch (alt149) {
				case 1 :
					// Parser.g:1174:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cident7757); 
					 id = ColumnDefinition.Raw.forUnquoted((t!=null?t.getText():null)); 
					}
					break;
				case 2 :
					// Parser.g:1175:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cident7782); 
					 id = ColumnDefinition.Raw.forQuoted((t!=null?t.getText():null)); 
					}
					break;
				case 3 :
					// Parser.g:1176:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_cident7801);
					k=unreserved_keyword();
					state._fsp--;

					 id = ColumnDefinition.Raw.forUnquoted(k); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "cident"



	// $ANTLR start "ident"
	// Parser.g:1180:1: ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final ColumnIdentifier ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1181:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt150=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt150=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt150=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt150=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 150, 0, input);
				throw nvae;
			}
			switch (alt150) {
				case 1 :
					// Parser.g:1181:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident7827); 
					 id = ColumnIdentifier.getInterned((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1182:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_ident7852); 
					 id = ColumnIdentifier.getInterned((t!=null?t.getText():null), true); 
					}
					break;
				case 3 :
					// Parser.g:1183:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_ident7871);
					k=unreserved_keyword();
					state._fsp--;

					 id = ColumnIdentifier.getInterned(k, false); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "ident"



	// $ANTLR start "fident"
	// Parser.g:1186:1: fident returns [FieldIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final FieldIdentifier fident() throws RecognitionException {
		FieldIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1187:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt151=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt151=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt151=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt151=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 151, 0, input);
				throw nvae;
			}
			switch (alt151) {
				case 1 :
					// Parser.g:1187:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_fident7896); 
					 id = FieldIdentifier.forUnquoted((t!=null?t.getText():null)); 
					}
					break;
				case 2 :
					// Parser.g:1188:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_fident7921); 
					 id = FieldIdentifier.forQuoted((t!=null?t.getText():null)); 
					}
					break;
				case 3 :
					// Parser.g:1189:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_fident7940);
					k=unreserved_keyword();
					state._fsp--;

					 id = FieldIdentifier.forUnquoted(k); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "fident"



	// $ANTLR start "noncol_ident"
	// Parser.g:1193:1: noncol_ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final ColumnIdentifier noncol_ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1194:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt152=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt152=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt152=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt152=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 152, 0, input);
				throw nvae;
			}
			switch (alt152) {
				case 1 :
					// Parser.g:1194:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_noncol_ident7966); 
					 id = new ColumnIdentifier((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1195:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_noncol_ident7991); 
					 id = new ColumnIdentifier((t!=null?t.getText():null), true); 
					}
					break;
				case 3 :
					// Parser.g:1196:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_noncol_ident8010);
					k=unreserved_keyword();
					state._fsp--;

					 id = new ColumnIdentifier(k, false); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "noncol_ident"



	// $ANTLR start "keyspaceName"
	// Parser.g:1200:1: keyspaceName returns [String id] : ksName[name] ;
	public final String keyspaceName() throws RecognitionException {
		String id = null;


		 CFName name = new CFName(); 
		try {
			// Parser.g:1202:5: ( ksName[name] )
			// Parser.g:1202:7: ksName[name]
			{
			pushFollow(FOLLOW_ksName_in_keyspaceName8043);
			ksName(name);
			state._fsp--;

			 id = name.getKeyspace(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "keyspaceName"



	// $ANTLR start "indexName"
	// Parser.g:1205:1: indexName returns [IndexName name] : ( ksName[name] '.' )? idxName[name] ;
	public final IndexName indexName() throws RecognitionException {
		IndexName name = null;


		 name = new IndexName(); 
		try {
			// Parser.g:1207:5: ( ( ksName[name] '.' )? idxName[name] )
			// Parser.g:1207:7: ( ksName[name] '.' )? idxName[name]
			{
			// Parser.g:1207:7: ( ksName[name] '.' )?
			int alt153=2;
			alt153 = dfa153.predict(input);
			switch (alt153) {
				case 1 :
					// Parser.g:1207:8: ksName[name] '.'
					{
					pushFollow(FOLLOW_ksName_in_indexName8077);
					ksName(name);
					state._fsp--;

					match(input,190,FOLLOW_190_in_indexName8080); 
					}
					break;

			}

			pushFollow(FOLLOW_idxName_in_indexName8084);
			idxName(name);
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "indexName"



	// $ANTLR start "columnFamilyName"
	// Parser.g:1210:1: columnFamilyName returns [CFName name] : ( ksName[name] '.' )? cfName[name] ;
	public final CFName columnFamilyName() throws RecognitionException {
		CFName name = null;


		 name = new CFName(); 
		try {
			// Parser.g:1212:5: ( ( ksName[name] '.' )? cfName[name] )
			// Parser.g:1212:7: ( ksName[name] '.' )? cfName[name]
			{
			// Parser.g:1212:7: ( ksName[name] '.' )?
			int alt154=2;
			alt154 = dfa154.predict(input);
			switch (alt154) {
				case 1 :
					// Parser.g:1212:8: ksName[name] '.'
					{
					pushFollow(FOLLOW_ksName_in_columnFamilyName8116);
					ksName(name);
					state._fsp--;

					match(input,190,FOLLOW_190_in_columnFamilyName8119); 
					}
					break;

			}

			pushFollow(FOLLOW_cfName_in_columnFamilyName8123);
			cfName(name);
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "columnFamilyName"



	// $ANTLR start "userTypeName"
	// Parser.g:1215:1: userTypeName returns [UTName name] : (ks= noncol_ident '.' )? ut= non_type_ident ;
	public final UTName userTypeName() throws RecognitionException {
		UTName name = null;


		ColumnIdentifier ks =null;
		ColumnIdentifier ut =null;

		try {
			// Parser.g:1216:5: ( (ks= noncol_ident '.' )? ut= non_type_ident )
			// Parser.g:1216:7: (ks= noncol_ident '.' )? ut= non_type_ident
			{
			// Parser.g:1216:7: (ks= noncol_ident '.' )?
			int alt155=2;
			switch ( input.LA(1) ) {
				case IDENT:
					{
					int LA155_1 = input.LA(2);
					if ( (LA155_1==190) ) {
						alt155=1;
					}
					}
					break;
				case QUOTED_NAME:
					{
					int LA155_2 = input.LA(2);
					if ( (LA155_2==190) ) {
						alt155=1;
					}
					}
					break;
				case K_AGGREGATE:
				case K_ALL:
				case K_AS:
				case K_CALLED:
				case K_CLUSTERING:
				case K_COMPACT:
				case K_CONTAINS:
				case K_CUSTOM:
				case K_EXISTS:
				case K_FILTERING:
				case K_FINALFUNC:
				case K_FROZEN:
				case K_FUNCTION:
				case K_FUNCTIONS:
				case K_GROUP:
				case K_INITCOND:
				case K_INPUT:
				case K_KEYS:
				case K_KEYSPACES:
				case K_LANGUAGE:
				case K_LIKE:
				case K_LIST:
				case K_LOGIN:
				case K_MAP:
				case K_NOLOGIN:
				case K_NOSUPERUSER:
				case K_OPTIONS:
				case K_PARTITION:
				case K_PASSWORD:
				case K_PER:
				case K_PERMISSION:
				case K_PERMISSIONS:
				case K_RETURNS:
				case K_ROLE:
				case K_ROLES:
				case K_SFUNC:
				case K_STATIC:
				case K_STORAGE:
				case K_STYPE:
				case K_SUPERUSER:
				case K_TRIGGER:
				case K_TUPLE:
				case K_TYPE:
				case K_USER:
				case K_USERS:
				case K_VALUES:
					{
					int LA155_3 = input.LA(2);
					if ( (LA155_3==190) ) {
						alt155=1;
					}
					}
					break;
				case K_ASCII:
				case K_BIGINT:
				case K_BLOB:
				case K_BOOLEAN:
				case K_CAST:
				case K_COUNT:
				case K_COUNTER:
				case K_DATE:
				case K_DECIMAL:
				case K_DISTINCT:
				case K_DOUBLE:
				case K_DURATION:
				case K_FLOAT:
				case K_INET:
				case K_INT:
				case K_JSON:
				case K_SMALLINT:
				case K_TEXT:
				case K_TIME:
				case K_TIMESTAMP:
				case K_TIMEUUID:
				case K_TINYINT:
				case K_TTL:
				case K_UUID:
				case K_VARCHAR:
				case K_VARINT:
				case K_WRITETIME:
					{
					alt155=1;
					}
					break;
				case K_KEY:
					{
					int LA155_5 = input.LA(2);
					if ( (LA155_5==190) ) {
						alt155=1;
					}
					}
					break;
			}
			switch (alt155) {
				case 1 :
					// Parser.g:1216:8: ks= noncol_ident '.'
					{
					pushFollow(FOLLOW_noncol_ident_in_userTypeName8148);
					ks=noncol_ident();
					state._fsp--;

					match(input,190,FOLLOW_190_in_userTypeName8150); 
					}
					break;

			}

			pushFollow(FOLLOW_non_type_ident_in_userTypeName8156);
			ut=non_type_ident();
			state._fsp--;

			 name = new UTName(ks, ut); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "userTypeName"



	// $ANTLR start "userOrRoleName"
	// Parser.g:1219:1: userOrRoleName returns [RoleName name] : roleName[role] ;
	public final RoleName userOrRoleName() throws RecognitionException {
		RoleName name = null;


		 RoleName role = new RoleName(); 
		try {
			// Parser.g:1221:5: ( roleName[role] )
			// Parser.g:1221:7: roleName[role]
			{
			pushFollow(FOLLOW_roleName_in_userOrRoleName8188);
			roleName(role);
			state._fsp--;

			name = role;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "userOrRoleName"



	// $ANTLR start "ksName"
	// Parser.g:1224:1: ksName[KeyspaceElementName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void ksName(KeyspaceElementName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1225:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt156=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt156=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt156=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt156=3;
				}
				break;
			case QMARK:
				{
				alt156=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 156, 0, input);
				throw nvae;
			}
			switch (alt156) {
				case 1 :
					// Parser.g:1225:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_ksName8211); 
					 name.setKeyspace((t!=null?t.getText():null), false);
					}
					break;
				case 2 :
					// Parser.g:1226:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_ksName8236); 
					 name.setKeyspace((t!=null?t.getText():null), true);
					}
					break;
				case 3 :
					// Parser.g:1227:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_ksName8255);
					k=unreserved_keyword();
					state._fsp--;

					 name.setKeyspace(k, false);
					}
					break;
				case 4 :
					// Parser.g:1228:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_ksName8265); 
					addRecognitionError("Bind variables cannot be used for keyspace names");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ksName"



	// $ANTLR start "cfName"
	// Parser.g:1231:1: cfName[CFName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void cfName(CFName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1232:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt157=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt157=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt157=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt157=3;
				}
				break;
			case QMARK:
				{
				alt157=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 157, 0, input);
				throw nvae;
			}
			switch (alt157) {
				case 1 :
					// Parser.g:1232:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cfName8287); 
					 name.setColumnFamily((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1233:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cfName8312); 
					 name.setColumnFamily((t!=null?t.getText():null), true); 
					}
					break;
				case 3 :
					// Parser.g:1234:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_cfName8331);
					k=unreserved_keyword();
					state._fsp--;

					 name.setColumnFamily(k, false); 
					}
					break;
				case 4 :
					// Parser.g:1235:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_cfName8341); 
					addRecognitionError("Bind variables cannot be used for table names");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfName"



	// $ANTLR start "idxName"
	// Parser.g:1238:1: idxName[IndexName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void idxName(IndexName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1239:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt158=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt158=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt158=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt158=3;
				}
				break;
			case QMARK:
				{
				alt158=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 158, 0, input);
				throw nvae;
			}
			switch (alt158) {
				case 1 :
					// Parser.g:1239:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_idxName8363); 
					 name.setIndex((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1240:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_idxName8388); 
					 name.setIndex((t!=null?t.getText():null), true);
					}
					break;
				case 3 :
					// Parser.g:1241:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_idxName8407);
					k=unreserved_keyword();
					state._fsp--;

					 name.setIndex(k, false); 
					}
					break;
				case 4 :
					// Parser.g:1242:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_idxName8417); 
					addRecognitionError("Bind variables cannot be used for index names");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "idxName"



	// $ANTLR start "roleName"
	// Parser.g:1245:1: roleName[RoleName name] : (t= IDENT |s= STRING_LITERAL |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void roleName(RoleName name) throws RecognitionException {
		Token t=null;
		Token s=null;
		String k =null;

		try {
			// Parser.g:1246:5: (t= IDENT |s= STRING_LITERAL |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt159=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt159=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt159=2;
				}
				break;
			case QUOTED_NAME:
				{
				alt159=3;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt159=4;
				}
				break;
			case QMARK:
				{
				alt159=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 159, 0, input);
				throw nvae;
			}
			switch (alt159) {
				case 1 :
					// Parser.g:1246:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_roleName8439); 
					 name.setName((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1247:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_roleName8464); 
					 name.setName((s!=null?s.getText():null), true); 
					}
					break;
				case 3 :
					// Parser.g:1248:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_roleName8480); 
					 name.setName((t!=null?t.getText():null), true); 
					}
					break;
				case 4 :
					// Parser.g:1249:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_roleName8499);
					k=unreserved_keyword();
					state._fsp--;

					 name.setName(k, false); 
					}
					break;
				case 5 :
					// Parser.g:1250:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_roleName8509); 
					addRecognitionError("Bind variables cannot be used for role names");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleName"



	// $ANTLR start "constant"
	// Parser.g:1253:1: constant returns [Constants.Literal constant] : (t= STRING_LITERAL |t= INTEGER |t= FLOAT |t= BOOLEAN |t= DURATION |t= UUID |t= HEXNUMBER | ( '-' )? t= ( K_NAN | K_INFINITY ) );
	public final Constants.Literal constant() throws RecognitionException {
		Constants.Literal constant = null;


		Token t=null;

		try {
			// Parser.g:1254:5: (t= STRING_LITERAL |t= INTEGER |t= FLOAT |t= BOOLEAN |t= DURATION |t= UUID |t= HEXNUMBER | ( '-' )? t= ( K_NAN | K_INFINITY ) )
			int alt161=8;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt161=1;
				}
				break;
			case INTEGER:
				{
				alt161=2;
				}
				break;
			case FLOAT:
				{
				alt161=3;
				}
				break;
			case BOOLEAN:
				{
				alt161=4;
				}
				break;
			case DURATION:
				{
				alt161=5;
				}
				break;
			case UUID:
				{
				alt161=6;
				}
				break;
			case HEXNUMBER:
				{
				alt161=7;
				}
				break;
			case K_INFINITY:
			case K_NAN:
			case 188:
				{
				alt161=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 161, 0, input);
				throw nvae;
			}
			switch (alt161) {
				case 1 :
					// Parser.g:1254:7: t= STRING_LITERAL
					{
					t=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant8534); 
					 constant = Constants.Literal.string((t!=null?t.getText():null)); 
					}
					break;
				case 2 :
					// Parser.g:1255:7: t= INTEGER
					{
					t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_constant8546); 
					 constant = Constants.Literal.integer((t!=null?t.getText():null)); 
					}
					break;
				case 3 :
					// Parser.g:1256:7: t= FLOAT
					{
					t=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant8565); 
					 constant = Constants.Literal.floatingPoint((t!=null?t.getText():null)); 
					}
					break;
				case 4 :
					// Parser.g:1257:7: t= BOOLEAN
					{
					t=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_constant8586); 
					 constant = Constants.Literal.bool((t!=null?t.getText():null)); 
					}
					break;
				case 5 :
					// Parser.g:1258:7: t= DURATION
					{
					t=(Token)match(input,DURATION,FOLLOW_DURATION_in_constant8605); 
					 constant = Constants.Literal.duration((t!=null?t.getText():null));
					}
					break;
				case 6 :
					// Parser.g:1259:7: t= UUID
					{
					t=(Token)match(input,UUID,FOLLOW_UUID_in_constant8623); 
					 constant = Constants.Literal.uuid((t!=null?t.getText():null)); 
					}
					break;
				case 7 :
					// Parser.g:1260:7: t= HEXNUMBER
					{
					t=(Token)match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_constant8645); 
					 constant = Constants.Literal.hex((t!=null?t.getText():null)); 
					}
					break;
				case 8 :
					// Parser.g:1261:7: ( '-' )? t= ( K_NAN | K_INFINITY )
					{
					 String sign=""; 
					// Parser.g:1261:27: ( '-' )?
					int alt160=2;
					int LA160_0 = input.LA(1);
					if ( (LA160_0==188) ) {
						alt160=1;
					}
					switch (alt160) {
						case 1 :
							// Parser.g:1261:28: '-'
							{
							match(input,188,FOLLOW_188_in_constant8663); 
							sign = "-"; 
							}
							break;

					}

					t=input.LT(1);
					if ( input.LA(1)==K_INFINITY||input.LA(1)==K_NAN ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					 constant = Constants.Literal.floatingPoint(sign + (t!=null?t.getText():null)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return constant;
	}
	// $ANTLR end "constant"



	// $ANTLR start "mapLiteral"
	// Parser.g:1264:1: mapLiteral returns [Maps.Literal map] : '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' ;
	public final Maps.Literal mapLiteral() throws RecognitionException {
		Maps.Literal map = null;


		Term.Raw k1 =null;
		Term.Raw v1 =null;
		Term.Raw kn =null;
		Term.Raw vn =null;

		try {
			// Parser.g:1265:5: ( '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' )
			// Parser.g:1265:7: '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}'
			{
			match(input,202,FOLLOW_202_in_mapLiteral8701); 
			 List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); 
			// Parser.g:1266:11: (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )?
			int alt163=2;
			int LA163_0 = input.LA(1);
			if ( (LA163_0==BOOLEAN||LA163_0==DURATION||LA163_0==FLOAT||LA163_0==HEXNUMBER||(LA163_0 >= IDENT && LA163_0 <= INTEGER)||(LA163_0 >= K_AGGREGATE && LA163_0 <= K_ALL)||LA163_0==K_AS||LA163_0==K_ASCII||(LA163_0 >= K_BIGINT && LA163_0 <= K_BOOLEAN)||(LA163_0 >= K_CALLED && LA163_0 <= K_CLUSTERING)||(LA163_0 >= K_COMPACT && LA163_0 <= K_COUNTER)||(LA163_0 >= K_CUSTOM && LA163_0 <= K_DECIMAL)||(LA163_0 >= K_DISTINCT && LA163_0 <= K_DOUBLE)||LA163_0==K_DURATION||(LA163_0 >= K_EXISTS && LA163_0 <= K_FLOAT)||LA163_0==K_FROZEN||(LA163_0 >= K_FUNCTION && LA163_0 <= K_FUNCTIONS)||LA163_0==K_GROUP||(LA163_0 >= K_INET && LA163_0 <= K_INPUT)||LA163_0==K_INT||(LA163_0 >= K_JSON && LA163_0 <= K_KEYS)||(LA163_0 >= K_KEYSPACES && LA163_0 <= K_LIKE)||(LA163_0 >= K_LIST && LA163_0 <= K_MAP)||(LA163_0 >= K_NAN && LA163_0 <= K_NOLOGIN)||LA163_0==K_NOSUPERUSER||LA163_0==K_NULL||LA163_0==K_OPTIONS||(LA163_0 >= K_PARTITION && LA163_0 <= K_PERMISSIONS)||LA163_0==K_RETURNS||(LA163_0 >= K_ROLE && LA163_0 <= K_ROLES)||(LA163_0 >= K_SFUNC && LA163_0 <= K_TINYINT)||(LA163_0 >= K_TOKEN && LA163_0 <= K_TRIGGER)||(LA163_0 >= K_TTL && LA163_0 <= K_TYPE)||(LA163_0 >= K_USER && LA163_0 <= K_USERS)||(LA163_0 >= K_UUID && LA163_0 <= K_VARINT)||LA163_0==K_WRITETIME||(LA163_0 >= QMARK && LA163_0 <= QUOTED_NAME)||LA163_0==STRING_LITERAL||LA163_0==UUID||LA163_0==183||LA163_0==188||LA163_0==191||LA163_0==198||LA163_0==202) ) {
				alt163=1;
			}
			switch (alt163) {
				case 1 :
					// Parser.g:1266:13: k1= term ':' v1= term ( ',' kn= term ':' vn= term )*
					{
					pushFollow(FOLLOW_term_in_mapLiteral8719);
					k1=term();
					state._fsp--;

					match(input,191,FOLLOW_191_in_mapLiteral8721); 
					pushFollow(FOLLOW_term_in_mapLiteral8725);
					v1=term();
					state._fsp--;

					 m.add(Pair.create(k1, v1)); 
					// Parser.g:1266:65: ( ',' kn= term ':' vn= term )*
					loop162:
					while (true) {
						int alt162=2;
						int LA162_0 = input.LA(1);
						if ( (LA162_0==187) ) {
							alt162=1;
						}

						switch (alt162) {
						case 1 :
							// Parser.g:1266:67: ',' kn= term ':' vn= term
							{
							match(input,187,FOLLOW_187_in_mapLiteral8731); 
							pushFollow(FOLLOW_term_in_mapLiteral8735);
							kn=term();
							state._fsp--;

							match(input,191,FOLLOW_191_in_mapLiteral8737); 
							pushFollow(FOLLOW_term_in_mapLiteral8741);
							vn=term();
							state._fsp--;

							 m.add(Pair.create(kn, vn)); 
							}
							break;

						default :
							break loop162;
						}
					}

					}
					break;

			}

			match(input,203,FOLLOW_203_in_mapLiteral8757); 
			 map = new Maps.Literal(m); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return map;
	}
	// $ANTLR end "mapLiteral"



	// $ANTLR start "setOrMapLiteral"
	// Parser.g:1270:1: setOrMapLiteral[Term.Raw t] returns [Term.Raw value] : ( ':' v= term ( ',' kn= term ':' vn= term )* | ( ',' tn= term )* );
	public final Term.Raw setOrMapLiteral(Term.Raw t) throws RecognitionException {
		Term.Raw value = null;


		Term.Raw v =null;
		Term.Raw kn =null;
		Term.Raw vn =null;
		Term.Raw tn =null;

		try {
			// Parser.g:1271:5: ( ':' v= term ( ',' kn= term ':' vn= term )* | ( ',' tn= term )* )
			int alt166=2;
			int LA166_0 = input.LA(1);
			if ( (LA166_0==191) ) {
				alt166=1;
			}
			else if ( (LA166_0==187||LA166_0==203) ) {
				alt166=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 166, 0, input);
				throw nvae;
			}

			switch (alt166) {
				case 1 :
					// Parser.g:1271:7: ':' v= term ( ',' kn= term ':' vn= term )*
					{
					match(input,191,FOLLOW_191_in_setOrMapLiteral8781); 
					pushFollow(FOLLOW_term_in_setOrMapLiteral8785);
					v=term();
					state._fsp--;

					 List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); m.add(Pair.create(t, v)); 
					// Parser.g:1272:11: ( ',' kn= term ':' vn= term )*
					loop164:
					while (true) {
						int alt164=2;
						int LA164_0 = input.LA(1);
						if ( (LA164_0==187) ) {
							alt164=1;
						}

						switch (alt164) {
						case 1 :
							// Parser.g:1272:13: ',' kn= term ':' vn= term
							{
							match(input,187,FOLLOW_187_in_setOrMapLiteral8801); 
							pushFollow(FOLLOW_term_in_setOrMapLiteral8805);
							kn=term();
							state._fsp--;

							match(input,191,FOLLOW_191_in_setOrMapLiteral8807); 
							pushFollow(FOLLOW_term_in_setOrMapLiteral8811);
							vn=term();
							state._fsp--;

							 m.add(Pair.create(kn, vn)); 
							}
							break;

						default :
							break loop164;
						}
					}

					 value = new Maps.Literal(m); 
					}
					break;
				case 2 :
					// Parser.g:1274:7: ( ',' tn= term )*
					{
					 List<Term.Raw> s = new ArrayList<Term.Raw>(); s.add(t); 
					// Parser.g:1275:11: ( ',' tn= term )*
					loop165:
					while (true) {
						int alt165=2;
						int LA165_0 = input.LA(1);
						if ( (LA165_0==187) ) {
							alt165=1;
						}

						switch (alt165) {
						case 1 :
							// Parser.g:1275:13: ',' tn= term
							{
							match(input,187,FOLLOW_187_in_setOrMapLiteral8846); 
							pushFollow(FOLLOW_term_in_setOrMapLiteral8850);
							tn=term();
							state._fsp--;

							 s.add(tn); 
							}
							break;

						default :
							break loop165;
						}
					}

					 value = new Sets.Literal(s); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "setOrMapLiteral"



	// $ANTLR start "collectionLiteral"
	// Parser.g:1279:1: collectionLiteral returns [Term.Raw value] : ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= setOrMapLiteral[t] '}' | '{' '}' );
	public final Term.Raw collectionLiteral() throws RecognitionException {
		Term.Raw value = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;
		Term.Raw t =null;
		Term.Raw v =null;

		try {
			// Parser.g:1280:5: ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= setOrMapLiteral[t] '}' | '{' '}' )
			int alt169=3;
			int LA169_0 = input.LA(1);
			if ( (LA169_0==198) ) {
				alt169=1;
			}
			else if ( (LA169_0==202) ) {
				int LA169_2 = input.LA(2);
				if ( (LA169_2==203) ) {
					alt169=3;
				}
				else if ( (LA169_2==BOOLEAN||LA169_2==DURATION||LA169_2==FLOAT||LA169_2==HEXNUMBER||(LA169_2 >= IDENT && LA169_2 <= INTEGER)||(LA169_2 >= K_AGGREGATE && LA169_2 <= K_ALL)||LA169_2==K_AS||LA169_2==K_ASCII||(LA169_2 >= K_BIGINT && LA169_2 <= K_BOOLEAN)||(LA169_2 >= K_CALLED && LA169_2 <= K_CLUSTERING)||(LA169_2 >= K_COMPACT && LA169_2 <= K_COUNTER)||(LA169_2 >= K_CUSTOM && LA169_2 <= K_DECIMAL)||(LA169_2 >= K_DISTINCT && LA169_2 <= K_DOUBLE)||LA169_2==K_DURATION||(LA169_2 >= K_EXISTS && LA169_2 <= K_FLOAT)||LA169_2==K_FROZEN||(LA169_2 >= K_FUNCTION && LA169_2 <= K_FUNCTIONS)||LA169_2==K_GROUP||(LA169_2 >= K_INET && LA169_2 <= K_INPUT)||LA169_2==K_INT||(LA169_2 >= K_JSON && LA169_2 <= K_KEYS)||(LA169_2 >= K_KEYSPACES && LA169_2 <= K_LIKE)||(LA169_2 >= K_LIST && LA169_2 <= K_MAP)||(LA169_2 >= K_NAN && LA169_2 <= K_NOLOGIN)||LA169_2==K_NOSUPERUSER||LA169_2==K_NULL||LA169_2==K_OPTIONS||(LA169_2 >= K_PARTITION && LA169_2 <= K_PERMISSIONS)||LA169_2==K_RETURNS||(LA169_2 >= K_ROLE && LA169_2 <= K_ROLES)||(LA169_2 >= K_SFUNC && LA169_2 <= K_TINYINT)||(LA169_2 >= K_TOKEN && LA169_2 <= K_TRIGGER)||(LA169_2 >= K_TTL && LA169_2 <= K_TYPE)||(LA169_2 >= K_USER && LA169_2 <= K_USERS)||(LA169_2 >= K_UUID && LA169_2 <= K_VARINT)||LA169_2==K_WRITETIME||(LA169_2 >= QMARK && LA169_2 <= QUOTED_NAME)||LA169_2==STRING_LITERAL||LA169_2==UUID||LA169_2==183||LA169_2==188||LA169_2==191||LA169_2==198||LA169_2==202) ) {
					alt169=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 169, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 169, 0, input);
				throw nvae;
			}

			switch (alt169) {
				case 1 :
					// Parser.g:1280:7: '[' (t1= term ( ',' tn= term )* )? ']'
					{
					match(input,198,FOLLOW_198_in_collectionLiteral8884); 
					 List<Term.Raw> l = new ArrayList<Term.Raw>(); 
					// Parser.g:1281:11: (t1= term ( ',' tn= term )* )?
					int alt168=2;
					int LA168_0 = input.LA(1);
					if ( (LA168_0==BOOLEAN||LA168_0==DURATION||LA168_0==FLOAT||LA168_0==HEXNUMBER||(LA168_0 >= IDENT && LA168_0 <= INTEGER)||(LA168_0 >= K_AGGREGATE && LA168_0 <= K_ALL)||LA168_0==K_AS||LA168_0==K_ASCII||(LA168_0 >= K_BIGINT && LA168_0 <= K_BOOLEAN)||(LA168_0 >= K_CALLED && LA168_0 <= K_CLUSTERING)||(LA168_0 >= K_COMPACT && LA168_0 <= K_COUNTER)||(LA168_0 >= K_CUSTOM && LA168_0 <= K_DECIMAL)||(LA168_0 >= K_DISTINCT && LA168_0 <= K_DOUBLE)||LA168_0==K_DURATION||(LA168_0 >= K_EXISTS && LA168_0 <= K_FLOAT)||LA168_0==K_FROZEN||(LA168_0 >= K_FUNCTION && LA168_0 <= K_FUNCTIONS)||LA168_0==K_GROUP||(LA168_0 >= K_INET && LA168_0 <= K_INPUT)||LA168_0==K_INT||(LA168_0 >= K_JSON && LA168_0 <= K_KEYS)||(LA168_0 >= K_KEYSPACES && LA168_0 <= K_LIKE)||(LA168_0 >= K_LIST && LA168_0 <= K_MAP)||(LA168_0 >= K_NAN && LA168_0 <= K_NOLOGIN)||LA168_0==K_NOSUPERUSER||LA168_0==K_NULL||LA168_0==K_OPTIONS||(LA168_0 >= K_PARTITION && LA168_0 <= K_PERMISSIONS)||LA168_0==K_RETURNS||(LA168_0 >= K_ROLE && LA168_0 <= K_ROLES)||(LA168_0 >= K_SFUNC && LA168_0 <= K_TINYINT)||(LA168_0 >= K_TOKEN && LA168_0 <= K_TRIGGER)||(LA168_0 >= K_TTL && LA168_0 <= K_TYPE)||(LA168_0 >= K_USER && LA168_0 <= K_USERS)||(LA168_0 >= K_UUID && LA168_0 <= K_VARINT)||LA168_0==K_WRITETIME||(LA168_0 >= QMARK && LA168_0 <= QUOTED_NAME)||LA168_0==STRING_LITERAL||LA168_0==UUID||LA168_0==183||LA168_0==188||LA168_0==191||LA168_0==198||LA168_0==202) ) {
						alt168=1;
					}
					switch (alt168) {
						case 1 :
							// Parser.g:1281:13: t1= term ( ',' tn= term )*
							{
							pushFollow(FOLLOW_term_in_collectionLiteral8902);
							t1=term();
							state._fsp--;

							 l.add(t1); 
							// Parser.g:1281:36: ( ',' tn= term )*
							loop167:
							while (true) {
								int alt167=2;
								int LA167_0 = input.LA(1);
								if ( (LA167_0==187) ) {
									alt167=1;
								}

								switch (alt167) {
								case 1 :
									// Parser.g:1281:38: ',' tn= term
									{
									match(input,187,FOLLOW_187_in_collectionLiteral8908); 
									pushFollow(FOLLOW_term_in_collectionLiteral8912);
									tn=term();
									state._fsp--;

									 l.add(tn); 
									}
									break;

								default :
									break loop167;
								}
							}

							}
							break;

					}

					match(input,200,FOLLOW_200_in_collectionLiteral8928); 
					 value = new Lists.Literal(l); 
					}
					break;
				case 2 :
					// Parser.g:1283:7: '{' t= term v= setOrMapLiteral[t] '}'
					{
					match(input,202,FOLLOW_202_in_collectionLiteral8938); 
					pushFollow(FOLLOW_term_in_collectionLiteral8942);
					t=term();
					state._fsp--;

					pushFollow(FOLLOW_setOrMapLiteral_in_collectionLiteral8946);
					v=setOrMapLiteral(t);
					state._fsp--;

					 value = v; 
					match(input,203,FOLLOW_203_in_collectionLiteral8951); 
					}
					break;
				case 3 :
					// Parser.g:1286:7: '{' '}'
					{
					match(input,202,FOLLOW_202_in_collectionLiteral8969); 
					match(input,203,FOLLOW_203_in_collectionLiteral8971); 
					 value = new Sets.Literal(Collections.<Term.Raw>emptyList()); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "collectionLiteral"



	// $ANTLR start "usertypeLiteral"
	// Parser.g:1289:1: usertypeLiteral returns [UserTypes.Literal ut] : '{' k1= fident ':' v1= term ( ',' kn= fident ':' vn= term )* '}' ;
	public final UserTypes.Literal usertypeLiteral() throws RecognitionException {
		UserTypes.Literal ut = null;


		FieldIdentifier k1 =null;
		Term.Raw v1 =null;
		FieldIdentifier kn =null;
		Term.Raw vn =null;

		 Map<FieldIdentifier, Term.Raw> m = new HashMap<>(); 
		try {
			// Parser.g:1293:5: ( '{' k1= fident ':' v1= term ( ',' kn= fident ':' vn= term )* '}' )
			// Parser.g:1293:7: '{' k1= fident ':' v1= term ( ',' kn= fident ':' vn= term )* '}'
			{
			match(input,202,FOLLOW_202_in_usertypeLiteral9015); 
			pushFollow(FOLLOW_fident_in_usertypeLiteral9019);
			k1=fident();
			state._fsp--;

			match(input,191,FOLLOW_191_in_usertypeLiteral9021); 
			pushFollow(FOLLOW_term_in_usertypeLiteral9025);
			v1=term();
			state._fsp--;

			 m.put(k1, v1); 
			// Parser.g:1293:52: ( ',' kn= fident ':' vn= term )*
			loop170:
			while (true) {
				int alt170=2;
				int LA170_0 = input.LA(1);
				if ( (LA170_0==187) ) {
					alt170=1;
				}

				switch (alt170) {
				case 1 :
					// Parser.g:1293:54: ',' kn= fident ':' vn= term
					{
					match(input,187,FOLLOW_187_in_usertypeLiteral9031); 
					pushFollow(FOLLOW_fident_in_usertypeLiteral9035);
					kn=fident();
					state._fsp--;

					match(input,191,FOLLOW_191_in_usertypeLiteral9037); 
					pushFollow(FOLLOW_term_in_usertypeLiteral9041);
					vn=term();
					state._fsp--;

					 m.put(kn, vn); 
					}
					break;

				default :
					break loop170;
				}
			}

			match(input,203,FOLLOW_203_in_usertypeLiteral9048); 
			}

			 ut = new UserTypes.Literal(m); 
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ut;
	}
	// $ANTLR end "usertypeLiteral"



	// $ANTLR start "tupleLiteral"
	// Parser.g:1296:1: tupleLiteral returns [Tuples.Literal tt] : '(' t1= term ( ',' tn= term )* ')' ;
	public final Tuples.Literal tupleLiteral() throws RecognitionException {
		Tuples.Literal tt = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;

		 List<Term.Raw> l = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1299:5: ( '(' t1= term ( ',' tn= term )* ')' )
			// Parser.g:1299:7: '(' t1= term ( ',' tn= term )* ')'
			{
			match(input,183,FOLLOW_183_in_tupleLiteral9085); 
			pushFollow(FOLLOW_term_in_tupleLiteral9089);
			t1=term();
			state._fsp--;

			 l.add(t1); 
			// Parser.g:1299:34: ( ',' tn= term )*
			loop171:
			while (true) {
				int alt171=2;
				int LA171_0 = input.LA(1);
				if ( (LA171_0==187) ) {
					alt171=1;
				}

				switch (alt171) {
				case 1 :
					// Parser.g:1299:36: ',' tn= term
					{
					match(input,187,FOLLOW_187_in_tupleLiteral9095); 
					pushFollow(FOLLOW_term_in_tupleLiteral9099);
					tn=term();
					state._fsp--;

					 l.add(tn); 
					}
					break;

				default :
					break loop171;
				}
			}

			match(input,184,FOLLOW_184_in_tupleLiteral9106); 
			}

			 tt = new Tuples.Literal(l); 
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tt;
	}
	// $ANTLR end "tupleLiteral"



	// $ANTLR start "value"
	// Parser.g:1302:1: value returns [Term.Raw value] : (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK );
	public final Term.Raw value() throws RecognitionException {
		Term.Raw value = null;


		Constants.Literal c =null;
		Term.Raw l =null;
		UserTypes.Literal u =null;
		Tuples.Literal t =null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:1303:5: (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK )
			int alt172=7;
			alt172 = dfa172.predict(input);
			switch (alt172) {
				case 1 :
					// Parser.g:1303:7: c= constant
					{
					pushFollow(FOLLOW_constant_in_value9129);
					c=constant();
					state._fsp--;

					 value = c; 
					}
					break;
				case 2 :
					// Parser.g:1304:7: l= collectionLiteral
					{
					pushFollow(FOLLOW_collectionLiteral_in_value9151);
					l=collectionLiteral();
					state._fsp--;

					 value = l; 
					}
					break;
				case 3 :
					// Parser.g:1305:7: u= usertypeLiteral
					{
					pushFollow(FOLLOW_usertypeLiteral_in_value9164);
					u=usertypeLiteral();
					state._fsp--;

					 value = u; 
					}
					break;
				case 4 :
					// Parser.g:1306:7: t= tupleLiteral
					{
					pushFollow(FOLLOW_tupleLiteral_in_value9179);
					t=tupleLiteral();
					state._fsp--;

					 value = t; 
					}
					break;
				case 5 :
					// Parser.g:1307:7: K_NULL
					{
					match(input,K_NULL,FOLLOW_K_NULL_in_value9195); 
					 value = Constants.NULL_LITERAL; 
					}
					break;
				case 6 :
					// Parser.g:1308:7: ':' id= noncol_ident
					{
					match(input,191,FOLLOW_191_in_value9219); 
					pushFollow(FOLLOW_noncol_ident_in_value9223);
					id=noncol_ident();
					state._fsp--;

					 value = newBindVariables(id); 
					}
					break;
				case 7 :
					// Parser.g:1309:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_value9234); 
					 value = newBindVariables(null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "value"



	// $ANTLR start "intValue"
	// Parser.g:1312:1: intValue returns [Term.Raw value] : (t= INTEGER | ':' id= noncol_ident | QMARK );
	public final Term.Raw intValue() throws RecognitionException {
		Term.Raw value = null;


		Token t=null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:1313:5: (t= INTEGER | ':' id= noncol_ident | QMARK )
			int alt173=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt173=1;
				}
				break;
			case 191:
				{
				alt173=2;
				}
				break;
			case QMARK:
				{
				alt173=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 173, 0, input);
				throw nvae;
			}
			switch (alt173) {
				case 1 :
					// Parser.g:1313:7: t= INTEGER
					{
					t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_intValue9274); 
					 value = Constants.Literal.integer((t!=null?t.getText():null)); 
					}
					break;
				case 2 :
					// Parser.g:1314:7: ':' id= noncol_ident
					{
					match(input,191,FOLLOW_191_in_intValue9288); 
					pushFollow(FOLLOW_noncol_ident_in_intValue9292);
					id=noncol_ident();
					state._fsp--;

					 value = newBindVariables(id); 
					}
					break;
				case 3 :
					// Parser.g:1315:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_intValue9303); 
					 value = newBindVariables(null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "intValue"



	// $ANTLR start "functionName"
	// Parser.g:1318:1: functionName returns [FunctionName s] : (ks= keyspaceName '.' )? f= allowedFunctionName ;
	public final FunctionName functionName() throws RecognitionException {
		FunctionName s = null;


		String ks =null;
		String f =null;

		try {
			// Parser.g:1319:5: ( (ks= keyspaceName '.' )? f= allowedFunctionName )
			// Parser.g:1319:7: (ks= keyspaceName '.' )? f= allowedFunctionName
			{
			// Parser.g:1319:7: (ks= keyspaceName '.' )?
			int alt174=2;
			alt174 = dfa174.predict(input);
			switch (alt174) {
				case 1 :
					// Parser.g:1319:8: ks= keyspaceName '.'
					{
					pushFollow(FOLLOW_keyspaceName_in_functionName9337);
					ks=keyspaceName();
					state._fsp--;

					match(input,190,FOLLOW_190_in_functionName9339); 
					}
					break;

			}

			pushFollow(FOLLOW_allowedFunctionName_in_functionName9345);
			f=allowedFunctionName();
			state._fsp--;

			 s = new FunctionName(ks, f); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "functionName"



	// $ANTLR start "allowedFunctionName"
	// Parser.g:1322:1: allowedFunctionName returns [String s] : (f= IDENT |f= QUOTED_NAME |u= unreserved_function_keyword | K_TOKEN | K_COUNT );
	public final String allowedFunctionName() throws RecognitionException {
		String s = null;


		Token f=null;
		String u =null;

		try {
			// Parser.g:1323:5: (f= IDENT |f= QUOTED_NAME |u= unreserved_function_keyword | K_TOKEN | K_COUNT )
			int alt175=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt175=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt175=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
				{
				alt175=3;
				}
				break;
			case K_TOKEN:
				{
				alt175=4;
				}
				break;
			case K_COUNT:
				{
				alt175=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 175, 0, input);
				throw nvae;
			}
			switch (alt175) {
				case 1 :
					// Parser.g:1323:7: f= IDENT
					{
					f=(Token)match(input,IDENT,FOLLOW_IDENT_in_allowedFunctionName9372); 
					 s = (f!=null?f.getText():null).toLowerCase(); 
					}
					break;
				case 2 :
					// Parser.g:1324:7: f= QUOTED_NAME
					{
					f=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_allowedFunctionName9406); 
					 s = (f!=null?f.getText():null); 
					}
					break;
				case 3 :
					// Parser.g:1325:7: u= unreserved_function_keyword
					{
					pushFollow(FOLLOW_unreserved_function_keyword_in_allowedFunctionName9434);
					u=unreserved_function_keyword();
					state._fsp--;

					 s = u; 
					}
					break;
				case 4 :
					// Parser.g:1326:7: K_TOKEN
					{
					match(input,K_TOKEN,FOLLOW_K_TOKEN_in_allowedFunctionName9444); 
					 s = "token"; 
					}
					break;
				case 5 :
					// Parser.g:1327:7: K_COUNT
					{
					match(input,K_COUNT,FOLLOW_K_COUNT_in_allowedFunctionName9476); 
					 s = "count"; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "allowedFunctionName"



	// $ANTLR start "function"
	// Parser.g:1330:1: function returns [Term.Raw t] : (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' );
	public final Term.Raw function() throws RecognitionException {
		Term.Raw t = null;


		FunctionName f =null;
		List<Term.Raw> args =null;

		try {
			// Parser.g:1331:5: (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' )
			int alt176=2;
			alt176 = dfa176.predict(input);
			switch (alt176) {
				case 1 :
					// Parser.g:1331:7: f= functionName '(' ')'
					{
					pushFollow(FOLLOW_functionName_in_function9523);
					f=functionName();
					state._fsp--;

					match(input,183,FOLLOW_183_in_function9525); 
					match(input,184,FOLLOW_184_in_function9527); 
					 t = new FunctionCall.Raw(f, Collections.<Term.Raw>emptyList()); 
					}
					break;
				case 2 :
					// Parser.g:1332:7: f= functionName '(' args= functionArgs ')'
					{
					pushFollow(FOLLOW_functionName_in_function9557);
					f=functionName();
					state._fsp--;

					match(input,183,FOLLOW_183_in_function9559); 
					pushFollow(FOLLOW_functionArgs_in_function9563);
					args=functionArgs();
					state._fsp--;

					match(input,184,FOLLOW_184_in_function9565); 
					 t = new FunctionCall.Raw(f, args); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "function"



	// $ANTLR start "functionArgs"
	// Parser.g:1335:1: functionArgs returns [List<Term.Raw> args] : t1= term ( ',' tn= term )* ;
	public final List<Term.Raw> functionArgs() throws RecognitionException {
		List<Term.Raw> args = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;

		 args = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1337:5: (t1= term ( ',' tn= term )* )
			// Parser.g:1337:7: t1= term ( ',' tn= term )*
			{
			pushFollow(FOLLOW_term_in_functionArgs9598);
			t1=term();
			state._fsp--;

			args.add(t1); 
			// Parser.g:1337:32: ( ',' tn= term )*
			loop177:
			while (true) {
				int alt177=2;
				int LA177_0 = input.LA(1);
				if ( (LA177_0==187) ) {
					alt177=1;
				}

				switch (alt177) {
				case 1 :
					// Parser.g:1337:34: ',' tn= term
					{
					match(input,187,FOLLOW_187_in_functionArgs9604); 
					pushFollow(FOLLOW_term_in_functionArgs9608);
					tn=term();
					state._fsp--;

					 args.add(tn); 
					}
					break;

				default :
					break loop177;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return args;
	}
	// $ANTLR end "functionArgs"



	// $ANTLR start "term"
	// Parser.g:1340:1: term returns [Term.Raw term] : (v= value |f= function | '(' c= comparatorType ')' t= term );
	public final Term.Raw term() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw v =null;
		Term.Raw f =null;
		CQL3Type.Raw c =null;
		Term.Raw t =null;

		try {
			// Parser.g:1341:5: (v= value |f= function | '(' c= comparatorType ')' t= term )
			int alt178=3;
			alt178 = dfa178.predict(input);
			switch (alt178) {
				case 1 :
					// Parser.g:1341:7: v= value
					{
					pushFollow(FOLLOW_value_in_term9636);
					v=value();
					state._fsp--;

					 term = v; 
					}
					break;
				case 2 :
					// Parser.g:1342:7: f= function
					{
					pushFollow(FOLLOW_function_in_term9673);
					f=function();
					state._fsp--;

					 term = f; 
					}
					break;
				case 3 :
					// Parser.g:1343:7: '(' c= comparatorType ')' t= term
					{
					match(input,183,FOLLOW_183_in_term9705); 
					pushFollow(FOLLOW_comparatorType_in_term9709);
					c=comparatorType();
					state._fsp--;

					match(input,184,FOLLOW_184_in_term9711); 
					pushFollow(FOLLOW_term_in_term9715);
					t=term();
					state._fsp--;

					 term = new TypeCast(c, t); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "term"



	// $ANTLR start "columnOperation"
	// Parser.g:1346:1: columnOperation[List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations] : key= cident columnOperationDifferentiator[operations, key] ;
	public final void columnOperation(List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations) throws RecognitionException {
		ColumnDefinition.Raw key =null;

		try {
			// Parser.g:1347:5: (key= cident columnOperationDifferentiator[operations, key] )
			// Parser.g:1347:7: key= cident columnOperationDifferentiator[operations, key]
			{
			pushFollow(FOLLOW_cident_in_columnOperation9738);
			key=cident();
			state._fsp--;

			pushFollow(FOLLOW_columnOperationDifferentiator_in_columnOperation9740);
			columnOperationDifferentiator(operations, key);
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnOperation"



	// $ANTLR start "columnOperationDifferentiator"
	// Parser.g:1350:1: columnOperationDifferentiator[List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key] : ( '=' normalColumnOperation[operations, key] | shorthandColumnOperation[operations, key] | '[' k= term ']' collectionColumnOperation[operations, key, k] | '.' field= fident udtColumnOperation[operations, key, field] );
	public final void columnOperationDifferentiator(List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key) throws RecognitionException {
		Term.Raw k =null;
		FieldIdentifier field =null;

		try {
			// Parser.g:1351:5: ( '=' normalColumnOperation[operations, key] | shorthandColumnOperation[operations, key] | '[' k= term ']' collectionColumnOperation[operations, key, k] | '.' field= fident udtColumnOperation[operations, key, field] )
			int alt179=4;
			switch ( input.LA(1) ) {
			case 195:
				{
				alt179=1;
				}
				break;
			case 186:
			case 189:
				{
				alt179=2;
				}
				break;
			case 198:
				{
				alt179=3;
				}
				break;
			case 190:
				{
				alt179=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 179, 0, input);
				throw nvae;
			}
			switch (alt179) {
				case 1 :
					// Parser.g:1351:7: '=' normalColumnOperation[operations, key]
					{
					match(input,195,FOLLOW_195_in_columnOperationDifferentiator9759); 
					pushFollow(FOLLOW_normalColumnOperation_in_columnOperationDifferentiator9761);
					normalColumnOperation(operations, key);
					state._fsp--;

					}
					break;
				case 2 :
					// Parser.g:1352:7: shorthandColumnOperation[operations, key]
					{
					pushFollow(FOLLOW_shorthandColumnOperation_in_columnOperationDifferentiator9770);
					shorthandColumnOperation(operations, key);
					state._fsp--;

					}
					break;
				case 3 :
					// Parser.g:1353:7: '[' k= term ']' collectionColumnOperation[operations, key, k]
					{
					match(input,198,FOLLOW_198_in_columnOperationDifferentiator9779); 
					pushFollow(FOLLOW_term_in_columnOperationDifferentiator9783);
					k=term();
					state._fsp--;

					match(input,200,FOLLOW_200_in_columnOperationDifferentiator9785); 
					pushFollow(FOLLOW_collectionColumnOperation_in_columnOperationDifferentiator9787);
					collectionColumnOperation(operations, key, k);
					state._fsp--;

					}
					break;
				case 4 :
					// Parser.g:1354:7: '.' field= fident udtColumnOperation[operations, key, field]
					{
					match(input,190,FOLLOW_190_in_columnOperationDifferentiator9796); 
					pushFollow(FOLLOW_fident_in_columnOperationDifferentiator9800);
					field=fident();
					state._fsp--;

					pushFollow(FOLLOW_udtColumnOperation_in_columnOperationDifferentiator9802);
					udtColumnOperation(operations, key, field);
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnOperationDifferentiator"



	// $ANTLR start "normalColumnOperation"
	// Parser.g:1357:1: normalColumnOperation[List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key] : (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER );
	public final void normalColumnOperation(List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key) throws RecognitionException {
		Token sig=null;
		Token i=null;
		Term.Raw t =null;
		ColumnDefinition.Raw c =null;

		try {
			// Parser.g:1358:5: (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER )
			int alt181=3;
			alt181 = dfa181.predict(input);
			switch (alt181) {
				case 1 :
					// Parser.g:1358:7: t= term ( '+' c= cident )?
					{
					pushFollow(FOLLOW_term_in_normalColumnOperation9823);
					t=term();
					state._fsp--;

					// Parser.g:1358:14: ( '+' c= cident )?
					int alt180=2;
					int LA180_0 = input.LA(1);
					if ( (LA180_0==185) ) {
						alt180=1;
					}
					switch (alt180) {
						case 1 :
							// Parser.g:1358:15: '+' c= cident
							{
							match(input,185,FOLLOW_185_in_normalColumnOperation9826); 
							pushFollow(FOLLOW_cident_in_normalColumnOperation9830);
							c=cident();
							state._fsp--;

							}
							break;

					}


					          if (c == null)
					          {
					              addRawUpdate(operations, key, new Operation.SetValue(t));
					          }
					          else
					          {
					              if (!key.equals(c))
					                  addRecognitionError("Only expressions of the form X = <value> + X are supported.");
					              addRawUpdate(operations, key, new Operation.Prepend(t));
					          }
					      
					}
					break;
				case 2 :
					// Parser.g:1371:7: c= cident sig= ( '+' | '-' ) t= term
					{
					pushFollow(FOLLOW_cident_in_normalColumnOperation9851);
					c=cident();
					state._fsp--;

					sig=input.LT(1);
					if ( input.LA(1)==185||input.LA(1)==188 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_normalColumnOperation9865);
					t=term();
					state._fsp--;


					          if (!key.equals(c))
					              addRecognitionError("Only expressions of the form X = X " + (sig!=null?sig.getText():null) + "<value> are supported.");
					          addRawUpdate(operations, key, (sig!=null?sig.getText():null).equals("+") ? new Operation.Addition(t) : new Operation.Substraction(t));
					      
					}
					break;
				case 3 :
					// Parser.g:1377:7: c= cident i= INTEGER
					{
					pushFollow(FOLLOW_cident_in_normalColumnOperation9883);
					c=cident();
					state._fsp--;

					i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_normalColumnOperation9887); 

					          // Note that this production *is* necessary because X = X - 3 will in fact be lexed as [ X, '=', X, INTEGER].
					          if (!key.equals(c))
					              // We don't yet allow a '+' in front of an integer, but we could in the future really, so let's be future-proof in our error message
					              addRecognitionError("Only expressions of the form X = X " + ((i!=null?i.getText():null).charAt(0) == '-' ? '-' : '+') + " <value> are supported.");
					          addRawUpdate(operations, key, new Operation.Addition(Constants.Literal.integer((i!=null?i.getText():null))));
					      
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "normalColumnOperation"



	// $ANTLR start "shorthandColumnOperation"
	// Parser.g:1387:1: shorthandColumnOperation[List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key] : sig= ( '+=' | '-=' ) t= term ;
	public final void shorthandColumnOperation(List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key) throws RecognitionException {
		Token sig=null;
		Term.Raw t =null;

		try {
			// Parser.g:1388:5: (sig= ( '+=' | '-=' ) t= term )
			// Parser.g:1388:7: sig= ( '+=' | '-=' ) t= term
			{
			sig=input.LT(1);
			if ( input.LA(1)==186||input.LA(1)==189 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_term_in_shorthandColumnOperation9925);
			t=term();
			state._fsp--;


			          addRawUpdate(operations, key, (sig!=null?sig.getText():null).equals("+=") ? new Operation.Addition(t) : new Operation.Substraction(t));
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "shorthandColumnOperation"



	// $ANTLR start "collectionColumnOperation"
	// Parser.g:1394:1: collectionColumnOperation[List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key, Term.Raw k] : '=' t= term ;
	public final void collectionColumnOperation(List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key, Term.Raw k) throws RecognitionException {
		Term.Raw t =null;

		try {
			// Parser.g:1395:5: ( '=' t= term )
			// Parser.g:1395:7: '=' t= term
			{
			match(input,195,FOLLOW_195_in_collectionColumnOperation9951); 
			pushFollow(FOLLOW_term_in_collectionColumnOperation9955);
			t=term();
			state._fsp--;


			          addRawUpdate(operations, key, new Operation.SetElement(k, t));
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "collectionColumnOperation"



	// $ANTLR start "udtColumnOperation"
	// Parser.g:1401:1: udtColumnOperation[List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key, FieldIdentifier field] : '=' t= term ;
	public final void udtColumnOperation(List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key, FieldIdentifier field) throws RecognitionException {
		Term.Raw t =null;

		try {
			// Parser.g:1402:5: ( '=' t= term )
			// Parser.g:1402:7: '=' t= term
			{
			match(input,195,FOLLOW_195_in_udtColumnOperation9981); 
			pushFollow(FOLLOW_term_in_udtColumnOperation9985);
			t=term();
			state._fsp--;


			          addRawUpdate(operations, key, new Operation.SetField(field, t));
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "udtColumnOperation"



	// $ANTLR start "columnCondition"
	// Parser.g:1408:1: columnCondition[List<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>> conditions] : key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) ) ;
	public final void columnCondition(List<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>> conditions) throws RecognitionException {
		ColumnDefinition.Raw key =null;
		Operator op =null;
		Term.Raw t =null;
		List<Term.Raw> values =null;
		AbstractMarker.INRaw marker =null;
		Term.Raw element =null;
		FieldIdentifier field =null;

		try {
			// Parser.g:1410:5: (key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) ) )
			// Parser.g:1410:7: key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) )
			{
			pushFollow(FOLLOW_cident_in_columnCondition10018);
			key=cident();
			state._fsp--;

			// Parser.g:1411:9: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) )
			int alt187=4;
			switch ( input.LA(1) ) {
			case 182:
			case 193:
			case 194:
			case 195:
			case 196:
			case 197:
				{
				alt187=1;
				}
				break;
			case K_IN:
				{
				alt187=2;
				}
				break;
			case 198:
				{
				alt187=3;
				}
				break;
			case 190:
				{
				alt187=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 187, 0, input);
				throw nvae;
			}
			switch (alt187) {
				case 1 :
					// Parser.g:1411:11: op= relationType t= term
					{
					pushFollow(FOLLOW_relationType_in_columnCondition10032);
					op=relationType();
					state._fsp--;

					pushFollow(FOLLOW_term_in_columnCondition10036);
					t=term();
					state._fsp--;

					 conditions.add(Pair.create(key, ColumnCondition.Raw.simpleCondition(t, op))); 
					}
					break;
				case 2 :
					// Parser.g:1412:11: K_IN (values= singleColumnInValues |marker= inMarker )
					{
					match(input,K_IN,FOLLOW_K_IN_in_columnCondition10050); 
					// Parser.g:1413:13: (values= singleColumnInValues |marker= inMarker )
					int alt182=2;
					int LA182_0 = input.LA(1);
					if ( (LA182_0==183) ) {
						alt182=1;
					}
					else if ( (LA182_0==QMARK||LA182_0==191) ) {
						alt182=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 182, 0, input);
						throw nvae;
					}

					switch (alt182) {
						case 1 :
							// Parser.g:1413:15: values= singleColumnInValues
							{
							pushFollow(FOLLOW_singleColumnInValues_in_columnCondition10068);
							values=singleColumnInValues();
							state._fsp--;

							 conditions.add(Pair.create(key, ColumnCondition.Raw.simpleInCondition(values))); 
							}
							break;
						case 2 :
							// Parser.g:1414:15: marker= inMarker
							{
							pushFollow(FOLLOW_inMarker_in_columnCondition10088);
							marker=inMarker();
							state._fsp--;

							 conditions.add(Pair.create(key, ColumnCondition.Raw.simpleInCondition(marker))); 
							}
							break;

					}

					}
					break;
				case 3 :
					// Parser.g:1416:11: '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					{
					match(input,198,FOLLOW_198_in_columnCondition10116); 
					pushFollow(FOLLOW_term_in_columnCondition10120);
					element=term();
					state._fsp--;

					match(input,200,FOLLOW_200_in_columnCondition10122); 
					// Parser.g:1417:13: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					int alt184=2;
					int LA184_0 = input.LA(1);
					if ( (LA184_0==182||(LA184_0 >= 193 && LA184_0 <= 197)) ) {
						alt184=1;
					}
					else if ( (LA184_0==K_IN) ) {
						alt184=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 184, 0, input);
						throw nvae;
					}

					switch (alt184) {
						case 1 :
							// Parser.g:1417:15: op= relationType t= term
							{
							pushFollow(FOLLOW_relationType_in_columnCondition10140);
							op=relationType();
							state._fsp--;

							pushFollow(FOLLOW_term_in_columnCondition10144);
							t=term();
							state._fsp--;

							 conditions.add(Pair.create(key, ColumnCondition.Raw.collectionCondition(t, element, op))); 
							}
							break;
						case 2 :
							// Parser.g:1418:15: K_IN (values= singleColumnInValues |marker= inMarker )
							{
							match(input,K_IN,FOLLOW_K_IN_in_columnCondition10162); 
							// Parser.g:1419:17: (values= singleColumnInValues |marker= inMarker )
							int alt183=2;
							int LA183_0 = input.LA(1);
							if ( (LA183_0==183) ) {
								alt183=1;
							}
							else if ( (LA183_0==QMARK||LA183_0==191) ) {
								alt183=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 183, 0, input);
								throw nvae;
							}

							switch (alt183) {
								case 1 :
									// Parser.g:1419:19: values= singleColumnInValues
									{
									pushFollow(FOLLOW_singleColumnInValues_in_columnCondition10184);
									values=singleColumnInValues();
									state._fsp--;

									 conditions.add(Pair.create(key, ColumnCondition.Raw.collectionInCondition(element, values))); 
									}
									break;
								case 2 :
									// Parser.g:1420:19: marker= inMarker
									{
									pushFollow(FOLLOW_inMarker_in_columnCondition10208);
									marker=inMarker();
									state._fsp--;

									 conditions.add(Pair.create(key, ColumnCondition.Raw.collectionInCondition(element, marker))); 
									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 4 :
					// Parser.g:1423:11: '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					{
					match(input,190,FOLLOW_190_in_columnCondition10254); 
					pushFollow(FOLLOW_fident_in_columnCondition10258);
					field=fident();
					state._fsp--;

					// Parser.g:1424:13: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					int alt186=2;
					int LA186_0 = input.LA(1);
					if ( (LA186_0==182||(LA186_0 >= 193 && LA186_0 <= 197)) ) {
						alt186=1;
					}
					else if ( (LA186_0==K_IN) ) {
						alt186=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 186, 0, input);
						throw nvae;
					}

					switch (alt186) {
						case 1 :
							// Parser.g:1424:15: op= relationType t= term
							{
							pushFollow(FOLLOW_relationType_in_columnCondition10276);
							op=relationType();
							state._fsp--;

							pushFollow(FOLLOW_term_in_columnCondition10280);
							t=term();
							state._fsp--;

							 conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldCondition(t, field, op))); 
							}
							break;
						case 2 :
							// Parser.g:1425:15: K_IN (values= singleColumnInValues |marker= inMarker )
							{
							match(input,K_IN,FOLLOW_K_IN_in_columnCondition10298); 
							// Parser.g:1426:17: (values= singleColumnInValues |marker= inMarker )
							int alt185=2;
							int LA185_0 = input.LA(1);
							if ( (LA185_0==183) ) {
								alt185=1;
							}
							else if ( (LA185_0==QMARK||LA185_0==191) ) {
								alt185=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 185, 0, input);
								throw nvae;
							}

							switch (alt185) {
								case 1 :
									// Parser.g:1426:19: values= singleColumnInValues
									{
									pushFollow(FOLLOW_singleColumnInValues_in_columnCondition10320);
									values=singleColumnInValues();
									state._fsp--;

									 conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldInCondition(field, values))); 
									}
									break;
								case 2 :
									// Parser.g:1427:19: marker= inMarker
									{
									pushFollow(FOLLOW_inMarker_in_columnCondition10344);
									marker=inMarker();
									state._fsp--;

									 conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldInCondition(field, marker))); 
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnCondition"



	// $ANTLR start "properties"
	// Parser.g:1433:1: properties[PropertyDefinitions props] : property[props] ( K_AND property[props] )* ;
	public final void properties(PropertyDefinitions props) throws RecognitionException {
		try {
			// Parser.g:1434:5: ( property[props] ( K_AND property[props] )* )
			// Parser.g:1434:7: property[props] ( K_AND property[props] )*
			{
			pushFollow(FOLLOW_property_in_properties10406);
			property(props);
			state._fsp--;

			// Parser.g:1434:23: ( K_AND property[props] )*
			loop188:
			while (true) {
				int alt188=2;
				int LA188_0 = input.LA(1);
				if ( (LA188_0==K_AND) ) {
					alt188=1;
				}

				switch (alt188) {
				case 1 :
					// Parser.g:1434:24: K_AND property[props]
					{
					match(input,K_AND,FOLLOW_K_AND_in_properties10410); 
					pushFollow(FOLLOW_property_in_properties10412);
					property(props);
					state._fsp--;

					}
					break;

				default :
					break loop188;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "properties"



	// $ANTLR start "property"
	// Parser.g:1437:1: property[PropertyDefinitions props] : (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= mapLiteral );
	public final void property(PropertyDefinitions props) throws RecognitionException {
		ColumnIdentifier k =null;
		String simple =null;
		Maps.Literal map =null;

		try {
			// Parser.g:1438:5: (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= mapLiteral )
			int alt189=2;
			alt189 = dfa189.predict(input);
			switch (alt189) {
				case 1 :
					// Parser.g:1438:7: k= noncol_ident '=' simple= propertyValue
					{
					pushFollow(FOLLOW_noncol_ident_in_property10435);
					k=noncol_ident();
					state._fsp--;

					match(input,195,FOLLOW_195_in_property10437); 
					pushFollow(FOLLOW_propertyValue_in_property10441);
					simple=propertyValue();
					state._fsp--;

					 try { props.addProperty(k.toString(), simple); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 
					}
					break;
				case 2 :
					// Parser.g:1439:7: k= noncol_ident '=' map= mapLiteral
					{
					pushFollow(FOLLOW_noncol_ident_in_property10453);
					k=noncol_ident();
					state._fsp--;

					match(input,195,FOLLOW_195_in_property10455); 
					pushFollow(FOLLOW_mapLiteral_in_property10459);
					map=mapLiteral();
					state._fsp--;

					 try { props.addProperty(k.toString(), convertPropertyMap(map)); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "property"



	// $ANTLR start "propertyValue"
	// Parser.g:1442:1: propertyValue returns [String str] : (c= constant |u= unreserved_keyword );
	public final String propertyValue() throws RecognitionException {
		String str = null;


		Constants.Literal c =null;
		String u =null;

		try {
			// Parser.g:1443:5: (c= constant |u= unreserved_keyword )
			int alt190=2;
			int LA190_0 = input.LA(1);
			if ( (LA190_0==BOOLEAN||LA190_0==DURATION||LA190_0==FLOAT||LA190_0==HEXNUMBER||LA190_0==INTEGER||LA190_0==K_INFINITY||LA190_0==K_NAN||LA190_0==STRING_LITERAL||LA190_0==UUID||LA190_0==188) ) {
				alt190=1;
			}
			else if ( ((LA190_0 >= K_AGGREGATE && LA190_0 <= K_ALL)||LA190_0==K_AS||LA190_0==K_ASCII||(LA190_0 >= K_BIGINT && LA190_0 <= K_BOOLEAN)||(LA190_0 >= K_CALLED && LA190_0 <= K_CLUSTERING)||(LA190_0 >= K_COMPACT && LA190_0 <= K_COUNTER)||(LA190_0 >= K_CUSTOM && LA190_0 <= K_DECIMAL)||(LA190_0 >= K_DISTINCT && LA190_0 <= K_DOUBLE)||LA190_0==K_DURATION||(LA190_0 >= K_EXISTS && LA190_0 <= K_FLOAT)||LA190_0==K_FROZEN||(LA190_0 >= K_FUNCTION && LA190_0 <= K_FUNCTIONS)||LA190_0==K_GROUP||LA190_0==K_INET||(LA190_0 >= K_INITCOND && LA190_0 <= K_INPUT)||LA190_0==K_INT||(LA190_0 >= K_JSON && LA190_0 <= K_KEYS)||(LA190_0 >= K_KEYSPACES && LA190_0 <= K_LIKE)||(LA190_0 >= K_LIST && LA190_0 <= K_MAP)||LA190_0==K_NOLOGIN||LA190_0==K_NOSUPERUSER||LA190_0==K_OPTIONS||(LA190_0 >= K_PARTITION && LA190_0 <= K_PERMISSIONS)||LA190_0==K_RETURNS||(LA190_0 >= K_ROLE && LA190_0 <= K_ROLES)||(LA190_0 >= K_SFUNC && LA190_0 <= K_TINYINT)||LA190_0==K_TRIGGER||(LA190_0 >= K_TTL && LA190_0 <= K_TYPE)||(LA190_0 >= K_USER && LA190_0 <= K_USERS)||(LA190_0 >= K_UUID && LA190_0 <= K_VARINT)||LA190_0==K_WRITETIME) ) {
				alt190=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 190, 0, input);
				throw nvae;
			}

			switch (alt190) {
				case 1 :
					// Parser.g:1443:7: c= constant
					{
					pushFollow(FOLLOW_constant_in_propertyValue10484);
					c=constant();
					state._fsp--;

					 str = c.getRawText(); 
					}
					break;
				case 2 :
					// Parser.g:1444:7: u= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_propertyValue10506);
					u=unreserved_keyword();
					state._fsp--;

					 str = u; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "propertyValue"



	// $ANTLR start "relationType"
	// Parser.g:1447:1: relationType returns [Operator op] : ( '=' | '<' | '<=' | '>' | '>=' | '!=' );
	public final Operator relationType() throws RecognitionException {
		Operator op = null;


		try {
			// Parser.g:1448:5: ( '=' | '<' | '<=' | '>' | '>=' | '!=' )
			int alt191=6;
			switch ( input.LA(1) ) {
			case 195:
				{
				alt191=1;
				}
				break;
			case 193:
				{
				alt191=2;
				}
				break;
			case 194:
				{
				alt191=3;
				}
				break;
			case 196:
				{
				alt191=4;
				}
				break;
			case 197:
				{
				alt191=5;
				}
				break;
			case 182:
				{
				alt191=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 191, 0, input);
				throw nvae;
			}
			switch (alt191) {
				case 1 :
					// Parser.g:1448:7: '='
					{
					match(input,195,FOLLOW_195_in_relationType10529); 
					 op = Operator.EQ; 
					}
					break;
				case 2 :
					// Parser.g:1449:7: '<'
					{
					match(input,193,FOLLOW_193_in_relationType10540); 
					 op = Operator.LT; 
					}
					break;
				case 3 :
					// Parser.g:1450:7: '<='
					{
					match(input,194,FOLLOW_194_in_relationType10551); 
					 op = Operator.LTE; 
					}
					break;
				case 4 :
					// Parser.g:1451:7: '>'
					{
					match(input,196,FOLLOW_196_in_relationType10561); 
					 op = Operator.GT; 
					}
					break;
				case 5 :
					// Parser.g:1452:7: '>='
					{
					match(input,197,FOLLOW_197_in_relationType10572); 
					 op = Operator.GTE; 
					}
					break;
				case 6 :
					// Parser.g:1453:7: '!='
					{
					match(input,182,FOLLOW_182_in_relationType10582); 
					 op = Operator.NEQ; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "relationType"



	// $ANTLR start "relation"
	// Parser.g:1456:1: relation[WhereClause.Builder clauses] : (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident K_CONTAINS ( K_KEY )? t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' );
	public final void relation(WhereClause.Builder clauses) throws RecognitionException {
		ColumnDefinition.Raw name =null;
		Operator type =null;
		Term.Raw t =null;
		List<ColumnDefinition.Raw> l =null;
		AbstractMarker.INRaw marker =null;
		List<Term.Raw> inValues =null;
		Term.Raw key =null;
		List<ColumnDefinition.Raw> ids =null;
		Tuples.INRaw tupleInMarker =null;
		List<Tuples.Literal> literals =null;
		List<Tuples.Raw> markers =null;
		Tuples.Literal literal =null;
		Tuples.Raw tupleMarker =null;

		try {
			// Parser.g:1457:5: (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident K_CONTAINS ( K_KEY )? t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' )
			int alt195=10;
			alt195 = dfa195.predict(input);
			switch (alt195) {
				case 1 :
					// Parser.g:1457:7: name= cident type= relationType t= term
					{
					pushFollow(FOLLOW_cident_in_relation10604);
					name=cident();
					state._fsp--;

					pushFollow(FOLLOW_relationType_in_relation10608);
					type=relationType();
					state._fsp--;

					pushFollow(FOLLOW_term_in_relation10612);
					t=term();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, type, t)); 
					}
					break;
				case 2 :
					// Parser.g:1458:7: name= cident K_LIKE t= term
					{
					pushFollow(FOLLOW_cident_in_relation10624);
					name=cident();
					state._fsp--;

					match(input,K_LIKE,FOLLOW_K_LIKE_in_relation10626); 
					pushFollow(FOLLOW_term_in_relation10630);
					t=term();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, Operator.LIKE, t)); 
					}
					break;
				case 3 :
					// Parser.g:1459:7: name= cident K_IS K_NOT K_NULL
					{
					pushFollow(FOLLOW_cident_in_relation10642);
					name=cident();
					state._fsp--;

					match(input,K_IS,FOLLOW_K_IS_in_relation10644); 
					match(input,K_NOT,FOLLOW_K_NOT_in_relation10646); 
					match(input,K_NULL,FOLLOW_K_NULL_in_relation10648); 
					 clauses.add(new SingleColumnRelation(name, Operator.IS_NOT, Constants.NULL_LITERAL)); 
					}
					break;
				case 4 :
					// Parser.g:1460:7: K_TOKEN l= tupleOfIdentifiers type= relationType t= term
					{
					match(input,K_TOKEN,FOLLOW_K_TOKEN_in_relation10658); 
					pushFollow(FOLLOW_tupleOfIdentifiers_in_relation10662);
					l=tupleOfIdentifiers();
					state._fsp--;

					pushFollow(FOLLOW_relationType_in_relation10666);
					type=relationType();
					state._fsp--;

					pushFollow(FOLLOW_term_in_relation10670);
					t=term();
					state._fsp--;

					 clauses.add(new TokenRelation(l, type, t)); 
					}
					break;
				case 5 :
					// Parser.g:1462:7: name= cident K_IN marker= inMarker
					{
					pushFollow(FOLLOW_cident_in_relation10690);
					name=cident();
					state._fsp--;

					match(input,K_IN,FOLLOW_K_IN_in_relation10692); 
					pushFollow(FOLLOW_inMarker_in_relation10696);
					marker=inMarker();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, Operator.IN, marker)); 
					}
					break;
				case 6 :
					// Parser.g:1464:7: name= cident K_IN inValues= singleColumnInValues
					{
					pushFollow(FOLLOW_cident_in_relation10716);
					name=cident();
					state._fsp--;

					match(input,K_IN,FOLLOW_K_IN_in_relation10718); 
					pushFollow(FOLLOW_singleColumnInValues_in_relation10722);
					inValues=singleColumnInValues();
					state._fsp--;

					 clauses.add(SingleColumnRelation.createInRelation(name, inValues)); 
					}
					break;
				case 7 :
					// Parser.g:1466:7: name= cident K_CONTAINS ( K_KEY )? t= term
					{
					pushFollow(FOLLOW_cident_in_relation10742);
					name=cident();
					state._fsp--;

					match(input,K_CONTAINS,FOLLOW_K_CONTAINS_in_relation10744); 
					 Operator rt = Operator.CONTAINS; 
					// Parser.g:1466:67: ( K_KEY )?
					int alt192=2;
					int LA192_0 = input.LA(1);
					if ( (LA192_0==K_KEY) ) {
						int LA192_1 = input.LA(2);
						if ( (LA192_1==BOOLEAN||LA192_1==DURATION||LA192_1==FLOAT||LA192_1==HEXNUMBER||(LA192_1 >= IDENT && LA192_1 <= INTEGER)||(LA192_1 >= K_AGGREGATE && LA192_1 <= K_ALL)||LA192_1==K_AS||LA192_1==K_ASCII||(LA192_1 >= K_BIGINT && LA192_1 <= K_BOOLEAN)||(LA192_1 >= K_CALLED && LA192_1 <= K_CLUSTERING)||(LA192_1 >= K_COMPACT && LA192_1 <= K_COUNTER)||(LA192_1 >= K_CUSTOM && LA192_1 <= K_DECIMAL)||(LA192_1 >= K_DISTINCT && LA192_1 <= K_DOUBLE)||LA192_1==K_DURATION||(LA192_1 >= K_EXISTS && LA192_1 <= K_FLOAT)||LA192_1==K_FROZEN||(LA192_1 >= K_FUNCTION && LA192_1 <= K_FUNCTIONS)||LA192_1==K_GROUP||(LA192_1 >= K_INET && LA192_1 <= K_INPUT)||LA192_1==K_INT||(LA192_1 >= K_JSON && LA192_1 <= K_KEYS)||(LA192_1 >= K_KEYSPACES && LA192_1 <= K_LIKE)||(LA192_1 >= K_LIST && LA192_1 <= K_MAP)||(LA192_1 >= K_NAN && LA192_1 <= K_NOLOGIN)||LA192_1==K_NOSUPERUSER||LA192_1==K_NULL||LA192_1==K_OPTIONS||(LA192_1 >= K_PARTITION && LA192_1 <= K_PERMISSIONS)||LA192_1==K_RETURNS||(LA192_1 >= K_ROLE && LA192_1 <= K_ROLES)||(LA192_1 >= K_SFUNC && LA192_1 <= K_TINYINT)||(LA192_1 >= K_TOKEN && LA192_1 <= K_TRIGGER)||(LA192_1 >= K_TTL && LA192_1 <= K_TYPE)||(LA192_1 >= K_USER && LA192_1 <= K_USERS)||(LA192_1 >= K_UUID && LA192_1 <= K_VARINT)||LA192_1==K_WRITETIME||(LA192_1 >= QMARK && LA192_1 <= QUOTED_NAME)||LA192_1==STRING_LITERAL||LA192_1==UUID||LA192_1==183||LA192_1==188||LA192_1==191||LA192_1==198||LA192_1==202) ) {
							alt192=1;
						}
					}
					switch (alt192) {
						case 1 :
							// Parser.g:1466:68: K_KEY
							{
							match(input,K_KEY,FOLLOW_K_KEY_in_relation10749); 
							 rt = Operator.CONTAINS_KEY; 
							}
							break;

					}

					pushFollow(FOLLOW_term_in_relation10765);
					t=term();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, rt, t)); 
					}
					break;
				case 8 :
					// Parser.g:1468:7: name= cident '[' key= term ']' type= relationType t= term
					{
					pushFollow(FOLLOW_cident_in_relation10777);
					name=cident();
					state._fsp--;

					match(input,198,FOLLOW_198_in_relation10779); 
					pushFollow(FOLLOW_term_in_relation10783);
					key=term();
					state._fsp--;

					match(input,200,FOLLOW_200_in_relation10785); 
					pushFollow(FOLLOW_relationType_in_relation10789);
					type=relationType();
					state._fsp--;

					pushFollow(FOLLOW_term_in_relation10793);
					t=term();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, key, type, t)); 
					}
					break;
				case 9 :
					// Parser.g:1469:7: ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )
					{
					pushFollow(FOLLOW_tupleOfIdentifiers_in_relation10805);
					ids=tupleOfIdentifiers();
					state._fsp--;

					// Parser.g:1470:7: ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )
					int alt194=3;
					alt194 = dfa194.predict(input);
					switch (alt194) {
						case 1 :
							// Parser.g:1470:9: K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples )
							{
							match(input,K_IN,FOLLOW_K_IN_in_relation10815); 
							// Parser.g:1471:11: ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples )
							int alt193=4;
							int LA193_0 = input.LA(1);
							if ( (LA193_0==183) ) {
								switch ( input.LA(2) ) {
								case 184:
									{
									alt193=1;
									}
									break;
								case 183:
									{
									alt193=3;
									}
									break;
								case QMARK:
								case 191:
									{
									alt193=4;
									}
									break;
								default:
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 193, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else if ( (LA193_0==QMARK||LA193_0==191) ) {
								alt193=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 193, 0, input);
								throw nvae;
							}

							switch (alt193) {
								case 1 :
									// Parser.g:1471:13: '(' ')'
									{
									match(input,183,FOLLOW_183_in_relation10829); 
									match(input,184,FOLLOW_184_in_relation10831); 
									 clauses.add(MultiColumnRelation.createInRelation(ids, new ArrayList<Tuples.Literal>())); 
									}
									break;
								case 2 :
									// Parser.g:1473:13: tupleInMarker= inMarkerForTuple
									{
									pushFollow(FOLLOW_inMarkerForTuple_in_relation10863);
									tupleInMarker=inMarkerForTuple();
									state._fsp--;

									 clauses.add(MultiColumnRelation.createSingleMarkerInRelation(ids, tupleInMarker)); 
									}
									break;
								case 3 :
									// Parser.g:1475:13: literals= tupleOfTupleLiterals
									{
									pushFollow(FOLLOW_tupleOfTupleLiterals_in_relation10897);
									literals=tupleOfTupleLiterals();
									state._fsp--;


									                  clauses.add(MultiColumnRelation.createInRelation(ids, literals));
									              
									}
									break;
								case 4 :
									// Parser.g:1479:13: markers= tupleOfMarkersForTuples
									{
									pushFollow(FOLLOW_tupleOfMarkersForTuples_in_relation10931);
									markers=tupleOfMarkersForTuples();
									state._fsp--;

									 clauses.add(MultiColumnRelation.createInRelation(ids, markers)); 
									}
									break;

							}

							}
							break;
						case 2 :
							// Parser.g:1482:9: type= relationType literal= tupleLiteral
							{
							pushFollow(FOLLOW_relationType_in_relation10973);
							type=relationType();
							state._fsp--;

							pushFollow(FOLLOW_tupleLiteral_in_relation10977);
							literal=tupleLiteral();
							state._fsp--;


							              clauses.add(MultiColumnRelation.createNonInRelation(ids, type, literal));
							          
							}
							break;
						case 3 :
							// Parser.g:1486:9: type= relationType tupleMarker= markerForTuple
							{
							pushFollow(FOLLOW_relationType_in_relation11003);
							type=relationType();
							state._fsp--;

							pushFollow(FOLLOW_markerForTuple_in_relation11007);
							tupleMarker=markerForTuple();
							state._fsp--;

							 clauses.add(MultiColumnRelation.createNonInRelation(ids, type, tupleMarker)); 
							}
							break;

					}

					}
					break;
				case 10 :
					// Parser.g:1489:7: '(' relation[$clauses] ')'
					{
					match(input,183,FOLLOW_183_in_relation11037); 
					pushFollow(FOLLOW_relation_in_relation11039);
					relation(clauses);
					state._fsp--;

					match(input,184,FOLLOW_184_in_relation11042); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relation"



	// $ANTLR start "inMarker"
	// Parser.g:1492:1: inMarker returns [AbstractMarker.INRaw marker] : ( QMARK | ':' name= noncol_ident );
	public final AbstractMarker.INRaw inMarker() throws RecognitionException {
		AbstractMarker.INRaw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1493:5: ( QMARK | ':' name= noncol_ident )
			int alt196=2;
			int LA196_0 = input.LA(1);
			if ( (LA196_0==QMARK) ) {
				alt196=1;
			}
			else if ( (LA196_0==191) ) {
				alt196=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 196, 0, input);
				throw nvae;
			}

			switch (alt196) {
				case 1 :
					// Parser.g:1493:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_inMarker11063); 
					 marker = newINBindVariables(null); 
					}
					break;
				case 2 :
					// Parser.g:1494:7: ':' name= noncol_ident
					{
					match(input,191,FOLLOW_191_in_inMarker11073); 
					pushFollow(FOLLOW_noncol_ident_in_inMarker11077);
					name=noncol_ident();
					state._fsp--;

					 marker = newINBindVariables(name); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "inMarker"



	// $ANTLR start "tupleOfIdentifiers"
	// Parser.g:1497:1: tupleOfIdentifiers returns [List<ColumnDefinition.Raw> ids] : '(' n1= cident ( ',' ni= cident )* ')' ;
	public final List<ColumnDefinition.Raw> tupleOfIdentifiers() throws RecognitionException {
		List<ColumnDefinition.Raw> ids = null;


		ColumnDefinition.Raw n1 =null;
		ColumnDefinition.Raw ni =null;

		 ids = new ArrayList<ColumnDefinition.Raw>(); 
		try {
			// Parser.g:1499:5: ( '(' n1= cident ( ',' ni= cident )* ')' )
			// Parser.g:1499:7: '(' n1= cident ( ',' ni= cident )* ')'
			{
			match(input,183,FOLLOW_183_in_tupleOfIdentifiers11109); 
			pushFollow(FOLLOW_cident_in_tupleOfIdentifiers11113);
			n1=cident();
			state._fsp--;

			 ids.add(n1); 
			// Parser.g:1499:39: ( ',' ni= cident )*
			loop197:
			while (true) {
				int alt197=2;
				int LA197_0 = input.LA(1);
				if ( (LA197_0==187) ) {
					alt197=1;
				}

				switch (alt197) {
				case 1 :
					// Parser.g:1499:40: ',' ni= cident
					{
					match(input,187,FOLLOW_187_in_tupleOfIdentifiers11118); 
					pushFollow(FOLLOW_cident_in_tupleOfIdentifiers11122);
					ni=cident();
					state._fsp--;

					 ids.add(ni); 
					}
					break;

				default :
					break loop197;
				}
			}

			match(input,184,FOLLOW_184_in_tupleOfIdentifiers11128); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ids;
	}
	// $ANTLR end "tupleOfIdentifiers"



	// $ANTLR start "singleColumnInValues"
	// Parser.g:1502:1: singleColumnInValues returns [List<Term.Raw> terms] : '(' (t1= term ( ',' ti= term )* )? ')' ;
	public final List<Term.Raw> singleColumnInValues() throws RecognitionException {
		List<Term.Raw> terms = null;


		Term.Raw t1 =null;
		Term.Raw ti =null;

		 terms = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1504:5: ( '(' (t1= term ( ',' ti= term )* )? ')' )
			// Parser.g:1504:7: '(' (t1= term ( ',' ti= term )* )? ')'
			{
			match(input,183,FOLLOW_183_in_singleColumnInValues11158); 
			// Parser.g:1504:11: (t1= term ( ',' ti= term )* )?
			int alt199=2;
			int LA199_0 = input.LA(1);
			if ( (LA199_0==BOOLEAN||LA199_0==DURATION||LA199_0==FLOAT||LA199_0==HEXNUMBER||(LA199_0 >= IDENT && LA199_0 <= INTEGER)||(LA199_0 >= K_AGGREGATE && LA199_0 <= K_ALL)||LA199_0==K_AS||LA199_0==K_ASCII||(LA199_0 >= K_BIGINT && LA199_0 <= K_BOOLEAN)||(LA199_0 >= K_CALLED && LA199_0 <= K_CLUSTERING)||(LA199_0 >= K_COMPACT && LA199_0 <= K_COUNTER)||(LA199_0 >= K_CUSTOM && LA199_0 <= K_DECIMAL)||(LA199_0 >= K_DISTINCT && LA199_0 <= K_DOUBLE)||LA199_0==K_DURATION||(LA199_0 >= K_EXISTS && LA199_0 <= K_FLOAT)||LA199_0==K_FROZEN||(LA199_0 >= K_FUNCTION && LA199_0 <= K_FUNCTIONS)||LA199_0==K_GROUP||(LA199_0 >= K_INET && LA199_0 <= K_INPUT)||LA199_0==K_INT||(LA199_0 >= K_JSON && LA199_0 <= K_KEYS)||(LA199_0 >= K_KEYSPACES && LA199_0 <= K_LIKE)||(LA199_0 >= K_LIST && LA199_0 <= K_MAP)||(LA199_0 >= K_NAN && LA199_0 <= K_NOLOGIN)||LA199_0==K_NOSUPERUSER||LA199_0==K_NULL||LA199_0==K_OPTIONS||(LA199_0 >= K_PARTITION && LA199_0 <= K_PERMISSIONS)||LA199_0==K_RETURNS||(LA199_0 >= K_ROLE && LA199_0 <= K_ROLES)||(LA199_0 >= K_SFUNC && LA199_0 <= K_TINYINT)||(LA199_0 >= K_TOKEN && LA199_0 <= K_TRIGGER)||(LA199_0 >= K_TTL && LA199_0 <= K_TYPE)||(LA199_0 >= K_USER && LA199_0 <= K_USERS)||(LA199_0 >= K_UUID && LA199_0 <= K_VARINT)||LA199_0==K_WRITETIME||(LA199_0 >= QMARK && LA199_0 <= QUOTED_NAME)||LA199_0==STRING_LITERAL||LA199_0==UUID||LA199_0==183||LA199_0==188||LA199_0==191||LA199_0==198||LA199_0==202) ) {
				alt199=1;
			}
			switch (alt199) {
				case 1 :
					// Parser.g:1504:13: t1= term ( ',' ti= term )*
					{
					pushFollow(FOLLOW_term_in_singleColumnInValues11166);
					t1=term();
					state._fsp--;

					 terms.add(t1); 
					// Parser.g:1504:43: ( ',' ti= term )*
					loop198:
					while (true) {
						int alt198=2;
						int LA198_0 = input.LA(1);
						if ( (LA198_0==187) ) {
							alt198=1;
						}

						switch (alt198) {
						case 1 :
							// Parser.g:1504:44: ',' ti= term
							{
							match(input,187,FOLLOW_187_in_singleColumnInValues11171); 
							pushFollow(FOLLOW_term_in_singleColumnInValues11175);
							ti=term();
							state._fsp--;

							 terms.add(ti); 
							}
							break;

						default :
							break loop198;
						}
					}

					}
					break;

			}

			match(input,184,FOLLOW_184_in_singleColumnInValues11184); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return terms;
	}
	// $ANTLR end "singleColumnInValues"



	// $ANTLR start "tupleOfTupleLiterals"
	// Parser.g:1507:1: tupleOfTupleLiterals returns [List<Tuples.Literal> literals] : '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' ;
	public final List<Tuples.Literal> tupleOfTupleLiterals() throws RecognitionException {
		List<Tuples.Literal> literals = null;


		Tuples.Literal t1 =null;
		Tuples.Literal ti =null;

		 literals = new ArrayList<>(); 
		try {
			// Parser.g:1509:5: ( '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' )
			// Parser.g:1509:7: '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')'
			{
			match(input,183,FOLLOW_183_in_tupleOfTupleLiterals11214); 
			pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals11218);
			t1=tupleLiteral();
			state._fsp--;

			 literals.add(t1); 
			// Parser.g:1509:50: ( ',' ti= tupleLiteral )*
			loop200:
			while (true) {
				int alt200=2;
				int LA200_0 = input.LA(1);
				if ( (LA200_0==187) ) {
					alt200=1;
				}

				switch (alt200) {
				case 1 :
					// Parser.g:1509:51: ',' ti= tupleLiteral
					{
					match(input,187,FOLLOW_187_in_tupleOfTupleLiterals11223); 
					pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals11227);
					ti=tupleLiteral();
					state._fsp--;

					 literals.add(ti); 
					}
					break;

				default :
					break loop200;
				}
			}

			match(input,184,FOLLOW_184_in_tupleOfTupleLiterals11233); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return literals;
	}
	// $ANTLR end "tupleOfTupleLiterals"



	// $ANTLR start "markerForTuple"
	// Parser.g:1512:1: markerForTuple returns [Tuples.Raw marker] : ( QMARK | ':' name= noncol_ident );
	public final Tuples.Raw markerForTuple() throws RecognitionException {
		Tuples.Raw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1513:5: ( QMARK | ':' name= noncol_ident )
			int alt201=2;
			int LA201_0 = input.LA(1);
			if ( (LA201_0==QMARK) ) {
				alt201=1;
			}
			else if ( (LA201_0==191) ) {
				alt201=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 201, 0, input);
				throw nvae;
			}

			switch (alt201) {
				case 1 :
					// Parser.g:1513:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_markerForTuple11254); 
					 marker = newTupleBindVariables(null); 
					}
					break;
				case 2 :
					// Parser.g:1514:7: ':' name= noncol_ident
					{
					match(input,191,FOLLOW_191_in_markerForTuple11264); 
					pushFollow(FOLLOW_noncol_ident_in_markerForTuple11268);
					name=noncol_ident();
					state._fsp--;

					 marker = newTupleBindVariables(name); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "markerForTuple"



	// $ANTLR start "tupleOfMarkersForTuples"
	// Parser.g:1517:1: tupleOfMarkersForTuples returns [List<Tuples.Raw> markers] : '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' ;
	public final List<Tuples.Raw> tupleOfMarkersForTuples() throws RecognitionException {
		List<Tuples.Raw> markers = null;


		Tuples.Raw m1 =null;
		Tuples.Raw mi =null;

		 markers = new ArrayList<Tuples.Raw>(); 
		try {
			// Parser.g:1519:5: ( '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' )
			// Parser.g:1519:7: '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')'
			{
			match(input,183,FOLLOW_183_in_tupleOfMarkersForTuples11300); 
			pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples11304);
			m1=markerForTuple();
			state._fsp--;

			 markers.add(m1); 
			// Parser.g:1519:51: ( ',' mi= markerForTuple )*
			loop202:
			while (true) {
				int alt202=2;
				int LA202_0 = input.LA(1);
				if ( (LA202_0==187) ) {
					alt202=1;
				}

				switch (alt202) {
				case 1 :
					// Parser.g:1519:52: ',' mi= markerForTuple
					{
					match(input,187,FOLLOW_187_in_tupleOfMarkersForTuples11309); 
					pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples11313);
					mi=markerForTuple();
					state._fsp--;

					 markers.add(mi); 
					}
					break;

				default :
					break loop202;
				}
			}

			match(input,184,FOLLOW_184_in_tupleOfMarkersForTuples11319); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return markers;
	}
	// $ANTLR end "tupleOfMarkersForTuples"



	// $ANTLR start "inMarkerForTuple"
	// Parser.g:1522:1: inMarkerForTuple returns [Tuples.INRaw marker] : ( QMARK | ':' name= noncol_ident );
	public final Tuples.INRaw inMarkerForTuple() throws RecognitionException {
		Tuples.INRaw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1523:5: ( QMARK | ':' name= noncol_ident )
			int alt203=2;
			int LA203_0 = input.LA(1);
			if ( (LA203_0==QMARK) ) {
				alt203=1;
			}
			else if ( (LA203_0==191) ) {
				alt203=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 203, 0, input);
				throw nvae;
			}

			switch (alt203) {
				case 1 :
					// Parser.g:1523:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_inMarkerForTuple11340); 
					 marker = newTupleINBindVariables(null); 
					}
					break;
				case 2 :
					// Parser.g:1524:7: ':' name= noncol_ident
					{
					match(input,191,FOLLOW_191_in_inMarkerForTuple11350); 
					pushFollow(FOLLOW_noncol_ident_in_inMarkerForTuple11354);
					name=noncol_ident();
					state._fsp--;

					 marker = newTupleINBindVariables(name); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "inMarkerForTuple"



	// $ANTLR start "comparatorType"
	// Parser.g:1527:1: comparatorType returns [CQL3Type.Raw t] : (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL );
	public final CQL3Type.Raw comparatorType() throws RecognitionException {
		CQL3Type.Raw t = null;


		Token s=null;
		CQL3Type n =null;
		CQL3Type.Raw c =null;
		CQL3Type.Raw tt =null;
		UTName id =null;
		CQL3Type.Raw f =null;

		try {
			// Parser.g:1528:5: (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL )
			int alt204=6;
			alt204 = dfa204.predict(input);
			switch (alt204) {
				case 1 :
					// Parser.g:1528:7: n= native_type
					{
					pushFollow(FOLLOW_native_type_in_comparatorType11379);
					n=native_type();
					state._fsp--;

					 t = CQL3Type.Raw.from(n); 
					}
					break;
				case 2 :
					// Parser.g:1529:7: c= collection_type
					{
					pushFollow(FOLLOW_collection_type_in_comparatorType11395);
					c=collection_type();
					state._fsp--;

					 t = c; 
					}
					break;
				case 3 :
					// Parser.g:1530:7: tt= tuple_type
					{
					pushFollow(FOLLOW_tuple_type_in_comparatorType11407);
					tt=tuple_type();
					state._fsp--;

					 t = tt; 
					}
					break;
				case 4 :
					// Parser.g:1531:7: id= userTypeName
					{
					pushFollow(FOLLOW_userTypeName_in_comparatorType11423);
					id=userTypeName();
					state._fsp--;

					 t = CQL3Type.Raw.userType(id); 
					}
					break;
				case 5 :
					// Parser.g:1532:7: K_FROZEN '<' f= comparatorType '>'
					{
					match(input,K_FROZEN,FOLLOW_K_FROZEN_in_comparatorType11435); 
					match(input,193,FOLLOW_193_in_comparatorType11437); 
					pushFollow(FOLLOW_comparatorType_in_comparatorType11441);
					f=comparatorType();
					state._fsp--;

					match(input,196,FOLLOW_196_in_comparatorType11443); 

					        try {
					            t = CQL3Type.Raw.frozen(f);
					        } catch (InvalidRequestException e) {
					            addRecognitionError(e.getMessage());
					        }
					      
					}
					break;
				case 6 :
					// Parser.g:1540:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_comparatorType11461); 

					        try {
					            t = CQL3Type.Raw.from(new CQL3Type.Custom((s!=null?s.getText():null)));
					        } catch (SyntaxException e) {
					            addRecognitionError("Cannot parse type " + (s!=null?s.getText():null) + ": " + e.getMessage());
					        } catch (ConfigurationException e) {
					            addRecognitionError("Error setting type " + (s!=null?s.getText():null) + ": " + e.getMessage());
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
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "comparatorType"



	// $ANTLR start "native_type"
	// Parser.g:1552:1: native_type returns [CQL3Type t] : ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_DURATION | K_FLOAT | K_INET | K_INT | K_SMALLINT | K_TEXT | K_TIMESTAMP | K_TINYINT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_DATE | K_TIME );
	public final CQL3Type native_type() throws RecognitionException {
		CQL3Type t = null;


		try {
			// Parser.g:1553:5: ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_DURATION | K_FLOAT | K_INET | K_INT | K_SMALLINT | K_TEXT | K_TIMESTAMP | K_TINYINT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_DATE | K_TIME )
			int alt205=21;
			switch ( input.LA(1) ) {
			case K_ASCII:
				{
				alt205=1;
				}
				break;
			case K_BIGINT:
				{
				alt205=2;
				}
				break;
			case K_BLOB:
				{
				alt205=3;
				}
				break;
			case K_BOOLEAN:
				{
				alt205=4;
				}
				break;
			case K_COUNTER:
				{
				alt205=5;
				}
				break;
			case K_DECIMAL:
				{
				alt205=6;
				}
				break;
			case K_DOUBLE:
				{
				alt205=7;
				}
				break;
			case K_DURATION:
				{
				alt205=8;
				}
				break;
			case K_FLOAT:
				{
				alt205=9;
				}
				break;
			case K_INET:
				{
				alt205=10;
				}
				break;
			case K_INT:
				{
				alt205=11;
				}
				break;
			case K_SMALLINT:
				{
				alt205=12;
				}
				break;
			case K_TEXT:
				{
				alt205=13;
				}
				break;
			case K_TIMESTAMP:
				{
				alt205=14;
				}
				break;
			case K_TINYINT:
				{
				alt205=15;
				}
				break;
			case K_UUID:
				{
				alt205=16;
				}
				break;
			case K_VARCHAR:
				{
				alt205=17;
				}
				break;
			case K_VARINT:
				{
				alt205=18;
				}
				break;
			case K_TIMEUUID:
				{
				alt205=19;
				}
				break;
			case K_DATE:
				{
				alt205=20;
				}
				break;
			case K_TIME:
				{
				alt205=21;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 205, 0, input);
				throw nvae;
			}
			switch (alt205) {
				case 1 :
					// Parser.g:1553:7: K_ASCII
					{
					match(input,K_ASCII,FOLLOW_K_ASCII_in_native_type11490); 
					 t = CQL3Type.Native.ASCII; 
					}
					break;
				case 2 :
					// Parser.g:1554:7: K_BIGINT
					{
					match(input,K_BIGINT,FOLLOW_K_BIGINT_in_native_type11504); 
					 t = CQL3Type.Native.BIGINT; 
					}
					break;
				case 3 :
					// Parser.g:1555:7: K_BLOB
					{
					match(input,K_BLOB,FOLLOW_K_BLOB_in_native_type11517); 
					 t = CQL3Type.Native.BLOB; 
					}
					break;
				case 4 :
					// Parser.g:1556:7: K_BOOLEAN
					{
					match(input,K_BOOLEAN,FOLLOW_K_BOOLEAN_in_native_type11532); 
					 t = CQL3Type.Native.BOOLEAN; 
					}
					break;
				case 5 :
					// Parser.g:1557:7: K_COUNTER
					{
					match(input,K_COUNTER,FOLLOW_K_COUNTER_in_native_type11544); 
					 t = CQL3Type.Native.COUNTER; 
					}
					break;
				case 6 :
					// Parser.g:1558:7: K_DECIMAL
					{
					match(input,K_DECIMAL,FOLLOW_K_DECIMAL_in_native_type11556); 
					 t = CQL3Type.Native.DECIMAL; 
					}
					break;
				case 7 :
					// Parser.g:1559:7: K_DOUBLE
					{
					match(input,K_DOUBLE,FOLLOW_K_DOUBLE_in_native_type11568); 
					 t = CQL3Type.Native.DOUBLE; 
					}
					break;
				case 8 :
					// Parser.g:1560:7: K_DURATION
					{
					match(input,K_DURATION,FOLLOW_K_DURATION_in_native_type11581); 
					 t = CQL3Type.Native.DURATION; 
					}
					break;
				case 9 :
					// Parser.g:1561:7: K_FLOAT
					{
					match(input,K_FLOAT,FOLLOW_K_FLOAT_in_native_type11594); 
					 t = CQL3Type.Native.FLOAT; 
					}
					break;
				case 10 :
					// Parser.g:1562:7: K_INET
					{
					match(input,K_INET,FOLLOW_K_INET_in_native_type11608); 
					 t = CQL3Type.Native.INET;
					}
					break;
				case 11 :
					// Parser.g:1563:7: K_INT
					{
					match(input,K_INT,FOLLOW_K_INT_in_native_type11623); 
					 t = CQL3Type.Native.INT; 
					}
					break;
				case 12 :
					// Parser.g:1564:7: K_SMALLINT
					{
					match(input,K_SMALLINT,FOLLOW_K_SMALLINT_in_native_type11639); 
					 t = CQL3Type.Native.SMALLINT; 
					}
					break;
				case 13 :
					// Parser.g:1565:7: K_TEXT
					{
					match(input,K_TEXT,FOLLOW_K_TEXT_in_native_type11650); 
					 t = CQL3Type.Native.TEXT; 
					}
					break;
				case 14 :
					// Parser.g:1566:7: K_TIMESTAMP
					{
					match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_native_type11665); 
					 t = CQL3Type.Native.TIMESTAMP; 
					}
					break;
				case 15 :
					// Parser.g:1567:7: K_TINYINT
					{
					match(input,K_TINYINT,FOLLOW_K_TINYINT_in_native_type11675); 
					 t = CQL3Type.Native.TINYINT; 
					}
					break;
				case 16 :
					// Parser.g:1568:7: K_UUID
					{
					match(input,K_UUID,FOLLOW_K_UUID_in_native_type11687); 
					 t = CQL3Type.Native.UUID; 
					}
					break;
				case 17 :
					// Parser.g:1569:7: K_VARCHAR
					{
					match(input,K_VARCHAR,FOLLOW_K_VARCHAR_in_native_type11702); 
					 t = CQL3Type.Native.VARCHAR; 
					}
					break;
				case 18 :
					// Parser.g:1570:7: K_VARINT
					{
					match(input,K_VARINT,FOLLOW_K_VARINT_in_native_type11714); 
					 t = CQL3Type.Native.VARINT; 
					}
					break;
				case 19 :
					// Parser.g:1571:7: K_TIMEUUID
					{
					match(input,K_TIMEUUID,FOLLOW_K_TIMEUUID_in_native_type11727); 
					 t = CQL3Type.Native.TIMEUUID; 
					}
					break;
				case 20 :
					// Parser.g:1572:7: K_DATE
					{
					match(input,K_DATE,FOLLOW_K_DATE_in_native_type11738); 
					 t = CQL3Type.Native.DATE; 
					}
					break;
				case 21 :
					// Parser.g:1573:7: K_TIME
					{
					match(input,K_TIME,FOLLOW_K_TIME_in_native_type11753); 
					 t = CQL3Type.Native.TIME; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "native_type"



	// $ANTLR start "collection_type"
	// Parser.g:1576:1: collection_type returns [CQL3Type.Raw pt] : ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' );
	public final CQL3Type.Raw collection_type() throws RecognitionException {
		CQL3Type.Raw pt = null;


		CQL3Type.Raw t1 =null;
		CQL3Type.Raw t2 =null;
		CQL3Type.Raw t =null;

		try {
			// Parser.g:1577:5: ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' )
			int alt206=3;
			switch ( input.LA(1) ) {
			case K_MAP:
				{
				alt206=1;
				}
				break;
			case K_LIST:
				{
				alt206=2;
				}
				break;
			case K_SET:
				{
				alt206=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 206, 0, input);
				throw nvae;
			}
			switch (alt206) {
				case 1 :
					// Parser.g:1577:7: K_MAP '<' t1= comparatorType ',' t2= comparatorType '>'
					{
					match(input,K_MAP,FOLLOW_K_MAP_in_collection_type11781); 
					match(input,193,FOLLOW_193_in_collection_type11784); 
					pushFollow(FOLLOW_comparatorType_in_collection_type11788);
					t1=comparatorType();
					state._fsp--;

					match(input,187,FOLLOW_187_in_collection_type11790); 
					pushFollow(FOLLOW_comparatorType_in_collection_type11794);
					t2=comparatorType();
					state._fsp--;

					match(input,196,FOLLOW_196_in_collection_type11796); 

					            // if we can't parse either t1 or t2, antlr will "recover" and we may have t1 or t2 null.
					            if (t1 != null && t2 != null)
					                pt = CQL3Type.Raw.map(t1, t2);
					        
					}
					break;
				case 2 :
					// Parser.g:1583:7: K_LIST '<' t= comparatorType '>'
					{
					match(input,K_LIST,FOLLOW_K_LIST_in_collection_type11814); 
					match(input,193,FOLLOW_193_in_collection_type11816); 
					pushFollow(FOLLOW_comparatorType_in_collection_type11820);
					t=comparatorType();
					state._fsp--;

					match(input,196,FOLLOW_196_in_collection_type11822); 
					 if (t != null) pt = CQL3Type.Raw.list(t); 
					}
					break;
				case 3 :
					// Parser.g:1585:7: K_SET '<' t= comparatorType '>'
					{
					match(input,K_SET,FOLLOW_K_SET_in_collection_type11840); 
					match(input,193,FOLLOW_193_in_collection_type11843); 
					pushFollow(FOLLOW_comparatorType_in_collection_type11847);
					t=comparatorType();
					state._fsp--;

					match(input,196,FOLLOW_196_in_collection_type11849); 
					 if (t != null) pt = CQL3Type.Raw.set(t); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return pt;
	}
	// $ANTLR end "collection_type"



	// $ANTLR start "tuple_type"
	// Parser.g:1589:1: tuple_type returns [CQL3Type.Raw t] : K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>' ;
	public final CQL3Type.Raw tuple_type() throws RecognitionException {
		CQL3Type.Raw t = null;


		CQL3Type.Raw t1 =null;
		CQL3Type.Raw tn =null;

		try {
			// Parser.g:1590:5: ( K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>' )
			// Parser.g:1590:7: K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>'
			{
			match(input,K_TUPLE,FOLLOW_K_TUPLE_in_tuple_type11880); 
			match(input,193,FOLLOW_193_in_tuple_type11882); 
			 List<CQL3Type.Raw> types = new ArrayList<>(); 
			pushFollow(FOLLOW_comparatorType_in_tuple_type11897);
			t1=comparatorType();
			state._fsp--;

			 types.add(t1); 
			// Parser.g:1591:47: ( ',' tn= comparatorType )*
			loop207:
			while (true) {
				int alt207=2;
				int LA207_0 = input.LA(1);
				if ( (LA207_0==187) ) {
					alt207=1;
				}

				switch (alt207) {
				case 1 :
					// Parser.g:1591:48: ',' tn= comparatorType
					{
					match(input,187,FOLLOW_187_in_tuple_type11902); 
					pushFollow(FOLLOW_comparatorType_in_tuple_type11906);
					tn=comparatorType();
					state._fsp--;

					 types.add(tn); 
					}
					break;

				default :
					break loop207;
				}
			}

			match(input,196,FOLLOW_196_in_tuple_type11918); 
			 t = CQL3Type.Raw.tuple(types); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "tuple_type"


	public static class username_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "username"
	// Parser.g:1595:1: username : ( IDENT | STRING_LITERAL | QUOTED_NAME );
	public final Cql_Parser.username_return username() throws RecognitionException {
		Cql_Parser.username_return retval = new Cql_Parser.username_return();
		retval.start = input.LT(1);

		try {
			// Parser.g:1596:5: ( IDENT | STRING_LITERAL | QUOTED_NAME )
			int alt208=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt208=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt208=2;
				}
				break;
			case QUOTED_NAME:
				{
				alt208=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 208, 0, input);
				throw nvae;
			}
			switch (alt208) {
				case 1 :
					// Parser.g:1596:7: IDENT
					{
					match(input,IDENT,FOLLOW_IDENT_in_username11937); 
					}
					break;
				case 2 :
					// Parser.g:1597:7: STRING_LITERAL
					{
					match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_username11945); 
					}
					break;
				case 3 :
					// Parser.g:1598:7: QUOTED_NAME
					{
					match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_username11953); 
					 addRecognitionError("Quoted strings are are not supported for user names and USER is deprecated, please use ROLE");
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "username"


	public static class mbean_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "mbean"
	// Parser.g:1601:1: mbean : STRING_LITERAL ;
	public final Cql_Parser.mbean_return mbean() throws RecognitionException {
		Cql_Parser.mbean_return retval = new Cql_Parser.mbean_return();
		retval.start = input.LT(1);

		try {
			// Parser.g:1602:5: ( STRING_LITERAL )
			// Parser.g:1602:7: STRING_LITERAL
			{
			match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_mbean11972); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mbean"



	// $ANTLR start "non_type_ident"
	// Parser.g:1607:1: non_type_ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= basic_unreserved_keyword |kk= K_KEY );
	public final ColumnIdentifier non_type_ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		Token kk=null;
		String k =null;

		try {
			// Parser.g:1608:5: (t= IDENT |t= QUOTED_NAME |k= basic_unreserved_keyword |kk= K_KEY )
			int alt209=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt209=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt209=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_CALLED:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_CUSTOM:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INITCOND:
			case K_INPUT:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TRIGGER:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_VALUES:
				{
				alt209=3;
				}
				break;
			case K_KEY:
				{
				alt209=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 209, 0, input);
				throw nvae;
			}
			switch (alt209) {
				case 1 :
					// Parser.g:1608:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_non_type_ident11997); 
					 if (reservedTypeNames.contains((t!=null?t.getText():null))) addRecognitionError("Invalid (reserved) user type name " + (t!=null?t.getText():null)); id = new ColumnIdentifier((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1609:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_non_type_ident12028); 
					 id = new ColumnIdentifier((t!=null?t.getText():null), true); 
					}
					break;
				case 3 :
					// Parser.g:1610:7: k= basic_unreserved_keyword
					{
					pushFollow(FOLLOW_basic_unreserved_keyword_in_non_type_ident12053);
					k=basic_unreserved_keyword();
					state._fsp--;

					 id = new ColumnIdentifier(k, false); 
					}
					break;
				case 4 :
					// Parser.g:1611:7: kk= K_KEY
					{
					kk=(Token)match(input,K_KEY,FOLLOW_K_KEY_in_non_type_ident12065); 
					 id = new ColumnIdentifier((kk!=null?kk.getText():null), false); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "non_type_ident"



	// $ANTLR start "unreserved_keyword"
	// Parser.g:1614:1: unreserved_keyword returns [String str] : (u= unreserved_function_keyword |k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY | K_CAST | K_JSON | K_DISTINCT ) );
	public final String unreserved_keyword() throws RecognitionException {
		String str = null;


		Token k=null;
		String u =null;

		try {
			// Parser.g:1615:5: (u= unreserved_function_keyword |k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY | K_CAST | K_JSON | K_DISTINCT ) )
			int alt210=2;
			int LA210_0 = input.LA(1);
			if ( ((LA210_0 >= K_AGGREGATE && LA210_0 <= K_ALL)||LA210_0==K_AS||LA210_0==K_ASCII||(LA210_0 >= K_BIGINT && LA210_0 <= K_BOOLEAN)||LA210_0==K_CALLED||LA210_0==K_CLUSTERING||(LA210_0 >= K_COMPACT && LA210_0 <= K_CONTAINS)||LA210_0==K_COUNTER||(LA210_0 >= K_CUSTOM && LA210_0 <= K_DECIMAL)||LA210_0==K_DOUBLE||LA210_0==K_DURATION||(LA210_0 >= K_EXISTS && LA210_0 <= K_FLOAT)||LA210_0==K_FROZEN||(LA210_0 >= K_FUNCTION && LA210_0 <= K_FUNCTIONS)||LA210_0==K_GROUP||LA210_0==K_INET||(LA210_0 >= K_INITCOND && LA210_0 <= K_INPUT)||LA210_0==K_INT||LA210_0==K_KEYS||(LA210_0 >= K_KEYSPACES && LA210_0 <= K_LIKE)||(LA210_0 >= K_LIST && LA210_0 <= K_MAP)||LA210_0==K_NOLOGIN||LA210_0==K_NOSUPERUSER||LA210_0==K_OPTIONS||(LA210_0 >= K_PARTITION && LA210_0 <= K_PERMISSIONS)||LA210_0==K_RETURNS||(LA210_0 >= K_ROLE && LA210_0 <= K_ROLES)||(LA210_0 >= K_SFUNC && LA210_0 <= K_TINYINT)||LA210_0==K_TRIGGER||(LA210_0 >= K_TUPLE && LA210_0 <= K_TYPE)||(LA210_0 >= K_USER && LA210_0 <= K_USERS)||(LA210_0 >= K_UUID && LA210_0 <= K_VARINT)) ) {
				alt210=1;
			}
			else if ( (LA210_0==K_CAST||LA210_0==K_COUNT||LA210_0==K_DISTINCT||(LA210_0 >= K_JSON && LA210_0 <= K_KEY)||LA210_0==K_TTL||LA210_0==K_WRITETIME) ) {
				alt210=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 210, 0, input);
				throw nvae;
			}

			switch (alt210) {
				case 1 :
					// Parser.g:1615:7: u= unreserved_function_keyword
					{
					pushFollow(FOLLOW_unreserved_function_keyword_in_unreserved_keyword12108);
					u=unreserved_function_keyword();
					state._fsp--;

					 str = u; 
					}
					break;
				case 2 :
					// Parser.g:1616:7: k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY | K_CAST | K_JSON | K_DISTINCT )
					{
					k=input.LT(1);
					if ( input.LA(1)==K_CAST||input.LA(1)==K_COUNT||input.LA(1)==K_DISTINCT||(input.LA(1) >= K_JSON && input.LA(1) <= K_KEY)||input.LA(1)==K_TTL||input.LA(1)==K_WRITETIME ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					 str = (k!=null?k.getText():null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "unreserved_keyword"



	// $ANTLR start "unreserved_function_keyword"
	// Parser.g:1619:1: unreserved_function_keyword returns [String str] : (u= basic_unreserved_keyword |t= native_type );
	public final String unreserved_function_keyword() throws RecognitionException {
		String str = null;


		String u =null;
		CQL3Type t =null;

		try {
			// Parser.g:1620:5: (u= basic_unreserved_keyword |t= native_type )
			int alt211=2;
			int LA211_0 = input.LA(1);
			if ( ((LA211_0 >= K_AGGREGATE && LA211_0 <= K_ALL)||LA211_0==K_AS||LA211_0==K_CALLED||LA211_0==K_CLUSTERING||(LA211_0 >= K_COMPACT && LA211_0 <= K_CONTAINS)||LA211_0==K_CUSTOM||(LA211_0 >= K_EXISTS && LA211_0 <= K_FINALFUNC)||LA211_0==K_FROZEN||(LA211_0 >= K_FUNCTION && LA211_0 <= K_FUNCTIONS)||LA211_0==K_GROUP||(LA211_0 >= K_INITCOND && LA211_0 <= K_INPUT)||LA211_0==K_KEYS||(LA211_0 >= K_KEYSPACES && LA211_0 <= K_LIKE)||(LA211_0 >= K_LIST && LA211_0 <= K_MAP)||LA211_0==K_NOLOGIN||LA211_0==K_NOSUPERUSER||LA211_0==K_OPTIONS||(LA211_0 >= K_PARTITION && LA211_0 <= K_PERMISSIONS)||LA211_0==K_RETURNS||(LA211_0 >= K_ROLE && LA211_0 <= K_ROLES)||LA211_0==K_SFUNC||(LA211_0 >= K_STATIC && LA211_0 <= K_SUPERUSER)||LA211_0==K_TRIGGER||(LA211_0 >= K_TUPLE && LA211_0 <= K_TYPE)||(LA211_0 >= K_USER && LA211_0 <= K_USERS)||LA211_0==K_VALUES) ) {
				alt211=1;
			}
			else if ( (LA211_0==K_ASCII||(LA211_0 >= K_BIGINT && LA211_0 <= K_BOOLEAN)||LA211_0==K_COUNTER||(LA211_0 >= K_DATE && LA211_0 <= K_DECIMAL)||LA211_0==K_DOUBLE||LA211_0==K_DURATION||LA211_0==K_FLOAT||LA211_0==K_INET||LA211_0==K_INT||LA211_0==K_SMALLINT||(LA211_0 >= K_TEXT && LA211_0 <= K_TINYINT)||LA211_0==K_UUID||(LA211_0 >= K_VARCHAR && LA211_0 <= K_VARINT)) ) {
				alt211=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 211, 0, input);
				throw nvae;
			}

			switch (alt211) {
				case 1 :
					// Parser.g:1620:7: u= basic_unreserved_keyword
					{
					pushFollow(FOLLOW_basic_unreserved_keyword_in_unreserved_function_keyword12175);
					u=basic_unreserved_keyword();
					state._fsp--;

					 str = u; 
					}
					break;
				case 2 :
					// Parser.g:1621:7: t= native_type
					{
					pushFollow(FOLLOW_native_type_in_unreserved_function_keyword12187);
					t=native_type();
					state._fsp--;

					 str = t.toString(); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "unreserved_function_keyword"



	// $ANTLR start "basic_unreserved_keyword"
	// Parser.g:1624:1: basic_unreserved_keyword returns [String str] : k= ( K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_CONTAINS | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION | K_GROUP ) ;
	public final String basic_unreserved_keyword() throws RecognitionException {
		String str = null;


		Token k=null;

		try {
			// Parser.g:1625:5: (k= ( K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_CONTAINS | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION | K_GROUP ) )
			// Parser.g:1625:7: k= ( K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_CONTAINS | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION | K_GROUP )
			{
			k=input.LT(1);
			if ( (input.LA(1) >= K_AGGREGATE && input.LA(1) <= K_ALL)||input.LA(1)==K_AS||input.LA(1)==K_CALLED||input.LA(1)==K_CLUSTERING||(input.LA(1) >= K_COMPACT && input.LA(1) <= K_CONTAINS)||input.LA(1)==K_CUSTOM||(input.LA(1) >= K_EXISTS && input.LA(1) <= K_FINALFUNC)||input.LA(1)==K_FROZEN||(input.LA(1) >= K_FUNCTION && input.LA(1) <= K_FUNCTIONS)||input.LA(1)==K_GROUP||(input.LA(1) >= K_INITCOND && input.LA(1) <= K_INPUT)||input.LA(1)==K_KEYS||(input.LA(1) >= K_KEYSPACES && input.LA(1) <= K_LIKE)||(input.LA(1) >= K_LIST && input.LA(1) <= K_MAP)||input.LA(1)==K_NOLOGIN||input.LA(1)==K_NOSUPERUSER||input.LA(1)==K_OPTIONS||(input.LA(1) >= K_PARTITION && input.LA(1) <= K_PERMISSIONS)||input.LA(1)==K_RETURNS||(input.LA(1) >= K_ROLE && input.LA(1) <= K_ROLES)||input.LA(1)==K_SFUNC||(input.LA(1) >= K_STATIC && input.LA(1) <= K_SUPERUSER)||input.LA(1)==K_TRIGGER||(input.LA(1) >= K_TUPLE && input.LA(1) <= K_TYPE)||(input.LA(1) >= K_USER && input.LA(1) <= K_USERS)||input.LA(1)==K_VALUES ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			 str = (k!=null?k.getText():null); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "basic_unreserved_keyword"

	// Delegated rules


	protected DFA1 dfa1 = new DFA1(this);
	protected DFA15 dfa15 = new DFA15(this);
	protected DFA44 dfa44 = new DFA44(this);
	protected DFA153 dfa153 = new DFA153(this);
	protected DFA154 dfa154 = new DFA154(this);
	protected DFA172 dfa172 = new DFA172(this);
	protected DFA174 dfa174 = new DFA174(this);
	protected DFA176 dfa176 = new DFA176(this);
	protected DFA178 dfa178 = new DFA178(this);
	protected DFA181 dfa181 = new DFA181(this);
	protected DFA189 dfa189 = new DFA189(this);
	protected DFA195 dfa195 = new DFA195(this);
	protected DFA194 dfa194 = new DFA194(this);
	protected DFA204 dfa204 = new DFA204(this);
	static final String DFA1_eotS =
		"\63\uffff";
	static final String DFA1_eofS =
		"\63\uffff";
	static final String DFA1_minS =
		"\1\36\7\uffff\2\33\1\56\2\26\1\34\10\uffff\1\170\22\uffff\1\155\2\uffff"+
		"\1\105\5\uffff\1\33";
	static final String DFA1_maxS =
		"\1\u0094\7\uffff\3\u0095\2\u00ac\1\u0096\10\uffff\1\170\22\uffff\1\u008a"+
		"\2\uffff\1\165\5\uffff\1\110";
	static final String DFA1_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\6\uffff\1\10\1\11\1\23\1\27\1\31"+
		"\1\40\1\46\1\12\1\uffff\1\34\1\36\1\13\1\14\1\15\1\25\1\30\1\33\1\35\1"+
		"\37\1\42\1\47\1\16\1\17\1\24\1\32\1\41\1\50\1\uffff\1\20\1\44\1\uffff"+
		"\1\21\1\45\1\26\1\43\1\22\1\uffff";
	static final String DFA1_specialS =
		"\63\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\12\7\uffff\1\4\14\uffff\1\10\4\uffff\1\5\4\uffff\1\11\14\uffff\1\13"+
			"\10\uffff\1\2\13\uffff\1\15\32\uffff\1\14\2\uffff\1\1\17\uffff\1\7\5"+
			"\uffff\1\3\1\6",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\30\22\uffff\1\17\5\uffff\1\25\23\uffff\1\27\5\uffff\1\25\13\uffff"+
			"\1\16\7\uffff\1\24\14\uffff\1\26\13\uffff\1\23\20\uffff\1\21\3\uffff"+
			"\1\22\4\uffff\1\20",
			"\1\40\22\uffff\1\32\31\uffff\1\37\5\uffff\1\33\13\uffff\1\31\7\uffff"+
			"\1\42\30\uffff\1\41\20\uffff\1\35\3\uffff\1\36\4\uffff\1\34",
			"\1\43\53\uffff\1\44\7\uffff\1\50\30\uffff\1\47\24\uffff\1\46\4\uffff"+
			"\1\45",
			"\1\53\4\uffff\1\53\1\51\1\uffff\1\52\2\uffff\1\53\1\uffff\1\53\1\52"+
			"\2\uffff\3\53\1\uffff\3\53\1\uffff\4\53\1\52\3\53\3\uffff\1\52\2\53\1"+
			"\52\1\53\1\uffff\1\52\4\53\1\uffff\1\53\1\uffff\2\53\1\uffff\1\53\3\uffff"+
			"\1\53\1\uffff\2\53\1\uffff\1\53\2\uffff\3\53\1\uffff\3\53\1\uffff\3\53"+
			"\3\uffff\1\52\1\uffff\1\53\1\uffff\1\53\4\uffff\1\53\2\uffff\5\53\3\uffff"+
			"\1\53\1\uffff\2\53\1\52\1\uffff\13\53\2\uffff\1\53\1\uffff\3\53\4\uffff"+
			"\2\53\1\uffff\4\53\3\uffff\1\53\10\uffff\2\53\2\uffff\1\53",
			"\1\56\4\uffff\1\56\1\54\1\uffff\1\55\2\uffff\1\56\1\uffff\1\56\1\55"+
			"\2\uffff\3\56\1\uffff\3\56\1\uffff\4\56\1\55\3\56\3\uffff\1\55\2\56\1"+
			"\55\1\56\1\uffff\1\55\4\56\1\uffff\1\56\1\uffff\2\56\1\uffff\1\56\3\uffff"+
			"\1\56\1\uffff\2\56\1\uffff\1\56\2\uffff\3\56\1\uffff\3\56\1\uffff\3\56"+
			"\3\uffff\1\55\1\uffff\1\56\1\uffff\1\56\4\uffff\1\56\2\uffff\5\56\3\uffff"+
			"\1\56\1\uffff\2\56\1\55\1\uffff\13\56\2\uffff\1\56\1\uffff\3\56\4\uffff"+
			"\2\56\1\uffff\4\56\3\uffff\1\56\10\uffff\2\56\2\uffff\1\56",
			"\1\61\1\uffff\1\61\5\uffff\1\61\16\uffff\1\61\6\uffff\1\61\2\uffff\1"+
			"\61\2\uffff\1\61\44\uffff\1\61\26\uffff\1\60\1\61\30\uffff\1\57",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\62",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\52\7\uffff\1\52\24\uffff\1\53",
			"",
			"",
			"\1\56\47\uffff\1\55\7\uffff\1\55",
			"",
			"",
			"",
			"",
			"",
			"\1\30\54\uffff\1\27"
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "204:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement );";
		}
	}

	static final String DFA15_eotS =
		"\u0082\uffff";
	static final String DFA15_eofS =
		"\u0082\uffff";
	static final String DFA15_minS =
		"\1\6\31\41\1\uffff\1\6\5\41\1\uffff\1\26\1\uffff\1\6\1\u00b8\31\u00b7"+
		"\1\u00b8\2\u00b7\1\uffff\1\u00b7\1\u00be\1\u00b7\1\26\3\uffff\31\41\1"+
		"\uffff\1\6\1\26\31\41\3\u00b7";
	static final String DFA15_maxS =
		"\1\u00ca\31\u00be\1\uffff\1\u00ca\5\u00be\1\uffff\1\u00a9\1\uffff\1\u00ca"+
		"\1\u00bb\2\u00be\1\u00c1\27\u00be\2\u00c1\1\uffff\1\u00c1\2\u00be\1\u00a9"+
		"\3\uffff\31\u00be\1\uffff\1\u00ca\1\u00a9\31\u00be\3\u00b8";
	static final String DFA15_acceptS =
		"\32\uffff\1\2\6\uffff\1\10\1\uffff\1\1\36\uffff\1\3\4\uffff\1\5\1\6\1"+
		"\7\31\uffff\1\4\36\uffff";
	static final String DFA15_specialS =
		"\u0082\uffff}>";
	static final String[] DFA15_transitionS = {
			"\1\32\4\uffff\1\32\4\uffff\1\32\3\uffff\1\32\1\uffff\1\1\1\32\3\uffff"+
			"\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff\1\3\1\37\1\3"+
			"\1\uffff\2\3\1\31\1\10\1\uffff\1\3\1\27\1\11\4\uffff\1\40\1\12\1\uffff"+
			"\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff\1\3\3\uffff\1"+
			"\15\1\32\2\3\1\uffff\1\16\2\uffff\2\40\1\3\1\uffff\3\3\1\uffff\3\3\4"+
			"\uffff\1\32\1\3\1\uffff\1\3\1\uffff\1\32\2\uffff\1\3\2\uffff\5\3\3\uffff"+
			"\1\3\1\uffff\2\3\2\uffff\1\3\1\17\4\3\1\20\1\30\1\21\1\26\1\22\1\uffff"+
			"\1\41\1\3\1\uffff\1\36\2\3\4\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff"+
			"\1\35\10\uffff\1\34\1\2\2\uffff\1\32\2\uffff\1\32\7\uffff\1\33\4\uffff"+
			"\1\32\2\uffff\1\32\6\uffff\1\32\3\uffff\1\32",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\44\1\43\2\uffff\1\43\2\uffff\1\42",
			"",
			"\1\32\4\uffff\1\32\4\uffff\1\32\3\uffff\1\32\1\uffff\1\46\1\32\3\uffff"+
			"\2\105\4\uffff\1\105\1\uffff\1\51\3\uffff\1\52\1\53\1\54\1\uffff\1\105"+
			"\1\104\1\105\1\uffff\2\105\1\76\1\55\1\uffff\1\105\1\74\1\56\4\uffff"+
			"\1\104\1\57\1\uffff\1\60\2\uffff\3\105\1\61\1\uffff\1\103\1\uffff\2\105"+
			"\1\uffff\1\105\3\uffff\1\62\1\32\2\105\1\uffff\1\63\2\uffff\1\104\1\77"+
			"\1\105\1\uffff\3\105\1\uffff\1\100\1\105\1\50\4\uffff\1\32\1\105\1\uffff"+
			"\1\105\1\uffff\1\32\2\uffff\1\105\2\uffff\5\105\3\uffff\1\105\1\uffff"+
			"\2\105\1\uffff\1\102\1\105\1\64\4\105\1\65\1\75\1\66\1\73\1\67\1\uffff"+
			"\1\32\1\105\1\uffff\1\104\1\101\1\105\4\uffff\2\105\1\uffff\1\70\1\105"+
			"\1\71\1\72\3\uffff\1\104\10\uffff\1\32\1\47\2\uffff\1\45\2\uffff\1\32"+
			"\7\uffff\1\32\4\uffff\1\32\2\uffff\1\32\6\uffff\1\32\3\uffff\1\32",
			"\1\32\43\uffff\1\32\162\uffff\1\32\2\uffff\1\32\2\uffff\1\106",
			"\1\43\43\uffff\1\43\161\uffff\1\107\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\110\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\161\uffff\1\111\1\43\2\uffff\1\43\2\uffff\1\42",
			"\1\43\43\uffff\1\43\162\uffff\1\43\2\uffff\1\43\2\uffff\1\42",
			"",
			"\1\112\4\uffff\2\114\4\uffff\1\114\1\uffff\1\115\3\uffff\1\116\1\117"+
			"\1\120\1\uffff\1\114\1\43\1\114\1\uffff\2\114\1\142\1\121\1\uffff\1\114"+
			"\1\140\1\122\4\uffff\1\43\1\123\1\uffff\1\124\2\uffff\3\114\1\125\1\uffff"+
			"\1\114\1\uffff\2\114\1\uffff\1\114\3\uffff\1\126\1\uffff\2\114\1\uffff"+
			"\1\127\2\uffff\2\43\1\114\1\uffff\3\114\1\uffff\3\114\5\uffff\1\114\1"+
			"\uffff\1\114\4\uffff\1\114\2\uffff\5\114\3\uffff\1\114\1\uffff\2\114"+
			"\2\uffff\1\114\1\130\4\114\1\131\1\141\1\132\1\137\1\133\1\uffff\1\41"+
			"\1\114\1\uffff\1\43\2\114\4\uffff\2\114\1\uffff\1\134\1\114\1\135\1\136"+
			"\3\uffff\1\43\11\uffff\1\113",
			"",
			"\1\41\4\uffff\1\41\4\uffff\1\41\3\uffff\1\41\1\uffff\2\41\3\uffff\2"+
			"\41\4\uffff\1\41\1\uffff\1\41\3\uffff\3\41\1\uffff\3\41\1\uffff\4\41"+
			"\1\uffff\3\41\4\uffff\2\41\1\uffff\1\41\2\uffff\4\41\1\uffff\1\41\1\uffff"+
			"\2\41\1\uffff\1\41\3\uffff\4\41\1\uffff\1\41\2\uffff\3\41\1\uffff\3\41"+
			"\1\uffff\3\41\4\uffff\2\41\1\uffff\1\41\1\uffff\1\41\2\uffff\1\41\2\uffff"+
			"\5\41\3\uffff\1\41\1\uffff\2\41\2\uffff\13\41\1\uffff\2\41\1\uffff\3"+
			"\41\4\uffff\2\41\1\uffff\4\41\3\uffff\1\41\10\uffff\2\41\2\uffff\1\41"+
			"\2\uffff\1\41\7\uffff\2\41\3\uffff\1\41\2\uffff\1\41\6\uffff\1\41\1\143"+
			"\2\uffff\1\41",
			"\1\144\2\uffff\1\32",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145\2\uffff\1\102",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\32\6\uffff\1\145",
			"\1\102\5\uffff\1\145",
			"\1\32\1\102\5\uffff\1\145\2\uffff\1\102",
			"\1\32\1\102\5\uffff\1\145\2\uffff\1\102",
			"",
			"\1\32\1\102\5\uffff\1\145\2\uffff\1\102",
			"\1\145",
			"\1\32\1\102\5\uffff\1\145",
			"\1\146\4\uffff\2\150\4\uffff\1\150\1\uffff\1\151\3\uffff\1\152\1\153"+
			"\1\154\1\uffff\1\150\1\32\1\150\1\uffff\2\150\1\176\1\155\1\uffff\1\150"+
			"\1\174\1\156\4\uffff\1\32\1\157\1\uffff\1\160\2\uffff\3\150\1\161\1\uffff"+
			"\1\150\1\uffff\2\150\1\uffff\1\150\3\uffff\1\162\1\uffff\2\150\1\uffff"+
			"\1\163\2\uffff\2\32\1\150\1\uffff\3\150\1\uffff\3\150\5\uffff\1\150\1"+
			"\uffff\1\150\4\uffff\1\150\2\uffff\5\150\3\uffff\1\150\1\uffff\2\150"+
			"\2\uffff\1\150\1\164\4\150\1\165\1\175\1\166\1\173\1\167\1\uffff\1\41"+
			"\1\150\1\uffff\1\32\2\150\4\uffff\2\150\1\uffff\1\170\1\150\1\171\1\172"+
			"\3\uffff\1\32\11\uffff\1\147",
			"",
			"",
			"",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"\1\43\43\uffff\1\43\161\uffff\1\41\1\43\2\uffff\1\43\2\uffff\1\43",
			"",
			"\1\102\4\uffff\1\102\4\uffff\1\102\3\uffff\1\102\2\uffff\1\102\11\uffff"+
			"\1\32\43\uffff\1\32\12\uffff\1\102\25\uffff\1\102\4\uffff\1\102\74\uffff"+
			"\1\102\3\uffff\1\102\2\uffff\1\102\7\uffff\1\102\1\32\2\uffff\1\32\1"+
			"\102\1\uffff\1\32\1\102\6\uffff\1\102\3\uffff\1\102",
			"\1\177\4\uffff\2\u0081\4\uffff\1\u0081\1\uffff\1\32\3\uffff\3\32\1\uffff"+
			"\1\u0081\1\uffff\1\u0081\1\uffff\2\u0081\2\32\1\uffff\1\u0081\2\32\5"+
			"\uffff\1\32\1\uffff\1\32\2\uffff\3\u0081\1\32\1\uffff\1\u0081\1\uffff"+
			"\2\u0081\1\uffff\1\u0081\3\uffff\1\32\1\uffff\2\u0081\1\uffff\1\32\3"+
			"\uffff\1\102\1\u0081\1\uffff\3\u0081\1\uffff\3\u0081\5\uffff\1\u0081"+
			"\1\uffff\1\u0081\4\uffff\1\u0081\2\uffff\5\u0081\3\uffff\1\u0081\1\uffff"+
			"\2\u0081\2\uffff\1\u0081\1\32\4\u0081\5\32\1\uffff\1\32\1\u0081\2\uffff"+
			"\2\u0081\4\uffff\2\u0081\1\uffff\1\32\1\u0081\2\32\15\uffff\1\u0080",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\43\uffff\1\32\161\uffff\1\41\1\32\2\uffff\1\32\2\uffff\1\32",
			"\1\32\1\102",
			"\1\32\1\102",
			"\1\32\1\102"
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "308:8: (c= cident |v= value | '(' ct= comparatorType ')' v= value | K_COUNT '(' '\\*' ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs )";
		}
	}

	static final String DFA44_eotS =
		"\35\uffff";
	static final String DFA44_eofS =
		"\35\uffff";
	static final String DFA44_minS =
		"\1\26\31\105\3\uffff";
	static final String DFA44_maxS =
		"\1\u00a9\31\u00c6\3\uffff";
	static final String DFA44_acceptS =
		"\32\uffff\1\1\1\2\1\3";
	static final String DFA44_specialS =
		"\35\uffff}>";
	static final String[] DFA44_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\31\1\3\1\uffff\2\3\1\31\1\10\1\uffff\1\3\1\27\1\11\4\uffff\1\31"+
			"\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff\1"+
			"\3\3\uffff\1\15\1\uffff\2\3\1\uffff\1\16\2\uffff\2\31\1\3\1\uffff\3\3"+
			"\1\uffff\3\3\5\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff"+
			"\1\3\1\uffff\2\3\2\uffff\1\3\1\17\4\3\1\20\1\30\1\21\1\26\1\22\2\uffff"+
			"\1\3\1\uffff\1\31\2\3\4\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff"+
			"\1\31\11\uffff\1\2",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"\1\32\165\uffff\1\32\2\uffff\1\34\7\uffff\1\33",
			"",
			"",
			""
	};

	static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
	static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
	static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
	static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
	static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
	static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
	static final short[][] DFA44_transition;

	static {
		int numStates = DFA44_transitionS.length;
		DFA44_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
		}
	}

	protected class DFA44 extends DFA {

		public DFA44(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 44;
			this.eot = DFA44_eot;
			this.eof = DFA44_eof;
			this.min = DFA44_min;
			this.max = DFA44_max;
			this.accept = DFA44_accept;
			this.special = DFA44_special;
			this.transition = DFA44_transition;
		}
		@Override
		public String getDescription() {
			return "479:1: deleteOp returns [Operation.RawDeletion op] : (c= cident |c= cident '[' t= term ']' |c= cident '.' field= fident );";
		}
	}

	static final String DFA153_eotS =
		"\35\uffff";
	static final String DFA153_eofS =
		"\1\uffff\32\34\2\uffff";
	static final String DFA153_minS =
		"\1\26\32\u00be\2\uffff";
	static final String DFA153_maxS =
		"\1\u00a9\32\u00c0\2\uffff";
	static final String DFA153_acceptS =
		"\33\uffff\1\1\1\2";
	static final String DFA153_specialS =
		"\35\uffff}>";
	static final String[] DFA153_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\31\1\3\1\uffff\2\3\1\31\1\10\1\uffff\1\3\1\27\1\11\4\uffff\1\31"+
			"\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff\1"+
			"\3\3\uffff\1\15\1\uffff\2\3\1\uffff\1\16\2\uffff\2\31\1\3\1\uffff\3\3"+
			"\1\uffff\3\3\5\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff"+
			"\1\3\1\uffff\2\3\2\uffff\1\3\1\17\4\3\1\20\1\30\1\21\1\26\1\22\2\uffff"+
			"\1\3\1\uffff\1\31\2\3\4\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff"+
			"\1\31\10\uffff\1\32\1\2",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"\1\33\1\uffff\1\34",
			"",
			""
	};

	static final short[] DFA153_eot = DFA.unpackEncodedString(DFA153_eotS);
	static final short[] DFA153_eof = DFA.unpackEncodedString(DFA153_eofS);
	static final char[] DFA153_min = DFA.unpackEncodedStringToUnsignedChars(DFA153_minS);
	static final char[] DFA153_max = DFA.unpackEncodedStringToUnsignedChars(DFA153_maxS);
	static final short[] DFA153_accept = DFA.unpackEncodedString(DFA153_acceptS);
	static final short[] DFA153_special = DFA.unpackEncodedString(DFA153_specialS);
	static final short[][] DFA153_transition;

	static {
		int numStates = DFA153_transitionS.length;
		DFA153_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA153_transition[i] = DFA.unpackEncodedString(DFA153_transitionS[i]);
		}
	}

	protected class DFA153 extends DFA {

		public DFA153(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 153;
			this.eot = DFA153_eot;
			this.eof = DFA153_eof;
			this.min = DFA153_min;
			this.max = DFA153_max;
			this.accept = DFA153_accept;
			this.special = DFA153_special;
			this.transition = DFA153_transition;
		}
		@Override
		public String getDescription() {
			return "1207:7: ( ksName[name] '.' )?";
		}
	}

	static final String DFA154_eotS =
		"\35\uffff";
	static final String DFA154_eofS =
		"\1\uffff\32\34\2\uffff";
	static final String DFA154_minS =
		"\1\26\32\32\2\uffff";
	static final String DFA154_maxS =
		"\1\u00a9\32\u00c0\2\uffff";
	static final String DFA154_acceptS =
		"\33\uffff\1\1\1\2";
	static final String DFA154_specialS =
		"\35\uffff}>";
	static final String[] DFA154_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\31\1\3\1\uffff\2\3\1\31\1\10\1\uffff\1\3\1\27\1\11\4\uffff\1\31"+
			"\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff\1"+
			"\3\3\uffff\1\15\1\uffff\2\3\1\uffff\1\16\2\uffff\2\31\1\3\1\uffff\3\3"+
			"\1\uffff\3\3\5\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff"+
			"\1\3\1\uffff\2\3\2\uffff\1\3\1\17\4\3\1\20\1\30\1\21\1\26\1\22\2\uffff"+
			"\1\3\1\uffff\1\31\2\3\4\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff"+
			"\1\31\10\uffff\1\32\1\2",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"\1\34\2\uffff\2\34\2\uffff\1\34\33\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\11\uffff\1\34\3\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\1\34\2\uffff\2\34\6\uffff\1\34\13\uffff\1\34\14\uffff\1\34\5"+
			"\uffff\2\34\30\uffff\1\34\6\uffff\1\33\1\uffff\1\34",
			"",
			""
	};

	static final short[] DFA154_eot = DFA.unpackEncodedString(DFA154_eotS);
	static final short[] DFA154_eof = DFA.unpackEncodedString(DFA154_eofS);
	static final char[] DFA154_min = DFA.unpackEncodedStringToUnsignedChars(DFA154_minS);
	static final char[] DFA154_max = DFA.unpackEncodedStringToUnsignedChars(DFA154_maxS);
	static final short[] DFA154_accept = DFA.unpackEncodedString(DFA154_acceptS);
	static final short[] DFA154_special = DFA.unpackEncodedString(DFA154_specialS);
	static final short[][] DFA154_transition;

	static {
		int numStates = DFA154_transitionS.length;
		DFA154_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA154_transition[i] = DFA.unpackEncodedString(DFA154_transitionS[i]);
		}
	}

	protected class DFA154 extends DFA {

		public DFA154(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 154;
			this.eot = DFA154_eot;
			this.eof = DFA154_eof;
			this.min = DFA154_min;
			this.max = DFA154_max;
			this.accept = DFA154_accept;
			this.special = DFA154_special;
			this.transition = DFA154_transition;
		}
		@Override
		public String getDescription() {
			return "1212:7: ( ksName[name] '.' )?";
		}
	}

	static final String DFA172_eotS =
		"\43\uffff";
	static final String DFA172_eofS =
		"\43\uffff";
	static final String DFA172_minS =
		"\1\6\2\uffff\1\6\4\uffff\31\u00b7\1\u00be\1\uffff";
	static final String DFA172_maxS =
		"\1\u00ca\2\uffff\1\u00cb\4\uffff\32\u00bf\1\uffff";
	static final String DFA172_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\32\uffff\1\3";
	static final String DFA172_specialS =
		"\43\uffff}>";
	static final String[] DFA172_transitionS = {
			"\1\1\4\uffff\1\1\4\uffff\1\1\3\uffff\1\1\2\uffff\1\1\70\uffff\1\1\25"+
			"\uffff\1\1\4\uffff\1\5\74\uffff\1\7\3\uffff\1\1\2\uffff\1\1\7\uffff\1"+
			"\4\4\uffff\1\1\2\uffff\1\6\6\uffff\1\2\3\uffff\1\3",
			"",
			"",
			"\1\2\4\uffff\1\2\4\uffff\1\2\3\uffff\1\2\1\uffff\1\10\1\2\3\uffff\2"+
			"\12\4\uffff\1\12\1\uffff\1\13\3\uffff\1\14\1\15\1\16\1\uffff\1\12\1\41"+
			"\1\12\1\uffff\2\12\1\40\1\17\1\uffff\1\12\1\36\1\20\4\uffff\1\41\1\21"+
			"\1\uffff\1\22\2\uffff\3\12\1\23\1\uffff\1\12\1\uffff\2\12\1\uffff\1\12"+
			"\3\uffff\1\24\1\2\2\12\1\uffff\1\25\2\uffff\2\41\1\12\1\uffff\3\12\1"+
			"\uffff\3\12\4\uffff\1\2\1\12\1\uffff\1\12\1\uffff\1\2\2\uffff\1\12\2"+
			"\uffff\5\12\3\uffff\1\12\1\uffff\2\12\2\uffff\1\12\1\26\4\12\1\27\1\37"+
			"\1\30\1\35\1\31\1\uffff\1\2\1\12\1\uffff\1\41\2\12\4\uffff\2\12\1\uffff"+
			"\1\32\1\12\1\33\1\34\3\uffff\1\41\10\uffff\1\2\1\11\2\uffff\1\2\2\uffff"+
			"\1\2\7\uffff\1\2\4\uffff\1\2\2\uffff\1\2\6\uffff\1\2\3\uffff\2\2",
			"",
			"",
			"",
			"",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\6\uffff\1\2\1\42",
			"\1\2\1\42",
			""
	};

	static final short[] DFA172_eot = DFA.unpackEncodedString(DFA172_eotS);
	static final short[] DFA172_eof = DFA.unpackEncodedString(DFA172_eofS);
	static final char[] DFA172_min = DFA.unpackEncodedStringToUnsignedChars(DFA172_minS);
	static final char[] DFA172_max = DFA.unpackEncodedStringToUnsignedChars(DFA172_maxS);
	static final short[] DFA172_accept = DFA.unpackEncodedString(DFA172_acceptS);
	static final short[] DFA172_special = DFA.unpackEncodedString(DFA172_specialS);
	static final short[][] DFA172_transition;

	static {
		int numStates = DFA172_transitionS.length;
		DFA172_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA172_transition[i] = DFA.unpackEncodedString(DFA172_transitionS[i]);
		}
	}

	protected class DFA172 extends DFA {

		public DFA172(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 172;
			this.eot = DFA172_eot;
			this.eof = DFA172_eof;
			this.min = DFA172_min;
			this.max = DFA172_max;
			this.accept = DFA172_accept;
			this.special = DFA172_special;
			this.transition = DFA172_transition;
		}
		@Override
		public String getDescription() {
			return "1302:1: value returns [Term.Raw value] : (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK );";
		}
	}

	static final String DFA174_eotS =
		"\34\uffff";
	static final String DFA174_eofS =
		"\1\uffff\31\33\2\uffff";
	static final String DFA174_minS =
		"\1\26\31\u00b7\2\uffff";
	static final String DFA174_maxS =
		"\1\u00a9\31\u00c0\2\uffff";
	static final String DFA174_acceptS =
		"\32\uffff\1\1\1\2";
	static final String DFA174_specialS =
		"\34\uffff}>";
	static final String[] DFA174_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\32\1\3\1\uffff\2\3\1\31\1\10\1\uffff\1\3\1\27\1\11\4\uffff\1\32"+
			"\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff\1"+
			"\3\3\uffff\1\15\1\uffff\2\3\1\uffff\1\16\2\uffff\2\32\1\3\1\uffff\3\3"+
			"\1\uffff\3\3\5\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff"+
			"\1\3\1\uffff\2\3\2\uffff\1\3\1\17\4\3\1\20\1\30\1\21\1\26\1\22\1\uffff"+
			"\1\33\1\3\1\uffff\1\32\2\3\4\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff"+
			"\1\32\10\uffff\1\32\1\2",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"\1\33\6\uffff\1\32\1\uffff\1\33",
			"",
			""
	};

	static final short[] DFA174_eot = DFA.unpackEncodedString(DFA174_eotS);
	static final short[] DFA174_eof = DFA.unpackEncodedString(DFA174_eofS);
	static final char[] DFA174_min = DFA.unpackEncodedStringToUnsignedChars(DFA174_minS);
	static final char[] DFA174_max = DFA.unpackEncodedStringToUnsignedChars(DFA174_maxS);
	static final short[] DFA174_accept = DFA.unpackEncodedString(DFA174_acceptS);
	static final short[] DFA174_special = DFA.unpackEncodedString(DFA174_specialS);
	static final short[][] DFA174_transition;

	static {
		int numStates = DFA174_transitionS.length;
		DFA174_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA174_transition[i] = DFA.unpackEncodedString(DFA174_transitionS[i]);
		}
	}

	protected class DFA174 extends DFA {

		public DFA174(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 174;
			this.eot = DFA174_eot;
			this.eof = DFA174_eof;
			this.min = DFA174_min;
			this.max = DFA174_max;
			this.accept = DFA174_accept;
			this.special = DFA174_special;
			this.transition = DFA174_transition;
		}
		@Override
		public String getDescription() {
			return "1319:7: (ks= keyspaceName '.' )?";
		}
	}

	static final String DFA176_eotS =
		"\72\uffff";
	static final String DFA176_eofS =
		"\72\uffff";
	static final String DFA176_minS =
		"\1\26\31\u00b7\1\u00be\1\u00b7\1\u00be\1\26\1\6\31\u00b7\2\uffff";
	static final String DFA176_maxS =
		"\1\u00a9\32\u00be\1\u00b7\1\u00be\1\u00a9\1\u00ca\31\u00b7\2\uffff";
	static final String DFA176_acceptS =
		"\70\uffff\1\1\1\2";
	static final String DFA176_specialS =
		"\72\uffff}>";
	static final String[] DFA176_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\34\1\3\1\uffff\2\3\1\31\1\10\1\uffff\1\3\1\27\1\11\4\uffff\1\34"+
			"\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff\1"+
			"\3\3\uffff\1\15\1\uffff\2\3\1\uffff\1\16\2\uffff\2\34\1\3\1\uffff\3\3"+
			"\1\uffff\3\3\5\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff"+
			"\1\3\1\uffff\2\3\2\uffff\1\3\1\17\4\3\1\20\1\30\1\21\1\26\1\22\1\uffff"+
			"\1\33\1\3\1\uffff\1\34\2\3\4\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff"+
			"\1\34\10\uffff\1\32\1\2",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\35",
			"\1\36",
			"\1\35",
			"\1\37\4\uffff\2\41\4\uffff\1\41\1\uffff\1\42\3\uffff\1\43\1\44\1\45"+
			"\1\uffff\1\41\1\uffff\1\41\1\uffff\2\41\1\67\1\46\1\uffff\1\41\1\65\1"+
			"\47\5\uffff\1\50\1\uffff\1\51\2\uffff\3\41\1\52\1\uffff\1\41\1\uffff"+
			"\2\41\1\uffff\1\41\3\uffff\1\53\1\uffff\2\41\1\uffff\1\54\4\uffff\1\41"+
			"\1\uffff\3\41\1\uffff\3\41\5\uffff\1\41\1\uffff\1\41\4\uffff\1\41\2\uffff"+
			"\5\41\3\uffff\1\41\1\uffff\2\41\2\uffff\1\41\1\55\4\41\1\56\1\66\1\57"+
			"\1\64\1\60\1\uffff\1\33\1\41\2\uffff\2\41\4\uffff\2\41\1\uffff\1\61\1"+
			"\41\1\62\1\63\15\uffff\1\40",
			"\1\71\4\uffff\1\71\4\uffff\1\71\3\uffff\1\71\1\uffff\2\71\3\uffff\2"+
			"\71\4\uffff\1\71\1\uffff\1\71\3\uffff\3\71\1\uffff\3\71\1\uffff\4\71"+
			"\1\uffff\3\71\4\uffff\2\71\1\uffff\1\71\2\uffff\4\71\1\uffff\1\71\1\uffff"+
			"\2\71\1\uffff\1\71\3\uffff\4\71\1\uffff\1\71\2\uffff\3\71\1\uffff\3\71"+
			"\1\uffff\3\71\4\uffff\2\71\1\uffff\1\71\1\uffff\1\71\2\uffff\1\71\2\uffff"+
			"\5\71\3\uffff\1\71\1\uffff\2\71\2\uffff\13\71\1\uffff\2\71\1\uffff\3"+
			"\71\4\uffff\2\71\1\uffff\4\71\3\uffff\1\71\10\uffff\2\71\2\uffff\1\71"+
			"\2\uffff\1\71\7\uffff\1\71\1\70\3\uffff\1\71\2\uffff\1\71\6\uffff\1\71"+
			"\3\uffff\1\71",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"",
			""
	};

	static final short[] DFA176_eot = DFA.unpackEncodedString(DFA176_eotS);
	static final short[] DFA176_eof = DFA.unpackEncodedString(DFA176_eofS);
	static final char[] DFA176_min = DFA.unpackEncodedStringToUnsignedChars(DFA176_minS);
	static final char[] DFA176_max = DFA.unpackEncodedStringToUnsignedChars(DFA176_maxS);
	static final short[] DFA176_accept = DFA.unpackEncodedString(DFA176_acceptS);
	static final short[] DFA176_special = DFA.unpackEncodedString(DFA176_specialS);
	static final short[][] DFA176_transition;

	static {
		int numStates = DFA176_transitionS.length;
		DFA176_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA176_transition[i] = DFA.unpackEncodedString(DFA176_transitionS[i]);
		}
	}

	protected class DFA176 extends DFA {

		public DFA176(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 176;
			this.eot = DFA176_eot;
			this.eof = DFA176_eof;
			this.min = DFA176_min;
			this.max = DFA176_max;
			this.accept = DFA176_accept;
			this.special = DFA176_special;
			this.transition = DFA176_transition;
		}
		@Override
		public String getDescription() {
			return "1330:1: function returns [Term.Raw t] : (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' );";
		}
	}

	static final String DFA178_eotS =
		"\110\uffff";
	static final String DFA178_eofS =
		"\3\uffff\1\1\42\uffff\1\1\7\uffff\32\42";
	static final String DFA178_minS =
		"\1\6\1\uffff\1\6\1\35\1\uffff\1\u00b8\31\u00b7\1\u00b8\2\u00b7\1\uffff"+
		"\1\u00b7\1\u00be\1\u00b7\1\6\1\26\1\6\1\52\1\161\3\u00b7\32\35";
	static final String DFA178_maxS =
		"\1\u00ca\1\uffff\1\u00ca\1\u00cb\1\uffff\1\u00bb\2\u00be\1\u00c1\27\u00be"+
		"\2\u00c1\1\uffff\1\u00c1\2\u00be\1\u00cb\1\u00a9\1\u00ca\2\u00be\3\u00b8"+
		"\32\u00cb";
	static final String DFA178_acceptS =
		"\1\uffff\1\1\2\uffff\1\2\35\uffff\1\3\45\uffff";
	static final String DFA178_specialS =
		"\110\uffff}>";
	static final String[] DFA178_transitionS = {
			"\1\1\4\uffff\1\1\4\uffff\1\1\3\uffff\1\1\1\uffff\1\4\1\1\3\uffff\2\4"+
			"\4\uffff\1\4\1\uffff\1\4\3\uffff\3\4\1\uffff\3\4\1\uffff\4\4\1\uffff"+
			"\3\4\4\uffff\2\4\1\uffff\1\4\2\uffff\4\4\1\uffff\1\4\1\uffff\2\4\1\uffff"+
			"\1\4\3\uffff\1\4\1\1\2\4\1\uffff\1\4\2\uffff\3\4\1\uffff\3\4\1\uffff"+
			"\3\4\4\uffff\1\1\1\4\1\uffff\1\4\1\uffff\1\1\2\uffff\1\4\2\uffff\5\4"+
			"\3\uffff\1\4\1\uffff\2\4\2\uffff\13\4\1\uffff\2\4\1\uffff\3\4\4\uffff"+
			"\2\4\1\uffff\4\4\3\uffff\1\4\10\uffff\1\3\1\4\2\uffff\1\1\2\uffff\1\1"+
			"\7\uffff\1\2\4\uffff\1\1\2\uffff\1\1\6\uffff\1\1\3\uffff\1\1",
			"",
			"\1\1\4\uffff\1\1\4\uffff\1\1\3\uffff\1\1\1\uffff\1\6\1\1\3\uffff\2\45"+
			"\4\uffff\1\45\1\uffff\1\11\3\uffff\1\12\1\13\1\14\1\uffff\1\45\1\44\1"+
			"\45\1\uffff\2\45\1\36\1\15\1\uffff\1\45\1\34\1\16\4\uffff\1\44\1\17\1"+
			"\uffff\1\20\2\uffff\3\45\1\21\1\uffff\1\43\1\uffff\2\45\1\uffff\1\45"+
			"\3\uffff\1\22\1\1\2\45\1\uffff\1\23\2\uffff\1\44\1\37\1\45\1\uffff\3"+
			"\45\1\uffff\1\40\1\45\1\10\4\uffff\1\1\1\45\1\uffff\1\45\1\uffff\1\1"+
			"\2\uffff\1\45\2\uffff\5\45\3\uffff\1\45\1\uffff\2\45\1\uffff\1\42\1\45"+
			"\1\24\4\45\1\25\1\35\1\26\1\33\1\27\1\uffff\1\1\1\45\1\uffff\1\44\1\41"+
			"\1\45\4\uffff\2\45\1\uffff\1\30\1\45\1\31\1\32\3\uffff\1\44\10\uffff"+
			"\1\1\1\7\2\uffff\1\5\2\uffff\1\1\7\uffff\1\1\4\uffff\1\1\2\uffff\1\1"+
			"\6\uffff\1\1\3\uffff\1\1",
			"\1\1\1\uffff\2\1\27\uffff\1\1\22\uffff\2\1\6\uffff\1\1\12\uffff\1\1"+
			"\21\uffff\1\1\2\uffff\1\1\2\uffff\1\1\34\uffff\1\1\11\uffff\1\1\32\uffff"+
			"\2\1\1\uffff\1\1\2\uffff\1\4\2\1\7\uffff\1\1\2\uffff\1\1",
			"",
			"\1\46\2\uffff\1\1",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47\2\uffff\1\42",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\6\uffff\1\47",
			"\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47\2\uffff\1\42",
			"\1\1\1\42\5\uffff\1\47\2\uffff\1\42",
			"",
			"\1\1\1\42\5\uffff\1\47\2\uffff\1\42",
			"\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\42\4\uffff\1\42\4\uffff\1\42\3\uffff\1\42\1\uffff\2\42\3\uffff\2"+
			"\42\1\1\1\uffff\2\1\1\42\1\uffff\1\42\3\uffff\3\42\1\uffff\3\42\1\uffff"+
			"\4\42\1\uffff\3\42\1\uffff\1\1\2\uffff\2\42\1\uffff\1\42\2\uffff\4\42"+
			"\1\uffff\1\42\1\uffff\2\42\1\uffff\1\51\1\1\2\uffff\4\42\1\1\1\42\2\uffff"+
			"\3\42\1\uffff\3\42\1\1\3\42\4\uffff\2\42\1\uffff\1\42\1\uffff\1\42\2"+
			"\uffff\1\42\1\uffff\1\1\2\42\1\52\2\42\1\1\2\uffff\1\42\1\uffff\2\42"+
			"\2\uffff\13\42\1\uffff\2\42\1\uffff\3\42\2\uffff\1\1\1\uffff\2\42\1\uffff"+
			"\4\42\1\uffff\1\1\1\uffff\1\42\10\uffff\2\42\2\uffff\1\42\2\uffff\1\42"+
			"\7\uffff\1\42\2\1\1\uffff\1\1\1\42\2\uffff\1\50\1\1\5\uffff\1\42\1\uffff"+
			"\1\1\1\uffff\1\42\1\1",
			"\1\53\4\uffff\2\55\4\uffff\1\55\1\uffff\1\1\3\uffff\3\1\1\uffff\1\55"+
			"\1\uffff\1\55\1\uffff\2\55\2\1\1\uffff\1\55\2\1\5\uffff\1\1\1\uffff\1"+
			"\1\2\uffff\3\55\1\1\1\uffff\1\55\1\uffff\2\55\1\uffff\1\55\3\uffff\1"+
			"\1\1\uffff\2\55\1\uffff\1\1\3\uffff\1\42\1\55\1\uffff\3\55\1\uffff\3"+
			"\55\5\uffff\1\55\1\uffff\1\55\4\uffff\1\55\2\uffff\5\55\3\uffff\1\55"+
			"\1\uffff\2\55\2\uffff\1\55\1\1\4\55\5\1\1\uffff\1\1\1\55\2\uffff\2\55"+
			"\4\uffff\2\55\1\uffff\1\1\1\55\2\1\15\uffff\1\54",
			"\1\1\4\uffff\1\1\4\uffff\1\1\3\uffff\1\1\1\uffff\1\56\1\1\3\uffff\2"+
			"\60\4\uffff\1\60\1\uffff\1\61\3\uffff\1\62\1\63\1\64\1\uffff\1\60\1\107"+
			"\1\60\1\uffff\2\60\1\106\1\65\1\uffff\1\60\1\104\1\66\4\uffff\1\107\1"+
			"\67\1\uffff\1\70\2\uffff\3\60\1\71\1\uffff\1\60\1\uffff\2\60\1\uffff"+
			"\1\60\3\uffff\1\72\1\1\2\60\1\uffff\1\73\2\uffff\2\107\1\60\1\uffff\3"+
			"\60\1\uffff\3\60\4\uffff\1\1\1\60\1\uffff\1\60\1\uffff\1\1\2\uffff\1"+
			"\60\2\uffff\5\60\3\uffff\1\60\1\uffff\2\60\2\uffff\1\60\1\74\4\60\1\75"+
			"\1\105\1\76\1\103\1\77\1\uffff\1\1\1\60\1\uffff\1\107\2\60\4\uffff\2"+
			"\60\1\uffff\1\100\1\60\1\101\1\102\3\uffff\1\107\10\uffff\1\1\1\57\2"+
			"\uffff\1\1\2\uffff\1\1\7\uffff\1\1\4\uffff\1\1\2\uffff\1\1\6\uffff\1"+
			"\1\3\uffff\1\1",
			"\1\1\u008c\uffff\1\42\6\uffff\1\42",
			"\1\1\105\uffff\1\42\6\uffff\1\42",
			"\1\1\1\42",
			"\1\1\1\42",
			"\1\1\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\31\uffff\1\1\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2"+
			"\uffff\1\42",
			"\1\42\1\uffff\2\42\27\uffff\1\42\22\uffff\2\42\6\uffff\1\42\12\uffff"+
			"\1\42\21\uffff\1\42\2\uffff\1\42\2\uffff\1\42\34\uffff\1\42\11\uffff"+
			"\1\42\32\uffff\2\42\1\uffff\1\42\2\uffff\1\1\2\42\7\uffff\1\42\2\uffff"+
			"\1\42"
	};

	static final short[] DFA178_eot = DFA.unpackEncodedString(DFA178_eotS);
	static final short[] DFA178_eof = DFA.unpackEncodedString(DFA178_eofS);
	static final char[] DFA178_min = DFA.unpackEncodedStringToUnsignedChars(DFA178_minS);
	static final char[] DFA178_max = DFA.unpackEncodedStringToUnsignedChars(DFA178_maxS);
	static final short[] DFA178_accept = DFA.unpackEncodedString(DFA178_acceptS);
	static final short[] DFA178_special = DFA.unpackEncodedString(DFA178_specialS);
	static final short[][] DFA178_transition;

	static {
		int numStates = DFA178_transitionS.length;
		DFA178_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA178_transition[i] = DFA.unpackEncodedString(DFA178_transitionS[i]);
		}
	}

	protected class DFA178 extends DFA {

		public DFA178(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 178;
			this.eot = DFA178_eot;
			this.eof = DFA178_eof;
			this.min = DFA178_min;
			this.max = DFA178_max;
			this.accept = DFA178_accept;
			this.special = DFA178_special;
			this.transition = DFA178_transition;
		}
		@Override
		public String getDescription() {
			return "1340:1: term returns [Term.Raw term] : (v= value |f= function | '(' c= comparatorType ')' t= term );";
		}
	}

	static final String DFA181_eotS =
		"\36\uffff";
	static final String DFA181_eofS =
		"\36\uffff";
	static final String DFA181_minS =
		"\1\6\1\uffff\32\27\2\uffff";
	static final String DFA181_maxS =
		"\1\u00ca\1\uffff\32\u00be\2\uffff";
	static final String DFA181_acceptS =
		"\1\uffff\1\1\32\uffff\1\2\1\3";
	static final String DFA181_specialS =
		"\36\uffff}>";
	static final String[] DFA181_transitionS = {
			"\1\1\4\uffff\1\1\4\uffff\1\1\3\uffff\1\1\1\uffff\1\2\1\1\3\uffff\2\4"+
			"\4\uffff\1\4\1\uffff\1\5\3\uffff\1\6\1\7\1\10\1\uffff\1\4\1\33\1\4\1"+
			"\uffff\2\4\1\32\1\11\1\uffff\1\4\1\30\1\12\4\uffff\1\33\1\13\1\uffff"+
			"\1\14\2\uffff\3\4\1\15\1\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\1"+
			"\16\1\1\2\4\1\uffff\1\17\2\uffff\2\33\1\4\1\uffff\3\4\1\uffff\3\4\4\uffff"+
			"\1\1\1\4\1\uffff\1\4\1\uffff\1\1\2\uffff\1\4\2\uffff\5\4\3\uffff\1\4"+
			"\1\uffff\2\4\2\uffff\1\4\1\20\4\4\1\21\1\31\1\22\1\27\1\23\1\uffff\1"+
			"\1\1\4\1\uffff\1\33\2\4\4\uffff\2\4\1\uffff\1\24\1\4\1\25\1\26\3\uffff"+
			"\1\33\10\uffff\1\1\1\3\2\uffff\1\1\2\uffff\1\1\7\uffff\1\1\4\uffff\1"+
			"\1\2\uffff\1\1\6\uffff\1\1\3\uffff\1\1",
			"",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u009f\uffff\1\1\1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"\1\35\u00a1\uffff\1\34\2\uffff\1\34\1\uffff\1\1",
			"",
			""
	};

	static final short[] DFA181_eot = DFA.unpackEncodedString(DFA181_eotS);
	static final short[] DFA181_eof = DFA.unpackEncodedString(DFA181_eofS);
	static final char[] DFA181_min = DFA.unpackEncodedStringToUnsignedChars(DFA181_minS);
	static final char[] DFA181_max = DFA.unpackEncodedStringToUnsignedChars(DFA181_maxS);
	static final short[] DFA181_accept = DFA.unpackEncodedString(DFA181_acceptS);
	static final short[] DFA181_special = DFA.unpackEncodedString(DFA181_specialS);
	static final short[][] DFA181_transition;

	static {
		int numStates = DFA181_transitionS.length;
		DFA181_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA181_transition[i] = DFA.unpackEncodedString(DFA181_transitionS[i]);
		}
	}

	protected class DFA181 extends DFA {

		public DFA181(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 181;
			this.eot = DFA181_eot;
			this.eof = DFA181_eof;
			this.min = DFA181_min;
			this.max = DFA181_max;
			this.accept = DFA181_accept;
			this.special = DFA181_special;
			this.transition = DFA181_transition;
		}
		@Override
		public String getDescription() {
			return "1357:1: normalColumnOperation[List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key] : (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER );";
		}
	}

	static final String DFA189_eotS =
		"\35\uffff";
	static final String DFA189_eofS =
		"\35\uffff";
	static final String DFA189_minS =
		"\1\26\31\u00c3\1\6\2\uffff";
	static final String DFA189_maxS =
		"\1\u00a9\31\u00c3\1\u00ca\2\uffff";
	static final String DFA189_acceptS =
		"\33\uffff\1\1\1\2";
	static final String DFA189_specialS =
		"\35\uffff}>";
	static final String[] DFA189_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\31\1\3\1\uffff\2\3\1\31\1\10\1\uffff\1\3\1\27\1\11\4\uffff\1\31"+
			"\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff\1"+
			"\3\3\uffff\1\15\1\uffff\2\3\1\uffff\1\16\2\uffff\2\31\1\3\1\uffff\3\3"+
			"\1\uffff\3\3\5\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff"+
			"\1\3\1\uffff\2\3\2\uffff\1\3\1\17\4\3\1\20\1\30\1\21\1\26\1\22\2\uffff"+
			"\1\3\1\uffff\1\31\2\3\4\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff"+
			"\1\31\11\uffff\1\2",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\33\4\uffff\1\33\4\uffff\1\33\3\uffff\1\33\2\uffff\1\33\3\uffff\2"+
			"\33\4\uffff\1\33\1\uffff\1\33\3\uffff\3\33\1\uffff\3\33\1\uffff\4\33"+
			"\1\uffff\3\33\4\uffff\2\33\1\uffff\1\33\2\uffff\4\33\1\uffff\1\33\1\uffff"+
			"\2\33\1\uffff\1\33\3\uffff\4\33\1\uffff\1\33\2\uffff\3\33\1\uffff\3\33"+
			"\1\uffff\3\33\4\uffff\2\33\1\uffff\1\33\4\uffff\1\33\2\uffff\5\33\3\uffff"+
			"\1\33\1\uffff\2\33\2\uffff\13\33\2\uffff\1\33\1\uffff\3\33\4\uffff\2"+
			"\33\1\uffff\4\33\3\uffff\1\33\14\uffff\1\33\2\uffff\1\33\14\uffff\1\33"+
			"\15\uffff\1\34",
			"",
			""
	};

	static final short[] DFA189_eot = DFA.unpackEncodedString(DFA189_eotS);
	static final short[] DFA189_eof = DFA.unpackEncodedString(DFA189_eofS);
	static final char[] DFA189_min = DFA.unpackEncodedStringToUnsignedChars(DFA189_minS);
	static final char[] DFA189_max = DFA.unpackEncodedStringToUnsignedChars(DFA189_maxS);
	static final short[] DFA189_accept = DFA.unpackEncodedString(DFA189_acceptS);
	static final short[] DFA189_special = DFA.unpackEncodedString(DFA189_specialS);
	static final short[][] DFA189_transition;

	static {
		int numStates = DFA189_transitionS.length;
		DFA189_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA189_transition[i] = DFA.unpackEncodedString(DFA189_transitionS[i]);
		}
	}

	protected class DFA189 extends DFA {

		public DFA189(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 189;
			this.eot = DFA189_eot;
			this.eof = DFA189_eof;
			this.min = DFA189_min;
			this.max = DFA189_max;
			this.accept = DFA189_accept;
			this.special = DFA189_special;
			this.transition = DFA189_transition;
		}
		@Override
		public String getDescription() {
			return "1437:1: property[PropertyDefinitions props] : (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= mapLiteral );";
		}
	}

	static final String DFA195_eotS =
		"\77\uffff";
	static final String DFA195_eofS =
		"\77\uffff";
	static final String DFA195_minS =
		"\1\26\31\60\1\uffff\1\26\3\uffff\1\u00a8\2\uffff\31\60\4\uffff";
	static final String DFA195_maxS =
		"\1\u00b7\31\u00c6\1\uffff\1\u00b7\3\uffff\1\u00bf\2\uffff\31\u00c6\4\uffff";
	static final String DFA195_acceptS =
		"\32\uffff\1\4\1\uffff\1\1\1\2\1\3\1\uffff\1\7\1\10\31\uffff\1\12\1\5\1"+
		"\6\1\11";
	static final String DFA195_specialS =
		"\77\uffff}>";
	static final String[] DFA195_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\31\1\3\1\uffff\2\3\1\31\1\10\1\uffff\1\3\1\27\1\11\4\uffff\1\31"+
			"\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff\1"+
			"\3\3\uffff\1\15\1\uffff\2\3\1\uffff\1\16\2\uffff\2\31\1\3\1\uffff\3\3"+
			"\1\uffff\3\3\5\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff"+
			"\1\3\1\uffff\2\3\2\uffff\1\3\1\17\4\3\1\20\1\30\1\21\1\26\1\22\1\uffff"+
			"\1\32\1\3\1\uffff\1\31\2\3\4\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff"+
			"\1\31\11\uffff\1\2\15\uffff\1\33",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"\1\40\34\uffff\1\37\10\uffff\1\36\6\uffff\1\35\130\uffff\1\34\12\uffff"+
			"\5\34\1\41",
			"",
			"\1\42\4\uffff\2\44\4\uffff\1\44\1\uffff\1\45\3\uffff\1\46\1\47\1\50"+
			"\1\uffff\1\44\1\72\1\44\1\uffff\2\44\1\72\1\51\1\uffff\1\44\1\70\1\52"+
			"\4\uffff\1\72\1\53\1\uffff\1\54\2\uffff\3\44\1\55\1\uffff\1\44\1\uffff"+
			"\2\44\1\uffff\1\44\3\uffff\1\56\1\uffff\2\44\1\uffff\1\57\2\uffff\2\72"+
			"\1\44\1\uffff\3\44\1\uffff\3\44\5\uffff\1\44\1\uffff\1\44\4\uffff\1\44"+
			"\2\uffff\5\44\3\uffff\1\44\1\uffff\2\44\2\uffff\1\44\1\60\4\44\1\61\1"+
			"\71\1\62\1\67\1\63\1\uffff\1\73\1\44\1\uffff\1\72\2\44\4\uffff\2\44\1"+
			"\uffff\1\64\1\44\1\65\1\66\3\uffff\1\72\11\uffff\1\43\15\uffff\1\73",
			"",
			"",
			"",
			"\1\74\16\uffff\1\75\7\uffff\1\74",
			"",
			"",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"\1\73\34\uffff\1\73\10\uffff\1\73\6\uffff\1\73\130\uffff\1\73\1\uffff"+
			"\1\76\2\uffff\1\76\5\uffff\6\73",
			"",
			"",
			"",
			""
	};

	static final short[] DFA195_eot = DFA.unpackEncodedString(DFA195_eotS);
	static final short[] DFA195_eof = DFA.unpackEncodedString(DFA195_eofS);
	static final char[] DFA195_min = DFA.unpackEncodedStringToUnsignedChars(DFA195_minS);
	static final char[] DFA195_max = DFA.unpackEncodedStringToUnsignedChars(DFA195_maxS);
	static final short[] DFA195_accept = DFA.unpackEncodedString(DFA195_acceptS);
	static final short[] DFA195_special = DFA.unpackEncodedString(DFA195_specialS);
	static final short[][] DFA195_transition;

	static {
		int numStates = DFA195_transitionS.length;
		DFA195_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA195_transition[i] = DFA.unpackEncodedString(DFA195_transitionS[i]);
		}
	}

	protected class DFA195 extends DFA {

		public DFA195(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 195;
			this.eot = DFA195_eot;
			this.eof = DFA195_eof;
			this.min = DFA195_min;
			this.max = DFA195_max;
			this.accept = DFA195_accept;
			this.special = DFA195_special;
			this.transition = DFA195_transition;
		}
		@Override
		public String getDescription() {
			return "1456:1: relation[WhereClause.Builder clauses] : (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident K_CONTAINS ( K_KEY )? t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' );";
		}
	}

	static final String DFA194_eotS =
		"\12\uffff";
	static final String DFA194_eofS =
		"\12\uffff";
	static final String DFA194_minS =
		"\1\115\1\uffff\6\u00a8\2\uffff";
	static final String DFA194_maxS =
		"\1\u00c5\1\uffff\6\u00bf\2\uffff";
	static final String DFA194_acceptS =
		"\1\uffff\1\1\6\uffff\1\2\1\3";
	static final String DFA194_specialS =
		"\12\uffff}>";
	static final String[] DFA194_transitionS = {
			"\1\1\150\uffff\1\7\12\uffff\1\3\1\4\1\2\1\5\1\6",
			"",
			"\1\11\16\uffff\1\10\7\uffff\1\11",
			"\1\11\16\uffff\1\10\7\uffff\1\11",
			"\1\11\16\uffff\1\10\7\uffff\1\11",
			"\1\11\16\uffff\1\10\7\uffff\1\11",
			"\1\11\16\uffff\1\10\7\uffff\1\11",
			"\1\11\16\uffff\1\10\7\uffff\1\11",
			"",
			""
	};

	static final short[] DFA194_eot = DFA.unpackEncodedString(DFA194_eotS);
	static final short[] DFA194_eof = DFA.unpackEncodedString(DFA194_eofS);
	static final char[] DFA194_min = DFA.unpackEncodedStringToUnsignedChars(DFA194_minS);
	static final char[] DFA194_max = DFA.unpackEncodedStringToUnsignedChars(DFA194_maxS);
	static final short[] DFA194_accept = DFA.unpackEncodedString(DFA194_acceptS);
	static final short[] DFA194_special = DFA.unpackEncodedString(DFA194_specialS);
	static final short[][] DFA194_transition;

	static {
		int numStates = DFA194_transitionS.length;
		DFA194_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA194_transition[i] = DFA.unpackEncodedString(DFA194_transitionS[i]);
		}
	}

	protected class DFA194 extends DFA {

		public DFA194(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 194;
			this.eot = DFA194_eot;
			this.eof = DFA194_eof;
			this.min = DFA194_min;
			this.max = DFA194_max;
			this.accept = DFA194_accept;
			this.special = DFA194_special;
			this.transition = DFA194_transition;
		}
		@Override
		public String getDescription() {
			return "1470:7: ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )";
		}
	}

	static final String DFA204_eotS =
		"\40\uffff";
	static final String DFA204_eofS =
		"\1\uffff\25\35\2\32\1\uffff\1\32\1\uffff\1\32\4\uffff";
	static final String DFA204_minS =
		"\1\26\27\103\1\uffff\1\103\1\uffff\1\103\4\uffff";
	static final String DFA204_maxS =
		"\1\u00ac\27\u00c4\1\uffff\1\u00c4\1\uffff\1\u00c4\4\uffff";
	static final String DFA204_acceptS =
		"\30\uffff\1\2\1\uffff\1\4\1\uffff\1\6\1\1\1\3\1\5";
	static final String DFA204_specialS =
		"\40\uffff}>";
	static final String[] DFA204_transitionS = {
			"\1\32\4\uffff\2\32\4\uffff\1\32\1\uffff\1\1\3\uffff\1\2\1\3\1\4\1\uffff"+
			"\3\32\1\uffff\3\32\1\5\1\uffff\1\32\1\24\1\6\4\uffff\1\32\1\7\1\uffff"+
			"\1\10\2\uffff\3\32\1\11\1\uffff\1\33\1\uffff\2\32\1\uffff\1\32\3\uffff"+
			"\1\12\1\uffff\2\32\1\uffff\1\13\2\uffff\3\32\1\uffff\3\32\1\uffff\1\27"+
			"\1\32\1\26\5\uffff\1\32\1\uffff\1\32\4\uffff\1\32\2\uffff\5\32\3\uffff"+
			"\1\32\1\uffff\2\32\1\uffff\1\30\1\32\1\14\4\32\1\15\1\25\1\16\1\23\1"+
			"\17\2\uffff\1\32\1\uffff\1\32\1\31\1\32\4\uffff\2\32\1\uffff\1\20\1\32"+
			"\1\21\1\22\3\uffff\1\32\11\uffff\1\32\2\uffff\1\34",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\12\uffff\1\35\31\uffff\1\35\12\uffff\1\35\66\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\1\uffff\1\35\3\uffff\1\35",
			"\1\32\15\uffff\1\32\12\uffff\1\32\31\uffff\1\32\12\uffff\1\32\66\uffff"+
			"\1\32\2\uffff\1\32\2\uffff\1\32\1\uffff\1\32\1\30\2\uffff\1\32",
			"\1\32\15\uffff\1\32\12\uffff\1\32\31\uffff\1\32\12\uffff\1\32\66\uffff"+
			"\1\32\2\uffff\1\32\2\uffff\1\32\1\uffff\1\32\1\30\2\uffff\1\32",
			"",
			"\1\32\15\uffff\1\32\12\uffff\1\32\31\uffff\1\32\12\uffff\1\32\66\uffff"+
			"\1\32\2\uffff\1\32\2\uffff\1\32\1\uffff\1\32\1\36\2\uffff\1\32",
			"",
			"\1\32\15\uffff\1\32\12\uffff\1\32\31\uffff\1\32\12\uffff\1\32\66\uffff"+
			"\1\32\2\uffff\1\32\2\uffff\1\32\1\uffff\1\32\1\37\2\uffff\1\32",
			"",
			"",
			"",
			""
	};

	static final short[] DFA204_eot = DFA.unpackEncodedString(DFA204_eotS);
	static final short[] DFA204_eof = DFA.unpackEncodedString(DFA204_eofS);
	static final char[] DFA204_min = DFA.unpackEncodedStringToUnsignedChars(DFA204_minS);
	static final char[] DFA204_max = DFA.unpackEncodedStringToUnsignedChars(DFA204_maxS);
	static final short[] DFA204_accept = DFA.unpackEncodedString(DFA204_acceptS);
	static final short[] DFA204_special = DFA.unpackEncodedString(DFA204_specialS);
	static final short[][] DFA204_transition;

	static {
		int numStates = DFA204_transitionS.length;
		DFA204_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA204_transition[i] = DFA.unpackEncodedString(DFA204_transitionS[i]);
		}
	}

	protected class DFA204 extends DFA {

		public DFA204(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 204;
			this.eot = DFA204_eot;
			this.eof = DFA204_eof;
			this.min = DFA204_min;
			this.max = DFA204_max;
			this.accept = DFA204_accept;
			this.special = DFA204_special;
			this.transition = DFA204_transition;
		}
		@Override
		public String getDescription() {
			return "1527:1: comparatorType returns [CQL3Type.Raw t] : (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL );";
		}
	}

	public static final BitSet FOLLOW_selectStatement_in_cqlStatement59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStatement_in_cqlStatement88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateStatement_in_cqlStatement117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_batchStatement_in_cqlStatement146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStatement_in_cqlStatement176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_useStatement_in_cqlStatement205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_truncateStatement_in_cqlStatement237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createKeyspaceStatement_in_cqlStatement264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTableStatement_in_cqlStatement285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createIndexStatement_in_cqlStatement308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropKeyspaceStatement_in_cqlStatement331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTableStatement_in_cqlStatement353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropIndexStatement_in_cqlStatement378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTableStatement_in_cqlStatement403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterKeyspaceStatement_in_cqlStatement427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grantPermissionsStatement_in_cqlStatement448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_revokePermissionsStatement_in_cqlStatement466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listPermissionsStatement_in_cqlStatement483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createUserStatement_in_cqlStatement502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterUserStatement_in_cqlStatement526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropUserStatement_in_cqlStatement551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listUsersStatement_in_cqlStatement577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTriggerStatement_in_cqlStatement602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTriggerStatement_in_cqlStatement623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTypeStatement_in_cqlStatement646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTypeStatement_in_cqlStatement670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTypeStatement_in_cqlStatement695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createFunctionStatement_in_cqlStatement721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropFunctionStatement_in_cqlStatement741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createAggregateStatement_in_cqlStatement763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropAggregateStatement_in_cqlStatement782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createRoleStatement_in_cqlStatement803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterRoleStatement_in_cqlStatement827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropRoleStatement_in_cqlStatement852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listRolesStatement_in_cqlStatement878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grantRoleStatement_in_cqlStatement903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_revokeRoleStatement_in_cqlStatement928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createMaterializedViewStatement_in_cqlStatement952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropMaterializedViewStatement_in_cqlStatement964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterMaterializedViewStatement_in_cqlStatement978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USE_in_useStatement1004 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_keyspaceName_in_useStatement1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SELECT_in_selectStatement1042 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x00000000000004C0L});
	public static final BitSet FOLLOW_K_JSON_in_selectStatement1052 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x00000000000004C0L});
	public static final BitSet FOLLOW_K_DISTINCT_in_selectStatement1069 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x00000000000004C0L});
	public static final BitSet FOLLOW_selectClause_in_selectStatement1078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_FROM_in_selectStatement1088 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_columnFamilyName_in_selectStatement1092 = new BitSet(new long[]{0x0000000020000002L,0x0009000040000800L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_WHERE_in_selectStatement1102 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x008002008F61DBFFL,0x0000000000000200L});
	public static final BitSet FOLLOW_whereClause_in_selectStatement1106 = new BitSet(new long[]{0x0000000020000002L,0x0009000040000800L});
	public static final BitSet FOLLOW_K_GROUP_in_selectStatement1119 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_K_BY_in_selectStatement1121 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_groupByClause_in_selectStatement1123 = new BitSet(new long[]{0x0000000020000002L,0x0009000040000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_selectStatement1128 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_groupByClause_in_selectStatement1130 = new BitSet(new long[]{0x0000000020000002L,0x0009000040000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_K_ORDER_in_selectStatement1147 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_K_BY_in_selectStatement1149 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_orderByClause_in_selectStatement1151 = new BitSet(new long[]{0x0000000020000002L,0x0008000040000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_selectStatement1156 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_orderByClause_in_selectStatement1158 = new BitSet(new long[]{0x0000000020000002L,0x0008000040000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_K_PER_in_selectStatement1175 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_K_PARTITION_in_selectStatement1177 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_LIMIT_in_selectStatement1179 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x8000010000000000L});
	public static final BitSet FOLLOW_intValue_in_selectStatement1183 = new BitSet(new long[]{0x0000000020000002L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_LIMIT_in_selectStatement1198 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x8000010000000000L});
	public static final BitSet FOLLOW_intValue_in_selectStatement1202 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_ALLOW_in_selectStatement1217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_FILTERING_in_selectStatement1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selector_in_selectClause1256 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_selectClause1261 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_selector_in_selectClause1265 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_199_in_selectClause1277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selector1310 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_K_AS_in_selector1313 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_noncol_ident_in_selector1317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_unaliasedSelector1360 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_value_in_unaliasedSelector1408 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_183_in_unaliasedSelector1455 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_unaliasedSelector1459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_184_in_unaliasedSelector1461 = new BitSet(new long[]{0x0000000000910840L,0x0000084000010000L,0x9080910000000000L,0x0000000000000440L});
	public static final BitSet FOLLOW_value_in_unaliasedSelector1465 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_K_COUNT_in_unaliasedSelector1486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_unaliasedSelector1488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_unaliasedSelector1490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_184_in_unaliasedSelector1492 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_K_WRITETIME_in_unaliasedSelector1526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_unaliasedSelector1528 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_unaliasedSelector1532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_184_in_unaliasedSelector1534 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_K_TTL_in_unaliasedSelector1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_unaliasedSelector1568 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_unaliasedSelector1572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_184_in_unaliasedSelector1574 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_K_CAST_in_unaliasedSelector1600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_unaliasedSelector1607 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_unaliasedSelector_in_unaliasedSelector1611 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_K_AS_in_unaliasedSelector1613 = new BitSet(new long[]{0x5064038800000000L,0x0000000000108010L,0x000000000D0003E1L});
	public static final BitSet FOLLOW_native_type_in_unaliasedSelector1617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_184_in_unaliasedSelector1619 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_functionName_in_unaliasedSelector1634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_selectionFunctionArgs_in_unaliasedSelector1638 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_190_in_unaliasedSelector1653 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_fident_in_unaliasedSelector1657 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_183_in_selectionFunctionArgs1685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_184_in_selectionFunctionArgs1687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_selectionFunctionArgs1697 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs1701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_selectionFunctionArgs1717 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs1721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_selectionFunctionArgs1734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationOrExpression_in_whereClause1765 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_whereClause1769 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x008002008F61DBFFL,0x0000000000000200L});
	public static final BitSet FOLLOW_relationOrExpression_in_whereClause1771 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_relation_in_relationOrExpression1793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_customIndexExpression_in_relationOrExpression1802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_201_in_customIndexExpression1830 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_idxName_in_customIndexExpression1832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_customIndexExpression1835 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_customIndexExpression1839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_184_in_customIndexExpression1841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_orderByClause1871 = new BitSet(new long[]{0x0200000400000002L});
	public static final BitSet FOLLOW_K_ASC_in_orderByClause1874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DESC_in_orderByClause1878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_groupByClause1904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INSERT_in_insertStatement1929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_INTO_in_insertStatement1931 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_columnFamilyName_in_insertStatement1935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L,0x0080000000000000L});
	public static final BitSet FOLLOW_normalInsertStatement_in_insertStatement1949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_JSON_in_insertStatement1964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000110000000000L});
	public static final BitSet FOLLOW_jsonInsertStatement_in_insertStatement1968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_normalInsertStatement2004 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_normalInsertStatement2008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_normalInsertStatement2015 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_normalInsertStatement2019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_normalInsertStatement2026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_VALUES_in_normalInsertStatement2034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_normalInsertStatement2042 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_normalInsertStatement2046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_normalInsertStatement2052 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_normalInsertStatement2056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_normalInsertStatement2063 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_IF_in_normalInsertStatement2073 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_normalInsertStatement2075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_normalInsertStatement2077 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_usingClause_in_normalInsertStatement2092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jsonValue_in_jsonInsertStatement2138 = new BitSet(new long[]{0x0080000000000002L,0x0000000000001000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_DEFAULT_in_jsonInsertStatement2148 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_K_NULL_in_jsonInsertStatement2152 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_UNSET_in_jsonInsertStatement2160 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_IF_in_jsonInsertStatement2176 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_jsonInsertStatement2178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_jsonInsertStatement2180 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_usingClause_in_jsonInsertStatement2195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_jsonValue2230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_191_in_jsonValue2240 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_noncol_ident_in_jsonValue2244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_jsonValue2258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USING_in_usingClause2289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004080L});
	public static final BitSet FOLLOW_usingClauseObjective_in_usingClause2291 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_usingClause2296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004080L});
	public static final BitSet FOLLOW_usingClauseObjective_in_usingClause2298 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseObjective2320 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x8000010000000000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseObjective2324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TTL_in_usingClauseObjective2334 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x8000010000000000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseObjective2338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_UPDATE_in_updateStatement2372 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_columnFamilyName_in_updateStatement2376 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_usingClause_in_updateStatement2386 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_K_SET_in_updateStatement2398 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_columnOperation_in_updateStatement2400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000020000000L});
	public static final BitSet FOLLOW_187_in_updateStatement2404 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_columnOperation_in_updateStatement2406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000020000000L});
	public static final BitSet FOLLOW_K_WHERE_in_updateStatement2417 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x008002008F61DBFFL,0x0000000000000200L});
	public static final BitSet FOLLOW_whereClause_in_updateStatement2421 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_IF_in_updateStatement2431 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_K_EXISTS_in_updateStatement2435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateConditions_in_updateStatement2443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_columnCondition_in_updateConditions2485 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_updateConditions2490 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_columnCondition_in_updateConditions2492 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_DELETE_in_deleteStatement2529 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B7EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_deleteSelection_in_deleteStatement2535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_FROM_in_deleteStatement2548 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_columnFamilyName_in_deleteStatement2552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020800000L});
	public static final BitSet FOLLOW_usingClauseDelete_in_deleteStatement2562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_WHERE_in_deleteStatement2574 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x008002008F61DBFFL,0x0000000000000200L});
	public static final BitSet FOLLOW_whereClause_in_deleteStatement2578 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_IF_in_deleteStatement2588 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_K_EXISTS_in_deleteStatement2592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateConditions_in_deleteStatement2600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteOp_in_deleteSelection2647 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_deleteSelection2662 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_deleteOp_in_deleteSelection2666 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_cident_in_deleteOp2693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_deleteOp2720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_198_in_deleteOp2722 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_deleteOp2726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_deleteOp2728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_deleteOp2740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_190_in_deleteOp2742 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_fident_in_deleteOp2746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USING_in_usingClauseDelete2766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseDelete2768 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x8000010000000000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseDelete2772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BEGIN_in_batchStatement2806 = new BitSet(new long[]{0x0004002000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_UNLOGGED_in_batchStatement2816 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_K_COUNTER_in_batchStatement2822 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_K_BATCH_in_batchStatement2835 = new BitSet(new long[]{0x0100000100000000L,0x0000000000080000L,0x0000000000880000L});
	public static final BitSet FOLLOW_usingClause_in_batchStatement2839 = new BitSet(new long[]{0x0100000100000000L,0x0000000000080000L,0x0000000000080000L});
	public static final BitSet FOLLOW_batchStatementObjective_in_batchStatement2859 = new BitSet(new long[]{0x0100000100000000L,0x0000000000080000L,0x0000000000080000L,0x0000000000000001L});
	public static final BitSet FOLLOW_192_in_batchStatement2861 = new BitSet(new long[]{0x0100000100000000L,0x0000000000080000L,0x0000000000080000L});
	public static final BitSet FOLLOW_K_APPLY_in_batchStatement2875 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_K_BATCH_in_batchStatement2877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStatement_in_batchStatementObjective2908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateStatement_in_batchStatementObjective2921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStatement_in_batchStatementObjective2934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createAggregateStatement2967 = new BitSet(new long[]{0x0000000008000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_K_OR_in_createAggregateStatement2970 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_K_REPLACE_in_createAggregateStatement2972 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_K_AGGREGATE_in_createAggregateStatement2984 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB969B5EL,0x000003008F61DBFFL});
	public static final BitSet FOLLOW_K_IF_in_createAggregateStatement2993 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createAggregateStatement2995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createAggregateStatement2997 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61DBFFL});
	public static final BitSet FOLLOW_functionName_in_createAggregateStatement3011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_createAggregateStatement3019 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x010012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement3043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_createAggregateStatement3059 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement3063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_createAggregateStatement3087 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_K_SFUNC_in_createAggregateStatement3095 = new BitSet(new long[]{0x5077AB8A18400000L,0x9A3E4283BA168B5EL,0x000002000F619BFFL});
	public static final BitSet FOLLOW_allowedFunctionName_in_createAggregateStatement3101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_K_STYPE_in_createAggregateStatement3109 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement3115 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020008L});
	public static final BitSet FOLLOW_K_FINALFUNC_in_createAggregateStatement3133 = new BitSet(new long[]{0x5077AB8A18400000L,0x9A3E4283BA168B5EL,0x000002000F619BFFL});
	public static final BitSet FOLLOW_allowedFunctionName_in_createAggregateStatement3139 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_INITCOND_in_createAggregateStatement3166 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_createAggregateStatement3172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropAggregateStatement3219 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_K_AGGREGATE_in_dropAggregateStatement3221 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB969B5EL,0x000003008F61DBFFL});
	public static final BitSet FOLLOW_K_IF_in_dropAggregateStatement3230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropAggregateStatement3232 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61DBFFL});
	public static final BitSet FOLLOW_functionName_in_dropAggregateStatement3247 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_dropAggregateStatement3265 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x010012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_dropAggregateStatement3293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_dropAggregateStatement3311 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_dropAggregateStatement3315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_dropAggregateStatement3343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createFunctionStatement3400 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000100L});
	public static final BitSet FOLLOW_K_OR_in_createFunctionStatement3403 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_K_REPLACE_in_createFunctionStatement3405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_K_FUNCTION_in_createFunctionStatement3417 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB969B5EL,0x000003008F61DBFFL});
	public static final BitSet FOLLOW_K_IF_in_createFunctionStatement3426 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createFunctionStatement3428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createFunctionStatement3430 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61DBFFL});
	public static final BitSet FOLLOW_functionName_in_createFunctionStatement3444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_createFunctionStatement3452 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x010002008F61D3FFL});
	public static final BitSet FOLLOW_noncol_ident_in_createFunctionStatement3476 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement3480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_createFunctionStatement3496 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_noncol_ident_in_createFunctionStatement3500 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement3504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_createFunctionStatement3528 = new BitSet(new long[]{0x0000080000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_K_RETURNS_in_createFunctionStatement3539 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_NULL_in_createFunctionStatement3541 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_CALLED_in_createFunctionStatement3547 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_ON_in_createFunctionStatement3553 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_NULL_in_createFunctionStatement3555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_K_INPUT_in_createFunctionStatement3557 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_K_RETURNS_in_createFunctionStatement3565 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement3571 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_K_LANGUAGE_in_createFunctionStatement3579 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENT_in_createFunctionStatement3585 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_K_AS_in_createFunctionStatement3593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createFunctionStatement3599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropFunctionStatement3637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_K_FUNCTION_in_dropFunctionStatement3639 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB969B5EL,0x000003008F61DBFFL});
	public static final BitSet FOLLOW_K_IF_in_dropFunctionStatement3648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropFunctionStatement3650 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61DBFFL});
	public static final BitSet FOLLOW_functionName_in_dropFunctionStatement3665 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_dropFunctionStatement3683 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x010012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_dropFunctionStatement3711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_dropFunctionStatement3729 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_dropFunctionStatement3733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_dropFunctionStatement3761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createKeyspaceStatement3820 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_createKeyspaceStatement3822 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB969B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_K_IF_in_createKeyspaceStatement3825 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createKeyspaceStatement3827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createKeyspaceStatement3829 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_keyspaceName_in_createKeyspaceStatement3838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_WITH_in_createKeyspaceStatement3846 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_properties_in_createKeyspaceStatement3848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTableStatement3883 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_createTableStatement3885 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB969B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_K_IF_in_createTableStatement3888 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTableStatement3890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTableStatement3892 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_columnFamilyName_in_createTableStatement3907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_cfamDefinition_in_createTableStatement3917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_cfamDefinition3936 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A7E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition3938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_cfamDefinition3943 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A7E4283BB968B5EL,0x090002008F61D3FFL});
	public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition3945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_cfamDefinition3952 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_WITH_in_cfamDefinition3962 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition3964 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_cfamDefinition3969 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition3971 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_ident_in_cfamColumns3997 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_cfamColumns4001 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_STATIC_in_cfamColumns4006 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns4023 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_KEY_in_cfamColumns4025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns4037 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_KEY_in_cfamColumns4039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_cfamColumns4041 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x008002008F61D3FFL});
	public static final BitSet FOLLOW_pkDef_in_cfamColumns4043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_cfamColumns4047 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_ident_in_cfamColumns4051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_cfamColumns4058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_pkDef4078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_pkDef4088 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_ident_in_pkDef4094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_pkDef4100 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_ident_in_pkDef4104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_pkDef4111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_cfamProperty4131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COMPACT_in_cfamProperty4140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_STORAGE_in_cfamProperty4142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CLUSTERING_in_cfamProperty4152 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_K_ORDER_in_cfamProperty4154 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_K_BY_in_cfamProperty4156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_cfamProperty4158 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty4160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_cfamProperty4164 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty4166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_cfamProperty4171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_cfamOrdering4199 = new BitSet(new long[]{0x0200000400000000L});
	public static final BitSet FOLLOW_K_ASC_in_cfamOrdering4202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DESC_in_cfamOrdering4206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTypeStatement4245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_TYPE_in_createTypeStatement4247 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB969B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_K_IF_in_createTypeStatement4250 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTypeStatement4252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTypeStatement4254 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_userTypeName_in_createTypeStatement4272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_createTypeStatement4285 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_typeColumns_in_createTypeStatement4287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_createTypeStatement4292 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x090002008F61D3FFL});
	public static final BitSet FOLLOW_typeColumns_in_createTypeStatement4294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_createTypeStatement4301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fident_in_typeColumns4321 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_typeColumns4325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createIndexStatement4360 = new BitSet(new long[]{0x0010000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_K_CUSTOM_in_createIndexStatement4363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_K_INDEX_in_createIndexStatement4369 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E6283BB969B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_K_IF_in_createIndexStatement4372 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createIndexStatement4374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createIndexStatement4376 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E6283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_idxName_in_createIndexStatement4392 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_ON_in_createIndexStatement4397 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_columnFamilyName_in_createIndexStatement4401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_createIndexStatement4403 = new BitSet(new long[]{0xD877BB8A18400000L,0x9A3E4283BB968BDEL,0x010002008F61D3FFL});
	public static final BitSet FOLLOW_indexIdent_in_createIndexStatement4406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_createIndexStatement4410 = new BitSet(new long[]{0xD877BB8A18400000L,0x9A3E4283BB968BDEL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_indexIdent_in_createIndexStatement4412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_createIndexStatement4419 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040800000L});
	public static final BitSet FOLLOW_K_USING_in_createIndexStatement4430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createIndexStatement4434 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_WITH_in_createIndexStatement4449 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_properties_in_createIndexStatement4451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_indexIdent4483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VALUES_in_indexIdent4511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_indexIdent4513 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_indexIdent4517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_184_in_indexIdent4519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEYS_in_indexIdent4530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_indexIdent4532 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_indexIdent4536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_184_in_indexIdent4538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ENTRIES_in_indexIdent4551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_indexIdent4553 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_indexIdent4557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_184_in_indexIdent4559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FULL_in_indexIdent4569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_indexIdent4571 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_indexIdent4575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_184_in_indexIdent4577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createMaterializedViewStatement4614 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_createMaterializedViewStatement4616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_K_VIEW_in_createMaterializedViewStatement4618 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB969B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_K_IF_in_createMaterializedViewStatement4621 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createMaterializedViewStatement4623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createMaterializedViewStatement4625 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_columnFamilyName_in_createMaterializedViewStatement4633 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_K_AS_in_createMaterializedViewStatement4635 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_K_SELECT_in_createMaterializedViewStatement4645 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x00000000000004C0L});
	public static final BitSet FOLLOW_selectClause_in_createMaterializedViewStatement4649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_FROM_in_createMaterializedViewStatement4651 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_columnFamilyName_in_createMaterializedViewStatement4655 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_WHERE_in_createMaterializedViewStatement4666 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x008002008F61DBFFL,0x0000000000000200L});
	public static final BitSet FOLLOW_whereClause_in_createMaterializedViewStatement4670 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_PRIMARY_in_createMaterializedViewStatement4682 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_KEY_in_createMaterializedViewStatement4684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_createMaterializedViewStatement4696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_createMaterializedViewStatement4698 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement4702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_createMaterializedViewStatement4708 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement4712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_createMaterializedViewStatement4719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_createMaterializedViewStatement4723 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement4727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_createMaterializedViewStatement4734 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_183_in_createMaterializedViewStatement4744 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement4748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_createMaterializedViewStatement4754 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement4758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_createMaterializedViewStatement4765 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_WITH_in_createMaterializedViewStatement4797 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cfamProperty_in_createMaterializedViewStatement4799 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_createMaterializedViewStatement4804 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cfamProperty_in_createMaterializedViewStatement4806 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTriggerStatement4844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_TRIGGER_in_createTriggerStatement4846 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB969B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_K_IF_in_createTriggerStatement4849 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTriggerStatement4851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTriggerStatement4853 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_createTriggerStatement4863 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_ON_in_createTriggerStatement4874 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_columnFamilyName_in_createTriggerStatement4878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_USING_in_createTriggerStatement4880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createTriggerStatement4884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTriggerStatement4925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_TRIGGER_in_dropTriggerStatement4927 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB969B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_K_IF_in_dropTriggerStatement4930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTriggerStatement4932 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_dropTriggerStatement4942 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_ON_in_dropTriggerStatement4945 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_columnFamilyName_in_dropTriggerStatement4949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterKeyspaceStatement4989 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement4991 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_keyspaceName_in_alterKeyspaceStatement4995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterKeyspaceStatement5005 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_properties_in_alterKeyspaceStatement5007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement5042 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_alterTableStatement5044 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_columnFamilyName_in_alterTableStatement5048 = new BitSet(new long[]{0x2000000044000000L,0x0080000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement5062 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTableStatement5069 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement5073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ADD_in_alterTableStatement5092 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x008002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5107 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement5113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_cfisStatic_in_alterTableStatement5119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_alterTableStatement5148 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5153 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement5158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000002L});
	public static final BitSet FOLLOW_cfisStatic_in_alterTableStatement5163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_alterTableStatement5192 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5196 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement5201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000002L});
	public static final BitSet FOLLOW_cfisStatic_in_alterTableStatement5206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_alterTableStatement5213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_alterTableStatement5233 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x008002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5249 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_183_in_alterTableStatement5279 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_alterTableStatement5314 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_alterTableStatement5325 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_USING_in_alterTableStatement5353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_alterTableStatement5355 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_INTEGER_in_alterTableStatement5359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_WITH_in_alterTableStatement5381 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_properties_in_alterTableStatement5384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_RENAME_in_alterTableStatement5417 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_K_TO_in_alterTableStatement5473 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5477 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_alterTableStatement5498 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_K_TO_in_alterTableStatement5504 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5508 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_STATIC_in_cfisStatic5561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterMaterializedViewStatement5597 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_alterMaterializedViewStatement5599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_K_VIEW_in_alterMaterializedViewStatement5601 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_columnFamilyName_in_alterMaterializedViewStatement5605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterMaterializedViewStatement5617 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_properties_in_alterMaterializedViewStatement5619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTypeStatement5650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTypeStatement5652 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_userTypeName_in_alterTypeStatement5656 = new BitSet(new long[]{0x0000000044000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTypeStatement5670 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement5674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTypeStatement5676 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_alterTypeStatement5680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ADD_in_alterTypeStatement5696 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement5702 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_alterTypeStatement5706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_RENAME_in_alterTypeStatement5729 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement5767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_K_TO_in_alterTypeStatement5769 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement5773 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_alterTypeStatement5796 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement5800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_K_TO_in_alterTypeStatement5802 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement5806 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropKeyspaceStatement5873 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement5875 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB969B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_K_IF_in_dropKeyspaceStatement5878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropKeyspaceStatement5880 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_keyspaceName_in_dropKeyspaceStatement5889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTableStatement5923 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dropTableStatement5925 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB969B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_K_IF_in_dropTableStatement5928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTableStatement5930 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_columnFamilyName_in_dropTableStatement5939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTypeStatement5973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_TYPE_in_dropTypeStatement5975 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB969B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_K_IF_in_dropTypeStatement5978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTypeStatement5980 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_userTypeName_in_dropTypeStatement5989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropIndexStatement6023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_K_INDEX_in_dropIndexStatement6025 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB969B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_K_IF_in_dropIndexStatement6028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropIndexStatement6030 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_indexName_in_dropIndexStatement6039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropMaterializedViewStatement6079 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_dropMaterializedViewStatement6081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_K_VIEW_in_dropMaterializedViewStatement6083 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB969B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_K_IF_in_dropMaterializedViewStatement6086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropMaterializedViewStatement6088 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_columnFamilyName_in_dropMaterializedViewStatement6097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TRUNCATE_in_truncateStatement6128 = new BitSet(new long[]{0x5877FB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_truncateStatement6131 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_columnFamilyName_in_truncateStatement6137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GRANT_in_grantPermissionsStatement6162 = new BitSet(new long[]{0x2408001050000000L,0x2000002000000001L});
	public static final BitSet FOLLOW_permissionOrAll_in_grantPermissionsStatement6174 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_ON_in_grantPermissionsStatement6182 = new BitSet(new long[]{0x5877FB8A18400000L,0x9A3E429BBF968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_resource_in_grantPermissionsStatement6194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_K_TO_in_grantPermissionsStatement6202 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000013008F61D3FFL});
	public static final BitSet FOLLOW_userOrRoleName_in_grantPermissionsStatement6216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_REVOKE_in_revokePermissionsStatement6247 = new BitSet(new long[]{0x2408001050000000L,0x2000002000000001L});
	public static final BitSet FOLLOW_permissionOrAll_in_revokePermissionsStatement6259 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_ON_in_revokePermissionsStatement6267 = new BitSet(new long[]{0x5877FB8A18400000L,0x9A3E429BBF968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_resource_in_revokePermissionsStatement6279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_FROM_in_revokePermissionsStatement6287 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000013008F61D3FFL});
	public static final BitSet FOLLOW_userOrRoleName_in_revokePermissionsStatement6301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GRANT_in_grantRoleStatement6332 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000013008F61D3FFL});
	public static final BitSet FOLLOW_userOrRoleName_in_grantRoleStatement6346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_K_TO_in_grantRoleStatement6354 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000013008F61D3FFL});
	public static final BitSet FOLLOW_userOrRoleName_in_grantRoleStatement6368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_REVOKE_in_revokeRoleStatement6399 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000013008F61D3FFL});
	public static final BitSet FOLLOW_userOrRoleName_in_revokeRoleStatement6413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_FROM_in_revokeRoleStatement6421 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000013008F61D3FFL});
	public static final BitSet FOLLOW_userOrRoleName_in_revokeRoleStatement6435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listPermissionsStatement6473 = new BitSet(new long[]{0x2408001050000000L,0x2000002000000001L});
	public static final BitSet FOLLOW_permissionOrAll_in_listPermissionsStatement6485 = new BitSet(new long[]{0x0000000000000002L,0x0000310000000000L});
	public static final BitSet FOLLOW_K_ON_in_listPermissionsStatement6495 = new BitSet(new long[]{0x5877FB8A18400000L,0x9A3E429BBF968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_resource_in_listPermissionsStatement6497 = new BitSet(new long[]{0x0000000000000002L,0x0000110000000000L});
	public static final BitSet FOLLOW_K_OF_in_listPermissionsStatement6512 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000013008F61D3FFL});
	public static final BitSet FOLLOW_roleName_in_listPermissionsStatement6514 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_NORECURSIVE_in_listPermissionsStatement6528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_permission6564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_permissionOrAll6621 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
	public static final BitSet FOLLOW_K_PERMISSIONS_in_permissionOrAll6625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_permission_in_permissionOrAll6646 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
	public static final BitSet FOLLOW_K_PERMISSION_in_permissionOrAll6650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataResource_in_resource6678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleResource_in_resource6690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionResource_in_resource6702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jmxResource_in_resource6714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_dataResource6737 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_K_KEYSPACES_in_dataResource6739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_dataResource6749 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_keyspaceName_in_dataResource6755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dataResource6767 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_columnFamilyName_in_dataResource6776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_jmxResource6805 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_K_MBEANS_in_jmxResource6807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MBEAN_in_jmxResource6827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_mbean_in_jmxResource6829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MBEANS_in_jmxResource6839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_mbean_in_jmxResource6841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_roleResource6864 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_K_ROLES_in_roleResource6866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ROLE_in_roleResource6876 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000013008F61D3FFL});
	public static final BitSet FOLLOW_userOrRoleName_in_roleResource6882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_functionResource6914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_FUNCTIONS_in_functionResource6916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_functionResource6926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_FUNCTIONS_in_functionResource6928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_K_IN_in_functionResource6930 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_functionResource6932 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_keyspaceName_in_functionResource6938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FUNCTION_in_functionResource6953 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61DBFFL});
	public static final BitSet FOLLOW_functionName_in_functionResource6957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_functionResource6975 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x010012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_functionResource7003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_functionResource7021 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_functionResource7025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_functionResource7053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createUserStatement7101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_USER_in_createUserStatement7103 = new BitSet(new long[]{0x0000000000400000L,0x0000000000001000L,0x0000120000000000L});
	public static final BitSet FOLLOW_K_IF_in_createUserStatement7106 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createUserStatement7108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createUserStatement7110 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000120000000000L});
	public static final BitSet FOLLOW_username_in_createUserStatement7118 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000040000010L});
	public static final BitSet FOLLOW_K_WITH_in_createUserStatement7130 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_userPassword_in_createUserStatement7132 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_createUserStatement7146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NOSUPERUSER_in_createUserStatement7152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterUserStatement7197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_USER_in_alterUserStatement7199 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000120000000000L});
	public static final BitSet FOLLOW_username_in_alterUserStatement7203 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000040000010L});
	public static final BitSet FOLLOW_K_WITH_in_alterUserStatement7215 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_userPassword_in_alterUserStatement7217 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_alterUserStatement7231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NOSUPERUSER_in_alterUserStatement7245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropUserStatement7291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_USER_in_dropUserStatement7293 = new BitSet(new long[]{0x0000000000400000L,0x0000000000001000L,0x0000120000000000L});
	public static final BitSet FOLLOW_K_IF_in_dropUserStatement7296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropUserStatement7298 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000120000000000L});
	public static final BitSet FOLLOW_username_in_dropUserStatement7306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listUsersStatement7331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_K_USERS_in_listUsersStatement7333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createRoleStatement7367 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_K_ROLE_in_createRoleStatement7369 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB969B5EL,0x000013008F61D3FFL});
	public static final BitSet FOLLOW_K_IF_in_createRoleStatement7372 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createRoleStatement7374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_createRoleStatement7376 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000013008F61D3FFL});
	public static final BitSet FOLLOW_userOrRoleName_in_createRoleStatement7384 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_WITH_in_createRoleStatement7394 = new BitSet(new long[]{0x0000000000000000L,0x0004400100000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_roleOptions_in_createRoleStatement7396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterRoleStatement7440 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_K_ROLE_in_alterRoleStatement7442 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000013008F61D3FFL});
	public static final BitSet FOLLOW_userOrRoleName_in_alterRoleStatement7446 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterRoleStatement7456 = new BitSet(new long[]{0x0000000000000000L,0x0004400100000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_roleOptions_in_alterRoleStatement7458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropRoleStatement7502 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_K_ROLE_in_dropRoleStatement7504 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB969B5EL,0x000013008F61D3FFL});
	public static final BitSet FOLLOW_K_IF_in_dropRoleStatement7507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropRoleStatement7509 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000013008F61D3FFL});
	public static final BitSet FOLLOW_userOrRoleName_in_dropRoleStatement7517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listRolesStatement7557 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_K_ROLES_in_listRolesStatement7559 = new BitSet(new long[]{0x0000000000000002L,0x0000110000000000L});
	public static final BitSet FOLLOW_K_OF_in_listRolesStatement7569 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000013008F61D3FFL});
	public static final BitSet FOLLOW_roleName_in_listRolesStatement7571 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_NORECURSIVE_in_listRolesStatement7584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleOption_in_roleOptions7615 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_roleOptions7619 = new BitSet(new long[]{0x0000000000000000L,0x0004400100000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_roleOption_in_roleOptions7621 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_PASSWORD_in_roleOption7643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_195_in_roleOption7645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_roleOption7649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_OPTIONS_in_roleOption7660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_195_in_roleOption7662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_mapLiteral_in_roleOption7666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_roleOption7677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_195_in_roleOption7679 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BOOLEAN_in_roleOption7683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LOGIN_in_roleOption7694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_195_in_roleOption7696 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BOOLEAN_in_roleOption7700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PASSWORD_in_userPassword7722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_userPassword7726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_cident7757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_cident7782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_cident7801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ident7827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_ident7852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_ident7871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_fident7896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_fident7921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_fident7940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_noncol_ident7966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_noncol_ident7991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_noncol_ident8010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_keyspaceName8043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_indexName8077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_190_in_indexName8080 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_idxName_in_indexName8084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_columnFamilyName8116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_190_in_columnFamilyName8119 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000003008F61D3FFL});
	public static final BitSet FOLLOW_cfName_in_columnFamilyName8123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_noncol_ident_in_userTypeName8148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_190_in_userTypeName8150 = new BitSet(new long[]{0x0011A80218400000L,0x9A3E4283BB060B4EL,0x000002000261901EL});
	public static final BitSet FOLLOW_non_type_ident_in_userTypeName8156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleName_in_userOrRoleName8188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ksName8211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_ksName8236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_ksName8255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_ksName8265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_cfName8287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_cfName8312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_cfName8331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_cfName8341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_idxName8363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_idxName8388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_idxName8407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_idxName8417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_roleName8439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_roleName8464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_roleName8480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_roleName8499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_roleName8509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_constant8534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_constant8546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant8565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_constant8586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DURATION_in_constant8605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UUID_in_constant8623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEXNUMBER_in_constant8645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_188_in_constant8663 = new BitSet(new long[]{0x0000000000000000L,0x0000004000010000L});
	public static final BitSet FOLLOW_set_in_constant8672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_202_in_mapLiteral8701 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000C40L});
	public static final BitSet FOLLOW_term_in_mapLiteral8719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_191_in_mapLiteral8721 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_mapLiteral8725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_187_in_mapLiteral8731 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_mapLiteral8735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_191_in_mapLiteral8737 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_mapLiteral8741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_mapLiteral8757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_191_in_setOrMapLiteral8781 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_setOrMapLiteral8785 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_setOrMapLiteral8801 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_setOrMapLiteral8805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_191_in_setOrMapLiteral8807 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_setOrMapLiteral8811 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_setOrMapLiteral8846 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_setOrMapLiteral8850 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_198_in_collectionLiteral8884 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000540L});
	public static final BitSet FOLLOW_term_in_collectionLiteral8902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_187_in_collectionLiteral8908 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_collectionLiteral8912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_collectionLiteral8928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_202_in_collectionLiteral8938 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_collectionLiteral8942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8800000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_setOrMapLiteral_in_collectionLiteral8946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_collectionLiteral8951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_202_in_collectionLiteral8969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_collectionLiteral8971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_202_in_usertypeLiteral9015 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_fident_in_usertypeLiteral9019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_191_in_usertypeLiteral9021 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_usertypeLiteral9025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_187_in_usertypeLiteral9031 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_fident_in_usertypeLiteral9035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_191_in_usertypeLiteral9037 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_usertypeLiteral9041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_usertypeLiteral9048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_tupleLiteral9085 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_tupleLiteral9089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_tupleLiteral9095 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_tupleLiteral9099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_tupleLiteral9106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_value9129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionLiteral_in_value9151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usertypeLiteral_in_value9164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleLiteral_in_value9179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NULL_in_value9195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_191_in_value9219 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_noncol_ident_in_value9223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_value9234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_intValue9274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_191_in_intValue9288 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_noncol_ident_in_intValue9292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_intValue9303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keyspaceName_in_functionName9337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_190_in_functionName9339 = new BitSet(new long[]{0x5077AB8A18400000L,0x9A3E4283BA168B5EL,0x000002000F619BFFL});
	public static final BitSet FOLLOW_allowedFunctionName_in_functionName9345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_allowedFunctionName9372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_allowedFunctionName9406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_function_keyword_in_allowedFunctionName9434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TOKEN_in_allowedFunctionName9444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COUNT_in_allowedFunctionName9476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_function9523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_function9525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_184_in_function9527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_function9557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_function9559 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_functionArgs_in_function9563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_184_in_function9565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_functionArgs9598 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_functionArgs9604 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_functionArgs9608 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_value_in_term9636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_term9673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_term9705 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_term9709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_184_in_term9711 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_term9715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_columnOperation9738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x6400000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_columnOperationDifferentiator_in_columnOperation9740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_195_in_columnOperationDifferentiator9759 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_normalColumnOperation_in_columnOperationDifferentiator9761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_shorthandColumnOperation_in_columnOperationDifferentiator9770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_198_in_columnOperationDifferentiator9779 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_columnOperationDifferentiator9783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_columnOperationDifferentiator9785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_collectionColumnOperation_in_columnOperationDifferentiator9787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_190_in_columnOperationDifferentiator9796 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_fident_in_columnOperationDifferentiator9800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_udtColumnOperation_in_columnOperationDifferentiator9802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_normalColumnOperation9823 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_185_in_normalColumnOperation9826 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation9830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation9851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1200000000000000L});
	public static final BitSet FOLLOW_set_in_normalColumnOperation9855 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_normalColumnOperation9865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation9883 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_INTEGER_in_normalColumnOperation9887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_shorthandColumnOperation9915 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_shorthandColumnOperation9925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_195_in_collectionColumnOperation9951 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_collectionColumnOperation9955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_195_in_udtColumnOperation9981 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_udtColumnOperation9985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_columnCondition10018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x4040000000000000L,0x000000000000007EL});
	public static final BitSet FOLLOW_relationType_in_columnCondition10032 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_columnCondition10036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition10050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8080010000000000L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition10068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition10088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_198_in_columnCondition10116 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_columnCondition10120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_columnCondition10122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0040000000000000L,0x000000000000003EL});
	public static final BitSet FOLLOW_relationType_in_columnCondition10140 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_columnCondition10144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition10162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8080010000000000L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition10184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition10208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_190_in_columnCondition10254 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_fident_in_columnCondition10258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0040000000000000L,0x000000000000003EL});
	public static final BitSet FOLLOW_relationType_in_columnCondition10276 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_columnCondition10280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition10298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8080010000000000L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition10320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition10344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_properties10406 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AND_in_properties10410 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_property_in_properties10412 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_noncol_ident_in_property10435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_195_in_property10437 = new BitSet(new long[]{0x5877BB8A18910840L,0x9A3E42C3BB978B5EL,0x100090008F61D3FFL});
	public static final BitSet FOLLOW_propertyValue_in_property10441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_noncol_ident_in_property10453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_195_in_property10455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_mapLiteral_in_property10459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_propertyValue10484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_propertyValue10506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_195_in_relationType10529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_193_in_relationType10540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_194_in_relationType10551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_196_in_relationType10561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_197_in_relationType10572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_182_in_relationType10582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x000000000000003EL});
	public static final BitSet FOLLOW_relationType_in_relation10608 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_relation10612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10624 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_LIKE_in_relation10626 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_relation10630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_K_IS_in_relation10644 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_NOT_in_relation10646 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_NULL_in_relation10648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TOKEN_in_relation10658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation10662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x000000000000003EL});
	public static final BitSet FOLLOW_relationType_in_relation10666 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_relation10670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_K_IN_in_relation10692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000010000000000L});
	public static final BitSet FOLLOW_inMarker_in_relation10696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_K_IN_in_relation10718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_singleColumnInValues_in_relation10722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10742 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_K_CONTAINS_in_relation10744 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_K_KEY_in_relation10749 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_relation10765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_198_in_relation10779 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_relation10783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_relation10785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x000000000000003EL});
	public static final BitSet FOLLOW_relationType_in_relation10789 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_relation10793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation10805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0040000000000000L,0x000000000000003EL});
	public static final BitSet FOLLOW_K_IN_in_relation10815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8080010000000000L});
	public static final BitSet FOLLOW_183_in_relation10829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_184_in_relation10831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarkerForTuple_in_relation10863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfTupleLiterals_in_relation10897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfMarkersForTuples_in_relation10931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationType_in_relation10973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_tupleLiteral_in_relation10977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationType_in_relation11003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000010000000000L});
	public static final BitSet FOLLOW_markerForTuple_in_relation11007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_relation11037 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x008002008F61DBFFL});
	public static final BitSet FOLLOW_relation_in_relation11039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_184_in_relation11042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_inMarker11063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_191_in_inMarker11073 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_noncol_ident_in_inMarker11077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_tupleOfIdentifiers11109 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers11113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_tupleOfIdentifiers11118 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers11122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_tupleOfIdentifiers11128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_singleColumnInValues11158 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x918093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_singleColumnInValues11166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_singleColumnInValues11171 = new BitSet(new long[]{0x5877BB8A18D10840L,0x9A3E4AC3BB978B5EL,0x908093008F61DBFFL,0x0000000000000440L});
	public static final BitSet FOLLOW_term_in_singleColumnInValues11175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_singleColumnInValues11184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_tupleOfTupleLiterals11214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals11218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_tupleOfTupleLiterals11223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals11227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_tupleOfTupleLiterals11233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_markerForTuple11254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_191_in_markerForTuple11264 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_noncol_ident_in_markerForTuple11268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_tupleOfMarkersForTuples11300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000010000000000L});
	public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples11304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_187_in_tupleOfMarkersForTuples11309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000010000000000L});
	public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples11313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0900000000000000L});
	public static final BitSet FOLLOW_184_in_tupleOfMarkersForTuples11319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_inMarkerForTuple11340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_191_in_inMarkerForTuple11350 = new BitSet(new long[]{0x5877BB8A18400000L,0x9A3E4283BB968B5EL,0x000002008F61D3FFL});
	public static final BitSet FOLLOW_noncol_ident_in_inMarkerForTuple11354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_native_type_in_comparatorType11379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collection_type_in_comparatorType11395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_type_in_comparatorType11407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_userTypeName_in_comparatorType11423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FROZEN_in_comparatorType11435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_193_in_comparatorType11437 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_comparatorType11441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_196_in_comparatorType11443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_comparatorType11461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ASCII_in_native_type11490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BIGINT_in_native_type11504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BLOB_in_native_type11517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BOOLEAN_in_native_type11532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COUNTER_in_native_type11544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DECIMAL_in_native_type11556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DOUBLE_in_native_type11568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DURATION_in_native_type11581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FLOAT_in_native_type11594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INET_in_native_type11608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INT_in_native_type11623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SMALLINT_in_native_type11639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TEXT_in_native_type11650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_native_type11665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TINYINT_in_native_type11675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_UUID_in_native_type11687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VARCHAR_in_native_type11702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VARINT_in_native_type11714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIMEUUID_in_native_type11727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DATE_in_native_type11738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIME_in_native_type11753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MAP_in_collection_type11781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_193_in_collection_type11784 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_collection_type11788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_collection_type11790 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_collection_type11794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_196_in_collection_type11796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_collection_type11814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_193_in_collection_type11816 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_collection_type11820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_196_in_collection_type11822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SET_in_collection_type11840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_193_in_collection_type11843 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_collection_type11847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_196_in_collection_type11849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TUPLE_in_tuple_type11880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_193_in_tuple_type11882 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_tuple_type11897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_187_in_tuple_type11902 = new BitSet(new long[]{0x5877BB8A18400000L,0xDA3E4283BB968B5EL,0x000012008F61D3FFL});
	public static final BitSet FOLLOW_comparatorType_in_tuple_type11906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_196_in_tuple_type11918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_username11937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_username11945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_username11953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_mbean11972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_non_type_ident11997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_non_type_ident12028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basic_unreserved_keyword_in_non_type_ident12053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEY_in_non_type_ident12065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_function_keyword_in_unreserved_keyword12108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_unreserved_keyword12124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basic_unreserved_keyword_in_unreserved_function_keyword12175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_native_type_in_unreserved_function_keyword12187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_basic_unreserved_keyword12225 = new BitSet(new long[]{0x0000000000000002L});
}
