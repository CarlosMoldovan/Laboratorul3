package Exercitiul1;

public class ex1main {
    public static void main(String[] args)
    {
        planta planta1 = new planta(6, 4);
        planta planta2 = new planta("Rosie","vara");
        System.out.println(planta1.anBunSauNu());
        System.out.println(planta2.anotimpPlanta());
        planta2.setKgRecolta(10);
        planta2.setVarsta(4);
        System.out.println(planta1.getKgRecoltă());
        System.out.println(planta1.getVarsta());
        gradina gradina1 = new gradina(10, 55);
        gradina gradina2 = new gradina(100,"Radu");
        gradina1.setDimensiune(400);
        gradina1.setNumePropietar("Ion");
        System.out.println(gradina2.getDimensiune());
        System.out.println(gradina2.getNumePropietar());
        System.out.println(gradina1.procentSuprafataArabilă());
        System.out.println(planta2);
        System.out.println(gradina1);
        floare floare1 = new floare();
        System.out.println(floare1.nume);
    }
}
