package siga;

/**
 * Ponto de entrada do SIGA (código INICIAL).
 *
 * Esta classe demonstra os problemas do código atual, que servirão de
 * ponto de partida para a atividade prática da Aula 1.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== SIGA - Sistema de Gestão Acadêmica Simplificado ===");
        System.out.println("Versão INICIAL (a ser refatorada na Aula 1)\n");

        Aluno a1 = new Aluno("Maria Silva", "2026001", true, 8.5);

        Aluno a2 = new Aluno("João Souza", "2026002", true, 5);

        // PROBLEMA 2: o estado interno pode ser alterado por qualquer código,
        // sem nenhuma validação ou controle.
        a1.setMedia(9.8);      // Contém validação para não retornar media fora de 0 e 10
        // a2.setMedia(15);       // Isso lançará uma excessão que interrompe a execução

        Professor p1 = new Professor("Ana Pereira", "SP12345", true);

        System.out.println(p1.apresentar());
        System.out.println(a1.apresentar());
        System.out.println(a2.apresentar());

    }

    
}
