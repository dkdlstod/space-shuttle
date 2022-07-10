package com.pxxpbspace.spaceshuttle;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.os.Handler;
import android.os.Message;

import java.util.Random;

public class Img_View1 extends View{
    BitmapDrawable spaceshuttle[]=new BitmapDrawable[2];
    BitmapDrawable background1=null;
    BitmapDrawable background2=null;
    BitmapDrawable background3=null;
    BitmapDrawable background4=null;
    BitmapDrawable object1[]=new BitmapDrawable[5];
    BitmapDrawable object2[]=new BitmapDrawable[5];
    BitmapDrawable object3[]=new BitmapDrawable[5];
    BitmapDrawable object4[]=new BitmapDrawable[5];
    int x=200,y=550;
    float scale_x;
    float scale_y;
    boolean sXL=false,sXR=false;
    int xx,yy;
    BackThread thread1=new BackThread();
    boolean retry=true;
    int spaceshuttle_cnt1=0, object_cnt1=1, background_cnt1=1;
    int delay_time1=0, delay_time2=0, delay_time3=0;
    int spaceshuttle_width,spaceshuttle_height;
    int object_x[]=new int[5];
    int object_y[]=new int[5];
    int count=0, count2=0;
    public Img_View1(Context context){
        super(context);
        spaceshuttle[0]=(BitmapDrawable) context.getResources().getDrawable(R.drawable.spaceshuttle1);
        spaceshuttle[1]=(BitmapDrawable) context.getResources().getDrawable(R.drawable.spaceshuttle1);
        background1=(BitmapDrawable) context.getResources().getDrawable(R.drawable.background1);
        background2=(BitmapDrawable) context.getResources().getDrawable(R.drawable.background2);
        background3=(BitmapDrawable) context.getResources().getDrawable(R.drawable.background3);
        background4=(BitmapDrawable) context.getResources().getDrawable(R.drawable.background4);
        spaceshuttle_width=492;
        spaceshuttle_height=935;

        object1[0]=(BitmapDrawable) context.getResources().getDrawable(R.drawable.pigeon);
        object1[1]=(BitmapDrawable) context.getResources().getDrawable(R.drawable.eagle1);
        object2[0]=(BitmapDrawable) context.getResources().getDrawable(R.drawable.helicopter1);
        object2[1]=(BitmapDrawable) context.getResources().getDrawable(R.drawable.airplane1);
        object3[0]=(BitmapDrawable) context.getResources().getDrawable(R.drawable.fireball11);
        object3[1]=(BitmapDrawable) context.getResources().getDrawable(R.drawable.fireball22);
        object4[0]=(BitmapDrawable) context.getResources().getDrawable(R.drawable.meteorite1);
        object4[1]=(BitmapDrawable) context.getResources().getDrawable(R.drawable.iss);


        for(int i=0;i<=4;i++) {
            object_x_y_po(i);
        }

        thread1.setDaemon(true);
        thread1.start();
    }

