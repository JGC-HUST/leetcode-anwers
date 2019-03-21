package jgc;
/*
  思路：以 @ 符号为界，后面的只要不同就不同，前面的要考虑 + 和 . 的影响
  . 直接将.替换为空字符串
  + 替换之前要判断一下是否有这个符号，如果有就截取它之前的字符串
  最后将二者拼接，放到 set 里面进行去重
 */
import java.util.HashSet;

public class No929_Unique_Email_Addresses {
    public String process(String string) {
        String local = string.substring(0, string.indexOf("@"));
        local = local.replace(".", "");
        // 先判断是否有 + 符号
        if (local.indexOf("+") != -1) {
            local = local.substring(0, local.indexOf("+"));
        }
        return local;
    }

    public int numUniqueEmails(String[] emails) {
        int len = emails.length;
        HashSet<String> set = new HashSet<>();
        for (String str : emails
        ) {
            String temp = process(str) + str.substring(str.indexOf("@"));
            set.add(temp);
        }
        return set.size();
    }

    public static void main(String[] args) {
        String[] strs = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println(new No929_Unique_Email_Addresses().numUniqueEmails(strs));
    }
}
