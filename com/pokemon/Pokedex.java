package com.pokemon;

import java.io.*;
import java.util.*;

public class Pokedex {
    private String region;
    private HashMap<Integer, Pokemon> pokedexByNumber = new HashMap<Integer, Pokemon>();
    private HashMap<String, Pokemon> pokedexByname = new HashMap<String, Pokemon>();

    
    public Pokedex(String filepath) {
        this.region = filepath.substring(filepath.indexOf("/") + 1, filepath.indexOf("."));
        System.out.println("Loading Pokedex for " + this.region + " region...");
        try {
            File f = new File(filepath);
            Scanner scanner = new Scanner(f);
            if(scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                String[] split = str.split(",");
                int dexNumber = Integer.parseInt(split[0]);
                String name = split[1];
                String mainType = split[2];
                String subType = null;
                if (split.length > 3){
                    subType = split[3];
                }

                Pokemon pokemon = new Pokemon(name, dexNumber, mainType, subType);
                pokedexByNumber.put(dexNumber, pokemon);
                pokedexByname.put(name, pokemon);

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    public Pokemon getPokemon(int dexNumber) {
        return pokedexByNumber.get(dexNumber);
    }

    public Pokemon getPokemon(String name) {
        String str = name.substring(0, 1).toUpperCase() + name.substring(1, name.length()).toLowerCase();
        return pokedexByname.get(str);
    }

    public int getSize() {
        return pokedexByNumber.size();
    }

    @Override
    public String toString() {
        return "This is the Pokedex for the " + this.region + " region!";
    }
}
