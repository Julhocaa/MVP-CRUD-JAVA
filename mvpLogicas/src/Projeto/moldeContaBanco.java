package Projeto;

public class moldeContaBanco extends  MoldeCL {



    double saldo;
    double saque;
    MoldeCL usuario = new MoldeCL();

    public moldeContaBanco(double saldo){
        this.saldo = saldo;
        System.out.println("Bem vindo ao banco Julian&Americans"+"sr(a)"+);
        System.out.println("Saldo Atual: "+saldo);

    }

    public void fazerPix(){


    }


}
