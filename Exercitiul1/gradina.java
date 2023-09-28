package Exercitiul1;

public class gradina {
    private int dimensiune;
    private String numePropietar;
    int nrsoiuriplante;
    int suprafataarabila;
    private String planta; //planta cea mai numeroasa în gradină
    public gradina(int dimensiune,String numePropietar)
    {
        this.dimensiune = dimensiune;
        this.numePropietar = numePropietar;
    }
    public gradina(int nrsoiuriplante, int suprafataarabila)
    {
        this.nrsoiuriplante = nrsoiuriplante;
        this.suprafataarabila = suprafataarabila;
    }
    public void setDimensiune(int dimensiuneÎnHectare)
    {
        dimensiune = dimensiuneÎnHectare;
    }
    public int getDimensiune()
    {
        return dimensiune;
    }
    public void setNumePropietar( String numepropietar)
    {
        numePropietar = numepropietar;
    }
    public String getNumePropietar()
    {
        return numePropietar;
    }
    public int procentSuprafataArabilă()
    {
        return  (dimensiune-suprafataarabila)/dimensiune*100;
    }
    public String diversitateGradina()
    {
        if(nrsoiuriplante > 10)
         return "Gradina are multe soiuri de plante!";
         else
          return "Gradina nu are multe soiuri de plante!";
    }
    public void schimbăPlantaCeaMaiNumeroasă(String denumirePlantaNoua)
    {
        planta = denumirePlantaNoua;
    }
    @Override
   public String toString() {
       return  "Grădina este detinuta de " + numePropietar + " are o dimensiune de" + dimensiune + " hectare,dintre care suprafata arabilă este de " + suprafataarabila + " hectare, avand " + nrsoiuriplante + " soiuri de plante!";
   }
}
