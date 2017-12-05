package com.dataStructure.binaryTree;

import java.util.List;

public class HuffmanCodingTree {
	
	class LettFreq {  // 字母-频率配对
		private char lett;
		private int freq;
		
		public LettFreq(int freq, char lett) {
			this.lett = lett;
			this.freq = freq;
		}
		public LettFreq(int freq) {
			this.freq = freq;
		}
		
		public int weight() {  // 权重
			return freq;
		}
		
		public char letter() {  // 字母
			return lett;
		}
	} // class LettFreq
	
	class HuffTree {
		private BinNode root;
		
		public HuffTree(LettFreq val) {
			root = new BinNodePtr(val);
		}
		public HuffTree(LettFreq val, HuffTree l, HuffTree r) {
			root = new BinNodePtr(val, l.root, r.root);
		}
		
		public BinNode root() {
			return root;
		}
		public int weight() {  // 树的权重就是根结点的权重
			return ((LettFreq)root.element()).weight();
		}
	} // class HuffTree
	
	// 由霍夫曼列表构建霍夫曼树
	static HuffTree buildTree(@SuppressWarnings("rawtypes") List HuffList) {
		/*HuffTree temp1, temp2, temp3;
		LettFreq tempnode;
		
		for (HuffList.setPos(1))*/
		// TODO Build Huffman tree
		return null;
	}

}
