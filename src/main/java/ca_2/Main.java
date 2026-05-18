/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package CA_2;

/**
 *
 * @author aramn
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Employee> employees =
                FileManager.readFile(
                        "Applicants_Form.txt");

        System.out.println(
                "File read successfully!");

        int choice = 0;

        while (choice != 6) {

            System.out.println("\n1. SORT");
            System.out.println("2. SEARCH");
            System.out.println("3. DISPLAY ALL");
            System.out.println("4. CREATE TREE");
            System.out.println("5. ADD RECORD");
            System.out.println("6. EXIT");

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    MergeSort.mergeSort(
                            employees,
                            0,
                            employees.size() - 1);

                    System.out.println(
                            "Sorted Successfully!");

                    break;

                case 2:

                    input.nextLine();

                    System.out.println(
                            "Enter name:");

                    String name =
                            input.nextLine();

                    int result =
                            BinarySearch.search(
                                    employees,
                                    name,
                                    0,
                                    employees.size() - 1);

                    if (result == -1) {
                        System.out.println(
                                "Employee not found");
                    } else {
                        System.out.println(
                                employees.get(result));
                    }

                    break;

                case 3:

                    for (Employee employee : employees) {
                        System.out.println(employee);
                    }

                    break;
            }
        }
    }
}
