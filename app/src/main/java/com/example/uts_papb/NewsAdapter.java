package com.example.uts_papb;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private final ArrayList<News> values;
    private final LayoutInflater inflater;

    public static final String RELEASEDATE_EXTRA = "RELEASEDATE_KEY";
    public static final String TITLE_EXTRA = "TITLE_KEY";
    public static final String CATEGORY_EXTRA = "CATEGORY_KEY";
    public static final String WRITER_EXTRA = "WRITER_KEY";
    public static final String CONTENT_EXTRA = "CONTENT_KEY";
    public static final String IMG_EXTRA = "IMG_KEY";

    public NewsAdapter(Context context, ArrayList<News> values) {
        this.values = values;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_news, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.ViewHolder holder, int position) {
        News news = values.get(position);
        holder.txtReleaseDate.setText(news.releaseDate);
        holder.txtTitle.setText(news.title);
        holder.txtCategory.setText(news.category);
        holder.img.setImageResource(news.img);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailNewsActivity.class);
                intent.putExtra(RELEASEDATE_EXTRA, news.releaseDate);
                intent.putExtra(TITLE_EXTRA, news.title);
                intent.putExtra(CATEGORY_EXTRA, news.category);
                intent.putExtra(WRITER_EXTRA, news.writer);
                intent.putExtra(CONTENT_EXTRA, news.content);
                intent.putExtra(IMG_EXTRA, String.valueOf(news.img));
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtReleaseDate;
        TextView txtTitle;
        TextView txtCategory;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtReleaseDate = itemView.findViewById(R.id.txt_releaseDate);
            txtTitle = itemView.findViewById(R.id.txt_title);
            txtCategory = itemView.findViewById(R.id.txt_category);
            img = itemView.findViewById(R.id.img_news);
        }
    }
}
