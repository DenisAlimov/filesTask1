import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    private static final String PATH = "C://Users//exyst//IdeaProjects//JavaCore//filesTask1//Games"; //"C://Users//exyst//IdeaProjects//JavaCore//filesTask1//Games"

    public static void main(String[] args) {
        StringBuilder log = new StringBuilder();

        File src = new File(PATH + "//src");
        if (src.mkdir()) {
            log.append("Каталог src создан");
            log.append("\n");
        }
        File res = new File(PATH + "//res");
        if (res.mkdir()) {
            log.append("Каталог res создан");
            log.append("\n");
        }
        File savegames = new File(PATH + "//savegames");
        if (savegames.mkdir()) {
            log.append("Каталог savegames создан");
            log.append("\n");
        }
        File temp = new File(PATH + "//temp");
        if (temp.mkdir()) {
            log.append("Каталог temp создан");
            log.append("\n");
        }

        File main = new File("Games//src//main");
        if (main.mkdir()) {
            log.append("Каталог main создан");
            log.append("\n");
        }
        File test = new File("Games//src//test");
        if (test.mkdir()) {
            log.append("Каталог test создан");
            log.append("\n");
        }

        File mainFile = new File("Games//src//main//Main.java");
        try {
            if (mainFile.createNewFile()) {
                log.append("Файл Main.java был создан");
                log.append("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File utilsFile = new File("Games//src//main//Utils.java");
        try {
            if (utilsFile.createNewFile()) {
                log.append("Файл Utils.java был создан");
                log.append("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File drawables = new File("Games//res//drawables");
        if (drawables.mkdir()) {
            log.append("Каталог drawables создан");
            log.append("\n");
        }
        File vectors = new File("Games//res//vectors");
        if (vectors.mkdir()) {
            log.append("Каталог vectors создан");
            log.append("\n");
        }
        File icons = new File("Games//res//icons");
        if (icons.mkdir()) {
            log.append("Каталог icons создан");
            log.append("\n");
        }

        File tempFile = new File("Games//temp//temp.txt");
        try {
            if (tempFile.createNewFile()) {
                log.append("Файл temp.txt был создан");
                log.append("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter writer = new FileWriter("Games//temp//temp.txt")) {
            writer.write(log.toString());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}