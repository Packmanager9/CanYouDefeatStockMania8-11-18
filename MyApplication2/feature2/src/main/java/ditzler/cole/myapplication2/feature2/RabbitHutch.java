package ditzler.cole.myapplication2.feature2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;


import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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


public class RabbitHutch extends AppCompatActivity {

    String catchname = "%s%s";
    int babydisplaycounter, babycounter, ReverseCheckCounter = 0;
    String Male = "Male";
    ImageView DisplayBodyTwo, DisplayEarsTwo, DisplayEyesTwo, DisplayBodyThree, DisplayEarsThree, DisplayEyesThree, DisplayBodyFour, DisplayEarsFour, DisplayEyesFour, DisplayBodyFive, DisplayEarsFive, DisplayEyesFive, DisplayBodySix, DisplayEarsSix, DisplayEyesSix, DisplayBodySeven, DisplayEarsSeven, DisplayEyesSeven, DisplayBodyEight, DisplayEarsEight, DisplayEyesEight, DisplayBodyNine, DisplayEarsNine, DisplayEyesNine, DisplayBodyTen, DisplayEarsTen, DisplayEyesTen, DisplayBodyEleven, DisplayEarsEleven, DisplayEyesEleven,  DisplayBodyThirteen, DisplayEarsThirteen, DisplayEyesThirteen, DisplayBodyFourteen, DisplayEarsFourteen, DisplayEyesFourteen, DisplayBodyFifteen, DisplayEarsFifteen, DisplayEyesFifteen ,DisplayBodySixteen, DisplayEarsSixteen, DisplayEyesSixteen;
    ImageButton DisplayTailSelectedOne, DisplayBodyOne, DisplayEarsOne, DisplayTailOne, DisplayTailTwo,DisplayTailThree, DisplayTailFour, DisplayTailFive, DisplayBodyTwelve, DisplayEarsTwelve, DisplayEyesTwelve, DisplayTailSix, DisplayTailSeven, DisplayTailEight, DisplayTailNine, DisplayTailTen,DisplayTailEleven, DisplayTailTwelve, DisplayTailThirteen, DisplayTailFourteen, DisplayTailFifteen, DisplayTailSixteen, DisplayEyesOne, DisplayBodySelectedOne, DisplayEarsSelectedOne, DisplayEyesSelectedOne;
TextView DisplaySelectedSex;
    Button DisplayAll,DisplayAllPast, PickOnLola, PickOnHairy;
    private Integer Bodies[] = {R.drawable.rabbitbody, R.drawable.rabbitbodyspotsone, R.drawable.rabbitbodyspotstwo, R.drawable.rabbitbodystar, R.drawable.rabbitbodyrings, R.drawable.rabbitbodystripes, R.drawable.rabbitbodystripestwo, R.drawable.rabbitbodybeans, R.drawable.rabbitbodybigspot, R.drawable.rabbitbodytarget, R.drawable.rabbitbodyx, R.drawable.rabbitbodynine};

    private Integer Ears[] = {R.drawable.rabbitearsroundspotlongsplit, R.drawable.rabbitearsroundspotlongsplitvery,R.drawable.rabbitearsroundspotlongsplithuge, R.drawable.rabbitearspointylong, R.drawable.rabbitearspointyclose, R.drawable.rabbitearsroundlong, R.drawable.rabbitearsroundspotlongclose, R.drawable.rabbitearsnarwhalhorn};

    private Integer Eyes[] = {R.drawable.rabbiteyesmedium, R.drawable.rabbiteyeswide, R.drawable.rabbiteyes};

    private Integer Tail[] = {R.drawable.rabbitfluffytailflat, R.drawable.rabbitfluffytail, R.drawable.rabbitfluffytailwide, R.drawable.rabbitfeathertail, R.drawable.rabbitfeathertailnarrow, R.drawable.rabbitfeathertailtwo, R.drawable.rabbitfluffytailwide, R.drawable.rabbitfluffytail, R.drawable.rabbitfluffytailwide, R.drawable.rabbitfluffytail, R.drawable.rabbitfluffytailwide, R.drawable.rabbitfluffytail, R.drawable.rabbitfluffytailwide};


