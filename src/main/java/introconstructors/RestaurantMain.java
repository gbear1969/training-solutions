package introconstructors;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Buta kukta", 12);

        System.out.println("Üdv a " + restaurant.getName() + " étteremben,\nösszesen " +
            restaurant.getCapacity() + " főt várunk " + restaurant.getCapacity() / 4  + " asztalhoz.\n" +
            "Mai menünk: "  + restaurant.getMenu() + "\nJó étvágyat!");
    }
}
