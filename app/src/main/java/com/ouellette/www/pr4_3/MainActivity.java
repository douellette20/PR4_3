package com.ouellette.www.pr4_3;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random r = new Random();

        final ImageView[] dice = new ImageView[]{(ImageView)findViewById(R.id.d1), (ImageView)findViewById(R.id.d2),
                (ImageView)findViewById(R.id.d3), (ImageView)findViewById(R.id.d4), (ImageView)findViewById(R.id.d5),
                (ImageView)findViewById(R.id.d6)};

        final int[] ImageList = new int[]{R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six};

        Button b = (Button)findViewById(R.id.roll);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(ImageView i : dice)
                    i.setImageResource(ImageList[r.nextInt(ImageList.length)]);
            }
        });
    }
}
