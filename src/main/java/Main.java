import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:/Users/Asus/IdeaProjects/first_tg_bot/src/main/java/Bot.java";

        try {
            // Чтение данных из файла и подсчет количества букв 'а'
            FileReader fileReader = new FileReader(fileName);
            int character;
            int countA = 0;
            StringBuilder fileContent = new StringBuilder();

            while ((character = fileReader.read()) != -1) {
                char ch = (char) character;
                fileContent.append(ch);
                if (Character.toLowerCase(ch) == 'a') {
                    countA++;
                }
            }
            fileReader.close();

            // Запись обновленных данных в файл
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("Количество букв 'а': " + countA + "\n");
            fileWriter.write(fileContent.toString());
            fileWriter.close();

            System.out.println("Количество букв 'а' успешно записано в файл.");

        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении или записи файла: " + e.getMessage());
        }
    }
}
