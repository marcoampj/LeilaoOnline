package leilaoonline;

public class Main {

    public static void main(String[] args) {
     produto p1 = new produto();
     p1.nome = "Dell I5, 1TB";
     p1.cor = "Preto";
     p1.setValor(800);
     p1.status();
     
        System.out.println("Leilão de um notebook? " + p1.getNome() + "de valor: " + p1.getValor());
    }
  }