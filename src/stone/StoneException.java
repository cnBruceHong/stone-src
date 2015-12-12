package stone;

import stone.ast.ASTree;

/**
 * Created by Bruce on 15/12/11.
 */
public class StoneException extends  RuntimeException{
    public StoneException(String m) {super(m);}

    public StoneException(String m, ASTree t) {
//        super(m + " " + t.location());
    }
}
