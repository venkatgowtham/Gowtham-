package com.myappcompany.rob.exampleproject;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//hey
import android.util.Log;


import android.view.View;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{






//    public void test(View view)
//    {
//
//
//        Log.i(" info","cccar");
//
//        //MediaPlayer mediaPlayer = new MediaPlayer();
//
//        //mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
//
//        MediaPlayer audio= MediaPlayer.create(this,R.raw.test);
//
//        Log.i(" info "," "+ view.getTag());
//
//        audio.start();
//
//        Log.i(" indo",String.valueOf(audio.isPlaying())+" "+ audio.getDuration());
//
//
//    }

//    boolean red=true;
//boolean game=true;
//    int [] values={2,2,2,2,2,2,2,2,2};
//
//    int [][] ans={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
//
//    // red =0;
//
//    // yellow=1;
//
//
//    public void red(View view)
//    {
//
//        ImageView a1=  (ImageView) view;
//
//        int x=Integer.valueOf(view.getTag().toString());
//
//        if(values[x-1]==2 && game) {
//            a1.setTranslationY(-1500);
//
//            a1.animate().translationYBy(1500).setDuration(1000);
//
//            if (red) {
//                a1.setImageResource(R.drawable.red);
//               values[x-1]=0;
//                red = false;
//            } else {
//                a1.setImageResource(R.drawable.yellow);
//                values[x-1]=1;
//                red = true;
//            }
//
//            game=test();
//
//            if(!game)
//            {
//                TextView abc= (TextView) findViewById(R.id.textView4);
//                Button reset=(Button) findViewById(R.id.button3);
//                String winner="";
//                if(red)
//                {
//                    winner="yellow";
//                }
//                else{
//                    winner="red";
//                }
//
//                abc.setText(winner+" has won the game");
//
//                abc.setVisibility(View.VISIBLE);
//
//                reset.setVisibility(View.VISIBLE);
//
//            }
//            Log.i(" info",String.valueOf(game));
//        }
//
//    }
//
//    public void reset(View view)
//    {
//        game=true;
//        red=true;
//        for(int i=0;i<values.length;i++)
//        {
//            values[i]=2;
//        }
//
//        GridLayout ab=(GridLayout) findViewById(R.id.gridLayout);
//
//        for(int i = 0; i < ab.getChildCount(); i++) {
//
//            ImageView child = (ImageView) ab.getChildAt(i);
//
//            child.setImageDrawable(null);
//            // do stuff with child view
//        }
//
//
//        TextView abc= (TextView) findViewById(R.id.textView4);
//        Button reset=(Button) findViewById(R.id.button3);
//
//        abc.setVisibility(View.INVISIBLE);
//        reset.setVisibility(View.INVISIBLE);
//
//    }
//
//    public boolean test()
//    {
//        boolean ret=true;
//        for(int i=0;i<ans.length;i++)
//        {
//            if(values[ans[i][0]]==values[ans[i][1]] && values[ans[i][1]]==values[ans[i][2]] && values[ans[i][0]]!=2 )
//            {
//                ret=false;
//                break;
//            }
//        }
//        return ret;
//    }

//
//    Random Ran=new Random();
//
//    int x1= Ran.nextInt(20);
//
   //   public void fade(View view)
//    {
//        ImageView x1= (ImageView) findViewById(R.id.imageView4);
//
//        ImageView x2= (ImageView) findViewById(R.id.imageView5);
//
//        Log.i("info","car1");
//
//        x1.animate().alpha(0).setDuration(2000);
//
//
//        x2.animate().alpha(1).setDuration(2000);
//
//    }
//    public void fade2(View view)
//    {
//        ImageView x1= (ImageView) findViewById(R.id.imageView4);
//
//        ImageView x2= (ImageView) findViewById(R.id.imageView5);
//
//        Log.i("info","car21");
//
//        x1.animate().translationXBy(-2000).setDuration(2000);
//
//        //x1.animate().alpha(0).setDuration(2000);
//
//
//        //x2.animate().alpha(1).setDuration(2000);
//
//    }

//    public void click(View view)
//    {
//        EditText a1= (EditText) findViewById(R.id.editText3);
//
//        int y=Integer.valueOf(a1.getText().toString());
//
//        if(y>x1)
//        {
//            Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();
//        }
//        else if(y<x1)
//        {
//            Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
//        }
//        else{
//            Toast.makeText(this, "Correct ", Toast.LENGTH_SHORT).show();
//        }
//
//        Log.i("value",String.valueOf(x1));
//    }
//
//    Button b1;
//    ImageView iw;
//
//    public void click(View view)
//    {
//        EditText a=(EditText) findViewById(R.id.value);
//
//        Log.i(" value",a.getText().toString());
//
//        int b=Integer.valueOf(a.getText().toString());
//
//        b=b*78;
//
//        Log.i(" value", String.valueOf(b));
//
//        Toast.makeText(this, " the value  is " +String.valueOf(b), Toast.LENGTH_SHORT).show();
//
//    }

//    public void clicked(View view)
//      {
//        EditText abc= (EditText) findViewById(R.id.password);
//
//        EditText abc2=(EditText) findViewById(R.id.emailId);
//
//        Log.i(" Info","button clicked");
//
//        Log.i("Value ",abc.getText().toString() );
//
//        Log.i(" Value", abc2.getText().toString());
//
//        Toast.makeText(this, "Hey there", Toast.LENGTH_SHORT).show();
//
//        final ImageView imageView = (ImageView) findViewById(R.id.img1);
//        imageView.setImageResource(R.drawable.dog2);


//        {
//            iw.setImageResource(R.drawable.dog2);
//        }


  //  }


    public ArrayList multi(int x)
    {

        ArrayList<Integer> x1=new ArrayList<>();

        for(int i=1;i <= 11;i++)
        {
            x1.add(x*i);

        }

        return x1;

    }

    public void display(ArrayList y)
    {


        ListView temp= (ListView) findViewById(R.id.list);

        ArrayAdapter t1=new ArrayAdapter(this,android.R.layout.simple_list_item_1,y);

        temp.setAdapter(t1);


    }

    public void seekfunction()
    {
        final ProgressBar a2=(ProgressBar) findViewById(R.id.progressBar);

        final  TextView a3= (TextView) findViewById(R.id.textView);

        SeekBar a1= (SeekBar)findViewById(R.id.seekBar);

        a1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {


                a2.setProgress(i);

                a3.setText(" "+ (i*20)/100);

                ArrayList<Integer> ni= multi((i*20)/100);

                display(ni);
                int y=ni.get(4);

                Log.i(" info"," "+y);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  MainActivity m1=new MainActivity();

            seekfunction();


//       final  ArrayList<String> a1=new ArrayList<>();
//
//
//        a1.add("om");
//        a1.add("hk");
//        a1.add("ram");
//        a1.add("sam");
//
//
//        ListView a2=(ListView) findViewById(R.id.t1);
//
//
//        ArrayAdapter<String> a3=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,a1);
//        a2.setAdapter(a3);
//
//        a2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//                Toast.makeText(MainActivity.this, " "+ a1.get(i), Toast.LENGTH_SHORT).show();
//            }
//        });
//












        //MediaPlayer audio= MediaPlayer.create(this, R.raw.tes1);

        //MediaPlayer audio1= MediaPlayer.create(this, R.raw.test);

        //audio1.start();

        //Log.i(" info","ccca");


        //audio.start();
//
//        VideoView abc= (VideoView) findViewById(R.id.video);
//
//        abc.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.big_buck_bunny_720p_1mb);
//
//        MediaController test=new MediaController(this);
//
//        test.setAnchorView(abc);
//
//        abc.setMediaController(test);
//
//        abc.start();
//
//        Log.i(" inf0","heyyy");
//        ImageView x2= (ImageView) findViewById(R.id.imageView4);

       // x2.animate().translationX(1000).setDuration(10000);

//        x2.animate().translationXBy(10).rotation(360).setDuration(10000);

       // x2.animate().rotationXBy(1000).setDuration(10000);
     //  x2.animate().rotation(360).setDuration(1000);



    }

    @Override
    public void onClick(View view) {

    }
}
