package id.ac.poliban.mi.rafii.ligainggris;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class ClubAdapter extends BaseAdapter {
    private List<Club> data=new ArrayList<>();
    public ClubAdapter(List<Club>data){
        this.data=data;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint({"ViewHolder", "CheckResult"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_club;
        TextView tvClubName;
        TextView tvClubDesc;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_club, parent, false);

        //deklarasikan View
        img_club = convertView.findViewById(R.id.img_club);
        tvClubName = convertView.findViewById(R.id.tv_club_name);
        tvClubDesc = convertView.findViewById(R.id.tv_club_description);

        //isi data
        Glide.with(parent.getContext())
                .load(data.get(position).getClubs())
                .apply(new RequestOptions().override(60, 60))
                .into(img_club);
        tvClubName.setText(data.get(position).getClubName());
        tvClubDesc.setText(data.get(position).getClubDesc());

        return convertView;
    }
}
