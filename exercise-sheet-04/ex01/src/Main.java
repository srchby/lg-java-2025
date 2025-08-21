import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade total de votos: ");
		int totalVotes = sc.nextInt();

		if (totalVotes <= 0) {
			System.out.println("Número de votos inválido.");
			return;
		}

		int[] votes = new int[totalVotes];
		System.out.println("Digite os votos (1..5), qualquer número para nulo: ");
		for (int i = 0; i < totalVotes; i++) {
			int vote = sc.nextInt();
			if (vote >= 1 && vote <= 5) {
				votes[i] = vote;
			} else {
				votes[i] = 0;
			}
		}

		int[] count = new int[5];
		int nulls = 0;

		for (int v : votes) {
			if (v >= 1 && v <= 5) {
				register(count, v);
			} else {
				nulls++;
			}
		}

		System.out.println("\nResultados:");
		for (int i = 0; i < count.length; i++) {
			System.out.println("Candidato " + (i + 1) + ": " + count[i] + " votos");
		}
		System.out.println("Votos nulos: " + nulls);

		int win = Arrays.stream(count).max().orElse(0);
		int winners = 0;
		String winnerCandidates = "";
		for (int i = 0; i < count.length; i++) {
			if (count[i] == win) {
				if (!winnerCandidates.isEmpty())
					winnerCandidates += ", ";
				winnerCandidates += (i + 1);
				winners++;
			}
		}

		if (winners == 1) {
			System.out.println("Vencedor: " + winnerCandidates);
		} else {
			System.out.println("Empate entre: " + winnerCandidates);
		}

		sc.close();
	}

	public static void register(int[] count, int candidate) {
		if (count == null)
			return;
		if (candidate < 1 || candidate > count.length)
			return;
		count[candidate - 1]++;
	}
}
