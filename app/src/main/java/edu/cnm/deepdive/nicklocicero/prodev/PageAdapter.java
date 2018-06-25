package edu.cnm.deepdive.nicklocicero.prodev;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class PageAdapter extends ArrayAdapter<Page> {

  private Context mContext;
  private List<Page> pagesList;

  public PageAdapter(@NonNull Context context, List<Page> list) {
    super(context, 0 , list);
    mContext = context;
    pagesList = list;
  }

  @NonNull
  @Override
  public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

    View listItem = convertView;

    if(listItem == null) {
      listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item_page, parent, false);
    }

    Page currentPage = pagesList.get(position);

    TextView title = (TextView) listItem.findViewById(R.id.page_title);
    title.setText(currentPage.getTitleResId());

    TextView date = (TextView) listItem.findViewById(R.id.page_date);
    date.setText(currentPage.getDateResId());

    ImageView image = (ImageView)listItem.findViewById(R.id.page_image);
    image.setImageResource(currentPage.getImageId());

    TextView text = (TextView) listItem.findViewById(R.id.page_text);
    text.setText(currentPage.getTextResId());

    return listItem;
  }
}
