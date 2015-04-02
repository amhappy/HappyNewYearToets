package driver;

import GUI.HappyNewYearJFrame;

import java.util.ArrayList;
import javax.swing.JFrame;

import models.Vuurwerk;

public class HappyNewYearDriver {

    private static ArrayList<Vuurwerk> pakket = new ArrayList<Vuurwerk>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Happy new year from: Peter");

        stap1();

        stap2();

        stap3();
        
        //Now some coding for a GUI
//        paintGUI(pakket);
    }

    private static void stap1() {
/*
        System.out.println("\n--- STAP 1 ---");

        Vuurwerk vuurwerk;

        // vuurwerk met Nederlandstalige instructie
        vuurwerk = new Vuurwerk("Veiligheidsbril", 2.5,
                new Instructie(true, 6, "Draag bij aansteken"));
        System.out.println(vuurwerk);

        // vuurwerk met Engelstalige instructie
        vuurwerk = new Vuurwerk("Safety glass", 2.5,
                new Instructie(false, 6, "Wear before ignition"));
        System.out.println(vuurwerk);

        // vuurwerk zonder instructie
        vuurwerk = new Vuurwerk("Aansteeklont zonder instructie", 0.25, null);
        System.out.println(vuurwerk);
*/
    }

    private static void stap2() {
/*
        System.out.println("\n--- STAP 2 ---");

        Knaller knaller;

        // knaller met Engelstalige instructie en 75 decibel
        knaller = new Knaller(777, 75, "Celebration Crackers", 10,
                new Instructie(false, 21, "Keep minimum 10 ft distance"));
        System.out.println(knaller);

        // knaller met Nederlandstalige instructie en 120 decibel
        knaller = new Knaller(500, 120, "Peking Rol", 45,
                new Instructie(true, 21, "Houd minimaal 5 meter afstand"));
        System.out.println(knaller);
    
        // knaller met Nederlandstalige instructie en 125 decibel
        knaller = new Knaller(1000, 125, "Shanghai Rol", 85,
                new Instructie(true, 21, "Houd minimaal 5 meter afstand"));
        System.out.println(knaller);
    
        // knaller zonder instructie en 100 decibel
        knaller = new Knaller(1000, 100, "Hongkong Rol", 82.5, null);
        System.out.println(knaller);
*/
    }

    private static void stap3() {
/*
        System.out.println("\n--- STAP 3 ---");

        Vuurpijl vuurpijl;

        // vuurpijl met Nederlandstalige instructie, correcte kleurverhouding, leeftijd 10
        vuurpijl = new Vuurpijl(40, new int[]{50, 25, 25}, "Cruise Rocket", 2.50,
                new Instructie(true, 10, "Niet in de hand houden"));
        System.out.println(vuurpijl);

        // vuurpijl met Nederlandstalige instructie, incorrecte kleurverhouding, leeftijd 16
        vuurpijl = new Vuurpijl(40, new int[]{25, 30, 44}, "Killing Arrow", 4.25,
                new Instructie(true, 16, "Niet in de hand houden"));
        System.out.println(vuurpijl);

        // vuurpijl met Engelstalige instructie, incorrecte kleurverhouding, leeftijd 20
        vuurpijl = new Vuurpijl(40, new int[]{50, 41, 10}, "Magic Sky", 2.75,
                new Instructie(false, 20, "Keep minimum 10 ft distance"));
        System.out.println(vuurpijl);

        // vuurpijl zonder instructie, correcte kleurverhouding
        vuurpijl = new Vuurpijl(40, new int[]{50, 50, 0}, "Golden Sky", 3.25, null);
        System.out.println(vuurpijl);
*/
    }

    public static void paintGUI(ArrayList<Vuurwerk> vuurwerkLijstje) {
        JFrame frame = new HappyNewYearJFrame(vuurwerkLijstje);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(new Dimension(1200,800));
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("Happy 2015");
    }

}
