# Find-the-Single-Number
You are given a non-empty array of integers, nums, where every element appears twice except for one. Find and return the single unique number that appears only once.
Optimal Approach: XOR Bitwise Operator
We can use the XOR (^) bitwise operator to solve this problem efficiently.

XOR Properties:
a ^ a = 0 (Same numbers cancel out)
a ^ 0 = a (XOR with zero remains unchanged)
XOR is commutative and associative, meaning the order doesn’t matter.

Time and Space Complexity Analysis
Time Complexity: O(n) → We iterate through the array once.
Space Complexity: O(1) → We use only a single integer variable.
