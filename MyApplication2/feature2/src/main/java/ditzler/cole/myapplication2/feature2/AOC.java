package ditzler.cole.myapplication2.feature2;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

@RequiresApi(api = Build.VERSION_CODES.N)
public class AOC extends AppCompatActivity {

    MediaPlayer HappyTrackPlayer;
    int sound = 1;
    String notechar = "";
    TextView AView;
    Button AButton, Mute;
    String Eggstring = "";
    String Eggstringss = "%s,";
    String Eggstrings = "%.0f,";
    String testString = "C = A + B;";
    double HappinessCounter = 0;
    double currentvalue = 0;
    double HappinessCounteress = 0;
    int Magicalpowercounter = 2;
    int seriousbuisness;
    int needstobeeight;
    int lazybuisness;
    double Base = 60;
    double BaseTwo = Base*Base;
    double BaseThree = Base*Base*Base;
    double BaseFour = Base*Base*Base*Base;
    double BaseFive = Base*Base*Base*Base*Base;
    double BaseSix = Base*Base*Base*Base*Base*Base;
    int[] sanddancerset = new int[999999];

    int[] Intarray = new int[]{-16,12,-18,-1,5,-8,9,-15,12,6,11,7,-9,13,5,-4,-4,-2,-5,19,4,14,7,8,-16,-9,16,8,-11,-7,12,8,13,11,12,-19,11,7,9,-7,-16,-5,11,-1,8,5,12,-1,-1,6,-2,-12,6,-18,11,5,13,-12,-15,-8,-13,2,-11,1,-14,-6,11,-15,11,8,18,-8,18,-7,-9,-24,-12,2,20,-9,-5,-14,-6,16,-1,-12,-16,8,9,-15,-8,-2,-4,-16,-18,-8,10,10,2,3,-8,-10,-1,-2,20,-5,-4,-13,10,9,-12,-19,15,-4,-13,-11,-9,-4,-12,3,-7,-4,13,8,-5,10,-11,7,10,13,10,-17,-21,11,3,9,-15,-11,15,10,-3,17,6,11,16,19,8,8,4,9,7,15,2,15,22,19,11,3,19,9,-4,9,-19,-16,6,2,-3,5,5,-18,1,-14,-6,-20,10,-13,19,-18,-17,5,-39,2,33,2,24,-16,45,9,21,6,20,4,-12,-7,-3,8,12,5,-1,8,18,-13,-9,3,16,-4,15,13,-10,-8,-13,-21,15,17,13,-4,-18,-15,3,11,5,3,10,-11,9,19,-2,9,3,-13,2,-7,-14,-2,-7,-19,7,3,-13,6,10,5,-9,-20,-8,5,-17,11,-12,17,-12,-14,24,-22,-13,15,15,1,-4,13,-30,12,17,8,45,4,-3,-5,3,-9,13,8,14,2,-12,-3,9,20,7,1,1,-17,-10,3,-2,4,-6,16,-8,15,16,8,-11,-14,-4,2,15,19,12,14,17,-18,-18,-18,-1,-1,-7,-17,-2,-18,15,-3,5,-20,39,-1,6,8,10,16,-19,11,19,15,-6,19,-8,6,1,-2,-20,-4,18,2,-17,-10,-10,-12,18,2,-16,-8,14,-15,12,-14,-19,-16,-21,-17,21,-12,-34,-22,-25,-15,14,-12,-10,11,-20,4,-6,-11,14,21,74,40,3,15,-4,16,12,3,6,2,11,10,-3,17,-5,10,13,5,-13,-4,13,-8,17,-2,6,-12,7,2,13,-2,-9,18,15,-11,4,3,-21,-17,3,12,-1,-12,-3,-20,-10,13,-6,-4,-20,7,15,-6,-15,-26,13,6,-23,-9,-1,44,8,-14,26,13,5,31,24,7,-2,7,-4,17,-16,-3,36,-10,-22,-11,62,-7,21,-17,-10,-18,11,4,5,-23,-26,-40,2,32,62,23,45,109,-37,-10,-99,-210,-21,-33,379,262,66,66407,13,-8,-14,-16,-6,-19,12,15,-10,-19,-8,12,13,-11,18,7,-11,14,-12,-11,-2,4,-19,-9,3,-5,7,-4,9,-19,20,7,-14,-2,-7,-8,-2,-16,8,-10,1,-4,-16,2,1,-13,-2,-3,-16,5,-6,-17,3,9,14,1,-11,6,-2,-12,-10,11,19,-9,5,-11,-8,-17,-19,8,-3,-17,13,14,-16,-8,19,17,-16,-16,-13,-11,9,-19,6,12,5,-12,-12,-16,-14,-6,7,8,-12,-18,12,13,-17,3,-5,1,6,-4,-18,1,11,2,-8,-15,-17,16,-10,-12,16,-14,-1,-11,5,14,20,16,-18,16,17,13,-9,-6,-16,19,13,8,-13,1,19,-12,-20,-20,-11,-12,4,12,6,-17,-9,-3,-18,-15,-2,-5,17,12,-8,4,-12,-7,-18,-4,-1,-19,1,-7,-8,5,1,19,-7,-19,18,12,6,19,8,-1,20,-17,-16,-5,-1,-3,6,-13,-2,6,-8,12,-13,-3,-13,8,4,-16,19,18,16,-13,-1,3,9,18,1,3,14,10,3,1,-8,18,4,26,22,13,-12,-7,-3,6,-17,5,14,-7,12,10,-7,8,-7,18,17,-6,12,17,2,3,-9,18,10,-17,-10,-2,-13,6,4,17,12,14,-15,5,17,4,-1,-14,-19,-1,5,-15,-16,1,-11,-13,-5,15,-4,-15,1,22,17,-20,-21,13,1,-2,17,23,-35,-14,-18,6,1,1,-13,-10,34,35,8,4,14,24,16,-5,-2,10,16,-10,-11,1,-2,-3,7,5,20,-14,2,2,-5,14,-18,23,-3,2,4,2,7,8,3,-16,-5,4,12,-20,-15,-22,5,-10,31,-2,9,10,-14,18,6,3,19,-15,9,7,18,-1,-8,19,12,1,16,-5,-4,-9,16,13,2,7,5,-3,-19,12,9,2,9,16,-17,-13,12,-5,11,4,-1,2,-6,18,19,-10,3,-19,-19,-13,-16,-2,-13,8,18,6,-11,2,-16,11,12,-20,18,17,14,-13,26,-1,20,-1,-17,-11,-8,13,-7,-5,-5,-7,18,-20,-4,29,-2,21,21,16,15,14,21,-15,-14,17,5,-10,-27,-18,10,-20,34,-13,18,17,-21,32,13,6,6,28,-37,20,29,-25,-69,-57,-3,-59,3,-21,-9,14,-19,-18,20,-5,15,5,-9,-24,20,-14,-10,-15,30,21,-9,-34,4,-31,25,-85,25,38,-36,-28,58,121,-31,13,202,66221,-5,-19,-10,-7,-8,-2,6,-5,-6,8,-17,10,18,16,3,-12,-2,-11,14,7,11,-1,-5,10,9,-5,-3,-3,-11,-13,18,-8,-5,18,17,-6,3,19,-18,5,5,-4,-12,7,14,19,-6,10,-8,-11,10,-17,9,11,7,-133358};
    int Length = Intarray.length;
    int[] answerarray = new int[9999999];


