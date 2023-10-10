package spring_introduction;

public class Test1 {
    public static void main(String[] args) {
        Player bot = new Player();

        Player alex = new Player(VARIANTS.SCISSORS, "Alex");

// Получаем результат

        System.out.println(bot.whoWins(bot, alex));


    }
}
