/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registracija;

/**
 *
 * @author user
 */
class Tabela {
    private int ID,Kubikaza,Snaga;
    private String Ime,Prezime,JMBG,Marka,Model,Tablice;
   
    
    public Tabela(int ID,String Ime,String Prezime
            ,String JMBG,String Marka,String Model,int Kubikaza,int Snaga,String Tablice ){
        this.ID=ID;
        this.Ime=Ime;
        this.Prezime=Prezime;
        this.JMBG=JMBG;
        this.Marka=Marka;
        this.Model=Model;
        this.Kubikaza=Kubikaza;
        this.Snaga=Snaga;
        this.Tablice=Tablice;
      
    }
    public int getID(){
        return ID;
    }
    public String getIme(){
        return Ime;
    }
    public String getPrezime(){
        return Prezime;
    }
    public String getJMBG(){
        return JMBG;
    }
    public String getMarka(){
        return Marka;
    }
    public String getModel(){
        return Model;
    }
    public int getKubikaza(){
        return Kubikaza;
    }
    public int getSnaga(){
        return Snaga;
    }
    public String getTablice(){
        return Tablice;
    }
   
}
