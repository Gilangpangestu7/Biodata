package com.example.a13492;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    private Button btnTelpon, btnEmail, btnMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTelpon = findViewById(R.id.btnTelpon);

        btnTelpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "085329727224";
                Intent memanggil = new Intent(Intent.ACTION_DIAL);
                memanggil.setData(Uri.fromParts("tel", nomor, null));
                startActivity(memanggil);
            }
        });

        btnEmail = findViewById(R.id.btnEmail);

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "adityagilangpangestu7@gmail.com"));
                startActivity(intent);
            }
        });

        btnMaps = findViewById(R.id.btnMaps);
        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:?q=-6.979324575740062, 110.40966350622232");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

    }
}

