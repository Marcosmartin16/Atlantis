package com.sermami.atlantis.fragments;

import static com.sermami.atlantis.R.string.*;
import static com.sermami.atlantis.R.string.errorRegistro;

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


public class SignUpFragment extends Fragment {

    Button crear;
    EditText inputemail, inputpassword, inputuser;
    FirebaseAuth mAuth;
    FirebaseUser mUser;
    ProgressDialog pd;

    public SignUpFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //firebase
        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();


        View myView = inflater.inflate(R.layout.signup_fragment, container, false);
        inputemail = (EditText) myView.findViewById(R.id.etlogEmail);
        inputpassword = (EditText) myView.findViewById(R.id.etlogPassword);
        inputuser = (EditText) myView.findViewById(R.id.etUser);
        crear = (Button) myView.findViewById(R.id.btn_crear);
        pd = new ProgressDialog(getContext());


        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                autorizar();
            }
        });
        return myView;

    }

    private void autorizar() {
        String email = inputemail.getText().toString();
        String user = inputuser.getText().toString();
        String password = inputpassword.getText().toString();

        pd.setMessage(getString(EsperandoRegistro));
        pd.setTitle(getString(Registro));
        pd.setCanceledOnTouchOutside(false);
        pd.show();
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    pd.dismiss();
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);
                    getActivity().finish();
                    Toast.makeText(getContext(), registroCompletado, Toast.LENGTH_LONG).show();
                } else {
                    pd.dismiss();
                    Toast.makeText(getContext(), errorRegistro, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}