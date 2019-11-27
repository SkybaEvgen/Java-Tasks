/* Дано два текста: Текст1 и Текст2.
   Определить: является ли Текст2 суммой подпоследовательности Текст1.
   Текст1 = "Hello world"
   Текст2 = "HeolloHor"
   Ответ: true.
 */


package com.telran;

public class SumOfTextSubsequence {

    public boolean sumSubsequence (String text1, String text2) {

        String text1Temp = text1;

        if (sumSubsequenceRecurcion(text1, text2)) {
            text1 = text1Temp;
            text2 = text2.substring(0, text2.length() - 1);
            System.out.println(text2);
        }

        return true;
    }

    public boolean sumSubsequenceRecurcion (String text1, String text2) {

        return isSubsequence(text1, text2, text1.length() - 1, text2.length() - 1);
    }

        private boolean isSubsequence (String text1, String text2, int indexText1, int indexText2) {
            if (indexText2 < 0) return true;

            if (indexText1 < indexText2) return false;

            if (text1.charAt(indexText1) == text2.charAt(indexText2)) {
                return isSubsequence(text1, text2, indexText1 - 1, indexText2 - 1);
            }

            return isSubsequence(text1, text2, indexText1 - 1, indexText2);
        }
}
