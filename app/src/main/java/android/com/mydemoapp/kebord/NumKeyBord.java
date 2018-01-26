package android.com.mydemoapp.kebord;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TS on 2017/12/12.
 */

public class NumKeyBord extends RecyclerView {
    public NumKeyBord(Context context, AttributeSet attrs) {
        super(context, attrs);
        setLayoutManager(context);
    }

    public NumKeyBord(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setLayoutManager(context);
    }

    private void setLayoutManager(Context context) {
        GridLayoutManager layoutManager = new GridLayoutManager(context, 3);
        addItemDecoration(new GridDivider(context));
        setLayoutManager(layoutManager);
        getAdapter(context);
    }

    private void getAdapter(Context context) {
        List<KeyNum> list = dataget();
        KeyBordAdapter adapter = new KeyBordAdapter(context, list);
        setAdapter(adapter);
    }

    /**
     *数据组装
     */
    private List<KeyNum> dataget() {
        String[] strings = {"", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ","", "", ""};
        List<KeyNum> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            KeyNum keyNum = new KeyNum();
            if (i == 9) {
                keyNum.setType(1);
            } else if (i == 11) {
                keyNum.setType(2);
            } else if (i == 10) {
                keyNum.setNum(0);
                keyNum.setType(0);
            } else {
                keyNum.setNum(i + 1);
                keyNum.setType(0);
            }
            keyNum.setLetters(strings[i]);
            list.add(keyNum);
        }

        return list;
    }
}
