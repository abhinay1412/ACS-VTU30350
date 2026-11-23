# Enter your code here. Read input from STDIN. Print output to STDOUT
input()
print(sum(1 for x in map(int, input().split()) if x % 3 == 0))
