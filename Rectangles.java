import java.lang.Math;
public class Rectangles {
  public static int areaRec1(int K, int L, int M, int N, int P, int Q, int R, int S) {
    if (K > M || L > N)
      return 0;
    return ((M - K)*(N - L));
  }

  public static int areaRec2(int K, int L, int M, int N, int P, int Q, int R, int S) {
    if (P > R || Q > S)
      return 0;
    return ((R - P)*(S - Q));
  }

  public static int areaOverlap(int K, int L, int M, int N, int P, int Q, int R, int S) {
    if (R < K || M < P || S < L || N < Q){
      return 0;
    }else{
      return ((Math.min(M, R) - Math.max(K, P)) * (Math.min(N, S) - Math.max(L, Q)));
    }
  }

  public static void main(String[] args) {
    int K = 0;
    int L = 0;
    int M = 1;
    int N = 1;
    int P = 3;
    int Q = 1;
    int R = 4;
    int S = 3;
    long totalArea = (areaRec1(K, L, M, N, P, Q, R, S) + areaRec2(K, L, M, N, P, Q, R, S) -
      areaOverlap(K, L, M, N, P, Q, R, S));
    System.out.println("Area 1: " + areaRec1(K, L, M, N, P, Q, R, S));
    System.out.println("Area 2: " + areaRec2(K, L, M, N, P, Q, R, S));
    System.out.println("Area Overlap: " + areaOverlap(K, L, M, N, P, Q, R, S));
    if (totalArea > Integer.MAX_VALUE)
      totalArea = -1;
    System.out.println("Total Area: " + totalArea);
  }
}
