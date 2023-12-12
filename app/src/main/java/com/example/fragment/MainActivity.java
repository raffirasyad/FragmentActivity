package com.example.fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Menambahkan FragmentA ke container
        FragmentA fragmentA = new FragmentA();
        addFragment(fragmentA, R.id.fragment_container_a);

        // Menambahkan FragmentB ke container
        FragmentB fragmentB = new FragmentB();
        addFragment(fragmentB, R.id.fragment_container_b);

        // Menambahkan FragmentC ke container
        FragmentC fragmentC = new FragmentC();
        addFragment(fragmentC, R.id.fragment_container_c);
    }

    // Metode utilitas untuk menambahkan fragment ke container
    private void addFragment(Fragment fragment, int containerId) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(containerId, fragment);
        transaction.commit();
    }
}