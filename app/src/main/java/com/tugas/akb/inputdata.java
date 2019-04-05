package com.tugas.akb;

import android.app.assist.AssistStructure;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class inputdata extends AppCompatActivity {

    private EditText tnama;
    private EditText tumur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputdata);

        tnama = (EditText) findViewById(R.id.editText2);
        tumur = (EditText) findViewById(R.id.editText4);

        Button btninput = (Button) findViewById(R.id.btninputdata);
        btninput.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String editText2 = tnama.getText().toString();
                String editText4 = tumur.getText().toString();

                if (editText2.equals("")) {
                    tnama.setError("Nama Tidak Boleh Kosong!");
                }else if (editText4.equals("")){
                    tumur.setError("Umur Tidak Boleh Kosong!");
                }else{
                    startActivity(new Intent(inputdata.this, EndActivity.class));
                }


            }
        });
    }
}