    HareSplitting.Hare BabyButtonOneSelecterHare, BabyButtonTwoSelecterHare, BabyButtonThreeSelecterHare, BabyButtonFourSelecterHare, BabyButtonFiveSelecterHare, BabyButtonSixSelecterHare, BabyButtonSevenSelecterHare, BabyButtonEightSelecterHare,BabyButtonNineSelecterHare,BabyButtonTenSelecterHare,BabyButtonElevenSelecterHare,BabyButtonTwelveSelecterHare,BabyButtonThirteenSelecterHare,BabyButtonFourteenSelecterHare,BabyButtonFifteenSelecterHare,BabyButtonSixteenSelecterHare= null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hare_hutch);

        TextView selectedsexdisplay = (TextView) findViewById(R.id.DisplaySelectedSex);
        TextView selectedSizedisplay = (TextView) findViewById(R.id.DisplaySelectedSize);
        TextView selectedEarColordisplay = (TextView) findViewById(R.id.DisplaySelectedEarColor);
        TextView selectedEyeColordisplay = (TextView) findViewById(R.id.DisplaySelectedEyeColor);
        TextView selectedBodyColordisplay = (TextView) findViewById(R.id.DisplaySelectedBodyColor);
        TextView selectedTailColordisplay = (TextView) findViewById(R.id.DisplaySelectedTailColor);
        TextView selectedAlphasdisplay = (TextView) findViewById(R.id.DisplaySelectedAlphas);
        TextView selectedPricedisplay = (TextView) findViewById(R.id.DisplaySelectedPrice);

        DisplayAll = (Button) findViewById(R.id.Display);
        DisplayAllPast = (Button) findViewById(R.id.DisplayPast);
        PickOnLola = (Button) findViewById(R.id.PickLola);
        PickOnHairy = (Button) findViewById(R.id.PickHairy);

        DisplaySelectedSex = (TextView) findViewById(R.id.DisplaySex);

        DisplayBodyOne = (ImageButton) findViewById(R.id.DisplayBabyOneBody);
        DisplayEarsOne = (ImageButton) findViewById(R.id.DisplayBabyOneEars);
        DisplayEyesOne = (ImageButton) findViewById(R.id.DisplayBabyOneEyes);
        DisplayTailOne = (ImageButton) findViewById(R.id.DisplayBabyOneTail);
        DisplayTailTwo = (ImageButton) findViewById(R.id.DisplayBabyTwoTail);
        DisplayTailThree = (ImageButton) findViewById(R.id.DisplayBabyThreeTail);
        DisplayTailFour = (ImageButton) findViewById(R.id.DisplayBabyFourTail);
        DisplayTailFive = (ImageButton) findViewById(R.id.DisplayBabyFiveTail);
        DisplayTailSix = (ImageButton) findViewById(R.id.DisplayBabySixTail);
        DisplayTailSeven = (ImageButton) findViewById(R.id.DisplayBabySevenTail);
        DisplayTailEight = (ImageButton) findViewById(R.id.DisplayBabyEightTail);
        DisplayTailNine = (ImageButton) findViewById(R.id.DisplayBabyNineTail);
        DisplayTailTen = (ImageButton) findViewById(R.id.DisplayBabyTenTail);
        DisplayTailEleven = (ImageButton) findViewById(R.id.DisplayBabyElevenTail);
        DisplayTailTwelve = (ImageButton) findViewById(R.id.DisplayBabyTwelveTail);
        DisplayTailThirteen = (ImageButton) findViewById(R.id.DisplayBabyThirteenTail);
        DisplayTailFourteen = (ImageButton) findViewById(R.id.DisplayBabyFourteenTail);
        DisplayTailFifteen = (ImageButton) findViewById(R.id.DisplayBabyFifteenTail);
        DisplayTailSixteen = (ImageButton) findViewById(R.id.DisplayBabySixteenTail);
        DisplayBodyTwo = (ImageView) findViewById(R.id.DisplayBabyTwoBody);
        DisplayEarsTwo = (ImageView) findViewById(R.id.DisplayBabyTwoEars);
        DisplayEyesTwo = (ImageView) findViewById(R.id.DisplayBabyTwoEyes);
        DisplayBodySelectedOne = (ImageButton) findViewById(R.id.DisplayBabyBodyLarge);
        DisplayEarsSelectedOne = (ImageButton) findViewById(R.id.DisplayBabyEarsLarge);
        DisplayEyesSelectedOne = (ImageButton) findViewById(R.id.DisplayBabyEyesLarge);
        DisplayTailSelectedOne = (ImageButton) findViewById(R.id.DisplayBabyTailLarge);
        


        //   Intent intentHutch = getIntent();
        //   String catchname = "%s%s";
        //    String babyharecallname = String.format(catchname, "NewHare", babycounter);
        //    final Hare HareOne = (Hare)intentHutch.getSerializableExtra(babyharecallname);


        DisplayAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHutch = getIntent();
                String catchname = "%s%s";
                String babyharecallnameOne = String.format(catchname, "NewHare", babycounter);
                HareSplitting.Hare HareOne = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameOne);
                int StupidBabyNumber = (int) intentHutch.getDoubleExtra("StupidBabyNumber", 400);
                HareSplitting.Hare BabyHares[] = new HareSplitting.Hare[StupidBabyNumber];
                //  Hare HareOne = (Hare)intentHutch.getSerializableExtra(babyharecallname);
                DisplayBodyOne = (ImageButton) findViewById(R.id.DisplayBabyOneBody);
                DisplayEarsOne = (ImageButton) findViewById(R.id.DisplayBabyOneEars);
                DisplayEyesOne = (ImageButton) findViewById(R.id.DisplayBabyOneEyes);
                DisplayTailOne = (ImageButton) findViewById(R.id.DisplayBabyOneTail);

                

                if (HareOne != null) {
                    DisplayBodyOne.setImageResource(Bodies[HareOne.BodyType]);
                    DisplayEarsOne.setImageResource(Ears[HareOne.EarsType]);
                    DisplayEyesOne.setImageResource(Eyes[HareOne.EyesType]);
                    int Red = ((HareOne.At * 16) + HareOne.Bt);
                    int Green = ((HareOne.Ct * 16) + HareOne.Dt);
                    int Blue = ((HareOne.Et * 16) + HareOne.Ft);
                    DisplayBodyOne.setColorFilter(Color.argb(HareOne.HareAlpha, Red, Green, Blue));
                    int Rede1 = ((HareOne.earAt * 16) + HareOne.earBt);
                    int Greene1 = ((HareOne.earCt * 16) + HareOne.earDt);
                    int Bluee1 = ((HareOne.earEt * 16) + HareOne.earFt);
                    DisplayEarsOne.setColorFilter(Color.argb(HareOne.HareAlpha, Rede1, Greene1, Bluee1));
                    int Rede2 = ((HareOne.eyeAt * 16) + HareOne.eyeBt);
                    int Greene2 = ((HareOne.eyeCt * 16) + HareOne.eyeDt);
                    int Bluee2 = ((HareOne.eyeEt * 16) + HareOne.eyeFt);
                    DisplayEyesOne.setColorFilter(Color.argb(HareOne.HareAlpha, Rede2, Greene2, Bluee2));
                    babycounter = (babycounter + 1) % StupidBabyNumber;
                }


                String babyharecallnameTwo = String.format(catchname, "NewHare", babycounter);
                HareSplitting.Hare HareTwo = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameTwo);
                //  Hare HareTwo = (Hare)intentHutch.getSerializableExtra(babyharecallname);
                DisplayBodyTwo = (ImageView) findViewById(R.id.DisplayBabyTwoBody);
                DisplayEarsTwo = (ImageView) findViewById(R.id.DisplayBabyTwoEars);
                DisplayEyesTwo = (ImageView) findViewById(R.id.DisplayBabyTwoEyes);


                if (HareTwo != null) {
                    DisplayBodyTwo.setImageResource(Bodies[HareTwo.BodyType]);
                    DisplayEarsTwo.setImageResource(Ears[HareTwo.EarsType]);
                    DisplayEyesTwo.setImageResource(Eyes[HareTwo.EyesType]);
                    int TwoRed = ((HareTwo.At * 16) + HareTwo.Bt);
                    int TwoGreen = ((HareTwo.Ct * 16) + HareTwo.Dt);
                    int TwoBlue = ((HareTwo.Et * 16) + HareTwo.Ft);
                    DisplayBodyTwo.setColorFilter(Color.argb(HareTwo.HareAlpha, TwoRed, TwoGreen, TwoBlue));
                    int TwoRede1 = ((HareTwo.earAt * 16) + HareTwo.earBt);
                    int TwoGreene1 = ((HareTwo.earCt * 16) + HareTwo.earDt);
                    int TwoBluee1 = ((HareTwo.earEt * 16) + HareTwo.earFt);
                    DisplayEarsTwo.setColorFilter(Color.argb(HareTwo.HareAlpha, TwoRede1, TwoGreene1, TwoBluee1));
                    int TwoRede2 = ((HareTwo.eyeAt * 16) + HareTwo.eyeBt);
                    int TwoGreene2 = ((HareTwo.eyeCt * 16) + HareTwo.eyeDt);
                    int TwoBluee2 = ((HareTwo.eyeEt * 16) + HareTwo.eyeFt);
                    DisplayEyesTwo.setColorFilter(Color.argb(HareTwo.HareAlpha, TwoRede2, TwoGreene2, TwoBluee2));
                    babycounter = (babycounter + 1) % StupidBabyNumber;
                }


                String babyharecallnameThree = String.format(catchname, "NewHare", babycounter);
                HareSplitting.Hare HareThree = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameThree);
                //  Hare HareTwo = (Hare)intentHutch.getSerializableExtra(babyharecallname);
                DisplayBodyThree = (ImageView) findViewById(R.id.DisplayBabyThreeBody);
                DisplayEarsThree = (ImageView) findViewById(R.id.DisplayBabyThreeEars);
                DisplayEyesThree = (ImageView) findViewById(R.id.DisplayBabyThreeEyes);


                if (HareThree != null) {
                    DisplayBodyThree.setImageResource(Bodies[HareThree.BodyType]);
                    DisplayEarsThree.setImageResource(Ears[HareThree.EarsType]);
                    DisplayEyesThree.setImageResource(Eyes[HareThree.EyesType]);
                    int ThreeRed = ((HareThree.At * 16) + HareThree.Bt);
                    int ThreeGreen = ((HareThree.Ct * 16) + HareThree.Dt);
                    int ThreeBlue = ((HareThree.Et * 16) + HareThree.Ft);
                    DisplayBodyThree.setColorFilter(Color.argb(HareThree.HareAlpha, ThreeRed, ThreeGreen, ThreeBlue));
                    int ThreeRede1 = ((HareThree.earAt * 16) + HareThree.earBt);
                    int ThreeGreene1 = ((HareThree.earCt * 16) + HareThree.earDt);
                    int ThreeBluee1 = ((HareThree.earEt * 16) + HareThree.earFt);
                    DisplayEarsThree.setColorFilter(Color.argb(HareThree.HareAlpha, ThreeRede1, ThreeGreene1, ThreeBluee1));
                    int ThreeRede2 = ((HareThree.eyeAt * 16) + HareThree.eyeBt);
                    int ThreeGreene2 = ((HareThree.eyeCt * 16) + HareThree.eyeDt);
                    int ThreeBluee2 = ((HareThree.eyeEt * 16) + HareThree.eyeFt);
                    DisplayEyesThree.setColorFilter(Color.argb(HareThree.HareAlpha, ThreeRede2, ThreeGreene2, ThreeBluee2));
                    babycounter = (babycounter + 1) % StupidBabyNumber;
                }

                String babyharecallnameFour = String.format(catchname, "NewHare", babycounter);
                HareSplitting.Hare HareFour = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameFour);
                //  Hare HareTwo = (Hare)intentHutch.getSerializableExtra(babyharecallname);
                DisplayBodyFour = (ImageView) findViewById(R.id.DisplayBabyFourBody);
                DisplayEarsFour = (ImageView) findViewById(R.id.DisplayBabyFourEars);
                DisplayEyesFour = (ImageView) findViewById(R.id.DisplayBabyFourEyes);


                if (HareFour != null) {
                    DisplayBodyFour.setImageResource(Bodies[HareFour.BodyType]);
                    DisplayEarsFour.setImageResource(Ears[HareFour.EarsType]);
                    DisplayEyesFour.setImageResource(Eyes[HareFour.EyesType]);
                    int FourRed = ((HareFour.At * 16) + HareFour.Bt);
                    int FourGreen = ((HareFour.Ct * 16) + HareFour.Dt);
                    int FourBlue = ((HareFour.Et * 16) + HareFour.Ft);
                    DisplayBodyFour.setColorFilter(Color.argb(HareFour.HareAlpha, FourRed, FourGreen, FourBlue));
                    int FourRede1 = ((HareFour.earAt * 16) + HareFour.earBt);
                    int FourGreene1 = ((HareFour.earCt * 16) + HareFour.earDt);
                    int FourBluee1 = ((HareFour.earEt * 16) + HareFour.earFt);
                    DisplayEarsFour.setColorFilter(Color.argb(HareFour.HareAlpha, FourRede1, FourGreene1, FourBluee1));
                    int FourRede2 = ((HareFour.eyeAt * 16) + HareFour.eyeBt);
                    int FourGreene2 = ((HareFour.eyeCt * 16) + HareFour.eyeDt);
                    int FourBluee2 = ((HareFour.eyeEt * 16) + HareFour.eyeFt);
                    DisplayEyesFour.setColorFilter(Color.argb(HareFour.HareAlpha, FourRede2, FourGreene2, FourBluee2));
                    babycounter = (babycounter + 1) % StupidBabyNumber;
                }


                String babyharecallnameFive = String.format(catchname, "NewHare", babycounter);
                HareSplitting.Hare HareFive = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameFive);
                //  Hare HareTwo = (Hare)intentHutch.getSerializableExtra(babyharecallname);
                DisplayBodyFive = (ImageView) findViewById(R.id.DisplayBabyFiveBody);
                DisplayEarsFive = (ImageView) findViewById(R.id.DisplayBabyFiveEars);
                DisplayEyesFive = (ImageView) findViewById(R.id.DisplayBabyFiveEyes);


                if (HareFive != null) {
                    DisplayBodyFive.setImageResource(Bodies[HareFive.BodyType]);
                    DisplayEarsFive.setImageResource(Ears[HareFive.EarsType]);
                    DisplayEyesFive.setImageResource(Eyes[HareFive.EyesType]);
                    int FiveRed = ((HareFive.At * 16) + HareFive.Bt);
                    int FiveGreen = ((HareFive.Ct * 16) + HareFive.Dt);
                    int FiveBlue = ((HareFive.Et * 16) + HareFive.Ft);
                    DisplayBodyFive.setColorFilter(Color.argb(HareFive.HareAlpha, FiveRed, FiveGreen, FiveBlue));
                    int FiveRede1 = ((HareFive.earAt * 16) + HareFive.earBt);
                    int FiveGreene1 = ((HareFive.earCt * 16) + HareFive.earDt);
                    int FiveBluee1 = ((HareFive.earEt * 16) + HareFive.earFt);
                    DisplayEarsFive.setColorFilter(Color.argb(HareFive.HareAlpha, FiveRede1, FiveGreene1, FiveBluee1));
                    int FiveRede2 = ((HareFive.eyeAt * 16) + HareFive.eyeBt);
                    int FiveGreene2 = ((HareFive.eyeCt * 16) + HareFive.eyeDt);
                    int FiveBluee2 = ((HareFive.eyeEt * 16) + HareFive.eyeFt);
                    DisplayEyesFive.setColorFilter(Color.argb(HareFive.HareAlpha, FiveRede2, FiveGreene2, FiveBluee2));
                    babycounter = (babycounter + 1) % StupidBabyNumber;
                }


                String babyharecallnameSix = String.format(catchname, "NewHare", babycounter);
                HareSplitting.Hare HareSix = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameSix);
                //  Hare HareTwo = (Hare)intentHutch.getSerializableExtra(babyharecallname);
                DisplayBodySix = (ImageView) findViewById(R.id.DisplayBabySixBody);
                DisplayEarsSix = (ImageView) findViewById(R.id.DisplayBabySixEars);
                DisplayEyesSix = (ImageView) findViewById(R.id.DisplayBabySixEyes);


                if (HareSix != null) {
                    DisplayBodySix.setImageResource(Bodies[HareSix.BodyType]);
                    DisplayEarsSix.setImageResource(Ears[HareSix.EarsType]);
                    DisplayEyesSix.setImageResource(Eyes[HareSix.EyesType]);
                    int SixRed = ((HareSix.At * 16) + HareSix.Bt);
                    int SixGreen = ((HareSix.Ct * 16) + HareSix.Dt);
                    int SixBlue = ((HareSix.Et * 16) + HareSix.Ft);
                    DisplayBodySix.setColorFilter(Color.argb(HareSix.HareAlpha, SixRed, SixGreen, SixBlue));
                    int SixRede1 = ((HareSix.earAt * 16) + HareSix.earBt);
                    int SixGreene1 = ((HareSix.earCt * 16) + HareSix.earDt);
                    int SixBluee1 = ((HareSix.earEt * 16) + HareSix.earFt);
                    DisplayEarsSix.setColorFilter(Color.argb(HareSix.HareAlpha, SixRede1, SixGreene1, SixBluee1));
                    int SixRede2 = ((HareSix.eyeAt * 16) + HareSix.eyeBt);
                    int SixGreene2 = ((HareSix.eyeCt * 16) + HareSix.eyeDt);
                    int SixBluee2 = ((HareSix.eyeEt * 16) + HareSix.eyeFt);
                    DisplayEyesSix.setColorFilter(Color.argb(HareSix.HareAlpha, SixRede2, SixGreene2, SixBluee2));
                    babycounter = (babycounter + 1) % StupidBabyNumber;
                }


                String babyharecallnameSeven = String.format(catchname, "NewHare", babycounter);
                HareSplitting.Hare HareSeven = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameSeven);
                //  Hare HareTwo = (Hare)intentHutch.getSerializableExtra(babyharecallname);
                DisplayBodySeven = (ImageView) findViewById(R.id.DisplayBabySevenBody);
                DisplayEarsSeven = (ImageView) findViewById(R.id.DisplayBabySevenEars);
                DisplayEyesSeven = (ImageView) findViewById(R.id.DisplayBabySevenEyes);


                if (HareSeven != null) {
                    DisplayBodySeven.setImageResource(Bodies[HareSeven.BodyType]);
                    DisplayEarsSeven.setImageResource(Ears[HareSeven.EarsType]);
                    DisplayEyesSeven.setImageResource(Eyes[HareSeven.EyesType]);
                    int SevenRed = ((HareSeven.At * 16) + HareSeven.Bt);
                    int SevenGreen = ((HareSeven.Ct * 16) + HareSeven.Dt);
                    int SevenBlue = ((HareSeven.Et * 16) + HareSeven.Ft);
                    DisplayBodySeven.setColorFilter(Color.argb(HareSeven.HareAlpha, SevenRed, SevenGreen, SevenBlue));
                    int SevenRede1 = ((HareSeven.earAt * 16) + HareSeven.earBt);
                    int SevenGreene1 = ((HareSeven.earCt * 16) + HareSeven.earDt);
                    int SevenBluee1 = ((HareSeven.earEt * 16) + HareSeven.earFt);
                    DisplayEarsSeven.setColorFilter(Color.argb(HareSeven.HareAlpha, SevenRede1, SevenGreene1, SevenBluee1));
                    int SevenRede2 = ((HareSeven.eyeAt * 16) + HareSeven.eyeBt);
                    int SevenGreene2 = ((HareSeven.eyeCt * 16) + HareSeven.eyeDt);
                    int SevenBluee2 = ((HareSeven.eyeEt * 16) + HareSeven.eyeFt);
                    DisplayEyesSeven.setColorFilter(Color.argb(HareSeven.HareAlpha, SevenRede2, SevenGreene2, SevenBluee2));
                    babycounter = (babycounter + 1) % StupidBabyNumber;
                }


                String babyharecallnameEight = String.format(catchname, "NewHare", babycounter);
                HareSplitting.Hare HareEight = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameEight);
                //  Hare HareTwo = (Hare)intentHutch.getSerializableExtra(babyharecallname);
                DisplayBodyEight = (ImageView) findViewById(R.id.DisplayBabyEightBody);
                DisplayEarsEight = (ImageView) findViewById(R.id.DisplayBabyEightEars);
                DisplayEyesEight = (ImageView) findViewById(R.id.DisplayBabyEightEyes);


                if (HareEight != null) {
                    DisplayBodyEight.setImageResource(Bodies[HareEight.BodyType]);
                    DisplayEarsEight.setImageResource(Ears[HareEight.EarsType]);
                    DisplayEyesEight.setImageResource(Eyes[HareEight.EyesType]);
                    int EightRed = ((HareEight.At * 16) + HareEight.Bt);
                    int EightGreen = ((HareEight.Ct * 16) + HareEight.Dt);
                    int EightBlue = ((HareEight.Et * 16) + HareEight.Ft);
                    DisplayBodyEight.setColorFilter(Color.argb(HareEight.HareAlpha, EightRed, EightGreen, EightBlue));
                    int EightRede1 = ((HareEight.earAt * 16) + HareEight.earBt);
                    int EightGreene1 = ((HareEight.earCt * 16) + HareEight.earDt);
                    int EightBluee1 = ((HareEight.earEt * 16) + HareEight.earFt);
                    DisplayEarsEight.setColorFilter(Color.argb(HareEight.HareAlpha, EightRede1, EightGreene1, EightBluee1));
                    int EightRede2 = ((HareEight.eyeAt * 16) + HareEight.eyeBt);
                    int EightGreene2 = ((HareEight.eyeCt * 16) + HareEight.eyeDt);
                    int EightBluee2 = ((HareEight.eyeEt * 16) + HareEight.eyeFt);
                    DisplayEyesEight.setColorFilter(Color.argb(HareEight.HareAlpha, EightRede2, EightGreene2, EightBluee2));
                    babycounter = (babycounter + 1) % StupidBabyNumber;
                }



                ButtonImageScalerOne(HareOne);
                ButtonImageScalerTwo(HareTwo);
                ButtonImageScalerThree(HareThree);
                ButtonImageScalerFour(HareFour);
                ButtonImageScalerFive(HareFive); 
                ButtonImageScalerSix(HareSix);
                ButtonImageScalerSeven(HareSeven);
                ButtonImageScalerEight(HareEight);


