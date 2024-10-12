from heapq import heappush, heappop
from collections import defaultdict, deque
def dijkstra(start, n, graph):
    distances = [float('inf')] * (n + 1)
    distances[start] = 0
    priority_queue = []
    heappush(priority_queue, (0, start))
    
    while priority_queue:
        current_dist, current_node = heappop(priority_queue)
        
        # 이미 처리된 노드이면 무시
        if current_dist > distances[current_node]:
            continue
        
        # 인접 노드 확인
        for neighbor, weight in graph[current_node]:
            distance = current_dist + weight
            
            # 더 짧은 경로를 찾은 경우
            if distance < distances[neighbor]:
                distances[neighbor] = distance
                heappush(priority_queue, (distance, neighbor))
    
    return distances

nlen, mlen = tuple(map(int,input().split()))
graph = defaultdict(list)
for _ in range(mlen):
    start,end, weight = tuple(map(int,input().split()))
    graph[start].append([end,weight])

distances = dijkstra(1, nlen, graph)


for i in range(2, nlen + 1):
    if distances[i] == float('inf'):
        print(-1)
    else:
        print(distances[i])