package com.example.myapplicationuts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SiswaActivity extends AppCompatActivity {

    private Button btnOk;
    private EditText nisInput;
    private EditText namaInput;
    private EditText alamatInput;
    private EditText hpInput;
    private EditText keteranganInput;
    private String nis, nama, alamat, hp, keterangan, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa);
        nisInput = findViewById(R.id.input_nis);
        namaInput = findViewById(R.id.input_nama);
        alamatInput = findViewById(R.id.input_alamat);
        hpInput = findViewById(R.id.input_hp);
        keteranganInput = findViewById(R.id.input_keterangan);

        btnOk = findViewById(R.id.button11);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }

    private void showDialog(){
        nis = nisInput.getText().toString();
        nama = namaInput.getText().toString();
        alamat = alamatInput.getText().toString();
        hp = hpInput.getText().toString();
        keterangan = keteranganInput.getText().toString();
        hasil = "NIS : " + nis + "\n" + "Nama : " + nama + "\n" + "Alamat : " + alamat +"\n" + "Handphone : " + hp + "\n" + "Keterangan : " + keterangan;

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog
        alertDialogBuilder.setTitle("Biodata Siswa!");

        // set pesan dari dialog
        alertDialogBuilder
                .setMessage(hasil)
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // do something
                        dialogInterface.cancel();
                    }
                });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }
}
