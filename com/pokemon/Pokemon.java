package com.pokemon;
public class Pokemon {
    private String name;
    private int dexID;
    private Type type;

    public Pokemon(String name, int dexNum, String mainType) {
        this.name = name;
        this.dexID = dexNum;
        this.type = new Type(mainType);
    }

    public Pokemon(String name, int dexNum, String mainType, String subType) {
        this.name = name;
        this.dexID = dexNum;
        this.type = new Type(mainType, subType);
    }

    public Pokemon(String name, int dexNum, Type type) {
        this.name = name;
        this.dexID = dexNum;
        this.type = type;
    }

    public Pokemon(Pokemon pokemon) {
        this.copy(pokemon);
    }

    public void copy(Pokemon pokemon) {
        this.name = pokemon.name;
        this.type = pokemon.type;
        this.dexID = pokemon.dexID;
    }

    public String getName() {
        return name;
    }
    
    public int getdexNum() {
        return dexID;
    }

    public Type getType() {
        return this.type;
    }

    @Override
    public String toString() {
        String str = "DexID: " + this.dexID + "\n";
        str += "Name: " + this.name + "\n";
        str += this.type;
        return str;
    }
    
}
