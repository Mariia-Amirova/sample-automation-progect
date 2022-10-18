package net.absoft.mortalwombat;

public class AgeChecker {
    private final int MIN_AGE = 18;

    public boolean canPlayGame(int age) {
        return age >= MIN_AGE;
    }

    public Boolean canNotPlayGame(int age) {
        return age < MIN_AGE;
    }
}
