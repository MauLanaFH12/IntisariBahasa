package id.sch.smktelkom_mlg.xirpl42022242835.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Izza on 08/04/2017.
 */


    public class KAFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_awalan, container, false);
        Button button1 = (Button) rootView.findViewById(R.id.bt1);
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Bt1();
            }
        });
        Button button2 = (Button) rootView.findViewById(R.id.bt2);
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Bt2();
            }
        });
        Button button3 = (Button) rootView.findViewById(R.id.bt3);
        button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Bt3();
            }
        });
        Button button4 = (Button) rootView.findViewById(R.id.bt4);
        button4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Bt4();
            }
        });
        Button button5 = (Button) rootView.findViewById(R.id.bt5);
        button5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Bt5();
            }
        });
        return rootView;
    }
    public void Bt1() {
        Intent intent = new Intent(getActivity(), AwalanMen.class);
        startActivity(intent);

    }
    public void Bt2() {
        Intent intent = new Intent(getActivity(), AwalanBer.class);
        startActivity(intent);

    }
    public void Bt3() {
        Intent intent = new Intent(getActivity(), AwalanDi.class);
        startActivity(intent);

    }
    public void Bt4() {
        Intent intent = new Intent(getActivity(), AwalanTer.class);
        startActivity(intent);

    }
    public void Bt5() {
        Intent intent = new Intent(getActivity(), AwalanPen.class);
        startActivity(intent);
    }
    }