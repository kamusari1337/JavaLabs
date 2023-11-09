package сaesarCipher;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод исходной строки
        System.out.print("Введите строку для шифрования: ");
        String originalString = scanner.nextLine();

        // Ввод ключа сдвига
        System.out.print("Введите значение ключа (целое неотрицательное число): ");
        int key = scanner.nextInt();

        // Вызов метода для шифрования строки
        String encryptedString = encrypt(originalString, key);

        // Вывод зашифрованной строки
        System.out.println("Зашифрованная строка: " + encryptedString);
    }

    // Метод для шифрования строки шифром Цезаря
    private static String encrypt(String original, int key) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < original.length(); i++) {
            char currentChar = original.charAt(i);

            // Проверка, является ли символ буквой
            if (Character.isLetter(currentChar)) {
                // Определение регистра символа (верхний/нижний)
                char base = Character.isLowerCase(currentChar) ? 'a' : 'A';

                // Шифрование символа с учетом ключа
                char encryptedChar = (char) ((currentChar - base + key) % 26 + base);

                // Добавление зашифрованного символа к результату
                encrypted.append(encryptedChar);
            } else {
                // Если символ не является буквой, добавляем его как есть
                encrypted.append(currentChar);
            }
        }

        return encrypted.toString();
    }
}
