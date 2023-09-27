/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;
import java.util.ArrayList;

/**
 *
 * @author Tita
 */
public class Posttest1 {

public static void main(String[] args) {
        ArrayList<Formula1Drivers> formula = new ArrayList<>();

        System.out.println("\n>>> Formula 1 Top Drivers <<<");
        formula.add(new Formula1Drivers("Ferrari", "Charles Leclerc" , 1003));
        formula.add(new Formula1Drivers("Mercedes", "Lewis Hamilton", 4595));
        formula.add(new Formula1Drivers("Red Bull", "Max Verstappen", 2411));
        formula.add(new Formula1Drivers("Aston Martin", "Fernando Alonso", 2235));
        formula.add(new Formula1Drivers("McLaren", "Lando Norris", 543));

        for (Formula1Drivers fm : formula) {
            System.out.println("Car Team : " + fm.CarTeam + ", " + "Nama : " + fm.Nama + ", " + "Poin : " + fm.Points);
        }
    }
}