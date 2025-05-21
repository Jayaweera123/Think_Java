package Time0519;

public class Test2 {


        public static void main(String[] args) {
            // Step 1: Define an array with duplicate values
            int[] numbers = {2, 4, 2, 6, 4, 8, 10, 6, 10};

            // Step 2: Create a new array to store unique elements
            int[] unique = new int[numbers.length];
            int uniqueCount = 0;

            // Step 3: Loop through the original array
            for (int i = 0; i < numbers.length; i++) {
                boolean isDuplicate = false;

                // Check if numbers[i] is already in the unique array
                for (int j = 0; j < uniqueCount; j++) {
                    if (numbers[i] == unique[j]) {
                        isDuplicate = true;
                        break;
                    }
                }

                // If not a duplicate, add to unique array
                if (!isDuplicate) {
                    unique[uniqueCount] = numbers[i];
                    uniqueCount++;
                }
            }

            // Step 4: Print the array without duplicates
            System.out.print("Array without duplicates: ");
            for (int i = 0; i < uniqueCount; i++) {
                System.out.print(unique[i] + " ");
            }
        }
    }

