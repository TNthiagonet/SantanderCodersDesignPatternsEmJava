package DesignPatterns.Singleton.Solucao;

import java.util.HashMap;
import java.util.Map;

public enum AgendaSingletonEnum {
    INSTANCE;
    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    private AgendaSingletonEnum() {
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

    public static AgendaSingletonEnum getInstance() {return INSTANCE;}

    public static void reservaDiaEnum(String dia) {
        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
