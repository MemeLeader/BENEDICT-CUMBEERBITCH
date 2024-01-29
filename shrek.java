import java.util.Random;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class shrek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, String>  wordsName = new HashMap<>();
        wordsName.put('А', "Бандерлог");
        wordsName.put('Б', "Бенедикт");
        wordsName.put('В', "Беннихил");
        wordsName.put('Г', "Бергамот");
        wordsName.put('Д', "Баралгин");
        wordsName.put('Е', "Бандикут");
        wordsName.put('Ё', "Бенефис");
        wordsName.put('Ж', "Беломор");
        wordsName.put('З', "Бандероль");
        wordsName.put('И', "Будапешт");
        wordsName.put('Й', "Барбарис");
        wordsName.put('К', "Баклажан");
        wordsName.put('Л', "Бабблгам");
        wordsName.put('М', "Бекмамбет");
        wordsName.put('Н', "Бартикрауч");
        wordsName.put('О', "Бамблби");
        wordsName.put('П', "Бадминтон");
        wordsName.put('Р', "Барабас");
        wordsName.put('С', "Букингем");
        wordsName.put('Т', "Баттлфилд");
        wordsName.put('У', "Боромир");
        wordsName.put('Ф', "Бугимен");
        wordsName.put('Х', "Бубенец");
        wordsName.put('Ц', "Буерак");
        wordsName.put('Ч', "Бафомет");
        wordsName.put('Ш', "Базилик");
        wordsName.put('Щ', "Бенадрил");
        wordsName.put('Э', "Бубалех");
        wordsName.put('Ю', "Бургеркинг");
        wordsName.put('Я', "Бранденбург");
        Map<Character, String>  wordsFame = new HashMap<>();

        wordsFame.put('А', "Кукумбер");
        wordsFame.put('Б', "Казантип");
        wordsFame.put('В', "Джонникэш");
        wordsFame.put('Г', "Киберскотч");
        wordsFame.put('Д', "Купидон");
        wordsFame.put('Е', "Карабас");
        wordsFame.put('Ё', "Конфьюжен");
        wordsFame.put('Ж', "Кёнингсберг");
        wordsFame.put('З', "Достаньмеч");
        wordsFame.put('И', "Корвалол");
        wordsFame.put('Й', "Курувпечь");
        wordsFame.put('К', "Камбербэтч");
        wordsFame.put('Л', "Камамбер");
        wordsFame.put('М', "Вваннойтечь");
        wordsFame.put('Н', "Кулумбек");
        wordsFame.put('О', "Кандибобер");
        wordsFame.put('П', "Когтевран");
        wordsFame.put('Р', "Коленвал");
        wordsFame.put('С', "Контерстайк");
        wordsFame.put('Т', "Трахтенберг");
        wordsFame.put('У', "Хасавюрт");
        wordsFame.put('Ф', "Чеддерчиз");
        wordsFame.put('Х', "Драмнбейс");
        wordsFame.put('Ц', "Данкешон");
        wordsFame.put('Ч', "Кабачок");
        wordsFame.put('Ш', "Комбикорм");
        wordsFame.put('Щ', "Минигольф");
        wordsFame.put('Э', "Кайзершнаутц");
        wordsFame.put('Ю', "Канифоль");
        wordsFame.put('Я', "Курткобейн");
        System.out.println("Как бы вас звали на языке Батлфилд Овердроч");
        System.out.print("Введите ваше имя: ");
            char name = sc.next().charAt(0);
        System.out.print("Введите вашу Фамилию: ");
            char fam = sc.next().charAt(0);

            String TruName = wordsName.get(Character.toUpperCase(name));
            String TruFam = wordsFame.get(Character.toUpperCase(fam));
        System.out.println("Вас зовут: " + TruName + " " + TruFam);

    }
}