    @Override
    public void onDraw(Canvas Canvas){
        scale_x=Canvas.getWidth()/480f;
        scale_y=Canvas.getHeight()/800f;
        Canvas.scale(scale_x,scale_y);

        if(background_cnt1==1){
            Canvas.drawColor(Color.parseColor("#0099DD"));
        }else if(background_cnt1==2){
            Canvas.drawColor(Color.parseColor("#0099DD"));
        }else if(background_cnt1==3){
            Canvas.drawColor(Color.parseColor("#0099DD"));
        }else if(background_cnt1==4){
            Canvas.drawColor(Color.parseColor("#0086C6"));
        }else if(background_cnt1==5) {
            Canvas.drawColor(Color.parseColor("#0086C6"));
        }else if(background_cnt1==6){
            Canvas.drawColor(Color.parseColor("#0086C6"));
        }else if(background_cnt1==7){
            Canvas.drawColor(Color.parseColor("#0076B3"));
        }else if(background_cnt1==8){
            Canvas.drawColor(Color.parseColor("#0076B3"));
        }else if(background_cnt1==9){
            Canvas.drawColor(Color.parseColor("#0076B3"));
        }else if(background_cnt1==10) {
            Canvas.drawColor(Color.parseColor("#0065AD"));
        }else if(background_cnt1==11){
            Canvas.drawColor(Color.parseColor("#0065AD"));
        }else if(background_cnt1==12){
            Canvas.drawColor(Color.parseColor("#0065AD"));
        }else if(background_cnt1==13){
            Canvas.drawColor(Color.parseColor("#00538A"));
        }else if(background_cnt1==14){
            Canvas.drawColor(Color.parseColor("#00538A"));
        }else if(background_cnt1==15) {
            Canvas.drawColor(Color.parseColor("#00538A"));
        }else if(background_cnt1==16){
            Canvas.drawColor(Color.parseColor("#004277"));
        }else if(background_cnt1==17){
            Canvas.drawColor(Color.parseColor("#004277"));
        }else if(background_cnt1==18){
            Canvas.drawColor(Color.parseColor("#004277"));
        }else if(background_cnt1==19){
            Canvas.drawColor(Color.parseColor("#002E62"));
        }else if(background_cnt1==20) {
            Canvas.drawColor(Color.parseColor("#002E62"));
        }else if(background_cnt1==21) {
            Canvas.drawColor(Color.parseColor("#002E62"));
        }else if(background_cnt1==22){
            Canvas.drawColor(Color.parseColor("#001E52"));
        }else if(background_cnt1==23){
            Canvas.drawColor(Color.parseColor("#001E52"));
        }else if(background_cnt1==24){
            Canvas.drawColor(Color.parseColor("#001E52"));
        }else if(background_cnt1==25) {
            Canvas.drawColor(Color.parseColor("#000A44"));
        }else if(background_cnt1==26){
            Canvas.drawColor(Color.parseColor("#000A44"));
        }else if(background_cnt1==27){
            Canvas.drawColor(Color.parseColor("#000A44"));
        }else if(background_cnt1==28){
            Canvas.drawColor(Color.parseColor("#00003A"));
        }else if(background_cnt1==29){
            Canvas.drawColor(Color.parseColor("#00003A"));
        }else if(background_cnt1==30) {
            Canvas.drawColor(Color.parseColor("#00003A"));
        }else if(background_cnt1==31){
            Canvas.drawColor(Color.parseColor("#000034"));
        }else if(background_cnt1==32){
            Canvas.drawColor(Color.parseColor("#000034"));
        }else if(background_cnt1==33){
            Canvas.drawColor(Color.parseColor("#000034"));
        }else if(background_cnt1==34){
            Canvas.drawColor(Color.parseColor("#000034"));
        }else if(background_cnt1==35) {
            Canvas.drawColor(Color.parseColor("#000034"));
        }else if(background_cnt1==36){
            Canvas.drawColor(Color.parseColor("#000034"));
        }else if(background_cnt1==37){
            Canvas.drawColor(Color.parseColor("#000034"));
        }else if(background_cnt1==38){
            Canvas.drawColor(Color.parseColor("#000034"));
        }else if(background_cnt1==39){
            Canvas.drawColor(Color.parseColor("#000034"));
        }else if(background_cnt1==40) {
            Canvas.drawColor(Color.parseColor("#000000"));
        }


        if(object_cnt1==1){
            Canvas.drawBitmap(object1[0].getBitmap(),object_x[0], object_y[0], null);
            Canvas.drawBitmap(object1[1].getBitmap(),object_x[1], object_y[1], null);
        }else if(object_cnt1==2){
            Canvas.drawBitmap(object2[0].getBitmap(),object_x[0], object_y[0], null);
            Canvas.drawBitmap(object2[1].getBitmap(),object_x[1], object_y[1], null);
        }else if(object_cnt1==3){
            Canvas.drawBitmap(object3[0].getBitmap(),object_x[0], object_y[0], null);
            Canvas.drawBitmap(object3[1].getBitmap(),object_x[1], object_y[1], null);
        }else if(object_cnt1==4){
            Canvas.drawBitmap(object4[0].getBitmap(),object_x[0], object_y[0], null);
            Canvas.drawBitmap(object4[1].getBitmap(),object_x[1], object_y[1], null);
        }

        Rect chh1 = new Rect(x, y, x+spaceshuttle_width/7, y+spaceshuttle_height/7);
        Canvas.drawBitmap(spaceshuttle[spaceshuttle_cnt1].getBitmap(),null,chh1,null);
        Paint p=new Paint();
        Canvas.drawText("xx"+xx+"yy"+yy, 10, 30, p);

    }


    @Override
    public boolean onTouchEvent(MotionEvent event){
        int action=event.getAction();
        xx=(int)(event.getX()/scale_x);
        yy=(int)(event.getY()/scale_y);
        Rect rt=new Rect();
        if(event.getAction()== MotionEvent.ACTION_DOWN || event.getAction()==MotionEvent.ACTION_MOVE){
            rt.set(5,700,100,800);
            if(rt.contains(xx,yy)){
                sXL=true;
            }
            rt.set(380,700,475,800);
            if(rt.contains(xx,yy)){
                sXR=true;
            }
        }else{
            sXL=false;
            sXR=false;
        }
        return true;
    }

    class BackThread extends Thread{
        public void run(){
            while(retry){
                try{
                    Handler1.sendEmptyMessage(0);
                    Thread.sleep(2);
                }catch
                (InterruptedException e){;}
            }
        }
    }

