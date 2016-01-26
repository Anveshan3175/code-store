package union.find;

import java.util.Arrays;

public class QuickUnionUF {

	private int[] id;
	
	QuickUnionUF(int N){
		id = new int[N];
		for(int i = 0;i < N;i++){
			id[i] = i;
		}
	}
	
	// point root of p to q -- first element will be changed
	public void union(int p, int q){
		id[root(p)] = root(q);
		//id[root(id[p])] = root(id[q]);
	}
	
	public boolean connected (int p, int q){
		//return (root(id[p]) == root(id[q]));
		return (root(p) == root(q));
	}
	
	public int root(int p){
		while(p != id[p]){
			p = id[p];
		}
		return p;
	}
	
	public String toString(){
		return Arrays.toString(id);
	}
}
