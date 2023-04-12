package fr.stayze.spells;

public abstract class Spell {

    protected String spellName;
    protected int spellLevel;

    public Spell(String spellName) {
        this.spellName = spellName;
        this.spellLevel = 1;
    }

    public String getSpellName() {
        return this.spellName;
    }

    public int getSpellLevel() {
        return this.spellLevel;
    }

    public void setSpellLevel(int spellLevel) { this.spellLevel = spellLevel; }

    abstract public void sendSpell();

    public String toString() {
        return "Spell : " + this.spellName + " | Level : " + this.spellLevel;
    }

}
