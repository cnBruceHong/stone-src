package stone.ast;

import stone.Token;

/**
 * Created by Bruce on 15/12/13.
 */
public class NumberLiteral extends ASTLeaf {
    public NumberLiteral(Token token) {
        super(token);
    }
    public int value() {
        return token().getLineNumber();
    }
}
