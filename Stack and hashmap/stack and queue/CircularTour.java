class CircularTour {

    public static int circularTour(int[] petrol, int[] distance) {

        int total = 0;
        int balance = 0;

        int start = 0;

        for (int i = 0; i < petrol.length; i++) {

            int diff = petrol[i] - distance[i];

            total += diff;
            balance += diff;

            if (balance < 0) {

                start = i + 1;

                balance = 0;
            }
        }

        if (total < 0) {
            return -1;
        }

        return start;
    }

    public static void main(String[] args) {

        int[] petrol = {4, 6, 7, 4};

        int[] distance = {6, 5, 3, 5};

        System.out.println(circularTour(petrol, distance));
    }
}
