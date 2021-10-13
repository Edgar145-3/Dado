package com.DispMovil.dado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnj,btns;
    int dado,max1,max2,aux=1;
    TextView c1,c2,c3,c4,c5,c6,tiro,cara;
    int conta1,conta2,conta3,conta4,conta5,conta6=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnj= (Button) findViewById(R.id.jugar);
        btns= (Button) findViewById(R.id.Stop);

        c1=(TextView)findViewById(R.id.uno);
        c2=(TextView)findViewById(R.id.dos);
        c3=(TextView)findViewById(R.id.tres);
        c4=(TextView)findViewById(R.id.cuatro);
        c5=(TextView)findViewById(R.id.cinco);
        c6=(TextView)findViewById(R.id.seis);
        tiro=(TextView)findViewById(R.id.tiros);
        cara=(TextView)findViewById(R.id.caram);
        //final TextView tv = (TextView)
        btnj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int i=1; i<=1;){

                    if(aux<=99){
                        dado = (int) (Math.random() * 6) + 1;

                        if(dado==1){
                            conta1++;
                            c1.setText("" + conta1);
                        }
                        else if(dado==2){
                            conta2++;
                            c2.setText("" + conta2);
                        }
                        else if(dado==3){
                            conta3++;
                            c3.setText("" + conta3);
                        }
                        else if(dado==4){
                            conta4++;
                            c4.setText("" + conta4);
                        }
                        else if(dado==5){
                            conta5++;
                            c5.setText("" + conta5);
                        }
                        else if(dado==6){
                            conta6++;
                            c6.setText("" + conta6);
                        }
                        if(conta1>conta2 & conta1>conta3 & conta1>conta4 & conta1>conta5 & conta1>conta6){
                            cara.setText("" + 1);
                        }else if(conta2>conta1 & conta2>conta3 & conta2>conta4 & conta2>conta5 & conta2>conta6){
                            cara.setText("" + 2);
                        }else if(conta3>conta1 & conta3>conta2 & conta3>conta4 & conta3>conta5 & conta3>conta6){
                            cara.setText("" + 3);
                        }else if(conta4>conta1 & conta4>conta2 & conta4>conta3 & conta4>conta5 & conta4>conta6){
                            cara.setText("" + 4);
                        }else if(conta5>conta1 & conta5>conta2 & conta5>conta3 & conta5>conta4 & conta5>conta6){
                            cara.setText("" + 5);
                        }else if(conta6>conta1 & conta6>conta2 & conta6>conta3 & conta6>conta4 & conta6>conta5){
                            cara.setText("" + 6);
                        }

                        tiro.setText(""+aux);
                        aux++;
                        i++;
                    }else{
                        Toast.makeText(getApplicationContext(), "Solo puedes Jugar 100 veces", Toast.LENGTH_SHORT).show();
                        break;
                    }//break;
                }
            }
        });

        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=0;
                aux=1;
                cara.setText("" + x);
                c1.setText("" + x);
                c2.setText("" + x);
                c3.setText("" + x);
                c4.setText("" + x);
                c5.setText("" + x);
                c6.setText("" + x);
                tiro.setText(""+x);
            }
        });
    }




}