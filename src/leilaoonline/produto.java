
package leilaoonline;
public class produto {
String nome;
String cor;
 double valor;
 int codigo;
 
 
 public String getNome(){
     return this.nome;
 }
 public void setNome(){
    String n = null;
     this.nome = n;
 }

  public String getCor(){
     return this.cor;
 }
 public void setCor(){
    String c = null;
     this.cor = c;
 }
void status(){
    System.out.println("Sobre o Produto:");
    System.out.println("Nome: " + this.nome);
    System.out.println("Cor: " + this.cor);
    System.out.println("Valor: " + this.valor);
    System.out.println("Código: " + this.codigo);
    }
    public produto() {
        
                       }
}
