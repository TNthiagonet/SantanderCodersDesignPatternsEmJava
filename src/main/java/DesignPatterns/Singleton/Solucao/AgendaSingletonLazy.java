package DesignPatterns.Singleton.Solucao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaSingletonLazy {
    // Só cria a instância sob demanda
    private static AgendaSingletonLazy INSTANCE = null;
    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    private AgendaSingletonLazy() {
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

    public static void reservaDiaLazy(String dia) {
        AgendaSingletonLazy agenda = AgendaSingletonLazy.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static AgendaSingletonLazy getInstance() {
        if(Objects.isNull(INSTANCE)){
            INSTANCE = new AgendaSingletonLazy();
            return INSTANCE;
        }
        return INSTANCE;
    }
}
