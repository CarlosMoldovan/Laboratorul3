package Exercitiul1;

public class planta {
    String nume;
    String sezon;
    private int varsta;
    private int kgrecoltă;
   public planta(String nume,String sezon)
   {
     this.nume = nume;
     this.sezon = sezon;
   }
   public planta(int varsta,int kgrecoltă)
   {
    this.kgrecoltă = kgrecoltă;
    this.varsta = varsta;
   }
   public void setVarsta(int varstaînluni)
   {
     varsta = varstaînluni;
   }
   public int getVarsta()
   {
     return varsta;
   }
   public void setKgRecolta(int kgrecoltă)
   {
     this.kgrecoltă = kgrecoltă;
   }
   public int getKgRecoltă()
   {
     return kgrecoltă;
   }
   public String anBunSauNu()
   {
    if(kgrecoltă > 4)
    {
        return "Recoltă bogată";
    }else{
        return "Recoltă săracă";
    }
   }
   public String anotimpPlanta()
   {
    if(sezon == "vara")
     {
        return "Planta este de vara";
     }else{
        return "Planta este de toamnă";
     }
   }
   @Override
   public String toString() {
       return "Planta se numeste " + nume + ",fiind o plantă de " + sezon +" cu durate de viață de " + varsta + " luni,avand o recolta de " + kgrecoltă +" kg!";
   }
}