# Searching Algorithms in Java

### Q). What is Linear Search Algorithm?
Linear Search algorithm, is a simple search algorithm that checks each element in a list or array one by one until it 
finds the target element or reaches at the end of the list.

``
Linear Search is very simple, it says start searching from the 1st element till you find the element,you are looking for.
``


---

### 🔹 Steps of Linear Search
1. Start from the first element of the array.
2. Compare each element with the target value.
3. If a match is found → return the index.
4. If no match is found after checking all elements → return `-1`.

---

### 🔹 Time Complexity
- **Best Case**: `O(1)` → element found at the first position.
- **Worst Case**: `O(n)` → element not present or at the last position.
- **Average Case**: `O(n)`

### 🔹 Space Complexity
- `O(1)` → no extra space needed.

---

### 🔹 When to Use Linear Search
- When the array is **unsorted**.
- When the dataset is **small**.
- Simple and easy to implement.


### 🔹 Advantages

Works on both sorted and unsorted arrays.

Very easy to implement.

--- 
### 🔹 Disadvantages

Slow for large datasets compared to Binary Search.

Time-consuming when the array size is large.

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
```

# Binary Search 

### Q). What is Binary Search Algorithm?
Binary Search is defined as a searching algorithm, used in a **sorted array** by repeatedly dividing the search interval
in half. 


### Time and Space Complexity
TC: Best → O(1), Average/Worst → O(log n)

SC: Iterative → O(1), Recursive → O(log n)


# Order-Agnostic Binary Search

**"Order-agnostic"** means it doesn’t care whether the array is sorted in ascending or descending order.

The algorithm first checks the order of sorting, and then applies the correct binary search logic accordingly.


## ⚡ Steps of Order-Agnostic Binary Search

1. **Check order of array**
    ```java
    boolean isAsc = array[start] < array[end];
    ```
    - If `true` → array sorted **ascending**
    - If `false` → array sorted **descending**

2. **Binary search logic changes depending on order**

   **Ascending case:**
    - If `target < mid` → search left
    - If `target > mid` → search right

   **Descending case:**
    - If `target > mid` → search left
    - If `target < mid` → search right

3. Continue until element is found or search space is empty.

---

## ✅ Example

**Array in Ascending order:**
```text
[-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89]
target = 22

→ Found at index 10
 
```

**Array in Descending order:**
```text

[99, 80, 75, 60, 50, 30, 10, 0, -5, -20]
target = 50


→ Found at index 4

