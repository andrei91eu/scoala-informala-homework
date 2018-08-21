package com.company;

import com.company.model.*;

import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(getUniqueId());

        int option;

        final List<ProductIF> productList = new ArrayList<>();
        final List<OrderIf> orderList = new ArrayList<>();

        do {
            System.out.println("\n-------------------------------------------------------------");
            System.out.println("1. Create a product and add it to stock");
            System.out.println("2. Sell product");
            System.out.println("3. Display daily sales report");
            System.out.println("4. Exit");
            System.out.print("\n\n\nChoose an option: ");
            option = scanner.nextInt();

            System.out.println("\n-------------------------------------------------------------");

            if (option == 1) {
                System.out.println("Product type (1 - animal; 2 - vegetable):");

                final int subOption = scanner.nextInt();

                if (subOption != 1 && subOption != 2) {
                    continue;
                }

                ProductIF product;

                if (subOption == 1) {
                    product = createAnimalProduct();
                } else {
                    product = createVegetalProduct();
                }

                System.out.println("\n\n\nYou have created the following product: ");
                System.out.println("Name: " + product.getName());
                System.out.println("Weight: " + product.getWeight());
                System.out.println("Price: " + product.getPrice());
                System.out.println("Validity date: " + product.getValidityDate());
                if (product instanceof AnimalProductIF) {
                    System.out.println("Storage temperature: " + ((AnimalProductIF) product).getStorageTemperature());
                } else if (product instanceof VegetalProductIF) {
                    System.out.println("Vitamin list: " + ((VegetalProductIF) product).getVitaminList().toString());
                }
                System.out.println("\nDo you wish to save it? (1 - Yes, 2 - No)");

                final int save = scanner.nextInt();

                if (save == 1) {
                    productList.add(product);
                }
            } else if (option == 2) {
                System.out.println("Available products:");

                ProductIF[] list = new ProductIF[productList.size()];
                list = productList.toArray(list);

                for (final ProductIF product : list) {
                    System.out.print(product.getId() + "\t");
                    System.out.print(product.getName() + "\t");
                    System.out.print(product.getWeight() + "\t");
                    System.out.print(product.getPrice() + "\t");

                    if (product instanceof AnimalProductIF) {
                        System.out.print(((AnimalProductIF) product).getStorageTemperature());
                    } else if (product instanceof VegetalProductIF) {
                        System.out.print(((VegetalProductIF) product).getVitaminList().toString());
                    }
                }

                boolean foundProduct = false;
                String id;
                int quantity;
                do {
                    System.out.print("\n\nEnter the ID of the product you wish to order: ");
                    id = scanner.nextLine();
                    final ProductIF product = findProductById(id, list);
                    if (product != null) {
                        foundProduct = true;
                    }
                } while (!foundProduct);

                System.out.print("\nEnter quantity: ");
                quantity = scanner.nextInt();

                final Order order = new Order();
                order.setDate(new Date());
                order.setId(id);
                order.setQuantity(quantity);

                System.out.println("Do you want to save order? (1- Yes, 2 - No)");
                final int save = scanner.nextInt();

                if (save == 1) {
                    orderList.add(order);
                }
            } else if (option == 3) {
                System.out.println("Enter date to see statistics:");
                final Date date = getDateFromKeyboard();

                Order[] list = new Order[orderList.size()];
                list = orderList.toArray(list);

                for (final Order order : list) {
                    final Calendar calendarOrder = Calendar.getInstance();
                    calendarOrder.setTime(order.getDate());

                    final Calendar selectedCalendar = Calendar.getInstance();
                    selectedCalendar.setTime(date);

                    if (calendarOrder.get(Calendar.YEAR) == selectedCalendar.get(Calendar.YEAR) &&
                            calendarOrder.get(Calendar.MONTH) == selectedCalendar.get(Calendar.MONTH) &&
                            calendarOrder.get(Calendar.DATE) == selectedCalendar.get(Calendar.DATE)) {

                        System.out.println(order.getId() + '\t' + order.getDate() + order.getQuantity());
                    }
                }
            }

        } while (option != 4);


        scanner.close();
    }

    public static ProductIF findProductById(String id, ProductIF[] list) {
        for (final ProductIF product : list) {
            if (product.getId().equals(id)) {
                return product;
            }
        }

        return null;
    }

    public static VegetalProductIF createVegetalProduct() {
        final VegetalProduct product = new VegetalProduct();
        product.setId(getUniqueId());

        System.out.print("Enter product name: ");
        product.setName(scanner.next());

        System.out.print("Enter product weight: ");
        product.setWeight(scanner.nextDouble());

        System.out.print("Enter product price: ");
        product.setPrice(scanner.nextDouble());

        System.out.println("Enter validity date: ");
        product.setValidityDate(getDateFromKeyboard());

        System.out.print("Enter vitamin list (separated by comas):");
        final String vitaminListRaw = scanner.nextLine();
        final List<String> vitaminList = new ArrayList<>();

        if (!vitaminListRaw.contains(",")) {
            vitaminList.add(vitaminListRaw);
        } else {
            String[] split = vitaminListRaw.split(",");
            for (final String vitamin : split) {
                vitaminList.add(vitamin);
            }
        }

        product.setVitaminList(vitaminList);

        return product;
    }

    public static AnimalProductIF createAnimalProduct() {
        final AnimalProduct product = new AnimalProduct();
        product.setId(getUniqueId());

        System.out.print("Enter product name: ");
        product.setName(scanner.next());

        System.out.print("Enter product weight: ");
        product.setWeight(scanner.nextDouble());

        System.out.print("Enter product price: ");
        product.setPrice(scanner.nextDouble());

        System.out.println("Enter validity date: ");
        product.setValidityDate(getDateFromKeyboard());

        System.out.print("Enter storage temperature: ");
        product.setStorageTemperature(scanner.nextDouble());

        return product;
    }

    public static Date getDateFromKeyboard() {
        int year;
        int month;
        int day;

        do {
            System.out.print("Enter year: ");
            year = scanner.nextInt();
        }
        while (year < 0 || String.valueOf(year).length() != 4);

        do {
            System.out.print("Enter month: ");
            month = scanner.nextInt();
        }
        while (month <= 0 || month > 12);

        do {
            System.out.print("Enter day: ");
            day = scanner.nextInt();
        }
        while (day <= 0 || day > 31);

        final Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);

        return calendar.getTime();
    }

    public static String getUniqueId() {
        return UUID.randomUUID().toString().substring(0, 4);
    }
}
