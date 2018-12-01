package ditzler.cole.myapplication2.feature2;

import android.widget.TextView;

public class ActualGenetics {


/*
    Instead of doing this:

    class Projectile
    {
        float Velocity=100.f;

        void Update(float DeltaTime)
        {
            this.Position +=this.getForwardVector() * Velocity * DeltaTime;
        }
    }

/*
do this:
*//*
    class ProjectileCorrect
    {
        float TerminalVelocity=100.f;
        float Acceleration = 50.f;
        float CurrentVelocity = 0.f;

        void Update(float DeltaTime)
        {
            this.Position +=this.getForwardVector() * TerminalVelocity*TerminalVelocity/Acceleration*(Math::ln(TerminalVelocity/(TerminalVelocity-CurrentVelocity))+Acceleration*DeltaTime/TerminalVelocity+Math::exp(-Math::ln(TerminalVelocity/(TerminalVelocity-CurrentVelocity)) -a*DeltaTime/TerminalVelocity)-1.f);
            CurrentVelocity =TerminalVelocity-TerminalVelocity*Math::exp(-Math::ln(TerminalVelocity/(TerminalVelocity-CurrentVelocity)) -
                Acceleration*DeltaTime/TerminalVelocity);
        }
    }
*/



/*
    public double ReturnsFour(int NotFour){
    int four = 4;
    double StillNotFour = NotFour;
    double SquareRootOfStillNotFour = Math.sqrt(StillNotFour);
    double SquareRootOfSquareRootOfStillNotFour = Math.sqrt(SquareRootOfStillNotFour);
    double MightBeFour = Math.log10(StillNotFour)/Math.log10(SquareRootOfSquareRootOfStillNotFour);
   if(MightBeFour == four){
    return MightBeFour;
   }else {
    return 4;
  }
}
*/







/*

    int GeneticsLength = 201;
    String[] CrazyStrings = new String[GeneticsLength];

    String[0] = "%s";





    generate an array of genes and go through each parent to create crossedover gametes. Fuse gametes, repeat in next generation.
    the crossover can work by generating a random (0-length to to end of array) and check it vs how many steps have been on one side already.
    For instance Randomly chooses a allele to start, the chromosome is of length 10, So after the first stem the roll is Random (0-9) and it is checked against 1,
    It is unlikely to terminate after the first step, then the second step gives Random(0-8) and this is checked against 2. The likelyhood of swapping sides increases as the distance gets shorter
    this would lead to some more chaotic results toward the end of long chromosomes. This can be where the genes in high flux go, the more stable genes go toward the start.
     */

/*
    public void DoesYourHomework(int StarterInt) {

        TextView TextViewOne;
        TextViewOne = (TextView) findViewById(R.id.OnlyTextView);
        double[] Output = new double[9];

        int IntLength = String.valueOf(StarterInt).length();
        int LoopCounter;
        double ModCounter = Math.pow(10, IntLength);

        for (LoopCounter = 0; LoopCounter < (IntLength + 1); LoopCounter++) {

            Output[LoopCounter] = Math.floor(StarterInt / ModCounter);
            ModCounter = ModCounter/10;

        }
        TextViewOne.setText(" " + Output[0] + " " + Output[1] + " " + Output[2] + " " + Output[3] + " " + Output[4] + " " + Output[5] + " " + Output[6] + " " + Output[7] + " " + Output[8]);

    }
*/
}
