package edu.cnm.deepdive.nicklocicero.prodev;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  private ListView mPageView;
  private PageAdapter mAdapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mPageView = findViewById(R.id.pages_list);

    List<Page> mPagesList = new ArrayList<>();
    mPagesList.add(
        new Page(R.string.golden_circles_title,
            R.string.golden_circles_date,
            R.string.golden_circles_text,
            R.drawable.golden_circles));
    mPagesList.add(
        new Page(R.string.qualitative_quantitative_title,
            R.string.qualitative_quantitative_date,
            R.string.qualitative_quantitative_text,
            R.drawable.qualitative_quantitative));
    mPagesList.add(
        new Page(R.string.community_title,
            R.string.community_date,
            R.string.community_text,
            R.drawable.community));

    mAdapter = new PageAdapter(this, mPagesList);
    mPageView.setAdapter(mAdapter);

  }



//  private class PageView {
//    private Page mPage;
//    private TextView mTitleTextView;
//    private TextView mDateTextView;
//    private ImageView mImageView;
//    private TextView mTextView;
//
//    public PageView(Page page) {
//
//      mTitleTextView = (TextView) itemView.findViewById(R.id.page_title);
//      mDateTextView = (TextView) itemView.findViewById(R.id.page_date);
//      mImageView = (ImageView) itemView.findViewById(R.id.page_image);
//      mTextView = (TextView) itemView.findViewById(R.id.page_text);
//    }
//
//    public void bind(Page Page) {
//      mPage = Page;
//      mTitleTextView.setText(mPage.getTitleResId());
//      mDateTextView.setText(mPage.getDateResId());
//      mImageView.setImageResource(mPage.getImageId());
//      mTextView.setText(mPage.getTextResId());
//    }
//  }
//
//  private class PageAdapter extends ArrayAdapter<PageHolder> {
//
//    public PageAdapter(@NonNull Context context,
//        int resource, int textViewResourceId) {
//      super(context, resource, textViewResourceId);
//    }
//  }
}
