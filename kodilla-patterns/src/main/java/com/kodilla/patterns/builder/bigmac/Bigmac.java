package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final Bun bun;
    private final int burgers;
    private final Sauce sauce;
    private List<Ingredients> ingredients = new ArrayList<>();

    public static class BigmacBuilder {

        private Bun bun;
        private int burgers;
        private Sauce sauce;
        private List<Ingredients> ingredients = new ArrayList<>();

        public BigmacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(Ingredients ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build(){
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public Bigmac(Bun bun, int burgers, Sauce sauce, List<Ingredients> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
