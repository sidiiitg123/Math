public class BishopMoves {
    public int solve(int A, int B) {
        int i, j, k, l;
        k = 0;
        for (i = A, j = B; i < 9 && j < 9 && i > 0 && j > 0; i++, j++) {
            k++;
        }

        for (i = A, j = B; i < 9 && j < 9 && i > 0 && j > 0; i--, j++) {
            k++;
        }

        for (i = A, j = B; i < 9 && j < 9 && i > 0 && j > 0; i--, j--) {
            k++;
        }

        for (i = A, j = B; i < 9 && j < 9 && i > 0 && j > 0; i++, j--) {
            k++;
        }
        k -= 4;
        return k;
    }
}
