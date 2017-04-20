package id.sch.smktelkom_mlg.xirpl42022242835.myapplication;


import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;


import id.sch.smktelkom_mlg.xirpl42022242835.myapplication.adapter.AwalanPeAdapter;
import id.sch.smktelkom_mlg.xirpl42022242835.myapplication.model.AwalanPe;

public class AwalanPeActivity extends AppCompatActivity implements AwalanPeAdapter.IAwalanPeAdapter {

    ArrayList<AwalanPe> mList = new ArrayList<>();

    AwalanPeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awalan_pe_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.awalanpe);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new AwalanPeAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }


    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.awalanpe);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new AwalanPe(arJudul[i]));
        }
        mAdapter.notifyDataSetChanged();
    }


    @Override
    public void doClick(int pos) {

    }
}