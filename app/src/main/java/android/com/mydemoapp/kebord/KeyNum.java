package android.com.mydemoapp.kebord;

import java.io.Serializable;

/**
 * Created by TS on 2017/12/12.
 */

public class KeyNum  implements Serializable{
    private int type;
    private int num;
    private String letters;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }
}
