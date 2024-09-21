package exercise1.creational.sqlQueries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SQLQueryBuilder builder = new SQLQueryBuilder();

        System.out.print("Enter the table name: ");
        String table = scanner.nextLine();

        System.out.print("Enter fields to select (comma separated): ");
        String fieldsInput = scanner.nextLine();
        String[] fields = fieldsInput.split(",\\s*");

        builder.select(table, fields);

        System.out.print("Enter the WHERE condition (or press Enter to skip): ");
        String whereCondition = scanner.nextLine();
        if (!whereCondition.isEmpty()) {
            builder.where(whereCondition);
        }
        System.out.print("Enter field to order by: ");
        String orderByField = scanner.nextLine();
        System.out.print("Enter direction (ASC/DESC): ");
        String orderByDirection = scanner.nextLine();
        if (!orderByField.isEmpty() && !orderByDirection.isEmpty()) {
            builder.orderBy(orderByField, orderByDirection);
        }

        String query = builder.build();
        System.out.println("Generated SQL Query: " + query);

        scanner.close();
    }
}
