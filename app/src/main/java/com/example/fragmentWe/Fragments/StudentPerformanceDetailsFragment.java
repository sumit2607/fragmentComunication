package com.example.fragmentWe.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.fragmentWe.Activity.PreviewActivity;
import com.example.fragmentWe.Model;
import com.example.fragmentWe.R;


public class StudentPerformanceDetailsFragment extends Fragment {


    private EditText etStudentGrade, etStudentPercentage;
    private Button btnPreview;
    private String name;
    private String age;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = (String) getArguments().get("name");
            age = (String) getArguments().get("age");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_performance_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    private void initViews(View view) {
        etStudentGrade = view.findViewById(R.id.etStudentGrade);
        etStudentPercentage = view.findViewById(R.id.etStudentPercentage);
        btnPreview = view.findViewById(R.id.btnPreview);
        btnPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String grade = etStudentGrade.getText().toString();
                String percentaege = etStudentPercentage.getText().toString();
                Model model = new Model(name,grade,percentaege,age);
                Intent intent = new Intent(getActivity(), PreviewActivity.class);
                intent.putExtra("model",model);
                startActivity(intent);
            }
        });
    }
}