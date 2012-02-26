
package wiki.deep.okajugdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class OkajugDemoActivity extends Activity {    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Toast t = Toast.makeText(this, "[Activity]onCreate", Toast.LENGTH_SHORT);
        t.show();
    }
    @Override
    public void onStart() {
        super.onStart();
        Toast t = Toast.makeText(this, "[Activity]onStart", Toast.LENGTH_SHORT);
        t.show();
    }
    @Override
    public void onResume() {
        super.onResume();
        Toast t = Toast.makeText(this, "[Activity]onResume", Toast.LENGTH_SHORT);
        t.show();
    }
    @Override
    public void onRestart() {
        super.onRestart();
        Toast t = Toast.makeText(this, "[Activity]onRestart", Toast.LENGTH_SHORT);
        t.show();
    }
    @Override
    public void onPause() {
        super.onPause();
        Toast t = Toast.makeText(this, "[Activity]onPause", Toast.LENGTH_SHORT);
        t.show();
    }
    @Override
    public void onStop() {
        super.onStop();
        Toast t = Toast.makeText(this, "[Activity]onstop", Toast.LENGTH_SHORT);
        t.show();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast t = Toast.makeText(this, "[Activity]onDestory", Toast.LENGTH_SHORT);
        t.show();
    }
    
    
    
    
    
    
    
    
}