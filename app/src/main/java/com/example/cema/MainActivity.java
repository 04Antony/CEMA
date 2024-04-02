
package com.example.cema;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.ActionBarDrawerToggle;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.appcompat.widget.Toolbar;
        import androidx.core.view.GravityCompat;
        import androidx.drawerlayout.widget.DrawerLayout;

        import android.annotation.SuppressLint;
        import android.os.Bundle;
        import android.view.MenuItem;
        import android.widget.Toast;

        import com.google.android.material.bottomnavigation.BottomNavigationView;
        import com.google.android.material.floatingactionbutton.FloatingActionButton;
        import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private FirebaseFirestore db;
    private FirestoreHelper firestoreHelper;

    FloatingActionButton fab;
    DrawerLayout drawerLayout;
    BottomNavigationView bottomNavigationView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        fab = findViewById(R.id.fab);
        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav, R.string.close_nav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }
        db = FirebaseFirestore.getInstance();
        firestoreHelper = new FirestoreHelper();

        // Example code for storing data in Firestore
        storeDataInFirestore();
    }

    private void storeDataInFirestore() {
        String pharmacyName = "ABC Pharmacy";
        String pharmacyAddress = "123 Main Street";
        firestoreHelper.addPharmacyData(pharmacyName, pharmacyAddress);

        String medicationName = "Medicine X";
        String medicationDosage = "10mg";
        firestoreHelper.addMedicationData(medicationName, medicationDosage);

        String serviceName = "Service Y";
        String serviceDescription = "Medical service description";
        firestoreHelper.addMedicalServiceData(serviceName, serviceDescription);


        String hospitalName = "XYZ Hospital";
        String hospitalLocation = "456 Park Avenue";
        firestoreHelper.addLocalHospitalData(hospitalName, hospitalLocation);
    }
    }
