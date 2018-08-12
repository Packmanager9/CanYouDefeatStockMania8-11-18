package ditzler.cole.myapplication2.feature2;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.Serializable;
import java.util.Random;

public class HareSplitting extends AppCompatActivity {

int angletesterone, angletestertwo = 0;
int angleproduct = 1;
    int babycountercounter;
    Button BuyFoodButton, ShopButton, BreedButton, StartButton, SellBabies, KeepBabies;
    ImageButton SelectParentOneImageButton, SelectParentEyesOneImageButton, SelectParentEarsOneImageButton;
    String SizeTest = "%s";
    String PassColor = "#%s%s%s%s%s%s";
    int babyonesizedummy;
    int harealphaeight;
    int shopcounter, BabyNumber = 0;
    double HareMoney;
    double food = 99999;
    TextView HareMoneyDisplay, HareFoodDisplay;
    int SellBabiesUnlocker, babycounter, babyOneCreatedCounter, babyTwoCreatedCounter, babyThreeCreatedCounter, babyFourCreatedCounter, babyFiveCreatedCounter, babySixCreatedCounter, babySevenCreatedCounter, babyEightCreatedCounter, ShopCounterBabyNonNullifier = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hare_splitting);
        ShopButton = (Button) findViewById(R.id.Shop);
        BuyFoodButton = (Button) findViewById(R.id.BuyFood);
        BreedButton = (Button) findViewById(R.id.Breed);
        BreedButton.setVisibility(View.INVISIBLE);
        StartButton = (Button) findViewById(R.id.Start);
        KeepBabies = (Button) findViewById(R.id.KeepAll);
        SellBabies = (Button) findViewById(R.id.SellAll);
        SelectParentEyesOneImageButton = (ImageButton) findViewById(R.id.SelectParentEyesOneButton);
        SelectParentEarsOneImageButton = (ImageButton) findViewById(R.id.SelectParentEarsOneButton);
        SelectParentOneImageButton = (ImageButton) findViewById(R.id.SelectParentOneButton);
        SelectParentOneImageButton.setImageResource(R.drawable.rabbitbody);
        SelectParentEarsOneImageButton.setImageResource(R.drawable.rabbitearsroundspotlongsplit);
        SelectParentEyesOneImageButton.setImageResource(R.drawable.rabbiteyesmedium);
        SelectParentOneImageButton.setBackgroundColor(Color.TRANSPARENT);
        SelectParentEyesOneImageButton.setBackgroundColor(Color.TRANSPARENT);
        SelectParentEarsOneImageButton.setBackgroundColor(Color.TRANSPARENT);
        SelectParentOneImageButton.setVisibility(View.INVISIBLE);
        SelectParentEarsOneImageButton.setVisibility(View.INVISIBLE);
        SelectParentEyesOneImageButton.setVisibility(View.INVISIBLE);
        SellBabies.setVisibility(View.INVISIBLE);
        KeepBabies.setVisibility(View.INVISIBLE);
        BuyFoodButton.setVisibility(View.INVISIBLE);


        KeepBabies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KeepBabies.setVisibility(View.INVISIBLE);
                SellBabies.setVisibility(View.INVISIBLE);
                SellBabiesUnlocker = 1;
                SetBabiesDeleted();
                SetBabiesInvisible();
                OpenHutch(); // somehow make babies go into hutch

            }
        });


        SellBabies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!hairy.Sex.equals(lola.Sex) && babyEightCreatedCounter != 0){
                KeepBabies.setVisibility(View.INVISIBLE);
                SellBabies.setVisibility(View.INVISIBLE);
                babyOneCreatedCounter = 0;
                babyTwoCreatedCounter = 0;
                babyThreeCreatedCounter = 0;
                babyFourCreatedCounter = 0;
                babyFiveCreatedCounter = 0;
                babySixCreatedCounter = 0;
                babySevenCreatedCounter = 0;
                babyEightCreatedCounter = 0;
                    SetBabiesDeleted();
                    SetBabiesInvisible();
                HareMoney = HareMoney + (BabyOne.Price + BabyTwo.Price + BabyThree.Price + BabyFour.Price + BabyFive.Price + BabySix.Price + BabySeven.Price + BabyEight.Price);
                String HareMoneyPass = "Money: %s";
                String HarePassAgain = String.format(HareMoneyPass, HareMoney);
                HareMoneyDisplay = (TextView) findViewById(R.id.HareMoneyView);
                HareMoneyDisplay.setText(HarePassAgain);
                // add money equal to the sum of the babies sell prices (create sell price and sell price determining method) to HareMoney, Delete babies.
                SelectRabbitHutch();
                }
            }
        });

        SelectParentOneImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayBodyBabyFiveMethod();
                SelectParentOneImageButton.setVisibility(View.INVISIBLE);
                SelectParentEarsOneImageButton.setVisibility(View.INVISIBLE);
                SelectParentEyesOneImageButton.setVisibility(View.INVISIBLE);
            }
        });


        SelectParentEarsOneImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayBodyBabyFiveMethod();
                SelectParentOneImageButton.setVisibility(View.INVISIBLE);
                SelectParentEarsOneImageButton.setVisibility(View.INVISIBLE);
                SelectParentEyesOneImageButton.setVisibility(View.INVISIBLE);
            }
        });


        SelectParentEyesOneImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayBodyBabyFiveMethod();
                SelectParentOneImageButton.setVisibility(View.INVISIBLE);
                SelectParentEarsOneImageButton.setVisibility(View.INVISIBLE);
                SelectParentEyesOneImageButton.setVisibility(View.INVISIBLE);
            }
        });

        StartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // SelectParentOneImageButton.setVisibility(View.VISIBLE);
                // SelectParentEarsOneImageButton.setVisibility(View.VISIBLE);
                // SelectParentEyesOneImageButton.setVisibility(View.VISIBLE);
                BreedButton.setVisibility(View.VISIBLE);
                StartButton.setVisibility(View.INVISIBLE);
                //  DisplayButtonMethod();
                SizeTextViewTwoMethod();
                SexTextViewTwoMethod();
                SexTextViewOneMethod();
                SizeTextViewOneMethod();
                DisplayBodyOneMethod();
                DisplayEarsOneMethod();
                DisplayEyesOneMethod();
                DisplayTailOneMethod();
                DisplayBodyTwoMethod();
                DisplayEyeTwoMethod();
                DisplayEarsTwoMethod();
                DisplayTailTwoMethod();
            }
        });

        ShopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


