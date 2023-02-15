package com.example.completequranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText etParah, etSurah;
    Button btnUrdu, btnEnglish, btnSindhi,btnHindi, btnPushto, btnRepo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etParah = findViewById(R.id.et_parah);
        etSurah = findViewById(R.id.et_surah);
        btnUrdu = findViewById(R.id.btn_urdu);
        btnEnglish = findViewById(R.id.btn_english);
        btnSindhi = findViewById(R.id.btn_sindhi);
        btnHindi = findViewById(R.id.btn_hindi);
        btnPushto = findViewById(R.id.btn_pushto);
        btnRepo = findViewById(R.id.btn_repo);

        btnUrdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String parah = etParah.getText().toString();
                String surah = etSurah.getText().toString();
                try{
                    if(parah != "")
                    {
                        int number = Integer.parseInt(parah);
                        if ((number < 1) || (number > 30))
                        {
                            Toast.makeText(MainActivity.this, "Invalid parah number!!! Enter parah number from 1-30", Toast.LENGTH_SHORT).show();
                        }
                        else {

                        }
                    }
                    else if (surah != "")
                    {
                        int number = Integer.parseInt(surah);
                        if ((number < 1) || (number > 114))
                        {
                            Toast.makeText(MainActivity.this, "Invalid surah number!!! Enter surah number from 1-114", Toast.LENGTH_SHORT).show();
                        }
                        else {

                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Enter fields first", Toast.LENGTH_SHORT).show();
                    }
                }catch(Exception ex){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String parah = etParah.getText().toString();
                String surah = etSurah.getText().toString();
                try{
                    if(parah != "")
                    {
                        int number = Integer.parseInt(parah);
                        if ((number < 1) || (number > 30))
                        {
                            Toast.makeText(MainActivity.this, "Invalid parah number!!! Enter parah number from 1-30", Toast.LENGTH_SHORT).show();
                        }
                        else {

                        }
                    }
                    else if (surah != "")
                    {
                        int number = Integer.parseInt(surah);
                        if ((number < 1) || (number > 114))
                        {
                            Toast.makeText(MainActivity.this, "Invalid surah number!!! Enter surah number from 1-114", Toast.LENGTH_SHORT).show();
                        }
                        else {

                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Enter fields first", Toast.LENGTH_SHORT).show();
                    }
                }catch(Exception ex){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnSindhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String parah = etParah.getText().toString();
                String surah = etSurah.getText().toString();
                try{
                    if(parah != "")
                    {
                        int number = Integer.parseInt(parah);
                        if ((number < 1) || (number > 30))
                        {
                            Toast.makeText(MainActivity.this, "Invalid parah number!!! Enter parah number from 1-30", Toast.LENGTH_SHORT).show();
                        }
                        else {

                        }
                    }
                    else if (surah != "")
                    {
                        int number = Integer.parseInt(surah);
                        if ((number < 1) || (number > 114))
                        {
                            Toast.makeText(MainActivity.this, "Invalid surah number!!! Enter surah number from 1-114", Toast.LENGTH_SHORT).show();
                        }
                        else {

                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Enter fields first", Toast.LENGTH_SHORT).show();
                    }
                }catch(Exception ex){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String parah = etParah.getText().toString();
                String surah = etSurah.getText().toString();
                try{
                    if(parah != "")
                    {
                        int number = Integer.parseInt(parah);
                        if ((number < 1) || (number > 30))
                        {
                            Toast.makeText(MainActivity.this, "Invalid parah number!!! Enter parah number from 1-30", Toast.LENGTH_SHORT).show();
                        }
                        else {

                        }
                    }
                    else if (surah != "")
                    {
                        int number = Integer.parseInt(surah);
                        if ((number < 1) || (number > 114))
                        {
                            Toast.makeText(MainActivity.this, "Invalid surah number!!! Enter surah number from 1-114", Toast.LENGTH_SHORT).show();
                        }
                        else {

                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Enter fields first", Toast.LENGTH_SHORT).show();
                    }
                }catch(Exception ex){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnPushto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String parah = etParah.getText().toString();
                String surah = etSurah.getText().toString();
                try{
                    if(parah != "")
                    {
                        int number = Integer.parseInt(parah);
                        if ((number < 1) || (number > 30))
                        {
                            Toast.makeText(MainActivity.this, "Invalid parah number!!! Enter parah number from 1-30", Toast.LENGTH_SHORT).show();
                        }
                        else {

                        }
                    }
                    else if (surah != "")
                    {
                        int number = Integer.parseInt(surah);
                        if ((number < 1) || (number > 114))
                        {
                            Toast.makeText(MainActivity.this, "Invalid surah number!!! Enter surah number from 1-114", Toast.LENGTH_SHORT).show();
                        }
                        else {

                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Enter fields first", Toast.LENGTH_SHORT).show();
                    }
                }catch(Exception ex){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnRepo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://github.com/masabahmed/QuranAppWithTranslation/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }
}