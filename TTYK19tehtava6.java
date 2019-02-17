package ttyk19tehtava6;

import java.util.Scanner;

/**
 *
 * @author s1800575
 */
//2. Laadi itsellesi oma heuristiikka tai yksinkertainen algoritmi eettisten 
//ongelmien ratkaisuun. Eli kun joudut tekemään eettisen valinnan, mitä teet 
//- mitä vaiheita päätöksentekoon kuuluu? Heuristiikan ei tarvitse olla pitkä
//tai mutkikas ja voit perustaa sen normatiivisen etiikan teorioihin (kuten 
//hyve-etiikka, velvollisuusetiikka, seurausetiikka). Perustele kuitenkin, 
//miksi päädyit ratkaisuusi. Vastausta ei tarvitse kirjoittaa esseemuotoon. 
public class TTYK19tehtava6 {

    public static void HyveEtiikka() {
        System.out.println("HYVE-ETIIKKA: Vastaa miten hyveellisen ihmisen tulisi elää. Käsitys hyveistä muuttuu maailman mukana ja näin ollen\nhyve-etiikan käsitykset sen mukana. Hyve-etiikka voi olla yksilön tai joukon hyväksi johtavaa toimintaa.\n[enter]");
    }

    public static void VelvollisuusEtiikka() {
        System.out.println("VELVOLLISUUSETIIKKA: Velvollisuusetiikka kilpailee osittain seurausetiikan kanssa:\n\"Siinä missä seurausetiikka palauttaa oikean hyvään, velvollisuusetiikka palauttaa hyvän oikeaan\".\n[enter] ");
    }

    public static void SeurausEtiikka() {
        System.out.println("SEURAUSETIIKKA: Seurausetiikka vastaa kysymykseen \"Millainen teko on oikein?\".\n[enter]");
    }

    public static void main(String[] args) {

        int vastaus = 0;
        int summaH = 0;
        int summaV = 0;
        int summaS = 0;

        Scanner lukija = new Scanner(System.in);

        System.out.println("Apuohjelma eettisesti kestävään ratkaisuun päätöksenteossa\n");
        System.out.println("Tämä apuohjelma ottaa kantaa hyve-, velvollisuus- ja seurausetiikkan");
        System.out.println("Seuraavaksi kertaamme kyseiset etiikan lajit. Seuraavaan kohtaan pääset painamalla\n[enter]");
        lukija.nextLine();
        HyveEtiikka();
        lukija.nextLine();
        VelvollisuusEtiikka();
        lukija.nextLine();
        SeurausEtiikka();
        lukija.nextLine();
        System.out.println("Hyvä, siirrytään arivoimaan päätöksentekoa. Mieti kysymystäsi/tilannettasi/ongelmaasi.\n\nSen jälkeen vastaa seuraaviin kysymyksiin numerolla 1-3, missä 1 on PAHITEN ristiriidassa näkemyksesi kanssa ja 3 vastaa PARHAITEN näkemystäsi.\n\n");
        System.out.println("Olen hyvä ihminen, päätökseni pyrkivät edistämään yhteistä hyvää.\n[1-3] ja [enter]");
        vastaus = Integer.parseInt(lukija.nextLine());
        summaH = summaH + vastaus;
        System.out.println("Erotan oikean väärästä, ja toimin oikein vaikka se ei aina olisi hyväksi minulle.\n[1-3] ja [enter]");
        vastaus = Integer.parseInt(lukija.nextLine());
        summaV = summaV + vastaus;
        System.out.println("En välitä niinkään juridisista seurauksista, kunhan pystyn perustelemaan valintani eettisesti itselleni ja muille.\n[1-3] ja [enter]");
        vastaus = Integer.parseInt(lukija.nextLine());
        summaS = summaS + vastaus;
        System.out.println("Laitan lait eettisen ajattelun edelle.\n[1-3] ja [enter]");
        vastaus = Integer.parseInt(lukija.nextLine());
        summaH = summaH + vastaus;
        System.out.println("Tärkeintä valinnan lopputuloksessa on onnellisuus.\n[1-3] ja [enter]");
        vastaus = Integer.parseInt(lukija.nextLine());
        summaV = summaV + vastaus;
        System.out.println("Minulle on tärkeää saada yhteisön hyväksyntä toimilleni.\n[1-3] ja [enter]");
        vastaus = Integer.parseInt(lukija.nextLine());
        summaS = summaS + vastaus;
        System.out.println("Pohdin mitä odotuksia toimintaani/päätkseeni kohdistuu yhteisön toimesta.\n[1-3] ja [enter]");
        vastaus = Integer.parseInt(lukija.nextLine());
        summaH = summaH + vastaus;
        System.out.println("Päätökseni tulisi tuottaa nautintio minulle ja muille.\n[1-3] ja [enter]");
        vastaus = Integer.parseInt(lukija.nextLine());
        summaS = summaS + vastaus;
        System.out.println("Nautintoa tärkeämpää on kuitenkin, velvollisuuksien täyttyminen, vaikka se olisi epämukavaa.\n[1-3] ja [enter]");
        vastaus = Integer.parseInt(lukija.nextLine());
        summaV = summaV + vastaus;
                
        int summa = summaH+summaV+summaS;
        if (summa < 11 || summa > 25 ) {
             System.out.println("Vastasithan varmasti oikein kaikkiin kysymyksiin?");
        } else {
            System.out.println("Alla tarkempi analyysi vastauksestasi:\n");
          
        if (summaH > 4) {
            System.out.println("Hyve-eettinen pohdintasi on selvästi kestävällä pohjalla (pisteet "+summaH+"/9). Osaat hahmottaa mitkä asiat tekevät 2020-lukua lähestyttäessä hyvän ihmisen");
        } else {
            System.out.println("Hyve-eettisessä pohdinnassa sinulla oli hieman hapuilua. Saatoit pärjätä paremmin velvollisuus- tai seurauseettisessä ajattelussa. Kaikki eivät voi olla hyviä kaikessa.");
        }
        if (summaV < 4 && summaS < 4)
                System.out.println("Hyve-etiikka on selvästi vahvuutesi, perehdy vielä seurausetiikan ja velvollisuusetiikan asihoihin");
        if (summaV > 4) {
            System.out.println("Velvollisuuseettisesti (pisteet "+summaV+"/9) osaat pohtia mikä on oikein, eikä niinkuin mikä olisi hyvin. Osaat tehdä juridisesti oikeita päätöksiä.");
        } else {
            System.out.println("Velvollisuusettisyytesi kanssa haparoit. Pärjäsit varmasti paremmin muissa etiikan lajeissa. Pyrit varmasti tekemään aina oikein, mikä ei välttämättä täytä velvollisuus ettistä täydellisyyttä.");
        }
        if (summaS > 4) {
            System.out.println("Osaat pohtia seurauseettisiä ratkaisuita (pisteesi "+summaS+"/9). Monesti ne kuitenkin eroavat velvollisuuseettisestä näkemyksestä. Katso mitä miten olet menestynyt hyve-eettisessä ajattelussa.");
        } else {
            System.out.println("Seurauseettisyys ei ole vahvuutesi, mutta pärjäsit ehkä  paremmin velvollisuuseettisessä ajattelussa. Osaat varmasti tehdä juridisesti oikeista päätöksiä. Kaikki eivät voi olla hyviä kaikessa.");
        }
      
        }
          
        
    }
}
