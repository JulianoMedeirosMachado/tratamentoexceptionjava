public class FluxoComError {

    // Exemplo de código para pilhas de execução
    // inicio: main -> metodo1 -> metodo2
    // fim: main <- metodo1 <- metodo2

    public static void main(String[] args){
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    public static void metodo1(){
        System.out.println("Ini do metodo1");
        // try catch para tratar a exceção ArithmeticException e não parar a execução do programa
        // segundo try catch para tratar a exceção NullPointerException e não parar a execução do programa
        // pode tambem ser escrito em um só try catch (ArithmeticException | NullPointerException ex)
        try {
            metodo2();
        } catch (ArithmeticException ex) {
            System.out.println("Erro: Divisão ao chamar metodo2");
            ex.printStackTrace(); // imprime a exception no console
        } catch (NullPointerException ex) {
            System.out.println("Erro: Objeto nulo ao chamar metodo2");
            ex.printStackTrace(); // imprime a exception no console
        }
        System.out.println("Fim do metodo1");
    }

    // Usando divisão por zero para gerar uma exceção e ver a pilha de execução no console
    //Exception in thread "main" java.lang.ArithmeticException: / by zero
    //	at Fluxo.metodo2(Fluxo.java:23)
    //	at Fluxo.metodo1(Fluxo.java:15)
    //	at Fluxo.main(Fluxo.java:9)

    //criando um stack overflow error
    public static void metodo2(){
        System.out.println("Chamando metodo2");
        metodo2();
        System.out.println("Fim do metodo2");
    }
}