import java.util.HashMap;
import java.util.Map;

public class IsRectangle {
    public int solve(int A, int B, int C, int D) {
        if((A==B && C==D) || (A==C && B==D) || (A==D && B==C))
        {
            return 1;
        }
        return 0;
    }
}
