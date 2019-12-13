package com.example.uts_progmob;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Gallery;
import android.widget.Toast;

public class DataMahasiswa extends AppCompatActivity {
    EditText nama, nim, alamat, email, foto;
    Button simpan, upload;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mahasiswa);

        setTitle("Tambah Data Mahasiswa");

        nama = (EditText) findViewById(R.id.editTxtNamaMhs);
        nim = (EditText) findViewById(R.id.editTxtNimMhs);
        alamat = (EditText) findViewById(R.id.editTxtAlamatMhs);
        email = (EditText) findViewById(R.id.editTxtEmailMhs);
        foto = (EditText) findViewById(R.id.editTxtFotoMhs);
        simpan = (Button) findViewById(R.id.btnSimpanAddMhs);
        upload = (Button) findViewById(R.id.btnUploadMhs);


        final Button upload = findViewById(R.id.btnUploadMhs);
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                String[] mimeTypes = {"image/jpeg"};
                intent.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes);
                /*startActivityForResult(intent, GALLERY_REQUEST_CODE);*/
            }
        });

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nama.getText().toString().length()==0){
                    nama.setError("silahkan mengisi Nama Mahasiswa");
                }else if(nim.getText().toString().length()==0){
                    nim.setError("silahkan mengisi NIM Mahasiswa");
                }else if (alamat.getText().toString().length()==0){
                    alamat.setError("silahkan mengisi Alamat Mahasiswa");
                }else if (email.getText().toString().length()==0){
                    email.setError("silahkan mengisi Email Mahasiswa");
                }else if (foto.getText().toString().length()==0){
                    foto.setError("silahkan mengisi Foto Mahasiswa");
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(DataMahasiswa.this);
                    builder.setMessage("Apakah ingin menyimpan data?").setNegativeButton("Batal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            Toast.makeText(DataMahasiswa.this, "Tidak jadi menyimpan", Toast.LENGTH_SHORT).show();
                        }
                    })
                            .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int which) {
                                    Intent intent = new Intent(DataMahasiswa.this, MenuMahasiswa.class);
                                    startActivity(intent);
                                    Toast.makeText(DataMahasiswa.this,"Berhasil menyimpan", Toast.LENGTH_LONG).show();
                                }
                            });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }

            }
        });


        /*Button simpanButton = (Button) findViewById(R.id.btnSimpanAddMhs);
        simpanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DataMahasiswa.this);
                builder.setMessage("Apakah ingin menyimpan data?").setNegativeButton("Batal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Toast.makeText(DataMahasiswa.this, "Tidak jadi menyimpan", Toast.LENGTH_SHORT).show();
                    }
                })
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Intent intent = new Intent(DataMahasiswa.this, MenuMahasiswa.class);
                        startActivity(intent);
                        Toast.makeText(DataMahasiswa.this,"Berhasil menyimpan", Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });*/

    }
}
