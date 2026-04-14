
package model;

import java.util.Scanner;


public class Cliente {
    
    private int codigo;
    private String nome;
    private String endereco;
    private String bairro;
    private String cpf;
    private String telefone;

    public Cliente() {
    }

    public Cliente(int codigo, String nome, String endereco, String bairro, String cpf, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void solicitarDados() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o codigo do cliente: ");
        codigo = entrada.nextInt();
        entrada.nextLine(); 
        System.out.println("Digite o nome do cliente: ");
        nome = entrada.nextLine();
        System.out.println("Digite o endereço do cliente: ");
        endereco = entrada.nextLine();
        System.out.println("Digite o bairro do cliente: ");
        bairro = entrada.nextLine();
        System.out.println("Digite o telefone do cliente: ");
        telefone = entrada.nextLine();
        System.out.println("Digite o CPF do cliente: ");
        cpf = entrada.nextLine();
        

        // NÃO FECHAR ERRO: NoSuchElementException
        // entrada.close();
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo 
               + "\nNome: " + nome 
               + "\nEndereço: " + endereco 
               + "\nBairro: " + bairro 
               + "\nCPF: " + cpf 
               + "\nTelefone: " + telefone;
    }
    
    
    
    
}
