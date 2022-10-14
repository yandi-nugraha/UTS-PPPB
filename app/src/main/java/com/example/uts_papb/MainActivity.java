package com.example.uts_papb;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username_editText);
        password = findViewById(R.id.password_editText);
        loginBtn = findViewById(R.id.login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("pakjoko") && password.getText().toString().equals("yangpentingcuan")) {
                    showDetailUserActivity(view);
                } else {
                    showAlertDialog();
                }
            }
        });
    }

    public void showDetailUserActivity(View view) {
        Intent intent = new Intent(this, DetailUserActivity.class);
        startActivity(intent);
    }

    public void showAlertDialog() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setMessage("Username atau Password yang Anda Masukan Salah!");
        alertDialog.setPositiveButton("Coba Lagi", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        alertDialog.show();
    }
}