#2.Implement a function that divides an array into pages of equal size and returns a generator to iterate through these
pages.
def create_paginator(items, pageSize):
    for i in range(0, len(items), pageSize):
        yield items[i:i + pageSize]
items = [1, 2, 3, 4, 5, 6]
pageSize = 2
pages = create_paginator(items, pageSize)
for page in pages:
    print(page)