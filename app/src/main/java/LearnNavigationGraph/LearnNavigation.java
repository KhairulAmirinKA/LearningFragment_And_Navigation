package LearnNavigationGraph;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.techwizards.learningfragment.R;

public class LearnNavigation extends AppCompatActivity {

    private BottomNavigationView bottomNavView;
    private NavController navController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_navigation);

        bottomNavView = findViewById(R.id.bottomNavView);
        navController = findNav;

    }
}