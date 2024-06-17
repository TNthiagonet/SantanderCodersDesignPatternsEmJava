package DesignPatterns.Singleton.Solucao;

import java.util.HashMap;
import java.util.Map;

public class AgendaSingletonEager {
    // A instância é inicializada logo depois da classe ser carregada
    private static final AgendaSingletonEager INSTANCE = new AgendaSingletonEager();
    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    private AgendaSingletonEager() {
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terca", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sabado", Boolean.TRUE);
    }

    public Map<String, Boolean> getDias() {return diasDisponiveis;}

    public void ocupa(String dia) {
        diasDisponiveis.replace(dia, Boolean.FALSE);
    }

    public static AgendaSingletonEager getInstance() {return INSTANCE;}

    public static void reservaDiaEager(String dia) {
        AgendaSingletonEager agenda = AgendaSingletonEager.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
