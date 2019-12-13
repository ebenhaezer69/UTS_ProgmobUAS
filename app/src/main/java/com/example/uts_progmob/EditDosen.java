package com.example.uts_progmob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditDosen extends AppCompatActivity {
    EditText nama, nidn, alamat, email, gelar, foto;
    Button simpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_dosen);

        setTitle("Edit Data Dosen");

        nama = (EditText) findViewById(R.id.editNamaDsn);
        nidn = (EditText) findViewById(R.id.editNidnDsn);
        alamat = (EditText) findViewById(R.id.editAlamatDsn);
        email = (EditText) findViewById(R.id.editEmailDsn);
        gelar = (EditText) findViewById(R.id.editGelarDsn);
        foto = (EditText) findViewById(R.id.editFotoDsn);
        simpan = (Button) findViewById(R.id.simpanBtnEdit);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nama.getText().toString().length()==0){
                    nama.setError("silahkan mengisi Nama Dosen");
                }else if (nidn.getText().toString().length()==0){
                    nidn.setError("silahkan mengisi NIDN Dosen");
                }else if (alamat.getText().toString().length()==0){
                    nidn.setError("silahkan mengisi Alamat Dosen");
                }else if (gelar.getText().toString().length()==0){
                    gelar.setError("silahkan mengisi Gelar Dosen");
                }else if (email.getText().toString().length()==0) {
                    email.setError("silahkan mengisi Email Dosen");
                }else if (foto.getText().toString().length()==0){
                    foto.setError("silahkan mengisi Foto Dosenn");
                }else{
                    Toast.makeText(getApplicationContext(),"Berhasil Diubah",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
