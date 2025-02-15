package pe.edu.senati.apkrunners;

import android.os.Bundle;



import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import pe.edu.senati.apkrunners.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupWithNavController(navigationView, navController);

        navController.addOnDestinationChangedListener((navController1, navDestination, bundle) -> {
            int id =  navDestination.getId();
            if(id == R.id.nav_splash  ||  id  == R.id.nav_login)
                navigationView.setVisibility(NavigationView.INVISIBLE);

        });
    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}