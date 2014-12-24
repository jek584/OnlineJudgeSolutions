def sum(n):
	return (n*(n+1))/2
tc = int(raw_input())
for x in range (0, tc):
	n, m = (int(s) for s in raw_input().split())
	ans = n/m * sum(m-1) + sum((n%m))
	print ans