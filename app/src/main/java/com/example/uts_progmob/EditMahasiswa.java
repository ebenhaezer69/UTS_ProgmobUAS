package com.example.uts_progmob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditMahasiswa extends AppCompatActivity {
    EditText nama,nim,alamat,email,foto;
    Button simpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_mahasiswa);

        setTitle("Edit Mahasiswa");

        nama = (EditText) findViewById(R.id.editNamaMhs);
        nim = (EditText) findViewById(R.id.editNimMhs);
        alamat = (EditText) findViewById(R.id.editAlamatMhs);
        email = (EditText) findViewById(R.id.editEmailMhs);
        foto = (EditText) findViewById(R.id.editFotoMhs);
        simpan = (Button) findViewById(R.id.btnUbahMhs);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nama.getText().toString().length()==0){
                    nama.setError("silahkan mengisi Nama Mahasiswa");
                }else if (nim.getText().toString().length()==0){
                    nim.setError("silahkan mengisi NIM Mahasiswa");
                }else if (alamat.getText().toString().length()==0){
                    alamat.setError("silahkan mengsisi Alamat Mahasiswa");
                } else if (email.getText().toString().length()==0){
                    email.setText("silahkan mengisi Email Mahasiswa");
                } else if (foto.getText().toString().length()==0){
                    foto.setError("silahkan mengisi Foto Mahasiswa");
                } else {
                    Toast.makeText(getApplicationContext(),"Berhasil Diubah",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
