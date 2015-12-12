package stone;

/**
 * Created by Bruce on 15/12/11.
 */
public abstract class Token {
    public static final Token EOF = new Token(-1) {}; //文件的结束
    public static final String EOL = "\\n"; //行结束

    private int lineNumber;

    protected Token(int line) {
        lineNumber = line;
    }

    public int getLineNumber () { return lineNumber; }
    public boolean isIdentifier () { return false; }
    public boolean isNumber () { return false; }
    public boolean isString () { return false; }
    public int getNumber () { throw new StoneException("不是数字单词"); }
    public String getText () { return ""; }
}
