# Enter your code here. Read input from STDIN. Print output to STDOUT
import bisect

n = int(input())
arr = list(map(int, input().split()))
new_id = int(input())

bisect.insort(arr, new_id)
print(*arr)
