package com.example.pokemonhttp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class DescriptionActivity extends AppCompatActivity {

    ImageView desc_img;
    TextView desc_name;
    TextView desc_description;
    TextView desc_height;
    TextView desc_weight;
    TextView desc_ability;
    TextView desc_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Pokemon pokemon = getIntent().getParcelableExtra("pokemon");


        desc_img = findViewById(R.id.desc_img);
        desc_height = findViewById(R.id.desc_height);
        desc_description = findViewById(R.id.desc_description);
        desc_ability = findViewById(R.id.desc_ability);
        desc_type = findViewById(R.id.desc_type);
        desc_weight = findViewById(R.id.desc_weight);
        desc_name = findViewById(R.id.desc_name);

        desc_height.setText(pokemon.height);
        desc_description.setText(pokemon.desc);
        desc_ability.setText(pokemon.ability);
        desc_type.setText(pokemon.type);
        desc_weight.setText(pokemon.weight);
        desc_name.setText(pokemon.name);

        desc_description.setMovementMethod(new ScrollingMovementMethod());

        Picasso.get().load(pokemon.image).into(desc_img);
    }
}
