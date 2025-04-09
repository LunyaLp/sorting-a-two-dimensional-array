public class Main {
    public static void main(String[] args) {
        int line = 6; //строчки
        int stolbets = 6; //столбцы
        int[][] massiv;  //создаю массив
        massiv = new int[line][stolbets];  //выделяю память
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < stolbets; j++) {
                massiv[i][j] = (int) (Math.random() * 101); //заполняю рандомными числами
            }
        }
        for (int s = 0; s < line; s++) {
            for (int s1 = s + 1; s1 < line; s1++) {
                for (int k = 0; k < stolbets; k++) {          // сравниваю и сортирую соседние значения
                    for (int j = k + 1; j < stolbets; j++) {
                        if (massiv[s][k] > massiv[s1][j]) {
                            int num = massiv[s][k];
                            massiv[s][k] = massiv[s1][j];
                            massiv[s1][j] = num;
                        }
                    }
                }
            }
        }
        System.out.println("Отсортированный массив");
        for (int g = 0; g < stolbets; g++) {
            for (int n = 0; n < line; n++) {
                System.out.print(massiv[n][g] + " ");
            }

            System.out.println();
        }
    }
}
