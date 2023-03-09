import java.util.ArrayList;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> simple_num = new ArrayList<>();
        
        for (int i = 2; i <= 1000; i++) {
            boolean isSimple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                simple_num.add(i);
                System.out.print(i + " ");
            }
        }
    }
}
