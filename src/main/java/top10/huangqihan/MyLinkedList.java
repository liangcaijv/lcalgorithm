/*package top10.huangqihan;

public class MyLinkedList {
	private Entry head;
	private Entry last;
	private int size = 0;// 元素个数


	public void add(Object obj) {
		// 加第一个元素
		if (size == 0) {
			head = new Entry(obj, null, null);
			last = head;
		} else {
			Entry temp = new Entry(obj, last, null);
			last.next = temp;
			last = temp;
		}
		size++;
	}

	public void add(Object obj, int index) {
		// i最多为size
		if (index > size) {
			throw new IndexOutOfBoundsException();
		}
		if (index == size) {
			add(obj);
		} else {
			Entry e = getEntry(index);
			Entry temp = new Entry(obj, null, null);
			if (e == head) {
				head.pre = temp;
				temp.next = head;
				head = temp;
			} else {
				// 交换指针
				e.pre.next = temp;
				temp.next = e;
				temp.pre = e.pre;
				e.pre = temp;
			}
			size++;
		}

	}


	public Object get(int index) {
		if (index >= size)
			return null;
		return getEntry(index).value;
	}

	public Object search(Object key) {
		Entry tmp = getEntry(key);
		if (null == tmp)
			return null;
		else {
			tmp.count++;
			return tmp.value;
		}
	}

	public boolean contains(Object key) {
		return search(key) != null;
	}

	*//**
	 * 得到第i个与元素
	 * 
	 * @param index
	 * @return
	 *//*
	private Entry getEntry(int index) {
		if (index >= size) {
			return null;
		}
		// 找到i指向的那个元素
		Entry e = head;
		int j = 0;
		while (j < index) {
			e = e.next;
			j++;
		}
		return e;
	}

	private Entry getEntry(Object key) {
		Entry tmp = head;
		while (tmp != null) {
			if ((tmp.value == null && key == null) || tmp.value.equals(key)) {
				return tmp;
			} else {
				tmp = tmp.next;
			}
		}
		return null;
	}


	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int indexOf(Object e) {
		int index = 0;
		Entry tmp = head;
		while (tmp != null) {
			if ((tmp.value == null && e == null) || tmp.value.equals(e)) {// 命中
				return index;
			} else {
				tmp = tmp.next;
				index++;
			}
		}
		return -1;
	}

	class Entry {
		Object value;
		int count;
		Entry pre;
		Entry next;

		public Entry(Object value, Entry pre, Entry next) {
			super();
			this.value = value;
			this.pre = pre;
			this.next = next;
			this.count =1;
		}

		@Override
		public String toString() {
			return value.toString();
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((value == null) ? 0 : value.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Entry other = (Entry) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (value == null) {
				if (other.value != null)
					return false;
			} else if (!value.equals(other.value))
				return false;
			return true;
		}

		private MyLinkedList getOuterType() {
			return MyLinkedList.this;
		}

	}

	@Override
	public String toString() {
		Entry e = head;
		StringBuilder sb = new StringBuilder("[");
		while (e != null) {
			sb.append(e.value.toString()).append(",");
			e = e.next;
		}
		sb.deleteCharAt(sb.lastIndexOf(",")).append("]");
		return sb.toString();
	}
}*/