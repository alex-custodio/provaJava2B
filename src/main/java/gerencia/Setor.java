package gerencia;

import static gerencia.Direcao.input;
public class Setor {
    private String nome;
    private Responsavel responsavel;

    public Setor(){
        System.out.print("\nQual o nome do setor: ");
        setNome(input.next());
        setResponsavel(new Responsavel());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }



}
