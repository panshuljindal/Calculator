package com.anpl.calculator;
/* hi Panshu*/
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bt,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19;
    String output = "";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button) findViewById(R.id.bt);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        bt10 = (Button) findViewById(R.id.bt10);
        bt11 = (Button) findViewById(R.id.bt11);
        bt12 = (Button) findViewById(R.id.bt12);
        bt13 = (Button) findViewById(R.id.bt13);
        bt14 = (Button) findViewById(R.id.bt14);
        bt15 = (Button) findViewById(R.id.bt15);
        bt16 = (Button) findViewById(R.id.bt16);
        bt17 = (Button) findViewById(R.id.bt17);
        bt18 = (Button) findViewById(R.id.bt18);
        bt19 = (Button) findViewById(R.id.bt19);
        textView =(TextView) findViewById(R.id.textView2);
        bt.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt10.setOnClickListener(this);
        bt11.setOnClickListener(this);
        bt12.setOnClickListener(this);
        bt13.setOnClickListener(this);
        bt14.setOnClickListener(this);
        bt15.setOnClickListener(this);
        bt16.setOnClickListener(this);
        bt17.setOnClickListener(this);
        bt18.setOnClickListener(this);
        bt19.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        if(v==bt){
            output = output +"(";
            textView.setText(output);
        }
        else if (v==bt1){
            output = output +")";
            textView.setText(output);
        }
        else if(v==bt2){
            output = output +"^";
            textView.setText(output);
        }
        else if(v==bt3){
            int n = output.length()-1;
            output = output.substring(0,n);
            textView.setText(output);
        }
        else if(v==bt4){
            output = "";
            textView.setText(output);
        }else if(v==bt5){
            output = output +"9";
            textView.setText(output);
        }else if(v==bt6){
            output = output +"8";
            textView.setText(output);
        }else if(v==bt7){
            output = output +"7";
            textView.setText(output);
        }else if(v==bt8){
            output = output +"+";
            textView.setText(output);
        }else if(v==bt9){
            output = output +"-";
            textView.setText(output);
        }else if(v==bt10){
            output = output +"6";
            textView.setText(output);
        }else if(v==bt11){
            output = output +"5";
            textView.setText(output);
        }else if(v==bt12){
            output = output +"4";
            textView.setText(output);
        }else if(v==bt13){
            output = output +"*";
            textView.setText(output);
        }else if(v==bt14){
            output = output +"/";
            textView.setText(output);
        }else if(v==bt15){
            output = output +"3";
            textView.setText(output);
        }else if(v==bt16){
            output = output +"2";
            textView.setText(output);
        }else if(v==bt17){
            output = output +"1";
            textView.setText(output);
        }else if(v==bt18){
            output = output +"0";
            textView.setText(output);
        }else if(v==bt19){
            textView.setText("");
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            textView.setText(engine.eval(output));
        }

    }
}
