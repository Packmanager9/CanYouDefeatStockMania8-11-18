package ditzler.cole.myapplication2.feature2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.icu.text.TimeZoneNames;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.Serializable;
import java.lang.reflect.Type;

import ditzler.cole.myapplication2.feature2.protomon.monst;

public class CustomMonsterTopLayer extends AppCompatActivity {

    Button StatAdjust, MoveAdjust, SpriteAdjust, ColorAdjust, FinishActivity, Namer;
    EditText TypeName;
    double health, speed, attack, defense, moveslotheal, moveslotattack, moveslotdefense, moveslotspeed;
    TextView Health, Defense, Attack, Speed;
    String  Hs  = "Health %.0f";
    String  Ss  = "Speed %.0f";
    String  Ds  = "Defense %.0f";
    String  As  = "Attack %.0f";
    String empty = "";
    String NamePass = "";


    public static class StringObject implements Cloneable, Parcelable, Serializable {


        public String NameString;


        public StringObject (String namestring){
            NameString = namestring;
        }

        protected StringObject(Parcel in) {
        }

        public static final Creator<StringObject> CREATOR = new Creator<StringObject>() {
            @Override
            public StringObject createFromParcel(Parcel in) {
                return new StringObject(in);
            }

            @Override
            public StringObject[] newArray(int size) {
                return new StringObject[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
        }
    }


    public static class monst implements Cloneable, Parcelable, Serializable {

        public double Idnum;
        public double Speed;
        public double Attack;
        public double Defense;
        public double Health;
        public int Moveslotattack;
        public int Moveslotspeed;
        public int Moveslotdefense;
        public int Moveslotheal;
        public int UniqueID;

        public monst (double idnum, double speed, double attack, double defense, double health, int moveslotattack, int moveslotspeed, int moveslotdefense, int moveslotheal, int uniqueID){

            Idnum = idnum;
            Speed = speed;
            Attack = attack;
            Defense = defense;
            Health = health;
            Moveslotattack = moveslotattack;
            Moveslotspeed = moveslotspeed;
            Moveslotdefense = moveslotdefense;
            Moveslotheal = moveslotheal;
            UniqueID = uniqueID;
        }

        public monst (protomon.monst monst){

            this.Idnum = monst.Idnum;
            this.Speed = monst.Speed;
            this.Attack = monst.Attack;
            this.Defense = monst.Defense;
            this.Health = monst.Health;
            this.Moveslotattack = monst.Moveslotattack;
            this.Moveslotspeed = monst.Moveslotspeed;
            this.Moveslotdefense = monst.Moveslotdefense;
            this.Moveslotheal = monst.Moveslotheal;
            this.UniqueID = monst.UniqueID;
        }

        protected monst(Parcel in) {
            Idnum = in.readDouble();
            Speed = in.readDouble();
            Attack = in.readDouble();
            Defense = in.readDouble();
            Health = in.readDouble();
            Moveslotattack = in.readInt();
            Moveslotspeed = in.readInt();
            Moveslotdefense = in.readInt();
            Moveslotheal = in.readInt();
            UniqueID = in.readInt();
        }

        public static final Creator<protomon.monst> CREATOR = new Creator<protomon.monst>() {
            @Override
            public protomon.monst createFromParcel(Parcel in) {
                return new protomon.monst(in);
            }

            @Override
            public protomon.monst[] newArray(int size) {
                return new protomon.monst[size];
            }
        };

        public protomon.monst clone() throws CloneNotSupportedException {
            protomon.monst clonedmonster = (protomon.monst) super.clone();
            return clonedmonster;
        }

        @Override
        public int describeContents() {
            return (int)Idnum;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeDouble(Idnum);
            dest.writeDouble(Speed);
            dest.writeDouble(Attack);
            dest.writeDouble(Defense);
            dest.writeDouble(Health);
            dest.writeInt(Moveslotattack);
            dest.writeInt(Moveslotspeed);
            dest.writeInt(Moveslotdefense);
            dest.writeInt(Moveslotheal);
            dest.writeInt(UniqueID);
        }
    }

    protomon.monst Customizer = new protomon.monst(83,speed,attack,defense,health,0,0,0,0,0);


    StringObject NameObject = new StringObject("");

    protected void onResume() {
        super.onResume();
        StatsReturn();
        DisplayChangesToStats();
    }

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monster_customizer_top_activity);

