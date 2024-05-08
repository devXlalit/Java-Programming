package BasicsOfJava;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = { 2, 7, 12, 15 };
        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("The index of sum of target: " + i + " , " + j);
                }
            }

        }
        
    }
}

// Assignments
// Q1.Write a program in java to check wheather an interget in
// duplicate or not if integet in duplicate print true else print false

// Q2.Write a program in java to print the total number of
// target value occurance in an array
// Explanation-[1,2,3,4,1,1] target = 1
// output - total number of occurance of 1 is 3