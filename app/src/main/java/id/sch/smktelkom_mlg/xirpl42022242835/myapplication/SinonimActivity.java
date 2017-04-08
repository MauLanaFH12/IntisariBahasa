package id.sch.smktelkom_mlg.xirpl42022242835.myapplication;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;



import id.sch.smktelkom_mlg.xirpl42022242835.myapplication.adapter.SinonimAdapter;
import id.sch.smktelkom_mlg.xirpl42022242835.myapplication.model.Sinonim;

public class SinonimActivity extends AppCompatActivity implements SinonimAdapter.ISinonimAdapter {

    ArrayList<Sinonim> mList = new ArrayList<>();

    SinonimAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sinonim_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.sinonim);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new SinonimAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }


    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.sinonim);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new Sinonim(arJudul[i]));
        }
        mAdapter.notifyDataSetChanged();
    }


    @Override
    public void doClick(int pos) {

    }
}