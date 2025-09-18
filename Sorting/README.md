# Sorting Algorithms in Java

### Q). What is Bubble Sort Algorithm?
We do a certain number of passes and in every pass, we do compare with adjacent elements and swap them, if they are not in the 
correct order. 
- Here we can sort elements in both, increasing and decreasing order
- Adjacent elements simply mean two elements that are next to each other in a sequence (array, list, string, etc.).

- Ex: [5, 7, 9, 2] <br>

5 and 7 are adjacent

7 and 9 are adjacent

9 and 2 are adjacent

But 5 and 9 are not adjacent


# Selection Sort Algorithm

## 📖 Definition
**Selection Sort** is a simple comparison-based sorting algorithm.  
It works by repeatedly selecting the **minimum element** from the unsorted part of the array and putting it at its correct position in the sorted part.

(here, we do select an element and put it at its correct position.)

---

## ⚙️ Working of Selection Sort
1. Start at the first element.
2. Find the **smallest element** in the remaining array.
3. Swap it with the current element.
4. Move to the next position and repeat until the array is sorted.

---

## 📊 Example

Unsorted Array: `[7, 4, 1, 5, 3]`

| Pass | Action                           | Array State         |
|------|----------------------------------|---------------------|
| 1    | Select min = 1, swap with 7      | `[1, 4, 7, 5, 3]`  |
| 2    | Select min = 3, swap with 4      | `[1, 3, 7, 5, 4]`  |
| 3    | Select min = 4, swap with 7      | `[1, 3, 4, 5, 7]`  |
| 4    | `[5, 7]` already sorted          | `[1, 3, 4, 5, 7]`  |

✅ Final Sorted Array: `[1, 3, 4, 5, 7]`


# Insertion Sort Algorithm

## 📖 Definition
**Insertion Sort** is a simple sorting algorithm that builds the final sorted array one element at a time.  
It works the same way you might sort playing cards in your hands — take one card at a time and insert it into its correct position among the already sorted cards.

---

## ⚙️ Working of Insertion Sort
1. Assume the first element is already sorted.
2. Pick the next element.
3. Compare it with the sorted part of the array and shift elements if needed.
4. Insert the element at its correct position.
5. Repeat until all elements are sorted.

---

## 📊 Example

Unsorted Array: `[7, 4, 1, 5, 3]`

| Pass | Action                                | Array State         |
|------|---------------------------------------|---------------------|
| 1    | Insert 4 before 7                     | `[4, 7, 1, 5, 3]`  |
| 2    | Insert 1 before 4                     | `[1, 4, 7, 5, 3]`  |
| 3    | Insert 5 between 4 and 7              | `[1, 4, 5, 7, 3]`  |
| 4    | Insert 3 between 1 and 4              | `[1, 3, 4, 5, 7]`  |

✅ Final Sorted Array: `[1, 3, 4, 5, 7]`




## Time & Space Complexities of Sorting Algorithms

| Algorithm        | Best Case      | Average Case   | Worst Case    | Space Complexity |
|------------------|----------------|----------------|---------------|------------------|
| **Bubble Sort**  | O(n)           | O(n²)          | O(n²)         | O(1)             |
| **Selection Sort** | O(n²)        | O(n²)          | O(n²)         | O(1)             |
| **Insertion Sort** | O(n)         | O(n²)          | O(n²)         | O(1)             |
| **Merge Sort**   | O(n log n)     | O(n log n)     | O(n log n)    | O(n)             |
| **Quick Sort**   | O(n log n)     | O(n log n)     | O(n²)         | O(log n)\*       |
| **Heap Sort**    | O(n log n)     | O(n log n)     | O(n log n)    | O(1)             |
| **Counting Sort** | O(n + k)      | O(n + k)       | O(n + k)      | O(k)             |
| **Radix Sort**   | O(nk)          | O(nk)          | O(nk)         | O(n + k)         |
| **Bucket Sort**  | O(n + k)       | O(n + k)       | O(n²)         | O(n + k)         |

> **Notes**:
> - `n` = number of elements
> - `k` = range of input (for non-comparison sorts like Counting, Radix, and Bucket Sort)
> - Quick Sort’s space complexity is **O(log n)** due to recursion (stack), but can degrade to **O(n)** in worst case if not randomized.
> - Java’s built-in `Arrays.sort()` uses:
    >   - **Dual-Pivot QuickSort** for primitives → Avg: O(n log n), Worst: O(n²), Space: O(log n)
>   - **TimSort** for objects → Avg/Worst: O(n log n), Space: O(n)

---
.
