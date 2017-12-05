import java.io.*;
public class ClassifiedClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text[] = {"�콫��������˹��Ҳ��","���ȿ������ǣ������ǣ�","���������",
				"�շ������з�������Ϊ��","���Զ������ԣ�������������"};
		File fileWords = new File("E:\\VS_Projects\\MyFile","MyText.doc");
		try{
			if(!fileWords.getParentFile().exists()){
				fileWords.getParentFile().mkdirs();
			}
			if(!fileWords.exists()){
				fileWords.createNewFile();
			}
			FileWriter fwText = new FileWriter(fileWords);
			BufferedWriter bw = new BufferedWriter(fwText);
			for(int i=0;i<text.length;++i){
				bw.write(text[i]);
				bw.newLine();
			}
			bw.close();
			fwText.close();
		}catch(Exception e1){
			e1.printStackTrace();
		}
		try{
			FileReader frText = new FileReader(fileWords);
			BufferedReader br = new BufferedReader(frText);
			String st = null;
			while((st=br.readLine())!=null){
				System.out.println(st);
			}
			br.close();
			frText.close();
		}catch(Exception e2){
			e2.printStackTrace();
		}

	}

}
