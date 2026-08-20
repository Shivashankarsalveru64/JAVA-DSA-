class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        RemoveElement solver = new RemoveElement(); // create instance
        int newLength = solver.removeElement(nums, val);

        System.out.println("New length: " + newLength); // 2
        System.out.print("Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " "); // 2 2
        }
    }
}