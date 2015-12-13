package stone.ast;

import stone.Token;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 抽象语法树 - 叶节点类
 * Created by Bruce on 15/12/13.
 */
public class ASTLeaf extends ASTree {
    private static ArrayList<ASTree> empty = new ArrayList<ASTree>();
    protected Token token;

    public ASTLeaf(Token token) {
        this.token = token;
    }

    /*
    * 返回第i个节点
    * */
    @Override
    public ASTree child(int i) {
        throw new IndexOutOfBoundsException();
    }

    /*
    * 返回子节点的个数(没有子节点则返回0)
    * */
    @Override
    public int numChildren() {
        return 0;
    }

    /*
    * 返回一个用于遍历子节点的iterator
    * */
    @Override
    public Iterator<ASTree> children() {
        return empty.iterator();
    }

    @Override
    public String toString() {
        return token.getText();
    }

    @Override
    public String location() {
        return "at line " + token().getLineNumber();
    }

    public Token token() {
        return token;
    }
}
