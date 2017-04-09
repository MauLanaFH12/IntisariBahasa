package id.sch.smktelkom_mlg.xirpl42022242835.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by MaulanaFH on 4/8/2017.
 */

public class SinonimFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_import, container, false);
        Button button = (Button) rootView.findViewById(R.id.btsinonim);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Sinonim();
            }
        });
        return rootView;
    }
    public void Sinonim() {

        Intent intent = new Intent(getActivity(), SinonimActivity.class);
        startActivity(intent);
    }
}