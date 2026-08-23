package siga;

/**
 * Sistema de Gestão Acadêmica Simplificado (SIGA)
 * Técnicas de Programação II - Fatec de Porto Ferreira
 *
 * ATENÇÃO: código INICIAL da disciplina.
 * Esta classe apresenta, propositalmente, problemas de orientação a objetos
 * que serão corrigidos na atividade prática da Aula 1.
 *
 * Problema principal: os atributos são PÚBLICOS, expondo o estado interno
 * do objeto e permitindo que qualquer código o coloque em um estado inválido
 * (por exemplo, uma média negativa ou maior que 10).
 */
public class Aluno extends Pessoa {

    // Atributos públicos: violação do encapsulamento.
    // Como média e matricula são dados sensíveis, deve estar protegido com private e só acessar com get e set

    private double media;

    public Aluno(String nome, String registro, boolean ativo, double media) {
        super(nome,registro, ativo);
        setMedia(media);
    }

    public double getMedia() {
        return media;
    }

    public void setMedia (double media) {
        if (media >=0 && media <=10) {
          this.media = media;
          return;
        } 
        throw new IllegalArgumentException("Média deve ser entre 0 e 10");
    }
    // Sem construtor: o objeto pode ser criado em estado incompleto/inconsistente.

    @Override
    public String apresentar() {
        return "Aluno: " + this.getNome()
                + " | Matrícula: " + this.getRegistro()
                + " | Média: " + this.getMedia()
                + " | Ativo: " + (this.getAtivo() ? "sim" : "não");
    }
}

