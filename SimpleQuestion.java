package PaperDemo;

public class SimpleQuestion extends Question{
   char answer;
   /*���캯��  ��ѡʵ��      ��������ɣ�ѡ���һ����׼�� */
   public SimpleQuestion(String text,String[] options,char answer){
	   this.text = text;
	   this.options = options;
	   this.answer = answer;
   }
   /*��д�����check����*/
   public boolean check(char[] answers){
	   if(answers == null || answers.length!=1){
		   return false;
	   }
	   return this.answer == answers[0];
   }
}
