package com.mohamedhedhili.jeuxpendu;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout container  ;
    private Button a,b,c,d,e,f,t,y,u,i,o,p,r,z,q,s,g,h,j,k,l,m,w,x,v,n ,btnTiret6 ;
    private TextView textViewAide  ;

    private ImageView image  ;

    private String  word   ;
    private String aideWord ;
    private boolean  verify   ;
    private int  found  ;
    private int error  ;
    private List<Character> list  =new ArrayList<>();
    private List<String> listword = new ArrayList<>();
    private List<String> listAide = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container=(LinearLayout) findViewById(R.id.layout1);
        textViewAide =(TextView)findViewById(R.id.textViewAide);
        a = (Button)findViewById(R.id.btnA);
        a.setOnClickListener(this);
        b = (Button)findViewById(R.id.btnB);
        b.setOnClickListener(this);
        c = (Button)findViewById(R.id.btnC);
        c.setOnClickListener(this);
        d = (Button)findViewById(R.id.btnD);
        d.setOnClickListener(this);
        e = (Button)findViewById(R.id.btnE);
        e.setOnClickListener(this);
        f = (Button)findViewById(R.id.btnF);
        f.setOnClickListener(this);
        h = (Button)findViewById(R.id.btnH);
        h.setOnClickListener(this);
        i = (Button)findViewById(R.id.btnI);
        i.setOnClickListener(this);
        j = (Button)findViewById(R.id.btnJ);
        j.setOnClickListener(this);
        g = (Button)findViewById(R.id.btnG);
        g.setOnClickListener(this);
        u = (Button)findViewById(R.id.btnU);
        u.setOnClickListener(this);
        n = (Button)findViewById(R.id.btnN);
        n.setOnClickListener(this);
        v = (Button)findViewById(R.id.btnV);
        v.setOnClickListener(this);
        t = (Button)findViewById(R.id.btnT);
        t.setOnClickListener(this);
        y= (Button)findViewById(R.id.btnY);
        y.setOnClickListener(this);
        p= (Button)findViewById(R.id.btnP);
        p.setOnClickListener(this);
        o= (Button)findViewById(R.id.btnO);
        o.setOnClickListener(this);
        r= (Button)findViewById(R.id.btnR);
        r.setOnClickListener(this);
        z= (Button)findViewById(R.id.btnZ);
        z.setOnClickListener(this);
        q= (Button)findViewById(R.id.btnQ);
        q.setOnClickListener(this);
        s= (Button)findViewById(R.id.btnS);
        s.setOnClickListener(this);
        x= (Button)findViewById(R.id.btnX);
        x.setOnClickListener(this);
       w= (Button)findViewById(R.id.btnW);
        w.setOnClickListener(this);
        m= (Button)findViewById(R.id.btnM);
        m.setOnClickListener(this);
        l= (Button)findViewById(R.id.btnL);
        l.setOnClickListener(this);
        k= (Button)findViewById(R.id.btnK);
        k.setOnClickListener(this);
        btnTiret6 = (Button)findViewById(R.id.btnTiret6);
        btnTiret6.setOnClickListener(this);


        image = (ImageView)findViewById(R.id.image);


        initialiser ();

    }
private boolean verifyLettreinList (Character a  ,  List<Character> caracteres)

