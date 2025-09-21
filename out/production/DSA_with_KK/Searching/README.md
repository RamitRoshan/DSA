# Searching Algorithms in Java

### Q). What is Linear Search Algorithm?
Linear Search algorithm, is a simple search algorithm that checks each element in a list or array one by one until it 
finds the target element or reaches at the end of the list.

``
Linear Search is very simple, it says start searching from the 1st element till you find the element,you are looking for.
``


---

## 🔹 Steps of Linear Search
1. Start from the first element of the array.
2. Compare each element with the target value.
3. If a match is found → return the index.
4. If no match is found after checking all elements → return `-1`.

---

## 🔹 Time Complexity
- **Best Case**: `O(1)` → element found at the first position.
- **Worst Case**: `O(n)` → element not present or at the last position.
- **Average Case**: `O(n)`

## 🔹 Space Complexity
- `O(1)` → no extra space needed.

---

## 🔹 When to Use Linear Search
- When the array is **unsorted**.
- When the dataset is **small**.
- Simple and easy to implement.

---

## 🔹 Java Example Code
```java
class LinearSearchExample {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // return index
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] nums = {10, 25, 30, 45, 50};
        int target = 30;

        int result = linearSearch(nums, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
