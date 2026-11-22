n = int(input())
arr = [int(x) for x in input().split()]

unique_vals = sorted(set(arr))

if len(unique_vals) < 2:
    print(0)
else:
    second_largest = unique_vals[-2]
    print(arr.count(second_largest))
