//testar o checked exception
public class TesteContaExceptionChecked {
    public static void main(String[] args) {
        Conta c = new Conta();
        try {
            c.deposita();
        } catch (MinhaException ex) {
            System.out.println("Tratamento....");
        }
    }
}
