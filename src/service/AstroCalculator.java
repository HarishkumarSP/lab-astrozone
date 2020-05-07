package service;

import model.User;

// Type your code
public class AstroCalculator{
	public String findSign(User user){
		String[] values=user.getDob().split("-");
		int date = Integer.parseInt(values[0]);
		int month =Integer.parseInt(values[1]);
		System.out.println(date);
		System.out.println(month);
		if((date>21 && month==3)||(date<20 && month==4)) {
			return "Aries";
			}
		if((date>21 && month==4)||(date<20 && month==5)) {
			return "Tauras";
			}
		if((date>21 && month==5)||(date<20 && month==6)) {
			return "Gemini";
			}
		if((date>21 && month==6)||(date<20 && month==7)) {
			return "Cancer";
			}
		if((date>21 && month==7)||(date<20 && month==8)) {
			return "Leo";
			}
		if((date>21 && month==8)||(date<20 && month==9)) {
			return "Virgo";
			}
		if((date>21 && month==9)||(date<20 && month==10)) {
			return "Libra";
			}
		if((date>21 && month==10)||(date<20 && month==11)) {
			return "Scorpio";
			}
		if((date>21 && month==11)||(date<20 && month==12)) {
			return "Sagittarius";
			}
		if((date>21 && month==12)||(date<20 && month==1)) {
			return "Capricorn";
			}
		if((date>21 && month==1)||(date<20 && month==2)) {
			return "Aquarius";
			}
		if((date>21 && month==2)||(date<20 && month==3)) {
			return "Pisces";
			}
		else
			return "please enter the details";
		
	}
	
}
