package servlet.login;

import java.text.DateFormat;

public class CheckDate {
	public static boolean checkDate(String strDate) {

	    strDate = strDate.replace('-', '/');
	    DateFormat format = DateFormat.getDateInstance();
	    // “ú•t/‰ğÍ‚ğŒµ–§‚És‚¤‚©‚Ç‚¤‚©‚ğİ’è‚·‚éB
	    format.setLenient(false);
	    try {
	        format.parse(strDate);
	        return true;
	    } catch (Exception e) {
	        return false;
	    }
	}

	public static void main(String[] args) {
		System.out.print(checkDate("2007/02/10"));
	}

}
