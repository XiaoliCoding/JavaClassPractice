package PaperDemo;

public class Question {
    String text; //���
    String [] options;//ѡ��
    /*��ӡ��ǰ��Ŀ*/
    public void print(Question this){  //this���õ�Ϊ����ʵ��
    	System.out.println(this.text);
    	for(int i = 0; i < this.options.length; i++)
    	{
    		System.out.print(options[i]+"\t");
    	}
    	System.out.println();
    }
    /* ����   ���������Ҫ����ĸ��Ƿ���*/
    public boolean check(char[] answers){
	 return false;
 }    
}