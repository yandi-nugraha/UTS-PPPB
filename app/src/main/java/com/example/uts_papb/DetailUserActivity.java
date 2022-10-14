package com.example.uts_papb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DetailUserActivity extends AppCompatActivity {

    EditText tglLahirEditText;
    Spinner spinner;
    Button simpanBtn;

    public static final String CATEGORY_EXTRA = "CATEGORY_KEY";
    public static final String AGE_EXTRA = "AGE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_user);

        tglLahirEditText = findViewById(R.id.tglLahir_editText);
        spinner = findViewById(R.id.spinner);
        simpanBtn = findViewById(R.id.simpan_btn);

        tglLahirEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePicker();
            }
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        simpanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNewsActivity(view);

                String date = tglLahirEditText.getText().toString();
                String year = date.substring(date.length() - 4);
                int age = (2022 - Integer.parseInt(year));
                String category = spinner.getSelectedItem().toString();

                Intent intent = new Intent(view.getContext(), NewsActivity.class);
                intent.putExtra(AGE_EXTRA, String.valueOf(age));
                intent.putExtra(CATEGORY_EXTRA, category);
                view.getContext().startActivity(intent);
            }
        });
    }

    public void showDatePicker() {
        DialogFragment dateFragment = new DatePickerFragment();
        dateFragment.show(getSupportFragmentManager(), "date-picker");
    }

    public void processDatePickerResult(int day, int month, int year) {
        String day_string = Integer.toString(day);
        String month_string = Integer.toString(month);
        String year_string = Integer.toString(year);
        String dateMessage = day_string + "-" + month_string + "-" + year_string;
        tglLahirEditText.setText(dateMessage);
    }

    public void showNewsActivity(View view) {
        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }
}