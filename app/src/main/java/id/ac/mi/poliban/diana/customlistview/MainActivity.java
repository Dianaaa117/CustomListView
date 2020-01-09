package id.ac.mi.poliban.diana.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    ListView lvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buat toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        //pasang toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Diana's Studio");
        toolbar.setSubtitle("https://github.com/diana");
        toolbar.setLogo(android.R.drawable.ic_dialog_map);

        onCreateOptionsMenu();

    }

    @Override
    private boolean onCreateOptionMenu() {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

     public void onOptionItemSelection(@NonNull MenuItem) {
        switch (item.getItemId()) {
            case R.id.mi_List_country :
                break;
        }
     }
}
