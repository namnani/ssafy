# enqueue부분에서 link를 잘 정렬해주면 된다.
```
public static void enqueue(int item) {
		Node end = new Node();
		end.data = item;
		if(front == null) {
			front = end;
			rear = end;
		} else{
			if(front.data>item) {
				end.link = front;
				front = end;
				return;
			} else {
				Node n = front;
				while(n.link!=null) {
					if(n.link.data > item) {
						end.link = n.link;
						n.link = end;
						return;
					}
					n=n.link;
				}
				n.link = end;
				rear = end;
			}
		}
	}
  ```
