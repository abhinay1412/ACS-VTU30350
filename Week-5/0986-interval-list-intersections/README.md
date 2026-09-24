# Interval List Intersections

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two lists of closed intervals, `firstList` and `secondList`, where `firstList[i] = [starti, endi]` and `secondList[j] = [startj, endj]`. Each list of intervals is pairwise  **disjoint**  and in  **sorted order**.

Return  *the intersection of these two interval lists*.

A  **closed interval**  `[a, b]` (with `a <= b`) denotes the set of real numbers `x` with `a <= x <= b`.

The  **intersection**  of two closed intervals is a set of real numbers that are either empty or represented as a closed interval. For example, the intersection of `[1, 3]` and `[2, 4]` is `[2, 3]`.

 

 **Example 1:** 

```
Input: firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]

```

 **Example 2:** 

```
Input: firstList = [[1,3],[5,9]], secondList = []
Output: []

```

 

 **Constraints:** 

- 0 <= firstList.length, secondList.length <= 1000
- firstList.length + secondList.length >= 1
- 0 <= starti < endi <= 109
- endi < starti+1
- 0 <= startj < endj <= 109
- endj < startj+1

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 51.35%)  
**Memory:** 47.5 MB (beats 36.87%)  
**Submitted:** 2026-09-11T14:43:35.681Z  

```java
class Solution {

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        List<int[]> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < firstList.length && j < secondList.length) {
            int s1 = firstList[i][0];
            int s2 = secondList[j][0];
            int e1 = firstList[i][1];
            int e2 = secondList[j][1];

//                  intersection condition 
            if (e1 >= s2 && e2 >= s1) {
                list.add(new int[] {
                        Math.max(s1, s2),
                        Math.min(e1, e2)
                });
            }
                 // for not intersection condtion               
            if (e2 > e1) {
                i++;
            } else {
                j++;
            }

        }

        int[][] res = new int[list.size()][2];

        for (int k = 0; k < res.length; k++) {
            res[k] = list.get(k);
        }

        return res;
    }

}
```

---

[View on LeetCode](https://leetcode.com/problems/interval-list-intersections/)