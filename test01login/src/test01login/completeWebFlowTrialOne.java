package test01login;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.text.DateFormatter;

import org.apache.commons.lang3.time.DateUtils;

public class completeWebFlowTrialOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dateObject = new Date();
		System.out.println(dateObject);
		SimpleDateFormat dd = new SimpleDateFormat("dd");
		System.out.println(dd.format(dateObject));
		Date utilDateObject = DateUtils.addDays(dateObject, 1);
		System.out.println(dd.format(utilDateObject));
		Calendar calenderObject = Calendar.getInstance();
		calenderObject.setTime(dateObject);
		System.out.println(dd.format(calenderObject.getTime()));
		calenderObject=Calendar.getInstance();
//		System.out.println(calen);
		
		
	}

}
