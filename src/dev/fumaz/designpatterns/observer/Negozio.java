package dev.fumaz.designpatterns.observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Negozio {

    private final Map<Eventi, Set<Osservatore>> osservatori;

    public Negozio() {
        this.osservatori = new HashMap<>();
    }

    public void iscrivi(Eventi eventi, Osservatore osservatore) {
        osservatori.computeIfAbsent(eventi, k -> new HashSet<>()).add(osservatore);
    }

    public void notifica(Eventi eventi, String messaggio) {
        osservatori.getOrDefault(eventi, new HashSet<>()).forEach(o -> o.aggiorna(messaggio));
    }

}
