package desafio_heranca.numeros_primos;

public class GeradorPrimo extends NumerosPrimos{
    public int gerarProximoPrimo(int ultimoPrimoConhecido) {
        int proximoNumero = ultimoPrimoConhecido;
        while (!verificarPrimalidade(proximoNumero)) {
            proximoNumero++;
        }
        return proximoNumero;
    }
}
