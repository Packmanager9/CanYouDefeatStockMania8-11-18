package ditzler.cole.dicegame.DiceRoller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.Random;
public class DiceActivity extends AppCompatActivity {

    int prospectiveOne =0;
    int wholeOne =0;
    int prospectiveTwo =0;
    int wholeTwo =0;
    int playerOneScore = 0;
    int playerTwoScore = 0;
    int Turns;
    int Turn = 1;
    android.widget.Button button;
    Button Go;
    Button Stay;
    private ImageView ImagePlayerOne;
  private ImageView ImagePlayerTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);
        ImagePlayerOne = (ImageView) findViewById(R.id.imageView);
        ImagePlayerTwo = (ImageView) findViewById(R.id.imageView2);
        ImagePlayerOne.setVisibility(View.INVISIBLE);
Go = (Button) findViewById((R.id.button));
Stay = (Button) findViewById(R.id.button2);
       Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (playerOneScore < 100 && playerTwoScore < 100){
                displayTurn();
                ChangeTurns();
      displayScoreMethod(wholeOne);
      displayScoreTwoMethod(wholeTwo);
}else{
                    displayVictoryMethod();
}





            }
    public int ChangeTurns(){
int roll = new Random().nextInt(6);
   if((Turn%2) ==1){
    if (roll == 0){
        prospectiveOne = 0;
         wholeOne = prospectiveOne + playerOneScore;
        playerOneScore = (wholeOne - prospectiveOne);
  ImagePlayerOne.setVisibility(View.VISIBLE);
    ImagePlayerTwo.setVisibility(View.INVISIBLE);
        Turn = Turn + 1;
    return Turn%2;
    }else{
        prospectiveOne = prospectiveOne + roll;
        wholeOne = prospectiveOne + playerOneScore;

        return Turn%2;
    }
    }else{
    if (roll == 0){
        prospectiveTwo = 0;
        wholeTwo = prospectiveTwo + playerTwoScore;
        playerTwoScore = (wholeTwo - prospectiveTwo);
 ImagePlayerTwo.setVisibility(View.VISIBLE);
    ImagePlayerOne.setVisibility(View.INVISIBLE);
        Turn = Turn + 1;
    return Turn%2;
    }else{
        prospectiveTwo = prospectiveTwo + roll;
        wholeTwo = prospectiveTwo + playerTwoScore;

        return Turn%2;
    }

}
    }
      public void displayScoreMethod(int T) {
                TextView A = (TextView) findViewById(R.id.textView);
                A.setText("" + T);
            }
            public void displayScoreTwoMethod(int T) {
                TextView A = (TextView) findViewById(R.id.textView2);
                A.setText("" + T);
            }

            public void displayTurn() {
            if ((Turn%2) == 1){
            ImagePlayerOne.setVisibility(View.INVISIBLE);
            ImagePlayerTwo.setVisibility(View.VISIBLE);

            }else{
                   ImagePlayerOne.setVisibility(View.VISIBLE);
            ImagePlayerTwo.setVisibility(View.INVISIBLE);
}

            }

        public void displayVictoryMethod() {
                TextView A = (TextView) findViewById(R.id.textView3);
                int Victor = (Turn%2)+1;
                A.setText("Victory to player" + Victor);
            }
    });

       Stay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                   if (playerOneScore < 100 && playerTwoScore < 100){
                displayTurn();
ChangeScores();
             displayScoreMethod(wholeOne);
      displayScoreTwoMethod(wholeTwo);
}else{
                     displayVictoryMethod();

}

            }

             public void displayScoreMethod(int T) {
                TextView A = (TextView) findViewById(R.id.textView);
                A.setText("" + T);
            }
            public void displayScoreTwoMethod(int T) {
                TextView A = (TextView) findViewById(R.id.textView2);
                A.setText("" + T);
            }
            public void displayVictoryMethod() {
                TextView A = (TextView) findViewById(R.id.textView3);
                int Victor = (Turn%2)+1;
                A.setText("Victory to player" + Victor);
            }



        public void ChangeScores(){
         playerOneScore = wholeOne;
            playerTwoScore = wholeTwo;
            Turn = Turn+1;
            }
       public void displayTurn() {
            if ((Turn%2) == 1){
            ImagePlayerOne.setVisibility(View.VISIBLE);
            ImagePlayerTwo.setVisibility(View.INVISIBLE);

            }else{
                   ImagePlayerOne.setVisibility(View.INVISIBLE);
            ImagePlayerTwo.setVisibility(View.VISIBLE);
}

            }
       });
}
}


