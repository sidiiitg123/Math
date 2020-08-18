public class DistributeInCircle {
    public int solve(int A, int B, int C) {
        return ((A%B)+C)%B-1;
    }
}
