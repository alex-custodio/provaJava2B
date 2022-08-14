package gerencia;

import static gerencia.Direcao.input;

public class Fabricante {
    private String nome;
    private String telefone;

    public Fabricante(){
        System.out.print("\nQual o nome do fabricante: ");
        setNome(input.next());
        System.out.print("\nQual o telefone do fabricante: ");
        setTelefone(input.next());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



}
