LinkedList: Slow access by index, efficient insert/delete at head, uses more memory, slower in most cases;
ArrayList: fast access by index, slow insert/delete at head, efficient memory usage, faster in most cases.

+ `add(0, item)`

LinkedList would be better as it has efficient insertions and deletions at the Head (index 0)

+ `get(index)`

ArrayList would be faster and more efficient for retrieval by any index.
LinkedList does not support fast random access.

+ `remove(item)`

Both are equally as efficient.

+ `add(item)`

LinkedList would be more efficient as time complexity is always O(1), comapred
to ArrayList which is O(n). 