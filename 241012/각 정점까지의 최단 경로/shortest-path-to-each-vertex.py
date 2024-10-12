from heapq import heappop, heappush
from collections import defaultdict

def dij(start):
    distances = [float('inf')] * (n + 1)
    distances[start] = 0
    hq = []
    heappush(hq, (0, start))

    while hq:
        cur_val, cur_node = heappop(hq)

        if cur_val > distances[cur_node]:
            continue

        for neighbor, weight in graph[cur_node]:
            distance = cur_val + weight
            if distance < distances[neighbor]:
                distances[neighbor] = distance
                heappush(hq, (distance, neighbor))

    return distances

# 입력 처리
n, m = map(int, input().split())  # n: 정점 개수, m: 간선 개수
k = int(input())  # 시작 정점 k
graph = defaultdict(list)

# 간선 정보 입력 및 무방향 그래프 처리
for _ in range(m):
    start, end, val = map(int, input().split())
    graph[start].append((end, val))  # 양방향 처리
    graph[end].append((start, val))

# 다익스트라 알고리즘 실행
distances = dij(k)

# 결과 출력
for i in range(1, n + 1):
    if distances[i] == float('inf'):
        print(-1)
    else:
        print(distances[i])