# Description
In this exercise, we have three Java classes: `planta`, `gradina`, and `floare`. These classes are used to represent plants, gardens, and flowers, and there's also a `main` class called `ex1main` to demonstrate their usage.

## `planta.java`
```java
package Exercitiul1;

/**
 * The `planta` class represents a plant with attributes like name, season, age, and harvest weight.
 * It provides methods to manipulate and retrieve these attributes.
 */
public class planta {
    // ... (the code for the planta class)
}
```

## `gradina.java`

```java
package Exercitiul1;

/**
 * The `gradina` class models a garden with properties such as size, owner's name, number of plant varieties,
 * and arable land area. It offers methods to interact with these properties.
 */
public class gradina {
    // ... (the code for the gradina class)
}

```

## `floare.java`

```java
package Exercitiul1;

/**
 * The `floare` class represents a flower with a name and the number of petals.
 * It provides a method to set the flower's name.
 */
public class floare {
    // ... (the code for the floare class)
}


```


## `ex1main.java`

```java
package Exercitiul1;
import java.util.Scanner;

/**
 * The `ex1main` class contains the main program to demonstrate the usage of the `planta`, `gradina`, and `floare` classes.
 * It creates instances of these classes and performs various operations.
 */
public class ex1main {
    public static void main(String[] args) {
        planta planta1 = new planta(6, 4);
        planta planta2 = new planta("Rosie", "vara");
        System.out.println(planta1.anBunSauNu());
        System.out.println(planta2.anotimpPlanta());
        planta2.setKgRecolta(10);
        planta2.setVarsta(4);
        System.out.println(planta1.getKgRecoltă());
        System.out.println(planta1.getVarsta());
        gradina gradina1 = new gradina(10, 55);
        gradina gradina2 = new gradina(100, "Radu");
        gradina1.setDimensiune(400);
        gradina1.setNumePropietar("Ion");
        System.out.println(gradina2.getDimensiune());
        System.out.println(gradina2.getNumePropietar());
        System.out.println(gradina1.procentSuprafataArabilă());
        System.out.println(planta2);
        System.out.println(gradina1);
        floare floare1 = new floare();
        floare1.setNume("Lalea");
        System.out.println(floare1.nume);
    }
}


```