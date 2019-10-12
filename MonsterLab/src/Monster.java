/*
  author: Frank Gomes
  lab: Monster lab
  date: 26-09-19
  extra: Monsters have different species
 */

class Monster {
    // Fields
    private final String NAME;
    private final double HEIGHT;
    private final String SPECIES;

    // Constructor
    Monster(String name, double height, String species) {
        this.NAME = name;
        this.HEIGHT = height;
        this.SPECIES = species;
    }

    // Getters
    String getName() {
        return NAME;
    }

    String getSpecies() {
        return SPECIES;
    }

    // Compare with other monster
    boolean isBigger(Monster monster) {
        return this.HEIGHT > monster.HEIGHT;
    }

    boolean isSmaller(Monster monster) {
        return this.HEIGHT < monster.HEIGHT;
    }
}
