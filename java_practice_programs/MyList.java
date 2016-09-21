import java.util.ArrayList;
public class MyList implements DataCounter<String>{
	
	public static void main(String[] args){
		    	MyList al = new MyList(4);
		    	//ht.hashFunction("thou");
		    	al.incCount("thou");
		    	al.incCount("me");
		    	al.incCount("you");
		    	/*ht.find("thou");
		    	ht.find("me");
		    	ht.find("hi");*/
	    	
		    	//ht.incCount("thou");
		    	//ht.incCount("me");
		    	//ht.find("thou");
		 }
	
	
	/*public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>(10);
		//]["hi", "hi", "hi"....10 times]
		//["me", "you"]
		for(int i = 0; i < 10; i++)
		{
			al.add("hi");
			System.out.println(al);
		}
		al.add("me");
		al.add("you");
		System.out.println(al);
		System.out.println(al.size());// o/p size should be 12
		//al.add("us");
		al.remove("me");
		System.out.println(al + "//n");
		al.set(6, "hey!");
		System.out.println(al);
		String newline = System.getProperty("line property");
		
	}
	package Project3;

	import java.util.ArrayList;

	/**
	 * TODO Replace this comment with your own.
	 * 
	 * Stub code for an implementation of a DataCounter that uses a hash table as
	 * its backing data structure. We included this stub so that it's very clear
	 * that HashTable works only with Strings, whereas the DataCounter interface is
	 * generic. You need the String contents to write your hashcode code.
	 */
	//public class HashTable implements DataCounter<String> {

		ArrayList<DataCount<String>> hashtable;
		int table_size;
		int num_elements;// no. of unique elements in hash table

		MyList(int table_size) {
			this.table_size = table_size;
			this.hashtable = new ArrayList<DataCount<String>>(table_size);
			for (int i = 0; i < this.table_size; i++) {
				hashtable.add(new DataCount<String>("-1", 0));
			}
			System.out.println(this.hashtable);
			this.num_elements = 0;
		}

		// Hash Function @param key key for which index needs to be obtained
		private int hashFunction(String key) {
			int index = 0;
			for (int i = 0; i < key.length(); i++) {
				index = 37 * index + key.charAt(i);
			}

			index = index % hashtable.size();
			System.out.println(index);
			//System.out.println("The size of hashtable is : " + hashtable.size());

			return index;
		}

		// @param findkey the key we are searching for
		public String find(String findkey) {
			int initindex = 0;
			int hashIndex = hashFunction(findkey);
			if (hashtable.get(hashIndex).data != "-1")
			{
				if (hashtable.get(hashIndex).data == findkey) 
				{
					System.out.println("The key " + findkey + " was found at " + hashIndex);
					return findkey;
				} else {
					return "Key not found";
					}
				}
			else{
				System.out.println("Key was not found");
				return "-1";
			}

		}


		/** {@inheritDoc} */
		public DataCount<String>[] getCounts() {
			// TODO Auto-generated method stub
			return null;
		}


		public int getSize() {
			return num_elements;
		}


		//logic to insert data into hashtable and increment count
		public void incCount(String data) {
			double loadfactor = 0.75;//num_elements/this.table_size;
			int myindex = hashFunction(data);
			//logic for rehashing
			if (loadfactor >= 0.75){ 
				this.hashtable = listInit(this.table_size);
				int newindex = hashFunction(data);
				hashtable.set(newindex, new DataCount<String>(data, 1));
				System.out.println(hashtable);
			}
			else{
			
			/*int myindex = hashFunction(data);
			System.out.println("The index for given data is : " + myindex);
			if (find(data) == "-1") 
			{
				hashtable.set(myindex, new DataCount<String>(data, 1));
			}
			else
			{
				hashtable.get(myindex).count++;
			}*/
			}

		}
	
		private ArrayList<DataCount<String>> listInit(int tablesize){
		
			int newtable_size = (tablesize*2) + 1;
			ArrayList<DataCount<String>> newal = new ArrayList<DataCount<String>>(newtable_size);
			for (int j = 0; j < newtable_size; j++){
				newal.add(new DataCount<String>("-1", 0));
			}
			return newal;
		} 
	
		public void listDisplay(){
			System.out.println(hashtable);
		}
	

	}
	