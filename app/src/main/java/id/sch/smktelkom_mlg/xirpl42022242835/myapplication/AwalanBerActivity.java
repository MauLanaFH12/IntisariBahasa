package id.sch.smktelkom_mlg.xirpl42022242835.myapplication;

/**
 * Created by Izza on 17/04/2017.
 */


import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;


import id.sch.smktelkom_mlg.xirpl42022242835.myapplication.adapter.AwalanBerAdapter;
import id.sch.smktelkom_mlg.xirpl42022242835.myapplication.model.AwalanBer;

public class AwalanBerActivity extends AppCompatActivity implements AwalanBerAdapter.IAwalanBerAdapter {

    ArrayList<AwalanBer> mList = new ArrayList<>();

    AwalanBerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awalan_ber_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.awalanber);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new AwalanBerAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }


    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.awalanber);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new AwalanBer(arJudul[i]));
        }
        mAdapter.notifyDataSetChanged();
    }


    @Override
    public void doClick(int pos) {

    }
}

