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
public class Aluno {

    // Atributos públicos: violação do encapsulamento.
    // Como média e matricula são dados sensíveis, deve estar protegido com private e só acessar com get e set
    private String nome;
    private String matricula;
    private double media;
    private boolean ativo;

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setMedia (double media) {
        if (media <=10 && media >=0) {
          this.media = media;
        }
    }
    // Sem construtor: o objeto pode ser criado em estado incompleto/inconsistente.
}
