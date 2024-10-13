n = int(input())
dp = [1,1]
for _ in range(n):
    dp.append(dp[-1]+dp[-2])
print(dp[n-1])