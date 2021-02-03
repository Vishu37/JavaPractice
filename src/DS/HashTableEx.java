package DS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashTableEx {
	ObjectValue[] data;
	
	HashTableEx(int size) 
	{
		this.data = new ObjectValue[size];
	}

	public int hash(String key) {
	    int hash = 0;
	    for (int i =0; i < key.length(); i++){
	        hash = (hash + key.charAt(i) * i) % this.data.length;
	    }
	    return hash;
	  }
	
	public void set(String key, int value) {
		int newHash;
		if(key != null) {
			newHash = hash(key);
			System.out.println("HashCode " + newHash);
			data[newHash] = new ObjectValue(key, value);
		}
		
	}
	
	public Integer get(String key) {
		int newHash;
		if(key != null) {
			newHash = hash(key);
			return this.data[newHash].keyValue;
		}
		return null;
	}
	
	public static void main(String[] args) {
		HashTableEx myHashTable = new HashTableEx(10);
		myHashTable.set("grapes", 10000);
		System.out.println(myHashTable.get("grapes"));
		myHashTable.set("apple", 500);
		System.out.println(myHashTable.get("apple"));
		myHashTable.set("banana", 6);
		System.out.println(myHashTable.get("banana"));
		System.out.println(myHashTable);
//		myHashTable.set('apples', 9);
//		myHashTable.get('apples');
		Map newMap = new HashMap();

	}

	@Override
	public String toString() {
		return "HashTableEx [data=" + Arrays.toString(data) + "]";
	}
	
	

}

class ObjectValue {
	String key;
	int keyValue;
	
	ObjectValue(String key, int keyValue) {
		this.key = key;
		this.keyValue = keyValue;
	}
	
	@Override
	public String toString() {
		return "ObjectValue [key=" + key + ", keyValue=" + keyValue + "]";
	}
	
	
	
}
