package com.example.fragmentWe.Fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.fragmentWe.Interface.CommunicationListener;
import com.example.fragmentWe.R;

public class StudentPersonalDetailsFragment extends Fragment {

    private EditText metStudentName, metStudentAge;
    private Button mbtnNext;
    private CommunicationListener listener;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_personal_details, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listener = (CommunicationListener) context;
    }

    private void initViews(View view) {
        metStudentName = view.findViewById(R.id.etStudentName);
        metStudentAge = view.findViewById(R.id.etStudentAge);
        mbtnNext = view.findViewById(R.id.btnNext);
        mbtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = metStudentName.getText().toString();
                String age = metStudentAge.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("name",name);
                bundle.putString("age",age);

                if (listener != null) {
                    listener.launchperformancefragment(bundle);
                }
            }
        });
    }

}