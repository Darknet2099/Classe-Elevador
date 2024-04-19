public class Elevador {
     int andarAtual;
     int totalAndares;
     int capactotal;
     int ocupacao;

    public Elevador(int capactotal, int totalAndares) {
        andarAtual = 0;
        totalAndares = totalAndares;
        capactotal = capactotal;
        ocupacao = 0;
         }
    
      public void entrar() {
      if (ocupacao < capactotal) {
            ocupacao++;
        }else{
            System.out.println("Elevador lotado!");
        }
       }  
    
      public void remover() {
      if (ocupacao <= capactotal && ocupacao > 0) {
            ocupacao--;
      }else{
        System.out.println("Não foi possivel remover pessoas do elevador, pois o mesmo está vazio.");
      }
     }
    
      public void subir() {
      if (andarAtual < totalAndares && andarAtual >= 0) {
        andarAtual++;
    }else{
      System.out.println("Não foi possivel subir, pois o elevador já está no último andar.");
    }
   }
      public void descer() {
      if (andarAtual > 0 && andarAtual <= totalAndares ) {
        andarAtual--;
      }else{
      System.out.println("Não foi possivel descer, pois o elevador já está no térreo.");
    }
 }
  //Nesse bloco do código(Cuja função é exibir o status do elevador), eu tentei fazer com que o elevador exibisse erro caso os parametros estivessen excendendo o limite do elevador, mas não ocorreu algum erro naminha lógica na qual ele é incapaz de exceder a lógica(ele basicamente "para" de registrar os números excedentes.)
      public void status() {
      if (andarAtual < 0 || andarAtual > totalAndares || ocupacao > capactotal || ocupacao < 0) {  
        System.out.println("O elevador é um paradoxo");
      }else{   
        System.out.print("O elevador se encontra no andar " +andarAtual+ " Transportando " +ocupacao+ " pessoa(s)");
      }
    }
    
  public int getAndarAtual(){
    return andarAtual;
}
}

