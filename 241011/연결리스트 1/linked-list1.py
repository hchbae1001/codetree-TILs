class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None

cur = None

def one(val):
    cur.prev = Node(val)
    
def two(val):
    cur.next = Node(val)

def three():
    global cur
    cur = cur.prev
    
def four():
    global cur
    cur = cur.next

cur = Node(input())
nlen = int(input())
for _ in range(nlen):
    arg = list(input().split())
    order = int(arg[0])
    if order == 1:
        one(arg[1])
    elif order == 2:
        two(arg[1])
    elif order == 3:
        three()
    else:
        four()
    if cur.prev is None:
        print("(Null)", end = ' ')
    else:
        print(cur.prev.data, end = ' ')
    print(cur.data, end = ' ')
    if cur.next is None:
        print("(Null)", end = ' ')
    else:
        print(cur.next.data, end = ' ')

    print()