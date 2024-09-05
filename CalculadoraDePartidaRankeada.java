import java.util.Scanner;

public class CalculadoraDePartidaRankeada {
    public static void main(String[] args) {
        // Criar um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar número de vitórias e derrotas
        System.out.println("Digite o número de vitórias: ");
        int vitorias = scanner.nextInt();

        System.out.println("Digite o número de derrotas: ");
        int derrotas = scanner.nextInt();

        // Chamar função para calcular saldo e nível
        String resultado = calcularSaldoENivel(vitorias, derrotas);

        // Exibir o resultado final
        System.out.println(resultado);

        // Fechar o Scanner
        scanner.close();
    }

    // Função que calcula o saldo e retorna o nível
    public static String calcularSaldoENivel(int vitorias, int derrotas) {
        // Calcular saldo
        int saldoVitorias = vitorias - derrotas;
        String nivel = "";

        // Classificação baseada no número de vitórias
        if (vitorias < 10) {
            nivel = "Ferro";
        } else if (vitorias >= 11 && vitorias <= 20) {
            nivel = "Bronze";
        } else if (vitorias >= 21 && vitorias <= 50) {
            nivel = "Prata";
        } else if (vitorias >= 51 && vitorias <= 80) {
            nivel = "Ouro";
        } else if (vitorias >= 81 && vitorias <= 90) {
            nivel = "Diamante";
        } else if (vitorias >= 91 && vitorias <= 100) {
            nivel = "Lendário";
        } else if (vitorias >= 101) {
            nivel = "Imortal";
        }

        // Retorna o resultado com saldo e nível
        return "O Herói tem saldo de " + saldoVitorias + " vitórias e está no nível de " + nivel;
    }
}