    Handler Handler1=new Handler(){
        public void handleMessage(Message msg){
            if(msg.what==0){
                if(delay_time3<50){
                    count2++;
                }
                if(delay_time2<50){
                    count++;
                }
                if(delay_time1<50){
                    delay_time1++;
                }

                background_change();
                object_change();
                object_move();
                ch_img_sub();
                invalidate();
            }

        }
    };

    private void ch_img_sub(){
        if(sXL==true){
            if(x>=0){
                x-=1;
            }else{
                x=0;
            }
        }else if(sXR==true){
            if(x<=480-spaceshuttle_width/7){
                x+=1;
            }else{
                x=480-spaceshuttle_height/7;
            }
        }

        if(delay_time1==45){
            spaceshuttle_cnt1++;
            if(spaceshuttle_cnt1>1){
                spaceshuttle_cnt1=0;
            }
            delay_time1=0;
        }
    };

    private void background_change(){
        if(count2<500){                                     //1
            background_cnt1=1;
        }else if(count>=500 && count<1000){
            background_cnt1=2;
        }else if(count>=1000 && count<1500){
            background_cnt1=3;
        }else if(count>=1500 && count<2000){
            background_cnt1=4;
        }else if(count>=2000 && count<2500){
            background_cnt1=5;
        }else if(count>=2500 && count<3000){
            background_cnt1=6;
        }else if(count>=3000 && count<3500){
            background_cnt1=7;
        }else if(count>=3500 && count<4000){
            background_cnt1=8;
        }else if(count>=4000 && count<4500){
            background_cnt1=9;
        }else if(count>=4500 && count<5000){                 //10
            background_cnt1=10;
        }else if(count>=5000 && count<5500){
            background_cnt1=11;
        }else if(count>=5500 && count<6000){
            background_cnt1=12;
        }else if(count>=6000 && count<6500){
            background_cnt1=13;
        }else if(count>=6500 && count<7000){
            background_cnt1=14;
        }else if(count>=7000 && count<7500){
            background_cnt1=15;
        }else if(count>=7500 && count<8000){
            background_cnt1=16;
        }else if(count>=8000 && count<8500){
            background_cnt1=17;
        }else if(count>=8500 && count<9000){
            background_cnt1=18;
        }else if(count>=9000 && count<9500){
            background_cnt1=19;
        }else if(count>=9500 && count<10000){                //20
            background_cnt1=20;
        }else if(count>=10000 && count<10500){
            background_cnt1=21;
        }else if(count>=10500 && count<11000){
            background_cnt1=22;
        }else if(count>=11000 && count<11500){
            background_cnt1=23;
        }else if(count>=11500 && count<12000){
            background_cnt1=24;
        }else if(count>=12000 && count<12500){
            background_cnt1=25;
        }else if(count>=12500 && count<13000){
            background_cnt1=26;
        }else if(count>=13000 && count<13500){
            background_cnt1=27;
        }else if(count>=13500 && count<14000){
            background_cnt1=28;
        }else if(count>=14000 && count<14500){
            background_cnt1=29;
        }else if(count>=14500 && count<15000){                //30
            background_cnt1=30;
        }else if(count>=15000 && count<15500){
            background_cnt1=31;
        }else if(count>=15500 && count<16000){
            background_cnt1=32;
        }else if(count>=16000 && count<16500){
            background_cnt1=33;
        }else if(count>=16500 && count<17000){
            background_cnt1=34;
        }else if(count>=17000 && count<17500){
            background_cnt1=35;
        }else if(count>=17500 && count<18000){
            background_cnt1=36;
        }else if(count>=18000 && count<18500){
            background_cnt1=37;
        }else if(count>=18500 && count<19000){
            background_cnt1=38;
        }else if(count>=19000 && count<20000){
            background_cnt1=39;
        }else if(count>=20000) {                //40
            background_cnt1=40;
        }
    };

    private void object_change(){
        if(count<5000){
            object_cnt1=1;
        }else if(count>=5000 && count<10000){
            object_cnt1=2;
        }else if(count>=10000 && count<15000){
            object_cnt1=3;
        }else if(count>=20000){
            object_cnt1=4;
        }
    };

    private void object_move(){
        object_y[0]+=1;
        object_y[1]+=2;
        if(object_y[0]>900)object_x_y_po(0);
        if(object_y[1]>900)object_x_y_po(1);
    };

    private void object_x_y_po(int cnt){
        Random rnd = new Random();
        int rnd_num_x=rnd.nextInt(400)+1;
        int rnd_num_y=rnd.nextInt(400)+200;
        object_x[cnt]=rnd_num_x;
        object_y[cnt]=-rnd_num_y;
    };


}