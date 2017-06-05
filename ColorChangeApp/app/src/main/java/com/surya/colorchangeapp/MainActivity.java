package com.surya.colorchangeapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    LinearLayout l1;
    int r,b,g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);

        l1=(LinearLayout)findViewById(R.id.LinearLayout);
        ColorDrawable viewColor = new ColorDrawable(l1.getDrawingCacheBackgroundColor());
        int colorId = viewColor.getColor();
        Color C = new Color();
        r= C.red(colorId);
        b= C.blue(colorId);
        g= C.green(colorId);
        final TextView t1 = (TextView)findViewById(R.id.textView);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r=r+15;
                l1.setBackgroundColor(Color.rgb(r,g,b));
                t1.setText("RED="+r+" BLUE="+b+" GREEN="+g);
                if (r>=255)r=0;
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=b+15;
                l1.setBackgroundColor(Color.rgb(r,g,b));
                t1.setText("RED="+r+" BLUE="+b+" GREEN="+g);
                if (b>=255)b=0;
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g=g+15;
                l1.setBackgroundColor(Color.rgb(r,g,b));
                t1.setText("RED="+r+" BLUE="+b+" GREEN="+g);
                if (g>=255)g=0;
            }
        });
    }

}
