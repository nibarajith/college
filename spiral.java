class spiral {
    public static void main(String args[]) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        int row = arr.length - 1;
        int col = arr[0].length - 1;
        int a = 0;
        int b = 0;

        while (a <= row && b <= col) {
            for (int i = b; i <= col; i++) {
                System.out.println(arr[a][i]);
            }
            a++;
            for (int i = a; i <= row; i++) {
                System.out.println(arr[i][col]);
            }
            col--;
            for (int i = col; i >= b; i--) {
                System.out.println(arr[row][i]);
            }
            row--;
            for (int i = row; i >= a; i--) {
                System.out.println(arr[i][b]);
            }
            b++;

        }
    }
}