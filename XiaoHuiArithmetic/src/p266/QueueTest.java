package p266;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QueueTest {
    public static void main(String[] args) {
        List<Integer> amountList = divideRedPackage(1000, 10);
        for (Integer amount : amountList) {
            System.out.println("������" + new BigDecimal(amount).divide(new BigDecimal(100)
            ));
        }
    }

    /**
     * ��ֺ��
     *
     * @param totalAmount    �ܽ��(�Է�Ϊ��λ)
     * @param totalPeopleNum ������
     * @return
     */
    private static List<Integer> divideRedPackage(Integer totalAmount, Integer totalPeopleNum) {
        List<Integer> amountList = new ArrayList<>();
        Integer restAmount = totalAmount;
        Integer restPeopleNum = totalPeopleNum;
        Random random = new Random();
        for (int i = 0; i < totalPeopleNum - 1; i++) {
            //�����Χ��[1��ʣ���˾�����2��-1]��
            int amount = random.nextInt(restAmount / restPeopleNum * 2 - 1) + 1;
            restAmount -= amount;
            restPeopleNum--;
            amountList.add(amount);
        }
        amountList.add(restAmount);
        return amountList;
    }
}
