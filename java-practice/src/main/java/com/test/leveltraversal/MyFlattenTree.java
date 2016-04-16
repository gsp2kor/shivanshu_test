package com.test.leveltraversal;

import java.util.ArrayList;
import java.util.List;

import com.test.leveltraversal.Tree.Node;

public class MyFlattenTree<T> implements FlattenTree<T>{
	
	

    public static void main(String[] args)
    {
        Tree<Integer> node1 = Tree.Node.tree(4,2,5);
        Tree<Integer> node2 = Tree.Node.tree(6,3,7);
        Tree<Integer> root = new Tree.Node<Integer>(node1,Tree.Leaf.leaf(1), node2);
        MyFlattenTree<Integer> myFlattenTree = new MyFlattenTree<Integer>();

        System.out.println("Flattened tree: " + myFlattenTree.flattenLevelOrder(root));
    }

	@Override
	public List<T> flattenLevelOrder(Tree<T> tree) {
		List<T> value = new ArrayList<T>();
		if (tree == null) throw new IllegalArgumentException();
		
		while(tree.get() != null){
			
			Either<T, Triple<Tree<T>>> either= tree.get();
			
			 if(either.isLeft()){
				 
				 value.add(either.ifLeft(new Function<T, T>() { 

	                    public T apply(T p) {
	                        return p;
	                    }

	                } ));

				 
				return value;
				 
			 }else{
				 
				 Triple<Tree<T>> tripleTree = either.ifRight(new Function<Triple<Tree<T>>,Triple<Tree<T>>>() { 


						@Override
						public Triple<Tree<T>> apply(Triple<Tree<T>> p) {
							
							return p;
						}

	                }); 
				 if(tripleTree.left() instanceof Tree.Leaf ){ 
					 value.addAll(flattenLevelOrder(tripleTree.left()));
					 value.addAll(flattenLevelOrder(tripleTree.middle()));
					 value.addAll(flattenLevelOrder(tripleTree.right()));
					 
				 } 
				 else if (tripleTree.middle() instanceof Tree.Leaf ){
					 
					 value.addAll(flattenLevelOrder(tripleTree.middle()));
					 value.addAll(flattenLevelOrder(tripleTree.left()));
					 value.addAll(flattenLevelOrder(tripleTree.right())); 
				 } 
				 else if (tripleTree.right() instanceof Tree.Leaf ){
					 
					 value.addAll(flattenLevelOrder(tripleTree.right()));
					 value.addAll(flattenLevelOrder(tripleTree.left()));
					 value.addAll(flattenLevelOrder(tripleTree.middle()));
 
				 } 
				 
				 else{
					 
					 value.addAll(flattenLevelOrder(tripleTree.left()));
					 value.addAll(flattenLevelOrder(tripleTree.middle()));
					 value.addAll(flattenLevelOrder(tripleTree.right()));
				 }
				 
				 
				 return value;
				 
			 }
			 
		}
		
		
		
		return value;
	}

}
	
	

