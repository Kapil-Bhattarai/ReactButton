package com.amrdeveloper.reactbuttonlibrary;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.amrdeveloper.reactbutton.ReactButton;
import com.amrdeveloper.reactbutton.Reaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReactButton reactButton = findViewById(R.id.reaction_btn);

        reactButton.setReactDismissListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                Reaction currentReaction = ((ReactButton) view).getCurrentReaction();
                Toast.makeText(MainActivity.this,currentReaction.getReactType(),Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        reactButton.setReactClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Reaction currentReaction = ((ReactButton) v).getCurrentReaction();

                Toast.makeText(MainActivity.this,currentReaction.getReactType(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