/*
                if(HareOne == null || HareTwo == null || HareThree == null || HareFour == null || HareFive == null || HareSix == null || HareSeven == null || HareEight == null){
                    babycounter = (babycounter - 1) % StupidBabyNumber;
                }
*/

            }
        });

    }


    public void ButtonImageScalerOne(HareSplitting.Hare Escape){

        if (Escape == null){
            return;
        }


        DisplayBodyOne.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsOne.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesOne.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailOne.setImageResource(Tail[Escape.TailType]);
        
        int scaler = (100*Escape.size)/150;
        FrameLayout DisplayBabyOneButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyOneButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabyOneButtonFrame.getLayoutParams();
        DisplayEarsOne.requestLayout();
        DisplayEyesOne.requestLayout();
        DisplayBodyOne.requestLayout();
        DisplayTailOne.requestLayout();
      //  int earscaler = ((convertToDp(Escape.size/2))-((convertToDp(Escape.size/2))/4));
        DisplayEarsOne.getLayoutParams().height = convertToDp(scaler);
       // int eyescaler = ((convertToDp(Escape.size/2))-(((convertToDp(Escape.size/2))*2)/3));
        DisplayEarsOne.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayEyesOne.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesOne.getLayoutParams().height = convertToDp(scaler);
        DisplayBodyOne.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        DisplayTailOne.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEarsOne.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesOne.setScaleType(ImageButton.ScaleType.FIT_XY); // should be image button?
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodyOne.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsOne.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesOne.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));


        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailOne.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));

        BabyButtonOneSelecterHare = Escape;

    }
    public void ButtonLargeImageScalerOne(HareSplitting.Hare Escape){

        if (Escape == null){
            return;
        }


        DisplayBodySelectedOne.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsSelectedOne.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesSelectedOne.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailSelectedOne.setImageResource(Tail[Escape.TailType]);
        
        int scaler = (200*Escape.size)/150;
        FrameLayout DisplayBabyOneButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyOneButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabyOneButtonFrame.getLayoutParams();
        DisplayEarsSelectedOne.requestLayout();
        DisplayEyesSelectedOne.requestLayout();
        DisplayBodySelectedOne.requestLayout();
        DisplayTailSelectedOne.requestLayout();
      //  int earscaler = ((convertToDp(Escape.size/2))-((convertToDp(Escape.size/2))/4));
      //  DisplayEarsOne.getLayoutParams().height = convertToDp(scaler);
       // int eyescaler = ((convertToDp(Escape.size/2))-(((convertToDp(Escape.size/2))*2)/3));
        DisplayEarsSelectedOne.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayBodySelectedOne.getLayoutParams().width = convertToDp(scaler);
        DisplayBodySelectedOne.getLayoutParams().height = convertToDp(scaler);
        DisplayEyesSelectedOne.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesSelectedOne.getLayoutParams().height = convertToDp(scaler);
        DisplayEarsSelectedOne.getLayoutParams().width = convertToDp(scaler);
        DisplayEarsSelectedOne.getLayoutParams().height = convertToDp(scaler);
        DisplayTailSelectedOne.getLayoutParams().width = convertToDp(scaler);
        DisplayTailSelectedOne.getLayoutParams().height = convertToDp(scaler);
        DisplayBodySelectedOne.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEarsSelectedOne.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesSelectedOne.setScaleType(ImageButton.ScaleType.FIT_XY); // should be image button?
        DisplayTailSelectedOne.setScaleType(ImageButton.ScaleType.FIT_XY);
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodySelectedOne.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsSelectedOne.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesSelectedOne.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));
        
        
        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailSelectedOne.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));

       // BabyButtonOneSelecterHare = Escape;
        
        
        DisplayTailOne.setVisibility(View.INVISIBLE);
        DisplayEyesOne.setVisibility(View.INVISIBLE);
        DisplayEarsOne.setVisibility(View.INVISIBLE);
        DisplayBodyOne.setVisibility(View.INVISIBLE);
        
        DisplayEyesTwo.setVisibility(View.INVISIBLE);
        DisplayEarsTwo.setVisibility(View.INVISIBLE);
        DisplayBodyTwo.setVisibility(View.INVISIBLE);
        
        DisplayEyesThree.setVisibility(View.INVISIBLE);
        DisplayEarsThree.setVisibility(View.INVISIBLE);
        DisplayBodyThree.setVisibility(View.INVISIBLE);
        
        DisplayEyesFour.setVisibility(View.INVISIBLE);
        DisplayEarsFour.setVisibility(View.INVISIBLE);
        DisplayBodyFour.setVisibility(View.INVISIBLE);
        
        DisplayEyesFive.setVisibility(View.INVISIBLE);
        DisplayEarsFive.setVisibility(View.INVISIBLE);
        DisplayBodyFive.setVisibility(View.INVISIBLE);
        
        DisplayEyesSix.setVisibility(View.INVISIBLE);
        DisplayEarsSix.setVisibility(View.INVISIBLE);
        DisplayBodySix.setVisibility(View.INVISIBLE);

        DisplayEyesSeven.setVisibility(View.INVISIBLE);
        DisplayEarsSeven.setVisibility(View.INVISIBLE);
        DisplayBodySeven.setVisibility(View.INVISIBLE);

        DisplayEyesEight.setVisibility(View.INVISIBLE);
        DisplayEarsEight.setVisibility(View.INVISIBLE);
        DisplayBodyEight.setVisibility(View.INVISIBLE);


        DisplayTailOne.setVisibility(View.INVISIBLE);
        DisplayTailTwo.setVisibility(View.INVISIBLE);
        DisplayTailThree.setVisibility(View.INVISIBLE);
        DisplayTailFour.setVisibility(View.INVISIBLE);
        DisplayTailFive.setVisibility(View.INVISIBLE);
        DisplayTailSix.setVisibility(View.INVISIBLE);
        DisplayTailSeven.setVisibility(View.INVISIBLE);;
        DisplayTailEight.setVisibility(View.INVISIBLE);


        DisplayEyesNine.setVisibility(View.INVISIBLE);
        DisplayEarsNine.setVisibility(View.INVISIBLE);
        DisplayBodyNine.setVisibility(View.INVISIBLE);
        DisplayTailNine.setVisibility(View.INVISIBLE);

        DisplayEyesTen.setVisibility(View.INVISIBLE);
        DisplayEarsTen.setVisibility(View.INVISIBLE);
        DisplayBodyTen.setVisibility(View.INVISIBLE);
        DisplayTailTen.setVisibility(View.INVISIBLE);

        DisplayEyesEleven.setVisibility(View.INVISIBLE);
        DisplayEarsEleven.setVisibility(View.INVISIBLE);
        DisplayBodyEleven.setVisibility(View.INVISIBLE);
        DisplayTailEleven.setVisibility(View.INVISIBLE);

        DisplayEyesTwelve.setVisibility(View.INVISIBLE);
        DisplayEarsTwelve.setVisibility(View.INVISIBLE);
        DisplayBodyTwelve.setVisibility(View.INVISIBLE);
        DisplayTailTwelve.setVisibility(View.INVISIBLE);

        DisplayEyesThirteen.setVisibility(View.INVISIBLE);
        DisplayEarsThirteen.setVisibility(View.INVISIBLE);
        DisplayBodyThirteen.setVisibility(View.INVISIBLE);
        DisplayTailThirteen.setVisibility(View.INVISIBLE);

        DisplayEyesFourteen.setVisibility(View.INVISIBLE);
        DisplayEarsFourteen.setVisibility(View.INVISIBLE);
        DisplayBodyFourteen.setVisibility(View.INVISIBLE);
        DisplayTailFourteen.setVisibility(View.INVISIBLE);

        DisplayEyesFifteen.setVisibility(View.INVISIBLE);
        DisplayEarsFifteen.setVisibility(View.INVISIBLE);
        DisplayBodyFifteen.setVisibility(View.INVISIBLE);
        DisplayTailFifteen.setVisibility(View.INVISIBLE);

        DisplayEyesSixteen.setVisibility(View.INVISIBLE);
        DisplayEarsSixteen.setVisibility(View.INVISIBLE);
        DisplayBodySixteen.setVisibility(View.INVISIBLE);
        DisplayTailSixteen.setVisibility(View.INVISIBLE);

        HideDisplayButtons();


        DisplayEyesSelectedOne.setVisibility(View.VISIBLE);
        DisplayEarsSelectedOne.setVisibility(View.VISIBLE);
        DisplayBodySelectedOne.setVisibility(View.VISIBLE);
        DisplayTailSelectedOne.setVisibility(View.VISIBLE);
        
        
        
        

    }


    public void ButtonImageScalerTwo(HareSplitting.Hare Escape){

        if (Escape == null){
            return;
        }


        DisplayBodyTwo.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsTwo.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesTwo.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailTwo.setImageResource(Tail[Escape.TailType]);

        int scaler = (100*Escape.size)/150;
        FrameLayout DisplayBabyTwoButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyTwoButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabyTwoButtonFrame.getLayoutParams();
        DisplayEarsTwo.requestLayout();
        DisplayEyesTwo.requestLayout();
        DisplayBodyTwo.requestLayout();
        DisplayTailTwo.requestLayout();
      //  int earscaler = ((convertToDp(Escape.size/2))-((convertToDp(Escape.size/2))/4));
        DisplayEarsTwo.getLayoutParams().height = convertToDp(scaler);
       // int eyescaler = ((convertToDp(Escape.size/2))-(((convertToDp(Escape.size/2))*2)/3));
        DisplayEarsTwo.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayEyesTwo.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesTwo.getLayoutParams().height = convertToDp(scaler);
        DisplayTailTwo.getLayoutParams().width = convertToDp(scaler);
        DisplayTailTwo.getLayoutParams().height = convertToDp(scaler);
        DisplayBodyTwo.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        DisplayEarsTwo.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayTailTwo.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesTwo.setScaleType(ImageButton.ScaleType.FIT_XY); // should be image button?
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodyTwo.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsTwo.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesTwo.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));



        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailTwo.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));

        BabyButtonTwoSelecterHare = Escape;

    }


    public void ButtonImageScalerThree(HareSplitting.Hare Escape){

        if (Escape == null){
            return;
        }

        DisplayBodyThree.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsThree.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesThree.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailThree.setImageResource(Tail[Escape.TailType]);
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodyThree.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsThree.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesThree.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));

        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailThree.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));
        
        int scaler = (100*Escape.size)/150;
        FrameLayout DisplayBabyThreeButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyThreeButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabyThreeButtonFrame.getLayoutParams();
        DisplayEarsThree.requestLayout();
        DisplayEyesThree.requestLayout();
        DisplayBodyThree.requestLayout();
        DisplayTailThree.requestLayout();
        //  int earscaler = ((convertToDp(Escape.size/2))-((convertToDp(Escape.size/2))/4));
        DisplayEarsThree.getLayoutParams().height = convertToDp(scaler);
        // int eyescaler = ((convertToDp(Escape.size/2))-(((convertToDp(Escape.size/2))*2)/3));
        DisplayEarsThree.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayTailThree.getLayoutParams().width = convertToDp(scaler);
        DisplayTailThree.getLayoutParams().height = convertToDp(scaler);
        DisplayEyesThree.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesThree.getLayoutParams().height = convertToDp(scaler);
        DisplayBodyThree.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        DisplayEarsThree.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayTailThree.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesThree.setScaleType(ImageButton.ScaleType.FIT_XY); // should be image button?


        BabyButtonThreeSelecterHare = Escape;

    }
    public void ButtonImageScalerFour(HareSplitting.Hare Escape){

        if (Escape == null){
            return;
        }


        DisplayBodyFour.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsFour.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesFour.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailFour.setImageResource(Tail[Escape.TailType]);


        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodyFour.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsFour.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesFour.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));


        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailFour.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));

        int scaler = (100*Escape.size)/150;
        FrameLayout DisplayBabyFourButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyFourButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabyFourButtonFrame.getLayoutParams();
        DisplayEarsFour.requestLayout();
        DisplayEyesFour.requestLayout();
        DisplayBodyFour.requestLayout();
        DisplayTailFour.requestLayout();
        //  int earscaler = ((convertToDp(Escape.size/2))-((convertToDp(Escape.size/2))/4));
        DisplayEarsFour.getLayoutParams().height = convertToDp(scaler);
        // int eyescaler = ((convertToDp(Escape.size/2))-(((convertToDp(Escape.size/2))*2)/3));
        DisplayEarsFour.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayTailFour.getLayoutParams().width = convertToDp(scaler);
        DisplayTailFour.getLayoutParams().height = convertToDp(scaler);
        DisplayEyesFour.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesFour.getLayoutParams().height = convertToDp(scaler);
        DisplayBodyFour.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        DisplayEarsFour.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayTailFour.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesFour.setScaleType(ImageButton.ScaleType.FIT_XY); // should be image button?


        BabyButtonFourSelecterHare = Escape;

    }
    public void ButtonImageScalerFive(HareSplitting.Hare Escape){

        if (Escape == null){
            return;
        }


        DisplayBodyFive.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsFive.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesFive.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailFive.setImageResource(Tail[Escape.TailType]);
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodyFive.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsFive.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesFive.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));

        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailFive.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));

        int scaler = (100*Escape.size)/150;
        FrameLayout DisplayBabyFiveButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyFiveButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabyFiveButtonFrame.getLayoutParams();
        DisplayEarsFive.requestLayout();
        DisplayEyesFive.requestLayout();
        DisplayBodyFive.requestLayout();
        DisplayTailFive.requestLayout();
        //  int earscaler = ((convertToDp(Escape.size/2))-((convertToDp(Escape.size/2))/4));
        DisplayEarsFive.getLayoutParams().height = convertToDp(scaler);
        DisplayTailFive.getLayoutParams().height = convertToDp(scaler);
        // int eyescaler = ((convertToDp(Escape.size/2))-(((convertToDp(Escape.size/2))*2)/3));
        DisplayEarsFive.getLayoutParams().width = convertToDp(scaler);
        DisplayTailFive.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayEyesFive.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesFive.getLayoutParams().height = convertToDp(scaler);
        DisplayBodyFive.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        DisplayEarsFive.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayTailFive.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesFive.setScaleType(ImageButton.ScaleType.FIT_XY); // should be image button?


        BabyButtonFiveSelecterHare = Escape;

    }
    public void ButtonImageScalerSix(HareSplitting.Hare Escape){

        if (Escape == null){
            return;
        }


        DisplayBodySix.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsSix.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesSix.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailSix.setImageResource(Tail[Escape.TailType]);
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodySix.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsSix.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesSix.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));


        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailSix.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));

        int scaler = (100*Escape.size)/150;
        FrameLayout DisplayBabySixButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabySixButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabySixButtonFrame.getLayoutParams();
        DisplayEarsSix.requestLayout();
        DisplayEyesSix.requestLayout();
        DisplayBodySix.requestLayout();
        DisplayTailSix.requestLayout();

        //  int earscaler = ((convertToDp(Escape.size/2))-((convertToDp(Escape.size/2))/4));
        DisplayEarsSix.getLayoutParams().height = convertToDp(scaler);
        DisplayTailSix.getLayoutParams().height = convertToDp(scaler);
        // int eyescaler = ((convertToDp(Escape.size/2))-(((convertToDp(Escape.size/2))*2)/3));
        DisplayEarsSix.getLayoutParams().width = convertToDp(scaler);
        DisplayTailSix.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayEyesSix.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesSix.getLayoutParams().height = convertToDp(scaler);
        DisplayBodySix.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        DisplayEarsSix.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayTailSix.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesSix.setScaleType(ImageButton.ScaleType.FIT_XY); // should be image button?

        BabyButtonSixSelecterHare = Escape;
        

    }
    public void ButtonImageScalerSeven(HareSplitting.Hare Escape){

        if (Escape == null){
            return;
        }

        DisplayBodySeven.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsSeven.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesSeven.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailSeven.setImageResource(Tail[Escape.TailType]);
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodySeven.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsSeven.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesSeven.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));
        

        int scaler = (100*Escape.size)/150;
        FrameLayout DisplayBabySevenButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabySevenButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabySevenButtonFrame.getLayoutParams();
        DisplayEarsSeven.requestLayout();
        DisplayEyesSeven.requestLayout();
        DisplayBodySeven.requestLayout();
        DisplayTailSeven.requestLayout();
        DisplayTailSeven.getLayoutParams().height = convertToDp(scaler);
        DisplayTailSeven.getLayoutParams().width = convertToDp(scaler);
        DisplayTailSeven.setScaleType(ImageButton.ScaleType.FIT_XY);
        //  int earscaler = ((convertToDp(Escape.size/2))-((convertToDp(Escape.size/2))/4));
        DisplayEarsSeven.getLayoutParams().height = convertToDp(scaler);
        // int eyescaler = ((convertToDp(Escape.size/2))-(((convertToDp(Escape.size/2))*2)/3));
        DisplayEarsSeven.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayEyesSeven.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesSeven.getLayoutParams().height = convertToDp(scaler);
        DisplayBodySeven.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        DisplayEarsSeven.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesSeven.setScaleType(ImageButton.ScaleType.FIT_XY); // should be image button?


        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailSeven.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));
        BabyButtonSevenSelecterHare = Escape;

    }
    
    
    
    public void ButtonImageScalerEight(HareSplitting.Hare Escape){

        if (Escape == null){
            return;
        }


        DisplayBodyEight.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsEight.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesEight.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailEight.setImageResource(Tail[Escape.TailType]);
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodyEight.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsEight.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesEight.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));


        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailEight.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));

        int scaler = (100*Escape.size)/150;
        FrameLayout DisplayBabyEightButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyEightButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabyEightButtonFrame.getLayoutParams();
        DisplayEarsEight.requestLayout();
        DisplayEyesEight.requestLayout();
        DisplayBodyEight.requestLayout();
        //  int earscaler = ((convertToDp(Escape.size/2))-((convertToDp(Escape.size/2))/4));
        DisplayEarsEight.getLayoutParams().height = convertToDp(scaler);
        // int eyescaler = ((convertToDp(Escape.size/2))-(((convertToDp(Escape.size/2))*2)/3));
        DisplayEarsEight.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayEyesEight.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesEight.getLayoutParams().height = convertToDp(scaler);
        DisplayBodyEight.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        DisplayEarsEight.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesEight.setScaleType(ImageButton.ScaleType.FIT_XY); // should be image button?

        DisplayTailEight.requestLayout();
        DisplayTailEight.getLayoutParams().height = convertToDp(scaler);
        DisplayTailEight.getLayoutParams().width = convertToDp(scaler);
        DisplayTailEight.setScaleType(ImageButton.ScaleType.FIT_XY);

