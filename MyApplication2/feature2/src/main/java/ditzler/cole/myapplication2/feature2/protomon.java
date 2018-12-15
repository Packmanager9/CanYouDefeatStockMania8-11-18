package ditzler.cole.myapplication2.feature2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ditzler.cole.myapplication2.feature2.CustomMonsterTopLayer.StringObject;
import com.google.gson.Gson;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Random;

public class protomon extends AppCompatActivity {


    int CollarNumber = 10;

    int MonsterStorageCounter =0;
    int DeployMonsterStorageCounter =0;
    EditText IDbox;

    final double SqrtTwo = Math.sqrt(2);
    final double CbrtTwo = Math.cbrt(2);
    final double FrrtTwo = Math.sqrt(SqrtTwo);

    int AttackerStatDelayTimer = -1;
    int PlayerStatDelayTimer = -1;

    int healblockmagnitudeA;
    int healblocktgimerA;

    int healblockmagnitudeP;
    int healblocktgimerP;

    int IDstorage;

    int statMinimum = 60;

    int playwins = 0;
    int attackwins = 0;

    int elongatedhealwoundtimerA;
    int elongatedhealwoundtimerP;

    int elongatedwoundtimerA;
    int elongatedwoundtimerP;

    int delayedblastpowerA;
    int delayedblastpowerP;

    int delayedblasttimerA;
    int delayedblasttimerP;

    int elongatedhealwoundpowerA;
    int elongatedhealwoundpowerP;
    int elongatedwoundpowerA;
    int elongatedwoundpowerP;

    int slowdrainA;
    int slowdrainP;


    String displaystring = "%s";
    String displaystringH = "%s/%s";

    String CombatString = "";
    String GombatString = "";
    String CombatStringer = "%s";
    String CombatStringed = "%s";

    Button Turn, HealButton, Status, Reset, SwitchButton, NewMonsters, RivalButton, TestButton, TellButton, CountButton, SpecialAttack, CaptureButton, DeployButton, GoToLabButton;

    ImageView PlayerIcon, EnemyIcon, playerbuff1, playerbuff2, playerbuff3, playerbuff4, playerbuff5;

    TextView Pname, Patk, Pheal, Pdef, Pspe, Ename, Eatk, Eheal, Edef, Espe, EHmov, PHmov, PSmov, ESmov, PAmov, EAmov, LongView;

    int spawncap = 82;
    int rotationcap = 83;


    int rivalNewnessCounter = 0;

    int monsterLoop = new Random().nextInt(spawncap)+1;

    int scorekeepera;
    int scorekeeperp;

    int ActionNum;
    int playerid = new Random().nextInt(spawncap)+1;
    int attackerid = 1;

    int elongatedglugpowerP;
    int elongatedglugtimerP;
    int elongatedglugpowerA;
    int elongatedglugtimerA;

    int whosturnisitanyway;

    int elongatedhealpowerP;
    int elongatedhealpowerA;
    int elongatedhealtimerP;
    int elongatedhealtimerA;

    int delayedhealpowerA = 0;
    int delayedhealpowerP = 0;
    int delayedhealtimerP = 0;
    int delayedhealtimerA = 0;

    int grouphealpowerA = 0;
    int grouphealpowerP = 0;
    int grouphealtimerP = 0;
    int grouphealtimerA = 0;


    public double kunkid = 1;
    public double kunkat = 75;
    public double kunksp = 60;
    public double kunkde = 120;
    public double kunkhe = 185;

    public double kohbohid = 2;
    public double kohbohat = 101; //100
    public double kohbohsp = 101; //100
    public double kohbohde = 101; //100
    public double kohbohhe = 101; //100

    public double djoperid = 3;
    public double djoperat = 274;
    public double djopersp = 65;
    public double djoperde = 70;
    public double djoperhe = 80;

    public double schorpid = 4;
    public double schorpat = 65; // 60
    public double schorpsp = 105;
    public double schorpde = 100;
    public double schorphe = 158;

    public double zaumeid = 5;
    public double zaumeat = 94; // 94
    public double zaumesp = 180;
    public double zaumede = 77;
    public double zaumehe = 77;

    public double nhainhaiid = 6;
    public double nhainhaiat = 51;
    public double nhainhaisp = 59;
    public double nhainhaide = 51;
    public double nhainhaihe = 462;

    public double degeissdtid = 7;
    public double degeissdtat = 361;
    public double degeissdtsp = 61;
    public double degeissdtde = 60;
    public double degeissdthe = 76;

    public double yuggleid = 8;
    public double yuggleat = 160; //155
    public double yugglesp = 179;
    public double yugglede = 60;
    public double yugglehe = 66;

    public double bonguid = 9;
    public double bonguat = 60;
    public double bongusp = 64;
    public double bongude = 319;
    public double bonguhe = 60;

 //   public double bonguid = 9;
//    public double bonguat = 60;
 //   public double bongusp = 65;
 //   public double bongude = 422;
//    public double bonguhe = 61;

    public double giterigliaid = 10;
    public double giterigliaat = 111;
    public double giterigliasp = 95;
    public double giterigliade = 106; //101
    public double giterigliahe = 94;

    public double cyosterothid = 11;
    public double cyosterothat = 73; // 70
    public double cyosterothsp = 125;
    public double cyosterothde = 88; // 81 // 87
    public double cyosterothhe = 141;

    public double nentopodeid = 12;
    public double nentopodeat = 70; // 76
    public double nentopodesp = 63;
    public double nentopodede = 160;
    public double nentopodehe = 130;

    public double centiclakid = 13;
    public double centiclakat = 104; // 90
    public double centiclaksp = 111;
    public double centiclakde = 74;
    public double centiclakhe = 135;

    public double uggnawbid = 14;
    public double uggnawbat = 65;
    public double uggnawbsp = 159;
    public double uggnawbde = 60;
    public double uggnawbhe = 160;

    public double grobhostid = 15;
    public double grobhostat = 142;
    public double grobhostsp = 66;
    public double grobhostde = 80;
    public double grobhosthe = 134;

    public double illelonabid = 16;
    public double illelonabat = 154;
    public double illelonabsp = 68;
    public double illelonabde = 73;
    public double illelonabhe = 131;

    public double rongzeedid = 17;
    public double rongzeedat = 95;
    public double rongzeedsp = 63;
    public double rongzeedde = 67; // 75
    public double rongzeedhe = 220;

    public double blattleid = 18;
    public double blattleat = 149;
    public double blattlesp = 67;
    public double blattlede = 109;
    public double blattlehe = 92;
    
    public double swogharnlerid = 19;
    public double swogharnlerat = 113;
    public double swogharnlersp = 69;
    public double swogharnlerde = 113;
    public double swogharnlerhe = 113;

    public double adenolishid = 20;
    public double adenolishat = 123;
    public double adenolishsp = 69;
    public double adenolishde = 146;
    public double adenolishhe = 81;

    public double genaupresangid = 21;
    public double genaupresangat = 101;
    public double genaupresangsp = 71;
    public double genaupresangde = 100;
    public double genaupresanghe = 140;

    public double daahnidaid = 22;
    public double daahnidaat = 60;
    public double daahnidasp = 462;
    public double daahnidade = 52;
    public double daahnidahe = 60;

    public double sorbaid = 23;
    public double sorbaat = 150; // 150
    public double sorbasp = 67;
    public double sorbade = 151; // 151
    public double sorbahe = 66;

    public double jiyouid = 24;
    public double jiyouat = 67;
    public double jiyousp = 66;
    public double jiyoude = 140;  //150
    public double jiyouhe = 141;  //151
    
    public double sparvaeid = 25;
    public double sparvaeat = 162;
    public double sparvaesp = 62;
    public double sparvaede = 110;
    public double sparvaehe = 91;
    
    public double vellupid = 26;
    public double vellupat = 59; // 60
    public double vellupsp = 110;
    public double vellupde = 271;
    public double velluphe = 54;

 //   public double vellupid = 26;
 //   public double vellupat = 60;
 //   public double vellupsp = 62;
 //   public double vellupde = 371;
 //   public double velluphe = 72;

    public double bellajaid = 27;
    public double bellajaat = 52; // 60
    public double bellajasp = 89;
    public double bellajade = 52; //55
    public double bellajahe = 319;

    public double levdzellid = 28;
    public double levdzellat = 61;
    public double levdzellsp = 113;
    public double levdzellde = 214;
    public double levdzellhe = 68;

    public double ryteggid = 29;
    public double ryteggat = 61;
    public double ryteggsp = 112;
    public double ryteggde = 61;
    public double rytegghe = 240;

    public double flashmerid = 30;
    public double flashmerat = 101; // 100
    public double flashmersp = 114;
    public double flashmerde = 84;
    public double flashmerhe = 105;

    public double schmodozerid = 31;
    public double schmodozerat = 139;
    public double schmodozersp = 72;
    public double schmodozerde = 141;
    public double schmodozerhe = 71;

    public double octgototid = 32;
    public double octgototat = 170;
    public double octgototsp = 95;
    public double octgototde = 66;
    public double octgotothe = 94;

    public double triauralid = 33;
    public double triauralat = 97; // 95
    public double triauralsp = 117;
    public double triauralde = 97;// 95
    public double triauralhe = 97;// 95

    public double dicytoid = 34;
    public double dicytoat = 86;
    public double dicytosp = 116;
    public double dicytode = 95;
    public double dicytohe = 116; // 106

    public double monopteryxid = 35;
    public double monopteryxat = 155;
    public double monopteryxsp = 115;
    public double monopteryxde = 75;
    public double monopteryxhe = 75;

    public double elastocarkid = 36;
    public double elastocarkat = 77;
    public double elastocarksp = 90;
    public double elastocarkde = 92;
    public double elastocarkhe = 157;

    public double toobapathid = 37;
    public double toobapathat = 90;
    public double toobapathsp = 94;
    public double toobapathde = 126;
    public double toobapathhe = 94;

    public double weeliosbopid = 38;
    public double weeliosbopat = 83;
    public double weeliosbopsp = 96;
    public double weeliosbopde = 112;
    public double weeliosbophe = 112;

    public double ihmpdrapid = 39;
    public double ihmpdrapat = 104;
    public double ihmpdrapsp = 99;
    public double ihmpdrapde = 68;
    public double ihmpdraphe = 141;

    public double epibazangid = 40;
    public double epibazangat = 134;
    public double epibazangsp = 82;
    public double epibazangde = 123;
    public double epibazanghe = 74;

    public double hemtanid = 41;
    public double hemtanat = 100;
    public double hemtansp = 80;
    public double hemtande = 125;
    public double hemtanhe = 100;

    public double ogoid = 42;
    public double ogoat = 165;
    public double ogosp = 165;
    public double ogode = 61;
    public double ogohe = 61;

    public double strachidid = 43;
    public double strachidat = 58;
    public double strachidsp = 167;
    public double strachidde = 99;
    public double strachidhe = 167;

/*
    public double strachidid = 43;
    public double strachidat = 62;
    public double strachidsp = 167;
    public double strachidde = 99;
    public double strachidhe = 107;

    public double strachidhe = 98;
*/
    public double toximasticaid = 44;
    public double toximasticaat = 71;
    public double toximasticasp = 172;
    public double toximasticade = 109;
    public double toximasticahe = 119;

    public double urcuriaid = 45;
    public double urcuriaat = 60;
    public double urcuriasp = 176;
    public double urcuriade = 104;
    public double urcuriahe = 150;

    public double hyuntressid = 46;
    public double hyuntressat = 77; //75
    public double hyuntresssp = 70;
    public double hyuntressde = 51; // 61
    public double hyuntresshe = 283; // 301

    public double mondosplakid = 47;
    public double mondosplakat = 115;
    public double mondosplaksp = 82;
    public double mondosplakde = 60;
    public double mondosplakhe = 176;

    public double kaheksagugeid = 48;
    public double kaheksagugeat = 80;
    public double kaheksagugesp = 83;
    public double kaheksagugede = 80;
    public double kaheksagugehe = 190;

    public double sapiosuantid = 49;
    public double sapiosuantat = 100;
    public double sapiosuantsp = 101;
    public double sapiosuantde = 70;
    public double sapiosuanthe = 142;
    
    public double munegullid = 50;
    public double munegullat = 130;
    public double munegullsp = 81;
    public double munegullde = 100;
    public double munegullhe = 94;
    
    public double sudakleezid = 51;
    public double sudakleezat = 72;
    public double sudakleezsp = 102;
    public double sudakleezde = 70;
    public double sudakleezhe = 194;
    
    public double halocordateid = 52;
    public double halocordateat = 170;
    public double halocordatesp = 120;
    public double halocordatede = 70;
    public double halocordatehe = 70;

    public double fædendronid = 53;
    public double fædendronat = 95;
    public double fædendronsp = 93;
    public double fædendronde = 60;
    public double fædendronhe = 187;

    public double osteoplangid = 54;
    public double osteoplangat = 84;
    public double osteoplangsp = 86;
    public double osteoplangde = 70;
    public double osteoplanghe = 198;

    public double жrachnidid = 55;
    public double жrachnidat = 211;
    public double жrachnidsp = 73;
    public double жrachnidde = 80;
    public double жrachnidhe = 81;
    
    public double Ϫlitchid = 56;
    public double Ϫlitchat = 135;
    public double Ϫlitchsp = 74;
    public double Ϫlitchde = 135;
    public double Ϫlitchhe = 74;

    public double በid = 57;
    public double በat = 88;
    public double በsp = 75;
    public double በde = 150;
    public double በhe = 101;

    public double mantidileid = 58;
    public double mantidileat = 79;
    public double mantidilesp = 76;
    public double mantidilede = 122;
    public double mantidilehe = 137;

    public double nokoylid = 59;
    public double nokoylat = 82;
    public double nokoylsp = 121;
    public double nokoylde = 70;
    public double nokoylhe = 154; //148

    public double яallodid = 60;
    public double яallodat = 100;
    public double яallodsp = 78;
    public double яallodde = 75;
    public double яallodhe = 166;
    
    public double algaetizerid = 61;
    public double algaetizerat = 98;
    public double algaetizersp = 79;
    public double algaetizerde = 104;
    public double algaetizerhe = 124;
    
    public double kachortid = 62;
    public double kachortat = 97; //102
    public double kachortsp = 77;
    public double kachortde = 67;
    public double kachorthe = 184;
    
    public double slamelionid = 63;
    public double slamelionat = 99;
    public double slamelionsp = 84;
    public double slamelionde = 86;
    public double slamelionhe = 145;

    public double ayatedaid = 64;
    public double ayatedaat = 77;
    public double ayatedasp = 85;
    public double ayatedade = 131;
    public double ayatedahe = 118;

    public double wochemid = 65;
    public double wochemat = 85;
    public double wochemsp = 87;
    public double wochemde = 100;
    public double wochemhe = 135;

    public double Ƕmunid = 66;
    public double Ƕmunat = 92;
    public double Ƕmunsp = 91;
    public double Ƕmunde = 107;
    public double Ƕmunhe = 115;

    public double ψkobathid = 67;
    public double ψkobathat = 94;
    public double ψkobathsp = 88;
    public double ψkobathde = 110;
    public double ψkobathhe = 112;

    public double gytanicid = 68;
    public double gytanicat = 174;
    public double gytanicsp = 97;
    public double gytanicde = 60;
    public double gytaniche = 100;

    public double βeißid = 69;
    public double βeißat = 85;
    public double βeißsp = 119;
    public double βeißde = 67;
    public double βeißhe = 159;

    public double gungholioid = 70;
    public double gungholioat = 253;
    public double gungholiosp = 92;
    public double gungholiode = 56;
    public double gungholiohe = 68;

    public double honigkönigid = 71;
    public double honigkönigat = 89; // 117 // 84
    public double honigkönigsp = 71;  // 57  // 97 // 80
    public double honigkönigde = 201; // 100 // 200
    public double honigkönighe = 74; // 151 // 71

    public double kungulpid = 72;
    public double kungulpat = 348; // 123 // 160
    public double kungulpsp = 77;
    public double kungulpde = 51;
    public double kungulphe = 51;

    /*

    public double σativnellaid = -73;
    public double σativnellaat = 289;
    public double σativnellasp = 62; // 58
    public double σativnellade = 60;
    public double σativnellahe = 53; // 150
    public double kungulpid = 72;
    public double kungulpat = 133; // 123 // 160
    public double kungulpsp = 118;
    public double kungulpde = 77;
    public double kungulphe = 114;
    */

    public double σatinellaid = 73;
    public double σatinellaat = 84;
    public double σatinellasp = 62; // 58
    public double σatinellade = 143;
    public double σatinellahe = 118; // 150

    public double elocurlid = 74;
    public double elocurlat = 86;
    public double elocurlsp = 112;
    public double elocurlde = 99;
    public double elocurlhe = 117;

    public double takobieid = 75;
    public double takobieat = 120; //91
    public double takobiesp = 108; //123
    public double takobiede = 99; //115
    public double takobiehe = 91;  //91

    public double ōbchovyid = 76;
    public double ōbchovyat = 132; //
    public double ōbchovysp = 122; //
    public double ōbchovyde = 60; //
    public double ōbchovyhe = 109;  //

    public double nimnamnomid = 77;
    public double nimnamnomat = 137; // 133
    public double nimnamnomsp = 64; //
    public double nimnamnomde = 99; //
    public double nimnamnomhe = 119;  // 121

    public double tutewtooid = 78;
    public double tutewtooat = 119; //
    public double tutewtoosp = 119; //
    public double tutewtoode = 60; //
    public double tutewtoohe = 119;  //

    public double blanqastid = 79;
    public double blanqastat = 111; //
    public double blanqastsp = 74; //
    public double blanqastde = 111; //
    public double blanqasthe = 111;  //

    public double indeoid = 80;
    public double indeoat = 126; //
    public double indeosp = 126; //
    public double indeode = 51; //
    public double indeohe = 126;  //

    public double deblobbioid = 81;
    public double deblobbioat = 119; //
    public double deblobbiosp = 109; //
    public double deblobbiode = 99; //
    public double deblobbiohe = 89;  //

    public double knightstaceanid = 82;
    public double knightstaceanat = 117; //
    public double knightstaceansp = 107; //
    public double knightstaceande = 117; //
    public double knightstaceanhe = 78;  //

    public double qqqid = 0;
    public double qqqat = 100; //
    public double qqqsp = 100; //
    public double qqqde = 100; //
    public double qqqhe = 100;  //
    
    




    LinearLayout enemylayoutpage;

    int turncounter = 0;

    double Damage;

    double MaxHealthAttacker = 1;
    double MaxHealthPlayer = 1;
    ImageView EnemyDisplay, PlayerDisplay;


    public static class encounter implements Cloneable, Parcelable, Serializable {

        public monst[] EncounterList = new monst[8];

        public encounter (monst EncounteredMonsters0, monst EncounteredMonsters1, monst EncounteredMonsters2,monst EncounteredMonsters3, monst EncounteredMonsters4, monst EncounteredMonsters5, monst EncounteredMonsters6){
            EncounterList[0] = EncounteredMonsters0;
            EncounterList[1] = EncounteredMonsters1;
            EncounterList[2] = EncounteredMonsters2;
            EncounterList[3] = EncounteredMonsters3;
            EncounterList[4] = EncounteredMonsters4;
            EncounterList[5] = EncounteredMonsters5;
            EncounterList[6] = EncounteredMonsters6;
        }

        protected encounter(Parcel in) {
        }

