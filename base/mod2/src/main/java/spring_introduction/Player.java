package spring_introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {
    private final String name;
    private final VARIANTS variant;

    public Player() {
        this.name = "Bot";
        this.variant = getRandomVariant();
    }

    public Player(VARIANTS var, String name) {
        this.name = name;
        this.variant = var;
    }

    private VARIANTS getRandomVariant() {
        int x = (int) (Math.random() * 3);
        return switch (x) {
            case 0 -> VARIANTS.ROCK;
            case 1 -> VARIANTS.PAPER;
            default -> VARIANTS.SCISSORS;
        };
    }

    public String whoWins(Player p1, Player p2) {
        List<VARIANTS> variants = Arrays.asList(VARIANTS.ROCK, VARIANTS.PAPER, VARIANTS.SCISSORS);
        int p1Index = variants.indexOf(p1.variant);
        int p2Index = variants.indexOf(p2.variant);

        if (p1Index == p2Index) {
            return "Ничья";
        }

        if ((p1Index - p2Index) == 1 || (p1Index - p2Index) == -2) {
            return "Победил игрок с именем: " + p1.name;
        }

        return "Победил игрок с именем: " + p2.name;
    }
}