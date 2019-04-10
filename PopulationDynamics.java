package ditzler.cole.stableapp;

import android.graphics.Color;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Random;

public class PopulationDynamics extends AppCompatActivity {


    int startflip = 0;

    public class AgentObject {
        public ImageView Gridspot;
        public protomon.monst Agent;

        public AgentObject (ImageView gridspot, protomon.monst agent){

          Gridspot = gridspot;
          Agent = agent;
        }
    }

    int catcher = 0;
    int switchroller = -1;
    
    ImageView a01, a02, a03, a04, a05, a06, a07, a08, a09, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, b01, b02, b03, b04, b05, b06, b07, b08, b09, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, c01, c02, c03, c04, c05, c06, c07, c08, c09, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, d01, d02, d03, d04, d05, d06, d07, d08, d09, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, e01, e02, e03, e04, e05, e06, e07, e08, e09, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, f01, f02, f03, f04, f05, f06, f07, f08, f09, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, g01, g02, g03, g04, g05, g06, g07, g08, g09, g10, g11, g12, g13, g14, g15, g16, g17, g18, g19, h01, h02, h03, h04, h05, h06, h07, h08, h09, h10, h11, h12, h13, h14, h15, h16, h17, h18, h19, i01, i02, i03, i04, i05, i06, i07, i08, i09, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, j01, j02, j03, j04, j05, j06, j07, j08, j09, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, k01, k02, k03, k04, k05, k06, k07, k08, k09, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, l01, l02, l03, l04, l05, l06, l07, l08, l09, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, m01, m02, m03, m04, m05, m06, m07, m08, m09, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, n01, n02, n03, n04, n05, n06, n07, n08, n09, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, o01, o02, o03, o04, o05, o06, o07, o08, o09, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, p01, p02, p03, p04, p05, p06, p07, p08, p09, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, q01, q02, q03, q04, q05, q06, q07, q08, q09, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, r01, r02, r03, r04, r05, r06, r07, r08, r09, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, s01, s02, s03, s04, s05, s06, s07, s08, s09, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, t01, t02, t03, t04, t05, t06, t07, t08, t09, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, a20, b20, c20, d20, e20, f20, g20, h20, i20, j20, k20, l20, m20, n20, o20, p20, q20, r20, s20, t20;
    Button RandomButton, ClearButton, TestButton;


    int arrayfillercount = 0;



    public double kunkid = 1;
    public double kunkat = 75;
    public double kunksp = 60;
    public double kunkde = 120;
    public double kunkhe = 185;
    // MediaPlayer KunkSong;

    public double kohbohid = 2;
    public double kohbohat = 101; //100
    public double kohbohsp = 101; //100
    public double kohbohde = 101; //100
    public double kohbohhe = 101; //100
    // MediaPlayer KohbohSong;

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
    public double uggnawbsp = 159; // Real Uggnawb
    public double uggnawbde = 60;
    public double uggnawbhe = 160;

    /*   public double uggnawbid = 14;
    public double uggnawbat = 51;
    public double uggnawbsp = 214; // boosted Uggnawb
    public double uggnawbde = 51;
    public double uggnawbhe = 200;*/

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
    public double swogharnlerat = 119; // 113
    public double swogharnlersp = 69;
    public double swogharnlerde = 119; // 113
    public double swogharnlerhe = 119; // 113

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
    public double daahnidahe = 61;

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

    public double prostraxid = 83;
    public double prostraxat = 325; //
    public double prostraxsp = 52; //
    public double prostraxde = 70; //
    public double prostraxhe = 88;  //

    public double haptozahenid = 84;
    public double haptozahenat = 52; //
    public double haptozahensp = 325; //
    public double haptozahende = 109; //
    public double haptozahenhe = 109;  //

    public double minkohabodid = 85;
    public double minkohabodat = 52; //
    public double minkohabodsp = 52; //
    public double minkohabodde = 325; //
    public double minkohabodhe = 52;  //

