package com.javapie.loginstylish;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        TextView SignUp=findViewById(R.id.signup1);

        ImageView image=findViewById(R.id.insta_link);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_insta=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com"));
                startActivity(intent_insta);
            }
        });

        ImageView image1=findViewById(R.id.fb);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_fb=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fb.com"));
                startActivity(intent_fb);
            }
        });

        ImageView image2=findViewById(R.id.google);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_google=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent_google);
            }
        });

    }
}
