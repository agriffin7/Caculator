package com.example.jsu.caculator;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import java.util.*;
import java.lang.*;
import android.widget.*;

public class Caculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    String numstring = "";
    StringBuilder str = new StringBuilder(numstring);
    String optype = "";
    double numInt1 = 0;
    double numInt2 = 0;

    public void OnClick(View b){
        //declare your display area
        TextView display = (TextView) findViewById(R.id.displayView);

        //declare a value to hold the data
        //used for caculations
        int OperationAnswer = 0;



        //get the length of the str, assign it to this value
        int offset = str.length();
        //get the id of the button
        String id = (b.getResources().getResourceName(b.getId())).split("/")[1];

        //check for the ID, if button, just add the value

        //numbers portion
        if(id.equals("num1")){
            str.insert(offset, 1);
        }
        else if(id.equals("num2")){
            str.insert(offset, 2);
        }
        else if(id.equals("num3")){
            str.insert(offset, 3);

        }
        else if(id.equals("num4")){
            str.insert(offset, 4);

        }
        else if(id.equals("num5")){
            str.insert(offset, 5);

        }
        else if(id.equals("num6")){
            str.insert(offset, 6);

        }
        else if(id.equals("num7")){
            str.insert(offset, 7);

        }
        else if(id.equals("num8")){
            str.insert(offset, 8);

        }
        else if(id.equals("num9")){
            str.insert(offset, 9);

        }
        else if(id.equals("num0")){
            str.insert(offset, 0);

        }
        //caculation portion
        else if (id.equals("add")){
            str.delete(0, str.length());
            numInt2 = numInt1;
            numInt1 = 0;
            optype = "a";
        }
        else if (id.equals("subtract")){
            str.delete(0, str.length());
            numInt2 = numInt1;
            numInt1 = 0;
            optype = "s";

        }
        else if (id.equals("divide")){
            str.delete(0, str.length());
            numInt2 = numInt1;
            numInt1 = 0;
            optype = "d";

        }
        else if (id.equals("multiply")){
            str.delete(0, str.length());
            numInt2 = numInt1;
            numInt1 = 0;
            optype = "m";

        }
        else if (id.equals("squareRoot")){
            str.delete(0, str.length());
            numInt2 = numInt1;
            numInt1 = 0;
            optype = "sr";

        }
        else if (id.equals("percentage")){
            str.delete(0, str.length());
            numInt2 = numInt1;
            numInt1 = 0;
            optype = "p";

        }
        //other buttons
        else if (id.equals("decimal")){


        }
        else if (id.equals("SignChange")){

        }
        else if (id.equals("equal")){
            if(optype.equals("a")){
                str.delete(0, str.length());
                str.insert(0, (numInt2+numInt1));

            }
            else if (optype.equals("s")){
                str.delete(0, str.length());
                str.insert(0, (numInt2-numInt1));

            }
            else if (optype.equals("d")){
                str.delete(0, str.length());
                str.insert(0, (numInt2/numInt1));

            }
            else if (optype.equals("m")){
                str.delete(0, str.length());
                str.insert(0, (numInt2*numInt1));

            }
            else if (optype.equals("sr")){

                //str.delete(0, str.length());
               // str.insert(0, (numInt2^numInt1));

            }
            else if (optype.equals("p")){
                //str.delete(0, str.length());
                //str.insert(0, (numInt2%numInt1));

            }

        }
        else if (id.equals("clear")){
            numInt1=0;
            numInt2=0;

            str.delete(0, str.length());
        }





        //set NumInt1
        if(str.toString() != ""){
            numInt1 = Double.parseDouble(str.toString());
        }

        //System.out.println(id);
        //display the text
        display.setText(str);

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_caculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
