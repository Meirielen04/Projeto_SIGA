package siga;

/**
 * Código INICIAL da disciplina.
 *
 * Observe que Aluno e Professor repetem os atributos "nome" e "matricula"/"registro".
 * Na atividade da Aula 1, essa duplicação será eliminada com a criação de uma
 * superclasse comum (Pessoa), aplicando herança.
 */
public class Professor extends Pessoa {

    public Professor(String nome, String registro, boolean ativo) {
        super(nome, registro, ativo);
    }

   
    @Override 
    public String apresentar() {
        return "Sou professor " + nome + " (Siape: " + registro + ")";
    }
}
