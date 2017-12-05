import java.io.*;
public class ClassifiedClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text[] = {"天将降大任于斯人也，","必先苦其心智，劳其筋骨，","饿其体肤，",
				"空乏其身，行拂乱其所为，","所以动心忍性，增益其所不能"};
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
