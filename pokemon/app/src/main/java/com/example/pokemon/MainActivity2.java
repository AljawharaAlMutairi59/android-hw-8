package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();
        pokemon p = (pokemon) b.getSerializable("pokemon");
        TextView name = findViewById(R.id.textView4);
        TextView attack = findViewById(R.id.textView5);
        TextView defence = findViewById(R.id.textView6);
        TextView total = findViewById(R.id.textView7);
        ImageView img = findViewById(R.id.imageView2);


        name.setText(p.getName());
        attack.setText("Attack: "+ p.getAttack()+"");
        defence.setText("Defence: "+ p.getDefence()+"");
        total.setText("ToTal: "+p.getTotal()+"");
        img.setImageResource(p.getImage());



    }
}