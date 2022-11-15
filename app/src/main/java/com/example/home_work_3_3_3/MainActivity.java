package com.example.home_work_3_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList heroList = new ArrayList();
    private RecyclerView rvHero;
    private RecyclerView.Adapter heroAdapter = new HeroAdapter(heroList);

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvHero = findViewById(R.id.rv_hero);
        loadData();
        rvHero.setAdapter(heroAdapter);
    }

    private void loadData() {
        heroList.add("Ник Фьюри");
        heroList.add("Доктор Стрендж");
        heroList.add("Тор");
        heroList.add("Человек-Паук");
        heroList.add("Соколинный глаз");
        heroList.add("Ракета");
        heroList.add("Грут");
        heroList.add("Железный человек");
        heroList.add("Халк");
        heroList.add("Капитан Америка");
        heroList.add("Ртуть");
        heroList.add("Черная Вдова");
        heroList.add("Черная Пантера");
    }
}