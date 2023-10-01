package spring_introduction;

public class MathHomework {
    public int findSum() {
        int total = 0;
        for (int temp = 0; temp < 1000; temp++) {
            if (temp % 3 == 0 || temp % 5 == 0) {
                total += temp;
            }
        }
        return total;
    }

    public int findMinInArray() {
        int[][] x = { {20, 34, 2}, {9, 12, 18}, {3, 4, 5} };
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                int number = x[i][j];
                if (number < min) {
                    min = number;
                }
            }
        }
        return min;
    }
}