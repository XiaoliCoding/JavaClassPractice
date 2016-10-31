package PaperDemo;
import java.util.Arrays;

public class MutilQuestion extends Question {
    char[] answers;
    /*构造函数*/
    public MutilQuestion(String text,String[] options,char[] answers){
    	this.text = text;
    	this.options = options;
    	this.answers = answers;
    }
    /*覆盖父类中的方法*/
    public boolean check(char[] answers){
    	return Arrays.equals(answers, this.answers);
    }
}