/*
        Matrix mat = new Matrix();
        Bitmap bMap = BitmapFactory.decodeResource(getResources(),Bodies[Escape.BodyType]);
        mat.postRotate(Integer.parseInt(Escape.TotalAngle));
        Bitmap bMapRotate = Bitmap.createBitmap(bMap, 0, 0,bMap.getWidth(),bMap.getHeight(), mat, true);
        DisplayBodyEight.setImageBitmap(bMapRotate);
*/
        BabyButtonEightSelecterHare = Escape;

    }


    public void ButtonImageScalerNine(HareSplitting.Hare Escape){

        if (Escape == null){
            DisplayBodyNine.setImageResource(R.drawable.noerror);
            DisplayEarsNine.setImageResource(R.drawable.noerror);
            DisplayEyesNine.setImageResource(R.drawable.noerror);
            DisplayTailNine.setImageResource(R.drawable.noerror);
            DisplayBodyNine.setVisibility(View.INVISIBLE);
            DisplayEarsNine.setVisibility(View.INVISIBLE);
            DisplayEyesNine.setVisibility(View.INVISIBLE);
            DisplayTailNine.setVisibility(View.INVISIBLE);
            return;
        }


        DisplayBodyNine.setVisibility(View.VISIBLE);
        DisplayEarsNine.setVisibility(View.VISIBLE);
        DisplayEyesNine.setVisibility(View.VISIBLE);
        DisplayTailNine.setVisibility(View.VISIBLE);


        DisplayBodyNine.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsNine.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesNine.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailNine.setImageResource(Tail[Escape.TailType]);
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodyNine.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsNine.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesNine.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));


        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailNine.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));

        int scaler = (100*Escape.size)/150;
        FrameLayout DisplayBabyNineButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyNineButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabyNineButtonFrame.getLayoutParams();
        DisplayEarsNine.requestLayout();
        DisplayEyesNine.requestLayout();
        DisplayBodyNine.requestLayout();
        //  int earscaler = ((convertToDp(Escape.size/2))-((convertToDp(Escape.size/2))/4));
        DisplayEarsNine.getLayoutParams().height = convertToDp(scaler);
        // int eyescaler = ((convertToDp(Escape.size/2))-(((convertToDp(Escape.size/2))*2)/3));
        DisplayEarsNine.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayEyesNine.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesNine.getLayoutParams().height = convertToDp(scaler);
        DisplayBodyNine.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        DisplayEarsNine.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesNine.setScaleType(ImageButton.ScaleType.FIT_XY); // should be image button?

        DisplayTailNine.requestLayout();
        DisplayTailNine.getLayoutParams().height = convertToDp(scaler);
        DisplayTailNine.getLayoutParams().width = convertToDp(scaler);
        DisplayTailNine.setScaleType(ImageButton.ScaleType.FIT_XY);


        BabyButtonNineSelecterHare = Escape;

    }
    
    public void ButtonImageScalerTen(HareSplitting.Hare Escape){

        if (Escape == null){
            DisplayBodyTen.setImageResource(R.drawable.noerror);
            DisplayEarsTen.setImageResource(R.drawable.noerror);
            DisplayEyesTen.setImageResource(R.drawable.noerror);
            DisplayTailTen.setImageResource(R.drawable.noerror);
            DisplayBodyTen.setVisibility(View.INVISIBLE);
            DisplayEarsTen.setVisibility(View.INVISIBLE);
            DisplayEyesTen.setVisibility(View.INVISIBLE);
            DisplayTailTen.setVisibility(View.INVISIBLE);
            return;
        }

        DisplayBodyTen.setVisibility(View.VISIBLE);
        DisplayEarsTen.setVisibility(View.VISIBLE);
        DisplayEyesTen.setVisibility(View.VISIBLE);
        DisplayTailTen.setVisibility(View.VISIBLE);

        DisplayBodyTen.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsTen.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesTen.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailTen.setImageResource(Tail[Escape.TailType]);
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodyTen.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsTen.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesTen.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));


        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailTen.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));

        int scaler = (100*Escape.size)/150;
        FrameLayout DisplayBabyTenButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyTenButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabyTenButtonFrame.getLayoutParams();
        DisplayEarsTen.requestLayout();
        DisplayEyesTen.requestLayout();
        DisplayBodyTen.requestLayout();
        //  int earscaler = ((convertToDp(Escape.size/2))-((convertToDp(Escape.size/2))/4));
        DisplayEarsTen.getLayoutParams().height = convertToDp(scaler);
        // int eyescaler = ((convertToDp(Escape.size/2))-(((convertToDp(Escape.size/2))*2)/3));
        DisplayEarsTen.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayEyesTen.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesTen.getLayoutParams().height = convertToDp(scaler);
        DisplayBodyTen.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        DisplayEarsTen.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesTen.setScaleType(ImageButton.ScaleType.FIT_XY); // should be image button?

        DisplayTailTen.requestLayout();
        DisplayTailTen.getLayoutParams().height = convertToDp(scaler);
        DisplayTailTen.getLayoutParams().width = convertToDp(scaler);
        DisplayTailTen.setScaleType(ImageButton.ScaleType.FIT_XY);


        BabyButtonTenSelecterHare = Escape;

    }
    public void ButtonImageScalerEleven(HareSplitting.Hare Escape){

        if (Escape == null){

            DisplayBodyEleven.setImageResource(R.drawable.noerror);
            DisplayEarsEleven.setImageResource(R.drawable.noerror);
            DisplayEyesEleven.setImageResource(R.drawable.noerror);
            DisplayTailEleven.setImageResource(R.drawable.noerror);
            DisplayBodyEleven.setVisibility(View.INVISIBLE);
            DisplayEarsEleven.setVisibility(View.INVISIBLE);
            DisplayEyesEleven.setVisibility(View.INVISIBLE);
            DisplayTailEleven.setVisibility(View.INVISIBLE);
            return;
        }

        DisplayBodyEleven.setVisibility(View.VISIBLE);
        DisplayEarsEleven.setVisibility(View.VISIBLE);
        DisplayEyesEleven.setVisibility(View.VISIBLE);
        DisplayTailEleven.setVisibility(View.VISIBLE);

        DisplayBodyEleven.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsEleven.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesEleven.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailEleven.setImageResource(Tail[Escape.TailType]);
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodyEleven.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsEleven.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesEleven.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));


        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailEleven.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));

        int scaler = (100*Escape.size)/150;
        FrameLayout DisplayBabyElevenButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyElevenButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabyElevenButtonFrame.getLayoutParams();
        DisplayEarsEleven.requestLayout();
        DisplayEyesEleven.requestLayout();
        DisplayBodyEleven.requestLayout();
        //  int earscaler = ((convertToDp(Escape.size/2))-((convertToDp(Escape.size/2))/4));
        DisplayEarsEleven.getLayoutParams().height = convertToDp(scaler);
        // int eyescaler = ((convertToDp(Escape.size/2))-(((convertToDp(Escape.size/2))*2)/3));
        DisplayEarsEleven.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayEyesEleven.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesEleven.getLayoutParams().height = convertToDp(scaler);
        DisplayBodyEleven.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        DisplayEarsEleven.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesEleven.setScaleType(ImageButton.ScaleType.FIT_XY); // should be image button?

        DisplayTailEleven.requestLayout();
        DisplayTailEleven.getLayoutParams().height = convertToDp(scaler);
        DisplayTailEleven.getLayoutParams().width = convertToDp(scaler);
        DisplayTailEleven.setScaleType(ImageButton.ScaleType.FIT_XY);


        BabyButtonElevenSelecterHare = Escape;

    }
    public void ButtonImageScalerTwelve(HareSplitting.Hare Escape){

        if (Escape == null){

            DisplayBodyTwelve.setImageResource(R.drawable.noerror);
            DisplayEarsTwelve.setImageResource(R.drawable.noerror);
            DisplayEyesTwelve.setImageResource(R.drawable.noerror);
            DisplayTailTwelve.setImageResource(R.drawable.noerror);
            DisplayBodyTwelve.setVisibility(View.INVISIBLE);
            DisplayEarsTwelve.setVisibility(View.INVISIBLE);
            DisplayEyesTwelve.setVisibility(View.INVISIBLE);
            DisplayTailTwelve.setVisibility(View.INVISIBLE);
            return;
        }


        DisplayBodyTwelve.setVisibility(View.VISIBLE);
        DisplayEarsTwelve.setVisibility(View.VISIBLE);
        DisplayEyesTwelve.setVisibility(View.VISIBLE);
        DisplayTailTwelve.setVisibility(View.VISIBLE);
        DisplayBodyTwelve.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsTwelve.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesTwelve.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailTwelve.setImageResource(Tail[Escape.TailType]);
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodyTwelve.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsTwelve.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesTwelve.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));


        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailTwelve.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));

        int scaler = (100*Escape.size)/150;
        FrameLayout DisplayBabyTwelveButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyTwelveButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabyTwelveButtonFrame.getLayoutParams();
        DisplayEarsTwelve.requestLayout();
        DisplayEyesTwelve.requestLayout();
        DisplayBodyTwelve.requestLayout();
        //  int earscaler = ((convertToDp(Escape.size/2))-((convertToDp(Escape.size/2))/4));
        DisplayEarsTwelve.getLayoutParams().height = convertToDp(scaler);
        // int eyescaler = ((convertToDp(Escape.size/2))-(((convertToDp(Escape.size/2))*2)/3));
        DisplayEarsTwelve.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayEyesTwelve.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesTwelve.getLayoutParams().height = convertToDp(scaler);
        DisplayBodyTwelve.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        DisplayEarsTwelve.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesTwelve.setScaleType(ImageButton.ScaleType.FIT_XY); // should be image button?

        DisplayTailTwelve.requestLayout();
        DisplayTailTwelve.getLayoutParams().height = convertToDp(scaler);
        DisplayTailTwelve.getLayoutParams().width = convertToDp(scaler);
        DisplayTailTwelve.setScaleType(ImageButton.ScaleType.FIT_XY);


        BabyButtonTwelveSelecterHare = Escape;

    }
    public void ButtonImageScalerThirteen(HareSplitting.Hare Escape){

        if (Escape == null){

            DisplayBodyThirteen.setImageResource(R.drawable.noerror);
            DisplayEarsThirteen.setImageResource(R.drawable.noerror);
            DisplayEyesThirteen.setImageResource(R.drawable.noerror);
            DisplayTailThirteen.setImageResource(R.drawable.noerror);
            DisplayBodyThirteen.setVisibility(View.INVISIBLE);
            DisplayEarsThirteen.setVisibility(View.INVISIBLE);
            DisplayEyesThirteen.setVisibility(View.INVISIBLE);
            DisplayTailThirteen.setVisibility(View.INVISIBLE);
            return;
        }


        DisplayBodyThirteen.setVisibility(View.VISIBLE);
        DisplayEarsThirteen.setVisibility(View.VISIBLE);
        DisplayEyesThirteen.setVisibility(View.VISIBLE);
        DisplayTailThirteen.setVisibility(View.VISIBLE);
        DisplayBodyThirteen.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsThirteen.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesThirteen.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailThirteen.setImageResource(Tail[Escape.TailType]);
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodyThirteen.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsThirteen.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesThirteen.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));


        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailThirteen.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));

        int scaler = (100*Escape.size)/150;
        FrameLayout DisplayBabyThirteenButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyThirteenButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabyThirteenButtonFrame.getLayoutParams();
        DisplayEarsThirteen.requestLayout();
        DisplayEyesThirteen.requestLayout();
        DisplayBodyThirteen.requestLayout();
        //  int earscaler = ((convertToDp(Escape.size/2))-((convertToDp(Escape.size/2))/4));
        DisplayEarsThirteen.getLayoutParams().height = convertToDp(scaler);
        // int eyescaler = ((convertToDp(Escape.size/2))-(((convertToDp(Escape.size/2))*2)/3));
        DisplayEarsThirteen.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayEyesThirteen.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesThirteen.getLayoutParams().height = convertToDp(scaler);
        DisplayBodyThirteen.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        DisplayEarsThirteen.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesThirteen.setScaleType(ImageButton.ScaleType.FIT_XY); // should be image button?

        DisplayTailThirteen.requestLayout();
        DisplayTailThirteen.getLayoutParams().height = convertToDp(scaler);
        DisplayTailThirteen.getLayoutParams().width = convertToDp(scaler);
        DisplayTailThirteen.setScaleType(ImageButton.ScaleType.FIT_XY);


        BabyButtonThirteenSelecterHare = Escape;

    }
    public void ButtonImageScalerFourteen(HareSplitting.Hare Escape){

        if (Escape == null){

            DisplayBodyFourteen.setImageResource(R.drawable.noerror);
            DisplayEarsFourteen.setImageResource(R.drawable.noerror);
            DisplayEyesFourteen.setImageResource(R.drawable.noerror);
            DisplayTailFourteen.setImageResource(R.drawable.noerror);
            DisplayBodyFourteen.setVisibility(View.INVISIBLE);
            DisplayEarsFourteen.setVisibility(View.INVISIBLE);
            DisplayEyesFourteen.setVisibility(View.INVISIBLE);
            DisplayTailFourteen.setVisibility(View.INVISIBLE);
            return;
        }

        DisplayBodyFourteen.setVisibility(View.VISIBLE);
        DisplayEarsFourteen.setVisibility(View.VISIBLE);
        DisplayEyesFourteen.setVisibility(View.VISIBLE);
        DisplayTailFourteen.setVisibility(View.VISIBLE);

        DisplayBodyFourteen.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsFourteen.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesFourteen.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailFourteen.setImageResource(Tail[Escape.TailType]);
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodyFourteen.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsFourteen.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesFourteen.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));


        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailFourteen.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));

        int scaler = (100*Escape.size)/150;
        FrameLayout DisplayBabyFourteenButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyFourteenButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabyFourteenButtonFrame.getLayoutParams();
        DisplayEarsFourteen.requestLayout();
        DisplayEyesFourteen.requestLayout();
        DisplayBodyFourteen.requestLayout();
        //  int earscaler = ((convertToDp(Escape.size/2))-((convertToDp(Escape.size/2))/4));
        DisplayEarsFourteen.getLayoutParams().height = convertToDp(scaler);
        // int eyescaler = ((convertToDp(Escape.size/2))-(((convertToDp(Escape.size/2))*2)/3));
        DisplayEarsFourteen.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayEyesFourteen.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesFourteen.getLayoutParams().height = convertToDp(scaler);
        DisplayBodyFourteen.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        DisplayEarsFourteen.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesFourteen.setScaleType(ImageButton.ScaleType.FIT_XY); // should be image button?

        DisplayTailFourteen.requestLayout();
        DisplayTailFourteen.getLayoutParams().height = convertToDp(scaler);
        DisplayTailFourteen.getLayoutParams().width = convertToDp(scaler);
        DisplayTailFourteen.setScaleType(ImageButton.ScaleType.FIT_XY);


        BabyButtonFourteenSelecterHare = Escape;

    }

    public void ButtonImageScalerFifteen(HareSplitting.Hare Escape){

        if (Escape == null){

            DisplayBodyFifteen.setImageResource(R.drawable.noerror);
            DisplayEarsFifteen.setImageResource(R.drawable.noerror);
            DisplayEyesFifteen.setImageResource(R.drawable.noerror);
            DisplayTailFifteen.setImageResource(R.drawable.noerror);
            DisplayBodyFifteen.setVisibility(View.INVISIBLE);
            DisplayEarsFifteen.setVisibility(View.INVISIBLE);
            DisplayEyesFifteen.setVisibility(View.INVISIBLE);
            DisplayTailFifteen.setVisibility(View.INVISIBLE);
            return;
        }


        DisplayBodyFifteen.setVisibility(View.VISIBLE);
        DisplayEarsFifteen.setVisibility(View.VISIBLE);
        DisplayEyesFifteen.setVisibility(View.VISIBLE);
        DisplayTailFifteen.setVisibility(View.VISIBLE);
        DisplayBodyFifteen.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsFifteen.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesFifteen.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailFifteen.setImageResource(Tail[Escape.TailType]);
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodyFifteen.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsFifteen.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesFifteen.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));


        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailFifteen.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));

        int scaler = (100*Escape.size)/150;
        FrameLayout DisplayBabyFifteenButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyFifteenButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabyFifteenButtonFrame.getLayoutParams();
        DisplayEarsFifteen.requestLayout();
        DisplayEyesFifteen.requestLayout();
        DisplayBodyFifteen.requestLayout();
        //  int earscaler = ((convertToDp(Escape.size/2))-((convertToDp(Escape.size/2))/4));
        DisplayEarsFifteen.getLayoutParams().height = convertToDp(scaler);
        // int eyescaler = ((convertToDp(Escape.size/2))-(((convertToDp(Escape.size/2))*2)/3));
        DisplayEarsFifteen.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayEyesFifteen.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesFifteen.getLayoutParams().height = convertToDp(scaler);
        DisplayBodyFifteen.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        DisplayEarsFifteen.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesFifteen.setScaleType(ImageButton.ScaleType.FIT_XY); // should be image button?

        DisplayTailFifteen.requestLayout();
        DisplayTailFifteen.getLayoutParams().height = convertToDp(scaler);
        DisplayTailFifteen.getLayoutParams().width = convertToDp(scaler);
        DisplayTailFifteen.setScaleType(ImageButton.ScaleType.FIT_XY);


        BabyButtonFifteenSelecterHare = Escape;

    }
    public void ButtonImageScalerSixteen(HareSplitting.Hare Escape){

        if (Escape == null){
            DisplayBodySixteen.setImageResource(R.drawable.noerror);
            DisplayEarsSixteen.setImageResource(R.drawable.noerror);
            DisplayEyesSixteen.setImageResource(R.drawable.noerror);
            DisplayTailSixteen.setImageResource(R.drawable.noerror);
            DisplayBodySixteen.setVisibility(View.INVISIBLE);
            DisplayEarsSixteen.setVisibility(View.INVISIBLE);
            DisplayEyesSixteen.setVisibility(View.INVISIBLE);
            DisplayTailSixteen.setVisibility(View.INVISIBLE);
            
            return;
        }

        DisplayBodySixteen.setVisibility(View.VISIBLE);
        DisplayEarsSixteen.setVisibility(View.VISIBLE);
        DisplayEyesSixteen.setVisibility(View.VISIBLE);
        DisplayTailSixteen.setVisibility(View.VISIBLE);


        DisplayBodySixteen.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsSixteen.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesSixteen.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailSixteen.setImageResource(Tail[Escape.TailType]);
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodySixteen.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsSixteen.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesSixteen.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));


        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailSixteen.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));

        int scaler = (100*Escape.size)/150;
        FrameLayout DisplayBabySixteenButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabySixteenButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabySixteenButtonFrame.getLayoutParams();
        DisplayEarsSixteen.requestLayout();
        DisplayEyesSixteen.requestLayout();
        DisplayBodySixteen.requestLayout();
        //  int earscaler = ((convertToDp(Escape.size/2))-((convertToDp(Escape.size/2))/4));
        DisplayEarsSixteen.getLayoutParams().height = convertToDp(scaler);
        // int eyescaler = ((convertToDp(Escape.size/2))-(((convertToDp(Escape.size/2))*2)/3));
        DisplayEarsSixteen.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayEyesSixteen.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesSixteen.getLayoutParams().height = convertToDp(scaler);
        DisplayBodySixteen.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        DisplayEarsSixteen.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesSixteen.setScaleType(ImageButton.ScaleType.FIT_XY); // should be image button?

        DisplayTailSixteen.requestLayout();
        DisplayTailSixteen.getLayoutParams().height = convertToDp(scaler);
        DisplayTailSixteen.getLayoutParams().width = convertToDp(scaler);
        DisplayTailSixteen.setScaleType(ImageButton.ScaleType.FIT_XY);


        BabyButtonSixteenSelecterHare = Escape;

    }

    public int convertToDp(int input) { // Get the screen's density scale
        final float scale = getResources().getDisplayMetrics().density; // Convert the dps to pixels, based on density scale
        return (int) (input * scale + 0.5f);
    }


    protected void onSaveInstanceState(Bundle HareCatcher) {
        super.onSaveInstanceState(HareCatcher);
        Log.i("Instance state", "onSaveInstanceState");

    }

    protected void onRestoreInstanceState(Bundle HareCatcher) {
        super.onSaveInstanceState(HareCatcher);
        Log.i("Instance state", "onRestoreInstanceState");

    }

    public void onBackPressed(HareSplitting.Hare NewHairy){

        int NewHairySize = NewHairy.size;
        int NewHairyAT = NewHairy.At;
        int NewHairyBT = NewHairy.Bt;
        int NewHairyCT = NewHairy.Ct;
        int NewHairyDT = NewHairy.Dt;
        int NewHairyET = NewHairy.Et;
        int NewHairyFT = NewHairy.Ft;
        int NewHairyearAT = NewHairy.earAt;
        int NewHairyearBT = NewHairy.earBt;
        int NewHairyearCT = NewHairy.earCt;
        int NewHairyearDT = NewHairy.earDt;
        int NewHairyearET = NewHairy.earEt;
        int NewHairyearFT = NewHairy.earFt;
        int NewHairyeyeAT = NewHairy.eyeAt;
        int NewHairyeyeBT = NewHairy.eyeBt;
        int NewHairyeyeCT = NewHairy.eyeCt;
        int NewHairyeyeDT = NewHairy.eyeDt;
        int NewHairyeyeET = NewHairy.eyeEt;
        int NewHairyeyeFT = NewHairy.eyeFt;
        int NewHairytailAT = NewHairy.tailAt;
        int NewHairytailBT = NewHairy.tailBt;
        int NewHairytailCT = NewHairy.tailCt;
        int NewHairytailDT = NewHairy.tailDt;
        int NewHairytailET = NewHairy.tailEt;
        int NewHairytailFT = NewHairy.tailFt;


        String NewHairySex = NewHairy.Sex;
        String NewHairyColor = NewHairy.Color;
        int NewHairyHareAlpha = NewHairy.HareAlpha;
        int NewHairyTailAlpha = NewHairy.TailAlpha;
        int NewHairyBodyType = NewHairy.BodyType;
        int NewHairyEarsType = NewHairy.EarsType;
        int NewHairyEarsLength = NewHairy.EarsLength;
        int NewHairyEyesType =  NewHairy.EyesType;
        int NewHairyTailType =  NewHairy.TailType;
        double NewHairyPrice = NewHairy.Price;
        
        
        
        Intent F = new Intent();
        F.putExtra("Hairysize", NewHairySize);
        F.putExtra("HairyAT", NewHairyAT);
        F.putExtra("HairyBT", NewHairyBT);
        F.putExtra("HairyCT", NewHairyCT);
        F.putExtra("HairyDT", NewHairyDT);
        F.putExtra("HairyET", NewHairyET);
        F.putExtra("HairyFT", NewHairyFT);
        F.putExtra("HairyearAT", NewHairyearAT);
        F.putExtra("HairyearBT", NewHairyearBT);
        F.putExtra("HairyearCT", NewHairyearCT);
        F.putExtra("HairyearDT", NewHairyearDT);
        F.putExtra("HairyearET", NewHairyearET);
        F.putExtra("HairyearFT", NewHairyearFT);
        F.putExtra("HairyeyeAT", NewHairyeyeAT);
        F.putExtra("HairyeyeBT", NewHairyeyeBT);
        F.putExtra("HairyeyeCT", NewHairyeyeCT);
        F.putExtra("HairyeyeDT", NewHairyeyeDT);
        F.putExtra("HairyeyeET", NewHairyeyeET);
        F.putExtra("HairyeyeFT", NewHairyeyeFT);
        F.putExtra("HairytailAT", NewHairytailAT);
        F.putExtra("HairytailBT", NewHairytailBT);
        F.putExtra("HairytailCT", NewHairytailCT);
        F.putExtra("HairytailDT", NewHairytailDT);
        F.putExtra("HairytailET", NewHairytailET);
        F.putExtra("HairytailFT", NewHairytailFT);
        F.putExtra("HairySex", NewHairySex);
        F.putExtra("HairyColor", NewHairyColor);
        F.putExtra("HairyHareAlpha", NewHairyHareAlpha);
        F.putExtra("HairyTailAlpha", NewHairyTailAlpha);
        F.putExtra("HairyBodyType", NewHairyBodyType);
        F.putExtra("HairyEarsType", NewHairyEarsType);
        F.putExtra("HairyTailType", NewHairyTailType);
        F.putExtra("HairyEarsLength", NewHairyEarsLength);
        F.putExtra("HairyEyesType", NewHairyEyesType);
        F.putExtra("HairyEyesType", NewHairyPrice);



        setResult(RESULT_OK, F);
        finish();
    }

    public void onSmackPressed(HareSplitting.Hare NewLola){

        int NewLolaSize = NewLola.size;
        int NewLolaAT = NewLola.At;
        int NewLolaBT = NewLola.Bt;
        int NewLolaCT = NewLola.Ct;
        int NewLolaDT = NewLola.Dt;
        int NewLolaET = NewLola.Et;
        int NewLolaFT = NewLola.Ft;
        int NewLolaearAT = NewLola.earAt;
        int NewLolaearBT = NewLola.earBt;
        int NewLolaearCT = NewLola.earCt;
        int NewLolaearDT = NewLola.earDt;
        int NewLolaearET = NewLola.earEt;
        int NewLolaearFT = NewLola.earFt;
        int NewLolaeyeAT = NewLola.eyeAt;
        int NewLolaeyeBT = NewLola.eyeBt;
        int NewLolaeyeCT = NewLola.eyeCt;
        int NewLolaeyeDT = NewLola.eyeDt;
        int NewLolaeyeET = NewLola.eyeEt;
        int NewLolaeyeFT = NewLola.eyeFt;

        int NewLolatailAT = NewLola.tailAt;
        int NewLolatailBT = NewLola.tailBt;
        int NewLolatailCT = NewLola.tailCt;
        int NewLolatailDT = NewLola.tailDt;
        int NewLolatailET = NewLola.tailEt;
        int NewLolatailFT = NewLola.tailFt;


        String NewLolaSex = NewLola.Sex;
        String NewLolaColor = NewLola.Color;
        int NewLolaHareAlpha = NewLola.HareAlpha;
        int NewLolaTailAlpha = NewLola.TailAlpha;
        int NewLolaBodyType = NewLola.BodyType;
        int NewLolaEarsType = NewLola.EarsType;
        int NewLolaTailType = NewLola.TailType;
        int NewLolaEarsLength = NewLola.EarsLength;
        int NewLolaEyesType =  NewLola.EyesType;
        double NewLolaPrice = NewLola.Price;
        
        
        
        Intent F = new Intent();
        F.putExtra("Lolasize", NewLolaSize);
        F.putExtra("LolaAT", NewLolaAT);
        F.putExtra("LolaBT", NewLolaBT);
        F.putExtra("LolaCT", NewLolaCT);
        F.putExtra("LolaDT", NewLolaDT);
        F.putExtra("LolaET", NewLolaET);
        F.putExtra("LolaFT", NewLolaFT);
        F.putExtra("LolaearAT", NewLolaearAT);
        F.putExtra("LolaearBT", NewLolaearBT);
        F.putExtra("LolaearCT", NewLolaearCT);
        F.putExtra("LolaearDT", NewLolaearDT);
        F.putExtra("LolaearET", NewLolaearET);
        F.putExtra("LolaearFT", NewLolaearFT);
        F.putExtra("LolaeyeAT", NewLolaeyeAT);
        F.putExtra("LolaeyeBT", NewLolaeyeBT);
        F.putExtra("LolaeyeCT", NewLolaeyeCT);
        F.putExtra("LolaeyeDT", NewLolaeyeDT);
        F.putExtra("LolaeyeET", NewLolaeyeET);
        F.putExtra("LolaeyeFT", NewLolaeyeFT);
        F.putExtra("LolatailAT", NewLolatailAT);
        F.putExtra("LolatailBT", NewLolatailBT);
        F.putExtra("LolatailCT", NewLolatailCT);
        F.putExtra("LolatailDT", NewLolatailDT);
        F.putExtra("LolatailET", NewLolatailET);
        F.putExtra("LolatailFT", NewLolatailFT);
        F.putExtra("LolaSex", NewLolaSex);
        F.putExtra("LolaColor", NewLolaColor);
        F.putExtra("LolaHareAlpha", NewLolaHareAlpha);
        F.putExtra("LolaTailAlpha", NewLolaTailAlpha);
        F.putExtra("LolaBodyType", NewLolaBodyType);
        F.putExtra("LolaEarsType", NewLolaEarsType);
        F.putExtra("LolaTailType", NewLolaTailType);
        F.putExtra("LolaEarsLength", NewLolaEarsLength);
        F.putExtra("LolaEyesType", NewLolaEyesType);
        F.putExtra("LolaEyesType", NewLolaPrice);



        setResult(420, F);
        finish();
    }


    protected void onResume() {

        super.onResume();
        // setContentView(R.layout.activity_hare_hutch);


        TextView selectedsexdisplay = (TextView) findViewById(R.id.DisplaySelectedSex);
        TextView selectedSizedisplay = (TextView) findViewById(R.id.DisplaySelectedSize);
        TextView selectedEarColordisplay = (TextView) findViewById(R.id.DisplaySelectedEarColor);
        TextView selectedEyeColordisplay = (TextView) findViewById(R.id.DisplaySelectedEyeColor);
        TextView selectedBodyColordisplay = (TextView) findViewById(R.id.DisplaySelectedBodyColor);
        TextView selectedTailColordisplay = (TextView) findViewById(R.id.DisplaySelectedTailColor);
        TextView selectedAlphasdisplay = (TextView) findViewById(R.id.DisplaySelectedAlphas);
        TextView selectedPricedisplay = (TextView) findViewById(R.id.DisplaySelectedPrice);

        DisplayAll = (Button) findViewById(R.id.Display);
        DisplayAllPast = (Button) findViewById(R.id.DisplayPast);
        PickOnLola = (Button) findViewById(R.id.PickLola);
        PickOnHairy = (Button) findViewById(R.id.PickHairy);
        DisplaySelectedSex = (TextView) findViewById(R.id.DisplaySex);

        PickOnLola.setVisibility(View.INVISIBLE);
        PickOnHairy.setVisibility(View.INVISIBLE);

      //  PickOnLola.setVisibility(View.INVISIBLE);
     //   PickOnHairy.setVisibility(View.INVISIBLE);
        DisplayBodyOne = (ImageButton) findViewById(R.id.DisplayBabyOneBody);
        DisplayEarsOne = (ImageButton) findViewById(R.id.DisplayBabyOneEars);
        DisplayEyesOne = (ImageButton) findViewById(R.id.DisplayBabyOneEyes);

        DisplayBodySelectedOne = (ImageButton) findViewById(R.id.DisplayBabyBodyLarge);
        DisplayEarsSelectedOne = (ImageButton) findViewById(R.id.DisplayBabyEarsLarge);
        DisplayEyesSelectedOne = (ImageButton) findViewById(R.id.DisplayBabyEyesLarge);
        DisplayTailSelectedOne = (ImageButton) findViewById(R.id.DisplayBabyTailLarge);
        DisplayBodyTwo = (ImageView) findViewById(R.id.DisplayBabyTwoBody);
        DisplayEarsTwo = (ImageView) findViewById(R.id.DisplayBabyTwoEars);
        DisplayEyesTwo = (ImageView) findViewById(R.id.DisplayBabyTwoEyes);
        DisplayBodyThree = (ImageView) findViewById(R.id.DisplayBabyThreeBody);
        DisplayEarsThree = (ImageView) findViewById(R.id.DisplayBabyThreeEars);
        DisplayEyesThree = (ImageView) findViewById(R.id.DisplayBabyThreeEyes);
        DisplayBodyFour = (ImageView) findViewById(R.id.DisplayBabyFourBody);
        DisplayEarsFour = (ImageView) findViewById(R.id.DisplayBabyFourEars);
        DisplayEyesFour = (ImageView) findViewById(R.id.DisplayBabyFourEyes);
        DisplayBodyFive = (ImageView) findViewById(R.id.DisplayBabyFiveBody);
        DisplayEarsFive = (ImageView) findViewById(R.id.DisplayBabyFiveEars);
        DisplayEyesFive = (ImageView) findViewById(R.id.DisplayBabyFiveEyes);
        DisplayBodySix = (ImageView) findViewById(R.id.DisplayBabySixBody);
        DisplayEarsSix = (ImageView) findViewById(R.id.DisplayBabySixEars);
        DisplayEyesSix = (ImageView) findViewById(R.id.DisplayBabySixEyes);
        DisplayBodySeven = (ImageView) findViewById(R.id.DisplayBabySevenBody);
        DisplayEarsSeven = (ImageView) findViewById(R.id.DisplayBabySevenEars);
        DisplayEyesSeven = (ImageView) findViewById(R.id.DisplayBabySevenEyes);
        DisplayBodyEight = (ImageView) findViewById(R.id.DisplayBabyEightBody);
        DisplayEarsEight = (ImageView) findViewById(R.id.DisplayBabyEightEars);
        DisplayEyesEight = (ImageView) findViewById(R.id.DisplayBabyEightEyes);
        DisplayBodyNine = (ImageView) findViewById(R.id.DisplayBabyNineBody);
        DisplayEarsNine = (ImageView) findViewById(R.id.DisplayBabyNineEars);
        DisplayEyesNine = (ImageView) findViewById(R.id.DisplayBabyNineEyes);
        DisplayBodyTen = (ImageView) findViewById(R.id.DisplayBabyTenBody);
        DisplayEarsTen = (ImageView) findViewById(R.id.DisplayBabyTenEars);
        DisplayEyesTen = (ImageView) findViewById(R.id.DisplayBabyTenEyes);
        DisplayBodyEleven = (ImageView) findViewById(R.id.DisplayBabyElevenBody);
        DisplayEarsEleven = (ImageView) findViewById(R.id.DisplayBabyElevenEars);
        DisplayEyesEleven = (ImageView) findViewById(R.id.DisplayBabyElevenEyes);
        DisplayBodyTwelve = (ImageButton) findViewById(R.id.DisplayBabyTwelveBody);
        DisplayEarsTwelve = (ImageButton) findViewById(R.id.DisplayBabyTwelveEars);
        DisplayEyesTwelve = (ImageButton) findViewById(R.id.DisplayBabyTwelveEyes);
        DisplayBodyThirteen = (ImageView) findViewById(R.id.DisplayBabyThirteenBody);
        DisplayEarsThirteen = (ImageView) findViewById(R.id.DisplayBabyThirteenEars);
        DisplayEyesThirteen = (ImageView) findViewById(R.id.DisplayBabyThirteenEyes);
        DisplayBodyFourteen = (ImageView) findViewById(R.id.DisplayBabyFourteenBody);
        DisplayEarsFourteen = (ImageView) findViewById(R.id.DisplayBabyFourteenEars);
        DisplayEyesFourteen = (ImageView) findViewById(R.id.DisplayBabyFourteenEyes);
        DisplayBodyFifteen = (ImageView) findViewById(R.id.DisplayBabyFifteenBody);
        DisplayEarsFifteen = (ImageView) findViewById(R.id.DisplayBabyFifteenEars);
        DisplayEyesFifteen = (ImageView) findViewById(R.id.DisplayBabyFifteenEyes);
        DisplayBodySixteen = (ImageView) findViewById(R.id.DisplayBabySixteenBody);
        DisplayEarsSixteen = (ImageView) findViewById(R.id.DisplayBabySixteenEars);
        DisplayEyesSixteen = (ImageView) findViewById(R.id.DisplayBabySixteenEyes);



        String SexShower = "%s";

        DisplayBodyOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonOneSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonOneSelecterHare); ButtonLargeImageScalerOne(BabyButtonOneSelecterHare);




                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonOneSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonOneSelecterHare);
                    }
                });
            }
        });
        DisplayTailOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonOneSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonOneSelecterHare); ButtonLargeImageScalerOne(BabyButtonOneSelecterHare);




                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonOneSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonOneSelecterHare);
                    }
                });
            }
        });
        DisplayEarsOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonOneSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonOneSelecterHare); ButtonLargeImageScalerOne(BabyButtonOneSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonOneSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonOneSelecterHare);
                    }
                });
            }
        });
        DisplayEyesOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonOneSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonOneSelecterHare); ButtonLargeImageScalerOne(BabyButtonOneSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonOneSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonOneSelecterHare);
                    }
                });
            }
        });
        DisplayTailSelectedOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DisplayCurrentBabiesSizeCollapser();
                DisplaySelectedStats(null);
                UnhideDisplayButtons();
            }
        });
        DisplayBodySelectedOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DisplayCurrentBabiesSizeCollapser();
                DisplaySelectedStats(null);
                UnhideDisplayButtons();
            }
        });
        DisplayEarsSelectedOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayCurrentBabiesSizeCollapser();
                DisplaySelectedStats(null);
                UnhideDisplayButtons();
            }
        });
        DisplayEyesSelectedOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayCurrentBabiesSizeCollapser();
                DisplaySelectedStats(null);
                UnhideDisplayButtons();
            }
        });
        DisplayBodyTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                DisplaySelectedStats(BabyButtonTwoSelecterHare); ButtonLargeImageScalerOne(BabyButtonTwoSelecterHare);

                DisplaySelectedSex.setText(BabyButtonTwoSelecterHare.Sex);

                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTwoSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTwoSelecterHare);
                    }
                });
            }
        });
        DisplayEarsTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                DisplaySelectedSex.setText(BabyButtonTwoSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonTwoSelecterHare); ButtonLargeImageScalerOne(BabyButtonTwoSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTwoSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTwoSelecterHare);
                    }
                });
            }
        });
        DisplayEyesTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                DisplaySelectedSex.setText(BabyButtonTwoSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonTwoSelecterHare); ButtonLargeImageScalerOne(BabyButtonTwoSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTwoSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTwoSelecterHare);
                    }
                });
            }
        });
        DisplayTailTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                DisplaySelectedSex.setText(BabyButtonTwoSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonTwoSelecterHare); ButtonLargeImageScalerOne(BabyButtonTwoSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTwoSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTwoSelecterHare);
                    }
                });
            }
        });
        DisplayBodyThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                DisplaySelectedSex.setText(BabyButtonThreeSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonThreeSelecterHare); ButtonLargeImageScalerOne(BabyButtonThreeSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonThreeSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonThreeSelecterHare);
                    }
                });
            }
        });
        DisplayEarsThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                DisplaySelectedSex.setText(BabyButtonThreeSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonThreeSelecterHare); ButtonLargeImageScalerOne(BabyButtonThreeSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonThreeSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonThreeSelecterHare);
                    }
                });
            }
        });
        DisplayEyesThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                DisplaySelectedSex.setText(BabyButtonThreeSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonThreeSelecterHare); ButtonLargeImageScalerOne(BabyButtonThreeSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonThreeSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonThreeSelecterHare);
                    }
                });
            }
        });
        DisplayTailThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                DisplaySelectedSex.setText(BabyButtonThreeSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonThreeSelecterHare); ButtonLargeImageScalerOne(BabyButtonThreeSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonThreeSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonThreeSelecterHare);
                    }
                });
            }
        });
        DisplayBodyFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                DisplaySelectedSex.setText(BabyButtonFourSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonFourSelecterHare); ButtonLargeImageScalerOne(BabyButtonFourSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFourSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFourSelecterHare);
                    }
                });
            }
        });
        DisplayEarsFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedStats(BabyButtonFourSelecterHare); ButtonLargeImageScalerOne(BabyButtonFourSelecterHare);
                DisplaySelectedSex.setText(BabyButtonFourSelecterHare.Sex);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFourSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFourSelecterHare);
                    }
                });
            }
        });
        DisplayEyesFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedStats(BabyButtonFourSelecterHare); ButtonLargeImageScalerOne(BabyButtonFourSelecterHare);
                DisplaySelectedSex.setText(BabyButtonFourSelecterHare.Sex);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFourSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFourSelecterHare);
                    }
                });
            }
        });
        DisplayTailFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedStats(BabyButtonFourSelecterHare); ButtonLargeImageScalerOne(BabyButtonFourSelecterHare);
                DisplaySelectedSex.setText(BabyButtonFourSelecterHare.Sex);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFourSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFourSelecterHare);
                    }
                });
            }
        });
        DisplayBodyFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonFiveSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonFiveSelecterHare); ButtonLargeImageScalerOne(BabyButtonFiveSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFiveSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFiveSelecterHare);
                    }
                });
            }
        });
        DisplayEarsFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonFiveSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonFiveSelecterHare); ButtonLargeImageScalerOne(BabyButtonFiveSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFiveSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFiveSelecterHare);
                    }
                });
            }
        });
        DisplayEyesFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonFiveSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonFiveSelecterHare); ButtonLargeImageScalerOne(BabyButtonFiveSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFiveSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFiveSelecterHare);
                    }
                });
            }
        });

        DisplayTailFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonFiveSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonFiveSelecterHare); ButtonLargeImageScalerOne(BabyButtonFiveSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFiveSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFiveSelecterHare);
                    }
                });
            }
        });
        DisplayBodySix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonSixSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonSixSelecterHare); ButtonLargeImageScalerOne(BabyButtonSixSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSixSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSixSelecterHare);
                    }
                });
            }
        });
        DisplayEarsSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonSixSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonSixSelecterHare); ButtonLargeImageScalerOne(BabyButtonSixSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSixSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSixSelecterHare);
                    }
                });
            }
        });
        DisplayTailSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonSixSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonSixSelecterHare); ButtonLargeImageScalerOne(BabyButtonSixSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSixSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSixSelecterHare);
                    }
                });
            }
        });
        DisplayEyesSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonSixSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonSixSelecterHare); ButtonLargeImageScalerOne(BabyButtonSixSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSixSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSixSelecterHare);
                    }
                });
            }
        });
        DisplayBodySeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonSevenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonSevenSelecterHare); ButtonLargeImageScalerOne(BabyButtonSevenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSevenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSevenSelecterHare);
                    }
                });
            }
        });
        DisplayEarsSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonSevenSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonSevenSelecterHare); ButtonLargeImageScalerOne(BabyButtonSevenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSevenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSevenSelecterHare);
                    }
                });
            }
        });
        DisplayEyesSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonSevenSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonSevenSelecterHare); ButtonLargeImageScalerOne(BabyButtonSevenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSevenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSevenSelecterHare);
                    }
                });
            }
        });
        DisplayTailSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonSevenSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonSevenSelecterHare); ButtonLargeImageScalerOne(BabyButtonSevenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSevenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSevenSelecterHare);
                    }
                });
            }
        });
        DisplayBodyEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonEightSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonEightSelecterHare); ButtonLargeImageScalerOne(BabyButtonEightSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonEightSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonEightSelecterHare);
                    }
                });
            }
        });
        DisplayEarsEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonEightSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonEightSelecterHare); ButtonLargeImageScalerOne(BabyButtonEightSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonEightSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonEightSelecterHare);
                    }
                });
            }
        });
        DisplayEyesEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonEightSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonEightSelecterHare); ButtonLargeImageScalerOne(BabyButtonEightSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonEightSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonEightSelecterHare);
                    }
                });
            }
        });

        DisplayTailEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonEightSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonEightSelecterHare); ButtonLargeImageScalerOne(BabyButtonEightSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonEightSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonEightSelecterHare);
                    }
                });
            }
        });

        DisplayBodyNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonNineSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonNineSelecterHare); ButtonLargeImageScalerOne(BabyButtonNineSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonNineSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonNineSelecterHare);
                    }
                });
            }
        });
        DisplayEarsNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonNineSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonNineSelecterHare); ButtonLargeImageScalerOne(BabyButtonNineSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonNineSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonNineSelecterHare);
                    }
                });
            }
        });
        DisplayEyesNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonNineSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonNineSelecterHare); ButtonLargeImageScalerOne(BabyButtonNineSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonNineSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonNineSelecterHare);
                    }
                });
            }
        });

        DisplayTailNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonNineSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonNineSelecterHare); ButtonLargeImageScalerOne(BabyButtonNineSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonNineSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonNineSelecterHare);
                    }
                });
            }
        });
        DisplayBodyTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonTenSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonTenSelecterHare); ButtonLargeImageScalerOne(BabyButtonTenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTenSelecterHare);
                    }
                });
            }
        });
        DisplayEarsTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonTenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonTenSelecterHare); ButtonLargeImageScalerOne(BabyButtonTenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTenSelecterHare);
                    }
                });
            }
        });
        DisplayEyesTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonTenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonTenSelecterHare); ButtonLargeImageScalerOne(BabyButtonTenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTenSelecterHare);
                    }
                });
            }
        });

        DisplayTailTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonTenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonTenSelecterHare); ButtonLargeImageScalerOne(BabyButtonTenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTenSelecterHare);
                    }
                });
            }
        });
        DisplayBodyEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonElevenSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonElevenSelecterHare); ButtonLargeImageScalerOne(BabyButtonElevenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonElevenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonElevenSelecterHare);
                    }
                });
            }
        });
        DisplayEarsEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonElevenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonElevenSelecterHare); ButtonLargeImageScalerOne(BabyButtonElevenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonElevenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonElevenSelecterHare);
                    }
                });
            }
        });
        DisplayEyesEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonElevenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonElevenSelecterHare); ButtonLargeImageScalerOne(BabyButtonElevenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonElevenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonElevenSelecterHare);
                    }
                });
            }
        });

        DisplayTailEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonElevenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonElevenSelecterHare); ButtonLargeImageScalerOne(BabyButtonElevenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonElevenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonElevenSelecterHare);
                    }
                });
            }
        });
        DisplayBodyTwelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonTwelveSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonTwelveSelecterHare); ButtonLargeImageScalerOne(BabyButtonTwelveSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTwelveSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTwelveSelecterHare);
                    }
                });
            }
        });
        DisplayEarsTwelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonTwelveSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonTwelveSelecterHare); ButtonLargeImageScalerOne(BabyButtonTwelveSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTwelveSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTwelveSelecterHare);
                    }
                });
            }
        });
        DisplayEyesTwelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonTwelveSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonTwelveSelecterHare); ButtonLargeImageScalerOne(BabyButtonTwelveSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTwelveSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTwelveSelecterHare);
                    }
                });
            }
        });

        DisplayTailTwelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonTwelveSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonTwelveSelecterHare); ButtonLargeImageScalerOne(BabyButtonTwelveSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTwelveSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTwelveSelecterHare);
                    }
                });
            }
        });
        DisplayBodyThirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonThirteenSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonThirteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonThirteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonThirteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonThirteenSelecterHare);
                    }
                });
            }
        });
        DisplayEarsThirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonThirteenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonThirteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonThirteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonThirteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonThirteenSelecterHare);
                    }
                });
            }
        });
        DisplayEyesThirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                DisplaySelectedSex.setText(BabyButtonThirteenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonThirteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonThirteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonThirteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonThirteenSelecterHare);
                    }
                });
            }
        });

        DisplayTailThirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonThirteenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonThirteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonThirteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonThirteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonThirteenSelecterHare);
                    }
                });
            }
        });
        DisplayBodyFourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonFourteenSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonFourteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonFourteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFourteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFourteenSelecterHare);
                    }
                });
            }
        });
        DisplayEarsFourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonFourteenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonFourteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonFourteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFourteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFourteenSelecterHare);
                    }
                });
            }
        });
        DisplayEyesFourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonFourteenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonFourteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonFourteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFourteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFourteenSelecterHare);
                    }
                });
            }
        });

        DisplayTailFourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonFourteenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonFourteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonFourteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFourteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFourteenSelecterHare);
                    }
                });
            }
        });
        DisplayBodyFifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonFifteenSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonFifteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonFifteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFifteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFifteenSelecterHare);
                    }
                });
            }
        });
        DisplayEarsFifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonFifteenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonFifteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonFifteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFifteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFifteenSelecterHare);
                    }
                });
            }
        });
        DisplayEyesFifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonFifteenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonFifteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonFifteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFifteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFifteenSelecterHare);
                    }
                });
            }
        });

        DisplayTailFifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonFifteenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonFifteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonFifteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFifteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFifteenSelecterHare);
                    }
                });
            }
        });
        DisplayBodySixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonSixteenSelecterHare.Sex);

                DisplaySelectedStats(BabyButtonSixteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonSixteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSixteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSixteenSelecterHare);
                    }
                });
            }
        });
        DisplayEarsSixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonSixteenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonSixteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonSixteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSixteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSixteenSelecterHare);
                    }
                });
            }
        });
        DisplayEyesSixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonSixteenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonSixteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonSixteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSixteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSixteenSelecterHare);
                    }
                });
            }
        });

        DisplayTailSixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedSex.setText(BabyButtonSixteenSelecterHare.Sex);
                DisplaySelectedStats(BabyButtonSixteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonSixteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSixteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSixteenSelecterHare);
                    }
                });
            }
        });

        DisplayAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHutch = getIntent();
                String catchname = "%s%s";
                String babyharecallname = String.format(catchname, "NewHare", babycounter);

                HareSplitting.Hare HareOneDummy = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallname);
                int StupidBabyNumber = (int) intentHutch.getDoubleExtra("StupidBabyNumber", 400);
                HareSplitting.Hare BabyHares[] = new HareSplitting.Hare[StupidBabyNumber];
                //HareSplitting.Hare BabyHares[] = new HareSplitting.Hare[StupidBabyNumber];
                //HareSplitting.Hare HareOneDummy = (HareSplitting.Hare)intentHutch.getSerializableExtra("NewHare1");
                //  Hare HareOneDummy = (Hare)intentHutch.getSerializableExtra(babyharecallname);

                String babyharecallnameloop;
                int babynumberlooper = 0;
                int babynumberlooper2 = 1;

                for (babynumberlooper = 0; babynumberlooper < StupidBabyNumber; babynumberlooper++) {
                    babyharecallnameloop = String.format(catchname, "NewHare", babycounter);
                    BabyHares[babynumberlooper] = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameloop);
                    babycounter = (babycounter + 1) % StupidBabyNumber;

                    if (babycounter >= 9998) {
                        for (babynumberlooper2 = 1; intentHutch.getSerializableExtra(babyharecallnameloop) != null; babynumberlooper2++) {
                            babyharecallnameloop = String.format(catchname, "NewHare", babynumberlooper2);
                            BabyHares[babynumberlooper2] = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameloop);

                        }
                    }
                }