        StatAdjust = (Button) findViewById(R.id.StatsActivity);
        ColorAdjust = (Button) findViewById(R.id.ColorActivity);
        SpriteAdjust = (Button) findViewById(R.id.PictureActivity);
        Namer = (Button) findViewById(R.id.EnterNames);
        TypeName = (EditText) findViewById(R.id.TextNames);
        MoveAdjust = (Button) findViewById(R.id.MovesActivity);
        FinishActivity = (Button) findViewById(R.id.Finish);
        Health =(TextView) findViewById(R.id.Health);
        Speed =(TextView) findViewById(R.id.Speed);
        Attack =(TextView) findViewById(R.id.Attack);
        Defense =(TextView) findViewById(R.id.Defense);


        StatsReturn();
        DisplayChangesToStats();




        Namer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bant = TypeName.getText().toString();
                if((!TextUtils.isEmpty(bant))) {
                    NamePass = bant;
                    NameObject.NameString = NamePass;
                }
                TypeName.setText("");
            }
        });




        StatAdjust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatsDelve();

                StatsReturn();
                DisplayChangesToStats();

            }
        });

        ColorAdjust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StatsReturn();
            }
        });

        SpriteAdjust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        MoveAdjust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        FinishActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onSmackPressed(Customizer);

            }

            public void onSmackPressed(protomon.monst Monster){


                if ((Monster.Attack*Monster.Speed*Monster.Health*Monster.Defense) <= 0){



                }else {




                    String DustMe = "%s";
                    Context ProtomonContext = getApplicationContext();

                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
                    SharedPreferences.Editor editor = prefs.edit();

                    Gson gson = new Gson();

                    String json = gson.toJson(Customizer);
                    editor.putString("WorkingMonster", json);
                    String jsonname = gson.toJson(NameObject);
                    editor.putString("Name", jsonname);
                    editor.commit();


                    Intent F = new Intent(CustomMonsterTopLayer.this, protomon.class);
                    String keyIdentifer  = "Name";


                    Bundle extras = new Bundle();
                    extras.putString("Name", keyIdentifer);
                    F.putExtras(extras);

                    //F.putExtras(NamePass, keyIdentifer );
                 //   Bundle b = new Bundle();
                  //  b.putParcelable("WorkingMonster", Customizer);
                  // b.putParcelable("WorkingMonster", new protomon.monst(83, attack, speed, defense, health, 0, 0, 0, 0, 0));

                    setResult(420, F);
                    finish();
                }
            }

        });


    }

    public void DisplayChangesToStats(){
        empty = String.format(Hs, Customizer.Health);
        Health.setText(empty);
        empty = String.format(Ss, Customizer.Speed);
        Speed.setText(empty);
        empty = String.format(Ds, Customizer.Defense);
        Defense.setText(empty);
        empty = String.format(As, Customizer.Attack);
        Attack.setText(empty);
    }



    public void StatsDelve() {
        Intent go = new Intent(this, StatAdjustments.class);
        startActivity(go);
    }

    public void StatsReturn() {
        String DustMe = "%s";
        String BustMe = "%s";
        Context ProtomonContext = getApplicationContext();


        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
        SharedPreferences.Editor editor = prefs.edit();


        String TrustMe = String.format("CustomSlotX");
        Gson gson = new Gson();
        String jsonX = gson.toJson(Customizer);
        editor.putString(TrustMe, jsonX);
        editor.commit();



        //Gson gson = new Gson();
        String json = prefs.getString("CustomSlot", "");
        Intent i = new Intent();
        Bundle b = new Bundle();
        if (gson.fromJson(json, (Type) protomon.monst.class) != null) {
            Customizer = gson.fromJson(json, (Type) protomon.monst.class);
        }




        i.putExtras(b);
        i.setClass(this, GarlitosLab.class);
    }
}
