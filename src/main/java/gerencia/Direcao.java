package gerencia;

import java.util.Scanner;

public class Direcao {
    public static Scanner input = new Scanner(System.in);
    //1 - Cadastrar Equipamentos
    //2 - Exibir Setores
        // Exibir Equipamentos Em Manutenção
        // Exibir Equipamentos Em Funcionamento
    //3 - Mudar Situação de Equipamento
    //4 - Buscar Equipamento por nome e receber os dados
    //5 - Remover Equipamento
    //6 - Sair
    public static void main(String[] args){
        Equipamento[] equipamentos;
        int escolha;
        System.out.print("\nQuantos equipamentos deseja cadastrar: ");
        equipamentos = new Equipamento[input.nextInt()];
        for (int i = 0; i < equipamentos.length; i++){
            equipamentos[i] = new Equipamento();
        }
        while (true){
            System.out.print("\n1 - Exibir Equipamentos");
            System.out.print("\n2 - Mudar Situação de Equipamento");
            System.out.print("\n3 - Buscar Equipamento (nome)"); // Pra poder exibir seus dados ou mudar ele de setor
            System.out.print("\n4 - Remover Setor");
            System.out.print("\n5 - Sair\n");
            escolha = input.nextInt();

            if (escolha == 1){
                for (Equipamento valor: equipamentos){
                    if (valor.getNome() != null){
                        System.out.print("\nEquipamento: " + valor.getNome());
                    }else {
                        System.out.print("\nNome não encontrado");
                    }

                }
            } else if (escolha == 2){
                System.out.print("\nNome do equipamento que deseja mudar a situação: ");
                String nomeEquipamento = input.next();
                for (Equipamento valor: equipamentos){
                    if (valor.getNome().equalsIgnoreCase(nomeEquipamento) && valor.getNome() != null){
                        System.out.print("\nQual a nova situação dele: \n(1 - Sem Defeito / 2 - Com Defeito / 3 - Sem utilidade ) ");
                        escolha = input.nextInt();
                        if (escolha == 1){
                            valor.setSituacao("Em funcionamento");
                            System.out.print("\nStatus: " + valor.getSituacao());
                        }
                        else if (escolha == 2){
                            valor.setSituacao("Em manutenção");
                            System.out.print("\nStatus: " + valor.getSituacao());
                            System.out.print("\nO responsável " + valor.getSetor().getResponsavel() + " do setor " + valor.getSetor() + "" +
                                    "\nirá telefonar a empresa " + valor.getFabricante().getNome() + " pelo número de telefone: " + valor.getFabricante().getTelefone());
                        } else if (escolha == 3){
                            valor.setNome(null);
                            valor.setQuantidade(0);
                            valor.setSetor(null);
                            valor.setFabricante(null);
                            valor.setSituacao(null);
                            System.out.print("\nRemovido do sistema!");
                        }
                    } else {
                        System.out.print("\nNome não encontrado");
                    }
                }
            } else if (escolha == 3){
                System.out.print("\nNome do equipamento que deseja buscar: ");
                String nomeEquipamento = input.next();
                for (Equipamento valor: equipamentos) {
                    if (valor.getNome().equalsIgnoreCase(nomeEquipamento) && valor.getNome() != null){
                        System.out.print("\nO que deseja fazer: (1 - Exibir dados / 2 - Mudar de Setor / 3 - Remover Equipamento)");
                        escolha = input.nextInt();
                        if (escolha == 1){
                            System.out.print(
                                    "Nome: " + valor.getNome() + "\nQuantidade: " + valor.getQuantidade() + "" +
                                    "\nFabricante: " + valor.getFabricante().getNome() + "\nSetor: " + valor.getSetor().getNome() + "" +
                                    "\nSituação: " + valor.getSituacao());
                        }
                        else if (escolha == 2){
                            valor.setSetor(new Setor());
                        }
                        else if (escolha == 3){
                            valor.setNome(null);
                            valor.setQuantidade(0);
                            valor.setSetor(null);
                            valor.setFabricante(null);
                            valor.setSituacao(null);
                            System.out.print("\nRemovido do sistema!");
                        }
                    }else {
                        System.out.print("\nNome não encontrado");
                    }
                }
            } else if (escolha == 4){
                System.out.print("\nQual o nome do setor que deseja remover: ");
                String nomeSetor = input.next();
                for (Equipamento valor: equipamentos){
                    if (valor.getSetor().getNome().equalsIgnoreCase(nomeSetor) && valor.getSetor().getNome() != null){
                        System.out.print("Setor removido!\nEquipamento " + valor.getNome() + " vai ter que mudar de setor.");
                        valor.setSetor(new Setor());
                    }else {
                        System.out.print("\nNome não encontrado");
                    }
                }
            } else if (escolha == 5){
                break;
            } else {
                System.out.print("\nVocê digitou um número errado");
            }
        }

    }

}
