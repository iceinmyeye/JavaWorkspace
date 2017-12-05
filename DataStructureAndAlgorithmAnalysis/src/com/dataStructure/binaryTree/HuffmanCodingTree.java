package com.dataStructure.binaryTree;

import java.util.List;

public class HuffmanCodingTree {
	
	class LettFreq {  // ��ĸ-Ƶ�����
		private char lett;
		private int freq;
		
		public LettFreq(int freq, char lett) {
			this.lett = lett;
			this.freq = freq;
		}
		public LettFreq(int freq) {
			this.freq = freq;
		}
		
		public int weight() {  // Ȩ��
			return freq;
		}
		
		public char letter() {  // ��ĸ
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
		public int weight() {  // ����Ȩ�ؾ��Ǹ�����Ȩ��
			return ((LettFreq)root.element()).weight();
		}
	} // class HuffTree
	
	// �ɻ������б�����������
	static HuffTree buildTree(@SuppressWarnings("rawtypes") List HuffList) {
		/*HuffTree temp1, temp2, temp3;
		LettFreq tempnode;
		
		for (HuffList.setPos(1))*/
		// TODO Build Huffman tree
		return null;
	}

}
