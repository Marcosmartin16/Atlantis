package com.sermami.atlantis.fragments;

import static com.sermami.atlantis.R.string.*;
import static com.sermami.atlantis.R.string.Entrando;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.sermami.atlantis.MainActivity;
import com.sermami.atlantis.R;

public class LoginFragment extends Fragment {


    Button entrar;
    EditText logemail, logpassword;
    FirebaseAuth mAuth;
    FirebaseUser mUser;
    ProgressDialog pd;

    public LoginFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.login_fragment, container, false);
        pd = new ProgressDialog(getContext());
        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();
        entrar = (Button) myView.findViewById(R.id.btn_entrar);
        logemail = (EditText) myView.findViewById(R.id.etlogEmail);
        logpassword = (EditText) myView.findViewById(R.id.etlogPassword);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                log();
            }
        });

        return myView;

    }

    private void log() {
        String email = logemail.getText().toString();
        String password = logpassword.getText().toString();

        pd.setMessage(getString(Entrando));
        pd.setTitle("Login");
        pd.setCanceledOnTouchOutside(false);
        pd.show();
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    pd.dismiss();
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);
                    getActivity().finish();
                    Toast.makeText(getContext(), loginCompletado, Toast.LENGTH_LONG).show();
                } else {
                    pd.dismiss();
                    Toast.makeText(getContext(), loginError, Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}