        public static final Creator<encounter> CREATOR = new Creator<encounter>() {
            @Override
            public encounter createFromParcel(Parcel in) {
                return new encounter(in);
            }

            @Override
            public encounter[] newArray(int size) {
                return new encounter[size];
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

        public monst (monst monst){

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

        public static final Creator<monst> CREATOR = new Creator<monst>() {
            @Override
            public monst createFromParcel(Parcel in) {
                return new monst(in);
            }

            @Override
            public monst[] newArray(int size) {
                return new monst[size];
            }
        };

        public monst clone() throws CloneNotSupportedException {
            monst clonedmonster = (monst) super.clone();
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

    monst Kunk = new monst(kunkid, kunksp, kunkat, kunkde, kunkhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Djoper = new monst(djoperid, djopersp, djoperat, djoperde, djoperhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Schorp = new monst(schorpid, schorpsp, schorpat, schorpde, schorphe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Zaume = new monst(zaumeid, zaumesp, zaumeat, zaumede, zaumehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Nhainhai = new monst(nhainhaiid, nhainhaisp, nhainhaiat, nhainhaide, nhainhaihe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Kohboh = new monst(kohbohid, kohbohsp, kohbohat, kohbohde, kohbohhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Degeissdt = new monst(degeissdtid, degeissdtsp, degeissdtat, degeissdtde, degeissdthe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Yuggle = new monst(yuggleid, yugglesp, yuggleat, yugglede, yugglehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Bongu = new monst(bonguid, bongusp, bonguat, bongude, bonguhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Giteriglia = new monst(giterigliaid, giterigliasp, giterigliaat, giterigliade, giterigliahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Cyosteroth = new monst(cyosterothid, cyosterothsp, cyosterothat, cyosterothde, cyosterothhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Nentopode = new monst(nentopodeid, nentopodesp, nentopodeat, nentopodede, nentopodehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Centiclak = new monst(centiclakid, centiclaksp, centiclakat, centiclakde, centiclakhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Uggnawb = new monst(uggnawbid, uggnawbsp, uggnawbat, uggnawbde, uggnawbhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Grobhost = new monst(grobhostid, grobhostsp, grobhostat, grobhostde, grobhosthe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Illelonab = new monst(illelonabid, illelonabsp, illelonabat, illelonabde, illelonabhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Rongzeed = new monst(rongzeedid, rongzeedsp, rongzeedat, rongzeedde, rongzeedhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Blattle = new monst(blattleid, blattlesp, blattleat, blattlede, blattlehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Swogharnler = new monst(swogharnlerid, swogharnlersp, swogharnlerat, swogharnlerde, swogharnlerhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Adenolish = new monst(adenolishid, adenolishsp, adenolishat, adenolishde, adenolishhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Genaupresang = new monst(genaupresangid, genaupresangsp, genaupresangat, genaupresangde, genaupresanghe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
   // monst Daahnida = new monst(daahnidaid, daahnidasp, daahnidaat, daahnidade, daahnidahe, 0,4,0,2);
   monst Daahnida = new monst(daahnidaid, daahnidasp, daahnidaat, daahnidade, daahnidahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Sorba = new monst(sorbaid, sorbasp, sorbaat, sorbade, sorbahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Jiyou = new monst(jiyouid, jiyousp, jiyouat, jiyoude, jiyouhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Sparvae = new monst(sparvaeid, sparvaesp, sparvaeat, sparvaede, sparvaehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Vellup = new monst(vellupid, vellupsp, vellupat, vellupde, velluphe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Bellaja = new monst(bellajaid, bellajasp, bellajaat, bellajade, bellajahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Levdzell = new monst(levdzellid, levdzellsp, levdzellat, levdzellde, levdzellhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Rytegg = new monst(ryteggid, ryteggsp, ryteggat, ryteggde, rytegghe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Flashmer = new monst(flashmerid, flashmersp, flashmerat, flashmerde, flashmerhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Schmodozer = new monst(schmodozerid, schmodozersp, schmodozerat, schmodozerde, schmodozerhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Octgotot = new monst(octgototid, octgototsp, octgototat, octgototde, octgotothe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Triaural = new monst(triauralid, triauralsp, triauralat, triauralde, triauralhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Dicyto = new monst(dicytoid, dicytosp, dicytoat, dicytode, dicytohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Monopteryx = new monst(monopteryxid, monopteryxsp, monopteryxat, monopteryxde, monopteryxhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Elastocark = new monst(elastocarkid, elastocarksp, elastocarkat, elastocarkde, elastocarkhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Toobapath = new monst(toobapathid, toobapathsp, toobapathat, toobapathde, toobapathhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Weeliosbop = new monst(weeliosbopid, weeliosbopsp, weeliosbopat, weeliosbopde, weeliosbophe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Ihmpdrap = new monst(ihmpdrapid, ihmpdrapsp, ihmpdrapat, ihmpdrapde, ihmpdraphe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Epibazang = new monst(epibazangid, epibazangsp, epibazangat, epibazangde, epibazanghe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Hemtan = new monst(hemtanid, hemtansp, hemtanat, hemtande, hemtanhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Ogo = new monst(ogoid, ogosp, ogoat, ogode, ogohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Strachid = new monst(strachidid, strachidsp, strachidat, strachidde, strachidhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Toximastica = new monst(toximasticaid, toximasticasp, toximasticaat, toximasticade, toximasticahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Urcuria = new monst(urcuriaid, urcuriasp, urcuriaat, urcuriade, urcuriahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Hyuntress = new monst(hyuntressid, hyuntresssp, hyuntressat, hyuntressde, hyuntresshe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Mondosplak = new monst(mondosplakid, mondosplaksp, mondosplakat, mondosplakde, mondosplakhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Kaheksaguge = new monst(kaheksagugeid, kaheksagugesp, kaheksagugeat, kaheksagugede, kaheksagugehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Sapiosuant = new monst(sapiosuantid, sapiosuantsp, sapiosuantat, sapiosuantde, sapiosuanthe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Munegull = new monst(munegullid, munegullsp, munegullat, munegullde, munegullhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Sudakleez = new monst(sudakleezid, sudakleezsp, sudakleezat, sudakleezde, sudakleezhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Halocordate = new monst(halocordateid, halocordatesp, halocordateat, halocordatede, halocordatehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Fædendron = new monst(fædendronid, fædendronsp, fædendronat, fædendronde, fædendronhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Osteoplang = new monst(osteoplangid, osteoplangsp, osteoplangat, osteoplangde, osteoplanghe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Жrachnid = new monst(жrachnidid, жrachnidsp, жrachnidat, жrachnidde, жrachnidhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Ϫlitch = new monst(Ϫlitchid, Ϫlitchsp, Ϫlitchat, Ϫlitchde, Ϫlitchhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst በ = new monst(በid, በsp, በat, በde, በhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Mantidile = new monst(mantidileid, mantidilesp, mantidileat, mantidilede, mantidilehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Nokoyl = new monst(nokoylid, nokoylsp, nokoylat, nokoylde, nokoylhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Яallod = new monst(яallodid, яallodsp, яallodat, яallodde, яallodhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Algaetizer = new monst(algaetizerid, algaetizersp, algaetizerat, algaetizerde, algaetizerhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Kachort = new monst(kachortid, kachortsp, kachortat, kachortde, kachorthe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Slamelion = new monst(slamelionid, slamelionsp, slamelionat, slamelionde, slamelionhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Ayateda = new monst(ayatedaid, ayatedasp, ayatedaat, ayatedade, ayatedahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Wochem = new monst(wochemid, wochemsp, wochemat, wochemde, wochemhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Ƕmun = new monst(Ƕmunid, Ƕmunsp, Ƕmunat, Ƕmunde, Ƕmunhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Ψkobath = new monst(ψkobathid, ψkobathsp, ψkobathat, ψkobathde, ψkobathhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Gytanic = new monst(gytanicid, gytanicsp, gytanicat, gytanicde, gytaniche, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst βeiß = new monst(βeißid, βeißsp, βeißat, βeißde, βeißhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Gungholio = new monst(gungholioid, gungholiosp, gungholioat, gungholiode, gungholiohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Honigkönig = new monst(honigkönigid, honigkönigsp, honigkönigat, honigkönigde, honigkönighe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Kungulp = new monst(kungulpid, kungulpsp, kungulpat, kungulpde, kungulphe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Σatinella = new monst(σatinellaid, σatinellasp, σatinellaat, σatinellade, σatinellahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Elocurl = new monst(elocurlid, elocurlsp, elocurlat, elocurlde, elocurlhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Takobie = new monst(takobieid, takobiesp, takobieat, takobiede, takobiehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Ōbchovy = new monst(ōbchovyid, ōbchovysp, ōbchovyat, ōbchovyde, ōbchovyhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Nimnamnom = new monst(nimnamnomid, nimnamnomsp, nimnamnomat, nimnamnomde, nimnamnomhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Tutewtoo = new monst(tutewtooid, tutewtoosp, tutewtooat, tutewtoode, tutewtoohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Blanqast = new monst(blanqastid, blanqastsp, blanqastat, blanqastde, blanqasthe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Indeo = new monst(indeoid, indeosp, indeoat, indeode, indeohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Deblobbio = new monst(deblobbioid, deblobbiosp, deblobbioat, deblobbiode, deblobbiohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Knightstacean = new monst(knightstaceanid, knightstaceansp, knightstaceanat, knightstaceande, knightstaceanhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    monst Custom = new monst(83, 51, 51, 51, 51, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));


    encounter commonfight = new encounter(monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)));
    monst attackermonster;
    monst playermonster;
    monst secondstartingmonster;
    monst error = new monst(0, 51, 51, 51, 753, 0,0,0,0,0);
    public monst[] PlayerMonsterStorage = new monst[9999];







/*
    public class kohbohtemplate implements Cloneable{

        public monst Kohboh = new monst(0, stats(100), stats(100), stats(100), stats(100), 0, 0,0,0);

        public kohbohtemplate (monst kohboh){


        }

    }
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.protomon);
        Patk = findViewById(R.id.playerattack);
        Pname = findViewById(R.id.playername);
        Pdef = findViewById(R.id.playerdefense);
        Pspe = findViewById(R.id.playerspeed);
        Pheal = findViewById(R.id.playerhealth);
        PHmov = findViewById(R.id.playerhemove);
        PSmov = findViewById(R.id.playerspmove);
        PAmov = findViewById(R.id.playeratmove);
        Eatk = findViewById(R.id.enemyattack);
        Ename = findViewById(R.id.enemyname);
        Edef = findViewById(R.id.enemydefense);
        Espe = findViewById(R.id.enemyspeed);
        Eheal = findViewById(R.id.enemyhealth);
        EHmov = findViewById(R.id.enemyhemove);
        ESmov = findViewById(R.id.enemyspmove);
        EAmov = findViewById(R.id.enemyatmove);
        PlayerIcon = findViewById(R.id.playerturn);
        playerbuff1 = findViewById(R.id.playerbuffbox1);
        playerbuff2 = findViewById(R.id.playerbuffbox2);
        playerbuff3 = findViewById(R.id.playerbuffbox3);
        playerbuff4 = findViewById(R.id.playerbuffbox4);
        playerbuff5 = findViewById(R.id.playerbuffbox5);
        PlayerDisplay = findViewById(R.id.PlayerMonsterDisplay);
        EnemyDisplay = findViewById(R.id.EnemyMonsterDisplay);
        EnemyIcon = findViewById(R.id.enemyturn);
        LongView = findViewById(R.id.ScrollerLongText);
        enemylayoutpage = findViewById(R.id.enemylayout);

/*
        playerbuff1.setImageResource(R.drawable.heartplus);
        playerbuff2.setImageResource(R.drawable.heartplus);
        playerbuff3.setImageResource(R.drawable.heartplus);
        playerbuff4.setImageResource(R.drawable.heartplus);
        playerbuff5.setImageResource(R.drawable.heartplus);
*/

        commonfight = new encounter(monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)));

        CapChanger();


        while (playerid == 22 || playerid == 5 || playerid == 14) {
            playerid = new Random().nextInt(spawncap) + 1;
            if (playerid == 22 || playerid == 5 || playerid == 14) {
                playerid = new Random().nextInt(spawncap) + 1;
                if (playerid == 22 || playerid == 5 || playerid == 14) {
                    playerid = new Random().nextInt(spawncap) + 1;
                    if (playerid == 22 || playerid == 5 || playerid == 14) {
                        playerid = new Random().nextInt(spawncap) + 1;
                        if (playerid == 22 || playerid == 5 || playerid == 14) {
                            playerid = new Random().nextInt(spawncap) + 1;
                        }
                    }
                }
            }
        }
       int somecrap = new Random().nextInt(spawncap) + 1;
        while (somecrap == playerid) {
            somecrap = new Random().nextInt(spawncap) + 1;

        }
        attackerid = new Random().nextInt(spawncap)+1;


            try {
                playermonster = Cloner(monstlist(playerid));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }playermonster.UniqueID = UniqueIdentifier(0);
            try {
                attackermonster = Cloner(monstlist(attackerid));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }attackermonster.UniqueID = UniqueIdentifier(0);
            try {
                secondstartingmonster = Cloner(monstlist((int)somecrap));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }secondstartingmonster.UniqueID = UniqueIdentifier(0);



        MonsterImageChangerPlayer(playermonster);

        MonsterImageChangerAttacker(attackermonster);


  /*
        if (new Random().nextInt(2) == 0) {
            try {
                playermonster = Cloner(monstlist((int)playerid));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            try {
                attackermonster = Cloner(monstlist((int)Genaupresang.Idnum));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }else  {
            try {
                playermonster = Cloner(monstlist((int)Genaupresang.Idnum));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            try {
                attackermonster = Cloner(monstlist((int)attackerid));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
*/
        FirstTurnMethod();

        IDbox = (EditText) findViewById(R.id.typehereID);
        Turn = (Button) findViewById(R.id.attack);
        HealButton = (Button) findViewById(R.id.heal);
        SwitchButton = (Button) findViewById(R.id.Switcher);
        NewMonsters = (Button) findViewById(R.id.NewMonstersButton);
        TestButton = (Button) findViewById(R.id.RunIt);
        TellButton = (Button) findViewById(R.id.TellIt);
        CountButton = (Button) findViewById(R.id.Count);
        RivalButton = (Button) findViewById(R.id.RivalSwap);
        Status = (Button) findViewById(R.id.statsbutton);
        Reset = (Button) findViewById(R.id.Resetti);
        SpecialAttack = (Button) findViewById(R.id.Special);
        CaptureButton = (Button) findViewById(R.id.Capture);
        DeployButton = (Button) findViewById(R.id.Deploy);
        GoToLabButton = (Button) findViewById(R.id.LabButton);

        Reset.setVisibility(View.INVISIBLE);
        TestButton.setVisibility(View.INVISIBLE);
        TellButton.setVisibility(View.INVISIBLE);
        NewMonsters.setVisibility(View.INVISIBLE);
        CountButton.setVisibility(View.INVISIBLE);
        SwitchButton.setVisibility(View.INVISIBLE);
        IDbox.setVisibility(View.INVISIBLE);


        RivalRevealer();
        StringDisplayMethod();


        Context ProtomonContext = getApplicationContext();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
        SharedPreferences.Editor editor = prefs.edit();

        Turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if(turncounter == 0) {
                    FirstTurnMethod();
                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){

                        if((turncounter%2) == 0){
                            PlayBrainMethod(Turn);
                        }else {
                            RoboBrainMethod(Turn);
                        }
                    }else {

                        if((turncounter%2) == 0){
                            RoboBrainMethod(Turn);
                        } else {
                            PlayBrainMethod(Turn);
                        }

                    }
                }


                DelayedStatusMethod();


                TurnDamageResolution();

                HealthChecker();




                String WhatHappenedString = TypesOfMotions(1);

                StringDisplayMethod();

/*
                if(turncounter > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    if (whosturnisitanyway == 0) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString +  String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    } else if (whosturnisitanyway == 1) {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString  + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }
                }


                if (!(playermonster.Health > 0 && attackermonster.Health > 0) && ActionNum == 0) {
                    WhatHappenedString = TypesOfMotions(5); ActionNum = 1;
                    if (whosturnisitanyway == 0) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Attacks For " +  String.format(displaystring, (int) Math.round(Damage)) + "\n");

                    } else if (whosturnisitanyway == 1) {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Attacks For "  + String.format(displaystring, (int) Math.round(Damage)) + "\n");

                    }
                    if (playermonster.Health <= 0){
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                    }  if (attackermonster.Health <= 0){
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                    }if (attackermonster.Health <= 0 && playermonster.Health <= 0){
                        CombatString = String.format(CombatString + "A Tie!"+"\n");
                    }
                }
*/


                LongView.setText(CombatString);


                if(playermonster.Health > 0 && attackermonster.Health > 0) {
                    turncounter++;
                    ImageChanger();
                }

                RivalRevealer();
            }


        });

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CombatString = "";
                GombatString = "";

                if ( turncounter == 0){
                    FirstTurnMethod();
                }

                attackermonster.Health = MaxHealthAttacker;
                playermonster.Health = MaxHealthPlayer;

                StringDisplayMethod();

                LongView.setText(CombatString);

                    ActionNum = 0;
                    turncounter = 1;
                TimerCancelMethod();
                    ImageChanger();
                RivalRevealer();
            }


        });

        CaptureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (attackermonster.Health <= 0){
                    elongatedhealwoundpowerA = 0;
                    elongatedwoundpowerA = 0;
                    elongatedhealwoundtimerA = 0;
                    elongatedwoundtimerA = 0;
                    elongatedglugtimerP = 0;
                    elongatedglugpowerP = 0;
                    healblocktgimerP = 0;
                    ClearStatChanges(attackermonster);
                }

             //   ClearStatChanges(playermonster);

                if(turncounter == 0) {
                    FirstTurnMethod();
                    turncounter = 1;
                    ImageChanger();
                }

                if (attackermonster.Health <= 0 && CollarNumber > 0){
                    RivalButton.setVisibility(View.VISIBLE);
                }else {
                    RivalButton.setVisibility(View.INVISIBLE);
                }


                if (attackermonster.Health <= 0 && CollarNumber > 0) {
                    int token = 1;

                    for (int i = 0; i <= MonsterStorageCounter && PlayerMonsterStorage[i] != null; i++) {
                        if (PlayerMonsterStorage[i].UniqueID == attackermonster.UniqueID) {
                            token = 0;
                        }

                   //     if (PlayerMonsterStorage[i].Speed == attackermonster.Speed && PlayerMonsterStorage[i].Defense == attackermonster.Defense && PlayerMonsterStorage[i].Attack == attackermonster.Attack  && PlayerMonsterStorage[i].Moveslotspeed == attackermonster.Moveslotspeed  && PlayerMonsterStorage[i].Moveslotheal == attackermonster.Moveslotheal  && PlayerMonsterStorage[i].Moveslotattack == attackermonster.Moveslotattack){
                    //        token = 0;
                     //   }


                    }

                    if (token == 1) {
                       // attackermonster.Health = MaxHealthAttacker;
                        try {
                            PlayerMonsterStorage[MonsterStorageCounter] = attackermonster.clone();
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }
                        PlayerMonsterStorage[MonsterStorageCounter].Health = MaxHealthAttacker;
                        MonsterStorageCounter++;
                        enemylayoutpage.setVisibility(View.INVISIBLE);
                        CombatString = "";
                        CollarNumber--;
                        CombatString = CombatString + String.format(names(PlayerMonsterStorage[MonsterStorageCounter-1].Idnum) + " Has Been Captured!\n" + "You Have " + String.format(displaystring, CollarNumber) + " Collars Left");

                    }


                }else {

                    if (CollarNumber <= 0 ) {
                        CombatString = CombatString + String.format(names(attackermonster.Idnum) + " Can't Be Captured Without a Collar! \n");
                    }else if (attackermonster.Health > 0){
                        CombatString = CombatString + String.format(names(attackermonster.Idnum) + " Is Too Strong To Capture!\n");
                    }
                }
                LongView.setText(CombatString);
                StringDisplayMethod();
                RivalRevealer();
                CombatString = "";
            }
        });

        GoToLabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                if(CollarNumber <= 0){
                    CollarNumber = CollarNumber + 10;

                }*/

                CollarNumber = 10;


                try {
                    Labratory();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }

            }
        });

        DeployButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                ClearStatChanges(playermonster);
                int somekindofmonsterhealthtracker = 0;
                monst dummy = playermonster;

                if(turncounter == 0) {
                    FirstTurnMethod();
                    turncounter = 1;
                    ImageChanger();
                }

                String bant = IDbox.getText().toString();
                if((!TextUtils.isEmpty(bant)) && PlayerMonsterStorage[(int) Double.parseDouble(String.valueOf(IDbox.getText()))] != null) {
                    if (PlayerMonsterStorage[DeployMonsterStorageCounter].Health > 0) {
                        playermonster = PlayerMonsterStorage[(int) Double.parseDouble(String.valueOf(IDbox.getText()))];
                        DeployMonsterStorageCounter = (int) Double.parseDouble(String.valueOf(IDbox.getText()));
                        try {
                            MaxHealthPlayer = stats(monstlist((int) PlayerMonsterStorage[(int) Double.parseDouble(String.valueOf(IDbox.getText()))].Idnum).clone().Health);
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }

                    }else  {
                   //     CombatString = CombatString + names(playermonster.Idnum) + " is your last hope! \n";
                    }
                }else {// for

                    if (PlayerMonsterStorage[DeployMonsterStorageCounter] != null) {
                    int DeployHolder = DeployMonsterStorageCounter;

                   // for (DeployMonsterStorageCounter = DeployHolder; PlayerMonsterStorage[DeployMonsterStorageCounter%MonsterStorageCounter].Health == 0 && DeployMonsterStorageCounter != (DeployHolder-1);DeployMonsterStorageCounter = (DeployMonsterStorageCounter)%MonsterStorageCounter) {
                  //
                  //  }
                        if (PlayerMonsterStorage[DeployMonsterStorageCounter].Health > 0) {
                            DeployMonsterStorageCounter = (DeployMonsterStorageCounter + 1) % (MonsterStorageCounter);
                            playermonster = PlayerMonsterStorage[DeployMonsterStorageCounter];
                            try {
                                MaxHealthPlayer = stats(monstlist((int) PlayerMonsterStorage[DeployMonsterStorageCounter].Idnum).clone().Health);
                            } catch (CloneNotSupportedException e) {
                                e.printStackTrace();
                            }

                        int loopinhibitor = 0;
                        while(PlayerMonsterStorage[DeployMonsterStorageCounter].Health <= 0 && loopinhibitor <= MonsterStorageCounter){
                            DeployMonsterStorageCounter = (DeployMonsterStorageCounter + 1) % (MonsterStorageCounter);
                            playermonster = PlayerMonsterStorage[DeployMonsterStorageCounter];
                            try {
                                MaxHealthPlayer = stats(monstlist((int) PlayerMonsterStorage[DeployMonsterStorageCounter].Idnum).clone().Health);
                            } catch (CloneNotSupportedException e) {
                                e.printStackTrace();
                            }
                            loopinhibitor++;
                        }


                            //   DeployMonsterStorageCounter++;
                        } else {

                            //        CombatString = CombatString + names(playermonster.Idnum) + " is your last hope! \n";
                        }
                        //DeployMonsterStorageCounter++;
                    } else {
                        if (MonsterStorageCounter > 0) {
                            DeployMonsterStorageCounter = (DeployMonsterStorageCounter + 1) % (MonsterStorageCounter);
                            if (PlayerMonsterStorage[DeployMonsterStorageCounter].Health > 0) {
                                playermonster = PlayerMonsterStorage[DeployMonsterStorageCounter];
                                try {
                                    MaxHealthPlayer = stats(monstlist((int) PlayerMonsterStorage[DeployMonsterStorageCounter].Idnum).clone().Health);
                                } catch (CloneNotSupportedException e) {
                                    e.printStackTrace();
                                }
                                //    DeployMonsterStorageCounter++;
                            }
                        } else {

                            for (int I = 0; playermonster.Health == 0 && I < MonsterStorageCounter; I++) {
                                if (playermonster.Health <= 0) {
                                    DeployMonsterStorageCounter = (DeployMonsterStorageCounter+1) % (MonsterStorageCounter);
                                }

                                if (MonsterStorageCounter > 0 && playermonster.Health <= 0) {
                                    DeployMonsterStorageCounter = DeployMonsterStorageCounter % (MonsterStorageCounter);
                                    if (PlayerMonsterStorage[DeployMonsterStorageCounter].Health > 0) {
                                        playermonster = PlayerMonsterStorage[DeployMonsterStorageCounter];
                                        try {
                                            MaxHealthPlayer = stats(monstlist((int) PlayerMonsterStorage[DeployMonsterStorageCounter].Idnum).clone().Health);
                                        } catch (CloneNotSupportedException e) {
                                            e.printStackTrace();
                                        }
                                        //    DeployMonsterStorageCounter++;
                                    }
                                }
                            }
                        }
                    }

/*

                    if (playermonster.Health > 0) {
                        for (int q = 0; playermonster.Health > 0 && q < MonsterStorageCounter; q++) {
                            DeployMonsterStorageCounter = (DeployMonsterStorageCounter + 1) % (MonsterStorageCounter);
                            playermonster = PlayerMonsterStorage[DeployMonsterStorageCounter];
                            try {
                                MaxHealthPlayer = stats(monstlist((int) PlayerMonsterStorage[DeployMonsterStorageCounter].Idnum).clone().Health);
                            } catch (CloneNotSupportedException e) {
                                e.printStackTrace();
                            }

                        }
                    }else {
                        for (int q = 0; playermonster.Health <= 0 && q < MonsterStorageCounter; q++) {
                            DeployMonsterStorageCounter = (DeployMonsterStorageCounter + 1) % (MonsterStorageCounter);
                            playermonster = PlayerMonsterStorage[DeployMonsterStorageCounter];
                            try {
                                MaxHealthPlayer = stats(monstlist((int) PlayerMonsterStorage[DeployMonsterStorageCounter].Idnum).clone().Health);
                            } catch (CloneNotSupportedException e) {
                                e.printStackTrace();
                            }

                        }
                    }


                    int DeployHolder = DeployMonsterStorageCounter;
                    for (int i = 0; i < MonsterStorageCounter; i++ ) {
                        if (PlayerMonsterStorage[DeployMonsterStorageCounter].Health <= 0) {
                            DeployMonsterStorageCounter = (DeployMonsterStorageCounter + 1) % (MonsterStorageCounter);
                        }
                      //  DeployMonsterStorageCounter++;
                    }*/
                   // DeployMonsterStorageCounter = (DeployMonsterStorageCounter + 1) % (MonsterStorageCounter);



                    int stopper = 0;

                    while(PlayerMonsterStorage[DeployMonsterStorageCounter].Health <= 0 && stopper < MonsterStorageCounter){
                        DeployMonsterStorageCounter = (DeployMonsterStorageCounter + 1) % (MonsterStorageCounter);
                        playermonster = PlayerMonsterStorage[DeployMonsterStorageCounter];
                        try {
                            MaxHealthPlayer = stats(monstlist((int) PlayerMonsterStorage[DeployMonsterStorageCounter].Idnum).clone().Health);
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }
                        stopper++;
                    }


                    // this should really be a loop but it wont behave

                }
           // }


                if (dummy != playermonster) {
                    CombatString = CombatString + names(playermonster.Idnum) + " is now Deployed! \n";
                    if (playermonster != dummy){
                        ResetWounds();
                    }
                }

                int DeploymentStorage = DeployMonsterStorageCounter;

                for (DeployMonsterStorageCounter = 0; DeployMonsterStorageCounter <= MonsterStorageCounter; DeployMonsterStorageCounter++){

                    if (PlayerMonsterStorage[DeployMonsterStorageCounter] != null) {
                        if (PlayerMonsterStorage[DeployMonsterStorageCounter].Health > 0) {
                            somekindofmonsterhealthtracker++;
                        }
                    }
                }

                DeployMonsterStorageCounter = DeploymentStorage;
                if (somekindofmonsterhealthtracker == 0 && MonsterStorageCounter > 0){
                    CombatString = CombatString + " All of your monsters are too injured to fight \n";

                }else if(somekindofmonsterhealthtracker == 1 && dummy != playermonster){
                    CombatString = CombatString + names(playermonster.Idnum) + " is your last hope! \n";
                }

                LongView.setText(CombatString);
                StringDisplayMethod();


              if (playermonster.Speed <= attackermonster.Speed) {
                  turncounter = 1;
              }else {
                  turncounter = 2;
              }

                ImageChanger();

                playerid = (int)playermonster.Idnum;
                RivalRevealer();


                MonsterImageChangerPlayer(playermonster);

            }
            
            
        });

        NewMonsters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CombatString = "";
                GombatString = "";


                playerid = new Random().nextInt(spawncap)+1;
                attackerid = new Random().nextInt(spawncap)+1;

                if (new Random().nextInt(2) == 0) {
                    try {
                        playermonster = Cloner(monstlist((int)playerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    try {
                        attackermonster = Cloner(monstlist((int)attackerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }attackermonster.UniqueID = UniqueIdentifier(0);
                }else  {
                    try {
                        playermonster = Cloner(monstlist((int)playerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    try {
                        attackermonster = Cloner(monstlist((int)attackerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }attackermonster.UniqueID = UniqueIdentifier(0);
                }
                MaxHealthAttacker = attackermonster.Health;
                MaxHealthPlayer = playermonster.Health;

                attackermonster.Health = MaxHealthAttacker;
                playermonster.Health = MaxHealthPlayer;

                StringDisplayMethod();

                LongView.setText(CombatString);

                    ActionNum = 0;
                    turncounter = 1;
                    ImageChanger();
                RivalRevealer();
            }


        });
        SwitchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CombatString = "";
                GombatString = "";

                String bant = IDbox.getText().toString();
                if(!TextUtils.isEmpty(bant)) {
                    playerid = (int) Double.parseDouble(String.valueOf(IDbox.getText()));
                }else {
                    //playerid = 0;
                    playerid =  (playerid%spawncap)+1;

                }


             //
             //   attackerid = new Random().nextInt(spawncap)+1;

                    try {
                        playermonster = Cloner(monstlist((int)playerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }


                MaxHealthPlayer = playermonster.Health;

                attackermonster.Health = MaxHealthAttacker;
                playermonster.Health = MaxHealthPlayer;

                StringDisplayMethod();

                LongView.setText(CombatString);

                    ActionNum = 0;
                  //  turncounter = 1;
                    ImageChanger();
                RivalRevealer();
            }


        });
        RivalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rivalNewnessCounter++;

                if (rivalNewnessCounter < 4){

                enemylayoutpage.setVisibility(View.VISIBLE);
                // CombatString = "";
                String bant = IDbox.getText().toString();
             //   if(!TextUtils.isEmpty(bant)) {
             //  attackerid = (int) Double.parseDouble(String.valueOf(IDbox.getText()));
              //  }else {
                    // attackerid = 0;
                    attackerid = new Random().nextInt(spawncap)+1;
                    //  }

               // attackerid =  (attackerid%spawncap)+1;


                    try {
                        attackermonster = Cloner(monstlist((int)attackerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    attackermonster.UniqueID = UniqueIdentifier(0);

                MaxHealthAttacker = attackermonster.Health;

                attackermonster.Health = MaxHealthAttacker;


                }else {
                    monsterLoop = (monsterLoop%spawncap)+1;
                    attackerid = monsterLoop;
                    try {
                        attackermonster = Cloner(monstlist((int)attackerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    attackermonster.UniqueID = UniqueIdentifier(0);
                    MaxHealthAttacker = attackermonster.Health;

                    attackermonster.Health = MaxHealthAttacker;
                    rivalNewnessCounter = 0;
                    enemylayoutpage.setVisibility(View.VISIBLE);
                }
               // playermonster.Health = MaxHealthPlayer;

                StringDisplayMethod();
                LongView.setText(CombatString);

                    ActionNum = 0;
                    turncounter = 1;
                    ImageChanger();
                RivalRevealer();
            }


        });
        TestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // CombatString = "";
                String displaystring = "%s";
                String displaystringH = "%s/%s";
                int runtoonehundred =0;

                IDstorage = playerid;


                for (playerid = 1; playerid < rotationcap; playerid++) {
                    for (runtoonehundred = 0; runtoonehundred < 1000; runtoonehundred++) {

                        for (int dummy = -1; (playermonster.Health > 0 && attackermonster.Health > 0); turncounter++) {


                            if (playermonster.Speed <= attackermonster.Speed) {

                                if ((turncounter % 2) == 0) {
                                    whosturnisitanyway = 1;
                                    Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    attackermonster.Health = attackermonster.Health - Damage;
                                } else {
                                    whosturnisitanyway = 0;
                                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    playermonster.Health = playermonster.Health - Damage;
                                }
                            } else {

                                if ((turncounter % 2) == 0) {
                                    whosturnisitanyway = 0;
                                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    playermonster.Health = playermonster.Health - Damage;
                                } else {
                                    whosturnisitanyway = 1;
                                    Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    attackermonster.Health = attackermonster.Health - Damage;
                                }

                            }

                            if (playermonster.Health <= 0) {
                                attackwins++;
                            }


                            if (attackermonster.Health <= 0) {
                                playwins++;
                            }


                        }
                        try {
                            refresh();
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }
                        turncounter = 1;




                    }

                    try {
                        playermonster = Cloner(monstlist((int) playerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    try {
                        refresh();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }

                    if (playwins > attackwins){
                        scorekeeperp++;
                    }
                    if (playwins < attackwins){
                        scorekeepera++;
                    }

                    attackwins = 0;
                    playwins = 0;
                }


                //    CombatString = String.format( names(playermonster.Idnum) + " " + String.format(displaystring, playwins) + " " + names(attackermonster.Idnum) + " " +String.format(displaystring, attackwins));

                    CombatString = CombatString + String.format( "Everyone else" + " " + String.format(displaystring, scorekeeperp) + " " + names(attackermonster.Idnum) + " " +String.format(displaystring, scorekeepera) + "\n") ;



                LongView.setText(CombatString);

                    ActionNum = 0;
                    turncounter = 1;
                    attackwins = 0;
                    playwins = 0;
                    scorekeeperp = 0;
                    scorekeepera = 0;
                playerid = IDstorage;
                try {
                    playermonster = Cloner(monstlist((int) playerid));
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                try {
                    refresh();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                ImageChanger();

                MaxHealthAttacker = attackermonster.Health;
                MaxHealthPlayer = playermonster.Health;

                attackermonster.Health = MaxHealthAttacker;
                playermonster.Health = MaxHealthPlayer;

                StringDisplayMethod();

                RivalRevealer();

            }

            public int damagecalculationloop(int targetdefence, int attackerstrength){

                double ratio = (targetdefence/attackerstrength);
                double damage = (ratio*(new Random().nextInt(11)+55));
                return (int) damage;
            }

            public void refresh() throws CloneNotSupportedException {
                attackermonster.Health = Cloner(monstlist((int) attackerid)).Health;
                playermonster.Health = Cloner(monstlist((int) playerid)).Health;
            }

        });
        CountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // CombatString = "";
                String displaystring = "%s";
                String displaystringH = "%s/%s";
                int runtoonehundred =0;



                    for (runtoonehundred = 0; runtoonehundred < 100000; runtoonehundred++) {

                        for (int dummy = -1; (playermonster.Health > 0 && attackermonster.Health > 0); turncounter++) {


                            if (playermonster.Speed <= attackermonster.Speed) {

                                if ((turncounter % 2) == 0) {
                                    whosturnisitanyway = 1;
                                    Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    attackermonster.Health = attackermonster.Health - Damage;
                                } else {
                                    whosturnisitanyway = 0;
                                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    playermonster.Health = playermonster.Health - Damage;
                                }
                            } else {

                                if ((turncounter % 2) == 0) {
                                    whosturnisitanyway = 0;
                                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    playermonster.Health = playermonster.Health - Damage;
                                } else {
                                    whosturnisitanyway = 1;
                                    Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    attackermonster.Health = attackermonster.Health - Damage;
                                }

                            }

                            if (playermonster.Health <= 0) {
                                attackwins++;
                            }


                            if (attackermonster.Health <= 0) {
                                playwins++;
                            }


                        }
                        refresh();
                        turncounter = 1;




                    }



                    CombatString = String.format( names(playermonster.Idnum) + " " + String.format(displaystring, playwins) + " " + names(attackermonster.Idnum) + " " +String.format(displaystring, attackwins));

                 //   CombatString = CombatString + String.format( "Everyone else" + " " + String.format(displaystring, scorekeeperp) + " " + names(attackermonster.Idnum) + " " +String.format(displaystring, scorekeepera) + "\n") ;



                LongView.setText(CombatString);

                    ActionNum = 0;
                    turncounter = 1;
                    attackwins = 0;
                    playwins = 0;
                    scorekeeperp = 0;
                    scorekeepera = 0;
                    ImageChanger();
                RivalRevealer();
            }

            public int damagecalculationloop(int targetdefence, int attackerstrength){

                double ratio = (targetdefence/attackerstrength);
                double damage = (ratio*(new Random().nextInt(11)+55));
                return (int) damage;
            }

            public void refresh(){
                attackermonster.Health = MaxHealthAttacker;
                playermonster.Health = MaxHealthPlayer;
            }

        });
        TellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CombatString = "";
                GombatString = "";
                String displaystring = "%s";
                String displaystringH = "%s/%s";
                int runtoonehundred = 0;
                IDstorage = playerid;
                int AIDstorage = attackerid;

            for (attackerid = 1; attackerid < rotationcap; attackerid++){

                try {
                    attackermonster = Cloner(monstlist((int) attackerid));
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }attackermonster.UniqueID = UniqueIdentifier(0);
                try {
                    refresh();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
               /* */
                for (playerid = 1; playerid < rotationcap; playerid++) {

                    try {
                        playermonster = Cloner(monstlist((int) playerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    try {
                        refresh();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }


                    for (runtoonehundred = 0; runtoonehundred < 10; runtoonehundred++) {

                        for (int dummy = -1; (playermonster.Health > 0 && attackermonster.Health > 0); turncounter++) {


                            if (playermonster.Speed <= attackermonster.Speed) {

                                if ((turncounter % 2) == 0) {
                                    whosturnisitanyway = 1;
                                    Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    attackermonster.Health = attackermonster.Health - Damage;
                                } else {
                                    whosturnisitanyway = 0;
                                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    playermonster.Health = playermonster.Health - Damage;
                                }
                            } else {
                                if ((turncounter % 2) == 0) {
                                    whosturnisitanyway = 0;
                                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    playermonster.Health = playermonster.Health - Damage;
                                } else {
                                    whosturnisitanyway = 1;
                                    Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    attackermonster.Health = attackermonster.Health - Damage;
                                }
                            }
                            if (playermonster.Health <= 0) {
                                attackwins++;
                            }
                            if (attackermonster.Health <= 0) {
                                playwins++;
                            }
                        }
                        try {
                            refresh();
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }
                        turncounter = 1;
                    }
                    if (playwins > attackwins) {
                        scorekeeperp++;
                    }
                    if (playwins < attackwins) {
                        scorekeepera++;
                    }
                   // GombatString = (GombatString + names(playerid) + " " + String.format(displaystring, attackwins)+ "W/" + String.format(displaystring, playwins)+"L" + "\n");
                    attackwins = 0;
                    playwins = 0;
                }


                //    CombatString = String.format( names(playermonster.Idnum) + " " + String.format(displaystring, playwins) + " " + names(attackermonster.Idnum) + " " +String.format(displaystring, attackwins));

                CombatString = CombatString + String.format("Everyone else" + " " + String.format(displaystring, scorekeeperp) + " " + names(attackermonster.Idnum) + " " + String.format(displaystring, scorekeepera) + "\n");


                ActionNum = 0;
                turncounter = 1;
                attackwins = 0;
                playwins = 0;
                scorekeeperp = 0;
                scorekeepera = 0;
            }

                playerid = IDstorage;
                attackerid = AIDstorage;
                LongView.setText(CombatString + GombatString);

                CombatString = "";

                try {
                    playermonster = Cloner(monstlist((int) playerid));
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                try {
                    attackermonster = Cloner(monstlist((int) attackerid));
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }attackermonster.UniqueID = UniqueIdentifier(0);
                try {
                    refresh();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                ImageChanger();

                MaxHealthAttacker = attackermonster.Health;
                MaxHealthPlayer = playermonster.Health;

                attackermonster.Health = MaxHealthAttacker;
                playermonster.Health = MaxHealthPlayer;

                StringDisplayMethod();
                RivalRevealer();
            }







            public int damagecalculationloop(int targetdefence, int attackerstrength){

                double ratio = (targetdefence/attackerstrength);
                double damage = (ratio*(new Random().nextInt(11)+55));
                return (int) damage;
            }

            public void refresh() throws CloneNotSupportedException {
                attackermonster.Health = Cloner(monstlist((int) attackerid)).Health;
                playermonster.Health = Cloner(monstlist((int) playerid)).Health;
                MaxHealthAttacker = attackermonster.Health;
                MaxHealthPlayer = playermonster.Health;

                attackermonster.Health = MaxHealthAttacker;
                playermonster.Health = MaxHealthPlayer;
            }

        });

/*
        TellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CombatString = "";
                GombatString = "";
                String displaystring = "%s";
                String displaystringH = "%s/%s";
                int runtoonehundred =0;



                for (playerid = 1; playerid < 50; playerid++) {
                    try {
                        playermonster = Cloner(monstlist((int) playerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    try {
                        refresh();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    for (runtoonehundred = 0; runtoonehundred < 1000; runtoonehundred++) {

                        for (int dummy = -1; (playermonster.Health > 0 && attackermonster.Health > 0); turncounter++) {


                            if (playermonster.Speed <= attackermonster.Speed) {

                                if ((turncounter % 2) == 0) {
                                    whosturnisitanyway = 1;
                                    Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                    attackermonster.Health = attackermonster.Health - Damage;
                                } else {
                                    whosturnisitanyway = 0;
                                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
                                    playermonster.Health = playermonster.Health - Damage;
                                }
                            } else {

                                if ((turncounter % 2) == 0) {
                                    whosturnisitanyway = 0;
                                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
                                    playermonster.Health = playermonster.Health - Damage;
                                } else {
                                    whosturnisitanyway = 1;
                                    Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                    attackermonster.Health = attackermonster.Health - Damage;
                                }

                            }

                            if (playermonster.Health <= 0) {
                                attackwins++;
                            }


                            if (attackermonster.Health <= 0) {
                                playwins++;
                            }


                        }
                        try {
                            refresh();
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }
                        turncounter = 1;




                    }


                    if (playwins > attackwins){
                        scorekeeperp++;
                    }
                    if (playwins < attackwins){
                        scorekeepera++;
                        GombatString = (GombatString + names(playerid) + "\n");
                    }

                    attackwins = 0;
                    playwins = 0;
                }


                //    CombatString = String.format( names(playermonster.Idnum) + " " + String.format(displaystring, playwins) + " " + names(attackermonster.Idnum) + " " +String.format(displaystring, attackwins));

                    CombatString = CombatString + String.format( "Everyone else" + " " + String.format(displaystring, scorekeeperp) + " " + names(attackermonster.Idnum) + " " +String.format(displaystring, scorekeepera) + "\n") ;



                LongView.setText(CombatString + GombatString);

                    ActionNum = 0;
                    turncounter = 1;
                    attackwins = 0;
                    playwins = 0;
                    scorekeeperp = 0;
                    scorekeepera = 0;
                    ImageChanger();
            }

            public int damagecalculationloop(int targetdefence, int attackerstrength){

                double ratio = (targetdefence/attackerstrength);
                double damage = (ratio*(new Random().nextInt(11)+55));
                return (int) damage;
            }

            public void refresh() throws CloneNotSupportedException {
                attackermonster = Cloner(monstlist((int) attackerid));
                playermonster = Cloner(monstlist((int) playerid));
            }

        });
*/

        Status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if(turncounter == 0) {
                    FirstTurnMethod();
                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){

                        if((turncounter%2) == 0){
                            PlayBrainMethod(Status);
                        }else {
                            RoboBrainMethod(Status);
                        }
                    }else {
                        if((turncounter%2) == 0){
                            RoboBrainMethod(Status);
                        }else {
                            PlayBrainMethod(Status);
                        }

                    }
                }

                DelayedStatusMethod();


                TurnDamageResolution();

               HealthChecker();


                String WhatHappenedString = TypesOfMotions(3);
/*
                if(turncounter > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    if (whosturnisitanyway == 0) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Performs " + StatsMoveNames(attackermonster.Moveslotspeed) + "\n");

                        // CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                    } else if (whosturnisitanyway == 1) {

                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs " + StatsMoveNames(playermonster.Moveslotspeed) + "\n");

                        //  CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                    }
                }
*/
                DeathTest();
                StringDisplayMethod();
                LongView.setText(CombatString);


                if(playermonster.Health > 0 && attackermonster.Health > 0) {
                    turncounter++;
                    ImageChanger();
                }
                RivalRevealer();
            }
        });


        HealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(turncounter == 0) {
                    FirstTurnMethod();

                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){
                        if((turncounter%2) == 0){
                            PlayBrainMethod(HealButton);
                        }else {
                            RoboBrainMethod(HealButton);
                        }
                    }else {
                        if((turncounter%2) == 0){
                            RoboBrainMethod(HealButton);
                        } else {
                            PlayBrainMethod(HealButton);
                        }

                    }
                }


                DelayedStatusMethod();


                TurnDamageResolution();

                HealthChecker();


                String WhatHappenedString = TypesOfMotions(2);
                String displaystring = "%s";
                String displaystringH = "%s/%s";
/*
                if(turncounter > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    if (whosturnisitanyway == 0) {

                        if  (attackermonster.Moveslotheal == 0)  {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Heals " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                        }else if (attackermonster.Moveslotheal == 1) {
                            if (delayedhealpowerA > 0) {
                                CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Prepares Two Turn Delayed Healing of " + String.format(displaystring, (int) Math.round(delayedhealpowerA)) + "\n");
                            }else {
                                CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Fails To Prepare Two Turn Delayed Healing " + "\n");
                            }
                        }else if (attackermonster.Moveslotheal == 2) {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Begins " +  String.format(displaystring, elongatedhealtimerA) + " Turn Regeneration of " + String.format(displaystring, (int) Math.round(elongatedhealpowerA)) + "\n");
                        }else if (attackermonster.Moveslotheal == 3) {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + names(playermonster.Idnum) + "\n");
                        }else if  (attackermonster.Moveslotheal == 4) {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Performs Cleansing Heal " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                        }else if  (attackermonster.Moveslotheal == 5)  {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Begins " +  String.format(displaystring, grouphealtimerA) + " Turn Group Regeneration of " + String.format(displaystring, (int) Math.round(grouphealpowerA)) + "\n");
                        }else {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                        }
                    } else if (whosturnisitanyway == 1) {
                        if  (playermonster.Moveslotheal == 0)  {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Heals " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                        } else if (playermonster.Moveslotheal == 1) {
                            if (delayedhealpowerP > 0) {
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Prepares Two Turn Delayed Healing of " + String.format(displaystring, (int) Math.round(delayedhealpowerP)) + "\n");
                            }else {
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Fails To Prepare Two Turn Delayed Healing " + "\n");
                            }
                        }else if (playermonster.Moveslotheal == 2) {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " +  String.format(displaystring, elongatedhealtimerP) + " Turn Regeneration of " + String.format(displaystring, (int) Math.round(elongatedhealpowerP)) + "\n");
                        }else if (playermonster.Moveslotheal == 3) {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + names(attackermonster.Idnum) + "\n");
                        }else if  (playermonster.Moveslotheal == 4)  {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs Cleansing Heal " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                        }else if  (playermonster.Moveslotheal == 5)  {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " +  String.format(displaystring, grouphealtimerP) + " Turn Group Regeneration of " + String.format(displaystring, (int) Math.round(grouphealpowerP)) + "\n");
                        }else {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                        }

                    }
                }
*/
                DeathTest();

                StringDisplayMethod();

                LongView.setText(CombatString);


                if(playermonster.Health > 0 && attackermonster.Health > 0) {
                    turncounter++;
                    ImageChanger();
                }
                RivalRevealer();
            }
        });




        SpecialAttack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(turncounter == 0) {
                    FirstTurnMethod();
                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){
                        if((turncounter%2) == 0){
                            PlayBrainMethod(SpecialAttack);
                        }else {
                            RoboBrainMethod(SpecialAttack);
                        }
                    }else {
                        if((turncounter%2) == 0){
                            RoboBrainMethod(SpecialAttack);
                        } else {
                            PlayBrainMethod(SpecialAttack);
                        }

                    }
                }



                DelayedStatusMethod();


                TurnDamageResolution();

                HealthChecker();


                String WhatHappenedString = TypesOfMotions(2);
                String displaystring = "%s";
                String displaystringH = "%s/%s";
/*
                if(turncounter > 0 && ((playermonster.Health > 0 && attackermonster.Health > 0)|| ActionNum != 1)) {
                    if (whosturnisitanyway == 0) {


                        switch(attackermonster.Moveslotattack) {

                            case 0:
                                CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Wounds For a " + String.format(displaystring, elongatedwoundtimerP)+ " Turn Bleed of " + String.format(displaystring, (int) Math.round(elongatedwoundpowerP)) + "\n");
                                break;
                            case 1:
                                if (delayedblastpowerA > 0) {
                                    CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Prepares Delayed Blast of " + String.format(displaystring, (int) Math.round(delayedblastpowerA)) + "\n");
                                } else {
                                    CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Fails To Prepare Delayed Blast " + "\n");
                                }
                                break;
                            case 2:
                                CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, elongatedhealwoundtimerP) + " Turn Grevious Wounds of " + String.format(displaystring, (int) Math.round(elongatedhealwoundpowerP)) + "\n");
                                break;
                            case 3:
                                CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, elongatedglugtimerA) +  " Turn Slow Drain of " + String.format(displaystring, (int) Math.round(elongatedglugpowerA)) + " From " + names(playermonster.Idnum) + "\n");
                                break;
                            case 4:
                                CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, healblocktgimerA) +  " Turn Heal Block " + "\n");
                                break;
                            case 5:
                                CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Chips Defense for "  + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                                break;
                            case 6:
                                CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Trips for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                                break;
                            case 7:
                                CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Disciplines for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                                break;
                        }
                    } else if (whosturnisitanyway == 1) {

                        switch(playermonster.Moveslotattack) {

                            case 0:
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Wounds For a " + String.format(displaystring, elongatedwoundtimerA)+ " Turn Bleed of " + String.format(displaystring, (int) Math.round(elongatedwoundpowerA)) + "\n");
                                break;
                            case 1:
                                if (delayedblastpowerP > 0) {
                                    CombatString = String.format(CombatString + names(playermonster.Idnum) + " Prepares Delayed Blast of " + String.format(displaystring, (int) Math.round(delayedblastpowerP)) + "\n");
                                } else {
                                    CombatString = String.format(CombatString + names(playermonster.Idnum) + " Fails To Prepare Delayed Blast " + "\n");
                                }
                                break;
                            case 2:
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, elongatedhealwoundtimerA) + " Turn Grevious Wounds of " + String.format(displaystring, (int) Math.round(elongatedhealwoundpowerA)) + "\n");
                                break;
                            case 3:
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, elongatedglugtimerP) +  " Turn Slow Drain of " + String.format(displaystring, (int) Math.round(elongatedglugpowerP)) + " From " + names(attackermonster.Idnum) + "\n");
                                break;
                            case 4:
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, healblocktgimerP) +  " Turn Heal Block " + "\n");
                                break;
                            case 5:
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Chips Defense for "  + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                                break;
                            case 6:
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Trips for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                                break;
                            case 7:
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Disciplines for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                                break;
                        }
                    }
                }*/

                DeathTest();
                StringDisplayMethod();


                LongView.setText(CombatString);


                if(playermonster.Health > 0 && attackermonster.Health > 0) {
                    turncounter++;
                    ImageChanger();
                }
                RivalRevealer();
            }
        });



    }


    private void Labratory() throws CloneNotSupportedException {


        Context ProtomonContext = getApplicationContext();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
        SharedPreferences.Editor editor = prefs.edit();

        int countthroughmonsters = 0;
        String DustMe = "%s";
       // String BustMe = String.format("Monster"+String.format(DustMe, countthroughmonsters));




        monst Passablemonster = new monst(monstlist(playerid)).clone();
        Intent i = new Intent();
        Bundle b = new Bundle();
        b.putInt("Storage", MonsterStorageCounter);
        while (countthroughmonsters < MonsterStorageCounter){



            String BustMe = String.format("Monster"+String.format(DustMe, countthroughmonsters));
            b.putParcelable(BustMe, PlayerMonsterStorage[countthroughmonsters]);




            Gson gson = new Gson();
            String json = gson.toJson(PlayerMonsterStorage[countthroughmonsters]);
            editor.putString(BustMe, json);
            editor.commit();

            countthroughmonsters++;
        }




     //   b.putParcelable("Monster", Passablemonster);




        i.putExtras(b);
        i.setClass(this, GarlitosLab.class);


        startActivity(i);

      //  Intent go = new Intent(this, GarlitosLab.class);
     //   startActivity(go);
    }
    private void HealthChecker() {

        playermonster.Health = Math.round(playermonster.Health);
        attackermonster.Health = Math.round(attackermonster.Health);

        if (playermonster.Health > MaxHealthPlayer) {
            playermonster.Health = MaxHealthPlayer;
        }

        if (attackermonster.Health > MaxHealthAttacker){
            attackermonster.Health = MaxHealthAttacker;
        }



        if(playermonster.Health <= 0){
            playermonster.Health = 0;
        }
        if(attackermonster.Health <= 0){
            attackermonster.Health = 0;
        }
    }

    private void DelayedStatusMethod() {
        if(AttackerStatDelayTimer > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
            AttackerStatDelayTimer--;
        }

        if(PlayerStatDelayTimer > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
            PlayerStatDelayTimer--;
        }

        if(AttackerStatDelayTimer == 0){
            AttackerStatDelayTimer = -1;
            switch (attackermonster.Moveslotspeed){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                case 7:
                    attackermonster.Attack = attackermonster.Attack * CbrtTwo ;
                    attackermonster.Attack = Math.round(attackermonster.Attack);
                    attackermonster.Speed = attackermonster.Speed * CbrtTwo ;
                    attackermonster.Speed = Math.round(attackermonster.Speed);
                    attackermonster.Defense = attackermonster.Defense * CbrtTwo ;
                    attackermonster.Defense = Math.round(attackermonster.Defense);
                    break;
                case 8:

                    attackermonster.Speed = attackermonster.Speed * SqrtTwo ;
                    attackermonster.Speed = Math.round(attackermonster.Speed);
                    attackermonster.Defense = attackermonster.Defense * SqrtTwo ;
                    attackermonster.Defense = Math.round(attackermonster.Defense);
                    break;
                case 9:
                    attackermonster.Attack = attackermonster.Attack * SqrtTwo ;
                    attackermonster.Attack = Math.round(attackermonster.Attack);
                    attackermonster.Defense = attackermonster.Defense * SqrtTwo ;
                    attackermonster.Defense = Math.round(attackermonster.Defense);
                    break;
                case 10:
                    attackermonster.Attack = attackermonster.Attack * SqrtTwo ;
                    attackermonster.Attack = Math.round(attackermonster.Attack);
                    attackermonster.Speed = attackermonster.Speed * SqrtTwo ;
                    attackermonster.Speed = Math.round(attackermonster.Speed);
                    break;
                case 11:
                    attackermonster.Speed = attackermonster.Speed * 2 ;
                    attackermonster.Speed = Math.round(attackermonster.Speed);
                    break;
                case 12:
                    attackermonster.Defense = attackermonster.Defense * 2 ;
                    attackermonster.Defense = Math.round(attackermonster.Defense);
                    break;
                case 13:
                    attackermonster.Attack = attackermonster.Attack * 2 ;
                    attackermonster.Attack = Math.round(attackermonster.Attack);
                    break;
            }
        }

        if(PlayerStatDelayTimer == 0) {
            PlayerStatDelayTimer = -1;
            switch (playermonster.Moveslotspeed){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                case 7:
                    playermonster.Attack = playermonster.Attack * CbrtTwo ;
                    playermonster.Attack = Math.round(playermonster.Attack);
                    playermonster.Speed = playermonster.Speed * CbrtTwo ;
                    playermonster.Speed = Math.round(playermonster.Speed);
                    playermonster.Defense = playermonster.Defense * CbrtTwo ;
                    playermonster.Defense = Math.round(playermonster.Defense);
                    break;
                case 8:

                    playermonster.Speed = playermonster.Speed * SqrtTwo ;
                    playermonster.Speed = Math.round(playermonster.Speed);
                    playermonster.Defense = playermonster.Defense * SqrtTwo ;
                    playermonster.Defense = Math.round(playermonster.Defense);
                    break;
                case 9:
                    playermonster.Attack = playermonster.Attack * SqrtTwo ;
                    playermonster.Attack = Math.round(playermonster.Attack);
                    playermonster.Defense = playermonster.Defense * SqrtTwo ;
                    playermonster.Defense = Math.round(playermonster.Defense);
                    break;
                case 10:
                    playermonster.Attack = playermonster.Attack * SqrtTwo ;
                    playermonster.Attack = Math.round(playermonster.Attack);
                    playermonster.Speed = playermonster.Speed * SqrtTwo ;
                    playermonster.Speed = Math.round(playermonster.Speed);
                    break;
                case 11:
                    playermonster.Speed = playermonster.Speed * 2 ;
                    playermonster.Speed = Math.round(playermonster.Speed);
                    break;
                case 12:
                    playermonster.Defense = playermonster.Defense * 2 ;
                    playermonster.Defense = Math.round(playermonster.Defense);
                    break;
                case 13:
                    playermonster.Attack = playermonster.Attack * 2 ;
                    playermonster.Attack = Math.round(playermonster.Attack);
                    break;
            }
        }


        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);
    }

    public void TurnDamageResolution() {
        if (playermonster.Health > 0 && attackermonster.Health > 0) {

            double Holdthisformeplayer =  playermonster.Health;
            double Holdthisformemonster =  attackermonster.Health;
            double Holdthisformemonsterwounds =  attackermonster.Health;
            double Holdthisformeplayerwounds =  playermonster.Health;


            if(delayedhealtimerA > 0){
                delayedhealtimerA++;
            }


            if(delayedhealtimerA > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                attackermonster.Health = attackermonster.Health + delayedhealpowerA;
                delayedhealpowerA = 0;
                delayedhealtimerA = 0;
            }




            if(delayedhealtimerP > 0){
                delayedhealtimerP++;
            }


            if(delayedhealtimerP > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                playermonster.Health = playermonster.Health + delayedhealpowerP;
                delayedhealpowerP = 0;
                delayedhealtimerP = 0;
            }





            if (elongatedhealtimerA == 0) {
                elongatedhealpowerA = 0;
            }

            if (elongatedhealtimerP == 0) {
                elongatedhealpowerP = 0;
            }



            if (elongatedhealtimerP > 0) {
                elongatedhealtimerP--;
                playermonster.Health = elongatedhealpowerP + playermonster.Health;
            }


            if (elongatedhealtimerA > 0) {
                elongatedhealtimerA--;
                attackermonster.Health = elongatedhealpowerA + attackermonster.Health;
            }


            if (elongatedglugtimerP == 0) {
                elongatedglugpowerP = 0;
            }
            if (elongatedglugtimerA == 0) {
                elongatedglugpowerA = 0;
            }

            if (elongatedglugtimerP > 0) {
                elongatedglugtimerP--;
                playermonster.Health = playermonster.Health + elongatedglugpowerP;
                attackermonster.Health = attackermonster.Health - elongatedglugpowerP;
                Holdthisformemonsterwounds = Holdthisformemonsterwounds - elongatedglugpowerP;
                Holdthisformemonster = Holdthisformemonster - elongatedglugpowerP;

            }

            if (elongatedglugtimerA > 0) {
                elongatedglugtimerA--;
                attackermonster.Health = attackermonster.Health + elongatedglugpowerA;
                playermonster.Health = playermonster.Health - elongatedglugpowerA;
                Holdthisformeplayerwounds = Holdthisformeplayerwounds - elongatedglugpowerA;
                Holdthisformeplayer = Holdthisformeplayer - elongatedglugpowerA;
            }

            if (healblocktgimerA > 0 && playermonster.Health >= Holdthisformeplayer){
                playermonster.Health = Holdthisformeplayer;
                healblocktgimerA--;
            }if (healblocktgimerP > 0 && attackermonster.Health >= Holdthisformemonster){
                attackermonster.Health = Holdthisformemonster;
                healblocktgimerP--;
            }
            if (elongatedhealwoundpowerP > 0 && healblocktgimerA == 0 && playermonster.Health >= Holdthisformeplayerwounds){
                playermonster.Health = Math.round((Holdthisformeplayerwounds + playermonster.Health)/2);
            }if (elongatedhealwoundpowerA > 0 && healblocktgimerP == 0  && attackermonster.Health >= Holdthisformemonsterwounds){
                attackermonster.Health = Math.round((Holdthisformemonsterwounds + attackermonster.Health)/2);
            }


            if(delayedblasttimerA > 0){
                delayedblasttimerA++;
            }
            if(delayedblasttimerA > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                playermonster.Health = playermonster.Health - delayedblastpowerA;
                delayedblastpowerA = 0;
                delayedblasttimerA = 0;
            }
            if(delayedblasttimerP > 0){
                delayedblasttimerP++;
            }
            if(delayedblasttimerP > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                attackermonster.Health = attackermonster.Health - delayedblastpowerP;
                delayedblastpowerP = 0;
                delayedblasttimerP = 0;
            }

            if (elongatedwoundtimerA == 0) {
                elongatedwoundpowerA = 0;
            }

            if (elongatedwoundtimerP == 0) {
                elongatedwoundpowerP = 0;
            }

            if (elongatedhealwoundtimerA == 0) {
                elongatedhealwoundpowerA = 0;
            }

            if (elongatedhealwoundtimerP == 0) {
                elongatedhealwoundpowerP = 0;
            }



            if (elongatedhealwoundtimerP > 0) {
                elongatedhealwoundtimerP--;
                playermonster.Health = playermonster.Health - elongatedhealwoundpowerP;
            }

            if (elongatedhealwoundtimerA > 0) {
                elongatedhealwoundtimerA--;
                attackermonster.Health = attackermonster.Health - elongatedhealwoundpowerA;
            }


            if (grouphealtimerP > 0){
                grouphealtimerP--;

            }

            if (grouphealtimerA > 0){
                grouphealtimerA--;

            }

            for (int w = 0; w < MonsterStorageCounter; w++){
                PlayerMonsterStorage[w].Health = PlayerMonsterStorage[w].Health + grouphealpowerP;

                if (PlayerMonsterStorage[w].Health >= stats(monstlist((int)PlayerMonsterStorage[w].Idnum).Health)){
                    PlayerMonsterStorage[w].Health = stats(monstlist((int)PlayerMonsterStorage[w].Idnum).Health);
                }

            }

            /*
            for (int w = 0; w < MonsterStorageCounter; w++){
                PlayerMonsterStorage[w].Health = PlayerMonsterStorage[w].Health + grouphealpowerP;

                if (PlayerMonsterStorage[w].Health >= stats(monstlist((int)PlayerMonsterStorage[w].Idnum).Health)){
                    PlayerMonsterStorage[w].Health = stats(monstlist((int)PlayerMonsterStorage[w].Idnum).Health);
                }
                build attacker storage first.
            }*/



            if (elongatedwoundtimerP > 0) {
                elongatedwoundtimerP--;
                playermonster.Health = playermonster.Health - elongatedwoundpowerP;
            }

            if (elongatedwoundtimerA > 0) {
                elongatedwoundtimerA--;
                attackermonster.Health = attackermonster.Health - elongatedwoundpowerA;
            }


            StatAbuseCurb(playermonster);
            StatAbuseCurb(attackermonster);

        }
    }

    public String HealingMoveNames(int move) {
        switch (move){
            case 0:
                return "Heal";
            case 1:
                return "Delayed Heal";
            case 2:
                return "Heal Over Time";
            case 3:
                return "Life Glug";
            case 4:
                return "Cleansing Heal";
            case 5:
                return "All Team Heal";
        }
        return "HealError";
    }

    public String SpecialMoveNames(int move) {
        switch (move){
            case 0:
                return "Wound";
            case 1:
                return "Delayed Blast";
            case 2:
                return "Grevious Wounds";
            case 3:
                return "Life Glug Over Time";
            case 4:
                return "Heal Block";
            case 5:
                return "Defense Chip";
            case 6:
                return "Trip";
            case 7:
                return "Discipline";
        }
        return "SpecialError";
    }

    public String StatsMoveNames(int move) {
        switch (move){
            case 0:
                return "All Stat Minor Boost ";
            case 1:
                return "Speed and Defense Boost ";
            case 2:
                return "Attack and Defense boost ";
            case 3:
                return "Attack and speed boost ";
            case 4:
                return "Major Speed Boost ";
            case 5:
                return "Major Defense boost ";
            case 6:
                return "Major Attack boost ";
            case 7:
                return "Delayed All Stat Boost ";
            case 8:
                return "Delayed Major Speed and Defense Boost ";
            case 9:
                return "Delayed Major Attack and Defense boost ";
            case 10:
                return "Delayed Major Attack and speed boost ";
            case 11:
                return "Delayed Huge Speed Boost ";
            case 12:
                return "Delayed Huge Defense boost ";
            case 13:
                return "Delayed Huge Attack boost ";
        }
        return "StatError";
    }

    public monst Cloner(monst monster) throws CloneNotSupportedException {

        monst newmonstclone = monster.clone();
        newmonstclone.Attack = stats(newmonstclone.Attack);
        newmonstclone.Speed = stats(newmonstclone.Speed);
        newmonstclone.Defense = stats(newmonstclone.Defense);
        newmonstclone.Health = stats(newmonstclone.Health);
        newmonstclone.Moveslotattack = SpecialMoves(0);
        newmonstclone.Moveslotheal = HealMoves(0);
        newmonstclone.Moveslotspeed = SpeedMoves(0);
        return  newmonstclone;
    }

    public double stats(double base){

            return base+50;

       //    return (base+(new Random().nextInt(101)-50));
    }

    public int damagecalculation(int targetdefence, int attackerstrength){

        double ratio = (targetdefence/attackerstrength);
        double damage = (ratio*(new Random().nextInt(11)+55));
        return (int) damage;
    }
    public monst monstlist(int idnumber){

        switch (idnumber){

            case 0:
                break;
            case 1:
                return Kunk;
            case 2:
                return Kohboh;
            case 3:
                return Djoper;
            case 4:
                return Schorp;
            case 5:
                return Zaume;
            case 6:
                return Nhainhai;
            case 7:
                return Degeissdt;
            case 8:
                return Yuggle;
            case 9:
                return Bongu;
            case 10:
                return Giteriglia;
            case 11:
                return Cyosteroth;
            case 12:
                return Nentopode;
            case 13:
                return Centiclak;
            case 14:
                return Uggnawb;
            case 15:
                return Grobhost;
            case 16:
                return Illelonab;
            case 17:
                return Rongzeed;
            case 18:
                return Blattle;
            case 19:
                return Swogharnler;
            case 20:
                return Adenolish;
            case 21:
                return Genaupresang;
            case 22:
                return Daahnida;
            case 23:
                return Sorba;
            case 24:
                return Jiyou;
            case 25:
                return Sparvae;
            case 26:
                return Vellup;
            case 27:
                return Bellaja;
            case 28:
                return Levdzell;
            case 29:
                return Rytegg;
            case 30:
                return Flashmer;
            case 31:
                return Schmodozer;
            case 32:
                return Octgotot;
            case 33:
                return Triaural;
            case 34:
                return Dicyto;
            case 35:
                return Monopteryx;
            case 36:
                return Elastocark;
            case 37:
                return Toobapath;
            case 38:
                return Weeliosbop;
            case 39:
                return Ihmpdrap;
            case 40:
                return Epibazang;
            case 41:
                return Hemtan;
            case 42:
                return Ogo;
            case 43:
                return Strachid;
            case 44:
                return Toximastica;
            case 45:
                return Urcuria;
            case 46:
                return Hyuntress;
            case 47:
                return Mondosplak;
            case 48:
                return Kaheksaguge;
            case 49:
                return Sapiosuant;
            case 50:
                return Munegull;
            case 51:
                return Sudakleez;
            case 52:
                return Halocordate;
            case 53:
                return Fædendron;
            case 54:
                return Osteoplang;
            case 55:
                return Жrachnid;
            case 56:
                return Ϫlitch;
            case 57:
                return በ;
            case 58:
                return Mantidile;
            case 59:
                return Nokoyl;
            case 60:
                return Яallod;
            case 61:
                return Algaetizer;
            case 62:
                return Kachort;
            case 63:
                return Slamelion;
            case 64:
                return Ayateda;
            case 65:
                return Wochem;
            case 66:
                return Ƕmun;
            case 67:
                return Ψkobath;
            case 68:
                return Gytanic;
            case 69:
                return βeiß;
            case 70:
                return Gungholio;
            case 71:
                return Honigkönig;
            case 72:
                return Kungulp;
            case 73:
                return Σatinella;
            case 74:
                return Elocurl;
            case 75:
                return Takobie;
            case 76:
                return Ōbchovy;
            case 77:
                return Nimnamnom;
            case 78:
                return Tutewtoo;
            case 79:
                return Blanqast;
            case 80:
                return Indeo;
            case 81:
                return Deblobbio;
            case 82:
                return Knightstacean;
            case 83:
                Gson gson = new Gson();
                Context ProtomonContext = getApplicationContext();
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
                SharedPreferences.Editor editor = prefs.edit();
                String json = prefs.getString("WorkingMonster", "");
                if (gson.fromJson(json, (Type) protomon.monst.class) != null) {
                    Custom = gson.fromJson(json, (Type) protomon.monst.class);
                    return Custom;
                }else {
                    return Custom;
                }
        }
        return error;
    }

    public int SpecialMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(8);

        return startingmove;
    }

    public int HealMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(6);

        return startingmove;
    }

    public int SpeedMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(14);

        return startingmove;
    }

    public String TypesOfMotions(int Action){


        if (Action > -1) {
            switch ((int) Action) {

                case 0:
                    return " errantnope ";
                case 1:
                    return " Attacks for ";
                case 2:
                    return " Heals ";
                case 3:
                    return " Boosts ";
                case 4:
                    return " Takes Damage ";
                case 5:
                    return " Wins ";
            }
        }
        return "Space filler";
    }
    public void TimerCancelMethod(){

         AttackerStatDelayTimer = -1;
         PlayerStatDelayTimer = -1;

         healblockmagnitudeA = 0;
         healblocktgimerA = 0;

         healblockmagnitudeP = 0;
         healblocktgimerP = 0;

         IDstorage = 0;

         playwins = 0;
         attackwins = 0;

         elongatedhealwoundtimerA = 0;
         elongatedhealwoundtimerP = 0;

         elongatedwoundtimerA = 0;
         elongatedwoundtimerP = 0;

         delayedblastpowerA = 0;
         delayedblastpowerP = 0;

         delayedblasttimerA = 0;
         delayedblasttimerP = 0;

         elongatedhealwoundpowerA = 0;
         elongatedhealwoundpowerP = 0;
         elongatedwoundpowerA = 0;
         elongatedwoundpowerP = 0;

         slowdrainA = 0;
         slowdrainP = 0;
        
         scorekeepera = 0;
         scorekeeperp = 0;

         ActionNum = 0;

         elongatedglugpowerP = 0;
         elongatedglugtimerP = 0;
         elongatedglugpowerA = 0;
         elongatedglugtimerA = 0;

         whosturnisitanyway = 0;

         elongatedhealpowerP = 0;
         elongatedhealpowerA = 0;
         elongatedhealtimerP = 0;
         elongatedhealtimerA = 0;

         delayedhealpowerA = 0;
         delayedhealpowerP = 0;
         delayedhealtimerP = 0;
         delayedhealtimerA = 0;


        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);
    }

    public String names(double idnumber){


        if (idnumber > -1) {
            switch ((int)idnumber) {

                case 0:
                    return "errantnope";
                case 1:
                    return "Kunk";
                case 2:
                    return "Kohboh";
                case 3:
                    return "Djoper";
                case 4:
                    return "Schorp";
                case 5:
                    return "Zaume";
                case 6:
                    return "Nhainhai";
                case 7:
                    return "Degeissdt";
                case 8:
                    return "Yuggle";
                case 9:
                    return "Bongu";
                case 10:
                    return "Giteriglia";
                case 11:
                    return "Cyosteroth";
                case 12:
                    return "Nentopode";
                case 13:
                    return "Centiclak";
                case 14:
                    return "Uggnawb";
                case 15:
                    return "Grobhost";
                case 16:
                    return "Illelonab";
                case 17:
                    return "Rongzeed";
                case 18:
                    return "Blattle";
                case 19:
                    return "Swogharnler";
                case 20:
                    return "Adenolish";
                case 21:
                    return "Genaupresang";
                case 22:
                    return "Daahnida";
                case 23:
                    return "Sorba";
                case 24:
                    return "Jiyou";
                case 25:
                    return "Sparvae";
                case 26:
                    return "Vellup";
                case 27:
                    return "Bellaja";
                case 28:
                    return "Levdzell";
                case 29:
                    return "Rytegg";
                case 30:
                    return "Flashmer";
                case 31:
                    return "Schmodozer";
                case 32:
                    return "Octgotot";
                case 33:
                    return "Triaural";
                case 34:
                    return "Dicyto";
                case 35:
                    return "Monopteryx";
                case 36:
                    return "Elastocark";
                case 37:
                    return "Toobapath";
                case 38:
                    return "Weeliosbop";
                case 39:
                    return "Ihmpdrap";
                case 40:
                    return "Epibazang";
                case 41:
                    return "Hemtan";
                case 42:
                    return "Ogo";
                case 43:
                    return "Strachid";
                case 44:
                    return "Toximastica";
                case 45:
                    return "Urcuria";
                case 46:
                    return "Hyuntress";
                case 47:
                    return "Mondosplak";
                case 48:
                    return "Kaheksaguge";
                case 49:
                    return "Sapiosuant";
                case 50:
                    return "Munegull";
                case 51:
                    return "Sudakleez";
                case 52:
                    return "Halocordate";
                case 53:
                    return "Fædendron";
                case 54:
                    return "Osteoplang";
                case 55:
                    return "Жrachnid";
                case 56:
                    return "Ϫlitch";
                case 57:
                    return "በ";
                case 58:
                    return "Mantidile";
                case 59:
                    return "Nokoyl";
                case 60:
                    return "Яallod";
                case 61:
                    return "Algaetizer";
                case 62:
                    return "Kachort";
                case 63:
                    return "Slamelion";
                case 64:
                    return "Ayateda";
                case 65:
                    return "Wochem";
                case 66:
                    return "Ƕmun";
                case 67:
                    return "Ψkobath";
                case 68:
                    return "Gytanic";
                case 69:
                    return "βeiß";
                case 70:
                    return "Gungholio";
                case 71:
                    return "Honigkönig";
                case 72:
                    return "Kungulp";
                case 73:
                    return "Σatinella";
                case 74:
                    return "Elocurl";
                case 75:
                    return "Takobie";
                case 76:
                    return "Ōbchovy";
                case 77:
                    return "Nimnamnom";
                case 78:
                    return "Tutewtoo";
                case 79:
                    return "Blanqast";
                case 80:
                    return "Indeo";
                case 81:
                    return "Deblobbio";
                case 82:
                    return "Knightstacean";
                case 83:

                    String Name;

                    Gson gson = new Gson();
                    Context ProtomonContext = getApplicationContext();
                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
                    SharedPreferences.Editor editor = prefs.edit();
                    String json = prefs.getString("Name", "");
                    if (gson.fromJson(json, (Type) protomon.monst.class) != null) {
                        CustomMonsterTopLayer.StringObject NameObjectHolder = gson.fromJson(json, (Type) CustomMonsterTopLayer.StringObject.class);
                        return NameObjectHolder.NameString;
                    }else {
                        return "Failstorm";
                    }



            }
        }else{
            return "error";
        }
        return "realerror";
    }

    public void ImageChanger() {


        if (playermonster.Speed <= attackermonster.Speed) {
            if ((turncounter % 2) == 0) {
                PlayerIcon.setVisibility(View.VISIBLE);
                PlayerIcon.setImageResource(R.drawable.excalim);
                EnemyIcon.setVisibility(View.INVISIBLE);
            } else {
                EnemyIcon.setVisibility(View.VISIBLE);
                EnemyIcon.setImageResource(R.drawable.excalim);
                PlayerIcon.setVisibility(View.INVISIBLE);
            }
        } else {
            if ((turncounter % 2) == 1) {
                PlayerIcon.setVisibility(View.VISIBLE);
                PlayerIcon.setImageResource(R.drawable.excalim);
                EnemyIcon.setVisibility(View.INVISIBLE);
            } else {
                EnemyIcon.setVisibility(View.VISIBLE);
                EnemyIcon.setImageResource(R.drawable.excalim);
                PlayerIcon.setVisibility(View.INVISIBLE);
            }

        }

        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);
    }
    public void PlayBrainMethod(Button Teller) {

        if (Teller == Turn) {
            whosturnisitanyway = 1;
            Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
            Damage = Math.round(Damage);
            attackermonster.Health = attackermonster.Health - Damage;


            String WhatHappenedString = TypesOfMotions(1);

            StringDisplayMethod();


            if(turncounter > 0 /*&& (playermonster.Health > 0 && attackermonster.Health > 0)*/) {
                if (whosturnisitanyway == 0) {
                    CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString +  String.format(displaystring, (int) Math.round(Damage)) + "\n");
                } else if (whosturnisitanyway == 1) {
                    CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString  + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                }
            }


            if (!(playermonster.Health > 0 && attackermonster.Health > 0) && ActionNum == 0) {
                WhatHappenedString = TypesOfMotions(5); ActionNum = 1;
                if (whosturnisitanyway == 0) {
                    CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Attacks For " +  String.format(displaystring, (int) Math.round(Damage)) + "\n");

                } else if (whosturnisitanyway == 1) {
                    CombatString = String.format(CombatString + names(playermonster.Idnum) + " Attacks For "  + String.format(displaystring, (int) Math.round(Damage)) + "\n");

                }
                DeathTest();
            }
        }
        if (Teller == Status) {
            whosturnisitanyway = 1;
            if (playermonster.Moveslotspeed == 0) {
                playermonster.Speed = playermonster.Speed * FrrtTwo;
                playermonster.Speed = Math.round(playermonster.Speed);
                playermonster.Defense = playermonster.Defense * FrrtTwo;
                playermonster.Defense = Math.round(playermonster.Defense);
                playermonster.Attack = playermonster.Attack * FrrtTwo;
                playermonster.Attack = Math.round(playermonster.Attack);
            } else if (playermonster.Moveslotspeed == 1) {
                playermonster.Speed = playermonster.Speed * CbrtTwo;
                playermonster.Speed = Math.round(playermonster.Speed);
                playermonster.Defense = playermonster.Defense * CbrtTwo;
                playermonster.Defense = Math.round(playermonster.Defense);
            } else if (playermonster.Moveslotspeed == 2) {
                playermonster.Defense = playermonster.Defense * CbrtTwo;
                playermonster.Defense = Math.round(playermonster.Defense);
                playermonster.Attack = playermonster.Attack * CbrtTwo;
                playermonster.Attack = Math.round(playermonster.Attack);
            } else if (playermonster.Moveslotspeed == 3) {
                playermonster.Attack = playermonster.Attack * CbrtTwo;
                playermonster.Attack = Math.round(playermonster.Attack);
                playermonster.Speed = playermonster.Speed * CbrtTwo;
                playermonster.Speed = Math.round(playermonster.Speed);
            } else if (playermonster.Moveslotspeed == 4) {
                playermonster.Speed = playermonster.Speed * SqrtTwo;
                playermonster.Speed = Math.round(playermonster.Speed);
            } else if (playermonster.Moveslotspeed == 5) {
                playermonster.Defense = playermonster.Defense * SqrtTwo;
                playermonster.Defense = Math.round(playermonster.Defense);
            } else if (playermonster.Moveslotspeed == 6) {
                playermonster.Attack = playermonster.Attack * SqrtTwo;
                playermonster.Attack = Math.round(playermonster.Attack);
            } else if (playermonster.Moveslotspeed > 6 && PlayerStatDelayTimer == -1) {
                PlayerStatDelayTimer = 3;
            }

            String WhatHappenedString = TypesOfMotions(3);

            if(turncounter > 0 /*&& (playermonster.Health > 0 && attackermonster.Health > 0)*/) {
                if (whosturnisitanyway == 0) {
                    CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Performs " + StatsMoveNames(attackermonster.Moveslotspeed) + "\n");

                    // CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                } else if (whosturnisitanyway == 1) {

                    CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs " + StatsMoveNames(playermonster.Moveslotspeed) + "\n");

                    //  CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                }
            }
            DeathTest();
        }
        if (Teller == HealButton) {
            whosturnisitanyway = 1;
            if (playermonster.Moveslotheal == 0) {
                if (healblocktgimerA == 0 && elongatedhealwoundtimerP == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Speed / playermonster.Defense));
                    Damage = Math.round(Damage);
                    playermonster.Health = playermonster.Health + Damage;
                }
                if (elongatedhealwoundtimerP != 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Speed / playermonster.Defense));
                    Damage = Math.round(Damage);
                    playermonster.Health = playermonster.Health + Math.round(Damage / 2);
                }
                if (elongatedhealwoundtimerA != 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Speed / playermonster.Defense));
                    Damage = Math.round(Damage);
                    playermonster.Health = playermonster.Health + Math.round(Damage / 2);
                }
            } else if (playermonster.Moveslotheal == 1) {
                delayedhealpowerP = (int) (((new Random().nextInt(11) + 65)) * (playermonster.Speed / playermonster.Defense));
                if (delayedhealtimerP == 0) {
                    delayedhealtimerP = 1;
                }
            } else if (playermonster.Moveslotheal == 2) {
                elongatedhealtimerP = elongatedhealtimerP + 5;
                int healtester = (3 * ((int) (((new Random().nextInt(11) + 65)) * (playermonster.Speed / playermonster.Defense)))) / 7;
                healtester = Math.round(healtester);
                if (healtester > elongatedhealpowerP) {
                    elongatedhealpowerP = healtester;
                }

            } else if (playermonster.Moveslotheal == 3) {
                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
                Damage = Math.round(Damage);
                if (healblocktgimerA == 0 && elongatedhealwoundtimerP == 0) {
                    playermonster.Health = playermonster.Health + Damage;
                } else if (elongatedhealwoundtimerP > 0 && healblocktgimerA == 0) {
                    playermonster.Health = playermonster.Health + Math.round(Damage / 2);
                }
                attackermonster.Health = attackermonster.Health - Damage;
            } else if (playermonster.Moveslotheal == 4) {
                healblocktgimerA = 0;
                elongatedhealwoundtimerP = 0;
                elongatedwoundtimerP = 0;
                elongatedglugpowerA = 0;
                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Speed / playermonster.Defense));
                Damage = Math.round(Damage);
                playermonster.Health = playermonster.Health + Damage;
            }else if (playermonster.Moveslotheal == 5) {
                grouphealtimerP = grouphealtimerP + 7;
                int healtester = (3 * ((int) (((new Random().nextInt(6) + 15)) * (playermonster.Speed / playermonster.Defense)))) / 7;
                healtester = Math.round(healtester);
                if (healtester > grouphealpowerP) {
                    grouphealpowerP = healtester;
                }
            }
            if (playermonster.Health > MaxHealthPlayer) {
                playermonster.Health = MaxHealthPlayer;
            }


            String WhatHappenedString = TypesOfMotions(2);
            String displaystring = "%s";
            String displaystringH = "%s/%s";

            if(turncounter > 0 /*&& (playermonster.Health > 0 && attackermonster.Health > 0)*/) {
                if (whosturnisitanyway == 0) {

                    if  (attackermonster.Moveslotheal == 0)  {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Heals " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if (attackermonster.Moveslotheal == 1) {
                        if (delayedhealpowerA > 0) {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Prepares Two Turn Delayed Healing of " + String.format(displaystring, (int) Math.round(delayedhealpowerA)) + "\n");
                        }else {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Fails To Prepare Two Turn Delayed Healing " + "\n");
                        }
                    }else if (attackermonster.Moveslotheal == 2) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Begins " +  String.format(displaystring, elongatedhealtimerA) + " Turn Regeneration of " + String.format(displaystring, (int) Math.round(elongatedhealpowerA)) + "\n");
                    }else if (attackermonster.Moveslotheal == 3) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + names(playermonster.Idnum) + "\n");
                    }else if  (attackermonster.Moveslotheal == 4) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Performs Cleansing Heal " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 5)  {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Begins " +  String.format(displaystring, grouphealtimerA) + " Turn Group Regeneration of " + String.format(displaystring, (int) Math.round(grouphealpowerA)) + "\n");
                    }else {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                    }
                } else if (whosturnisitanyway == 1) {
                    if  (playermonster.Moveslotheal == 0)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Heals " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    } else if (playermonster.Moveslotheal == 1) {
                        if (delayedhealpowerP > 0) {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Prepares Two Turn Delayed Healing of " + String.format(displaystring, (int) Math.round(delayedhealpowerP)) + "\n");
                        }else {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Fails To Prepare Two Turn Delayed Healing " + "\n");
                        }
                    }else if (playermonster.Moveslotheal == 2) {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " +  String.format(displaystring, elongatedhealtimerP) + " Turn Regeneration of " + String.format(displaystring, (int) Math.round(elongatedhealpowerP)) + "\n");
                    }else if (playermonster.Moveslotheal == 3) {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + names(attackermonster.Idnum) + "\n");
                    }else if  (playermonster.Moveslotheal == 4)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs Cleansing Heal " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (playermonster.Moveslotheal == 5)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " +  String.format(displaystring, grouphealtimerP) + " Turn Group Regeneration of " + String.format(displaystring, (int) Math.round(grouphealpowerP)) + "\n");
                    }else {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                    }

                }
            }
        }
        if (Teller == SpecialAttack) {
            whosturnisitanyway = 1;
            if (playermonster.Moveslotattack == 0) {

                elongatedwoundtimerA = elongatedwoundtimerA + 10;
                int healtester = (3 * ((int) (((new Random().nextInt(21) + 70)) * (playermonster.Speed / attackermonster.Defense)))) / 17;
                healtester = Math.round(healtester);
                if (healtester > elongatedwoundpowerA) {
                    elongatedwoundpowerA = healtester;
                }
            } else if (playermonster.Moveslotattack == 1) {
                delayedblastpowerP = (int) (((new Random().nextInt(21) + 65)) * (playermonster.Attack / attackermonster.Speed));
                if (delayedblasttimerP == 0) {
                    delayedblasttimerP = 1;
                }
            } else if (playermonster.Moveslotattack == 2) {
                elongatedhealwoundtimerA = elongatedhealwoundtimerA + 10;
                int healtester = (3 * ((int) (((new Random().nextInt(11) + 35)) * (playermonster.Speed / attackermonster.Defense)))) / 14;
                healtester = Math.round(healtester);
                if (healtester > elongatedhealwoundpowerA) {
                    elongatedhealwoundpowerA = healtester;
                }

            } else if (playermonster.Moveslotattack == 3) {
                elongatedglugtimerP = elongatedglugtimerP + 10;
                int healtester = (3 * ((int) (((new Random().nextInt(11) + 35)) * (attackermonster.Speed / playermonster.Defense)))) / 12;
                healtester = Math.round(healtester);
                if (healtester > elongatedglugpowerP) {
                    elongatedglugpowerP = healtester;
                } // Work in progress, attack 3 is life glug over time
            } else if (playermonster.Moveslotattack == 4) {
                healblocktgimerP = healblocktgimerP + 6;
            }else if (playermonster.Moveslotattack == 5) {
                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
                Damage = Math.round(Damage);
                if (attackermonster.Defense >= statMinimum){
                    attackermonster.Defense = Math.round(attackermonster.Defense * .85);
                }
                if (attackermonster.Defense <= statMinimum){
                    attackermonster.Defense = statMinimum;
                }
                attackermonster.Health = attackermonster.Health - Damage;
            }else if (playermonster.Moveslotattack == 6) {
                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Speed));
                Damage = Math.round(Damage);
                if (attackermonster.Speed >= statMinimum){
                    attackermonster.Speed = Math.round(attackermonster.Speed * .85);
                }
                if (attackermonster.Speed <= statMinimum){
                    attackermonster.Speed = statMinimum;
                }
                attackermonster.Health = attackermonster.Health - Damage;
            }else if (playermonster.Moveslotattack == 7) {
                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Attack));
                Damage = Math.round(Damage);
                if (attackermonster.Attack >= statMinimum){
                    attackermonster.Attack = Math.round(attackermonster.Attack * .85);
                }
                if (attackermonster.Attack <= statMinimum){
                    attackermonster.Attack = statMinimum;
                }
                attackermonster.Health = attackermonster.Health - Damage;
            }
            if (playermonster.Health > MaxHealthPlayer) {
                playermonster.Health = MaxHealthPlayer;
            }


            String WhatHappenedString = TypesOfMotions(2);
            String displaystring = "%s";
            String displaystringH = "%s/%s";

            if(turncounter > 0 && ((playermonster.Health > 0 && attackermonster.Health > 0)|| ActionNum != 1)) {
                if (whosturnisitanyway == 0) {


                    switch (attackermonster.Moveslotattack) {

                        case 0:
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Wounds For a " + String.format(displaystring, elongatedwoundtimerP) + " Turn Bleed of " + String.format(displaystring, (int) Math.round(elongatedwoundpowerP)) + "\n");
                            break;
                        case 1:
                            if (delayedblastpowerA > 0) {
                                CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Prepares Delayed Blast of " + String.format(displaystring, (int) Math.round(delayedblastpowerA)) + "\n");
                            } else {
                                CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Fails To Prepare Delayed Blast " + "\n");
                            }
                            break;
                        case 2:
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, elongatedhealwoundtimerP) + " Turn Grevious Wounds of " + String.format(displaystring, (int) Math.round(elongatedhealwoundpowerP)) + "\n");
                            break;
                        case 3:
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, elongatedglugtimerA) + " Turn Slow Drain of " + String.format(displaystring, (int) Math.round(elongatedglugpowerA)) + " From " + names(playermonster.Idnum) + "\n");
                            break;
                        case 4:
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, healblocktgimerA) + " Turn Heal Block " + "\n");
                            break;
                        case 5:
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Chips Defense for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 6:
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Trips for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 7:
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Disciplines for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                    }
                } else if (whosturnisitanyway == 1) {

                    switch (playermonster.Moveslotattack) {

                        case 0:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Wounds For a " + String.format(displaystring, elongatedwoundtimerA) + " Turn Bleed of " + String.format(displaystring, (int) Math.round(elongatedwoundpowerA)) + "\n");
                            break;
                        case 1:
                            if (delayedblastpowerP > 0) {
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Prepares Delayed Blast of " + String.format(displaystring, (int) Math.round(delayedblastpowerP)) + "\n");
                            } else {
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Fails To Prepare Delayed Blast " + "\n");
                            }
                            break;
                        case 2:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, elongatedhealwoundtimerA) + " Turn Grevious Wounds of " + String.format(displaystring, (int) Math.round(elongatedhealwoundpowerA)) + "\n");
                            break;
                        case 3:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, elongatedglugtimerP) + " Turn Slow Drain of " + String.format(displaystring, (int) Math.round(elongatedglugpowerP)) + " From " + names(attackermonster.Idnum) + "\n");
                            break;
                        case 4:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, healblocktgimerP) + " Turn Heal Block " + "\n");
                            break;
                        case 5:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Chips Defense for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 6:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Trips for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 7:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Disciplines for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                    }
                }
            }
        }


        if (playermonster.Health <= 0){


            CombatString = String.format(CombatString + names(playermonster.Idnum) + " is Unable To battle " + "\n");

        }

        if (attackermonster.Health <= 0){


            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " is Unable To battle " + "\n");

        }

        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);
        /*
                            whosturnisitanyway = 1;
                            if(playermonster.Moveslotheal == 0) {
                                if (healblocktgimerA == 0 && elongatedhealwoundtimerP == 0) {
                                Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Speed / playermonster.Defense));
                                playermonster.Health = playermonster.Health + Damage;
                            }
                                if (elongatedhealwoundtimerP != 0) {
                                    Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Speed / playermonster.Defense));
                                    playermonster.Health = playermonster.Health + Math.round(Damage/2);
                                }
                            }else if(playermonster.Moveslotheal == 1){
                                delayedhealpowerP = (int) (((new Random().nextInt(21) + 65)) * (playermonster.Speed / playermonster.Defense));
                                if(delayedhealtimerP == 0) {
                                    delayedhealtimerP = 1;
                                }
                            }else if(playermonster.Moveslotheal == 2){
                                elongatedhealtimerP = elongatedhealtimerP + 5;
                                int healtester =  (3*((int) (((new Random().nextInt(21) + 65)) * (playermonster.Speed / playermonster.Defense))))/7;
                                healtester = Math.round(healtester);
                                if (healtester > elongatedhealpowerP){
                                    elongatedhealpowerP = healtester;
                                }

                            }else if(playermonster.Moveslotheal == 3) {
                                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
                                if (healblocktgimerA == 0 && elongatedhealwoundtimerP == 0) {
                                    playermonster.Health = playermonster.Health + Damage;
                                }else if (elongatedhealwoundtimerP > 0 && healblocktgimerA == 0){
                                    playermonster.Health = playermonster.Health + Math.round(Damage/2);
                                }
                                attackermonster.Health = attackermonster.Health - Damage;
                            }else if(playermonster.Moveslotheal == 4){
                                healblocktgimerA = 0;
                                elongatedhealwoundtimerP = 0;
                                elongatedwoundtimerP = 0;
                                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Speed / playermonster.Defense));
                                playermonster.Health = playermonster.Health + Damage;
                            }
                                if (playermonster.Health > MaxHealthPlayer){
                                playermonster.Health = MaxHealthPlayer;
                            }*/
    }
    public void RoboBrainMethod(Button Teller) {

        int BrainNumb = new Random().nextInt(10);
        switch (BrainNumb){

            case 0:
                Teller = SpecialAttack;
                break;
            case 1:
                Teller = Turn;
                break;
            case 2:
                Teller = Turn;
                break;
            case 3:
                Teller = Turn;
                break;
            case 4:
                Teller = HealButton;
                break;
            case 5:
                Teller = HealButton;
                break;
            case 6:
                Teller = Status;
                break;
            case 7:
                Teller = Status;
                break;
            case 8:
                Teller = SpecialAttack;
                break;
            case 9:
                Teller = Turn;
                break;



        }


        if (Teller == Turn) {
            whosturnisitanyway = 0;
            Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
            Damage = Math.round(Damage);
            playermonster.Health = playermonster.Health - Damage;




            String WhatHappenedString = TypesOfMotions(1);

            StringDisplayMethod();


            if(turncounter > 0 /*&& (playermonster.Health > 0 && attackermonster.Health > 0)*/) {
                if (whosturnisitanyway == 0) {
                    CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString +  String.format(displaystring, (int) Math.round(Damage)) + "\n");
                } else if (whosturnisitanyway == 1) {
                    CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString  + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                }
            }


            if (!(playermonster.Health > 0 && attackermonster.Health > 0) && ActionNum == 0) {
                WhatHappenedString = TypesOfMotions(5); ActionNum = 1;
                if (whosturnisitanyway == 0) {
                    CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Attacks For " +  String.format(displaystring, (int) Math.round(Damage)) + "\n");

                } else if (whosturnisitanyway == 1) {
                    CombatString = String.format(CombatString + names(playermonster.Idnum) + " Attacks For "  + String.format(displaystring, (int) Math.round(Damage)) + "\n");

                }
                DeathTest();
            }
        }

        if (Teller == Status) {
            whosturnisitanyway = 0;
            if (attackermonster.Moveslotspeed == 0) {
                attackermonster.Speed = attackermonster.Speed * FrrtTwo;
                attackermonster.Speed = Math.round(attackermonster.Speed);
                attackermonster.Defense = attackermonster.Defense * FrrtTwo;
                attackermonster.Defense = Math.round(attackermonster.Defense);
                attackermonster.Attack = attackermonster.Attack * FrrtTwo;
                attackermonster.Attack = Math.round(attackermonster.Attack);
            } else if (attackermonster.Moveslotspeed == 1) {
                attackermonster.Speed = attackermonster.Speed * CbrtTwo;
                attackermonster.Speed = Math.round(attackermonster.Speed);
                attackermonster.Defense = attackermonster.Defense * CbrtTwo;
                attackermonster.Defense = Math.round(attackermonster.Defense);
            } else if (attackermonster.Moveslotspeed == 2) {
                attackermonster.Defense = attackermonster.Defense * CbrtTwo;
                attackermonster.Defense = Math.round(attackermonster.Defense);
                attackermonster.Attack = attackermonster.Attack * CbrtTwo;
                attackermonster.Attack = Math.round(attackermonster.Attack);
            } else if (attackermonster.Moveslotspeed == 3) {
                attackermonster.Attack = attackermonster.Attack * CbrtTwo;
                attackermonster.Attack = Math.round(attackermonster.Attack);
                attackermonster.Speed = attackermonster.Speed * CbrtTwo;
                attackermonster.Speed = Math.round(attackermonster.Speed);
            } else if (attackermonster.Moveslotspeed == 4) {
                attackermonster.Speed = attackermonster.Speed * SqrtTwo;
                attackermonster.Speed = Math.round(attackermonster.Speed);
            } else if (attackermonster.Moveslotspeed == 5) {
                attackermonster.Defense = attackermonster.Defense * SqrtTwo;
                attackermonster.Defense = Math.round(attackermonster.Defense);
            } else if (attackermonster.Moveslotspeed == 6) {
                attackermonster.Attack = attackermonster.Attack * SqrtTwo;
                attackermonster.Attack = Math.round(attackermonster.Attack);
            } else if (attackermonster.Moveslotspeed > 6 && AttackerStatDelayTimer == -1) {
                AttackerStatDelayTimer = 3;
            }


            String WhatHappenedString = TypesOfMotions(3);

            if(turncounter > 0 /*&& (playermonster.Health > 0 && attackermonster.Health > 0)*/) {
                if (whosturnisitanyway == 0) {
                    CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Performs " + StatsMoveNames(attackermonster.Moveslotspeed) + "\n");

                    // CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                } else if (whosturnisitanyway == 1) {

                    CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs " + StatsMoveNames(playermonster.Moveslotspeed) + "\n");

                    //  CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                }
            }
            DeathTest();
        }

        if (Teller == HealButton) {
            whosturnisitanyway = 0;
            if (attackermonster.Moveslotheal == 0) {
                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                    Damage = Math.round(Damage);
                    attackermonster.Health = attackermonster.Health + Damage;
                }
                if (elongatedhealwoundtimerA != 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                    Damage = Math.round(Damage);
                    attackermonster.Health = attackermonster.Health + Math.round(Damage / 2);
                }
            } else if (attackermonster.Moveslotheal == 1) {
                delayedhealpowerA = (int) (((new Random().nextInt(21) + 65)) * (attackermonster.Speed / attackermonster.Defense));
                if (delayedhealtimerA == 0) {
                    delayedhealtimerA = 1;
                }
            } else if (attackermonster.Moveslotheal == 2) {
                elongatedhealtimerA = elongatedhealtimerA + 5;
                int healtester = (3 * ((int) (((new Random().nextInt(21) + 65)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
                healtester = Math.round(healtester);
                if (healtester > elongatedhealpowerA) {
                    elongatedhealpowerA = healtester;
                }
            } else if (attackermonster.Moveslotheal == 3) {
                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Defense));
                Damage = Math.round(Damage);
                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                    attackermonster.Health = attackermonster.Health + Damage;
                } else if (elongatedhealwoundtimerA > 0 && healblocktgimerP == 0) {
                    attackermonster.Health = attackermonster.Health + Math.round(Damage / 2);
                }
                playermonster.Health = playermonster.Health - Damage;
            } else if (attackermonster.Moveslotheal == 4) {
                healblocktgimerP = 0;
                elongatedhealwoundtimerA = 0;
                elongatedwoundtimerA = 0;
                elongatedglugtimerP = 0;
                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Speed / attackermonster.Defense));
                Damage = Math.round(Damage);
                attackermonster.Health = attackermonster.Health + Damage;
            }else if (attackermonster.Moveslotheal == 5) {
                grouphealtimerA = grouphealtimerA + 7;
                int healtester = (3 * ((int) (((new Random().nextInt(6) + 15)) * (playermonster.Speed / playermonster.Defense)))) / 7;
                healtester = Math.round(healtester);
                if (healtester > grouphealpowerA) {
                    grouphealpowerA = healtester;
                }
            }
            if (attackermonster.Health > MaxHealthAttacker) {
                attackermonster.Health = MaxHealthAttacker;
            }




            String WhatHappenedString = TypesOfMotions(2);
            String displaystring = "%s";
            String displaystringH = "%s/%s";

            if(turncounter > 0 /*&& (playermonster.Health > 0 && attackermonster.Health > 0)*/) {
                if (whosturnisitanyway == 0) {

                    if  (attackermonster.Moveslotheal == 0)  {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Heals " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if (attackermonster.Moveslotheal == 1) {
                        if (delayedhealpowerA > 0) {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Prepares Two Turn Delayed Healing of " + String.format(displaystring, (int) Math.round(delayedhealpowerA)) + "\n");
                        }else {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Fails To Prepare Two Turn Delayed Healing " + "\n");
                        }
                    }else if (attackermonster.Moveslotheal == 2) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Begins " +  String.format(displaystring, elongatedhealtimerA) + " Turn Regeneration of " + String.format(displaystring, (int) Math.round(elongatedhealpowerA)) + "\n");
                    }else if (attackermonster.Moveslotheal == 3) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + names(playermonster.Idnum) + "\n");
                    }else if  (attackermonster.Moveslotheal == 4) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Performs Cleansing Heal " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 5)  {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Begins " +  String.format(displaystring, grouphealtimerA) + " Turn Group Regeneration of " + String.format(displaystring, (int) Math.round(grouphealpowerA)) + "\n");
                    }else {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                    }
                } else if (whosturnisitanyway == 1) {
                    if  (playermonster.Moveslotheal == 0)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Heals " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    } else if (playermonster.Moveslotheal == 1) {
                        if (delayedhealpowerP > 0) {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Prepares Two Turn Delayed Healing of " + String.format(displaystring, (int) Math.round(delayedhealpowerP)) + "\n");
                        }else {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Fails To Prepare Two Turn Delayed Healing " + "\n");
                        }
                    }else if (playermonster.Moveslotheal == 2) {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " +  String.format(displaystring, elongatedhealtimerP) + " Turn Regeneration of " + String.format(displaystring, (int) Math.round(elongatedhealpowerP)) + "\n");
                    }else if (playermonster.Moveslotheal == 3) {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + names(attackermonster.Idnum) + "\n");
                    }else if  (playermonster.Moveslotheal == 4)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs Cleansing Heal " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (playermonster.Moveslotheal == 5)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " +  String.format(displaystring, grouphealtimerP) + " Turn Group Regeneration of " + String.format(displaystring, (int) Math.round(grouphealpowerP)) + "\n");
                    }else {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                    }

                }
            }

        }

        if (Teller == SpecialAttack) {
            whosturnisitanyway = 0;
            if (attackermonster.Moveslotattack == 0) {

                elongatedwoundtimerP = elongatedwoundtimerP + 10;
                int healtester = (3 * ((int) (((new Random().nextInt(21) + 70)) * (attackermonster.Speed / playermonster.Defense)))) / 17;
                healtester = Math.round(healtester);
                if (healtester > elongatedwoundpowerP) {
                    elongatedwoundpowerP = healtester;
                }
            } else if (attackermonster.Moveslotattack == 1) {
                delayedblastpowerA = (int) (((new Random().nextInt(21) + 65)) * (attackermonster.Attack / playermonster.Speed));
                if (delayedblasttimerA == 0) {
                    delayedblasttimerA = 1;
                }
            } else if (attackermonster.Moveslotattack == 2) {
                elongatedhealwoundtimerP = elongatedhealwoundtimerP + 10;
                int healtester = (3 * ((int) (((new Random().nextInt(11) + 35)) * (attackermonster.Speed / playermonster.Defense)))) / 14;
                healtester = Math.round(healtester);
                if (healtester > elongatedhealwoundpowerP) {
                    elongatedhealwoundpowerP = healtester;
                }

            } else if (attackermonster.Moveslotattack == 3) {
                elongatedglugtimerA = elongatedglugtimerA + 10;
                int healtester = (3 * ((int) (((new Random().nextInt(11) + 35)) * (attackermonster.Speed / playermonster.Defense)))) / 12;
                healtester = Math.round(healtester);
                if (healtester > elongatedglugpowerA) {
                    elongatedglugpowerA = healtester;
                }
            } else if (attackermonster.Moveslotattack == 4) {
                healblocktgimerA = healblocktgimerA + 6;
            }else if (attackermonster.Moveslotattack == 5) {
                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Defense));
                Damage = Math.round(Damage);
                if (playermonster.Defense >= statMinimum){
                    playermonster.Defense = Math.round(playermonster.Defense * .85);
                 }
                if (playermonster.Defense <= statMinimum){
                    playermonster.Defense = statMinimum;
                 }
                playermonster.Health = playermonster.Health - Damage;
            }else if (attackermonster.Moveslotattack == 6) {
                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Speed));
                Damage = Math.round(Damage);
                if (playermonster.Speed >= statMinimum){
                    playermonster.Speed = Math.round(playermonster.Speed * .85);
                 }
                if (playermonster.Speed <= statMinimum){
                    playermonster.Speed = statMinimum;
                 }
                playermonster.Health = playermonster.Health - Damage;
            }else if (attackermonster.Moveslotattack == 7) {
                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Attack));
                Damage = Math.round(Damage);
                if (playermonster.Attack >= statMinimum){
                    playermonster.Attack = Math.round(playermonster.Attack * .85);
                 }
                if (playermonster.Attack <= statMinimum){
                    playermonster.Attack = statMinimum;
                 }
                playermonster.Health = playermonster.Health - Damage;
            }

            if (attackermonster.Health > MaxHealthAttacker) {
                attackermonster.Health = MaxHealthAttacker;
            }



            String WhatHappenedString = TypesOfMotions(2);
            String displaystring = "%s";
            String displaystringH = "%s/%s";

            if(turncounter > 0 && ((playermonster.Health > 0 && attackermonster.Health > 0)|| ActionNum != 1)) {
                if (whosturnisitanyway == 0) {


                    switch (attackermonster.Moveslotattack) {

                        case 0:
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Wounds For a " + String.format(displaystring, elongatedwoundtimerP) + " Turn Bleed of " + String.format(displaystring, (int) Math.round(elongatedwoundpowerP)) + "\n");
                            break;
                        case 1:
                            if (delayedblastpowerA > 0) {
                                CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Prepares Delayed Blast of " + String.format(displaystring, (int) Math.round(delayedblastpowerA)) + "\n");
                            } else {
                                CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Fails To Prepare Delayed Blast " + "\n");
                            }
                            break;
                        case 2:
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, elongatedhealwoundtimerP) + " Turn Grevious Wounds of " + String.format(displaystring, (int) Math.round(elongatedhealwoundpowerP)) + "\n");
                            break;
                        case 3:
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, elongatedglugtimerA) + " Turn Slow Drain of " + String.format(displaystring, (int) Math.round(elongatedglugpowerA)) + " From " + names(playermonster.Idnum) + "\n");
                            break;
                        case 4:
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, healblocktgimerA) + " Turn Heal Block " + "\n");
                            break;
                        case 5:
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Chips Defense for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 6:
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Trips for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 7:
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Disciplines for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                    }
                } else if (whosturnisitanyway == 1) {

                    switch (playermonster.Moveslotattack) {

                        case 0:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Wounds For a " + String.format(displaystring, elongatedwoundtimerA) + " Turn Bleed of " + String.format(displaystring, (int) Math.round(elongatedwoundpowerA)) + "\n");
                            break;
                        case 1:
                            if (delayedblastpowerP > 0) {
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Prepares Delayed Blast of " + String.format(displaystring, (int) Math.round(delayedblastpowerP)) + "\n");
                            } else {
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Fails To Prepare Delayed Blast " + "\n");
                            }
                            break;
                        case 2:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, elongatedhealwoundtimerA) + " Turn Grevious Wounds of " + String.format(displaystring, (int) Math.round(elongatedhealwoundpowerA)) + "\n");
                            break;
                        case 3:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, elongatedglugtimerP) + " Turn Slow Drain of " + String.format(displaystring, (int) Math.round(elongatedglugpowerP)) + " From " + names(attackermonster.Idnum) + "\n");
                            break;
                        case 4:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, healblocktgimerP) + " Turn Heal Block " + "\n");
                            break;
                        case 5:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Chips Defense for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 6:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Trips for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 7:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Disciplines for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                    }
                }
            }
        }


        if (playermonster.Health <= 0){


            CombatString = String.format(CombatString + names(playermonster.Idnum) + " is Unable To battle " + "\n");

        }

        if (attackermonster.Health <= 0){


            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " is Unable To battle " + "\n");

        }

        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);
        /*
                            whosturnisitanyway = 0;
                            if(attackermonster.Moveslotheal == 0) {
                                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                                    attackermonster.Health = attackermonster.Health + Damage;
                                }
                                if (elongatedhealwoundtimerA != 0) {
                                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                                    attackermonster.Health = attackermonster.Health + Math.round(Damage/2);
                                }
                            }else if (attackermonster.Moveslotheal == 1) {
                                delayedhealpowerA = (int) (((new Random().nextInt(11) + 65)) * (attackermonster.Speed / attackermonster.Defense));
                                if(delayedhealtimerA == 0) {
                                    delayedhealtimerA = 1;
                                }
                            }  else if (attackermonster.Moveslotheal == 2){
                                elongatedhealtimerA = elongatedhealtimerA + 5;
                                int healtester = (3 * ((int) (((new Random().nextInt(11) + 65)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
                                healtester = Math.round(healtester);
                                if (healtester > elongatedhealpowerA) {
                                    elongatedhealpowerA = healtester;
                                }
                            }else if(attackermonster.Moveslotheal == 3){
                                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Defense));
                                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                                    attackermonster.Health = attackermonster.Health + Damage;
                                }else if (elongatedhealwoundtimerA > 0 && healblocktgimerP == 0){
                                    attackermonster.Health = attackermonster.Health + Math.round(Damage/2);
                                }
                                playermonster.Health = playermonster.Health - Damage;
                            }else if(attackermonster.Moveslotheal == 4){
                                healblocktgimerP = 0;
                                elongatedhealwoundtimerA = 0;
                                elongatedwoundtimerA = 0;
                                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Speed / attackermonster.Defense));
                                attackermonster.Health = attackermonster.Health + Damage;
                            }
                            if (attackermonster.Health > MaxHealthAttacker){
                                attackermonster.Health = MaxHealthAttacker;
                            }*/

    }

    public void  FirstTurnMethod(){
//pampeg
        attackermonster.Moveslotspeed = new Random().nextInt(14);
        attackermonster.Moveslotheal = new Random().nextInt(6);
        playermonster.Moveslotspeed = new Random().nextInt(14);
        playermonster.Moveslotheal = new Random().nextInt(6);
        playermonster.Moveslotattack = new Random().nextInt(4);
        secondstartingmonster.Moveslotspeed = new Random().nextInt(14);
        secondstartingmonster.Moveslotheal = new Random().nextInt(6);
        secondstartingmonster.Moveslotattack = new Random().nextInt(4);
        attackermonster.Moveslotattack = new Random().nextInt(4);
        MaxHealthAttacker = attackermonster.Health;
        MaxHealthPlayer = playermonster.Health;

        PlayerMonsterStorage[MonsterStorageCounter] = playermonster;
        MonsterStorageCounter++;
        PlayerMonsterStorage[MonsterStorageCounter] = secondstartingmonster;
        MonsterStorageCounter++;

        ///* image debugging

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Kohboh.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Yuggle.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Knightstacean.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Honigkönig.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Tutewtoo.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;



        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Kunk.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Blanqast.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Strachid.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Degeissdt.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Osteoplang.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Bongu.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Жrachnid.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Ōbchovy.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Halocordate.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Ogo.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Rongzeed.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Grobhost.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Elocurl.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MonsterStorageCounter++;



       // */


        turncounter = 1;
        ImageChanger();
    }

    public void  StringDisplayMethod(){

        String Pattackstring = String.format(displaystring, (int) playermonster.Attack);
        String Pnamestring = String.format(displaystring, names(playermonster.Idnum));
        String Phealthstring = String.format(displaystringH, (int) playermonster.Health, (int) MaxHealthPlayer);
        String Pdefensestring = String.format(displaystring, (int) playermonster.Defense);
        String Pspeedstring = String.format(displaystring, (int) playermonster.Speed);
        String Pmovehealstring = String.format(displaystring, HealingMoveNames(playermonster.Moveslotheal));
        String Pmovespeedstring = String.format(displaystring, StatsMoveNames(playermonster.Moveslotspeed));
        String Eattackstring = String.format(displaystring, (int) attackermonster.Attack);
        String Enamestring = String.format(displaystring, names(attackermonster.Idnum));
        String Ehealthstring = String.format(displaystringH, (int) attackermonster.Health, (int) MaxHealthAttacker);
        String Edefensestring = String.format(displaystring, (int) attackermonster.Defense);
        String Espeedstring = String.format(displaystring, (int) attackermonster.Speed);
        String Emovehealstring = String.format(displaystring, HealingMoveNames(attackermonster.Moveslotheal));
        String Emovespeedstring = String.format(displaystring, StatsMoveNames(attackermonster.Moveslotspeed));
        String Pmovespecialstring = String.format(displaystring, SpecialMoveNames(playermonster.Moveslotattack));
        String Emovespecialstring = String.format(displaystring, SpecialMoveNames(attackermonster.Moveslotattack));

        Patk.setText("Attack: "+Pattackstring);
        Pdef.setText("Defense: "+Pdefensestring);
        Pspe.setText("Speed: "+Pspeedstring);
        Pheal.setText("Health: "+Phealthstring);
        Pname.setText(Pnamestring);
        PHmov.setText(Pmovehealstring);
        PSmov.setText(Pmovespeedstring);
        PAmov.setText(Pmovespecialstring);

        Eatk.setText("Attack: "+Eattackstring);
        Edef.setText("Defense: "+Edefensestring);
        Espe.setText("Speed: "+Espeedstring);
        Eheal.setText("Health: "+Ehealthstring);
        Ename.setText(Enamestring);
        EHmov.setText(Emovehealstring);
        ESmov.setText(Emovespeedstring);
        EAmov.setText(Emovespecialstring);

    }

    public int UniqueIdentifier(int needless){
        return new Random().nextInt(100000000);
    }


    public void RivalRevealer(){
        if (attackermonster.Health <= 0){
            RivalButton.setVisibility(View.VISIBLE);
        }else {
            RivalButton.setVisibility(View.INVISIBLE);
        }
        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);
    }

    public void ClearStatChanges(monst raw){
        raw.Attack = stats(monstlist((int)raw.Idnum).Attack);
        raw.Speed = stats(monstlist((int)raw.Idnum).Speed);
        raw.Defense = stats(monstlist((int)raw.Idnum).Defense);
    }


    public void StatAbuseCurb(monst raw){

        if (raw.Attack >= 750){
            raw.Attack = 750;
        }
        if (raw.Speed >= 750){
            raw.Speed = 750;
        }
        if (raw.Defense >= 750){
            raw.Defense = 750;
        }


        MonsterImageChangerPlayer(playermonster);

        MonsterImageChangerAttacker(attackermonster);

    }

    public void ResetWounds(){

        elongatedhealwoundpowerP = 0;
        elongatedwoundpowerP = 0;
        elongatedhealwoundtimerP = 0;
        elongatedwoundtimerP = 0;
        elongatedglugtimerA = 0;
        elongatedglugpowerA = 0;
        healblocktgimerA = 0;
    }


    public void DeathTest(){

        String WhatHappenedString = TypesOfMotions(2);
        String displaystring = "%s";
        String displaystringH = "%s/%s";
        if (!(playermonster.Health > 0 && attackermonster.Health > 0) && ActionNum == 0) {
            WhatHappenedString = TypesOfMotions(5); ActionNum = 1;

            if (playermonster.Health <= 0){
                CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
            }  if (attackermonster.Health <= 0){
                CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
            }if (attackermonster.Health <= 0 && playermonster.Health <= 0){
                CombatString = String.format(CombatString + "A Tie!"+"\n");
            }

        }
    }
    public void CapChanger(){

        Gson gson = new Gson();
        Context ProtomonContext = getApplicationContext();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
        SharedPreferences.Editor editor = prefs.edit();
        String json = prefs.getString("WorkingMonster", "");
        if (gson.fromJson(json, (Type) protomon.monst.class) != null) {
            spawncap = 83;
            rotationcap = 84;
        }

    }

    public void onResume() {
        super.onResume();
        CapChanger();
    }

    public void MonsterImageChangerPlayer(monst PlayerMonsterHandle){
        
        
        switch((int) PlayerMonsterHandle.Idnum){
            
case 0:
         //              //PlayerDisplay.setImageResource(R.drawable.errantnope);
                    break; 
case 1:
                PlayerDisplay.setImageResource(R.drawable.kunk);
                    break; 
case 2:
       PlayerDisplay.setImageResource(R.drawable.kohboh);
                    break; 
case 3:
        //               //PlayerDisplay.setImageResource(R.drawable.djoper);
                    break; 
case 4:
        //               //PlayerDisplay.setImageResource(R.drawable.schorp);
                    break; 
case 5:
         //              //PlayerDisplay.setImageResource(R.drawable.zaume);
                    break; 
case 6:
        //               //PlayerDisplay.setImageResource(R.drawable.nhainhai);
                    break; 
case 7:
              PlayerDisplay.setImageResource(R.drawable.degeissdt);
                    break; 
case 8:
          PlayerDisplay.setImageResource(R.drawable.yuggle);
                    break; 
case 9:
          PlayerDisplay.setImageResource(R.drawable.bongu);
                    break; 
case 10:
            //           //PlayerDisplay.setImageResource(R.drawable.giteriglia);
                    break; 
case 11:
           //            //PlayerDisplay.setImageResource(R.drawable.cyosteroth);
                    break; 
case 12:
                       //PlayerDisplay.setImageResource(R.drawable.Nentopode);
                    break; 
case 13:
                       //PlayerDisplay.setImageResource(R.drawable.centiclak);
                    break; 
case 14:
                       //PlayerDisplay.setImageResource(R.drawable.Uggnawb);
                    break; 
case 15:
                   PlayerDisplay.setImageResource(R.drawable.grobhost);
                    break; 
case 16:
                       //PlayerDisplay.setImageResource(R.drawable.Illelonab);
                    break; 
case 17:
                   PlayerDisplay.setImageResource(R.drawable.rongzeed);
                    break; 
case 18:
                       //PlayerDisplay.setImageResource(R.drawable.blattle);
                    break; 
case 19:
                       //PlayerDisplay.setImageResource(R.drawable.Swogharnler);
                    break; 
case 20:
                       //PlayerDisplay.setImageResource(R.drawable.adenolish);
                    break; 
case 21:
                       //PlayerDisplay.setImageResource(R.drawable.Genaupresang);
                    break; 
case 22:
                       //PlayerDisplay.setImageResource(R.drawable.daahnida);
                    break; 
case 23:
                       //PlayerDisplay.setImageResource(R.drawable.Sorba);
                    break; 
case 24:
                       //PlayerDisplay.setImageResource(R.drawable.Jiyou);
                    break; 
case 25:
                       //PlayerDisplay.setImageResource(R.drawable.Sparvae);
                    break; 
case 26:
                       //PlayerDisplay.setImageResource(R.drawable.Vellup);
                    break; 
case 27:
                       //PlayerDisplay.setImageResource(R.drawable.bellaja);
                    break; 
case 28:
                       //PlayerDisplay.setImageResource(R.drawable.Levdzell);
                    break; 
case 29:
                       //PlayerDisplay.setImageResource(R.drawable.Rytegg);
                    break; 
case 30:
                       //PlayerDisplay.setImageResource(R.drawable.Flashmer);
                    break; 
case 31:
                       //PlayerDisplay.setImageResource(R.drawable.Schmodozer);
                    break; 
case 32:
                       //PlayerDisplay.setImageResource(R.drawable.Octgotot);
                    break; 
case 33:
                       //PlayerDisplay.setImageResource(R.drawable.Triaural);
                    break; 
case 34:
                       //PlayerDisplay.setImageResource(R.drawable.dicyto);
                    break; 
case 35:
                       //PlayerDisplay.setImageResource(R.drawable.Monopteryx);
                    break; 
case 36:
                       //PlayerDisplay.setImageResource(R.drawable.Elastocark);
                    break; 
case 37:
                       //PlayerDisplay.setImageResource(R.drawable.Toobapath);
                    break; 
case 38:
                       //PlayerDisplay.setImageResource(R.drawable.Weeliosbop);
                    break; 
case 39:
                       //PlayerDisplay.setImageResource(R.drawable.Ihmpdrap);
                    break; 
case 40:
                       //PlayerDisplay.setImageResource(R.drawable.Epibazang);
                    break; 
case 41:
                       //PlayerDisplay.setImageResource(R.drawable.Hemtan);
                    break; 
case 42:
                     PlayerDisplay.setImageResource(R.drawable.ogo);
                    break; 
case 43:
                       PlayerDisplay.setImageResource(R.drawable.strachid);
                    break; 
case 44:
                       //PlayerDisplay.setImageResource(R.drawable.Toximastica);
                    break; 
case 45:
                       //PlayerDisplay.setImageResource(R.drawable.Urcuria);
                    break; 
case 46:
                       //PlayerDisplay.setImageResource(R.drawable.Hyuntress);
                    break; 
case 47:
                       //PlayerDisplay.setImageResource(R.drawable.Mondosplak);
                    break; 
case 48:
                       //PlayerDisplay.setImageResource(R.drawable.Kaheksaguge);
                    break; 
case 49:
                       //PlayerDisplay.setImageResource(R.drawable.Sapiosuant);
                    break; 
case 50:
                       //PlayerDisplay.setImageResource(R.drawable.Munegull);
                    break; 
case 51:
                       //PlayerDisplay.setImageResource(R.drawable.Sudakleez);
                    break; 
case 52:
                     PlayerDisplay.setImageResource(R.drawable.halocordate);
                    break; 
case 53:
                       //PlayerDisplay.setImageResource(R.drawable.Fædendron);
                    break; 
case 54:
                       PlayerDisplay.setImageResource(R.drawable.osteoplang);
                    break; 
case 55:
                      PlayerDisplay.setImageResource(R.drawable.zrachnid);
                    break; 
case 56:
                       //PlayerDisplay.setImageResource(R.drawable.Ϫlitch);
                    break; 
case 57:
                       //PlayerDisplay.setImageResource(R.drawable.በ);
                    break; 
case 58:
                       //PlayerDisplay.setImageResource(R.drawable.Mantidile);
                    break; 
case 59:
                       //PlayerDisplay.setImageResource(R.drawable.Nokoyl);
                    break; 
case 60:
                       //PlayerDisplay.setImageResource(R.drawable.Яallod);
                    break; 
case 61:
                       //PlayerDisplay.setImageResource(R.drawable.algaetizer);
                    break; 
case 62:
                       //PlayerDisplay.setImageResource(R.drawable.Kachort);
                    break; 
case 63:
                       //PlayerDisplay.setImageResource(R.drawable.Slamelion);
                    break; 
case 64:
                       //PlayerDisplay.setImageResource(R.drawable.ayateda);
                    break; 
case 65:
                       //PlayerDisplay.setImageResource(R.drawable.Wochem);
                    break; 
case 66:
                       //PlayerDisplay.setImageResource(R.drawable.Ƕmun);
                    break; 
case 67:
                       //PlayerDisplay.setImageResource(R.drawable.Ψkobath);
                    break; 
case 68:
                       //PlayerDisplay.setImageResource(R.drawable.Gytanic);
                    break; 
case 69:
                       //PlayerDisplay.setImageResource(R.drawable.beis);
                    break; 
case 70:
                       //PlayerDisplay.setImageResource(R.drawable.gungholio);
                    break; 
case 71:
                       PlayerDisplay.setImageResource(R.drawable.honigkonig);
                    break; 
case 72:
                       //PlayerDisplay.setImageResource(R.drawable.Kungulp);
                    break; 
case 73:
                       //PlayerDisplay.setImageResource(R.drawable.satinella);
                    break; 
case 74:
                       PlayerDisplay.setImageResource(R.drawable.elocurl);
                    break; 
case 75:
                       //PlayerDisplay.setImageResource(R.drawable.Takobie);
                    break; 
case 76:
                     PlayerDisplay.setImageResource(R.drawable.obchovy);
                    break; 
case 77:
                       //PlayerDisplay.setImageResource(R.drawable.Nimnamnom);
                    break; 
case 78:
                      PlayerDisplay.setImageResource(R.drawable.tutewtoo);
                    break; 
case 79:
                       PlayerDisplay.setImageResource(R.drawable.blanqast);
                    break; 
case 80:
                       //PlayerDisplay.setImageResource(R.drawable.Indeo);
                    break; 
case 81:
                       //PlayerDisplay.setImageResource(R.drawable.deblobbio);
                    break; 
case 82:
     PlayerDisplay.setImageResource(R.drawable.knightstacean);
    break;
    
        }
        
        
    }
