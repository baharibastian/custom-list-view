package com.tekkini.listview_q;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static com.tekkini.listview_q.R.id.imageItem;

/**
 * Created by Spiderman on 2017-03-15.
 */

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;

    public CustomListAdapter(Activity context, String[] itemname, Integer[] imgid) {
        super(context, R.layout.list_item, itemname);

        this.context = context;
        this.itemname = itemname;
        this.imgid = imgid;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item, null, true);

        TextView txtCategoryName = (TextView) rowView.findViewById(R.id.nameItem);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageItem);

        txtCategoryName.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        return rowView;

    }
}
