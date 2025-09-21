import java.util.*;

class MovieTheater {
    static final int PLATINUM_COST = 320;
    static final int GOLD_COST = 280;
    static final int SILVER_COST = 240;

    static final double SERVICE_TAX_RATE = 0.14;
    static final double SWACHH_BHARAT_CESS_RATE = 0.005;
    static final double KRISHI_KALYAN_CESS_RATE = 0.005;

    static double totalRevenue = 0;
    static double totalServiceTax = 0;
    static double totalSwachhBharatCess = 0;
    static double totalKrishiKalyanCess = 0;

    // Separate seat arrangements for each show (3 shows with different seat layouts)
    static boolean[][] platinumSeatsShow1 = new boolean[3][9];
    static boolean[][] platinumSeatsShow2 = new boolean[3][7];
    static boolean[][] platinumSeatsShow3 = new boolean[3][7];

    static boolean[][] goldSeatsShow1 = new boolean[3][6];
    static boolean[][] goldSeatsShow2 = new boolean[3][5];
    static boolean[][] goldSeatsShow3 = new boolean[3][6];

    static boolean[][] silverSeatsShow1 = new boolean[3][7];
    static boolean[][] silverSeatsShow2 = new boolean[3][7];
    static boolean[][] silverSeatsShow3 = new boolean[3][8];

