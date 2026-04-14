package model;

import java.util.Scanner;


public class ClienteABC extends Cliente{
    
    private String rg;

    public ClienteABC() {
    }

    public ClienteABC(String rg, int codigo, String nome, String endereco, String bairro, String cpf, String telefone) {
        super(codigo, nome, endereco, bairro, cpf, telefone);
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    @Override
    public void solicitarDados() {
        Scanner entrada = new Scanner(System.in);
        super.solicitarDados();

        System.out.println("Digite o RG do cliente: ");
        rg = entrada.nextLine();

        
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome()
                + "\nEndereço: " + super.getEndereco()
                + "\nBairro: " + super.getBairro()
                + "\nTelefone: " + super.getTelefone()
                + "\nCPF: " + super.getCpf()
                + "\nRG: " + rg
                + "\nCódigo: " + super.getCodigo();
    }
}
    
    
    

