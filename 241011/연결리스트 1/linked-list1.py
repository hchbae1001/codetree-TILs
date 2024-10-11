class Node:
    def __init__(self, data):
        self.data=data
        self.prev=None
        self.next=None

def con(target,t):
    global cur
    new = Node(target)
    if t:
        cur.next = new
        new.prev = cur
    else:
        cur.prev = new
        new.next = cur

def mv(t):
    global cur
    if t:
        #prev
        if cur.prev is not None:
            cur = cur.prev
    else:
        #next    
        if cur.next is not None:
            cur = cur.next

cur = Node(input())
for _ in range(int(input())):
    arg = list(input().split())
    order = int(arg[0])
    if order == 1:
        con(arg[1], False)
    elif order == 2:
        con(arg[1], True)
    elif order == 3:
        mv(False)
    else:
        mv(True)

    if cur.prev is None:
        print("(Null)", end= ' ')
    else:
        print(cur.prev.data, end = ' ')
    print(cur.data, end = ' ')
    if cur.next is None:
        print("(Null)", end = ' ')
    else:
        print(cur.next.data, end = ' ')
    print()