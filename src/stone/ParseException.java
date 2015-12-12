package stone;

import java.io.IOException;

/**
 * Created by Bruce on 15/12/12.
 * 语法解析异常处理类
 */
public class ParseException extends Exception {
    public ParseException(Token t){
        this("",t);
    }

    public ParseException(String msg, Token t){
        super("语法错误:"+location(t));
    }

    private static String location(Token t) {
        if (t == Token.EOF) {
            return "最后一行";
        } else {
            return "\"" + t.getText() + "\" at line " + t.getLineNumber();
        }
    }

    public ParseException (IOException e) {
        super(e);
    }

    public ParseException (String msg) {
        super(msg);
    }
}
