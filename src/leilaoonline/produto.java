
package leilaoonline;
public class produto {
String nome;
String cor;
 private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
    @Override
    public String toString() {
        return "produto{" + "nome=" + nome + ", cor=" + cor + ", valor=" + valor + '}';
    }
void status(){
    System.out.println("Sobre o Produto:");
    System.out.println("Nome: " + this.nome);
    System.out.println("Cor: " + this.cor);
    System.out.println("Valor: " + this.getValor());
    }
    public produto() {
        
                       }

    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
