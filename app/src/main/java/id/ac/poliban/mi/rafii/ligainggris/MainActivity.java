package id.ac.poliban.mi.rafii.ligainggris;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Club> clubs = new ArrayList<>();
    private ListView lvClubs;
    private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvClubs = findViewById(R.id.listview);

        //ambil data dari CountryData dan berikan ke object countries
        clubs.addAll(DataClub.getClubList());

        //buat object adapter dan kirim data countries sebagai
        // parameter di konstruktor CountryAdapter()
        adapter = new ClubAdapter(clubs);
        //pasang object adapter sebagai adapter lvCountry
        lvClubs.setAdapter(adapter);

        //menambahkan kejadian ketika user mengklik salah satu item
        lvClubs.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("Info")
                    .setMessage(clubs.get(position).toString())
                    .setPositiveButton("OK", null).show();
        });
    }
}
