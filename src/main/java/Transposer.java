public class Transposer extends Thread {
    int[][] startMatrix;
    int[][] endMatrix;
    int index;

    @Override
    public void run() {
        for (int j = 0; j < startMatrix[0].length;j++) {
            endMatrix[j][index] = startMatrix[index][j];
        }
    }

    public Transposer(int[][] startMatrix, int[][] endMatrix, int index) {
        this.startMatrix = startMatrix;
        this.endMatrix = endMatrix;
        this.index = index;
    }
}
