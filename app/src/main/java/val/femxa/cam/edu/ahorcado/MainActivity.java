package val.femxa.cam.edu.ahorcado;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    public void presionGato(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.cartoon);
        mp.start();
    }

    public void presionGallo(View v)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.leon);
        mp.start();

        }
}