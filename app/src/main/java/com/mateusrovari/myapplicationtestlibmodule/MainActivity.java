package com.mateusrovari.myapplicationtestlibmodule;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mateusrovari.myfirstbutton.MainActivityModule;
import com.mateusrovari.myfirstbutton.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    private Button btnOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpen = findViewById(R.id.btn_open);

        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MainActivity.this,
                        MainActivityModule.class), 132);
//                ToasterMessage.customToast(MainActivity.this, "");
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

//        if (data == null) return;
//        if (resultCode != RESULT_OK) return;
//
//
//        if (requestCode == 132) {

            Toast.makeText(this, "back to main", Toast.LENGTH_SHORT).show();
//            key = data.getStringExtra(RESULT_TO_RECEIVE_KEY);
//            keyType = data.getStringExtra(RESULT_TO_RECEIVE_KEY_TYPE);
//
//            tKeyName.setText(key);
//
//            validateDarkButton(ToReceiveActivity.this, true, btnNext);
//        }
    }
}