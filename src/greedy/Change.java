package greedy;

public class Change {
    public static void main(String[] args) {
        System.out.println(change(new int[]{500, 100, 50, 10}, 1260));
    }

    private static int change(int[] coinType, int money) {
        int count = 0;
        for(int coin : coinType) {
            System.out.println("현재 동전 : " + coin + ", 개수 : " + money / coin + ", 남은 돈 : " + money);
            count += money / coin;
            money %= coin;
        }
        return count;
    }
}
