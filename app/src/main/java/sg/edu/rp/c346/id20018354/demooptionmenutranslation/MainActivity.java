package sg.edu.rp.c346.id20018354.demooptionmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText=findViewById(R.id.textViewTextTranslated);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            tvTranslatedText.setText("Hello ");
            return true;
        } else if (id == R.id.ItalianSelection) {
            tvTranslatedText.setText("Ciao");
            return true;
        }else if (id == R.id.FrenchSelection) {
            tvTranslatedText.setText("Bonjour");
            return true;
        }else if (id == R.id.JapaneseSelection) {
            tvTranslatedText.setText("こんにちは");
            return true;
        }else if (id == R.id.KoreanSelection) {
            tvTranslatedText.setText("안녕하세요");
            return true;
        }else if (id == R.id.ChineseSelection) {
            tvTranslatedText.setText("你好");
            return true;
        } else {
            tvTranslatedText.setText("Error translation");
        }

        return super.onOptionsItemSelected(item);
    }

}