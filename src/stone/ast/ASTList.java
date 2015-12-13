package stone.ast;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Bruce on 15/12/13.
 */
public class ASTList extends ASTree {
    protected List<ASTree> children;

    public ASTList(List<ASTree> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('(');
        String sep = "";
        for (ASTree t: children) {
            builder.append(sep);
            sep = "";
            builder.append(t.toString());
        }
        return builder.append(')').toString();
    }

    @Override
    public ASTree child(int i) {
        return  children.get(i);
    }

    @Override
    public int numChildren() {
        return children.size();
    }

    @Override
    public Iterator<ASTree> children() {
        return children.iterator();
    }

    /*
    * 返回一个用于表示抽象语法树节点在程序内所处位置的字符串
    * */
    @Override
    public String location() {
        for (ASTree t: children) {
            String s = t.location();
            if (s != null) {
                return s;
            }
        }
        return null;
    }
}
