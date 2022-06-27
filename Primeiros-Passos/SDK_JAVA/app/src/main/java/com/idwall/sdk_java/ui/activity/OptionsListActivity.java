package com.idwall.sdk_java.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.idwall.sdk_java.DAO.OptionDAO;
import com.idwall.sdk_java.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptionsListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Lista de Options");
        TextView SDK_Page = new TextView(this);
        SDK_Page.setText("HelloWorld_SDK_VERSION");
        setContentView(R.layout.activity_options_list);

        FloatingActionButton newOptionButton = findViewById(R.id.activity_options_list_fab_new_option);
        newOptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OptionsListActivity.this, FormsOptionActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        OptionDAO dao = new OptionDAO();

        ListView optionsList = findViewById(R.id.activity_options_list_listview);
        optionsList.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dao.getAll()));
    }
}
