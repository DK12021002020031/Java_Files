package hashmap_implementation;

public class HashMapImplementation {
	final int size = 16;
	Entry[] buckets = new Entry[size];
	
	private int getBucketIndex(int key) {
		return Math.abs(Integer.hashCode(key))%size;
	}
	
	public void put(int key,int value) {
		Entry node = new Entry(key,value);
		int index = getBucketIndex(key);
		System.out.println("The entry is added at index: "+index);
		Entry current = buckets[index];
		
	
		while(current!=null) {
			if(current.key==key) { // checking if the new entry key is already present in the linked list
				current.value=value; // updating value
				return;
			}
			current=current.next;
		}
		
		node.next = buckets[index]; // marking the new node as head
		buckets[index] = node; // storing head in the array
	}
	
	public void getValue(int key) {
		int index = getBucketIndex(key);
		Entry current = buckets[index];
		while(current!=null) {
			if(current.key==key) {
				System.out.println("Key: "+key+" Value:"+current.value);
				return;
			}
			current=current.next;
		}
		System.out.println("Value not found for the provided key");
	}
	
	public void remove(int key) {
		int index = getBucketIndex(key);
		Entry current = buckets[index];
		Entry previous=null;
		
		while(current!=null) {
			if(current.key==key) {
				if(previous==null) {
					previous=current;
					buckets[index]=current.next;
					previous.next=null;
				}
				else {
					previous.next=current.next;
					current.next=null;
				}
				return;
			}
			previous=current;
			current=current.next;
		}
		System.out.println("key does not exist");
	}
	public static void main(String[] args) {
		HashMapImplementation map = new HashMapImplementation();
		map.put(10, 1);
		map.put(20, 9);
		map.put(30, 5);
		map.getValue(30);
	}
}