if (ShopCounterBabyNonNullifier == 1) {
    if ((shopcounter % 2) == 0) {
        SetAdultsInvisible();
        SetBabiesInvisible();
        DisappearTextViews();
        BreedButton.setVisibility(View.INVISIBLE);
        KeepBabies.setVisibility(View.INVISIBLE);
        SellBabies.setVisibility(View.INVISIBLE);
        BuyFoodButton.setVisibility(View.VISIBLE);
        shopcounter = shopcounter + 1;
    } else {
        SetAdultsVisible();
        ReappearTextViews();
        DisplayAllBabies();

        KeepBabies.setVisibility(View.VISIBLE);
        BreedButton.setVisibility(View.VISIBLE);
        SellBabies.setVisibility(View.VISIBLE);

        BuyFoodButton.setVisibility(View.INVISIBLE);
        shopcounter = shopcounter + 1;
    }

}

            }
        });

        BuyFoodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            food = HareMoney + food;
                String HareFoodPass = "Food: %s";

                String HareMoneyPass = "Money: %s";
                String HarePassAgain = String.format(HareFoodPass, food);
                HareFoodDisplay = (TextView) findViewById(R.id.HareFoodView);
                HareFoodDisplay.setText(HarePassAgain);
            HareMoney = 0;
                String HarePassMoneyAgain = String.format(HareMoneyPass, HareMoney);
                HareMoneyDisplay = (TextView) findViewById(R.id.HareMoneyView);
                HareMoneyDisplay.setText(HarePassMoneyAgain);

            }
        });


        BreedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (food >= BabyNumber) {
                    food = food - BabyNumber;

                    String HareFoodPass = "Food: %s";

                    String HareMoneyPass = "Money: %s";
                    String HarePassAgain = String.format(HareFoodPass, food);
                    String HarePassMoneyAgain = String.format(HareMoneyPass, HareMoney);
                    HareFoodDisplay = (TextView) findViewById(R.id.HareFoodView);
                    HareFoodDisplay.setText(HarePassAgain);

                    HareMoneyDisplay = (TextView) findViewById(R.id.HareMoneyView);
                    HareMoneyDisplay.setText(HarePassMoneyAgain);
                    CreateBabies();
                    DisplayAllBabies();
                    KeepBabies.setVisibility(View.VISIBLE);
                    if (SellBabiesUnlocker == 1) {
                        SellBabies.setVisibility(View.VISIBLE);
                    }

                    if (hairy.Sex.equals(lola.Sex)) {

                        SetBabiesInvisible();
                    }
                }
            }
        });

    }


    private Integer Bodies[] = {R.drawable.rabbitbody, R.drawable.rabbitbodyspotsone, R.drawable.rabbitbodyspotstwo, R.drawable.rabbitbodystar, R.drawable.rabbitbodyrings, R.drawable.rabbitbodystripes, R.drawable.rabbitbodystripestwo, R.drawable.rabbitbodybeans, R.drawable.rabbitbodybigspot, R.drawable.rabbitbodytarget, R.drawable.rabbitbodyx, R.drawable.rabbitbodynine};

    private Integer Ears[] = {R.drawable.rabbitearsroundspotlongsplit, R.drawable.rabbitearsroundspotlongsplitvery,R.drawable.rabbitearsroundspotlongsplithuge, R.drawable.rabbitearspointylong, R.drawable.rabbitearspointyclose, R.drawable.rabbitearsroundlong, R.drawable.rabbitearsroundspotlongclose, R.drawable.rabbitearsnarwhalhorn};

    private Integer Eyes[] = {R.drawable.rabbiteyesmedium, R.drawable.rabbiteyeswide, R.drawable.rabbiteyes};

    private Integer Tail[] = {R.drawable.rabbitfluffytailflat, R.drawable.rabbitfluffytail, R.drawable.rabbitfluffytailwide, R.drawable.rabbitfeathertail, R.drawable.rabbitfeathertailnarrow, R.drawable.rabbitfeathertailtwo, R.drawable.rabbitfluffytailwide, R.drawable.rabbitfluffytail, R.drawable.rabbitfluffytailwide, R.drawable.rabbitfluffytail, R.drawable.rabbitfluffytailwide, R.drawable.rabbitfluffytail, R.drawable.rabbitfluffytailwide};

    ImageView HareTailTwoView, HareTailBabyEightView, HareTailBabySevenView, HareTailBabySixView, HareTailBabyFiveView, HareTailBabyFourView, HareTailBabyThreeView, HareTailBabyTwoView, HareTailBabyOneView, HareTailOneView, HareEarsTwoView, HareEyesTwoView, HareEarsBabyThreeView, HareEyesBabyThreeView, HareEarsBabyFourView, HareEyesBabyFourView, HareEarsBabyFiveView, HareEyesBabyFiveView, HareEarsBabySixView, HareEyesBabySixView, HareEarsBabySevenView, HareEyesBabySevenView, HareEarsBabyEightView, HareEyesBabyEightView, HareEyesBabyTwoView, HareEarsBabyTwoView, HareEarsBabyOneView, HareEyesBabyOneView, HareEyesOneView, HareEarsOneView, HareBodyOneView, HareBodyBabyOneView, HareBodyBabyTwoView, HareBodyTwoView, HareBodyBabyThreeView, HareBodyBabyFourView, HareBodyBabyFiveView, HareBodyBabySixView, HareBodyBabySevenView, HareBodyBabyEightView;
    TextView SexViewOneView, SizeViewOneView, OoneView, OtwoView, OthreeView, SexViewTwoView, SizeViewTwoView;
    // int sizesetter;
    String Male = "Male";
    String Female = "Female";

    static class Hare implements Serializable {

        public String Sex;
        public int size;
        public String Color;
        int HareAlpha;
        int TailAlpha;
        int BodyType;
        public int At;
        public int Bt;
        public int Ct;
        public int Dt;
        public int Et;
        public int Ft;
        public int eyeAt;
        public int eyeBt;
        public int eyeCt;
        public int eyeDt;
        public int eyeEt;
        public int eyeFt;
        public int earAt;
        public int earBt;
        public int earCt;
        public int earDt;
        public int earEt;
        public int earFt;
        public int tailAt;
        public int tailBt;
        public int tailCt;
        public int tailDt;
        public int tailEt;
        public int tailFt;
        public int TailType;
        public int EarsType;
        public int EarsLength;
        public int EyesType;
        public double Price;
        public int AngleOne;
        public int AngleTwo;
        public int AngleThree;
        public int AngleFour;
        public int AngleFive;
        public int AngleSix;
        public int AngleSeven;
        public int AngleEight;
        public int AngleNine;
        public int AngleTen;
        public int AngleTotal;

        public Hare(String sex, int Size, String color, int harealpha,int tailalpha, int bodytype, int at, int bt, int ct, int dt, int et, int ft, int eyeat, int eyebt, int eyect, int eyedt, int eyeet, int eyeft, int earat, int earbt, int earct, int eardt, int earet, int earft,  int tailat, int tailbt, int tailct, int taildt, int tailet, int tailft, int earstype, int tailstype, int earslength, int eyestype, double price, int angleone, int angletwo, int anglethree, int anglefour, int anglefive, int anglesix, int angleseven, int angleeight, int anglenine, int angleten) {
            Sex = sex;
            size = Size;
            Color = color;
            HareAlpha = harealpha;
            TailAlpha = tailalpha;
            BodyType = bodytype;
            At = at;
            Bt = bt;
            Ct = ct;
            Dt = dt;
            Et = et;
            Ft = ft;
            eyeAt = eyeat;
            eyeBt = eyebt;
            eyeCt = eyect;
            eyeDt = eyedt;
            eyeEt = eyeet;
            eyeFt = eyeft;
            earAt = earat;
            earBt = earbt;
            earCt = earct;
            earDt = eardt;
            earEt = earet;
            earFt = earft;
            tailAt = tailat;
            tailBt = tailbt;
            tailCt = tailct;
            tailDt = taildt;
            tailEt = tailet;
            tailFt = tailft;
            TailType = tailstype;
            EarsType = earstype;
            EarsLength = earslength;
            EyesType = eyestype;
            Price = price;


             AngleOne = angleone;
             AngleTwo = angletwo;
             AngleThree = anglethree;
             AngleFour = anglefour;
             AngleFive = anglefive;
             AngleSix = anglesix;
             AngleSeven = angleseven;
             AngleEight = angleeight;
             AngleNine = anglenine;
             AngleTen = angleten;
             AngleTotal = angleone + angletwo + anglethree + anglefour + anglefive + anglesix + angleseven + angleeight + anglenine + angleten;
        }


    }

    static class HareColor {

        public int At;
        public int Bt;
        public int Ct;
        public int Dt;
        public int Et;
        public int Ft;

        public HareColor(int at, int bt, int ct, int dt, int et, int ft) {
            At = at;
            Bt = bt;
            Ct = ct;
            Dt = dt;
            Et = et;
            Ft = ft;
        }
    }

    HareColor lolascolor = new HareColor(ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod());
    HareColor hairyscolor = new HareColor(ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod());

    //   Hare hairy = new Hare(SetSexMethod(), SetSizeMethod(), FinalColorMethod(lolascolor.At,lolascolor.Bt,lolascolor.Ct,lolascolor.Dt,lolascolor.Et,lolascolor.Ft), SetAlphaMethod (), BodyTypeMethod(), 0,0,0,0,0,0);
    //   Hare lola = new Hare(SetSexMethod(), SetSizeMethod(), FinalColorMethod(hairyscolor.At,hairyscolor.Bt,hairyscolor.Ct,hairyscolor.Dt,hairyscolor.Et,hairyscolor.Ft), SetAlphaMethod (), BodyTypeMethod(), 15, 15, 15,15,15,15 );

    Hare hairy = new Hare(Male, SetSizeMethod(), FinalColorMethod(lolascolor.At, lolascolor.Bt, lolascolor.Ct, lolascolor.Dt, lolascolor.Et, lolascolor.Ft),  SetAlphaMethod(),SetTailAlphaMethod(), BodyTypeMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), SetEarMethod(), SetTailMethod(), EarLengthMethod(), 0, 0, SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );
    Hare lola = new Hare(Female, SetSizeMethod(), FinalColorMethod(hairyscolor.At, hairyscolor.Bt, hairyscolor.Ct, hairyscolor.Dt, hairyscolor.Et, hairyscolor.Ft), SetAlphaMethod(),SetTailAlphaMethod(), BodyTypeMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), SetEarMethod(), SetTailMethod(), EarLengthMethod(), 0, 0,SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation()  );


    Hare BabyOne, BabyTwo, BabyThree, BabyFour, BabyFive, BabySix, BabySeven, BabyEight = new Hare(null, 0, "#123456", 128,128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0,0,0,0,0,0, SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation());
    Hare BabyHares[] = new Hare[9999];

    //  Hare hairy = new Hare(Male, 139, FinalColorMethod(lolascolor.At,lolascolor.Bt,lolascolor.Ct,lolascolor.Dt,lolascolor.Et,lolascolor.Ft), SetAlphaMethod (), BodyTypeMethod(), 0,0,0,0,15,15, ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(), ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(), SetEarMethod (), EarLengthMethod(), 0);
    // Hare lola = new Hare(Female, 139, FinalColorMethod(hairyscolor.At,hairyscolor.Bt,hairyscolor.Ct,hairyscolor.Dt,hairyscolor.Et,hairyscolor.Ft), SetAlphaMethod (), BodyTypeMethod(),  15,15,0,0,0,0,  ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),  ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(), SetEarMethod (), EarLengthMethod(), 0);

    int BabyHareOneScaler;
    int BabyHareTwoScaler;
    int BabyHareThreeScaler;
    int BabyHareFourScaler;
    int BabyHareFiveScaler;
    int BabyHareSixScaler;
    int BabyHareSevenScaler;
    int BabyHareEightScaler;
    //   Hare hairy = new Hare(Male, SetSizeMethod(), FinalColorMethod(lolascolor.At,lolascolor.Bt,lolascolor.Ct,lolascolor.Dt,lolascolor.Et,lolascolor.Ft), SetAlphaMethod (), BodyTypeMethod(), 15, 15, 15,15,15,15);
    //   Hare lola = new Hare(Female, SetSizeMethod(), FinalColorMethod(hairyscolor.At,hairyscolor.Bt,hairyscolor.Ct,hairyscolor.Dt,hairyscolor.Et,hairyscolor.Ft), SetAlphaMethod (), BodyTypeMethod(),  0,0,0,0,0,0);

    public void SexTextViewOneMethod() {
        SexViewOneView = (TextView) findViewById(R.id.SexViewOne);


        if (hairy.Sex.equals(Male)) {
            SexViewOneView.setText(Male);

        } else {
            SexViewOneView.setText(Female);

        }


    }


    public int convertToDp(int input) { // Get the screen's density scale
        final float scale = getResources().getDisplayMetrics().density; // Convert the dps to pixels, based on density scale
        return (int) (input * scale + 0.5f);
    }

    public void CreateBabies() { // Do the baby creations

        SizeTextViewTwoMethod();
        SexTextViewTwoMethod();
        SexTextViewOneMethod();
        SizeTextViewOneMethod();
        DisplayBodyOneMethod();
        DisplayEarsOneMethod();
        DisplayEyesOneMethod();
        DisplayTailOneMethod();
        DisplayBodyTwoMethod();
        DisplayEyeTwoMethod();
        DisplayEarsTwoMethod();
        DisplayTailTwoMethod();


        if ((hairy.Sex.equals(Male) && lola.Sex.equals(Male)) || (hairy.Sex.equals(Female) && lola.Sex.equals(Female))) {

            if (!hairy.Sex.equals(lola.Sex)){


            }




        } else {
            BabyMethod(hairy, lola);
            BabyMethodTwo(hairy, lola);

            BabyMethodThree(hairy, lola);
            BabyMethodFour(hairy, lola);
            BabyMethodFive(hairy, lola);
            BabyMethodSix(hairy, lola);
            BabyMethodSeven(hairy, lola);
            BabyMethodEight(hairy, lola);


            SetBabyEightScaler();
            DisplayEarsBabyEightMethod();
            DisplayEyesBabyEightMethod();
            DisplayBodyBabyEightMethod();
            DisplayTailBabyEightMethod();


            SetBabySevenScaler();
            DisplayEarsBabySevenMethod();
            DisplayEyesBabySevenMethod();
            DisplayBodyBabySevenMethod();
            DisplayTailBabySevenMethod();

            SetBabySixScaler();
            DisplayEarsBabySixMethod();
            DisplayEyesBabySixMethod();
            DisplayBodyBabySixMethod();
            DisplayTailBabySixMethod();

            SetBabyFiveScaler();
            DisplayEarsBabyFiveMethod();
            DisplayEyesBabyFiveMethod();
            DisplayBodyBabyFiveMethod();
            DisplayTailBabyFiveMethod();

            SetBabyFourScaler();
            DisplayBodyBabyFourMethod();
            DisplayEarsBabyFourMethod();
            DisplayEyesBabyFourMethod();
            DisplayTailBabyFourMethod();

            SetBabyThreeScaler();
            DisplayBodyBabyThreeMethod();
            DisplayEarsBabyThreeMethod();
            DisplayEyesBabyThreeMethod();
            DisplayTailBabyThreeMethod();

            SetBabyTwoScaler();
            DisplayBodyBabyTwoMethod();
            DisplayEarsBabyTwoMethod();
            DisplayEyesBabyTwoMethod();
            DisplayTailBabyTwoMethod();

            SetBabyOneScaler();
            DisplayBodyBabyOneMethod();
            DisplayEyesBabyOneMethod();
            DisplayEarsBabyOneMethod();
            DisplayTailBabyOneMethod();

        }


        OoneView = (TextView) findViewById(R.id.Oone);
        OoneView.setText("○");
        OoneView.setTextColor(android.graphics.Color.parseColor(FinalColorMethod(hairy.At, hairy.Bt, hairy.Ct, hairy.Dt, hairy.Et, hairy.Ft)));
        OtwoView = (TextView) findViewById(R.id.Otwo);
        OtwoView.setText("○");
        OtwoView.setTextColor(android.graphics.Color.parseColor(FinalColorMethod(lola.At, lola.Bt, lola.Ct, lola.Dt, lola.Et, lola.Ft)));
        OthreeView = (TextView) findViewById(R.id.Othree);
        OthreeView.setText("○");
        OthreeView.setTextColor(android.graphics.Color.parseColor(FinalColorMethod((BabyOne.At), (BabyOne.Bt), (BabyOne.Ct), (BabyOne.Dt), (BabyOne.Et), (BabyOne.Ft))));
/*
        if (!hairy.Sex.equals(lola.Sex)){

            SetBabiesInvisible();
        }
*/
    }


    public void DisplayAllBabies() { // Do the baby creations

        HareBodyBabyOneView.setVisibility(View.VISIBLE);
        HareBodyBabyTwoView.setVisibility(View.VISIBLE);
        HareBodyBabyThreeView.setVisibility(View.VISIBLE);
        HareBodyBabyFourView.setVisibility(View.VISIBLE);
        HareBodyBabyFiveView.setVisibility(View.VISIBLE);
        HareBodyBabySixView.setVisibility(View.VISIBLE);
        HareBodyBabySevenView.setVisibility(View.VISIBLE);
        HareBodyBabyEightView.setVisibility(View.VISIBLE);

        HareEarsBabyOneView.setVisibility(View.VISIBLE);
        HareEarsBabyTwoView.setVisibility(View.VISIBLE);
        HareEarsBabyThreeView.setVisibility(View.VISIBLE);
        HareEarsBabyFourView.setVisibility(View.VISIBLE);
        HareEarsBabyFiveView.setVisibility(View.VISIBLE);
        HareEarsBabySixView.setVisibility(View.VISIBLE);
        HareEarsBabySevenView.setVisibility(View.VISIBLE);
        HareEarsBabyEightView.setVisibility(View.VISIBLE);

        HareEyesBabyOneView.setVisibility(View.VISIBLE);
        HareEyesBabyTwoView.setVisibility(View.VISIBLE);
        HareEyesBabyThreeView.setVisibility(View.VISIBLE);
        HareEyesBabyFourView.setVisibility(View.VISIBLE);
        HareEyesBabyFiveView.setVisibility(View.VISIBLE);
        HareEyesBabySixView.setVisibility(View.VISIBLE);
        HareEyesBabySevenView.setVisibility(View.VISIBLE);
        HareEyesBabyEightView.setVisibility(View.VISIBLE);


        HareTailBabyOneView.setVisibility(View.VISIBLE);
        HareTailBabyTwoView.setVisibility(View.VISIBLE);
        HareTailBabyThreeView.setVisibility(View.VISIBLE);
        HareTailBabyFourView.setVisibility(View.VISIBLE);
        HareTailBabyFiveView.setVisibility(View.VISIBLE);
        HareTailBabySixView.setVisibility(View.VISIBLE);
        HareTailBabySevenView.setVisibility(View.VISIBLE);
        HareTailBabyEightView.setVisibility(View.VISIBLE);
    }


    public void DisappearTextViews() {
        SexViewOneView.setVisibility(View.INVISIBLE); SizeViewOneView.setVisibility(View.INVISIBLE); OoneView.setVisibility(View.INVISIBLE); OtwoView.setVisibility(View.INVISIBLE); OthreeView.setVisibility(View.INVISIBLE); SexViewTwoView.setVisibility(View.INVISIBLE); SizeViewTwoView.setVisibility(View.INVISIBLE);
    }

    public void ReappearTextViews() {
        SexViewOneView.setVisibility(View.VISIBLE); SizeViewOneView.setVisibility(View.VISIBLE); OoneView.setVisibility(View.VISIBLE); OtwoView.setVisibility(View.VISIBLE); OthreeView.setVisibility(View.VISIBLE);SexViewTwoView.setVisibility(View.VISIBLE); SizeViewTwoView.setVisibility(View.VISIBLE);
    }


    public void SexTextViewTwoMethod() {
        SexViewTwoView = (TextView) findViewById(R.id.SexViewTwo);

        if (lola.Sex.equals(Male)) {
            SexViewTwoView.setText(Male);

        } else {
            SexViewTwoView.setText(Female);

        }


    }

    public void SetBabyOneScaler() {
        BabyHareOneScaler = (BabyOne.size) + new Random().nextInt(1) - 0;
        if (BabyHareOneScaler >= 139) {
            BabyHareOneScaler = 138;
        }
        if (BabyHareOneScaler <= 39) {
            BabyHareOneScaler = 40;
        }
    }


    public void SetBabyTwoScaler() {
        BabyHareTwoScaler = (BabyTwo.size) + new Random().nextInt(1) - 0;
        if (BabyHareTwoScaler >= 139) {
            BabyHareTwoScaler = 138;
        }
        if (BabyHareTwoScaler <= 39) {
            BabyHareTwoScaler = 40;
        }
    }


    public void SetBabyThreeScaler() {
        BabyHareThreeScaler = (BabyThree.size) + new Random().nextInt(1) - 0;
        if (BabyHareThreeScaler >= 139) {
            BabyHareThreeScaler = 138;
        }
        if (BabyHareThreeScaler <= 39) {
            BabyHareThreeScaler = 40;
        }
    }


    public void SetBabyFourScaler() {
        BabyHareFourScaler = (BabyFour.size) + new Random().nextInt(1) - 0;
        if (BabyHareFourScaler >= 139) {
            BabyHareFourScaler = 138;
        }
        if (BabyHareFourScaler <= 39) {
            BabyHareFourScaler = 40;
        }
    }


    public void SetBabyFiveScaler() {
        BabyHareFiveScaler = (BabyFive.size) + new Random().nextInt(1) - 0;
        if (BabyHareFiveScaler >= 139) {
            BabyHareFiveScaler = 138;
        }
        if (BabyHareFiveScaler <= 39) {
            BabyHareFiveScaler = 40;
        }
    }

    public void SetBabySixScaler() {
        BabyHareSixScaler = (BabySix.size) + new Random().nextInt(1) - 0;
        if (BabyHareSixScaler >= 139) {
            BabyHareSixScaler = 138;
        }
        if (BabyHareSixScaler <= 39) {
            BabyHareSixScaler = 40;
        }
    }

    public void SetBabySevenScaler() {
        BabyHareSevenScaler = (BabySeven.size) + new Random().nextInt(1) - 0;
        if (BabyHareSevenScaler >= 139) {
            BabyHareSevenScaler = 138;
        }
        if (BabyHareSevenScaler <= 39) {
            BabyHareSevenScaler = 40;
        }
    }

    public void SetBabyEightScaler() {
        BabyHareEightScaler = (BabyEight.size) + new Random().nextInt(1) - 0;
        if (BabyHareEightScaler >= 139) {
            BabyHareEightScaler = 138;
        }
        if (BabyHareEightScaler <= 39) {
            BabyHareEightScaler = 40;
        }
    }


    public void SizeTextViewOneMethod() {
        SizeViewOneView = (TextView) findViewById(R.id.SizeViewOne);
        String SizePass = String.format(SizeTest, convertToDp(hairy.size));
        SizeViewOneView.setText(SizePass);


    }

    public void SizeTextViewTwoMethod() {
        SizeViewTwoView = (TextView) findViewById(R.id.SizeViewTwo);
        String SizePass = String.format(SizeTest, convertToDp(lola.size));
        SizeViewTwoView.setText(SizePass);


    }


    public String SetSexMethod() {
        int sexsetter = new Random().nextInt(2);
        if (sexsetter == 0) {
            return Male;
        } else {
            return Female;
        }
    }

    public int SetEarMethod() {
        if ((new Random().nextInt(2) != 0)) {
            int earsetter = new Random().nextInt(5);
            return earsetter;
        } else {
            int earsetter = new Random().nextInt(8);
            return earsetter;
        }
    }

    public int SetTailMethod() {
        if ((new Random().nextInt(2) != 0)) {
            int earsetter = new Random().nextInt(5);
            return earsetter;
        } else {
            int earsetter = new Random().nextInt(13);
            return earsetter;
        }
    }

    public int EarLengthMethod() {
        int eargen = new Random().nextInt(300) + 100;
        int EarPass = (eargen / 100);
        return Math.round(EarPass);
    }

    public void DisplayButtonMethod() {

        SelectParentOneImageButton.setImageResource(Bodies[hairy.BodyType]);
        SelectParentEarsOneImageButton.setImageResource(Ears[hairy.EarsType]);
        SelectParentEyesOneImageButton.setImageResource(Eyes[hairy.EyesType]);

        int RedR = ((new Random().nextInt(16) * 16) + new Random().nextInt(16));
        int GreenR = ((new Random().nextInt(16) * 16) + new Random().nextInt(16));
        int BlueR = ((new Random().nextInt(16) * 16) + new Random().nextInt(16));

        int Red = ((hairy.At * 16) + hairy.Bt);
        int Green = ((hairy.Ct * 16) + hairy.Dt);
        int Blue = ((hairy.Et * 16) + hairy.Ft);
        int earalpha = (hairy.HareAlpha / 2);
        SelectParentEarsOneImageButton.setColorFilter(Color.argb(earalpha, Red, Green, Blue));
        SelectParentEyesOneImageButton.setColorFilter(Color.argb(earalpha, RedR, GreenR, BlueR));
        SelectParentOneImageButton.setColorFilter(Color.argb(hairy.HareAlpha, Red, Green, Blue));
        ButtonImageScalerOne();

    }

    public void DisplayEarsxMethod() {
        HareEarsTwoView = (ImageView) findViewById(R.id.HareEarsViewParentTwo);
        HareEarsTwoView.setImageResource(Ears[lola.EarsType]);
        HareEarsTwoView.requestLayout();
        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewParentTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(lola.size), convertToDp(lola.size), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareEarsTwoView.getLayoutParams().height = convertToDp(lola.size);
        HareEarsTwoView.getLayoutParams().width = convertToDp(lola.size);
        HareEarsTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((lola.earAt * 16) + lola.earBt);
        int Green = ((lola.earCt * 16) + lola.earDt);
        int Blue = ((lola.earEt * 16) + lola.earFt);
        HareEarsTwoView.setColorFilter(Color.argb(lola.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint
    }

    public void DisplayEarsOneMethod() {
        HareEarsOneView = (ImageView) findViewById(R.id.HareEarsViewOne);
        HareEarsOneView.setImageResource(Ears[hairy.EarsType]);
        HareEarsOneView.requestLayout();

        FrameLayout FrameOneLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewOne);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(hairy.size), convertToDp(hairy.size), Gravity.CENTER);
        FrameOneLayout.setLayoutParams(WrapParam);
        FrameOneLayout.setLayoutParams(CenterParam);
        int earscaler = ((convertToDp(hairy.size)) - ((convertToDp(hairy.size)) / 4)); //*convertToDp(hairy.size));
        HareEarsOneView.getLayoutParams().height = convertToDp(hairy.size);
        //  Image newImage = HareEarsOneView.getScaledInstance(hairy.size, hairy.EarsLength, R.drawable.rabbitearspointy.SCALE_SMOOTH);//no clue
        HareEarsOneView.getLayoutParams().width = convertToDp(hairy.size);
        HareEarsOneView.setScaleType(ImageView.ScaleType.FIT_XY);

        int Red = ((hairy.earAt * 16) + hairy.earBt);
        int Green = ((hairy.earCt * 16) + hairy.earDt);
        int Blue = ((hairy.earEt * 16) + hairy.earFt);
        int earalpha = (hairy.HareAlpha );
        HareEarsOneView.setColorFilter(Color.argb(earalpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void ButtonImageScalerOne() {


        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) SelectParentOneImageButton.getLayoutParams();
        SelectParentEarsOneImageButton.requestLayout();
        SelectParentEyesOneImageButton.requestLayout();
        SelectParentOneImageButton.requestLayout();
        int earscaler = ((convertToDp(hairy.size)) - ((convertToDp(hairy.size)) / 4));
        SelectParentEarsOneImageButton.getLayoutParams().height = earscaler;
        int eyescaler = ((convertToDp(hairy.size)) - (((convertToDp(hairy.size)) * 2) / 3));
        SelectParentEarsOneImageButton.getLayoutParams().width = (convertToDp(hairy.size) / 2);
        SelectParentEyesOneImageButton.getLayoutParams().height = eyescaler;
        params.height = convertToDp(hairy.size) * 2;
        SelectParentEyesOneImageButton.getLayoutParams().width = convertToDp(hairy.size);
        params.width = convertToDp(hairy.size) * 2;
        SelectParentOneImageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        SelectParentEarsOneImageButton.setScaleType(ImageView.ScaleType.FIT_XY); // should be image button?
    }

    public void DisplayEyesOneMethod() {
        HareEyesOneView = (ImageView) findViewById(R.id.HareEyesViewOne);
        HareEyesOneView.setImageResource(Eyes[hairy.EyesType]);
        HareEyesOneView.requestLayout();

        FrameLayout FrameOneLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewOne);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(hairy.size), convertToDp(hairy.size), Gravity.CENTER);
        FrameOneLayout.setLayoutParams(WrapParam);
        FrameOneLayout.setLayoutParams(CenterParam);
        int earscaler = ((convertToDp(hairy.size)) - ((convertToDp(hairy.size)) / 4)); //*convertToDp(hairy.size));
        HareEyesOneView.getLayoutParams().height = convertToDp(hairy.size);
        //  Image newImage = HareEarsOneView.getScaledInstance(hairy.size, hairy.EarsLength, R.drawable.rabbitearspointy.SCALE_SMOOTH);//no clue
        HareEyesOneView.getLayoutParams().width = convertToDp(hairy.size);
        HareEyesOneView.setScaleType(ImageView.ScaleType.FIT_XY);

        int Red = ((hairy.eyeAt * 16) + hairy.eyeBt);
        int Green = ((hairy.eyeCt * 16) + hairy.eyeDt);
        int Blue = ((hairy.eyeEt * 16) + hairy.eyeFt);
        int eyealpha = (hairy.HareAlpha); // / (new Random().nextInt(3) + 1));
        HareEyesOneView.setColorFilter(Color.argb(eyealpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint
    }

    public void DisplayBodyOneMethod() {

        HareBodyOneView = (ImageView) findViewById(R.id.HareBodyViewOne);
        HareBodyOneView.setImageResource(Bodies[hairy.BodyType]);
        HareBodyOneView.requestLayout();

        FrameLayout FrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewOne);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(hairy.size), convertToDp(hairy.size), Gravity.CENTER);
        FrameOneLayout.setLayoutParams(WrapParam);
        FrameOneLayout.setLayoutParams(CenterParam);
        int earscaler = ((convertToDp(hairy.size)) - ((convertToDp(hairy.size)) / 4)); //*convertToDp(hairy.size));
        HareBodyOneView.getLayoutParams().height = convertToDp(hairy.size);
        //  Image newImage = HareEarsOneView.getScaledInstance(hairy.size, hairy.EarsLength, R.drawable.rabbitearspointy.SCALE_SMOOTH);//no clue
        HareBodyOneView.getLayoutParams().width = convertToDp(hairy.size);
        HareBodyOneView.setScaleType(ImageView.ScaleType.FIT_XY);

        int Red = ((hairy.At * 16) + hairy.Bt);
        int Green = ((hairy.Ct * 16) + hairy.Dt);
        int Blue = ((hairy.Et * 16) + hairy.Ft);
        int alpha = (hairy.HareAlpha);
        HareBodyOneView.setColorFilter(Color.argb(alpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayBodyBabyOneMethod() {
        HareBodyBabyOneView = (ImageView) findViewById(R.id.HareBodyViewBabyOne);
        HareBodyBabyOneView.setImageResource(Bodies[BabyOne.BodyType]);
        HareBodyBabyOneView.requestLayout();
        int babydimension = (80 * BabyHareOneScaler) / 150;

        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.BabyFrameOneBody);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyBabyOneView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyOneView.getLayoutParams().width = convertToDp(babydimension);
        HareBodyBabyOneView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyOne.At * 16) + BabyOne.Bt);
        int Green = ((BabyOne.Ct * 16) + BabyOne.Dt);
        int Blue = ((BabyOne.Et * 16) + BabyOne.Ft);
        HareBodyBabyOneView.setColorFilter(Color.argb(BabyOne.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEarsBabyOneMethod() {
        HareEarsBabyOneView = (ImageView) findViewById(R.id.BabyHareEarsViewOne);
        HareEarsBabyOneView.setImageResource(Ears[BabyOne.EarsType]);
        HareEarsBabyOneView.requestLayout();
        int babydimension = (80 * BabyHareOneScaler) / 150;

        FrameLayout BabyFrameOneEarsLayout = (FrameLayout) findViewById(R.id.BabyFrameOneEars);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneEarsLayout.setLayoutParams(WrapParam);
        BabyFrameOneEarsLayout.setLayoutParams(CenterParam);

        HareEarsBabyOneView.setLayoutParams(CenterParam);
        HareEarsBabyOneView.setLayoutParams(WrapParam);
        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEarsBabyOneView.getLayoutParams().height = convertToDp(babydimension);
        HareEarsBabyOneView.getLayoutParams().width = convertToDp(babydimension);

        HareEarsBabyOneView.setScaleType(ImageView.ScaleType.FIT_XY);

        int Red = ((BabyOne.earAt * 16) + BabyOne.earBt);
        int Green = ((BabyOne.earCt * 16) + BabyOne.earDt);
        int Blue = ((BabyOne.earEt * 16) + BabyOne.earFt);
        HareEarsBabyOneView.setColorFilter(Color.argb(BabyOne.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }


    public void DisplayEyesBabyOneMethod() {
        HareEyesBabyOneView = (ImageView) findViewById(R.id.BabyHareEyesViewOne);
        HareEyesBabyOneView.setImageResource(Eyes[BabyOne.EyesType]);
        HareEyesBabyOneView.requestLayout();
        int babydimension = (80 * BabyHareOneScaler) / 150;

        FrameLayout BabyFrameOneEyesLayout = (FrameLayout) findViewById(R.id.BabyFrameOneEyes);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneEyesLayout.setLayoutParams(WrapParam);
        BabyFrameOneEyesLayout.setLayoutParams(CenterParam);

        int eyescaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareEyesBabyOneView.getLayoutParams().height = convertToDp(babydimension);
        HareEyesBabyOneView.getLayoutParams().width = convertToDp(babydimension);
        HareEyesBabyOneView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyOne.eyeAt * 16) + BabyOne.eyeBt);
        int Green = ((BabyOne.eyeCt * 16) + BabyOne.eyeDt);
        int Blue = ((BabyOne.eyeEt * 16) + BabyOne.eyeFt);
        HareEyesBabyOneView.setColorFilter(Color.argb(BabyOne.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEyesOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEarsBabyTwoMethod() {
        HareEarsBabyTwoView = (ImageView) findViewById(R.id.HareEarsViewBabyTwo);
        HareEarsBabyTwoView.setImageResource(Ears[BabyTwo.EarsType]);
        HareEarsBabyTwoView.requestLayout();
        int babydimension = (80 * BabyHareTwoScaler) / 150;

        FrameLayout BabyFrameTwoEarsLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewBabyTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameTwoEarsLayout.setLayoutParams(WrapParam);
        BabyFrameTwoEarsLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEarsBabyTwoView.getLayoutParams().height = convertToDp(babydimension);
        HareEarsBabyTwoView.getLayoutParams().width = convertToDp(babydimension);

        HareEarsBabyTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyTwo.earAt * 16) + BabyTwo.earBt);
        int Green = ((BabyTwo.earCt * 16) + BabyTwo.earDt);
        int Blue = ((BabyTwo.earEt * 16) + BabyTwo.earFt);
        HareEarsBabyTwoView.setColorFilter(Color.argb(BabyTwo.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEyesBabyTwoMethod() {
        HareEyesBabyTwoView = (ImageView) findViewById(R.id.HareEyesViewBabyTwo);
        HareEyesBabyTwoView.setImageResource(Eyes[BabyTwo.EyesType]);
        HareEyesBabyTwoView.requestLayout();
        int babydimension = (80 * BabyHareTwoScaler) / 150;

        FrameLayout BabyFrameTwoEyesLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewBabyTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameTwoEyesLayout.setLayoutParams(WrapParam);
        BabyFrameTwoEyesLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEyesBabyTwoView.getLayoutParams().height = convertToDp(babydimension);
        HareEyesBabyTwoView.getLayoutParams().width = convertToDp(babydimension);

        HareEyesBabyTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyTwo.eyeAt * 16) + BabyTwo.eyeBt);
        int Green = ((BabyTwo.eyeCt * 16) + BabyTwo.eyeDt);
        int Blue = ((BabyTwo.eyeEt * 16) + BabyTwo.eyeFt);
        HareEyesBabyTwoView.setColorFilter(Color.argb(BabyTwo.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEyesOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayBodyBabyTwoMethod() {
        HareBodyBabyTwoView = (ImageView) findViewById(R.id.HareBodyViewBabyTwo);

        HareBodyBabyTwoView.requestLayout();
        int babydimension = (80 * BabyHareTwoScaler) / 150;

        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewBabyTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyBabyTwoView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyTwoView.getLayoutParams().width = convertToDp(babydimension);

        HareBodyBabyTwoView.setImageResource(Bodies[BabyTwo.BodyType]);
        HareBodyBabyTwoView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyTwoView.getLayoutParams().width = convertToDp(babydimension);
        HareBodyBabyTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyTwo.At * 16) + BabyTwo.Bt);
        int Green = ((BabyTwo.Ct * 16) + BabyTwo.Dt);
        int Blue = ((BabyTwo.Et * 16) + BabyTwo.Ft);
        HareBodyBabyTwoView.setColorFilter(Color.argb(BabyTwo.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEarsBabyThreeMethod() {
        HareEarsBabyThreeView = (ImageView) findViewById(R.id.HareEarsViewBabyThree);
        HareEarsBabyThreeView.setImageResource(Ears[BabyThree.EarsType]);
        HareEarsBabyThreeView.requestLayout();
        int babydimension = (80 * BabyHareThreeScaler) / 150;

        FrameLayout BabyFrameThreeEarsLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewBabyThree);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameThreeEarsLayout.setLayoutParams(WrapParam);
        BabyFrameThreeEarsLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEarsBabyThreeView.getLayoutParams().height = convertToDp(babydimension);
        HareEarsBabyThreeView.getLayoutParams().width = convertToDp(babydimension);

        HareEarsBabyThreeView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyThree.earAt * 16) + BabyThree.earBt);
        int Green = ((BabyThree.earCt * 16) + BabyThree.earDt);
        int Blue = ((BabyThree.earEt * 16) + BabyThree.earFt);
        HareEarsBabyThreeView.setColorFilter(Color.argb(BabyThree.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEyesBabyThreeMethod() {
        HareEyesBabyThreeView = (ImageView) findViewById(R.id.HareEyesViewBabyThree);
        HareEyesBabyThreeView.setImageResource(Eyes[BabyThree.EyesType]);
        HareEyesBabyThreeView.requestLayout();
        int babydimension = (80 * BabyHareThreeScaler) / 150;

        FrameLayout BabyFrameThreeEyesLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewBabyThree);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameThreeEyesLayout.setLayoutParams(WrapParam);
        BabyFrameThreeEyesLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEyesBabyThreeView.getLayoutParams().height = convertToDp(babydimension);
        HareEyesBabyThreeView.getLayoutParams().width = convertToDp(babydimension);

        HareEyesBabyThreeView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyThree.earAt * 16) + BabyThree.earBt);
        int Green = ((BabyThree.earCt * 16) + BabyThree.earDt);
        int Blue = ((BabyThree.earEt * 16) + BabyThree.earFt);
        HareEyesBabyThreeView.setColorFilter(Color.argb(BabyThree.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEyesOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayBodyBabyThreeMethod() {
        HareBodyBabyThreeView = (ImageView) findViewById(R.id.HareBodyViewBabyThree);

        HareBodyBabyThreeView.requestLayout();
        int babydimension = (80 * BabyHareThreeScaler) / 150;

        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewBabyThree);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyBabyThreeView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyThreeView.getLayoutParams().width = convertToDp(babydimension);

        HareBodyBabyThreeView.setImageResource(Bodies[BabyThree.BodyType]);
        HareBodyBabyThreeView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyThreeView.getLayoutParams().width = convertToDp(babydimension);
        HareBodyBabyThreeView.setScaleType(ImageView.ScaleType.FIT_XY);

        int Red = ((BabyThree.At * 16) + BabyThree.Bt);
        int Green = ((BabyThree.Ct * 16) + BabyThree.Dt);
        int Blue = ((BabyThree.Et * 16) + BabyThree.Ft);
        HareBodyBabyThreeView.setColorFilter(Color.argb(BabyThree.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEarsBabyFourMethod() {
        HareEarsBabyFourView = (ImageView) findViewById(R.id.HareEarsViewBabyFour);
        HareEarsBabyFourView.setImageResource(Ears[BabyFour.EarsType]);
        HareEarsBabyFourView.requestLayout();
        int babydimension = (80 * BabyHareFourScaler) / 150;

        FrameLayout BabyFrameFourEarsLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewBabyFour);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameFourEarsLayout.setLayoutParams(WrapParam);
        BabyFrameFourEarsLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEarsBabyFourView.getLayoutParams().height = convertToDp(babydimension);
        HareEarsBabyFourView.getLayoutParams().width = convertToDp(babydimension);
        HareEarsBabyFourView.setScaleType(ImageView.ScaleType.FIT_XY);

        int Red = ((BabyFour.earAt * 16) + BabyFour.earBt);
        int Green = ((BabyFour.earCt * 16) + BabyFour.earDt);
        int Blue = ((BabyFour.earEt * 16) + BabyFour.earFt);
        HareEarsBabyFourView.setColorFilter(Color.argb(BabyFour.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEyesBabyFourMethod() {
        HareEyesBabyFourView = (ImageView) findViewById(R.id.HareEyesViewBabyFour);
        HareEyesBabyFourView.setImageResource(Eyes[BabyFour.EyesType]);
        HareEyesBabyFourView.requestLayout();
        int babydimension = (80 * BabyHareFourScaler) / 150;

        FrameLayout BabyFrameFourEyesLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewBabyFour);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameFourEyesLayout.setLayoutParams(WrapParam);
        BabyFrameFourEyesLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEyesBabyFourView.getLayoutParams().height = convertToDp(babydimension);
        HareEyesBabyFourView.getLayoutParams().width = convertToDp(babydimension);

        HareEyesBabyFourView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyFour.earAt * 16) + BabyFour.earBt);
        int Green = ((BabyFour.earCt * 16) + BabyFour.earDt);
        int Blue = ((BabyFour.earEt * 16) + BabyFour.earFt);
        HareEyesBabyFourView.setColorFilter(Color.argb(BabyFour.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEyesOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayBodyBabyFourMethod() {
        HareBodyBabyFourView = (ImageView) findViewById(R.id.HareBodyViewBabyFour);

        HareBodyBabyFourView.requestLayout();
        int babydimension = (80 * BabyHareFourScaler) / 150;

        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewBabyFour);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyBabyFourView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyFourView.getLayoutParams().width = convertToDp(babydimension);

        HareBodyBabyFourView.setImageResource(Bodies[BabyFour.BodyType]);
        HareBodyBabyFourView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyFourView.getLayoutParams().width = convertToDp(babydimension);
        HareBodyBabyFourView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyFour.At * 16) + BabyFour.Bt);
        int Green = ((BabyFour.Ct * 16) + BabyFour.Dt);
        int Blue = ((BabyFour.Et * 16) + BabyFour.Ft);
        HareBodyBabyFourView.setColorFilter(Color.argb(BabyFour.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEarsBabyFiveMethod() {
        HareEarsBabyFiveView = (ImageView) findViewById(R.id.HareEarsViewBabyFive);
        HareEarsBabyFiveView.setImageResource(Ears[BabyFive.EarsType]);
        HareEarsBabyFiveView.requestLayout();
        int babydimension = (80 * BabyHareFiveScaler) / 150;

        FrameLayout BabyFrameFiveEarsLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewBabyFive);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameFiveEarsLayout.setLayoutParams(WrapParam);
        BabyFrameFiveEarsLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEarsBabyFiveView.getLayoutParams().height = convertToDp(babydimension);
        HareEarsBabyFiveView.getLayoutParams().width = convertToDp(babydimension);

        HareEarsBabyFiveView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyFive.earAt * 16) + BabyFive.earBt);
        int Green = ((BabyFive.earCt * 16) + BabyFive.earDt);
        int Blue = ((BabyFive.earEt * 16) + BabyFive.earFt);
        HareEarsBabyFiveView.setColorFilter(Color.argb(BabyFive.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEyesBabyFiveMethod() {
        HareEyesBabyFiveView = (ImageView) findViewById(R.id.HareEyesViewBabyFive);
        HareEyesBabyFiveView.setImageResource(Eyes[BabyFive.EyesType]);
        HareEyesBabyFiveView.requestLayout();
        int babydimension = (80 * BabyHareFiveScaler) / 150;

        FrameLayout BabyFrameFiveEyesLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewBabyFive);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameFiveEyesLayout.setLayoutParams(WrapParam);
        BabyFrameFiveEyesLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEyesBabyFiveView.getLayoutParams().height = convertToDp(babydimension);
        HareEyesBabyFiveView.getLayoutParams().width = convertToDp(babydimension);

        HareEyesBabyFiveView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyFive.earAt * 16) + BabyFive.earBt);
        int Green = ((BabyFive.earCt * 16) + BabyFive.earDt);
        int Blue = ((BabyFive.earEt * 16) + BabyFive.earFt);
        HareEyesBabyFiveView.setColorFilter(Color.argb(BabyFive.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEyesOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayBodyBabyFiveMethod() {
        HareBodyBabyFiveView = (ImageView) findViewById(R.id.HareBodyViewBabyFive);

        HareBodyBabyFiveView.requestLayout();
        int babydimension = (80 * BabyHareFiveScaler) / 150;

        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewBabyFive);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyBabyFiveView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyFiveView.getLayoutParams().width = convertToDp(babydimension);

        HareBodyBabyFiveView.setImageResource(Bodies[BabyFive.BodyType]);
        HareBodyBabyFiveView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyFiveView.getLayoutParams().width = convertToDp(babydimension);
        HareBodyBabyFiveView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyFive.At * 16) + BabyFive.Bt);
        int Green = ((BabyFive.Ct * 16) + BabyFive.Dt);
        int Blue = ((BabyFive.Et * 16) + BabyFive.Ft);
        HareBodyBabyFiveView.setColorFilter(Color.argb(BabyFive.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEarsBabySixMethod() {
        HareEarsBabySixView = (ImageView) findViewById(R.id.HareEarsViewBabySix);
        HareEarsBabySixView.setImageResource(Ears[BabySix.EarsType]);
        HareEarsBabySixView.requestLayout();
        int babydimension = (80 * BabyHareSixScaler) / 150;

        FrameLayout BabyFrameSixEarsLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewBabySix);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameSixEarsLayout.setLayoutParams(WrapParam);
        BabyFrameSixEarsLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEarsBabySixView.getLayoutParams().height = convertToDp(babydimension);
        HareEarsBabySixView.getLayoutParams().width = convertToDp(babydimension);

        HareEarsBabySixView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabySix.earAt * 16) + BabySix.earBt);
        int Green = ((BabySix.earCt * 16) + BabySix.earDt);
        int Blue = ((BabySix.earEt * 16) + BabySix.earFt);
        HareEarsBabySixView.setColorFilter(Color.argb(BabySix.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEyesBabySixMethod() {
        HareEyesBabySixView = (ImageView) findViewById(R.id.HareEyesViewBabySix);
        HareEyesBabySixView.setImageResource(Eyes[BabySix.EyesType]);
        HareEyesBabySixView.requestLayout();
        int babydimension = (80 * BabyHareSixScaler) / 150;

        FrameLayout BabyFrameSixEyesLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewBabySix);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameSixEyesLayout.setLayoutParams(WrapParam);
        BabyFrameSixEyesLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEyesBabySixView.getLayoutParams().height = convertToDp(babydimension);
        HareEyesBabySixView.getLayoutParams().width = convertToDp(babydimension);

        HareEyesBabySixView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabySix.eyeAt * 16) + BabySix.eyeBt);
        int Green = ((BabySix.eyeCt * 16) + BabySix.eyeDt);
        int Blue = ((BabySix.eyeEt * 16) + BabySix.eyeFt);
        HareEyesBabySixView.setColorFilter(Color.argb(BabySix.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEyesOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayBodyBabySixMethod() {
        HareBodyBabySixView = (ImageView) findViewById(R.id.HareBodyViewBabySix);

        HareBodyBabySixView.requestLayout();
        int babydimension = (80 * BabyHareSixScaler) / 150;

        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewBabySix);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyBabySixView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabySixView.getLayoutParams().width = convertToDp(babydimension);

        HareBodyBabySixView.setImageResource(Bodies[BabySix.BodyType]);
        HareBodyBabySixView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabySixView.getLayoutParams().width = convertToDp(babydimension);
        HareBodyBabySixView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabySix.At * 16) + BabySix.Bt);
        int Green = ((BabySix.Ct * 16) + BabySix.Dt);
        int Blue = ((BabySix.Et * 16) + BabySix.Ft);
        HareBodyBabySixView.setColorFilter(Color.argb(BabySix.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }


    public void DisplayEarsBabySevenMethod() {
        HareEarsBabySevenView = (ImageView) findViewById(R.id.HareEarsViewBabySeven);
        HareEarsBabySevenView.setImageResource(Ears[BabySeven.EarsType]);
        HareEarsBabySevenView.requestLayout();
        int babydimension = (80 * BabyHareSevenScaler) / 150;

        FrameLayout BabyFrameSevenEarsLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewBabySeven);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameSevenEarsLayout.setLayoutParams(WrapParam);
        BabyFrameSevenEarsLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEarsBabySevenView.getLayoutParams().height = convertToDp(babydimension);
        HareEarsBabySevenView.getLayoutParams().width = convertToDp(babydimension);

        HareEarsBabySevenView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabySeven.earAt * 16) + BabySeven.earBt);
        int Green = ((BabySeven.earCt * 16) + BabySeven.earDt);
        int Blue = ((BabySeven.earEt * 16) + BabySeven.earFt);
        HareEarsBabySevenView.setColorFilter(Color.argb(BabySeven.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEyesBabySevenMethod() {
        HareEyesBabySevenView = (ImageView) findViewById(R.id.HareEyesViewBabySeven);
        HareEyesBabySevenView.setImageResource(Eyes[BabySeven.EyesType]);
        HareEyesBabySevenView.requestLayout();
        int babydimension = (80 * BabyHareSevenScaler) / 150;

        FrameLayout BabyFrameSevenEyesLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewBabySeven);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameSevenEyesLayout.setLayoutParams(WrapParam);
        BabyFrameSevenEyesLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEyesBabySevenView.getLayoutParams().height = convertToDp(babydimension);
        HareEyesBabySevenView.getLayoutParams().width = convertToDp(babydimension);

        HareEyesBabySevenView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabySeven.eyeAt * 16) + BabySeven.eyeBt);
        int Green = ((BabySeven.eyeCt * 16) + BabySeven.eyeDt);
        int Blue = ((BabySeven.eyeEt * 16) + BabySeven.eyeFt);
        HareEyesBabySevenView.setColorFilter(Color.argb(BabySeven.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEyesOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayBodyBabySevenMethod() {
        HareBodyBabySevenView = (ImageView) findViewById(R.id.HareBodyViewBabySeven);

        HareBodyBabySevenView.requestLayout();
        int babydimension = (80 * BabyHareSevenScaler) / 150;

        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewBabySeven);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyBabySevenView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabySevenView.getLayoutParams().width = convertToDp(babydimension);

        HareBodyBabySevenView.setImageResource(Bodies[BabySeven.BodyType]);
        HareBodyBabySevenView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabySevenView.getLayoutParams().width = convertToDp(babydimension);
        HareBodyBabySevenView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabySeven.At * 16) + BabySeven.Bt);
        int Green = ((BabySeven.Ct * 16) + BabySeven.Dt);
        int Blue = ((BabySeven.Et * 16) + BabySeven.Ft);
        HareBodyBabySevenView.setColorFilter(Color.argb(BabySeven.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }


    public void DisplayEarsBabyEightMethod() {
        HareEarsBabyEightView = (ImageView) findViewById(R.id.HareEarsViewBabyEight);
        HareEarsBabyEightView.setImageResource(Ears[BabyEight.EarsType]);
        HareEarsBabyEightView.requestLayout();
        int babydimension = (80 * BabyHareEightScaler) / 150;

        FrameLayout BabyFrameEightEarsLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewBabyEight);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameEightEarsLayout.setLayoutParams(WrapParam);
        BabyFrameEightEarsLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEarsBabyEightView.getLayoutParams().height = convertToDp(babydimension);
        HareEarsBabyEightView.getLayoutParams().width = convertToDp(babydimension);

        HareEarsBabyEightView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyEight.earAt * 16) + BabyEight.earBt);
        int Green = ((BabyEight.earCt * 16) + BabyEight.earDt);
        int Blue = ((BabyEight.earEt * 16) + BabyEight.earFt);
        HareEarsBabyEightView.setColorFilter(Color.argb(harealphaeight, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEyesBabyEightMethod() {
        HareEyesBabyEightView = (ImageView) findViewById(R.id.HareEyesViewBabyEight);
        HareEyesBabyEightView.setImageResource(Eyes[BabyEight.EyesType]);
        HareEyesBabyEightView.requestLayout();
        int babydimension = (80 * BabyHareEightScaler) / 150;

        FrameLayout BabyFrameEightEyesLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewBabyEight);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameEightEyesLayout.setLayoutParams(WrapParam);
        BabyFrameEightEyesLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEyesBabyEightView.getLayoutParams().height = convertToDp(babydimension);
        HareEyesBabyEightView.getLayoutParams().width = convertToDp(babydimension);

        HareEyesBabyEightView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyEight.eyeAt * 16) + BabyEight.eyeBt);
        int Green = ((BabyEight.eyeCt * 16) + BabyEight.eyeDt);
        int Blue = ((BabyEight.eyeEt * 16) + BabyEight.eyeFt);
        HareEyesBabyEightView.setColorFilter(Color.argb(harealphaeight, Red, Green, Blue)); // Random Tint
        // HareEyesOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayBodyBabyEightMethod() {
        HareBodyBabyEightView = (ImageView) findViewById(R.id.HareBodyViewBabyEight);

        HareBodyBabyEightView.requestLayout();
        int babydimension = (80 * BabyHareEightScaler) / 150;
        /*
        Matrix mat = new Matrix();
        Bitmap bMap = BitmapFactory.decodeResource(getResources(),Bodies[BabyEight.BodyType]);
        mat.postRotate(BabyEight.AngleTotal);

        angletesterone = BabyEight.AngleTotal%180;
        angletestertwo = angletesterone%90;

        if (angletestertwo == 1){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*348)/10000) ;
        }else if(angletestertwo == 2){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*696)/10000) ;
        }else if(angletestertwo == 3){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*1044)/10000) ;
        }else if(angletestertwo == 4){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*1392)/10000) ;
        }else if(angletestertwo == 5){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*1736)/10000) ;
        }else if(angletestertwo == 6){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*2080)/10000) ;
        }else if(angletestertwo == 7){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*2420)/10000) ;
        }else if(angletestertwo == 8){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*2756)/10000) ;
        }else if(angletestertwo == 9){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*3092)/10000) ;
        }else if(angletestertwo == 10){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*3420)/10000) ;
        }else if(angletestertwo == 11){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*3748)/10000) ;
        }else if(angletestertwo == 12){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*4068)/10000) ;
        }else if(angletestertwo == 13){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*4384)/10000) ;
        }else if(angletestertwo == 14){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*4696)/10000) ;
        }else if(angletestertwo == 15){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*5000)/10000) ;
        }else if(angletestertwo == 16){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*5300)/10000) ;
        }else if(angletestertwo == 17){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*5592)/10000) ;
        }else if(angletestertwo == 18){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*5876)/10000) ;
        }else if(angletestertwo == 19){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*6156)/10000) ;
        }else if(angletestertwo == 20){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*6428)/10000) ;
        }else if(angletestertwo == 21){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*6692)/10000) ;
        }else if(angletestertwo == 22){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*6948)/10000) ;
        }else if(angletestertwo == 23){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*7192)/10000) ;
        }else if(angletestertwo == 24){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*7432)/10000) ;
        }




        Bitmap bMapRotate = Bitmap.createBitmap(bMap, 0, 0,angleproduct, angleproduct, mat, true);
        HareBodyBabyEightView.setImageBitmap(bMapRotate);
        */
        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewBabyEight);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyBabyEightView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyEightView.getLayoutParams().width = convertToDp(babydimension);

        HareBodyBabyEightView.setImageResource(Bodies[BabyEight.BodyType]);

        HareBodyBabyEightView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyEightView.getLayoutParams().width = convertToDp(babydimension);

        HareBodyBabyEightView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyEight.At * 16) + BabyEight.Bt);
        int Green = ((BabyEight.Ct * 16) + BabyEight.Dt);
        int Blue = ((BabyEight.Et * 16) + BabyEight.Ft);
        HareBodyBabyEightView.setColorFilter(Color.argb(harealphaeight, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint



    }


    public void DisplayBodyTwoMethod() {
        HareBodyTwoView = (ImageView) findViewById(R.id.HareBodyViewParentTwo);
        HareBodyTwoView.setImageResource(Bodies[lola.BodyType]);
        HareBodyTwoView.requestLayout();
        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewParentTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(lola.size), convertToDp(lola.size), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyTwoView.getLayoutParams().height = convertToDp(lola.size);
        HareBodyTwoView.getLayoutParams().width = convertToDp(lola.size);
        HareBodyTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((lola.At * 16) + lola.Bt);
        int Green = ((lola.Ct * 16) + lola.Dt);
        int Blue = ((lola.Et * 16) + lola.Ft);
        HareBodyTwoView.setColorFilter(Color.argb(lola.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint
    }

    public void DisplayEarsTwoMethod() {
        HareEarsTwoView = (ImageView) findViewById(R.id.HareEarsViewParentTwo);
        HareEarsTwoView.setImageResource(Ears[lola.EarsType]);
        HareEarsTwoView.requestLayout();
        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewParentTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(lola.size), convertToDp(lola.size), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareEarsTwoView.getLayoutParams().height = convertToDp(lola.size);
        HareEarsTwoView.getLayoutParams().width = convertToDp(lola.size);
        HareEarsTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((lola.earAt * 16) + lola.earBt);
        int Green = ((lola.earCt * 16) + lola.earDt);
        int Blue = ((lola.earEt * 16) + lola.earFt);
        HareEarsTwoView.setColorFilter(Color.argb(lola.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint
    }

    public void DisplayEyeTwoMethod() {
        HareEyesTwoView = (ImageView) findViewById(R.id.HareEyesViewParentTwo);
        HareEyesTwoView.setImageResource(Eyes[lola.EyesType]);
        HareEyesTwoView.requestLayout();
        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewParentTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(lola.size), convertToDp(lola.size), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareEyesTwoView.getLayoutParams().height = convertToDp(lola.size);
        HareEyesTwoView.getLayoutParams().width = convertToDp(lola.size);
        HareEyesTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((lola.eyeAt * 16) + lola.eyeBt);
        int Green = ((lola.eyeCt * 16) + lola.eyeDt);
        int Blue = ((lola.eyeEt * 16) + lola.eyeFt);
        HareEyesTwoView.setColorFilter(Color.argb(lola.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEyeOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint
    }

    public int SetSizeMethod() {
        //int sizesetter = sizesetter;
        return (new Random().nextInt(79) + 60);

    }

    public int SetRotation() {
        return (new Random().nextInt(37));
    }

    public int BodyTypeMethod() {
        int specialbody = new Random().nextInt(2);
        if (specialbody == 0) {
            return new Random().nextInt(12);
        } else {
            return new Random().nextInt(3);
        }

    }

    public int SetAlphaMethod() {

        int Alpha = (new Random().nextInt(128) + 64);
        return Alpha;
    }
    public int SetTailAlphaMethod() {

        int Alpha = (new Random().nextInt(128) + 64);
        Alpha = Alpha/2;
        Alpha = Math.round(Alpha);


        return Alpha;
    }




    public void SetBabiesInvisible() {
        HareBodyBabyOneView.setVisibility(View.INVISIBLE);
        HareBodyBabyTwoView.setVisibility(View.INVISIBLE);
        HareBodyBabyThreeView.setVisibility(View.INVISIBLE);
        HareBodyBabyFourView.setVisibility(View.INVISIBLE);
        HareBodyBabyFiveView.setVisibility(View.INVISIBLE);
        HareBodyBabySixView.setVisibility(View.INVISIBLE);
        HareBodyBabySevenView.setVisibility(View.INVISIBLE);
        HareBodyBabyEightView.setVisibility(View.INVISIBLE);

        HareEarsBabyOneView.setVisibility(View.INVISIBLE);
        HareEarsBabyTwoView.setVisibility(View.INVISIBLE);
        HareEarsBabyThreeView.setVisibility(View.INVISIBLE);
        HareEarsBabyFourView.setVisibility(View.INVISIBLE);
        HareEarsBabyFiveView.setVisibility(View.INVISIBLE);
        HareEarsBabySixView.setVisibility(View.INVISIBLE);
        HareEarsBabySevenView.setVisibility(View.INVISIBLE);
        HareEarsBabyEightView.setVisibility(View.INVISIBLE);

        HareEyesBabyOneView.setVisibility(View.INVISIBLE);
        HareEyesBabyTwoView.setVisibility(View.INVISIBLE);
        HareEyesBabyThreeView.setVisibility(View.INVISIBLE);
        HareEyesBabyFourView.setVisibility(View.INVISIBLE);
        HareEyesBabyFiveView.setVisibility(View.INVISIBLE);
        HareEyesBabySixView.setVisibility(View.INVISIBLE);
        HareEyesBabySevenView.setVisibility(View.INVISIBLE);
        HareEyesBabyEightView.setVisibility(View.INVISIBLE);


        HareTailBabyOneView.setVisibility(View.INVISIBLE);
        HareTailBabyTwoView.setVisibility(View.INVISIBLE);
        HareTailBabyThreeView.setVisibility(View.INVISIBLE);
        HareTailBabyFourView.setVisibility(View.INVISIBLE);
        HareTailBabyFiveView.setVisibility(View.INVISIBLE);
        HareTailBabySixView.setVisibility(View.INVISIBLE);
        HareTailBabySevenView.setVisibility(View.INVISIBLE);
        HareTailBabyEightView.setVisibility(View.INVISIBLE);
    }

    public void SetBabiesDeleted() {
        HareBodyBabyOneView.setImageResource(R.drawable.noerror);
        HareBodyBabyTwoView.setImageResource(R.drawable.noerror);
        HareBodyBabyThreeView.setImageResource(R.drawable.noerror);
        HareBodyBabyFourView.setImageResource(R.drawable.noerror);
        HareBodyBabyFiveView.setImageResource(R.drawable.noerror);
        HareBodyBabySixView.setImageResource(R.drawable.noerror);
        HareBodyBabySevenView.setImageResource(R.drawable.noerror);
        HareBodyBabyEightView.setImageResource(R.drawable.noerror);

        HareEarsBabyOneView.setImageResource(R.drawable.noerror);
        HareEarsBabyTwoView.setImageResource(R.drawable.noerror);
        HareEarsBabyThreeView.setImageResource(R.drawable.noerror);
        HareEarsBabyFourView.setImageResource(R.drawable.noerror);
        HareEarsBabyFiveView.setImageResource(R.drawable.noerror);
        HareEarsBabySixView.setImageResource(R.drawable.noerror);
        HareEarsBabySevenView.setImageResource(R.drawable.noerror);
        HareEarsBabyEightView.setImageResource(R.drawable.noerror);

        HareEyesBabyOneView.setImageResource(R.drawable.noerror);
        HareEyesBabyTwoView.setImageResource(R.drawable.noerror);
        HareEyesBabyThreeView.setImageResource(R.drawable.noerror);
        HareEyesBabyFourView.setImageResource(R.drawable.noerror);
        HareEyesBabyFiveView.setImageResource(R.drawable.noerror);
        HareEyesBabySixView.setImageResource(R.drawable.noerror);
        HareEyesBabySevenView.setImageResource(R.drawable.noerror);
        HareEyesBabyEightView.setImageResource(R.drawable.noerror);


        HareTailBabyOneView.setImageResource(R.drawable.noerror);
        HareTailBabyTwoView.setImageResource(R.drawable.noerror);
        HareTailBabyThreeView.setImageResource(R.drawable.noerror);
        HareTailBabyFourView.setImageResource(R.drawable.noerror);
        HareTailBabyFiveView.setImageResource(R.drawable.noerror);
        HareTailBabySixView.setImageResource(R.drawable.noerror);
        HareTailBabySevenView.setImageResource(R.drawable.noerror);
        HareTailBabyEightView.setImageResource(R.drawable.noerror);
    }

    public void SetAdultsInvisible() {

        HareTailOneView.setVisibility(View.INVISIBLE);
        HareBodyOneView.setVisibility(View.INVISIBLE);
        HareEarsOneView.setVisibility(View.INVISIBLE);
        HareEyesOneView.setVisibility(View.INVISIBLE);

        HareTailTwoView.setVisibility(View.INVISIBLE);
        HareBodyTwoView.setVisibility(View.INVISIBLE);
        HareEarsTwoView.setVisibility(View.INVISIBLE);
        HareEyesTwoView.setVisibility(View.INVISIBLE);

    }

    public void SetAdultsVisible() {

        HareTailOneView.setVisibility(View.VISIBLE);
        HareBodyOneView.setVisibility(View.VISIBLE);
        HareEarsOneView.setVisibility(View.VISIBLE);
        HareEyesOneView.setVisibility(View.VISIBLE);

        HareTailTwoView.setVisibility(View.VISIBLE);
        HareBodyTwoView.setVisibility(View.VISIBLE);
        HareEarsTwoView.setVisibility(View.VISIBLE);
        HareEyesTwoView.setVisibility(View.VISIBLE);

    }

    public Hare BabyMethod(Hare parentone, Hare parenttwo) {

        Hare babyhare = new Hare("a", 50, "a", 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,0, 0, 1, 0, 0,SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );
        babyhare.At = parentone.At ^ parenttwo.At;
        babyhare.Bt = parentone.Bt ^ parenttwo.Bt;
        babyhare.Ct = parentone.Ct ^ parenttwo.Ct;
        babyhare.Dt = parentone.Dt ^ parenttwo.Dt;
        babyhare.Et = parentone.Et ^ parenttwo.Et;
        babyhare.Ft = parentone.Ft ^ parenttwo.Ft;

        babyhare.earAt = parentone.earAt ^ parenttwo.earAt;
        babyhare.earBt = parentone.earBt ^ parenttwo.earBt;
        babyhare.earCt = parentone.earCt ^ parenttwo.earCt;
        babyhare.earDt = parentone.earDt ^ parenttwo.earDt;
        babyhare.earEt = parentone.earEt ^ parenttwo.earEt;
        babyhare.earFt = parentone.earFt ^ parenttwo.earFt;

        babyhare.eyeAt = parentone.eyeAt ^ parenttwo.eyeAt;
        babyhare.eyeBt = parentone.eyeBt ^ parenttwo.eyeBt;
        babyhare.eyeCt = parentone.eyeCt ^ parenttwo.eyeCt;
        babyhare.eyeDt = parentone.eyeDt ^ parenttwo.eyeDt;
        babyhare.eyeEt = parentone.eyeEt ^ parenttwo.eyeEt;
        babyhare.eyeFt = parentone.eyeFt ^ parenttwo.eyeFt;

        babyhare.tailAt = parentone.tailAt ^ parenttwo.tailAt;
        babyhare.tailBt = parentone.tailBt ^ parenttwo.tailBt;
        babyhare.tailCt = parentone.tailCt ^ parenttwo.tailCt;
        babyhare.tailDt = parentone.tailDt ^ parenttwo.tailDt;
        babyhare.tailEt = parentone.tailEt ^ parenttwo.tailEt;
        babyhare.tailFt = parentone.tailFt ^ parenttwo.tailFt;

        babyhare.Sex = SetSexMethod();

        babyhare.size = (((parenttwo.size + parentone.size) / 2) + new Random().nextInt(1) - 0);
        if (babyhare.size >= 149) {
            babyhare.size = 149;
        }
      if (babyhare.size <= 29) {
            babyhare.size = 30;
        }
        babyonesizedummy = babyhare.size;

        babyhare.Color = FinalColorMethod(babyhare.At, babyhare.Bt, babyhare.Ct, babyhare.Dt, babyhare.Et, babyhare.Ft);

        babyhare.HareAlpha = (((parenttwo.HareAlpha + parentone.HareAlpha) / 2) + new Random().nextInt(17) - 8);
        babyhare.TailAlpha = (((parenttwo.TailAlpha + parentone.TailAlpha) / 2) + new Random().nextInt(17) - 8);

        if (babyhare.TailAlpha >= 128){
            babyhare.TailAlpha = 127;
        }



        int babybodysetter = new Random().nextInt(5);
        int babyearsetter = new Random().nextInt(5);
        int babytailsetter = new Random().nextInt(5);

        if (babytailsetter == 0 || babytailsetter == 1) {
            babyhare.TailType = parentone.TailType;
        } else if (babytailsetter == 2 || babytailsetter == 3) {
            babyhare.TailType = parenttwo.TailType;
        } else {
            babyhare.TailType = SetTailMethod();
        }
        
        if (babybodysetter == 0 || babybodysetter == 1) {
            babyhare.BodyType = parentone.BodyType;
        } else if (babybodysetter == 2 || babybodysetter == 3) {
            babyhare.BodyType = parenttwo.BodyType;
        } else {
            babyhare.BodyType = BodyTypeMethod();
        }
        if (babyearsetter == 0 || babyearsetter == 1) {
            babyhare.EarsType = parentone.EarsType;
        } else if (babyearsetter == 2 || babyearsetter == 3) {
            babyhare.EarsType = parenttwo.EarsType;
        } else {
            babyhare.EarsType = SetEarMethod();
        }

        babyhare.Price = PriceSettingMethod(babyhare);
        // Intent intentHutch = new Intent(this, RabbitHutch.class);
        //  String catchname = "%s%s";
        //  String babyharecallname = String.format(catchname, "NewHare", babycounter);
        // intentHutch.putExtra(babyharecallname, babyhare);
        // intentHutch.putExtra("NewHare", hairy);
        if (babyOneCreatedCounter == 0) {
            BabyOne = babyhare;
            BabyHares[BabyNumber] = BabyOne;
            BabyNumber = BabyNumber + 1;
            babyOneCreatedCounter = babyOneCreatedCounter + 1;
            return BabyOne;
        } else {
            return BabyOne;
        }


    }

    public Hare BabyMethodTwo(Hare parentone, Hare parenttwo) {

        Hare babyhare = new Hare("a", 50, "a", 1, 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,0, 0, 1, 0, 0,SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );


        int childAt = (parentone.At + parenttwo.At) / 2;
        babyhare.At = Math.round(childAt);
        int childBt = (parentone.Bt + parenttwo.Bt) / 2;
        babyhare.Bt = Math.round(childBt);
        int childCt = (parentone.Ct + parenttwo.Ct) / 2;
        babyhare.Ct = Math.round(childCt);
        int childDt = (parentone.Dt + parenttwo.Dt) / 2;
        babyhare.Dt = Math.round(childDt);
        int childEt = (parentone.Et + parenttwo.Et) / 2;
        babyhare.Et = Math.round(childEt);
        int childFt = (parentone.Ft + parenttwo.Ft) / 2;
        babyhare.Ft = Math.round(childFt);


        int childeyeAt = (parentone.eyeAt + parenttwo.eyeAt) / 2;
        babyhare.eyeAt = Math.round(childeyeAt);
        int childeyeBt = (parentone.eyeBt + parenttwo.eyeBt) / 2;
        babyhare.eyeBt = Math.round(childeyeBt);
        int childeyeCt = (parentone.eyeCt + parenttwo.eyeCt) / 2;
        babyhare.eyeCt = Math.round(childeyeCt);
        int childeyeDt = (parentone.eyeDt + parenttwo.eyeDt) / 2;
        babyhare.eyeDt = Math.round(childeyeDt);
        int childeyeEt = (parentone.eyeEt + parenttwo.eyeEt) / 2;
        babyhare.eyeEt = Math.round(childeyeEt);
        int childeyeFt = (parentone.eyeFt + parenttwo.eyeFt) / 2;
        babyhare.eyeFt = Math.round(childeyeFt);
        
        int childtailAt = (parentone.tailAt + parenttwo.tailAt) / 2;
        babyhare.tailAt = Math.round(childtailAt);
        int childtailBt = (parentone.tailBt + parenttwo.tailBt) / 2;
        babyhare.tailBt = Math.round(childtailBt);
        int childtailCt = (parentone.tailCt + parenttwo.tailCt) / 2;
        babyhare.tailCt = Math.round(childtailCt);
        int childtailDt = (parentone.tailDt + parenttwo.tailDt) / 2;
        babyhare.tailDt = Math.round(childtailDt);
        int childtailEt = (parentone.tailEt + parenttwo.tailEt) / 2;
        babyhare.tailEt = Math.round(childtailEt);
        int childtailFt = (parentone.tailFt + parenttwo.tailFt) / 2;
        babyhare.tailFt = Math.round(childtailFt);


        int childearAt = (parentone.earAt + parenttwo.earAt) / 2;
        babyhare.earAt = Math.round(childearAt);
        int childearBt = (parentone.earBt + parenttwo.earBt) / 2;
        babyhare.earBt = Math.round(childearBt);
        int childearCt = (parentone.earCt + parenttwo.earCt) / 2;
        babyhare.earCt = Math.round(childearCt);
        int childearDt = (parentone.earDt + parenttwo.earDt) / 2;
        babyhare.earDt = Math.round(childearDt);
        int childearEt = (parentone.earEt + parenttwo.earEt) / 2;
        babyhare.earEt = Math.round(childearEt);
        int childearFt = (parentone.earFt + parenttwo.earFt) / 2;
        babyhare.earFt = Math.round(childearFt);

        babyhare.Sex = SetSexMethod();

        babyhare.size = (((parenttwo.size + parentone.size) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.size >= 149) {
            babyhare.size = 149;
        }
      if (babyhare.size <= 29) {
            babyhare.size = 30;
        }

        babyhare.Color = FinalColorMethod(babyhare.At, babyhare.Bt, babyhare.Ct, babyhare.Dt, babyhare.Et, babyhare.Ft);

        babyhare.HareAlpha = (((parenttwo.HareAlpha + parentone.HareAlpha) / 2) + new Random().nextInt(17) - 8);
        babyhare.TailAlpha = (((parenttwo.TailAlpha + parentone.TailAlpha) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.TailAlpha >= 128){
            babyhare.TailAlpha = 127;
        }
        int babybodysetter = new Random().nextInt(5);
        int babyearsetter = new Random().nextInt(5);
        int babytailsetter = new Random().nextInt(5);

        if (babytailsetter == 0 || babytailsetter == 1) {
            babyhare.TailType = parentone.TailType;
        } else if (babytailsetter == 2 || babytailsetter == 3) {
            babyhare.TailType = parenttwo.TailType;
        } else {
            babyhare.TailType = SetTailMethod();
        }
        if (babybodysetter == 0 || babybodysetter == 1) {
            babyhare.BodyType = parentone.BodyType;
        } else if (babybodysetter == 2 || babybodysetter == 3) {
            babyhare.BodyType = parenttwo.BodyType;
        } else {
            babyhare.BodyType = BodyTypeMethod();
        }
        if (babyearsetter == 0 || babyearsetter == 1) {
            babyhare.EarsType = parentone.EarsType;
        } else if (babyearsetter == 2 || babyearsetter == 3) {
            babyhare.EarsType = parenttwo.EarsType;
        } else {
            babyhare.EarsType = SetEarMethod();
        }

        babyhare.Price = PriceSettingMethod(babyhare);
        if (babyTwoCreatedCounter == 0) {
            BabyTwo = babyhare;
            BabyHares[BabyNumber] = BabyTwo;
            BabyNumber = BabyNumber + 1;
            babyTwoCreatedCounter = babyTwoCreatedCounter + 1;
            return BabyTwo;
        }
        return BabyTwo;
    }

    public Hare BabyMethodThree(Hare parentone, Hare parenttwo) {

        Hare babyhare = new Hare("a", 50, "a", 1, 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,0, 0, 1, 0, 0,SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );

        babyhare.At = (parentone.At + parenttwo.At) % 16;
        babyhare.Bt = (parentone.Bt + parenttwo.Bt) % 16;
        babyhare.Ct = (parentone.Ct + parenttwo.Ct) % 16;
        babyhare.Dt = (parentone.Dt + parenttwo.Dt) % 16;
        babyhare.Et = (parentone.Et + parenttwo.Et) % 16;
        babyhare.Ft = (parentone.Ft + parenttwo.Ft) % 16;

        babyhare.earAt = (parentone.earAt + parenttwo.earAt) % 16;
        babyhare.earBt = (parentone.earBt + parenttwo.earBt) % 16;
        babyhare.earCt = (parentone.earCt + parenttwo.earCt) % 16;
        babyhare.earDt = (parentone.earDt + parenttwo.earDt) % 16;
        babyhare.earEt = (parentone.earEt + parenttwo.earEt) % 16;
        babyhare.earFt = (parentone.earFt + parenttwo.earFt) % 16;

        babyhare.eyeAt = (parentone.eyeAt + parenttwo.eyeAt) % 16;
        babyhare.eyeBt = (parentone.eyeBt + parenttwo.eyeBt) % 16;
        babyhare.eyeCt = (parentone.eyeCt + parenttwo.eyeCt) % 16;
        babyhare.eyeDt = (parentone.eyeDt + parenttwo.eyeDt) % 16;
        babyhare.eyeEt = (parentone.eyeEt + parenttwo.eyeEt) % 16;
        babyhare.eyeFt = (parentone.eyeFt + parenttwo.eyeFt) % 16;

        babyhare.tailAt = (parentone.tailAt + parenttwo.tailAt) % 16;
        babyhare.tailBt = (parentone.tailBt + parenttwo.tailBt) % 16;
        babyhare.tailCt = (parentone.tailCt + parenttwo.tailCt) % 16;
        babyhare.tailDt = (parentone.tailDt + parenttwo.tailDt) % 16;
        babyhare.tailEt = (parentone.tailEt + parenttwo.tailEt) % 16;
        babyhare.tailFt = (parentone.tailFt + parenttwo.tailFt) % 16;

        babyhare.Sex = SetSexMethod();

        babyhare.size = (((parenttwo.size + parentone.size) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.size >= 149) {
            babyhare.size = 149;
        }
      if (babyhare.size <= 29) {
            babyhare.size = 30;
        }

        babyhare.Color = FinalColorMethod(babyhare.At, babyhare.Bt, babyhare.Ct, babyhare.Dt, babyhare.Et, babyhare.Ft);

        babyhare.HareAlpha = (((parenttwo.HareAlpha + parentone.HareAlpha) / 2) + new Random().nextInt(17) - 8);
        babyhare.TailAlpha = (((parenttwo.TailAlpha + parentone.TailAlpha) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.TailAlpha >= 128){
            babyhare.TailAlpha = 127;
        }
        int babybodysetter = new Random().nextInt(5);
        int babyearsetter = new Random().nextInt(5);
        int babytailsetter = new Random().nextInt(5);

        if (babytailsetter == 0 || babytailsetter == 1) {
            babyhare.TailType = parentone.TailType;
        } else if (babytailsetter == 2 || babytailsetter == 3) {
            babyhare.TailType = parenttwo.TailType;
        } else {
            babyhare.TailType = SetTailMethod();
        }
        if (babybodysetter == 0 || babybodysetter == 1) {
            babyhare.BodyType = parentone.BodyType;
        } else if (babybodysetter == 2 || babybodysetter == 3) {
            babyhare.BodyType = parenttwo.BodyType;
        } else {
            babyhare.BodyType = BodyTypeMethod();
        }
        if (babyearsetter == 0 || babyearsetter == 1) {
            babyhare.EarsType = parentone.EarsType;
        } else if (babyearsetter == 2 || babyearsetter == 3) {
            babyhare.EarsType = parenttwo.EarsType;
        } else {
            babyhare.EarsType = SetEarMethod();
        }

        babyhare.Price = PriceSettingMethod(babyhare);
        if (babyThreeCreatedCounter == 0) {
            BabyThree = babyhare;
            BabyHares[BabyNumber] = BabyThree;
            BabyNumber = BabyNumber + 1;
            babyThreeCreatedCounter = babyThreeCreatedCounter + 1;
            return BabyThree;
        }
        return BabyThree;

    }

    public Hare BabyMethodFour(Hare parentone, Hare parenttwo) {

        Hare babyhare = new Hare("a", 50, "a", 1, 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,0, 0, 1, 0, 0,SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );

        babyhare.At = Math.abs(parentone.At - parenttwo.At);
        babyhare.Bt = Math.abs(parentone.Bt - parenttwo.Bt);
        babyhare.Ct = Math.abs(parentone.Ct - parenttwo.Ct);
        babyhare.Dt = Math.abs(parentone.Dt - parenttwo.Dt);
        babyhare.Et = Math.abs(parentone.Et - parenttwo.Et);
        babyhare.Ft = Math.abs(parentone.Ft - parenttwo.Ft);

        babyhare.earAt = Math.abs(parentone.earAt - parenttwo.earAt);
        babyhare.earBt = Math.abs(parentone.earBt - parenttwo.earBt);
        babyhare.earCt = Math.abs(parentone.earCt - parenttwo.earCt);
        babyhare.earDt = Math.abs(parentone.earDt - parenttwo.earDt);
        babyhare.earEt = Math.abs(parentone.earEt - parenttwo.earEt);
        babyhare.earFt = Math.abs(parentone.earFt - parenttwo.earFt);

        babyhare.eyeAt = Math.abs(parentone.eyeAt - parenttwo.eyeAt);
        babyhare.eyeBt = Math.abs(parentone.eyeBt - parenttwo.eyeBt);
        babyhare.eyeCt = Math.abs(parentone.eyeCt - parenttwo.eyeCt);
        babyhare.eyeDt = Math.abs(parentone.eyeDt - parenttwo.eyeDt);
        babyhare.eyeEt = Math.abs(parentone.eyeEt - parenttwo.eyeEt);
        babyhare.eyeFt = Math.abs(parentone.eyeFt - parenttwo.eyeFt);

        babyhare.tailAt = Math.abs(parentone.tailAt - parenttwo.tailAt);
        babyhare.tailBt = Math.abs(parentone.tailBt - parenttwo.tailBt);
        babyhare.tailCt = Math.abs(parentone.tailCt - parenttwo.tailCt);
        babyhare.tailDt = Math.abs(parentone.tailDt - parenttwo.tailDt);
        babyhare.tailEt = Math.abs(parentone.tailEt - parenttwo.tailEt);
        babyhare.tailFt = Math.abs(parentone.tailFt - parenttwo.tailFt);

        babyhare.Sex = SetSexMethod();

        babyhare.size = (((parenttwo.size + parentone.size) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.size >= 149) {
            babyhare.size = 149;
        }
      if (babyhare.size <= 29) {
            babyhare.size = 30;
        }

        babyhare.Color = FinalColorMethod(babyhare.At, babyhare.Bt, babyhare.Ct, babyhare.Dt, babyhare.Et, babyhare.Ft);

        babyhare.HareAlpha = (((parenttwo.HareAlpha + parentone.HareAlpha) / 2) + new Random().nextInt(17) - 8);
        babyhare.TailAlpha = (((parenttwo.TailAlpha + parentone.TailAlpha) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.TailAlpha >= 128){
            babyhare.TailAlpha = 127;
        }
        int babybodysetter = new Random().nextInt(5);
        int babyearsetter = new Random().nextInt(5);
        int babytailsetter = new Random().nextInt(5);

        if (babytailsetter == 0 || babytailsetter == 1) {
            babyhare.TailType = parentone.TailType;
        } else if (babytailsetter == 2 || babytailsetter == 3) {
            babyhare.TailType = parenttwo.TailType;
        } else {
            babyhare.TailType = SetTailMethod();
        }
        if (babybodysetter == 0 || babybodysetter == 1) {
            babyhare.BodyType = parentone.BodyType;
        } else if (babybodysetter == 2 || babybodysetter == 3) {
            babyhare.BodyType = parenttwo.BodyType;
        } else {
            babyhare.BodyType = BodyTypeMethod();
        }
        if (babyearsetter == 0 || babyearsetter == 1) {
            babyhare.EarsType = parentone.EarsType;
        } else if (babyearsetter == 2 || babyearsetter == 3) {
            babyhare.EarsType = parenttwo.EarsType;
        } else {
            babyhare.EarsType = SetEarMethod();
        }
        babyhare.Price = PriceSettingMethod(babyhare);

        if (babyFourCreatedCounter == 0) {
            BabyFour = babyhare;
            BabyHares[BabyNumber] = BabyFour;
            BabyNumber = BabyNumber + 1;
            babyFourCreatedCounter = babyFourCreatedCounter + 1;
            return BabyFour;
        }
        return BabyFour;

    }

    public Hare BabyMethodFive(Hare parentone, Hare parenttwo) {

        Hare babyhare = new Hare("a", 50, "a", 1, 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,0, 0, 1, 0, 0, SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );


        if (parentone.At > parenttwo.At) {
            babyhare.At = parentone.At;
        } else {
            babyhare.At = parenttwo.At;
        }
        if (parentone.Bt > parenttwo.Bt) {
            babyhare.Bt = parentone.Bt;
        } else {
            babyhare.Bt = parenttwo.Bt;
        }
        if (parentone.Ct > parenttwo.Ct) {
            babyhare.Ct = parentone.Ct;
        } else {
            babyhare.Ct = parenttwo.Ct;
        }
        if (parentone.Dt > parenttwo.Dt) {
            babyhare.Dt = parentone.Dt;
        } else {
            babyhare.Dt = parenttwo.Dt;
        }
        if (parentone.Et > parenttwo.Et) {
            babyhare.Et = parentone.Et;
        } else {
            babyhare.Et = parenttwo.Et;
        }
        if (parentone.Ft > parenttwo.Ft) {
            babyhare.Ft = parentone.Ft;
        } else {
            babyhare.Ft = parenttwo.Ft;
        }
        if (parentone.earAt > parenttwo.earAt) {
            babyhare.earAt = parentone.earAt;
        } else {
            babyhare.earAt = parenttwo.earAt;
        }
        if (parentone.earBt > parenttwo.earBt) {
            babyhare.earBt = parentone.earBt;
        } else {
            babyhare.earBt = parenttwo.earBt;
        }
        if (parentone.earCt > parenttwo.earCt) {
            babyhare.earCt = parentone.earCt;
        } else {
            babyhare.earCt = parenttwo.earCt;
        }
        if (parentone.earDt > parenttwo.earDt) {
            babyhare.earDt = parentone.earDt;
        } else {
            babyhare.earDt = parenttwo.earDt;
        }
        if (parentone.earEt > parenttwo.earEt) {
            babyhare.earEt = parentone.earEt;
        } else {
            babyhare.earEt = parenttwo.earEt;
        }
        if (parentone.earFt > parenttwo.earFt) {
            babyhare.earFt = parentone.earFt;
        } else {
            babyhare.earFt = parenttwo.earFt;
        }
        if (parentone.Ft > parenttwo.Ft) {
            babyhare.Ft = parentone.Ft;
        } else {
            babyhare.Ft = parenttwo.Ft;
        }
        if (parentone.eyeAt > parenttwo.eyeAt) {
            babyhare.eyeAt = parentone.eyeAt;
        } else {
            babyhare.eyeAt = parenttwo.eyeAt;
        }
        if (parentone.eyeBt > parenttwo.eyeBt) {
            babyhare.eyeBt = parentone.eyeBt;
        } else {
            babyhare.eyeBt = parenttwo.eyeBt;
        }
        if (parentone.eyeCt > parenttwo.eyeCt) {
            babyhare.eyeCt = parentone.eyeCt;
        } else {
            babyhare.eyeCt = parenttwo.eyeCt;
        }
        if (parentone.eyeDt > parenttwo.eyeDt) {
            babyhare.eyeDt = parentone.eyeDt;
        } else {
            babyhare.eyeDt = parenttwo.eyeDt;
        }
        if (parentone.eyeEt > parenttwo.eyeEt) {
            babyhare.eyeEt = parentone.eyeEt;
        } else {
            babyhare.eyeEt = parenttwo.eyeEt;
        }
        if (parentone.eyeFt > parenttwo.eyeFt) {
            babyhare.eyeFt = parentone.eyeFt;
        } else {
            babyhare.eyeFt = parenttwo.eyeFt;
        }

     
        if (parentone.tailAt > parenttwo.tailAt) {
            babyhare.tailAt = parentone.tailAt;
        } else {
            babyhare.tailAt = parenttwo.tailAt;
        }
        if (parentone.tailBt > parenttwo.tailBt) {
            babyhare.tailBt = parentone.tailBt;
        } else {
            babyhare.tailBt = parenttwo.tailBt;
        }
        if (parentone.tailCt > parenttwo.tailCt) {
            babyhare.tailCt = parentone.tailCt;
        } else {
            babyhare.tailCt = parenttwo.tailCt;
        }
        if (parentone.tailDt > parenttwo.tailDt) {
            babyhare.tailDt = parentone.tailDt;
        } else {
            babyhare.tailDt = parenttwo.tailDt;
        }
        if (parentone.tailEt > parenttwo.tailEt) {
            babyhare.tailEt = parentone.tailEt;
        } else {
            babyhare.tailEt = parenttwo.tailEt;
        }
        if (parentone.tailFt > parenttwo.tailFt) {
            babyhare.tailFt = parentone.tailFt;
        } else {
            babyhare.tailFt = parenttwo.tailFt;
        }

        babyhare.Sex = SetSexMethod();
        babyhare.size = (((parenttwo.size + parentone.size) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.size >= 149) {
            babyhare.size = 149;
        }
      if (babyhare.size <= 29) {
            babyhare.size = 30;
        }

        babyhare.Color = FinalColorMethod(babyhare.At, babyhare.Bt, babyhare.Ct, babyhare.Dt, babyhare.Et, babyhare.Ft);

        babyhare.HareAlpha = (((parenttwo.HareAlpha + parentone.HareAlpha) / 2) + new Random().nextInt(17) - 8);
        babyhare.TailAlpha = (((parenttwo.TailAlpha + parentone.TailAlpha) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.TailAlpha >= 128){
            babyhare.TailAlpha = 127;
        }
        int babybodysetter = new Random().nextInt(5);
        int babyearsetter = new Random().nextInt(5);
        int babytailsetter = new Random().nextInt(5);

        if (babytailsetter == 0 || babytailsetter == 1) {
            babyhare.TailType = parentone.TailType;
        } else if (babytailsetter == 2 || babytailsetter == 3) {
            babyhare.TailType = parenttwo.TailType;
        } else {
            babyhare.TailType = SetTailMethod();
        }
        if (babybodysetter == 0 || babybodysetter == 1) {
            babyhare.BodyType = parentone.BodyType;
        } else if (babybodysetter == 2 || babybodysetter == 3) {
            babyhare.BodyType = parenttwo.BodyType;
        } else {
            babyhare.BodyType = BodyTypeMethod();
        }
        if (babyearsetter == 0 || babyearsetter == 1) {
            babyhare.EarsType = parentone.EarsType;
        } else if (babyearsetter == 2 || babyearsetter == 3) {
            babyhare.EarsType = parenttwo.EarsType;
        } else {
            babyhare.EarsType = SetEarMethod();
        }

        babyhare.Price = PriceSettingMethod(babyhare);
        if (babyFiveCreatedCounter == 0) {
            BabyFive = babyhare;
            BabyHares[BabyNumber] = BabyFive;
            BabyNumber = BabyNumber + 1;
            babyFiveCreatedCounter = babyFiveCreatedCounter + 1;
            return BabyFive;
        }
        return BabyFive;

    }

    public Hare BabyMethodSix(Hare parentone, Hare parenttwo) {

        Hare babyhare = new Hare("a", 50, "a", 1, 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,0, 0, 1, 0, 0,SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );

        babyhare.At = (parentone.At * parenttwo.At) % 16;
        babyhare.Bt = (parentone.Bt * parenttwo.Bt) % 16;
        babyhare.Ct = (parentone.Ct * parenttwo.Ct) % 16;
        babyhare.Dt = (parentone.Dt * parenttwo.Dt) % 16;
        babyhare.Et = (parentone.Et * parenttwo.Et) % 16;
        babyhare.Ft = (parentone.Ft * parenttwo.Ft) % 16;

        babyhare.eyeAt = (parentone.eyeAt * parenttwo.eyeAt) % 16;
        babyhare.eyeBt = (parentone.eyeBt * parenttwo.eyeBt) % 16;
        babyhare.eyeCt = (parentone.eyeCt * parenttwo.eyeCt) % 16;
        babyhare.eyeDt = (parentone.eyeDt * parenttwo.eyeDt) % 16;
        babyhare.eyeEt = (parentone.eyeEt * parenttwo.eyeEt) % 16;
        babyhare.eyeFt = (parentone.eyeFt * parenttwo.eyeFt) % 16;

        babyhare.tailAt = (parentone.tailAt * parenttwo.tailAt) % 16;
        babyhare.tailBt = (parentone.tailBt * parenttwo.tailBt) % 16;
        babyhare.tailCt = (parentone.tailCt * parenttwo.tailCt) % 16;
        babyhare.tailDt = (parentone.tailDt * parenttwo.tailDt) % 16;
        babyhare.tailEt = (parentone.tailEt * parenttwo.tailEt) % 16;
        babyhare.tailFt = (parentone.tailFt * parenttwo.tailFt) % 16;

        babyhare.earAt = (parentone.earAt * parenttwo.earAt) % 16;
        babyhare.earBt = (parentone.earBt * parenttwo.earBt) % 16;
        babyhare.earCt = (parentone.earCt * parenttwo.earCt) % 16;
        babyhare.earDt = (parentone.earDt * parenttwo.earDt) % 16;
        babyhare.earEt = (parentone.earEt * parenttwo.earEt) % 16;
        babyhare.earFt = (parentone.earFt * parenttwo.earFt) % 16;

        babyhare.Sex = SetSexMethod();

        babyhare.size = (((parenttwo.size + parentone.size) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.size >= 149) {
            babyhare.size = 149;
        }
      if (babyhare.size <= 29) {
            babyhare.size = 30;
        }

        babyhare.Color = FinalColorMethod(babyhare.At, babyhare.Bt, babyhare.Ct, babyhare.Dt, babyhare.Et, babyhare.Ft);

        babyhare.HareAlpha = (((parenttwo.HareAlpha + parentone.HareAlpha) / 2) + new Random().nextInt(17) - 8);
        babyhare.TailAlpha = (((parenttwo.TailAlpha + parentone.TailAlpha) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.TailAlpha >= 128){
            babyhare.TailAlpha = 127;
        }
        int babybodysetter = new Random().nextInt(5);
        int babyearsetter = new Random().nextInt(5);
        int babytailsetter = new Random().nextInt(5);

        if (babytailsetter == 0 || babytailsetter == 1) {
            babyhare.TailType = parentone.TailType;
        } else if (babytailsetter == 2 || babytailsetter == 3) {
            babyhare.TailType = parenttwo.TailType;
        } else {
            babyhare.TailType = SetTailMethod();
        }
        if (babybodysetter == 0 || babybodysetter == 1) {
            babyhare.BodyType = parentone.BodyType;
        } else if (babybodysetter == 2 || babybodysetter == 3) {
            babyhare.BodyType = parenttwo.BodyType;
        } else {
            babyhare.BodyType = BodyTypeMethod();
        }
        if (babyearsetter == 0 || babyearsetter == 1) {
            babyhare.EarsType = parentone.EarsType;
        } else if (babyearsetter == 2 || babyearsetter == 3) {
            babyhare.EarsType = parenttwo.EarsType;
        } else {
            babyhare.EarsType = SetEarMethod();
        }

        babyhare.Price = PriceSettingMethod(babyhare);
        if (babySixCreatedCounter == 0) {
            BabySix = babyhare;
            BabyHares[BabyNumber] = BabySix;
            BabyNumber = BabyNumber + 1;
            babySixCreatedCounter = babySixCreatedCounter + 1;
            return BabySix;
        }
        return BabySix;

    }


    public Hare BabyMethodSeven(Hare parentone, Hare parenttwo) {

        Hare babyhare = new Hare("a", 50, "a", 1, 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,0, 0, 1, 0, 0,SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );

        babyhare.At = (parentone.At & parenttwo.At) % 16;
        babyhare.Bt = (parentone.Bt & parenttwo.Bt) % 16;
        babyhare.Ct = (parentone.Ct & parenttwo.Ct) % 16;
        babyhare.Dt = (parentone.Dt & parenttwo.Dt) % 16;
        babyhare.Et = (parentone.Et & parenttwo.Et) % 16;
        babyhare.Ft = (parentone.Ft & parenttwo.Ft) % 16;

        babyhare.eyeAt = (parentone.eyeAt & parenttwo.eyeAt) % 16;
        babyhare.eyeBt = (parentone.eyeBt & parenttwo.eyeBt) % 16;
        babyhare.eyeCt = (parentone.eyeCt & parenttwo.eyeCt) % 16;
        babyhare.eyeDt = (parentone.eyeDt & parenttwo.eyeDt) % 16;
        babyhare.eyeEt = (parentone.eyeEt & parenttwo.eyeEt) % 16;
        babyhare.eyeFt = (parentone.eyeFt & parenttwo.eyeFt) % 16;

        babyhare.tailAt = (parentone.tailAt & parenttwo.tailAt) % 16;
        babyhare.tailBt = (parentone.tailBt & parenttwo.tailBt) % 16;
        babyhare.tailCt = (parentone.tailCt & parenttwo.tailCt) % 16;
        babyhare.tailDt = (parentone.tailDt & parenttwo.tailDt) % 16;
        babyhare.tailEt = (parentone.tailEt & parenttwo.tailEt) % 16;
        babyhare.tailFt = (parentone.tailFt & parenttwo.tailFt) % 16;

        babyhare.earAt = (parentone.earAt & parenttwo.earAt) % 16;
        babyhare.earBt = (parentone.earBt & parenttwo.earBt) % 16;
        babyhare.earCt = (parentone.earCt & parenttwo.earCt) % 16;
        babyhare.earDt = (parentone.earDt & parenttwo.earDt) % 16;
        babyhare.earEt = (parentone.earEt & parenttwo.earEt) % 16;
        babyhare.earFt = (parentone.earFt & parenttwo.earFt) % 16;

        babyhare.Sex = SetSexMethod();

        babyhare.size = (((parenttwo.size + parentone.size) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.size >= 149) {
            babyhare.size = 149;
        }
      if (babyhare.size <= 29) {
            babyhare.size = 30;
        }

        babyhare.Color = FinalColorMethod(babyhare.At, babyhare.Bt, babyhare.Ct, babyhare.Dt, babyhare.Et, babyhare.Ft);

        babyhare.HareAlpha = (((parenttwo.HareAlpha + parentone.HareAlpha) / 2) + new Random().nextInt(17) - 8);
        babyhare.TailAlpha = (((parenttwo.TailAlpha + parentone.TailAlpha) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.TailAlpha >= 128){
            babyhare.TailAlpha = 127;
        }
        int harealpha = babyhare.HareAlpha;
        int babybodysetter = new Random().nextInt(5);
        int babyearsetter = new Random().nextInt(5);
        int babytailsetter = new Random().nextInt(5);

        if (babytailsetter == 0 || babytailsetter == 1) {
            babyhare.TailType = parentone.TailType;
        } else if (babytailsetter == 2 || babytailsetter == 3) {
            babyhare.TailType = parenttwo.TailType;
        } else {
            babyhare.TailType = SetTailMethod();
        }
        if (babybodysetter == 0 || babybodysetter == 1) {
            babyhare.BodyType = parentone.BodyType;
        } else if (babybodysetter == 2 || babybodysetter == 3) {
            babyhare.BodyType = parenttwo.BodyType;
        } else {
            babyhare.BodyType = BodyTypeMethod();
        }
        if (babyearsetter == 0 || babyearsetter == 1) {
            babyhare.EarsType = parentone.EarsType;
        } else if (babyearsetter == 2 || babyearsetter == 3) {
            babyhare.EarsType = parenttwo.EarsType;
        } else {
            babyhare.EarsType = SetEarMethod();
        }

        babyhare.Price = PriceSettingMethod(babyhare);
        if (babySevenCreatedCounter == 0) {
            BabySeven = babyhare;
            BabyHares[BabyNumber] = BabySeven;
            BabyNumber = BabyNumber + 1;
            babySevenCreatedCounter = babySevenCreatedCounter + 1;
            return BabySeven;
        }
        return BabySeven;

    }


    public Hare BabyMethodEight(Hare parentone, Hare parenttwo) {

        Hare babyhare = new Hare("a", 50, "a", 1, 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,0, 0, 1, 0, 0,SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );

        babyhare.At = (parentone.At | parenttwo.At) % 16;
        babyhare.Bt = (parentone.Bt | parenttwo.Bt) % 16;
        babyhare.Ct = (parentone.Ct | parenttwo.Ct) % 16;
        babyhare.Dt = (parentone.Dt | parenttwo.Dt) % 16;
        babyhare.Et = (parentone.Et | parenttwo.Et) % 16;
        babyhare.Ft = (parentone.Ft | parenttwo.Ft) % 16;

        babyhare.eyeAt = (parentone.eyeAt | parenttwo.eyeAt) % 16;
        babyhare.eyeBt = (parentone.eyeBt | parenttwo.eyeBt) % 16;
        babyhare.eyeCt = (parentone.eyeCt | parenttwo.eyeCt) % 16;
        babyhare.eyeDt = (parentone.eyeDt | parenttwo.eyeDt) % 16;
        babyhare.eyeEt = (parentone.eyeEt | parenttwo.eyeEt) % 16;
        babyhare.eyeFt = (parentone.eyeFt | parenttwo.eyeFt) % 16;

        babyhare.tailAt = (parentone.tailAt | parenttwo.tailAt) % 16;
        babyhare.tailBt = (parentone.tailBt | parenttwo.tailBt) % 16;
        babyhare.tailCt = (parentone.tailCt | parenttwo.tailCt) % 16;
        babyhare.tailDt = (parentone.tailDt | parenttwo.tailDt) % 16;
        babyhare.tailEt = (parentone.tailEt | parenttwo.tailEt) % 16;
        babyhare.tailFt = (parentone.tailFt | parenttwo.tailFt) % 16;

        babyhare.earAt = (parentone.earAt | parenttwo.earAt) % 16;
        babyhare.earBt = (parentone.earBt | parenttwo.earBt) % 16;
        babyhare.earCt = (parentone.earCt | parenttwo.earCt) % 16;
        babyhare.earDt = (parentone.earDt | parenttwo.earDt) % 16;
        babyhare.earEt = (parentone.earEt | parenttwo.earEt) % 16;
        babyhare.earFt = (parentone.earFt | parenttwo.earFt) % 16;

        babyhare.Sex = SetSexMethod();

        babyhare.size = (((parenttwo.size + parentone.size) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.size >= 149) {
            babyhare.size = 149;
        }
      if (babyhare.size <= 29) {
            babyhare.size = 30;
        }

        babyhare.Color = FinalColorMethod(babyhare.At, babyhare.Bt, babyhare.Ct, babyhare.Dt, babyhare.Et, babyhare.Ft);

        babyhare.HareAlpha = (((parenttwo.HareAlpha + parentone.HareAlpha) / 2) + new Random().nextInt(17) - 8);
        babyhare.TailAlpha = (((parenttwo.TailAlpha + parentone.TailAlpha) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.TailAlpha >= 128){
            babyhare.TailAlpha = 127;
        }
        harealphaeight = babyhare.HareAlpha ;
        int babybodysetter = new Random().nextInt(5);
        int babyearsetter = new Random().nextInt(5);
        int babytailsetter = new Random().nextInt(5);

        if (babytailsetter == 0 || babytailsetter == 1) {
            babyhare.TailType = parentone.TailType;
        } else if (babytailsetter == 2 || babytailsetter == 3) {
            babyhare.TailType = parenttwo.TailType;
        } else {
            babyhare.TailType = SetTailMethod();
        }
        if (babybodysetter == 0 || babybodysetter == 1) {
            babyhare.BodyType = parentone.BodyType;
        } else if (babybodysetter == 2 || babybodysetter == 3) {
            babyhare.BodyType = parenttwo.BodyType;
        } else {
            babyhare.BodyType = BodyTypeMethod();
        }
        if (babyearsetter == 0 || babyearsetter == 1) {
            babyhare.EarsType = parentone.EarsType;
        } else if (babyearsetter == 2 || babyearsetter == 3) {
            babyhare.EarsType = parenttwo.EarsType;
        } else {
            babyhare.EarsType = SetEarMethod();
        }

        babyhare.Price = PriceSettingMethod(babyhare);
        if (babyEightCreatedCounter == 0) {
            BabyEight = babyhare;
            BabyHares[BabyNumber] = BabyEight;
            BabyNumber = BabyNumber + 1;
            babyEightCreatedCounter = babyEightCreatedCounter + 1;
            ShopCounterBabyNonNullifier = 1;
            return BabyEight;
        }
        return BabyEight;

    }

    public double PriceSettingMethod(Hare babyhare) {
        int colordifference;
        int sizeexoticity;
        int RedDominant = babyhare.At + babyhare.earAt + babyhare.eyeAt + babyhare.tailAt;
        int RedRecessive = babyhare.Bt + babyhare.earBt + babyhare.eyeBt + babyhare.tailBt;
        int GreenDominant = babyhare.Ct + babyhare.earCt + babyhare.eyeCt + babyhare.tailCt;
        int GreenRecessive = babyhare.Dt + babyhare.earDt + babyhare.eyeDt + babyhare.tailDt;
        int BlueDominant = babyhare.Et + babyhare.earEt + babyhare.eyeEt + babyhare.tailEt;
        int BlueRecessive = babyhare.Ft + babyhare.earFt + babyhare.eyeFt + babyhare.tailFt;
        int RedSixteen = RedDominant * 16;
        int GreenSixteen = GreenDominant * 16;
        int BlueSixteen = BlueDominant * 16;
        int RedTotal = RedRecessive + RedSixteen;
        int GreenTotal = GreenRecessive + GreenSixteen;
        int BlueTotal = BlueRecessive + BlueSixteen;
        if (RedTotal > GreenTotal && RedTotal > BlueTotal) {
            colordifference = (RedTotal - GreenTotal) + (RedTotal - BlueTotal);
        } else if (GreenTotal > RedTotal && GreenTotal > BlueTotal) {
            colordifference = (GreenTotal - RedTotal) + (GreenTotal - BlueTotal);
        } else if (BlueTotal > RedTotal && BlueTotal > GreenTotal) {
            colordifference = (BlueTotal - GreenTotal) + (BlueTotal - GreenTotal);
        } else {
            colordifference = 1;
        }
        sizeexoticity = Math.abs(babyhare.size - 90);

        babyhare.Price = 1 + ((colordifference * sizeexoticity) / 1000);

        if (babyhare.BodyType == 3){
            babyhare.Price = (babyhare.Price*5);

        }
        if (babyhare.EarsType == 7){
            babyhare.Price = (babyhare.Price*5);

        }

        return babyhare.Price;
    }


    public int ColorSettingMethod() {
        return new java.util.Random().nextInt(16);
    }

    public String FinalColorMethod(int A, int B, int C, int D, int E, int F) {
        String As = null;
        String Bs = null;
        String Cs = null;
        String Ds = null;
        String Es = null;
        String Fs = null;

        if (A == 0) {
            As = "0";
        }
        if (A == 1) {
            As = "1";
        }
        if (A == 2) {
            As = "2";
        }
        if (A == 3) {
            As = "3";
        }
        if (A == 4) {
            As = "4";
        }
        if (A == 5) {
            As = "5";
        }
        if (A == 6) {
            As = "6";
        }
        if (A == 7) {
            As = "7";
        }
        if (A == 8) {
            As = "8";
        }
        if (A == 9) {
            As = "9";
        }
        if (A == 10) {
            As = "A";
        }
        if (A == 11) {
            As = "B";
        }
        if (A == 12) {
            As = "C";
        }
        if (A == 13) {
            As = "D";
        }
        if (A == 14) {
            As = "E";
        }
        if (A == 15) {
            As = "F";
        }


        if (B == 0) {
            Bs = "0";
        }
        if (B == 1) {
            Bs = "1";
        }
        if (B == 2) {
            Bs = "2";
        }
        if (B == 3) {
            Bs = "3";
        }
        if (B == 4) {
            Bs = "4";
        }
        if (B == 5) {
            Bs = "5";
        }
        if (B == 6) {
            Bs = "6";
        }
        if (B == 7) {
            Bs = "7";
        }
        if (B == 8) {
            Bs = "8";
        }
        if (B == 9) {
            Bs = "9";
        }
        if (B == 10) {
            Bs = "A";
        }
        if (B == 11) {
            Bs = "B";
        }
        if (B == 12) {
            Bs = "C";
        }
        if (B == 13) {
            Bs = "D";
        }
        if (B == 14) {
            Bs = "E";
        }
        if (B == 15) {
            Bs = "F";
        }
        if (C == 0) {
            Cs = "0";
        }
        if (C == 1) {
            Cs = "1";
        }
        if (C == 2) {
            Cs = "2";
        }
        if (C == 3) {
            Cs = "3";
        }
        if (C == 4) {
            Cs = "4";
        }
        if (C == 5) {
            Cs = "5";
        }
        if (C == 6) {
            Cs = "6";
        }
        if (C == 7) {
            Cs = "7";
        }
        if (C == 8) {
            Cs = "8";
        }
        if (C == 9) {
            Cs = "9";
        }
        if (C == 10) {
            Cs = "C";
        }
        if (C == 11) {
            Cs = "B";
        }
        if (C == 12) {
            Cs = "C";
        }
        if (C == 13) {
            Cs = "D";
        }
        if (C == 14) {
            Cs = "E";
        }
        if (C == 15) {
            Cs = "F";
        }
        if (D == 0) {
            Ds = "0";
        }
        if (D == 1) {
            Ds = "1";
        }
        if (D == 2) {
            Ds = "2";
        }
        if (D == 3) {
            Ds = "3";
        }
        if (D == 4) {
            Ds = "4";
        }
        if (D == 5) {
            Ds = "5";
        }
        if (D == 6) {
            Ds = "6";
        }
        if (D == 7) {
            Ds = "7";
        }
        if (D == 8) {
            Ds = "8";
        }
        if (D == 9) {
            Ds = "9";
        }
        if (D == 10) {
            Ds = "D";
        }
        if (D == 11) {
            Ds = "B";
        }
        if (D == 12) {
            Ds = "C";
        }
        if (D == 13) {
            Ds = "D";
        }
        if (D == 14) {
            Ds = "E";
        }
        if (D == 15) {
            Ds = "F";
        }
        if (E == 0) {
            Es = "0";
        }
        if (E == 1) {
            Es = "1";
        }
        if (E == 2) {
            Es = "2";
        }
        if (E == 3) {
            Es = "3";
        }
        if (E == 4) {
            Es = "4";
        }
        if (E == 5) {
            Es = "5";
        }
        if (E == 6) {
            Es = "6";
        }
        if (E == 7) {
            Es = "7";
        }
        if (E == 8) {
            Es = "8";
        }
        if (E == 9) {
            Es = "9";
        }
        if (E == 10) {
            Es = "E";
        }
        if (E == 11) {
            Es = "B";
        }
        if (E == 12) {
            Es = "C";
        }
        if (E == 13) {
            Es = "D";
        }
        if (E == 14) {
            Es = "E";
        }
        if (E == 15) {
            Es = "F";
        }
        if (F == 0) {
            Fs = "0";
        }
        if (F == 1) {
            Fs = "1";
        }
        if (F == 2) {
            Fs = "2";
        }
        if (F == 3) {
            Fs = "3";
        }
        if (F == 4) {
            Fs = "4";
        }
        if (F == 5) {
            Fs = "5";
        }
        if (F == 6) {
            Fs = "6";
        }
        if (F == 7) {
            Fs = "7";
        }
        if (F == 8) {
            Fs = "8";
        }
        if (F == 9) {
            Fs = "9";
        }
        if (F == 10) {
            Fs = "F";
        }
        if (F == 11) {
            Fs = "B";
        }
        if (F == 12) {
            Fs = "C";
        }
        if (F == 13) {
            Fs = "D";
        }
        if (F == 14) {
            Fs = "E";
        }
        if (F == 15) {
            Fs = "F";
        }

        return String.format(PassColor, As, Bs, Cs, Ds, Es, Fs);
    }

    public void OpenHutch() {

        Intent intentHutch = new Intent(this, RabbitHutch.class);


        int babynumberlooper;
        int BabyCaller = babycounter;
        int StupidBabyNumber = BabyNumber;

        for (babynumberlooper = 0; babynumberlooper < BabyNumber; babynumberlooper++) {
            String catchname = "%s%s";
            String babyharecallname = String.format(catchname, "NewHare", babycounter);
            // intentHutch.putExtra(babyharecallname, babyhare);
            intentHutch.putExtra(babyharecallname, BabyHares[BabyCaller]);
            BabyCaller = BabyCaller + 1;
            babycounter = babycounter + 1;
        }

        babynumberlooper = 0;

        babycountercounter = babycountercounter + babycounter;
        intentHutch.putExtra("StupidBabyNumber", babycountercounter);


       // startActivity(intentHutch);

        babycounter = babycounter % BabyNumber;
        BabyCaller = BabyCaller % BabyNumber;
        babyOneCreatedCounter = 0;
        babyTwoCreatedCounter = 0;
        babyThreeCreatedCounter = 0;
        babyFourCreatedCounter = 0;
        babyFiveCreatedCounter = 0;
        babySixCreatedCounter = 0;
        babySevenCreatedCounter = 0;
        babyEightCreatedCounter = 0;

        startActivityForResult(intentHutch, 123);

    }


    public void SelectRabbitHutch() {

        Intent intentHutch = new Intent(this, RabbitHutch.class);
        int babynumberlooper;
        int BabyCaller = babycounter;
        //   if (BabyCaller != 0){
        //       BabyCaller = BabyCaller - 8;
        //  }
        int seriousalteration = BabyNumber - 8;
        // babycounter = babycounter - 8;


        int babynullifierOne = BabyNumber;
        int babynullifierTwo = BabyNumber - 1;
        int babynullifierThree = BabyNumber - 2;
        int babynullifierFour = BabyNumber - 3;
        int babynullifierFive = BabyNumber - 4;
        int babynullifierSix = BabyNumber - 5;
        int babynullifierSeven = BabyNumber - 6;
        int babynullifierEight = BabyNumber - 7;


        BabyHares[babynullifierEight] = null;
        BabyHares[babynullifierSeven] = null;
        BabyHares[babynullifierSix] = null;
        BabyHares[babynullifierFive] = null;
        BabyHares[babynullifierFour] = null;
        BabyHares[babynullifierThree] = null;
        BabyHares[babynullifierTwo] = null;
        BabyHares[babynullifierOne] = null;

        for (babynumberlooper = 0; babynumberlooper < seriousalteration; babynumberlooper++) {
            String catchname = "%s%s";
            String babyharecallname = String.format(catchname, "NewHare", BabyCaller);
            // intentHutch.putExtra(babyharecallname, babyhare);
            //int minoralterations = BabyCaller-8;
            intentHutch.putExtra(babyharecallname, BabyHares[BabyCaller]);
            BabyCaller = BabyCaller + 1;
            //   babycounter = babycounter + 1;
        }


        babycounter = (babycounter); // %BabyNumber;
        BabyNumber = BabyNumber - 8;
        //   intentHutch.putExtra("StupidBabyNumber", babycountercounter);

      //  startActivityForResult(intentHutch, 123);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == 123 && resultCode == RESULT_OK) {
            hairy.size = (int) data.getIntExtra("Hairysize", hairy.size);
            hairy.At = (int) data.getIntExtra("HairyAT", hairy.At);
            hairy.Bt = (int) data.getIntExtra("HairyBT", hairy.Bt);
            hairy.Ct = (int) data.getIntExtra("HairyCT", hairy.Ct);
            hairy.Dt = (int) data.getIntExtra("HairyDT", hairy.Dt);
            hairy.Et = (int) data.getIntExtra("HairyET", hairy.Et);
            hairy.Ft = (int) data.getIntExtra("HairyFT", hairy.Ft);
            hairy.earAt = (int) data.getIntExtra("HairyearAT", hairy.earAt);
            hairy.earBt = (int) data.getIntExtra("HairyearBT", hairy.earBt);
            hairy.earCt = (int) data.getIntExtra("HairyearCT", hairy.earCt);
            hairy.earDt = (int) data.getIntExtra("HairyearDT", hairy.earDt);
            hairy.earEt = (int) data.getIntExtra("HairyearET", hairy.earEt);
            hairy.earFt = (int) data.getIntExtra("HairyearFT", hairy.earFt);
            hairy.eyeAt = (int) data.getIntExtra("HairyeyeAT", hairy.eyeAt);
            hairy.eyeBt = (int) data.getIntExtra("HairyeyeBT", hairy.eyeBt);
            hairy.eyeCt = (int) data.getIntExtra("HairyeyeCT", hairy.eyeCt);
            hairy.eyeDt = (int) data.getIntExtra("HairyeyeDT", hairy.eyeDt);
            hairy.eyeEt = (int) data.getIntExtra("HairyeyeET", hairy.eyeEt);
            hairy.eyeFt = (int) data.getIntExtra("HairyeyeFT", hairy.eyeFt);
            hairy.tailAt = (int) data.getIntExtra("HairytailAT", hairy.tailAt);
            hairy.tailBt = (int) data.getIntExtra("HairytailBT", hairy.tailBt);
            hairy.tailCt = (int) data.getIntExtra("HairytailCT", hairy.tailCt);
            hairy.tailDt = (int) data.getIntExtra("HairytailDT", hairy.tailDt);
            hairy.tailEt = (int) data.getIntExtra("HairytailET", hairy.tailEt);
            hairy.tailFt = (int) data.getIntExtra("HairytailFT", hairy.tailFt);


            hairy.Sex = (String) data.getStringExtra("HairySex");
            hairy.Color = data.getStringExtra("HairyColor");
            hairy.HareAlpha = (int) data.getIntExtra("HairyHareAlpha", hairy.HareAlpha);
            hairy.TailAlpha = (int) data.getIntExtra("HairyTailAlpha", hairy.TailAlpha);
            hairy.BodyType = data.getIntExtra("HairyBodyType", hairy.BodyType);
            hairy.EarsType = data.getIntExtra("HairyEarsType",  hairy.EarsType);
            hairy.TailType = data.getIntExtra("HairyTailType",  hairy.TailType);
            hairy.EarsLength = data.getIntExtra("HairyEarsLength", hairy.EarsLength);
            hairy.EyesType = data.getIntExtra("HairyEyesType", hairy.EyesType);
            hairy.Price = data.getDoubleExtra("HairyEyesType", hairy.Price);

        }

        if (resultCode == RESULT_CANCELED) {
            hairy = hairy;


        }
        DisplayBodyOneMethod();
        DisplayEarsOneMethod();
        DisplayEyesOneMethod();
        DisplayTailOneMethod();
        DisplayBodyTwoMethod();
        DisplayEarsTwoMethod();
        DisplayEyeTwoMethod();
        DisplayTailTwoMethod();
        SexTextViewOneMethod();
        SizeTextViewOneMethod();
        SexTextViewTwoMethod();
        SizeTextViewTwoMethod();

        if (requestCode == 123 && resultCode == 420) {
                lola.size = (int) data.getIntExtra("Lolasize", lola.size);
                lola.At = (int) data.getIntExtra("LolaAT", lola.At);
                lola.Bt = (int) data.getIntExtra("LolaBT", lola.Bt);
                lola.Ct = (int) data.getIntExtra("LolaCT", lola.Ct);
                lola.Dt = (int) data.getIntExtra("LolaDT", lola.Dt);
                lola.Et = (int) data.getIntExtra("LolaET", lola.Et);
                lola.Ft = (int) data.getIntExtra("LolaFT", lola.Ft);
                lola.earAt = (int) data.getIntExtra("LolaearAT", lola.earAt);
                lola.earBt = (int) data.getIntExtra("LolaearBT", lola.earBt);
                lola.earCt = (int) data.getIntExtra("LolaearCT", lola.earCt);
                lola.earDt = (int) data.getIntExtra("LolaearDT", lola.earDt);
                lola.earEt = (int) data.getIntExtra("LolaearET", lola.earEt);
                lola.earFt = (int) data.getIntExtra("LolaearFT", lola.earFt);
                lola.eyeAt = (int) data.getIntExtra("LolaeyeAT", lola.eyeAt);
                lola.eyeBt = (int) data.getIntExtra("LolaeyeBT", lola.eyeBt);
                lola.eyeCt = (int) data.getIntExtra("LolaeyeCT", lola.eyeCt);
                lola.eyeDt = (int) data.getIntExtra("LolaeyeDT", lola.eyeDt);
                lola.eyeEt = (int) data.getIntExtra("LolaeyeET", lola.eyeEt);
                lola.eyeFt = (int) data.getIntExtra("LolaeyeFT", lola.eyeFt);
                lola.tailAt = (int) data.getIntExtra("LolatailAT", lola.tailAt);
                lola.tailBt = (int) data.getIntExtra("LolatailBT", lola.tailBt);
                lola.tailCt = (int) data.getIntExtra("LolatailCT", lola.tailCt);
                lola.tailDt = (int) data.getIntExtra("LolatailDT", lola.tailDt);
                lola.tailEt = (int) data.getIntExtra("LolatailET", lola.tailEt);
                lola.tailFt = (int) data.getIntExtra("LolatailFT", lola.tailFt);
                lola.Sex = (String) data.getStringExtra("LolaSex");
                lola.Color = data.getStringExtra("LolaColor");
                lola.HareAlpha = (int) data.getIntExtra("LolaHareAlpha", lola.HareAlpha);
                lola.TailAlpha = (int) data.getIntExtra("LolaTailAlpha", lola.TailAlpha);
                lola.BodyType = data.getIntExtra("LolaBodyType", lola.BodyType);
                lola.EarsType = data.getIntExtra("LolaEarsType",  lola.EarsType);
                lola.TailType = data.getIntExtra("LolaTailType",  lola.TailType);
                lola.EarsLength = data.getIntExtra("LolaEarsLength", lola.EarsLength);
                lola.EyesType = data.getIntExtra("LolaEyesType", lola.EyesType);
                lola.Price = data.getDoubleExtra("LolaEyesType", lola.Price);

            }

            if (resultCode == RESULT_CANCELED) {
                lola = lola;


            }
            DisplayBodyOneMethod();
            DisplayEarsOneMethod();
            DisplayEyesOneMethod();
            DisplayTailOneMethod();
            DisplayBodyTwoMethod();
            DisplayEarsTwoMethod();
            DisplayEyeTwoMethod();
            DisplayTailTwoMethod();
            SexTextViewOneMethod();
            SizeTextViewOneMethod();
            SexTextViewTwoMethod();
            SizeTextViewTwoMethod();

        }


    public void DisplayTailOneMethod() {
        HareTailOneView = (ImageView) findViewById(R.id.HareTailViewOne);
        HareTailOneView.setImageResource(Tail[hairy.TailType]);
        HareTailOneView.requestLayout();

        FrameLayout FrameOneLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewOne);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(hairy.size), convertToDp(hairy.size), Gravity.CENTER);
        FrameOneLayout.setLayoutParams(WrapParam);
        FrameOneLayout.setLayoutParams(CenterParam);
        HareTailOneView.getLayoutParams().height = convertToDp(hairy.size);
        HareTailOneView.getLayoutParams().width = convertToDp(hairy.size);
        HareTailOneView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((hairy.tailAt * 16) + hairy.tailBt);
        int Green = ((hairy.tailCt * 16) + hairy.tailDt);
        int Blue = ((hairy.tailEt * 16) + hairy.tailFt);
        HareTailOneView.setColorFilter(Color.argb(hairy.TailAlpha, Red, Green, Blue));
    }

    public void DisplayTailTwoMethod() {
        HareTailTwoView = (ImageView) findViewById(R.id.HareTailViewTwo);
        HareTailTwoView.setImageResource(Tail[lola.TailType]);
        HareTailTwoView.requestLayout();

        FrameLayout FrameTwoLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(lola.size), convertToDp(lola.size), Gravity.CENTER);
        FrameTwoLayout.setLayoutParams(WrapParam);
        FrameTwoLayout.setLayoutParams(CenterParam);
        HareTailTwoView.getLayoutParams().height = convertToDp(lola.size);
        HareTailTwoView.getLayoutParams().width = convertToDp(lola.size);
        HareTailTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((lola.tailAt * 16) + lola.tailBt);
        int Green = ((lola.tailCt * 16) + lola.tailDt);
        int Blue = ((lola.tailEt * 16) + lola.tailFt);
        HareTailTwoView.setColorFilter(Color.argb(lola.TailAlpha, Red, Green, Blue));
    }
    public void DisplayTailBabyOneMethod() {
        HareTailBabyOneView = (ImageView) findViewById(R.id.BabyHareTailViewOne);
        HareTailBabyOneView.setImageResource(Tail[BabyOne.TailType]);
        HareTailBabyOneView.requestLayout();
        int babydimension = (80 * BabyHareOneScaler) / 150;

        FrameLayout BabyFrameOneTailLayout = (FrameLayout) findViewById(R.id.BabyFrameOneTail);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneTailLayout.setLayoutParams(WrapParam);
        BabyFrameOneTailLayout.setLayoutParams(CenterParam);

        int tailscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareTailBabyOneView.getLayoutParams().height = convertToDp(babydimension);
        HareTailBabyOneView.getLayoutParams().width = convertToDp(babydimension);
        HareTailBabyOneView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyOne.tailAt * 16) + BabyOne.tailBt);
        int Green = ((BabyOne.tailCt * 16) + BabyOne.tailDt);
        int Blue = ((BabyOne.tailEt * 16) + BabyOne.tailFt);
        HareTailBabyOneView.setColorFilter(Color.argb(BabyOne.TailAlpha, Red, Green, Blue)); // Random Tint
        // HareTailOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }   
    
    public void DisplayTailBabyTwoMethod() {
        HareTailBabyTwoView = (ImageView) findViewById(R.id.HareTailViewBabyTwo);
        HareTailBabyTwoView.setImageResource(Tail[BabyTwo.TailType]);
        HareTailBabyTwoView.requestLayout();
        int babydimension = (80 * BabyHareTwoScaler) / 150;

        FrameLayout BabyFrameTwoTailLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewBabyTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameTwoTailLayout.setLayoutParams(WrapParam);
        BabyFrameTwoTailLayout.setLayoutParams(CenterParam);

        int tailscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareTailBabyTwoView.getLayoutParams().height = convertToDp(babydimension);
        HareTailBabyTwoView.getLayoutParams().width = convertToDp(babydimension);
        HareTailBabyTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyTwo.tailAt * 16) + BabyTwo.tailBt);
        int Green = ((BabyTwo.tailCt * 16) + BabyTwo.tailDt);
        int Blue = ((BabyTwo.tailEt * 16) + BabyTwo.tailFt);
        HareTailBabyTwoView.setColorFilter(Color.argb(BabyTwo.TailAlpha, Red, Green, Blue)); // Random Tint
        // HareTailTwoView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayTailBabyThreeMethod() {
        HareTailBabyThreeView = (ImageView) findViewById(R.id.HareTailViewBabyThree);
        HareTailBabyThreeView.setImageResource(Tail[BabyThree.TailType]);
        HareTailBabyThreeView.requestLayout();
        int babydimension = (80 * BabyHareThreeScaler) / 150;

        FrameLayout BabyFrameThreeTailLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewBabyThree);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameThreeTailLayout.setLayoutParams(WrapParam);
        BabyFrameThreeTailLayout.setLayoutParams(CenterParam);

        int tailscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareTailBabyThreeView.getLayoutParams().height = convertToDp(babydimension);
        HareTailBabyThreeView.getLayoutParams().width = convertToDp(babydimension);
        HareTailBabyThreeView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyThree.tailAt * 16) + BabyThree.tailBt);
        int Green = ((BabyThree.tailCt * 16) + BabyThree.tailDt);
        int Blue = ((BabyThree.tailEt * 16) + BabyThree.tailFt);
        HareTailBabyThreeView.setColorFilter(Color.argb(BabyThree.TailAlpha, Red, Green, Blue)); // Random Tint
        // HareTailThreeView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayTailBabyFourMethod() {
        HareTailBabyFourView = (ImageView) findViewById(R.id.HareTailViewBabyFour);
        HareTailBabyFourView.setImageResource(Tail[BabyFour.TailType]);
        HareTailBabyFourView.requestLayout();
        int babydimension = (80 * BabyHareFourScaler) / 150;

        FrameLayout BabyFrameFourTailLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewBabyFour);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameFourTailLayout.setLayoutParams(WrapParam);
        BabyFrameFourTailLayout.setLayoutParams(CenterParam);

        int tailscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareTailBabyFourView.getLayoutParams().height = convertToDp(babydimension);
        HareTailBabyFourView.getLayoutParams().width = convertToDp(babydimension);
        HareTailBabyFourView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyFour.tailAt * 16) + BabyFour.tailBt);
        int Green = ((BabyFour.tailCt * 16) + BabyFour.tailDt);
        int Blue = ((BabyFour.tailEt * 16) + BabyFour.tailFt);
        HareTailBabyFourView.setColorFilter(Color.argb(BabyFour.TailAlpha, Red, Green, Blue)); // Random Tint
        // HareTailFourView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayTailBabyFiveMethod() {
        HareTailBabyFiveView = (ImageView) findViewById(R.id.HareTailViewBabyFive);
        HareTailBabyFiveView.setImageResource(Tail[BabyFive.TailType]);
        HareTailBabyFiveView.requestLayout();
        int babydimension = (80 * BabyHareFiveScaler) / 150;

        FrameLayout BabyFrameFiveTailLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewBabyFive);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameFiveTailLayout.setLayoutParams(WrapParam);
        BabyFrameFiveTailLayout.setLayoutParams(CenterParam);

        int tailscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareTailBabyFiveView.getLayoutParams().height = convertToDp(babydimension);
        HareTailBabyFiveView.getLayoutParams().width = convertToDp(babydimension);
        HareTailBabyFiveView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyFive.tailAt * 16) + BabyFive.tailBt);
        int Green = ((BabyFive.tailCt * 16) + BabyFive.tailDt);
        int Blue = ((BabyFive.tailEt * 16) + BabyFive.tailFt);
        HareTailBabyFiveView.setColorFilter(Color.argb(BabyFive.TailAlpha, Red, Green, Blue)); // Random Tint
        // HareTailFiveView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayTailBabySixMethod() {
        HareTailBabySixView = (ImageView) findViewById(R.id.HareTailViewBabySix);
        HareTailBabySixView.setImageResource(Tail[BabySix.TailType]);
        HareTailBabySixView.requestLayout();
        int babydimension = (80 * BabyHareSixScaler) / 150;

        FrameLayout BabyFrameSixTailLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewBabySix);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameSixTailLayout.setLayoutParams(WrapParam);
        BabyFrameSixTailLayout.setLayoutParams(CenterParam);

        int tailscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareTailBabySixView.getLayoutParams().height = convertToDp(babydimension);
        HareTailBabySixView.getLayoutParams().width = convertToDp(babydimension);
        HareTailBabySixView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabySix.tailAt * 16) + BabySix.tailBt);
        int Green = ((BabySix.tailCt * 16) + BabySix.tailDt);
        int Blue = ((BabySix.tailEt * 16) + BabySix.tailFt);
        HareTailBabySixView.setColorFilter(Color.argb(BabySix.TailAlpha, Red, Green, Blue)); // Random Tint
        // HareTailSixView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayTailBabySevenMethod() {
        HareTailBabySevenView = (ImageView) findViewById(R.id.HareTailViewBabySeven);
        HareTailBabySevenView.setImageResource(Tail[BabySeven.TailType]);
        HareTailBabySevenView.requestLayout();
        int babydimension = (80 * BabyHareSevenScaler) / 150;

        FrameLayout BabyFrameSevenTailLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewBabySeven);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameSevenTailLayout.setLayoutParams(WrapParam);
        BabyFrameSevenTailLayout.setLayoutParams(CenterParam);

        int tailscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareTailBabySevenView.getLayoutParams().height = convertToDp(babydimension);
        HareTailBabySevenView.getLayoutParams().width = convertToDp(babydimension);
        HareTailBabySevenView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabySeven.tailAt * 16) + BabySeven.tailBt);
        int Green = ((BabySeven.tailCt * 16) + BabySeven.tailDt);
        int Blue = ((BabySeven.tailEt * 16) + BabySeven.tailFt);
        HareTailBabySevenView.setColorFilter(Color.argb(BabySeven.TailAlpha, Red, Green, Blue)); // Random Tint
        // HareTailSevenView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayTailBabyEightMethod() {
        HareTailBabyEightView = (ImageView) findViewById(R.id.HareTailViewBabyEight);
        HareTailBabyEightView.setImageResource(Tail[BabyEight.TailType]);
        HareTailBabyEightView.requestLayout();
        int babydimension = (80 * BabyHareEightScaler) / 150;

        FrameLayout BabyFrameEightTailLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewBabyEight);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameEightTailLayout.setLayoutParams(WrapParam);
        BabyFrameEightTailLayout.setLayoutParams(CenterParam);

        int tailscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareTailBabyEightView.getLayoutParams().height = convertToDp(babydimension);
        HareTailBabyEightView.getLayoutParams().width = convertToDp(babydimension);
        HareTailBabyEightView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyEight.tailAt * 16) + BabyEight.tailBt);
        int Green = ((BabyEight.tailCt * 16) + BabyEight.tailDt);
        int Blue = ((BabyEight.tailEt * 16) + BabyEight.tailFt);
        HareTailBabyEightView.setColorFilter(Color.argb(BabyEight.TailAlpha, Red, Green, Blue)); // Random Tint
        // HareTailEightView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

}