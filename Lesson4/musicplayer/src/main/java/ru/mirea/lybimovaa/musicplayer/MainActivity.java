package ru.mirea.lybimovaa.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.mirea.lybimovaa.musicplayer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}