package android.com.mydemoapp;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.keybord);
        imageView.setOnClickListener(this);
        ClipDrawable drawable = (ClipDrawable) imageView.getBackground();
        drawable.setLevel(5000);
        TextView textView=new TextView(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.keybord:

                break;

        }
    }
}
