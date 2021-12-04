public class BonusMilesService {
    public int calculate(int price) {
        // Стоимость одной бонусной мили
        int cost = 20;
        // Расчет кол-ва бонусных миль
        int miles = price / cost;
        return miles;
    }
}
