package com.example.manson.listviewtest;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private List<ListViewItem> listViewData = new ArrayList<ListViewItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        listViewAdapter adapter = new listViewAdapter(MainActivity.this,R.layout.listview_item,listViewData);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initData(){
        listViewData.add((new ListViewItem(R.drawable.one, "apple")));
        listViewData.add((new ListViewItem(R.drawable.one, "banana")));
        listViewData.add((new ListViewItem(R.drawable.one, "orange")));
        listViewData.add((new ListViewItem(R.drawable.one, "watermalon")));
        listViewData.add((new ListViewItem(R.drawable.one, "pear")));
        listViewData.add((new ListViewItem(R.drawable.one, "grape")));
        listViewData.add((new ListViewItem(R.drawable.one, "pinapple")));
        listViewData.add((new ListViewItem(R.drawable.one, "strawberry")));
        listViewData.add((new ListViewItem(R.drawable.one, "cherry")));
        listViewData.add((new ListViewItem(R.drawable.one, "mango")));
        listViewData.add((new ListViewItem(1, "apple")));
        listViewData.add((new ListViewItem(1, "banana")));
        listViewData.add((new ListViewItem(1, "orange")));
        listViewData.add((new ListViewItem(1, "watermalon")));
        listViewData.add((new ListViewItem(1, "pear")));
        listViewData.add((new ListViewItem(1, "grape")));
        listViewData.add((new ListViewItem(1, "pinapple")));
        listViewData.add((new ListViewItem(1, "strawberry")));
        listViewData.add((new ListViewItem(1, "cherry")));
        listViewData.add((new ListViewItem(1, "mango")));
        listViewData.add((new ListViewItem(1, "apple")));
        listViewData.add((new ListViewItem(1, "banana")));
        listViewData.add((new ListViewItem(1, "orange")));
        listViewData.add((new ListViewItem(1, "watermalon")));
        listViewData.add((new ListViewItem(1, "pear")));
        listViewData.add((new ListViewItem(1, "grape")));
        listViewData.add((new ListViewItem(1, "pinapple")));
        listViewData.add((new ListViewItem(1, "strawberry")));
        listViewData.add((new ListViewItem(1, "cherry")));
        listViewData.add((new ListViewItem(1, "mango")));
    }

    //自定义adapter类
    public class listViewAdapter extends ArrayAdapter<ListViewItem>{
        private int itemLayoutId;
        public listViewAdapter(Context context, int itemLayoutId, List<ListViewItem> objects){
            super(context,itemLayoutId,objects);
            this.itemLayoutId = itemLayoutId;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ListViewItem currentItem = getItem(position);
            View view = LayoutInflater.from(getContext()).inflate(itemLayoutId, null);

            TextView txt = (TextView)view.findViewById(R.id.txt);
            txt.setText(currentItem.getText());

            ImageView img = (ImageView)view.findViewById(R.id.img);
            img.setImageResource(currentItem.getImgId());

            return view;
        }
    }
}



