import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.stream.Stream;

enum Currency {
    USD, JPY, KRW, GBP
}


class Money {
    private Currency currency;
    private double amount;

    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

public class Test01 {
    int balance;


    public double add(Money first_money, Money second_money) {
        if (first_money.getCurrency() != second_money.getCurrency())
            throw new IllegalArgumentException();


        return first_money.getAmount() + second_money.getAmount();
    }

    public synchronized double deposit (double amount) {
        return balance += amount;
    }


    public double strStr(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;

        for (int i = 0;i < nums.length; i++) {
            windowSum += nums[i];
            if (i >= k - 1) {
                maxSum = Integer.max(windowSum, maxSum);
                windowSum -= nums[i - (k - 1)];
            }
        }
        return maxSum ;
    }


    public String reverse(String s){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }

        return stringBuilder.toString();
    }

    public boolean findDuplication (int[] arr) {
        if(arr == null) return false;

        Set<Integer> set = new HashSet<Integer>();
        for (int target : arr) {
            if(set.contains(target)){
                return false;
            }
            set.add(target);
        }
        return  true;
     }



}
