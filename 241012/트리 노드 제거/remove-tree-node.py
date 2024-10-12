from collections import defaultdict

def remove_node(tree, delete_node):
    tree[delete_node] = []
    for node in list(tree):
        if delete_node in tree[node]:
            tree[node].remove(delete_node)
        if node == delete_node:
            del tree[node]

def count_leaf_nodes(tree, root):
    if root not in tree or not tree[root]:
        return 1
    leaf_count = 0
    for child in tree[root]:
        leaf_count += count_leaf_nodes(tree, child)
    return leaf_count


n = int(input())
parent_list = list(map(int, input().split()))
delete_node = int(input())

tree = defaultdict(list)
root = -1
for child, parent in enumerate(parent_list):
    if parent == -1:
        root = child
    else:
        tree[parent].append(child)


if delete_node == root:
    print(0)
else:
    remove_node(tree, delete_node)
    print(count_leaf_nodes(tree, root))