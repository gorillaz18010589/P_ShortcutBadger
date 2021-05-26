package com.example.p_shortcutbadger;
//顯示通知未讀紅點設計
//引用    implementation 'com.allenliu.badgeview:library:1.1.1'
//https://github.com/AlexLiuSheng/BadgeView
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.allenliu.badgeview.BadgeFactory;
import com.allenliu.badgeview.BadgeView;



public class MainActivity extends AppCompatActivity {
    private ImageButton imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setBadger();
    }

    private void setBadger() {
        imageView = findViewById(R.id.imgIcon);
        BadgeFactory.create(this)
                .setTextColor(Color.WHITE)
                .setWidthAndHeight(25,25)
                .setBadgeBackground(Color.RED)
                .setTextSize(10)
                .setBadgeGravity(Gravity.RIGHT|Gravity.TOP)
                .setMargin(0,10,10,0)
                .setBadgeCount(20)
                .setShape(BadgeView.SHAPE_CIRCLE)
                .setSpace(10,10)
                .bind(imageView);

    }
}