    private Integer imagos[] = {R.drawable.a0, R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13, R.drawable.a14, R.drawable.a15, R.drawable.a16, R.drawable.a17, R.drawable.a18, R.drawable.a19, R.drawable.a20, R.drawable.a21, R.drawable.a22, R.drawable.a23, R.drawable.a24, R.drawable.a25, R.drawable.a26, R.drawable.a27, R.drawable.a28, R.drawable.a29, R.drawable.a30, R.drawable.a31, R.drawable.a32, R.drawable.a33, R.drawable.a34, R.drawable.a35, R.drawable.a36, R.drawable.a37, R.drawable.a38, R.drawable.a39, R.drawable.a40, R.drawable.a41, R.drawable.a42, R.drawable.a43, R.drawable.a44, R.drawable.a45, R.drawable.a46, R.drawable.a47, R.drawable.a48, R.drawable.a49, R.drawable.a50, R.drawable.a51, R.drawable.a52, R.drawable.a53, R.drawable.a54, R.drawable.a55, R.drawable.a56, R.drawable.a57, R.drawable.a58, R.drawable.a59};
    private Integer Emagos[] = {R.drawable.noerrorsmall, R.drawable.errorsmall,};









    IntBinaryOperator Plus = (a, b) -> a + b;
    IntBinaryOperator Minus = (a, b) -> a - b;
    IntBinaryOperator MinusSelf = (a, b) -> a - (a*a);
    IntUnaryOperator Ö = (a) -> (a+367)/(a+367) * (53);
    IntUnaryOperator fizz = (a) -> a%3;
    IntUnaryOperator buzz = (a) -> a%5;
    IntUnaryOperator fizzbuzz = (a) -> a%15;

    IntBinaryOperator Mult = (a, b) -> (a*b);
    IntBinaryOperator Test = (a, b) -> (((a+b)*(a*a))-(b+a));
   // IntBinaryOperator Tested = (a, b) -> Mult.applyAsInt(Mult.applyAsInt(Minus.applyAsInt((((Plus.applyAsInt(a,b)),Mult.applyAsInt(a,a)-(b+a)))),(((Plus.applyAsInt(a,b)))),(Minus.applyAsInt(Mult.applyAsInt(a,a), Plus.applyAsInt(a,b)))));

    IntBinaryOperator Tester = (a, b) -> Mult.applyAsInt(Mult.applyAsInt(Plus.applyAsInt(a,b),MinusSelf.applyAsInt(b,a)), Minus.applyAsInt(a,b));

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.happylayout);

        AView = (TextView) findViewById(R.id.TextViewA);

        AButton = (Button) findViewById(R.id.ButtonA);

        AButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {

                int Output;
                Output = MathsMethod(Plus);
                int Crazy;
                Crazy = MathsMethod(Test);

                int wut;
                wut =  Plus.applyAsInt(Tester.applyAsInt(Output, Crazy), Tester.applyAsInt(Crazy, Output));


                Eggstring = String.format(Eggstring + String.format(Eggstringss, Output));
                Eggstring = Eggstring + String.format(String.format(Eggstringss, Crazy));
                Eggstring = Eggstring + String.format(String.format(Eggstringss, wut));


                AView.setText(Eggstring);
                    }
                });
            }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public int MathsMethod (IntBinaryOperator sign){
        int A = 5;
        int B = 13;
        return sign.applyAsInt(A, B);
    }

    public String Fissbuss(int input){
        String notfissorbuss = "%s";
        notfissorbuss = String.format(notfissorbuss, input);

        if(fizz.applyAsInt(input) == 0){
            notfissorbuss = "Fizz";
        }
        if(buzz.applyAsInt(input) == 0){
            notfissorbuss = "Buzz";
        }
        if(fizzbuzz.applyAsInt(input) == 0){
            notfissorbuss = "FizzBuzz";
        }
        return  notfissorbuss;
    }
}