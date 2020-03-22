public class Hello {
    public static void main(String[] args) {
        final int time = 23;
        final int dayWeek = 5;
        final boolean dayWeekMorning = dayWeek >= 1 && dayWeek <= 5 && time <= 8;
        final boolean dayWeekLunch = dayWeek >= 1 && dayWeek <= 5 && time > 8 && time <= 11;
        final boolean dayWeekEvening = dayWeek >= 1 && dayWeek <= 5 && time > 11 && time <= 23;
        final boolean dayOffMorning = dayWeek >= 6 && dayWeek <= 7 && time <= 12;
        final boolean dayOffLunch = dayWeek >= 6 && dayWeek <= 7 && time > 12 && time <= 16;
        final boolean dayOffEvening = dayWeek >= 6 && dayWeek <= 7 && time > 16 && time <= 18;
        final boolean dayOffNight = dayWeek >= 6 && dayWeek <= 7 && time > 18 && time <= 23;

        if (dayWeekMorning || dayOffMorning) {
            System.out.println("Доброе утро!");
        }
        if (dayWeekLunch) {
            System.out.println("Все пропало ты проспал!");
        }
        if (dayWeekEvening) {
            System.out.println("Включай почту, составляй письмо, что сегодня берешь отгул.");
        }
        if (dayOffLunch) {
            System.out.println("Лучше поспать еще.");
        }
        if (dayOffEvening) {
            System.out.println("Вставай, тебя ждет недоигранный Ведьмак!");
        }
        if (dayOffNight) {
            System.out.println("Дааа, с режимом надо что-то делать.");
        }
    }
}
