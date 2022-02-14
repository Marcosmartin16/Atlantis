package com.sermami.atlantis.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import com.sermami.atlantis.CondicionesActivity;
import com.sermami.atlantis.MainActivity;
import com.sermami.atlantis.R;


public class SignUpFragment extends Fragment {

    CheckBox terminos;


    public SignUpFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.signup_fragment, container, false);

        terminos = (CheckBox) myView.findViewById(R.id.checkBox);



        terminos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), CondicionesActivity.class);
                startActivity(intent);
            }
        });


        return myView;

    }
}