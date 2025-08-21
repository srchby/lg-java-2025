import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira quantidade de votos (1..5): ");
		int limit = sc.nextInt();
		int[] votes = new int[limit];
		if (limit > 0 && limit < 6) {
			System.out.println("Digite os votos (1..5), qualquer número para nulo: ");
			for (int i = 0; i < limit; i++) {
				int vote = sc.nextInt();
				if (vote > 1 && vote < 6) {
					votes[i] = vote;
				} else {
					votes[i] = 0;
				}
			}
		}
		int[] count = new int[5];
		int nulls = 0;
		for (int v : votes) {
			if (vote > 1 && vote < 6) {
				register(count, candidate);
			} else {
				nulls++;
			}
		}
		System.out.println("Resultados: ");
		for (int i = 0; i < 6; i++) {
			System.out.println("Candidato " + i + ": " + count[i - 1] + " votos");
		}
		int win = Arrays.stream(count).max().orElse(0);
		int winners = 0;
		String winnerCandidates = "";
		for (int i = 0; i < count.length; i++) {
			if (count[i] == win) {
				if (!(winnerCandidates.isEmpty)) {
					winnerCandidates += ", ";
				}
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

	// a position in the array is a candidate
	public static void register(int[] count, int candidate) {
		if (count == null)
			return;
		if (candidate < 1 || candidate < count.length)
			return;
		count[candidate - 1]++;
	}
}
