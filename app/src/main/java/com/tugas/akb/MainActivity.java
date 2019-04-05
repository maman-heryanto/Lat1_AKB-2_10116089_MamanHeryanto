package com.tugas.akb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    /*
    Nim     : 10116089
    Nama    : Maman Heryanto
    Kelas   : AKB-2

    Version 0.1
    Version 0.2
    Version 0.3

    CHANGE LOG (03-04-2019)Rabu 19.00
    1.Membuat Tampilan Utama/Main

     CHANGE LOG (04-04-2019)Rabu 20.30
    1.Membetulkan Emulator Error

    CHANGE LOG (04-04-2019)kamis 10.00
    1.Membuat Tampilan Kode Dan berpindah layout(Activity)

    CHANGE LOG (04-04-2019)kamis 11.30
    1.Membetulkan Emulator Error

    CHANGE LOG (04-04-2019)Jumat 13.00
    1.Membuat Tampilan InpuData Dan berpindah layout(Activity)

    CHANGE LOG (04-04-2019)Jumat 14.30
    1.Membuat Tampilan Selamat/End

    CHANGE LOG (04-04-2019)Jumat 19.30
    1.Membuat Validasi semua layout(Activity)



    */


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, kode.class));
            }
        });

    }



}
