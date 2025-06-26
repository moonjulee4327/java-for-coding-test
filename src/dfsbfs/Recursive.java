package dfsbfs;

public class Recursive {
    public static void main(String[] args) {
        recursivePrint100(1);
    }

    private static void recursivePrint100(int i) {
        if(i == 100) {
            return;
        }
        System.out.println(i + "번째 재귀 함수에서 " + (i + 1) + "번째 재귀 함수를 호출합니다.");
        recursivePrint100(i + 1);
        System.out.println(i + "번째 재귀 함수를 종료합니다.");
    }
}
