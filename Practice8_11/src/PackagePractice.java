
public class PackagePractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����integer����󣬲���int���ͷ���
		Integer intg = new Integer(8);
		System.out.println("integer�����ķ���ֵΪ"+intg.intValue());

		//����character���󲢱Ƚ��Ƿ����
		Character mychar1 = new Character('s');
		Character mychar2 = new Character('S');
		int x = mychar1.compareTo(mychar2);
		System.out.println(x==0?"����Character�������":"����Character�������");
		
		//����ת��ΪСд��ĸ�Ƚ��Ƿ����
		mychar1 = Character.toLowerCase(mychar1);
		mychar2 = Character.toLowerCase(mychar2);
		int xx = mychar1.compareTo(mychar2);
		System.out.println(xx==0?"����ת�����Character�������"
				:"����ת�����Character�������");
		
		//ͨ���ַ��ͱ�������Booleanֵ���ٽ���ת��Ϊ�ַ������
		Boolean bl = new Boolean("True");
		System.out.println("Booleanת��Ϊ�ַ������Ϊ"+bl.toString());
	}

}
