package com.pokemon;
public class Type {
    private BasicType main = BasicType.NONE;
    private BasicType sub = BasicType.NONE;

    public Type(String mainType) { 
        this.main = BasicType.valueOf(mainType.toUpperCase());
    }

    public Type(String mainType, String subType) {
        this.main = BasicType.valueOf(mainType.toUpperCase());
        if (subType != null) {
            this.sub = BasicType.valueOf(subType.toUpperCase());
        }
    }

    public Boolean hasType(BasicType type) {
        return (main.equals(type) || sub.equals(type));
    }

    @Override
    public String toString() {
        String str = "Type: " + this.main.getDisplayName();
        return (this.sub == BasicType.NONE)? (str) : (str + " AND " + this.sub.getDisplayName()); 
    }
}
