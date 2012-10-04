package brahma.plugin.magiceightball;

import java.util.ArrayList;

public class MagicEightBallLogic {

	ArrayList<String> answers;
	
	public MagicEightBallLogic(){
		answers = new ArrayList<String>();
		answers.add("It is certain.");
		answers.add("It is decidedly so.");
		answers.add("Without a doubt.");
		answers.add("Yes - definitely.");
		answers.add("You may rely on it.");
		answers.add("As I see it, yes.");
		answers.add("Most Likely.");
		answers.add("Yes.");
		answers.add("Reply hazy, try again.");
		answers.add("Ask again later.");
		answers.add("Better not tell you now.");
		answers.add("Cannot predict now.");
		answers.add("Concentrate and ask again.");
		answers.add("Don't count on it.");
		answers.add("My reply is no.");
		answers.add("My sources say no.");
		answers.add("Outlook not so good.");
		answers.add("Very Doubtful.");
		answers.add("No.");
		answers.add("Yes... I mean no.... Oh who am I kidding, I don't have a clue");
	}
	
	public String getAnswer()
	{
		int num = (int) (20*Math.random());
		return answers.get(num);
	}
	
	public ArrayList<String> getListOfPossibleAnswers(){
		return answers;
	}
}
