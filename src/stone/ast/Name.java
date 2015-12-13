package stone.ast;

import stone.Token;

/**
 * Created by Bruce on 15/12/13.
 */
public class Name extends ASTLeaf {
    public Name(Token token) {
        super(token);
    }

    public String name() {
        return token().getText();
    }
}
