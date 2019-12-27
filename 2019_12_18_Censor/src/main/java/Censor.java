/*Написать класс Censor, который содержит массив нецензурных слов.
Необходимо написать функцию isLegal, которая принимает массив слов
и определяет легальность.
 */
public class Censor {
    String[] vocab;

    public Censor(String[] vocab) {
        this.vocab = vocab;
    }

    public boolean isLegal(String text) {
        String[] words = text.split(" ");
        for (String s : vocab) {
            for (String word : words) {
                if (s.equals(word)) return false;
            }
        }
        return true;
    }
}
