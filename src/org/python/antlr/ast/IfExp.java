// Autogenerated AST node
package org.python.antlr.ast;
import java.util.ArrayList;
import org.python.antlr.AstAdapter;
import org.python.antlr.PythonTree;
import org.python.antlr.ListWrapper;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class IfExp extends exprType {
    private exprType test;
    public exprType getInternalTest() {
        return test;
    }
    public Object getTest() {
        return test;
    }
    public void setTest(Object test) {
        this.test = AstAdapter.to_expr(test);
    }

    private exprType body;
    public exprType getInternalBody() {
        return body;
    }
    public Object getBody() {
        return body;
    }
    public void setBody(Object body) {
        this.body = AstAdapter.to_expr(body);
    }

    private exprType orelse;
    public exprType getInternalOrelse() {
        return orelse;
    }
    public Object getOrelse() {
        return orelse;
    }
    public void setOrelse(Object orelse) {
        this.orelse = AstAdapter.to_expr(orelse);
    }


    private final static String[] fields = new String[] {"test", "body",
                                                          "orelse"};
    public String[] get_fields() { return fields; }

    public IfExp() {}
    public IfExp(Object test, Object body, Object orelse) {
        setTest(test);
        setBody(body);
        setOrelse(orelse);
    }

    public IfExp(Token token, exprType test, exprType body, exprType orelse) {
        super(token);
        this.test = test;
        addChild(test);
        this.body = body;
        addChild(body);
        this.orelse = orelse;
        addChild(orelse);
    }

    public IfExp(Integer ttype, Token token, exprType test, exprType body,
    exprType orelse) {
        super(ttype, token);
        this.test = test;
        addChild(test);
        this.body = body;
        addChild(body);
        this.orelse = orelse;
        addChild(orelse);
    }

    public IfExp(PythonTree tree, exprType test, exprType body, exprType
    orelse) {
        super(tree);
        this.test = test;
        addChild(test);
        this.body = body;
        addChild(body);
        this.orelse = orelse;
        addChild(orelse);
    }

    public String toString() {
        return "IfExp";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("IfExp(");
        sb.append("test=");
        sb.append(dumpThis(test));
        sb.append(",");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append("orelse=");
        sb.append(dumpThis(orelse));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitIfExp(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (test != null)
            test.accept(visitor);
        if (body != null)
            body.accept(visitor);
        if (orelse != null)
            orelse.accept(visitor);
    }

    private int lineno = -1;
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    public void setCol_offset(int num) {
        col_offset = num;
    }

}
