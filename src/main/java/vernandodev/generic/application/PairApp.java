package vernandodev.generic.application;

import vernandodev.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("richo", 1);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
