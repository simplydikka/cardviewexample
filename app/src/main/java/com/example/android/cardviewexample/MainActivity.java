package com.example.android.cardviewexample;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ImageView mCardImage;
    private TextView mCardTitle;
    private TextView mCardDescription;
    boolean isEnable = false;
    private ImageButton ButtonStar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare the image, title and description in onCreate
        mCardDescription = (TextView) findViewById(R.id.cardDescription);
        mCardTitle = (TextView) findViewById(R.id.cardTitle);
        mCardImage = (ImageView) findViewById(R.id.cardImage);
        ButtonStar = (ImageButton) findViewById(R.id.heart);

        //creates and image resource and sets it to the ImageView
        int imageResource = getResources().getIdentifier("@drawable/icon", null, this.getPackageName());
        mCardImage.setImageResource(imageResource);

        //set the title to the text view
        mCardTitle.setText("А1:Опасен завой на дясно");

        //set the description to the text view
        mCardDescription.setText(getString(R.string.card_description_test));

        //creates and image resource and sets it to the ImageButton
        int imageButton = getResources().getIdentifier("@drawable/heartoff", null, this.getPackageName());
        ButtonStar.setImageResource(imageButton);
        ButtonStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEnable){
                    ButtonStar.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.heartoff));
                }else{
                    ButtonStar.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.hearton));
                }
                isEnable = !isEnable;
            }
        });
    }
}
