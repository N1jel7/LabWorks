package by.bsu.labwork;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text =
                """
                        Осыпалось лето багровыми маками,\s
                        Угасшими в ночь, как восторга огни;\s
                        Поблёкло в полях опалёнными злаками.\s
                        Рассыпались августа спелые дни,\s

                        Сорвавшихся яблок шарами печальными,\s
                        Забытыми бусами ягод лесных;\s
                        И я потерял все надежды нечаянно,
                        Все чувства, взамен не желая иных.\s

                        Чернеют чумной бузины многоточия -\s
                        Жестокие брызги несказанных слов...\s
                        А имя твоё, что шептал дни и ночи я,\s
                        Рябиновой горечью губы прожгло.\s""";

        long marksQuantity = calcPunctuationMarks(text);
        long wordsQuantity = calcWords(text);
        String textWithLastChars = transformText(text);
        System.out.printf("Количество знаков препинания в тексте: %d \n", marksQuantity);
        System.out.printf("Количество слов в тексте: %d \n", wordsQuantity);
        System.out.printf("Текст из последних букв слов:\n%s \n", textWithLastChars);
        System.out.printf("Больше всего в тексте повторялось слово: %s \n", mostFrequentWord(getWords(text)));

    }

    private static String mostFrequentWord(String[] words) {
        String mostFrequentWord = "";
        int maxValue = 0;
        Map<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            int count = counts.getOrDefault(word, 0);
            counts.put(word, count + 1);
        }
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if(entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }
        return mostFrequentWord;
    }

    private static String[] getWords(String source) {
        return source.replaceAll("[\\s,;:!?\\-()'\".]+", " ")
                .split(" ");
    }


    private static String transformText(String source) {
        return source.replaceAll("[а-яА-ЯёЁ](?=[а-яА-ЯёЁ])", "");
    }

    private static long calcPunctuationMarks(String source) {
        return calcMatchesByPattern("[,;:!?\\-()'\"]|\\.{1,3}", source);
    }

    private static long calcWords(String source) {
        return calcMatchesByPattern("[а-яА-ЯёЁ]+", source);
    }

    private static long calcMatchesByPattern(String regexp, String source) {
        Pattern punctuationPattern = Pattern.compile(regexp);
        return punctuationPattern.matcher(source).results().count();
    }
}