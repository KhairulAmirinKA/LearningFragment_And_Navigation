package LearnBottomNav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.techwizards.learningfragment.R;

public class LearnBottomNavigation extends AppCompatActivity implements BottomNavigationView.OnItemSelectedListener, BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView bottomNavView;
    private NavController navController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_bottom_navigation);

        //init
        bottomNavView = findViewById(R.id.bottomNavView);

        bottomNavView.setOnNavigationItemSelectedListener(this);

        //default fragment
        loadFragment(new HomeFragment());





    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) { //clicks on every menu item

        Fragment fragment = null;

        int id= item.getItemId();

        if (id == R.id.DestHome) {
            fragment = new HomeFragment();
        }

        else if (id== R.id.DestProfile){
            fragment = new ProfileFragment();
        }

        else if (id == R.id.DestSettings){
            fragment = new SettingsFragment();
        }

        else {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }

        //load to the screen
        if (fragment!= null){
            loadFragment(fragment);
        }


        return true;
    }


    private void loadFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView_bottomNav, fragment)
                .commit();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}