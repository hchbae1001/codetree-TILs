n = int(input())

dp = [0,2,7]
for _ in range(n-2):
    dp.append(dp[-1] * 3 + 1)
if n < 2:
    print(dp[n])
    exit()
print(dp[n])