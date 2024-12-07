# Concurrent Modification Exception with Kotlin's removeIf

This repository demonstrates a potential issue with the `removeIf` function in Kotlin collections. While often working as expected, using `removeIf` during concurrent modification can lead to unexpected behavior, even `ConcurrentModificationException` in some cases. The example code uses lists, maps, and sets to illustrate.

The `bug.kt` file contains code demonstrating the problem. The `bugSolution.kt` file provides a safer solution using an iterator.

## How to reproduce:
1. Clone this repository.
2. Open `bug.kt` in a Kotlin IDE.
3. Run the code.  The output will be correct in this specific instance.
4.  To see potential issues, modify the code to introduce concurrency (e.g., using multiple threads or coroutines to modify the collections).  Under concurrent modification, unexpected behavior might result.

## Solution:
The `bugSolution.kt` demonstrates a safer approach by explicitly iterating and removing elements using an iterator. This avoids the potential for `ConcurrentModificationException` and provides more predictable results in concurrent scenarios. 