public void MonsterImageChangerAttacker(monst AttackerMonsterHandle){
        
        
        switch((int) AttackerMonsterHandle.Idnum){
            
case 0:
         //              //EnemyDisplay.setImageResource(R.drawable.errantnope);
                    break; 
case 1:
                 EnemyDisplay.setImageResource(R.drawable.kunk);
                    break; 
case 2:
       EnemyDisplay.setImageResource(R.drawable.kohboh);
                    break; 
case 3:
        //               //EnemyDisplay.setImageResource(R.drawable.djoper);
                    break; 
case 4:
        //               //EnemyDisplay.setImageResource(R.drawable.schorp);
                    break; 
case 5:
         //              //EnemyDisplay.setImageResource(R.drawable.zaume);
                    break; 
case 6:
        //               //EnemyDisplay.setImageResource(R.drawable.nhainhai);
                    break; 
case 7:
              EnemyDisplay.setImageResource(R.drawable.degeissdt);
                    break; 
case 8:
          EnemyDisplay.setImageResource(R.drawable.yuggle);
                    break; 
case 9:
            EnemyDisplay.setImageResource(R.drawable.bongu);
                    break; 
case 10:
            //           //EnemyDisplay.setImageResource(R.drawable.giteriglia);
                    break; 
case 11:
           //            //EnemyDisplay.setImageResource(R.drawable.cyosteroth);
                    break; 
case 12:
                       //EnemyDisplay.setImageResource(R.drawable.Nentopode);
                    break; 
case 13:
                       //EnemyDisplay.setImageResource(R.drawable.centiclak);
                    break; 
case 14:
                       //EnemyDisplay.setImageResource(R.drawable.Uggnawb);
                    break; 
case 15:
                       EnemyDisplay.setImageResource(R.drawable.grobhost);
                    break; 
case 16:
                       //EnemyDisplay.setImageResource(R.drawable.Illelonab);
                    break; 
case 17:
                      EnemyDisplay.setImageResource(R.drawable.rongzeed);
                    break; 
case 18:
                       //EnemyDisplay.setImageResource(R.drawable.blattle);
                    break; 
case 19:
                       //EnemyDisplay.setImageResource(R.drawable.Swogharnler);
                    break; 
case 20:
                       //EnemyDisplay.setImageResource(R.drawable.adenolish);
                    break; 
case 21:
                       //EnemyDisplay.setImageResource(R.drawable.Genaupresang);
                    break; 
case 22:
                       //EnemyDisplay.setImageResource(R.drawable.daahnida);
                    break; 
case 23:
                       //EnemyDisplay.setImageResource(R.drawable.Sorba);
                    break; 
case 24:
                       //EnemyDisplay.setImageResource(R.drawable.Jiyou);
                    break; 
case 25:
                       //EnemyDisplay.setImageResource(R.drawable.Sparvae);
                    break; 
case 26:
                       //EnemyDisplay.setImageResource(R.drawable.Vellup);
                    break; 
case 27:
                       //EnemyDisplay.setImageResource(R.drawable.bellaja);
                    break; 
case 28:
                       //EnemyDisplay.setImageResource(R.drawable.Levdzell);
                    break; 
case 29:
                       //EnemyDisplay.setImageResource(R.drawable.Rytegg);
                    break; 
case 30:
                       //EnemyDisplay.setImageResource(R.drawable.Flashmer);
                    break; 
case 31:
                       //EnemyDisplay.setImageResource(R.drawable.Schmodozer);
                    break; 
case 32:
                       //EnemyDisplay.setImageResource(R.drawable.Octgotot);
                    break; 
case 33:
                       //EnemyDisplay.setImageResource(R.drawable.Triaural);
                    break; 
case 34:
                       //EnemyDisplay.setImageResource(R.drawable.dicyto);
                    break; 
case 35:
                       //EnemyDisplay.setImageResource(R.drawable.Monopteryx);
                    break; 
case 36:
                       //EnemyDisplay.setImageResource(R.drawable.Elastocark);
                    break; 
case 37:
                       //EnemyDisplay.setImageResource(R.drawable.Toobapath);
                    break; 
case 38:
                       //EnemyDisplay.setImageResource(R.drawable.Weeliosbop);
                    break; 
case 39:
                       //EnemyDisplay.setImageResource(R.drawable.Ihmpdrap);
                    break; 
case 40:
                       //EnemyDisplay.setImageResource(R.drawable.Epibazang);
                    break; 
case 41:
                       //EnemyDisplay.setImageResource(R.drawable.Hemtan);
                    break; 
case 42:
                      EnemyDisplay.setImageResource(R.drawable.ogo);
                    break; 
case 43:
                       EnemyDisplay.setImageResource(R.drawable.strachid);
                    break; 
case 44:
                       //EnemyDisplay.setImageResource(R.drawable.Toximastica);
                    break; 
case 45:
                       //EnemyDisplay.setImageResource(R.drawable.Urcuria);
                    break; 
case 46:
                       //EnemyDisplay.setImageResource(R.drawable.Hyuntress);
                    break; 
case 47:
                       //EnemyDisplay.setImageResource(R.drawable.Mondosplak);
                    break; 
case 48:
                       //EnemyDisplay.setImageResource(R.drawable.Kaheksaguge);
                    break; 
case 49:
                       //EnemyDisplay.setImageResource(R.drawable.Sapiosuant);
                    break; 
case 50:
                       //EnemyDisplay.setImageResource(R.drawable.Munegull);
                    break; 
case 51:
                       //EnemyDisplay.setImageResource(R.drawable.Sudakleez);
                    break; 
case 52:
                      EnemyDisplay.setImageResource(R.drawable.halocordate);
                    break; 
case 53:
                       //EnemyDisplay.setImageResource(R.drawable.Fædendron);
                    break; 
case 54:
                       EnemyDisplay.setImageResource(R.drawable.osteoplang);
                    break; 
case 55:
                       EnemyDisplay.setImageResource(R.drawable.zrachnid);
                    break; 
case 56:
                       //EnemyDisplay.setImageResource(R.drawable.Ϫlitch);
                    break; 
case 57:
                       //EnemyDisplay.setImageResource(R.drawable.በ);
                    break; 
case 58:
                       //EnemyDisplay.setImageResource(R.drawable.Mantidile);
                    break; 
case 59:
                       //EnemyDisplay.setImageResource(R.drawable.Nokoyl);
                    break; 
case 60:
                       //EnemyDisplay.setImageResource(R.drawable.Яallod);
                    break; 
case 61:
                       //EnemyDisplay.setImageResource(R.drawable.algaetizer);
                    break; 
case 62:
                       //EnemyDisplay.setImageResource(R.drawable.Kachort);
                    break; 
case 63:
                       //EnemyDisplay.setImageResource(R.drawable.Slamelion);
                    break; 
case 64:
                       //EnemyDisplay.setImageResource(R.drawable.ayateda);
                    break; 
case 65:
                       //EnemyDisplay.setImageResource(R.drawable.Wochem);
                    break; 
case 66:
                       //EnemyDisplay.setImageResource(R.drawable.Ƕmun);
                    break; 
case 67:
                       //EnemyDisplay.setImageResource(R.drawable.Ψkobath);
                    break; 
case 68:
                       //EnemyDisplay.setImageResource(R.drawable.Gytanic);
                    break; 
case 69:
                       //EnemyDisplay.setImageResource(R.drawable.beis);
                    break; 
case 70:
                       //EnemyDisplay.setImageResource(R.drawable.gungholio);
                    break; 
case 71:
                      EnemyDisplay.setImageResource(R.drawable.honigkonig);
                    break; 
case 72:
                       //EnemyDisplay.setImageResource(R.drawable.Kungulp);
                    break; 
case 73:
                       //EnemyDisplay.setImageResource(R.drawable.satinella);
                    break; 
case 74:
                       EnemyDisplay.setImageResource(R.drawable.elocurl);
                    break; 
case 75:
                       //EnemyDisplay.setImageResource(R.drawable.Takobie);
                    break; 
case 76:
                     EnemyDisplay.setImageResource(R.drawable.obchovy);
                    break; 
case 77:
                       //EnemyDisplay.setImageResource(R.drawable.Nimnamnom);
                    break; 
case 78:
                       EnemyDisplay.setImageResource(R.drawable.tutewtoo);
                    break; 
case 79:
                       EnemyDisplay.setImageResource(R.drawable.blanqast);
                    break; 
case 80:
                       //EnemyDisplay.setImageResource(R.drawable.Indeo);
                    break; 
case 81:
                       //EnemyDisplay.setImageResource(R.drawable.deblobbio);
                    break; 
case 82:
     EnemyDisplay.setImageResource(R.drawable.knightstacean);
    break;
    
        }
        
        
    }

}