/*


                int babycountercheck = babycounter + 1;
                for (babynumberlooper = 0; BabyHares[babycountercheck] != null; babynumberlooper++) {
                    String babyharecallnameloop = String.format(catchname, "NewHare", babycounter);
                    BabyHares[babynumberlooper] = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameloop);
                    babycounter = (babycounter + 1) % StupidBabyNumber;
                }
*/






                if (BabyHares[babydisplaycounter+1] != null) {
                ButtonImageScalerOne(BabyHares[babydisplaycounter]);
                babydisplaycounter = (babydisplaycounter + 1) % StupidBabyNumber;
                ButtonImageScalerTwo(BabyHares[babydisplaycounter]);
                babydisplaycounter = (babydisplaycounter + 1) % StupidBabyNumber;
                ButtonImageScalerThree(BabyHares[babydisplaycounter]);
                babydisplaycounter = (babydisplaycounter + 1) % StupidBabyNumber;
                ButtonImageScalerFour(BabyHares[babydisplaycounter]);
                babydisplaycounter = (babydisplaycounter + 1) % StupidBabyNumber;
                ButtonImageScalerFive(BabyHares[babydisplaycounter]);
                babydisplaycounter = (babydisplaycounter + 1) % StupidBabyNumber;
                ButtonImageScalerSix(BabyHares[babydisplaycounter]);
                babydisplaycounter = (babydisplaycounter + 1) % StupidBabyNumber;
                ButtonImageScalerSeven(BabyHares[babydisplaycounter]);
                babydisplaycounter = (babydisplaycounter + 1) % StupidBabyNumber;
                ButtonImageScalerEight(BabyHares[babydisplaycounter]);
                babydisplaycounter = (babydisplaycounter + 1) % StupidBabyNumber;
                ButtonImageScalerNine(BabyHares[babydisplaycounter]);
                babydisplaycounter = (babydisplaycounter + 1) % StupidBabyNumber;
                ButtonImageScalerTen(BabyHares[babydisplaycounter]);
                babydisplaycounter = (babydisplaycounter + 1) % StupidBabyNumber;
                ButtonImageScalerEleven(BabyHares[babydisplaycounter]);
                babydisplaycounter = (babydisplaycounter + 1) % StupidBabyNumber;
                ButtonImageScalerTwelve(BabyHares[babydisplaycounter]);
                babydisplaycounter = (babydisplaycounter + 1) % StupidBabyNumber;
                ButtonImageScalerThirteen(BabyHares[babydisplaycounter]);
                babydisplaycounter = (babydisplaycounter + 1) % StupidBabyNumber;
                ButtonImageScalerFourteen(BabyHares[babydisplaycounter]);
                babydisplaycounter = (babydisplaycounter + 1) % StupidBabyNumber;
                ButtonImageScalerFifteen(BabyHares[babydisplaycounter]);
                babydisplaycounter = (babydisplaycounter + 1) % StupidBabyNumber;
                ButtonImageScalerSixteen(BabyHares[babydisplaycounter]);
                babydisplaycounter = (babydisplaycounter + 1) % StupidBabyNumber;
                }

