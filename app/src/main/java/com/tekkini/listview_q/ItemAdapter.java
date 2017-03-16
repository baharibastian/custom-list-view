package com.tekkini.listview_q;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Spiderman on 2017-03-15.
 */

public class ItemAdapter extends ArrayAdapter<ItemData>{

    Context context;
    ArrayList<ItemData> values;
    public ItemAdapter(Context context, ArrayList<ItemData> values) {
        super(context, R.layout.list_item, values);
        this.context=context;
        this.values=values;
    }

}
