package DesignPatterns.Singleton.Problema;

import static DesignPatterns.Singleton.Solucao.AgendaSingletonLazy.reservaDiaLazy;

import java.lang.reflect.InvocationTargetException;

import DesignPatterns.Singleton.Solucao.AgendaSingletonLazy;

// As repetições dos construtores são para fins didáticos
@SuppressWarnings("unused")
public class TesteAgenda {
    // main com throws por conta das linhas comentadas durante os testes
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // Irão apontar pra mesma instância
        AgendaSingletonLazy agenda1 = AgendaSingletonLazy.getInstance();
        AgendaSingletonLazy agenda2 = AgendaSingletonLazy.getInstance();
        System.out.println(agenda1);
        System.out.println(agenda2);
        reservaDiaLazy("Quinta");  // Chamada estática
        reservaDiaLazy("Sabado");

        // AgendaSingletonEager agenda1 = AgendaSingletonEager.getInstance();
        // AgendaSingletonEager agenda2 = AgendaSingletonEager.getInstance();
        // System.out.println(agenda1);
        // System.out.println(agenda2);
        // reservaDiaEager("Quinta");  // Chamada estática
        // reservaDiaEager("Sabado");

        // Não consegue mais criar porque o construtor é privado
        // System.out.println(new AgendaSingletonLazy);
        // System.out.println(new AgendaSingletonEager);

        // Apesar dos construtores estarem privados, é possível criar novas instâncias 
        // Quebra a regra do construtor e Singleton
        // Constructor<AgendaSingletonLazy> construtor = AgendaSingletonLazy.class.getDeclaredConstructor();
        // construtor.setAccessible(true);
        // AgendaSingletonLazy agenda9 = construtor.newInstance();
        // AgendaSingletonLazy agenda10 = construtor.newInstance();
        // System.out.println(agenda9);
        // System.out.println(agenda10);
        
        // Enum resolve essa brecha de criação de instâncias diferentes com construtores privados
        // É esperado que aconteça um erro ao tentar acessar o construtor, retornando uma exceção
        // AgendaSingletonEnum agenda1 = AgendaSingletonEnum.getInstance();
        // AgendaSingletonEnum agenda2 = AgendaSingletonEnum.getInstance();
        // System.out.println(agenda1.hashCode());
        // System.out.println(agenda2.hashCode());
        // Constructor<AgendaSingletonEnum> construtor = AgendaSingletonEnum.class.getDeclaredConstructor();
        // construtor.setAccessible(true);
        // AgendaSingletonEnum agenda9 = construtor.newInstance();
        // AgendaSingletonEnum agenda10 = construtor.newInstance();
        // System.out.println(agenda9.hashCode());
        // System.out.println(agenda10.hashCode());

        // reservaDiaEnum("Segunda");
        // reservaDiaEnum("Terca");
    }
}
