package com.example.awesomefat.csc537_homework5_template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText inputET;
    private TextView numElementsTV;
    private TextView result;
    private BinaryTree bt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get our widgets from our layout
        this.inputET = (EditText)this.findViewById(R.id.inputET);
        this.numElementsTV = (TextView)this.findViewById(R.id.numElementsTV);

        //create our binaryTree
        this.bt = new BinaryTree();

        this.updateTreeCount();
    }

    private void updateTreeCount()
    {
        this.numElementsTV.setText("" + this.bt.getCount());
    }

    public void addToTreeButtonPressed(View v)
    {
        if(this.inputET.getText().length() > 0)
        {
            int payload = Integer.parseInt(this.inputET.getText().toString());
            this.bt.add(payload);
            this.updateTreeCount();
        }
    }


    public void areeButtonPressed(View v)
    {

        this.result=(TextView)this.findViewById(R.id.TV2);
        switch (v.getId()) {
            case R.id.inoder:
                this.result.setText(this.bt.runi(1));
                break;
            case R.id.preorder:
                this.result.setText(this.bt.runi(2));
                break;
            case R.id.postorder:
               this.result.setText(this.bt.runi(3));
                break;

         }
    }
}
