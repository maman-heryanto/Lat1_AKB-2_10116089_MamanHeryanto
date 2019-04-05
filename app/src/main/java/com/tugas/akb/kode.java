package com.tugas.akb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class kode extends AppCompatActivity {

   private EditText tkode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode);

        tkode= (EditText) findViewById(R.id.kode);
        Button btnm = (Button) findViewById(R.id.btnmasuk);
        btnm.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String kode = tkode.getText().toString();

                if (kode.equals("")) {
                    tkode.setError("Kode Tidak Boleh Kosong");
                }else {
                    startActivity(new Intent(kode.this, inputdata.class));
                }
            }
        });
    }
}
