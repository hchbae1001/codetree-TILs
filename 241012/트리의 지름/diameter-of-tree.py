from collections import deque

def bfs(start, edges):
    q = deque()
    q.append(start)
    dist = [-1] * (len(edges))
    dist[start] = 0
    
    while q:
        v = q.popleft()
        for nv, nd in edges[v]:
            if dist[nv] == -1:
                dist[nv] = dist[v] + nd
                q.append(nv)
    
    max_dist = max(dist)
    farthest_node = dist.index(max_dist)
    return farthest_node, max_dist

n = int(input())
edges = [[] for _ in range(n + 1)]


for _ in range(n - 1):
    x, y, d = tuple(map(int, input().split()))
    edges[x].append((y, d))
    edges[y].append((x, d))

farthest_node_from_1, _ = bfs(1, edges)

_, tree_diameter = bfs(farthest_node_from_1, edges)

print(tree_diameter)