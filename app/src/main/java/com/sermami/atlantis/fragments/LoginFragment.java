package com.sermami.atlantis.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.sermami.atlantis.QuizActivity;
import com.sermami.atlantis.QuizResults;
import com.sermami.atlantis.R;
import com.sermami.atlantis.SignupActvity;

public class LoginFragment extends Fragment {

    Button entrar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.login_fragment, container, false);

        entrar = (Button) myView.findViewById(R.id.btn_entrar);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), QuizActivity.class);
                startActivity(intent);
            }
        });

        return myView;

    }
}