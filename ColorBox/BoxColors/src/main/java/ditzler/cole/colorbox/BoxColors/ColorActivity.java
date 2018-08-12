package ditzler.cole.colorbox.BoxColors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;
import android.widget.TextView;
import android.widget.Button;

public class ColorActivity extends AppCompatActivity {
    TextView ColorCircle;
    TextView SmallCircle;
    TextView BigCircle;
          String Bs = "";
          String Cs = "";
          String Ds = "";
          String Es = "";
          String Fs = "";
          Button Ho;
    String PassColor = "%s%s%s%s%s%s";
    String doublepasscolor = "%s";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
Ho = (Button) findViewById(R.id.button);

     Ho.setOnClickListener(new android.view.View.OnClickListener() {
        @Override
           public void onClick(android.view.View v) {
 int A = ColorSettingMethod();
        int B = ColorSettingMethod();
        int C = ColorSettingMethod();
        int D = ColorSettingMethod();
        int E = ColorSettingMethod();
        int F = ColorSettingMethod();

        int A3 = ColorSettingMethod();
        int B3 = ColorSettingMethod();
        int C3 = ColorSettingMethod();
        int D3 = ColorSettingMethod();
        int E3 = ColorSettingMethod();
        int F3 = ColorSettingMethod();

        int A2 = ColorSettingMethod();
        int B2 = ColorSettingMethod();
        int C2 = ColorSettingMethod();
        int D2 = ColorSettingMethod();
        int E2 = ColorSettingMethod();
        int F2 = ColorSettingMethod();

             String color = FinalColorMethod(A, B, C, D, E, F);
        ColorCircle = (TextView) findViewById(R.id.Circle);
        SmallCircle = (TextView) findViewById(R.id.circleSmall);
        BigCircle = (TextView) findViewById(R.id.circleBig);
        ColorCircle.setTextColor(android.graphics.Color.parseColor(FinalColorMethod(A,B,C,D,E,F)));
        SmallCircle.setTextColor(android.graphics.Color.parseColor(FinalColorMethod(F2,E2,D2,C2,B2,A2)));
        BigCircle.setTextColor(android.graphics.Color.parseColor(FinalColorMethod(C3,E3,B3,A3,F3,D3)));

            }

        });





    }
    


    
public int ColorSettingMethod(){
        return new java.util.Random().nextInt(16);
    }

public String FinalColorMethod(int A, int B, int C, int D, int E, int F){
         String As = null;
          String Bs = null;
          String Cs=null;
          String Ds=null;
          String Es=null;
          String Fs=null;
        
        
        
       
       if (A==0){
            As = "0";
            }
            if (A==1){
            As = "1";
            }
            if (A==2){
            As = "2";
            }
            if (A==3){
            As = "3";
            }
            if (A==4){
            As = "4";
}      if (A==5){
            As = "5";
            }
            if (A==6){
            As = "6";
            }
            if (A==7){
            As = "7";
            }
            if (A==8){
            As = "8";
            }
            if (A==9){
            As = "9";
} if (A==10){
            As = "A";
            }
            if (A==11){
            As = "B";
            }
            if (A==12){
            As = "C";
            }
            if (A==13){
            As = "D";
            }
            if (A==14){
            As = "E";
} if (A==15){
            As = "F";
} 



if (B==0){
            Bs = "0";
            }
            if (B==1){
            Bs = "1";
            }
            if (B==2){
            Bs = "2";
            }
            if (B==3){
            Bs = "3";
            }
            if (B==4){
            Bs = "4";
}      if (B==5){
            Bs = "5";
            }
            if (B==6){
            Bs = "6";
            }
            if (B==7){
            Bs = "7";
            }
            if (B==8){
            Bs = "8";
            }
            if (B==9){
            Bs = "9";
} if (B==10){
            Bs = "A";
            }
            if (B==11){
            Bs = "B";
            }
            if (B==12){
            Bs = "C";
            }
            if (B==13){
            Bs = "D";
            }
            if (B==14){
            Bs = "E";
} if (B==15){
            Bs = "F";
}
if (C==0){
            Cs = "0";
            }
            if (C==1){
            Cs = "1";
            }
            if (C==2){
            Cs = "2";
            }
            if (C==3){
            Cs = "3";
            }
            if (C==4){
            Cs = "4";
}      if (C==5){
            Cs = "5";
            }
            if (C==6){
            Cs = "6";
            }
            if (C==7){
            Cs = "7";
            }
            if (C==8){
            Cs = "8";
            }
            if (C==9){
            Cs = "9";
} if (C==10){
            Cs = "C";
            }
            if (C==11){
            Cs = "B";
            }
            if (C==12){
            Cs = "C";
            }
            if (C==13){
            Cs = "D";
            }
            if (C==14){
            Cs = "E";
} if (C==15){
            Cs = "F";
}if (D==0){
            Ds = "0";
            }
            if (D==1){
            Ds = "1";
            }
            if (D==2){
            Ds = "2";
            }
            if (D==3){
            Ds = "3";
            }
            if (D==4){
            Ds = "4";
}      if (D==5){
            Ds = "5";
            }
            if (D==6){
            Ds = "6";
            }
            if (D==7){
            Ds = "7";
            }
            if (D==8){
            Ds = "8";
            }
            if (D==9){
            Ds = "9";
} if (D==10){
            Ds = "D";
            }
            if (D==11){
            Ds = "B";
            }
            if (D==12){
            Ds = "C";
            }
            if (D==13){
            Ds = "D";
            }
            if (D==14){
            Ds = "E";
} if (D==15){
            Ds = "F";
}if (E==0){
            Es = "0";
            }
            if (E==1){
            Es = "1";
            }
            if (E==2){
            Es = "2";
            }
            if (E==3){
            Es = "3";
            }
            if (E==4){
            Es = "4";
}      if (E==5){
            Es = "5";
            }
            if (E==6){
            Es = "6";
            }
            if (E==7){
            Es = "7";
            }
            if (E==8){
            Es = "8";
            }
            if (E==9){
            Es = "9";
} if (E==10){
            Es = "E";
            }
            if (E==11){
            Es = "B";
            }
            if (E==12){
            Es = "C";
            }
            if (E==13){
            Es = "D";
            }
            if (E==14){
            Es = "E";
} if (E==15){
            Es = "F";
}if (F==0){
            Fs = "0";
            }
            if (F==1){
            Fs = "1";
            }
            if (F==2){
            Fs = "2";
            }
            if (F==3){
            Fs = "3";
            }
            if (F==4){
            Fs = "4";
}      if (F==5){
            Fs = "5";
            }
            if (F==6){
            Fs = "6";
            }
            if (F==7){
            Fs = "7";
            }
            if (F==8){
            Fs = "8";
            }
            if (F==9){
            Fs = "9";
} if (F==10){
            Fs = "F";
            }
            if (F==11){
            Fs = "B";
            }
            if (F==12){
            Fs = "C";
            }
            if (F==13){
            Fs = "D";
            }
            if (F==14){
            Fs = "E";
} if (F==15){
            Fs = "F";
}
            
        final String TruePassColor = String.format("#" + PassColor, As, Bs, Cs, Ds, Es ,Fs);
    return TruePassColor;
    }

}
