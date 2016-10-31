package PaperDemo;

public class SimpleQuestion extends Question{
   char answer;
   /*构造函数  单选实例      依赖：题干，选项和一个标准答案 */
   public SimpleQuestion(String text,String[] options,char answer){
	   this.text = text;
	   this.options = options;
	   this.answer = answer;
   }
   /*重写父类的check方法*/
   public boolean check(char[] answers){
	   if(answers == null || answers.length!=1){
		   return false;
	   }
	   return this.answer == answers[0];
   }
}
