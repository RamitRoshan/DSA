# Sorting Algorithms in Java

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