{   for  (int i =0 ; i<caracteres.size();i++)
     {
     if (caracteres.get(i)==a)
     {
         Toast.makeText(getApplicationContext(),"Vous  avez  déja utilisez  cette lettre",Toast.LENGTH_SHORT).show();
     return  true ;
     }
     }

    return false ;}



    private void initialiser ()
    {
        a.setVisibility(View.VISIBLE);
        z.setVisibility(View.VISIBLE);
        e.setVisibility(View.VISIBLE);
        r.setVisibility(View.VISIBLE);
        t.setVisibility(View.VISIBLE);
        y.setVisibility(View.VISIBLE);
        u.setVisibility(View.VISIBLE);
        i.setVisibility(View.VISIBLE);
        o.setVisibility(View.VISIBLE);
        p.setVisibility(View.VISIBLE);
        q.setVisibility(View.VISIBLE);
        s.setVisibility(View.VISIBLE);
        d.setVisibility(View.VISIBLE);
        f.setVisibility(View.VISIBLE);
        g.setVisibility(View.VISIBLE);
        h.setVisibility(View.VISIBLE);
        j.setVisibility(View.VISIBLE);
        k.setVisibility(View.VISIBLE);
        l.setVisibility(View.VISIBLE);
        m.setVisibility(View.VISIBLE);
        w.setVisibility(View.VISIBLE);
        x.setVisibility(View.VISIBLE);
        c.setVisibility(View.VISIBLE);
        v.setVisibility(View.VISIBLE);
        b.setVisibility(View.VISIBLE);
        n.setVisibility(View.VISIBLE);
        btnTiret6.setVisibility(View.VISIBLE);
        list.clear();
       listword= generateListFile();
        int random  = (int) (Math.floor(Math.random() * listword.size())) ;
        listAide = generateListFileAide() ;
        word = listword.get(random).trim()  ;
        aideWord =  "Aide :" +listAide.get(random).trim();
        textViewAide.setText(aideWord);
        found =0 ;
        error =  0 ;
        verify=false ;
        list.clear();

        image.setBackgroundResource(R.drawable.first);
        container.removeAllViews();
        for(int i=0 ;  i<word.length();i++)
        {
            TextView text =  (TextView)getLayoutInflater().inflate(R.layout.textview,null);
            container.addView(text);
        }

    }
    /***          Methode verifier  lettre in  word  **/

    private void verifyLettreInWord (String a , String word)
    {   boolean verify  =  false  ;
      for(int i =0;i<word.length();i++)
      {
          if(a.equals(String.valueOf(word.charAt(i))))
          {   verify  =  true  ;
              TextView txt  =  (TextView)container.getChildAt(i);
              txt.setText(String.valueOf(word.charAt(i)));
              found++ ;
          }

      }
    }






    public void  showAllLettre (List<MyObject> l )
    { String  chaine  = "";
    for (int i=0;i<l.size();i++)
    {
        chaine+=l.get(i)+"\n" ;

    }
        if (!chaine.equals(""))
        {}
    }


    // changer l image
    public void  changeImage (int eror)
    {
        switch (eror)
        {case 1 :
        image.setBackgroundResource(R.drawable.second);
        break ;
            case 2 :
                image.setBackgroundResource(R.drawable.third);
                break ;
            case 3 :
                image.setBackgroundResource(R.drawable.fourth);
                break ;
            case 4 :
                image.setBackgroundResource(R.drawable.fifth);
                break ;

            case 5 :
                image.setBackgroundResource(R.drawable.sixth);
                break ;
            case 6 :
                image.setBackgroundResource(R.drawable.seventh);
                break ;
        }
    }

    private  void createDialog (boolean b )
    {
        AlertDialog.Builder alert =  new AlertDialog.Builder(this) ;
        alert.setTitle("Vous avez gagné") ;
        if (b ==  false)
        {
            alert.setTitle("Vous avez perdu") ;
            alert.setMessage("le mot est  : "+word);
        }
      alert.setPositiveButton(getResources().getString(R.string.Rejouer), new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which) {
              initialiser();

          }
      });
        alert.create().show();

    }

    // generate word  de maniére aléatoire
    public  List<String> generateListFile()
    {
       try {
           Bundle extras  =  getIntent().getExtras() ;
           String   nameFile = extras.getString("nameFile");
           int  deb =  extras.getInt("deb") ;
           int fin  = extras.getInt("fin");
           InputStream input =getAssets().open( nameFile);
            InputStreamReader in =new InputStreamReader(input) ;
           BufferedReader buffer =new BufferedReader(in);
           String line = null  ;
           for (int i = deb ; i<fin ; i++ )
           { line=buffer.readLine() ;

               listword.add(line) ;
           }
          // while ((line=buffer.readLine())!=null)

       }
       catch (IOException e)
       {}
        return listword ;
    }

    /***/
    public  List<String> generateListFileAide()
    {   String  aideNameFile = null;
        try {
            Bundle extras  =  getIntent().getExtras() ;
            String   nameFile = extras.getString("nameFile");
            int  deb =  extras.getInt("deb") ;
            int fin  = extras.getInt("fin");
            if (nameFile.equals("Sport.txt"))
                aideNameFile= "Sport-Aide.txt";
            else if (nameFile.equals("Maison.txt"))
                aideNameFile= "Maison-Aide.txt";
            else  if  (nameFile.equals("Ecole.txt"))
                aideNameFile= "Ecole-Aide.txt";
            else if (nameFile.equals("Pays-Capitales.txt"))
                aideNameFile= "Pays-Capitales-Aide.txt";
            else if (nameFile.equals("Metiers.txt"))
                aideNameFile= "Metiers-Aide.txt";
            else if  (nameFile.equals("Histoire.txt"))
                aideNameFile= "Histoire-Aide.txt";
            else if (nameFile.equals("Geographic.txt"))
                aideNameFile= "Geographic-Aide.txt";
            else if (nameFile.equals("Cartoon.txt"))
                aideNameFile= "Cartoon-Aide.txt";
            else if (nameFile.equals("Animaux.txt"))
                aideNameFile= "Animaux-Aide.txt";
            InputStream input =getAssets().open( aideNameFile);
            InputStreamReader in =new InputStreamReader(input) ;
            BufferedReader buffer =new BufferedReader(in);
            String line = null  ;
            for (int i = deb ; i<fin ; i++ )
            { line=buffer.readLine() ;

                listAide.add(line) ;
            }


        }
        catch (IOException e)
        {}
        return listAide ;
    }


    @Override
    public void onClick(View v) {

   if  (v.getId() == a.getId()) {
       btn("A") ;
       a.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== b.getId())
   {
       btn("B") ;
       b.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== c.getId())
   {
       btn("C") ;
       c.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== d.getId())
   {
       btn("D") ;
       d.setVisibility(View.INVISIBLE);
   }


   else if (v.getId()== e.getId())
   {
       btn("E") ;
       e.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== h.getId())
   {
       btn("H") ;
       h.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== j.getId())
   {
       btn("J") ;
       j.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== o.getId())
   {
       btn("O") ;
       o.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== p.getId())
   {
       btn("P") ;
       p.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== l.getId())
   {
       btn("L") ;
       l.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== k.getId())
   {
       btn("K") ;
       k.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== z.getId())
   {
       btn("Z") ;
       z.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== r.getId())
   {
       btn("R") ;
       r.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== t.getId())
   {
       btn("T") ;
       t.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== y.getId())
   {
       btn("Y") ;
       y.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== u.getId())
   {
       btn("U") ;
       u.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== i.getId())
   {
       btn("I") ;
       i.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== q.getId())
   {
       btn("Q") ;
       q.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== s.getId())
   {
       btn("S") ;
       s.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== f.getId())
   {
       btn("F") ;
       f.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== g.getId())
   {
       btn("G") ;
       g.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== m.getId())
   {
       btn("M") ;
       m.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== w.getId())
   {
       btn("W") ;
       w.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== x.getId())
   {
       btn("X") ;
       x.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== this.v.getId())
   {
       btn("V") ;
      v.setVisibility(View.INVISIBLE);
   }
   else if (v.getId()== n.getId())
   {
       btn("N") ;
       n.setVisibility(View.INVISIBLE);
   }
        else if (v.getId()== btnTiret6.getId())
   {
       btn("-") ;
       btnTiret6.setVisibility(View.INVISIBLE);
   }
   }
// traitement button
    public void btn (String s)
    {
        if (!(verifyLettreinList(s.charAt(0), list))) {
            list.add(s.charAt(0));

            verifyLettreInWord(s, word);
        }

        // partie pour  le gagnant
        if (word.length() == found) {
            verify = true;
            createDialog(verify);
        }
        // partie  partie  pour  le perdant

        if (!word.contains(s)) {
            error++;
        }
        // gestion image
        changeImage(error);
        // perdant
        if (error == 6) {
            verify = false;
            createDialog(verify);
        }
       // showAllLettre(list);
       }
    }

