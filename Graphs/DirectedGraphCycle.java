import java.util.*;

class DirectedGraphCycle{

	public static void main(String[] args){

		Graph g = new Graph(4);
		g.add(0, 1);
		g.add(1, 2);
		g.add(3, 0);

		System.out.println(isCyclic(g));
	}

	private static boolean isCyclic(Graph g){

		boolean[] isVisited= new boolean[g.V];
		boolean[] stack = new boolean[g.V];

		// now check for adjacency list
		for(int i = 0; i < g.V; i ++)
		if(isCyclicEdge(i, isVisited, stack, g)) return true;

		return false;
	}

	private static boolean isCyclicEdge(int i, boolean[] isVisited, boolean[] stack, Graph g){

		/**
		* If already is stack it is cyclic
		*/
		if(stack[i]) return true;

		/*
		* it is not in stack but visited 
		*/
		if(isVisited[i]) return false;

		isVisited[i] = true;
		stack[i] = true;

		for(Integer el : g.adj.get(i)){
			if(isCyclicEdge(el, isVisited, stack, g)) return true;
		}

		/**
		* remove from stack
		*/ 
		stack[i] = false;
		return false;
	}
}


class Graph{

	/**
	* Number of vertices
	*/
	public int V;

	public List<List<Integer>> adj;

	public Graph(int V){

		this.V = V;

		this.adj = new ArrayList<>(V); 
		for(int i =0; i < V; i ++)
		adj.add(new LinkedList<Integer>());
	}

	public void add(int source, int destination){
		adj.get(source).add(destination);
	}
}


