package com.idwall.sdk_java.ui.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.idwall.sdk_java.DAO.OptionDAO;
import com.idwall.sdk_java.R;
import com.idwall.sdk_java.model.Option;

public class FormsOptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms_option);

        OptionDAO dao = new OptionDAO();

        final EditText campo1 = findViewById(R.id.activity_option_form_info_1);
        final EditText campo2 = findViewById(R.id.activity_option_form_info_2);
        final EditText campo3 = findViewById(R.id.activity_option_form_info_3);
//        IDwallToolkit.getInstance().init(this.getApplication(), "f84f4d1e10922450f319bb6267ab1821");

        Button saveButton = findViewById(R.id.activity_option_form_save_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String field1 = campo1.getText().toString();
                String field2 = campo2.getText().toString();
                String field3 = campo3.getText().toString();
                Option createdOption = new Option(field1, field2, field3);

                dao.save(createdOption);

                finish();
            }
        });
    }
}

