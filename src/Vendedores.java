public class Vendedores {
    private double salario;
    private Integer tempoDeContrato;
    private float venda;
    private double comissao;



    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Integer getTempoDeContrato() {
        return tempoDeContrato;
    }

    public void setTempoDeContrato(Integer tempoDeContrato) {
        this.tempoDeContrato = tempoDeContrato;
    }

    public Vendedores (Integer tempoDeContrato, float venda){
        this.tempoDeContrato=tempoDeContrato;
        this.venda=venda;
    }
    public float getVenda() {
        return venda;
    }

    public void setVenda(float venda) {
        this.venda = venda;
    }


    public void calculaSalarioBase(){
        if (tempoDeContrato<=12){
            this.setSalario(1500);
            System.out.printf("Salario Base:"+this.salario);
        }else if(tempoDeContrato>=13 && tempoDeContrato<=24){
            this.setSalario(2000);
            System.out.printf("Salario Base:"+this.salario);
        } else if (tempoDeContrato>=25 && tempoDeContrato<=36) {
            this.setSalario(2500);
            System.out.printf("Salario Base:"+this.salario);
        } else if (tempoDeContrato>37) {
            this.setSalario(3000);
            System.out.printf("Salario Base:"+this.salario);
        }
    }

    public void calculaComissao(){
        if (this.getVenda()<10000){
            this.setComissao(this.getComissao()+(salario*1.03));
            System.out.println("Comissao:"+ this.getComissao());
        } else if (this.getVenda()>=10000 && this.getVenda()<=50000){
            this.setComissao(this.getComissao()+(salario*1.05));
            System.out.println("Comissao:"+ this.getComissao());
        } else if (this.getVenda()>50000) {
            this.setComissao(this.getComissao()+(salario*1.10));
            System.out.println("Comissao:"+ this.getComissao());
        }
    }

    public void exibirDetalhes(){
        System.out.println("Salario Total:"+(this.getComissao()));
        System.out.println("Tempo de Contrato:"+this.tempoDeContrato);
        System.out.println("Valor de Vendas:" +this.venda);
    }



}
