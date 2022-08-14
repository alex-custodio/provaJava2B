package gerencia;



import static gerencia.Direcao.input;

public class Equipamento {
    private String nome;
    private int quantidade;

    private String situacao;
    private Fabricante fabricante;
    private Setor setor;


    public Equipamento(){
        System.out.print("\nQual o nome do equipamento: ");
        setNome(input.next());
        System.out.print("\nQuantos deste existem no campus (quantidade): ");
        setQuantidade(input.nextInt());
        System.out.print("\nQual a situação desse equipamento: (funcionamento/manutenção) ");
        setSituacao(input.next());

        setFabricante(new Fabricante());
        setSetor(new Setor());


    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }



    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

}
