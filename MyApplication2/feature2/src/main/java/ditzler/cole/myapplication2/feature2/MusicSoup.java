package ditzler.cole.myapplication2.feature2;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;
import java.util.logging.Level;

public class MusicSoup extends AppCompatActivity {

    private  Integer Ships[] = {R.drawable.rabbitbody};

    private  Integer AttackSprites[] = {R.drawable.energyball, R.drawable.fireball, R.drawable.shield};


    int playerattackcatcher = 50;
    int playerattackcatchertwo = 20;
    int boxticker = 0;
    Button ChangeSongsButton;
    Button Attacks, Defends;
    Button Status;
    int attackmax;
    Button UpgradeArButton;
    Button UpgradeAtButton;
    Button UpgradeHeButton;
    Button UpgradeCrButton, RetireButton;

    protected void onPause() {
        super.onPause();
        ShortPlayer.pause();
    }


    protected void onResume() {
        if ((sound % 2) == 1) {
            super.onResume();
            ShortPlayer.setLooping(true);
            ShortPlayer.start();
        } else {
            super.onResume();
            ShortPlayer.pause();
        }
    }
    int defendcolortintcyclecounter = 0;
    int attackrangeEnemy = 50;
    int attackrangeEnemytwo = 20;
    int attackrangePlayer = 50;
    int attackrangePlayertwo = 20;
    EditText inputBox3;
    EditText inputBox4;
    String STE = "Gagnar: %s";
    String PassColor = "#%s%s%s%s%s%s";
    String STP = "You: %s";
    String Crit = "Crit!";
    String Abbot = "Dead";
    String Costello = "Unconcious";
    String Block = "Block!";
    String Levelstring = "Level %s";


    String DamageRangeStringTest = "Attack range before enemy armor: %s-%s";
    String HealthRangeStringTest = "Health: %s/%s";
    String CritRangeStringTest = "Critical strike chance: %s/100";
    String ArmorRangeStringTest = "Damage reduction from armor: %s";
    String colorBlack = "#000900";
    String colorRed = "#FF0900";


    double Critpercent = 10;
    double HealthEnemy = 2000;
    double HealthEnemyMax = 2000;
    double HealthPlayer = 1000;
    double playerhealthmax = 1000;
    double DamageEnemy = (new Random().nextInt(attackrangeEnemy) + attackrangeEnemytwo);
    double DamagePlayer = (new Random().nextInt(attackrangePlayer) + attackrangePlayertwo);
    double ArmorEnemy = (new Random().nextInt(30) + 10);
    //double ArmorPlayer = (new Random().nextInt(30)+10);
    double ArmorPlayer = 25;
    private TextView PlayerHealthView, OoneView, OtwoView, OthreeView;
    private TextView CritView, EnemyHealthView, Levelcounterview, EnemyActivityIndicatorView, HealthIndicatorView, CritIndicatorView, ArmorIndcatorView, DamageIndicatorView;
    String HitTest = "You hit for %s damage!";
    String CritTest = "You crit for %s damage!";
    String EnemyHitTest = "You took %s damage!";
    String EnemyDefendHitTest = "You defended and took %s damage!";
    double a = 0;
    double b = 0;
    int sound = 1;
    MediaPlayer ShortPlayer;
    int AttackEnemyMax = attackrangeEnemy;
    int AttackEnemyMaxTwo = attackrangeEnemytwo;
    int Ragemodecounter = 0;
    int LevelCounter = 1;
    int statscounter = 0;
ImageView DisplayMech, DisplayPlayerWeapon, DisplayGagnar, DisplayGagnarWeapon;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_music_soup);
        PlayMusicMethod();
        ChangeSongsButton = (Button) findViewById(R.id.ChangeSongButton);
        Status = (Button) findViewById(R.id.Stats);
        UpgradeArButton = (Button) findViewById(R.id.ArmorPlus);
        UpgradeAtButton = (Button) findViewById(R.id.AttackPlus);
        UpgradeHeButton = (Button) findViewById(R.id.HealthPlus);
        UpgradeCrButton = (Button) findViewById(R.id.CritPlus);
        RetireButton = (Button) findViewById(R.id.Retire);
        UpgradeHeButton.setVisibility(View.INVISIBLE);
        UpgradeAtButton.setVisibility(View.INVISIBLE);
        UpgradeArButton.setVisibility(View.INVISIBLE);
        UpgradeCrButton.setVisibility(View.INVISIBLE);
        Attacks = (Button) findViewById(R.id.Attack);
        Defends = (Button) findViewById(R.id.Defend);
        CritView = (TextView) findViewById(R.id.CritIndicator);
        HealthIndicatorView = (TextView) findViewById(R.id.HealthIndicator);
        DamageIndicatorView = (TextView) findViewById(R.id.DamageIndicator);
        CritIndicatorView = (TextView) findViewById(R.id.CritIndicatorstats);
        ArmorIndcatorView = (TextView) findViewById(R.id.ArmorIndicator);

        HealthIndicatorView.setVisibility(View.INVISIBLE);
        DamageIndicatorView.setVisibility(View.INVISIBLE);
        CritIndicatorView.setVisibility(View.INVISIBLE);
        ArmorIndcatorView.setVisibility(View.INVISIBLE);

        Levelcounterview = (TextView) findViewById(R.id.Level);
        EnemyActivityIndicatorView = (TextView) findViewById(R.id.EnemyActivityIndicator);
        PlayerHealthView = (TextView) findViewById(R.id.PlayerHealth);
        EnemyHealthView = (TextView) findViewById(R.id.EnemyHealth);


        ChangeSongsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ragemodecounter = 0;
                boxticker = 0;
                preventzeromethod();
                escapedisplayhealthresetx();
                escapedisplayhealth();
                escapedisplayhealthreseta();
                escapedisplaystats();