    protomon.monst Kunk = new protomon.monst(kunkid, kunksp, kunkat, kunkde, kunkhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Djoper = new protomon.monst(djoperid, djopersp, djoperat, djoperde, djoperhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Schorp = new protomon.monst(schorpid, schorpsp, schorpat, schorpde, schorphe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Zaume = new protomon.monst(zaumeid, zaumesp, zaumeat, zaumede, zaumehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Nhainhai = new protomon.monst(nhainhaiid, nhainhaisp, nhainhaiat, nhainhaide, nhainhaihe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Kohboh = new protomon.monst(kohbohid, kohbohsp, kohbohat, kohbohde, kohbohhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Degeissdt = new protomon.monst(degeissdtid, degeissdtsp, degeissdtat, degeissdtde, degeissdthe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Yuggle = new protomon.monst(yuggleid, yugglesp, yuggleat, yugglede, yugglehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Bongu = new protomon.monst(bonguid, bongusp, bonguat, bongude, bonguhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Giteriglia = new protomon.monst(giterigliaid, giterigliasp, giterigliaat, giterigliade, giterigliahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Cyosteroth = new protomon.monst(cyosterothid, cyosterothsp, cyosterothat, cyosterothde, cyosterothhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Nentopode = new protomon.monst(nentopodeid, nentopodesp, nentopodeat, nentopodede, nentopodehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Centiclak = new protomon.monst(centiclakid, centiclaksp, centiclakat, centiclakde, centiclakhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Uggnawb = new protomon.monst(uggnawbid, uggnawbsp, uggnawbat, uggnawbde, uggnawbhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Grobhost = new protomon.monst(grobhostid, grobhostsp, grobhostat, grobhostde, grobhosthe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Illelonab = new protomon.monst(illelonabid, illelonabsp, illelonabat, illelonabde, illelonabhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Rongzeed = new protomon.monst(rongzeedid, rongzeedsp, rongzeedat, rongzeedde, rongzeedhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Blattle = new protomon.monst(blattleid, blattlesp, blattleat, blattlede, blattlehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Swogharnler = new protomon.monst(swogharnlerid, swogharnlersp, swogharnlerat, swogharnlerde, swogharnlerhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Adenolish = new protomon.monst(adenolishid, adenolishsp, adenolishat, adenolishde, adenolishhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Genaupresang = new protomon.monst(genaupresangid, genaupresangsp, genaupresangat, genaupresangde, genaupresanghe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    // monst Daahnida = new monst(daahnidaid, daahnidasp, daahnidaat, daahnidade, daahnidahe, 0,4,0,2);
    protomon.monst Daahnida = new protomon.monst(daahnidaid, daahnidasp, daahnidaat, daahnidade, daahnidahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Sorba = new protomon.monst(sorbaid, sorbasp, sorbaat, sorbade, sorbahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Jiyou = new protomon.monst(jiyouid, jiyousp, jiyouat, jiyoude, jiyouhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Sparvae = new protomon.monst(sparvaeid, sparvaesp, sparvaeat, sparvaede, sparvaehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Vellup = new protomon.monst(vellupid, vellupsp, vellupat, vellupde, velluphe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Bellaja = new protomon.monst(bellajaid, bellajasp, bellajaat, bellajade, bellajahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Levdzell = new protomon.monst(levdzellid, levdzellsp, levdzellat, levdzellde, levdzellhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Rytegg = new protomon.monst(ryteggid, ryteggsp, ryteggat, ryteggde, rytegghe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Flashmer = new protomon.monst(flashmerid, flashmersp, flashmerat, flashmerde, flashmerhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Schmodozer = new protomon.monst(schmodozerid, schmodozersp, schmodozerat, schmodozerde, schmodozerhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Octgotot = new protomon.monst(octgototid, octgototsp, octgototat, octgototde, octgotothe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Triaural = new protomon.monst(triauralid, triauralsp, triauralat, triauralde, triauralhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Dicyto = new protomon.monst(dicytoid, dicytosp, dicytoat, dicytode, dicytohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Monopteryx = new protomon.monst(monopteryxid, monopteryxsp, monopteryxat, monopteryxde, monopteryxhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Elastocark = new protomon.monst(elastocarkid, elastocarksp, elastocarkat, elastocarkde, elastocarkhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Toobapath = new protomon.monst(toobapathid, toobapathsp, toobapathat, toobapathde, toobapathhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Weeliosbop = new protomon.monst(weeliosbopid, weeliosbopsp, weeliosbopat, weeliosbopde, weeliosbophe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ihmpdrap = new protomon.monst(ihmpdrapid, ihmpdrapsp, ihmpdrapat, ihmpdrapde, ihmpdraphe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Epibazang = new protomon.monst(epibazangid, epibazangsp, epibazangat, epibazangde, epibazanghe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Hemtan = new protomon.monst(hemtanid, hemtansp, hemtanat, hemtande, hemtanhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ogo = new protomon.monst(ogoid, ogosp, ogoat, ogode, ogohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Strachid = new protomon.monst(strachidid, strachidsp, strachidat, strachidde, strachidhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Toximastica = new protomon.monst(toximasticaid, toximasticasp, toximasticaat, toximasticade, toximasticahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Urcuria = new protomon.monst(urcuriaid, urcuriasp, urcuriaat, urcuriade, urcuriahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Hyuntress = new protomon.monst(hyuntressid, hyuntresssp, hyuntressat, hyuntressde, hyuntresshe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Mondosplak = new protomon.monst(mondosplakid, mondosplaksp, mondosplakat, mondosplakde, mondosplakhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Kaheksaguge = new protomon.monst(kaheksagugeid, kaheksagugesp, kaheksagugeat, kaheksagugede, kaheksagugehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Sapiosuant = new protomon.monst(sapiosuantid, sapiosuantsp, sapiosuantat, sapiosuantde, sapiosuanthe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Munegull = new protomon.monst(munegullid, munegullsp, munegullat, munegullde, munegullhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Sudakleez = new protomon.monst(sudakleezid, sudakleezsp, sudakleezat, sudakleezde, sudakleezhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Halocordate = new protomon.monst(halocordateid, halocordatesp, halocordateat, halocordatede, halocordatehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Fædendron = new protomon.monst(fædendronid, fædendronsp, fædendronat, fædendronde, fædendronhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Osteoplang = new protomon.monst(osteoplangid, osteoplangsp, osteoplangat, osteoplangde, osteoplanghe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Жrachnid = new protomon.monst(жrachnidid, жrachnidsp, жrachnidat, жrachnidde, жrachnidhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ϫlitch = new protomon.monst(Ϫlitchid, Ϫlitchsp, Ϫlitchat, Ϫlitchde, Ϫlitchhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst በ = new protomon.monst(በid, በsp, በat, በde, በhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Mantidile = new protomon.monst(mantidileid, mantidilesp, mantidileat, mantidilede, mantidilehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Nokoyl = new protomon.monst(nokoylid, nokoylsp, nokoylat, nokoylde, nokoylhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Яallod = new protomon.monst(яallodid, яallodsp, яallodat, яallodde, яallodhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Algaetizer = new protomon.monst(algaetizerid, algaetizersp, algaetizerat, algaetizerde, algaetizerhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Kachort = new protomon.monst(kachortid, kachortsp, kachortat, kachortde, kachorthe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Slamelion = new protomon.monst(slamelionid, slamelionsp, slamelionat, slamelionde, slamelionhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ayateda = new protomon.monst(ayatedaid, ayatedasp, ayatedaat, ayatedade, ayatedahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Wochem = new protomon.monst(wochemid, wochemsp, wochemat, wochemde, wochemhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ƕmun = new protomon.monst(Ƕmunid, Ƕmunsp, Ƕmunat, Ƕmunde, Ƕmunhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ψkobath = new protomon.monst(ψkobathid, ψkobathsp, ψkobathat, ψkobathde, ψkobathhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Gytanic = new protomon.monst(gytanicid, gytanicsp, gytanicat, gytanicde, gytaniche, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst βeiß = new protomon.monst(βeißid, βeißsp, βeißat, βeißde, βeißhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Gungholio = new protomon.monst(gungholioid, gungholiosp, gungholioat, gungholiode, gungholiohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Honigkönig = new protomon.monst(honigkönigid, honigkönigsp, honigkönigat, honigkönigde, honigkönighe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Kungulp = new protomon.monst(kungulpid, kungulpsp, kungulpat, kungulpde, kungulphe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Σatinella = new protomon.monst(σatinellaid, σatinellasp, σatinellaat, σatinellade, σatinellahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Elocurl = new protomon.monst(elocurlid, elocurlsp, elocurlat, elocurlde, elocurlhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Takobie = new protomon.monst(takobieid, takobiesp, takobieat, takobiede, takobiehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ōbchovy = new protomon.monst(ōbchovyid, ōbchovysp, ōbchovyat, ōbchovyde, ōbchovyhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Nimnamnom = new protomon.monst(nimnamnomid, nimnamnomsp, nimnamnomat, nimnamnomde, nimnamnomhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Tutewtoo = new protomon.monst(tutewtooid, tutewtoosp, tutewtooat, tutewtoode, tutewtoohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Blanqast = new protomon.monst(blanqastid, blanqastsp, blanqastat, blanqastde, blanqasthe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Indeo = new protomon.monst(indeoid, indeosp, indeoat, indeode, indeohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Deblobbio = new protomon.monst(deblobbioid, deblobbiosp, deblobbioat, deblobbiode, deblobbiohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Knightstacean = new protomon.monst(knightstaceanid, knightstaceansp, knightstaceanat, knightstaceande, knightstaceanhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Prostrax = new protomon.monst(prostraxid, prostraxsp, prostraxat, prostraxde, prostraxhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Haptozahen = new protomon.monst(haptozahenid, haptozahensp, haptozahenat, haptozahende, haptozahenhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Minkohabod = new protomon.monst(minkohabodid, minkohabodsp, minkohabodat, minkohabodde, minkohabodhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Custom = new protomon.monst(86, 51, 51, 51, 51, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst error = new protomon.monst(0, 51, 51, 51, 753, 0,0,0,0,0);

    AgentObject emptybox = new AgentObject(a01, Takobie);


    AgentObject[] AgentPositions = {emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox, emptybox};

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // DarkView = getLayoutInflater().inflate(R.layout.garlitos_lab_activity, null);
        setContentView(R.layout.dynamics_activity);

        RandomButton = findViewById(R.id.Randomizer);
        ClearButton = findViewById(R.id.Clear);
        TestButton = findViewById(R.id.Test);

        a20 = findViewById(R.id.A20);
        b20 = findViewById(R.id.B20);
        c20 = findViewById(R.id.C20);
        d20 = findViewById(R.id.D20);
        e20 = findViewById(R.id.E20);
        f20 = findViewById(R.id.F20);
        g20 = findViewById(R.id.G20);
        h20 = findViewById(R.id.H20);
        i20 = findViewById(R.id.I20);
        j20 = findViewById(R.id.J20);
        k20 = findViewById(R.id.K20);
        l20 = findViewById(R.id.L20);
        m20 = findViewById(R.id.M20);
        n20 = findViewById(R.id.N20);
        o20 = findViewById(R.id.O20);
        p20 = findViewById(R.id.P20);
        q20 = findViewById(R.id.Q20);
        r20 = findViewById(R.id.R20);
        s20 = findViewById(R.id.S20);
        t20 = findViewById(R.id.T20);

        a01 = findViewById(R.id.A01);
        a02 = findViewById(R.id.A02);
        a03 = findViewById(R.id.A03);
        a04 = findViewById(R.id.A04);
        a05 = findViewById(R.id.A05);
        a06 = findViewById(R.id.A06);
        a07 = findViewById(R.id.A07);
        a08 = findViewById(R.id.A08);
        a09 = findViewById(R.id.A09);
        a10 = findViewById(R.id.A10);
        a11 = findViewById(R.id.A11);
        a12 = findViewById(R.id.A12);
        a13 = findViewById(R.id.A13);
        a14 = findViewById(R.id.A14);
        a15 = findViewById(R.id.A15);
        a16 = findViewById(R.id.A16);
        a17 = findViewById(R.id.A17);
        a18 = findViewById(R.id.A18);
        a19 = findViewById(R.id.A19);
        
        b01 = findViewById(R.id.B01);
        b02 = findViewById(R.id.B02);
        b03 = findViewById(R.id.B03);
        b04 = findViewById(R.id.B04);
        b05 = findViewById(R.id.B05);
        b06 = findViewById(R.id.B06);
        b07 = findViewById(R.id.B07);
        b08 = findViewById(R.id.B08);
        b09 = findViewById(R.id.B09);
        b10 = findViewById(R.id.B10);
        b11 = findViewById(R.id.B11);
        b12 = findViewById(R.id.B12);
        b13 = findViewById(R.id.B13);
        b14 = findViewById(R.id.B14);
        b15 = findViewById(R.id.B15);
        b16 = findViewById(R.id.B16);
        b17 = findViewById(R.id.B17);
        b18 = findViewById(R.id.B18);
        b19 = findViewById(R.id.B19);

        
        c01 = findViewById(R.id.C01);
        c02 = findViewById(R.id.C02);
        c03 = findViewById(R.id.C03);
        c04 = findViewById(R.id.C04);
        c05 = findViewById(R.id.C05);
        c06 = findViewById(R.id.C06);
        c07 = findViewById(R.id.C07);
        c08 = findViewById(R.id.C08);
        c09 = findViewById(R.id.C09);
        c10 = findViewById(R.id.C10);
        c11 = findViewById(R.id.C11);
        c12 = findViewById(R.id.C12);
        c13 = findViewById(R.id.C13);
        c14 = findViewById(R.id.C14);
        c15 = findViewById(R.id.C15);
        c16 = findViewById(R.id.C16);
        c17 = findViewById(R.id.C17);
        c18 = findViewById(R.id.C18);
        c19 = findViewById(R.id.C19);

        
        d01 = findViewById(R.id.D01);
        d02 = findViewById(R.id.D02);
        d03 = findViewById(R.id.D03);
        d04 = findViewById(R.id.D04);
        d05 = findViewById(R.id.D05);
        d06 = findViewById(R.id.D06);
        d07 = findViewById(R.id.D07);
        d08 = findViewById(R.id.D08);
        d09 = findViewById(R.id.D09);
        d10 = findViewById(R.id.D10);
        d11 = findViewById(R.id.D11);
        d12 = findViewById(R.id.D12);
        d13 = findViewById(R.id.D13);
        d14 = findViewById(R.id.D14);
        d15 = findViewById(R.id.D15);
        d16 = findViewById(R.id.D16);
        d17 = findViewById(R.id.D17);
        d18 = findViewById(R.id.D18);
        d19 = findViewById(R.id.D19);

        
        e01 = findViewById(R.id.E01);
        e02 = findViewById(R.id.E02);
        e03 = findViewById(R.id.E03);
        e04 = findViewById(R.id.E04);
        e05 = findViewById(R.id.E05);
        e06 = findViewById(R.id.E06);
        e07 = findViewById(R.id.E07);
        e08 = findViewById(R.id.E08);
        e09 = findViewById(R.id.E09);
        e10 = findViewById(R.id.E10);
        e11 = findViewById(R.id.E11);
        e12 = findViewById(R.id.E12);
        e13 = findViewById(R.id.E13);
        e14 = findViewById(R.id.E14);
        e15 = findViewById(R.id.E15);
        e16 = findViewById(R.id.E16);
        e17 = findViewById(R.id.E17);
        e18 = findViewById(R.id.E18);
        e19 = findViewById(R.id.E19);

        
        f01 = findViewById(R.id.F01);
        f02 = findViewById(R.id.F02);
        f03 = findViewById(R.id.F03);
        f04 = findViewById(R.id.F04);
        f05 = findViewById(R.id.F05);
        f06 = findViewById(R.id.F06);
        f07 = findViewById(R.id.F07);
        f08 = findViewById(R.id.F08);
        f09 = findViewById(R.id.F09);
        f10 = findViewById(R.id.F10);
        f11 = findViewById(R.id.F11);
        f12 = findViewById(R.id.F12);
        f13 = findViewById(R.id.F13);
        f14 = findViewById(R.id.F14);
        f15 = findViewById(R.id.F15);
        f16 = findViewById(R.id.F16);
        f17 = findViewById(R.id.F17);
        f18 = findViewById(R.id.F18);
        f19 = findViewById(R.id.F19);

        
        g01 = findViewById(R.id.G01);
        g02 = findViewById(R.id.G02);
        g03 = findViewById(R.id.G03);
        g04 = findViewById(R.id.G04);
        g05 = findViewById(R.id.G05);
        g06 = findViewById(R.id.G06);
        g07 = findViewById(R.id.G07);
        g08 = findViewById(R.id.G08);
        g09 = findViewById(R.id.G09);
        g10 = findViewById(R.id.G10);
        g11 = findViewById(R.id.G11);
        g12 = findViewById(R.id.G12);
        g13 = findViewById(R.id.G13);
        g14 = findViewById(R.id.G14);
        g15 = findViewById(R.id.G15);
        g16 = findViewById(R.id.G16);
        g17 = findViewById(R.id.G17);
        g18 = findViewById(R.id.G18);
        g19 = findViewById(R.id.G19);

        
        h01 = findViewById(R.id.H01);
        h02 = findViewById(R.id.H02);
        h03 = findViewById(R.id.H03);
        h04 = findViewById(R.id.H04);
        h05 = findViewById(R.id.H05);
        h06 = findViewById(R.id.H06);
        h07 = findViewById(R.id.H07);
        h08 = findViewById(R.id.H08);
        h09 = findViewById(R.id.H09);
        h10 = findViewById(R.id.H10);
        h11 = findViewById(R.id.H11);
        h12 = findViewById(R.id.H12);
        h13 = findViewById(R.id.H13);
        h14 = findViewById(R.id.H14);
        h15 = findViewById(R.id.H15);
        h16 = findViewById(R.id.H16);
        h17 = findViewById(R.id.H17);
        h18 = findViewById(R.id.H18);
        h19 = findViewById(R.id.H19);

        
        i01 = findViewById(R.id.I01);
        i02 = findViewById(R.id.I02);
        i03 = findViewById(R.id.I03);
        i04 = findViewById(R.id.I04);
        i05 = findViewById(R.id.I05);
        i06 = findViewById(R.id.I06);
        i07 = findViewById(R.id.I07);
        i08 = findViewById(R.id.I08);
        i09 = findViewById(R.id.I09);
        i10 = findViewById(R.id.I10);
        i11 = findViewById(R.id.I11);
        i12 = findViewById(R.id.I12);
        i13 = findViewById(R.id.I13);
        i14 = findViewById(R.id.I14);
        i15 = findViewById(R.id.I15);
        i16 = findViewById(R.id.I16);
        i17 = findViewById(R.id.I17);
        i18 = findViewById(R.id.I18);
        i19 = findViewById(R.id.I19);

        
        j01 = findViewById(R.id.J01);
        j02 = findViewById(R.id.J02);
        j03 = findViewById(R.id.J03);
        j04 = findViewById(R.id.J04);
        j05 = findViewById(R.id.J05);
        j06 = findViewById(R.id.J06);
        j07 = findViewById(R.id.J07);
        j08 = findViewById(R.id.J08);
        j09 = findViewById(R.id.J09);
        j10 = findViewById(R.id.J10);
        j11 = findViewById(R.id.J11);
        j12 = findViewById(R.id.J12);
        j13 = findViewById(R.id.J13);
        j14 = findViewById(R.id.J14);
        j15 = findViewById(R.id.J15);
        j16 = findViewById(R.id.J16);
        j17 = findViewById(R.id.J17);
        j18 = findViewById(R.id.J18);
        j19 = findViewById(R.id.J19);

        
        k01 = findViewById(R.id.K01);
        k02 = findViewById(R.id.K02);
        k03 = findViewById(R.id.K03);
        k04 = findViewById(R.id.K04);
        k05 = findViewById(R.id.K05);
        k06 = findViewById(R.id.K06);
        k07 = findViewById(R.id.K07);
        k08 = findViewById(R.id.K08);
        k09 = findViewById(R.id.K09);
        k10 = findViewById(R.id.K10);
        k11 = findViewById(R.id.K11);
        k12 = findViewById(R.id.K12);
        k13 = findViewById(R.id.K13);
        k14 = findViewById(R.id.K14);
        k15 = findViewById(R.id.K15);
        k16 = findViewById(R.id.K16);
        k17 = findViewById(R.id.K17);
        k18 = findViewById(R.id.K18);
        k19 = findViewById(R.id.K19);

        
        l01 = findViewById(R.id.L01);
        l02 = findViewById(R.id.L02);
        l03 = findViewById(R.id.L03);
        l04 = findViewById(R.id.L04);
        l05 = findViewById(R.id.L05);
        l06 = findViewById(R.id.L06);
        l07 = findViewById(R.id.L07);
        l08 = findViewById(R.id.L08);
        l09 = findViewById(R.id.L09);
        l10 = findViewById(R.id.L10);
        l11 = findViewById(R.id.L11);
        l12 = findViewById(R.id.L12);
        l13 = findViewById(R.id.L13);
        l14 = findViewById(R.id.L14);
        l15 = findViewById(R.id.L15);
        l16 = findViewById(R.id.L16);
        l17 = findViewById(R.id.L17);
        l18 = findViewById(R.id.L18);
        l19 = findViewById(R.id.L19);

        
        m01 = findViewById(R.id.M01);
        m02 = findViewById(R.id.M02);
        m03 = findViewById(R.id.M03);
        m04 = findViewById(R.id.M04);
        m05 = findViewById(R.id.M05);
        m06 = findViewById(R.id.M06);
        m07 = findViewById(R.id.M07);
        m08 = findViewById(R.id.M08);
        m09 = findViewById(R.id.M09);
        m10 = findViewById(R.id.M10);
        m11 = findViewById(R.id.M11);
        m12 = findViewById(R.id.M12);
        m13 = findViewById(R.id.M13);
        m14 = findViewById(R.id.M14);
        m15 = findViewById(R.id.M15);
        m16 = findViewById(R.id.M16);
        m17 = findViewById(R.id.M17);
        m18 = findViewById(R.id.M18);
        m19 = findViewById(R.id.M19);

        
        n01 = findViewById(R.id.N01);
        n02 = findViewById(R.id.N02);
        n03 = findViewById(R.id.N03);
        n04 = findViewById(R.id.N04);
        n05 = findViewById(R.id.N05);
        n06 = findViewById(R.id.N06);
        n07 = findViewById(R.id.N07);
        n08 = findViewById(R.id.N08);
        n09 = findViewById(R.id.N09);
        n10 = findViewById(R.id.N10);
        n11 = findViewById(R.id.N11);
        n12 = findViewById(R.id.N12);
        n13 = findViewById(R.id.N13);
        n14 = findViewById(R.id.N14);
        n15 = findViewById(R.id.N15);
        n16 = findViewById(R.id.N16);
        n17 = findViewById(R.id.N17);
        n18 = findViewById(R.id.N18);
        n19 = findViewById(R.id.N19);

        
        o01 = findViewById(R.id.O01);
        o02 = findViewById(R.id.O02);
        o03 = findViewById(R.id.O03);
        o04 = findViewById(R.id.O04);
        o05 = findViewById(R.id.O05);
        o06 = findViewById(R.id.O06);
        o07 = findViewById(R.id.O07);
        o08 = findViewById(R.id.O08);
        o09 = findViewById(R.id.O09);
        o10 = findViewById(R.id.O10);
        o11 = findViewById(R.id.O11);
        o12 = findViewById(R.id.O12);
        o13 = findViewById(R.id.O13);
        o14 = findViewById(R.id.O14);
        o15 = findViewById(R.id.O15);
        o16 = findViewById(R.id.O16);
        o17 = findViewById(R.id.O17);
        o18 = findViewById(R.id.O18);
        o19 = findViewById(R.id.O19);

        
        p01 = findViewById(R.id.P01);
        p02 = findViewById(R.id.P02);
        p03 = findViewById(R.id.P03);
        p04 = findViewById(R.id.P04);
        p05 = findViewById(R.id.P05);
        p06 = findViewById(R.id.P06);
        p07 = findViewById(R.id.P07);
        p08 = findViewById(R.id.P08);
        p09 = findViewById(R.id.P09);
        p10 = findViewById(R.id.P10);
        p11 = findViewById(R.id.P11);
        p12 = findViewById(R.id.P12);
        p13 = findViewById(R.id.P13);
        p14 = findViewById(R.id.P14);
        p15 = findViewById(R.id.P15);
        p16 = findViewById(R.id.P16);
        p17 = findViewById(R.id.P17);
        p18 = findViewById(R.id.P18);
        p19 = findViewById(R.id.P19);

        
        q01 = findViewById(R.id.Q01);
        q02 = findViewById(R.id.Q02);
        q03 = findViewById(R.id.Q03);
        q04 = findViewById(R.id.Q04);
        q05 = findViewById(R.id.Q05);
        q06 = findViewById(R.id.Q06);
        q07 = findViewById(R.id.Q07);
        q08 = findViewById(R.id.Q08);
        q09 = findViewById(R.id.Q09);
        q10 = findViewById(R.id.Q10);
        q11 = findViewById(R.id.Q11);
        q12 = findViewById(R.id.Q12);
        q13 = findViewById(R.id.Q13);
        q14 = findViewById(R.id.Q14);
        q15 = findViewById(R.id.Q15);
        q16 = findViewById(R.id.Q16);
        q17 = findViewById(R.id.Q17);
        q18 = findViewById(R.id.Q18);
        q19 = findViewById(R.id.Q19);

        
        r01 = findViewById(R.id.R01);
        r02 = findViewById(R.id.R02);
        r03 = findViewById(R.id.R03);
        r04 = findViewById(R.id.R04);
        r05 = findViewById(R.id.R05);
        r06 = findViewById(R.id.R06);
        r07 = findViewById(R.id.R07);
        r08 = findViewById(R.id.R08);
        r09 = findViewById(R.id.R09);
        r10 = findViewById(R.id.R10);
        r11 = findViewById(R.id.R11);
        r12 = findViewById(R.id.R12);
        r13 = findViewById(R.id.R13);
        r14 = findViewById(R.id.R14);
        r15 = findViewById(R.id.R15);
        r16 = findViewById(R.id.R16);
        r17 = findViewById(R.id.R17);
        r18 = findViewById(R.id.R18);
        r19 = findViewById(R.id.R19);

        
        s01 = findViewById(R.id.S01);
        s02 = findViewById(R.id.S02);
        s03 = findViewById(R.id.S03);
        s04 = findViewById(R.id.S04);
        s05 = findViewById(R.id.S05);
        s06 = findViewById(R.id.S06);
        s07 = findViewById(R.id.S07);
        s08 = findViewById(R.id.S08);
        s09 = findViewById(R.id.S09);
        s10 = findViewById(R.id.S10);
        s11 = findViewById(R.id.S11);
        s12 = findViewById(R.id.S12);
        s13 = findViewById(R.id.S13);
        s14 = findViewById(R.id.S14);
        s15 = findViewById(R.id.S15);
        s16 = findViewById(R.id.S16);
        s17 = findViewById(R.id.S17);
        s18 = findViewById(R.id.S18);
        s19 = findViewById(R.id.S19);

        t01 = findViewById(R.id.T01);
        t02 = findViewById(R.id.T02);
        t03 = findViewById(R.id.T03);
        t04 = findViewById(R.id.T04);
        t05 = findViewById(R.id.T05);
        t06 = findViewById(R.id.T06);
        t07 = findViewById(R.id.T07);
        t08 = findViewById(R.id.T08);
        t09 = findViewById(R.id.T09);
        t10 = findViewById(R.id.T10);
        t11 = findViewById(R.id.T11);
        t12 = findViewById(R.id.T12);
        t13 = findViewById(R.id.T13);
        t14 = findViewById(R.id.T14);
        t15 = findViewById(R.id.T15);
        t16 = findViewById(R.id.T16);
        t17 = findViewById(R.id.T17);
        t18 = findViewById(R.id.T18);
        t19 = findViewById(R.id.T19);

      //  for(int y = 0; y <= AgentPositions.length; y++){
       //     AgentPositions[y].Gridspot = a01;
      //  }


/*
        b19.setImageResource(R.drawable.daahnida);

        b02.setImageResource(R.drawable.blattle);

        b13.setImageResource(R.drawable.faedendron);

        b10.setImageResource(R.drawable.yallod);

        b01.setImageResource(R.drawable.yuggle);

        b09.setImageResource(R.drawable.halocordate);

        a17.setImageResource(R.drawable.sorba);

        a12.setImageResource(R.drawable.jiyou);

        a03.setImageResource(R.drawable.psychobath);

        a10.setImageResource(R.drawable.nimnamnom);

        a11.setImageResource(R.drawable.nhainhai);

        a07.setImageResource(R.drawable.nentopode);

        b19.setImageResource(R.drawable.daahnida);

        b02.setImageResource(R.drawable.blattle);

        b13.setImageResource(R.drawable.faedendron);

        b10.setImageResource(R.drawable.yallod);

        b01.setImageResource(R.drawable.yuggle);

        c09.setImageResource(R.drawable.halocordate);

        d17.setImageResource(R.drawable.sorba);

        f12.setImageResource(R.drawable.jiyou);

        o03.setImageResource(R.drawable.psychobath);

        o10.setImageResource(R.drawable.nimnamnom);

        s11.setImageResource(R.drawable.nhainhai);

        m07.setImageResource(R.drawable.nentopode);

        n19.setImageResource(R.drawable.daahnida);

        l02.setImageResource(R.drawable.blattle);

        k13.setImageResource(R.drawable.faedendron);

        c10.setImageResource(R.drawable.yallod);

        e01.setImageResource(R.drawable.yuggle);

        f09.setImageResource(R.drawable.halocordate);

        g07.setImageResource(R.drawable.sorba);

        h12.setImageResource(R.drawable.jiyou);

        r03.setImageResource(R.drawable.psychobath);

        q10.setImageResource(R.drawable.nimnamnom);

        t11.setImageResource(R.drawable.nhainhai);

        s07.setImageResource(R.drawable.nentopode);
*/



        RandomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startflip == 0) {
                    randomdisp();
                }else {
                    for(int x = 0; x < AgentPositions.length; x++) {
                        imagegrant(AgentPositions[x].Gridspot, AgentPositions[x].Agent);
                    }

                }

            }
        });
        ClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClearMethod();
            }
        });
        TestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startflip = 1;

            }
        });

        
        
        




        
        
        

    }

    public void randomdisp(){

        imagegrant(a01, Kohboh);
        imagegrant(a02, Kohboh);
        imagegrant(a03, Kohboh);
        imagegrant(a04, Kohboh);
        imagegrant(a05, Kohboh);
        imagegrant(a06, Kohboh);
        imagegrant(a07, Kohboh);
        imagegrant(a08, Kohboh);
        imagegrant(a09, Kohboh);
        imagegrant(a10, Kohboh);
        imagegrant(a11, Kohboh);
        imagegrant(a12, Kohboh);
        imagegrant(a13, Kohboh);
        imagegrant(a14, Kohboh);
        imagegrant(a15, Kohboh);
        imagegrant(a16, Kohboh);
        imagegrant(a17, Kohboh);
        imagegrant(a18, Kohboh);
        imagegrant(a19, Kohboh);
        imagegrant(a20, Kohboh);

        imagegrant(b01, Kohboh);
        imagegrant(b02, Kohboh);
        imagegrant(b03, Kohboh);
        imagegrant(b04, Kohboh);
        imagegrant(b05, Kohboh);
        imagegrant(b06, Kohboh);
        imagegrant(b07, Kohboh);
        imagegrant(b08, Kohboh);
        imagegrant(b09, Kohboh);
        imagegrant(b10, Kohboh);
        imagegrant(b11, Kohboh);
        imagegrant(b12, Kohboh);
        imagegrant(b13, Kohboh);
        imagegrant(b14, Kohboh);
        imagegrant(b15, Kohboh);
        imagegrant(b16, Kohboh);
        imagegrant(b17, Kohboh);
        imagegrant(b18, Kohboh);
        imagegrant(b19, Kohboh);
        imagegrant(b20, Kohboh);

        imagegrant(c01, Kohboh);
        imagegrant(c02, Kohboh);
        imagegrant(c03, Kohboh);
        imagegrant(c04, Kohboh);
        imagegrant(c05, Kohboh);
        imagegrant(c06, Kohboh);
        imagegrant(c07, Kohboh);
        imagegrant(c08, Kohboh);
        imagegrant(c09, Kohboh);
        imagegrant(c10, Kohboh);
        imagegrant(c11, Kohboh);
        imagegrant(c12, Kohboh);
        imagegrant(c13, Kohboh);
        imagegrant(c14, Kohboh);
        imagegrant(c15, Kohboh);
        imagegrant(c16, Kohboh);
        imagegrant(c17, Kohboh);
        imagegrant(c18, Kohboh);
        imagegrant(c19, Kohboh);
        imagegrant(c20, Kohboh);

        imagegrant(d01, Kohboh);
        imagegrant(d02, Kohboh);
        imagegrant(d03, Kohboh);
        imagegrant(d04, Kohboh);
        imagegrant(d05, Kohboh);
        imagegrant(d06, Kohboh);
        imagegrant(d07, Kohboh);
        imagegrant(d08, Kohboh);
        imagegrant(d09, Kohboh);
        imagegrant(d10, Kohboh);
        imagegrant(d11, Kohboh);
        imagegrant(d12, Kohboh);
        imagegrant(d13, Kohboh);
        imagegrant(d14, Kohboh);
        imagegrant(d15, Kohboh);
        imagegrant(d16, Kohboh);
        imagegrant(d17, Kohboh);
        imagegrant(d18, Kohboh);
        imagegrant(d19, Kohboh);
        imagegrant(d20, Kohboh);

        imagegrant(e01, Kohboh);
        imagegrant(e02, Kohboh);
        imagegrant(e03, Kohboh);
        imagegrant(e04, Kohboh);
        imagegrant(e05, Kohboh);
        imagegrant(e06, Kohboh);
        imagegrant(e07, Kohboh);
        imagegrant(e08, Kohboh);
        imagegrant(e09, Kohboh);
        imagegrant(e10, Kohboh);
        imagegrant(e11, Kohboh);
        imagegrant(e12, Kohboh);
        imagegrant(e13, Kohboh);
        imagegrant(e14, Kohboh);
        imagegrant(e15, Kohboh);
        imagegrant(e16, Kohboh);
        imagegrant(e17, Kohboh);
        imagegrant(e18, Kohboh);
        imagegrant(e19, Kohboh);
        imagegrant(e20, Kohboh);

        imagegrant(f01, Kohboh);
        imagegrant(f02, Kohboh);
        imagegrant(f03, Kohboh);
        imagegrant(f04, Kohboh);
        imagegrant(f05, Kohboh);
        imagegrant(f06, Kohboh);
        imagegrant(f07, Kohboh);
        imagegrant(f08, Kohboh);
        imagegrant(f09, Kohboh);
        imagegrant(f10, Kohboh);
        imagegrant(f11, Kohboh);
        imagegrant(f12, Kohboh);
        imagegrant(f13, Kohboh);
        imagegrant(f14, Kohboh);
        imagegrant(f15, Kohboh);
        imagegrant(f16, Kohboh);
        imagegrant(f17, Kohboh);
        imagegrant(f18, Kohboh);
        imagegrant(f19, Kohboh);
        imagegrant(f20, Kohboh);

        imagegrant(g01, Kohboh);
        imagegrant(g02, Kohboh);
        imagegrant(g03, Kohboh);
        imagegrant(g04, Kohboh);
        imagegrant(g05, Kohboh);
        imagegrant(g06, Kohboh);
        imagegrant(g07, Kohboh);
        imagegrant(g08, Kohboh);
        imagegrant(g09, Kohboh);
        imagegrant(g10, Kohboh);
        imagegrant(g11, Kohboh);
        imagegrant(g12, Kohboh);
        imagegrant(g13, Kohboh);
        imagegrant(g14, Kohboh);
        imagegrant(g15, Kohboh);
        imagegrant(g16, Kohboh);
        imagegrant(g17, Kohboh);
        imagegrant(g18, Kohboh);
        imagegrant(g19, Kohboh);
        imagegrant(g20, Kohboh);

        imagegrant(h01, Kohboh);
        imagegrant(h02, Kohboh);
        imagegrant(h03, Kohboh);
        imagegrant(h04, Kohboh);
        imagegrant(h05, Kohboh);
        imagegrant(h06, Kohboh);
        imagegrant(h07, Kohboh);
        imagegrant(h08, Kohboh);
        imagegrant(h09, Kohboh);
        imagegrant(h10, Kohboh);
        imagegrant(h11, Kohboh);
        imagegrant(h12, Kohboh);
        imagegrant(h13, Kohboh);
        imagegrant(h14, Kohboh);
        imagegrant(h15, Kohboh);
        imagegrant(h16, Kohboh);
        imagegrant(h17, Kohboh);
        imagegrant(h18, Kohboh);
        imagegrant(h19, Kohboh);
        imagegrant(h20, Kohboh);

        imagegrant(i01, Kohboh);
        imagegrant(i02, Kohboh);
        imagegrant(i03, Kohboh);
        imagegrant(i04, Kohboh);
        imagegrant(i05, Kohboh);
        imagegrant(i06, Kohboh);
        imagegrant(i07, Kohboh);
        imagegrant(i08, Kohboh);
        imagegrant(i09, Kohboh);
        imagegrant(i10, Kohboh);
        imagegrant(i11, Kohboh);
        imagegrant(i12, Kohboh);
        imagegrant(i13, Kohboh);
        imagegrant(i14, Kohboh);
        imagegrant(i15, Kohboh);
        imagegrant(i16, Kohboh);
        imagegrant(i17, Kohboh);
        imagegrant(i18, Kohboh);
        imagegrant(i19, Kohboh);
        imagegrant(i20, Kohboh);

        imagegrant(j01, Kohboh);
        imagegrant(j02, Kohboh);
        imagegrant(j03, Kohboh);
        imagegrant(j04, Kohboh);
        imagegrant(j05, Kohboh);
        imagegrant(j06, Kohboh);
        imagegrant(j07, Kohboh);
        imagegrant(j08, Kohboh);
        imagegrant(j09, Kohboh);
        imagegrant(j10, Kohboh);
        imagegrant(j11, Kohboh);
        imagegrant(j12, Kohboh);
        imagegrant(j13, Kohboh);
        imagegrant(j14, Kohboh);
        imagegrant(j15, Kohboh);
        imagegrant(j16, Kohboh);
        imagegrant(j17, Kohboh);
        imagegrant(j18, Kohboh);
        imagegrant(j19, Kohboh);
        imagegrant(j20, Kohboh);

        imagegrant(k01, Kohboh);
        imagegrant(k02, Kohboh);
        imagegrant(k03, Kohboh);
        imagegrant(k04, Kohboh);
        imagegrant(k05, Kohboh);
        imagegrant(k06, Kohboh);
        imagegrant(k07, Kohboh);
        imagegrant(k08, Kohboh);
        imagegrant(k09, Kohboh);
        imagegrant(k10, Kohboh);
        imagegrant(k11, Kohboh);
        imagegrant(k12, Kohboh);
        imagegrant(k13, Kohboh);
        imagegrant(k14, Kohboh);
        imagegrant(k15, Kohboh);
        imagegrant(k16, Kohboh);
        imagegrant(k17, Kohboh);
        imagegrant(k18, Kohboh);
        imagegrant(k19, Kohboh);
        imagegrant(k20, Kohboh);

        imagegrant(l01, Kohboh);
        imagegrant(l02, Kohboh);
        imagegrant(l03, Kohboh);
        imagegrant(l04, Kohboh);
        imagegrant(l05, Kohboh);
        imagegrant(l06, Kohboh);
        imagegrant(l07, Kohboh);
        imagegrant(l08, Kohboh);
        imagegrant(l09, Kohboh);
        imagegrant(l10, Kohboh);
        imagegrant(l11, Kohboh);
        imagegrant(l12, Kohboh);
        imagegrant(l13, Kohboh);
        imagegrant(l14, Kohboh);
        imagegrant(l15, Kohboh);
        imagegrant(l16, Kohboh);
        imagegrant(l17, Kohboh);
        imagegrant(l18, Kohboh);
        imagegrant(l19, Kohboh);
        imagegrant(l20, Kohboh);

        imagegrant(m01, Kohboh);
        imagegrant(m02, Kohboh);
        imagegrant(m03, Kohboh);
        imagegrant(m04, Kohboh);
        imagegrant(m05, Kohboh);
        imagegrant(m06, Kohboh);
        imagegrant(m07, Kohboh);
        imagegrant(m08, Kohboh);
        imagegrant(m09, Kohboh);
        imagegrant(m10, Kohboh);
        imagegrant(m11, Kohboh);
        imagegrant(m12, Kohboh);
        imagegrant(m13, Kohboh);
        imagegrant(m14, Kohboh);
        imagegrant(m15, Kohboh);
        imagegrant(m16, Kohboh);
        imagegrant(m17, Kohboh);
        imagegrant(m18, Kohboh);
        imagegrant(m19, Kohboh);
        imagegrant(m20, Kohboh);

        imagegrant(n01, Kohboh);
        imagegrant(n02, Kohboh);
        imagegrant(n03, Kohboh);
        imagegrant(n04, Kohboh);
        imagegrant(n05, Kohboh);
        imagegrant(n06, Kohboh);
        imagegrant(n07, Kohboh);
        imagegrant(n08, Kohboh);
        imagegrant(n09, Kohboh);
        imagegrant(n10, Kohboh);
        imagegrant(n11, Kohboh);
        imagegrant(n12, Kohboh);
        imagegrant(n13, Kohboh);
        imagegrant(n14, Kohboh);
        imagegrant(n15, Kohboh);
        imagegrant(n16, Kohboh);
        imagegrant(n17, Kohboh);
        imagegrant(n18, Kohboh);
        imagegrant(n19, Kohboh);
        imagegrant(n20, Kohboh);

        imagegrant(o01, Kohboh);
        imagegrant(o02, Kohboh);
        imagegrant(o03, Kohboh);
        imagegrant(o04, Kohboh);
        imagegrant(o05, Kohboh);
        imagegrant(o06, Kohboh);
        imagegrant(o07, Kohboh);
        imagegrant(o08, Kohboh);
        imagegrant(o09, Kohboh);
        imagegrant(o10, Kohboh);
        imagegrant(o11, Kohboh);
        imagegrant(o12, Kohboh);
        imagegrant(o13, Kohboh);
        imagegrant(o14, Kohboh);
        imagegrant(o15, Kohboh);
        imagegrant(o16, Kohboh);
        imagegrant(o17, Kohboh);
        imagegrant(o18, Kohboh);
        imagegrant(o19, Kohboh);
        imagegrant(o20, Kohboh);

        imagegrant(p01, Kohboh);
        imagegrant(p02, Kohboh);
        imagegrant(p03, Kohboh);
        imagegrant(p04, Kohboh);
        imagegrant(p05, Kohboh);
        imagegrant(p06, Kohboh);
        imagegrant(p07, Kohboh);
        imagegrant(p08, Kohboh);
        imagegrant(p09, Kohboh);
        imagegrant(p10, Kohboh);
        imagegrant(p11, Kohboh);
        imagegrant(p12, Kohboh);
        imagegrant(p13, Kohboh);
        imagegrant(p14, Kohboh);
        imagegrant(p15, Kohboh);
        imagegrant(p16, Kohboh);
        imagegrant(p17, Kohboh);
        imagegrant(p18, Kohboh);
        imagegrant(p19, Kohboh);
        imagegrant(p20, Kohboh);

        imagegrant(q01, Kohboh);
        imagegrant(q02, Kohboh);
        imagegrant(q03, Kohboh);
        imagegrant(q04, Kohboh);
        imagegrant(q05, Kohboh);
        imagegrant(q06, Kohboh);
        imagegrant(q07, Kohboh);
        imagegrant(q08, Kohboh);
        imagegrant(q09, Kohboh);
        imagegrant(q10, Kohboh);
        imagegrant(q11, Kohboh);
        imagegrant(q12, Kohboh);
        imagegrant(q13, Kohboh);
        imagegrant(q14, Kohboh);
        imagegrant(q15, Kohboh);
        imagegrant(q16, Kohboh);
        imagegrant(q17, Kohboh);
        imagegrant(q18, Kohboh);
        imagegrant(q19, Kohboh);
        imagegrant(q20, Kohboh);

        imagegrant(r01, Kohboh);
        imagegrant(r02, Kohboh);
        imagegrant(r03, Kohboh);
        imagegrant(r04, Kohboh);
        imagegrant(r05, Kohboh);
        imagegrant(r06, Kohboh);
        imagegrant(r07, Kohboh);
        imagegrant(r08, Kohboh);
        imagegrant(r09, Kohboh);
        imagegrant(r10, Kohboh);
        imagegrant(r11, Kohboh);
        imagegrant(r12, Kohboh);
        imagegrant(r13, Kohboh);
        imagegrant(r14, Kohboh);
        imagegrant(r15, Kohboh);
        imagegrant(r16, Kohboh);
        imagegrant(r17, Kohboh);
        imagegrant(r18, Kohboh);
        imagegrant(r19, Kohboh);
        imagegrant(r20, Kohboh);

        imagegrant(s01, Kohboh);
        imagegrant(s02, Kohboh);
        imagegrant(s03, Kohboh);
        imagegrant(s04, Kohboh);
        imagegrant(s05, Kohboh);
        imagegrant(s06, Kohboh);
        imagegrant(s07, Kohboh);
        imagegrant(s08, Kohboh);
        imagegrant(s09, Kohboh);
        imagegrant(s10, Kohboh);
        imagegrant(s11, Kohboh);
        imagegrant(s12, Kohboh);
        imagegrant(s13, Kohboh);
        imagegrant(s14, Kohboh);
        imagegrant(s15, Kohboh);
        imagegrant(s16, Kohboh);
        imagegrant(s17, Kohboh);
        imagegrant(s18, Kohboh);
        imagegrant(s19, Kohboh);
        imagegrant(s20, Kohboh);

        imagegrant(t01, Kohboh);
        imagegrant(t02, Kohboh);
        imagegrant(t03, Kohboh);
        imagegrant(t04, Kohboh);
        imagegrant(t05, Kohboh);
        imagegrant(t06, Kohboh);
        imagegrant(t07, Kohboh);
        imagegrant(t08, Kohboh);
        imagegrant(t09, Kohboh);
        imagegrant(t10, Kohboh);
        imagegrant(t11, Kohboh);
        imagegrant(t12, Kohboh);
        imagegrant(t13, Kohboh);
        imagegrant(t14, Kohboh);
        imagegrant(t15, Kohboh);
        imagegrant(t16, Kohboh);
        imagegrant(t17, Kohboh);
        imagegrant(t18, Kohboh);
        imagegrant(t19, Kohboh);
        imagegrant(t20, Kohboh);

        Filler(a01);
        Filler(a02);
        Filler(a03);
        Filler(a04);
        Filler(a05);
        Filler(a06);
        Filler(a07);
        Filler(a08);
        Filler(a09);
        Filler(a10);
        Filler(a11);
        Filler(a12);
        Filler(a13);
        Filler(a14);
        Filler(a15);
        Filler(a16);
        Filler(a17);
        Filler(a18);
        Filler(a19);
        Filler(a20);

        Filler(b01);
        Filler(b02);
        Filler(b03);
        Filler(b04);
        Filler(b05);
        Filler(b06);
        Filler(b07);
        Filler(b08);
        Filler(b09);
        Filler(b10);
        Filler(b11);
        Filler(b12);
        Filler(b13);
        Filler(b14);
        Filler(b15);
        Filler(b16);
        Filler(b17);
        Filler(b18);
        Filler(b19);
        Filler(b20);

        Filler(c01);
        Filler(c02);
        Filler(c03);
        Filler(c04);
        Filler(c05);
        Filler(c06);
        Filler(c07);
        Filler(c08);
        Filler(c09);
        Filler(c10);
        Filler(c11);
        Filler(c12);
        Filler(c13);
        Filler(c14);
        Filler(c15);
        Filler(c16);
        Filler(c17);
        Filler(c18);
        Filler(c19);
        Filler(c20);

        Filler(d01);
        Filler(d02);
        Filler(d03);
        Filler(d04);
        Filler(d05);
        Filler(d06);
        Filler(d07);
        Filler(d08);
        Filler(d09);
        Filler(d10);
        Filler(d11);
        Filler(d12);
        Filler(d13);
        Filler(d14);
        Filler(d15);
        Filler(d16);
        Filler(d17);
        Filler(d18);
        Filler(d19);
        Filler(d20);

        Filler(e01);
        Filler(e02);
        Filler(e03);
        Filler(e04);
        Filler(e05);
        Filler(e06);
        Filler(e07);
        Filler(e08);
        Filler(e09);
        Filler(e10);
        Filler(e11);
        Filler(e12);
        Filler(e13);
        Filler(e14);
        Filler(e15);
        Filler(e16);
        Filler(e17);
        Filler(e18);
        Filler(e19);
        Filler(e20);

        Filler(f01);
        Filler(f02);
        Filler(f03);
        Filler(f04);
        Filler(f05);
        Filler(f06);
        Filler(f07);
        Filler(f08);
        Filler(f09);
        Filler(f10);
        Filler(f11);
        Filler(f12);
        Filler(f13);
        Filler(f14);
        Filler(f15);
        Filler(f16);
        Filler(f17);
        Filler(f18);
        Filler(f19);
        Filler(f20);

        Filler(g01);
        Filler(g02);
        Filler(g03);
        Filler(g04);
        Filler(g05);
        Filler(g06);
        Filler(g07);
        Filler(g08);
        Filler(g09);
        Filler(g10);
        Filler(g11);
        Filler(g12);
        Filler(g13);
        Filler(g14);
        Filler(g15);
        Filler(g16);
        Filler(g17);
        Filler(g18);
        Filler(g19);
        Filler(g20);

        Filler(h01);
        Filler(h02);
        Filler(h03);
        Filler(h04);
        Filler(h05);
        Filler(h06);
        Filler(h07);
        Filler(h08);
        Filler(h09);
        Filler(h10);
        Filler(h11);
        Filler(h12);
        Filler(h13);
        Filler(h14);
        Filler(h15);
        Filler(h16);
        Filler(h17);
        Filler(h18);
        Filler(h19);
        Filler(h20);

        Filler(i01);
        Filler(i02);
        Filler(i03);
        Filler(i04);
        Filler(i05);
        Filler(i06);
        Filler(i07);
        Filler(i08);
        Filler(i09);
        Filler(i10);
        Filler(i11);
        Filler(i12);
        Filler(i13);
        Filler(i14);
        Filler(i15);
        Filler(i16);
        Filler(i17);
        Filler(i18);
        Filler(i19);
        Filler(i20);

        Filler(j01);
        Filler(j02);
        Filler(j03);
        Filler(j04);
        Filler(j05);
        Filler(j06);
        Filler(j07);
        Filler(j08);
        Filler(j09);
        Filler(j10);
        Filler(j11);
        Filler(j12);
        Filler(j13);
        Filler(j14);
        Filler(j15);
        Filler(j16);
        Filler(j17);
        Filler(j18);
        Filler(j19);
        Filler(j20);

        Filler(k01);
        Filler(k02);
        Filler(k03);
        Filler(k04);
        Filler(k05);
        Filler(k06);
        Filler(k07);
        Filler(k08);
        Filler(k09);
        Filler(k10);
        Filler(k11);
        Filler(k12);
        Filler(k13);
        Filler(k14);
        Filler(k15);
        Filler(k16);
        Filler(k17);
        Filler(k18);
        Filler(k19);
        Filler(k20);

        Filler(l01);
        Filler(l02);
        Filler(l03);
        Filler(l04);
        Filler(l05);
        Filler(l06);
        Filler(l07);
        Filler(l08);
        Filler(l09);
        Filler(l10);
        Filler(l11);
        Filler(l12);
        Filler(l13);
        Filler(l14);
        Filler(l15);
        Filler(l16);
        Filler(l17);
        Filler(l18);
        Filler(l19);
        Filler(l20);

        Filler(m01);
        Filler(m02);
        Filler(m03);
        Filler(m04);
        Filler(m05);
        Filler(m06);
        Filler(m07);
        Filler(m08);
        Filler(m09);
        Filler(m10);
        Filler(m11);
        Filler(m12);
        Filler(m13);
        Filler(m14);
        Filler(m15);
        Filler(m16);
        Filler(m17);
        Filler(m18);
        Filler(m19);
        Filler(m20);

        Filler(n01);
        Filler(n02);
        Filler(n03);
        Filler(n04);
        Filler(n05);
        Filler(n06);
        Filler(n07);
        Filler(n08);
        Filler(n09);
        Filler(n10);
        Filler(n11);
        Filler(n12);
        Filler(n13);
        Filler(n14);
        Filler(n15);
        Filler(n16);
        Filler(n17);
        Filler(n18);
        Filler(n19);
        Filler(n20);

        Filler(o01);
        Filler(o02);
        Filler(o03);
        Filler(o04);
        Filler(o05);
        Filler(o06);
        Filler(o07);
        Filler(o08);
        Filler(o09);
        Filler(o10);
        Filler(o11);
        Filler(o12);
        Filler(o13);
        Filler(o14);
        Filler(o15);
        Filler(o16);
        Filler(o17);
        Filler(o18);
        Filler(o19);
        Filler(o20);

        Filler(p01);
        Filler(p02);
        Filler(p03);
        Filler(p04);
        Filler(p05);
        Filler(p06);
        Filler(p07);
        Filler(p08);
        Filler(p09);
        Filler(p10);
        Filler(p11);
        Filler(p12);
        Filler(p13);
        Filler(p14);
        Filler(p15);
        Filler(p16);
        Filler(p17);
        Filler(p18);
        Filler(p19);
        Filler(p20);

        Filler(q01);
        Filler(q02);
        Filler(q03);
        Filler(q04);
        Filler(q05);
        Filler(q06);
        Filler(q07);
        Filler(q08);
        Filler(q09);
        Filler(q10);
        Filler(q11);
        Filler(q12);
        Filler(q13);
        Filler(q14);
        Filler(q15);
        Filler(q16);
        Filler(q17);
        Filler(q18);
        Filler(q19);
        Filler(q20);

        Filler(r01);
        Filler(r02);
        Filler(r03);
        Filler(r04);
        Filler(r05);
        Filler(r06);
        Filler(r07);
        Filler(r08);
        Filler(r09);
        Filler(r10);
        Filler(r11);
        Filler(r12);
        Filler(r13);
        Filler(r14);
        Filler(r15);
        Filler(r16);
        Filler(r17);
        Filler(r18);
        Filler(r19);
        Filler(r20);

        Filler(s01);
        Filler(s02);
        Filler(s03);
        Filler(s04);
        Filler(s05);
        Filler(s06);
        Filler(s07);
        Filler(s08);
        Filler(s09);
        Filler(s10);
        Filler(s11);
        Filler(s12);
        Filler(s13);
        Filler(s14);
        Filler(s15);
        Filler(s16);
        Filler(s17);
        Filler(s18);
        Filler(s19);
        Filler(s20);

        Filler(t01);
        Filler(t02);
        Filler(t03);
        Filler(t04);
        Filler(t05);
        Filler(t06);
        Filler(t07);
        Filler(t08);
        Filler(t09);
        Filler(t10);
        Filler(t11);
        Filler(t12);
        Filler(t13);
        Filler(t14);
        Filler(t15);
        Filler(t16);
        Filler(t17);
        Filler(t18);
        Filler(t19);
        Filler(t20);





    }
     public void ClearMethod(){

        Clearimage(a01);
        Clearimage(a02);
        Clearimage(a03);
        Clearimage(a04);
        Clearimage(a05);
        Clearimage(a06);
        Clearimage(a07);
        Clearimage(a08);
        Clearimage(a09);
        Clearimage(a10);
        Clearimage(a11);
        Clearimage(a12);
        Clearimage(a13);
        Clearimage(a14);
        Clearimage(a15);
        Clearimage(a16);
        Clearimage(a17);
        Clearimage(a18);
        Clearimage(a19);
        Clearimage(a20);

        Clearimage(b01);
        Clearimage(b02);
        Clearimage(b03);
        Clearimage(b04);
        Clearimage(b05);
        Clearimage(b06);
        Clearimage(b07);
        Clearimage(b08);
        Clearimage(b09);
        Clearimage(b10);
        Clearimage(b11);
        Clearimage(b12);
        Clearimage(b13);
        Clearimage(b14);
        Clearimage(b15);
        Clearimage(b16);
        Clearimage(b17);
        Clearimage(b18);
        Clearimage(b19);
        Clearimage(b20);

        Clearimage(c01);
        Clearimage(c02);
        Clearimage(c03);
        Clearimage(c04);
        Clearimage(c05);
        Clearimage(c06);
        Clearimage(c07);
        Clearimage(c08);
        Clearimage(c09);
        Clearimage(c10);
        Clearimage(c11);
        Clearimage(c12);
        Clearimage(c13);
        Clearimage(c14);
        Clearimage(c15);
        Clearimage(c16);
        Clearimage(c17);
        Clearimage(c18);
        Clearimage(c19);
        Clearimage(c20);

        Clearimage(d01);
        Clearimage(d02);
        Clearimage(d03);
        Clearimage(d04);
        Clearimage(d05);
        Clearimage(d06);
        Clearimage(d07);
        Clearimage(d08);
        Clearimage(d09);
        Clearimage(d10);
        Clearimage(d11);
        Clearimage(d12);
        Clearimage(d13);
        Clearimage(d14);
        Clearimage(d15);
        Clearimage(d16);
        Clearimage(d17);
        Clearimage(d18);
        Clearimage(d19);
        Clearimage(d20);

        Clearimage(e01);
        Clearimage(e02);
        Clearimage(e03);
        Clearimage(e04);
        Clearimage(e05);
        Clearimage(e06);
        Clearimage(e07);
        Clearimage(e08);
        Clearimage(e09);
        Clearimage(e10);
        Clearimage(e11);
        Clearimage(e12);
        Clearimage(e13);
        Clearimage(e14);
        Clearimage(e15);
        Clearimage(e16);
        Clearimage(e17);
        Clearimage(e18);
        Clearimage(e19);
        Clearimage(e20);

        Clearimage(f01);
        Clearimage(f02);
        Clearimage(f03);
        Clearimage(f04);
        Clearimage(f05);
        Clearimage(f06);
        Clearimage(f07);
        Clearimage(f08);
        Clearimage(f09);
        Clearimage(f10);
        Clearimage(f11);
        Clearimage(f12);
        Clearimage(f13);
        Clearimage(f14);
        Clearimage(f15);
        Clearimage(f16);
        Clearimage(f17);
        Clearimage(f18);
        Clearimage(f19);
        Clearimage(f20);

        Clearimage(g01);
        Clearimage(g02);
        Clearimage(g03);
        Clearimage(g04);
        Clearimage(g05);
        Clearimage(g06);
        Clearimage(g07);
        Clearimage(g08);
        Clearimage(g09);
        Clearimage(g10);
        Clearimage(g11);
        Clearimage(g12);
        Clearimage(g13);
        Clearimage(g14);
        Clearimage(g15);
        Clearimage(g16);
        Clearimage(g17);
        Clearimage(g18);
        Clearimage(g19);
        Clearimage(g20);

        Clearimage(h01);
        Clearimage(h02);
        Clearimage(h03);
        Clearimage(h04);
        Clearimage(h05);
        Clearimage(h06);
        Clearimage(h07);
        Clearimage(h08);
        Clearimage(h09);
        Clearimage(h10);
        Clearimage(h11);
        Clearimage(h12);
        Clearimage(h13);
        Clearimage(h14);
        Clearimage(h15);
        Clearimage(h16);
        Clearimage(h17);
        Clearimage(h18);
        Clearimage(h19);
        Clearimage(h20);

        Clearimage(i01);
        Clearimage(i02);
        Clearimage(i03);
        Clearimage(i04);
        Clearimage(i05);
        Clearimage(i06);
        Clearimage(i07);
        Clearimage(i08);
        Clearimage(i09);
        Clearimage(i10);
        Clearimage(i11);
        Clearimage(i12);
        Clearimage(i13);
        Clearimage(i14);
        Clearimage(i15);
        Clearimage(i16);
        Clearimage(i17);
        Clearimage(i18);
        Clearimage(i19);
        Clearimage(i20);

        Clearimage(j01);
        Clearimage(j02);
        Clearimage(j03);
        Clearimage(j04);
        Clearimage(j05);
        Clearimage(j06);
        Clearimage(j07);
        Clearimage(j08);
        Clearimage(j09);
        Clearimage(j10);
        Clearimage(j11);
        Clearimage(j12);
        Clearimage(j13);
        Clearimage(j14);
        Clearimage(j15);
        Clearimage(j16);
        Clearimage(j17);
        Clearimage(j18);
        Clearimage(j19);
        Clearimage(j20);

        Clearimage(k01);
        Clearimage(k02);
        Clearimage(k03);
        Clearimage(k04);
        Clearimage(k05);
        Clearimage(k06);
        Clearimage(k07);
        Clearimage(k08);
        Clearimage(k09);
        Clearimage(k10);
        Clearimage(k11);
        Clearimage(k12);
        Clearimage(k13);
        Clearimage(k14);
        Clearimage(k15);
        Clearimage(k16);
        Clearimage(k17);
        Clearimage(k18);
        Clearimage(k19);
        Clearimage(k20);

        Clearimage(l01);
        Clearimage(l02);
        Clearimage(l03);
        Clearimage(l04);
        Clearimage(l05);
        Clearimage(l06);
        Clearimage(l07);
        Clearimage(l08);
        Clearimage(l09);
        Clearimage(l10);
        Clearimage(l11);
        Clearimage(l12);
        Clearimage(l13);
        Clearimage(l14);
        Clearimage(l15);
        Clearimage(l16);
        Clearimage(l17);
        Clearimage(l18);
        Clearimage(l19);
        Clearimage(l20);

        Clearimage(m01);
        Clearimage(m02);
        Clearimage(m03);
        Clearimage(m04);
        Clearimage(m05);
        Clearimage(m06);
        Clearimage(m07);
        Clearimage(m08);
        Clearimage(m09);
        Clearimage(m10);
        Clearimage(m11);
        Clearimage(m12);
        Clearimage(m13);
        Clearimage(m14);
        Clearimage(m15);
        Clearimage(m16);
        Clearimage(m17);
        Clearimage(m18);
        Clearimage(m19);
        Clearimage(m20);

        Clearimage(n01);
        Clearimage(n02);
        Clearimage(n03);
        Clearimage(n04);
        Clearimage(n05);
        Clearimage(n06);
        Clearimage(n07);
        Clearimage(n08);
        Clearimage(n09);
        Clearimage(n10);
        Clearimage(n11);
        Clearimage(n12);
        Clearimage(n13);
        Clearimage(n14);
        Clearimage(n15);
        Clearimage(n16);
        Clearimage(n17);
        Clearimage(n18);
        Clearimage(n19);
        Clearimage(n20);

        Clearimage(o01);
        Clearimage(o02);
        Clearimage(o03);
        Clearimage(o04);
        Clearimage(o05);
        Clearimage(o06);
        Clearimage(o07);
        Clearimage(o08);
        Clearimage(o09);
        Clearimage(o10);
        Clearimage(o11);
        Clearimage(o12);
        Clearimage(o13);
        Clearimage(o14);
        Clearimage(o15);
        Clearimage(o16);
        Clearimage(o17);
        Clearimage(o18);
        Clearimage(o19);
        Clearimage(o20);

        Clearimage(p01);
        Clearimage(p02);
        Clearimage(p03);
        Clearimage(p04);
        Clearimage(p05);
        Clearimage(p06);
        Clearimage(p07);
        Clearimage(p08);
        Clearimage(p09);
        Clearimage(p10);
        Clearimage(p11);
        Clearimage(p12);
        Clearimage(p13);
        Clearimage(p14);
        Clearimage(p15);
        Clearimage(p16);
        Clearimage(p17);
        Clearimage(p18);
        Clearimage(p19);
        Clearimage(p20);

        Clearimage(q01);
        Clearimage(q02);
        Clearimage(q03);
        Clearimage(q04);
        Clearimage(q05);
        Clearimage(q06);
        Clearimage(q07);
        Clearimage(q08);
        Clearimage(q09);
        Clearimage(q10);
        Clearimage(q11);
        Clearimage(q12);
        Clearimage(q13);
        Clearimage(q14);
        Clearimage(q15);
        Clearimage(q16);
        Clearimage(q17);
        Clearimage(q18);
        Clearimage(q19);
        Clearimage(q20);

        Clearimage(r01);
        Clearimage(r02);
        Clearimage(r03);
        Clearimage(r04);
        Clearimage(r05);
        Clearimage(r06);
        Clearimage(r07);
        Clearimage(r08);
        Clearimage(r09);
        Clearimage(r10);
        Clearimage(r11);
        Clearimage(r12);
        Clearimage(r13);
        Clearimage(r14);
        Clearimage(r15);
        Clearimage(r16);
        Clearimage(r17);
        Clearimage(r18);
        Clearimage(r19);
        Clearimage(r20);

        Clearimage(s01);
        Clearimage(s02);
        Clearimage(s03);
        Clearimage(s04);
        Clearimage(s05);
        Clearimage(s06);
        Clearimage(s07);
        Clearimage(s08);
        Clearimage(s09);
        Clearimage(s10);
        Clearimage(s11);
        Clearimage(s12);
        Clearimage(s13);
        Clearimage(s14);
        Clearimage(s15);
        Clearimage(s16);
        Clearimage(s17);
        Clearimage(s18);
        Clearimage(s19);
        Clearimage(s20);

        Clearimage(t01);
        Clearimage(t02);
        Clearimage(t03);
        Clearimage(t04);
        Clearimage(t05);
        Clearimage(t06);
        Clearimage(t07);
        Clearimage(t08);
        Clearimage(t09);
        Clearimage(t10);
        Clearimage(t11);
        Clearimage(t12);
        Clearimage(t13);
        Clearimage(t14);
        Clearimage(t15);
        Clearimage(t16);
        Clearimage(t17);
        Clearimage(t18);
        Clearimage(t19);
        Clearimage(t20);





    }

    public  void Clearimage(ImageView A){
        if (arrayfillercount < AgentPositions.length){
            AgentPositions[arrayfillercount].Gridspot = A;
            AgentPositions[arrayfillercount].Agent = monstlist(new Random().nextInt(87));
            arrayfillercount++;
        }

        A.setImageResource(R.drawable.emptysquare);

    }
    public  void Filler(ImageView A){
        if (arrayfillercount < AgentPositions.length){
            AgentPositions[arrayfillercount].Gridspot = A;
            AgentPositions[arrayfillercount].Agent = monstlist(new Random().nextInt(87));
            arrayfillercount++;
        }

    }


    public void imagegrant(ImageView PlayerDisplay, protomon.monst Dummy){

     //   if (arrayfillercount < AgentPositions.length){
     //       AgentPositions[arrayfillercount].Gridspot = PlayerDisplay;
     //       AgentPositions[arrayfillercount].Agent = monstlist(new Random().nextInt(87));
     //       arrayfillercount++;
     //   }

        PlayerDisplay.setColorFilter(Color.argb(0, 0, 0, 0));


        if(catcher == 0) {
            //(int) (new Random().nextInt(86))
            switchroller = switchroller++;
            switchroller = (switchroller % 86) + 1;
            // switchroller = 22;
        }else {
            switchroller = 22;
        }
        switch((int) (Dummy.Idnum)){  // Dummy.Idnum

            case 0:
                PlayerDisplay.setImageResource(R.drawable.errantnope);
                break;
            case 1:
                PlayerDisplay.setImageResource(R.drawable.kunk);
                break;
            case 2:
                PlayerDisplay.setImageResource(R.drawable.kohboh);
                break;
            case 3:
                PlayerDisplay.setImageResource(R.drawable.djoper);
                break;
            case 4:
                PlayerDisplay.setImageResource(R.drawable.schorp);
                break;
            case 5:
                if (new Random().nextInt(100000000)< 22000000) {
                    PlayerDisplay.setImageResource(R.drawable.zaume);
                }else if(new Random().nextInt(100000000)< 45000000) {
                    PlayerDisplay.setImageResource(R.drawable.zaumer);
                }else if(new Random().nextInt(100000000)< 70000000) {
                    PlayerDisplay.setImageResource(R.drawable.zaumeb);
                }else {
                    PlayerDisplay.setImageResource(R.drawable.zaumeg);
                }
                break;
            case 6:

                if (new Random().nextInt(100000000)< 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.nhainhai);
                }else {
                    PlayerDisplay.setImageResource(R.drawable.nhainhaii);
                }
                break;
            case 7:
                PlayerDisplay.setImageResource(R.drawable.degeissdt);
                break;
            case 8:
                if (new Random().nextInt(100000000)< 22000000) {
                    PlayerDisplay.setImageResource(R.drawable.yuggle);
                }else if(new Random().nextInt(100000000)< 45000000) {
                    PlayerDisplay.setImageResource(R.drawable.yugglee);
                }else if(new Random().nextInt(100000000)< 70000000) {
                    PlayerDisplay.setImageResource(R.drawable.yugglet);
                }else {
                    PlayerDisplay.setImageResource(R.drawable.yuggler);
                }
                break;
            case 9:
                PlayerDisplay.setImageResource(R.drawable.bongu);
                break;
            case 10:
                PlayerDisplay.setImageResource(R.drawable.giteriglia);
                break;
            case 11:
                PlayerDisplay.setImageResource(R.drawable.cyosteroth);
                break;
            case 12:
                PlayerDisplay.setImageResource(R.drawable.nentopode);
                break;
            case 13:
                PlayerDisplay.setImageResource(R.drawable.centiclak);
                break;
            case 14:
                PlayerDisplay.setImageResource(R.drawable.uggnawb);
                break;
            case 15:
                PlayerDisplay.setImageResource(R.drawable.grobhost);
                break;
            case 16:
                PlayerDisplay.setImageResource(R.drawable.illelonab);
                break;
            case 17:
                PlayerDisplay.setImageResource(R.drawable.rongzeed);
                break;
            case 18:
                PlayerDisplay.setImageResource(R.drawable.blattle);
                break;
            case 19:


                if (new Random().nextInt(100000000)< 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.swogharnlera);
                }else {
                    PlayerDisplay.setImageResource(R.drawable.swogharnler);
                }
                break;
            case 20:
                PlayerDisplay.setImageResource(R.drawable.adenolish);
                break;
            case 21:
                //PlayerDisplay.setImageResource(R.drawable.Genaupresang);
                break;
            case 22:
                if (new Random().nextInt(100000000)< 20000000) {
                    PlayerDisplay.setImageResource(R.drawable.daahnida);
                }else if (new Random().nextInt(100000000)< 40000000){
                    PlayerDisplay.setImageResource(R.drawable.daahnidaa);
                }else if (new Random().nextInt(100000000)< 60000000){
                    PlayerDisplay.setImageResource(R.drawable.daahnidab);
                }else if (new Random().nextInt(100000000)< 80000000){
                    PlayerDisplay.setImageResource(R.drawable.daahnidac);
                }else {
                    PlayerDisplay.setImageResource(R.drawable.daahnidad);
                }


                int daahnidacolorsetter = new Random().nextInt(100000000)% 7; //>>>
                int daahnidacolorcontroller = new Random().nextInt(100000000)% 255;

                switch (daahnidacolorsetter){
                    case 0:
                        PlayerDisplay.setColorFilter(Color.argb(70, 255, 255, daahnidacolorcontroller));
                        break;
                    case 1:
                        PlayerDisplay.setColorFilter(Color.argb(70, 255, daahnidacolorcontroller, 255 ));
                        break;
                    case 2:
                        PlayerDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, 255, 255 ));
                        break;
                    case 3:
                        PlayerDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, 255, daahnidacolorcontroller));
                        break;
                    case 4:
                        PlayerDisplay.setColorFilter(Color.argb(70, 255, daahnidacolorcontroller, daahnidacolorcontroller ));
                        break;
                    case 5:
                        PlayerDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, daahnidacolorcontroller, 255 ));
                        break;
                    case 6:
                        PlayerDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, daahnidacolorcontroller, daahnidacolorcontroller ));
                        break;
                }





                break;
            case 23:
                PlayerDisplay.setImageResource(R.drawable.sorba);
                break;
            case 24:
                PlayerDisplay.setImageResource(R.drawable.jiyou);
                break;
            case 25:
                PlayerDisplay.setImageResource(R.drawable.sparvae);
                break;
            case 26:
                PlayerDisplay.setImageResource(R.drawable.vellup);
                break;
            case 27:
                PlayerDisplay.setImageResource(R.drawable.bellaja);
                break;
            case 28:
                PlayerDisplay.setImageResource(R.drawable.levdzell);
                break;
            case 29:
                if (new Random().nextInt(100000000)< 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.ryteggg);
                }else {
                    PlayerDisplay.setImageResource(R.drawable.rytegg);
                }
                break;
            case 30:
                PlayerDisplay.setImageResource(R.drawable.flashmer);
                break;
            case 31:
                PlayerDisplay.setImageResource(R.drawable.schmodozer);
                break;
            case 32:
                //PlayerDisplay.setImageResource(R.drawable.Octgotot);
                break;
            case 33:
                PlayerDisplay.setImageResource(R.drawable.triaural);
                break;
            case 34:
                PlayerDisplay.setImageResource(R.drawable.dicyto);
                break;
            case 35:
                PlayerDisplay.setImageResource(R.drawable.monopteryx);
                break;
            case 36:
                PlayerDisplay.setImageResource(R.drawable.elastocark);
                break;
            case 37:
                PlayerDisplay.setImageResource(R.drawable.toobapath);
                break;
            case 38:
                PlayerDisplay.setImageResource(R.drawable.wheeliosbop);
                break;
            case 39:
                PlayerDisplay.setImageResource(R.drawable.ihmpdrap);
                break;
            case 40:
                PlayerDisplay.setImageResource(R.drawable.epibazang);
                break;
            case 41:
                PlayerDisplay.setImageResource(R.drawable.hemtan);
                break;
            case 42:
                PlayerDisplay.setImageResource(R.drawable.ogo);
                break;
            case 43:
                PlayerDisplay.setImageResource(R.drawable.strachid);
                break;
            case 44:
                PlayerDisplay.setImageResource(R.drawable.toximastica);
                break;
            case 45:
                PlayerDisplay.setImageResource(R.drawable.urcuria);
                break;
            case 46:

                if (new Random().nextInt(100000000)< 22000000) {
                    PlayerDisplay.setImageResource(R.drawable.hyuntress);
                }else if(new Random().nextInt(100000000)< 45000000) {
                    PlayerDisplay.setImageResource(R.drawable.hyuntressa);
                }else if(new Random().nextInt(100000000)< 70000000) {
                    PlayerDisplay.setImageResource(R.drawable.hyuntressb);
                }else {
                    PlayerDisplay.setImageResource(R.drawable.hyuntressc);
                }
                break;
            case 47:
                PlayerDisplay.setImageResource(R.drawable.mondosplak);
                break;
            case 48:
                PlayerDisplay.setImageResource(R.drawable.kaheksaguge);
                break;
            case 49:
                PlayerDisplay.setImageResource(R.drawable.sapiosuant);
                break;
            case 50:
                PlayerDisplay.setImageResource(R.drawable.munegull);
                break;
            case 51:
                PlayerDisplay.setImageResource(R.drawable.sudakleez);
                break;
            case 52:
                PlayerDisplay.setImageResource(R.drawable.halocordate);
                break;
            case 53:
                PlayerDisplay.setImageResource(R.drawable.faedendron);
                break;
            case 54:
                PlayerDisplay.setImageResource(R.drawable.osteoplang);
                break;
            case 55:
                PlayerDisplay.setImageResource(R.drawable.zrachnid);
                break;
            case 56:
                PlayerDisplay.setImageResource(R.drawable.xlitch);
                break;
            case 57:
                PlayerDisplay.setImageResource(R.drawable.baa);
                break;
            case 58:
                PlayerDisplay.setImageResource(R.drawable.mantidile);
                break;
            case 59:
                PlayerDisplay.setImageResource(R.drawable.nokoyl);
                break;
            case 60:
                PlayerDisplay.setImageResource(R.drawable.yallod);
                break;
            case 61:
                PlayerDisplay.setImageResource(R.drawable.algaetizer);
                break;
            case 62:
                PlayerDisplay.setImageResource(R.drawable.kachort);
                break;
            case 63:
                if (new Random().nextInt(100000000)< 22000000) {
                    PlayerDisplay.setImageResource(R.drawable.slamelion);
                }else if(new Random().nextInt(100000000)< 45000000) {
                    PlayerDisplay.setImageResource(R.drawable.slamelionb);
                }else if(new Random().nextInt(100000000)< 70000000) {
                    PlayerDisplay.setImageResource(R.drawable.slameliona);
                }else {
                    PlayerDisplay.setImageResource(R.drawable.slamelion);
                }
                break;
            case 64:
                PlayerDisplay.setImageResource(R.drawable.ayateda);
                break;
            case 65:
                PlayerDisplay.setImageResource(R.drawable.wochem);
                break;
            case 66:
                PlayerDisplay.setImageResource(R.drawable.humun);
                break;
            case 67:
                PlayerDisplay.setImageResource(R.drawable.psychobath);
                break;
            case 68:
                PlayerDisplay.setImageResource(R.drawable.gytanic);
                break;
            case 69:
                PlayerDisplay.setImageResource(R.drawable.beis);
                break;
            case 70:
                PlayerDisplay.setImageResource(R.drawable.gungholio);
                break;
            case 71:
                PlayerDisplay.setImageResource(R.drawable.honigkonig);
                break;
            case 72:
                PlayerDisplay.setImageResource(R.drawable.kungulp);
                break;
            case 73:
                PlayerDisplay.setImageResource(R.drawable.satinella);
                break;
            case 74:
                PlayerDisplay.setImageResource(R.drawable.elocurl);
                break;
            case 75:
                PlayerDisplay.setImageResource(R.drawable.takobie);
                break;
            case 76:
                PlayerDisplay.setImageResource(R.drawable.obchovy);
                break;
            case 77:
                PlayerDisplay.setImageResource(R.drawable.nimnamnom);
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
                PlayerDisplay.setImageResource(R.drawable.deblobbio);
                break;
            case 82:
                PlayerDisplay.setImageResource(R.drawable.knightstacean);
                break;
            case 83:
                PlayerDisplay.setImageResource(R.drawable.prostrax);
                break;
            case 84:
                PlayerDisplay.setImageResource(R.drawable.haptozahen);
                break;
            case 85:
                PlayerDisplay.setImageResource(R.drawable.minkohabod);
                break;
            case 86:
                if (new Random().nextInt(100000000)< 22000000) {
                    PlayerDisplay.setImageResource(R.drawable.firstcustom);
                }else if(new Random().nextInt(100000000)< 45000000) {
                    PlayerDisplay.setImageResource(R.drawable.firstcustoma);
                }else if(new Random().nextInt(100000000)< 70000000) {
                    PlayerDisplay.setImageResource(R.drawable.firstcustomb);
                }else {
                    PlayerDisplay.setImageResource(R.drawable.firstcustomc);
                }

                catcher = 1;

                break;


        }


    }


    public int SpecialMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(9);

        return startingmove;
    }

    public int HealMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(10);

        return startingmove;
    }

    public int SpeedMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(14);

        return startingmove;
    }

    public int UniqueIdentifier(int needless){
        return new Random().nextInt(100000000);
    }


    public protomon.monst monstlist(int idnumber){

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
                return Prostrax;
            case 84:
                return Haptozahen;
            case 85:
                return Minkohabod;
            case 86:
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

    public void Populate(ImageView EnemyDisplay, protomon.monst AttackerMonsterHandle){

      //  EnemyDisplay.setColorFilter(Color.argb(0, 0, 0, 0));


        switch((int) AttackerMonsterHandle.Idnum){

            case 0:
                EnemyDisplay.setImageResource(R.drawable.errantnope);
                break;
            case 1:
                EnemyDisplay.setImageResource(R.drawable.kunk);
                break;
            case 2:
                EnemyDisplay.setImageResource(R.drawable.kohboh);
                break;
            case 3:
                EnemyDisplay.setImageResource(R.drawable.djoper);
                break;
            case 4:
                EnemyDisplay.setImageResource(R.drawable.schorp);
                break;
            case 5:
                if (AttackerMonsterHandle.UniqueID < 22000000) {
                    EnemyDisplay.setImageResource(R.drawable.zaume);
                }else if(AttackerMonsterHandle.UniqueID < 45000000) {
                    EnemyDisplay.setImageResource(R.drawable.zaumer);
                }else if(AttackerMonsterHandle.UniqueID < 70000000) {
                    EnemyDisplay.setImageResource(R.drawable.zaumeb);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.zaumeg);
                }
                break;
            case 6:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.nhainhai);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.nhainhaii);
                }
                break;
            case 7:
                EnemyDisplay.setImageResource(R.drawable.degeissdt);
                break;
            case 8:

                if (AttackerMonsterHandle.UniqueID < 22000000) {
                    EnemyDisplay.setImageResource(R.drawable.yuggle);
                }else if(AttackerMonsterHandle.UniqueID < 45000000) {
                    EnemyDisplay.setImageResource(R.drawable.yugglee);
                }else if(AttackerMonsterHandle.UniqueID < 70000000) {
                    EnemyDisplay.setImageResource(R.drawable.yugglet);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.yuggler);
                }
                break;
            case 9:
                EnemyDisplay.setImageResource(R.drawable.bongu);
                break;
            case 10:
                EnemyDisplay.setImageResource(R.drawable.giteriglia);
                break;
            case 11:
                EnemyDisplay.setImageResource(R.drawable.cyosteroth);
                break;
            case 12:
                EnemyDisplay.setImageResource(R.drawable.nentopode);
                break;
            case 13:
                EnemyDisplay.setImageResource(R.drawable.centiclak);
                break;
            case 14:
                EnemyDisplay.setImageResource(R.drawable.uggnawb);
                break;
            case 15:
                EnemyDisplay.setImageResource(R.drawable.grobhost);
                break;
            case 16:
                EnemyDisplay.setImageResource(R.drawable.illelonab);
                break;
            case 17:
                EnemyDisplay.setImageResource(R.drawable.rongzeed);
                break;
            case 18:
                EnemyDisplay.setImageResource(R.drawable.blattle);
                break;
            case 19:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.swogharnlera);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.swogharnler);
                }
                break;
            case 20:
                EnemyDisplay.setImageResource(R.drawable.adenolish);
                break;
            case 21:
                //EnemyDisplay.setImageResource(R.drawable.Genaupresang);
                break;
            case 22:

                if (AttackerMonsterHandle.UniqueID < 20000000) {
                    EnemyDisplay.setImageResource(R.drawable.daahnida);
                }else if (AttackerMonsterHandle.UniqueID < 40000000){
                    EnemyDisplay.setImageResource(R.drawable.daahnidaa);
                }else if (AttackerMonsterHandle.UniqueID < 60000000){
                    EnemyDisplay.setImageResource(R.drawable.daahnidab);
                }else if (AttackerMonsterHandle.UniqueID < 80000000){
                    EnemyDisplay.setImageResource(R.drawable.daahnidac);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.daahnidad);
                }


                int daahnidacolorsetter = AttackerMonsterHandle.UniqueID % 7; //>>>
                int daahnidacolorcontroller = AttackerMonsterHandle.UniqueID % 255;

                switch (daahnidacolorsetter){
                    case 0:
                        EnemyDisplay.setColorFilter(Color.argb(70, 255, 255, daahnidacolorcontroller));
                        break;
                    case 1:
                        EnemyDisplay.setColorFilter(Color.argb(70, 255, daahnidacolorcontroller, 255 ));
                        break;
                    case 2:
                        EnemyDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, 255, 255 ));
                        break;
                    case 3:
                        EnemyDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, 255, daahnidacolorcontroller));
                        break;
                    case 4:
                        EnemyDisplay.setColorFilter(Color.argb(70, 255, daahnidacolorcontroller, daahnidacolorcontroller ));
                        break;
                    case 5:
                        EnemyDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, daahnidacolorcontroller, 255 ));
                        break;
                    case 6:
                        EnemyDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, daahnidacolorcontroller, daahnidacolorcontroller ));
                        break;
                }

                break;
            case 23:
                EnemyDisplay.setImageResource(R.drawable.sorba);
                break;
            case 24:
                EnemyDisplay.setImageResource(R.drawable.jiyou);
                break;
            case 25:
                EnemyDisplay.setImageResource(R.drawable.sparvae);
                break;
            case 26:
                EnemyDisplay.setImageResource(R.drawable.vellup);
                break;
            case 27:
                EnemyDisplay.setImageResource(R.drawable.bellaja);
                break;
            case 28:
                EnemyDisplay.setImageResource(R.drawable.levdzell);
                break;
            case 29:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.ryteggg);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.rytegg);
                }
                break;
            case 30:
                EnemyDisplay.setImageResource(R.drawable.flashmer);
                break;
            case 31:
                EnemyDisplay.setImageResource(R.drawable.schmodozer);
                break;
            case 32:
                //EnemyDisplay.setImageResource(R.drawable.Octgotot);
                break;
            case 33:
                EnemyDisplay.setImageResource(R.drawable.triaural);
                break;
            case 34:
                EnemyDisplay.setImageResource(R.drawable.dicyto);
                break;
            case 35:
                EnemyDisplay.setImageResource(R.drawable.monopteryx);
                break;
            case 36:
                EnemyDisplay.setImageResource(R.drawable.elastocark);
                break;
            case 37:
                EnemyDisplay.setImageResource(R.drawable.toobapath);
                break;
            case 38:
                EnemyDisplay.setImageResource(R.drawable.wheeliosbop);
                break;
            case 39:
                EnemyDisplay.setImageResource(R.drawable.ihmpdrap);
                break;
            case 40:
                EnemyDisplay.setImageResource(R.drawable.epibazang);
                break;
            case 41:
                EnemyDisplay.setImageResource(R.drawable.hemtan);
                break;
            case 42:
                EnemyDisplay.setImageResource(R.drawable.ogo);
                break;
            case 43:
                EnemyDisplay.setImageResource(R.drawable.strachid);
                break;
            case 44:
                EnemyDisplay.setImageResource(R.drawable.toximastica);
                break;
            case 45:
                EnemyDisplay.setImageResource(R.drawable.urcuria);
                break;
            case 46:
                if (AttackerMonsterHandle.UniqueID < 22000000) {
                    EnemyDisplay.setImageResource(R.drawable.hyuntress);
                }else if(AttackerMonsterHandle.UniqueID < 45000000) {
                    EnemyDisplay.setImageResource(R.drawable.hyuntressa);
                }else if(AttackerMonsterHandle.UniqueID < 70000000) {
                    EnemyDisplay.setImageResource(R.drawable.hyuntressb);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.hyuntressc);
                }
                break;
            case 47:
                EnemyDisplay.setImageResource(R.drawable.mondosplak);
                break;
            case 48:
                EnemyDisplay.setImageResource(R.drawable.kaheksaguge);
                break;
            case 49:
                EnemyDisplay.setImageResource(R.drawable.sapiosuant);
                break;
            case 50:
                EnemyDisplay.setImageResource(R.drawable.munegull);
                break;
            case 51:
                EnemyDisplay.setImageResource(R.drawable.sudakleez);
                break;
            case 52:
                EnemyDisplay.setImageResource(R.drawable.halocordate);
                break;
            case 53:
                EnemyDisplay.setImageResource(R.drawable.faedendron);
                break;
            case 54:
                EnemyDisplay.setImageResource(R.drawable.osteoplang);
                break;
            case 55:
                EnemyDisplay.setImageResource(R.drawable.zrachnid);
                break;
            case 56:
                EnemyDisplay.setImageResource(R.drawable.xlitch);
                break;
            case 57:
                EnemyDisplay.setImageResource(R.drawable.baa);
                break;
            case 58:
                EnemyDisplay.setImageResource(R.drawable.mantidile);
                break;
            case 59:
                EnemyDisplay.setImageResource(R.drawable.nokoyl);
                break;
            case 60:
                EnemyDisplay.setImageResource(R.drawable.yallod);
                break;
            case 61:
                EnemyDisplay.setImageResource(R.drawable.algaetizer);
                break;
            case 62:
                EnemyDisplay.setImageResource(R.drawable.kachort);
                break;
            case 63:
                if (AttackerMonsterHandle.UniqueID < 22000000) {
                    EnemyDisplay.setImageResource(R.drawable.slamelion);
                }else if(AttackerMonsterHandle.UniqueID < 45000000) {
                    EnemyDisplay.setImageResource(R.drawable.slamelionb);
                }else if(AttackerMonsterHandle.UniqueID < 70000000) {
                    EnemyDisplay.setImageResource(R.drawable.slameliona);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.slamelion);
                }
                break;
            case 64:
                EnemyDisplay.setImageResource(R.drawable.ayateda);
                break;
            case 65:
                EnemyDisplay.setImageResource(R.drawable.wochem);
                break;
            case 66:
                EnemyDisplay.setImageResource(R.drawable.humun);
                break;
            case 67:
                EnemyDisplay.setImageResource(R.drawable.psychobath);
                break;
            case 68:
                EnemyDisplay.setImageResource(R.drawable.gytanic);
                break;
            case 69:
                EnemyDisplay.setImageResource(R.drawable.beis);
                break;
            case 70:
                EnemyDisplay.setImageResource(R.drawable.gungholio);
                break;
            case 71:
                EnemyDisplay.setImageResource(R.drawable.honigkonig);
                break;
            case 72:
                EnemyDisplay.setImageResource(R.drawable.kungulp);
                break;
            case 73:
                EnemyDisplay.setImageResource(R.drawable.satinella);
                break;
            case 74:
                EnemyDisplay.setImageResource(R.drawable.elocurl);
                break;
            case 75:
                EnemyDisplay.setImageResource(R.drawable.takobie);
                break;
            case 76:
                EnemyDisplay.setImageResource(R.drawable.obchovy);
                break;
            case 77:
                EnemyDisplay.setImageResource(R.drawable.nimnamnom);
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
                EnemyDisplay.setImageResource(R.drawable.deblobbio);
                break;
            case 82:
                EnemyDisplay.setImageResource(R.drawable.knightstacean);
                break;
            case 83:
                EnemyDisplay.setImageResource(R.drawable.prostrax);
                break;
            case 84:
                EnemyDisplay.setImageResource(R.drawable.haptozahen);
                break;
            case 85:
                EnemyDisplay.setImageResource(R.drawable.minkohabod);
                break;
            case 86:
                if (AttackerMonsterHandle.UniqueID < 22000000) {
                    EnemyDisplay.setImageResource(R.drawable.firstcustom);
                }else if(AttackerMonsterHandle.UniqueID < 45000000) {
                    EnemyDisplay.setImageResource(R.drawable.firstcustoma);
                }else if(AttackerMonsterHandle.UniqueID < 70000000) {
                    EnemyDisplay.setImageResource(R.drawable.firstcustomb);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.firstcustomc);
                }
                break;

        }


    }
    
}