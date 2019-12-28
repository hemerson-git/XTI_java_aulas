package aulas.xti.POO;

import java.util.Scanner;
import java.util.ArrayList;

public class Conta {

    public Conta(){}
    public Conta(String nome, double saldo, int password){
        this.nome = nome;
        this.saldo = saldo;
        this.password = password;
        this.addConta();
    }
    
    String nome;
    private double saldo;
    private int password;
    Scanner teclado = new Scanner(System.in);
    private static ArrayList<String> contas = new ArrayList<>();
    
    void addConta() {
        String novaConta = this.nome;
        contas.add(novaConta);
    }
    
    //serve para mostrar ao usuario uma lista com as contas disponiveis para
    //transferencia e retornar a conta for selecionada
    private void pedeConta() {
        System.out.println("==================== ");
        System.out.println("Contas disponiveis : ");
        for(int i = 0; i < contas.size(); i++){
            if(this.nome.equals(contas.get(i))){
            }else{
                System.out.println(i + ". " + contas.get(i));
            }
        }
        System.out.println("==================== ");
    }

    public void getSaldo() {
        //se o nome nao for passado o nome recebe o valor de Cliente
        verificaSenha();
        if (this.nome == null) {
            this.nome = "Cliente";
        }
        System.out.println(this.nome + " seu saldo é " + this.saldo);
    }
    
    void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //verifica se a senha é digitada corretamente 
    //se errar 3x o cartão é bloqueado 
    private boolean verificaSenha() {
        boolean permissao = false;

        for (int i = 3; i > 0; i--) {
            System.out.print("Digite novamente a sua senha: ");
            System.out.println("Você possui " + i + " tentativas");
            int senha = teclado.nextInt();

            if (senha == this.password) {
                permissao = true;
                break;
            } else {
                System.out.println("SENHA INCORRETA!");
            }
        }

        return permissao;
    }

    private boolean verificaSaldo(double valor) {
        boolean temSaldo = false;
        if (valor <= this.saldo) {
            temSaldo = true;
        }
        return temSaldo;
    }

    void saca() {
        //para sacar é necessario primeiro verificar a senha
        //o metodo vai chamar a function verifica senha pra fazer isso
        System.out.print("Informe o valor do saque: ");
        double valor = teclado.nextDouble();

        boolean permissao = verificaSenha();

        if (permissao == true) {
            boolean temSaldo = verificaSaldo(valor);
            if (temSaldo) {
                this.saldo -= valor;
                System.out.println("SAQUE REALIZADO COM SUCESSO! ");
                System.out.println("Seu novo saldo é " + saldo);
                System.out.println("Aguarde o dinheiro sair e o retire");
            } else {
                System.out.println("SALDO INSUFICIENTE! ");
            }
        } else {
            System.out.println("PERMISSAO NEGADA!");
            System.out.println("Cartão bloqueado! ");
        }
    }

    void deposita() {
        System.out.print("Informe o valor do depósito: ");
        double valor = teclado.nextDouble();

        saldo += valor;
        System.out.println("Seu novo saldo é " + saldo);
    }

    void transferePara(Conta destino) {
        boolean permissao = verificaSenha();
        pedeConta();
        
        if (permissao) {

            System.out.print("Informe o valor para a transferência: ");
            double valor = teclado.nextDouble();
            boolean temSaldo = verificaSaldo(valor);

            if (temSaldo) {
                this.saldo -= valor;
                destino.saldo += valor;
                System.out.println("Transferência concluida com êxito ");
                getSaldo();
            } else {
                System.out.println("Não foi possível concluir a transfencia");
            }
        }
    }
}
