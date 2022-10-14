package com.example.uts_papb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailNewsActivity extends AppCompatActivity {

    ImageView imgNews;
    TextView txtCategory, txtReleaseDate, txtTitle, txtWriter, txtContent;
    String category, releaseDate, title, writer, content, img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_news);

        imgNews = findViewById(R.id.img_news1);
        txtCategory = findViewById(R.id.txt_category1);
        txtReleaseDate = findViewById(R.id.txt_releaseDate1);
        txtTitle = findViewById(R.id.txt_title1);
        txtWriter = findViewById(R.id.txt_writer1);
        txtContent = findViewById(R.id.txt_content1);

        Intent intent = getIntent();
        category = intent.getStringExtra(NewsAdapter.CATEGORY_EXTRA);
        releaseDate = intent.getStringExtra(NewsAdapter.RELEASEDATE_EXTRA);
        title = intent.getStringExtra(NewsAdapter.TITLE_EXTRA);
        writer = intent.getStringExtra(NewsAdapter.WRITER_EXTRA);
        content = intent.getStringExtra(NewsAdapter.CONTENT_EXTRA);
        img = intent.getStringExtra(NewsAdapter.IMG_EXTRA);

        imgNews.setImageResource(Integer.parseInt(img));
        txtCategory.setText(category);
        txtReleaseDate.setText(releaseDate);
        txtTitle.setText(title);
        txtWriter.setText(writer);
        txtContent.setText(content);
    }
}