package com.example.recyclerviewhw32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> profession = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        profession.add("It");
        profession.add("Doctor");
        profession.add("DTP");
        profession.add("Mentor");
        profession.add("Teacher");
        profession.add("Lawyer");
        profession.add("Translator");
        profession.add("Welder");
        profession.add("Nurse");
        profession.add("Locksmith ");
        profession.add("Fireman");
        profession.add("Mechanic");
        profession.add("Photographer");
        profession.add("Mechanic");
        profession.add("Taxi driver ");
        profession.add("Marketer,");
        profession.add("Hairdresseruihh");


        ProfessionAdapter adapter =new ProfessionAdapter(profession);

        recyclerView.setAdapter(adapter);
    }
    }