    public static void main(String[] args) {
        initializeSeats();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            bookTickets(scanner);
        }
    }

    static void initializeSeats() {
        // Initialize seats for each show
        for (int i = 0; i < 3; i++) {
            Arrays.fill(platinumSeatsShow1[i], false);
            Arrays.fill(platinumSeatsShow2[i], false);
            Arrays.fill(platinumSeatsShow3[i], false);

            Arrays.fill(goldSeatsShow1[i], false);
            Arrays.fill(goldSeatsShow2[i], false);
            Arrays.fill(goldSeatsShow3[i], false);

            Arrays.fill(silverSeatsShow1[i], false);
            Arrays.fill(silverSeatsShow2[i], false);
            Arrays.fill(silverSeatsShow3[i], false);
        }
    }

    static void bookTickets(Scanner scanner) {
        System.out.print("\nEnter Show no: ");
        int showNo = scanner.nextInt();

        if (showNo < 1 || showNo > 3) {
            System.out.println("Invalid show number. Please try again.");
            return;
        }

        displayAvailableSeats(showNo);

        System.out.print("\nEnter seats: ");
        scanner.nextLine(); // consume leftover newline
        String seatsInput = scanner.nextLine();
        String[] selectedSeats = seatsInput.split(",\\s*");

        double subtotal = 0;
        List<String> unavailableSeats = new ArrayList<>();

        for (String seat : selectedSeats) {
            char row = seat.charAt(0);
            int seatNum = Integer.parseInt(seat.substring(1));

            if (!isSeatAvailable(showNo, row, seatNum)) {
                unavailableSeats.add(seat);
            } else {
                subtotal += bookSeat(showNo, row, seatNum);
            }
        }

        if (unavailableSeats.isEmpty()) {
            double serviceTax = subtotal * SERVICE_TAX_RATE;
            double swachhBharatCess = subtotal * SWACHH_BHARAT_CESS_RATE;
            double krishiKalyanCess = subtotal * KRISHI_KALYAN_CESS_RATE;

            totalRevenue += subtotal;
            totalServiceTax += serviceTax;
            totalSwachhBharatCess += swachhBharatCess;
            totalKrishiKalyanCess += krishiKalyanCess;

            System.out.printf("\nSuccessfully Booked - Show %d\n", showNo);
            System.out.printf("Subtotal: Rs. %.2f\n", subtotal);
            System.out.printf("Service Tax @14%%: Rs. %.2f\n", serviceTax);
            System.out.printf("Swachh Bharat Cess @0.5%%: Rs. %.2f\n", swachhBharatCess);
            System.out.printf("Krishi Kalyan Cess @0.5%%: Rs. %.2f\n", krishiKalyanCess);
            System.out.printf("Total: Rs. %.2f\n", subtotal + serviceTax + swachhBharatCess + krishiKalyanCess);
        } else {
            for (String seat : unavailableSeats) {
                System.out.println(seat + " Not available, Please select different seats");
            }
        }

        System.out.print("\nWould you like to continue (Yes/No): ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("No")) {
            showFinalRevenue();
            System.exit(0);
        }
    }

    static void displayAvailableSeats(int showNo) {
        System.out.println("\nAvailable Seats for Show " + showNo + ":");

        switch (showNo) {
            case 1:
                displayRow(platinumSeatsShow1[0], 9, 'A');
                displayRow(goldSeatsShow1[0], 6, 'B');
                displayRow(silverSeatsShow1[0], 7, 'C');
                break;
            case 2:
                displayRow(platinumSeatsShow2[0], 7, 'A');
                displayRow(goldSeatsShow2[0], 5, 'B');
                displayRow(silverSeatsShow2[0], 7, 'C');
                break;
            case 3:
                displayRow(platinumSeatsShow3[0], 7, 'A');
                displayRow(goldSeatsShow3[0], 6, 'B');
                displayRow(silverSeatsShow3[0], 8, 'C');
                break;
        }
    }

    static void displayRow(boolean[] seats, int seatCount, char row) {
        StringBuilder availableSeats = new StringBuilder();

        for (int i = 0; i < seatCount; i++) {
            if (!seats[i]) {
                availableSeats.append(row).append(i + 1).append(" ");
            }
        }

        System.out.println(availableSeats.toString().trim());
    }

    static boolean isSeatAvailable(int showNo, char row, int seatNum) {
        int rowIndex = row == 'A' ? 0 : row == 'B' ? 1 : 2;
        switch (showNo) {
            case 1:
                return isSeatAvailableForShow1(row, seatNum);
            case 2:
                return isSeatAvailableForShow2(row, seatNum);
            case 3:
                return isSeatAvailableForShow3(row, seatNum);
            default:
                return false;
        }
    }

    static boolean isSeatAvailableForShow1(char row, int seatNum) {
        switch (row) {
            case 'A':
                return !platinumSeatsShow1[0][seatNum - 1];
            case 'B':
                return !goldSeatsShow1[0][seatNum - 1];
            case 'C':
                return !silverSeatsShow1[0][seatNum - 1];
            default:
                return false;
        }
    }

    static boolean isSeatAvailableForShow2(char row, int seatNum) {
        switch (row) {
            case 'A':
                return !platinumSeatsShow2[0][seatNum - 1];
            case 'B':
                return !goldSeatsShow2[0][seatNum - 1];
            case 'C':
                return !silverSeatsShow2[0][seatNum - 1];
            default:
                return false;
        }
    }

    static boolean isSeatAvailableForShow3(char row, int seatNum) {
        switch (row) {
            case 'A':
                return !platinumSeatsShow3[0][seatNum - 1];
            case 'B':
                return !goldSeatsShow3[0][seatNum - 1];
            case 'C':
                return !silverSeatsShow3[0][seatNum - 1];
            default:
                return false;
        }
    }

    static double bookSeat(int showNo, char row, int seatNum) {
        double cost = 0;

        switch (showNo) {
            case 1:
                cost = bookSeatForShow1(row, seatNum);
                break;
            case 2:
                cost = bookSeatForShow2(row, seatNum);
                break;
            case 3:
                cost = bookSeatForShow3(row, seatNum);
                break;
        }
        return cost;
    }

    static double bookSeatForShow1(char row, int seatNum) {
        double cost = 0;
        switch (row) {
            case 'A':
                platinumSeatsShow1[0][seatNum - 1] = true;
                cost = PLATINUM_COST;
                break;
            case 'B':
                goldSeatsShow1[0][seatNum - 1] = true;
                cost = GOLD_COST;
                break;
            case 'C':
                silverSeatsShow1[0][seatNum - 1] = true;
                cost = SILVER_COST;
                break;
        }
        return cost;
    }

    static double bookSeatForShow2(char row, int seatNum) {
        double cost = 0;
        switch (row) {
            case 'A':
                platinumSeatsShow2[0][seatNum - 1] = true;
                cost = PLATINUM_COST;
                break;
            case 'B':
                goldSeatsShow2[0][seatNum - 1] = true;
                cost = GOLD_COST;
                break;
            case 'C':
                silverSeatsShow2[0][seatNum - 1] = true;
                cost = SILVER_COST;
                break;
        }
        return cost;
    }

    static double bookSeatForShow3(char row, int seatNum) {
        double cost = 0;
        switch (row) {
            case 'A':
                platinumSeatsShow3[0][seatNum - 1] = true;
                cost = PLATINUM_COST;
                break;
            case 'B':
                goldSeatsShow3[0][seatNum - 1] = true;
                cost = GOLD_COST;
                break;
            case 'C':
                silverSeatsShow3[0][seatNum - 1] = true;
                cost = SILVER_COST;
                break;
        }
        return cost;
    }

    static void showFinalRevenue() {
        System.out.println("\nTotal Sales:");
        System.out.printf("Revenue: Rs. %.2f\n", totalRevenue);
        System.out.printf("Service Tax: Rs. %.2f\n", totalServiceTax);
        System.out.printf("Swachh Bharat Cess: Rs. %.2f\n", totalSwachhBharatCess);
        System.out.printf("Krishi Kalyan Cess: Rs. %.2f\n", totalKrishiKalyanCess);
    }
}
