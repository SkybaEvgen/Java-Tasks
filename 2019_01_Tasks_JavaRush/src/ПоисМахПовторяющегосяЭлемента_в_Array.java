public class ПоисМахПовторяющегосяЭлемента_в_Array {
    public static void main(String[] args) {
        int[] qq = {1, 3, 8, 5, 8};
        int[] bytes = new int[9];
        int max = 0;
        int maxI = 0;
        for (int i = 0; i < qq.length; i++) {
            int b = qq[i];
            bytes[b]++;
            if (bytes[b] > max) {
                maxI = b;
                max = bytes[b];
            }

        }
        System.out.println(maxI);
    }
}