attackrangeEnemy = AttackEnemyMax;
attackrangeEnemytwo = AttackEnemyMaxTwo;

                EnemyActivityIndicatorView.setText("");
                CritView.setText("");

                if ((sound % 2) == 1) {
                    sound = sound + 1;
                    if (ShortPlayer.isPlaying()) {
                        ShortPlayer.pause();
                    }
                } else {
                    if (!ShortPlayer.isPlaying()) {
                        sound = sound + 1;
                        ShortPlayer.setLooping(true);
                        ShortPlayer.start();

                    }
                }
            }


        });

        Status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int statsdancer = statscounter % 2;
                if (statsdancer == 0) {
                    HealthIndicatorView.setVisibility(View.VISIBLE);
                    DamageIndicatorView.setVisibility(View.VISIBLE);
                    CritIndicatorView.setVisibility(View.VISIBLE);
                    ArmorIndcatorView.setVisibility(View.VISIBLE);
                } else {
                    HealthIndicatorView.setVisibility(View.INVISIBLE);
                    DamageIndicatorView.setVisibility(View.INVISIBLE);
                    CritIndicatorView.setVisibility(View.INVISIBLE);
                    ArmorIndcatorView.setVisibility(View.INVISIBLE);
                }

                statscounter = statscounter + 1;

                preventzeromethod();
                escapedisplaystats();
            }
        });


        UpgradeHeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                preventzeromethod();

                escapedisplayhealthresetx();
                playerhealthmax = playerhealthmax + 200;


                escapedisplayhealthreset();
            }
        });

        UpgradeAtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preventzeromethod();
                escapedisplayhealthresetforattack();
            }
        });

        UpgradeArButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preventzeromethod();

                escapedisplayhealthresetx();
                ArmorPlayer = ArmorPlayer + 7;


                escapedisplayhealthreset();
            }
        });

        UpgradeCrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                preventzeromethod();

                escapedisplayhealthresetx();
                Critpercent = Critpercent + 10;


                escapedisplayhealthreset();

            }
        });


        RetireButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OpenHareSplitting();

            }
        });


        Attacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (HealthPlayer > (playerhealthmax/2)) {
                    PlayerHealthView.setTextColor(android.graphics.Color.parseColor(colorBlack));
                       }else {
                    PlayerHealthView.setTextColor(android.graphics.Color.parseColor(colorRed));
                }
                int A = ColorSettingMethod();
                int B = ColorSettingMethod();
                int C = ColorSettingMethod();
                int D = ColorSettingMethod();
                int E = ColorSettingMethod();
                int F = ColorSettingMethod();

                int A2 = ColorSettingMethod();
                int B2 = ColorSettingMethod();
                int C2 = ColorSettingMethod();
                int D2 = ColorSettingMethod();
                int E2 = ColorSettingMethod();
                int F2 = ColorSettingMethod();

                int A3 = A^A2;
                int B3 = B^B2;
                int C3 = C^C2;
                int D3 = D^D2;
                int E3 = E^E2;
                int F3 = F^F2;


                String colorsmall = FinalColorMethod(A, B, C, D, E, F);
                String color = FinalColorMethod(A2,B2,C2,D2,E2,F2);
                String colorbig = FinalColorMethod(A3,B3,C3,D3,E3,F3);


                OoneView = (TextView) findViewById(R.id.Oone);
                OtwoView = (TextView) findViewById(R.id.Otwo);
                OthreeView = (TextView) findViewById(R.id.Othree);
                OoneView.setTextColor(android.graphics.Color.parseColor(colorsmall));
                OtwoView.setTextColor(android.graphics.Color.parseColor(color));
                OthreeView.setTextColor(android.graphics.Color.parseColor(colorbig));

                if (HealthPlayer > 0 && HealthEnemy > 0) {
                    if (HealthPlayer < (playerhealthmax / 2)) {
                        boxticker = boxticker + 1;
                        Ragemodecounter = boxticker * 7;


                    }

                    double Crittest = (new Random().nextInt(100));
                    double DamageEnemy = (new Random().nextInt(attackrangeEnemy) + attackrangeEnemytwo);
                    double DamagePlayer = (new Random().nextInt(attackrangePlayer + Ragemodecounter) + attackrangePlayertwo);
                    DisplayAttackSpritesMethod(DamagePlayer);
                    EnemyDamageCalculatorAndDisplayMethod(1);

                    if (HealthPlayer > 0) {
                        if (Crittest <= Critpercent) {

                            double CritDamage = DamagePlayer * 2;
                            HealthEnemy = HealthEnemy - CritDamage;
                            DisplayAttackSpritesMethod(CritDamage);
                            String CritPass = String.format("%.0f", CritDamage);
                            String Critprint = String.format(CritTest, CritPass);
                            CritView.setText(Critprint);

                        } else {
                            if (DamagePlayer > ArmorEnemy) {

                                double truedamage = (DamagePlayer - ArmorEnemy);
                                HealthEnemy = HealthEnemy - (DamagePlayer - ArmorEnemy);
                                String HitPass = String.format("%.0f", truedamage);
                                String Hit = String.format(HitTest, HitPass);
                                CritView.setText(Hit);
                            } else {
                                CritView.setText(Block);
                            }
                        }
                    }


                } else if (HealthEnemy <= 0) {
                    CritView.setText("Gagnar is dead");

                } else if (HealthPlayer <= 0) {

                    CritView.setText("You are unconcious");

                } else {
                    CritView.setText("You are both dead");
                }


                if (HealthEnemy <= 0) {
                    attackrangeEnemy = 1;
                    attackrangeEnemytwo = 0;
                    EnemyHealthView.setText(Abbot);
                    UpgradeHeButton.setVisibility(View.VISIBLE);
                    UpgradeAtButton.setVisibility(View.VISIBLE);
                    UpgradeArButton.setVisibility(View.VISIBLE);
                    UpgradeCrButton.setVisibility(View.VISIBLE);
                }
                if (HealthPlayer <= 0) {
                    attackrangePlayer = 1;
                    attackrangePlayertwo = 0;
                    PlayerHealthView.setText(Costello);
                } else {
                    playerattackcatcher = attackrangePlayer;
                    playerattackcatchertwo = attackrangePlayertwo;
                }







                preventzeromethod();
                escapedisplayhealth();
                escapedisplaystats();

            }


        });


        Defends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (HealthPlayer > (playerhealthmax/2)) {
                    PlayerHealthView.setTextColor(android.graphics.Color.parseColor(colorBlack));
                       }else {
                    PlayerHealthView.setTextColor(android.graphics.Color.parseColor(colorRed));
                }

                int A = ColorSettingMethod();
                int B = ColorSettingMethod();
                int C = ColorSettingMethod();
                int D = ColorSettingMethod();
                int E = ColorSettingMethod();
                int F = ColorSettingMethod();

                int A2 = ColorSettingMethod();
                int B2 = ColorSettingMethod();
                int C2 = ColorSettingMethod();
                int D2 = ColorSettingMethod();
                int E2 = ColorSettingMethod();
                int F2 = ColorSettingMethod();

                int A3 = A^A2;
                int B3 = B^B2;
                int C3 = C^C2;
                int D3 = D^D2;
                int E3 = E^E2;
                int F3 = F^F2;


                String colorsmall = FinalColorMethod(A, B, C, D, E, F);
                String color = FinalColorMethod(A2,B2,C2,D2,E2,F2);
                String colorbig = FinalColorMethod(A3,B3,C3,D3,E3,F3);


                OoneView = (TextView) findViewById(R.id.Oone);
                OtwoView = (TextView) findViewById(R.id.Otwo);
                OthreeView = (TextView) findViewById(R.id.Othree);
                OoneView.setTextColor(android.graphics.Color.parseColor(colorsmall));
                OtwoView.setTextColor(android.graphics.Color.parseColor(color));
                OthreeView.setTextColor(android.graphics.Color.parseColor(colorbig));

                if (HealthPlayer > 0 && HealthEnemy > 0) {
                    if (HealthPlayer < (playerhealthmax / 2)) {
                        boxticker = boxticker + 1;
                        Ragemodecounter = boxticker * 7;


                    }

                    double Crittest = (new Random().nextInt(100));
                    double DamageEnemy = (new Random().nextInt(attackrangeEnemy) + attackrangeEnemytwo);
                    double DamagePlayer = (new Random().nextInt(attackrangePlayer + Ragemodecounter) + attackrangePlayertwo);


                    EnemyDamageCalculatorAndDisplayMethod(2);
                    CritView.setText("Can't attack while defending!");



                } else if (HealthEnemy <= 0) {
                    CritView.setText("Gagnar is dead");

                } else if (HealthPlayer <= 0) {

                    CritView.setText("You are unconcious");

                } else {
                    CritView.setText("You are both dead");
                }


                if (HealthEnemy <= 0) {
                    attackrangeEnemy = 1;
                    attackrangeEnemytwo = 0;
                    EnemyHealthView.setText(Abbot);
                    UpgradeHeButton.setVisibility(View.VISIBLE);
                    UpgradeAtButton.setVisibility(View.VISIBLE);
                    UpgradeArButton.setVisibility(View.VISIBLE);
                    UpgradeCrButton.setVisibility(View.VISIBLE);
                }
                if (HealthPlayer <= 0) {
                    attackrangePlayer = 1;
                    attackrangePlayertwo = 0;
                    PlayerHealthView.setText(Costello);
                } else {
                    playerattackcatcher = attackrangePlayer;
                    playerattackcatchertwo = attackrangePlayertwo;
                }
                DisplayDefendSpritesMethod(ArmorPlayer);
                preventzeromethod();
                escapedisplayhealth();
                escapedisplaystats();

            }


        });
    }

    private void DisplayAttackSpritesMethod(double attackmaximum) {
        DisplayMech = (ImageView) findViewById(R.id.PlayerMech);
        DisplayPlayerWeapon = (ImageView) findViewById(R.id.PlayerWeapon);
        DisplayGagnar = (ImageView) findViewById(R.id.GagnarShip);
        DisplayGagnarWeapon = (ImageView) findViewById(R.id.GagnarWeapon);
        double Attackdimension;

                if (attackmaximum <= 500){
                    Attackdimension = (attackmaximum) / 20;
                }else if (attackmaximum > 500 && attackmaximum <= 1800){
                    Attackdimension = (500/20) + ((attackmaximum-500) / 30);
                }else  if (attackmaximum > 1800 && attackmaximum <= 4000 ){
                    Attackdimension = (500/20) + (1800/30) + ((attackmaximum-1800) / 60);
                }else{
                    Attackdimension =(500/20) + (1800/30) + ((4000) / 60) + ((attackmaximum-4000) / 90);
                }

        Attackdimension = Attackdimension + 10;

                if (Attackdimension > 100){
                    Attackdimension = 100;
                }

                int canIdothis = (int) Attackdimension;

        DisplayMech.setImageResource(Ships[0]);
        DisplayPlayerWeapon.setImageResource(AttackSprites[1]);
        DisplayGagnar.setImageResource(Ships[0]);
        DisplayGagnarWeapon.setImageResource(Ships[0]);

        LinearLayout FightOneLayout = (LinearLayout) findViewById(R.id.FightLayoutWeapon);
        LinearLayout.LayoutParams WrapParam = new LinearLayout.LayoutParams(convertToDp(100), LinearLayout.LayoutParams.WRAP_CONTENT);
          LinearLayout.LayoutParams CenterParam = new LinearLayout.LayoutParams(convertToDp(canIdothis), convertToDp(canIdothis), Gravity.CENTER);
       // FightOneLayout.setLayoutParams(WrapParam);
       //FightOneLayout.setLayoutParams(CenterParam);

        DisplayPlayerWeapon.setLayoutParams(CenterParam);
        DisplayPlayerWeapon.setLayoutParams(WrapParam);
      //  int earscaler = ((convertToDp(attackmaximum))-((convertToDp(attackmaximum))/4));
        DisplayPlayerWeapon.getLayoutParams().height = convertToDp(Attackdimension);
        DisplayPlayerWeapon.getLayoutParams().width = convertToDp(Attackdimension);

        DisplayPlayerWeapon.setColorFilter(Color.argb(64, 255, 255, 2));





    }

    private void DisplayDefendSpritesMethod(double defendmaximum) {
        DisplayMech = (ImageView) findViewById(R.id.PlayerMech);
        DisplayPlayerWeapon = (ImageView) findViewById(R.id.PlayerWeapon);
        DisplayGagnar = (ImageView) findViewById(R.id.GagnarShip);
        DisplayGagnarWeapon = (ImageView) findViewById(R.id.GagnarWeapon);
        double Defenddimension;

                if (defendmaximum <= 210){
                    Defenddimension = (defendmaximum) / 7;
                }else if (defendmaximum > 210 && defendmaximum <= 497){
                    Defenddimension = (210/7) + ((defendmaximum-210) / 21);
                }else  if (defendmaximum > 497 && defendmaximum <= 840 ){
                    Defenddimension = (210/7) + (497/21) + ((defendmaximum-497) / 42);
                }else{
                    Defenddimension = (210/7) + (497/21) + ((840) / 42) + ((defendmaximum-840) / 147);
                }
                 Defenddimension = Defenddimension + 12;

                if (Defenddimension > 100){
                    Defenddimension = 100;
                }

                int canIdothis = (int) Defenddimension;

        DisplayMech.setImageResource(Ships[0]);
        DisplayPlayerWeapon.setImageResource(AttackSprites[2]);
        DisplayGagnar.setImageResource(Ships[0]);
        DisplayGagnarWeapon.setImageResource(Ships[0]);

        LinearLayout FightOneLayout = (LinearLayout) findViewById(R.id.FightLayoutWeapon);
        LinearLayout.LayoutParams WrapParam = new LinearLayout.LayoutParams(convertToDp(100), LinearLayout.LayoutParams.WRAP_CONTENT);
          LinearLayout.LayoutParams CenterParam = new LinearLayout.LayoutParams(convertToDp(canIdothis), convertToDp(canIdothis), Gravity.CENTER);
       // FightOneLayout.setLayoutParams(WrapParam);
       //FightOneLayout.setLayoutParams(CenterParam);

        DisplayPlayerWeapon.setLayoutParams(CenterParam);
        DisplayPlayerWeapon.setLayoutParams(WrapParam);
      //  int earscaler = ((convertToDp(defendmaximum))-((convertToDp(defendmaximum))/4));
        DisplayPlayerWeapon.getLayoutParams().height = convertToDp(Defenddimension);
        DisplayPlayerWeapon.getLayoutParams().width = convertToDp(Defenddimension);




        if (defendcolortintcyclecounter == 0) {
            DisplayPlayerWeapon.setColorFilter(Color.argb(128, 255, 0, 0));
        }else if (defendcolortintcyclecounter == 1){
            DisplayPlayerWeapon.setColorFilter(Color.argb(128, 0, 255, 0));
        }else if (defendcolortintcyclecounter == 2){
            DisplayPlayerWeapon.setColorFilter(Color.argb(128, 0, 0, 255));
        }else if (defendcolortintcyclecounter == 3){
            DisplayPlayerWeapon.setColorFilter(Color.argb(128, 255, 255, 0));
        }else if (defendcolortintcyclecounter == 4){
            DisplayPlayerWeapon.setColorFilter(Color.argb(128, 0, 255, 255));
        }else if (defendcolortintcyclecounter == 5){
            DisplayPlayerWeapon.setColorFilter(Color.argb(128, 255, 0, 255));
        }else if (defendcolortintcyclecounter == 6){
            DisplayPlayerWeapon.setColorFilter(Color.argb(128, 128, 128, 255));
        }else if (defendcolortintcyclecounter == 7){
            DisplayPlayerWeapon.setColorFilter(Color.argb(128, 255, 128, 128));
        }else if (defendcolortintcyclecounter == 8){
            DisplayPlayerWeapon.setColorFilter(Color.argb(128, 200, 255, 255));
        }else {
            DisplayPlayerWeapon.setColorFilter(Color.argb(128, 0, 0, 0));

        }

        defendcolortintcyclecounter = (defendcolortintcyclecounter + 1)%10;



    }

    public void EnemyDamageCalculatorAndDisplayMethod(int modifier) {

        double DamageEnemy = (new Random().nextInt(attackrangeEnemy) + attackrangeEnemytwo);
        if (DamageEnemy > (ArmorPlayer*modifier)) {
            double enemydamagecount = (DamageEnemy - (ArmorPlayer*modifier));
            HealthPlayer = HealthPlayer - enemydamagecount;
            String WhyDoesntThisExistAlready = "You took %s Damage!";
            String EnemyHitPass = String.format("%.0f", enemydamagecount);
            String EnemyHitPrint = String.format(WhyDoesntThisExistAlready, EnemyHitPass);
            EnemyActivityIndicatorView.setText(EnemyHitPrint);
        } else {
            if (modifier == 1) {
                String EnemyHitPass = "0";
                String WhyDoesntThisExistAlready = "You took %s Damage!";
                String EnemyHitPrint = String.format(WhyDoesntThisExistAlready, EnemyHitPass);
                EnemyActivityIndicatorView.setText(EnemyHitPrint);
            }else {

                String EnemyHitPass = "0";
                String EnemyHitPrint = String.format(EnemyDefendHitTest, EnemyHitPass);
                EnemyActivityIndicatorView.setText(EnemyHitPrint);

            }

        }
    }

    public void PlayMusicMethod() {
        ShortPlayer = MediaPlayer.create(this, R.raw.tracktwo);
        ShortPlayer.setLooping(true);
        ShortPlayer.start();
    }


    public void escapedisplayhealth() {
        String GarlitosHealth = String.format(STP, HealthPlayer);
        String GagnarsHealth = String.format(STE, HealthEnemy);
        if (HealthPlayer > (playerhealthmax/2)) {
            PlayerHealthView.setTextColor(android.graphics.Color.parseColor(colorBlack));
               }else {
            PlayerHealthView.setTextColor(android.graphics.Color.parseColor(colorRed));
        }
        PlayerHealthView.setText(GarlitosHealth);
        EnemyHealthView.setText(GagnarsHealth);
    }

    public void escapedisplaystats() {

        if (HealthPlayer <= 0) {
            attackmax = attackrangePlayertwo + attackrangePlayer ;
        }else {
            attackmax = attackrangePlayertwo + attackrangePlayer + Ragemodecounter;
        }
        String AttackDisplayString = String.format(DamageRangeStringTest, attackrangePlayertwo, attackmax);
        DamageIndicatorView.setText(AttackDisplayString);
        String HealthDisplayString = String.format(HealthRangeStringTest, HealthPlayer, playerhealthmax);
        HealthIndicatorView.setText(HealthDisplayString);
        String CritDisplayString = String.format(CritRangeStringTest, Critpercent);
        CritIndicatorView.setText(CritDisplayString);
        String ArmorDisplayString = String.format(ArmorRangeStringTest, ArmorPlayer);
        ArmorIndcatorView.setText(ArmorDisplayString);
    }


    public void escapedisplayhealthresetx() {
        HealthPlayer = playerhealthmax;
        HealthEnemy = HealthEnemyMax;
        escapedisplaystats();
    }

    public void escapedisplayhealthreseta() {

        attackrangePlayer = playerattackcatcher;
        attackrangePlayertwo = (playerattackcatchertwo);
        escapedisplaystats();
    }


    public void preventzeromethod() {
        if (HealthPlayer > (playerhealthmax/2)) {
            PlayerHealthView.setTextColor(android.graphics.Color.parseColor(colorBlack));
               }else {
            PlayerHealthView.setTextColor(android.graphics.Color.parseColor(colorRed));
        }

        if (HealthPlayer <= 0) {
            HealthPlayer = 0;
        }
        if (HealthEnemy <= 0) {
            HealthEnemy = 0;
        }
    }

    public void escapedisplayhealthreset() {
        HealthPlayer = playerhealthmax;
        if (HealthPlayer > (playerhealthmax/2)) {
            PlayerHealthView.setTextColor(android.graphics.Color.parseColor(colorBlack));
               }else {
            PlayerHealthView.setTextColor(android.graphics.Color.parseColor(colorRed));
        }
        escapedisplayhealthreseta();
        UpgradeHeButton.setVisibility(View.INVISIBLE);
        UpgradeAtButton.setVisibility(View.INVISIBLE);
        UpgradeArButton.setVisibility(View.INVISIBLE);
        UpgradeCrButton.setVisibility(View.INVISIBLE);
        ArmorEnemy = ArmorEnemy + ((new Random().nextInt(2) * (new Random().nextInt(10))));
        attackrangeEnemy = AttackEnemyMax;
        attackrangeEnemytwo = AttackEnemyMaxTwo;
        attackrangeEnemy = attackrangeEnemy + ((new Random().nextInt(2) * (new Random().nextInt(10))));
        attackrangeEnemytwo = attackrangeEnemytwo + ((new Random().nextInt(2) * (new Random().nextInt(10))));
        AttackEnemyMax = attackrangeEnemy;
        AttackEnemyMaxTwo = attackrangeEnemytwo;
        Ragemodecounter = 0;
        boxticker = 0;
        HealthEnemyMax = HealthEnemyMax + 250;
        HealthEnemy = HealthEnemyMax;
        LevelCounter = LevelCounter + 1;
        String Levelprintout = String.format(Levelstring, LevelCounter);
        Levelcounterview.setText(Levelprintout);
        escapedisplayhealth();
        escapedisplaystats();
    }


    public void escapedisplayhealthresetforattack() {
        HealthPlayer = playerhealthmax;
        if (HealthPlayer > (playerhealthmax/2)) {
            PlayerHealthView.setTextColor(android.graphics.Color.parseColor(colorBlack));
               }else {
            PlayerHealthView.setTextColor(android.graphics.Color.parseColor(colorRed));
        }
        attackrangePlayer = (playerattackcatcher) + 30;
        playerattackcatcher = attackrangePlayer;
        attackrangePlayertwo = (playerattackcatchertwo + 10);
        playerattackcatchertwo = attackrangePlayertwo;
        UpgradeHeButton.setVisibility(View.INVISIBLE);
        UpgradeAtButton.setVisibility(View.INVISIBLE);
        UpgradeArButton.setVisibility(View.INVISIBLE);
        UpgradeCrButton.setVisibility(View.INVISIBLE);
        ArmorEnemy = ArmorEnemy + ((new Random().nextInt(2) * (new Random().nextInt(10))));
        attackrangeEnemy = AttackEnemyMax;
        attackrangeEnemytwo = AttackEnemyMaxTwo;
        attackrangeEnemy = attackrangeEnemy + ((new Random().nextInt(2) * (new Random().nextInt(10))));
        attackrangeEnemytwo = attackrangeEnemytwo + ((new Random().nextInt(2) * (new Random().nextInt(10))));
        AttackEnemyMax = attackrangeEnemy;
        AttackEnemyMaxTwo = attackrangeEnemytwo;
        Ragemodecounter = 0;
        boxticker = 0;
        HealthEnemyMax = HealthEnemyMax + 250;
        HealthEnemy = HealthEnemyMax;
        LevelCounter = LevelCounter + 1;
        String Levelprintout = String.format(Levelstring, LevelCounter);
        Levelcounterview.setText(Levelprintout);
        escapedisplayhealth();
        escapedisplaystats();
    }

    public int convertToDp(double input) { // Get the screen's density scale
        final float scale = getResources().getDisplayMetrics().density; // Convert the dps to pixels, based on density scale
        return (int) (input * scale + 0.5f);
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

    public void OpenHareSplitting() {
        Intent intent = new Intent(this, HareSplitting.class);
        startActivity(intent);
    }

}