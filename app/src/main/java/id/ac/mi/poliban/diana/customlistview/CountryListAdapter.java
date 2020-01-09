package id.ac.mi.poliban.diana.customlistview;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class CountryListAdapter extends BaseAdapter {
    private List<Country> countries;

    public CountryListAdapter(List<Country> countries) {
}
    @Override
    public int getCount(){
        return countries.size();
    }

    @Override
    public Object getItem(int position) {
        return countries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from((parent.getContext())).inflate(R.layout.cust_listview, parent, false);

        //mengenai view ke object
        ImageView imgCountryListFlag = convertView.findViewById(R.id.img_country_flag_list);
        TextView tvCountryName = convertView.findViewById(R.id.tv_country_name);
        TextView tvCountryDetail = convertView.findViewById(R.id.tv_country_detail);

        //isi data
        Glide.with((convertView.getContext())
                .load(countries.get(position).getFlag())
                .apply(new RequestOptions().override())
                .into(imgCountryListFlag);
        tvCountryName.setText(countries.get(position).getCountryName());
        tvCountryDetail.setText(countries.get(position).getCountryDetail());

        return  convertView;
    }
}