/*
                if(HareOneDummy == null || HareTwo == null || HareThree == null || HareFour == null || HareFive == null || HareSix == null || HareSeven == null || HareEight == null){
                    babycounter = (babycounter - 1) % StupidBabyNumber;
                }
*/

            }
        });

       

        DisplayAllPast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (babydisplaycounter > 0) {
                    Intent intentHutch = getIntent();
                    double StupidBabyNumber = intentHutch.getDoubleExtra("StupidBabyNumber", babydisplaycounter);
                    int StupidBabyInt = (int) StupidBabyNumber;
                    int StupidBabyDisplayCounterInt = babydisplaycounter + 1;
                    HareSplitting.Hare BabyHares[] = new HareSplitting.Hare[StupidBabyInt];
                   // if (ReverseCheckCounter == 0) {


                        String babyharecallnameloop;
                        int babynumberlooper = 0;
                        int babynumberlooper2 = 1;

                        for (babynumberlooper = 0; babynumberlooper < StupidBabyNumber; babynumberlooper++) {
                            babyharecallnameloop = String.format(catchname, "NewHare", babycounter);
                            BabyHares[babynumberlooper] = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameloop);
                            babycounter = (babycounter + 1) % StupidBabyInt;

                            if (babycounter >= StupidBabyDisplayCounterInt) {
                                for (babynumberlooper2 = 1; intentHutch.getSerializableExtra(babyharecallnameloop) != null; babynumberlooper2++) {
                                    babyharecallnameloop = String.format(catchname, "NewHare", babynumberlooper2);
                                    BabyHares[babynumberlooper2] = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameloop);

                                }
                            }
                        }
                    //    ReverseCheckCounter = ReverseCheckCounter + 1;
                   // }

                    if ((BabyHares[babydisplaycounter-1] != null) || ((BabyHares[babydisplaycounter-9] != null) && (BabyHares[babydisplaycounter-1] == null))) {





                        babydisplaycounter = (babydisplaycounter - 1) % StupidBabyInt;
                        ButtonImageScalerSixteen(BabyHares[babydisplaycounter]);
                        babydisplaycounter = (babydisplaycounter - 1) % StupidBabyInt;
                        ButtonImageScalerFifteen(BabyHares[babydisplaycounter]);
                        babydisplaycounter = (babydisplaycounter - 1) % StupidBabyInt;
                        ButtonImageScalerFourteen(BabyHares[babydisplaycounter]);
                        babydisplaycounter = (babydisplaycounter - 1) % StupidBabyInt;
                        ButtonImageScalerThirteen(BabyHares[babydisplaycounter]);
                        babydisplaycounter = (babydisplaycounter - 1) % StupidBabyInt;
                        ButtonImageScalerTwelve(BabyHares[babydisplaycounter]);
                        babydisplaycounter = (babydisplaycounter - 1) % StupidBabyInt;
                        ButtonImageScalerEleven(BabyHares[babydisplaycounter]);
                        babydisplaycounter = (babydisplaycounter - 1) % StupidBabyInt;
                        ButtonImageScalerTen(BabyHares[babydisplaycounter]);
                        babydisplaycounter = (babydisplaycounter - 1) % StupidBabyInt;
                        ButtonImageScalerNine(BabyHares[babydisplaycounter]);
                        babydisplaycounter = (babydisplaycounter - 1) % StupidBabyInt;
                        ButtonImageScalerEight(BabyHares[babydisplaycounter]);
                        babydisplaycounter = (babydisplaycounter - 1) % StupidBabyInt;
                        ButtonImageScalerSeven(BabyHares[babydisplaycounter]);
                        babydisplaycounter = (babydisplaycounter - 1) % StupidBabyInt;
                        ButtonImageScalerSix(BabyHares[babydisplaycounter]);
                        babydisplaycounter = (babydisplaycounter - 1) % StupidBabyInt;
                        ButtonImageScalerFive(BabyHares[babydisplaycounter]);
                        babydisplaycounter = (babydisplaycounter - 1) % StupidBabyInt;
                        ButtonImageScalerFour(BabyHares[babydisplaycounter]);
                        babydisplaycounter = (babydisplaycounter - 1) % StupidBabyInt;
                        ButtonImageScalerThree(BabyHares[babydisplaycounter]);
                        babydisplaycounter = (babydisplaycounter - 1) % StupidBabyInt;
                        ButtonImageScalerTwo(BabyHares[babydisplaycounter]);
                        babydisplaycounter = (babydisplaycounter - 1) % StupidBabyInt;
                        ButtonImageScalerOne(BabyHares[babydisplaycounter]);
                        
                    }

                }
            }
});

        
        
        
        
        
        
        
        
    }

    private void DisplayCurrentBabiesSizeCollapser() {

        DisplayEyesSelectedOne.setVisibility(View.INVISIBLE);
        DisplayEarsSelectedOne.setVisibility(View.INVISIBLE);
        DisplayBodySelectedOne.setVisibility(View.INVISIBLE);
        DisplayTailSelectedOne.setVisibility(View.INVISIBLE);


        DisplayEyesOne.setVisibility(View.VISIBLE);
        DisplayEarsOne.setVisibility(View.VISIBLE);
        DisplayBodyOne.setVisibility(View.VISIBLE);
        DisplayTailOne.setVisibility(View.VISIBLE);

        DisplayEyesTwo.setVisibility(View.VISIBLE);
        DisplayEarsTwo.setVisibility(View.VISIBLE);
        DisplayBodyTwo.setVisibility(View.VISIBLE);
        DisplayTailTwo.setVisibility(View.VISIBLE);

        DisplayEyesThree.setVisibility(View.VISIBLE);
        DisplayEarsThree.setVisibility(View.VISIBLE);
        DisplayBodyThree.setVisibility(View.VISIBLE);
        DisplayTailThree.setVisibility(View.VISIBLE);

        DisplayEyesFour.setVisibility(View.VISIBLE);
        DisplayEarsFour.setVisibility(View.VISIBLE);
        DisplayBodyFour.setVisibility(View.VISIBLE);
        DisplayTailFour.setVisibility(View.VISIBLE);

        DisplayEyesFive.setVisibility(View.VISIBLE);
        DisplayEarsFive.setVisibility(View.VISIBLE);
        DisplayBodyFive.setVisibility(View.VISIBLE);
        DisplayTailFive.setVisibility(View.VISIBLE);

        DisplayEyesSix.setVisibility(View.VISIBLE);
        DisplayEarsSix.setVisibility(View.VISIBLE);
        DisplayBodySix.setVisibility(View.VISIBLE);
        DisplayTailSix.setVisibility(View.VISIBLE);

        DisplayEyesSeven.setVisibility(View.VISIBLE);
        DisplayEarsSeven.setVisibility(View.VISIBLE);
        DisplayBodySeven.setVisibility(View.VISIBLE);
        DisplayTailSeven.setVisibility(View.VISIBLE);

        DisplayEyesEight.setVisibility(View.VISIBLE);
        DisplayEarsEight.setVisibility(View.VISIBLE);
        DisplayBodyEight.setVisibility(View.VISIBLE);
        DisplayTailEight.setVisibility(View.VISIBLE);

        DisplayEyesNine.setVisibility(View.VISIBLE);
        DisplayEarsNine.setVisibility(View.VISIBLE);
        DisplayBodyNine.setVisibility(View.VISIBLE);
        DisplayTailNine.setVisibility(View.VISIBLE);

        DisplayEyesTen.setVisibility(View.VISIBLE);
        DisplayEarsTen.setVisibility(View.VISIBLE);
        DisplayBodyTen.setVisibility(View.VISIBLE);
        DisplayTailTen.setVisibility(View.VISIBLE);

        DisplayEyesEleven.setVisibility(View.VISIBLE);
        DisplayEarsEleven.setVisibility(View.VISIBLE);
        DisplayBodyEleven.setVisibility(View.VISIBLE);
        DisplayTailEleven.setVisibility(View.VISIBLE);

        DisplayEyesTwelve.setVisibility(View.VISIBLE);
        DisplayEarsTwelve.setVisibility(View.VISIBLE);
        DisplayBodyTwelve.setVisibility(View.VISIBLE);
        DisplayTailTwelve.setVisibility(View.VISIBLE);

        DisplayEyesThirteen.setVisibility(View.VISIBLE);
        DisplayEarsThirteen.setVisibility(View.VISIBLE);
        DisplayBodyThirteen.setVisibility(View.VISIBLE);
        DisplayTailThirteen.setVisibility(View.VISIBLE);

        DisplayEyesFourteen.setVisibility(View.VISIBLE);
        DisplayEarsFourteen.setVisibility(View.VISIBLE);
        DisplayBodyFourteen.setVisibility(View.VISIBLE);
        DisplayTailFourteen.setVisibility(View.VISIBLE);

        DisplayEyesFifteen.setVisibility(View.VISIBLE);
        DisplayEarsFifteen.setVisibility(View.VISIBLE);
        DisplayBodyFifteen.setVisibility(View.VISIBLE);
        DisplayTailFifteen.setVisibility(View.VISIBLE);

        DisplayEyesSixteen.setVisibility(View.VISIBLE);
        DisplayEarsSixteen.setVisibility(View.VISIBLE);
        DisplayBodySixteen.setVisibility(View.VISIBLE);
        DisplayTailSixteen.setVisibility(View.VISIBLE);


    }

    public void DisplaySelectedStats(HareSplitting.Hare selected){

        TextView selectedsexdisplay = (TextView) findViewById(R.id.DisplaySelectedSex);
        TextView selectedSizedisplay = (TextView) findViewById(R.id.DisplaySelectedSize);
        TextView selectedEarColordisplay = (TextView) findViewById(R.id.DisplaySelectedEarColor);
        TextView selectedEyeColordisplay = (TextView) findViewById(R.id.DisplaySelectedEyeColor);
        TextView selectedBodyColordisplay = (TextView) findViewById(R.id.DisplaySelectedBodyColor);
        TextView selectedTailColordisplay = (TextView) findViewById(R.id.DisplaySelectedTailColor);
        TextView selectedAlphasdisplay = (TextView) findViewById(R.id.DisplaySelectedAlphas);
        TextView selectedPricedisplay = (TextView) findViewById(R.id.DisplaySelectedPrice);


        if ( ReverseCheckCounter == 0) {



            String SexFormat = "Sex: %s";
            String SexFormatF = String.format(SexFormat, selected.Sex);
            selectedsexdisplay.setText(SexFormatF);

            String SizeFormat = "Size: %s";
            String SizeFormatF = String.format(SizeFormat, selected.size);
            selectedSizedisplay.setText(SizeFormatF);

            String EarColorFormat = "Ear Color: %s,%s,%s,%s,%s,%s";
            String EarColorFormatF = String.format(EarColorFormat, selected.earAt, selected.earBt, selected.earCt, selected.earDt, selected.earEt, selected.earFt);
            
            
            String EarColor = ("Ear Color:" + FinalColorMethod(selected.earAt, selected.earBt, selected.earCt, selected.earDt, selected.earEt, selected.earFt));
            selectedEarColordisplay.setText(EarColor);
            selectedEarColordisplay.setTextColor(android.graphics.Color.parseColor(FinalColorMethod(selected.earAt, selected.earBt, selected.earCt, selected.earDt, selected.earEt, selected.earFt)));


          //  String BodyColorFormat = "Body Color: %s,%s,%s,%s,%s,%s";
          //  String BodyColorFormatF = String.format(BodyColorFormat, selected.At, selected.Bt, selected.Ct, selected.Dt, selected.Et, selected.Ft);
          //  selectedBodyColordisplay.setText(BodyColorFormatF);


            String BodyColor = ("Body Color:" + FinalColorMethod(selected.At, selected.Bt, selected.Ct, selected.Dt, selected.Et, selected.Ft));
            selectedBodyColordisplay.setText(BodyColor);
            selectedBodyColordisplay.setTextColor(android.graphics.Color.parseColor(FinalColorMethod(selected.At, selected.Bt, selected.Ct, selected.Dt, selected.Et, selected.Ft)));


           // String EyeColorFormat = "Eye Color: %s,%s,%s,%s,%s,%s";
         //   String EyeColorFormatF = String.format(EyeColorFormat, selected.eyeAt, selected.eyeBt, selected.eyeCt, selected.eyeDt, selected.eyeEt, selected.eyeFt);
          //  selectedEyeColordisplay.setText(EyeColorFormatF);


            String EyeColor = ("Eye Color:" + FinalColorMethod(selected.eyeAt, selected.eyeBt, selected.eyeCt, selected.eyeDt, selected.eyeEt, selected.eyeFt));
            selectedEyeColordisplay.setText(EyeColor);
            selectedEyeColordisplay.setTextColor(android.graphics.Color.parseColor(FinalColorMethod(selected.eyeAt, selected.eyeBt, selected.eyeCt, selected.eyeDt, selected.eyeEt, selected.eyeFt)));

          //  String TailColorFormat = "Tail Color: %s,%s,%s,%s,%s,%s";
          //  String TailColorFormatF = String.format(TailColorFormat, selected.tailAt, selected.tailBt, selected.tailCt, selected.tailDt, selected.tailEt, selected.tailFt);
          //  selectedTailColordisplay.setText(TailColorFormatF);

            String TailColor = ("Tail Color:" + FinalColorMethod(selected.tailAt, selected.tailBt, selected.tailCt, selected.tailDt, selected.tailEt, selected.tailFt));
            selectedTailColordisplay.setText(TailColor);
            selectedTailColordisplay.setTextColor(android.graphics.Color.parseColor(FinalColorMethod(selected.tailAt, selected.tailBt, selected.tailCt, selected.tailDt, selected.tailEt, selected.tailFt)));

            String AlphaFormat = "Tint/256: Body %s, Tail %s";
            String AlphaFormatF = String.format(AlphaFormat, selected.HareAlpha, selected.TailAlpha);
            selectedAlphasdisplay.setText(AlphaFormatF);

            String PriceFormat = "Price: $%s";
            String PriceFormatF = String.format(PriceFormat, selected.Price);
            selectedPricedisplay.setText(PriceFormatF);

            selectedsexdisplay.setVisibility(View.VISIBLE);
            selectedSizedisplay.setVisibility(View.VISIBLE);
            selectedEarColordisplay.setVisibility(View.VISIBLE);
            selectedBodyColordisplay.setVisibility(View.VISIBLE);
            selectedEyeColordisplay.setVisibility(View.VISIBLE);
            selectedTailColordisplay.setVisibility(View.VISIBLE);
            selectedAlphasdisplay.setVisibility(View.VISIBLE);
            selectedPricedisplay.setVisibility(View.VISIBLE);
            ReverseCheckCounter = (ReverseCheckCounter + 1)%2;

        }else {

            selectedsexdisplay.setVisibility(View.INVISIBLE);
            selectedSizedisplay.setVisibility(View.INVISIBLE);
            selectedEarColordisplay.setVisibility(View.INVISIBLE);
            selectedBodyColordisplay.setVisibility(View.INVISIBLE);
            selectedEyeColordisplay.setVisibility(View.INVISIBLE);
            selectedTailColordisplay.setVisibility(View.INVISIBLE);
            selectedAlphasdisplay.setVisibility(View.INVISIBLE);
selectedPricedisplay.setVisibility(View.INVISIBLE);
            ReverseCheckCounter = (ReverseCheckCounter + 1)%2;

        }









    }

    public void HideDisplayButtons(){
        DisplayAllPast.setVisibility(View.INVISIBLE);
        DisplayAll.setVisibility(View.INVISIBLE);

        PickOnLola.setVisibility(View.VISIBLE);
        PickOnHairy.setVisibility(View.VISIBLE);


    }
    public void UnhideDisplayButtons(){
        DisplayAllPast.setVisibility(View.VISIBLE);
        DisplayAll.setVisibility(View.VISIBLE);

        PickOnLola.setVisibility(View.INVISIBLE);
        PickOnHairy.setVisibility(View.INVISIBLE);

    }




    public String FinalColorMethod(int A, int B, int C, int D, int E, int F) {
        String As = null;
        String Bs = null;
        String Cs = null;
        String Ds = null;
        String Es = null;
        String Fs = null;
        String PassColor = "#%s%s%s%s%s%s";

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
}
