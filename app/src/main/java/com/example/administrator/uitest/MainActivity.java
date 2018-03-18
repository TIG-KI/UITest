package com.example.administrator.uitest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.sevenheaven.segmentcontrol.SegmentControl;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SegmentControl segmentControl2,segmentControl1;
    private TextView textView1;
    private FloatingActionButton floatingActionButton1,floatingActionButton2;
    private EditText editText1;
    //private  String[] data={"Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango","Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango"};
    private List<Fruit> fruitList=new ArrayList<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        segmentControl2=(SegmentControl)findViewById(R.id.segment_control_2);
        segmentControl1=(SegmentControl)findViewById(R.id.segment_control);
        textView1=(TextView)findViewById(R.id.title_mine);
        floatingActionButton1=(FloatingActionButton)findViewById(R.id.floatintButton1);
        floatingActionButton2=(FloatingActionButton)findViewById(R.id.floatintButton2);
        editText1=(EditText)findViewById(R.id.search_badge);
        editText1.setCursorVisible(false);
        initFruits();
        editText1.setInputType(InputType.TYPE_NULL);//用于隐藏系统的输入法
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.list_item,fruitList);
        listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana", R.drawable.banana_pic);
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange", R.drawable.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon", R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Pear", R.drawable.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit("Grape", R.drawable.grape_pic);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("Pineapple", R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry", R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("Cherry", R.drawable.cherry_pic);
            fruitList.add(cherry);
            Fruit mango = new Fruit("Mango", R.drawable.mango_pic);
            fruitList.add(mango);
        }
    }

    public void onTabClicked(View view){
//      segmentControl2.setVisibility(View.GONE);
//      textView1.setVisibility(View.GONE);
        editText1.setCursorVisible(false);
        switch (view.getId()){
            case R.id.re_home:
                segmentControl2.setVisibility(View.GONE);
                textView1.setVisibility(View.GONE);
                segmentControl1.setVisibility(View.VISIBLE);
                floatingActionButton2.setVisibility(View.VISIBLE);
                floatingActionButton1.setVisibility(View.VISIBLE);
                editText1.setVisibility(View.VISIBLE);
                listView.setVisibility(View.VISIBLE);
                break;
            case R.id.assistent:
                segmentControl2.setVisibility(View.VISIBLE);
                segmentControl1.setVisibility(View.GONE);
                textView1.setVisibility(View.GONE);
                floatingActionButton2.setVisibility(View.GONE);
                floatingActionButton1.setVisibility(View.GONE);
                editText1.setVisibility(View.GONE);
                listView.setVisibility(View.GONE);
                break;
            case R.id.bottom_mine:
                segmentControl1.setVisibility(View.GONE);
                segmentControl2.setVisibility(View.GONE);
                textView1.setVisibility(View.VISIBLE);
                floatingActionButton2.setVisibility(View.GONE);
                floatingActionButton1.setVisibility(View.GONE);
                editText1.setVisibility(View.GONE);
                listView.setVisibility(View.GONE);
                break;
            case R.id.search_badge:
                editText1.setCursorVisible(false);
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                break;
        }

    }
}
