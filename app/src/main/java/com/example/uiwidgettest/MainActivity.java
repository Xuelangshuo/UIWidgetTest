package com.example.uiwidgettest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;
    private int x = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        editText = (EditText)findViewById(R.id.edit_text);
        imageView = (ImageView) findViewById(R.id.image_view);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                String inputText = editText.getText().toString();
                Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
               break;
            case R.id.button2:
                switch(x){
                    case 2:
                        x ++;
                        imageView.setImageResource(R.drawable.img2);
                        break;
                    case 3:
                        x ++;
                        imageView.setImageResource(R.drawable.img3);
                        break;
                    case 4:
                        x ++;
                        imageView.setImageResource(R.drawable.img4);
                        break;
                    case 5:
                        x ++;
                        imageView.setImageResource(R.drawable.img5);
                        break;
                    case 6:
                        x ++;
                        imageView.setImageResource(R.drawable.img6);
                        break;
                    case 7:
                        x = 2;
                        imageView.setImageResource(R.drawable.img1);
                        break;
                    default:
                        break;
                }
                break;
            case R.id.button3:
                int progress = progressBar.getProgress();
                if(progress == 100){
                    progress = 0;
                }
                progress = progress + 10;
                progressBar.setProgress(progress);

                break;
            case R.id.button4:
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("提示信息");
                dialog.setMessage("牢记是沙雕吗？");
                dialog.setCancelable(false);
                dialog.setPositiveButton("是", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "恭喜你答对了", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.setNegativeButton("否", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "沙雕你答错了", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
                break;
            default:
                break;
        }
    }
}