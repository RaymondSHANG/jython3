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

public class Str extends exprType {
    private Object s;
    public Object getInternalS() {
        return s;
    }
    public Object getS() {
        return s;
    }
    public void setS(Object s) {
        this.s = AstAdapter.to_string(s);
    }


    private final static String[] fields = new String[] {"s"};
    public String[] get_fields() { return fields; }

    public Str() {}
    public Str(Object s) {
        setS(s);
    }

    public Str(Token token, Object s) {
        super(token);
        this.s = s;
    }

    public Str(Integer ttype, Token token, Object s) {
        super(ttype, token);
        this.s = s;
    }

    public Str(PythonTree tree, Object s) {
        super(tree);
        this.s = s;
    }

    public String toString() {
        return "Str";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Str(");
        sb.append("s=");
        sb.append(dumpThis(s));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitStr(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
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
