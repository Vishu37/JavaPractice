package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArray {
	int length;
	Object[] Data;
	MyArray() {
		this.length = 0;
		this.Data = new Object[6];
	}
	
	public Object getData(int index) {
	return	this.Data[index];
	}
	
	public int push(Object obj) {
		this.Data[this.length] = obj;
		return this.length++;
	}

	public static void main(String[] args) {
	//	List a = new ArrayList(); just to see array list implementation 
		MyArray arr1 = new MyArray();
		arr1.push("Vishu");
		arr1.push("Rita");
		arr1.push("Rajashree");		
		arr1.push("Sarita");
		arr1.delete(2);
		arr1.push("Rajashree");
		System.out.println(arr1);
	}

	public Object delete(int index) {	
		Object obj = this.Data[index];
		this.shift(index);
		this.length--;
		return obj;
	}
	private void shift(int index) {
		for (int i = index; i < Data.length - 1; i++) {
			this.Data[i] = this.Data[i+1];
		}
	}

	@Override
	public String toString() {
		return "MyArray [length=" + length + ", Data=" + Arrays.toString(Data) + "]";
	}
	
	

}
