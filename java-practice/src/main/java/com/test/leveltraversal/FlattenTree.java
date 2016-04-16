package com.test.leveltraversal;

import java.util.List;

public interface FlattenTree<T> {
	/**
	 * @param tree the Tree to flatten
	 * @return a list containing all the leaf values in t, in tree level order
	 * @throws IllegalArgumentException if t is null
	 */
	List<T> flattenLevelOrder(Tree<T> tree);
}
