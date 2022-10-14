package com.example.uts_papb;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class News {
    String releaseDate;
    String title;
    String category;
    int img;
    String writer;
    String content;
    int minimumAge;

    public News(String releaseDate, String title, String category, int img, String writer, String content, int minimumAge) {
        this.releaseDate = releaseDate;
        this.title = title;
        this.category = category;
        this.img = img;
        this.writer = writer;
        this.content = content;
        this.minimumAge = minimumAge;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }
}
