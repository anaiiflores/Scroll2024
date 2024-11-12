package com.example.scroll2024;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText articleEditText;
    Button addCommentButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        articleEditText = findViewById(R.id.article);
        addCommentButton = findViewById(R.id.but);


        addCommentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(addCommentButton.getText().equals("Add comment")){
                    articleEditText.setEnabled(true);
                    addCommentButton.setText("Set comment");

                }else if(addCommentButton.getText().equals("Set comment")){

                    articleEditText.setEnabled(false);
                    addCommentButton.setText("Add comment");
                }
            }
        });
    }
}




